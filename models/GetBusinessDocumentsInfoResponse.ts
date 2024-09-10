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
import type { OrderBusinessDocumentsDTO } from './OrderBusinessDocumentsDTO';
import {
    OrderBusinessDocumentsDTOFromJSON,
    OrderBusinessDocumentsDTOFromJSONTyped,
    OrderBusinessDocumentsDTOToJSON,
} from './OrderBusinessDocumentsDTO';

/**
 * 
 * @export
 * @interface GetBusinessDocumentsInfoResponse
 */
export interface GetBusinessDocumentsInfoResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetBusinessDocumentsInfoResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {OrderBusinessDocumentsDTO}
     * @memberof GetBusinessDocumentsInfoResponse
     */
    result?: OrderBusinessDocumentsDTO;
}



/**
 * Check if a given object implements the GetBusinessDocumentsInfoResponse interface.
 */
export function instanceOfGetBusinessDocumentsInfoResponse(value: object): value is GetBusinessDocumentsInfoResponse {
    return true;
}

export function GetBusinessDocumentsInfoResponseFromJSON(json: any): GetBusinessDocumentsInfoResponse {
    return GetBusinessDocumentsInfoResponseFromJSONTyped(json, false);
}

export function GetBusinessDocumentsInfoResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetBusinessDocumentsInfoResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : OrderBusinessDocumentsDTOFromJSON(json['result']),
    };
}

export function GetBusinessDocumentsInfoResponseToJSON(value?: GetBusinessDocumentsInfoResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': OrderBusinessDocumentsDTOToJSON(value['result']),
    };
}
