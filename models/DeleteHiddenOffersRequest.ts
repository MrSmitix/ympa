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
import type { HiddenOfferDTO } from './HiddenOfferDTO';
import {
    HiddenOfferDTOFromJSON,
    HiddenOfferDTOFromJSONTyped,
    HiddenOfferDTOToJSON,
} from './HiddenOfferDTO';

/**
 * Запрос на возобновление показа оферов.
 * @export
 * @interface DeleteHiddenOffersRequest
 */
export interface DeleteHiddenOffersRequest {
    /**
     * Список скрытых товаров.
     * 
     * @type {Array<HiddenOfferDTO>}
     * @memberof DeleteHiddenOffersRequest
     */
    hiddenOffers: Array<HiddenOfferDTO>;
}

/**
 * Check if a given object implements the DeleteHiddenOffersRequest interface.
 */
export function instanceOfDeleteHiddenOffersRequest(value: object): value is DeleteHiddenOffersRequest {
    if (!('hiddenOffers' in value) || value['hiddenOffers'] === undefined) return false;
    return true;
}

export function DeleteHiddenOffersRequestFromJSON(json: any): DeleteHiddenOffersRequest {
    return DeleteHiddenOffersRequestFromJSONTyped(json, false);
}

export function DeleteHiddenOffersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeleteHiddenOffersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'hiddenOffers': ((json['hiddenOffers'] as Array<any>).map(HiddenOfferDTOFromJSON)),
    };
}

export function DeleteHiddenOffersRequestToJSON(value?: DeleteHiddenOffersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'hiddenOffers': ((value['hiddenOffers'] as Array<any>).map(HiddenOfferDTOToJSON)),
    };
}

