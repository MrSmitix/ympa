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
 * OpenAPIPalletsCountDTO
 *
 * Количество палет в отгрузке.
 */
class OPENAPI_API OpenAPIPalletsCountDTO : public Model
{
public:
    virtual ~OpenAPIPalletsCountDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Количество палет, которое заявил продавец. */
	TOptional<int32> Planned;
	/* Количество палет, которое приняли в сортировочном центре. */
	TOptional<int32> Fact;
};

}
