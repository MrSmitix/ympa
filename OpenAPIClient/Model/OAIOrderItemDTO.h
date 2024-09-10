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


#import "OAIOrderItemDetailDTO.h"
#import "OAIOrderItemInstanceDTO.h"
#import "OAIOrderItemInstanceType.h"
#import "OAIOrderItemPromoDTO.h"
#import "OAIOrderItemSubsidyDTO.h"
#import "OAIOrderVatType.h"
@protocol OAIOrderItemDetailDTO;
@class OAIOrderItemDetailDTO;
@protocol OAIOrderItemInstanceDTO;
@class OAIOrderItemInstanceDTO;
@protocol OAIOrderItemInstanceType;
@class OAIOrderItemInstanceType;
@protocol OAIOrderItemPromoDTO;
@class OAIOrderItemPromoDTO;
@protocol OAIOrderItemSubsidyDTO;
@class OAIOrderItemSubsidyDTO;
@protocol OAIOrderVatType;
@class OAIOrderVatType;



@protocol OAIOrderItemDTO
@end

@interface OAIOrderItemDTO : OAIObject

/* Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа.  [optional]
 */
@property(nonatomic) NSNumber* _id;
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  [optional]
 */
@property(nonatomic) NSString* offerId;
/* Название товара. [optional]
 */
@property(nonatomic) NSString* offerName;
/* Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`).  [optional]
 */
@property(nonatomic) NSNumber* price;
/* Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам.  [optional]
 */
@property(nonatomic) NSNumber* buyerPrice;
/* Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам.  [optional]
 */
@property(nonatomic) NSNumber* buyerPriceBeforeDiscount;
/* {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок.  [optional]
 */
@property(nonatomic) NSNumber* priceBeforeDiscount;
/* Количество единиц товара. [optional]
 */
@property(nonatomic) NSNumber* count;

@property(nonatomic) OAIOrderVatType* vat;
/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  [optional]
 */
@property(nonatomic) NSString* shopSku;
/* {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа.  [optional]
 */
@property(nonatomic) NSNumber* subsidy;
/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ.  [optional]
 */
@property(nonatomic) NSString* partnerWarehouseId;
/* Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям. [optional]
 */
@property(nonatomic) NSArray<OAIOrderItemPromoDTO>* promos;
/* Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует.  [optional]
 */
@property(nonatomic) NSArray<OAIOrderItemInstanceDTO>* instances;
/* Информация об удалении товара из заказа.  [optional]
 */
@property(nonatomic) NSArray<OAIOrderItemDetailDTO>* details;
/* Список субсидий по типам. [optional]
 */
@property(nonatomic) NSArray<OAIOrderItemSubsidyDTO>* subsidies;
/* Список необходимых маркировок товара. [optional]
 */
@property(nonatomic) NSArray<OAIOrderItemInstanceType>* requiredInstanceTypes;

@end
