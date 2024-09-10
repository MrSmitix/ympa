/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { OrdersStatsPriceType } from './OrdersStatsPriceType';
import {
    OrdersStatsPriceTypeFromJSON,
    OrdersStatsPriceTypeFromJSONTyped,
    OrdersStatsPriceTypeToJSON,
} from './OrdersStatsPriceType';

/**
 * Цена или скидки на товар.
 * @export
 * @interface OrdersStatsPriceDTO
 */
export interface OrdersStatsPriceDTO {
    /**
     * 
     * @type {OrdersStatsPriceType}
     * @memberof OrdersStatsPriceDTO
     */
    type?: OrdersStatsPriceType;
    /**
     * Цена или скидка на единицу товара в заказе.
     * Указана в рублях.
     * Точность — два знака после запятой.
     * 
     * @type {number}
     * @memberof OrdersStatsPriceDTO
     */
    costPerItem?: number;
    /**
     * Суммарная цена или скидка на все единицы товара в заказе.
     * Указана в рублях.
     * Точность — два знака после запятой.
     * 
     * @type {number}
     * @memberof OrdersStatsPriceDTO
     */
    total?: number;
}



/**
 * Check if a given object implements the OrdersStatsPriceDTO interface.
 */
export function instanceOfOrdersStatsPriceDTO(value: object): value is OrdersStatsPriceDTO {
    return true;
}

export function OrdersStatsPriceDTOFromJSON(json: any): OrdersStatsPriceDTO {
    return OrdersStatsPriceDTOFromJSONTyped(json, false);
}

export function OrdersStatsPriceDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OrdersStatsPriceDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : OrdersStatsPriceTypeFromJSON(json['type']),
        'costPerItem': json['costPerItem'] == null ? undefined : json['costPerItem'],
        'total': json['total'] == null ? undefined : json['total'],
    };
}

export function OrdersStatsPriceDTOToJSON(value?: OrdersStatsPriceDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': OrdersStatsPriceTypeToJSON(value['type']),
        'costPerItem': value['costPerItem'],
        'total': value['total'],
    };
}
