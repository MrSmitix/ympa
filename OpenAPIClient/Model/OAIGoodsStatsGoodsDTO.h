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


#import "OAIGoodsStatsWarehouseDTO.h"
#import "OAIGoodsStatsWeightDimensionsDTO.h"
#import "OAITariffDTO.h"
@protocol OAIGoodsStatsWarehouseDTO;
@class OAIGoodsStatsWarehouseDTO;
@protocol OAIGoodsStatsWeightDimensionsDTO;
@class OAIGoodsStatsWeightDimensionsDTO;
@protocol OAITariffDTO;
@class OAITariffDTO;



@protocol OAIGoodsStatsGoodsDTO
@end

@interface OAIGoodsStatsGoodsDTO : OAIObject

/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  [optional]
 */
@property(nonatomic) NSString* shopSku;
/* SKU на Маркете. [optional]
 */
@property(nonatomic) NSNumber* marketSku;
/* Название товара. [optional]
 */
@property(nonatomic) NSString* name;
/* Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/). [optional]
 */
@property(nonatomic) NSNumber* price;
/* Идентификатор категории товара на Маркете. [optional]
 */
@property(nonatomic) NSNumber* categoryId;
/* Название категории товара на Маркете. [optional]
 */
@property(nonatomic) NSString* categoryName;

@property(nonatomic) OAIGoodsStatsWeightDimensionsDTO* weightDimensions;
/* Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе.  [optional]
 */
@property(nonatomic) NSArray<OAIGoodsStatsWarehouseDTO>* warehouses;
/* Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  [optional]
 */
@property(nonatomic) NSArray<OAITariffDTO>* tariffs;
/* Ссылки (URL) изображений товара в хорошем качестве. [optional]
 */
@property(nonatomic) NSArray<NSString*>* pictures;

@end
