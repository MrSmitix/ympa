#import "OAIOrderDeliveryDTO.h"

@implementation OAIOrderDeliveryDTO

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"type": @"type", @"serviceName": @"serviceName", @"price": @"price", @"deliveryPartnerType": @"deliveryPartnerType", @"courier": @"courier", @"dates": @"dates", @"region": @"region", @"address": @"address", @"vat": @"vat", @"deliveryServiceId": @"deliveryServiceId", @"liftType": @"liftType", @"liftPrice": @"liftPrice", @"outletCode": @"outletCode", @"outletStorageLimitDate": @"outletStorageLimitDate", @"dispatchType": @"dispatchType", @"tracks": @"tracks", @"shipments": @"shipments", @"estimated": @"estimated", @"eacType": @"eacType", @"eacCode": @"eacCode" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"type", @"serviceName", @"price", @"deliveryPartnerType", @"courier", @"dates", @"region", @"address", @"vat", @"deliveryServiceId", @"liftType", @"liftPrice", @"outletCode", @"outletStorageLimitDate", @"dispatchType", @"tracks", @"shipments", @"estimated", @"eacType", @"eacCode"];
  return [optionalProperties containsObject:propertyName];
}

@end
