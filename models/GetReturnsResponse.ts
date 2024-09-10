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
import type { PagedReturnsDTO } from './PagedReturnsDTO';
import {
    PagedReturnsDTOFromJSON,
    PagedReturnsDTOFromJSONTyped,
    PagedReturnsDTOToJSON,
} from './PagedReturnsDTO';
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';

/**
 * 
 * @export
 * @interface GetReturnsResponse
 */
export interface GetReturnsResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetReturnsResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {PagedReturnsDTO}
     * @memberof GetReturnsResponse
     */
    result?: PagedReturnsDTO;
}



/**
 * Check if a given object implements the GetReturnsResponse interface.
 */
export function instanceOfGetReturnsResponse(value: object): value is GetReturnsResponse {
    return true;
}

export function GetReturnsResponseFromJSON(json: any): GetReturnsResponse {
    return GetReturnsResponseFromJSONTyped(json, false);
}

export function GetReturnsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetReturnsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : PagedReturnsDTOFromJSON(json['result']),
    };
}

export function GetReturnsResponseToJSON(value?: GetReturnsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': PagedReturnsDTOToJSON(value['result']),
    };
}

