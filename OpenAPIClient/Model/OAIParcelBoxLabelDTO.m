#import "OAIParcelBoxLabelDTO.h"

@implementation OAIParcelBoxLabelDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"url": @"url", @"supplierName": @"supplierName", @"deliveryServiceName": @"deliveryServiceName", @"orderId": @"orderId", @"orderNum": @"orderNum", @"recipientName": @"recipientName", @"boxId": @"boxId", @"fulfilmentId": @"fulfilmentId", @"place": @"place", @"weight": @"weight", @"deliveryServiceId": @"deliveryServiceId", @"deliveryAddress": @"deliveryAddress", @"shipmentDate": @"shipmentDate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"deliveryAddress", @"shipmentDate"];
  return [optionalProperties containsObject:propertyName];
}

@end
