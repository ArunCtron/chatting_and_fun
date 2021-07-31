package com.example.chatting_and_fun;
public class chats {
    private final String Name;
    private final String Message;
    private final int mImageResourceId;
    public chats(String vName, String vNumber, int imageResourceId)
    {
        Name = vName;
        Message = vNumber;
        mImageResourceId = imageResourceId;

    }
    public String getName() {
        return Name;
    }
    public String getMessage() {
        return Message;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }
}