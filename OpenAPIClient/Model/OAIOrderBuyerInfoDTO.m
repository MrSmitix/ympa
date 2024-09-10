#import "OAIOrderBuyerInfoDTO.h"

@implementation OAIOrderBuyerInfoDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"lastName": @"lastName", @"firstName": @"firstName", @"middleName": @"middleName", @"type": @"type", @"phone": @"phone" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"lastName", @"firstName", @"middleName", @"type", @"phone"];
  return [optionalProperties containsObject:propertyName];
}

@end
