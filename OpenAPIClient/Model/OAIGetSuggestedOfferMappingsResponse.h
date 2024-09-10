#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIApiResponseStatusType.h"
#import "OAIGetSuggestedOfferMappingsResultDTO.h"
@protocol OAIApiResponseStatusType;
@class OAIApiResponseStatusType;
@protocol OAIGetSuggestedOfferMappingsResultDTO;
@class OAIGetSuggestedOfferMappingsResultDTO;



@protocol OAIGetSuggestedOfferMappingsResponse
@end

@interface OAIGetSuggestedOfferMappingsResponse : OAIObject


@property(nonatomic) OAIApiResponseStatusType* status;

@property(nonatomic) OAIGetSuggestedOfferMappingsResultDTO* result;

@end
