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
    OfferCampaignStatusType,
    OfferCampaignStatusTypeFromJSON,
    OfferCampaignStatusTypeToJSON,
} from './';

/**
 * Статус товара в магазине.
 * @export
 * @interface OfferCampaignStatusDTO
 */
export interface OfferCampaignStatusDTO  {
    /**
     * Идентификатор кампании. 
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

export function OfferCampaignStatusDTOFromJSON(json: any): OfferCampaignStatusDTO {
    return {
        'campaignId': json['campaignId'],
        'status': OfferCampaignStatusTypeFromJSON(json['status']),
    };
}

export function OfferCampaignStatusDTOToJSON(value?: OfferCampaignStatusDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'campaignId': value.campaignId,
        'status': OfferCampaignStatusTypeToJSON(value.status),
    };
}



