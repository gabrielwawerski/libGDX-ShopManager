package com.gpteam.shopmanager.NPCBuilder;

import com.gpteam.shopmanager.NPC.NPC;

import java.util.ArrayList;

/*
 * Created by masmix on 19.01.2017.
 */
public class NPCBuilder {
    private int npcQuantity;
    private NPC[] container;

    public static final int MAX_NPC_QUANTITY = 10000;
    public static final int MIN_NPC_QUANTITY = 0;

    public NPCBuilder(int npcQuantity) {
        if (npcQuantity > MAX_NPC_QUANTITY || npcQuantity < MIN_NPC_QUANTITY)
            throw new IllegalArgumentException();
        else
            this.npcQuantity = npcQuantity;
    }

    public NPCBuilder() {
        npcQuantity = 1;
    }

    public void setNPCQuantity() {

    }
    
    public NPC newNPC() {
    return new NPC(); // TODO allRandom
    }

    public NPC newNPC(boolean allRandom) {
        if (allRandom) // TODO
            return new NPC();
        else
            return new NPC();
    }

    public ArrayList<NPC> newNPCList(int npcQuantity) {
        ArrayList<NPC> npcs = new ArrayList<>();
        
        initialize(npcs, npcQuantity);
        return npcs;
    }

    public NPC[] newNPC(int npcQuantity) {
        if (npcQuantity > MAX_NPC_QUANTITY || npcQuantity < MIN_NPC_QUANTITY)
            throw new IllegalArgumentException();
        else
            container = new NPC[npcQuantity];

        for (int i = 0; i < npcQuantity; i++)
            container[i] = new NPC();

        return container;
    }

    // TODO
    public NPC[] newNPC(int npcAmount, boolean allRandom) {
        if (npcAmount > MAX_NPC_QUANTITY || npcAmount < MIN_NPC_QUANTITY)
            throw new IllegalArgumentException();
        else {
            if (allRandom) { // TODO random generation
                container = new NPC[npcAmount];
                return container;
            }
            else {
                container = new NPC[npcAmount];
                return container;
            }
        }
    }
    
    public void initialize(ArrayList<NPC> npcs, int npcQuantity) {
        for (int i = 0; i < npcQuantity; i++) {
            npcs.add(npcBuilder.newNPC());
        }
    }
}






