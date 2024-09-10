#import "OAIGenerateStocksOnWarehousesReportRequest.h"

@implementation OAIGenerateStocksOnWarehousesReportRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"campaignId": @"campaignId", @"warehouseIds": @"warehouseIds", @"reportDate": @"reportDate", @"categoryIds": @"categoryIds", @"hasStocks": @"hasStocks" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"warehouseIds", @"reportDate", @"categoryIds", @"hasStocks"];
  return [optionalProperties containsObject:propertyName];
}

@end
