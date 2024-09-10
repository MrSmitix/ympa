# \OrderLabelsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateOrderLabel**](OrderLabelsAPI.md#GenerateOrderLabel) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**GenerateOrderLabels**](OrderLabelsAPI.md#GenerateOrderLabels) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**GetOrderLabelsData**](OrderLabelsAPI.md#GetOrderLabelsData) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков



## GenerateOrderLabel

> *os.File GenerateOrderLabel(ctx, campaignId, orderId, shipmentId, boxId).Format(format).Execute()

Готовый ярлык‑наклейка для коробки в заказе



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
	shipmentId := int64(789) // int64 | Идентификатор грузоместа.
	boxId := int64(789) // int64 | Идентификатор коробки.
	format := openapiclient.PageFormatType("A7") // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderLabelsAPI.GenerateOrderLabel(context.Background(), campaignId, orderId, shipmentId, boxId).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderLabelsAPI.GenerateOrderLabel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateOrderLabel`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `OrderLabelsAPI.GenerateOrderLabel`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 
**shipmentId** | **int64** | Идентификатор грузоместа. | 
**boxId** | **int64** | Идентификатор коробки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateOrderLabelRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **format** | [**PageFormatType**](PageFormatType.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | 

### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateOrderLabels

> *os.File GenerateOrderLabels(ctx, campaignId, orderId).Format(format).Execute()

Готовые ярлыки‑наклейки на все коробки в одном заказе



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
	format := openapiclient.PageFormatType("A7") // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OrderLabelsAPI.GenerateOrderLabels(context.Background(), campaignId, orderId).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderLabelsAPI.GenerateOrderLabels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateOrderLabels`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `OrderLabelsAPI.GenerateOrderLabels`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGenerateOrderLabelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **format** | [**PageFormatType**](PageFormatType.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | 

### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOrderLabelsData

> GetOrderLabelsDataResponse GetOrderLabelsData(ctx, campaignId, orderId).Execute()

Данные для самостоятельного изготовления ярлыков



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
	resp, r, err := apiClient.OrderLabelsAPI.GetOrderLabelsData(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OrderLabelsAPI.GetOrderLabelsData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrderLabelsData`: GetOrderLabelsDataResponse
	fmt.Fprintf(os.Stdout, "Response from `OrderLabelsAPI.GetOrderLabelsData`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrderLabelsDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

