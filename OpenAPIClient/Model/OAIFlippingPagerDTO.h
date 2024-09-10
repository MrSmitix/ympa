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





@protocol OAIFlippingPagerDTO
@end

@interface OAIFlippingPagerDTO : OAIObject

/* Сколько всего найдено элементов. [optional]
 */
@property(nonatomic) NSNumber* total;
/* Начальный номер найденного элемента на странице. [optional]
 */
@property(nonatomic) NSNumber* from;
/* Конечный номер найденного элемента на странице. [optional]
 */
@property(nonatomic) NSNumber* to;
/* Текущая страница. [optional]
 */
@property(nonatomic) NSNumber* currentPage;
/* Общее количество страниц. [optional]
 */
@property(nonatomic) NSNumber* pagesCount;
/* Размер страницы. [optional]
 */
@property(nonatomic) NSNumber* pageSize;

@end
