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
    FeedbackReactionStatusType,
    FeedbackReactionStatusTypeFromJSON,
    FeedbackReactionStatusTypeToJSON,
} from './';

/**
 * Фильтр запроса отзывов в кабинете. 
 * @export
 * @interface GetGoodsFeedbackRequest
 */
export interface GetGoodsFeedbackRequest  {
    /**
     * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
     * @type {Date}
     * @memberof GetGoodsFeedbackRequest
     */
    dateTimeFrom?: Date;
    /**
     * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
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
    ratingValues?: Set<number>;
    /**
     * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
     * @type {Set<number>}
     * @memberof GetGoodsFeedbackRequest
     */
    modelIds?: Set<number>;
    /**
     * Фильтр отзывов за баллы Плюса.
     * @type {boolean}
     * @memberof GetGoodsFeedbackRequest
     */
    paid?: boolean;
}

export function GetGoodsFeedbackRequestFromJSON(json: any): GetGoodsFeedbackRequest {
    return {
        'dateTimeFrom': !exists(json, 'dateTimeFrom') ? undefined : new Date(json['dateTimeFrom']),
        'dateTimeTo': !exists(json, 'dateTimeTo') ? undefined : new Date(json['dateTimeTo']),
        'reactionStatus': !exists(json, 'reactionStatus') ? undefined : FeedbackReactionStatusTypeFromJSON(json['reactionStatus']),
        'ratingValues': !exists(json, 'ratingValues') ? undefined : json['ratingValues'],
        'modelIds': !exists(json, 'modelIds') ? undefined : json['modelIds'],
        'paid': !exists(json, 'paid') ? undefined : json['paid'],
    };
}

export function GetGoodsFeedbackRequestToJSON(value?: GetGoodsFeedbackRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'dateTimeFrom': value.dateTimeFrom === undefined ? undefined : value.dateTimeFrom.toISOString(),
        'dateTimeTo': value.dateTimeTo === undefined ? undefined : value.dateTimeTo.toISOString(),
        'reactionStatus': FeedbackReactionStatusTypeToJSON(value.reactionStatus),
        'ratingValues': value.ratingValues,
        'modelIds': value.modelIds,
        'paid': value.paid,
    };
}



