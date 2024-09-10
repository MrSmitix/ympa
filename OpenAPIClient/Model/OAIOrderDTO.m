#import "OAIOrderDTO.h"

@implementation OAIOrderDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"status": @"status", @"substatus": @"substatus", @"creationDate": @"creationDate", @"updatedAt": @"updatedAt", @"currency": @"currency", @"itemsTotal": @"itemsTotal", @"deliveryTotal": @"deliveryTotal", @"buyerItemsTotal": @"buyerItemsTotal", @"buyerTotal": @"buyerTotal", @"buyerItemsTotalBeforeDiscount": @"buyerItemsTotalBeforeDiscount", @"buyerTotalBeforeDiscount": @"buyerTotalBeforeDiscount", @"paymentType": @"paymentType", @"paymentMethod": @"paymentMethod", @"fake": @"fake", @"items": @"items", @"subsidies": @"subsidies", @"delivery": @"delivery", @"buyer": @"buyer", @"notes": @"notes", @"taxSystem": @"taxSystem", @"cancelRequested": @"cancelRequested", @"expiryDate": @"expiryDate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"status", @"substatus", @"creationDate", @"updatedAt", @"currency", @"itemsTotal", @"deliveryTotal", @"buyerItemsTotal", @"buyerTotal", @"buyerItemsTotalBeforeDiscount", @"buyerTotalBeforeDiscount", @"paymentType", @"paymentMethod", @"fake", @"subsidies", @"delivery", @"buyer", @"notes", @"taxSystem", @"cancelRequested", @"expiryDate"];
  return [optionalProperties containsObject:propertyName];
}

@end
