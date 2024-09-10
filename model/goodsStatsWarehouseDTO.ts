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
import { WarehouseStockDTO } from './warehouseStockDTO';


/**
 * Информация о складе.
 */
export interface GoodsStatsWarehouseDTO { 
    /**
     * Идентификатор склада.
     */
    id?: number;
    /**
     * Название склада.
     */
    name?: string;
    /**
     * Информация об остатках товаров на складе.
     */
    stocks: Array<WarehouseStockDTO>;
}
