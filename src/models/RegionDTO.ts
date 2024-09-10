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
    RegionType,
    RegionTypeFromJSON,
    RegionTypeToJSON,
} from './';

/**
 * Регион доставки.
 * @export
 * @interface RegionDTO
 */
export interface RegionDTO  {
    /**
     * Идентификатор региона.
     * @type {number}
     * @memberof RegionDTO
     */
    id?: number;
    /**
     * Название региона.
     * @type {string}
     * @memberof RegionDTO
     */
    name: string;
    /**
     * 
     * @type {RegionType}
     * @memberof RegionDTO
     */
    type: RegionType;
    /**
     * 
     * @type {RegionDTO}
     * @memberof RegionDTO
     */
    parent?: RegionDTO;
    /**
     * Дочерние регионы.
     * @type {Array<RegionDTO>}
     * @memberof RegionDTO
     */
    children?: Array<RegionDTO>;
}

export function RegionDTOFromJSON(json: any): RegionDTO {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'name': json['name'],
        'type': RegionTypeFromJSON(json['type']),
        'parent': !exists(json, 'parent') ? undefined : RegionDTOFromJSON(json['parent']),
        'children': !exists(json, 'children') ? undefined : (json['children'] as Array<any>).map(RegionDTOFromJSON),
    };
}

export function RegionDTOToJSON(value?: RegionDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'id': value.id,
        'name': value.name,
        'type': RegionTypeToJSON(value.type),
        'parent': RegionDTOToJSON(value.parent),
        'children': value.children === undefined ? undefined : (value.children as Array<any>).map(RegionDTOToJSON),
    };
}



