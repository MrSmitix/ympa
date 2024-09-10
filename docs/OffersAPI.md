# \OffersAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteCampaignOffers**](OffersAPI.md#DeleteCampaignOffers) | **Post** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
[**GetAllOffers**](OffersAPI.md#GetAllOffers) | **Get** /campaigns/{campaignId}/offers/all | Все предложения магазина
[**GetCampaignOffers**](OffersAPI.md#GetCampaignOffers) | **Post** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
[**GetOfferRecommendations**](OffersAPI.md#GetOfferRecommendations) | **Post** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
[**GetOffers**](OffersAPI.md#GetOffers) | **Get** /campaigns/{campaignId}/offers | Предложения магазина
[**UpdateCampaignOffers**](OffersAPI.md#UpdateCampaignOffers) | **Post** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине



## DeleteCampaignOffers

> DeleteCampaignOffersResponse DeleteCampaignOffers(ctx, campaignId).DeleteCampaignOffersRequest(deleteCampaignOffersRequest).Execute()

Удаление товаров из ассортимента магазина



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
	deleteCampaignOffersRequest := *openapiclient.NewDeleteCampaignOffersRequest([]string{"OfferIds_example"}) // DeleteCampaignOffersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.DeleteCampaignOffers(context.Background(), campaignId).DeleteCampaignOffersRequest(deleteCampaignOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.DeleteCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteCampaignOffers`: DeleteCampaignOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.DeleteCampaignOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteCampaignOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md) |  | 

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllOffers

> GetAllOffersResponse GetAllOffers(ctx, campaignId).FeedId(feedId).Chunk(chunk).Execute()

Все предложения магазина



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
	feedId := int64(789) // int64 | Идентификатор прайс-листа. (optional)
	chunk := int32(56) // int32 | Номер сегмента с результатами.  Значение по умолчанию: `0`.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать `chunk=0` и т. д.  {% endnote %}  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.GetAllOffers(context.Background(), campaignId).FeedId(feedId).Chunk(chunk).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.GetAllOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAllOffers`: GetAllOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.GetAllOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAllOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **feedId** | **int64** | Идентификатор прайс-листа. | 
 **chunk** | **int32** | Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | 

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignOffers

> GetCampaignOffersResponse GetCampaignOffers(ctx, campaignId).GetCampaignOffersRequest(getCampaignOffersRequest).PageToken(pageToken).Limit(limit).Execute()

Информация о товарах, которые размещены в заданном магазине



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
	getCampaignOffersRequest := *openapiclient.NewGetCampaignOffersRequest() // GetCampaignOffersRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.GetCampaignOffers(context.Background(), campaignId).GetCampaignOffersRequest(getCampaignOffersRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.GetCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignOffers`: GetCampaignOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.GetCampaignOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOfferRecommendations

> GetOfferRecommendationsResponse GetOfferRecommendations(ctx, businessId).GetOfferRecommendationsRequest(getOfferRecommendationsRequest).PageToken(pageToken).Limit(limit).Execute()

Рекомендации Маркета, касающиеся цен



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
	getOfferRecommendationsRequest := *openapiclient.NewGetOfferRecommendationsRequest() // GetOfferRecommendationsRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.GetOfferRecommendations(context.Background(), businessId).GetOfferRecommendationsRequest(getOfferRecommendationsRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.GetOfferRecommendations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferRecommendations`: GetOfferRecommendationsResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.GetOfferRecommendations`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOfferRecommendationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOffers

> GetOffersResponse GetOffers(ctx, campaignId).Query(query).FeedId(feedId).ShopCategoryId(shopCategoryId).Currency(currency).Matched(matched).Page(page).PageSize(pageSize).Execute()

Предложения магазина



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
	query := "query_example" // string | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  (optional)
	feedId := int64(789) // int64 | Идентификатор прайс-листа. (optional)
	shopCategoryId := "shopCategoryId_example" // string | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  (optional)
	currency := openapiclient.CurrencyType("RUR") // CurrencyType | Валюта, в которой указана цена предложения.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  (optional)
	matched := true // bool | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * `0 / FALSE / NO` — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * `1 / TRUE / YES` — поиск выполняется среди предложений, соотнесенных с карточками моделей).  (optional)
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.GetOffers(context.Background(), campaignId).Query(query).FeedId(feedId).ShopCategoryId(shopCategoryId).Currency(currency).Matched(matched).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.GetOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOffers`: GetOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.GetOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **query** | **string** | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | 
 **feedId** | **int64** | Идентификатор прайс-листа. | 
 **shopCategoryId** | **string** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | 
 **currency** | [**CurrencyType**](CurrencyType.md) | Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | 
 **matched** | **bool** | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | 
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateCampaignOffers

> EmptyApiResponse UpdateCampaignOffers(ctx, campaignId).UpdateCampaignOffersRequest(updateCampaignOffersRequest).Execute()

Изменение условий продажи товаров в магазине



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
	updateCampaignOffersRequest := *openapiclient.NewUpdateCampaignOffersRequest([]openapiclient.UpdateCampaignOfferDTO{*openapiclient.NewUpdateCampaignOfferDTO("OfferId_example")}) // UpdateCampaignOffersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.OffersAPI.UpdateCampaignOffers(context.Background(), campaignId).UpdateCampaignOffersRequest(updateCampaignOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `OffersAPI.UpdateCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateCampaignOffers`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `OffersAPI.UpdateCampaignOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateCampaignOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md) |  | 

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

