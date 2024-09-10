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
#include "OpenAPIOfferForRecommendationDTO.h"
#include "OpenAPIOfferRecommendationInfoDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIOfferRecommendationDTO
 *
 * Информация о состоянии цен и рекомендации. 
 */
class OPENAPI_API OpenAPIOfferRecommendationDTO : public Model
{
public:
    virtual ~OpenAPIOfferRecommendationDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TOptional<OpenAPIOfferForRecommendationDTO> Offer;
	TOptional<OpenAPIOfferRecommendationInfoDTO> Recommendation;
};

}
