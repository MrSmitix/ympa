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





@protocol OAIDeletePromoOffersRequest
@end

@interface OAIDeletePromoOffersRequest : OAIObject

/* Идентификатор акции. 
 */
@property(nonatomic) NSString* promoId;
/* Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`. [optional]
 */
@property(nonatomic) NSNumber* deleteAllOffers;
/* Товары, которые нужно убрать из акции. [optional]
 */
@property(nonatomic) NSArray<NSString*>* offerIds;

@end
