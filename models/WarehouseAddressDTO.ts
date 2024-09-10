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
import type { GpsDTO } from './GpsDTO';
import {
    GpsDTOFromJSON,
    GpsDTOFromJSONTyped,
    GpsDTOToJSON,
} from './GpsDTO';

/**
 * Адрес склада.
 * @export
 * @interface WarehouseAddressDTO
 */
export interface WarehouseAddressDTO {
    /**
     * Город.
     * @type {string}
     * @memberof WarehouseAddressDTO
     */
    city: string;
    /**
     * Улица.
     * @type {string}
     * @memberof WarehouseAddressDTO
     */
    street?: string;
    /**
     * Номер дома.
     * @type {string}
     * @memberof WarehouseAddressDTO
     */
    number?: string;
    /**
     * Номер строения.
     * @type {string}
     * @memberof WarehouseAddressDTO
     */
    building?: string;
    /**
     * Номер корпуса.
     * @type {string}
     * @memberof WarehouseAddressDTO
     */
    block?: string;
    /**
     * 
     * @type {GpsDTO}
     * @memberof WarehouseAddressDTO
     */
    gps: GpsDTO;
}

/**
 * Check if a given object implements the WarehouseAddressDTO interface.
 */
export function instanceOfWarehouseAddressDTO(value: object): value is WarehouseAddressDTO {
    if (!('city' in value) || value['city'] === undefined) return false;
    if (!('gps' in value) || value['gps'] === undefined) return false;
    return true;
}

export function WarehouseAddressDTOFromJSON(json: any): WarehouseAddressDTO {
    return WarehouseAddressDTOFromJSONTyped(json, false);
}

export function WarehouseAddressDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): WarehouseAddressDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'city': json['city'],
        'street': json['street'] == null ? undefined : json['street'],
        'number': json['number'] == null ? undefined : json['number'],
        'building': json['building'] == null ? undefined : json['building'],
        'block': json['block'] == null ? undefined : json['block'],
        'gps': GpsDTOFromJSON(json['gps']),
    };
}

export function WarehouseAddressDTOToJSON(value?: WarehouseAddressDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'city': value['city'],
        'street': value['street'],
        'number': value['number'],
        'building': value['building'],
        'block': value['block'],
        'gps': GpsDTOToJSON(value['gps']),
    };
}
