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
#include "OpenAPIRatingsApi.h"

#include "OpenAPIApiClientDataErrorResponse.h"
#include "OpenAPIApiForbiddenErrorResponse.h"
#include "OpenAPIApiLimitErrorResponse.h"
#include "OpenAPIApiNotFoundErrorResponse.h"
#include "OpenAPIApiServerErrorResponse.h"
#include "OpenAPIApiUnauthorizedErrorResponse.h"
#include "OpenAPIGetQualityRatingDetailsResponse.h"
#include "OpenAPIGetQualityRatingRequest.h"
#include "OpenAPIGetQualityRatingResponse.h"

namespace OpenAPI
{

/* Заказы, которые повлияли на индекс качества
 *
 * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIRatingsApi::GetQualityRatingDetailsRequest : public Request
{
public:
    virtual ~GetQualityRatingDetailsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
};

class OPENAPI_API OpenAPIRatingsApi::GetQualityRatingDetailsResponse : public Response
{
public:
    virtual ~GetQualityRatingDetailsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetQualityRatingDetailsResponse Content;
};

/* Индекс качества магазинов
 *
 * Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIRatingsApi::GetQualityRatingsRequest : public Request
{
public:
    virtual ~GetQualityRatingsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 BusinessId = 0;
	OpenAPIGetQualityRatingRequest OpenAPIGetQualityRatingRequest;
};

class OPENAPI_API OpenAPIRatingsApi::GetQualityRatingsResponse : public Response
{
public:
    virtual ~GetQualityRatingsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetQualityRatingResponse Content;
};

}
