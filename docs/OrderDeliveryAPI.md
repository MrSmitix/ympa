# \OrderDeliveryAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOrderBuyerInfo**](OrderDeliveryAPI.md#GetOrderBuyerInfo) | **Get** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
[**SetOrderDeliveryDate**](OrderDeliveryAPI.md#SetOrderDeliveryDate) | **Put** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
[**SetOrderDeliveryTrackCode**](OrderDeliveryAPI.md#SetOrderDeliveryTrackCode) | **Post** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
[**UpdateOrderStorageLimit**](OrderDeliveryAPI.md#UpdateOrderStorageLimit) | **Put** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
[**VerifyOrderEac**](OrderDeliveryAPI.md#VerifyOrderEac) | **Put** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения



## GetOrderBuyerInfo

> GetOrderBuyerInfoResponse GetOrderBuyerInfo(ctx, campaignId, orderId).Execute()

Информация о покупателе — физическом лице



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
	orderId := int64(789) // int64 | Идентификатор заказа.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderDeliveryAPI.GetOrderBuyerInfo(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderDeliveryAPI.GetOrderBuyerInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrderBuyerInfo`: GetOrderBuyerInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderDeliveryAPI.GetOrderBuyerInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrderBuyerInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetOrderBuyerInfoResponse**](GetOrderBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetOrderDeliveryDate

> EmptyApiResponse SetOrderDeliveryDate(ctx, campaignId, orderId).SetOrderDeliveryDateRequest(setOrderDeliveryDateRequest).Execute()

Изменение даты доставки заказа



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
	orderId := int64(789) // int64 | Идентификатор заказа.
	setOrderDeliveryDateRequest := *openapiclient.NewSetOrderDeliveryDateRequest(*openapiclient.NewOrderDeliveryDateDTO(time.Now()), openapiclient.OrderDeliveryDateReasonType("USER_MOVED_DELIVERY_DATES")) // SetOrderDeliveryDateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderDeliveryAPI.SetOrderDeliveryDate(context.Background(), campaignId, orderId).SetOrderDeliveryDateRequest(setOrderDeliveryDateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderDeliveryAPI.SetOrderDeliveryDate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetOrderDeliveryDate`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderDeliveryAPI.SetOrderDeliveryDate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetOrderDeliveryDateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setOrderDeliveryDateRequest** | [**SetOrderDeliveryDateRequest**](SetOrderDeliveryDateRequest.md) |  | 

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


## SetOrderDeliveryTrackCode

> EmptyApiResponse SetOrderDeliveryTrackCode(ctx, campaignId, orderId).SetOrderDeliveryTrackCodeRequest(setOrderDeliveryTrackCodeRequest).Execute()

Передача трек‑номера посылки



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
	orderId := int64(789) // int64 | Идентификатор заказа.
	setOrderDeliveryTrackCodeRequest := *openapiclient.NewSetOrderDeliveryTrackCodeRequest("TrackCode_example", int64(123)) // SetOrderDeliveryTrackCodeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderDeliveryAPI.SetOrderDeliveryTrackCode(context.Background(), campaignId, orderId).SetOrderDeliveryTrackCodeRequest(setOrderDeliveryTrackCodeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderDeliveryAPI.SetOrderDeliveryTrackCode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetOrderDeliveryTrackCode`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderDeliveryAPI.SetOrderDeliveryTrackCode`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetOrderDeliveryTrackCodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setOrderDeliveryTrackCodeRequest** | [**SetOrderDeliveryTrackCodeRequest**](SetOrderDeliveryTrackCodeRequest.md) |  | 

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


## UpdateOrderStorageLimit

> EmptyApiResponse UpdateOrderStorageLimit(ctx, campaignId, orderId).UpdateOrderStorageLimitRequest(updateOrderStorageLimitRequest).Execute()

Продление срока хранения заказа



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
	orderId := int64(789) // int64 | Идентификатор заказа.
	updateOrderStorageLimitRequest := *openapiclient.NewUpdateOrderStorageLimitRequest(time.Now()) // UpdateOrderStorageLimitRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderDeliveryAPI.UpdateOrderStorageLimit(context.Background(), campaignId, orderId).UpdateOrderStorageLimitRequest(updateOrderStorageLimitRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderDeliveryAPI.UpdateOrderStorageLimit``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOrderStorageLimit`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderDeliveryAPI.UpdateOrderStorageLimit`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrderStorageLimitRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **updateOrderStorageLimitRequest** | [**UpdateOrderStorageLimitRequest**](UpdateOrderStorageLimitRequest.md) |  | 

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


## VerifyOrderEac

> VerifyOrderEacResponse VerifyOrderEac(ctx, campaignId, orderId).VerifyOrderEacRequest(verifyOrderEacRequest).Execute()

Передача кода подтверждения



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
	orderId := int64(789) // int64 | Идентификатор заказа.
	verifyOrderEacRequest := *openapiclient.NewVerifyOrderEacRequest() // VerifyOrderEacRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderDeliveryAPI.VerifyOrderEac(context.Background(), campaignId, orderId).VerifyOrderEacRequest(verifyOrderEacRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderDeliveryAPI.VerifyOrderEac``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VerifyOrderEac`: VerifyOrderEacResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderDeliveryAPI.VerifyOrderEac`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiVerifyOrderEacRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **verifyOrderEacRequest** | [**VerifyOrderEacRequest**](VerifyOrderEacRequest.md) |  | 

### Return type

[**VerifyOrderEacResponse**](VerifyOrderEacResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

