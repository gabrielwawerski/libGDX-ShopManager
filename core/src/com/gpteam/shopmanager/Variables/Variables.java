package com.gpteam.shopmanager.Variables;

import com.gpteam.shopmanager.Character.CharacterInfo;
import com.gpteam.shopmanager.FileHandlers.Loaders.NamesLoader;
import com.gpteam.shopmanager.NPC.NPCHandler;
import com.gpteam.shopmanager.Skill.SkillLogic;

/*
 * Created by masmix on 04.02.2017.
 */
public final class Variables {
    /**************************************************
     * {@link NamesLoader}
     * NAMES_PATH is the location
     * of txt file with random names
     **************************************************/
    public final static String NAMES_PATH = "names.txt";

    /**************************************************
     * {@link CharacterInfo}
     **************************************************/
    public final static int MAX_NAME_LENGTH = 25;
    public final static int MIN_NAME_LENGTH = 2;
    public final static int MAX_AGE_LENGTH = 120;
    public final static int MIN_AGE_LENGTH = 16;

    /**************************************************
     * {@link SkillLogic}
     **************************************************/
    public final static int MAX_SKILL_LEVEL = 120;
    public final static int MIN_SKILL_LEVEL = 0;

    /**************************************************
     * {@link NPCHandler}
     **************************************************/
    public final static int MAX_NPC_AMOUNT = 10000;
    public final static int MIN_NPC_AMOUNT = 0;
}