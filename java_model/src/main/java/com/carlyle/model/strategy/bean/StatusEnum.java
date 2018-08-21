package com.carlyle.model.strategy.bean;

/**
 * 策略枚举(增加新策略时需要添加数据)
 *
 */
public enum StatusEnum {

    StrateryA("org.carlyle.study.strategy.StrategyA"),
    StrateryB("org.carlyle.study.strategy.StrategyB");
    
    String value = "";
    
    private StatusEnum(String value){
        this.value = value;
    }
    
    public String getvalue(){
        return this.value;
    }
}