package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMivokTranslation;
    private int mImageresourceID;
    private int Visible;
    private int mAudioDescription;


    public Word(String defaultTranslation, String mivoktranslation, int AudioResourceId ){
        Visible= 8;
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivoktranslation;
        mAudioDescription = AudioResourceId;
    }

    public Word(String defaultTranslation,String mivokTranslation,int ResourceID,int AudioResourceId){
        Visible = 0;
        mDefaultTranslation = defaultTranslation;
        mMivokTranslation = mivokTranslation;
        mImageresourceID = ResourceID;
        mAudioDescription = AudioResourceId;
    }


    public String getDefaultText() {
        return mDefaultTranslation;
    }

    public String getMivokTranslation() {
        return mMivokTranslation;
    }

    public int getImageResource() {
        return mImageresourceID;
    }
    public int Visibiity(){
        return Visible;
    }
    public int getAudio(){
        return mAudioDescription;
    }
}
