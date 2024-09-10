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
import type { PriceQuarantineVerdictParamNameType } from './PriceQuarantineVerdictParamNameType';
import {
    PriceQuarantineVerdictParamNameTypeFromJSON,
    PriceQuarantineVerdictParamNameTypeFromJSONTyped,
    PriceQuarantineVerdictParamNameTypeToJSON,
} from './PriceQuarantineVerdictParamNameType';

/**
 * Параметр карантина.
 * @export
 * @interface PriceQuarantineVerdictParameterDTO
 */
export interface PriceQuarantineVerdictParameterDTO {
    /**
     * 
     * @type {PriceQuarantineVerdictParamNameType}
     * @memberof PriceQuarantineVerdictParameterDTO
     */
    name: PriceQuarantineVerdictParamNameType;
    /**
     * Значение параметра.
     * @type {string}
     * @memberof PriceQuarantineVerdictParameterDTO
     */
    value: string;
}



/**
 * Check if a given object implements the PriceQuarantineVerdictParameterDTO interface.
 */
export function instanceOfPriceQuarantineVerdictParameterDTO(value: object): value is PriceQuarantineVerdictParameterDTO {
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('value' in value) || value['value'] === undefined) return false;
    return true;
}

export function PriceQuarantineVerdictParameterDTOFromJSON(json: any): PriceQuarantineVerdictParameterDTO {
    return PriceQuarantineVerdictParameterDTOFromJSONTyped(json, false);
}

export function PriceQuarantineVerdictParameterDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): PriceQuarantineVerdictParameterDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'name': PriceQuarantineVerdictParamNameTypeFromJSON(json['name']),
        'value': json['value'],
    };
}

export function PriceQuarantineVerdictParameterDTOToJSON(value?: PriceQuarantineVerdictParameterDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': PriceQuarantineVerdictParamNameTypeToJSON(value['name']),
        'value': value['value'],
    };
}

