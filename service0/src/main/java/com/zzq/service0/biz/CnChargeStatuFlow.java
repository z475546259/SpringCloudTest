package com.zzq.service0.biz;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzq.service0.entities.cnUser;
import com.zzq.service0.enums.ChargeValueEnum;
import com.zzq.service0.util.HttpClientUtil;
import com.zzq.service0.util.OperateOracle;
import com.zzq.service0.util.ProxyUtil;
import com.zzq.service0.util.Utils;

import java.util.*;

public class CnChargeStatuFlow {

	public CnChargeStatuFlow() {

	}

	public static void main(String[] args) {

	}
	public Integer autoDo(cnUser user) {
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
//		httpUtil.setTarget(ProxyUtil.getHostFromAliYun());
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
		//打标历史
		String tag_history = httpUtil.doGet("http://app.cainiaolc.com/user/tagHistory", "utf-8");
//		System.out.println(tag_history);

		//检查充值状态
		String chargeStatu = httpUtil.doGet("http://app.cainiaolc.com/coin/record?page=0&perpage=1", "utf-8");
		JSONObject chargeStatuJson = JSONObject.parseObject(chargeStatu);
		if(chargeStatuJson.getJSONArray("Data").getJSONObject(0).getInteger("status")==0){
			System.out.println("充值处理中...");
			return 0;
		}else {
			System.out.println("充值已处理");
			return 1;
		}

	}




	private static Random random;
	//双重校验锁获取一个Random单例
	public static Random getRandom() {
		if(random==null){
			synchronized (CnChargeStatuFlow.class) {
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

