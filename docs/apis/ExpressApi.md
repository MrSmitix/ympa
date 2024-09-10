# ExpressApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addHiddenOffers**](ExpressApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
| [**addOffersToArchive**](ExpressApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
| [**calculateTariffs**](ExpressApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
| [**confirmBusinessPrices**](ExpressApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
| [**confirmCampaignPrices**](ExpressApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
| [**createChat**](ExpressApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
| [**deleteCampaignOffers**](ExpressApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
| [**deleteGoodsFeedbackComment**](ExpressApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
| [**deleteHiddenOffers**](ExpressApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
| [**deleteOffers**](ExpressApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
| [**deleteOffersFromArchive**](ExpressApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
| [**deletePromoOffers**](ExpressApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
| [**generateBoostConsolidatedReport**](ExpressApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
| [**generateCompetitorsPositionReport**](ExpressApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
| [**generateGoodsFeedbackReport**](ExpressApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
| [**generateGoodsRealizationReport**](ExpressApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
| [**generateMassOrderLabelsReport**](ExpressApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
| [**generateOrderLabel**](ExpressApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
| [**generateOrderLabels**](ExpressApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
| [**generatePricesReport**](ExpressApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
| [**generateShelfsStatisticsReport**](ExpressApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
| [**generateShowsSalesReport**](ExpressApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
| [**generateStocksOnWarehousesReport**](ExpressApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
| [**generateUnitedMarketplaceServicesReport**](ExpressApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
| [**generateUnitedNettingReport**](ExpressApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам |
| [**generateUnitedOrdersReport**](ExpressApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам |
| [**getAllOffers**](ExpressApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
| [**getBidsInfoForBusiness**](ExpressApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
| [**getBidsRecommendations**](ExpressApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
| [**getBusinessQuarantineOffers**](ExpressApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
| [**getBusinessSettings**](ExpressApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
| [**getCampaign**](ExpressApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
| [**getCampaignLogins**](ExpressApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
| [**getCampaignOffers**](ExpressApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
| [**getCampaignQuarantineOffers**](ExpressApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
| [**getCampaignRegion**](ExpressApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
| [**getCampaignSettings**](ExpressApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
| [**getCampaigns**](ExpressApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя |
| [**getCampaignsByLogin**](ExpressApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
| [**getCategoriesMaxSaleQuantum**](ExpressApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**getCategoriesTree**](ExpressApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий |
| [**getCategoryContentParameters**](ExpressApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
| [**getChatHistory**](ExpressApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
| [**getChats**](ExpressApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
| [**getDeliveryServices**](ExpressApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки |
| [**getFeed**](ExpressApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
| [**getFeedIndexLogs**](ExpressApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
| [**getFeedbackAndCommentUpdates**](ExpressApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
| [**getFeeds**](ExpressApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
| [**getGoodsFeedbackComments**](ExpressApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
| [**getGoodsFeedbacks**](ExpressApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
| [**getGoodsStats**](ExpressApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
| [**getHiddenOffers**](ExpressApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
| [**getOfferCardsContentStatus**](ExpressApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
| [**getOfferMappingEntries**](ExpressApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
| [**getOfferMappings**](ExpressApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
| [**getOfferRecommendations**](ExpressApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
| [**getOffers**](ExpressApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
| [**getOrder**](ExpressApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
| [**getOrderBusinessBuyerInfo**](ExpressApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
| [**getOrderBusinessDocumentsInfo**](ExpressApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
| [**getOrderLabelsData**](ExpressApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
| [**getOrders**](ExpressApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
| [**getOrdersStats**](ExpressApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
| [**getPrices**](ExpressApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
| [**getPricesByOfferIds**](ExpressApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
| [**getPromoOffers**](ExpressApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
| [**getPromos**](ExpressApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
| [**getQualityRatingDetails**](ExpressApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
| [**getQualityRatings**](ExpressApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
| [**getReportInfo**](ExpressApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
| [**getReturn**](ExpressApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**getReturnApplication**](ExpressApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
| [**getReturnPhoto**](ExpressApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**getReturns**](ExpressApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**getStocks**](ExpressApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
| [**getSuggestedOfferMappingEntries**](ExpressApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
| [**getSuggestedOfferMappings**](ExpressApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
| [**getSuggestedPrices**](ExpressApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
| [**getWarehouses**](ExpressApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |
| [**provideOrderItemIdentifiers**](ExpressApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
| [**putBidsForBusiness**](ExpressApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
| [**putBidsForCampaign**](ExpressApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
| [**refreshFeed**](ExpressApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
| [**searchRegionChildren**](ExpressApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
| [**searchRegionsById**](ExpressApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе |
| [**searchRegionsByName**](ExpressApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени |
| [**sendFileToChat**](ExpressApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
| [**sendMessageToChat**](ExpressApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
| [**setFeedParams**](ExpressApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
| [**setOrderBoxLayout**](ExpressApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
| [**setOrderShipmentBoxes**](ExpressApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
| [**skipGoodsFeedbacksReaction**](ExpressApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
| [**updateBusinessPrices**](ExpressApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
| [**updateCampaignOffers**](ExpressApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
| [**updateGoodsFeedbackComment**](ExpressApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
| [**updateOfferContent**](ExpressApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
| [**updateOfferMappingEntries**](ExpressApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
| [**updateOfferMappings**](ExpressApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
| [**updateOrderItems**](ExpressApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
| [**updateOrderStatus**](ExpressApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
| [**updateOrderStatuses**](ExpressApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
| [**updatePrices**](ExpressApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
| [**updatePromoOffers**](ExpressApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
| [**updateStocks**](ExpressApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |
| [**verifyOrderEac**](ExpressApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения |


## Creating ExpressApi

To initiate an instance of `ExpressApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ExpressApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ExpressApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ExpressApi expressApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="addHiddenOffers"></a>
# **addHiddenOffers**
```java
Mono<EmptyApiResponse> ExpressApi.addHiddenOffers(campaignIdaddHiddenOffersRequest)
```

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **addHiddenOffersRequest** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md)| Запрос на скрытие оферов. | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="addOffersToArchive"></a>
# **addOffersToArchive**
```java
Mono<AddOffersToArchiveResponse> ExpressApi.addOffersToArchive(businessIdaddOffersToArchiveRequest)
```

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **addOffersToArchiveRequest** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md)|  | |


### Return type
[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="calculateTariffs"></a>
# **calculateTariffs**
```java
Mono<CalculateTariffsResponse> ExpressApi.calculateTariffs(calculateTariffsRequest)
```

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | |


### Return type
[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="confirmBusinessPrices"></a>
# **confirmBusinessPrices**
```java
Mono<EmptyApiResponse> ExpressApi.confirmBusinessPrices(businessIdconfirmPricesRequest)
```

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="confirmCampaignPrices"></a>
# **confirmCampaignPrices**
```java
Mono<EmptyApiResponse> ExpressApi.confirmCampaignPrices(campaignIdconfirmPricesRequest)
```

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="createChat"></a>
# **createChat**
```java
Mono<CreateChatResponse> ExpressApi.createChat(businessIdcreateChatRequest)
```

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md)| description | |


### Return type
[**CreateChatResponse**](CreateChatResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteCampaignOffers"></a>
# **deleteCampaignOffers**
```java
Mono<DeleteCampaignOffersResponse> ExpressApi.deleteCampaignOffers(campaignIddeleteCampaignOffersRequest)
```

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.  {% note warning \&quot;Запрос удаляет товары именно из конкретного магазина\&quot; %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md)|  | |


### Return type
[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteGoodsFeedbackComment"></a>
# **deleteGoodsFeedbackComment**
```java
Mono<EmptyApiResponse> ExpressApi.deleteGoodsFeedbackComment(businessIddeleteGoodsFeedbackCommentRequest)
```

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteHiddenOffers"></a>
# **deleteHiddenOffers**
```java
Mono<EmptyApiResponse> ExpressApi.deleteHiddenOffers(campaignIddeleteHiddenOffersRequest)
```

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md)| Запрос на возобновление показа оферов. | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteOffers"></a>
# **deleteOffers**
```java
Mono<DeleteOffersResponse> ExpressApi.deleteOffers(businessIddeleteOffersRequest)
```

Удаление товаров из каталога

Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteOffersRequest** | [**DeleteOffersRequest**](DeleteOffersRequest.md)|  | |


### Return type
[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deleteOffersFromArchive"></a>
# **deleteOffersFromArchive**
```java
Mono<DeleteOffersFromArchiveResponse> ExpressApi.deleteOffersFromArchive(businessIddeleteOffersFromArchiveRequest)
```

Удаление товаров из архива

Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deleteOffersFromArchiveRequest** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md)|  | |


### Return type
[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="deletePromoOffers"></a>
# **deletePromoOffers**
```java
Mono<DeletePromoOffersResponse> ExpressApi.deletePromoOffers(businessIddeletePromoOffersRequest)
```

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **deletePromoOffersRequest** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md)|  | |


### Return type
[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateBoostConsolidatedReport"></a>
# **generateBoostConsolidatedReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateBoostConsolidatedReport(generateBoostConsolidatedRequest_format)
```

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateCompetitorsPositionReport"></a>
# **generateCompetitorsPositionReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest_format)
```

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateGoodsFeedbackReport"></a>
# **generateGoodsFeedbackReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateGoodsFeedbackReport(generateGoodsFeedbackRequest_format)
```

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateGoodsRealizationReport"></a>
# **generateGoodsRealizationReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateGoodsRealizationReport(generateGoodsRealizationReportRequest_format)
```

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateMassOrderLabelsReport"></a>
# **generateMassOrderLabelsReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateMassOrderLabelsReport(generateMassOrderLabelsRequest_format)
```

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  | |
| **_format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional parameter] [enum: `A7`, `A4`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateOrderLabel"></a>
# **generateOrderLabel**
```java
Mono<File> ExpressApi.generateOrderLabel(campaignIdorderIdshipmentIdboxId_format)
```

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **shipmentId** | `Long`| Идентификатор грузоместа. | |
| **boxId** | `Long`| Идентификатор коробки. | |
| **_format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional parameter] [enum: `A7`, `A4`] |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/pdf`, `application/json`

<a id="generateOrderLabels"></a>
# **generateOrderLabels**
```java
Mono<File> ExpressApi.generateOrderLabels(campaignIdorderId_format)
```

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **_format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional parameter] [enum: `A7`, `A4`] |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/pdf`, `application/json`

<a id="generatePricesReport"></a>
# **generatePricesReport**
```java
Mono<GenerateReportResponse> ExpressApi.generatePricesReport(generatePricesReportRequest_format)
```

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateShelfsStatisticsReport"></a>
# **generateShelfsStatisticsReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateShelfsStatisticsReport(generateShelfsStatisticsRequest_format)
```

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateShowsSalesReport"></a>
# **generateShowsSalesReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateShowsSalesReport(generateShowsSalesReportRequest_format)
```

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateStocksOnWarehousesReport"></a>
# **generateStocksOnWarehousesReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest_format)
```

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateUnitedMarketplaceServicesReport"></a>
# **generateUnitedMarketplaceServicesReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest_format)
```

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateUnitedNettingReport"></a>
# **generateUnitedNettingReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateUnitedNettingReport(generateUnitedNettingReportRequest_format)
```

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="generateUnitedOrdersReport"></a>
# **generateUnitedOrdersReport**
```java
Mono<GenerateReportResponse> ExpressApi.generateUnitedOrdersReport(generateUnitedOrdersRequest_format)
```

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | |
| **_format** | [**ReportFormatType**](.md)| Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`] |


### Return type
[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getAllOffers"></a>
# **getAllOffers**
```java
Mono<GetAllOffersResponse> ExpressApi.getAllOffers(campaignIdfeedIdchunk)
```

Все предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | `Long`| Идентификатор прайс-листа. | [optional parameter] |
| **chunk** | `Integer`| Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | [optional parameter] |


### Return type
[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getBidsInfoForBusiness"></a>
# **getBidsInfoForBusiness**
```java
Mono<GetBidsInfoResponse> ExpressApi.getBidsInfoForBusiness(businessIdpageTokenlimitgetBidsInfoRequest)
```

Информация об установленных ставках

Возвращает значения ставок для заданных товаров.  {% note warning \&quot;\&quot; %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getBidsInfoRequest** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md)| description | [optional parameter] |


### Return type
[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getBidsRecommendations"></a>
# **getBidsRecommendations**
```java
Mono<GetBidsRecommendationsResponse> ExpressApi.getBidsRecommendations(businessIdgetBidsRecommendationsRequest)
```

Рекомендованные ставки для заданных товаров

Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getBidsRecommendationsRequest** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md)| description. | |


### Return type
[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getBusinessQuarantineOffers"></a>
# **getBusinessQuarantineOffers**
```java
Mono<GetQuarantineOffersResponse> ExpressApi.getBusinessQuarantineOffers(businessIdgetQuarantineOffersRequestpageTokenlimit)
```

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getBusinessSettings"></a>
# **getBusinessSettings**
```java
Mono<GetBusinessSettingsResponse> ExpressApi.getBusinessSettings(businessId)
```

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaign"></a>
# **getCampaign**
```java
Mono<GetCampaignResponse> ExpressApi.getCampaign(campaignId)
```

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaignLogins"></a>
# **getCampaignLogins**
```java
Mono<GetCampaignLoginsResponse> ExpressApi.getCampaignLogins(campaignId)
```

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaignOffers"></a>
# **getCampaignOffers**
```java
Mono<GetCampaignOffersResponse> ExpressApi.getCampaignOffers(campaignIdgetCampaignOffersRequestpageTokenlimit)
```

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getCampaignQuarantineOffers"></a>
# **getCampaignQuarantineOffers**
```java
Mono<GetQuarantineOffersResponse> ExpressApi.getCampaignQuarantineOffers(campaignIdgetQuarantineOffersRequestpageTokenlimit)
```

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getCampaignRegion"></a>
# **getCampaignRegion**
```java
Mono<GetCampaignRegionResponse> ExpressApi.getCampaignRegion(campaignId)
```

Регион магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaignSettings"></a>
# **getCampaignSettings**
```java
Mono<GetCampaignSettingsResponse> ExpressApi.getCampaignSettings(campaignId)
```

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaigns"></a>
# **getCampaigns**
```java
Mono<GetCampaignsResponse> ExpressApi.getCampaigns(pagepageSize)
```

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |


### Return type
[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCampaignsByLogin"></a>
# **getCampaignsByLogin**
```java
Mono<GetCampaignsResponse> ExpressApi.getCampaignsByLogin(loginpagepageSize)
```

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **login** | `String`| Логин пользователя. | |
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |


### Return type
[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getCategoriesMaxSaleQuantum"></a>
# **getCategoriesMaxSaleQuantum**
```java
Mono<GetCategoriesMaxSaleQuantumResponse> ExpressApi.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
```

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | |


### Return type
[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getCategoriesTree"></a>
# **getCategoriesTree**
```java
Mono<GetCategoriesResponse> ExpressApi.getCategoriesTree(getCategoriesRequest)
```

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional parameter] |


### Return type
[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getCategoryContentParameters"></a>
# **getCategoryContentParameters**
```java
Mono<GetCategoryContentParametersResponse> ExpressApi.getCategoryContentParameters(categoryId)
```

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **categoryId** | `Long`| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | |


### Return type
[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getChatHistory"></a>
# **getChatHistory**
```java
Mono<GetChatHistoryResponse> ExpressApi.getChatHistory(businessIdchatIdgetChatHistoryRequestpageTokenlimit)
```

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | `Long`| Идентификатор чата. | |
| **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getChats"></a>
# **getChats**
```java
Mono<GetChatsResponse> ExpressApi.getChats(businessIdgetChatsRequestpageTokenlimit)
```

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md)| description | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetChatsResponse**](GetChatsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getDeliveryServices"></a>
# **getDeliveryServices**
```java
Mono<GetDeliveryServicesResponse> ExpressApi.getDeliveryServices()
```

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 



### Return type
[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getFeed"></a>
# **getFeed**
```java
Mono<GetFeedResponse> ExpressApi.getFeed(campaignIdfeedId)
```

Информация о прайс-листе

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | `Long`| Идентификатор прайс-листа. | |


### Return type
[**GetFeedResponse**](GetFeedResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getFeedIndexLogs"></a>
# **getFeedIndexLogs**
```java
Mono<GetFeedIndexLogsResponse> ExpressApi.getFeedIndexLogs(campaignIdfeedIdlimitpublishedTimeFrompublishedTimeTostatus)
```

Отчет по индексации прайс-листа

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | `Long`| Идентификатор прайс-листа. | |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **publishedTimeFrom** | `OffsetDateTime`| Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | [optional parameter] |
| **publishedTimeTo** | `OffsetDateTime`| Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | [optional parameter] |
| **status** | [**FeedIndexLogsStatusType**](.md)| Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | [optional parameter] [enum: `ERROR`, `OK`, `WARNING`] |


### Return type
[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getFeedbackAndCommentUpdates"></a>
# **getFeedbackAndCommentUpdates**
```java
Mono<GetFeedbackListResponse> ExpressApi.getFeedbackAndCommentUpdates(campaignIdpageTokenlimitfromDate)
```

Новые и обновленные отзывы о магазине

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **fromDate** | `LocalDate`| Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter] |


### Return type
[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getFeeds"></a>
# **getFeeds**
```java
Mono<GetFeedsResponse> ExpressApi.getFeeds(campaignId)
```

Список прайс-листов магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getGoodsFeedbackComments"></a>
# **getGoodsFeedbackComments**
```java
Mono<GetGoodsFeedbackCommentsResponse> ExpressApi.getGoodsFeedbackComments(businessIdgetGoodsFeedbackCommentsRequestpageTokenlimit)
```

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getGoodsFeedbacks"></a>
# **getGoodsFeedbacks**
```java
Mono<GetGoodsFeedbackResponse> ExpressApi.getGoodsFeedbacks(businessIdpageTokenlimitgetGoodsFeedbackRequest)
```

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md)|  | [optional parameter] |


### Return type
[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getGoodsStats"></a>
# **getGoodsStats**
```java
Mono<GetGoodsStatsResponse> ExpressApi.getGoodsStats(campaignIdgetGoodsStatsRequest)
```

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  | |


### Return type
[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getHiddenOffers"></a>
# **getHiddenOffers**
```java
Mono<GetHiddenOffersResponse> ExpressApi.getHiddenOffers(campaignIdofferIdpageTokenlimitoffsetpagepageSize)
```

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **offerId** | [**List&lt;@Pattern(regexp &#x3D; &quot;^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$&quot;)@Size(min &#x3D; 1, max &#x3D; 255)String&gt;**](String.md)| Идентификатор скрытого предложения.  | [optional parameter] |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **offset** | `Integer`| Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional parameter] |
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |


### Return type
[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOfferCardsContentStatus"></a>
# **getOfferCardsContentStatus**
```java
Mono<GetOfferCardsContentStatusResponse> ExpressApi.getOfferCardsContentStatus(businessIdpageTokenlimitgetOfferCardsContentStatusRequest)
```

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md)|  | [optional parameter] |


### Return type
[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getOfferMappingEntries"></a>
# **getOfferMappingEntries**
```java
Mono<GetOfferMappingEntriesResponse> ExpressApi.getOfferMappingEntries(campaignIdofferIdshopSkumappingKindstatusavailabilitycategoryIdvendorpageTokenlimit)
```

Список товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **offerId** | [**List&lt;String&gt;**](String.md)| Идентификатор товара в каталоге. | [optional parameter] |
| **shopSku** | [**List&lt;@Pattern(regexp &#x3D; &quot;^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$&quot;)@Size(min &#x3D; 1, max &#x3D; 255)String&gt;**](String.md)| Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional parameter] |
| **mappingKind** | [**OfferMappingKindType**](.md)| Тип маппинга. | [optional parameter] [enum: `ACTIVE`, `ALL`] |
| **status** | [**List&lt;OfferProcessingStatusType&gt;**](OfferProcessingStatusType.md)| Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional parameter] |
| **availability** | [**List&lt;OfferAvailabilityStatusType&gt;**](OfferAvailabilityStatusType.md)| Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional parameter] |
| **categoryId** | [**List&lt;Integer&gt;**](Integer.md)| Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional parameter] |
| **vendor** | [**List&lt;String&gt;**](String.md)| Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional parameter] |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOfferMappings"></a>
# **getOfferMappings**
```java
Mono<GetOfferMappingsResponse> ExpressApi.getOfferMappings(businessIdpageTokenlimitgetOfferMappingsRequest)
```

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getOfferMappingsRequest** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md)|  | [optional parameter] |


### Return type
[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getOfferRecommendations"></a>
# **getOfferRecommendations**
```java
Mono<GetOfferRecommendationsResponse> ExpressApi.getOfferRecommendations(businessIdgetOfferRecommendationsRequestpageTokenlimit)
```

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getOffers"></a>
# **getOffers**
```java
Mono<GetOffersResponse> ExpressApi.getOffers(campaignIdqueryfeedIdshopCategoryIdcurrencymatchedpagepageSize)
```

Предложения магазина

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **query** | `String`| Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | [optional parameter] |
| **feedId** | `Long`| Идентификатор прайс-листа. | [optional parameter] |
| **shopCategoryId** | `String`| Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional parameter] |
| **currency** | [**CurrencyType**](.md)| Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | [optional parameter] [enum: `RUR`, `USD`, `EUR`, `UAH`, `AUD`, `GBP`, `BYR`, `BYN`, `DKK`, `ISK`, `KZT`, `CAD`, `CNY`, `NOK`, `XDR`, `SGD`, `TRY`, `SEK`, `CHF`, `JPY`, `AZN`, `ALL`, `DZD`, `AOA`, `ARS`, `AMD`, `AFN`, `BHD`, `BGN`, `BOB`, `BWP`, `BND`, `BRL`, `BIF`, `HUF`, `VEF`, `KPW`, `VND`, `GMD`, `GHS`, `GNF`, `HKD`, `GEL`, `AED`, `EGP`, `ZMK`, `ILS`, `INR`, `IDR`, `JOD`, `IQD`, `IRR`, `YER`, `QAR`, `KES`, `KGS`, `COP`, `CDF`, `CRC`, `KWD`, `CUP`, `LAK`, `LVL`, `SLL`, `LBP`, `LYD`, `SZL`, `LTL`, `MUR`, `MRO`, `MKD`, `MWK`, `MGA`, `MYR`, `MAD`, `MXN`, `MZN`, `MDL`, `MNT`, `NPR`, `NGN`, `NIO`, `NZD`, `OMR`, `PKR`, `PYG`, `PEN`, `PLN`, `KHR`, `SAR`, `RON`, `SCR`, `SYP`, `SKK`, `SOS`, `SDG`, `SRD`, `TJS`, `THB`, `TWD`, `BDT`, `TZS`, `TND`, `TMM`, `UGX`, `UZS`, `UYU`, `PHP`, `DJF`, `XAF`, `XOF`, `HRK`, `CZK`, `CLP`, `LKR`, `EEK`, `ETB`, `RSD`, `ZAR`, `KRW`, `NAD`, `TL`, `UE`] |
| **matched** | `Boolean`| Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | [optional parameter] |
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |


### Return type
[**GetOffersResponse**](GetOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrder"></a>
# **getOrder**
```java
Mono<GetOrderResponse> ExpressApi.getOrder(campaignIdorderId)
```

Информация об одном заказе

Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |


### Return type
[**GetOrderResponse**](GetOrderResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrderBusinessBuyerInfo"></a>
# **getOrderBusinessBuyerInfo**
```java
Mono<GetBusinessBuyerInfoResponse> ExpressApi.getOrderBusinessBuyerInfo(campaignIdorderId)
```

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |


### Return type
[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrderBusinessDocumentsInfo"></a>
# **getOrderBusinessDocumentsInfo**
```java
Mono<GetBusinessDocumentsInfoResponse> ExpressApi.getOrderBusinessDocumentsInfo(campaignIdorderId)
```

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |


### Return type
[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrderLabelsData"></a>
# **getOrderLabelsData**
```java
Mono<GetOrderLabelsDataResponse> ExpressApi.getOrderLabelsData(campaignIdorderId)
```

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |


### Return type
[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrders"></a>
# **getOrders**
```java
Mono<GetOrdersResponse> ExpressApi.getOrders(campaignIdorderIdsstatussubstatusfromDatetoDatesupplierShipmentDateFromsupplierShipmentDateToupdatedAtFromupdatedAtTodispatchTypefakehasCisonlyWaitingForCancellationApproveonlyEstimatedDeliverybuyerTypepagepageSizepageTokenlimit)
```

Информация о нескольких заказах

Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderIds** | [**List&lt;Long&gt;**](Long.md)| Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  | [optional parameter] |
| **status** | [**Set&lt;OrderStatusType&gt;**](OrderStatusType.md)| Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional parameter] |
| **substatus** | [**Set&lt;OrderSubstatusType&gt;**](OrderSubstatusType.md)| Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional parameter] |
| **fromDate** | `LocalDate`| Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  | [optional parameter] |
| **toDate** | `LocalDate`| Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  | [optional parameter] |
| **supplierShipmentDateFrom** | `LocalDate`| Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional parameter] |
| **supplierShipmentDateTo** | `LocalDate`| Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional parameter] |
| **updatedAtFrom** | `OffsetDateTime`| Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional parameter] |
| **updatedAtTo** | `OffsetDateTime`| Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional parameter] |
| **dispatchType** | [**OrderDeliveryDispatchType**](.md)| Способ отгрузки | [optional parameter] [enum: `UNKNOWN`, `BUYER`, `MARKET_PARTNER_OUTLET`, `MARKET_BRANDED_OUTLET`, `SHOP_OUTLET`, `DROPOFF`] |
| **fake** | `Boolean`| Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional parameter] [default to `false`] |
| **hasCis** | `Boolean`| Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional parameter] [default to `false`] |
| **onlyWaitingForCancellationApprove** | `Boolean`| **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  | [optional parameter] [default to `false`] |
| **onlyEstimatedDelivery** | `Boolean`| Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется.  | [optional parameter] [default to `false`] |
| **buyerType** | [**OrderBuyerType**](.md)| Фильтрация заказов по типу покупателя.  | [optional parameter] [enum: `PERSON`, `BUSINESS`] |
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getOrdersStats"></a>
# **getOrdersStats**
```java
Mono<GetOrdersStatsResponse> ExpressApi.getOrdersStats(campaignIdpageTokenlimitgetOrdersStatsRequest)
```

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md)|  | [optional parameter] |


### Return type
[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getPrices"></a>
# **getPrices**
```java
Mono<GetPricesResponse> ExpressApi.getPrices(campaignIdpageTokenlimitarchived)
```

Список цен

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **archived** | `Boolean`| Фильтр по нахождению в архиве. | [optional parameter] [default to `false`] |


### Return type
[**GetPricesResponse**](GetPricesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getPricesByOfferIds"></a>
# **getPricesByOfferIds**
```java
Mono<GetPricesByOfferIdsResponse> ExpressApi.getPricesByOfferIds(campaignIdpageTokenlimitgetPricesByOfferIdsRequest)
```

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getPricesByOfferIdsRequest** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md)|  | [optional parameter] |


### Return type
[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getPromoOffers"></a>
# **getPromoOffers**
```java
Mono<GetPromoOffersResponse> ExpressApi.getPromoOffers(businessIdgetPromoOffersRequestpageTokenlimit)
```

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре &#x60;limit&#x60; не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getPromoOffersRequest** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md)|  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getPromos"></a>
# **getPromos**
```java
Mono<GetPromosResponse> ExpressApi.getPromos(businessIdgetPromosRequest)
```

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getPromosRequest** | [**GetPromosRequest**](GetPromosRequest.md)|  | [optional parameter] |


### Return type
[**GetPromosResponse**](GetPromosResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getQualityRatingDetails"></a>
# **getQualityRatingDetails**
```java
Mono<GetQualityRatingDetailsResponse> ExpressApi.getQualityRatingDetails(campaignId)
```

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getQualityRatings"></a>
# **getQualityRatings**
```java
Mono<GetQualityRatingResponse> ExpressApi.getQualityRatings(businessIdgetQualityRatingRequest)
```

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getQualityRatingRequest** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md)|  | |


### Return type
[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getReportInfo"></a>
# **getReportInfo**
```java
Mono<GetReportInfoResponse> ExpressApi.getReportInfo(reportId)
```

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | `String`| Идентификатор отчета, который вы получили после запуска генерации.  | |


### Return type
[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getReturn"></a>
# **getReturn**
```java
Mono<GetReturnResponse> ExpressApi.getReturn(campaignIdorderIdreturnId)
```

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |


### Return type
[**GetReturnResponse**](GetReturnResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getReturnApplication"></a>
# **getReturnApplication**
```java
Mono<File> ExpressApi.getReturnApplication(campaignIdorderIdreturnId)
```

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`, `application/json`

<a id="getReturnPhoto"></a>
# **getReturnPhoto**
```java
Mono<File> ExpressApi.getReturnPhoto(campaignIdorderIdreturnIditemIdimageHash)
```

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **returnId** | `Long`| Идентификатор возврата. | |
| **itemId** | `Long`| Идентификатор товара в возврате. | |
| **imageHash** | `String`| Хеш ссылки изображения для загрузки. | |


### Return type
[**File**](File.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/octet-stream`, `application/json`

<a id="getReturns"></a>
# **getReturns**
```java
Mono<GetReturnsResponse> ExpressApi.getReturns(campaignIdpageTokenlimitorderIdsstatusestypefromDatetoDatefromDate2toDate2)
```

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **orderIds** | [**List&lt;Long&gt;**](Long.md)| Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional parameter] |
| **statuses** | [**List&lt;RefundStatusType&gt;**](RefundStatusType.md)| Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional parameter] |
| **type** | [**ReturnType**](.md)| Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional parameter] [enum: `UNREDEEMED`, `RETURN`] |
| **fromDate** | `LocalDate`| Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter] |
| **toDate** | `LocalDate`| Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional parameter] |
| **fromDate2** | `LocalDate`| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter] |
| **toDate2** | `LocalDate`| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional parameter] |


### Return type
[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getStocks"></a>
# **getStocks**
```java
Mono<GetWarehouseStocksResponse> ExpressApi.getStocks(campaignIdpageTokenlimitgetWarehouseStocksRequest)
```

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |
| **getWarehouseStocksRequest** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md)|  | [optional parameter] |


### Return type
[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getSuggestedOfferMappingEntries"></a>
# **getSuggestedOfferMappingEntries**
```java
Mono<GetSuggestedOfferMappingEntriesResponse> ExpressApi.getSuggestedOfferMappingEntries(campaignIdgetSuggestedOfferMappingEntriesRequest)
```

Рекомендованные карточки для товаров

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getSuggestedOfferMappingEntriesRequest** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md)|  | |


### Return type
[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getSuggestedOfferMappings"></a>
# **getSuggestedOfferMappings**
```java
Mono<GetSuggestedOfferMappingsResponse> ExpressApi.getSuggestedOfferMappings(businessIdgetSuggestedOfferMappingsRequest)
```

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getSuggestedOfferMappingsRequest** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md)|  | [optional parameter] |


### Return type
[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getSuggestedPrices"></a>
# **getSuggestedPrices**
```java
Mono<SuggestPricesResponse> ExpressApi.getSuggestedPrices(campaignIdsuggestPricesRequest)
```

Цены для продвижения товаров

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \&quot;\&quot; %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **suggestPricesRequest** | [**SuggestPricesRequest**](SuggestPricesRequest.md)|  | |


### Return type
[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="getWarehouses"></a>
# **getWarehouses**
```java
Mono<GetWarehousesResponse> ExpressApi.getWarehouses(businessId)
```

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |


### Return type
[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="provideOrderItemIdentifiers"></a>
# **provideOrderItemIdentifiers**
```java
Mono<ProvideOrderItemIdentifiersResponse> ExpressApi.provideOrderItemIdentifiers(campaignIdorderIdprovideOrderItemIdentifiersRequest)
```

Передача кодов маркировки единиц товара

{% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **provideOrderItemIdentifiersRequest** | [**ProvideOrderItemIdentifiersRequest**](ProvideOrderItemIdentifiersRequest.md)|  | |


### Return type
[**ProvideOrderItemIdentifiersResponse**](ProvideOrderItemIdentifiersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="putBidsForBusiness"></a>
# **putBidsForBusiness**
```java
Mono<EmptyApiResponse> ExpressApi.putBidsForBusiness(businessIdputSkuBidsRequest)
```

Включение буста продаж и установка ставок

Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \&quot;Как в кабинете выглядит кампания, созданная через API\&quot; %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md)| description | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="putBidsForCampaign"></a>
# **putBidsForCampaign**
```java
Mono<EmptyApiResponse> ExpressApi.putBidsForCampaign(campaignIdputSkuBidsRequest)
```

Включение буста продаж и установка ставок для магазина

Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \&quot;𝓠 Как посмотреть расходы на буст продаж?\&quot; %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md)| description | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="refreshFeed"></a>
# **refreshFeed**
```java
Mono<EmptyApiResponse> ExpressApi.refreshFeed(campaignIdfeedId)
```

Сообщить, что прайс-лист обновился

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | `Long`| Идентификатор прайс-листа. | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="searchRegionChildren"></a>
# **searchRegionChildren**
```java
Mono<GetRegionWithChildrenResponse> ExpressApi.searchRegionChildren(regionIdpagepageSize)
```

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **regionId** | `Long`| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |
| **page** | `Integer`| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] [default to `1`] |
| **pageSize** | `Integer`| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional parameter] |


### Return type
[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="searchRegionsById"></a>
# **searchRegionsById**
```java
Mono<GetRegionsResponse> ExpressApi.searchRegionsById(regionId)
```

Информация о регионе

Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **regionId** | `Long`| Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | |


### Return type
[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="searchRegionsByName"></a>
# **searchRegionsByName**
```java
Mono<GetRegionsResponse> ExpressApi.searchRegionsByName(namepageTokenlimit)
```

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | `String`| Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  | |
| **pageToken** | `String`| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter] |
| **limit** | `Integer`| Количество значений на одной странице.  | [optional parameter] |


### Return type
[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="sendFileToChat"></a>
# **sendFileToChat**
```java
Mono<EmptyApiResponse> ExpressApi.sendFileToChat(businessIdchatId_file)
```

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | `Long`| Идентификатор чата. | |
| **_file** | `File`| Содержимое файла. Максимальный размер файла — 5 Мбайт. | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/json`

<a id="sendMessageToChat"></a>
# **sendMessageToChat**
```java
Mono<EmptyApiResponse> ExpressApi.sendMessageToChat(businessIdchatIdsendMessageToChatRequest)
```

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | `Long`| Идентификатор чата. | |
| **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="setFeedParams"></a>
# **setFeedParams**
```java
Mono<EmptyApiResponse> ExpressApi.setFeedParams(campaignIdfeedIdsetFeedParamsRequest)
```

Изменение параметров прайс-листа

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **feedId** | `Long`| Идентификатор прайс-листа. | |
| **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="setOrderBoxLayout"></a>
# **setOrderBoxLayout**
```java
Mono<SetOrderBoxLayoutResponse> ExpressApi.setOrderBoxLayout(campaignIdorderIdsetOrderBoxLayoutRequest)
```

Подготовка заказа

{% note tip \&quot;Подходит и для DBS\&quot; %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос &#x60;allowRemove: true&#x60;. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \&quot;Удаление нельзя отменить\&quot; %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий &#x60;OrderBoxLayoutItemDTO&#x60;. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле &#x60;fullCount&#x60;.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.  {% note info \&quot;Увеличить заказ нельзя\&quot; %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \&quot;Товар умещается в коробку\&quot; %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;fullCount\&quot;: 3,                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           },                           {                               \&quot;cis\&quot;: \&quot;010304109478gftJ14545762!\\u001dhGt264\&quot;                           },                           {                               \&quot;cis\&quot;: \&quot;010304109478fRs28323ks23!\\u001dhet201\&quot;                           }                       ]                   },                   {                       \&quot;id\&quot;: 654321,                       \&quot;fullCount\&quot;: 1                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  {% cut \&quot;Товар едет в разных коробках\&quot; %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  {% cut \&quot;Одинаковые товары, где каждый едет в нескольких коробках\&quot; %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    &#x60;&#x60;&#x60;json   {       \&quot;boxes\&quot;: [           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 1,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           },           {               \&quot;items\&quot;: [                   {                       \&quot;id\&quot;: 123456,                       \&quot;partialCount\&quot;: {                           \&quot;current\&quot;: 2,                           \&quot;total\&quot;: 2                       },                       \&quot;instances\&quot;: [                           {                               \&quot;cis\&quot;: \&quot;01030410947874432155Qbag!\\u001d93Zjqw\&quot;                           }                       ]                   }               ]           }       ]   }   &#x60;&#x60;&#x60;  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **setOrderBoxLayoutRequest** | [**SetOrderBoxLayoutRequest**](SetOrderBoxLayoutRequest.md)|  | |


### Return type
[**SetOrderBoxLayoutResponse**](SetOrderBoxLayoutResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="setOrderShipmentBoxes"></a>
# **setOrderShipmentBoxes**
```java
Mono<SetOrderShipmentBoxesResponse> ExpressApi.setOrderShipmentBoxes(campaignIdorderIdshipmentIdsetOrderShipmentBoxesRequest)
```

Передача количества грузовых мест в заказе

{% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \&quot;Как было раньше\&quot; %}  Структура тела PUT-запроса:  &#x60;&#x60;&#x60; {   \&quot;boxes\&quot;:   [     {       \&quot;fulfilmentId\&quot;: \&quot;{string}\&quot;,       \&quot;weight\&quot;: {int64},       \&quot;width\&quot;: {int64},       \&quot;height\&quot;: {int64},       \&quot;depth\&quot;: {int64},       \&quot;items\&quot;:       [         {           \&quot;id\&quot;: {int64},           \&quot;count\&quot;: {int32}         },         ...       ]     },     ...   ] } &#x60;&#x60;&#x60; | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;boxes&#x60;       |           | Список грузовых мест.       |  **Параметры, вложенные в &#x60;boxes&#x60;** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;fulfilmentId&#x60;       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: &#x60;номер заказа на Маркете-номер грузового места&#x60;. Например, &#x60;7206821‑1, 7206821‑2&#x60; и т. д. | | &#x60;weight&#x60;       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | &#x60;width&#x60;       | Int64   | Ширина грузового места в сантиметрах.       | | &#x60;height&#x60;       | Int64   | Высота грузового места в сантиметрах.       | | &#x60;depth&#x60;       | Int64   | Глубина грузового места в сантиметрах.        | | &#x60;items&#x60;       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в &#x60;items&#x60;** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | &#x60;id&#x60;       | Int64     | Идентификатор товара в рамках заказа.   | | &#x60;count&#x60;    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **shipmentId** | `Long`| Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL.  | |
| **setOrderShipmentBoxesRequest** | [**SetOrderShipmentBoxesRequest**](SetOrderShipmentBoxesRequest.md)|  | |


### Return type
[**SetOrderShipmentBoxesResponse**](SetOrderShipmentBoxesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="skipGoodsFeedbacksReaction"></a>
# **skipGoodsFeedbacksReaction**
```java
Mono<EmptyApiResponse> ExpressApi.skipGoodsFeedbacksReaction(businessIdskipGoodsFeedbackReactionRequest)
```

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **skipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateBusinessPrices"></a>
# **updateBusinessPrices**
```java
Mono<EmptyApiResponse> ExpressApi.updateBusinessPrices(businessIdupdateBusinessPricesRequest)
```

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateBusinessPricesRequest** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateCampaignOffers"></a>
# **updateCampaignOffers**
```java
Mono<EmptyApiResponse> ExpressApi.updateCampaignOffers(campaignIdupdateCampaignOffersRequest)
```

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateGoodsFeedbackComment"></a>
# **updateGoodsFeedbackComment**
```java
Mono<UpdateGoodsFeedbackCommentResponse> ExpressApi.updateGoodsFeedbackComment(businessIdupdateGoodsFeedbackCommentRequest)
```

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md)|  | |


### Return type
[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOfferContent"></a>
# **updateOfferContent**
```java
Mono<UpdateOfferContentResponse> ExpressApi.updateOfferContent(businessIdupdateOfferContentRequest)
```

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md)|  | |


### Return type
[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOfferMappingEntries"></a>
# **updateOfferMappingEntries**
```java
Mono<EmptyApiResponse> ExpressApi.updateOfferMappingEntries(campaignIdupdateOfferMappingEntryRequest)
```

Добавление и редактирование товаров в каталоге

{% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateOfferMappingEntryRequest** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOfferMappings"></a>
# **updateOfferMappings**
```java
Mono<UpdateOfferMappingsResponse> ExpressApi.updateOfferMappings(businessIdupdateOfferMappingsRequest)
```

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateOfferMappingsRequest** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md)|  | |


### Return type
[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOrderItems"></a>
# **updateOrderItems**
```java
Mono<Void> ExpressApi.updateOrderItems(campaignIdorderIdupdateOrderItemRequest)
```

Удаление товара из заказа или уменьшение числа единиц

{% note warning \&quot;Этот запрос только для DBS\&quot; %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60;. После передачи статуса &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте &#x60;count&#x60; параметра &#x60;item&#x60;.  Чтобы полностью удалить товар из заказа:  * передайте значение &#x60;0&#x60;; или * не передавайте параметр &#x60;item&#x60;.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.  {% note info \&quot;Увеличить заказ нельзя\&quot; %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус &#x60;SHIPPED&#x60;;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **updateOrderItemRequest** | [**UpdateOrderItemRequest**](UpdateOrderItemRequest.md)|  | |




### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOrderStatus"></a>
# **updateOrderStatus**
```java
Mono<UpdateOrderStatusResponse> ExpressApi.updateOrderStatus(campaignIdorderIdupdateOrderStatusRequest)
```

Изменение статуса одного заказа

Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этап обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60;. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **updateOrderStatusRequest** | [**UpdateOrderStatusRequest**](UpdateOrderStatusRequest.md)|  | |


### Return type
[**UpdateOrderStatusResponse**](UpdateOrderStatusResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateOrderStatuses"></a>
# **updateOrderStatuses**
```java
Mono<UpdateOrderStatusesResponse> ExpressApi.updateOrderStatuses(campaignIdupdateOrderStatusesRequest)
```

Изменение статусов нескольких заказов

Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60;и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этап обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60;. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;STARTED\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;\&quot;status\&quot;: \&quot;PROCESSING\&quot;&#x60; и этапа обработки &#x60;\&quot;substatus\&quot;: \&quot;READY_TO_SHIP\&quot;&#x60; нужно перевести в статус &#x60;\&quot;status\&quot;: \&quot;CANCELLED\&quot;&#x60; с причиной отмены заказа &#x60;\&quot;substatus\&quot;: \&quot;SHOP_FAILED\&quot;&#x60;.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateOrderStatusesRequest** | [**UpdateOrderStatusesRequest**](UpdateOrderStatusesRequest.md)|  | |


### Return type
[**UpdateOrderStatusesResponse**](UpdateOrderStatusesResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updatePrices"></a>
# **updatePrices**
```java
Mono<EmptyApiResponse> ExpressApi.updatePrices(campaignIdupdatePricesRequest)
```

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \&quot;Метод только для отдельных магазинов\&quot; %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updatePricesRequest** | [**UpdatePricesRequest**](UpdatePricesRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updatePromoOffers"></a>
# **updatePromoOffers**
```java
Mono<UpdatePromoOffersResponse> ExpressApi.updatePromoOffers(businessIdupdatePromoOffersRequest)
```

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `Long`| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md)|  | |


### Return type
[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="updateStocks"></a>
# **updateStocks**
```java
Mono<EmptyApiResponse> ExpressApi.updateStocks(campaignIdupdateStocksRequest)
```

Передача информации об остатках

Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **updateStocksRequest** | [**UpdateStocksRequest**](UpdateStocksRequest.md)|  | |


### Return type
[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="verifyOrderEac"></a>
# **verifyOrderEac**
```java
Mono<VerifyOrderEacResponse> ExpressApi.verifyOrderEac(campaignIdorderIdverifyOrderEacRequest)
```

Передача кода подтверждения

Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре &#x60;delivery&#x60;, вложенном в &#x60;order&#x60; будет возвращаться параметр &#x60;eacType&#x60; с типом &#x60;Enum&#x60; — тип кода подтверждения для передачи заказа.  Возможные значения: &#x60;MERCHANT_TO_COURIER&#x60; — магазин называет код курьеру, &#x60;COURIER_TO_MERCHANT&#x60; — курьер называет код магазину.  Параметр &#x60;eacType&#x60; возвращается при статусах заказа &#x60;COURIER_FOUND&#x60;, &#x60;COURIER_ARRIVED_TO_SENDER&#x60; и &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60;. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | `Long`| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **orderId** | `Long`| Идентификатор заказа. | |
| **verifyOrderEacRequest** | [**VerifyOrderEacRequest**](VerifyOrderEacRequest.md)|  | |


### Return type
[**VerifyOrderEacResponse**](VerifyOrderEacResponse.md)

### Authorization
* **[OAuth](auth.md#OAuth)**, scopes: `market:partner-api`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

