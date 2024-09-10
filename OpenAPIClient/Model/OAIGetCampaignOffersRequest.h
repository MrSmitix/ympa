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


#import "OAIOfferCampaignStatusType.h"
@protocol OAIOfferCampaignStatusType;
@class OAIOfferCampaignStatusType;



@protocol OAIGetCampaignOffersRequest
@end

@interface OAIGetCampaignOffersRequest : OAIObject

/* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}     [optional]
 */
@property(nonatomic) NSArray<NSString*>* offerIds;
/* Фильтр по статусам товаров.  [optional]
 */
@property(nonatomic) NSArray<OAIOfferCampaignStatusType>* statuses;
/* Фильтр по категориям на Маркете. [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* categoryIds;
/* Фильтр по брендам. [optional]
 */
@property(nonatomic) NSArray<NSString*>* vendorNames;
/* Фильтр по тегам. [optional]
 */
@property(nonatomic) NSArray<NSString*>* tags;

@end
