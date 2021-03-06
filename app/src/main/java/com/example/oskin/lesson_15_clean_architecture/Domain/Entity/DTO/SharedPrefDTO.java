package com.example.oskin.lesson_15_clean_architecture.Domain.Entity.DTO;

public class SharedPrefDTO {

    private String mCityName;
    private int mCountDays;
    private boolean mIsKm;
    private boolean mIsCelsius;
    private boolean mIsMm;

    private float mLatitude;
    private float mLongitude;

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public int getCountDays() {
        return mCountDays;
    }

    public void setCountDays(int countDays) {
        mCountDays = countDays;
    }

    public boolean isKm() {
        return mIsKm;
    }

    public void setKm(boolean km) {
        mIsKm = km;
    }

    public boolean isCelsius() {
        return mIsCelsius;
    }

    public void setCelsius(boolean celsius) {
        mIsCelsius = celsius;
    }

    public boolean isMm() {
        return mIsMm;
    }

    public void setMm(boolean mm) {
        mIsMm = mm;
    }

    public float getLatitude() {
        return mLatitude;
    }

    public void setLatitude(float latitude) {
        mLatitude = latitude;
    }

    public float getLongitude() {
        return mLongitude;
    }

    public void setLongitude(float longitude) {
        mLongitude = longitude;
    }

    public String getCityCoordinatesToString(){
        return (mLatitude + " , " + mLongitude);
    }
}
