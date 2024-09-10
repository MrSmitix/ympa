# \OutletsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateOutlet**](OutletsAPI.md#CreateOutlet) | **Post** /campaigns/{campaignId}/outlets | Создание точки продаж
[**DeleteOutlet**](OutletsAPI.md#DeleteOutlet) | **Delete** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
[**GetOutlet**](OutletsAPI.md#GetOutlet) | **Get** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
[**GetOutlets**](OutletsAPI.md#GetOutlets) | **Get** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
[**UpdateOutlet**](OutletsAPI.md#UpdateOutlet) | **Put** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж



## CreateOutlet

> CreateOutletResponse CreateOutlet(ctx, campaignId).ChangeOutletRequest(changeOutletRequest).Execute()

Создание точки продаж



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
	changeOutletRequest := *openapiclient.NewChangeOutletRequest("Name_example", openapiclient.OutletType("DEPOT"), *openapiclient.NewOutletAddressDTO(int64(123)), []string{"Phones_example"}, *openapiclient.NewOutletWorkingScheduleDTO([]openapiclient.OutletWorkingScheduleItemDTO{*openapiclient.NewOutletWorkingScheduleItemDTO(openapiclient.DayOfWeekType("MONDAY"), openapiclient.DayOfWeekType("MONDAY"), "StartTime_example", "EndTime_example")})) // ChangeOutletRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletsAPI.CreateOutlet(context.Background(), campaignId).ChangeOutletRequest(changeOutletRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletsAPI.CreateOutlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateOutlet`: CreateOutletResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletsAPI.CreateOutlet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateOutletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  | 

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteOutlet

> EmptyApiResponse DeleteOutlet(ctx, campaignId, outletId).Execute()

Удаление точки продаж



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
	outletId := int64(789) // int64 | Идентификатор точки продаж.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletsAPI.DeleteOutlet(context.Background(), campaignId, outletId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletsAPI.DeleteOutlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteOutlet`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletsAPI.DeleteOutlet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**outletId** | **int64** | Идентификатор точки продаж. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteOutletRequest struct via the builder pattern


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


## GetOutlet

> GetOutletResponse GetOutlet(ctx, campaignId, outletId).Execute()

Информация об одной точке продаж



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
	outletId := int64(789) // int64 | Идентификатор точки продаж.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletsAPI.GetOutlet(context.Background(), campaignId, outletId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletsAPI.GetOutlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOutlet`: GetOutletResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletsAPI.GetOutlet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**outletId** | **int64** | Идентификатор точки продаж. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOutletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOutlets

> GetOutletsResponse GetOutlets(ctx, campaignId).PageToken(pageToken).RegionId(regionId).ShopOutletCode(shopOutletCode).RegionId2(regionId2).Execute()

Информация о нескольких точках продаж



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	regionId := int64(789) // int64 | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  (optional)
	shopOutletCode := "shopOutletCode_example" // string | Идентификатор точки продаж, присвоенный магазином. (optional)
	regionId2 := int64(789) // int64 | {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %}  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletsAPI.GetOutlets(context.Background(), campaignId).PageToken(pageToken).RegionId(regionId).ShopOutletCode(shopOutletCode).RegionId2(regionId2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletsAPI.GetOutlets``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOutlets`: GetOutletsResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletsAPI.GetOutlets`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOutletsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **regionId** | **int64** | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | 
 **shopOutletCode** | **string** | Идентификатор точки продаж, присвоенный магазином. | 
 **regionId2** | **int64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | 

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOutlet

> EmptyApiResponse UpdateOutlet(ctx, campaignId, outletId).ChangeOutletRequest(changeOutletRequest).Execute()

Изменение информации о точке продаж



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
	outletId := int64(789) // int64 | Идентификатор точки продаж.
	changeOutletRequest := *openapiclient.NewChangeOutletRequest("Name_example", openapiclient.OutletType("DEPOT"), *openapiclient.NewOutletAddressDTO(int64(123)), []string{"Phones_example"}, *openapiclient.NewOutletWorkingScheduleDTO([]openapiclient.OutletWorkingScheduleItemDTO{*openapiclient.NewOutletWorkingScheduleItemDTO(openapiclient.DayOfWeekType("MONDAY"), openapiclient.DayOfWeekType("MONDAY"), "StartTime_example", "EndTime_example")})) // ChangeOutletRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletsAPI.UpdateOutlet(context.Background(), campaignId, outletId).ChangeOutletRequest(changeOutletRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletsAPI.UpdateOutlet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOutlet`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletsAPI.UpdateOutlet`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**outletId** | **int64** | Идентификатор точки продаж. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOutletRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  | 

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

