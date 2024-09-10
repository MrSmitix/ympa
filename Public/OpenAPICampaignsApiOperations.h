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
#include "OpenAPICampaignsApi.h"

#include "OpenAPIApiClientDataErrorResponse.h"
#include "OpenAPIApiForbiddenErrorResponse.h"
#include "OpenAPIApiLimitErrorResponse.h"
#include "OpenAPIApiNotFoundErrorResponse.h"
#include "OpenAPIApiServerErrorResponse.h"
#include "OpenAPIApiUnauthorizedErrorResponse.h"
#include "OpenAPIGetCampaignLoginsResponse.h"
#include "OpenAPIGetCampaignRegionResponse.h"
#include "OpenAPIGetCampaignResponse.h"
#include "OpenAPIGetCampaignSettingsResponse.h"
#include "OpenAPIGetCampaignsResponse.h"

namespace OpenAPI
{

/* Информация о магазине
 *
 * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignRequest : public Request
{
public:
    virtual ~GetCampaignRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignResponse : public Response
{
public:
    virtual ~GetCampaignResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignResponse Content;
};

/* Логины, связанные с магазином
 *
 * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignLoginsRequest : public Request
{
public:
    virtual ~GetCampaignLoginsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignLoginsResponse : public Response
{
public:
    virtual ~GetCampaignLoginsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignLoginsResponse Content;
};

/* Регион магазина
 *
 * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignRegionRequest : public Request
{
public:
    virtual ~GetCampaignRegionRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignRegionResponse : public Response
{
public:
    virtual ~GetCampaignRegionResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignRegionResponse Content;
};

/* Настройки магазина
 *
 * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignSettingsRequest : public Request
{
public:
    virtual ~GetCampaignSettingsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignSettingsResponse : public Response
{
public:
    virtual ~GetCampaignSettingsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignSettingsResponse Content;
};

/* Список магазинов пользователя
 *
 * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignsRequest : public Request
{
public:
    virtual ~GetCampaignsRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  */
	TOptional<int32> Page;
	/* Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  */
	TOptional<int32> PageSize;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignsResponse : public Response
{
public:
    virtual ~GetCampaignsResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignsResponse Content;
};

/* Магазины, доступные логину
 *
 * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
*/
class OPENAPI_API OpenAPICampaignsApi::GetCampaignsByLoginRequest : public Request
{
public:
    virtual ~GetCampaignsByLoginRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Логин пользователя. */
	FString Login;
	/* Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  */
	TOptional<int32> Page;
	/* Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  */
	TOptional<int32> PageSize;
};

class OPENAPI_API OpenAPICampaignsApi::GetCampaignsByLoginResponse : public Response
{
public:
    virtual ~GetCampaignsByLoginResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetCampaignsResponse Content;
};

}
