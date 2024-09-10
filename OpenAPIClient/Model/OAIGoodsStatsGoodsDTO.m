#import "OAIGoodsStatsGoodsDTO.h"

@implementation OAIGoodsStatsGoodsDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"shopSku": @"shopSku", @"marketSku": @"marketSku", @"name": @"name", @"price": @"price", @"categoryId": @"categoryId", @"categoryName": @"categoryName", @"weightDimensions": @"weightDimensions", @"warehouses": @"warehouses", @"tariffs": @"tariffs", @"pictures": @"pictures" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"shopSku", @"marketSku", @"name", @"price", @"categoryId", @"categoryName", @"weightDimensions", @"warehouses", @"tariffs", @"pictures"];
  return [optionalProperties containsObject:propertyName];
}

@end
