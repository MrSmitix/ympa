#import "OAIOfferDTO.h"

@implementation OAIOfferDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"price": @"price", @"feedId": @"feedId", @"_id": @"id", @"shopCategoryId": @"shopCategoryId", @"marketCategoryId": @"marketCategoryId", @"preDiscountPrice": @"preDiscountPrice", @"discount": @"discount", @"cutPrice": @"cutPrice", @"url": @"url", @"modelId": @"modelId", @"name": @"name", @"currency": @"currency", @"bid": @"bid", @"cbid": @"cbid", @"fee": @"fee", @"blocked": @"blocked" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"price", @"feedId", @"_id", @"shopCategoryId", @"marketCategoryId", @"preDiscountPrice", @"discount", @"cutPrice", @"url", @"name", @"currency", @"bid", @"cbid", @"fee", @"blocked"];
  return [optionalProperties containsObject:propertyName];
}

@end
