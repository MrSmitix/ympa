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
#include "OpenAPIOrderBuyerType.h"

namespace OpenAPI
{

/*
 * OpenAPIOrderBuyerDTO
 *
 * Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
 */
class OPENAPI_API OpenAPIOrderBuyerDTO : public Model
{
public:
    virtual ~OpenAPIOrderBuyerDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор покупателя. */
	TOptional<FString> Id;
	/* Фамилия покупателя. */
	TOptional<FString> LastName;
	/* Имя покупателя. */
	TOptional<FString> FirstName;
	/* Отчество покупателя. */
	TOptional<FString> MiddleName;
	TOptional<OpenAPIOrderBuyerType> Type;
};

}
