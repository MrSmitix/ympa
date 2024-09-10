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
/**
 * Данные, необходимые для генерации отчета.
 * @export
 * @interface GenerateCompetitorsPositionReportRequest
 */
export interface GenerateCompetitorsPositionReportRequest {
    /**
     * Идентификатор бизнеса.
     * @type {number}
     * @memberof GenerateCompetitorsPositionReportRequest
     */
    businessId: number;
    /**
     * Идентификатор категории.
     * @type {number}
     * @memberof GenerateCompetitorsPositionReportRequest
     */
    categoryId: number;
    /**
     * Начало периода, включительно.
     * @type {Date}
     * @memberof GenerateCompetitorsPositionReportRequest
     */
    dateFrom: Date;
    /**
     * Конец периода, включительно.
     * @type {Date}
     * @memberof GenerateCompetitorsPositionReportRequest
     */
    dateTo: Date;
}

/**
 * Check if a given object implements the GenerateCompetitorsPositionReportRequest interface.
 */
export function instanceOfGenerateCompetitorsPositionReportRequest(value: object): value is GenerateCompetitorsPositionReportRequest {
    if (!('businessId' in value) || value['businessId'] === undefined) return false;
    if (!('categoryId' in value) || value['categoryId'] === undefined) return false;
    if (!('dateFrom' in value) || value['dateFrom'] === undefined) return false;
    if (!('dateTo' in value) || value['dateTo'] === undefined) return false;
    return true;
}

export function GenerateCompetitorsPositionReportRequestFromJSON(json: any): GenerateCompetitorsPositionReportRequest {
    return GenerateCompetitorsPositionReportRequestFromJSONTyped(json, false);
}

export function GenerateCompetitorsPositionReportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GenerateCompetitorsPositionReportRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'businessId': json['businessId'],
        'categoryId': json['categoryId'],
        'dateFrom': (new Date(json['dateFrom'])),
        'dateTo': (new Date(json['dateTo'])),
    };
}

export function GenerateCompetitorsPositionReportRequestToJSON(value?: GenerateCompetitorsPositionReportRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'businessId': value['businessId'],
        'categoryId': value['categoryId'],
        'dateFrom': ((value['dateFrom']).toISOString().substring(0,10)),
        'dateTo': ((value['dateTo']).toISOString().substring(0,10)),
    };
}
