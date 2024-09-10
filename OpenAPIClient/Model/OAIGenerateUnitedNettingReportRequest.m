#import "OAIGenerateUnitedNettingReportRequest.h"

@implementation OAIGenerateUnitedNettingReportRequest

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"businessId": @"businessId", @"dateTimeFrom": @"dateTimeFrom", @"dateTimeTo": @"dateTimeTo", @"dateFrom": @"dateFrom", @"dateTo": @"dateTo", @"bankOrderId": @"bankOrderId", @"bankOrderDateTime": @"bankOrderDateTime", @"placementPrograms": @"placementPrograms", @"inns": @"inns", @"campaignIds": @"campaignIds" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"dateTimeFrom", @"dateTimeTo", @"dateFrom", @"dateTo", @"bankOrderId", @"bankOrderDateTime", @"placementPrograms", @"inns", @"campaignIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
