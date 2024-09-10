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
#include "OpenAPIGetPromoDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIGetPromosResultDTO
 *
 * Информация об акциях Маркета.
 */
class OPENAPI_API OpenAPIGetPromosResultDTO : public Model
{
public:
    virtual ~OpenAPIGetPromosResultDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Акции Маркета. */
	TArray<OpenAPIGetPromoDTO> Promos;
};

}
