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
import type { FeedDownloadErrorType } from './FeedDownloadErrorType';
import {
    FeedDownloadErrorTypeFromJSON,
    FeedDownloadErrorTypeFromJSONTyped,
    FeedDownloadErrorTypeToJSON,
} from './FeedDownloadErrorType';

/**
 * Информация об ошибке при загрузке прайс-листа.
 * Выводится, если параметр `download status=ERROR`.
 * 
 * @export
 * @interface FeedDownloadErrorDTO
 */
export interface FeedDownloadErrorDTO {
    /**
     * HTTP-код ошибки индексации прайс-листа.
     * Выводится, если `type=DOWNLOAD_HTTP_ERROR`.
     * 
     * @type {number}
     * @memberof FeedDownloadErrorDTO
     */
    httpStatusCode?: number;
    /**
     * 
     * @type {FeedDownloadErrorType}
     * @memberof FeedDownloadErrorDTO
     */
    type?: FeedDownloadErrorType;
    /**
     * Описание ошибки.
     * Выводится, если `type=DOWNLOAD_ERROR`.
     * 
     * @type {string}
     * @memberof FeedDownloadErrorDTO
     */
    description?: string;
}



/**
 * Check if a given object implements the FeedDownloadErrorDTO interface.
 */
export function instanceOfFeedDownloadErrorDTO(value: object): value is FeedDownloadErrorDTO {
    return true;
}

export function FeedDownloadErrorDTOFromJSON(json: any): FeedDownloadErrorDTO {
    return FeedDownloadErrorDTOFromJSONTyped(json, false);
}

export function FeedDownloadErrorDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedDownloadErrorDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'httpStatusCode': json['httpStatusCode'] == null ? undefined : json['httpStatusCode'],
        'type': json['type'] == null ? undefined : FeedDownloadErrorTypeFromJSON(json['type']),
        'description': json['description'] == null ? undefined : json['description'],
    };
}

export function FeedDownloadErrorDTOToJSON(value?: FeedDownloadErrorDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'httpStatusCode': value['httpStatusCode'],
        'type': FeedDownloadErrorTypeToJSON(value['type']),
        'description': value['description'],
    };
}

