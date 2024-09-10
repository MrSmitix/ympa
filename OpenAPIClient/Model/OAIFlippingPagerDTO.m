#import "OAIFlippingPagerDTO.h"

@implementation OAIFlippingPagerDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"total": @"total", @"from": @"from", @"to": @"to", @"currentPage": @"currentPage", @"pagesCount": @"pagesCount", @"pageSize": @"pageSize" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"total", @"from", @"to", @"currentPage", @"pagesCount", @"pageSize"];
  return [optionalProperties containsObject:propertyName];
}

@end
