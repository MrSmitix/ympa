#import "OAIGoodsFeedbackDTO.h"

@implementation OAIGoodsFeedbackDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"feedbackId": @"feedbackId", @"createdAt": @"createdAt", @"needReaction": @"needReaction", @"identifiers": @"identifiers", @"author": @"author", @"_description": @"description", @"media": @"media", @"statistics": @"statistics" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"author", @"_description", @"media", ];
  return [optionalProperties containsObject:propertyName];
}

@end
