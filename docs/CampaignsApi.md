# CampaignsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
| [**getCampaignLogins**](CampaignsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
| [**getCampaignRegion**](CampaignsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
| [**getCampaignSettings**](CampaignsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
| [**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя |
| [**getCampaignsByLogin**](CampaignsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |


<a id="getCampaign"></a>
# **getCampaign**
> GetCampaignResponse getCampaign(campaignId)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignResponse = apiInstance.getCampaign(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaign")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignLogins"></a>
# **getCampaignLogins**
> GetCampaignLoginsResponse getCampaignLogins(campaignId)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignLoginsResponse = apiInstance.getCampaignLogins(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignLogins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignLogins")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignRegion"></a>
# **getCampaignRegion**
> GetCampaignRegionResponse getCampaignRegion(campaignId)

Регион магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignRegionResponse = apiInstance.getCampaignRegion(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignRegion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignRegion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignSettings"></a>
# **getCampaignSettings**
> GetCampaignSettingsResponse getCampaignSettings(campaignId)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignSettingsResponse = apiInstance.getCampaignSettings(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaigns"></a>
# **getCampaigns**
> GetCampaignsResponse getCampaigns(page, pageSize)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetCampaignsResponse = apiInstance.getCampaigns(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignsByLogin"></a>
# **getCampaignsByLogin**
> GetCampaignsResponse getCampaignsByLogin(login, page, pageSize)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CampaignsApi()
val login : kotlin.String = login_example // kotlin.String | Логин пользователя.
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetCampaignsResponse = apiInstance.getCampaignsByLogin(login, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CampaignsApi#getCampaignsByLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CampaignsApi#getCampaignsByLogin")
    e.printStackTrace()
}
```

### Parameters
| **login** | **kotlin.String**| Логин пользователя. | |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

