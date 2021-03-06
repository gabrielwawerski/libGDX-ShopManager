package com.gpteam.shopmanager.advertising;

import com.gpteam.shopmanager.game.engine.modules.error_handler.ErrorHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class for the game's feature that lets the player advertise his company to attract attention
 * of ai. It uses the {@link AdSource} class, with the help of {@link AdSourceEnum} enum. Each instance
 * of {@code AdSource} class is a separate ad source (currently TV, Radio, Newspaper)
 *
 * <p>Validating of {@code funds}, {@code amount} fields, given as arguments is done in
 * {@code AdSource} class. This class only validates the {@code adSource} argument. {@code funds},
 * {@code amount} arguments are of {@code String} type. When decreasing funds, don't use the minus
 * (-) sign. Always pass regular Strings without sign.
 */
// TODO add logic that influences ai under the effect of advertising
public final class Advertising {
    private String funds;
    private Map<AdSourceEnum, AdSource> adSources;

    public Advertising() {
        adSources = new HashMap<AdSourceEnum, AdSource>(3);
        funds = "0";

        adSources.put(AdSourceEnum.NEWSPAPER, AdSource.getNewspaperInstance());
        adSources.put(AdSourceEnum.RADIO,     AdSource.getRadioInstance());
        adSources.put(AdSourceEnum.TV,        AdSource.getTvInstance());
    }

    /**
     *
     */
    public void update() {
        // TODO this method should update all ad sources influence and report it here
        // it should be done once every second?
    }

    /**
     * Increases funds evenly spread to all ad sources from {@code AdSources} class
     *
     * @param funds the exact number of funds increase
     */
    public void increaseFunds(String funds) {
    }

    /**
     * Increases funds to the ad source given as the first argument.
     *
     * @param adSource Ad source that is going to have it's funds increased
     * @param amount the exact amount of increase to the funds of the chosen ad source
     */
    public void increaseFunds(AdSourceEnum adSource, String amount) {
        if (!adSources.containsKey(adSource))
            ErrorHandler.handleIllegalArgumentException("msg");

        adSources.get(adSource).increaseFunds(amount);
    }

    /**
     * Dncreases funds to the ad source given as the first argument.
     *
     * @param adSource ad source that is going to have it's funds decreased
     * @param funds the exact amount of increase to the funds of the chosen ad source
     */
    public void decreaseFunds(AdSourceEnum adSource, String funds) {
    }

    /**
     * Returns all active ad sources
     *
     * @return Ad sources array, filled with active ad sources.
     */
    // TODO Think about writing separate class that contains information about the ad sources (current funds, etc) - not only the enum
    public ArrayList<AdSource> getActiveAdSources() {
        return null;
    }

    public void activateSource(AdSourceEnum adSource) {
        if (!adSources.containsKey(adSource))
            ErrorHandler.handleIllegalArgumentException("Argument is not in adSources arraylist.");

        adSources.get(adSource).activate();
    }

    public void deactivateSource(AdSourceEnum adSource) {
        if (!adSources.containsKey(adSource))
            ErrorHandler.handleIllegalArgumentException("Argument is not in adSources arraylist.");

        adSources.get(adSource).deactivate();
    }

    public String getAdsRevenue() {
        return null;
    }

    public void setFunds(AdSourceEnum adSource, String funds) {
    }

    public String getFunds() {
        return funds;
    }

    /**
     * Calculates the most possible outcome of the given increase or decrease of ads funding. If you
     * want to check the decrease to the funds, simply put "-" in front of your value, eg. "-1000".
     * You don't need to put a "+" sign when you want to check the increase to the funds.
     *
     * <ul>
     *  <li>index 0: minimum increase in effectiveness</li>
     *  <li>index 1: maximum increase in effectiveness</li>
     *  <li>index 2: most probable amount of bots influenced</li>
     * </ul>
     *
     * @return array containing information about the outcome
     */
    // TODO split into two methods: estimateIncreaseOutcome, estimateDecreaseOutcome
    private String[] estimateOutcome(String funds) {
        return null;
    }
}
