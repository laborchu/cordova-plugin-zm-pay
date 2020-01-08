package net.zmskb.zmaggregatesdk.inner;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import net.zmskb.zmaggregatesdk.ZmOpenSDK;
import net.zmskb.zmaggregatesdk.ZmOpenSDKOrderListener;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import org.json.JSONException;
import org.json.JSONObject;

public class 규 implements 구 {
   public 그 가;
   public String 갸 = "YWxpcGF5cXIlM0EvL3BsYXRmb3JtYXBpL3N0YXJ0YXBwJTNGc2FJZCUzRDEwMDAwMDA3JTI2cXJjb2RlJTNE";

   public 규(그 var1) {
      this.가 = var1;
   }

   public final void 가() {
      String var1 = ZmOpenSDK.getInstance().getBuild().가;
      String var2 = ZmOpenSDK.getInstance().getBuild().갸;
      String var3 = ZmOpenSDK.getInstance().getBuild().거;
      String var4 = ZmOpenSDK.getInstance().getBuild().고.가();
      String var5 = ZmOpenSDK.getInstance().getBuild().고.고();
      String var6 = ZmOpenSDK.getInstance().getBuild().고.교().가;
      String var7 = ZmOpenSDK.getInstance().getBuild().고.거();
      거.갸("params", "merchantCode:" + var1 + "agencyCode:" + var2 + "certificateKey:" + var3 + "amount:" + var4 + "outOrderNo:" + var5 + "payType:" + var6);
      JSONObject var10000 = new JSONObject();
      JSONObject var10001 = var10000;
      JSONObject var10002 = var10000;
      JSONObject var10003 = var10000;
      JSONObject var10004 = var10000;
      JSONObject var10005 = var10000;
      JSONObject var8;
      JSONObject var10006 = var8 = var10000;

      label69: {
         String var19;
         label68: {
            JSONException var17;
            label73: {
               boolean var18;
               try {
                  var10006.put("transAmt", var4);
               } catch (JSONException var15) {
                  var17 = var15;
                  var18 = false;
                  break label73;
               }

               try {
                  var10005.put("payType", var6);
               } catch (JSONException var14) {
                  var17 = var14;
                  var18 = false;
                  break label73;
               }

               try {
                  var10004.put("memberCode", var1);
               } catch (JSONException var13) {
                  var17 = var13;
                  var18 = false;
                  break label73;
               }

               try {
                  var10003.put("cusOrderNo", var5);
               } catch (JSONException var12) {
                  var17 = var12;
                  var18 = false;
                  break label73;
               }

               String var20 = "ctime";

               try {
                  var10002.put(var20, System.currentTimeMillis());
               } catch (JSONException var11) {
                  var17 = var11;
                  var18 = false;
                  break label73;
               }

               try {
                  var10001.put("cusNotifyUrl", var7);
               } catch (JSONException var10) {
                  var17 = var10;
                  var18 = false;
                  break label73;
               }

               String var21 = "json";

               거.갸(var21, var8.toString());
               var19 = net.zmskb.zmaggregatesdk.inner.가.가(var10000.toString(), var2, var3);
               break label68;
            }

            var17.printStackTrace();
            var1 = "";
            break label69;
         }

         var1 = var19;
      }

      var3 = "https://yzgtt.qrcodexx.com/SdkPay/preTranxsn";
      if (!ZmOpenSDK.getInstance().getBuild().겨) {
         var3 = "https://pay.zhongmakj.com/SdkPay/preTranxsn";
      }

      (new OkHttpClient()).newCall((new Builder()).url(var3).post((new okhttp3.FormBody.Builder()).add("appid", var2).add("data", var1).build()).build()).enqueue(new 고(new 갸() {
         @Override
         public void 가(final String var1x) {
            Handler var2;
            Handler var10000 = var2 = new Handler(Looper.getMainLooper());
            var10000.post(new Runnable() {
               @Override
               public void run() {
                  JSONException var10000;
                  label99: {
                     boolean var10001;

                     JSONObject dataObject = null;
                     try {
                        dataObject = new JSONObject(var1x);
                     } catch (JSONException e) {
                        e.printStackTrace();
                     }
                     String respCode = dataObject.optString("respCode");
                     String respMsg = dataObject.optString("respMsg");


                     boolean var23 = "00".equals(respCode);

                     if (var23) {
                        label100: {
                           JSONObject respData = null;
                           try {
                              respData = dataObject.getJSONObject("respData");
                           } catch (JSONException e) {
                              e.printStackTrace();
                           }
                           String tranxSN = respData.optString("tranxSN");
                           String payLink = respData.optString("payLink");
                           ZmOpenSDKOrderListener var28 = ZmOpenSDK.getInstance().getBuild().고.겨();
                           var28.orderResult(1000, tranxSN);
                           int var27 = 가.ordinal();

                           int var18 = var27;
                           if (var27 != 0) {
                              if (var18 != 1) {
                                 return;
                              }
                              규.this.가(tranxSN, payLink);
                              return;
                           } else {
                              규.this.가(payLink);
                              return;
                           }
                        }
                     } else {
                        label101: {
                           ZmOpenSDKOrderListener var29;
                           var29 = ZmOpenSDK.getInstance().getBuild().고.겨();
                           short var30 = -1002;
                           var29.orderResult(var30, respMsg);
                           return;
                        }
                     }
                  }
               }
            });
         }
      }));
   }

   public final void 가(String var1, String var2) {
      거.갸("order", "下单成功 正在拉起微信小程序");
      boolean var10000;
      if (ZmOpenSDK.getInstance().getBuild() == null) {
         거.가("Params", "请先调用init方法");
         var10000 = false;
      } else {
         if (ZmOpenSDK.getInstance().getBuild().고 == null) {
            거.가("Params", "请先调用with方法");
         }

         var10000 = true;
      }

      if (var10000) {
         if (ZmOpenSDK.getInstance().getBuild().고.갸() == null) {
            거.가("Params", "Context 不能为空");
            var10000 = false;
         } else {
            var10000 = true;
         }

         if (var10000) {
            if (TextUtils.isEmpty(ZmOpenSDK.getInstance().getBuild().고.구())) {
               거.가("Params", "weChatAppKey 不能为空");
               var10000 = false;
            } else if (TextUtils.isEmpty(ZmOpenSDK.getInstance().getBuild().고.규())) {
               거.가("Params", "weChatMiniKey 不能为空");
               var10000 = false;
            } else {
               var10000 = true;
            }

            if (var10000) {
               String var4 = ZmOpenSDK.getInstance().getBuild().고.구();
               String var3 = ZmOpenSDK.getInstance().getBuild().고.규();
               IWXAPI var5 = WXAPIFactory.createWXAPI(ZmOpenSDK.getInstance().getBuild().고.갸(), var4);
               Req var10001 = new Req();
               var10001.userName = var3;
               var10001.path = var2 + "?tranxSN=" + var1 + "&appId=" + ZmOpenSDK.getInstance().getBuild().가();
               var10001.miniprogramType = ZmOpenSDK.getInstance().getBuild().고.그();
               var5.sendReq(var10001);
            }
         }
      }

   }

   @SuppressLint("WrongConstant")
   public final void 가(String var1) {
      UnsupportedEncodingException var10000;
      label77: {
         StringBuilder var14;
         boolean var10001;
         var14 = new StringBuilder();

         StringBuilder var16 = var14 = new StringBuilder();

         String var15;
         try {
            var15 = var14.append(URLDecoder.decode(거.가(this.갸), "UTF-8")).append(var1).toString();
         } catch (UnsupportedEncodingException var9) {
            var10000 = var9;
            var10001 = false;
            break label77;
         }

         String var11 = var15;

         label78: {
            label79: {
               Intent var17;
               try {
                  var17 = new Intent();
               } catch (Exception var8) {
                  var10001 = false;
                  break label79;
               }

               Intent var13 = var17;

               String var18;
               Intent var10002;
               try {
                  var18 = var11;
                  var10002 = var13 = new Intent();
                  var13.setAction("android.intent.action.VIEW");
               } catch (Exception var7) {
                  var10001 = false;
                  break label79;
               }

               try {
                  var10002.addFlags(268435456);
               } catch (Exception var6) {
                  var10001 = false;
                  break label79;
               }

               try {
                  var17.setData(Uri.parse(var18));
               } catch (Exception var5) {
                  var10001 = false;
                  break label79;
               }

               try {
                  ZmOpenSDK.getInstance().getBuild().고.갸().startActivity(var13);
                  break label78;
               } catch (Exception var4) {
                  var10001 = false;
               }
            }

            거.가("ali", "未安装支付宝");
         }

         거.갸("order", "下单成功 正在拉起支付宝");
         return;
      }

      UnsupportedEncodingException var12 = var10000;
      var12.printStackTrace();
   }
}
