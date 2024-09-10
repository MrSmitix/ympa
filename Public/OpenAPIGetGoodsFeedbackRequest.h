/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIFeedbackReactionStatusType.h"

namespace OpenAPI
{

/*
 * OpenAPIGetGoodsFeedbackRequest
 *
 * Фильтр запроса отзывов в кабинете. 
 */
class OPENAPI_API OpenAPIGetGoodsFeedbackRequest : public Model
{
public:
    virtual ~OpenAPIGetGoodsFeedbackRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  */
	TOptional<FDateTime> DateTimeFrom;
	/* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  */
	TOptional<FDateTime> DateTimeTo;
	TOptional<OpenAPIFeedbackReactionStatusType> ReactionStatus;
	/* Оценка товара. */
	TOptional<TSet<int32>> RatingValues;
	/* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  */
	TOptional<TSet<int64>> ModelIds;
	/* Фильтр отзывов за баллы Плюса. */
	TOptional<bool> Paid;
};

}
