package com.example.guest.chatapp.models;

import org.parceler.Parcel;

import java.sql.Timestamp;

/**
 * Created by Guest on 3/29/18.
 */

@Parcel
public class Messages {
    String senderId;
    String senderName;
    String text;
    String timestamp = new Timestamp(System.currentTimeMillis()).toString();
    String pushId;

    public Messages() {}

    public Messages(String senderId, String senderName, String text) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.text = text;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

}
