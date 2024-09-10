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
 * В запросе не указаны авторизационные данные.
 * @export
 * @interface ApiUnauthorizedErrorResponse
 */
export interface ApiUnauthorizedErrorResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof ApiUnauthorizedErrorResponse
     */
    status?: ApiResponseStatusType;
    /**
     * Список ошибок.
     * @type {Array<ApiErrorDTO>}
     * @memberof ApiUnauthorizedErrorResponse
     */
    errors?: Array<ApiErrorDTO> | null;
}



/**
 * Check if a given object implements the ApiUnauthorizedErrorResponse interface.
 */
export function instanceOfApiUnauthorizedErrorResponse(value: object): value is ApiUnauthorizedErrorResponse {
    return true;
}

export function ApiUnauthorizedErrorResponseFromJSON(json: any): ApiUnauthorizedErrorResponse {
    return ApiUnauthorizedErrorResponseFromJSONTyped(json, false);
}

export function ApiUnauthorizedErrorResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApiUnauthorizedErrorResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'errors': json['errors'] == null ? undefined : ((json['errors'] as Array<any>).map(ApiErrorDTOFromJSON)),
    };
}

export function ApiUnauthorizedErrorResponseToJSON(value?: ApiUnauthorizedErrorResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'errors': value['errors'] == null ? undefined : ((value['errors'] as Array<any>).map(ApiErrorDTOToJSON)),
    };
}

