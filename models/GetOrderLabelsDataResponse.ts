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
import type { OrderLabelDTO } from './OrderLabelDTO';
import {
    OrderLabelDTOFromJSON,
    OrderLabelDTOFromJSONTyped,
    OrderLabelDTOToJSON,
} from './OrderLabelDTO';

/**
 * Ответ с информацией для печати ярлыков.
 * @export
 * @interface GetOrderLabelsDataResponse
 */
export interface GetOrderLabelsDataResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetOrderLabelsDataResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {OrderLabelDTO}
     * @memberof GetOrderLabelsDataResponse
     */
    result?: OrderLabelDTO;
}



/**
 * Check if a given object implements the GetOrderLabelsDataResponse interface.
 */
export function instanceOfGetOrderLabelsDataResponse(value: object): value is GetOrderLabelsDataResponse {
    return true;
}

export function GetOrderLabelsDataResponseFromJSON(json: any): GetOrderLabelsDataResponse {
    return GetOrderLabelsDataResponseFromJSONTyped(json, false);
}

export function GetOrderLabelsDataResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetOrderLabelsDataResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : OrderLabelDTOFromJSON(json['result']),
    };
}

export function GetOrderLabelsDataResponseToJSON(value?: GetOrderLabelsDataResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': OrderLabelDTOToJSON(value['result']),
    };
}

