# \ContentAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoryContentParameters**](ContentAPI.md#GetCategoryContentParameters) | **Post** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**GetOfferCardsContentStatus**](ContentAPI.md#GetOfferCardsContentStatus) | **Post** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**UpdateOfferContent**](ContentAPI.md#UpdateOfferContent) | **Post** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара



## GetCategoryContentParameters

> GetCategoryContentParametersResponse GetCategoryContentParameters(ctx, categoryId).Execute()

Списки характеристик товаров по категориям



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
	categoryId := int64(789) // int64 | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContentAPI.GetCategoryContentParameters(context.Background(), categoryId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContentAPI.GetCategoryContentParameters``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCategoryContentParameters`: GetCategoryContentParametersResponse
	fmt.Fprintf(os.Stdout, "Response from `ContentAPI.GetCategoryContentParameters`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**categoryId** | **int64** | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCategoryContentParametersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOfferCardsContentStatus

> GetOfferCardsContentStatusResponse GetOfferCardsContentStatus(ctx, businessId).PageToken(pageToken).Limit(limit).GetOfferCardsContentStatusRequest(getOfferCardsContentStatusRequest).Execute()

Получение информации о заполненности карточек магазина



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
	getOfferCardsContentStatusRequest := *openapiclient.NewGetOfferCardsContentStatusRequest() // GetOfferCardsContentStatusRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContentAPI.GetOfferCardsContentStatus(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetOfferCardsContentStatusRequest(getOfferCardsContentStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContentAPI.GetOfferCardsContentStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferCardsContentStatus`: GetOfferCardsContentStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `ContentAPI.GetOfferCardsContentStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOfferCardsContentStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md) |  | 

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOfferContent

> UpdateOfferContentResponse UpdateOfferContent(ctx, businessId).UpdateOfferContentRequest(updateOfferContentRequest).Execute()

Редактирование категорийных характеристик товара



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
	updateOfferContentRequest := *openapiclient.NewUpdateOfferContentRequest([]openapiclient.OfferContentDTO{*openapiclient.NewOfferContentDTO("OfferId_example", int32(123), []openapiclient.ParameterValueDTO{*openapiclient.NewParameterValueDTO(int64(123))})}) // UpdateOfferContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ContentAPI.UpdateOfferContent(context.Background(), businessId).UpdateOfferContentRequest(updateOfferContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ContentAPI.UpdateOfferContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOfferContent`: UpdateOfferContentResponse
	fmt.Fprintf(os.Stdout, "Response from `ContentAPI.UpdateOfferContent`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOfferContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md) |  | 

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

