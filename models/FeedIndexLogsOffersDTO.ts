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
 * Информация о предложениях прайс-листа.
 * @export
 * @interface FeedIndexLogsOffersDTO
 */
export interface FeedIndexLogsOffersDTO {
    /**
     * Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
     * @type {number}
     * @memberof FeedIndexLogsOffersDTO
     */
    rejectedCount?: number;
    /**
     * Количество предложений в прайс-листе.
     * @type {number}
     * @memberof FeedIndexLogsOffersDTO
     */
    totalCount?: number;
}

/**
 * Check if a given object implements the FeedIndexLogsOffersDTO interface.
 */
export function instanceOfFeedIndexLogsOffersDTO(value: object): value is FeedIndexLogsOffersDTO {
    return true;
}

export function FeedIndexLogsOffersDTOFromJSON(json: any): FeedIndexLogsOffersDTO {
    return FeedIndexLogsOffersDTOFromJSONTyped(json, false);
}

export function FeedIndexLogsOffersDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedIndexLogsOffersDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'rejectedCount': json['rejectedCount'] == null ? undefined : json['rejectedCount'],
        'totalCount': json['totalCount'] == null ? undefined : json['totalCount'],
    };
}

export function FeedIndexLogsOffersDTOToJSON(value?: FeedIndexLogsOffersDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'rejectedCount': value['rejectedCount'],
        'totalCount': value['totalCount'],
    };
}
