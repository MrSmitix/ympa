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


#import "OAIGetMappingDTO.h"
#import "OAIOfferCardRecommendationDTO.h"
#import "OAIOfferCardStatusType.h"
#import "OAIOfferErrorDTO.h"
#import "OAIParameterValueDTO.h"
@protocol OAIGetMappingDTO;
@class OAIGetMappingDTO;
@protocol OAIOfferCardRecommendationDTO;
@class OAIOfferCardRecommendationDTO;
@protocol OAIOfferCardStatusType;
@class OAIOfferCardStatusType;
@protocol OAIOfferErrorDTO;
@class OAIOfferErrorDTO;
@protocol OAIParameterValueDTO;
@class OAIParameterValueDTO;



@protocol OAIOfferCardDTO
@end

@interface OAIOfferCardDTO : OAIObject

/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  
 */
@property(nonatomic) NSString* offerId;

@property(nonatomic) OAIGetMappingDTO* mapping;
/* Список характеристик с их значениями.  [optional]
 */
@property(nonatomic) NSArray<OAIParameterValueDTO>* parameterValues;

@property(nonatomic) OAIOfferCardStatusType* cardStatus;
/* Процент заполненности карточки. [optional]
 */
@property(nonatomic) NSNumber* contentRating;
/* Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  [optional]
 */
@property(nonatomic) NSArray<OAIOfferCardRecommendationDTO>* recommendations;
/* Ошибки в контенте, препятствующие размещению товара на витрине. [optional]
 */
@property(nonatomic) NSArray<OAIOfferErrorDTO>* errors;
/* Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. [optional]
 */
@property(nonatomic) NSArray<OAIOfferErrorDTO>* warnings;

@end
