# RegionsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**searchRegionChildren**](RegionsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
| [**searchRegionsById**](RegionsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе |
| [**searchRegionsByName**](RegionsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени |


<a id="searchRegionChildren"></a>
# **searchRegionChildren**
> GetRegionWithChildrenResponse searchRegionChildren(regionId, page, pageSize)

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = RegionsApi()
val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetRegionWithChildrenResponse = apiInstance.searchRegionChildren(regionId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegionsApi#searchRegionChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegionsApi#searchRegionChildren")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **kotlin.Long**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRegionsById"></a>
# **searchRegionsById**
> GetRegionsResponse searchRegionsById(regionId)

Информация о регионе

Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = RegionsApi()
val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
try {
    val result : GetRegionsResponse = apiInstance.searchRegionsById(regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegionsApi#searchRegionsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegionsApi#searchRegionsById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **regionId** | **kotlin.Long**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRegionsByName"></a>
# **searchRegionsByName**
> GetRegionsResponse searchRegionsByName(name, pageToken, limit)

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = RegionsApi()
val name : kotlin.String = name_example // kotlin.String | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetRegionsResponse = apiInstance.searchRegionsByName(name, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RegionsApi#searchRegionsByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RegionsApi#searchRegionsByName")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

