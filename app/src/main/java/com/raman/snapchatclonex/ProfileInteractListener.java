package com.raman.snapchatclonex;

public interface ProfileInteractListener {
    void CloseProfile();
    void ShowFriendRequests();
    void ShowProfile();
    boolean onBackPressProfile();

    void SetUsername(String username);
}
