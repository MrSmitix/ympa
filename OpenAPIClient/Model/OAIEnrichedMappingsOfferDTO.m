#import "OAIEnrichedMappingsOfferDTO.h"

@implementation OAIEnrichedMappingsOfferDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"name": @"name", @"shopSku": @"shopSku", @"category": @"category", @"vendor": @"vendor", @"vendorCode": @"vendorCode", @"_description": @"description", @"_id": @"id", @"feedId": @"feedId", @"barcodes": @"barcodes", @"urls": @"urls", @"pictures": @"pictures", @"manufacturer": @"manufacturer", @"manufacturerCountries": @"manufacturerCountries", @"minShipment": @"minShipment", @"transportUnitSize": @"transportUnitSize", @"quantumOfSupply": @"quantumOfSupply", @"deliveryDurationDays": @"deliveryDurationDays", @"boxCount": @"boxCount", @"customsCommodityCodes": @"customsCommodityCodes", @"weightDimensions": @"weightDimensions", @"supplyScheduleDays": @"supplyScheduleDays", @"shelfLifeDays": @"shelfLifeDays", @"lifeTimeDays": @"lifeTimeDays", @"guaranteePeriodDays": @"guaranteePeriodDays", @"processingState": @"processingState", @"availability": @"availability", @"shelfLife": @"shelfLife", @"lifeTime": @"lifeTime", @"guaranteePeriod": @"guaranteePeriod", @"certificate": @"certificate", @"price": @"price", @"marketCategoryId": @"marketCategoryId", @"marketCategoryName": @"marketCategoryName", @"marketModelId": @"marketModelId", @"marketModelName": @"marketModelName", @"marketSku": @"marketSku", @"marketSkuName": @"marketSkuName" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"shopSku", @"category", @"vendor", @"vendorCode", @"_description", @"_id", @"feedId", @"barcodes", @"urls", @"pictures", @"manufacturer", @"manufacturerCountries", @"minShipment", @"transportUnitSize", @"quantumOfSupply", @"deliveryDurationDays", @"boxCount", @"customsCommodityCodes", @"weightDimensions", @"supplyScheduleDays", @"shelfLifeDays", @"lifeTimeDays", @"guaranteePeriodDays", @"processingState", @"availability", @"shelfLife", @"lifeTime", @"guaranteePeriod", @"certificate", @"price", @"marketCategoryId", @"marketCategoryName", @"marketModelId", @"marketModelName", @"marketSku", @"marketSkuName"];
  return [optionalProperties containsObject:propertyName];
}

@end
