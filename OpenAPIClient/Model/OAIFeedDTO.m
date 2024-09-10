#import "OAIFeedDTO.h"

@implementation OAIFeedDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"login": @"login", @"name": @"name", @"password": @"password", @"uploadDate": @"uploadDate", @"url": @"url", @"content": @"content", @"download": @"download", @"placement": @"placement", @"publication": @"publication" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"login", @"name", @"password", @"uploadDate", @"url", @"content", @"download", @"placement", @"publication"];
  return [optionalProperties containsObject:propertyName];
}

@end
