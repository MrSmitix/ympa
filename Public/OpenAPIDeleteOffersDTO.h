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
 * OpenAPIDeleteOffersDTO
 *
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */
class OPENAPI_API OpenAPIDeleteOffersDTO : public Model
{
public:
    virtual ~OpenAPIDeleteOffersDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Список SKU товаров, которые не удалось удалить. */
	TOptional<TArray<FString>> NotDeletedOfferIds;
};

}
