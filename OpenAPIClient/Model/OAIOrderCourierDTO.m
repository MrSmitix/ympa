#import "OAIOrderCourierDTO.h"

@implementation OAIOrderCourierDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fullName": @"fullName", @"phone": @"phone", @"phoneExtension": @"phoneExtension", @"vehicleNumber": @"vehicleNumber", @"vehicleDescription": @"vehicleDescription" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fullName", @"phone", @"phoneExtension", @"vehicleNumber", @"vehicleDescription"];
  return [optionalProperties containsObject:propertyName];
}

@end
