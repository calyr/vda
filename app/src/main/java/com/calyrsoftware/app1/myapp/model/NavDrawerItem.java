package com.calyrsoftware.app1.myapp.model;

/**
 * Created by callisaya on 20/10/15.
 */
public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private int titleicon;


    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title,int titleicon) {
        this.showNotify = showNotify;
        this.title = title;
        this.titleicon = titleicon;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTitleicon() {
        return titleicon;
    }

    public void setTitleicon(int titleicon) {
        this.titleicon = titleicon;
    }
}
