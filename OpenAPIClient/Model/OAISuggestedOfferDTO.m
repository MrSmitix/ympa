#import "OAISuggestedOfferDTO.h"

@implementation OAISuggestedOfferDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"offerId": @"offerId", @"name": @"name", @"category": @"category", @"vendor": @"vendor", @"barcodes": @"barcodes", @"_description": @"description", @"vendorCode": @"vendorCode", @"basicPrice": @"basicPrice" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"offerId", @"name", @"category", @"vendor", @"barcodes", @"_description", @"vendorCode", @"basicPrice"];
  return [optionalProperties containsObject:propertyName];
}

@end
