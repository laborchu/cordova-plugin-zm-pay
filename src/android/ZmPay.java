package org.apache.cordova.zmpay;


import net.zmskb.zmaggregatesdk.ZmOpenSDK;
import net.zmskb.zmaggregatesdk.ZmOpenSDKOrderListener;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import xu.li.cordova.wechat.Wechat;

public class ZmPay extends CordovaPlugin {
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        boolean res = true;
        if ("pay".equals(action)) {
            JSONObject jsonObject = args.getJSONObject(0);
            String memberCode = jsonObject.getString("merchantNum");
            String agencyCode = jsonObject.getString("organizationNum");
            String certificateKey = jsonObject.getString("encryptionKey");
            String amount = jsonObject.getString("amount");
            String outOrderNo = jsonObject.getString("orderNum");
            String notifyUrl = jsonObject.getString("notifyUrl");
            String weChatMiniKey = jsonObject.getString("miniProID");
            String weChatAppKey = preferences.getString(Wechat.WXAPPID_PROPERTY_KEY, "");
            ZmOpenSDK.getInstance().init(memberCode, agencyCode, certificateKey, true);

            ZmOpenSDK.getInstance().with(cordova.getActivity()).setInnerParams(amount, outOrderNo, notifyUrl, new ZmOpenSDKOrderListener() {
                @Override
                public void orderResult(int i, String s) {
                    callbackContext.success(s);
                }
            }).setWeChatPay(weChatAppKey, weChatMiniKey);
        }
        return res;
    }
}
