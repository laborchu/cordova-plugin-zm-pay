package net.zmskb.zmaggregatesdk;

import android.app.Activity;
import net.zmskb.zmaggregatesdk.inner.ZmOpenSDKInnerManager;
import net.zmskb.zmaggregatesdk.inner.거;
import net.zmskb.zmaggregatesdk.inner.교;

public class ZmOpenSDK {
   public static ZmOpenSDK 갸;
   public 교 가;

   public static synchronized ZmOpenSDK getInstance() {
      if (갸 == null) {
         갸 = new ZmOpenSDK();
      }

      return 갸;
   }

   public void init(String var1, String var2, String var3) {
      this.가 = new 교();
      교 var4;
      교 var10000 = var4 = this.가;
      var4.가 = var1;
      var4.갸 = var2;
      var10000.거 = var3;
      var10000.겨 = false;
   }

   public void init(String var1, String var2, String var3, boolean var4) {
      this.가 = new 교();
      교 var5;
      교 var10000 = var5 = this.가;
      var5.가 = var1;
      var5.갸 = var2;
      var5.거 = var3;
      var10000.겨 = var4;
   }

   public ZmOpenSDKInnerManager with(Activity var1) {
      if (this.가 == null) {
         거.가("Init", "请先调用init方法");
      }

      ZmOpenSDKInnerManager var2 = new ZmOpenSDKInnerManager(var1);
      this.가.고 = var2;
      return var2;
   }

   public 교 getBuild() {
      return this.가;
   }
}
