#import "OAIOrdersStatsOrderDTO.h"

@implementation OAIOrdersStatsOrderDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"creationDate": @"creationDate", @"statusUpdateDate": @"statusUpdateDate", @"status": @"status", @"partnerOrderId": @"partnerOrderId", @"paymentType": @"paymentType", @"fake": @"fake", @"deliveryRegion": @"deliveryRegion", @"items": @"items", @"initialItems": @"initialItems", @"payments": @"payments", @"commissions": @"commissions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"creationDate", @"statusUpdateDate", @"status", @"partnerOrderId", @"paymentType", @"fake", @"deliveryRegion", @"initialItems", ];
  return [optionalProperties containsObject:propertyName];
}

@end
