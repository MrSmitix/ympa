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
 * OpenAPIOrderBuyerType
 *
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */
class OPENAPI_API OpenAPIOrderBuyerType : public Model
{
public:
    virtual ~OpenAPIOrderBuyerType() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	enum class Values
	{
		Person,
		Business,
  	};

	Values Value;

	static FString EnumToString(const Values& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, Values& EnumValue);
};

}
