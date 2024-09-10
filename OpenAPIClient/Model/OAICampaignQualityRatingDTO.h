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


#import "OAIQualityRatingDTO.h"
@protocol OAIQualityRatingDTO;
@class OAIQualityRatingDTO;



@protocol OAICampaignQualityRatingDTO
@end

@interface OAICampaignQualityRatingDTO : OAIObject

/* Идентификатор магазина. 
 */
@property(nonatomic) NSNumber* campaignId;
/* Список значений индекса качества. 
 */
@property(nonatomic) NSArray<OAIQualityRatingDTO>* ratings;

@end
