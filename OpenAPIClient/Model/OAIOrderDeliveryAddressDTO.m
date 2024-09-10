#import "OAIOrderDeliveryAddressDTO.h"

@implementation OAIOrderDeliveryAddressDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"country": @"country", @"postcode": @"postcode", @"city": @"city", @"district": @"district", @"subway": @"subway", @"street": @"street", @"house": @"house", @"block": @"block", @"entrance": @"entrance", @"entryphone": @"entryphone", @"floor": @"floor", @"apartment": @"apartment", @"phone": @"phone", @"recipient": @"recipient", @"gps": @"gps" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"country", @"postcode", @"city", @"district", @"subway", @"street", @"house", @"block", @"entrance", @"entryphone", @"floor", @"apartment", @"phone", @"recipient", @"gps"];
  return [optionalProperties containsObject:propertyName];
}

@end
