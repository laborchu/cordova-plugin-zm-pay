package net.zmskb.zmaggregatesdk.inner;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public final class 고 implements Callback {
   // $FF: synthetic field
   public final 갸 가;

   public 고(갸 var1) {
      this.가 = var1;
   }

   public void onFailure(Call var1, IOException var2) {
      this.가.가("{\"respCode\":\"1001\",\"respMsg\":\"" + var2.getMessage() + "\"}");
   }

   public void onResponse(Call var1, Response var2) {
      if (var2.body() != null) {
         try {
            this.가.가(var2.body().string());
         } catch (IOException e) {
            e.printStackTrace();
         }
      }

   }
}
