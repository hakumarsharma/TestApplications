package com.jio.testlibrary;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BluetoothDetails {
    @SerializedName("gatewayMac")
    private String gatewayMac;
    @SerializedName("jioTags")
    private List<JioTags> mList;

    public String getGatewayMac() {
        return gatewayMac;
    }

    public void setGatewayMac(String gatewayMac) {
        this.gatewayMac = gatewayMac;
    }

    public List<JioTags> getmList() {
        return mList;
    }

    public void setmList(List<JioTags> mList) {
        this.mList = mList;
    }

    public class JioTags {
        @SerializedName("macAddress")
        private String macAddress;
        @SerializedName("signalStrength")
        private int signalStrength;

        public String getMacAddress() {
            return macAddress;
        }

        public void setMacAddress(String macAddress) {
            this.macAddress = macAddress;
        }

        public int getSignalStrength() {
            return signalStrength;
        }

        public void setSignalStrength(int signalStrength) {
            this.signalStrength = signalStrength;
        }
    }
}
