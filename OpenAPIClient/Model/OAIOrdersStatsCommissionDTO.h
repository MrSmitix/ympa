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


#import "OAIOrdersStatsCommissionType.h"
@protocol OAIOrdersStatsCommissionType;
@class OAIOrdersStatsCommissionType;



@protocol OAIOrdersStatsCommissionDTO
@end

@interface OAIOrdersStatsCommissionDTO : OAIObject


@property(nonatomic) OAIOrdersStatsCommissionType* type;
/* Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  [optional]
 */
@property(nonatomic) NSNumber* actual;

@end
