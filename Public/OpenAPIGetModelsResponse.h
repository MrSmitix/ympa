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
#include "OpenAPICurrencyType.h"
#include "OpenAPIModelDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIGetModelsResponse
 *
 * Ответ на запрос информации о моделях.
 */
class OPENAPI_API OpenAPIGetModelsResponse : public Model
{
public:
    virtual ~OpenAPIGetModelsResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Список моделей товаров. */
	TArray<OpenAPIModelDTO> Models;
	TOptional<OpenAPICurrencyType> Currency;
	/* Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  */
	TOptional<int64> RegionId;
};

}
