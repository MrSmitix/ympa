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
package ympa_kotlin_server.models

import ympa_kotlin_server.models.FeedbackReactionStatusType

/**
 * Фильтр запроса отзывов в кабинете. 
 * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
 * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
 * @param reactionStatus 
 * @param ratingValues Оценка товара.
 * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
 * @param paid Фильтр отзывов за баллы Плюса.
 */
data class GetGoodsFeedbackRequest(
    /* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  */
    val dateTimeFrom: java.time.OffsetDateTime? = null,
    /* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  */
    val dateTimeTo: java.time.OffsetDateTime? = null,
    val reactionStatus: FeedbackReactionStatusType? = null,
    /* Оценка товара. */
    val ratingValues: kotlin.collections.Set<kotlin.Int>? = null,
    /* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  */
    val modelIds: kotlin.collections.Set<kotlin.Long>? = null,
    /* Фильтр отзывов за баллы Плюса. */
    val paid: kotlin.Boolean? = null
) 

