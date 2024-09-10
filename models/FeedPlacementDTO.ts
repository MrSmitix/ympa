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
import type { FeedStatusType } from './FeedStatusType';
import {
    FeedStatusTypeFromJSON,
    FeedStatusTypeFromJSONTyped,
    FeedStatusTypeToJSON,
} from './FeedStatusType';

/**
 * Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 * @export
 * @interface FeedPlacementDTO
 */
export interface FeedPlacementDTO {
    /**
     * 
     * @type {FeedStatusType}
     * @memberof FeedPlacementDTO
     */
    status?: FeedStatusType;
    /**
     * Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
     * @type {number}
     * @memberof FeedPlacementDTO
     */
    totalOffersCount?: number;
}



/**
 * Check if a given object implements the FeedPlacementDTO interface.
 */
export function instanceOfFeedPlacementDTO(value: object): value is FeedPlacementDTO {
    return true;
}

export function FeedPlacementDTOFromJSON(json: any): FeedPlacementDTO {
    return FeedPlacementDTOFromJSONTyped(json, false);
}

export function FeedPlacementDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedPlacementDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : FeedStatusTypeFromJSON(json['status']),
        'totalOffersCount': json['totalOffersCount'] == null ? undefined : json['totalOffersCount'],
    };
}

export function FeedPlacementDTOToJSON(value?: FeedPlacementDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': FeedStatusTypeToJSON(value['status']),
        'totalOffersCount': value['totalOffersCount'],
    };
}
