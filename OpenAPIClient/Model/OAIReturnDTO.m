#import "OAIReturnDTO.h"

@implementation OAIReturnDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"orderId": @"orderId", @"creationDate": @"creationDate", @"updateDate": @"updateDate", @"refundStatus": @"refundStatus", @"logisticPickupPoint": @"logisticPickupPoint", @"shipmentRecipientType": @"shipmentRecipientType", @"shipmentStatus": @"shipmentStatus", @"refundAmount": @"refundAmount", @"items": @"items", @"returnType": @"returnType", @"fastReturn": @"fastReturn" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"orderId", @"creationDate", @"updateDate", @"refundStatus", @"logisticPickupPoint", @"shipmentRecipientType", @"shipmentStatus", @"refundAmount", @"returnType", @"fastReturn"];
  return [optionalProperties containsObject:propertyName];
}

@end
