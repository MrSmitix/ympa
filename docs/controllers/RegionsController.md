# RegionsController

All URIs are relative to `""`

The controller class is defined in **[RegionsController.java](../../src/main/java/org/openapitools/controller/RegionsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchRegionChildren**](#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
[**searchRegionsById**](#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
[**searchRegionsByName**](#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени

<a id="searchRegionChildren"></a>
# **searchRegionChildren**
```java
Mono<GetRegionWithChildrenResponse> RegionsController.searchRegionChildren(regionIdpagepageSize)
```

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**regionId** | `Long` | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |
**page** | `Integer` | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`]
**pageSize** | `Integer` | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter]

### Return type
[**GetRegionWithChildrenResponse**](../../docs/models/GetRegionWithChildrenResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="searchRegionsById"></a>
# **searchRegionsById**
```java
Mono<GetRegionsResponse> RegionsController.searchRegionsById(regionId)
```

Информация о регионе

Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**regionId** | `Long` | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |

### Return type
[**GetRegionsResponse**](../../docs/models/GetRegionsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="searchRegionsByName"></a>
# **searchRegionsByName**
```java
Mono<GetRegionsResponse> RegionsController.searchRegionsByName(namepageTokenlimit)
```

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**name** | `String` | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]

### Return type
[**GetRegionsResponse**](../../docs/models/GetRegionsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

