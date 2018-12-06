package com.zzq.service0.impl;

import com.zzq.service0.entities.AppResult;
import com.zzq.service0.entities.AppResultExample;
import com.zzq.service0.entities.cnUser;
import com.zzq.service0.mapper.AppResultMapper;
import com.zzq.service0.service.AppResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppResultServiceImpl implements AppResultService {
    @Autowired
    AppResultMapper appResultMapper;
    @Override
    public AppResult findOne(String tel, Integer value) {
        AppResultExample appResultExample = new AppResultExample();
        if(value==50){
            appResultExample.createCriteria().andAppNameEqualTo("菜鸟理财").andIsDelEqualTo(false).andAppUsertelNotLike("17%").andAppUserscoreGreaterThanOrEqualTo(6200).andNoteLike("%"+tel+"%");
        }else if(value==20){
            appResultExample.createCriteria().andAppNameEqualTo("菜鸟理财").andIsDelEqualTo(false).andAppUsertelNotLike("17%").andAppUserscoreBetween(2600,6200).andNoteLike("%"+tel+"%");
        }
        List<AppResult> resultList = appResultMapper.selectByExample(appResultExample);
        if(resultList.size()==0){
            System.out.println("根据手机号和充值金额查询到符合条件的有"+resultList.size()+"条数据");
            AppResultExample appResultExample2 = new AppResultExample();
            if(value==50){
                appResultExample2.createCriteria().andAppNameEqualTo("菜鸟理财").andIsDelEqualTo(false).andAppUsertelNotLike("17%").andAppUserscoreGreaterThanOrEqualTo(6200);
            }else if(value==20){
                appResultExample2.createCriteria().andAppNameEqualTo("菜鸟理财").andIsDelEqualTo(false).andAppUsertelNotLike("17%").andAppUserscoreBetween(2600,6200);
            }
            resultList = appResultMapper.selectByExample(appResultExample2);
        }
        return resultList.get(0);
    }

    @Override
    public AppResult findOneByAccountTel(String tel) {
        AppResultExample appResultExample = new AppResultExample();
        appResultExample.createCriteria().andAppNameEqualTo("菜鸟理财").andAppUsertelEqualTo(tel).andIsDelEqualTo(false);
        return  appResultMapper.selectByExample(appResultExample).get(0);
    }

    @Override
    public void updateResult(cnUser cnUser) {
        AppResultExample appResultExample = new AppResultExample();
        appResultExample.createCriteria().andAppNameEqualTo("菜鸟理财").andAppUsertelEqualTo(cnUser.getTelephone());
        AppResult appResult =  appResultMapper.selectByExample(appResultExample).get(0);
        appResult.setAppUserscore(cnUser.getScore());
        appResult.setChargeMoney(appResult.getChargeMoney()+cnUser.getChargeValue());
        if(!appResult.getNote().contains(cnUser.getChargeTel())){
            appResult.setNote(appResult.getNote()+","+cnUser.getChargeTel());
        }
        int i = appResultMapper.updateByPrimaryKeySelective(appResult);
        if(i==0){
            System.out.println("更新刷分结果失败");
        }else{
            System.out.println("更新刷分结果成功");
        }
    }
}
