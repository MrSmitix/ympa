# \FeedbacksAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFeedbackAndCommentUpdates**](FeedbacksAPI.md#GetFeedbackAndCommentUpdates) | **Get** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине



## GetFeedbackAndCommentUpdates

> GetFeedbackListResponse GetFeedbackAndCommentUpdates(ctx, campaignId).PageToken(pageToken).Limit(limit).FromDate(fromDate).Execute()

Новые и обновленные отзывы о магазине



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	fromDate := time.Now() // string | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: `ГГГГ-ММ-ДД`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.FeedbacksAPI.GetFeedbackAndCommentUpdates(context.Background(), campaignId).PageToken(pageToken).Limit(limit).FromDate(fromDate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `FeedbacksAPI.GetFeedbackAndCommentUpdates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeedbackAndCommentUpdates`: GetFeedbackListResponse
	fmt.Fprintf(os.Stdout, "Response from `FeedbacksAPI.GetFeedbackAndCommentUpdates`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedbackAndCommentUpdatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **fromDate** | **string** | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

### Return type

[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

