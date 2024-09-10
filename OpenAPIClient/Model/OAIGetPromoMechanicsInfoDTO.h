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


#import "OAIGetPromoPromocodeInfoDTO.h"
#import "OAIMechanicsType.h"
@protocol OAIGetPromoPromocodeInfoDTO;
@class OAIGetPromoPromocodeInfoDTO;
@protocol OAIMechanicsType;
@class OAIMechanicsType;



@protocol OAIGetPromoMechanicsInfoDTO
@end

@interface OAIGetPromoMechanicsInfoDTO : OAIObject


@property(nonatomic) OAIMechanicsType* type;

@property(nonatomic) OAIGetPromoPromocodeInfoDTO* promocodeInfo;

@end
