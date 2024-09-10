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
#include "OpenAPIFullOutletDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIGetOutletResponse
 *
 * Ответ на запрос информации о точке продаж.
 */
class OPENAPI_API OpenAPIGetOutletResponse : public Model
{
public:
    virtual ~OpenAPIGetOutletResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIFullOutletDTO> Outlet;
};

}
