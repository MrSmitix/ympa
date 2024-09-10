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
import type { UpdateGoodsFeedbackCommentDTO } from './UpdateGoodsFeedbackCommentDTO';
import {
    UpdateGoodsFeedbackCommentDTOFromJSON,
    UpdateGoodsFeedbackCommentDTOFromJSONTyped,
    UpdateGoodsFeedbackCommentDTOToJSON,
} from './UpdateGoodsFeedbackCommentDTO';

/**
 * Комментарий к отзыву.
 * @export
 * @interface UpdateGoodsFeedbackCommentRequest
 */
export interface UpdateGoodsFeedbackCommentRequest {
    /**
     * Идентификатор отзыва.
     * 
     * @type {number}
     * @memberof UpdateGoodsFeedbackCommentRequest
     */
    feedbackId: number;
    /**
     * 
     * @type {UpdateGoodsFeedbackCommentDTO}
     * @memberof UpdateGoodsFeedbackCommentRequest
     */
    comment: UpdateGoodsFeedbackCommentDTO;
}

/**
 * Check if a given object implements the UpdateGoodsFeedbackCommentRequest interface.
 */
export function instanceOfUpdateGoodsFeedbackCommentRequest(value: object): value is UpdateGoodsFeedbackCommentRequest {
    if (!('feedbackId' in value) || value['feedbackId'] === undefined) return false;
    if (!('comment' in value) || value['comment'] === undefined) return false;
    return true;
}

export function UpdateGoodsFeedbackCommentRequestFromJSON(json: any): UpdateGoodsFeedbackCommentRequest {
    return UpdateGoodsFeedbackCommentRequestFromJSONTyped(json, false);
}

export function UpdateGoodsFeedbackCommentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateGoodsFeedbackCommentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'feedbackId': json['feedbackId'],
        'comment': UpdateGoodsFeedbackCommentDTOFromJSON(json['comment']),
    };
}

export function UpdateGoodsFeedbackCommentRequestToJSON(value?: UpdateGoodsFeedbackCommentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedbackId': value['feedbackId'],
        'comment': UpdateGoodsFeedbackCommentDTOToJSON(value['comment']),
    };
}

