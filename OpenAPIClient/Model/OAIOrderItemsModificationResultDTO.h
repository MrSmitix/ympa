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


#import "OAIBriefOrderItemDTO.h"
@protocol OAIBriefOrderItemDTO;
@class OAIBriefOrderItemDTO;



@protocol OAIOrderItemsModificationResultDTO
@end

@interface OAIOrderItemsModificationResultDTO : OAIObject

/* Список позиций в заказе, подлежащих маркировке. 
 */
@property(nonatomic) NSArray<OAIBriefOrderItemDTO>* items;

@end
