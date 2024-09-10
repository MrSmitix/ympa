// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    FeedDownloadErrorType,
    FeedDownloadErrorTypeFromJSON,
    FeedDownloadErrorTypeToJSON,
} from './';

/**
 * Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
 * @export
 * @interface FeedDownloadErrorDTO
 */
export interface FeedDownloadErrorDTO  {
    /**
     * HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
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
     * Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
     * @type {string}
     * @memberof FeedDownloadErrorDTO
     */
    description?: string;
}

export function FeedDownloadErrorDTOFromJSON(json: any): FeedDownloadErrorDTO {
    return {
        'httpStatusCode': !exists(json, 'httpStatusCode') ? undefined : json['httpStatusCode'],
        'type': !exists(json, 'type') ? undefined : FeedDownloadErrorTypeFromJSON(json['type']),
        'description': !exists(json, 'description') ? undefined : json['description'],
    };
}

export function FeedDownloadErrorDTOToJSON(value?: FeedDownloadErrorDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'httpStatusCode': value.httpStatusCode,
        'type': FeedDownloadErrorTypeToJSON(value.type),
        'description': value.description,
    };
}



