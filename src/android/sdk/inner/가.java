package net.zmskb.zmaggregatesdk.inner;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class 가 {
   public static final String 가 = 거.가("QUVT");
   public static final String 갸 = 거.가("QUVTL0NCQy9QS0NTNVBhZGRpbmc=");

   public static String 가(String var0, String var1, String var2) {
      if (var1.length() != 16) {
         var1 = var1 + var1;
      }

      var1 = var1.substring(0, 16);
      var2 = var2.substring(0, 16);

      byte[] var9;
      byte[] var13;
      label54: {
         Exception var10000;
         label49: {
            Cipher var10;
            boolean var10001;
            try {
               var10 = Cipher.getInstance(갸);
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label49;
            }

            Cipher var11 = var10;

            String var12;
            Cipher var10002;
//            SecretKeySpec var10003;
            try {
               var10002 = var11;
               var12 = var0;
//               var10003 = new SecretKeySpec;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label49;
            }

            SecretKeySpec var7 = new SecretKeySpec(var1.getBytes(), 가);

//            try {
//               var10003.<init>(var1.getBytes(), 가);
//            } catch (Exception var4) {
//               var10000 = var4;
//               var10001 = false;
//               break label49;
//            }

            byte var14 = 1;

            try {
               var10002.init(var14, var7, new IvParameterSpec(var2.getBytes()));
               var13 = var10.doFinal(var12.getBytes("UTF-8"));
               break label54;
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
            }
         }

         Exception var8 = var10000;
         System.out.print(var8.getMessage());
         var9 = null;
         return 겨.가(var9);
      }

      var9 = var13;
      return 겨.가(var9);
   }
}
