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





@protocol OAIModelOfferDTO
@end

@interface OAIModelOfferDTO : OAIObject

/* Скидка на предложение в процентах. [optional]
 */
@property(nonatomic) NSNumber* discount;
/* Наименование предложения. [optional]
 */
@property(nonatomic) NSString* name;
/* Позиция предложения в выдаче Маркета на карточке модели. [optional]
 */
@property(nonatomic) NSNumber* pos;
/* Цена предложения без скидки магазина. [optional]
 */
@property(nonatomic) NSNumber* preDiscountPrice;
/* Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. [optional]
 */
@property(nonatomic) NSNumber* price;
/* Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  [optional]
 */
@property(nonatomic) NSNumber* regionId;
/* Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  [optional]
 */
@property(nonatomic) NSNumber* shippingCost;
/* Название магазина (в том виде, в котором отображается на Маркете). [optional]
 */
@property(nonatomic) NSString* shopName;
/* Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  [optional]
 */
@property(nonatomic) NSNumber* shopRating;
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  [optional]
 */
@property(nonatomic) NSNumber* inStock;

@end
