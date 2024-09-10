#import "OAILogisticPickupPointDTO.h"

@implementation OAILogisticPickupPointDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"address": @"address", @"instruction": @"instruction", @"type": @"type", @"logisticPartnerId": @"logisticPartnerId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"name", @"address", @"instruction", @"type", @"logisticPartnerId"];
  return [optionalProperties containsObject:propertyName];
}

@end
