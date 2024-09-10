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
import type { FeedIndexLogsErrorType } from './FeedIndexLogsErrorType';
import {
    FeedIndexLogsErrorTypeFromJSON,
    FeedIndexLogsErrorTypeFromJSONTyped,
    FeedIndexLogsErrorTypeToJSON,
} from './FeedIndexLogsErrorType';

/**
 * Информация об ошибке, произошедшей во время индексации прайс-листа.
 * 
 * Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`).
 * 
 * @export
 * @interface FeedIndexLogsErrorDTO
 */
export interface FeedIndexLogsErrorDTO {
    /**
     * HTTP-код ошибки индексации прайс-листа.
     * 
     * Выводится, если `type=DOWNLOAD_HTTP_ERROR`.
     * 
     * @type {number}
     * @memberof FeedIndexLogsErrorDTO
     */
    httpStatusCode?: number;
    /**
     * 
     * @type {FeedIndexLogsErrorType}
     * @memberof FeedIndexLogsErrorDTO
     */
    type?: FeedIndexLogsErrorType;
    /**
     * Описание ошибки.
     * 
     * Выводится, если `type=DOWNLOAD_ERROR`.
     * 
     * @type {string}
     * @memberof FeedIndexLogsErrorDTO
     */
    description?: string;
}



/**
 * Check if a given object implements the FeedIndexLogsErrorDTO interface.
 */
export function instanceOfFeedIndexLogsErrorDTO(value: object): value is FeedIndexLogsErrorDTO {
    return true;
}

export function FeedIndexLogsErrorDTOFromJSON(json: any): FeedIndexLogsErrorDTO {
    return FeedIndexLogsErrorDTOFromJSONTyped(json, false);
}

export function FeedIndexLogsErrorDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedIndexLogsErrorDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'httpStatusCode': json['httpStatusCode'] == null ? undefined : json['httpStatusCode'],
        'type': json['type'] == null ? undefined : FeedIndexLogsErrorTypeFromJSON(json['type']),
        'description': json['description'] == null ? undefined : json['description'],
    };
}

export function FeedIndexLogsErrorDTOToJSON(value?: FeedIndexLogsErrorDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'httpStatusCode': value['httpStatusCode'],
        'type': FeedIndexLogsErrorTypeToJSON(value['type']),
        'description': value['description'],
    };
}

