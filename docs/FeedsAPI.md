# \FeedsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFeed**](FeedsAPI.md#GetFeed) | **Get** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**GetFeedIndexLogs**](FeedsAPI.md#GetFeedIndexLogs) | **Get** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**GetFeeds**](FeedsAPI.md#GetFeeds) | **Get** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**RefreshFeed**](FeedsAPI.md#RefreshFeed) | **Post** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**SetFeedParams**](FeedsAPI.md#SetFeedParams) | **Post** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа



## GetFeed

> GetFeedResponse GetFeed(ctx, campaignId, feedId).Execute()

Информация о прайс-листе



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
	campaignId := int64(789) // int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
	feedId := int64(789) // int64 | Идентификатор прайс-листа.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedsAPI.GetFeed(context.Background(), campaignId, feedId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedsAPI.GetFeed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeed`: GetFeedResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedsAPI.GetFeed`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFeedIndexLogs

> GetFeedIndexLogsResponse GetFeedIndexLogs(ctx, campaignId, feedId).Limit(limit).PublishedTimeFrom(publishedTimeFrom).PublishedTimeTo(publishedTimeTo).Status(status).Execute()

Отчет по индексации прайс-листа



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
    "time"
	openapiclient "github.com/yandex-market/yandex-market-partner-api"
)

func main() {
	campaignId := int64(789) // int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
	feedId := int64(789) // int64 | Идентификатор прайс-листа.
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	publishedTimeFrom := time.Now() // time.Time | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  (optional)
	publishedTimeTo := time.Now() // time.Time | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %}  (optional)
	status := openapiclient.FeedIndexLogsStatusType("ERROR") // FeedIndexLogsStatusType | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedsAPI.GetFeedIndexLogs(context.Background(), campaignId, feedId).Limit(limit).PublishedTimeFrom(publishedTimeFrom).PublishedTimeTo(publishedTimeTo).Status(status).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedsAPI.GetFeedIndexLogs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeedIndexLogs`: GetFeedIndexLogsResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedsAPI.GetFeedIndexLogs`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedIndexLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Количество значений на одной странице.  | 
 **publishedTimeFrom** | **time.Time** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | 
 **publishedTimeTo** | **time.Time** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | 
 **status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | 

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFeeds

> GetFeedsResponse GetFeeds(ctx, campaignId).Execute()

Список прайс-листов магазина



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
	campaignId := int64(789) // int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedsAPI.GetFeeds(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedsAPI.GetFeeds``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeeds`: GetFeedsResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedsAPI.GetFeeds`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RefreshFeed

> EmptyApiResponse RefreshFeed(ctx, campaignId, feedId).Execute()

Сообщить, что прайс-лист обновился



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
	campaignId := int64(789) // int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
	feedId := int64(789) // int64 | Идентификатор прайс-листа.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedsAPI.RefreshFeed(context.Background(), campaignId, feedId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedsAPI.RefreshFeed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RefreshFeed`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedsAPI.RefreshFeed`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRefreshFeedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetFeedParams

> EmptyApiResponse SetFeedParams(ctx, campaignId, feedId).SetFeedParamsRequest(setFeedParamsRequest).Execute()

Изменение параметров прайс-листа



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
	campaignId := int64(789) // int64 | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
	feedId := int64(789) // int64 | Идентификатор прайс-листа.
	setFeedParamsRequest := *openapiclient.NewSetFeedParamsRequest([]openapiclient.FeedParameterDTO{*openapiclient.NewFeedParameterDTO("Name_example")}) // SetFeedParamsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedsAPI.SetFeedParams(context.Background(), campaignId, feedId).SetFeedParamsRequest(setFeedParamsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedsAPI.SetFeedParams``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetFeedParams`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedsAPI.SetFeedParams`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetFeedParamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

