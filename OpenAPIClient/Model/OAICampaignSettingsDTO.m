#import "OAICampaignSettingsDTO.h"

@implementation OAICampaignSettingsDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"countryRegion": @"countryRegion", @"shopName": @"shopName", @"showInContext": @"showInContext", @"showInPremium": @"showInPremium", @"useOpenStat": @"useOpenStat", @"localRegion": @"localRegion" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"countryRegion", @"shopName", @"showInContext", @"showInPremium", @"useOpenStat", @"localRegion"];
  return [optionalProperties containsObject:propertyName];
}

@end
