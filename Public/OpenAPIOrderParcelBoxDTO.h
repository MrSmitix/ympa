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
 * OpenAPIOrderParcelBoxDTO
 *
 * Информация о грузоместе.
 */
class OPENAPI_API OpenAPIOrderParcelBoxDTO : public Model
{
public:
    virtual ~OpenAPIOrderParcelBoxDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор грузоместа. */
	TOptional<int64> Id;
	/* Идентификатор грузового места в информационной системе магазина. */
	TOptional<FString> FulfilmentId;
};

}
