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
#include "OpenAPICampaignDTO.h"
#include "OpenAPIFlippingPagerDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIGetCampaignsResponse
 *
 * Результаты поиска магазинов.
 */
class OPENAPI_API OpenAPIGetCampaignsResponse : public Model
{
public:
    virtual ~OpenAPIGetCampaignsResponse() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Список с информацией по каждому магазину. */
	TArray<OpenAPICampaignDTO> Campaigns;
	TOptional<OpenAPIFlippingPagerDTO> Pager;
};

}
