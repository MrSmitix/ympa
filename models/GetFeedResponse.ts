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
import type { FeedDTO } from './FeedDTO';
import {
    FeedDTOFromJSON,
    FeedDTOFromJSONTyped,
    FeedDTOToJSON,
} from './FeedDTO';

/**
 * Ответ на запрос информации о прайс-листе.
 * @export
 * @interface GetFeedResponse
 */
export interface GetFeedResponse {
    /**
     * 
     * @type {FeedDTO}
     * @memberof GetFeedResponse
     */
    feed?: FeedDTO;
}

/**
 * Check if a given object implements the GetFeedResponse interface.
 */
export function instanceOfGetFeedResponse(value: object): value is GetFeedResponse {
    return true;
}

export function GetFeedResponseFromJSON(json: any): GetFeedResponse {
    return GetFeedResponseFromJSONTyped(json, false);
}

export function GetFeedResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetFeedResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'feed': json['feed'] == null ? undefined : FeedDTOFromJSON(json['feed']),
    };
}

export function GetFeedResponseToJSON(value?: GetFeedResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feed': FeedDTOToJSON(value['feed']),
    };
}
