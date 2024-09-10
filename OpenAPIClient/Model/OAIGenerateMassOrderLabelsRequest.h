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


#import "OAISet.h"
@protocol OAISet;
@class OAISet;



@protocol OAIGenerateMassOrderLabelsRequest
@end

@interface OAIGenerateMassOrderLabelsRequest : OAIObject

/* Идентификатор кабинета. 
 */
@property(nonatomic) NSNumber* businessId;
/* Список идентификаторов заказов. 
 */
@property(nonatomic) OAISet<NSNumber*>* orderIds;

@end
