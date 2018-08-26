package com.zzq.service0.biz;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzq.service0.entities.cnUser;
import com.zzq.service0.enums.ChargeValueEnum;
import com.zzq.service0.util.HttpClientUtil;
import com.zzq.service0.util.OperateOracle;
import com.zzq.service0.util.ProxyUtil;
import com.zzq.service0.util.Utils;
import org.apache.http.HttpHost;

import java.util.*;

public class CnChargeFlow {
	public String chargeTel;
	public Integer chageValue;

	public CnChargeFlow(String chargeTel, Integer chageValue) {
		this.chargeTel = chargeTel;
		this.chageValue = chageValue;
	}

	public static void main(String[] args) {
		cnUser zzq2 = new cnUser();
		zzq2.setTelephone("15984940473");
		zzq2.setUser_name("易码500");		zzq2.setPassword("d5c91303b3963ea463d4d97b616f06224f2469bdb4d9984ca696dd37c7059a7b");
		zzq2.setDeviceID(Utils.randomHexString(16));
		 Random random = new Random();
	     int s = random.nextInt(Utils.user_agents.length);
	     zzq2.setUser_agent(Utils.user_agents[s]);
		CnChargeFlow flow =  new CnChargeFlow("15923584508",50);
//		flow.autoDo(zzq2);
	}
	public void autoDo(cnUser user) throws Exception {
		if(user.getDeviceID()==null){
			user.setDeviceID(Utils.randomHexString(16));
		}
		if(user.getUser_agent()==null){
			 Random random = new Random();
		     int s = random.nextInt(Utils.user_agents.length);
		     user.setUser_agent(Utils.user_agents[s]);
		}
		if(user.getPassword()==null){
		     user.setPassword("d5c91303b3963ea463d4d97b616f06224f2469bdb4d9984ca696dd37c7059a7b");;
		}
		HttpClientUtil httpUtil = new HttpClientUtil();
		Map<String,String> para = new HashMap<String, String>();
		Random random = new Random();
		para.put("telephone", user.getTelephone());
		para.put("password", user.getPassword());
		
		httpUtil.setDeviceID(user.getDeviceID());
		httpUtil.setUser_agent(user.getUser_agent());

		//TODO 使用高匿代理  请求
//		HttpHost target  = new HttpHost("39.137.69.9:80", 80,  "HTTP");
//		HttpHost target  = new HttpHost("39.137.69.9:80", 80);
//		httpUtil.setTarget(ProxyUtil.getHostFromAliYun());
		httpUtil.setTarget(ProxyUtil.getHostFromDaiLiJingLing());
		//登录
		String login_res = httpUtil.doPost("http://app.cainiaolc.com/user/login", para, "utf-8");
		System.out.println("登录："+login_res);
		String  cnUserID = JSONObject.parseObject(login_res).get("Data").toString();
		httpUtil.setCnUserID(cnUserID);
		user.setCnuserID(cnUserID);
		//打開app
		para.clear();
		para.put("version", "1.1.8");
		para.put("w", "360");
		para.put("h", "640");
		String appOpen_res = httpUtil.doPost("http://app.cainiaolc.com/log/appOpen", para, "utf-8");
		System.out.println("打开app："+appOpen_res);
		//查看菜点
		String coin_userSumary = httpUtil.doGet("http://app.cainiaolc.com/coin/userSummary", "utf-8");
		System.out.println("金币："+coin_userSumary);
		Integer score =  JSONObject.parseObject(coin_userSumary).getJSONObject("Data").getInteger("score");
		user.setScore(score);
		//绑定token
		para.clear();
		para.put("os", "android");
		para.put("token", "");
		para.put("version", "");
		para.put("regId", "190e35f7e07b8825172");
		String bindToken = httpUtil.doPost("http://app.cainiaolc.com/account/bindToken", para, "utf-8");
		System.out.println("绑定token："+bindToken);
		//获取用户信息
		String user_info = httpUtil.doGet("http://app.cainiaolc.com/user/info", "utf-8");
		JSONObject userJson = JSONObject.parseObject(user_info);
		String codeMine = userJson.getJSONObject("Data").getString("codeMine");
		user.setCodeMine(codeMine);
		System.out.println(user.getTelephone()+"的用户信息"+user_info);
		//打标历史
		String tag_history = httpUtil.doGet("http://app.cainiaolc.com/user/tagHistory", "utf-8");
		//充值
		para.clear();
		//50话费id=9120   20话费id=208
		if(ChargeValueEnum.BIGGERVALUE.getCode().equals(chageValue)){
			para.put("id","9120");
		}else if(ChargeValueEnum.SMALLERVALUE.getCode().equals(chageValue)){
			para.put("id","208");
		}
		para.put("telephone",this.chargeTel);
		para.put("linker","");
		para.put("addr","");
		para.put("num","1");
		String chargeResult = httpUtil.doPost("http://app.cainiaolc.com/coin/exchange", para, "utf-8");
		System.out.println("充值结果："+chargeResult);

		//检查充值状态
//		String chargeStatu = httpUtil.doGet("http://app.cainiaolc.com/coin/record?page=0&perpage=1", "utf-8");
//		JSONObject chargeStatuJson = JSONObject.parseObject(chargeStatu);
//		if(chargeStatuJson.getJSONArray("Data").getJSONObject(0).getInteger("status")==0){
//			System.out.println("充值处理中...");
//		}else {
//			System.out.println("充值已处理");
//		}

		String replayCommentresult = httpUtil.doGet("http://app.cainiaolc.com/coin/userSummary", "utf-8");
		JSONObject finaJson = JSONObject.parseObject(replayCommentresult);
		score = finaJson.getJSONObject("Data").getInteger("score");
		System.out.println("流程完毕后最后的结果==="+score);
		user.setEarn(score-user.getScore());
		user.setScore(score);
		OperateOracle operateOracle = new OperateOracle();
//		operateOracle.updateAppData("菜鸟理财",user.getUser_name(),user.getTelephone(),"",user.getPassword(),score,user.getCnuserID());
		operateOracle.updateAppData("菜鸟理财",user);
	}
	public void getIDs(String api_homeData,List<String> ids) {
		JSONObject json1 = JSONObject.parseObject(api_homeData);
		JSONObject json1_data = (JSONObject)json1.get("Data");
		JSONArray  articles = json1_data.getJSONArray("articles");
//		JSONArray  carousels = json1_data.getJSONArray("carousels");
//		JSONArray  posts = json1_data.getJSONArray("posts");
//		JSONArray  refers = json1_data.getJSONArray("refers");
		getJsonID(articles, ids);
//		getJsonID(carousels, ids);
//		getJsonID(posts, ids);
//		getJsonID(refers, ids);
	}

	public void getJsonID(JSONArray  jsonArray,List<String> ids) {
		for (Iterator iterator = jsonArray.iterator(); iterator.hasNext();) {
			JSONObject job = (JSONObject) iterator.next();
			ids.add(job.get("id").toString());
		}
	}
	public List<String> getHistoryList(JSONArray  articles){
		List<String> contentList = new ArrayList<String>();
		for (Object article : articles) {
			JSONObject article_json = (JSONObject) article;
			if(!article_json.get("content").toString().contains("...")){
				contentList.add(article_json.get("content").toString());
			}
		}
		return contentList;
	}


	public List<String> getHistoryListWithCommentNum(JSONArray  articles){
		List<String> contentIDs = new ArrayList<String>();
		for (Object article : articles) {
			JSONObject article_json = (JSONObject) article;
			if(Integer.parseInt(article_json.get("commentNum").toString())>2){
				contentIDs.add(article_json.get("id").toString());
			}
		}
		return contentIDs;
	}
	private static Random random;
	//双重校验锁获取一个Random单例
	public static Random getRandom() {
		if(random==null){
			synchronized (CnChargeFlow.class) {
				if(random==null){
					random =new Random();
				}
			}
		}

		return random;
	}
	/**
	 * 获得一个[0,max)之间的整数。
	 * @param max
	 * @return
	 */
	public static int getRandomInt(int max) {
		return Math.abs(getRandom().nextInt())%max;
	}
	/**
	 * 从set中随机取得一个元素
	 * @param set
	 * @return
	 */
	public static <E> E getRandomElement(Set<E> set){
		int rn = getRandomInt(set.size());
		int i = 0;
		for (E e : set) {
			if(i==rn){
				return e;
			}
			i++;
		}
		return null;
	}
}

