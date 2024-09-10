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





@protocol OAIPromoOfferDiscountParamsDTO
@end

@interface OAIPromoOfferDiscountParamsDTO : OAIObject

/* Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  [optional]
 */
@property(nonatomic) NSNumber* price;
/* Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  [optional]
 */
@property(nonatomic) NSNumber* promoPrice;
/* Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  
 */
@property(nonatomic) NSNumber* maxPromoPrice;

@end
