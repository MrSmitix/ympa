#import "OAIBaseOfferDTO.h"

@implementation OAIBaseOfferDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"offerId": @"offerId", @"name": @"name", @"marketCategoryId": @"marketCategoryId", @"category": @"category", @"pictures": @"pictures", @"videos": @"videos", @"manuals": @"manuals", @"vendor": @"vendor", @"barcodes": @"barcodes", @"_description": @"description", @"manufacturerCountries": @"manufacturerCountries", @"weightDimensions": @"weightDimensions", @"vendorCode": @"vendorCode", @"tags": @"tags", @"shelfLife": @"shelfLife", @"lifeTime": @"lifeTime", @"guaranteePeriod": @"guaranteePeriod", @"customsCommodityCode": @"customsCommodityCode", @"certificates": @"certificates", @"boxCount": @"boxCount", @"condition": @"condition", @"type": @"type", @"downloadable": @"downloadable", @"adult": @"adult", @"age": @"age", @"params": @"params" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"marketCategoryId", @"category", @"pictures", @"videos", @"manuals", @"vendor", @"barcodes", @"_description", @"manufacturerCountries", @"weightDimensions", @"vendorCode", @"tags", @"shelfLife", @"lifeTime", @"guaranteePeriod", @"customsCommodityCode", @"certificates", @"boxCount", @"condition", @"type", @"downloadable", @"adult", @"age", @"params"];
  return [optionalProperties containsObject:propertyName];
}

@end
