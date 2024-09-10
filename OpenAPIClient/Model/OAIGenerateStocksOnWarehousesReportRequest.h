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





@protocol OAIGenerateStocksOnWarehousesReportRequest
@end

@interface OAIGenerateStocksOnWarehousesReportRequest : OAIObject

/* Идентификатор магазина. 
 */
@property(nonatomic) NSNumber* campaignId;
/* Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md). [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* warehouseIds;
/* Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день. [optional]
 */
@property(nonatomic) NSDate* reportDate;
/* Фильтр по категориям на Маркете (кроме модели FBY). [optional]
 */
@property(nonatomic) NSArray<NSNumber*>* categoryIds;
/* Фильтр по наличию остатков (кроме модели FBY). [optional]
 */
@property(nonatomic) NSNumber* hasStocks;

@end
