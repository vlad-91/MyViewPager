package com.example.smartland.viewpager;

public enum ModelObject {

    RED(R.string.this_is_red_page, R.layout.view_red),
    BLUE(R.string.this_is_blue_page, R.layout.view_blue),
    GREEN(R.string.this_is_green_page, R.layout.view_green);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}
