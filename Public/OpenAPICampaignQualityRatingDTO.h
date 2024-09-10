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
#include "OpenAPIQualityRatingDTO.h"

namespace OpenAPI
{

/*
 * OpenAPICampaignQualityRatingDTO
 *
 * Информация об индексе качества магазина.
 */
class OPENAPI_API OpenAPICampaignQualityRatingDTO : public Model
{
public:
    virtual ~OpenAPICampaignQualityRatingDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор магазина. */
	int64 CampaignId = 0;
	/* Список значений индекса качества. */
	TArray<OpenAPIQualityRatingDTO> Ratings;
};

}
