# FbyApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addHiddenOffers**](FbyApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
| [**addOffersToArchive**](FbyApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
| [**calculateTariffs**](FbyApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
| [**confirmBusinessPrices**](FbyApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
| [**confirmCampaignPrices**](FbyApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
| [**createChat**](FbyApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
| [**deleteCampaignOffers**](FbyApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
| [**deleteGoodsFeedbackComment**](FbyApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
| [**deleteHiddenOffers**](FbyApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
| [**deleteOffers**](FbyApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
| [**deleteOffersFromArchive**](FbyApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
| [**deletePromoOffers**](FbyApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
| [**generateBoostConsolidatedReport**](FbyApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
| [**generateCompetitorsPositionReport**](FbyApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
| [**generateGoodsFeedbackReport**](FbyApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
| [**generateGoodsMovementReport**](FbyApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров |
| [**generateGoodsRealizationReport**](FbyApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
| [**generateGoodsTurnoverReport**](FbyApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости |
| [**generatePricesReport**](FbyApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
| [**generateShelfsStatisticsReport**](FbyApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
| [**generateShowsSalesReport**](FbyApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
| [**generateStocksOnWarehousesReport**](FbyApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
| [**generateUnitedMarketplaceServicesReport**](FbyApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
| [**generateUnitedNettingReport**](FbyApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам |
| [**generateUnitedOrdersReport**](FbyApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам |
| [**getAllOffers**](FbyApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
| [**getBidsInfoForBusiness**](FbyApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
| [**getBidsRecommendations**](FbyApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
| [**getBusinessQuarantineOffers**](FbyApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
| [**getBusinessSettings**](FbyApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
| [**getCampaign**](FbyApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
| [**getCampaignLogins**](FbyApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
| [**getCampaignOffers**](FbyApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
| [**getCampaignQuarantineOffers**](FbyApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
| [**getCampaignRegion**](FbyApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
| [**getCampaignSettings**](FbyApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
| [**getCampaigns**](FbyApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя |
| [**getCampaignsByLogin**](FbyApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
| [**getCategoriesMaxSaleQuantum**](FbyApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**getCategoriesTree**](FbyApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий |
| [**getCategoryContentParameters**](FbyApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
| [**getChatHistory**](FbyApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
| [**getChats**](FbyApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
| [**getFeed**](FbyApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
| [**getFeedIndexLogs**](FbyApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
| [**getFeedbackAndCommentUpdates**](FbyApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
| [**getFeeds**](FbyApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
| [**getFulfillmentWarehouses**](FbyApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY) |
| [**getGoodsFeedbackComments**](FbyApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
| [**getGoodsFeedbacks**](FbyApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
| [**getGoodsStats**](FbyApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
| [**getHiddenOffers**](FbyApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
| [**getOfferCardsContentStatus**](FbyApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
| [**getOfferMappingEntries**](FbyApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
| [**getOfferMappings**](FbyApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
| [**getOfferRecommendations**](FbyApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
| [**getOffers**](FbyApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
| [**getOrder**](FbyApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
| [**getOrderBusinessBuyerInfo**](FbyApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
| [**getOrderBusinessDocumentsInfo**](FbyApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
| [**getOrders**](FbyApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
| [**getOrdersStats**](FbyApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
| [**getPrices**](FbyApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
| [**getPricesByOfferIds**](FbyApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
| [**getPromoOffers**](FbyApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
| [**getPromos**](FbyApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
| [**getQualityRatings**](FbyApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
| [**getReportInfo**](FbyApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
| [**getReturn**](FbyApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**getReturnPhoto**](FbyApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**getReturns**](FbyApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**getStocks**](FbyApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
| [**getSuggestedOfferMappingEntries**](FbyApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
| [**getSuggestedOfferMappings**](FbyApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
| [**getSuggestedPrices**](FbyApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
| [**putBidsForBusiness**](FbyApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
| [**putBidsForCampaign**](FbyApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
| [**refreshFeed**](FbyApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
| [**searchRegionChildren**](FbyApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
| [**searchRegionsById**](FbyApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе |
| [**searchRegionsByName**](FbyApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени |
| [**sendFileToChat**](FbyApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
| [**sendMessageToChat**](FbyApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
| [**setFeedParams**](FbyApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
| [**skipGoodsFeedbacksReaction**](FbyApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
| [**updateBusinessPrices**](FbyApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
| [**updateCampaignOffers**](FbyApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
| [**updateGoodsFeedbackComment**](FbyApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
| [**updateOfferContent**](FbyApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
| [**updateOfferMappingEntries**](FbyApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
| [**updateOfferMappings**](FbyApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
| [**updatePrices**](FbyApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
| [**updatePromoOffers**](FbyApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |


<a id="addHiddenOffers"></a>
# **addHiddenOffers**
> EmptyApiResponse addHiddenOffers(campaignId, addHiddenOffersRequest)

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val addHiddenOffersRequest : AddHiddenOffersRequest =  // AddHiddenOffersRequest | Запрос на скрытие оферов.
try {
    val result : EmptyApiResponse = apiInstance.addHiddenOffers(campaignId, addHiddenOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#addHiddenOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#addHiddenOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addHiddenOffersRequest** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md)| Запрос на скрытие оферов. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="addOffersToArchive"></a>
# **addOffersToArchive**
> AddOffersToArchiveResponse addOffersToArchive(businessId, addOffersToArchiveRequest)

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val addOffersToArchiveRequest : AddOffersToArchiveRequest =  // AddOffersToArchiveRequest | 
try {
    val result : AddOffersToArchiveResponse = apiInstance.addOffersToArchive(businessId, addOffersToArchiveRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#addOffersToArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#addOffersToArchive")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addOffersToArchiveRequest** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md)|  | |

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="calculateTariffs"></a>
# **calculateTariffs**
> CalculateTariffsResponse calculateTariffs(calculateTariffsRequest)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val calculateTariffsRequest : CalculateTariffsRequest =  // CalculateTariffsRequest | 
try {
    val result : CalculateTariffsResponse = apiInstance.calculateTariffs(calculateTariffsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#calculateTariffs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#calculateTariffs")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | |

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="confirmBusinessPrices"></a>
# **confirmBusinessPrices**
> EmptyApiResponse confirmBusinessPrices(businessId, confirmPricesRequest)

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val confirmPricesRequest : ConfirmPricesRequest =  // ConfirmPricesRequest | 
try {
    val result : EmptyApiResponse = apiInstance.confirmBusinessPrices(businessId, confirmPricesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#confirmBusinessPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#confirmBusinessPrices")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="confirmCampaignPrices"></a>
# **confirmCampaignPrices**
> EmptyApiResponse confirmCampaignPrices(campaignId, confirmPricesRequest)

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val confirmPricesRequest : ConfirmPricesRequest =  // ConfirmPricesRequest | 
try {
    val result : EmptyApiResponse = apiInstance.confirmCampaignPrices(campaignId, confirmPricesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#confirmCampaignPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#confirmCampaignPrices")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createChat"></a>
# **createChat**
> CreateChatResponse createChat(businessId, createChatRequest)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val createChatRequest : CreateChatRequest =  // CreateChatRequest | description
try {
    val result : CreateChatResponse = apiInstance.createChat(businessId, createChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#createChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#createChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md)| description | |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCampaignOffers"></a>
# **deleteCampaignOffers**
> DeleteCampaignOffersResponse deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deleteCampaignOffersRequest : DeleteCampaignOffersRequest =  // DeleteCampaignOffersRequest | 
try {
    val result : DeleteCampaignOffersResponse = apiInstance.deleteCampaignOffers(campaignId, deleteCampaignOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deleteCampaignOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deleteCampaignOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md)|  | |

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteGoodsFeedbackComment"></a>
# **deleteGoodsFeedbackComment**
> EmptyApiResponse deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deleteGoodsFeedbackCommentRequest : DeleteGoodsFeedbackCommentRequest =  // DeleteGoodsFeedbackCommentRequest | 
try {
    val result : EmptyApiResponse = apiInstance.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deleteGoodsFeedbackComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deleteGoodsFeedbackComment")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteHiddenOffers"></a>
# **deleteHiddenOffers**
> EmptyApiResponse deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deleteHiddenOffersRequest : DeleteHiddenOffersRequest =  // DeleteHiddenOffersRequest | Запрос на возобновление показа оферов.
try {
    val result : EmptyApiResponse = apiInstance.deleteHiddenOffers(campaignId, deleteHiddenOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deleteHiddenOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deleteHiddenOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md)| Запрос на возобновление показа оферов. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteOffers"></a>
# **deleteOffers**
> DeleteOffersResponse deleteOffers(businessId, deleteOffersRequest)

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deleteOffersRequest : DeleteOffersRequest =  // DeleteOffersRequest | 
try {
    val result : DeleteOffersResponse = apiInstance.deleteOffers(businessId, deleteOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deleteOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deleteOffers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteOffersRequest** | [**DeleteOffersRequest**](DeleteOffersRequest.md)|  | |

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteOffersFromArchive"></a>
# **deleteOffersFromArchive**
> DeleteOffersFromArchiveResponse deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deleteOffersFromArchiveRequest : DeleteOffersFromArchiveRequest =  // DeleteOffersFromArchiveRequest | 
try {
    val result : DeleteOffersFromArchiveResponse = apiInstance.deleteOffersFromArchive(businessId, deleteOffersFromArchiveRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deleteOffersFromArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deleteOffersFromArchive")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deleteOffersFromArchiveRequest** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md)|  | |

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePromoOffers"></a>
# **deletePromoOffers**
> DeletePromoOffersResponse deletePromoOffers(businessId, deletePromoOffersRequest)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val deletePromoOffersRequest : DeletePromoOffersRequest =  // DeletePromoOffersRequest | 
try {
    val result : DeletePromoOffersResponse = apiInstance.deletePromoOffers(businessId, deletePromoOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#deletePromoOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#deletePromoOffers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deletePromoOffersRequest** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md)|  | |

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateBoostConsolidatedReport"></a>
# **generateBoostConsolidatedReport**
> GenerateReportResponse generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateBoostConsolidatedRequest : GenerateBoostConsolidatedRequest =  // GenerateBoostConsolidatedRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateBoostConsolidatedReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateBoostConsolidatedReport")
    e.printStackTrace()
}
```

### Parameters
| **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateCompetitorsPositionReport"></a>
# **generateCompetitorsPositionReport**
> GenerateReportResponse generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateCompetitorsPositionReportRequest : GenerateCompetitorsPositionReportRequest =  // GenerateCompetitorsPositionReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateCompetitorsPositionReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateCompetitorsPositionReport")
    e.printStackTrace()
}
```

### Parameters
| **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsFeedbackReport"></a>
# **generateGoodsFeedbackReport**
> GenerateReportResponse generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateGoodsFeedbackRequest : GenerateGoodsFeedbackRequest =  // GenerateGoodsFeedbackRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateGoodsFeedbackReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateGoodsFeedbackReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsMovementReport"></a>
# **generateGoodsMovementReport**
> GenerateReportResponse generateGoodsMovementReport(generateGoodsMovementReportRequest, format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateGoodsMovementReportRequest : GenerateGoodsMovementReportRequest =  // GenerateGoodsMovementReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsMovementReport(generateGoodsMovementReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateGoodsMovementReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateGoodsMovementReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsRealizationReport"></a>
# **generateGoodsRealizationReport**
> GenerateReportResponse generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateGoodsRealizationReportRequest : GenerateGoodsRealizationReportRequest =  // GenerateGoodsRealizationReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateGoodsRealizationReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateGoodsRealizationReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsTurnoverReport"></a>
# **generateGoodsTurnoverReport**
> GenerateReportResponse generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateGoodsTurnoverRequest : GenerateGoodsTurnoverRequest =  // GenerateGoodsTurnoverRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateGoodsTurnoverReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateGoodsTurnoverReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generatePricesReport"></a>
# **generatePricesReport**
> GenerateReportResponse generatePricesReport(generatePricesReportRequest, format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generatePricesReportRequest : GeneratePricesReportRequest =  // GeneratePricesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generatePricesReport(generatePricesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generatePricesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generatePricesReport")
    e.printStackTrace()
}
```

### Parameters
| **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateShelfsStatisticsReport"></a>
# **generateShelfsStatisticsReport**
> GenerateReportResponse generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateShelfsStatisticsRequest : GenerateShelfsStatisticsRequest =  // GenerateShelfsStatisticsRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateShelfsStatisticsReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateShelfsStatisticsReport")
    e.printStackTrace()
}
```

### Parameters
| **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateShowsSalesReport"></a>
# **generateShowsSalesReport**
> GenerateReportResponse generateShowsSalesReport(generateShowsSalesReportRequest, format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateShowsSalesReportRequest : GenerateShowsSalesReportRequest =  // GenerateShowsSalesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateShowsSalesReport(generateShowsSalesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateShowsSalesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateShowsSalesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateStocksOnWarehousesReport"></a>
# **generateStocksOnWarehousesReport**
> GenerateReportResponse generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateStocksOnWarehousesReportRequest : GenerateStocksOnWarehousesReportRequest =  // GenerateStocksOnWarehousesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateStocksOnWarehousesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateStocksOnWarehousesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedMarketplaceServicesReport"></a>
# **generateUnitedMarketplaceServicesReport**
> GenerateReportResponse generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateUnitedMarketplaceServicesReportRequest : GenerateUnitedMarketplaceServicesReportRequest =  // GenerateUnitedMarketplaceServicesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateUnitedMarketplaceServicesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateUnitedMarketplaceServicesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedNettingReport"></a>
# **generateUnitedNettingReport**
> GenerateReportResponse generateUnitedNettingReport(generateUnitedNettingReportRequest, format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateUnitedNettingReportRequest : GenerateUnitedNettingReportRequest =  // GenerateUnitedNettingReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateUnitedNettingReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateUnitedNettingReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedOrdersReport"></a>
# **generateUnitedOrdersReport**
> GenerateReportResponse generateUnitedOrdersReport(generateUnitedOrdersRequest, format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val generateUnitedOrdersRequest : GenerateUnitedOrdersRequest =  // GenerateUnitedOrdersRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#generateUnitedOrdersReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#generateUnitedOrdersReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getAllOffers"></a>
# **getAllOffers**
> GetAllOffersResponse getAllOffers(campaignId, feedId, chunk)

Все предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
val chunk : kotlin.Int = 56 // kotlin.Int | Номер сегмента с результатами.  Значение по умолчанию: `0`.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать `chunk=0` и т. д.  {% endnote %} 
try {
    val result : GetAllOffersResponse = apiInstance.getAllOffers(campaignId, feedId, chunk)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getAllOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getAllOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chunk** | **kotlin.Int**| Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | [optional] |

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBidsInfoForBusiness"></a>
# **getBidsInfoForBusiness**
> GetBidsInfoResponse getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)

Информация об установленных ставках

Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getBidsInfoRequest : GetBidsInfoRequest =  // GetBidsInfoRequest | description
try {
    val result : GetBidsInfoResponse = apiInstance.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getBidsInfoForBusiness")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getBidsInfoForBusiness")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getBidsInfoRequest** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md)| description | [optional] |

### Return type

[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBidsRecommendations"></a>
# **getBidsRecommendations**
> GetBidsRecommendationsResponse getBidsRecommendations(businessId, getBidsRecommendationsRequest)

Рекомендованные ставки для заданных товаров

Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getBidsRecommendationsRequest : GetBidsRecommendationsRequest =  // GetBidsRecommendationsRequest | description.
try {
    val result : GetBidsRecommendationsResponse = apiInstance.getBidsRecommendations(businessId, getBidsRecommendationsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getBidsRecommendations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getBidsRecommendations")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getBidsRecommendationsRequest** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md)| description. | |

### Return type

[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessQuarantineOffers"></a>
# **getBusinessQuarantineOffers**
> GetQuarantineOffersResponse getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getQuarantineOffersRequest : GetQuarantineOffersRequest =  // GetQuarantineOffersRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetQuarantineOffersResponse = apiInstance.getBusinessQuarantineOffers(businessId, getQuarantineOffersRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getBusinessQuarantineOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getBusinessQuarantineOffers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessSettings"></a>
# **getBusinessSettings**
> GetBusinessSettingsResponse getBusinessSettings(businessId)

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetBusinessSettingsResponse = apiInstance.getBusinessSettings(businessId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getBusinessSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getBusinessSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaign"></a>
# **getCampaign**
> GetCampaignResponse getCampaign(campaignId)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignResponse = apiInstance.getCampaign(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaign")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignLogins"></a>
# **getCampaignLogins**
> GetCampaignLoginsResponse getCampaignLogins(campaignId)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignLoginsResponse = apiInstance.getCampaignLogins(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignLogins")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignLogins")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignOffers"></a>
# **getCampaignOffers**
> GetCampaignOffersResponse getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getCampaignOffersRequest : GetCampaignOffersRequest =  // GetCampaignOffersRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetCampaignOffersResponse = apiInstance.getCampaignOffers(campaignId, getCampaignOffersRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCampaignQuarantineOffers"></a>
# **getCampaignQuarantineOffers**
> GetQuarantineOffersResponse getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getQuarantineOffersRequest : GetQuarantineOffersRequest =  // GetQuarantineOffersRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetQuarantineOffersResponse = apiInstance.getCampaignQuarantineOffers(campaignId, getQuarantineOffersRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignQuarantineOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignQuarantineOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCampaignRegion"></a>
# **getCampaignRegion**
> GetCampaignRegionResponse getCampaignRegion(campaignId)

Регион магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignRegionResponse = apiInstance.getCampaignRegion(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignRegion")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignRegion")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignSettings"></a>
# **getCampaignSettings**
> GetCampaignSettingsResponse getCampaignSettings(campaignId)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetCampaignSettingsResponse = apiInstance.getCampaignSettings(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaigns"></a>
# **getCampaigns**
> GetCampaignsResponse getCampaigns(page, pageSize)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetCampaignsResponse = apiInstance.getCampaigns(page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaigns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaigns")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCampaignsByLogin"></a>
# **getCampaignsByLogin**
> GetCampaignsResponse getCampaignsByLogin(login, page, pageSize)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val login : kotlin.String = login_example // kotlin.String | Логин пользователя.
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetCampaignsResponse = apiInstance.getCampaignsByLogin(login, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCampaignsByLogin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCampaignsByLogin")
    e.printStackTrace()
}
```

### Parameters
| **login** | **kotlin.String**| Логин пользователя. | |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCategoriesMaxSaleQuantum"></a>
# **getCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val getCategoriesMaxSaleQuantumRequest : GetCategoriesMaxSaleQuantumRequest =  // GetCategoriesMaxSaleQuantumRequest | 
try {
    val result : GetCategoriesMaxSaleQuantumResponse = apiInstance.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCategoriesMaxSaleQuantum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCategoriesMaxSaleQuantum")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCategoriesTree"></a>
# **getCategoriesTree**
> GetCategoriesResponse getCategoriesTree(getCategoriesRequest)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val getCategoriesRequest : GetCategoriesRequest =  // GetCategoriesRequest | 
try {
    val result : GetCategoriesResponse = apiInstance.getCategoriesTree(getCategoriesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCategoriesTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCategoriesTree")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional] |

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCategoryContentParameters"></a>
# **getCategoryContentParameters**
> GetCategoryContentParametersResponse getCategoryContentParameters(categoryId)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val categoryId : kotlin.Long = 789 // kotlin.Long | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
try {
    val result : GetCategoryContentParametersResponse = apiInstance.getCategoryContentParameters(categoryId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getCategoryContentParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getCategoryContentParameters")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **kotlin.Long**| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | |

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getChatHistory"></a>
# **getChatHistory**
> GetChatHistoryResponse getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val getChatHistoryRequest : GetChatHistoryRequest =  // GetChatHistoryRequest | description
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetChatHistoryResponse = apiInstance.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getChatHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getChatHistory")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getChats"></a>
# **getChats**
> GetChatsResponse getChats(businessId, getChatsRequest, pageToken, limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getChatsRequest : GetChatsRequest =  // GetChatsRequest | description
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetChatsResponse = apiInstance.getChats(businessId, getChatsRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getChats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getChats")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md)| description | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getFeed"></a>
# **getFeed**
> GetFeedResponse getFeed(campaignId, feedId)

Информация о прайс-листе

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
try {
    val result : GetFeedResponse = apiInstance.getFeed(campaignId, feedId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getFeed")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | |

### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeedIndexLogs"></a>
# **getFeedIndexLogs**
> GetFeedIndexLogsResponse getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)

Отчет по индексации прайс-листа

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val publishedTimeFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса. 
val publishedTimeTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %} 
val status : FeedIndexLogsStatusType =  // FeedIndexLogsStatusType | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
try {
    val result : GetFeedIndexLogsResponse = apiInstance.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getFeedIndexLogs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getFeedIndexLogs")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| **publishedTimeFrom** | **java.time.OffsetDateTime**| Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | [optional] |
| **publishedTimeTo** | **java.time.OffsetDateTime**| Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**FeedIndexLogsStatusType**](.md)| Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | [optional] [enum: ERROR, OK, WARNING] |

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeedbackAndCommentUpdates"></a>
# **getFeedbackAndCommentUpdates**
> GetFeedbackListResponse getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

Новые и обновленные отзывы о магазине

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val fromDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: `ГГГГ-ММ-ДД`. 
try {
    val result : GetFeedbackListResponse = apiInstance.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getFeedbackAndCommentUpdates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getFeedbackAndCommentUpdates")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fromDate** | **java.time.LocalDate**| Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |

### Return type

[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeeds"></a>
# **getFeeds**
> GetFeedsResponse getFeeds(campaignId)

Список прайс-листов магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetFeedsResponse = apiInstance.getFeeds(campaignId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getFeeds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getFeeds")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFulfillmentWarehouses"></a>
# **getFulfillmentWarehouses**
> GetFulfillmentWarehousesResponse getFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
try {
    val result : GetFulfillmentWarehousesResponse = apiInstance.getFulfillmentWarehouses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getFulfillmentWarehouses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getFulfillmentWarehouses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGoodsFeedbackComments"></a>
# **getGoodsFeedbackComments**
> GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getGoodsFeedbackCommentsRequest : GetGoodsFeedbackCommentsRequest =  // GetGoodsFeedbackCommentsRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetGoodsFeedbackCommentsResponse = apiInstance.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getGoodsFeedbackComments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getGoodsFeedbackComments")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getGoodsFeedbacks"></a>
# **getGoodsFeedbacks**
> GetGoodsFeedbackResponse getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getGoodsFeedbackRequest : GetGoodsFeedbackRequest =  // GetGoodsFeedbackRequest | 
try {
    val result : GetGoodsFeedbackResponse = apiInstance.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getGoodsFeedbacks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getGoodsFeedbacks")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md)|  | [optional] |

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getGoodsStats"></a>
# **getGoodsStats**
> GetGoodsStatsResponse getGoodsStats(campaignId, getGoodsStatsRequest)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getGoodsStatsRequest : GetGoodsStatsRequest =  // GetGoodsStatsRequest | 
try {
    val result : GetGoodsStatsResponse = apiInstance.getGoodsStats(campaignId, getGoodsStatsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getGoodsStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getGoodsStats")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  | |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getHiddenOffers"></a>
# **getHiddenOffers**
> GetHiddenOffersResponse getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val offerId : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Идентификатор скрытого предложения. 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val offset : kotlin.Int = 56 // kotlin.Int | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetHiddenOffersResponse = apiInstance.getHiddenOffers(campaignId, offerId, pageToken, limit, offset, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getHiddenOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getHiddenOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **offerId** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Идентификатор скрытого предложения.  | [optional] |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| **offset** | **kotlin.Int**| Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional] |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOfferCardsContentStatus"></a>
# **getOfferCardsContentStatus**
> GetOfferCardsContentStatusResponse getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getOfferCardsContentStatusRequest : GetOfferCardsContentStatusRequest =  // GetOfferCardsContentStatusRequest | 
try {
    val result : GetOfferCardsContentStatusResponse = apiInstance.getOfferCardsContentStatus(businessId, pageToken, limit, getOfferCardsContentStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOfferCardsContentStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOfferCardsContentStatus")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md)|  | [optional] |

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getOfferMappingEntries"></a>
# **getOfferMappingEntries**
> GetOfferMappingEntriesResponse getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)

Список товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val offerId : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Идентификатор товара в каталоге.
val shopSku : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  ``` ...shop_sku=123&shop_sku=129&shop_sku=141... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
val mappingKind : OfferMappingKindType =  // OfferMappingKindType | Тип маппинга.
val status : kotlin.collections.List<OfferProcessingStatusType> =  // kotlin.collections.List<OfferProcessingStatusType> | Фильтрация по статусу публикации товара:  * `READY` — товар прошел модерацию. * `IN_WORK` — товар проходит модерацию. * `NEED_CONTENT` — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * `OTHER` — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...status=READY,IN_WORK... ...status=READY&status=IN_WORK... ```  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
val availability : kotlin.collections.List<OfferAvailabilityStatusType> =  // kotlin.collections.List<OfferAvailabilityStatusType> | Фильтрация по планам поставок товара:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...availability=INACTIVE,DELISTED... ...availability=INACTIVE&availability=DELISTED... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
val categoryId : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...category_id=14727164,14382343... ...category_id=14727164&category_id=14382343... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. 
val vendor : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...vendor=Aqua%20Minerale,Borjomi... ...vendor=Aqua%20Minerale&vendor=Borjomi... ```  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetOfferMappingEntriesResponse = apiInstance.getOfferMappingEntries(campaignId, offerId, shopSku, mappingKind, status, availability, categoryId, vendor, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOfferMappingEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOfferMappingEntries")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **offerId** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Идентификатор товара в каталоге. | [optional] |
| **shopSku** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **mappingKind** | [**OfferMappingKindType**](.md)| Тип маппинга. | [optional] [enum: ACTIVE, ALL] |
| **status** | [**kotlin.collections.List&lt;OfferProcessingStatusType&gt;**](OfferProcessingStatusType.md)| Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] |
| **availability** | [**kotlin.collections.List&lt;OfferAvailabilityStatusType&gt;**](OfferAvailabilityStatusType.md)| Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **categoryId** | [**kotlin.collections.List&lt;kotlin.Int&gt;**](kotlin.Int.md)| Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] |
| **vendor** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOfferMappings"></a>
# **getOfferMappings**
> GetOfferMappingsResponse getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getOfferMappingsRequest : GetOfferMappingsRequest =  // GetOfferMappingsRequest | 
try {
    val result : GetOfferMappingsResponse = apiInstance.getOfferMappings(businessId, pageToken, limit, getOfferMappingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOfferMappings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOfferMappings")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getOfferMappingsRequest** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md)|  | [optional] |

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getOfferRecommendations"></a>
# **getOfferRecommendations**
> GetOfferRecommendationsResponse getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getOfferRecommendationsRequest : GetOfferRecommendationsRequest =  // GetOfferRecommendationsRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetOfferRecommendationsResponse = apiInstance.getOfferRecommendations(businessId, getOfferRecommendationsRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOfferRecommendations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOfferRecommendations")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getOffers"></a>
# **getOffers**
> GetOffersResponse getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)

Предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val query : kotlin.String = query_example // kotlin.String | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете. 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
val shopCategoryId : kotlin.String = shopCategoryId_example // kotlin.String | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
val currency : CurrencyType =  // CurrencyType | Валюта, в которой указана цена предложения.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна. 
val matched : kotlin.Boolean = true // kotlin.Boolean | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * `0 / FALSE / NO` — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * `1 / TRUE / YES` — поиск выполняется среди предложений, соотнесенных с карточками моделей). 
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetOffersResponse = apiInstance.getOffers(campaignId, query, feedId, shopCategoryId, currency, matched, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **query** | **kotlin.String**| Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | [optional] |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | [optional] |
| **shopCategoryId** | **kotlin.String**| Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] |
| **currency** | [**CurrencyType**](.md)| Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | [optional] [enum: RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE] |
| **matched** | **kotlin.Boolean**| Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | [optional] |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrder"></a>
# **getOrder**
> GetOrderResponse getOrder(campaignId, orderId)

Информация об одном заказе

Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
try {
    val result : GetOrderResponse = apiInstance.getOrder(campaignId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOrder")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderBusinessBuyerInfo"></a>
# **getOrderBusinessBuyerInfo**
> GetBusinessBuyerInfoResponse getOrderBusinessBuyerInfo(campaignId, orderId)

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
try {
    val result : GetBusinessBuyerInfoResponse = apiInstance.getOrderBusinessBuyerInfo(campaignId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOrderBusinessBuyerInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOrderBusinessBuyerInfo")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderBusinessDocumentsInfo"></a>
# **getOrderBusinessDocumentsInfo**
> GetBusinessDocumentsInfoResponse getOrderBusinessDocumentsInfo(campaignId, orderId)

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
try {
    val result : GetBusinessDocumentsInfoResponse = apiInstance.getOrderBusinessDocumentsInfo(campaignId, orderId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOrderBusinessDocumentsInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOrderBusinessDocumentsInfo")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrders"></a>
# **getOrders**
> GetOrdersResponse getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)

Информация о нескольких заказах

Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderIds : kotlin.collections.List<kotlin.Long> =  // kotlin.collections.List<kotlin.Long> | Фильтрация заказов по идентификаторам. <br><br> ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. 
val status : kotlin.collections.Set<OrderStatusType> =  // kotlin.collections.Set<OrderStatusType> | Статус заказа:  * `CANCELLED` — заказ отменен.  * `DELIVERED` — заказ получен покупателем.  * `DELIVERY` — заказ передан в службу доставки.  * `PICKUP` — заказ доставлен в пункт самовывоза.  * `PROCESSING` — заказ находится в обработке.  * `UNPAID` — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
val substatus : kotlin.collections.Set<OrderSubstatusType> =  // kotlin.collections.Set<OrderSubstatusType> | Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  Возможные значения для заказа в статусе `PROCESSING`:  * `STARTED` — заказ подтвержден, его можно начать обрабатывать. * `READY_TO_SHIP` — заказ собран и готов к отправке. * `SHIPPED` — заказ передан службе доставки.  Возможные значения для заказа в статусе `CANCELLED`:  * `DELIVERY_SERVICE_UNDELIVERED` — служба доставки не смогла доставить заказ.  * `PROCESSING_EXPIRED` — значение более не используется.  * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.  * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * `RESERVATION_FAILED` — Маркет не может продолжить дальнейшую обработку заказа.  * `SHOP_FAILED` — магазин не может выполнить заказ.  * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.  * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.  * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.  * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.  * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.  * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * `USER_WANTS_TO_CHANGE_DELIVERY_DATE` — покупатель хочет получить заказ в другой день. * `CANCELLED_COURIER_NOT_FOUND` — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
val fromDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `toDate`) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. 
val toDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `fromDate`) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. 
val supplierShipmentDateFrom : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `supplierShipmentDateTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
val supplierShipmentDateTo : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `supplierShipmentDateFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
val updatedAtFrom : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Начальная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной и конечной датой (параметр `updatedAtTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
val updatedAtTo : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Конечная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной (параметр `updatedAtFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
val dispatchType : OrderDeliveryDispatchType =  // OrderDeliveryDispatchType | Способ отгрузки
val fake : kotlin.Boolean = true // kotlin.Boolean | Фильтрация заказов по типам:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
val hasCis : kotlin.Boolean = true // kotlin.Boolean | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да.  * `false` — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
val onlyWaitingForCancellationApprove : kotlin.Boolean = true // kotlin.Boolean | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение `true` возвращаются только заказы, которые находятся в статусе `DELIVERY` или `PICKUP` и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). 
val onlyEstimatedDelivery : kotlin.Boolean = true // kotlin.Boolean | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * `true` — возвращаются только заказы с неподтвержденной датой доставки. * `false` — фильтрация не применяется. 
val buyerType : OrderBuyerType =  // OrderBuyerType | Фильтрация заказов по типу покупателя. 
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetOrdersResponse = apiInstance.getOrders(campaignId, orderIds, status, substatus, fromDate, toDate, supplierShipmentDateFrom, supplierShipmentDateTo, updatedAtFrom, updatedAtTo, dispatchType, fake, hasCis, onlyWaitingForCancellationApprove, onlyEstimatedDelivery, buyerType, page, pageSize, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOrders")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderIds** | [**kotlin.collections.List&lt;kotlin.Long&gt;**](kotlin.Long.md)| Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  | [optional] |
| **status** | [**kotlin.collections.Set&lt;OrderStatusType&gt;**](OrderStatusType.md)| Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] |
| **substatus** | [**kotlin.collections.Set&lt;OrderSubstatusType&gt;**](OrderSubstatusType.md)| Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] |
| **fromDate** | **java.time.LocalDate**| Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  | [optional] |
| **toDate** | **java.time.LocalDate**| Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  | [optional] |
| **supplierShipmentDateFrom** | **java.time.LocalDate**| Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] |
| **supplierShipmentDateTo** | **java.time.LocalDate**| Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] |
| **updatedAtFrom** | **java.time.OffsetDateTime**| Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] |
| **updatedAtTo** | **java.time.OffsetDateTime**| Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] |
| **dispatchType** | [**OrderDeliveryDispatchType**](.md)| Способ отгрузки | [optional] [enum: UNKNOWN, BUYER, MARKET_PARTNER_OUTLET, MARKET_BRANDED_OUTLET, SHOP_OUTLET, DROPOFF] |
| **fake** | **kotlin.Boolean**| Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to false] |
| **hasCis** | **kotlin.Boolean**| Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] [default to false] |
| **onlyWaitingForCancellationApprove** | **kotlin.Boolean**| **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  | [optional] [default to false] |
| **onlyEstimatedDelivery** | **kotlin.Boolean**| Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется.  | [optional] [default to false] |
| **buyerType** | [**OrderBuyerType**](.md)| Фильтрация заказов по типу покупателя.  | [optional] [enum: PERSON, BUSINESS] |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrdersStats"></a>
# **getOrdersStats**
> GetOrdersStatsResponse getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getOrdersStatsRequest : GetOrdersStatsRequest =  // GetOrdersStatsRequest | 
try {
    val result : GetOrdersStatsResponse = apiInstance.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getOrdersStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getOrdersStats")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md)|  | [optional] |

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPrices"></a>
# **getPrices**
> GetPricesResponse getPrices(campaignId, pageToken, limit, archived)

Список цен

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val archived : kotlin.Boolean = true // kotlin.Boolean | Фильтр по нахождению в архиве.
try {
    val result : GetPricesResponse = apiInstance.getPrices(campaignId, pageToken, limit, archived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getPrices")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **archived** | **kotlin.Boolean**| Фильтр по нахождению в архиве. | [optional] [default to false] |

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPricesByOfferIds"></a>
# **getPricesByOfferIds**
> GetPricesByOfferIdsResponse getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getPricesByOfferIdsRequest : GetPricesByOfferIdsRequest =  // GetPricesByOfferIdsRequest | 
try {
    val result : GetPricesByOfferIdsResponse = apiInstance.getPricesByOfferIds(campaignId, pageToken, limit, getPricesByOfferIdsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getPricesByOfferIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getPricesByOfferIds")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getPricesByOfferIdsRequest** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md)|  | [optional] |

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPromoOffers"></a>
# **getPromoOffers**
> GetPromoOffersResponse getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getPromoOffersRequest : GetPromoOffersRequest =  // GetPromoOffersRequest | 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetPromoOffersResponse = apiInstance.getPromoOffers(businessId, getPromoOffersRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getPromoOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getPromoOffers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getPromoOffersRequest** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md)|  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPromos"></a>
# **getPromos**
> GetPromosResponse getPromos(businessId, getPromosRequest)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getPromosRequest : GetPromosRequest =  // GetPromosRequest | 
try {
    val result : GetPromosResponse = apiInstance.getPromos(businessId, getPromosRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getPromos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getPromos")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getPromosRequest** | [**GetPromosRequest**](GetPromosRequest.md)|  | [optional] |

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getQualityRatings"></a>
# **getQualityRatings**
> GetQualityRatingResponse getQualityRatings(businessId, getQualityRatingRequest)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getQualityRatingRequest : GetQualityRatingRequest =  // GetQualityRatingRequest | 
try {
    val result : GetQualityRatingResponse = apiInstance.getQualityRatings(businessId, getQualityRatingRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getQualityRatings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getQualityRatings")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getQualityRatingRequest** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md)|  | |

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getReportInfo"></a>
# **getReportInfo**
> GetReportInfoResponse getReportInfo(reportId)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val reportId : kotlin.String = reportId_example // kotlin.String | Идентификатор отчета, который вы получили после запуска генерации. 
try {
    val result : GetReportInfoResponse = apiInstance.getReportInfo(reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getReportInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getReportInfo")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportId** | **kotlin.String**| Идентификатор отчета, который вы получили после запуска генерации.  | |

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturn"></a>
# **getReturn**
> GetReturnResponse getReturn(campaignId, orderId, returnId)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
try {
    val result : GetReturnResponse = apiInstance.getReturn(campaignId, orderId, returnId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getReturn")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getReturn")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturnPhoto"></a>
# **getReturnPhoto**
> java.io.File getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val orderId : kotlin.Long = 789 // kotlin.Long | Идентификатор заказа.
val returnId : kotlin.Long = 789 // kotlin.Long | Идентификатор возврата.
val itemId : kotlin.Long = 789 // kotlin.Long | Идентификатор товара в возврате.
val imageHash : kotlin.String = imageHash_example // kotlin.String | Хеш ссылки изображения для загрузки.
try {
    val result : java.io.File = apiInstance.getReturnPhoto(campaignId, orderId, returnId, itemId, imageHash)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getReturnPhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getReturnPhoto")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | **kotlin.Long**| Идентификатор заказа. | |
| **returnId** | **kotlin.Long**| Идентификатор возврата. | |
| **itemId** | **kotlin.Long**| Идентификатор товара в возврате. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **imageHash** | **kotlin.String**| Хеш ссылки изображения для загрузки. | |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

<a id="getReturns"></a>
# **getReturns**
> GetReturnsResponse getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val orderIds : kotlin.collections.List<kotlin.Long> =  // kotlin.collections.List<kotlin.Long> | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
val statuses : kotlin.collections.List<RefundStatusType> = STARTED_BY_USER,WAITING_FOR_DECISION // kotlin.collections.List<RefundStatusType> | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
val type : ReturnType =  // ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
val fromDate : java.time.LocalDate = 2022-10-31 // java.time.LocalDate | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
val toDate : java.time.LocalDate = 2022-11-30 // java.time.LocalDate | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
val fromDate2 : java.time.LocalDate = 2022-10-31 // java.time.LocalDate | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
val toDate2 : java.time.LocalDate = 2022-11-30 // java.time.LocalDate | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
try {
    val result : GetReturnsResponse = apiInstance.getReturns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getReturns")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getReturns")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| **orderIds** | [**kotlin.collections.List&lt;kotlin.Long&gt;**](kotlin.Long.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] |
| **statuses** | [**kotlin.collections.List&lt;RefundStatusType&gt;**](RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] |
| **type** | [**ReturnType**](.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] [enum: UNREDEEMED, RETURN] |
| **fromDate** | **java.time.LocalDate**| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **toDate** | **java.time.LocalDate**| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **fromDate2** | **java.time.LocalDate**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toDate2** | **java.time.LocalDate**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStocks"></a>
# **getStocks**
> GetWarehouseStocksResponse getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
val getWarehouseStocksRequest : GetWarehouseStocksRequest =  // GetWarehouseStocksRequest | 
try {
    val result : GetWarehouseStocksResponse = apiInstance.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getStocks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getStocks")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getWarehouseStocksRequest** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md)|  | [optional] |

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSuggestedOfferMappingEntries"></a>
# **getSuggestedOfferMappingEntries**
> GetSuggestedOfferMappingEntriesResponse getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)

Рекомендованные карточки для товаров

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getSuggestedOfferMappingEntriesRequest : GetSuggestedOfferMappingEntriesRequest =  // GetSuggestedOfferMappingEntriesRequest | 
try {
    val result : GetSuggestedOfferMappingEntriesResponse = apiInstance.getSuggestedOfferMappingEntries(campaignId, getSuggestedOfferMappingEntriesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getSuggestedOfferMappingEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getSuggestedOfferMappingEntries")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getSuggestedOfferMappingEntriesRequest** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md)|  | |

### Return type

[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSuggestedOfferMappings"></a>
# **getSuggestedOfferMappings**
> GetSuggestedOfferMappingsResponse getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getSuggestedOfferMappingsRequest : GetSuggestedOfferMappingsRequest =  // GetSuggestedOfferMappingsRequest | 
try {
    val result : GetSuggestedOfferMappingsResponse = apiInstance.getSuggestedOfferMappings(businessId, getSuggestedOfferMappingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getSuggestedOfferMappings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getSuggestedOfferMappings")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getSuggestedOfferMappingsRequest** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md)|  | [optional] |

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSuggestedPrices"></a>
# **getSuggestedPrices**
> SuggestPricesResponse getSuggestedPrices(campaignId, suggestPricesRequest)

Цены для продвижения товаров

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val suggestPricesRequest : SuggestPricesRequest =  // SuggestPricesRequest | 
try {
    val result : SuggestPricesResponse = apiInstance.getSuggestedPrices(campaignId, suggestPricesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#getSuggestedPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#getSuggestedPrices")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **suggestPricesRequest** | [**SuggestPricesRequest**](SuggestPricesRequest.md)|  | |

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="putBidsForBusiness"></a>
# **putBidsForBusiness**
> EmptyApiResponse putBidsForBusiness(businessId, putSkuBidsRequest)

Включение буста продаж и установка ставок

Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val putSkuBidsRequest : PutSkuBidsRequest =  // PutSkuBidsRequest | description
try {
    val result : EmptyApiResponse = apiInstance.putBidsForBusiness(businessId, putSkuBidsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#putBidsForBusiness")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#putBidsForBusiness")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md)| description | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="putBidsForCampaign"></a>
# **putBidsForCampaign**
> EmptyApiResponse putBidsForCampaign(campaignId, putSkuBidsRequest)

Включение буста продаж и установка ставок для магазина

Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val putSkuBidsRequest : PutSkuBidsRequest =  // PutSkuBidsRequest | description
try {
    val result : EmptyApiResponse = apiInstance.putBidsForCampaign(campaignId, putSkuBidsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#putBidsForCampaign")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#putBidsForCampaign")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md)| description | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="refreshFeed"></a>
# **refreshFeed**
> EmptyApiResponse refreshFeed(campaignId, feedId)

Сообщить, что прайс-лист обновился

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
try {
    val result : EmptyApiResponse = apiInstance.refreshFeed(campaignId, feedId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#refreshFeed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#refreshFeed")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRegionChildren"></a>
# **searchRegionChildren**
> GetRegionWithChildrenResponse searchRegionChildren(regionId, page, pageSize)

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
val page : kotlin.Int = 56 // kotlin.Int | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
val pageSize : kotlin.Int = 56 // kotlin.Int | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
try {
    val result : GetRegionWithChildrenResponse = apiInstance.searchRegionChildren(regionId, page, pageSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#searchRegionChildren")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#searchRegionChildren")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **kotlin.Long**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |
| **page** | **kotlin.Int**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **kotlin.Int**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRegionsById"></a>
# **searchRegionsById**
> GetRegionsResponse searchRegionsById(regionId)

Информация о регионе

Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
try {
    val result : GetRegionsResponse = apiInstance.searchRegionsById(regionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#searchRegionsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#searchRegionsById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **regionId** | **kotlin.Long**| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="searchRegionsByName"></a>
# **searchRegionsByName**
> GetRegionsResponse searchRegionsByName(name, pageToken, limit)

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val name : kotlin.String = name_example // kotlin.String | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetRegionsResponse = apiInstance.searchRegionsByName(name, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#searchRegionsByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#searchRegionsByName")
    e.printStackTrace()
}
```

### Parameters
| **name** | **kotlin.String**| Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="sendFileToChat"></a>
# **sendFileToChat**
> EmptyApiResponse sendFileToChat(businessId, chatId, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Содержимое файла. Максимальный размер файла — 5 Мбайт.
try {
    val result : EmptyApiResponse = apiInstance.sendFileToChat(businessId, chatId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#sendFileToChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#sendFileToChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="sendMessageToChat"></a>
# **sendMessageToChat**
> EmptyApiResponse sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val sendMessageToChatRequest : SendMessageToChatRequest =  // SendMessageToChatRequest | description
try {
    val result : EmptyApiResponse = apiInstance.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#sendMessageToChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#sendMessageToChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="setFeedParams"></a>
# **setFeedParams**
> EmptyApiResponse setFeedParams(campaignId, feedId, setFeedParamsRequest)

Изменение параметров прайс-листа

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val feedId : kotlin.Long = 789 // kotlin.Long | Идентификатор прайс-листа.
val setFeedParamsRequest : SetFeedParamsRequest =  // SetFeedParamsRequest | 
try {
    val result : EmptyApiResponse = apiInstance.setFeedParams(campaignId, feedId, setFeedParamsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#setFeedParams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#setFeedParams")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | **kotlin.Long**| Идентификатор прайс-листа. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="skipGoodsFeedbacksReaction"></a>
# **skipGoodsFeedbacksReaction**
> EmptyApiResponse skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val skipGoodsFeedbackReactionRequest : SkipGoodsFeedbackReactionRequest =  // SkipGoodsFeedbackReactionRequest | 
try {
    val result : EmptyApiResponse = apiInstance.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#skipGoodsFeedbacksReaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#skipGoodsFeedbacksReaction")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBusinessPrices"></a>
# **updateBusinessPrices**
> EmptyApiResponse updateBusinessPrices(businessId, updateBusinessPricesRequest)

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateBusinessPricesRequest : UpdateBusinessPricesRequest =  // UpdateBusinessPricesRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updateBusinessPrices(businessId, updateBusinessPricesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateBusinessPrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateBusinessPrices")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateBusinessPricesRequest** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCampaignOffers"></a>
# **updateCampaignOffers**
> EmptyApiResponse updateCampaignOffers(campaignId, updateCampaignOffersRequest)

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateCampaignOffersRequest : UpdateCampaignOffersRequest =  // UpdateCampaignOffersRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updateCampaignOffers(campaignId, updateCampaignOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateCampaignOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateCampaignOffers")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateGoodsFeedbackComment"></a>
# **updateGoodsFeedbackComment**
> UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateGoodsFeedbackCommentRequest : UpdateGoodsFeedbackCommentRequest =  // UpdateGoodsFeedbackCommentRequest | 
try {
    val result : UpdateGoodsFeedbackCommentResponse = apiInstance.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateGoodsFeedbackComment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateGoodsFeedbackComment")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md)|  | |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateOfferContent"></a>
# **updateOfferContent**
> UpdateOfferContentResponse updateOfferContent(businessId, updateOfferContentRequest)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateOfferContentRequest : UpdateOfferContentRequest =  // UpdateOfferContentRequest | 
try {
    val result : UpdateOfferContentResponse = apiInstance.updateOfferContent(businessId, updateOfferContentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateOfferContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateOfferContent")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md)|  | |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateOfferMappingEntries"></a>
# **updateOfferMappingEntries**
> EmptyApiResponse updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)

Добавление и редактирование товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateOfferMappingEntryRequest : UpdateOfferMappingEntryRequest =  // UpdateOfferMappingEntryRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updateOfferMappingEntries(campaignId, updateOfferMappingEntryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateOfferMappingEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateOfferMappingEntries")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateOfferMappingEntryRequest** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateOfferMappings"></a>
# **updateOfferMappings**
> UpdateOfferMappingsResponse updateOfferMappings(businessId, updateOfferMappingsRequest)

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateOfferMappingsRequest : UpdateOfferMappingsRequest =  // UpdateOfferMappingsRequest | 
try {
    val result : UpdateOfferMappingsResponse = apiInstance.updateOfferMappings(businessId, updateOfferMappingsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updateOfferMappings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updateOfferMappings")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateOfferMappingsRequest** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md)|  | |

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePrices"></a>
# **updatePrices**
> EmptyApiResponse updatePrices(campaignId, updatePricesRequest)

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updatePricesRequest : UpdatePricesRequest =  // UpdatePricesRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updatePrices(campaignId, updatePricesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updatePrices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updatePrices")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updatePricesRequest** | [**UpdatePricesRequest**](UpdatePricesRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePromoOffers"></a>
# **updatePromoOffers**
> UpdatePromoOffersResponse updatePromoOffers(businessId, updatePromoOffersRequest)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = FbyApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updatePromoOffersRequest : UpdatePromoOffersRequest =  // UpdatePromoOffersRequest | 
try {
    val result : UpdatePromoOffersResponse = apiInstance.updatePromoOffers(businessId, updatePromoOffersRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FbyApi#updatePromoOffers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FbyApi#updatePromoOffers")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md)|  | |

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

