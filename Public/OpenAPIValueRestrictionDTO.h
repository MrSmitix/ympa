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
#include "OpenAPIOptionValuesLimitedDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIValueRestrictionDTO
 *
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */
class OPENAPI_API OpenAPIValueRestrictionDTO : public Model
{
public:
    virtual ~OpenAPIValueRestrictionDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификатор ограничивающей характеристики. */
	int64 LimitingParameterId = 0;
	/* Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. */
	TArray<OpenAPIOptionValuesLimitedDTO> LimitedValues;
};

}
