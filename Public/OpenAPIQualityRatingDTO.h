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
#include "OpenAPIQualityRatingComponentDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIQualityRatingDTO
 *
 * Информация об индексе качества.
 */
class OPENAPI_API OpenAPIQualityRatingDTO : public Model
{
public:
    virtual ~OpenAPIQualityRatingDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Значение индекса качества. */
	int64 Rating = 0;
	/* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
	FDateTime CalculationDate;
	/* Составляющие индекса качества. */
	TArray<OpenAPIQualityRatingComponentDTO> Components;
};

}
