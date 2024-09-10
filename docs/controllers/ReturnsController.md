# ReturnsController

All URIs are relative to `""`

The controller class is defined in **[ReturnsController.java](../../src/main/java/org/openapitools/controller/ReturnsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturn**](#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**getReturnApplication**](#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**getReturnPhoto**](#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**getReturns**](#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**setReturnDecision**](#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**submitReturnDecision**](#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату

<a id="getReturn"></a>
# **getReturn**
```java
Mono<GetReturnResponse> ReturnsController.getReturn(campaignIdorderIdreturnId)
```

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**returnId** | `Long` | Идентификатор возврата. |

### Return type
[**GetReturnResponse**](../../docs/models/GetReturnResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getReturnApplication"></a>
# **getReturnApplication**
```java
Mono<CompletedFileUpload> ReturnsController.getReturnApplication(campaignIdorderIdreturnId)
```

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**returnId** | `Long` | Идентификатор возврата. |

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/octet-stream`, `application/json`

<a id="getReturnPhoto"></a>
# **getReturnPhoto**
```java
Mono<CompletedFileUpload> ReturnsController.getReturnPhoto(campaignIdorderIdreturnIditemIdimageHash)
```

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**returnId** | `Long` | Идентификатор возврата. |
**itemId** | `Long` | Идентификатор товара в возврате. |
**imageHash** | `String` | Хеш ссылки изображения для загрузки. |

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/octet-stream`, `application/json`

<a id="getReturns"></a>
# **getReturns**
```java
Mono<GetReturnsResponse> ReturnsController.getReturns(campaignIdpageTokenlimitorderIdsstatusestypefromDatetoDatefromDate2toDate2)
```

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]
**orderIds** | [**List&lt;Long&gt;**](../../docs/models/Long.md) | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional parameter]
**statuses** | [**List&lt;RefundStatusType&gt;**](../../docs/models/RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional parameter]
**type** | [**ReturnType**](../../docs/models/.md) | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional parameter] [enum: `UNREDEEMED`, `RETURN`]
**fromDate** | `LocalDate` | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter]
**toDate** | `LocalDate` | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter]
**fromDate2** | `LocalDate` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter]
**toDate2** | `LocalDate` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter]

### Return type
[**GetReturnsResponse**](../../docs/models/GetReturnsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="setReturnDecision"></a>
# **setReturnDecision**
```java
Mono<EmptyApiResponse> ReturnsController.setReturnDecision(campaignIdorderIdreturnIdsetReturnDecisionRequest)
```

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**returnId** | `Long` | Идентификатор возврата. |
**setReturnDecisionRequest** | [**SetReturnDecisionRequest**](../../docs/models/SetReturnDecisionRequest.md) |  |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="submitReturnDecision"></a>
# **submitReturnDecision**
```java
Mono<EmptyApiResponse> ReturnsController.submitReturnDecision(campaignIdorderIdreturnId)
```

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**returnId** | `Long` | Идентификатор возврата. |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

