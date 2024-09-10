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
import type { GoodsFeedbackStatisticsDTO } from './GoodsFeedbackStatisticsDTO';
import {
    GoodsFeedbackStatisticsDTOFromJSON,
    GoodsFeedbackStatisticsDTOFromJSONTyped,
    GoodsFeedbackStatisticsDTOToJSON,
} from './GoodsFeedbackStatisticsDTO';
import type { GoodsFeedbackDescriptionDTO } from './GoodsFeedbackDescriptionDTO';
import {
    GoodsFeedbackDescriptionDTOFromJSON,
    GoodsFeedbackDescriptionDTOFromJSONTyped,
    GoodsFeedbackDescriptionDTOToJSON,
} from './GoodsFeedbackDescriptionDTO';
import type { GoodsFeedbackIdentifiersDTO } from './GoodsFeedbackIdentifiersDTO';
import {
    GoodsFeedbackIdentifiersDTOFromJSON,
    GoodsFeedbackIdentifiersDTOFromJSONTyped,
    GoodsFeedbackIdentifiersDTOToJSON,
} from './GoodsFeedbackIdentifiersDTO';
import type { GoodsFeedbackMediaDTO } from './GoodsFeedbackMediaDTO';
import {
    GoodsFeedbackMediaDTOFromJSON,
    GoodsFeedbackMediaDTOFromJSONTyped,
    GoodsFeedbackMediaDTOToJSON,
} from './GoodsFeedbackMediaDTO';

/**
 * Отзыв о товаре.
 * @export
 * @interface GoodsFeedbackDTO
 */
export interface GoodsFeedbackDTO {
    /**
     * Идентификатор отзыва.
     * 
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

/**
 * Check if a given object implements the GoodsFeedbackDTO interface.
 */
export function instanceOfGoodsFeedbackDTO(value: object): value is GoodsFeedbackDTO {
    if (!('feedbackId' in value) || value['feedbackId'] === undefined) return false;
    if (!('createdAt' in value) || value['createdAt'] === undefined) return false;
    if (!('needReaction' in value) || value['needReaction'] === undefined) return false;
    if (!('identifiers' in value) || value['identifiers'] === undefined) return false;
    if (!('statistics' in value) || value['statistics'] === undefined) return false;
    return true;
}

export function GoodsFeedbackDTOFromJSON(json: any): GoodsFeedbackDTO {
    return GoodsFeedbackDTOFromJSONTyped(json, false);
}

export function GoodsFeedbackDTOFromJSONTyped(json: any, ignoreDiscriminator: boolean): GoodsFeedbackDTO {
    if (json == null) {
        return json;
    }
    return {
        
        'feedbackId': json['feedbackId'],
        'createdAt': (new Date(json['createdAt'])),
        'needReaction': json['needReaction'],
        'identifiers': GoodsFeedbackIdentifiersDTOFromJSON(json['identifiers']),
        'author': json['author'] == null ? undefined : json['author'],
        'description': json['description'] == null ? undefined : GoodsFeedbackDescriptionDTOFromJSON(json['description']),
        'media': json['media'] == null ? undefined : GoodsFeedbackMediaDTOFromJSON(json['media']),
        'statistics': GoodsFeedbackStatisticsDTOFromJSON(json['statistics']),
    };
}

export function GoodsFeedbackDTOToJSON(value?: GoodsFeedbackDTO | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedbackId': value['feedbackId'],
        'createdAt': ((value['createdAt']).toISOString()),
        'needReaction': value['needReaction'],
        'identifiers': GoodsFeedbackIdentifiersDTOToJSON(value['identifiers']),
        'author': value['author'],
        'description': GoodsFeedbackDescriptionDTOToJSON(value['description']),
        'media': GoodsFeedbackMediaDTOToJSON(value['media']),
        'statistics': GoodsFeedbackStatisticsDTOToJSON(value['statistics']),
    };
}

