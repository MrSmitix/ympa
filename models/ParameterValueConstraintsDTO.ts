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
/**
 * Ограничения на значения характеристик.
 * @export
 * @interface ParameterValueConstraintsDTO
 */
export interface ParameterValueConstraintsDTO {
    /**
     * Минимальное число.
     * @type {number}
     * @memberof ParameterValueConstraintsDTO
     */
    minValue?: number;
    /**
     * Максимальное число.
     * @type {number}
     * @memberof ParameterValueConstraintsDTO
     */
    maxValue?: number;
    /**
     * Максимальная длина текста.
     * @type {number}
     * @memberof ParameterValueConstraintsDTO
     */
    maxLength?: number;
}

/**
 * Check if a given object implements the ParameterValueConstraintsDTO interface.
 */
export function instanceOfParameterValueConstraintsDTO(value: object): value is ParameterValueConstraintsDTO {
    return true;
}

export function ParameterValueConstraintsDTOFromJSON(json: any): ParameterValueConstraintsDTO {
    return ParameterValueConstraintsDTOFromJSONTyped(json, false);
}

export function ParameterValueConstraintsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ParameterValueConstraintsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'minValue': json['minValue'] == null ? undefined : json['minValue'],
        'maxValue': json['maxValue'] == null ? undefined : json['maxValue'],
        'maxLength': json['maxLength'] == null ? undefined : json['maxLength'],
    };
}

export function ParameterValueConstraintsDTOToJSON(value?: ParameterValueConstraintsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'minValue': value['minValue'],
        'maxValue': value['maxValue'],
        'maxLength': value['maxLength'],
    };
}
