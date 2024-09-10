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


#import "OAIOutletWorkingScheduleItemDTO.h"
@protocol OAIOutletWorkingScheduleItemDTO;
@class OAIOutletWorkingScheduleItemDTO;



@protocol OAIOutletWorkingScheduleDTO
@end

@interface OAIOutletWorkingScheduleDTO : OAIObject

/* Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников.  [optional]
 */
@property(nonatomic) NSNumber* workInHoliday;
/* Список расписаний работы точки продаж.  
 */
@property(nonatomic) NSArray<OAIOutletWorkingScheduleItemDTO>* scheduleItems;

@end
