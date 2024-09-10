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
import type { FeedbackListDTO } from './FeedbackListDTO';
import {
    FeedbackListDTOFromJSON,
    FeedbackListDTOFromJSONTyped,
    FeedbackListDTOToJSON,
} from './FeedbackListDTO';

/**
 * 
 * @export
 * @interface GetFeedbackListResponse
 */
export interface GetFeedbackListResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetFeedbackListResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {FeedbackListDTO}
     * @memberof GetFeedbackListResponse
     */
    result?: FeedbackListDTO;
}



/**
 * Check if a given object implements the GetFeedbackListResponse interface.
 */
export function instanceOfGetFeedbackListResponse(value: object): value is GetFeedbackListResponse {
    return true;
}

export function GetFeedbackListResponseFromJSON(json: any): GetFeedbackListResponse {
    return GetFeedbackListResponseFromJSONTyped(json, false);
}

export function GetFeedbackListResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetFeedbackListResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : FeedbackListDTOFromJSON(json['result']),
    };
}

export function GetFeedbackListResponseToJSON(value?: GetFeedbackListResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': FeedbackListDTOToJSON(value['result']),
    };
}
