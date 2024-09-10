#import "OAIOutletDTO.h"

@implementation OAIOutletDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"type": @"type", @"coords": @"coords", @"isMain": @"isMain", @"shopOutletCode": @"shopOutletCode", @"visibility": @"visibility", @"address": @"address", @"phones": @"phones", @"workingSchedule": @"workingSchedule", @"deliveryRules": @"deliveryRules", @"storagePeriod": @"storagePeriod" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"coords", @"isMain", @"shopOutletCode", @"visibility", @"deliveryRules", @"storagePeriod"];
  return [optionalProperties containsObject:propertyName];
}

@end
