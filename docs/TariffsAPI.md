# \TariffsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculateTariffs**](TariffsAPI.md#CalculateTariffs) | **Post** /tariffs/calculate | Калькулятор стоимости услуг



## CalculateTariffs

> CalculateTariffsResponse CalculateTariffs(ctx).CalculateTariffsRequest(calculateTariffsRequest).Execute()

Калькулятор стоимости услуг



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
	calculateTariffsRequest := *openapiclient.NewCalculateTariffsRequest(*openapiclient.NewCalculateTariffsParametersDTO(), []openapiclient.CalculateTariffsOfferDTO{*openapiclient.NewCalculateTariffsOfferDTO(int64(123), float32(123), float32(123), float32(123), float32(123), float32(123))}) // CalculateTariffsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TariffsAPI.CalculateTariffs(context.Background()).CalculateTariffsRequest(calculateTariffsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TariffsAPI.CalculateTariffs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CalculateTariffs`: CalculateTariffsResponse
	fmt.Fprintf(os.Stdout, "Response from `TariffsAPI.CalculateTariffs`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCalculateTariffsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md) |  | 

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

