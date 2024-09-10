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
import type { ForwardScrollingPagerDTO } from './ForwardScrollingPagerDTO';
import {
    ForwardScrollingPagerDTOFromJSON,
    ForwardScrollingPagerDTOFromJSONTyped,
    ForwardScrollingPagerDTOToJSON,
} from './ForwardScrollingPagerDTO';
import type { ReturnDTO } from './ReturnDTO';
import {
    ReturnDTOFromJSON,
    ReturnDTOFromJSONTyped,
    ReturnDTOToJSON,
} from './ReturnDTO';

/**
 * Возвраты.
 * @export
 * @interface PagedReturnsDTO
 */
export interface PagedReturnsDTO {
    /**
     * 
     * @type {ForwardScrollingPagerDTO}
     * @memberof PagedReturnsDTO
     */
    paging?: ForwardScrollingPagerDTO;
    /**
     * Список возвратов.
     * @type {Array<ReturnDTO>}
     * @memberof PagedReturnsDTO
     */
    returns: Array<ReturnDTO>;
}

/**
 * Check if a given object implements the PagedReturnsDTO interface.
 */
export function instanceOfPagedReturnsDTO(value: object): value is PagedReturnsDTO {
    if (!('returns' in value) || value['returns'] === undefined) return false;
    return true;
}

export function PagedReturnsDTOFromJSON(json: any): PagedReturnsDTO {
    return PagedReturnsDTOFromJSONTyped(json, false);
}

export function PagedReturnsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): PagedReturnsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'paging': json['paging'] == null ? undefined : ForwardScrollingPagerDTOFromJSON(json['paging']),
        'returns': ((json['returns'] as Array<any>).map(ReturnDTOFromJSON)),
    };
}

export function PagedReturnsDTOToJSON(value?: PagedReturnsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'paging': ForwardScrollingPagerDTOToJSON(value['paging']),
        'returns': ((value['returns'] as Array<any>).map(ReturnDTOToJSON)),
    };
}
