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


#import "OAILogisticPickupPointDTO.h"
#import "OAIRecipientType.h"
#import "OAIRefundStatusType.h"
#import "OAIReturnItemDTO.h"
#import "OAIReturnShipmentStatusType.h"
#import "OAIReturnType.h"
@protocol OAILogisticPickupPointDTO;
@class OAILogisticPickupPointDTO;
@protocol OAIRecipientType;
@class OAIRecipientType;
@protocol OAIRefundStatusType;
@class OAIRefundStatusType;
@protocol OAIReturnItemDTO;
@class OAIReturnItemDTO;
@protocol OAIReturnShipmentStatusType;
@class OAIReturnShipmentStatusType;
@protocol OAIReturnType;
@class OAIReturnType;



@protocol OAIReturnDTO
@end

@interface OAIReturnDTO : OAIObject

/* Идентификатор возврата. [optional]
 */
@property(nonatomic) NSNumber* _id;
/* Номер заказа. [optional]
 */
@property(nonatomic) NSNumber* orderId;
/* Дата создания возврата клиентом. [optional]
 */
@property(nonatomic) NSDate* creationDate;
/* Дата обновления возврата. [optional]
 */
@property(nonatomic) NSDate* updateDate;

@property(nonatomic) OAIRefundStatusType* refundStatus;

@property(nonatomic) OAILogisticPickupPointDTO* logisticPickupPoint;

@property(nonatomic) OAIRecipientType* shipmentRecipientType;

@property(nonatomic) OAIReturnShipmentStatusType* shipmentStatus;
/* Сумма возврата. [optional]
 */
@property(nonatomic) NSNumber* refundAmount;
/* Список товаров в возврате. 
 */
@property(nonatomic) NSArray<OAIReturnItemDTO>* items;

@property(nonatomic) OAIReturnType* returnType;
/* Используется ли опция **Быстрый возврат денег за дешевый брак**.  [optional]
 */
@property(nonatomic) NSNumber* fastReturn;

@end
