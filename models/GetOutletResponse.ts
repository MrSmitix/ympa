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
import type { FullOutletDTO } from './FullOutletDTO';
import {
    FullOutletDTOFromJSON,
    FullOutletDTOFromJSONTyped,
    FullOutletDTOToJSON,
} from './FullOutletDTO';

/**
 * Ответ на запрос информации о точке продаж.
 * @export
 * @interface GetOutletResponse
 */
export interface GetOutletResponse {
    /**
     * 
     * @type {FullOutletDTO}
     * @memberof GetOutletResponse
     */
    outlet?: FullOutletDTO;
}

/**
 * Check if a given object implements the GetOutletResponse interface.
 */
export function instanceOfGetOutletResponse(value: object): value is GetOutletResponse {
    return true;
}

export function GetOutletResponseFromJSON(json: any): GetOutletResponse {
    return GetOutletResponseFromJSONTyped(json, false);
}

export function GetOutletResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetOutletResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'outlet': json['outlet'] == null ? undefined : FullOutletDTOFromJSON(json['outlet']),
    };
}

export function GetOutletResponseToJSON(value?: GetOutletResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'outlet': FullOutletDTOToJSON(value['outlet']),
    };
}

