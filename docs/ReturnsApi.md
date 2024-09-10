# ReturnsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getReturn**](ReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**getReturnApplication**](ReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
| [**getReturnPhoto**](ReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**getReturns**](ReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**setReturnDecision**](ReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
| [**submitReturnDecision**](ReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |


<a id="getReturn"></a>
# **getReturn**
> GetReturnResponse getReturn(campaignId, orderId, returnId)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
try {
    val result : GetReturnResponse = apiInstance.getReturn(campaignId, orderId, returnId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#getReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#getReturn")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturnApplication"></a>
# **getReturnApplication**
> java.io.File getReturnApplication(campaignId, orderId, returnId)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
try {
    val result : java.io.File = apiInstance.getReturnApplication(campaignId, orderId, returnId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#getReturnApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#getReturnApplication")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a id="getReturnPhoto"></a>
# **getReturnPhoto**
> java.io.File getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
val itemId : kotlin.Long = 789 // kotlin.Long | Идентификатор товара в возврате.
val imageHash : kotlin.String = imageHash_example // kotlin.String | Хеш ссылки изображения для загрузки.
try {
    val result : java.io.File = apiInstance.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#getReturnPhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#getReturnPhoto")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |
| **itemId** | **kotlin.Long**| Идентификатор товара в возврате. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageHash** | **kotlin.String**| Хеш ссылки изображения для загрузки. | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a id="getReturns"></a>
# **getReturns**
> GetReturnsResponse getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val orderIds : kotlin.collections.List<kotlin.Long> =  // kotlin.collections.List<kotlin.Long> | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
val statuses : kotlin.collections.List<RefundStatusType> = STARTED_BY_USER,WAITING_FOR_DECISION // kotlin.collections.List<RefundStatusType> | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
val type : ReturnType =  // ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
val fromDate : java.time.LocalDate = 2022-10-31 // java.time.LocalDate | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
val toDate : java.time.LocalDate = 2022-11-30 // java.time.LocalDate | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
val fromDate2 : java.time.LocalDate = 2022-10-31 // java.time.LocalDate | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
val toDate2 : java.time.LocalDate = 2022-11-30 // java.time.LocalDate | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
try {
    val result : GetReturnsResponse = apiInstance.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#getReturns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#getReturns")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| **orderIds** | [**kotlin.collections.List&lt;kotlin.Long&gt;**](kotlin.Long.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] |
| **statuses** | [**kotlin.collections.List&lt;RefundStatusType&gt;**](RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] |
| **type** | [**ReturnType**](.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] [enum: UNREDEEMED, RETURN] |
| **fromDate** | **java.time.LocalDate**| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **toDate** | **java.time.LocalDate**| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **fromDate2** | **java.time.LocalDate**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toDate2** | **java.time.LocalDate**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="setReturnDecision"></a>
# **setReturnDecision**
> EmptyApiResponse setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
val setReturnDecisionRequest : SetReturnDecisionRequest =  // SetReturnDecisionRequest | 
try {
    val result : EmptyApiResponse = apiInstance.setReturnDecision(campaignId, orderId, returnId, setReturnDecisionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#setReturnDecision")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#setReturnDecision")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setReturnDecisionRequest** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="submitReturnDecision"></a>
# **submitReturnDecision**
> EmptyApiResponse submitReturnDecision(campaignId, orderId, returnId)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReturnsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
try {
    val result : EmptyApiResponse = apiInstance.submitReturnDecision(campaignId, orderId, returnId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnsApi#submitReturnDecision")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnsApi#submitReturnDecision")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

