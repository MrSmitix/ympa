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
import type { CategoryDTO } from './CategoryDTO';
import {
    CategoryDTOFromJSON,
    CategoryDTOFromJSONTyped,
    CategoryDTOToJSON,
} from './CategoryDTO';
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';

/**
 * 
 * @export
 * @interface GetCategoriesResponse
 */
export interface GetCategoriesResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetCategoriesResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {CategoryDTO}
     * @memberof GetCategoriesResponse
     */
    result?: CategoryDTO;
}



/**
 * Check if a given object implements the GetCategoriesResponse interface.
 */
export function instanceOfGetCategoriesResponse(value: object): value is GetCategoriesResponse {
    return true;
}

export function GetCategoriesResponseFromJSON(json: any): GetCategoriesResponse {
    return GetCategoriesResponseFromJSONTyped(json, false);
}

export function GetCategoriesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetCategoriesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : CategoryDTOFromJSON(json['result']),
    };
}

export function GetCategoriesResponseToJSON(value?: GetCategoriesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': CategoryDTOToJSON(value['result']),
    };
}
