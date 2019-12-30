package net.zmskb.zmaggregatesdk.inner;

import android.util.Log;
import net.zmskb.zmaggregatesdk.ZmOpenSDK;

public class 거 {
   public static String 가(String var0) {
      byte[] var1 = 겨.가(var0);
      return new String(var1);
   }

   public static void 갸(String var0, String var1) {
      if (ZmOpenSDK.getInstance().getBuild().겨) {
         Log.v(var0, var1);
      }

   }

   public static void 가(String var0, String var1) {
      if (ZmOpenSDK.getInstance().getBuild().겨) {
         Log.e(var0, var1);
      }

   }
}
