#import "OAIOrdersStatsPaymentDTO.h"

@implementation OAIOrdersStatsPaymentDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"date": @"date", @"type": @"type", @"source": @"source", @"total": @"total", @"paymentOrder": @"paymentOrder" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"date", @"type", @"source", @"total", @"paymentOrder"];
  return [optionalProperties containsObject:propertyName];
}

@end
