#import "OAIOrdersStatsItemDTO.h"

@implementation OAIOrdersStatsItemDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"offerName": @"offerName", @"marketSku": @"marketSku", @"shopSku": @"shopSku", @"count": @"count", @"prices": @"prices", @"warehouse": @"warehouse", @"details": @"details", @"cisList": @"cisList", @"initialCount": @"initialCount", @"bidFee": @"bidFee", @"cofinanceThreshold": @"cofinanceThreshold", @"cofinanceValue": @"cofinanceValue" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"offerName", @"marketSku", @"shopSku", @"count", @"prices", @"warehouse", @"details", @"cisList", @"initialCount", @"bidFee", @"cofinanceThreshold", @"cofinanceValue"];
  return [optionalProperties containsObject:propertyName];
}

@end
