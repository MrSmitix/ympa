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
import { WarehouseDTO } from './warehouseDTO';


/**
 * Информация о группе складов.
 */
export interface WarehouseGroupDTO { 
    /**
     * Название группы складов.
     */
    name: string;
    mainWarehouse: WarehouseDTO;
    /**
     * Список складов, входящих в группу.
     */
    warehouses: Array<WarehouseDTO>;
}
