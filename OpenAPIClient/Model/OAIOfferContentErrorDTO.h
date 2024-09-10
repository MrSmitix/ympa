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


#import "OAIOfferContentErrorType.h"
@protocol OAIOfferContentErrorType;
@class OAIOfferContentErrorType;



@protocol OAIOfferContentErrorDTO
@end

@interface OAIOfferContentErrorDTO : OAIObject


@property(nonatomic) OAIOfferContentErrorType* type;
/* Идентификатор характеристики, с которой связана ошибка. [optional]
 */
@property(nonatomic) NSNumber* parameterId;
/* Текст ошибки. 
 */
@property(nonatomic) NSString* message;

@end
