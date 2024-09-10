#import "OAIGetMappingDTO.h"

@implementation OAIGetMappingDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"marketSku": @"marketSku", @"marketSkuName": @"marketSkuName", @"marketModelId": @"marketModelId", @"marketModelName": @"marketModelName", @"marketCategoryId": @"marketCategoryId", @"marketCategoryName": @"marketCategoryName" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"marketSku", @"marketSkuName", @"marketModelId", @"marketModelName", @"marketCategoryId", @"marketCategoryName"];
  return [optionalProperties containsObject:propertyName];
}

@end
