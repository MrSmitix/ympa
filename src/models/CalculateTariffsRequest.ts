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
    CalculateTariffsOfferDTO,
    CalculateTariffsOfferDTOFromJSON,
    CalculateTariffsOfferDTOToJSON,
    CalculateTariffsParametersDTO,
    CalculateTariffsParametersDTOFromJSON,
    CalculateTariffsParametersDTOToJSON,
} from './';

/**
 * 
 * @export
 * @interface CalculateTariffsRequest
 */
export interface CalculateTariffsRequest  {
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

export function CalculateTariffsRequestFromJSON(json: any): CalculateTariffsRequest {
    return {
        'parameters': CalculateTariffsParametersDTOFromJSON(json['parameters']),
        'offers': (json['offers'] as Array<any>).map(CalculateTariffsOfferDTOFromJSON),
    };
}

export function CalculateTariffsRequestToJSON(value?: CalculateTariffsRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'parameters': CalculateTariffsParametersDTOToJSON(value.parameters),
        'offers': (value.offers as Array<any>).map(CalculateTariffsOfferDTOToJSON),
    };
}


