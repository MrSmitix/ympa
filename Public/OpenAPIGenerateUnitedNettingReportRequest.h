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
#include "OpenAPIPlacementType.h"

namespace OpenAPI
{

/*
 * OpenAPIGenerateUnitedNettingReportRequest
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */
class OPENAPI_API OpenAPIGenerateUnitedNettingReportRequest : public Model
{
public:
    virtual ~OpenAPIGenerateUnitedNettingReportRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор бизнеса. */
	int64 BusinessId = 0;
	/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.  */
	TOptional<FDateTime> DateTimeFrom;
	/* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.  */
	TOptional<FDateTime> DateTimeTo;
	/* Начало периода, включительно. */
	TOptional<FDateTime> DateFrom;
	/* Конец периода, включительно. Максимальный период — 1 год. */
	TOptional<FDateTime> DateTo;
	/* Номер платежного поручения. */
	TOptional<int64> BankOrderId;
	/* Дата платежного поручения. */
	TOptional<FDateTime> BankOrderDateTime;
	/* Список моделей, которые нужны в отчете.  */
	TOptional<TArray<OpenAPIPlacementType>> PlacementPrograms;
	/* Список ИНН, которые нужны в отчете. */
	TOptional<TArray<FString>> Inns;
	/* Список магазинов, которые нужны в отчете. */
	TOptional<TArray<int64>> CampaignIds;
};

}
