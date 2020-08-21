#import "ZmPay.h"
#import <zm_Pay/zmPaySDK.h>

@implementation ZmPay

@synthesize callbackId;

-(void)pluginInitialize
{
}

- (void)pay:(CDVInvokedUrlCommand*)command
{
    self.callbackId = command.callbackId;
    NSDictionary *params = [command.arguments objectAtIndex:0];
    NSString *channel = params[@"channel"];
    NSString *amount = params[@"amount"];
    NSString *merchantNum = params[@"merchantNum"];
    NSString *organizationNum = params[@"organizationNum"];
    NSString *miniProID = params[@"miniProID"];
    NSString *encryptionKey = params[@"encryptionKey"];
    NSString *orderNum = params[@"orderNum"];
    NSString *notifyUrl = params[@"notifyUrl"];
    encryptionKey = [encryptionKey substringToIndex:16];

    if([@"alipay" channel]){
        [zmPaySDK startAliPay:amount merchantNum:merchantNum organizationNum:organizationNum encryptionKey:encryptionKey orderNum:orderNum notifyUrl:notifyUrl isDebug:NO response:^(id _Nonnull response){
            CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:response];
            [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];
            NSLog(@"%@",response);
        }];
    }else{
        [zmPaySDK startWXPay:amount merchantNum:merchantNum organizationNum:organizationNum miniProID:miniProID encryptionKey:encryptionKey orderNum:orderNum wxEnv:WXEnvRelease notifyUrl:notifyUrl isDebug:NO response:^(id _Nonnull response){
            CDVPluginResult* pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:response];
            [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];
            NSLog(@"%@",response);
        }];
    }
    
}


@end
