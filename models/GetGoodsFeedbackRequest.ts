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
import type { FeedbackReactionStatusType } from './FeedbackReactionStatusType';
import {
    FeedbackReactionStatusTypeFromJSON,
    FeedbackReactionStatusTypeFromJSONTyped,
    FeedbackReactionStatusTypeToJSON,
} from './FeedbackReactionStatusType';

/**
 * Фильтр запроса отзывов в кабинете.
 * 
 * @export
 * @interface GetGoodsFeedbackRequest
 */
export interface GetGoodsFeedbackRequest {
    /**
     * Начало периода. Не включительно.
     * 
     * Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.
     * 
     * @type {Date}
     * @memberof GetGoodsFeedbackRequest
     */
    dateTimeFrom?: Date;
    /**
     * Конец периода. Не включительно.
     * 
     * Если параметр не указан, используется текущая дата.
     * 
     * @type {Date}
     * @memberof GetGoodsFeedbackRequest
     */
    dateTimeTo?: Date;
    /**
     * 
     * @type {FeedbackReactionStatusType}
     * @memberof GetGoodsFeedbackRequest
     */
    reactionStatus?: FeedbackReactionStatusType;
    /**
     * Оценка товара.
     * @type {Set<number>}
     * @memberof GetGoodsFeedbackRequest
     */
    ratingValues?: Set<number> | null;
    /**
     * Фильтр по идентификатору модели товара.
     * 
     * Получить идентификатор модели можно с помощью одного из запросов:
     * 
     * * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);
     * 
     * * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);
     * 
     * * [POST models](../../reference/models/getModels.md).
     * 
     * @type {Set<number>}
     * @memberof GetGoodsFeedbackRequest
     */
    modelIds?: Set<number> | null;
    /**
     * Фильтр отзывов за баллы Плюса.
     * @type {boolean}
     * @memberof GetGoodsFeedbackRequest
     */
    paid?: boolean;
}



/**
 * Check if a given object implements the GetGoodsFeedbackRequest interface.
 */
export function instanceOfGetGoodsFeedbackRequest(value: object): value is GetGoodsFeedbackRequest {
    return true;
}

export function GetGoodsFeedbackRequestFromJSON(json: any): GetGoodsFeedbackRequest {
    return GetGoodsFeedbackRequestFromJSONTyped(json, false);
}

export function GetGoodsFeedbackRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): GetGoodsFeedbackRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'dateTimeFrom': json['dateTimeFrom'] == null ? undefined : (new Date(json['dateTimeFrom'])),
        'dateTimeTo': json['dateTimeTo'] == null ? undefined : (new Date(json['dateTimeTo'])),
        'reactionStatus': json['reactionStatus'] == null ? undefined : FeedbackReactionStatusTypeFromJSON(json['reactionStatus']),
        'ratingValues': json['ratingValues'] == null ? undefined : json['ratingValues'],
        'modelIds': json['modelIds'] == null ? undefined : json['modelIds'],
        'paid': json['paid'] == null ? undefined : json['paid'],
    };
}

export function GetGoodsFeedbackRequestToJSON(value?: GetGoodsFeedbackRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'dateTimeFrom': value['dateTimeFrom'] == null ? undefined : ((value['dateTimeFrom']).toISOString()),
        'dateTimeTo': value['dateTimeTo'] == null ? undefined : ((value['dateTimeTo']).toISOString()),
        'reactionStatus': FeedbackReactionStatusTypeToJSON(value['reactionStatus']),
        'ratingValues': value['ratingValues'] == null ? undefined : Array.from(value['ratingValues'] as Set<any>),
        'modelIds': value['modelIds'] == null ? undefined : Array.from(value['modelIds'] as Set<any>),
        'paid': value['paid'],
    };
}
