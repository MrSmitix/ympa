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
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';
import type { OfferPriceByOfferIdsListResponseDTO } from './OfferPriceByOfferIdsListResponseDTO';
import {
    OfferPriceByOfferIdsListResponseDTOFromJSON,
    OfferPriceByOfferIdsListResponseDTOFromJSONTyped,
    OfferPriceByOfferIdsListResponseDTOToJSON,
} from './OfferPriceByOfferIdsListResponseDTO';

/**
 * Ответ на запрос списка цен.
 * @export
 * @interface GetPricesByOfferIdsResponse
 */
export interface GetPricesByOfferIdsResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetPricesByOfferIdsResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {OfferPriceByOfferIdsListResponseDTO}
     * @memberof GetPricesByOfferIdsResponse
     */
    result?: OfferPriceByOfferIdsListResponseDTO;
}



/**
 * Check if a given object implements the GetPricesByOfferIdsResponse interface.
 */
export function instanceOfGetPricesByOfferIdsResponse(value: object): value is GetPricesByOfferIdsResponse {
    return true;
}

export function GetPricesByOfferIdsResponseFromJSON(json: any): GetPricesByOfferIdsResponse {
    return GetPricesByOfferIdsResponseFromJSONTyped(json, false);
}

export function GetPricesByOfferIdsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPricesByOfferIdsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : OfferPriceByOfferIdsListResponseDTOFromJSON(json['result']),
    };
}

export function GetPricesByOfferIdsResponseToJSON(value?: GetPricesByOfferIdsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': OfferPriceByOfferIdsListResponseDTOToJSON(value['result']),
    };
}

