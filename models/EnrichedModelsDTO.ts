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
import type { EnrichedModelDTO } from './EnrichedModelDTO';
import {
    EnrichedModelDTOFromJSON,
    EnrichedModelDTOFromJSONTyped,
    EnrichedModelDTOToJSON,
} from './EnrichedModelDTO';

/**
 * Список моделей товаров.
 * @export
 * @interface EnrichedModelsDTO
 */
export interface EnrichedModelsDTO {
    /**
     * Список моделей товаров.
     * @type {Array<EnrichedModelDTO>}
     * @memberof EnrichedModelsDTO
     */
    models: Array<EnrichedModelDTO>;
}

/**
 * Check if a given object implements the EnrichedModelsDTO interface.
 */
export function instanceOfEnrichedModelsDTO(value: object): value is EnrichedModelsDTO {
    if (!('models' in value) || value['models'] === undefined) return false;
    return true;
}

export function EnrichedModelsDTOFromJSON(json: any): EnrichedModelsDTO {
    return EnrichedModelsDTOFromJSONTyped(json, false);
}

export function EnrichedModelsDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): EnrichedModelsDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'models': ((json['models'] as Array<any>).map(EnrichedModelDTOFromJSON)),
    };
}

export function EnrichedModelsDTOToJSON(value?: EnrichedModelsDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'models': ((value['models'] as Array<any>).map(EnrichedModelDTOToJSON)),
    };
}

