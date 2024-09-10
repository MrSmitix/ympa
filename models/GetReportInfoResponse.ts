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
import type { ReportInfoDTO } from './ReportInfoDTO';
import {
    ReportInfoDTOFromJSON,
    ReportInfoDTOFromJSONTyped,
    ReportInfoDTOToJSON,
} from './ReportInfoDTO';

/**
 * Ответ на запрос информации об отчете.
 * @export
 * @interface GetReportInfoResponse
 */
export interface GetReportInfoResponse {
    /**
     * 
     * @type {ApiResponseStatusType}
     * @memberof GetReportInfoResponse
     */
    status?: ApiResponseStatusType;
    /**
     * 
     * @type {ReportInfoDTO}
     * @memberof GetReportInfoResponse
     */
    result?: ReportInfoDTO;
}



/**
 * Check if a given object implements the GetReportInfoResponse interface.
 */
export function instanceOfGetReportInfoResponse(value: object): value is GetReportInfoResponse {
    return true;
}

export function GetReportInfoResponseFromJSON(json: any): GetReportInfoResponse {
    return GetReportInfoResponseFromJSONTyped(json, false);
}

export function GetReportInfoResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetReportInfoResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : ApiResponseStatusTypeFromJSON(json['status']),
        'result': json['result'] == null ? undefined : ReportInfoDTOFromJSON(json['result']),
    };
}

export function GetReportInfoResponseToJSON(value?: GetReportInfoResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ApiResponseStatusTypeToJSON(value['status']),
        'result': ReportInfoDTOToJSON(value['result']),
    };
}

