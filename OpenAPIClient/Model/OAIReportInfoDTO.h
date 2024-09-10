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


#import "OAIReportStatusType.h"
#import "OAIReportSubStatusType.h"
@protocol OAIReportStatusType;
@class OAIReportStatusType;
@protocol OAIReportSubStatusType;
@class OAIReportSubStatusType;



@protocol OAIReportInfoDTO
@end

@interface OAIReportInfoDTO : OAIObject


@property(nonatomic) OAIReportStatusType* status;

@property(nonatomic) OAIReportSubStatusType* subStatus;
/* Дата и время запроса на генерацию. 
 */
@property(nonatomic) NSDate* generationRequestedAt;
/* Дата и время завершения генерации. [optional]
 */
@property(nonatomic) NSDate* generationFinishedAt;
/* Ссылка на готовый отчет. [optional]
 */
@property(nonatomic) NSString* file;
/* Ожидаемая продолжительность генерации в миллисекундах. [optional]
 */
@property(nonatomic) NSNumber* estimatedGenerationTime;

@end
