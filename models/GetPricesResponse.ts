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
import type { OfferPriceListResponseDTO } from './OfferPriceListResponseDTO';
import {
    OfferPriceListResponseDTOFromJSON,
    OfferPriceListResponseDTOFromJSONTyped,
    OfferPriceListResponseDTOToJSON,
} from './OfferPriceListResponseDTO';

/**
 * Ответ на запрос списка цен.
 * @export
 * @interface GetPricesResponse
 */
export interface GetPricesResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetPricesResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {OfferPriceListResponseDTO}
     * @memberof GetPricesResponse
     */
    result?: OfferPriceListResponseDTO;
}



/**
 * Check if a given object implements the GetPricesResponse interface.
 */
export function instanceOfGetPricesResponse(value: object): value is GetPricesResponse {
    return true;
}

export function GetPricesResponseFromJSON(json: any): GetPricesResponse {
    return GetPricesResponseFromJSONTyped(json, false);
}

export function GetPricesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetPricesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : OfferPriceListResponseDTOFromJSON(json['result']),
    };
}

export function GetPricesResponseToJSON(value?: GetPricesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': OfferPriceListResponseDTOToJSON(value['result']),
    };
}

