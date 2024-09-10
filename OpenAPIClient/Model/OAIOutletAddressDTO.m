#import "OAIOutletAddressDTO.h"

@implementation OAIOutletAddressDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"regionId": @"regionId", @"street": @"street", @"number": @"number", @"building": @"building", @"estate": @"estate", @"block": @"block", @"additional": @"additional", @"km": @"km", @"city": @"city" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"street", @"number", @"building", @"estate", @"block", @"additional", @"km", @"city"];
  return [optionalProperties containsObject:propertyName];
}

@end
