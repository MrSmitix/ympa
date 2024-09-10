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
 * OpenAPITransferOrdersFromShipmentRequest
 *
 * Запрос переноса заказов из отгрузки.
 */
class OPENAPI_API OpenAPITransferOrdersFromShipmentRequest : public Model
{
public:
    virtual ~OpenAPITransferOrdersFromShipmentRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Список заказов, которые вы не успеваете подготовить. */
	TArray<int64> OrderIds;
};

}
