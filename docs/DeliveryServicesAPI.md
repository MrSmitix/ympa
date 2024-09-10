# \DeliveryServicesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDeliveryServices**](DeliveryServicesAPI.md#GetDeliveryServices) | **Get** /delivery/services | Справочник служб доставки



## GetDeliveryServices

> GetDeliveryServicesResponse GetDeliveryServices(ctx).Execute()

Справочник служб доставки



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
	resp, r, err := apiClient.DeliveryServicesAPI.GetDeliveryServices(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DeliveryServicesAPI.GetDeliveryServices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDeliveryServices`: GetDeliveryServicesResponse
	fmt.Fprintf(os.Stdout, "Response from `DeliveryServicesAPI.GetDeliveryServices`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetDeliveryServicesRequest struct via the builder pattern


### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

