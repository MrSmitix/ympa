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
import { FeedbackReactionStatusType } from './feedbackReactionStatusType';


/**
 * Фильтр запроса отзывов в кабинете. 
 */
export interface GetGoodsFeedbackRequest { 
    /**
     * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
     */
    dateTimeFrom?: string;
    /**
     * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
     */
    dateTimeTo?: string;
    reactionStatus?: FeedbackReactionStatusType;
    /**
     * Оценка товара.
     */
    ratingValues?: Set<number> | null;
    /**
     * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
     */
    modelIds?: Set<number> | null;
    /**
     * Фильтр отзывов за баллы Плюса.
     */
    paid?: boolean;
}
export namespace GetGoodsFeedbackRequest {
}
