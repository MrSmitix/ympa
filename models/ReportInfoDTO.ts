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
import type { ReportSubStatusType } from './ReportSubStatusType';
import {
    ReportSubStatusTypeFromJSON,
    ReportSubStatusTypeFromJSONTyped,
    ReportSubStatusTypeToJSON,
} from './ReportSubStatusType';
import type { ReportStatusType } from './ReportStatusType';
import {
    ReportStatusTypeFromJSON,
    ReportStatusTypeFromJSONTyped,
    ReportStatusTypeToJSON,
} from './ReportStatusType';

/**
 * Статус генерации и ссылка на готовый отчет.
 * @export
 * @interface ReportInfoDTO
 */
export interface ReportInfoDTO {
    /**
     * 
     * @type {ReportStatusType}
     * @memberof ReportInfoDTO
     */
    status: ReportStatusType;
    /**
     * 
     * @type {ReportSubStatusType}
     * @memberof ReportInfoDTO
     */
    subStatus?: ReportSubStatusType;
    /**
     * Дата и время запроса на генерацию.
     * @type {Date}
     * @memberof ReportInfoDTO
     */
    generationRequestedAt: Date;
    /**
     * Дата и время завершения генерации.
     * @type {Date}
     * @memberof ReportInfoDTO
     */
    generationFinishedAt?: Date;
    /**
     * Ссылка на готовый отчет.
     * @type {string}
     * @memberof ReportInfoDTO
     */
    file?: string;
    /**
     * Ожидаемая продолжительность генерации в миллисекундах.
     * @type {number}
     * @memberof ReportInfoDTO
     */
    estimatedGenerationTime?: number;
}



/**
 * Check if a given object implements the ReportInfoDTO interface.
 */
export function instanceOfReportInfoDTO(value: object): value is ReportInfoDTO {
    if (!('status' in value) || value['status'] === undefined) return false;
    if (!('generationRequestedAt' in value) || value['generationRequestedAt'] === undefined) return false;
    return true;
}

export function ReportInfoDTOFromJSON(json: any): ReportInfoDTO {
    return ReportInfoDTOFromJSONTyped(json, false);
}

export function ReportInfoDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReportInfoDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'status': ReportStatusTypeFromJSON(json['status']),
        'subStatus': json['subStatus'] == null ? undefined : ReportSubStatusTypeFromJSON(json['subStatus']),
        'generationRequestedAt': (new Date(json['generationRequestedAt'])),
        'generationFinishedAt': json['generationFinishedAt'] == null ? undefined : (new Date(json['generationFinishedAt'])),
        'file': json['file'] == null ? undefined : json['file'],
        'estimatedGenerationTime': json['estimatedGenerationTime'] == null ? undefined : json['estimatedGenerationTime'],
    };
}

export function ReportInfoDTOToJSON(value?: ReportInfoDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': ReportStatusTypeToJSON(value['status']),
        'subStatus': ReportSubStatusTypeToJSON(value['subStatus']),
        'generationRequestedAt': ((value['generationRequestedAt']).toISOString()),
        'generationFinishedAt': value['generationFinishedAt'] == null ? undefined : ((value['generationFinishedAt']).toISOString()),
        'file': value['file'],
        'estimatedGenerationTime': value['estimatedGenerationTime'],
    };
}

