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
#include "OpenAPIBusinessDTO.h"
#include "OpenAPIPlacementType.h"

namespace OpenAPI
{

/*
 * OpenAPICampaignDTO
 *
 * Информация о магазине.
 */
class OPENAPI_API OpenAPICampaignDTO : public Model
{
public:
    virtual ~OpenAPICampaignDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* URL магазина. */
	TOptional<FString> Domain;
	/* Идентификатор кампании. */
	TOptional<int64> Id;
	/* Идентификатор плательщика в Яндекс Балансе. */
	TOptional<int64> ClientId;
	TOptional<OpenAPIBusinessDTO> Business;
	TOptional<OpenAPIPlacementType> PlacementType;
};

}
