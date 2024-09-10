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
#include "OpenAPIApiResponseStatusType.h"
#include "OpenAPISearchShipmentsResponseDTO.h"

namespace OpenAPI
{

/*
 * OpenAPISearchShipmentsResponse
 *
 * Ответ на запрос информации об отгрузках.
 */
class OPENAPI_API OpenAPISearchShipmentsResponse : public Model
{
public:
    virtual ~OpenAPISearchShipmentsResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIApiResponseStatusType> Status;
	TOptional<OpenAPISearchShipmentsResponseDTO> Result;
};

}
