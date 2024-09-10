# ExpressApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHiddenOffers**](ExpressApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**addOffersToArchive**](ExpressApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**calculateTariffs**](ExpressApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
[**confirmBusinessPrices**](ExpressApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**confirmCampaignPrices**](ExpressApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**createChat**](ExpressApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**deleteCampaignOffers**](ExpressApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
[**deleteGoodsFeedbackComment**](ExpressApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**deleteHiddenOffers**](ExpressApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**deleteOffers**](ExpressApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**deleteOffersFromArchive**](ExpressApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**deletePromoOffers**](ExpressApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**generateBoostConsolidatedReport**](ExpressApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generateCompetitorsPositionReport**](ExpressApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generateGoodsFeedbackReport**](ExpressApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generateGoodsRealizationReport**](ExpressApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generateMassOrderLabelsReport**](ExpressApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generateOrderLabel**](ExpressApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**generateOrderLabels**](ExpressApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**generatePricesReport**](ExpressApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generateShelfsStatisticsReport**](ExpressApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generateShowsSalesReport**](ExpressApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generateStocksOnWarehousesReport**](ExpressApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generateUnitedMarketplaceServicesReport**](ExpressApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generateUnitedNettingReport**](ExpressApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generateUnitedOrdersReport**](ExpressApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**getAllOffers**](ExpressApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
[**getBidsInfoForBusiness**](ExpressApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
[**getBidsRecommendations**](ExpressApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
[**getBusinessQuarantineOffers**](ExpressApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**getBusinessSettings**](ExpressApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
[**getCampaign**](ExpressApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**getCampaignLogins**](ExpressApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**getCampaignOffers**](ExpressApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
[**getCampaignQuarantineOffers**](ExpressApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
[**getCampaignRegion**](ExpressApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**getCampaignSettings**](ExpressApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**getCampaigns**](ExpressApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**getCampaignsByLogin**](ExpressApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
[**getCategoriesMaxSaleQuantum**](ExpressApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**getCategoriesTree**](ExpressApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
[**getCategoryContentParameters**](ExpressApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**getChatHistory**](ExpressApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](ExpressApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**getDeliveryServices**](ExpressApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
[**getFeed**](ExpressApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**getFeedIndexLogs**](ExpressApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**getFeedbackAndCommentUpdates**](ExpressApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
[**getFeeds**](ExpressApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**getGoodsFeedbackComments**](ExpressApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**getGoodsFeedbacks**](ExpressApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**getGoodsStats**](ExpressApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
[**getHiddenOffers**](ExpressApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
[**getOfferCardsContentStatus**](ExpressApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**getOfferMappingEntries**](ExpressApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
[**getOfferMappings**](ExpressApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**getOfferRecommendations**](ExpressApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
[**getOffers**](ExpressApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
[**getOrder**](ExpressApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
[**getOrderBusinessBuyerInfo**](ExpressApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**getOrderBusinessDocumentsInfo**](ExpressApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
[**getOrderLabelsData**](ExpressApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
[**getOrders**](ExpressApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
[**getOrdersStats**](ExpressApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
[**getPrices**](ExpressApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
[**getPricesByOfferIds**](ExpressApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**getPromoOffers**](ExpressApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**getPromos**](ExpressApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**getQualityRatingDetails**](ExpressApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**getQualityRatings**](ExpressApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
[**getReportInfo**](ExpressApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
[**getReturn**](ExpressApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**getReturnApplication**](ExpressApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**getReturnPhoto**](ExpressApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**getReturns**](ExpressApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**getStocks**](ExpressApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
[**getSuggestedOfferMappingEntries**](ExpressApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
[**getSuggestedOfferMappings**](ExpressApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**getSuggestedPrices**](ExpressApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**getWarehouses**](ExpressApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
[**provideOrderItemIdentifiers**](ExpressApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
[**putBidsForBusiness**](ExpressApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
[**putBidsForCampaign**](ExpressApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
[**refreshFeed**](ExpressApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**searchRegionChildren**](ExpressApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
[**searchRegionsById**](ExpressApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
[**searchRegionsByName**](ExpressApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
[**sendFileToChat**](ExpressApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](ExpressApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
[**setFeedParams**](ExpressApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
[**setOrderBoxLayout**](ExpressApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
[**setOrderShipmentBoxes**](ExpressApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
[**skipGoodsFeedbacksReaction**](ExpressApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**updateBusinessPrices**](ExpressApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**updateCampaignOffers**](ExpressApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
[**updateGoodsFeedbackComment**](ExpressApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
[**updateOfferContent**](ExpressApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
[**updateOfferMappingEntries**](ExpressApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
[**updateOfferMappings**](ExpressApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
[**updateOrderItems**](ExpressApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
[**updateOrderStatus**](ExpressApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
[**updateOrderStatuses**](ExpressApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
[**updatePrices**](ExpressApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
[**updatePromoOffers**](ExpressApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
[**updateStocks**](ExpressApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
[**verifyOrderEac**](ExpressApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения



## addHiddenOffers

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 addHiddenOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **addHiddenOffersRequest** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md) | Запрос на скрытие оферов. |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## addOffersToArchive

Добавление товаров в архив

Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|

### Example

```bash
 addOffersToArchive businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **addOffersToArchiveRequest** | [**AddOffersToArchiveRequest**](AddOffersToArchiveRequest.md) |  |

### Return type

[**AddOffersToArchiveResponse**](AddOffersToArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## calculateTariffs

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр 'campaignId', либо 'sellingProgram'. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 calculateTariffs
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## confirmBusinessPrices

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|

### Example

```bash
 confirmBusinessPrices businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## confirmCampaignPrices

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 confirmCampaignPrices campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **confirmPricesRequest** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createChat

Создание нового чата с покупателем

Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 createChat businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md) | description |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteCampaignOffers

Удаление товаров из ассортимента магазина

Удаляет заданные товары из заданного магазина.

{% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}

На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.

{% endnote %}

Товар не получится удалить, если он хранится на складах Маркета.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 deleteCampaignOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteCampaignOffersRequest** | [**DeleteCampaignOffersRequest**](DeleteCampaignOffersRequest.md) |  |

### Return type

[**DeleteCampaignOffersResponse**](DeleteCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteGoodsFeedbackComment

Удаление комментария к отзыву

Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 deleteGoodsFeedbackComment businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteHiddenOffers

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 deleteHiddenOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteOffers

Удаление товаров из каталога

Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|

### Example

```bash
 deleteOffers businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteOffersRequest** | [**DeleteOffersRequest**](DeleteOffersRequest.md) |  |

### Return type

[**DeleteOffersResponse**](DeleteOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteOffersFromArchive

Удаление товаров из архива

Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|

### Example

```bash
 deleteOffersFromArchive businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteOffersFromArchiveRequest** | [**DeleteOffersFromArchiveRequest**](DeleteOffersFromArchiveRequest.md) |  |

### Return type

[**DeleteOffersFromArchiveResponse**](DeleteOffersFromArchiveResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deletePromoOffers

Удаление товаров из акции

Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 deletePromoOffers businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deletePromoOffersRequest** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md) |  |

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateBoostConsolidatedReport

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateBoostConsolidatedReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateCompetitorsPositionReport

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info \"Значение -1 в отчете\" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|

### Example

```bash
 generateCompetitorsPositionReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsFeedbackReport

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsFeedbackReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsRealizationReport

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsRealizationReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateMassOrderLabelsReport

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 generateMassOrderLabelsReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md) |  |
 **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateOrderLabel

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 generateOrderLabel campaignId=value orderId=value shipmentId=value boxId=value  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **shipmentId** | **integer** | Идентификатор грузоместа. | [default to null]
 **boxId** | **integer** | Идентификатор коробки. | [default to null]
 **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateOrderLabels

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 generateOrderLabels campaignId=value orderId=value  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generatePricesReport

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generatePricesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateShelfsStatisticsReport

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateShelfsStatisticsReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateShowsSalesReport

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|

### Example

```bash
 generateShowsSalesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateStocksOnWarehousesReport

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateStocksOnWarehousesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedMarketplaceServicesReport

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |'dateFrom' и 'dateTo'            |
|По дате формирования акта    |'year' и 'month'                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedMarketplaceServicesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedNettingReport

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |'dateFrom' и 'dateTo'                  |
|О платежном поручении    |'bankOrderId' и 'bankOrderDateTime'    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedNettingReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedOrdersReport

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info \"\" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedOrdersReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getAllOffers

Все предложения магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)

### Example

```bash
 getAllOffers campaignId=value  feedId=value  chunk=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [optional] [default to null]
 **chunk** | **integer** | Номер сегмента с результатами.

Значение по умолчанию: '0'.

{% note info %}

Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.

{% endnote %}

{% note alert %}

Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать 'chunk=0' и т. д.

{% endnote %} | [optional] [default to null]

### Return type

[**GetAllOffersResponse**](GetAllOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBidsInfoForBusiness

Информация об установленных ставках

Возвращает значения ставок для заданных товаров.

{% note warning \"\" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|

### Example

```bash
 getBidsInfoForBusiness businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getBidsInfoRequest** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md) | description | [optional]

### Return type

[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBidsRecommendations

Рекомендованные ставки для заданных товаров

Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|

### Example

```bash
 getBidsRecommendations businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getBidsRecommendationsRequest** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md) | description. |

### Return type

[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBusinessQuarantineOffers

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 getBusinessQuarantineOffers businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBusinessSettings

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getBusinessSettings businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaign

Информация о магазине

Возвращает информацию о магазине.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaign campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignLogins

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaignLogins campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignOffers

Информация о товарах, которые размещены в заданном магазине

Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 getCampaignOffers campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getCampaignOffersRequest** | [**GetCampaignOffersRequest**](GetCampaignOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetCampaignOffersResponse**](GetCampaignOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignQuarantineOffers

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).

{% note info \"𝓠 Что такое карантин?\" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 getCampaignQuarantineOffers campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getQuarantineOffersRequest** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignRegion

Регион магазина

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).

{% endnote %}

Возвращает регион, в котором находится магазин.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|

### Example

```bash
 getCampaignRegion campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignSettings

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaignSettings campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaigns

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaigns  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignsByLogin

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.
|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 getCampaignsByLogin login=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **string** | Логин пользователя. | [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCategoriesMaxSaleQuantum

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getCategoriesMaxSaleQuantum
```

### Parameters


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCategoriesTree

Дерево категорий

Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getCategoriesTree
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md) |  | [optional]

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCategoryContentParameters

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.

|**⚙️ Лимит:** 50 категорий в минуту |
|-|

### Example

```bash
 getCategoryContentParameters categoryId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **integer** | Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | [default to null]

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getChatHistory

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getChatHistory businessId=value  chatId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getChats

Получение доступных чатов

Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getChats businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md) | description |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getDeliveryServices

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|

### Example

```bash
 getDeliveryServices
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeed

Информация о прайс-листе

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getFeed campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]

### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeedIndexLogs

Отчет по индексации прайс-листа

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.

Данные в отчете возвращаются в порядке убывания значений параметра 'generationId'.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getFeedIndexLogs campaignId=value feedId=value  limit=value  published_time_from=value  published_time_to=value  status=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **publishedTimeFrom** | **string** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-21T00:42:42+03:00'.

Значение по умолчанию: последние восемь дней со времени отправки запроса. | [optional] [default to null]
 **publishedTimeTo** | **string** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-31T00:42:42+03:00'.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра 'published_time_to'. Значение параметра не должно быть датой из будущего.

{% endnote %} | [optional] [default to null]
 **status** | [**FeedIndexLogsStatusType**](.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* 'ERROR' — произошли ошибки.
* 'OK' — обработан без ошибок.
* 'WARNING' — наблюдались некритичные проблемы. | [optional] [default to null]

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeedbackAndCommentUpdates

Новые и обновленные отзывы о магазине

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает новые и обновленные отзывы о магазине на Маркете.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 getFeedbackAndCommentUpdates campaignId=value  page_token=value  limit=value  from_date=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **fromDate** | **string** | Начальная дата обновления отзывов.

Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.

Формат даты: 'ГГГГ-ММ-ДД'. | [optional] [default to null]

### Return type

[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeeds

Список прайс-листов магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getFeeds campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getGoodsFeedbackComments

Получение комментариев к отзыву

Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в 'page_token', если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getGoodsFeedbackComments businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getGoodsFeedbacks

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в 'page_token', если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getGoodsFeedbacks businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md) |  | [optional]

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getGoodsStats

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 getGoodsStats campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md) |  |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getHiddenOffers

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.

В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 getHiddenOffers campaignId=value  Specify as:  offer_id="value1,value2,..."  page_token=value  limit=value  offset=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **offerId** | [**array[string]**](string.md) | Идентификатор скрытого предложения. | [optional] [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **offset** | **integer** | Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром 'limit'.

Если задан 'offset', параметры 'page_number' и 'page_size' игнорируются.

'offset' игнорируется, если задан 'page_token'. | [optional] [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferCardsContentStatus

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|

### Example

```bash
 getOfferCardsContentStatus businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md) |  | [optional]

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferMappingEntries

Список товаров в каталоге

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:

* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.
* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.

Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.

{% note info %}

Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)

### Example

```bash
 getOfferMappingEntries campaignId=value  Specify as:  offer_id="value1,value2,..."  Specify as:  shop_sku="value1,value2,..."  mapping_kind=value  Specify as:  status="value1,value2,..."  Specify as:  availability="value1,value2,..."  Specify as:  category_id="value1,value2,..."  Specify as:  vendor="value1,value2,..."  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **offerId** | [**array[string]**](string.md) | Идентификатор товара в каталоге. | [optional] [default to null]
 **shopSku** | [**array[string]**](string.md) | Ваш SKU товара.

Параметр может быть указан несколько раз, например:

'''
...shop_sku=123&shop_sku=129&shop_sku=141...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **mappingKind** | [**OfferMappingKindType**](.md) | Тип маппинга. | [optional] [default to null]
 **status** | [**array[OfferProcessingStatusType]**](OfferProcessingStatusType.md) | Фильтрация по статусу публикации товара:

* 'READY' — товар прошел модерацию.
* 'IN_WORK' — товар проходит модерацию.
* 'NEED_CONTENT' — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее.
* 'NEED_INFO' — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара.
* 'REJECTED' — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары.
* 'SUSPENDED' — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
* 'OTHER' — товар не прошел модерацию по другой причине.

Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...status=READY,IN_WORK...
...status=READY&status=IN_WORK...
'''

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **availability** | [**array[OfferAvailabilityStatusType]**](OfferAvailabilityStatusType.md) | Фильтрация по планам поставок товара:

* 'ACTIVE' — поставки будут.
* 'INACTIVE' — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять.
* 'DELISTED' — архив: товар закончился на складе, и его поставок больше не будет.

Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...availability=INACTIVE,DELISTED...
...availability=INACTIVE&availability=DELISTED...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **categoryId** | [**array[integer]**](integer.md) | Фильтрация по идентификатору категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).

Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...category_id=14727164,14382343...
...category_id=14727164&category_id=14382343...
'''

В запросе можно указать либо параметр 'shopSku', либо любые параметры для фильтрации товаров. Совместное использование параметра 'shopSku' и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **vendor** | [**array[string]**](string.md) | Фильтрация по бренду товара.

Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:

'''
...vendor=Aqua%20Minerale,Borjomi...
...vendor=Aqua%20Minerale&vendor=Borjomi...
'''

Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.

Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).

В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. | [optional] [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetOfferMappingEntriesResponse**](GetOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferMappings

Информация о товарах в каталоге

Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|

### Example

```bash
 getOfferMappings businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getOfferMappingsRequest** | [**GetOfferMappingsRequest**](GetOfferMappingsRequest.md) |  | [optional]

### Return type

[**GetOfferMappingsResponse**](GetOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferRecommendations

Рекомендации Маркета, касающиеся цен

Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 getOfferRecommendations businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getOfferRecommendationsRequest** | [**GetOfferRecommendationsRequest**](GetOfferRecommendationsRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetOfferRecommendationsResponse**](GetOfferRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOffers

Предложения магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.

Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.

В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.

{% note info %}

Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.

В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.

{% endnote %}

{% note info %}

Количество предложений считается по данным за последние семь дней (не включая сегодня).

Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)

### Example

```bash
 getOffers campaignId=value  query=value  feedId=value  shopCategoryId=value  currency=value  matched=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **query** | **string** | Поисковый запрос.

Поддерживается язык запросов.

Значение по умолчанию: все предложения магазина, размещенные на Маркете. | [optional] [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [optional] [default to null]
 **shopCategoryId** | **string** | Идентификатор категории предложения, указанный магазином в прайс-листе.

Параметр выводится только для предложений, у которых указана категория в прайс-листе.

Параметр доступен начиная с версии 2.0 партнерского API. | [optional] [default to null]
 **currency** | [**CurrencyType**](.md) | Валюта, в которой указана цена предложения.

Возможные значения:

* 'BYN' — белорусский рубль.

* 'KZT' — казахстанский тенге.

* 'RUR' — российский рубль.

* 'UAH' — украинская гривна. | [optional] [default to null]
 **matched** | **boolean** | Фильтр по признаку соотнесения предложения и карточки модели.

Возможные значения:

* '0 / FALSE / NO' — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.

* '1 / TRUE / YES' — поиск выполняется среди предложений, соотнесенных с карточками моделей). | [optional] [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetOffersResponse**](GetOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrder

Информация об одном заказе

Возвращает информацию о заказе.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 getOrder campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetOrderResponse**](GetOrderResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrderBusinessBuyerInfo

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.

{% note info \"\" %}

Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

{% endnote %}

Получить данные можно, только если заказ находится в статусе 'PROCESSING', 'DELIVERY', 'PICKUP' или 'DELIVERED'.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|

### Example

```bash
 getOrderBusinessBuyerInfo campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrderBusinessDocumentsInfo

Информация о документах

Возвращает информацию о документах по идентификатору заказа.

Получить данные можно после того, как заказ перейдет в статус 'DELIVERED'.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|

### Example

```bash
 getOrderBusinessDocumentsInfo campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrderLabelsData

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 getOrderLabelsData campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrders

Информация о нескольких заказах

Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.

Доступна фильтрация по нескольким характеристикам заказов:

* дате оформления;

* статусу;

* идентификаторам заказов;

* этапу обработки или причине отмены;

* типу (настоящий или тестовый);

* дате отгрузки в службу доставки;

* дате и времени обновления заказа.

Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).

Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.

Результаты возвращаются постранично. Для навигации по страницам используйте параметры 'page_token' и 'limit'.

Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 getOrders campaignId=value  Specify as:  orderIds="value1,value2,..."  Specify as:  status="value1,value2,..."  Specify as:  substatus="value1,value2,..."  fromDate=value  toDate=value  supplierShipmentDateFrom=value  supplierShipmentDateTo=value  updatedAtFrom=value  updatedAtTo=value  dispatchType=value  fake=value  hasCis=value  onlyWaitingForCancellationApprove=value  onlyEstimatedDelivery=value  buyerType=value  page=value  pageSize=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderIds** | [**array[integer]**](integer.md) | Фильтрация заказов по идентификаторам.
<br><br>
⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. | [optional] [default to null]
 **status** | [**Set[OrderStatusType]**](OrderStatusType.md) | Статус заказа:

* 'CANCELLED' — заказ отменен.

* 'DELIVERED' — заказ получен покупателем.

* 'DELIVERY' — заказ передан в службу доставки.

* 'PICKUP' — заказ доставлен в пункт самовывоза.

* 'PROCESSING' — заказ находится в обработке.

* 'UNPAID' — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).

Также могут возвращаться другие значения. Обрабатывать их не требуется. | [optional] [default to null]
 **substatus** | [**Set[OrderSubstatusType]**](OrderSubstatusType.md) | Этап обработки заказа (если он имеет статус 'PROCESSING') или причина отмены заказа (если он имеет статус 'CANCELLED').

Возможные значения для заказа в статусе 'PROCESSING':

* 'STARTED' — заказ подтвержден, его можно начать обрабатывать.
* 'READY_TO_SHIP' — заказ собран и готов к отправке.
* 'SHIPPED' — заказ передан службе доставки.

Возможные значения для заказа в статусе 'CANCELLED':

* 'DELIVERY_SERVICE_UNDELIVERED' — служба доставки не смогла доставить заказ.

* 'PROCESSING_EXPIRED' — значение более не используется.

* 'REPLACING_ORDER' — покупатель решил заменить товар другим по собственной инициативе.

* 'RESERVATION_EXPIRED' — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.

* 'RESERVATION_FAILED' — Маркет не может продолжить дальнейшую обработку заказа.

* 'SHOP_FAILED' — магазин не может выполнить заказ.

* 'USER_CHANGED_MIND' — покупатель отменил заказ по личным причинам.

* 'USER_NOT_PAID' — покупатель не оплатил заказ (для типа оплаты 'PREPAID') в течение 30 минут.

* 'USER_REFUSED_DELIVERY' — покупателя не устроили условия доставки.

* 'USER_REFUSED_PRODUCT' — покупателю не подошел товар.

* 'USER_REFUSED_QUALITY' — покупателя не устроило качество товара.

* 'USER_UNREACHABLE' — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:

  * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;
  * перерыв между первым и третьим звонком не менее 90 минут;
  * соединение не короче 5 секунд.

  Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.
* 'USER_WANTS_TO_CHANGE_DELIVERY_DATE' — покупатель хочет получить заказ в другой день.
* 'CANCELLED_COURIER_NOT_FOUND' — не удалось найти курьера.

Также могут возвращаться другие значения. Обрабатывать их не требуется. | [optional] [default to null]
 **fromDate** | **string** | Начальная дата для фильтрации заказов по дате оформления.

Формат даты: 'ДД-ММ-ГГГГ'.

Между начальной и конечной датой (параметр 'toDate') должно быть не больше 30 дней.

Значение по умолчанию: 30 дней назад от текущей даты. | [optional] [default to null]
 **toDate** | **string** | Конечная дата для фильтрации заказов по дате оформления.

Показываются заказы, созданные до 00:00 указанного дня.

Формат даты: 'ДД-ММ-ГГГГ'.

Между начальной (параметр 'fromDate') и конечной датой должно быть не больше 30 дней.

Значение по умолчанию: текущая дата. | [optional] [default to null]
 **supplierShipmentDateFrom** | **string** | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр 'shipmentDate').

Формат даты: 'ДД-ММ-ГГГГ'.

Между начальной и конечной датой (параметр 'supplierShipmentDateTo') должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации. | [optional] [default to null]
 **supplierShipmentDateTo** | **string** | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр 'shipmentDate').

Формат даты: 'ДД-ММ-ГГГГ'.

Между начальной (параметр 'supplierShipmentDateFrom') и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации. | [optional] [default to null]
 **updatedAtFrom** | **string** | Начальная дата для фильтрации заказов по дате и времени обновления (параметр 'updatedAt').

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-21T00:42:42+03:00'.

Между начальной и конечной датой (параметр 'updatedAtTo') должно быть не больше 30 дней.

Начальная дата включается в интервал для фильтрации. | [optional] [default to null]
 **updatedAtTo** | **string** | Конечная дата для фильтрации заказов по дате и времени обновления (параметр 'updatedAt').

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-21T00:42:42+03:00'.

Между начальной (параметр 'updatedAtFrom') и конечной датой должно быть не больше 30 дней.

Конечная дата не включается в интервал для фильтрации. | [optional] [default to null]
 **dispatchType** | [**OrderDeliveryDispatchType**](.md) | Способ отгрузки | [optional] [default to null]
 **fake** | **boolean** | Фильтрация заказов по типам:

* 'false' — настоящий заказ покупателя.

* 'true' — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. | [optional] [default to false]
 **hasCis** | **boolean** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):

* 'true' — да.

* 'false' — нет.

Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. | [optional] [default to false]
 **onlyWaitingForCancellationApprove** | **boolean** | **Только для модели DBS**

Фильтрация заказов по наличию запросов покупателей на отмену.

При значение 'true' возвращаются только заказы, которые находятся в статусе 'DELIVERY' или 'PICKUP' и которые пользователи решили отменить.

Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). | [optional] [default to false]
 **onlyEstimatedDelivery** | **boolean** | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:

* 'true' — возвращаются только заказы с неподтвержденной датой доставки.
* 'false' — фильтрация не применяется. | [optional] [default to false]
 **buyerType** | [**OrderBuyerType**](.md) | Фильтрация заказов по типу покупателя. | [optional] [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetOrdersResponse**](GetOrdersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrdersStats

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.

{% note info \"\" %}

Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)

{% endnote %}

В одном запросе можно получить информацию не более чем по 200 заказам.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 getOrdersStats campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md) |  | [optional]

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPrices

Список цен

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).

{% endnote %}

Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.

{% note info %}

Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.

{% endnote %}

Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).

|**⚙️ Лимит:** '''(количество товаров партнера на витрине) * 25''' товаров в сутки|
|-|

### Example

```bash
 getPrices campaignId=value  page_token=value  limit=value  archived=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **archived** | **boolean** | Фильтр по нахождению в архиве. | [optional] [default to false]

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPricesByOfferIds

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25)

### Example

```bash
 getPricesByOfferIds campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getPricesByOfferIdsRequest** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md) |  | [optional]

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPromoOffers

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре 'limit' не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getPromoOffers businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getPromoOffersRequest** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPromos

Получение списка акций

Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр 'participation'.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getPromos businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getPromosRequest** | [**GetPromosRequest**](GetPromosRequest.md) |  | [optional]

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getQualityRatingDetails

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).

|**⚙️ Лимит:** 100000 запросов в час|
|-|

### Example

```bash
 getQualityRatingDetails campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getQualityRatings

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getQualityRatings businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getQualityRatingRequest** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md) |  |

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReportInfo

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 getReportInfo reportId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Идентификатор отчета, который вы получили после запуска генерации. | [default to null]

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturn

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturn campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturnApplication

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturnApplication campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturnPhoto

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturnPhoto campaignId=value orderId=value returnId=value itemId=value imageHash=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]
 **itemId** | **integer** | Идентификатор товара в возврате. | [default to null]
 **imageHash** | **string** | Хеш ссылки изображения для загрузки. | [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturns

Список невыкупов и возвратов

Получает список невыкупов и возвратов.

Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturns campaignId=value  page_token=value  limit=value  Specify as:  orderIds="value1,value2,..."  Specify as:  statuses="value1,value2,..."  type=value  fromDate=value  toDate=value  from_date=value  to_date=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **orderIds** | [**array[integer]**](integer.md) | Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. | [optional] [default to null]
 **statuses** | [**array[RefundStatusType]**](RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую. | [optional] [default to null]
 **type** | [**ReturnType**](.md) | Тип заказа для фильтрации:

* 'RETURN' — возврат.

* 'UNREDEEMED' — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы. | [optional] [default to null]
 **fromDate** | **string** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: 'ГГГГ-ММ-ДД'. | [optional] [default to null]
 **toDate** | **string** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: 'ГГГГ-ММ-ДД'. | [optional] [default to null]
 **fromDate2** | **string** | {% note warning \"\" %}

Этот параметр устарел. Вместо него используйте 'fromDate'.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional] [default to null]
 **toDate2** | **string** | {% note warning \"\" %}

Этот параметр устарел. Вместо него используйте 'toDate'.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional] [default to null]

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getStocks

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).

{% note info \"По умолчанию данные по оборачивамости не возращаются\" %}

Чтобы они были в ответе, передавайте 'true' в поле 'withTurnover'.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|

[//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)

### Example

```bash
 getStocks campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getWarehouseStocksRequest** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md) |  | [optional]

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSuggestedOfferMappingEntries

Рекомендованные карточки для товаров

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).

{% endnote %}

Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.

Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:

##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##

Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.

Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).

В одном запросе можно получить не более 500 рекомендаций.

|**⚙️ Лимит:** 100 000 рекомендаций в час|
|-|

### Example

```bash
 getSuggestedOfferMappingEntries campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getSuggestedOfferMappingEntriesRequest** | [**GetSuggestedOfferMappingEntriesRequest**](GetSuggestedOfferMappingEntriesRequest.md) |  |

### Return type

[**GetSuggestedOfferMappingEntriesResponse**](GetSuggestedOfferMappingEntriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSuggestedOfferMappings

Просмотр карточек на Маркете, которые подходят вашим товарам

Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида 'https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>'.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать 'marketSKU', который ему подходит по вашему мнению.

{% note info \"𝓠 Как определить 'marketSku' товара, найденного на Маркете?\" %}

𝓐 Он есть в адресе страницы товара — расположен после 'sku='.

Например, 'https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016'

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|

### Example

```bash
 getSuggestedOfferMappings businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getSuggestedOfferMappingsRequest** | [**GetSuggestedOfferMappingsRequest**](GetSuggestedOfferMappingsRequest.md) |  | [optional]

### Return type

[**GetSuggestedOfferMappingsResponse**](GetSuggestedOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSuggestedPrices

Цены для продвижения товаров

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).

{% endnote %}

{% note warning \"\" %}

Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.

{% endnote %}

Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.

Товары, для которых нужно получить цены, передаются в теле POST-запроса.

Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.

Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.

Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.

Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).

|**⚙️ Лимит:** 100 000 товаров в час|
|-|

### Example

```bash
 getSuggestedPrices campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **suggestPricesRequest** | [**SuggestPricesRequest**](SuggestPricesRequest.md) |  |

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getWarehouses

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 getWarehouses businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## provideOrderItemIdentifiers

Передача кодов маркировки единиц товара

{% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Передает Маркету коды маркировки для единиц товара в указанном заказе.

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

{% note warning %}

Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).

{% endnote %}

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 provideOrderItemIdentifiers campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **provideOrderItemIdentifiersRequest** | [**ProvideOrderItemIdentifiersRequest**](ProvideOrderItemIdentifiersRequest.md) |  |

### Return type

[**ProvideOrderItemIdentifiersResponse**](ProvideOrderItemIdentifiersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## putBidsForBusiness

Включение буста продаж и установка ставок

Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut \"Как в кабинете выглядит кампания, созданная через API\" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре 'bid'.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле 'bidFee'.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|

### Example

```bash
 putBidsForBusiness businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## putBidsForCampaign

Включение буста продаж и установка ставок для магазина

Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре 'bid'.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле 'bidFee'.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|

### Example

```bash
 putBidsForCampaign campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **putSkuBidsRequest** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## refreshFeed

Сообщить, что прайс-лист обновился

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.
1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.
2. Магазин отправляет Маркету запрос методом 'POST campaigns/{campaignId}/feeds/{feedId}/refresh'.
3. Маркет начинает обновление данных магазина на сервисе.

{% note alert %}

Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — '200 OK'. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.

{% endnote %}

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|

### Example

```bash
 refreshFeed campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## searchRegionChildren

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов 'GET regions', 'GET regions/{regionId}' и 'GET regions/{regionId}/children' действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|

### Example

```bash
 searchRegionChildren regionId=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **integer** | Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). | [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## searchRegionsById

Информация о регионе

Возвращает информацию о регионе.

Для методов 'GET regions', 'GET regions/{regionId}' и 'GET regions/{regionId}/children' действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|

### Example

```bash
 searchRegionsById regionId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **integer** | Идентификатор региона.

Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). | [default to null]

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## searchRegionsByName

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов 'GET regions', 'GET regions/{regionId}' и 'GET regions/{regionId}/children' действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|

### Example

```bash
 searchRegionsByName  name=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** | Название региона.

Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, 'Москва'. | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sendFileToChat

Отправка файла в чат

Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 sendFileToChat businessId=value  chatId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **file** | **binary** | Содержимое файла. Максимальный размер файла — 5 Мбайт. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sendMessageToChat

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 sendMessageToChat businessId=value  chatId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setFeedParams

Изменение параметров прайс-листа

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет магазину изменить параметры прайс-листа.

Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: 'name' (название параметра) и 'value' (значение параметра).

Чтобы отменить установленное значение, передайте в теле запроса: 'name' (название параметра) и 'delete=true' (удалить значение).

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|

### Example

```bash
 setFeedParams campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]
 **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setOrderBoxLayout

Подготовка заказа

{% note tip \"Подходит и для DBS\" %}

Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.

{% endnote %}

Позволяет выполнить три операции:

* передать Маркету информацию о распределении товаров по коробкам;
* передать Маркету коды маркировки для товаров;
* удалить товар из заказа, если его не оказалось на складе.

Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.

## Как передать информацию о распределении товаров

В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:

* **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.

* **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.

⚠️ Одна коробка не может содержать и товары целиком, и части товаров.

## Как передавать коды маркировки

Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)

Принимаются коды следующих типов:

* Коды «Честного знака».
* УИН для ювелирных изделий.
* РНПТ и ГТД для импортных прослеживаемых товаров.

Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.

Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.

## Как удалить товар из заказа

Чтобы удалить товар из заказа:

1. Добавьте в запрос 'allowRemove: true'.
2. Передайте распределение по коробкам без товара, который нужно удалить.

{% note warning \"Удаление нельзя отменить\" %}

Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.

{% endnote %}

Чтобы удалить позицию целиком, не передавайте соответствующий 'OrderBoxLayoutItemDTO'. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле 'fullCount'.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа 'CANCELLED' с причиной отмены 'SHOP_FAILED'.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

## Примеры

{% cut \"Товар умещается в коробку\" %}

Вот как будет выглядеть запрос, если в одной коробке едут:

  * три единицы одного товара, требующего маркировки;
  * одна единица другого товара, не требущего маркировки.

  '''json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"fullCount\": 3,
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          },
                          {
                              \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"
                          },
                          {
                              \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"
                          }
                      ]
                  },
                  {
                      \"id\": 654321,
                      \"fullCount\": 1
                  }
              ]
          }
      ]
  }
  '''

{% endcut %}

{% cut \"Товар едет в разных коробках\" %}

Вот как будет выглядеть запрос, если товар едет в двух коробках:

  '''json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  '''

{% endcut %}

{% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}

Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:

  '''json
  {
      \"boxes\": [
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 1,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          },
          {
              \"items\": [
                  {
                      \"id\": 123456,
                      \"partialCount\": {
                          \"current\": 2,
                          \"total\": 2
                      },
                      \"instances\": [
                          {
                              \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"
                          }
                      ]
                  }
              ]
          }
      ]
  }
  '''

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 setOrderBoxLayout campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **setOrderBoxLayoutRequest** | [**SetOrderBoxLayoutRequest**](SetOrderBoxLayoutRequest.md) |  |

### Return type

[**SetOrderBoxLayoutResponse**](SetOrderBoxLayoutResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setOrderShipmentBoxes

Передача количества грузовых мест в заказе

{% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.

Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).

Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.

Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.

{% cut \"Как было раньше\" %}

Структура тела PUT-запроса:

'''
{
  \"boxes\":
  [
    {
      \"fulfilmentId\": \"{string}\",
      \"weight\": {int64},
      \"width\": {int64},
      \"height\": {int64},
      \"depth\": {int64},
      \"items\":
      [
        {
          \"id\": {int64},
          \"count\": {int32}
        },
        ...
      ]
    },
    ...
  ]
}
'''
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| 'boxes'       |           | Список грузовых мест.       |

**Параметры, вложенные в 'boxes'**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| 'fulfilmentId'       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: 'номер заказа на Маркете-номер грузового места'. Например, '7206821‑1, 7206821‑2' и т. д. |
| 'weight'       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. |
| 'width'       | Int64   | Ширина грузового места в сантиметрах.       |
| 'height'       | Int64   | Высота грузового места в сантиметрах.       |
| 'depth'       | Int64   | Глубина грузового места в сантиметрах.        |
| 'items'       | Int64   | Список товаров в грузовом месте.       |

**Параметры, вложенные в 'items'**
| **Параметр**  | **Тип**  | **Значение**  |
| ----------- | ----------- | ----------- |
| 'id'       | Int64     | Идентификатор товара в рамках заказа.   |
| 'count'    | Int32     | Количество единиц товара в грузовом месте.       |

{% endcut %}

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 setOrderShipmentBoxes campaignId=value orderId=value shipmentId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **shipmentId** | **integer** | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. | [default to null]
 **setOrderShipmentBoxesRequest** | [**SetOrderShipmentBoxesRequest**](SetOrderShipmentBoxesRequest.md) |  |

### Return type

[**SetOrderShipmentBoxesResponse**](SetOrderShipmentBoxesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## skipGoodsFeedbacksReaction

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 skipGoodsFeedbacksReaction businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **skipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateBusinessPrices

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 updateBusinessPrices businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateBusinessPricesRequest** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateCampaignOffers

Изменение условий продажи товаров в магазине

Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updateCampaignOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateCampaignOffersRequest** | [**UpdateCampaignOffersRequest**](UpdateCampaignOffersRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateGoodsFeedbackComment

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва 'feedbackId'.

Чтобы добавить комментарий к другому комментарию, передайте:

* 'feedbackId' — идентификатор отзыва;
* 'comment.parentId' — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* 'feedbackId'— идентификатор отзыва;
* 'comment.id' — идентификатор комментария, который нужно изменить.

Если передать одновременно 'comment.parentId' и 'comment.id', будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 updateGoodsFeedbackComment businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md) |  |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOfferContent

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning \"Здесь только то, что относится к конкретной категории\" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом 'string', передайте пустое значение.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updateOfferContent businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md) |  |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOfferMappingEntries

Добавление и редактирование товаров в каталоге

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.

Информацию о товарах нужно передать в теле POST-запроса.

У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:

* Чтобы добавить в каталог новый товар, укажите в параметре 'shopSku' ваш SKU, которого еще нет в каталоге.
* Чтобы отредактировать товар из каталога, укажите в параметре 'shopSku' ваш SKU этого товара в каталоге.

В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.

Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус 'NEED_CONTENT' (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус 'NEED_INFO' (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).

В одном запросе можно добавить не более 500 товаров.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5 000 товаров в минуту|
|-|

### Example

```bash
 updateOfferMappingEntries campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOfferMappingEntryRequest** | [**UpdateOfferMappingEntryRequest**](UpdateOfferMappingEntryRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOfferMappings

Добавление товаров в каталог и изменение информации о них

Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле 'marketSKU'.

Для **новых товаров** обязательно укажите параметры: 'offerId', 'name', 'marketCategoryId' или 'category', 'pictures', 'vendor', 'description'.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в 'offerId' соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом 'string', передайте пустое значение.

Параметр 'offerId' должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning \"Правила использования SKU\" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 updateOfferMappings businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOfferMappingsRequest** | [**UpdateOfferMappingsRequest**](UpdateOfferMappingsRequest.md) |  |

### Return type

[**UpdateOfferMappingsResponse**](UpdateOfferMappingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOrderItems

Удаление товара из заказа или уменьшение числа единиц

{% note warning \"Этот запрос только для DBS\" %}

Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).

{% endnote %}

Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:

* покупатель уменьшил количество товара;
* магазин не может поставить все товары в заказе.

Для этого заказ должен находится в статусе '\"status\": \"PROCESSING\"' этапа обработки '\"substatus\": \"STARTED\"'. После передачи статуса '\"substatus\": \"READY_TO_SHIP\"' изменить состав невозможно.

Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте 'count' параметра 'item'.

Чтобы полностью удалить товар из заказа:

* передайте значение '0'; или
* не передавайте параметр 'item'.

Нельзя удалить или уменьшить количество товара, если он:

* добавлен по акции;
* составляет 99% стоимости заказа;
* единственный товар в заказе.

Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа 'CANCELLED' с причиной отмены 'SHOP_FAILED'.

{% note info \"Увеличить заказ нельзя\" %}

С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.

{% endnote %}

**Возврат денег покупателю**

Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:

* при оплате банковской картой — с момента, когда магазин переведет заказ в статус 'SHIPPED';

* при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 updateOrderItems campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **updateOrderItemRequest** | [**UpdateOrderItemRequest**](UpdateOrderItemRequest.md) |  |

### Return type

(empty response body)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOrderStatus

Изменение статуса одного заказа

Изменяет статус заказа. Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса '\"status\": \"PROCESSING\"' и этапа обработки '\"substatus\": \"STARTED\"' нужно перевести в статус '\"status\": \"PROCESSING\"' и этап обработки '\"substatus\": \"READY_TO_SHIP\"'.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса '\"status\": \"PROCESSING\"' и этапа обработки '\"substatus\": \"STARTED\"' нужно перевести в статус '\"status\": \"CANCELLED\"' с причиной отмены заказа '\"substatus\": \"SHOP_FAILED\"'.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса '\"status\": \"PROCESSING\"' и этапа обработки '\"substatus\": \"READY_TO_SHIP\"' нужно перевести в статус '\"status\": \"CANCELLED\"' с причиной отмены заказа '\"substatus\": \"SHOP_FAILED\"'.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 updateOrderStatus campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **updateOrderStatusRequest** | [**UpdateOrderStatusRequest**](UpdateOrderStatusRequest.md) |  |

### Return type

[**UpdateOrderStatusResponse**](UpdateOrderStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOrderStatuses

Изменение статусов нескольких заказов

Изменяет статусы нескольких заказов.

Возможные изменения статусов:

* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса '\"status\": \"PROCESSING\"'и этапа обработки '\"substatus\": \"STARTED\"' нужно перевести в статус '\"status\": \"PROCESSING\"' и этап обработки '\"substatus\": \"READY_TO_SHIP\"'.
* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса '\"status\": \"PROCESSING\"' и этапа обработки '\"substatus\": \"STARTED\"' нужно перевести в статус '\"status\": \"CANCELLED\"' с причиной отмены заказа '\"substatus\": \"SHOP_FAILED\"'.
* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса '\"status\": \"PROCESSING\"' и этапа обработки '\"substatus\": \"READY_TO_SHIP\"' нужно перевести в статус '\"status\": \"CANCELLED\"' с причиной отмены заказа '\"substatus\": \"SHOP_FAILED\"'.

Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 updateOrderStatuses campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOrderStatusesRequest** | [**UpdateOrderStatusesRequest**](UpdateOrderStatusesRequest.md) |  |

### Return type

[**UpdateOrderStatusesResponse**](UpdateOrderStatusesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePrices

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updatePrices campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updatePricesRequest** | [**UpdatePricesRequest**](UpdatePricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePromoOffers

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 updatePromoOffers businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md) |  |

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateStocks

Передача информации об остатках

Передает данные об остатках товаров на витрине.

Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в минуту|
|-|

### Example

```bash
 updateStocks campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateStocksRequest** | [**UpdateStocksRequest**](UpdateStocksRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## verifyOrderEac

Передача кода подтверждения

Отправляет Маркету код подтверждения для его проверки.

Код подтверждает передачу заказа или невыкупа:

* курьеру — курьер должен назвать магазину код;
* магазину — магазин называет код курьеру.

Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.

Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре 'delivery', вложенном в 'order' будет возвращаться параметр 'eacType' с типом 'Enum' — тип кода подтверждения для передачи заказа.

Возможные значения: 'MERCHANT_TO_COURIER' — магазин называет код курьеру, 'COURIER_TO_MERCHANT' — курьер называет код магазину.

Параметр 'eacType' возвращается при статусах заказа 'COURIER_FOUND', 'COURIER_ARRIVED_TO_SENDER' и 'DELIVERY_SERVICE_UNDELIVERED'. Если заказ в других статусах, параметр может отсутствовать.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 verifyOrderEac campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **verifyOrderEacRequest** | [**VerifyOrderEacRequest**](VerifyOrderEacRequest.md) |  |

### Return type

[**VerifyOrderEacResponse**](VerifyOrderEacResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

