#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(ArLocalizerRn, NSObject)

 RCT_EXTERN_METHOD(createArView: (NSString) value
    resolver: (RCTPromiseResolveBlock)resolve
    rejecter: (RCTPromiseRejectBlock)reject)

@end
