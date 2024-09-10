#import "OAIOrderDeliveryDatesDTO.h"

@implementation OAIOrderDeliveryDatesDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fromDate": @"fromDate", @"toDate": @"toDate", @"fromTime": @"fromTime", @"toTime": @"toTime", @"realDeliveryDate": @"realDeliveryDate" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fromDate", @"toDate", @"fromTime", @"toTime", @"realDeliveryDate"];
  return [optionalProperties containsObject:propertyName];
}

@end
