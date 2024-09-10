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
import type { CalculateTariffsParametersDTO } from './CalculateTariffsParametersDTO';
import {
    CalculateTariffsParametersDTOFromJSON,
    CalculateTariffsParametersDTOFromJSONTyped,
    CalculateTariffsParametersDTOToJSON,
} from './CalculateTariffsParametersDTO';
import type { CalculateTariffsOfferDTO } from './CalculateTariffsOfferDTO';
import {
    CalculateTariffsOfferDTOFromJSON,
    CalculateTariffsOfferDTOFromJSONTyped,
    CalculateTariffsOfferDTOToJSON,
} from './CalculateTariffsOfferDTO';

/**
 * 
 * @export
 * @interface CalculateTariffsRequest
 */
export interface CalculateTariffsRequest {
    /**
     * 
     * @type {CalculateTariffsParametersDTO}
     * @memberof CalculateTariffsRequest
     */
    parameters: CalculateTariffsParametersDTO;
    /**
     * Товары, для которых нужно рассчитать стоимость услуг.
     * @type {Array<CalculateTariffsOfferDTO>}
     * @memberof CalculateTariffsRequest
     */
    offers: Array<CalculateTariffsOfferDTO>;
}

/**
 * Check if a given object implements the CalculateTariffsRequest interface.
 */
export function instanceOfCalculateTariffsRequest(value: object): value is CalculateTariffsRequest {
    if (!('parameters' in value) || value['parameters'] === undefined) return false;
    if (!('offers' in value) || value['offers'] === undefined) return false;
    return true;
}

export function CalculateTariffsRequestFromJSON(json: any): CalculateTariffsRequest {
    return CalculateTariffsRequestFromJSONTyped(json, false);
}

export function CalculateTariffsRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CalculateTariffsRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'parameters': CalculateTariffsParametersDTOFromJSON(json['parameters']),
        'offers': ((json['offers'] as Array<any>).map(CalculateTariffsOfferDTOFromJSON)),
    };
}

export function CalculateTariffsRequestToJSON(value?: CalculateTariffsRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'parameters': CalculateTariffsParametersDTOToJSON(value['parameters']),
        'offers': ((value['offers'] as Array<any>).map(CalculateTariffsOfferDTOToJSON)),
    };
}
