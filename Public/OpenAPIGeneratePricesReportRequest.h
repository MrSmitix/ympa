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

namespace OpenAPI
{

/*
 * OpenAPIGeneratePricesReportRequest
 *
 * Данные, необходимые для генерации отчета.
 */
class OPENAPI_API OpenAPIGeneratePricesReportRequest : public Model
{
public:
    virtual ~OpenAPIGeneratePricesReportRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`.  */
	TOptional<int64> BusinessId;
	/* Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно.  */
	TOptional<int64> CampaignId;
	/* Фильтр по категориям на Маркете. */
	TOptional<TArray<int64>> CategoryIds;
	/* Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
	TOptional<FDateTime> CreationDateFrom;
	/* Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`.  */
	TOptional<FDateTime> CreationDateTo;
};

}
