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
#include "OpenAPIPriceQuarantineApi.h"

#include "OpenAPIApiClientDataErrorResponse.h"
#include "OpenAPIApiForbiddenErrorResponse.h"
#include "OpenAPIApiLimitErrorResponse.h"
#include "OpenAPIApiLockedErrorResponse.h"
#include "OpenAPIApiNotFoundErrorResponse.h"
#include "OpenAPIApiServerErrorResponse.h"
#include "OpenAPIApiUnauthorizedErrorResponse.h"
#include "OpenAPIConfirmPricesRequest.h"
#include "OpenAPIEmptyApiResponse.h"
#include "OpenAPIGetQuarantineOffersRequest.h"
#include "OpenAPIGetQuarantineOffersResponse.h"

namespace OpenAPI
{

/* Удаление товара из карантина по цене в кабинете
 *
 * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
*/
class OPENAPI_API OpenAPIPriceQuarantineApi::ConfirmBusinessPricesRequest : public Request
{
public:
    virtual ~ConfirmBusinessPricesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 BusinessId = 0;
	OpenAPIConfirmPricesRequest OpenAPIConfirmPricesRequest;
};

class OPENAPI_API OpenAPIPriceQuarantineApi::ConfirmBusinessPricesResponse : public Response
{
public:
    virtual ~ConfirmBusinessPricesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIEmptyApiResponse Content;
};

/* Удаление товара из карантина по цене в магазине
 *
 * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
*/
class OPENAPI_API OpenAPIPriceQuarantineApi::ConfirmCampaignPricesRequest : public Request
{
public:
    virtual ~ConfirmCampaignPricesRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	OpenAPIConfirmPricesRequest OpenAPIConfirmPricesRequest;
};

class OPENAPI_API OpenAPIPriceQuarantineApi::ConfirmCampaignPricesResponse : public Response
{
public:
    virtual ~ConfirmCampaignPricesResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIEmptyApiResponse Content;
};

/* Список товаров, находящихся в карантине по цене в кабинете
 *
 * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
*/
class OPENAPI_API OpenAPIPriceQuarantineApi::GetBusinessQuarantineOffersRequest : public Request
{
public:
    virtual ~GetBusinessQuarantineOffersRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 BusinessId = 0;
	OpenAPIGetQuarantineOffersRequest OpenAPIGetQuarantineOffersRequest;
	/* Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  */
	TOptional<FString> PageToken;
	/* Количество значений на одной странице.  */
	TOptional<int32> Limit;
};

class OPENAPI_API OpenAPIPriceQuarantineApi::GetBusinessQuarantineOffersResponse : public Response
{
public:
    virtual ~GetBusinessQuarantineOffersResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetQuarantineOffersResponse Content;
};

/* Список товаров, находящихся в карантине по цене в магазине
 *
 * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
*/
class OPENAPI_API OpenAPIPriceQuarantineApi::GetCampaignQuarantineOffersRequest : public Request
{
public:
    virtual ~GetCampaignQuarantineOffersRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	OpenAPIGetQuarantineOffersRequest OpenAPIGetQuarantineOffersRequest;
	/* Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  */
	TOptional<FString> PageToken;
	/* Количество значений на одной странице.  */
	TOptional<int32> Limit;
};

class OPENAPI_API OpenAPIPriceQuarantineApi::GetCampaignQuarantineOffersResponse : public Response
{
public:
    virtual ~GetCampaignQuarantineOffersResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetQuarantineOffersResponse Content;
};

}
