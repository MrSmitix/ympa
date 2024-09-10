#import "OAIOrderItemPromoDTO.h"

@implementation OAIOrderItemPromoDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"type": @"type", @"discount": @"discount", @"subsidy": @"subsidy", @"shopPromoId": @"shopPromoId", @"marketPromoId": @"marketPromoId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"discount", @"subsidy", @"shopPromoId", @"marketPromoId"];
  return [optionalProperties containsObject:propertyName];
}

@end
