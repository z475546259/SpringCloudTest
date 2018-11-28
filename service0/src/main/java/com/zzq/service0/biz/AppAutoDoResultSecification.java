package com.zzq.service0.biz;

import com.zzq.service0.entities.AppAutoDoResult;
import com.zzq.service0.enums.ChargeValueEnum;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

/**
 * @author zhangzhiqiang
 * @date 2018-08-22 15:05
 * &Desc 自定义封装的Specification
 */
public class AppAutoDoResultSecification implements Specification<AppAutoDoResult> {
    public String tel;
    public Integer chargeValue;
    public AppAutoDoResultSecification(String tel,Integer chargeValue) {
        if(ChargeValueEnum.BIGGERVALUE.code().equals(chargeValue)){
            this.chargeValue = 6200;
        }else if(ChargeValueEnum.SMALLERVALUE.code().equals(chargeValue)){
            this.chargeValue = 2600;
        }
        this.tel = tel;
    }

    @Override
    public Predicate toPredicate(Root<AppAutoDoResult> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        Path<String> appNamePath = root.get("APP_NAME");
        Path<Integer> appScorePath = root.get("APP_USERSCORE");
        Path<String> app_usertel = root.get("APP_USERTEL");
        Path<Integer> isDelPath = root.get("IS_DEL");
        Path<String> notePath = root.get("NOTE");
        if("".equalsIgnoreCase(tel)){
            criteriaQuery.where(criteriaBuilder.greaterThanOrEqualTo(appScorePath,this.chargeValue),criteriaBuilder.equal(appNamePath,"菜鸟理财")
                    ,criteriaBuilder.notLike(app_usertel,"17%"),criteriaBuilder.equal(isDelPath,0)
                    ,criteriaBuilder.or(criteriaBuilder.lessThan(criteriaBuilder.length(notePath),25),criteriaBuilder.isNull(notePath)));
        }else {
            criteriaQuery.where(criteriaBuilder.greaterThanOrEqualTo(appScorePath,this.chargeValue),criteriaBuilder.equal(appNamePath,"菜鸟理财")
                    ,criteriaBuilder.notLike(app_usertel,"17%"),criteriaBuilder.equal(isDelPath,0)
                    ,criteriaBuilder.like(notePath,"%"+tel+"%"));
        }

        if(this.chargeValue==6200){
            criteriaQuery.orderBy(criteriaBuilder.desc(appScorePath));
        }else if(this.chargeValue==2600){
            criteriaQuery.orderBy(criteriaBuilder.asc(appScorePath));
        }
        return null;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getChargeValue() {
        return chargeValue;
    }

    public void setChargeValue(Integer chargeValue) {
        this.chargeValue = chargeValue;
    }
}
