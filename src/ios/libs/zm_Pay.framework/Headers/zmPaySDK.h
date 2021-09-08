//
//  zmPaySDK.h
//  zm_Pay
//
//  Created by admin on 2019/12/19.
//  Copyright © 2019 admin. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

typedef NS_ENUM(NSUInteger, WXMiniProgramEnv){
    WXEnvRelease = 0,       //**< 正式版  */
    WXEnvTest = 1,        //**< 开发版  */
    WXEnvPreview = 2,        //**< 体验版  */
};


#warning 本SDK需在手机上运行，不支持模拟器

NS_ASSUME_NONNULL_BEGIN

@interface zmPaySDK : NSObject

/// 阿里付入参
/// @param amount 金额
/// @param mcn 商户号
/// @param ogn 机构号
/// @param eck 加密秘钥
/// @param odn 订单号
/// @param nu 通知回调地址
/// @param debug 正式或测试环境
+ (void)startAliPay:(NSString *)amount merchantNum:(NSString *)mcn organizationNum:(NSString *)ogn encryptionKey:(NSString *)eck orderNum:(NSString *)odn notifyUrl:(NSString *)nu isDebug:(BOOL)debug response:(void(^)(id response))rs;

/// 微信付入参
/// @param amount 金额
/// @param mcn 商户号
/// @param ogn 机构号
/// @param mpid 小程序ID
/// @param eck 加密秘钥
/// @param odn 订单号
/// @param wxEnv 微信小程序环境
/// @param nu 通知回调地址
/// @param debug 正式或测试环境
+ (void)startWXPay:(NSString *)amount merchantNum:(NSString *)mcn organizationNum:(NSString *)ogn miniProID:(NSString *)mpid encryptionKey:(NSString *)eck orderNum:(NSString *)odn wxEnv:(WXMiniProgramEnv)wxEnv notifyUrl:(NSString *)nu isDebug:(BOOL)debug response:(void(^)(id response))rs;

@end

NS_ASSUME_NONNULL_END
