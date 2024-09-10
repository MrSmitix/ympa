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
 * OpenAPIGenerateMassOrderLabelsRequest
 *
 * Данные, необходимые для генерации файла. 
 */
class OPENAPI_API OpenAPIGenerateMassOrderLabelsRequest : public Model
{
public:
    virtual ~OpenAPIGenerateMassOrderLabelsRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор кабинета. */
	int64 BusinessId = 0;
	/* Список идентификаторов заказов. */
	TSet<int64> OrderIds;
};

}
