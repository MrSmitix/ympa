#import "OAIOrderItemDTO.h"

@implementation OAIOrderItemDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"offerId": @"offerId", @"offerName": @"offerName", @"price": @"price", @"buyerPrice": @"buyerPrice", @"buyerPriceBeforeDiscount": @"buyerPriceBeforeDiscount", @"priceBeforeDiscount": @"priceBeforeDiscount", @"count": @"count", @"vat": @"vat", @"shopSku": @"shopSku", @"subsidy": @"subsidy", @"partnerWarehouseId": @"partnerWarehouseId", @"promos": @"promos", @"instances": @"instances", @"details": @"details", @"subsidies": @"subsidies", @"requiredInstanceTypes": @"requiredInstanceTypes" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"offerId", @"offerName", @"price", @"buyerPrice", @"buyerPriceBeforeDiscount", @"priceBeforeDiscount", @"count", @"vat", @"shopSku", @"subsidy", @"partnerWarehouseId", @"promos", @"instances", @"details", @"subsidies", @"requiredInstanceTypes"];
  return [optionalProperties containsObject:propertyName];
}

@end
