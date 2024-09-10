# \ShipmentsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConfirmShipment**](ShipmentsAPI.md#ConfirmShipment) | **Post** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
[**DownloadShipmentAct**](ShipmentsAPI.md#DownloadShipmentAct) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
[**DownloadShipmentDiscrepancyAct**](ShipmentsAPI.md#DownloadShipmentDiscrepancyAct) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
[**DownloadShipmentInboundAct**](ShipmentsAPI.md#DownloadShipmentInboundAct) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
[**DownloadShipmentPalletLabels**](ShipmentsAPI.md#DownloadShipmentPalletLabels) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
[**DownloadShipmentReceptionTransferAct**](ShipmentsAPI.md#DownloadShipmentReceptionTransferAct) | **Get** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
[**DownloadShipmentTransportationWaybill**](ShipmentsAPI.md#DownloadShipmentTransportationWaybill) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
[**GetShipment**](ShipmentsAPI.md#GetShipment) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
[**GetShipmentOrdersInfo**](ShipmentsAPI.md#GetShipmentOrdersInfo) | **Get** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
[**SearchShipments**](ShipmentsAPI.md#SearchShipments) | **Put** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
[**SetShipmentPalletsCount**](ShipmentsAPI.md#SetShipmentPalletsCount) | **Put** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
[**TransferOrdersFromShipment**](ShipmentsAPI.md#TransferOrdersFromShipment) | **Post** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку



## ConfirmShipment

> EmptyApiResponse ConfirmShipment(ctx, campaignId, shipmentId).ConfirmShipmentRequest(confirmShipmentRequest).Execute()

Подтверждение отгрузки



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.
	confirmShipmentRequest := *openapiclient.NewConfirmShipmentRequest() // ConfirmShipmentRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.ConfirmShipment(context.Background(), campaignId, shipmentId).ConfirmShipmentRequest(confirmShipmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.ConfirmShipment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConfirmShipment`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.ConfirmShipment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiConfirmShipmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **confirmShipmentRequest** | [**ConfirmShipmentRequest**](ConfirmShipmentRequest.md) |  | 

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


## DownloadShipmentAct

> *os.File DownloadShipmentAct(ctx, campaignId, shipmentId).Execute()

Получение акта приема-передачи



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentAct(context.Background(), campaignId, shipmentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentAct``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentAct`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentAct`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentActRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



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


## DownloadShipmentDiscrepancyAct

> *os.File DownloadShipmentDiscrepancyAct(ctx, campaignId, shipmentId).Execute()

Получение акта расхождений



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentDiscrepancyAct(context.Background(), campaignId, shipmentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentDiscrepancyAct``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentDiscrepancyAct`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentDiscrepancyAct`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentDiscrepancyActRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DownloadShipmentInboundAct

> *os.File DownloadShipmentInboundAct(ctx, campaignId, shipmentId).Execute()

Получение фактического акта приема-передачи



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentInboundAct(context.Background(), campaignId, shipmentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentInboundAct``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentInboundAct`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentInboundAct`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentInboundActRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



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


## DownloadShipmentPalletLabels

> *os.File DownloadShipmentPalletLabels(ctx, campaignId, shipmentId).Format(format).Execute()

Ярлыки для доверительной приемки (FBS)



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.
	format := openapiclient.ShipmentPalletLabelPageFormatType("A4") // ShipmentPalletLabelPageFormatType | Формат страниц PDF-файла с ярлыками:  * `A4` — по 16 ярлыков на странице. * `A8` — по одному ярлыку на странице.  (optional) (default to "A8")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentPalletLabels(context.Background(), campaignId, shipmentId).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentPalletLabels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentPalletLabels`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentPalletLabels`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentPalletLabelsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **format** | [**ShipmentPalletLabelPageFormatType**](ShipmentPalletLabelPageFormatType.md) | Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  | [default to &quot;A8&quot;]

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


## DownloadShipmentReceptionTransferAct

> *os.File DownloadShipmentReceptionTransferAct(ctx, campaignId).WarehouseId(warehouseId).Execute()

Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее



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
	warehouseId := int32(123123) // int32 | Идентификатор склада. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentReceptionTransferAct(context.Background(), campaignId).WarehouseId(warehouseId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentReceptionTransferAct``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentReceptionTransferAct`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentReceptionTransferAct`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentReceptionTransferActRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **warehouseId** | **int32** | Идентификатор склада. | 

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


## DownloadShipmentTransportationWaybill

> *os.File DownloadShipmentTransportationWaybill(ctx, campaignId, shipmentId).Execute()

Получение транспортной накладной



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.DownloadShipmentTransportationWaybill(context.Background(), campaignId, shipmentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.DownloadShipmentTransportationWaybill``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DownloadShipmentTransportationWaybill`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.DownloadShipmentTransportationWaybill`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiDownloadShipmentTransportationWaybillRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetShipment

> GetShipmentResponse GetShipment(ctx, campaignId, shipmentId).CancelledOrders(cancelledOrders).Execute()

Получение информации об одной отгрузке



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.
	cancelledOrders := true // bool | Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`.  (optional) (default to true)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.GetShipment(context.Background(), campaignId, shipmentId).CancelledOrders(cancelledOrders).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.GetShipment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetShipment`: GetShipmentResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.GetShipment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetShipmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **cancelledOrders** | **bool** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [default to true]

### Return type

[**GetShipmentResponse**](GetShipmentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetShipmentOrdersInfo

> GetShipmentOrdersInfoResponse GetShipmentOrdersInfo(ctx, campaignId, shipmentId).Execute()

Получение информации о возможности печати ярлыков (FBS)



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.GetShipmentOrdersInfo(context.Background(), campaignId, shipmentId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.GetShipmentOrdersInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetShipmentOrdersInfo`: GetShipmentOrdersInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.GetShipmentOrdersInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetShipmentOrdersInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetShipmentOrdersInfoResponse**](GetShipmentOrdersInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchShipments

> SearchShipmentsResponse SearchShipments(ctx, campaignId).SearchShipmentsRequest(searchShipmentsRequest).PageToken(pageToken).Limit(limit).Execute()

Получение информации о нескольких отгрузках



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
	searchShipmentsRequest := *openapiclient.NewSearchShipmentsRequest(time.Now(), time.Now()) // SearchShipmentsRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.SearchShipments(context.Background(), campaignId).SearchShipmentsRequest(searchShipmentsRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.SearchShipments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchShipments`: SearchShipmentsResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.SearchShipments`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSearchShipmentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **searchShipmentsRequest** | [**SearchShipmentsRequest**](SearchShipmentsRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**SearchShipmentsResponse**](SearchShipmentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetShipmentPalletsCount

> EmptyApiResponse SetShipmentPalletsCount(ctx, campaignId, shipmentId).SetShipmentPalletsCountRequest(setShipmentPalletsCountRequest).Execute()

Передача количества упаковок в отгрузке



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.
	setShipmentPalletsCountRequest := *openapiclient.NewSetShipmentPalletsCountRequest(int32(123)) // SetShipmentPalletsCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.SetShipmentPalletsCount(context.Background(), campaignId, shipmentId).SetShipmentPalletsCountRequest(setShipmentPalletsCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.SetShipmentPalletsCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetShipmentPalletsCount`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.SetShipmentPalletsCount`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetShipmentPalletsCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setShipmentPalletsCountRequest** | [**SetShipmentPalletsCountRequest**](SetShipmentPalletsCountRequest.md) |  | 

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


## TransferOrdersFromShipment

> EmptyApiResponse TransferOrdersFromShipment(ctx, campaignId, shipmentId).TransferOrdersFromShipmentRequest(transferOrdersFromShipmentRequest).Execute()

Перенос заказов в следующую отгрузку



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
	shipmentId := int64(789) // int64 | Идентификатор отгрузки.
	transferOrdersFromShipmentRequest := *openapiclient.NewTransferOrdersFromShipmentRequest([]int64{int64(123)}) // TransferOrdersFromShipmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ShipmentsAPI.TransferOrdersFromShipment(context.Background(), campaignId, shipmentId).TransferOrdersFromShipmentRequest(transferOrdersFromShipmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ShipmentsAPI.TransferOrdersFromShipment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TransferOrdersFromShipment`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ShipmentsAPI.TransferOrdersFromShipment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**shipmentId** | **int64** | Идентификатор отгрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTransferOrdersFromShipmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **transferOrdersFromShipmentRequest** | [**TransferOrdersFromShipmentRequest**](TransferOrdersFromShipmentRequest.md) |  | 

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

