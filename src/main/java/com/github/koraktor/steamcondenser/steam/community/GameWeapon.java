/**
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 *
 * Copyright (c) 2009-2012, Sebastian Staudt
 */

package com.github.koraktor.steamcondenser.steam.community;

/**
 * An abstract class implementing basic functionality for classes representing
 * game weapons
 *
 * @author Sebastian Staudt
 */
public abstract class GameWeapon {

    protected int kills;

    protected String id;

    protected int shots;

    /**
     * Creates a new game weapon instance with the data provided
     *
     * @param weaponData The data representing this weapon
     */
    public GameWeapon(XMLData weaponData) {
        this.kills = weaponData.getInteger("kills");
    }

    /**
     * Returns the average number of shots needed for a kill with this weapon
     *
     * @return The average number of shots needed for a kill
     */
    public float getAvgShotsPerKill() {
        return this.shots / this.kills;
    }

    /**
     * Returns the unique identifier for this weapon
     *
     * @return The identifier of this weapon
     */
    public String getId() {
        return this.id;
    }

    /**
     * Returns the number of kills achieved with this weapon
     *
     * @return The number of kills achieved
     */
    public int getKills() {
        return this.kills;
    }

    /**
     * Returns the number of shots fired with this weapon
     *
     * @return The number of shots fired
     */
    public int getShots() {
        return this.shots;
    }

}
