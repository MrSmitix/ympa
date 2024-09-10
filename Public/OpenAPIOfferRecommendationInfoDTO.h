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
#include "OpenAPIBasePriceDTO.h"
#include "OpenAPIPriceCompetitivenessThresholdsDTO.h"

namespace OpenAPI
{

/*
 * OpenAPIOfferRecommendationInfoDTO
 *
 * Рекомендации, касающиеся цены на товар.
 */
class OPENAPI_API OpenAPIOfferRecommendationInfoDTO : public Model
{
public:
    virtual ~OpenAPIOfferRecommendationInfoDTO() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
	TOptional<FString> OfferId;
	TOptional<OpenAPIBasePriceDTO> RecommendedCofinancePrice;
	TOptional<OpenAPIPriceCompetitivenessThresholdsDTO> CompetitivenessThresholds;
};

}
