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
import type { UpdateCampaignOfferDTO } from './UpdateCampaignOfferDTO';
import {
    UpdateCampaignOfferDTOFromJSON,
    UpdateCampaignOfferDTOFromJSONTyped,
    UpdateCampaignOfferDTOToJSON,
} from './UpdateCampaignOfferDTO';

/**
 * Запрос на обновление предложений товаров магазина.
 * @export
 * @interface UpdateCampaignOffersRequest
 */
export interface UpdateCampaignOffersRequest {
    /**
     * Параметры размещения товаров в заданном магазине.
     * @type {Array<UpdateCampaignOfferDTO>}
     * @memberof UpdateCampaignOffersRequest
     */
    offers: Array<UpdateCampaignOfferDTO>;
}

/**
 * Check if a given object implements the UpdateCampaignOffersRequest interface.
 */
export function instanceOfUpdateCampaignOffersRequest(value: object): value is UpdateCampaignOffersRequest {
    if (!('offers' in value) || value['offers'] === undefined) return false;
    return true;
}

export function UpdateCampaignOffersRequestFromJSON(json: any): UpdateCampaignOffersRequest {
    return UpdateCampaignOffersRequestFromJSONTyped(json, false);
}

export function UpdateCampaignOffersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateCampaignOffersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'offers': ((json['offers'] as Array<any>).map(UpdateCampaignOfferDTOFromJSON)),
    };
}

export function UpdateCampaignOffersRequestToJSON(value?: UpdateCampaignOffersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'offers': ((value['offers'] as Array<any>).map(UpdateCampaignOfferDTOToJSON)),
    };
}
