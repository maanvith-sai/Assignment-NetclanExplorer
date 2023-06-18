package com.maanvith.assignment;

import android.media.Image;

public class Item {
    String name;
    String place;
    String role;
    int profile;

    public Item(String name, String place, String role, int profile) {
        this.name = name;
        this.place = place;
        this.role = role;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
