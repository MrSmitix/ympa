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
import type { GoodsStatsDTO } from './GoodsStatsDTO';
import {
    GoodsStatsDTOFromJSON,
    GoodsStatsDTOFromJSONTyped,
    GoodsStatsDTOToJSON,
} from './GoodsStatsDTO';
import type { ApiResponseStatusType } from './ApiResponseStatusType';
import {
    ApiResponseStatusTypeFromJSON,
    ApiResponseStatusTypeFromJSONTyped,
    ApiResponseStatusTypeToJSON,
} from './ApiResponseStatusType';

/**
 * Ответ на запрос отчета по товарам.
 * @export
 * @interface GetGoodsStatsResponse
 */
export interface GetGoodsStatsResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetGoodsStatsResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {GoodsStatsDTO}
     * @memberof GetGoodsStatsResponse
     */
    result?: GoodsStatsDTO;
}



/**
 * Check if a given object implements the GetGoodsStatsResponse interface.
 */
export function instanceOfGetGoodsStatsResponse(value: object): value is GetGoodsStatsResponse {
    return true;
}

export function GetGoodsStatsResponseFromJSON(json: any): GetGoodsStatsResponse {
    return GetGoodsStatsResponseFromJSONTyped(json, false);
}

export function GetGoodsStatsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetGoodsStatsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : GoodsStatsDTOFromJSON(json['result']),
    };
}

export function GetGoodsStatsResponseToJSON(value?: GetGoodsStatsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': GoodsStatsDTOToJSON(value['result']),
    };
}
