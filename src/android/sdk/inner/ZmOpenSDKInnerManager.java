package net.zmskb.zmaggregatesdk.inner;

import android.app.Activity;
import net.zmskb.zmaggregatesdk.ZmOpenSDKOrderListener;

public class ZmOpenSDKInnerManager {
   public Activity 가;
   public String 갸;
   public String 거;
   public 그 겨;
   public ZmOpenSDKOrderListener 고;
   public String 교;
   public String 구;
   public String 규;
   public int 그 = 2;

   public ZmOpenSDKInnerManager(Activity var1) {
      this.가 = var1;
   }

   public ZmOpenSDKInnerManager setInnerParams(String var1, String var2, String var3, ZmOpenSDKOrderListener var4) {
      this.갸 = var1;
      this.거 = var2;
      this.규 = var3;
      this.고 = var4;
      return this;
   }

   public void setAliPay() {
      this.겨 = net.zmskb.zmaggregatesdk.inner.그.갸;
      (new 규(this.겨)).가();
   }

   public void setWeChatPay(String var1, String var2) {
      this.교 = var1;
      this.구 = var2;
      this.겨 = net.zmskb.zmaggregatesdk.inner.그.거;
      (new 규(this.겨)).가();
   }

   public void setWeChatPay(String var1, String var2, int var3) {
      this.교 = var1;
      this.구 = var2;
      this.겨 = net.zmskb.zmaggregatesdk.inner.그.거;
      this.그 = var3;
      (new 규(this.겨)).가();
   }

   public Activity 갸() {
      return this.가;
   }

   public String 가() {
      return this.갸;
   }

   public ZmOpenSDKOrderListener 겨() {
      return this.고;
   }

   public String 고() {
      return this.거;
   }

   public 그 교() {
      return this.겨;
   }

   public String 구() {
      return this.교;
   }

   public String 규() {
      return this.구;
   }

   public String 거() {
      return this.규;
   }

   public int 그() {
      return this.그;
   }
}
