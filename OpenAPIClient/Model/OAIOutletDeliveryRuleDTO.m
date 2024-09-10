#import "OAIOutletDeliveryRuleDTO.h"

@implementation OAIOutletDeliveryRuleDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"minDeliveryDays": @"minDeliveryDays", @"maxDeliveryDays": @"maxDeliveryDays", @"deliveryServiceId": @"deliveryServiceId", @"orderBefore": @"orderBefore", @"priceFreePickup": @"priceFreePickup", @"unspecifiedDeliveryInterval": @"unspecifiedDeliveryInterval" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"minDeliveryDays", @"maxDeliveryDays", @"deliveryServiceId", @"orderBefore", @"priceFreePickup", @"unspecifiedDeliveryInterval"];
  return [optionalProperties containsObject:propertyName];
}

@end
