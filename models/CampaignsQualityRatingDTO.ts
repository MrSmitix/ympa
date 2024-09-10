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
import type { CampaignQualityRatingDTO } from './CampaignQualityRatingDTO';
import {
    CampaignQualityRatingDTOFromJSON,
    CampaignQualityRatingDTOFromJSONTyped,
    CampaignQualityRatingDTOToJSON,
} from './CampaignQualityRatingDTO';

/**
 * Информация об индексе качества магазинов.
 * @export
 * @interface CampaignsQualityRatingDTO
 */
export interface CampaignsQualityRatingDTO {
    /**
     * Список магазинов c информацией об их индексе качества.
     * @type {Array<CampaignQualityRatingDTO>}
     * @memberof CampaignsQualityRatingDTO
     */
    campaignRatings: Array<CampaignQualityRatingDTO>;
}

/**
 * Check if a given object implements the CampaignsQualityRatingDTO interface.
 */
export function instanceOfCampaignsQualityRatingDTO(value: object): value is CampaignsQualityRatingDTO {
    if (!('campaignRatings' in value) || value['campaignRatings'] === undefined) return false;
    return true;
}

export function CampaignsQualityRatingDTOFromJSON(json: any): CampaignsQualityRatingDTO {
    return CampaignsQualityRatingDTOFromJSONTyped(json, false);
}

export function CampaignsQualityRatingDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): CampaignsQualityRatingDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'campaignRatings': ((json['campaignRatings'] as Array<any>).map(CampaignQualityRatingDTOFromJSON)),
    };
}

export function CampaignsQualityRatingDTOToJSON(value?: CampaignsQualityRatingDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'campaignRatings': ((value['campaignRatings'] as Array<any>).map(CampaignQualityRatingDTOToJSON)),
    };
}
