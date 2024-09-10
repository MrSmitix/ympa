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
    FeedbackCommentAuthorType,
    FeedbackCommentAuthorTypeFromJSON,
    FeedbackCommentAuthorTypeToJSON,
} from './';

/**
 * Информация об авторе комментария.
 * @export
 * @interface FeedbackCommentAuthorDTO
 */
export interface FeedbackCommentAuthorDTO  {
    /**
     * 
     * @type {FeedbackCommentAuthorType}
     * @memberof FeedbackCommentAuthorDTO
     */
    type?: FeedbackCommentAuthorType;
    /**
     * Имя автора отзыва или название магазина.
     * @type {string}
     * @memberof FeedbackCommentAuthorDTO
     */
    name?: string;
}

export function FeedbackCommentAuthorDTOFromJSON(json: any): FeedbackCommentAuthorDTO {
    return {
        'type': !exists(json, 'type') ? undefined : FeedbackCommentAuthorTypeFromJSON(json['type']),
        'name': !exists(json, 'name') ? undefined : json['name'],
    };
}

export function FeedbackCommentAuthorDTOToJSON(value?: FeedbackCommentAuthorDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': FeedbackCommentAuthorTypeToJSON(value.type),
        'name': value.name,
    };
}



