# \OutletLicensesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteOutletLicenses**](OutletLicensesAPI.md#DeleteOutletLicenses) | **Delete** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
[**GetOutletLicenses**](OutletLicensesAPI.md#GetOutletLicenses) | **Get** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
[**UpdateOutletLicenses**](OutletLicensesAPI.md#UpdateOutletLicenses) | **Post** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж



## DeleteOutletLicenses

> EmptyApiResponse DeleteOutletLicenses(ctx, campaignId).Ids(ids).Execute()

Удаление лицензий для точек продаж



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
	ids := []int64{int64(123)} // []int64 | Список идентификаторов лицензий. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletLicensesAPI.DeleteOutletLicenses(context.Background(), campaignId).Ids(ids).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletLicensesAPI.DeleteOutletLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteOutletLicenses`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletLicensesAPI.DeleteOutletLicenses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteOutletLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **ids** | **[]int64** | Список идентификаторов лицензий. | 

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


## GetOutletLicenses

> GetOutletLicensesResponse GetOutletLicenses(ctx, campaignId).OutletIds(outletIds).Ids(ids).Execute()

Информация о лицензиях для точек продаж



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
	outletIds := []int64{int64(123)} // []int64 | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке.  (optional)
	ids := []int64{int64(123)} // []int64 | Список идентификаторов лицензий. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletLicensesAPI.GetOutletLicenses(context.Background(), campaignId).OutletIds(outletIds).Ids(ids).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletLicensesAPI.GetOutletLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOutletLicenses`: GetOutletLicensesResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletLicensesAPI.GetOutletLicenses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOutletLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **outletIds** | **[]int64** | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.  | 
 **ids** | **[]int64** | Список идентификаторов лицензий. | 

### Return type

[**GetOutletLicensesResponse**](GetOutletLicensesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOutletLicenses

> EmptyApiResponse UpdateOutletLicenses(ctx, campaignId).UpdateOutletLicenseRequest(updateOutletLicenseRequest).Execute()

Создание и изменение лицензий для точек продаж



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
	updateOutletLicenseRequest := *openapiclient.NewUpdateOutletLicenseRequest([]openapiclient.OutletLicenseDTO{*openapiclient.NewOutletLicenseDTO()}) // UpdateOutletLicenseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OutletLicensesAPI.UpdateOutletLicenses(context.Background(), campaignId).UpdateOutletLicenseRequest(updateOutletLicenseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OutletLicensesAPI.UpdateOutletLicenses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOutletLicenses`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OutletLicensesAPI.UpdateOutletLicenses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOutletLicensesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateOutletLicenseRequest** | [**UpdateOutletLicenseRequest**](UpdateOutletLicenseRequest.md) |  | 

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

