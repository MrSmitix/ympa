// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    FulfillmentWarehouseDTO,
    FulfillmentWarehouseDTOFromJSON,
    FulfillmentWarehouseDTOToJSON,
} from './';

/**
 * Список складов Маркета (FBY).
 * @export
 * @interface FulfillmentWarehousesDTO
 */
export interface FulfillmentWarehousesDTO  {
    /**
     * Список складов Маркета (FBY).
     * @type {Array<FulfillmentWarehouseDTO>}
     * @memberof FulfillmentWarehousesDTO
     */
    warehouses: Array<FulfillmentWarehouseDTO>;
}

export function FulfillmentWarehousesDTOFromJSON(json: any): FulfillmentWarehousesDTO {
    return {
        'warehouses': (json['warehouses'] as Array<any>).map(FulfillmentWarehouseDTOFromJSON),
    };
}

export function FulfillmentWarehousesDTOToJSON(value?: FulfillmentWarehousesDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'warehouses': (value.warehouses as Array<any>).map(FulfillmentWarehouseDTOToJSON),
    };
}


