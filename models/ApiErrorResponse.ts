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
import type { ApiErrorDTO } from './ApiErrorDTO';
import {
    ApiErrorDTOFromJSON,
    ApiErrorDTOFromJSONTyped,
    ApiErrorDTOToJSON,
} from './ApiErrorDTO';
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';

/**
 * Стандартная обертка для ошибок сервера.
 * @export
 * @interface ApiErrorResponse
 */
export interface ApiErrorResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof ApiErrorResponse
     */
    status?: ApiResponseStatusType;
    /**
     * Список ошибок.
     * @type {Array<ApiErrorDTO>}
     * @memberof ApiErrorResponse
     */
    errors?: Array<ApiErrorDTO> | null;
}



/**
 * Check if a given object implements the ApiErrorResponse interface.
 */
export function instanceOfApiErrorResponse(value: object): value is ApiErrorResponse {
    return true;
}

export function ApiErrorResponseFromJSON(json: any): ApiErrorResponse {
    return ApiErrorResponseFromJSONTyped(json, false);
}

export function ApiErrorResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApiErrorResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(ApiErrorDTOFromJSON)),
    };
}

export function ApiErrorResponseToJSON(value?: ApiErrorResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(ApiErrorDTOToJSON)),
    };
}

