#import "OAIBriefOrderItemDTO.h"

@implementation OAIBriefOrderItemDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"vat": @"vat", @"count": @"count", @"price": @"price", @"offerName": @"offerName", @"offerId": @"offerId", @"instances": @"instances" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"vat", @"count", @"price", @"offerName", @"offerId", @"instances"];
  return [optionalProperties containsObject:propertyName];
}

@end
