#import "OAIFeedbackDTO.h"

@implementation OAIFeedbackDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"createdAt": @"createdAt", @"text": @"text", @"state": @"state", @"author": @"author", @"pro": @"pro", @"contra": @"contra", @"comments": @"comments", @"shop": @"shop", @"resolved": @"resolved", @"verified": @"verified", @"recommend": @"recommend", @"grades": @"grades", @"order": @"order" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"createdAt", @"text", @"state", @"author", @"pro", @"contra", @"shop", @"resolved", @"verified", @"recommend", @"grades", @"order"];
  return [optionalProperties containsObject:propertyName];
}

@end
