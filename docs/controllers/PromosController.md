# PromosController

All URIs are relative to `""`

The controller class is defined in **[PromosController.java](../../src/main/java/org/openapitools/controller/PromosController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePromoOffers**](#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**getPromoOffers**](#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**getPromos**](#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**updatePromoOffers**](#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен

<a id="deletePromoOffers"></a>
# **deletePromoOffers**
```java
Mono<DeletePromoOffersResponse> PromosController.deletePromoOffers(businessIddeletePromoOffersRequest)
```

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**deletePromoOffersRequest** | [**DeletePromoOffersRequest**](../../docs/models/DeletePromoOffersRequest.md) |  |

### Return type
[**DeletePromoOffersResponse**](../../docs/models/DeletePromoOffersResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getPromoOffers"></a>
# **getPromoOffers**
```java
Mono<GetPromoOffersResponse> PromosController.getPromoOffers(businessIdgetPromoOffersRequestpageTokenlimit)
```

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**getPromoOffersRequest** | [**GetPromoOffersRequest**](../../docs/models/GetPromoOffersRequest.md) |  |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]

### Return type
[**GetPromoOffersResponse**](../../docs/models/GetPromoOffersResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getPromos"></a>
# **getPromos**
```java
Mono<GetPromosResponse> PromosController.getPromos(businessIdgetPromosRequest)
```

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**getPromosRequest** | [**GetPromosRequest**](../../docs/models/GetPromosRequest.md) |  | [optional parameter]

### Return type
[**GetPromosResponse**](../../docs/models/GetPromosResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="updatePromoOffers"></a>
# **updatePromoOffers**
```java
Mono<UpdatePromoOffersResponse> PromosController.updatePromoOffers(businessIdupdatePromoOffersRequest)
```

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](../../docs/models/UpdatePromoOffersRequest.md) |  |

### Return type
[**UpdatePromoOffersResponse**](../../docs/models/UpdatePromoOffersResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

