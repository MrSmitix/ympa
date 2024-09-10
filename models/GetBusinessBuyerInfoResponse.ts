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
import type { OrderBusinessBuyerDTO } from './OrderBusinessBuyerDTO';
import {
    OrderBusinessBuyerDTOFromJSON,
    OrderBusinessBuyerDTOFromJSONTyped,
    OrderBusinessBuyerDTOToJSON,
} from './OrderBusinessBuyerDTO';
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';

/**
 * 
 * @export
 * @interface GetBusinessBuyerInfoResponse
 */
export interface GetBusinessBuyerInfoResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetBusinessBuyerInfoResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {OrderBusinessBuyerDTO}
     * @memberof GetBusinessBuyerInfoResponse
     */
    result?: OrderBusinessBuyerDTO;
}



/**
 * Check if a given object implements the GetBusinessBuyerInfoResponse interface.
 */
export function instanceOfGetBusinessBuyerInfoResponse(value: object): value is GetBusinessBuyerInfoResponse {
    return true;
}

export function GetBusinessBuyerInfoResponseFromJSON(json: any): GetBusinessBuyerInfoResponse {
    return GetBusinessBuyerInfoResponseFromJSONTyped(json, false);
}

export function GetBusinessBuyerInfoResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetBusinessBuyerInfoResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : OrderBusinessBuyerDTOFromJSON(json['result']),
    };
}

export function GetBusinessBuyerInfoResponseToJSON(value?: GetBusinessBuyerInfoResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': OrderBusinessBuyerDTOToJSON(value['result']),
    };
}

