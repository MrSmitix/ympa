# \WarehousesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFulfillmentWarehouses**](WarehousesAPI.md#GetFulfillmentWarehouses) | **Get** /warehouses | Идентификаторы складов Маркета (FBY)
[**GetWarehouses**](WarehousesAPI.md#GetWarehouses) | **Get** /businesses/{businessId}/warehouses | Список складов и групп складов



## GetFulfillmentWarehouses

> GetFulfillmentWarehousesResponse GetFulfillmentWarehouses(ctx).Execute()

Идентификаторы складов Маркета (FBY)



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WarehousesAPI.GetFulfillmentWarehouses(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WarehousesAPI.GetFulfillmentWarehouses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFulfillmentWarehouses`: GetFulfillmentWarehousesResponse
	fmt.Fprintf(os.Stdout, "Response from `WarehousesAPI.GetFulfillmentWarehouses`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetFulfillmentWarehousesRequest struct via the builder pattern


### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetWarehouses

> GetWarehousesResponse GetWarehouses(ctx, businessId).Execute()

Список складов и групп складов



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
	businessId := int64(789) // int64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.WarehousesAPI.GetWarehouses(context.Background(), businessId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `WarehousesAPI.GetWarehouses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetWarehouses`: GetWarehousesResponse
	fmt.Fprintf(os.Stdout, "Response from `WarehousesAPI.GetWarehouses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetWarehousesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

