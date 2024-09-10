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
#include "OpenAPIOfferCardStatusType.h"

namespace OpenAPI
{

/*
 * OpenAPIGetOfferCardsContentStatusRequest
 *
 * 
 */
class OPENAPI_API OpenAPIGetOfferCardsContentStatusRequest : public Model
{
public:
    virtual ~OpenAPIGetOfferCardsContentStatusRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
	TOptional<TSet<FString>> OfferIds;
	/* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
	TOptional<TSet<OpenAPIOfferCardStatusType>> CardStatuses;
	/* Фильтр по категориям на Маркете. */
	TOptional<TSet<int32>> CategoryIds;
};

}
