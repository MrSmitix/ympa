# \GoodsStatsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetGoodsStats**](GoodsStatsAPI.md#GetGoodsStats) | **Post** /campaigns/{campaignId}/stats/skus | Отчет по товарам



## GetGoodsStats

> GetGoodsStatsResponse GetGoodsStats(ctx, campaignId).GetGoodsStatsRequest(getGoodsStatsRequest).Execute()

Отчет по товарам



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
	getGoodsStatsRequest := *openapiclient.NewGetGoodsStatsRequest([]string{"ShopSkus_example"}) // GetGoodsStatsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.GoodsStatsAPI.GetGoodsStats(context.Background(), campaignId).GetGoodsStatsRequest(getGoodsStatsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `GoodsStatsAPI.GetGoodsStats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetGoodsStats`: GetGoodsStatsResponse
	fmt.Fprintf(os.Stdout, "Response from `GoodsStatsAPI.GetGoodsStats`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetGoodsStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md) |  | 

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

