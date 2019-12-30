package net.zmskb.zmaggregatesdk.inner;

public final class 겨 {
   public static final byte[] 가 = new byte[128];
   public static final char[] 갸 = new char[64];

   public static boolean 갸(char var0) {
      return var0 == '=';
   }

   public static boolean 가(char var0) {
      return var0 < 128 && 가[var0] != -1;
   }

   public static String 가(byte[] var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1;
         if ((var1 = var0.length * 8) == 0) {
            return "";
         } else {
            int var2;
            int var10000 = var2 = var1 % 24;
            var1 /= 24;
            int var3;
            if (var10000 != 0) {
               var3 = var1 + 1;
            } else {
               var3 = var1;
            }

            char[] var19 = new char[var3 * 4];
            int var4 = 0;
            int var5 = 0;

            int var10001;
            byte var24;
            for(int var6 = 0; var6 < var1; ++var6) {
               byte var7;
               var24 = var7 = var0[var5++];
               byte var8;
               byte var10002 = var8 = var0[var5++];
               byte var9 = var0[var5++];
               byte var10 = (byte)(var10002 & 15);
               byte var11 = (byte)(var24 & 3);
               if ((var24 & -128) == 0) {
                  var7 = (byte)(var7 >> 2);
               } else {
                  var7 = (byte)(var7 >> 2 ^ 192);
               }

               if ((var8 & -128) == 0) {
                  var8 = (byte)(var8 >> 4);
               } else {
                  var8 = (byte)(var8 >> 4 ^ 240);
               }

               byte var12;
               if ((var9 & -128) == 0) {
                  var12 = (byte)(var9 >> 6);
               } else {
                  var12 = (byte)(var9 >> 6 ^ 252);
               }

               int var13;
               int var25 = var13 = var4 + 1;
               char[] var14;
               char[] var26 = var14 = 갸;
               var19[var4] = var14[var7];
               var4 = var13 + 1;
               var19[var25] = var26[var8 | var11 << 4];
               int var23;
               var10001 = var23 = var4 + 1;
               var19[var4] = var14[var10 << 2 | var12];
               var4 = var23 + 1;
               var19[var10001] = var14[var9 & 63];
            }

            byte var15;
            byte var16;
            if (var2 == 8) {
               var24 = var15 = var0[var5];
               var16 = (byte)(var24 & 3);
               if ((var24 & -128) == 0) {
                  var15 = (byte)(var15 >> 2);
               } else {
                  var15 = (byte)(var15 >> 2 ^ 192);
               }

               var2 = var4 + 1;
               char[] var20;
               var19[var4] = (var20 = 갸)[var15];
               int var17;
               var10001 = var17 = var2 + 1;
               var19[var2] = var20[var16 << 4];
               ++var10001;
               var19[var17] = '=';
               var19[var10001] = '=';
            } else if (var2 == 16) {
               var24 = var16 = var0[var5];
               byte var18 = (byte)((var15 = var0[var5 + 1]) & 15);
               byte var21 = (byte)(var24 & 3);
               if ((var24 & -128) == 0) {
                  var16 = (byte)(var16 >> 2);
               } else {
                  var16 = (byte)(var16 >> 2 ^ 192);
               }

               if ((var15 & -128) == 0) {
                  var15 = (byte)(var15 >> 4);
               } else {
                  var15 = (byte)(var15 >> 4 ^ 240);
               }

               char[] var22;
               var19[var4++] = (var22 = 갸)[var16];
               var10001 = var1 = var4 + 1;
               var19[var4] = var22[var15 | var21 << 4];
               ++var10001;
               var19[var1] = var22[var18 << 2];
               var19[var10001] = '=';
            }

            return new String(var19);
         }
      }
   }

   public static byte[] 가(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1;
         int var2;
         int var3;
         char var4;
         char[] var11;
         if ((var11 = var0.toCharArray()) == null) {
            var1 = 0;
         } else {
            var1 = 0;
            var2 = var11.length;

            for(var3 = 0; var3 < var2; ++var3) {
               if ((var4 = var11[var3]) != ' ' && var4 != '\r' && var4 != '\n' && var4 != '\t') {
                  var11[var1++] = var11[var3];
               }
            }
         }

         if (var1 % 4 != 0) {
            return null;
         } else if ((var1 /= 4) == 0) {
            return new byte[0];
         } else {
            var2 = 0;
            var3 = 0;
            int var18 = 0;

            byte[] var5;
            char var6;
            int var10001;
            int var10002;
            byte var21;
            for(var5 = new byte[var1 * 3]; var2 < var1 - 1; ++var2) {
               char var7;
               char var8;
               char var9;
               if (!가(var6 = var11[var18++]) || !가(var7 = var11[var18++]) || !가(var8 = var11[var18++]) || !가(var9 = var11[var18++])) {
                  return null;
               }

               var10002 = var3;
               byte[] var10;
               byte var10003 = (var10 = 가)[var6];
               var21 = var10[var7];
               byte var22 = var10[var8];
               byte var23 = var10[var9];
               ++var3;
               var5[var10002] = (byte)(var10003 << 2 | var21 >> 4);
               int var24;
               var10001 = var24 = var3 + 1;
               var5[var3] = (byte)((var21 & 15) << 4 | var22 >> 2 & 15);
               var3 = var24 + 1;
               var5[var10001] = (byte)(var22 << 6 | var23);
            }

            var1 = var18 + 1;
            if (가(var4 = var11[var18]) && 가(var6 = var11[var1++])) {
               byte[] var26 = 가;
               byte var20 = var26[var4];
               var21 = var26[var6];
               var10001 = var1 + 1;
               char var12 = var11[var1];
               char var16 = var11[var10001];
               byte var13;
               if (가(var12) && 가(var16)) {
                  var26 = 가;
                  var13 = var26[var12];
                  byte var19 = var26[var16];
                  var10002 = var2 = var3 + 1;
                  var5[var3] = (byte)(var20 << 2 | var21 >> 4);
                  ++var10002;
                  var5[var2] = (byte)((var21 & 15) << 4 | var13 >> 2 & 15);
                  var5[var10002] = (byte)(var13 << 6 | var19);
                  return var5;
               } else {
                  byte[] var25;
                  if (갸(var12) && 갸(var16)) {
                     if ((var21 & 15) != 0) {
                        return null;
                     } else {
                        int var14;
                        byte[] var17;
                        var25 = var17 = new byte[(var14 = var2 * 3) + 1];
                        System.arraycopy(var5, 0, var17, 0, var14);
                        var25[var3] = (byte)(var20 << 2 | var21 >> 4);
                        return var25;
                     }
                  } else if (!갸(var12) && 갸(var16)) {
                     if (((var13 = 가[var12]) & 3) != 0) {
                        return null;
                     } else {
                        byte[] var15;
                        var25 = var15 = new byte[(var1 = var2 * 3) + 2];
                        System.arraycopy(var5, 0, var15, 0, var1);
                        var10002 = var3 + 1;
                        var15[var3] = (byte)(var20 << 2 | var21 >> 4);
                        var25[var10002] = (byte)((var21 & 15) << 4 | var13 >> 2 & 15);
                        return var25;
                     }
                  } else {
                     return null;
                  }
               }
            } else {
               return null;
            }
         }
      }
   }

   static {
      int var0;
      for(var0 = 0; var0 < 128; ++var0) {
         가[var0] = -1;
      }

      for(var0 = 90; var0 >= 65; --var0) {
         가[var0] = (byte)(var0 - 65);
      }

      for(var0 = 122; var0 >= 97; --var0) {
         가[var0] = (byte)(var0 - 97 + 26);
      }

      for(var0 = 57; var0 >= 48; --var0) {
         가[var0] = (byte)(var0 - 48 + 52);
      }

      byte[] var10000 = 가;
      var10000[43] = 62;
      var10000[47] = 63;

      for(var0 = 0; var0 <= 25; ++var0) {
         갸[var0] = (char)(var0 + 65);
      }

      var0 = 26;

      int var1;
      for(var1 = 0; var0 <= 51; ++var1) {
         갸[var0] = (char)(var1 + 97);
         ++var0;
      }

      var0 = 52;

      for(var1 = 0; var0 <= 61; ++var1) {
         갸[var0] = (char)(var1 + 48);
         ++var0;
      }

      char[] var2 = 갸;
      var2[62] = '+';
      var2[63] = '/';
   }
}
