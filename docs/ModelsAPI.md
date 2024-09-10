# \ModelsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetModel**](ModelsAPI.md#GetModel) | **Get** /models/{modelId} | Информация об одной модели
[**GetModelOffers**](ModelsAPI.md#GetModelOffers) | **Get** /models/{modelId}/offers | Список предложений для одной модели
[**GetModels**](ModelsAPI.md#GetModels) | **Post** /models | Информация о нескольких моделях
[**GetModelsOffers**](ModelsAPI.md#GetModelsOffers) | **Post** /models/offers | Список предложений для нескольких моделей
[**SearchModels**](ModelsAPI.md#SearchModels) | **Get** /models | Поиск модели товара



## GetModel

> GetModelsResponse GetModel(ctx, modelId).RegionId(regionId).Currency(currency).Execute()

Информация об одной модели



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	modelId := int64(789) // int64 | Идентификатор модели товара.
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.GetModel(context.Background(), modelId).RegionId(regionId).Currency(currency).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.GetModel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetModel`: GetModelsResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.GetModel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**modelId** | **int64** | Идентификатор модели товара. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetModelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | 

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetModelOffers

> GetModelsOffersResponse GetModelOffers(ctx, modelId).RegionId(regionId).Currency(currency).OrderByPrice(orderByPrice).Count(count).Page(page).Execute()

Список предложений для одной модели



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	modelId := int64(789) // int64 | Идентификатор модели товара.
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
	orderByPrice := openapiclient.SortOrderType("ASC") // SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  (optional)
	count := int32(56) // int32 | Количество предложений на странице ответа. (optional) (default to 10)
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.GetModelOffers(context.Background(), modelId).RegionId(regionId).Currency(currency).OrderByPrice(orderByPrice).Count(count).Page(page).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.GetModelOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetModelOffers`: GetModelsOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.GetModelOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**modelId** | **int64** | Идентификатор модели товара. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetModelOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | 
 **orderByPrice** | [**SortOrderType**](SortOrderType.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | 
 **count** | **int32** | Количество предложений на странице ответа. | [default to 10]
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetModels

> GetModelsResponse GetModels(ctx).RegionId(regionId).GetModelsRequest(getModelsRequest).Currency(currency).Execute()

Информация о нескольких моделях



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	getModelsRequest := *openapiclient.NewGetModelsRequest([]int64{int64(123)}) // GetModelsRequest | 
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.GetModels(context.Background()).RegionId(regionId).GetModelsRequest(getModelsRequest).Currency(currency).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.GetModels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetModels`: GetModelsResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.GetModels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetModelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **getModelsRequest** | [**GetModelsRequest**](GetModelsRequest.md) |  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | 

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetModelsOffers

> GetModelsOffersResponse GetModelsOffers(ctx).RegionId(regionId).GetModelsRequest(getModelsRequest).Currency(currency).OrderByPrice(orderByPrice).Execute()

Список предложений для нескольких моделей



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	getModelsRequest := *openapiclient.NewGetModelsRequest([]int64{int64(123)}) // GetModelsRequest | 
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
	orderByPrice := openapiclient.SortOrderType("ASC") // SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.GetModelsOffers(context.Background()).RegionId(regionId).GetModelsRequest(getModelsRequest).Currency(currency).OrderByPrice(orderByPrice).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.GetModelsOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetModelsOffers`: GetModelsOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.GetModelsOffers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetModelsOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **getModelsRequest** | [**GetModelsRequest**](GetModelsRequest.md) |  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | 
 **orderByPrice** | [**SortOrderType**](SortOrderType.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | 

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchModels

> SearchModelsResponse SearchModels(ctx).Query(query).RegionId(regionId).Currency(currency).Page(page).PageSize(pageSize).Execute()

Поиск модели товара



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	query := "query_example" // string | Поисковый запрос по названию модели товара.
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  (optional)
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ModelsAPI.SearchModels(context.Background()).Query(query).RegionId(regionId).Currency(currency).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ModelsAPI.SearchModels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchModels`: SearchModelsResponse
	fmt.Fprintf(os.Stdout, "Response from `ModelsAPI.SearchModels`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchModelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **string** | Поисковый запрос по названию модели товара. | 
 **regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | 
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**SearchModelsResponse**](SearchModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

