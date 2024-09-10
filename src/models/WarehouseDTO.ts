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
    WarehouseAddressDTO,
    WarehouseAddressDTOFromJSON,
    WarehouseAddressDTOToJSON,
} from './';

/**
 * Информация о складе.
 * @export
 * @interface WarehouseDTO
 */
export interface WarehouseDTO  {
    /**
     * Идентификатор склада.
     * @type {number}
     * @memberof WarehouseDTO
     */
    id: number;
    /**
     * Название склада.
     * @type {string}
     * @memberof WarehouseDTO
     */
    name: string;
    /**
     * Идентификатор кампании в API и идентификатор магазина.
     * @type {number}
     * @memberof WarehouseDTO
     */
    campaignId: number;
    /**
     * Возможна ли доставка по модели Экспресс.
     * @type {boolean}
     * @memberof WarehouseDTO
     */
    express: boolean;
    /**
     * 
     * @type {WarehouseAddressDTO}
     * @memberof WarehouseDTO
     */
    address?: WarehouseAddressDTO;
}

export function WarehouseDTOFromJSON(json: any): WarehouseDTO {
    return {
        'id': json['id'],
        'name': json['name'],
        'campaignId': json['campaignId'],
        'express': json['express'],
        'address': !exists(json, 'address') ? undefined : WarehouseAddressDTOFromJSON(json['address']),
    };
}

export function WarehouseDTOToJSON(value?: WarehouseDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'campaignId': value.campaignId,
        'express': value.express,
        'address': WarehouseAddressDTOToJSON(value.address),
    };
}


