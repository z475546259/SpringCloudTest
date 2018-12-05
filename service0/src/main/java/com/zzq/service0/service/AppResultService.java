package com.zzq.service0.service;

import com.zzq.service0.entities.AppResult;
import com.zzq.service0.entities.cnUser;

public interface AppResultService {
    AppResult findOne(String tel,Integer value);
    AppResult findOneByAccountTel(String tel);
    void updateResult(cnUser cnUser);
}
