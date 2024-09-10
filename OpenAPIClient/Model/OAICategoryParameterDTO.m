#import "OAICategoryParameterDTO.h"

@implementation OAICategoryParameterDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"type": @"type", @"unit": @"unit", @"_description": @"description", @"recommendationTypes": @"recommendationTypes", @"required": @"required", @"filtering": @"filtering", @"distinctive": @"distinctive", @"multivalue": @"multivalue", @"allowCustomValues": @"allowCustomValues", @"values": @"values", @"constraints": @"constraints", @"valueRestrictions": @"valueRestrictions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"unit", @"_description", @"recommendationTypes", @"values", @"constraints", @"valueRestrictions"];
  return [optionalProperties containsObject:propertyName];
}

@end
