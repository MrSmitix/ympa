# ReturnsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReturn**](ReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**getReturnApplication**](ReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
| [**getReturnPhoto**](ReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**getReturns**](ReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**setReturnDecision**](ReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
| [**submitReturnDecision**](ReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |


## Creating ReturnsApi

To initiate an instance of `ReturnsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ReturnsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ReturnsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ReturnsApi returnsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getReturn"></a>
# **getReturn**
```java
Mono<GetReturnResponse> ReturnsApi.getReturn(campaignIdorderIdreturnId)
```

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |


### Return type
[**GetReturnResponse**](GetReturnResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getReturnApplication"></a>
# **getReturnApplication**
```java
Mono<File> ReturnsApi.getReturnApplication(campaignIdorderIdreturnId)
```

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`, `application/json`

<a id="getReturnPhoto"></a>
# **getReturnPhoto**
```java
Mono<File> ReturnsApi.getReturnPhoto(campaignIdorderIdreturnIditemIdimageHash)
```

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |
| **itemId** | `Long`| Идентификатор товара в возврате. | |
| **imageHash** | `String`| Хеш ссылки изображения для загрузки. | |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`, `application/json`

<a id="getReturns"></a>
# **getReturns**
```java
Mono<GetReturnsResponse> ReturnsApi.getReturns(campaignIdpageTokenlimitorderIdsstatusestypefromDatetoDatefromDate2toDate2)
```

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **orderIds** | [**List&lt;Long&gt;**](Long.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional parameter] |
| **statuses** | [**List&lt;RefundStatusType&gt;**](RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional parameter] |
| **type** | [**ReturnType**](.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional parameter] [enum: `UNREDEEMED`, `RETURN`] |
| **fromDate** | `LocalDate`| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter] |
| **toDate** | `LocalDate`| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter] |
| **fromDate2** | `LocalDate`| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter] |
| **toDate2** | `LocalDate`| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter] |


### Return type
[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="setReturnDecision"></a>
# **setReturnDecision**
```java
Mono<EmptyApiResponse> ReturnsApi.setReturnDecision(campaignIdorderIdreturnIdsetReturnDecisionRequest)
```

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |
| **setReturnDecisionRequest** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="submitReturnDecision"></a>
# **submitReturnDecision**
```java
Mono<EmptyApiResponse> ReturnsApi.submitReturnDecision(campaignIdorderIdreturnId)
```

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

