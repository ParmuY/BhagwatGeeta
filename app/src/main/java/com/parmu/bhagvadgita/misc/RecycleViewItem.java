package com.parmu.bhagvadgita.misc;



public class RecycleViewItem  {
    private final int mImageResource;
    private final String mText1;

    public RecycleViewItem(int imageResource, String text1){
        mImageResource = imageResource;
        mText1 = text1;
    }
    public int getImageResource(){
        return mImageResource;
    }
    public  String getText1(){
        return mText1;
    }

}
