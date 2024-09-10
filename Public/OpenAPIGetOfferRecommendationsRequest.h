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
#include "OpenAPIFieldStateType.h"
#include "OpenAPIPriceCompetitivenessType.h"

namespace OpenAPI
{

/*
 * OpenAPIGetOfferRecommendationsRequest
 *
 * 
 */
class OPENAPI_API OpenAPIGetOfferRecommendationsRequest : public Model
{
public:
    virtual ~OpenAPIGetOfferRecommendationsRequest() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. */
	TOptional<TArray<FString>> OfferIds;
	TOptional<OpenAPIFieldStateType> CofinancePriceFilter;
	TOptional<OpenAPIFieldStateType> RecommendedCofinancePriceFilter;
	TOptional<OpenAPIPriceCompetitivenessType> CompetitivenessFilter;
};

}
