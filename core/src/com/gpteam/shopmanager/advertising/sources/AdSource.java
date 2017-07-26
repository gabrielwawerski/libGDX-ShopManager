package com.gpteam.shopmanager.advertising.sources;

import com.gpteam.shopmanager.society.SocietyClass;

import java.math.BigDecimal;

public abstract class AdSource {
    /**
     * Increase funding of ads,
     */
    public void increaseFunds(String funds) {
    }

    public void decreaseFunds(String funds) {
    }

    public void setFunds(String funds) {
    }

    /**
     * Get the amount of bots that have been influenced
     * by ads, only from desired society class.
     */
    public int getSocietyClassEffectiveness(SocietyClass societyClass) {
        return 0;
    }

    /**
     * Get the amount of total bots influenced by ads.
     */
    public int getAdEffectiveness() {
        return 0;
    }
}
