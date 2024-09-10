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
#include "OpenAPITimeUnitType.h"

namespace OpenAPI
{

/*
 * OpenAPITimePeriodDTO
 *
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */
class OPENAPI_API OpenAPITimePeriodDTO : public Model
{
public:
    virtual ~OpenAPITimePeriodDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Продолжительность в указанных единицах. */
	int32 TimePeriod = 0;
	OpenAPITimeUnitType TimeUnit;
	/* Комментарий. */
	TOptional<FString> Comment;
};

}
