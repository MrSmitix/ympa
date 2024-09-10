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


#import "OAIOfferMappingErrorDTO.h"
@protocol OAIOfferMappingErrorDTO;
@class OAIOfferMappingErrorDTO;



@protocol OAIUpdateOfferMappingResultDTO
@end

@interface OAIUpdateOfferMappingResultDTO : OAIObject

/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  
 */
@property(nonatomic) NSString* offerId;
/* Ошибки — информация в каталоге не обновится. [optional]
 */
@property(nonatomic) NSArray<OAIOfferMappingErrorDTO>* errors;
/* Предупреждения — информация в каталоге обновится. [optional]
 */
@property(nonatomic) NSArray<OAIOfferMappingErrorDTO>* warnings;

@end
