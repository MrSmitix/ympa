#import "OAIOfferCardDTO.h"

@implementation OAIOfferCardDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"offerId": @"offerId", @"mapping": @"mapping", @"parameterValues": @"parameterValues", @"cardStatus": @"cardStatus", @"contentRating": @"contentRating", @"recommendations": @"recommendations", @"errors": @"errors", @"warnings": @"warnings" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"mapping", @"parameterValues", @"cardStatus", @"contentRating", @"recommendations", @"errors", @"warnings"];
  return [optionalProperties containsObject:propertyName];
}

@end
