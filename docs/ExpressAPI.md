# \ExpressAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddHiddenOffers**](ExpressAPI.md#AddHiddenOffers) | **Post** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**AddOffersToArchive**](ExpressAPI.md#AddOffersToArchive) | **Post** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**CalculateTariffs**](ExpressAPI.md#CalculateTariffs) | **Post** /tariffs/calculate | Калькулятор стоимости услуг
[**ConfirmBusinessPrices**](ExpressAPI.md#ConfirmBusinessPrices) | **Post** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**ConfirmCampaignPrices**](ExpressAPI.md#ConfirmCampaignPrices) | **Post** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**CreateChat**](ExpressAPI.md#CreateChat) | **Post** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**DeleteCampaignOffers**](ExpressAPI.md#DeleteCampaignOffers) | **Post** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
[**DeleteGoodsFeedbackComment**](ExpressAPI.md#DeleteGoodsFeedbackComment) | **Post** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**DeleteHiddenOffers**](ExpressAPI.md#DeleteHiddenOffers) | **Post** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**DeleteOffers**](ExpressAPI.md#DeleteOffers) | **Post** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**DeleteOffersFromArchive**](ExpressAPI.md#DeleteOffersFromArchive) | **Post** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**DeletePromoOffers**](ExpressAPI.md#DeletePromoOffers) | **Post** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**GenerateBoostConsolidatedReport**](ExpressAPI.md#GenerateBoostConsolidatedReport) | **Post** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**GenerateCompetitorsPositionReport**](ExpressAPI.md#GenerateCompetitorsPositionReport) | **Post** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**GenerateGoodsFeedbackReport**](ExpressAPI.md#GenerateGoodsFeedbackReport) | **Post** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**GenerateGoodsRealizationReport**](ExpressAPI.md#GenerateGoodsRealizationReport) | **Post** /reports/goods-realization/generate | Отчет по реализации
[**GenerateMassOrderLabelsReport**](ExpressAPI.md#GenerateMassOrderLabelsReport) | **Post** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**GenerateOrderLabel**](ExpressAPI.md#GenerateOrderLabel) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**GenerateOrderLabels**](ExpressAPI.md#GenerateOrderLabels) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**GeneratePricesReport**](ExpressAPI.md#GeneratePricesReport) | **Post** /reports/prices/generate | Отчет «Цены на рынке»
[**GenerateShelfsStatisticsReport**](ExpressAPI.md#GenerateShelfsStatisticsReport) | **Post** /reports/shelf-statistics/generate | Отчет по полкам
[**GenerateShowsSalesReport**](ExpressAPI.md#GenerateShowsSalesReport) | **Post** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**GenerateStocksOnWarehousesReport**](ExpressAPI.md#GenerateStocksOnWarehousesReport) | **Post** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**GenerateUnitedMarketplaceServicesReport**](ExpressAPI.md#GenerateUnitedMarketplaceServicesReport) | **Post** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**GenerateUnitedNettingReport**](ExpressAPI.md#GenerateUnitedNettingReport) | **Post** /reports/united-netting/generate | Отчет по платежам
[**GenerateUnitedOrdersReport**](ExpressAPI.md#GenerateUnitedOrdersReport) | **Post** /reports/united-orders/generate | Отчет по заказам
[**GetAllOffers**](ExpressAPI.md#GetAllOffers) | **Get** /campaigns/{campaignId}/offers/all | Все предложения магазина
[**GetBidsInfoForBusiness**](ExpressAPI.md#GetBidsInfoForBusiness) | **Post** /businesses/{businessId}/bids/info | Информация об установленных ставках
[**GetBidsRecommendations**](ExpressAPI.md#GetBidsRecommendations) | **Post** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
[**GetBusinessQuarantineOffers**](ExpressAPI.md#GetBusinessQuarantineOffers) | **Post** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**GetBusinessSettings**](ExpressAPI.md#GetBusinessSettings) | **Post** /businesses/{businessId}/settings | Настройки кабинета
[**GetCampaign**](ExpressAPI.md#GetCampaign) | **Get** /campaigns/{campaignId} | Информация о магазине
[**GetCampaignLogins**](ExpressAPI.md#GetCampaignLogins) | **Get** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**GetCampaignOffers**](ExpressAPI.md#GetCampaignOffers) | **Post** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
[**GetCampaignQuarantineOffers**](ExpressAPI.md#GetCampaignQuarantineOffers) | **Post** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
[**GetCampaignRegion**](ExpressAPI.md#GetCampaignRegion) | **Get** /campaigns/{campaignId}/region | Регион магазина
[**GetCampaignSettings**](ExpressAPI.md#GetCampaignSettings) | **Get** /campaigns/{campaignId}/settings | Настройки магазина
[**GetCampaigns**](ExpressAPI.md#GetCampaigns) | **Get** /campaigns | Список магазинов пользователя
[**GetCampaignsByLogin**](ExpressAPI.md#GetCampaignsByLogin) | **Get** /campaigns/by_login/{login} | Магазины, доступные логину
[**GetCategoriesMaxSaleQuantum**](ExpressAPI.md#GetCategoriesMaxSaleQuantum) | **Post** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**GetCategoriesTree**](ExpressAPI.md#GetCategoriesTree) | **Post** /categories/tree | Дерево категорий
[**GetCategoryContentParameters**](ExpressAPI.md#GetCategoryContentParameters) | **Post** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**GetChatHistory**](ExpressAPI.md#GetChatHistory) | **Post** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**GetChats**](ExpressAPI.md#GetChats) | **Post** /businesses/{businessId}/chats | Получение доступных чатов
[**GetDeliveryServices**](ExpressAPI.md#GetDeliveryServices) | **Get** /delivery/services | Справочник служб доставки
[**GetFeed**](ExpressAPI.md#GetFeed) | **Get** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**GetFeedIndexLogs**](ExpressAPI.md#GetFeedIndexLogs) | **Get** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**GetFeedbackAndCommentUpdates**](ExpressAPI.md#GetFeedbackAndCommentUpdates) | **Get** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
[**GetFeeds**](ExpressAPI.md#GetFeeds) | **Get** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**GetGoodsFeedbackComments**](ExpressAPI.md#GetGoodsFeedbackComments) | **Post** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**GetGoodsFeedbacks**](ExpressAPI.md#GetGoodsFeedbacks) | **Post** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**GetGoodsStats**](ExpressAPI.md#GetGoodsStats) | **Post** /campaigns/{campaignId}/stats/skus | Отчет по товарам
[**GetHiddenOffers**](ExpressAPI.md#GetHiddenOffers) | **Get** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
[**GetOfferCardsContentStatus**](ExpressAPI.md#GetOfferCardsContentStatus) | **Post** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**GetOfferMappingEntries**](ExpressAPI.md#GetOfferMappingEntries) | **Get** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
[**GetOfferMappings**](ExpressAPI.md#GetOfferMappings) | **Post** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**GetOfferRecommendations**](ExpressAPI.md#GetOfferRecommendations) | **Post** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
[**GetOffers**](ExpressAPI.md#GetOffers) | **Get** /campaigns/{campaignId}/offers | Предложения магазина
[**GetOrder**](ExpressAPI.md#GetOrder) | **Get** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
[**GetOrderBusinessBuyerInfo**](ExpressAPI.md#GetOrderBusinessBuyerInfo) | **Post** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**GetOrderBusinessDocumentsInfo**](ExpressAPI.md#GetOrderBusinessDocumentsInfo) | **Post** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
[**GetOrderLabelsData**](ExpressAPI.md#GetOrderLabelsData) | **Get** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
[**GetOrders**](ExpressAPI.md#GetOrders) | **Get** /campaigns/{campaignId}/orders | Информация о нескольких заказах
[**GetOrdersStats**](ExpressAPI.md#GetOrdersStats) | **Post** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
[**GetPrices**](ExpressAPI.md#GetPrices) | **Get** /campaigns/{campaignId}/offer-prices | Список цен
[**GetPricesByOfferIds**](ExpressAPI.md#GetPricesByOfferIds) | **Post** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**GetPromoOffers**](ExpressAPI.md#GetPromoOffers) | **Post** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**GetPromos**](ExpressAPI.md#GetPromos) | **Post** /businesses/{businessId}/promos | Получение списка акций
[**GetQualityRatingDetails**](ExpressAPI.md#GetQualityRatingDetails) | **Post** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**GetQualityRatings**](ExpressAPI.md#GetQualityRatings) | **Post** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
[**GetReportInfo**](ExpressAPI.md#GetReportInfo) | **Get** /reports/info/{reportId} | Получение заданного отчета
[**GetReturn**](ExpressAPI.md#GetReturn) | **Get** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**GetReturnApplication**](ExpressAPI.md#GetReturnApplication) | **Get** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**GetReturnPhoto**](ExpressAPI.md#GetReturnPhoto) | **Get** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**GetReturns**](ExpressAPI.md#GetReturns) | **Get** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**GetStocks**](ExpressAPI.md#GetStocks) | **Post** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
[**GetSuggestedOfferMappingEntries**](ExpressAPI.md#GetSuggestedOfferMappingEntries) | **Post** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
[**GetSuggestedOfferMappings**](ExpressAPI.md#GetSuggestedOfferMappings) | **Post** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**GetSuggestedPrices**](ExpressAPI.md#GetSuggestedPrices) | **Post** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**GetWarehouses**](ExpressAPI.md#GetWarehouses) | **Get** /businesses/{businessId}/warehouses | Список складов и групп складов
[**ProvideOrderItemIdentifiers**](ExpressAPI.md#ProvideOrderItemIdentifiers) | **Put** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
[**PutBidsForBusiness**](ExpressAPI.md#PutBidsForBusiness) | **Put** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
[**PutBidsForCampaign**](ExpressAPI.md#PutBidsForCampaign) | **Put** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
[**RefreshFeed**](ExpressAPI.md#RefreshFeed) | **Post** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**SearchRegionChildren**](ExpressAPI.md#SearchRegionChildren) | **Get** /regions/{regionId}/children | Информация о дочерних регионах
[**SearchRegionsById**](ExpressAPI.md#SearchRegionsById) | **Get** /regions/{regionId} | Информация о регионе
[**SearchRegionsByName**](ExpressAPI.md#SearchRegionsByName) | **Get** /regions | Поиск регионов по их имени
[**SendFileToChat**](ExpressAPI.md#SendFileToChat) | **Post** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**SendMessageToChat**](ExpressAPI.md#SendMessageToChat) | **Post** /businesses/{businessId}/chats/message | Отправка сообщения в чат
[**SetFeedParams**](ExpressAPI.md#SetFeedParams) | **Post** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
[**SetOrderBoxLayout**](ExpressAPI.md#SetOrderBoxLayout) | **Put** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
[**SetOrderShipmentBoxes**](ExpressAPI.md#SetOrderShipmentBoxes) | **Put** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
[**SkipGoodsFeedbacksReaction**](ExpressAPI.md#SkipGoodsFeedbacksReaction) | **Post** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**UpdateBusinessPrices**](ExpressAPI.md#UpdateBusinessPrices) | **Post** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**UpdateCampaignOffers**](ExpressAPI.md#UpdateCampaignOffers) | **Post** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
[**UpdateGoodsFeedbackComment**](ExpressAPI.md#UpdateGoodsFeedbackComment) | **Post** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
[**UpdateOfferContent**](ExpressAPI.md#UpdateOfferContent) | **Post** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
[**UpdateOfferMappingEntries**](ExpressAPI.md#UpdateOfferMappingEntries) | **Post** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
[**UpdateOfferMappings**](ExpressAPI.md#UpdateOfferMappings) | **Post** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
[**UpdateOrderItems**](ExpressAPI.md#UpdateOrderItems) | **Put** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
[**UpdateOrderStatus**](ExpressAPI.md#UpdateOrderStatus) | **Put** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
[**UpdateOrderStatuses**](ExpressAPI.md#UpdateOrderStatuses) | **Post** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
[**UpdatePrices**](ExpressAPI.md#UpdatePrices) | **Post** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
[**UpdatePromoOffers**](ExpressAPI.md#UpdatePromoOffers) | **Post** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
[**UpdateStocks**](ExpressAPI.md#UpdateStocks) | **Put** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
[**VerifyOrderEac**](ExpressAPI.md#VerifyOrderEac) | **Put** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения



## AddHiddenOffers

> EmptyApiResponse AddHiddenOffers(ctx, campaignId).AddHiddenOffersRequest(addHiddenOffersRequest).Execute()

Скрытие товаров и настройки скрытия



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
	addHiddenOffersRequest := *openapiclient.NewAddHiddenOffersRequest([]openapiclient.HiddenOfferDTO{*openapiclient.NewHiddenOfferDTO("OfferId_example")}) // AddHiddenOffersRequest | Запрос на скрытие оферов.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.AddHiddenOffers(context.Background(), campaignId).AddHiddenOffersRequest(addHiddenOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.AddHiddenOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddHiddenOffers`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.AddHiddenOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddHiddenOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **addHiddenOffersRequest** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md) | Запрос на скрытие оферов. | 

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


## AddOffersToArchive

> AddOffersToArchiveResponse AddOffersToArchive(ctx, businessId).AddOffersToArchiveRequest(addOffersToArchiveRequest).Execute()

Добавление товаров в архив



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
	addOffersToArchiveRequest := *openapiclient.NewAddOffersToArchiveRequest([]string{"OfferIds_example"}) // AddOffersToArchiveRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.AddOffersToArchive(context.Background(), businessId).AddOffersToArchiveRequest(addOffersToArchiveRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.AddOffersToArchive``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddOffersToArchive`: AddOffersToArchiveResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.AddOffersToArchive`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddOffersToArchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **addOffersToArchiveRequest** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md) |  | 

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.CalculateTariffs(context.Background()).CalculateTariffsRequest(calculateTariffsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.CalculateTariffs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CalculateTariffs`: CalculateTariffsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.CalculateTariffs`: %v\n", resp)
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


## ConfirmBusinessPrices

> EmptyApiResponse ConfirmBusinessPrices(ctx, businessId).ConfirmPricesRequest(confirmPricesRequest).Execute()

Удаление товара из карантина по цене в кабинете



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
	confirmPricesRequest := *openapiclient.NewConfirmPricesRequest([]string{"OfferIds_example"}) // ConfirmPricesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.ConfirmBusinessPrices(context.Background(), businessId).ConfirmPricesRequest(confirmPricesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.ConfirmBusinessPrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConfirmBusinessPrices`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.ConfirmBusinessPrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiConfirmBusinessPricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  | 

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


## ConfirmCampaignPrices

> EmptyApiResponse ConfirmCampaignPrices(ctx, campaignId).ConfirmPricesRequest(confirmPricesRequest).Execute()

Удаление товара из карантина по цене в магазине



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
	confirmPricesRequest := *openapiclient.NewConfirmPricesRequest([]string{"OfferIds_example"}) // ConfirmPricesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.ConfirmCampaignPrices(context.Background(), campaignId).ConfirmPricesRequest(confirmPricesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.ConfirmCampaignPrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ConfirmCampaignPrices`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.ConfirmCampaignPrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiConfirmCampaignPricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  | 

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


## CreateChat

> CreateChatResponse CreateChat(ctx, businessId).CreateChatRequest(createChatRequest).Execute()

Создание нового чата с покупателем



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
	createChatRequest := *openapiclient.NewCreateChatRequest(int64(123)) // CreateChatRequest | description

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.CreateChat(context.Background(), businessId).CreateChatRequest(createChatRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.CreateChat``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateChat`: CreateChatResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.CreateChat`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateChatRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md) | description | 

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.DeleteCampaignOffers(context.Background(), campaignId).DeleteCampaignOffersRequest(deleteCampaignOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeleteCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteCampaignOffers`: DeleteCampaignOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeleteCampaignOffers`: %v\n", resp)
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


## DeleteGoodsFeedbackComment

> EmptyApiResponse DeleteGoodsFeedbackComment(ctx, businessId).DeleteGoodsFeedbackCommentRequest(deleteGoodsFeedbackCommentRequest).Execute()

Удаление комментария к отзыву



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
	deleteGoodsFeedbackCommentRequest := *openapiclient.NewDeleteGoodsFeedbackCommentRequest(int64(123)) // DeleteGoodsFeedbackCommentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.DeleteGoodsFeedbackComment(context.Background(), businessId).DeleteGoodsFeedbackCommentRequest(deleteGoodsFeedbackCommentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeleteGoodsFeedbackComment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteGoodsFeedbackComment`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeleteGoodsFeedbackComment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteGoodsFeedbackCommentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md) |  | 

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


## DeleteHiddenOffers

> EmptyApiResponse DeleteHiddenOffers(ctx, campaignId).DeleteHiddenOffersRequest(deleteHiddenOffersRequest).Execute()

Возобновление показа товаров



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
	deleteHiddenOffersRequest := *openapiclient.NewDeleteHiddenOffersRequest([]openapiclient.HiddenOfferDTO{*openapiclient.NewHiddenOfferDTO("OfferId_example")}) // DeleteHiddenOffersRequest | Запрос на возобновление показа оферов.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.DeleteHiddenOffers(context.Background(), campaignId).DeleteHiddenOffersRequest(deleteHiddenOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeleteHiddenOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteHiddenOffers`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeleteHiddenOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteHiddenOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. | 

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


## DeleteOffers

> DeleteOffersResponse DeleteOffers(ctx, businessId).DeleteOffersRequest(deleteOffersRequest).Execute()

Удаление товаров из каталога



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
	deleteOffersRequest := *openapiclient.NewDeleteOffersRequest([]string{"OfferIds_example"}) // DeleteOffersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.DeleteOffers(context.Background(), businessId).DeleteOffersRequest(deleteOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeleteOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteOffers`: DeleteOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeleteOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deleteOffersRequest** | [**DeleteOffersRequest**](DeleteOffersRequest.md) |  | 

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteOffersFromArchive

> DeleteOffersFromArchiveResponse DeleteOffersFromArchive(ctx, businessId).DeleteOffersFromArchiveRequest(deleteOffersFromArchiveRequest).Execute()

Удаление товаров из архива



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
	deleteOffersFromArchiveRequest := *openapiclient.NewDeleteOffersFromArchiveRequest([]string{"OfferIds_example"}) // DeleteOffersFromArchiveRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.DeleteOffersFromArchive(context.Background(), businessId).DeleteOffersFromArchiveRequest(deleteOffersFromArchiveRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeleteOffersFromArchive``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteOffersFromArchive`: DeleteOffersFromArchiveResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeleteOffersFromArchive`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteOffersFromArchiveRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deleteOffersFromArchiveRequest** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md) |  | 

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeletePromoOffers

> DeletePromoOffersResponse DeletePromoOffers(ctx, businessId).DeletePromoOffersRequest(deletePromoOffersRequest).Execute()

Удаление товаров из акции



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
	deletePromoOffersRequest := *openapiclient.NewDeletePromoOffersRequest("PromoId_example") // DeletePromoOffersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.DeletePromoOffers(context.Background(), businessId).DeletePromoOffersRequest(deletePromoOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.DeletePromoOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeletePromoOffers`: DeletePromoOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.DeletePromoOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeletePromoOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **deletePromoOffersRequest** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md) |  | 

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateBoostConsolidatedReport

> GenerateReportResponse GenerateBoostConsolidatedReport(ctx).GenerateBoostConsolidatedRequest(generateBoostConsolidatedRequest).Format(format).Execute()

Отчет по бусту продаж



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
	generateBoostConsolidatedRequest := *openapiclient.NewGenerateBoostConsolidatedRequest(int64(123), time.Now(), time.Now()) // GenerateBoostConsolidatedRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateBoostConsolidatedReport(context.Background()).GenerateBoostConsolidatedRequest(generateBoostConsolidatedRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateBoostConsolidatedReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateBoostConsolidatedReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateBoostConsolidatedReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateBoostConsolidatedReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateCompetitorsPositionReport

> GenerateReportResponse GenerateCompetitorsPositionReport(ctx).GenerateCompetitorsPositionReportRequest(generateCompetitorsPositionReportRequest).Format(format).Execute()

Отчет «Конкурентная позиция»



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
	generateCompetitorsPositionReportRequest := *openapiclient.NewGenerateCompetitorsPositionReportRequest(int64(123), int64(123), time.Now(), time.Now()) // GenerateCompetitorsPositionReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateCompetitorsPositionReport(context.Background()).GenerateCompetitorsPositionReportRequest(generateCompetitorsPositionReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateCompetitorsPositionReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateCompetitorsPositionReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateCompetitorsPositionReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateCompetitorsPositionReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateGoodsFeedbackReport

> GenerateReportResponse GenerateGoodsFeedbackReport(ctx).GenerateGoodsFeedbackRequest(generateGoodsFeedbackRequest).Format(format).Execute()

Отчет по отзывам о товарах



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
	generateGoodsFeedbackRequest := *openapiclient.NewGenerateGoodsFeedbackRequest(int64(123)) // GenerateGoodsFeedbackRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateGoodsFeedbackReport(context.Background()).GenerateGoodsFeedbackRequest(generateGoodsFeedbackRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateGoodsFeedbackReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateGoodsFeedbackReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateGoodsFeedbackReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateGoodsFeedbackReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateGoodsRealizationReport

> GenerateReportResponse GenerateGoodsRealizationReport(ctx).GenerateGoodsRealizationReportRequest(generateGoodsRealizationReportRequest).Format(format).Execute()

Отчет по реализации



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
	generateGoodsRealizationReportRequest := *openapiclient.NewGenerateGoodsRealizationReportRequest(int64(123), int32(123), int32(123)) // GenerateGoodsRealizationReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateGoodsRealizationReport(context.Background()).GenerateGoodsRealizationReportRequest(generateGoodsRealizationReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateGoodsRealizationReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateGoodsRealizationReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateGoodsRealizationReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateGoodsRealizationReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateMassOrderLabelsReport

> GenerateReportResponse GenerateMassOrderLabelsReport(ctx).GenerateMassOrderLabelsRequest(generateMassOrderLabelsRequest).Format(format).Execute()

Готовые ярлыки‑наклейки на все коробки в нескольких заказах



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
	generateMassOrderLabelsRequest := *openapiclient.NewGenerateMassOrderLabelsRequest(int64(123), []int64{int64(123)}) // GenerateMassOrderLabelsRequest | 
	format := openapiclient.PageFormatType("A7") // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateMassOrderLabelsReport(context.Background()).GenerateMassOrderLabelsRequest(generateMassOrderLabelsRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateMassOrderLabelsReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateMassOrderLabelsReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateMassOrderLabelsReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateMassOrderLabelsReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md) |  | 
 **format** | [**PageFormatType**](PageFormatType.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.GenerateOrderLabel(context.Background(), campaignId, orderId, shipmentId, boxId).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateOrderLabel``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateOrderLabel`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateOrderLabel`: %v\n", resp)
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
	resp, r, err := apiClient.ExpressAPI.GenerateOrderLabels(context.Background(), campaignId, orderId).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateOrderLabels``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateOrderLabels`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateOrderLabels`: %v\n", resp)
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


## GeneratePricesReport

> GenerateReportResponse GeneratePricesReport(ctx).GeneratePricesReportRequest(generatePricesReportRequest).Format(format).Execute()

Отчет «Цены на рынке»



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
	generatePricesReportRequest := *openapiclient.NewGeneratePricesReportRequest() // GeneratePricesReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GeneratePricesReport(context.Background()).GeneratePricesReportRequest(generatePricesReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GeneratePricesReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GeneratePricesReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GeneratePricesReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGeneratePricesReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateShelfsStatisticsReport

> GenerateReportResponse GenerateShelfsStatisticsReport(ctx).GenerateShelfsStatisticsRequest(generateShelfsStatisticsRequest).Format(format).Execute()

Отчет по полкам



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
	generateShelfsStatisticsRequest := *openapiclient.NewGenerateShelfsStatisticsRequest(int64(123), time.Now(), time.Now(), openapiclient.ShelfsStatisticsAttributionType("CLICKS")) // GenerateShelfsStatisticsRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateShelfsStatisticsReport(context.Background()).GenerateShelfsStatisticsRequest(generateShelfsStatisticsRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateShelfsStatisticsReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateShelfsStatisticsReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateShelfsStatisticsReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateShelfsStatisticsReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateShowsSalesReport

> GenerateReportResponse GenerateShowsSalesReport(ctx).GenerateShowsSalesReportRequest(generateShowsSalesReportRequest).Format(format).Execute()

Отчет «Аналитика продаж»



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
	generateShowsSalesReportRequest := *openapiclient.NewGenerateShowsSalesReportRequest(time.Now(), time.Now(), openapiclient.ShowsSalesGroupingType("CATEGORIES")) // GenerateShowsSalesReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateShowsSalesReport(context.Background()).GenerateShowsSalesReportRequest(generateShowsSalesReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateShowsSalesReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateShowsSalesReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateShowsSalesReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateShowsSalesReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateStocksOnWarehousesReport

> GenerateReportResponse GenerateStocksOnWarehousesReport(ctx).GenerateStocksOnWarehousesReportRequest(generateStocksOnWarehousesReportRequest).Format(format).Execute()

Отчет по остаткам на складах



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
	generateStocksOnWarehousesReportRequest := *openapiclient.NewGenerateStocksOnWarehousesReportRequest(int64(123)) // GenerateStocksOnWarehousesReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateStocksOnWarehousesReport(context.Background()).GenerateStocksOnWarehousesReportRequest(generateStocksOnWarehousesReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateStocksOnWarehousesReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateStocksOnWarehousesReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateStocksOnWarehousesReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateStocksOnWarehousesReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateUnitedMarketplaceServicesReport

> GenerateReportResponse GenerateUnitedMarketplaceServicesReport(ctx).GenerateUnitedMarketplaceServicesReportRequest(generateUnitedMarketplaceServicesReportRequest).Format(format).Execute()

Отчет по стоимости услуг



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
	generateUnitedMarketplaceServicesReportRequest := *openapiclient.NewGenerateUnitedMarketplaceServicesReportRequest(int64(123)) // GenerateUnitedMarketplaceServicesReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateUnitedMarketplaceServicesReport(context.Background()).GenerateUnitedMarketplaceServicesReportRequest(generateUnitedMarketplaceServicesReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateUnitedMarketplaceServicesReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateUnitedMarketplaceServicesReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateUnitedMarketplaceServicesReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateUnitedMarketplaceServicesReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateUnitedNettingReport

> GenerateReportResponse GenerateUnitedNettingReport(ctx).GenerateUnitedNettingReportRequest(generateUnitedNettingReportRequest).Format(format).Execute()

Отчет по платежам



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
	generateUnitedNettingReportRequest := *openapiclient.NewGenerateUnitedNettingReportRequest(int64(123)) // GenerateUnitedNettingReportRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateUnitedNettingReport(context.Background()).GenerateUnitedNettingReportRequest(generateUnitedNettingReportRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateUnitedNettingReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateUnitedNettingReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateUnitedNettingReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateUnitedNettingReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GenerateUnitedOrdersReport

> GenerateReportResponse GenerateUnitedOrdersReport(ctx).GenerateUnitedOrdersRequest(generateUnitedOrdersRequest).Format(format).Execute()

Отчет по заказам



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
	generateUnitedOrdersRequest := *openapiclient.NewGenerateUnitedOrdersRequest(int64(123), time.Now(), time.Now()) // GenerateUnitedOrdersRequest | 
	format := openapiclient.ReportFormatType("FILE") // ReportFormatType | Формат отчета. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GenerateUnitedOrdersReport(context.Background()).GenerateUnitedOrdersRequest(generateUnitedOrdersRequest).Format(format).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GenerateUnitedOrdersReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GenerateUnitedOrdersReport`: GenerateReportResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GenerateUnitedOrdersReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGenerateUnitedOrdersReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md) |  | 
 **format** | [**ReportFormatType**](ReportFormatType.md) | Формат отчета. | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.GetAllOffers(context.Background(), campaignId).FeedId(feedId).Chunk(chunk).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetAllOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAllOffers`: GetAllOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetAllOffers`: %v\n", resp)
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
	resp, r, err := apiClient.ExpressAPI.GetBidsInfoForBusiness(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetBidsInfoRequest(getBidsInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetBidsInfoForBusiness``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBidsInfoForBusiness`: GetBidsInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetBidsInfoForBusiness`: %v\n", resp)
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
	resp, r, err := apiClient.ExpressAPI.GetBidsRecommendations(context.Background(), businessId).GetBidsRecommendationsRequest(getBidsRecommendationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetBidsRecommendations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBidsRecommendations`: GetBidsRecommendationsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetBidsRecommendations`: %v\n", resp)
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


## GetBusinessQuarantineOffers

> GetQuarantineOffersResponse GetBusinessQuarantineOffers(ctx, businessId).GetQuarantineOffersRequest(getQuarantineOffersRequest).PageToken(pageToken).Limit(limit).Execute()

Список товаров, находящихся в карантине по цене в кабинете



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
	getQuarantineOffersRequest := *openapiclient.NewGetQuarantineOffersRequest() // GetQuarantineOffersRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetBusinessQuarantineOffers(context.Background(), businessId).GetQuarantineOffersRequest(getQuarantineOffersRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetBusinessQuarantineOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessQuarantineOffers`: GetQuarantineOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetBusinessQuarantineOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBusinessQuarantineOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBusinessSettings

> GetBusinessSettingsResponse GetBusinessSettings(ctx, businessId).Execute()

Настройки кабинета



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetBusinessSettings(context.Background(), businessId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetBusinessSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBusinessSettings`: GetBusinessSettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetBusinessSettings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBusinessSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaign

> GetCampaignResponse GetCampaign(ctx, campaignId).Execute()

Информация о магазине



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaign(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaign``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaign`: GetCampaignResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaign`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignLogins

> GetCampaignLoginsResponse GetCampaignLogins(ctx, campaignId).Execute()

Логины, связанные с магазином



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaignLogins(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignLogins``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignLogins`: GetCampaignLoginsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignLogins`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignLoginsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.GetCampaignOffers(context.Background(), campaignId).GetCampaignOffersRequest(getCampaignOffersRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignOffers`: GetCampaignOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignOffers`: %v\n", resp)
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


## GetCampaignQuarantineOffers

> GetQuarantineOffersResponse GetCampaignQuarantineOffers(ctx, campaignId).GetQuarantineOffersRequest(getQuarantineOffersRequest).PageToken(pageToken).Limit(limit).Execute()

Список товаров, находящихся в карантине по цене в магазине



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
	getQuarantineOffersRequest := *openapiclient.NewGetQuarantineOffersRequest() // GetQuarantineOffersRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaignQuarantineOffers(context.Background(), campaignId).GetQuarantineOffersRequest(getQuarantineOffersRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignQuarantineOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignQuarantineOffers`: GetQuarantineOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignQuarantineOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignQuarantineOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignRegion

> GetCampaignRegionResponse GetCampaignRegion(ctx, campaignId).Execute()

Регион магазина



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaignRegion(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignRegion``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignRegion`: GetCampaignRegionResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignRegion`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignRegionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignSettings

> GetCampaignSettingsResponse GetCampaignSettings(ctx, campaignId).Execute()

Настройки магазина



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaignSettings(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignSettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignSettings`: GetCampaignSettingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignSettings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignSettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaigns

> GetCampaignsResponse GetCampaigns(ctx).Page(page).PageSize(pageSize).Execute()

Список магазинов пользователя



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
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaigns(context.Background()).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaigns``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaigns`: GetCampaignsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaigns`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCampaignsByLogin

> GetCampaignsResponse GetCampaignsByLogin(ctx, login).Page(page).PageSize(pageSize).Execute()

Магазины, доступные логину



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
	login := "login_example" // string | Логин пользователя.
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCampaignsByLogin(context.Background(), login).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCampaignsByLogin``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCampaignsByLogin`: GetCampaignsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCampaignsByLogin`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**login** | **string** | Логин пользователя. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCampaignsByLoginRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCategoriesMaxSaleQuantum

> GetCategoriesMaxSaleQuantumResponse GetCategoriesMaxSaleQuantum(ctx).GetCategoriesMaxSaleQuantumRequest(getCategoriesMaxSaleQuantumRequest).Execute()

Лимит на установку кванта продажи и минимального количества товаров в заказе



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
	getCategoriesMaxSaleQuantumRequest := *openapiclient.NewGetCategoriesMaxSaleQuantumRequest([]int64{int64(123)}) // GetCategoriesMaxSaleQuantumRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCategoriesMaxSaleQuantum(context.Background()).GetCategoriesMaxSaleQuantumRequest(getCategoriesMaxSaleQuantumRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCategoriesMaxSaleQuantum``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCategoriesMaxSaleQuantum`: GetCategoriesMaxSaleQuantumResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCategoriesMaxSaleQuantum`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCategoriesMaxSaleQuantumRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md) |  | 

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCategoriesTree

> GetCategoriesResponse GetCategoriesTree(ctx).GetCategoriesRequest(getCategoriesRequest).Execute()

Дерево категорий



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
	getCategoriesRequest := *openapiclient.NewGetCategoriesRequest() // GetCategoriesRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetCategoriesTree(context.Background()).GetCategoriesRequest(getCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCategoriesTree``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCategoriesTree`: GetCategoriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCategoriesTree`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCategoriesTreeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md) |  | 

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.GetCategoryContentParameters(context.Background(), categoryId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetCategoryContentParameters``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCategoryContentParameters`: GetCategoryContentParametersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetCategoryContentParameters`: %v\n", resp)
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


## GetChatHistory

> GetChatHistoryResponse GetChatHistory(ctx, businessId).ChatId(chatId).GetChatHistoryRequest(getChatHistoryRequest).PageToken(pageToken).Limit(limit).Execute()

Получение истории сообщений в чате



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
	chatId := int64(789) // int64 | Идентификатор чата.
	getChatHistoryRequest := *openapiclient.NewGetChatHistoryRequest() // GetChatHistoryRequest | description
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetChatHistory(context.Background(), businessId).ChatId(chatId).GetChatHistoryRequest(getChatHistoryRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetChatHistory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetChatHistory`: GetChatHistoryResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetChatHistory`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetChatHistoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **chatId** | **int64** | Идентификатор чата. | 
 **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetChats

> GetChatsResponse GetChats(ctx, businessId).GetChatsRequest(getChatsRequest).PageToken(pageToken).Limit(limit).Execute()

Получение доступных чатов



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
	getChatsRequest := *openapiclient.NewGetChatsRequest() // GetChatsRequest | description
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetChats(context.Background(), businessId).GetChatsRequest(getChatsRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetChats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetChats`: GetChatsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetChats`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetChatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md) | description | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.GetDeliveryServices(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetDeliveryServices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetDeliveryServices`: GetDeliveryServicesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetDeliveryServices`: %v\n", resp)
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


## GetFeed

> GetFeedResponse GetFeed(ctx, campaignId, feedId).Execute()

Информация о прайс-листе



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
	feedId := int64(789) // int64 | Идентификатор прайс-листа.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetFeed(context.Background(), campaignId, feedId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetFeed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeed`: GetFeedResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetFeed`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetFeedIndexLogs

> GetFeedIndexLogsResponse GetFeedIndexLogs(ctx, campaignId, feedId).Limit(limit).PublishedTimeFrom(publishedTimeFrom).PublishedTimeTo(publishedTimeTo).Status(status).Execute()

Отчет по индексации прайс-листа



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
	feedId := int64(789) // int64 | Идентификатор прайс-листа.
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	publishedTimeFrom := time.Now() // time.Time | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  (optional)
	publishedTimeTo := time.Now() // time.Time | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %}  (optional)
	status := openapiclient.FeedIndexLogsStatusType("ERROR") // FeedIndexLogsStatusType | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetFeedIndexLogs(context.Background(), campaignId, feedId).Limit(limit).PublishedTimeFrom(publishedTimeFrom).PublishedTimeTo(publishedTimeTo).Status(status).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetFeedIndexLogs``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeedIndexLogs`: GetFeedIndexLogsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetFeedIndexLogs`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedIndexLogsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **limit** | **int32** | Количество значений на одной странице.  | 
 **publishedTimeFrom** | **time.Time** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | 
 **publishedTimeTo** | **time.Time** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | 
 **status** | [**FeedIndexLogsStatusType**](FeedIndexLogsStatusType.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | 

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.GetFeedbackAndCommentUpdates(context.Background(), campaignId).PageToken(pageToken).Limit(limit).FromDate(fromDate).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetFeedbackAndCommentUpdates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeedbackAndCommentUpdates`: GetFeedbackListResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetFeedbackAndCommentUpdates`: %v\n", resp)
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


## GetFeeds

> GetFeedsResponse GetFeeds(ctx, campaignId).Execute()

Список прайс-листов магазина



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetFeeds(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetFeeds``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetFeeds`: GetFeedsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetFeeds`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetFeedsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetGoodsFeedbackComments

> GetGoodsFeedbackCommentsResponse GetGoodsFeedbackComments(ctx, businessId).GetGoodsFeedbackCommentsRequest(getGoodsFeedbackCommentsRequest).PageToken(pageToken).Limit(limit).Execute()

Получение комментариев к отзыву



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
	getGoodsFeedbackCommentsRequest := *openapiclient.NewGetGoodsFeedbackCommentsRequest(int64(123)) // GetGoodsFeedbackCommentsRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetGoodsFeedbackComments(context.Background(), businessId).GetGoodsFeedbackCommentsRequest(getGoodsFeedbackCommentsRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetGoodsFeedbackComments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetGoodsFeedbackComments`: GetGoodsFeedbackCommentsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetGoodsFeedbackComments`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetGoodsFeedbackCommentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetGoodsFeedbacks

> GetGoodsFeedbackResponse GetGoodsFeedbacks(ctx, businessId).PageToken(pageToken).Limit(limit).GetGoodsFeedbackRequest(getGoodsFeedbackRequest).Execute()

Получение отзывов о товарах продавца



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
	getGoodsFeedbackRequest := *openapiclient.NewGetGoodsFeedbackRequest() // GetGoodsFeedbackRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetGoodsFeedbacks(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetGoodsFeedbackRequest(getGoodsFeedbackRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetGoodsFeedbacks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetGoodsFeedbacks`: GetGoodsFeedbackResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetGoodsFeedbacks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetGoodsFeedbacksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md) |  | 

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
	resp, r, err := apiClient.ExpressAPI.GetGoodsStats(context.Background(), campaignId).GetGoodsStatsRequest(getGoodsStatsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetGoodsStats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetGoodsStats`: GetGoodsStatsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetGoodsStats`: %v\n", resp)
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


## GetHiddenOffers

> GetHiddenOffersResponse GetHiddenOffers(ctx, campaignId).OfferId(offerId).PageToken(pageToken).Limit(limit).Offset(offset).Page(page).PageSize(pageSize).Execute()

Информация о скрытых вами товарах



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
	offerId := []string{"Inner_example"} // []string | Идентификатор скрытого предложения.  (optional)
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	offset := int32(56) // int32 | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`.  (optional)
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetHiddenOffers(context.Background(), campaignId).OfferId(offerId).PageToken(pageToken).Limit(limit).Offset(offset).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetHiddenOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetHiddenOffers`: GetHiddenOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetHiddenOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetHiddenOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **offerId** | **[]string** | Идентификатор скрытого предложения.  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **offset** | **int32** | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | 
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.GetOfferCardsContentStatus(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetOfferCardsContentStatusRequest(getOfferCardsContentStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOfferCardsContentStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferCardsContentStatus`: GetOfferCardsContentStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOfferCardsContentStatus`: %v\n", resp)
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


## GetOfferMappingEntries

> GetOfferMappingEntriesResponse GetOfferMappingEntries(ctx, campaignId).OfferId(offerId).ShopSku(shopSku).MappingKind(mappingKind).Status(status).Availability(availability).CategoryId(categoryId).Vendor(vendor).PageToken(pageToken).Limit(limit).Execute()

Список товаров в каталоге



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
	offerId := []string{"Inner_example"} // []string | Идентификатор товара в каталоге. (optional)
	shopSku := []string{"Inner_example"} // []string | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  ``` ...shop_sku=123&shop_sku=129&shop_sku=141... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке.  (optional)
	mappingKind := openapiclient.OfferMappingKindType("ACTIVE") // OfferMappingKindType | Тип маппинга. (optional)
	status := []openapiclient.OfferProcessingStatusType{openapiclient.OfferProcessingStatusType("UNKNOWN")} // []OfferProcessingStatusType | Фильтрация по статусу публикации товара:  * `READY` — товар прошел модерацию. * `IN_WORK` — товар проходит модерацию. * `NEED_CONTENT` — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * `OTHER` — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...status=READY,IN_WORK... ...status=READY&status=IN_WORK... ```  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  (optional)
	availability := []openapiclient.OfferAvailabilityStatusType{openapiclient.OfferAvailabilityStatusType("ACTIVE")} // []OfferAvailabilityStatusType | Фильтрация по планам поставок товара:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...availability=INACTIVE,DELISTED... ...availability=INACTIVE&availability=DELISTED... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке.  (optional)
	categoryId := []int32{int32(123)} // []int32 | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...category_id=14727164,14382343... ...category_id=14727164&category_id=14382343... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке.  (optional)
	vendor := []string{"Inner_example"} // []string | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...vendor=Aqua%20Minerale,Borjomi... ...vendor=Aqua%20Minerale&vendor=Borjomi... ```  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  (optional)
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetOfferMappingEntries(context.Background(), campaignId).OfferId(offerId).ShopSku(shopSku).MappingKind(mappingKind).Status(status).Availability(availability).CategoryId(categoryId).Vendor(vendor).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOfferMappingEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferMappingEntries`: GetOfferMappingEntriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOfferMappingEntries`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOfferMappingEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **offerId** | **[]string** | Идентификатор товара в каталоге. | 
 **shopSku** | **[]string** | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | 
 **mappingKind** | [**OfferMappingKindType**](OfferMappingKindType.md) | Тип маппинга. | 
 **status** | [**[]OfferProcessingStatusType**](OfferProcessingStatusType.md) | Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | 
 **availability** | [**[]OfferAvailabilityStatusType**](OfferAvailabilityStatusType.md) | Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | 
 **categoryId** | **[]int32** | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | 
 **vendor** | **[]string** | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOfferMappings

> GetOfferMappingsResponse GetOfferMappings(ctx, businessId).PageToken(pageToken).Limit(limit).GetOfferMappingsRequest(getOfferMappingsRequest).Execute()

Информация о товарах в каталоге



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
	getOfferMappingsRequest := *openapiclient.NewGetOfferMappingsRequest() // GetOfferMappingsRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetOfferMappings(context.Background(), businessId).PageToken(pageToken).Limit(limit).GetOfferMappingsRequest(getOfferMappingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOfferMappings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferMappings`: GetOfferMappingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOfferMappings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOfferMappingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getOfferMappingsRequest** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md) |  | 

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.GetOfferRecommendations(context.Background(), businessId).GetOfferRecommendationsRequest(getOfferRecommendationsRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOfferRecommendations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOfferRecommendations`: GetOfferRecommendationsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOfferRecommendations`: %v\n", resp)
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
	resp, r, err := apiClient.ExpressAPI.GetOffers(context.Background(), campaignId).Query(query).FeedId(feedId).ShopCategoryId(shopCategoryId).Currency(currency).Matched(matched).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOffers`: GetOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOffers`: %v\n", resp)
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


## GetOrder

> GetOrderResponse GetOrder(ctx, campaignId, orderId).Execute()

Информация об одном заказе



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
	resp, r, err := apiClient.ExpressAPI.GetOrder(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrder`: GetOrderResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrder`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOrderBusinessBuyerInfo

> GetBusinessBuyerInfoResponse GetOrderBusinessBuyerInfo(ctx, campaignId, orderId).Execute()

Информация о покупателе — юридическом лице



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
	resp, r, err := apiClient.ExpressAPI.GetOrderBusinessBuyerInfo(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrderBusinessBuyerInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrderBusinessBuyerInfo`: GetBusinessBuyerInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrderBusinessBuyerInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrderBusinessBuyerInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOrderBusinessDocumentsInfo

> GetBusinessDocumentsInfoResponse GetOrderBusinessDocumentsInfo(ctx, campaignId, orderId).Execute()

Информация о документах



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
	resp, r, err := apiClient.ExpressAPI.GetOrderBusinessDocumentsInfo(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrderBusinessDocumentsInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrderBusinessDocumentsInfo`: GetBusinessDocumentsInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrderBusinessDocumentsInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrderBusinessDocumentsInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

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
	resp, r, err := apiClient.ExpressAPI.GetOrderLabelsData(context.Background(), campaignId, orderId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrderLabelsData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrderLabelsData`: GetOrderLabelsDataResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrderLabelsData`: %v\n", resp)
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


## GetOrders

> GetOrdersResponse GetOrders(ctx, campaignId).OrderIds(orderIds).Status(status).Substatus(substatus).FromDate(fromDate).ToDate(toDate).SupplierShipmentDateFrom(supplierShipmentDateFrom).SupplierShipmentDateTo(supplierShipmentDateTo).UpdatedAtFrom(updatedAtFrom).UpdatedAtTo(updatedAtTo).DispatchType(dispatchType).Fake(fake).HasCis(hasCis).OnlyWaitingForCancellationApprove(onlyWaitingForCancellationApprove).OnlyEstimatedDelivery(onlyEstimatedDelivery).BuyerType(buyerType).Page(page).PageSize(pageSize).PageToken(pageToken).Limit(limit).Execute()

Информация о нескольких заказах



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
	orderIds := []int64{int64(123)} // []int64 | Фильтрация заказов по идентификаторам. <br><br> ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  (optional)
	status := []openapiclient.OrderStatusType{openapiclient.OrderStatusType("PLACING")} // []OrderStatusType | Статус заказа:  * `CANCELLED` — заказ отменен.  * `DELIVERED` — заказ получен покупателем.  * `DELIVERY` — заказ передан в службу доставки.  * `PICKUP` — заказ доставлен в пункт самовывоза.  * `PROCESSING` — заказ находится в обработке.  * `UNPAID` — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  (optional)
	substatus := []openapiclient.OrderSubstatusType{openapiclient.OrderSubstatusType("RESERVATION_EXPIRED")} // []OrderSubstatusType | Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  Возможные значения для заказа в статусе `PROCESSING`:  * `STARTED` — заказ подтвержден, его можно начать обрабатывать. * `READY_TO_SHIP` — заказ собран и готов к отправке. * `SHIPPED` — заказ передан службе доставки.  Возможные значения для заказа в статусе `CANCELLED`:  * `DELIVERY_SERVICE_UNDELIVERED` — служба доставки не смогла доставить заказ.  * `PROCESSING_EXPIRED` — значение более не используется.  * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.  * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * `RESERVATION_FAILED` — Маркет не может продолжить дальнейшую обработку заказа.  * `SHOP_FAILED` — магазин не может выполнить заказ.  * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.  * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.  * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.  * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.  * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.  * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * `USER_WANTS_TO_CHANGE_DELIVERY_DATE` — покупатель хочет получить заказ в другой день. * `CANCELLED_COURIER_NOT_FOUND` — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  (optional)
	fromDate := time.Now() // string | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `toDate`) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  (optional)
	toDate := time.Now() // string | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `fromDate`) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  (optional)
	supplierShipmentDateFrom := time.Now() // string | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `supplierShipmentDateTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  (optional)
	supplierShipmentDateTo := time.Now() // string | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `supplierShipmentDateFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  (optional)
	updatedAtFrom := time.Now() // time.Time | Начальная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной и конечной датой (параметр `updatedAtTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  (optional)
	updatedAtTo := time.Now() // time.Time | Конечная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной (параметр `updatedAtFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  (optional)
	dispatchType := openapiclient.OrderDeliveryDispatchType("UNKNOWN") // OrderDeliveryDispatchType | Способ отгрузки (optional)
	fake := true // bool | Фильтрация заказов по типам:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  (optional) (default to false)
	hasCis := true // bool | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да.  * `false` — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  (optional) (default to false)
	onlyWaitingForCancellationApprove := true // bool | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение `true` возвращаются только заказы, которые находятся в статусе `DELIVERY` или `PICKUP` и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  (optional) (default to false)
	onlyEstimatedDelivery := true // bool | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * `true` — возвращаются только заказы с неподтвержденной датой доставки. * `false` — фильтрация не применяется.  (optional) (default to false)
	buyerType := openapiclient.OrderBuyerType("PERSON") // OrderBuyerType | Фильтрация заказов по типу покупателя.  (optional)
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetOrders(context.Background(), campaignId).OrderIds(orderIds).Status(status).Substatus(substatus).FromDate(fromDate).ToDate(toDate).SupplierShipmentDateFrom(supplierShipmentDateFrom).SupplierShipmentDateTo(supplierShipmentDateTo).UpdatedAtFrom(updatedAtFrom).UpdatedAtTo(updatedAtTo).DispatchType(dispatchType).Fake(fake).HasCis(hasCis).OnlyWaitingForCancellationApprove(onlyWaitingForCancellationApprove).OnlyEstimatedDelivery(onlyEstimatedDelivery).BuyerType(buyerType).Page(page).PageSize(pageSize).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrders``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrders`: GetOrdersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrders`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **orderIds** | **[]int64** | Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  | 
 **status** | [**[]OrderStatusType**](OrderStatusType.md) | Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | 
 **substatus** | [**[]OrderSubstatusType**](OrderSubstatusType.md) | Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | 
 **fromDate** | **string** | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  | 
 **toDate** | **string** | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  | 
 **supplierShipmentDateFrom** | **string** | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | 
 **supplierShipmentDateTo** | **string** | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | 
 **updatedAtFrom** | **time.Time** | Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | 
 **updatedAtTo** | **time.Time** | Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | 
 **dispatchType** | [**OrderDeliveryDispatchType**](OrderDeliveryDispatchType.md) | Способ отгрузки | 
 **fake** | **bool** | Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [default to false]
 **hasCis** | **bool** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [default to false]
 **onlyWaitingForCancellationApprove** | **bool** | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  | [default to false]
 **onlyEstimatedDelivery** | **bool** | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется.  | [default to false]
 **buyerType** | [**OrderBuyerType**](OrderBuyerType.md) | Фильтрация заказов по типу покупателя.  | 
 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOrdersStats

> GetOrdersStatsResponse GetOrdersStats(ctx, campaignId).PageToken(pageToken).Limit(limit).GetOrdersStatsRequest(getOrdersStatsRequest).Execute()

Детальная информация по заказам



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	getOrdersStatsRequest := *openapiclient.NewGetOrdersStatsRequest() // GetOrdersStatsRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetOrdersStats(context.Background(), campaignId).PageToken(pageToken).Limit(limit).GetOrdersStatsRequest(getOrdersStatsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetOrdersStats``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetOrdersStats`: GetOrdersStatsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetOrdersStats`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetOrdersStatsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md) |  | 

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPrices

> GetPricesResponse GetPrices(ctx, campaignId).PageToken(pageToken).Limit(limit).Archived(archived).Execute()

Список цен



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	archived := true // bool | Фильтр по нахождению в архиве. (optional) (default to false)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetPrices(context.Background(), campaignId).PageToken(pageToken).Limit(limit).Archived(archived).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetPrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPrices`: GetPricesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetPrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **archived** | **bool** | Фильтр по нахождению в архиве. | [default to false]

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPricesByOfferIds

> GetPricesByOfferIdsResponse GetPricesByOfferIds(ctx, campaignId).PageToken(pageToken).Limit(limit).GetPricesByOfferIdsRequest(getPricesByOfferIdsRequest).Execute()

Просмотр цен на указанные товары в магазине



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	getPricesByOfferIdsRequest := *openapiclient.NewGetPricesByOfferIdsRequest() // GetPricesByOfferIdsRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetPricesByOfferIds(context.Background(), campaignId).PageToken(pageToken).Limit(limit).GetPricesByOfferIdsRequest(getPricesByOfferIdsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetPricesByOfferIds``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPricesByOfferIds`: GetPricesByOfferIdsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetPricesByOfferIds`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPricesByOfferIdsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getPricesByOfferIdsRequest** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md) |  | 

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPromoOffers

> GetPromoOffersResponse GetPromoOffers(ctx, businessId).GetPromoOffersRequest(getPromoOffersRequest).PageToken(pageToken).Limit(limit).Execute()

Получение списка товаров, которые участвуют или могут участвовать в акции



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
	getPromoOffersRequest := *openapiclient.NewGetPromoOffersRequest("PromoId_example") // GetPromoOffersRequest | 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetPromoOffers(context.Background(), businessId).GetPromoOffersRequest(getPromoOffersRequest).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetPromoOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPromoOffers`: GetPromoOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetPromoOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPromoOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getPromoOffersRequest** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md) |  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPromos

> GetPromosResponse GetPromos(ctx, businessId).GetPromosRequest(getPromosRequest).Execute()

Получение списка акций



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
	getPromosRequest := *openapiclient.NewGetPromosRequest() // GetPromosRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetPromos(context.Background(), businessId).GetPromosRequest(getPromosRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetPromos``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPromos`: GetPromosResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetPromos`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPromosRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getPromosRequest** | [**GetPromosRequest**](GetPromosRequest.md) |  | 

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQualityRatingDetails

> GetQualityRatingDetailsResponse GetQualityRatingDetails(ctx, campaignId).Execute()

Заказы, которые повлияли на индекс качества



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetQualityRatingDetails(context.Background(), campaignId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetQualityRatingDetails``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQualityRatingDetails`: GetQualityRatingDetailsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetQualityRatingDetails`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQualityRatingDetailsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetQualityRatings

> GetQualityRatingResponse GetQualityRatings(ctx, businessId).GetQualityRatingRequest(getQualityRatingRequest).Execute()

Индекс качества магазинов



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
	getQualityRatingRequest := *openapiclient.NewGetQualityRatingRequest([]int64{int64(123)}) // GetQualityRatingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetQualityRatings(context.Background(), businessId).GetQualityRatingRequest(getQualityRatingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetQualityRatings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetQualityRatings`: GetQualityRatingResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetQualityRatings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetQualityRatingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getQualityRatingRequest** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md) |  | 

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReportInfo

> GetReportInfoResponse GetReportInfo(ctx, reportId).Execute()

Получение заданного отчета



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
	reportId := "reportId_example" // string | Идентификатор отчета, который вы получили после запуска генерации. 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetReportInfo(context.Background(), reportId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetReportInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetReportInfo`: GetReportInfoResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetReportInfo`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reportId** | **string** | Идентификатор отчета, который вы получили после запуска генерации.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetReportInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReturn

> GetReturnResponse GetReturn(ctx, campaignId, orderId, returnId).Execute()

Информация о невыкупе или возврате



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
	returnId := int64(789) // int64 | Идентификатор возврата.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetReturn(context.Background(), campaignId, orderId, returnId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetReturn``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetReturn`: GetReturnResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetReturn`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 
**returnId** | **int64** | Идентификатор возврата. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetReturnRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReturnApplication

> *os.File GetReturnApplication(ctx, campaignId, orderId, returnId).Execute()

Получение заявления на возврат



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
	returnId := int64(789) // int64 | Идентификатор возврата.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetReturnApplication(context.Background(), campaignId, orderId, returnId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetReturnApplication``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetReturnApplication`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetReturnApplication`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 
**returnId** | **int64** | Идентификатор возврата. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetReturnApplicationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReturnPhoto

> *os.File GetReturnPhoto(ctx, campaignId, orderId, returnId, itemId, imageHash).Execute()

Получение фотографии возврата



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
	returnId := int64(789) // int64 | Идентификатор возврата.
	itemId := int64(789) // int64 | Идентификатор товара в возврате.
	imageHash := "imageHash_example" // string | Хеш ссылки изображения для загрузки.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetReturnPhoto(context.Background(), campaignId, orderId, returnId, itemId, imageHash).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetReturnPhoto``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetReturnPhoto`: *os.File
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetReturnPhoto`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 
**returnId** | **int64** | Идентификатор возврата. | 
**itemId** | **int64** | Идентификатор товара в возврате. | 
**imageHash** | **string** | Хеш ссылки изображения для загрузки. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetReturnPhotoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------






### Return type

[***os.File**](*os.File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReturns

> GetReturnsResponse GetReturns(ctx, campaignId).PageToken(pageToken).Limit(limit).OrderIds(orderIds).Statuses(statuses).Type_(type_).FromDate(fromDate).ToDate(toDate).FromDate2(fromDate2).ToDate2(toDate2).Execute()

Список невыкупов и возвратов



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
	orderIds := []int64{int64(123543)} // []int64 | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  (optional)
	statuses := []openapiclient.RefundStatusType{openapiclient.RefundStatusType("STARTED_BY_USER")} // []RefundStatusType | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  (optional)
	type_ := openapiclient.ReturnType("UNREDEEMED") // ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  (optional)
	fromDate := time.Now() // string | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`.  (optional)
	toDate := time.Now() // string | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`.  (optional)
	fromDate2 := time.Now() // string | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional)
	toDate2 := time.Now() // string | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetReturns(context.Background(), campaignId).PageToken(pageToken).Limit(limit).OrderIds(orderIds).Statuses(statuses).Type_(type_).FromDate(fromDate).ToDate(toDate).FromDate2(fromDate2).ToDate2(toDate2).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetReturns``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetReturns`: GetReturnsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetReturns`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetReturnsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **orderIds** | **[]int64** | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | 
 **statuses** | [**[]RefundStatusType**](RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | 
 **type_** | [**ReturnType**](ReturnType.md) | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | 
 **fromDate** | **string** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | 
 **toDate** | **string** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | 
 **fromDate2** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | 
 **toDate2** | **string** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | 

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStocks

> GetWarehouseStocksResponse GetStocks(ctx, campaignId).PageToken(pageToken).Limit(limit).GetWarehouseStocksRequest(getWarehouseStocksRequest).Execute()

Информация об остатках и оборачиваемости



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
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)
	getWarehouseStocksRequest := *openapiclient.NewGetWarehouseStocksRequest() // GetWarehouseStocksRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetStocks(context.Background(), campaignId).PageToken(pageToken).Limit(limit).GetWarehouseStocksRequest(getWarehouseStocksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetStocks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetStocks`: GetWarehouseStocksResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetStocks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetStocksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 
 **getWarehouseStocksRequest** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md) |  | 

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSuggestedOfferMappingEntries

> GetSuggestedOfferMappingEntriesResponse GetSuggestedOfferMappingEntries(ctx, campaignId).GetSuggestedOfferMappingEntriesRequest(getSuggestedOfferMappingEntriesRequest).Execute()

Рекомендованные карточки для товаров



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
	getSuggestedOfferMappingEntriesRequest := *openapiclient.NewGetSuggestedOfferMappingEntriesRequest([]openapiclient.MappingsOfferDTO{*openapiclient.NewMappingsOfferDTO()}) // GetSuggestedOfferMappingEntriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetSuggestedOfferMappingEntries(context.Background(), campaignId).GetSuggestedOfferMappingEntriesRequest(getSuggestedOfferMappingEntriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetSuggestedOfferMappingEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSuggestedOfferMappingEntries`: GetSuggestedOfferMappingEntriesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetSuggestedOfferMappingEntries`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSuggestedOfferMappingEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getSuggestedOfferMappingEntriesRequest** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md) |  | 

### Return type

[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSuggestedOfferMappings

> GetSuggestedOfferMappingsResponse GetSuggestedOfferMappings(ctx, businessId).GetSuggestedOfferMappingsRequest(getSuggestedOfferMappingsRequest).Execute()

Просмотр карточек на Маркете, которые подходят вашим товарам



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
	getSuggestedOfferMappingsRequest := *openapiclient.NewGetSuggestedOfferMappingsRequest() // GetSuggestedOfferMappingsRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetSuggestedOfferMappings(context.Background(), businessId).GetSuggestedOfferMappingsRequest(getSuggestedOfferMappingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetSuggestedOfferMappings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSuggestedOfferMappings`: GetSuggestedOfferMappingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetSuggestedOfferMappings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSuggestedOfferMappingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **getSuggestedOfferMappingsRequest** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md) |  | 

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSuggestedPrices

> SuggestPricesResponse GetSuggestedPrices(ctx, campaignId).SuggestPricesRequest(suggestPricesRequest).Execute()

Цены для продвижения товаров



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
	suggestPricesRequest := *openapiclient.NewSuggestPricesRequest([]openapiclient.SuggestOfferPriceDTO{*openapiclient.NewSuggestOfferPriceDTO()}) // SuggestPricesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetSuggestedPrices(context.Background(), campaignId).SuggestPricesRequest(suggestPricesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetSuggestedPrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetSuggestedPrices`: SuggestPricesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetSuggestedPrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSuggestedPricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **suggestPricesRequest** | [**SuggestPricesRequest**](SuggestPricesRequest.md) |  | 

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetWarehouses

> GetWarehousesResponse GetWarehouses(ctx, businessId).Execute()

Список складов и групп складов



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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.GetWarehouses(context.Background(), businessId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.GetWarehouses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetWarehouses`: GetWarehousesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.GetWarehouses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetWarehousesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProvideOrderItemIdentifiers

> ProvideOrderItemIdentifiersResponse ProvideOrderItemIdentifiers(ctx, campaignId, orderId).ProvideOrderItemIdentifiersRequest(provideOrderItemIdentifiersRequest).Execute()

Передача кодов маркировки единиц товара



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
	provideOrderItemIdentifiersRequest := *openapiclient.NewProvideOrderItemIdentifiersRequest([]openapiclient.OrderItemInstanceModificationDTO{*openapiclient.NewOrderItemInstanceModificationDTO(int64(123), []openapiclient.BriefOrderItemInstanceDTO{*openapiclient.NewBriefOrderItemInstanceDTO()})}) // ProvideOrderItemIdentifiersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.ProvideOrderItemIdentifiers(context.Background(), campaignId, orderId).ProvideOrderItemIdentifiersRequest(provideOrderItemIdentifiersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.ProvideOrderItemIdentifiers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ProvideOrderItemIdentifiers`: ProvideOrderItemIdentifiersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.ProvideOrderItemIdentifiers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiProvideOrderItemIdentifiersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **provideOrderItemIdentifiersRequest** | [**ProvideOrderItemIdentifiersRequest**](ProvideOrderItemIdentifiersRequest.md) |  | 

### Return type

[**ProvideOrderItemIdentifiersResponse**](ProvideOrderItemIdentifiersResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.PutBidsForBusiness(context.Background(), businessId).PutSkuBidsRequest(putSkuBidsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.PutBidsForBusiness``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutBidsForBusiness`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.PutBidsForBusiness`: %v\n", resp)
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
	resp, r, err := apiClient.ExpressAPI.PutBidsForCampaign(context.Background(), campaignId).PutSkuBidsRequest(putSkuBidsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.PutBidsForCampaign``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PutBidsForCampaign`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.PutBidsForCampaign`: %v\n", resp)
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


## RefreshFeed

> EmptyApiResponse RefreshFeed(ctx, campaignId, feedId).Execute()

Сообщить, что прайс-лист обновился



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
	feedId := int64(789) // int64 | Идентификатор прайс-листа.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.RefreshFeed(context.Background(), campaignId, feedId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.RefreshFeed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RefreshFeed`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.RefreshFeed`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRefreshFeedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchRegionChildren

> GetRegionWithChildrenResponse SearchRegionChildren(ctx, regionId).Page(page).PageSize(pageSize).Execute()

Информация о дочерних регионах



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
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
	page := int32(56) // int32 | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional) (default to 1)
	pageSize := int32(56) // int32 | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SearchRegionChildren(context.Background(), regionId).Page(page).PageSize(pageSize).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SearchRegionChildren``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchRegionChildren`: GetRegionWithChildrenResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SearchRegionChildren`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSearchRegionChildrenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **page** | **int32** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **pageSize** | **int32** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | 

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchRegionsById

> GetRegionsResponse SearchRegionsById(ctx, regionId).Execute()

Информация о регионе



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
	regionId := int64(789) // int64 | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SearchRegionsById(context.Background(), regionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SearchRegionsById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchRegionsById`: GetRegionsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SearchRegionsById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**regionId** | **int64** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSearchRegionsByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchRegionsByName

> GetRegionsResponse SearchRegionsByName(ctx).Name(name).PageToken(pageToken).Limit(limit).Execute()

Поиск регионов по их имени



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
	name := "name_example" // string | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. 
	pageToken := "eyBuZXh0SWQ6IDIzNDIgfQ==" // string | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
	limit := int32(20) // int32 | Количество значений на одной странице.  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SearchRegionsByName(context.Background()).Name(name).PageToken(pageToken).Limit(limit).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SearchRegionsByName``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchRegionsByName`: GetRegionsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SearchRegionsByName`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchRegionsByNameRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  | 
 **pageToken** | **string** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | 
 **limit** | **int32** | Количество значений на одной странице.  | 

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SendFileToChat

> EmptyApiResponse SendFileToChat(ctx, businessId).ChatId(chatId).File(file).Execute()

Отправка файла в чат



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
	chatId := int64(789) // int64 | Идентификатор чата.
	file := os.NewFile(1234, "some_file") // *os.File | Содержимое файла. Максимальный размер файла — 5 Мбайт.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SendFileToChat(context.Background(), businessId).ChatId(chatId).File(file).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SendFileToChat``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SendFileToChat`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SendFileToChat`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSendFileToChatRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **chatId** | **int64** | Идентификатор чата. | 
 **file** | ***os.File** | Содержимое файла. Максимальный размер файла — 5 Мбайт. | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SendMessageToChat

> EmptyApiResponse SendMessageToChat(ctx, businessId).ChatId(chatId).SendMessageToChatRequest(sendMessageToChatRequest).Execute()

Отправка сообщения в чат



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
	chatId := int64(789) // int64 | Идентификатор чата.
	sendMessageToChatRequest := *openapiclient.NewSendMessageToChatRequest("Message_example") // SendMessageToChatRequest | description

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SendMessageToChat(context.Background(), businessId).ChatId(chatId).SendMessageToChatRequest(sendMessageToChatRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SendMessageToChat``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SendMessageToChat`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SendMessageToChat`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSendMessageToChatRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **chatId** | **int64** | Идентификатор чата. | 
 **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description | 

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


## SetFeedParams

> EmptyApiResponse SetFeedParams(ctx, campaignId, feedId).SetFeedParamsRequest(setFeedParamsRequest).Execute()

Изменение параметров прайс-листа



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
	feedId := int64(789) // int64 | Идентификатор прайс-листа.
	setFeedParamsRequest := *openapiclient.NewSetFeedParamsRequest([]openapiclient.FeedParameterDTO{*openapiclient.NewFeedParameterDTO("Name_example")}) // SetFeedParamsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SetFeedParams(context.Background(), campaignId, feedId).SetFeedParamsRequest(setFeedParamsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SetFeedParams``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetFeedParams`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SetFeedParams`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **int64** | Идентификатор прайс-листа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetFeedParamsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  | 

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


## SetOrderBoxLayout

> SetOrderBoxLayoutResponse SetOrderBoxLayout(ctx, campaignId, orderId).SetOrderBoxLayoutRequest(setOrderBoxLayoutRequest).Execute()

Подготовка заказа



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
	setOrderBoxLayoutRequest := *openapiclient.NewSetOrderBoxLayoutRequest([]openapiclient.OrderBoxLayoutDTO{*openapiclient.NewOrderBoxLayoutDTO([]openapiclient.OrderBoxLayoutItemDTO{*openapiclient.NewOrderBoxLayoutItemDTO(int64(123))})}) // SetOrderBoxLayoutRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SetOrderBoxLayout(context.Background(), campaignId, orderId).SetOrderBoxLayoutRequest(setOrderBoxLayoutRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SetOrderBoxLayout``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetOrderBoxLayout`: SetOrderBoxLayoutResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SetOrderBoxLayout`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetOrderBoxLayoutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **setOrderBoxLayoutRequest** | [**SetOrderBoxLayoutRequest**](SetOrderBoxLayoutRequest.md) |  | 

### Return type

[**SetOrderBoxLayoutResponse**](SetOrderBoxLayoutResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetOrderShipmentBoxes

> SetOrderShipmentBoxesResponse SetOrderShipmentBoxes(ctx, campaignId, orderId, shipmentId).SetOrderShipmentBoxesRequest(setOrderShipmentBoxesRequest).Execute()

Передача количества грузовых мест в заказе



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
	shipmentId := int64(789) // int64 | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. 
	setOrderShipmentBoxesRequest := *openapiclient.NewSetOrderShipmentBoxesRequest([]openapiclient.ParcelBoxDTO{*openapiclient.NewParcelBoxDTO()}) // SetOrderShipmentBoxesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SetOrderShipmentBoxes(context.Background(), campaignId, orderId, shipmentId).SetOrderShipmentBoxesRequest(setOrderShipmentBoxesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SetOrderShipmentBoxes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SetOrderShipmentBoxes`: SetOrderShipmentBoxesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SetOrderShipmentBoxes`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 
**shipmentId** | **int64** | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL.  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSetOrderShipmentBoxesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **setOrderShipmentBoxesRequest** | [**SetOrderShipmentBoxesRequest**](SetOrderShipmentBoxesRequest.md) |  | 

### Return type

[**SetOrderShipmentBoxesResponse**](SetOrderShipmentBoxesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SkipGoodsFeedbacksReaction

> EmptyApiResponse SkipGoodsFeedbacksReaction(ctx, businessId).SkipGoodsFeedbackReactionRequest(skipGoodsFeedbackReactionRequest).Execute()

Отказ от ответа на отзывы



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
	skipGoodsFeedbackReactionRequest := *openapiclient.NewSkipGoodsFeedbackReactionRequest([]int64{int64(123)}) // SkipGoodsFeedbackReactionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.SkipGoodsFeedbacksReaction(context.Background(), businessId).SkipGoodsFeedbackReactionRequest(skipGoodsFeedbackReactionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.SkipGoodsFeedbacksReaction``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SkipGoodsFeedbacksReaction`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.SkipGoodsFeedbacksReaction`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiSkipGoodsFeedbacksReactionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **skipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md) |  | 

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


## UpdateBusinessPrices

> EmptyApiResponse UpdateBusinessPrices(ctx, businessId).UpdateBusinessPricesRequest(updateBusinessPricesRequest).Execute()

Установка цен на товары во всех магазинах



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
	updateBusinessPricesRequest := *openapiclient.NewUpdateBusinessPricesRequest([]openapiclient.UpdateBusinessOfferPriceDTO{*openapiclient.NewUpdateBusinessOfferPriceDTO("OfferId_example", *openapiclient.NewUpdatePriceWithDiscountDTO(float32(123), openapiclient.CurrencyType("RUR")))}) // UpdateBusinessPricesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateBusinessPrices(context.Background(), businessId).UpdateBusinessPricesRequest(updateBusinessPricesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateBusinessPrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateBusinessPrices`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateBusinessPrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateBusinessPricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateBusinessPricesRequest** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md) |  | 

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
	resp, r, err := apiClient.ExpressAPI.UpdateCampaignOffers(context.Background(), campaignId).UpdateCampaignOffersRequest(updateCampaignOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateCampaignOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateCampaignOffers`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateCampaignOffers`: %v\n", resp)
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


## UpdateGoodsFeedbackComment

> UpdateGoodsFeedbackCommentResponse UpdateGoodsFeedbackComment(ctx, businessId).UpdateGoodsFeedbackCommentRequest(updateGoodsFeedbackCommentRequest).Execute()

Добавление нового или изменение созданного комментария



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
	updateGoodsFeedbackCommentRequest := *openapiclient.NewUpdateGoodsFeedbackCommentRequest(int64(123), *openapiclient.NewUpdateGoodsFeedbackCommentDTO("Text_example")) // UpdateGoodsFeedbackCommentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateGoodsFeedbackComment(context.Background(), businessId).UpdateGoodsFeedbackCommentRequest(updateGoodsFeedbackCommentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateGoodsFeedbackComment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateGoodsFeedbackComment`: UpdateGoodsFeedbackCommentResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateGoodsFeedbackComment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateGoodsFeedbackCommentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md) |  | 

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

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
	resp, r, err := apiClient.ExpressAPI.UpdateOfferContent(context.Background(), businessId).UpdateOfferContentRequest(updateOfferContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOfferContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOfferContent`: UpdateOfferContentResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateOfferContent`: %v\n", resp)
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


## UpdateOfferMappingEntries

> EmptyApiResponse UpdateOfferMappingEntries(ctx, campaignId).UpdateOfferMappingEntryRequest(updateOfferMappingEntryRequest).Execute()

Добавление и редактирование товаров в каталоге



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
	updateOfferMappingEntryRequest := *openapiclient.NewUpdateOfferMappingEntryRequest([]openapiclient.UpdateOfferMappingEntryDTO{*openapiclient.NewUpdateOfferMappingEntryDTO()}) // UpdateOfferMappingEntryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateOfferMappingEntries(context.Background(), campaignId).UpdateOfferMappingEntryRequest(updateOfferMappingEntryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOfferMappingEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOfferMappingEntries`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateOfferMappingEntries`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOfferMappingEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateOfferMappingEntryRequest** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md) |  | 

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


## UpdateOfferMappings

> UpdateOfferMappingsResponse UpdateOfferMappings(ctx, businessId).UpdateOfferMappingsRequest(updateOfferMappingsRequest).Execute()

Добавление товаров в каталог и изменение информации о них



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
	updateOfferMappingsRequest := *openapiclient.NewUpdateOfferMappingsRequest([]openapiclient.UpdateOfferMappingDTO{*openapiclient.NewUpdateOfferMappingDTO(*openapiclient.NewUpdateOfferDTO("OfferId_example"))}) // UpdateOfferMappingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateOfferMappings(context.Background(), businessId).UpdateOfferMappingsRequest(updateOfferMappingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOfferMappings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOfferMappings`: UpdateOfferMappingsResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateOfferMappings`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOfferMappingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateOfferMappingsRequest** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md) |  | 

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrderItems

> UpdateOrderItems(ctx, campaignId, orderId).UpdateOrderItemRequest(updateOrderItemRequest).Execute()

Удаление товара из заказа или уменьшение числа единиц



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
	updateOrderItemRequest := *openapiclient.NewUpdateOrderItemRequest([]openapiclient.OrderItemModificationDTO{*openapiclient.NewOrderItemModificationDTO(int64(123), int32(123))}) // UpdateOrderItemRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.ExpressAPI.UpdateOrderItems(context.Background(), campaignId, orderId).UpdateOrderItemRequest(updateOrderItemRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOrderItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrderItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **updateOrderItemRequest** | [**UpdateOrderItemRequest**](UpdateOrderItemRequest.md) |  | 

### Return type

 (empty response body)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrderStatus

> UpdateOrderStatusResponse UpdateOrderStatus(ctx, campaignId, orderId).UpdateOrderStatusRequest(updateOrderStatusRequest).Execute()

Изменение статуса одного заказа



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
	updateOrderStatusRequest := *openapiclient.NewUpdateOrderStatusRequest(*openapiclient.NewOrderStatusChangeDTO(openapiclient.OrderStatusType("PLACING"))) // UpdateOrderStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateOrderStatus(context.Background(), campaignId, orderId).UpdateOrderStatusRequest(updateOrderStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOrderStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOrderStatus`: UpdateOrderStatusResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateOrderStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **int64** | Идентификатор заказа. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrderStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **updateOrderStatusRequest** | [**UpdateOrderStatusRequest**](UpdateOrderStatusRequest.md) |  | 

### Return type

[**UpdateOrderStatusResponse**](UpdateOrderStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateOrderStatuses

> UpdateOrderStatusesResponse UpdateOrderStatuses(ctx, campaignId).UpdateOrderStatusesRequest(updateOrderStatusesRequest).Execute()

Изменение статусов нескольких заказов



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
	updateOrderStatusesRequest := *openapiclient.NewUpdateOrderStatusesRequest([]openapiclient.OrderStateDTO{*openapiclient.NewOrderStateDTO(int64(123), openapiclient.OrderStatusType("PLACING"))}) // UpdateOrderStatusesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateOrderStatuses(context.Background(), campaignId).UpdateOrderStatusesRequest(updateOrderStatusesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateOrderStatuses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateOrderStatuses`: UpdateOrderStatusesResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateOrderStatuses`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateOrderStatusesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateOrderStatusesRequest** | [**UpdateOrderStatusesRequest**](UpdateOrderStatusesRequest.md) |  | 

### Return type

[**UpdateOrderStatusesResponse**](UpdateOrderStatusesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdatePrices

> EmptyApiResponse UpdatePrices(ctx, campaignId).UpdatePricesRequest(updatePricesRequest).Execute()

Установка цен на товары в конкретном магазине



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
	updatePricesRequest := *openapiclient.NewUpdatePricesRequest([]openapiclient.OfferPriceDTO{*openapiclient.NewOfferPriceDTO()}) // UpdatePricesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdatePrices(context.Background(), campaignId).UpdatePricesRequest(updatePricesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdatePrices``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdatePrices`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdatePrices`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdatePricesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updatePricesRequest** | [**UpdatePricesRequest**](UpdatePricesRequest.md) |  | 

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


## UpdatePromoOffers

> UpdatePromoOffersResponse UpdatePromoOffers(ctx, businessId).UpdatePromoOffersRequest(updatePromoOffersRequest).Execute()

Добавление товаров в акцию или изменение их цен



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
	updatePromoOffersRequest := *openapiclient.NewUpdatePromoOffersRequest("PromoId_example", []openapiclient.UpdatePromoOfferDTO{*openapiclient.NewUpdatePromoOfferDTO("OfferId_example")}) // UpdatePromoOffersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdatePromoOffers(context.Background(), businessId).UpdatePromoOffersRequest(updatePromoOffersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdatePromoOffers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdatePromoOffers`: UpdatePromoOffersResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdatePromoOffers`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**businessId** | **int64** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdatePromoOffersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md) |  | 

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateStocks

> EmptyApiResponse UpdateStocks(ctx, campaignId).UpdateStocksRequest(updateStocksRequest).Execute()

Передача информации об остатках



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
	updateStocksRequest := *openapiclient.NewUpdateStocksRequest([]openapiclient.UpdateStockDTO{*openapiclient.NewUpdateStockDTO("Sku_example", []openapiclient.UpdateStockItemDTO{*openapiclient.NewUpdateStockItemDTO(int64(123))})}) // UpdateStocksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.ExpressAPI.UpdateStocks(context.Background(), campaignId).UpdateStocksRequest(updateStocksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.UpdateStocks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateStocks`: EmptyApiResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.UpdateStocks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**campaignId** | **int64** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateStocksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateStocksRequest** | [**UpdateStocksRequest**](UpdateStocksRequest.md) |  | 

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
	resp, r, err := apiClient.ExpressAPI.VerifyOrderEac(context.Background(), campaignId, orderId).VerifyOrderEacRequest(verifyOrderEacRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `ExpressAPI.VerifyOrderEac``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `VerifyOrderEac`: VerifyOrderEacResponse
	fmt.Fprintf(os.Stdout, "Response from `ExpressAPI.VerifyOrderEac`: %v\n", resp)
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

