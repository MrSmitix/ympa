#import "OAIBriefOrderItemInstanceDTO.h"

@implementation OAIBriefOrderItemInstanceDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cis": @"cis", @"uin": @"uin", @"rnpt": @"rnpt", @"gtd": @"gtd" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cis", @"uin", @"rnpt", @"gtd"];
  return [optionalProperties containsObject:propertyName];
}

@end
