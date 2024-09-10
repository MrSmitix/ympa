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
import type { PromoOfferParticipationStatusFilterType } from './PromoOfferParticipationStatusFilterType';
import {
    PromoOfferParticipationStatusFilterTypeFromJSON,
    PromoOfferParticipationStatusFilterTypeFromJSONTyped,
    PromoOfferParticipationStatusFilterTypeToJSON,
} from './PromoOfferParticipationStatusFilterType';

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 * @export
 * @interface GetPromoOffersRequest
 */
export interface GetPromoOffersRequest {
    /**
     * Идентификатор акции.
     * @type {string}
     * @memberof GetPromoOffersRequest
     */
    promoId: string;
    /**
     * 
     * @type {PromoOfferParticipationStatusFilterType}
     * @memberof GetPromoOffersRequest
     */
    statusType?: PromoOfferParticipationStatusFilterType;
}



/**
 * Check if a given object implements the GetPromoOffersRequest interface.
 */
export function instanceOfGetPromoOffersRequest(value: object): value is GetPromoOffersRequest {
    if (!('promoId' in value) || value['promoId'] === undefined) return false;
    return true;
}

export function GetPromoOffersRequestFromJSON(json: any): GetPromoOffersRequest {
    return GetPromoOffersRequestFromJSONTyped(json, false);
}

export function GetPromoOffersRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPromoOffersRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'promoId': json['promoId'],
        'statusType': json['statusType'] == null ? undefined : PromoOfferParticipationStatusFilterTypeFromJSON(json['statusType']),
    };
}

export function GetPromoOffersRequestToJSON(value?: GetPromoOffersRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'promoId': value['promoId'],
        'statusType': PromoOfferParticipationStatusFilterTypeToJSON(value['statusType']),
    };
}

