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
    GoodsFeedbackDescriptionDTO,
    GoodsFeedbackDescriptionDTOFromJSON,
    GoodsFeedbackDescriptionDTOToJSON,
    GoodsFeedbackIdentifiersDTO,
    GoodsFeedbackIdentifiersDTOFromJSON,
    GoodsFeedbackIdentifiersDTOToJSON,
    GoodsFeedbackMediaDTO,
    GoodsFeedbackMediaDTOFromJSON,
    GoodsFeedbackMediaDTOToJSON,
    GoodsFeedbackStatisticsDTO,
    GoodsFeedbackStatisticsDTOFromJSON,
    GoodsFeedbackStatisticsDTOToJSON,
} from './';

/**
 * Отзыв о товаре.
 * @export
 * @interface GoodsFeedbackDTO
 */
export interface GoodsFeedbackDTO  {
    /**
     * Идентификатор отзыва. 
     * @type {number}
     * @memberof GoodsFeedbackDTO
     */
    feedbackId: number;
    /**
     * Дата и время создания отзыва.
     * @type {Date}
     * @memberof GoodsFeedbackDTO
     */
    createdAt: Date;
    /**
     * Нужен ли ответ на отзыв.
     * @type {boolean}
     * @memberof GoodsFeedbackDTO
     */
    needReaction: boolean;
    /**
     * 
     * @type {GoodsFeedbackIdentifiersDTO}
     * @memberof GoodsFeedbackDTO
     */
    identifiers: GoodsFeedbackIdentifiersDTO;
    /**
     * Имя автора отзыва.
     * @type {string}
     * @memberof GoodsFeedbackDTO
     */
    author?: string;
    /**
     * 
     * @type {GoodsFeedbackDescriptionDTO}
     * @memberof GoodsFeedbackDTO
     */
    description?: GoodsFeedbackDescriptionDTO;
    /**
     * 
     * @type {GoodsFeedbackMediaDTO}
     * @memberof GoodsFeedbackDTO
     */
    media?: GoodsFeedbackMediaDTO;
    /**
     * 
     * @type {GoodsFeedbackStatisticsDTO}
     * @memberof GoodsFeedbackDTO
     */
    statistics: GoodsFeedbackStatisticsDTO;
}

export function GoodsFeedbackDTOFromJSON(json: any): GoodsFeedbackDTO {
    return {
        'feedbackId': json['feedbackId'],
        'createdAt': new Date(json['createdAt']),
        'needReaction': json['needReaction'],
        'identifiers': GoodsFeedbackIdentifiersDTOFromJSON(json['identifiers']),
        'author': !exists(json, 'author') ? undefined : json['author'],
        'description': !exists(json, 'description') ? undefined : GoodsFeedbackDescriptionDTOFromJSON(json['description']),
        'media': !exists(json, 'media') ? undefined : GoodsFeedbackMediaDTOFromJSON(json['media']),
        'statistics': GoodsFeedbackStatisticsDTOFromJSON(json['statistics']),
    };
}

export function GoodsFeedbackDTOToJSON(value?: GoodsFeedbackDTO): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'feedbackId': value.feedbackId,
        'createdAt': value.createdAt.toISOString(),
        'needReaction': value.needReaction,
        'identifiers': GoodsFeedbackIdentifiersDTOToJSON(value.identifiers),
        'author': value.author,
        'description': GoodsFeedbackDescriptionDTOToJSON(value.description),
        'media': GoodsFeedbackMediaDTOToJSON(value.media),
        'statistics': GoodsFeedbackStatisticsDTOToJSON(value.statistics),
    };
}


