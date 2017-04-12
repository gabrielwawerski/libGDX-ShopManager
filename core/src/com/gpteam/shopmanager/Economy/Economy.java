package com.gpteam.shopmanager.Economy;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;

import java.math.BigDecimal;

/*
 * Created by masmix on 02.02.2017.
 */
public class Economy {
    private BigDecimal totalMoney; //needed?
    private float economyBar;
    
    public float getEconomyBar() {
    }
    
    public void raiseEconomyBar(float amount) {
        if (amount != 0)
            economyBar += amount;
        else
            ErrorHandler.handleIllegalArgumentException("msg");
    }
    
    public void lowerEconomyBar(float amount) {
        if (amount != 0)
    		economyBar -= amount;
        else
    		ErrorHandler.handleIllegalArgumentException("msg");
    }

    public void update() {
    }
    
    public BigDecimal getTotalMoney() {
    		return totalMoney;
    }

    public void addTotalMoney(BigDecimal money) {
        totalMoney = totalMoney.add(money);
    }
}
