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
#include "OpenAPIOrderDeliveryApi.h"

#include "OpenAPIApiClientDataErrorResponse.h"
#include "OpenAPIApiForbiddenErrorResponse.h"
#include "OpenAPIApiLimitErrorResponse.h"
#include "OpenAPIApiNotFoundErrorResponse.h"
#include "OpenAPIApiServerErrorResponse.h"
#include "OpenAPIApiUnauthorizedErrorResponse.h"
#include "OpenAPIEmptyApiResponse.h"
#include "OpenAPIGetOrderBuyerInfoResponse.h"
#include "OpenAPISetOrderDeliveryDateRequest.h"
#include "OpenAPISetOrderDeliveryTrackCodeRequest.h"
#include "OpenAPIUpdateOrderStorageLimitRequest.h"
#include "OpenAPIVerifyOrderEacRequest.h"
#include "OpenAPIVerifyOrderEacResponse.h"

namespace OpenAPI
{

/* Информация о покупателе — физическом лице
 *
 * Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIOrderDeliveryApi::GetOrderBuyerInfoRequest : public Request
{
public:
    virtual ~GetOrderBuyerInfoRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	/* Идентификатор заказа. */
	int64 OrderId = 0;
};

class OPENAPI_API OpenAPIOrderDeliveryApi::GetOrderBuyerInfoResponse : public Response
{
public:
    virtual ~GetOrderBuyerInfoResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIGetOrderBuyerInfoResponse Content;
};

/* Изменение даты доставки заказа
 *
 * Метод изменяет дату доставки заказа в статусе &#x60;PROCESSING&#x60; или &#x60;DELIVERY&#x60;. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIOrderDeliveryApi::SetOrderDeliveryDateRequest : public Request
{
public:
    virtual ~SetOrderDeliveryDateRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	/* Идентификатор заказа. */
	int64 OrderId = 0;
	OpenAPISetOrderDeliveryDateRequest OpenAPISetOrderDeliveryDateRequest;
};

class OPENAPI_API OpenAPIOrderDeliveryApi::SetOrderDeliveryDateResponse : public Response
{
public:
    virtual ~SetOrderDeliveryDateResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIEmptyApiResponse Content;
};

/* Передача трек‑номера посылки
 *
 * {% note warning \&quot;Этот запрос только для DBS\&quot; %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIOrderDeliveryApi::SetOrderDeliveryTrackCodeRequest : public Request
{
public:
    virtual ~SetOrderDeliveryTrackCodeRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	/* Идентификатор заказа. */
	int64 OrderId = 0;
	OpenAPISetOrderDeliveryTrackCodeRequest OpenAPISetOrderDeliveryTrackCodeRequest;
};

class OPENAPI_API OpenAPIOrderDeliveryApi::SetOrderDeliveryTrackCodeResponse : public Response
{
public:
    virtual ~SetOrderDeliveryTrackCodeResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIEmptyApiResponse Content;
};

/* Продление срока хранения заказа
 *
 * Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе &#x60;PICKUP&#x60;. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре &#x60;outletStorageLimitDate&#x60; запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIOrderDeliveryApi::UpdateOrderStorageLimitRequest : public Request
{
public:
    virtual ~UpdateOrderStorageLimitRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	/* Идентификатор заказа. */
	int64 OrderId = 0;
	OpenAPIUpdateOrderStorageLimitRequest OpenAPIUpdateOrderStorageLimitRequest;
};

class OPENAPI_API OpenAPIOrderDeliveryApi::UpdateOrderStorageLimitResponse : public Response
{
public:
    virtual ~UpdateOrderStorageLimitResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIEmptyApiResponse Content;
};

/* Передача кода подтверждения
 *
 * Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
*/
class OPENAPI_API OpenAPIOrderDeliveryApi::VerifyOrderEacRequest : public Request
{
public:
    virtual ~VerifyOrderEacRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  */
	int64 CampaignId = 0;
	/* Идентификатор заказа. */
	int64 OrderId = 0;
	OpenAPIVerifyOrderEacRequest OpenAPIVerifyOrderEacRequest;
};

class OPENAPI_API OpenAPIOrderDeliveryApi::VerifyOrderEacResponse : public Response
{
public:
    virtual ~VerifyOrderEacResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIVerifyOrderEacResponse Content;
};

}
