#import "OAIReturnDecisionDTO.h"

@implementation OAIReturnDecisionDTO

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"returnItemId": @"returnItemId", @"count": @"count", @"comment": @"comment", @"reasonType": @"reasonType", @"subreasonType": @"subreasonType", @"decisionType": @"decisionType", @"refundAmount": @"refundAmount", @"partnerCompensation": @"partnerCompensation", @"images": @"images" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"returnItemId", @"count", @"comment", @"reasonType", @"subreasonType", @"decisionType", @"refundAmount", @"partnerCompensation", @"images"];
  return [optionalProperties containsObject:propertyName];
}

@end
