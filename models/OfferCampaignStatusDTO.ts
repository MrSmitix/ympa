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
import type { OfferCampaignStatusType } from './OfferCampaignStatusType';
import {
    OfferCampaignStatusTypeFromJSON,
    OfferCampaignStatusTypeFromJSONTyped,
    OfferCampaignStatusTypeToJSON,
} from './OfferCampaignStatusType';

/**
 * Статус товара в магазине.
 * @export
 * @interface OfferCampaignStatusDTO
 */
export interface OfferCampaignStatusDTO {
    /**
     * Идентификатор кампании.
     * 
     * @type {number}
     * @memberof OfferCampaignStatusDTO
     */
    campaignId: number;
    /**
     * 
     * @type {OfferCampaignStatusType}
     * @memberof OfferCampaignStatusDTO
     */
    status: OfferCampaignStatusType;
}



/**
 * Check if a given object implements the OfferCampaignStatusDTO interface.
 */
export function instanceOfOfferCampaignStatusDTO(value: object): value is OfferCampaignStatusDTO {
    if (!('campaignId' in value) || value['campaignId'] === undefined) return false;
    if (!('status' in value) || value['status'] === undefined) return false;
    return true;
}

export function OfferCampaignStatusDTOFromJSON(json: any): OfferCampaignStatusDTO {
    return OfferCampaignStatusDTOFromJSONTyped(json, false);
}

export function OfferCampaignStatusDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): OfferCampaignStatusDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'campaignId': json['campaignId'],
        'status': OfferCampaignStatusTypeFromJSON(json['status']),
    };
}

export function OfferCampaignStatusDTOToJSON(value?: OfferCampaignStatusDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'campaignId': value['campaignId'],
        'status': OfferCampaignStatusTypeToJSON(value['status']),
    };
}

