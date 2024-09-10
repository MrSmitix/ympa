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





@protocol OAIFeedbackFactorDTO
@end

@interface OAIFeedbackFactorDTO : OAIObject

/* Идентификатор параметра. [optional]
 */
@property(nonatomic) NSNumber* _id;
/* Название параметра. Например, `Скорость обработки заказа`. [optional]
 */
@property(nonatomic) NSString* title;
/* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. [optional]
 */
@property(nonatomic) NSString* _description;
/* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  [optional]
 */
@property(nonatomic) NSNumber* value;

@end
