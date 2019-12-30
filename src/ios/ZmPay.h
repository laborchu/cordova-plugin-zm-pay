#import <Cordova/CDV.h>

@interface ZmPay : CDVPlugin 
    @property NSString *callbackId;

    - (void)pay:(CDVInvokedUrlCommand*)command;
@end