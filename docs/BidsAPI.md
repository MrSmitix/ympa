# \BidsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBidsInfoForBusiness**](BidsAPI.md#GetBidsInfoForBusiness) | **Post** /businesses/{businessId}/bids/info | Информация об установленных ставках
[**GetBidsRecommendations**](BidsAPI.md#GetBidsRecommendations) | **Post** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
[**PutBidsForBusiness**](BidsAPI.md#PutBidsForBusiness) | **Put** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
[**PutBidsForCampaign**](BidsAPI.md#PutBidsForCampaign) | **Put** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина



## GetBidsInfoForBusiness

> GetBidsInfoResponse GetBidsInfoForBusiness(ctx, businessId).PageToken(pageToken).Limit(limit).GetBidsInfoRequest(getBidsInfoRequest).Execute()

Информация об установленных ставках



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	getBidsInfoRequest := *openapiclient.NewGetBidsInfoRequest() // GetBidsInfoRequest | description (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BidsAPI.GetBidsInfoForBusiness(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetBidsInfoRequest(getBidsInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BidsAPI.GetBidsInfoForBusiness``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBidsInfoForBusiness`: GetBidsInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `BidsAPI.GetBidsInfoForBusiness`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBidsInfoForBusinessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getBidsInfoRequest** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md) | description | 

### Return type

[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBidsRecommendations

> GetBidsRecommendationsResponse GetBidsRecommendations(ctx, businessId).GetBidsRecommendationsRequest(getBidsRecommendationsRequest).Execute()

Рекомендованные ставки для заданных товаров



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
	getBidsRecommendationsRequest := *openapiclient.NewGetBidsRecommendationsRequest([]string{"Skus_example"}) // GetBidsRecommendationsRequest | description.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BidsAPI.GetBidsRecommendations(context.Background(), businessId).GetBidsRecommendationsRequest(getBidsRecommendationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BidsAPI.GetBidsRecommendations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBidsRecommendations`: GetBidsRecommendationsResponse
	fmt.Fprintf(os.Stdout, "Response from `BidsAPI.GetBidsRecommendations`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBidsRecommendationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getBidsRecommendationsRequest** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md) | description. | 

### Return type

[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PutBidsForBusiness

> EmptyApiResponse PutBidsForBusiness(ctx, businessId).PutSkuBidsRequest(putSkuBidsRequest).Execute()

Включение буста продаж и установка ставок



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
	putSkuBidsRequest := *openapiclient.NewPutSkuBidsRequest([]openapiclient.SkuBidItemDTO{*openapiclient.NewSkuBidItemDTO("Sku_example", int32(570))}) // PutSkuBidsRequest | description

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BidsAPI.PutBidsForBusiness(context.Background(), businessId).PutSkuBidsRequest(putSkuBidsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BidsAPI.PutBidsForBusiness``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutBidsForBusiness`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `BidsAPI.PutBidsForBusiness`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPutBidsForBusinessRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description | 

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


## PutBidsForCampaign

> EmptyApiResponse PutBidsForCampaign(ctx, campaignId).PutSkuBidsRequest(putSkuBidsRequest).Execute()

Включение буста продаж и установка ставок для магазина



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
	putSkuBidsRequest := *openapiclient.NewPutSkuBidsRequest([]openapiclient.SkuBidItemDTO{*openapiclient.NewSkuBidItemDTO("Sku_example", int32(570))}) // PutSkuBidsRequest | description

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BidsAPI.PutBidsForCampaign(context.Background(), campaignId).PutSkuBidsRequest(putSkuBidsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BidsAPI.PutBidsForCampaign``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutBidsForCampaign`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `BidsAPI.PutBidsForCampaign`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPutBidsForCampaignRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description | 

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

