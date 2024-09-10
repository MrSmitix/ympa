#import "OAIModelOfferDTO.h"

@implementation OAIModelOfferDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"discount": @"discount", @"name": @"name", @"pos": @"pos", @"preDiscountPrice": @"preDiscountPrice", @"price": @"price", @"regionId": @"regionId", @"shippingCost": @"shippingCost", @"shopName": @"shopName", @"shopRating": @"shopRating", @"inStock": @"inStock" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"discount", @"name", @"pos", @"preDiscountPrice", @"price", @"regionId", @"shippingCost", @"shopName", @"shopRating", @"inStock"];
  return [optionalProperties containsObject:propertyName];
}

@end
