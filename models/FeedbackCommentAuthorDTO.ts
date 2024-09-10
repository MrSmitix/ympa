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
import type { FeedbackCommentAuthorType } from './FeedbackCommentAuthorType';
import {
    FeedbackCommentAuthorTypeFromJSON,
    FeedbackCommentAuthorTypeFromJSONTyped,
    FeedbackCommentAuthorTypeToJSON,
} from './FeedbackCommentAuthorType';

/**
 * Информация об авторе комментария.
 * @export
 * @interface FeedbackCommentAuthorDTO
 */
export interface FeedbackCommentAuthorDTO {
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



/**
 * Check if a given object implements the FeedbackCommentAuthorDTO interface.
 */
export function instanceOfFeedbackCommentAuthorDTO(value: object): value is FeedbackCommentAuthorDTO {
    return true;
}

export function FeedbackCommentAuthorDTOFromJSON(json: any): FeedbackCommentAuthorDTO {
    return FeedbackCommentAuthorDTOFromJSONTyped(json, false);
}

export function FeedbackCommentAuthorDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): FeedbackCommentAuthorDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : FeedbackCommentAuthorTypeFromJSON(json['type']),
        'name': json['name'] == null ? undefined : json['name'],
    };
}

export function FeedbackCommentAuthorDTOToJSON(value?: FeedbackCommentAuthorDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'type': FeedbackCommentAuthorTypeToJSON(value['type']),
        'name': value['name'],
    };
}

