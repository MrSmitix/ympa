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
 * Фильтр запроса отзывов по бизнесу.
 * 
 * @export
 * @interface DeleteGoodsFeedbackCommentRequest
 */
export interface DeleteGoodsFeedbackCommentRequest {
    /**
     * Идентификатор комментария к отзыву.
     * 
     * @type {number}
     * @memberof DeleteGoodsFeedbackCommentRequest
     */
    id: number;
}

/**
 * Check if a given object implements the DeleteGoodsFeedbackCommentRequest interface.
 */
export function instanceOfDeleteGoodsFeedbackCommentRequest(value: object): value is DeleteGoodsFeedbackCommentRequest {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function DeleteGoodsFeedbackCommentRequestFromJSON(json: any): DeleteGoodsFeedbackCommentRequest {
    return DeleteGoodsFeedbackCommentRequestFromJSONTyped(json, false);
}

export function DeleteGoodsFeedbackCommentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeleteGoodsFeedbackCommentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function DeleteGoodsFeedbackCommentRequestToJSON(value?: DeleteGoodsFeedbackCommentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

