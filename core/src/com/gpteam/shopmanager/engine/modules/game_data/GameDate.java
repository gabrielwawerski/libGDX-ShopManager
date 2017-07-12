package com.gpteam.shopmanager.engine.modules.game_data;

import com.gpteam.shopmanager.time.Date;

/*
 * Created by masmix on 23.12.2016.
 */
public class GameDate { // TODO Figure out whetver to use this class or my own Time class to hanlde game time
    private Date currentDate;
    private Date dateStarted;

    public GameDate() {
        currentDate = new Date();
        dateStarted = currentDate;
    }

    public GameDate(Date dateStarted) {
        this.dateStarted = dateStarted;
        currentDate = dateStarted;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public void initDate() {
        dateStarted = new Date();
    }

    public Date getDateStarted() {
        return dateStarted;
    }
}
