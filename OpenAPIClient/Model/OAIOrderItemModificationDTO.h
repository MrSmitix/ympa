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


#import "OAIBriefOrderItemInstanceDTO.h"
@protocol OAIBriefOrderItemInstanceDTO;
@class OAIBriefOrderItemInstanceDTO;



@protocol OAIOrderItemModificationDTO
@end

@interface OAIOrderItemModificationDTO : OAIObject

/* Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  
 */
@property(nonatomic) NSNumber* _id;
/* Новое количество товара. 
 */
@property(nonatomic) NSNumber* count;
/* Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  [optional]
 */
@property(nonatomic) NSArray<OAIBriefOrderItemInstanceDTO>* instances;

@end
