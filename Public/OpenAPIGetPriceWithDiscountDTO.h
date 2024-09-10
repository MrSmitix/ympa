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

namespace OpenAPI
{

/*
 * OpenAPIGetPriceWithDiscountDTO
 *
 * Цена с указанием скидки и времени последнего обновления.
 */
class OPENAPI_API OpenAPIGetPriceWithDiscountDTO : public Model
{
public:
    virtual ~OpenAPIGetPriceWithDiscountDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Значение. */
	double Value;
	OpenAPICurrencyType CurrencyId;
	/* Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
	TOptional<double> DiscountBase;
	/* Время последнего обновления. */
	FDateTime UpdatedAt;
};

}
