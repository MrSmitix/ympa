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
import type { AgeUnitType } from './AgeUnitType';
import {
    AgeUnitTypeFromJSON,
    AgeUnitTypeFromJSONTyped,
    AgeUnitTypeToJSON,
} from './AgeUnitType';

/**
 * Возраст в заданных единицах измерения.
 * @export
 * @interface AgeDTO
 */
export interface AgeDTO {
    /**
     * Значение.
     * 
     * @type {number}
     * @memberof AgeDTO
     */
    value: number;
    /**
     * 
     * @type {AgeUnitType}
     * @memberof AgeDTO
     */
    ageUnit: AgeUnitType;
}



/**
 * Check if a given object implements the AgeDTO interface.
 */
export function instanceOfAgeDTO(value: object): value is AgeDTO {
    if (!('value' in value) || value['value'] === undefined) return false;
    if (!('ageUnit' in value) || value['ageUnit'] === undefined) return false;
    return true;
}

export function AgeDTOFromJSON(json: any): AgeDTO {
    return AgeDTOFromJSONTyped(json, false);
}

export function AgeDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): AgeDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'value': json['value'],
        'ageUnit': AgeUnitTypeFromJSON(json['ageUnit']),
    };
}

export function AgeDTOToJSON(value?: AgeDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'value': value['value'],
        'ageUnit': AgeUnitTypeToJSON(value['ageUnit']),
    };
}
