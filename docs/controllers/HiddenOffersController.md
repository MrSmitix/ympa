# HiddenOffersController

All URIs are relative to `""`

The controller class is defined in **[HiddenOffersController.java](../../src/main/java/org/openapitools/controller/HiddenOffersController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHiddenOffers**](#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**deleteHiddenOffers**](#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**getHiddenOffers**](#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах

<a id="addHiddenOffers"></a>
# **addHiddenOffers**
```java
Mono<EmptyApiResponse> HiddenOffersController.addHiddenOffers(campaignIdaddHiddenOffersRequest)
```

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**addHiddenOffersRequest** | [**AddHiddenOffersRequest**](../../docs/models/AddHiddenOffersRequest.md) | Запрос на скрытие оферов. |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="deleteHiddenOffers"></a>
# **deleteHiddenOffers**
```java
Mono<EmptyApiResponse> HiddenOffersController.deleteHiddenOffers(campaignIddeleteHiddenOffersRequest)
```

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](../../docs/models/DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getHiddenOffers"></a>
# **getHiddenOffers**
```java
Mono<GetHiddenOffersResponse> HiddenOffersController.getHiddenOffers(campaignIdofferIdpageTokenlimitoffsetpagepageSize)
```

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**offerId** | [**List&lt;@Pattern(regexp &#x3D; &quot;^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$&quot;)@Size(min &#x3D; 1, max &#x3D; 255)String&gt;**](../../docs/models/String.md) | Идентификатор скрытого предложения.  | [optional parameter]
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]
**offset** | `Integer` | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional parameter]
**page** | `Integer` | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`]
**pageSize** | `Integer` | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter]

### Return type
[**GetHiddenOffersResponse**](../../docs/models/GetHiddenOffersResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

