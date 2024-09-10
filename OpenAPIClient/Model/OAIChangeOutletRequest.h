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


#import "OAIOutletAddressDTO.h"
#import "OAIOutletDeliveryRuleDTO.h"
#import "OAIOutletType.h"
#import "OAIOutletVisibilityType.h"
#import "OAIOutletWorkingScheduleDTO.h"
@protocol OAIOutletAddressDTO;
@class OAIOutletAddressDTO;
@protocol OAIOutletDeliveryRuleDTO;
@class OAIOutletDeliveryRuleDTO;
@protocol OAIOutletType;
@class OAIOutletType;
@protocol OAIOutletVisibilityType;
@class OAIOutletVisibilityType;
@protocol OAIOutletWorkingScheduleDTO;
@class OAIOutletWorkingScheduleDTO;



@protocol OAIChangeOutletRequest
@end

@interface OAIChangeOutletRequest : OAIObject

/* Название точки продаж.  
 */
@property(nonatomic) NSString* name;

@property(nonatomic) OAIOutletType* type;
/* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  [optional]
 */
@property(nonatomic) NSString* coords;
/* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  [optional]
 */
@property(nonatomic) NSNumber* isMain;
/* Идентификатор точки продаж, присвоенный магазином. [optional]
 */
@property(nonatomic) NSString* shopOutletCode;

@property(nonatomic) OAIOutletVisibilityType* visibility;

@property(nonatomic) OAIOutletAddressDTO* address;
/* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  
 */
@property(nonatomic) NSArray<NSString*>* phones;

@property(nonatomic) OAIOutletWorkingScheduleDTO* workingSchedule;
/* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  [optional]
 */
@property(nonatomic) NSArray<OAIOutletDeliveryRuleDTO>* deliveryRules;
/* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. [optional]
 */
@property(nonatomic) NSNumber* storagePeriod;

@end
