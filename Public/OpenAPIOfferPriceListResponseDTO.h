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
#include "OpenAPIOfferPriceResponseDTO.h"
#include "OpenAPIScrollingPagerDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIOfferPriceListResponseDTO
 *
 * Список цен на товары.
 */
class OPENAPI_API OpenAPIOfferPriceListResponseDTO : public Model
{
public:
    virtual ~OpenAPIOfferPriceListResponseDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Страница списка. */
	TArray<OpenAPIOfferPriceResponseDTO> Offers;
	TOptional<OpenAPIScrollingPagerDTO> Paging;
	/* Количество всех цен магазина, измененных через API. */
	TOptional<int32> Total;
};

}
