# ExpressAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ExpressAPI_addHiddenOffers**](ExpressAPI.md#ExpressAPI_addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**ExpressAPI_addOffersToArchive**](ExpressAPI.md#ExpressAPI_addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
[**ExpressAPI_calculateTariffs**](ExpressAPI.md#ExpressAPI_calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
[**ExpressAPI_confirmBusinessPrices**](ExpressAPI.md#ExpressAPI_confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**ExpressAPI_confirmCampaignPrices**](ExpressAPI.md#ExpressAPI_confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**ExpressAPI_createChat**](ExpressAPI.md#ExpressAPI_createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**ExpressAPI_deleteCampaignOffers**](ExpressAPI.md#ExpressAPI_deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
[**ExpressAPI_deleteGoodsFeedbackComment**](ExpressAPI.md#ExpressAPI_deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**ExpressAPI_deleteHiddenOffers**](ExpressAPI.md#ExpressAPI_deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**ExpressAPI_deleteOffers**](ExpressAPI.md#ExpressAPI_deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
[**ExpressAPI_deleteOffersFromArchive**](ExpressAPI.md#ExpressAPI_deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
[**ExpressAPI_deletePromoOffers**](ExpressAPI.md#ExpressAPI_deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**ExpressAPI_generateBoostConsolidatedReport**](ExpressAPI.md#ExpressAPI_generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**ExpressAPI_generateCompetitorsPositionReport**](ExpressAPI.md#ExpressAPI_generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**ExpressAPI_generateGoodsFeedbackReport**](ExpressAPI.md#ExpressAPI_generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**ExpressAPI_generateGoodsRealizationReport**](ExpressAPI.md#ExpressAPI_generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**ExpressAPI_generateMassOrderLabelsReport**](ExpressAPI.md#ExpressAPI_generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**ExpressAPI_generateOrderLabel**](ExpressAPI.md#ExpressAPI_generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**ExpressAPI_generateOrderLabels**](ExpressAPI.md#ExpressAPI_generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**ExpressAPI_generatePricesReport**](ExpressAPI.md#ExpressAPI_generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**ExpressAPI_generateShelfsStatisticsReport**](ExpressAPI.md#ExpressAPI_generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**ExpressAPI_generateShowsSalesReport**](ExpressAPI.md#ExpressAPI_generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**ExpressAPI_generateStocksOnWarehousesReport**](ExpressAPI.md#ExpressAPI_generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**ExpressAPI_generateUnitedMarketplaceServicesReport**](ExpressAPI.md#ExpressAPI_generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**ExpressAPI_generateUnitedNettingReport**](ExpressAPI.md#ExpressAPI_generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**ExpressAPI_generateUnitedOrdersReport**](ExpressAPI.md#ExpressAPI_generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**ExpressAPI_getAllOffers**](ExpressAPI.md#ExpressAPI_getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
[**ExpressAPI_getBidsInfoForBusiness**](ExpressAPI.md#ExpressAPI_getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
[**ExpressAPI_getBidsRecommendations**](ExpressAPI.md#ExpressAPI_getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
[**ExpressAPI_getBusinessQuarantineOffers**](ExpressAPI.md#ExpressAPI_getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**ExpressAPI_getBusinessSettings**](ExpressAPI.md#ExpressAPI_getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
[**ExpressAPI_getCampaign**](ExpressAPI.md#ExpressAPI_getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**ExpressAPI_getCampaignLogins**](ExpressAPI.md#ExpressAPI_getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**ExpressAPI_getCampaignOffers**](ExpressAPI.md#ExpressAPI_getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
[**ExpressAPI_getCampaignQuarantineOffers**](ExpressAPI.md#ExpressAPI_getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
[**ExpressAPI_getCampaignRegion**](ExpressAPI.md#ExpressAPI_getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**ExpressAPI_getCampaignSettings**](ExpressAPI.md#ExpressAPI_getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**ExpressAPI_getCampaigns**](ExpressAPI.md#ExpressAPI_getCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**ExpressAPI_getCampaignsByLogin**](ExpressAPI.md#ExpressAPI_getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
[**ExpressAPI_getCategoriesMaxSaleQuantum**](ExpressAPI.md#ExpressAPI_getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**ExpressAPI_getCategoriesTree**](ExpressAPI.md#ExpressAPI_getCategoriesTree) | **POST** /categories/tree | Дерево категорий
[**ExpressAPI_getCategoryContentParameters**](ExpressAPI.md#ExpressAPI_getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**ExpressAPI_getChatHistory**](ExpressAPI.md#ExpressAPI_getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**ExpressAPI_getChats**](ExpressAPI.md#ExpressAPI_getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**ExpressAPI_getDeliveryServices**](ExpressAPI.md#ExpressAPI_getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
[**ExpressAPI_getFeed**](ExpressAPI.md#ExpressAPI_getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**ExpressAPI_getFeedIndexLogs**](ExpressAPI.md#ExpressAPI_getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**ExpressAPI_getFeedbackAndCommentUpdates**](ExpressAPI.md#ExpressAPI_getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
[**ExpressAPI_getFeeds**](ExpressAPI.md#ExpressAPI_getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**ExpressAPI_getGoodsFeedbackComments**](ExpressAPI.md#ExpressAPI_getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**ExpressAPI_getGoodsFeedbacks**](ExpressAPI.md#ExpressAPI_getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**ExpressAPI_getGoodsStats**](ExpressAPI.md#ExpressAPI_getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
[**ExpressAPI_getHiddenOffers**](ExpressAPI.md#ExpressAPI_getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
[**ExpressAPI_getOfferCardsContentStatus**](ExpressAPI.md#ExpressAPI_getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**ExpressAPI_getOfferMappingEntries**](ExpressAPI.md#ExpressAPI_getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
[**ExpressAPI_getOfferMappings**](ExpressAPI.md#ExpressAPI_getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
[**ExpressAPI_getOfferRecommendations**](ExpressAPI.md#ExpressAPI_getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
[**ExpressAPI_getOffers**](ExpressAPI.md#ExpressAPI_getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
[**ExpressAPI_getOrder**](ExpressAPI.md#ExpressAPI_getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
[**ExpressAPI_getOrderBusinessBuyerInfo**](ExpressAPI.md#ExpressAPI_getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**ExpressAPI_getOrderBusinessDocumentsInfo**](ExpressAPI.md#ExpressAPI_getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
[**ExpressAPI_getOrderLabelsData**](ExpressAPI.md#ExpressAPI_getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
[**ExpressAPI_getOrders**](ExpressAPI.md#ExpressAPI_getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
[**ExpressAPI_getOrdersStats**](ExpressAPI.md#ExpressAPI_getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
[**ExpressAPI_getPrices**](ExpressAPI.md#ExpressAPI_getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
[**ExpressAPI_getPricesByOfferIds**](ExpressAPI.md#ExpressAPI_getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**ExpressAPI_getPromoOffers**](ExpressAPI.md#ExpressAPI_getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**ExpressAPI_getPromos**](ExpressAPI.md#ExpressAPI_getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**ExpressAPI_getQualityRatingDetails**](ExpressAPI.md#ExpressAPI_getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**ExpressAPI_getQualityRatings**](ExpressAPI.md#ExpressAPI_getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
[**ExpressAPI_getReportInfo**](ExpressAPI.md#ExpressAPI_getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
[**ExpressAPI_getReturn**](ExpressAPI.md#ExpressAPI_getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**ExpressAPI_getReturnApplication**](ExpressAPI.md#ExpressAPI_getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**ExpressAPI_getReturnPhoto**](ExpressAPI.md#ExpressAPI_getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**ExpressAPI_getReturns**](ExpressAPI.md#ExpressAPI_getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**ExpressAPI_getStocks**](ExpressAPI.md#ExpressAPI_getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
[**ExpressAPI_getSuggestedOfferMappingEntries**](ExpressAPI.md#ExpressAPI_getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
[**ExpressAPI_getSuggestedOfferMappings**](ExpressAPI.md#ExpressAPI_getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
[**ExpressAPI_getSuggestedPrices**](ExpressAPI.md#ExpressAPI_getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**ExpressAPI_getWarehouses**](ExpressAPI.md#ExpressAPI_getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
[**ExpressAPI_provideOrderItemIdentifiers**](ExpressAPI.md#ExpressAPI_provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
[**ExpressAPI_putBidsForBusiness**](ExpressAPI.md#ExpressAPI_putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
[**ExpressAPI_putBidsForCampaign**](ExpressAPI.md#ExpressAPI_putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
[**ExpressAPI_refreshFeed**](ExpressAPI.md#ExpressAPI_refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**ExpressAPI_searchRegionChildren**](ExpressAPI.md#ExpressAPI_searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
[**ExpressAPI_searchRegionsById**](ExpressAPI.md#ExpressAPI_searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
[**ExpressAPI_searchRegionsByName**](ExpressAPI.md#ExpressAPI_searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
[**ExpressAPI_sendFileToChat**](ExpressAPI.md#ExpressAPI_sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**ExpressAPI_sendMessageToChat**](ExpressAPI.md#ExpressAPI_sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
[**ExpressAPI_setFeedParams**](ExpressAPI.md#ExpressAPI_setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
[**ExpressAPI_setOrderBoxLayout**](ExpressAPI.md#ExpressAPI_setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
[**ExpressAPI_setOrderShipmentBoxes**](ExpressAPI.md#ExpressAPI_setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
[**ExpressAPI_skipGoodsFeedbacksReaction**](ExpressAPI.md#ExpressAPI_skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**ExpressAPI_updateBusinessPrices**](ExpressAPI.md#ExpressAPI_updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**ExpressAPI_updateCampaignOffers**](ExpressAPI.md#ExpressAPI_updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
[**ExpressAPI_updateGoodsFeedbackComment**](ExpressAPI.md#ExpressAPI_updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
[**ExpressAPI_updateOfferContent**](ExpressAPI.md#ExpressAPI_updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
[**ExpressAPI_updateOfferMappingEntries**](ExpressAPI.md#ExpressAPI_updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
[**ExpressAPI_updateOfferMappings**](ExpressAPI.md#ExpressAPI_updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
[**ExpressAPI_updateOrderItems**](ExpressAPI.md#ExpressAPI_updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
[**ExpressAPI_updateOrderStatus**](ExpressAPI.md#ExpressAPI_updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
[**ExpressAPI_updateOrderStatuses**](ExpressAPI.md#ExpressAPI_updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
[**ExpressAPI_updatePrices**](ExpressAPI.md#ExpressAPI_updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
[**ExpressAPI_updatePromoOffers**](ExpressAPI.md#ExpressAPI_updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
[**ExpressAPI_updateStocks**](ExpressAPI.md#ExpressAPI_updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
[**ExpressAPI_verifyOrderEac**](ExpressAPI.md#ExpressAPI_verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения


# **ExpressAPI_addHiddenOffers**
```c
// Скрытие товаров и настройки скрытия
//
// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_addHiddenOffers(apiClient_t *apiClient, long campaignId, add_hidden_offers_request_t *add_hidden_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**add_hidden_offers_request** | **[add_hidden_offers_request_t](add_hidden_offers_request.md) \*** | Запрос на скрытие оферов. | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_addOffersToArchive**
```c
// Добавление товаров в архив
//
// Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
add_offers_to_archive_response_t* ExpressAPI_addOffersToArchive(apiClient_t *apiClient, long businessId, add_offers_to_archive_request_t *add_offers_to_archive_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**add_offers_to_archive_request** | **[add_offers_to_archive_request_t](add_offers_to_archive_request.md) \*** |  | 

### Return type

[add_offers_to_archive_response_t](add_offers_to_archive_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_calculateTariffs**
```c
// Калькулятор стоимости услуг
//
// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
calculate_tariffs_response_t* ExpressAPI_calculateTariffs(apiClient_t *apiClient, calculate_tariffs_request_t *calculate_tariffs_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**calculate_tariffs_request** | **[calculate_tariffs_request_t](calculate_tariffs_request.md) \*** |  | 

### Return type

[calculate_tariffs_response_t](calculate_tariffs_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_confirmBusinessPrices**
```c
// Удаление товара из карантина по цене в кабинете
//
// Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
empty_api_response_t* ExpressAPI_confirmBusinessPrices(apiClient_t *apiClient, long businessId, confirm_prices_request_t *confirm_prices_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**confirm_prices_request** | **[confirm_prices_request_t](confirm_prices_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_confirmCampaignPrices**
```c
// Удаление товара из карантина по цене в магазине
//
// Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_confirmCampaignPrices(apiClient_t *apiClient, long campaignId, confirm_prices_request_t *confirm_prices_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**confirm_prices_request** | **[confirm_prices_request_t](confirm_prices_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_createChat**
```c
// Создание нового чата с покупателем
//
// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
create_chat_response_t* ExpressAPI_createChat(apiClient_t *apiClient, long businessId, create_chat_request_t *create_chat_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**create_chat_request** | **[create_chat_request_t](create_chat_request.md) \*** | description | 

### Return type

[create_chat_response_t](create_chat_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deleteCampaignOffers**
```c
// Удаление товаров из ассортимента магазина
//
// Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
delete_campaign_offers_response_t* ExpressAPI_deleteCampaignOffers(apiClient_t *apiClient, long campaignId, delete_campaign_offers_request_t *delete_campaign_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_campaign_offers_request** | **[delete_campaign_offers_request_t](delete_campaign_offers_request.md) \*** |  | 

### Return type

[delete_campaign_offers_response_t](delete_campaign_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deleteGoodsFeedbackComment**
```c
// Удаление комментария к отзыву
//
// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t* ExpressAPI_deleteGoodsFeedbackComment(apiClient_t *apiClient, long businessId, delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_goods_feedback_comment_request** | **[delete_goods_feedback_comment_request_t](delete_goods_feedback_comment_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deleteHiddenOffers**
```c
// Возобновление показа товаров
//
// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_deleteHiddenOffers(apiClient_t *apiClient, long campaignId, delete_hidden_offers_request_t *delete_hidden_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_hidden_offers_request** | **[delete_hidden_offers_request_t](delete_hidden_offers_request.md) \*** | Запрос на возобновление показа оферов. | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deleteOffers**
```c
// Удаление товаров из каталога
//
// Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_response_t* ExpressAPI_deleteOffers(apiClient_t *apiClient, long businessId, delete_offers_request_t *delete_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_offers_request** | **[delete_offers_request_t](delete_offers_request.md) \*** |  | 

### Return type

[delete_offers_response_t](delete_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deleteOffersFromArchive**
```c
// Удаление товаров из архива
//
// Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_from_archive_response_t* ExpressAPI_deleteOffersFromArchive(apiClient_t *apiClient, long businessId, delete_offers_from_archive_request_t *delete_offers_from_archive_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_offers_from_archive_request** | **[delete_offers_from_archive_request_t](delete_offers_from_archive_request.md) \*** |  | 

### Return type

[delete_offers_from_archive_response_t](delete_offers_from_archive_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_deletePromoOffers**
```c
// Удаление товаров из акции
//
// Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
delete_promo_offers_response_t* ExpressAPI_deletePromoOffers(apiClient_t *apiClient, long businessId, delete_promo_offers_request_t *delete_promo_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**delete_promo_offers_request** | **[delete_promo_offers_request_t](delete_promo_offers_request.md) \*** |  | 

### Return type

[delete_promo_offers_response_t](delete_promo_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateBoostConsolidatedReport**
```c
// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_boost_consolidated_request** | **[generate_boost_consolidated_request_t](generate_boost_consolidated_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateCompetitorsPositionReport**
```c
// Отчет «Конкурентная позиция»
//
// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_competitors_position_report_request** | **[generate_competitors_position_report_request_t](generate_competitors_position_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateGoodsFeedbackReport**
```c
// Отчет по отзывам о товарах
//
// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_feedback_request** | **[generate_goods_feedback_request_t](generate_goods_feedback_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateGoodsRealizationReport**
```c
// Отчет по реализации
//
// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateGoodsRealizationReport(apiClient_t *apiClient, generate_goods_realization_report_request_t *generate_goods_realization_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_realization_report_request** | **[generate_goods_realization_report_request_t](generate_goods_realization_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateMassOrderLabelsReport**
```c
// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
//
// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_mass_order_labels_request** | **[generate_mass_order_labels_request_t](generate_mass_order_labels_request.md) \*** |  | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateOrderLabel**
```c
// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t** ExpressAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**shipmentId** | **long** | Идентификатор грузоместа. | 
**boxId** | **long** | Идентификатор коробки. | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateOrderLabels**
```c
// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t** ExpressAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generatePricesReport**
```c
// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_prices_report_request** | **[generate_prices_report_request_t](generate_prices_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateShelfsStatisticsReport**
```c
// Отчет по полкам
//
// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_shelfs_statistics_request** | **[generate_shelfs_statistics_request_t](generate_shelfs_statistics_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateShowsSalesReport**
```c
// Отчет «Аналитика продаж»
//
// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_shows_sales_report_request** | **[generate_shows_sales_report_request_t](generate_shows_sales_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateStocksOnWarehousesReport**
```c
// Отчет по остаткам на складах
//
// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_stocks_on_warehouses_report_request** | **[generate_stocks_on_warehouses_report_request_t](generate_stocks_on_warehouses_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateUnitedMarketplaceServicesReport**
```c
// Отчет по стоимости услуг
//
// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_marketplace_services_report_request** | **[generate_united_marketplace_services_report_request_t](generate_united_marketplace_services_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateUnitedNettingReport**
```c
// Отчет по платежам
//
// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_netting_report_request** | **[generate_united_netting_report_request_t](generate_united_netting_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_generateUnitedOrdersReport**
```c
// Отчет по заказам
//
// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ExpressAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_orders_request** | **[generate_united_orders_request_t](generate_united_orders_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getAllOffers**
```c
// Все предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_all_offers_response_t* ExpressAPI_getAllOffers(apiClient_t *apiClient, long campaignId, long feedId, int *chunk);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **long** | Идентификатор прайс-листа. | [optional] 
**chunk** | **int \*** | Номер сегмента с результатами.  Значение по умолчанию: &#x60;0&#x60;.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать &#x60;chunk&#x3D;0&#x60; и т. д.  {% endnote %}  | [optional] 

### Return type

[get_all_offers_response_t](get_all_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getBidsInfoForBusiness**
```c
// Информация об установленных ставках
//
// Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_info_response_t* ExpressAPI_getBidsInfoForBusiness(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_bids_info_request_t *get_bids_info_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_bids_info_request** | **[get_bids_info_request_t](get_bids_info_request.md) \*** | description | [optional] 

### Return type

[get_bids_info_response_t](get_bids_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getBidsRecommendations**
```c
// Рекомендованные ставки для заданных товаров
//
// Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_recommendations_response_t* ExpressAPI_getBidsRecommendations(apiClient_t *apiClient, long businessId, get_bids_recommendations_request_t *get_bids_recommendations_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_bids_recommendations_request** | **[get_bids_recommendations_request_t](get_bids_recommendations_request.md) \*** | description. | 

### Return type

[get_bids_recommendations_response_t](get_bids_recommendations_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getBusinessQuarantineOffers**
```c
// Список товаров, находящихся в карантине по цене в кабинете
//
// Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_quarantine_offers_response_t* ExpressAPI_getBusinessQuarantineOffers(apiClient_t *apiClient, long businessId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_quarantine_offers_request** | **[get_quarantine_offers_request_t](get_quarantine_offers_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_quarantine_offers_response_t](get_quarantine_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getBusinessSettings**
```c
// Настройки кабинета
//
// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_business_settings_response_t* ExpressAPI_getBusinessSettings(apiClient_t *apiClient, long businessId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_business_settings_response_t](get_business_settings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaign**
```c
// Информация о магазине
//
// Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_response_t* ExpressAPI_getCampaign(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_campaign_response_t](get_campaign_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignLogins**
```c
// Логины, связанные с магазином
//
// Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_logins_response_t* ExpressAPI_getCampaignLogins(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_campaign_logins_response_t](get_campaign_logins_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignOffers**
```c
// Информация о товарах, которые размещены в заданном магазине
//
// Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_campaign_offers_response_t* ExpressAPI_getCampaignOffers(apiClient_t *apiClient, long campaignId, get_campaign_offers_request_t *get_campaign_offers_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_campaign_offers_request** | **[get_campaign_offers_request_t](get_campaign_offers_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_campaign_offers_response_t](get_campaign_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignQuarantineOffers**
```c
// Список товаров, находящихся в карантине по цене в магазине
//
// Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_quarantine_offers_response_t* ExpressAPI_getCampaignQuarantineOffers(apiClient_t *apiClient, long campaignId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_quarantine_offers_request** | **[get_quarantine_offers_request_t](get_quarantine_offers_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_quarantine_offers_response_t](get_quarantine_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignRegion**
```c
// Регион магазина
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_campaign_region_response_t* ExpressAPI_getCampaignRegion(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_campaign_region_response_t](get_campaign_region_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignSettings**
```c
// Настройки магазина
//
// Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_settings_response_t* ExpressAPI_getCampaignSettings(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_campaign_settings_response_t](get_campaign_settings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaigns**
```c
// Список магазинов пользователя
//
// Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaigns_response_t* ExpressAPI_getCampaigns(apiClient_t *apiClient, int *page, int *pageSize);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[get_campaigns_response_t](get_campaigns_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCampaignsByLogin**
```c
// Магазины, доступные логину
//
// Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_campaigns_response_t* ExpressAPI_getCampaignsByLogin(apiClient_t *apiClient, char *login, int *page, int *pageSize);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**login** | **char \*** | Логин пользователя. | 
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[get_campaigns_response_t](get_campaigns_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCategoriesMaxSaleQuantum**
```c
// Лимит на установку кванта продажи и минимального количества товаров в заказе
//
// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_max_sale_quantum_response_t* ExpressAPI_getCategoriesMaxSaleQuantum(apiClient_t *apiClient, get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**get_categories_max_sale_quantum_request** | **[get_categories_max_sale_quantum_request_t](get_categories_max_sale_quantum_request.md) \*** |  | 

### Return type

[get_categories_max_sale_quantum_response_t](get_categories_max_sale_quantum_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCategoriesTree**
```c
// Дерево категорий
//
// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_response_t* ExpressAPI_getCategoriesTree(apiClient_t *apiClient, get_categories_request_t *get_categories_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**get_categories_request** | **[get_categories_request_t](get_categories_request.md) \*** |  | [optional] 

### Return type

[get_categories_response_t](get_categories_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getCategoryContentParameters**
```c
// Списки характеристик товаров по категориям
//
// Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
//
get_category_content_parameters_response_t* ExpressAPI_getCategoryContentParameters(apiClient_t *apiClient, long categoryId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**categoryId** | **long** | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Return type

[get_category_content_parameters_response_t](get_category_content_parameters_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getChatHistory**
```c
// Получение истории сообщений в чате
//
// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chat_history_response_t* ExpressAPI_getChatHistory(apiClient_t *apiClient, long businessId, long chatId, get_chat_history_request_t *get_chat_history_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**chatId** | **long** | Идентификатор чата. | 
**get_chat_history_request** | **[get_chat_history_request_t](get_chat_history_request.md) \*** | description | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_chat_history_response_t](get_chat_history_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getChats**
```c
// Получение доступных чатов
//
// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chats_response_t* ExpressAPI_getChats(apiClient_t *apiClient, long businessId, get_chats_request_t *get_chats_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_chats_request** | **[get_chats_request_t](get_chats_request.md) \*** | description | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_chats_response_t](get_chats_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getDeliveryServices**
```c
// Справочник служб доставки
//
// Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_delivery_services_response_t* ExpressAPI_getDeliveryServices(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[get_delivery_services_response_t](get_delivery_services_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getFeed**
```c
// Информация о прайс-листе
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feed_response_t* ExpressAPI_getFeed(apiClient_t *apiClient, long campaignId, long feedId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **long** | Идентификатор прайс-листа. | 

### Return type

[get_feed_response_t](get_feed_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getFeedIndexLogs**
```c
// Отчет по индексации прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_feed_index_logs_response_t* ExpressAPI_getFeedIndexLogs(apiClient_t *apiClient, long campaignId, long feedId, int *limit, char published_time_from, char published_time_to, feed_index_logs_status_type_e status);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **long** | Идентификатор прайс-листа. | 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**published_time_from** | **char** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | [optional] 
**published_time_to** | **char** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | [optional] 
**status** | **feed_index_logs_status_type_e** | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | [optional] 

### Return type

[get_feed_index_logs_response_t](get_feed_index_logs_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getFeedbackAndCommentUpdates**
```c
// Новые и обновленные отзывы о магазине
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_feedback_list_response_t* ExpressAPI_getFeedbackAndCommentUpdates(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, char from_date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**from_date** | **char** | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 

### Return type

[get_feedback_list_response_t](get_feedback_list_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getFeeds**
```c
// Список прайс-листов магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feeds_response_t* ExpressAPI_getFeeds(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_feeds_response_t](get_feeds_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getGoodsFeedbackComments**
```c
// Получение комментариев к отзыву
//
// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_comments_response_t* ExpressAPI_getGoodsFeedbackComments(apiClient_t *apiClient, long businessId, get_goods_feedback_comments_request_t *get_goods_feedback_comments_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_goods_feedback_comments_request** | **[get_goods_feedback_comments_request_t](get_goods_feedback_comments_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_goods_feedback_comments_response_t](get_goods_feedback_comments_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getGoodsFeedbacks**
```c
// Получение отзывов о товарах продавца
//
// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_response_t* ExpressAPI_getGoodsFeedbacks(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_goods_feedback_request_t *get_goods_feedback_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_goods_feedback_request** | **[get_goods_feedback_request_t](get_goods_feedback_request.md) \*** |  | [optional] 

### Return type

[get_goods_feedback_response_t](get_goods_feedback_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getGoodsStats**
```c
// Отчет по товарам
//
// Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_goods_stats_response_t* ExpressAPI_getGoodsStats(apiClient_t *apiClient, long campaignId, get_goods_stats_request_t *get_goods_stats_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_goods_stats_request** | **[get_goods_stats_request_t](get_goods_stats_request.md) \*** |  | 

### Return type

[get_goods_stats_response_t](get_goods_stats_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getHiddenOffers**
```c
// Информация о скрытых вами товарах
//
// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_hidden_offers_response_t* ExpressAPI_getHiddenOffers(apiClient_t *apiClient, long campaignId, list_t *offer_id, char *page_token, int *limit, int *offset, int *page, int *pageSize);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**offer_id** | **[list_t](char.md) \*** | Идентификатор скрытого предложения.  | [optional] 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**offset** | **int \*** | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional] 
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[get_hidden_offers_response_t](get_hidden_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOfferCardsContentStatus**
```c
// Получение информации о заполненности карточек магазина
//
// Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
//
get_offer_cards_content_status_response_t* ExpressAPI_getOfferCardsContentStatus(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_cards_content_status_request_t *get_offer_cards_content_status_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_offer_cards_content_status_request** | **[get_offer_cards_content_status_request_t](get_offer_cards_content_status_request.md) \*** |  | [optional] 

### Return type

[get_offer_cards_content_status_response_t](get_offer_cards_content_status_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOfferMappingEntries**
```c
// Список товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
//
get_offer_mapping_entries_response_t* ExpressAPI_getOfferMappingEntries(apiClient_t *apiClient, long campaignId, list_t *offer_id, list_t *shop_sku, offer_mapping_kind_type_e mapping_kind, list_t *status, list_t *availability, list_t *category_id, list_t *vendor, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**offer_id** | **[list_t](char.md) \*** | Идентификатор товара в каталоге. | [optional] 
**shop_sku** | **[list_t](char.md) \*** | Ваш SKU товара.  Параметр может быть указан несколько раз, например:  &#x60;&#x60;&#x60; ...shop_sku&#x3D;123&amp;shop_sku&#x3D;129&amp;shop_sku&#x3D;141... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] 
**mapping_kind** | **offer_mapping_kind_type_e** | Тип маппинга. | [optional] 
**status** | **[list_t](offer_processing_status_type.md) \*** | Фильтрация по статусу публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. * &#x60;IN_WORK&#x60; — товар проходит модерацию. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * &#x60;OTHER&#x60; — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...status&#x3D;READY,IN_WORK... ...status&#x3D;READY&amp;status&#x3D;IN_WORK... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] 
**availability** | **[list_t](offer_availability_status_type.md) \*** | Фильтрация по планам поставок товара:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...availability&#x3D;INACTIVE,DELISTED... ...availability&#x3D;INACTIVE&amp;availability&#x3D;DELISTED... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] 
**category_id** | **[list_t](int.md) \*** | Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...category_id&#x3D;14727164,14382343... ...category_id&#x3D;14727164&amp;category_id&#x3D;14382343... &#x60;&#x60;&#x60;  В запросе можно указать либо параметр &#x60;shopSku&#x60;, либо любые параметры для фильтрации товаров. Совместное использование параметра &#x60;shopSku&#x60; и параметров для фильтрации приведет к ошибке.  | [optional] 
**vendor** | **[list_t](char.md) \*** | Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  &#x60;&#x60;&#x60; ...vendor&#x3D;Aqua%20Minerale,Borjomi... ...vendor&#x3D;Aqua%20Minerale&amp;vendor&#x3D;Borjomi... &#x60;&#x60;&#x60;  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «&#39;» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке.  | [optional] 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_offer_mapping_entries_response_t](get_offer_mapping_entries_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOfferMappings**
```c
// Информация о товарах в каталоге
//
// Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
//
get_offer_mappings_response_t* ExpressAPI_getOfferMappings(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_mappings_request_t *get_offer_mappings_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_offer_mappings_request** | **[get_offer_mappings_request_t](get_offer_mappings_request.md) \*** |  | [optional] 

### Return type

[get_offer_mappings_response_t](get_offer_mappings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOfferRecommendations**
```c
// Рекомендации Маркета, касающиеся цен
//
// Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_offer_recommendations_response_t* ExpressAPI_getOfferRecommendations(apiClient_t *apiClient, long businessId, get_offer_recommendations_request_t *get_offer_recommendations_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_offer_recommendations_request** | **[get_offer_recommendations_request_t](get_offer_recommendations_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_offer_recommendations_response_t](get_offer_recommendations_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOffers**
```c
// Предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_offers_response_t* ExpressAPI_getOffers(apiClient_t *apiClient, long campaignId, char *query, long feedId, char *shopCategoryId, currency_type_e currency, int *matched, int *page, int *pageSize);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**query** | **char \*** | Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете.  | [optional] 
**feedId** | **long** | Идентификатор прайс-листа. | [optional] 
**shopCategoryId** | **char \*** | Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  | [optional] 
**currency** | **currency_type_e** | Валюта, в которой указана цена предложения.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  | [optional] 
**matched** | **int \*** | Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * &#x60;0 / FALSE / NO&#x60; — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * &#x60;1 / TRUE / YES&#x60; — поиск выполняется среди предложений, соотнесенных с карточками моделей).  | [optional] 
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[get_offers_response_t](get_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrder**
```c
// Информация об одном заказе
//
// Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_response_t* ExpressAPI_getOrder(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_order_response_t](get_order_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrderBusinessBuyerInfo**
```c
// Информация о покупателе — юридическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_buyer_info_response_t* ExpressAPI_getOrderBusinessBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_business_buyer_info_response_t](get_business_buyer_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrderBusinessDocumentsInfo**
```c
// Информация о документах
//
// Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_documents_info_response_t* ExpressAPI_getOrderBusinessDocumentsInfo(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_business_documents_info_response_t](get_business_documents_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrderLabelsData**
```c
// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t* ExpressAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_order_labels_data_response_t](get_order_labels_data_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrders**
```c
// Информация о нескольких заказах
//
// Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_response_t* ExpressAPI_getOrders(apiClient_t *apiClient, long campaignId, list_t *orderIds, list_t *status, list_t *substatus, char fromDate, char toDate, char supplierShipmentDateFrom, char supplierShipmentDateTo, char updatedAtFrom, char updatedAtTo, order_delivery_dispatch_type_e dispatchType, int *fake, int *hasCis, int *onlyWaitingForCancellationApprove, int *onlyEstimatedDelivery, order_buyer_type_e buyerType, int *page, int *pageSize, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderIds** | **[list_t](long.md) \*** | Фильтрация заказов по идентификаторам. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым.  | [optional] 
**status** | **[list_t](order_status_type.md) \*** | Статус заказа:  * &#x60;CANCELLED&#x60; — заказ отменен.  * &#x60;DELIVERED&#x60; — заказ получен покупателем.  * &#x60;DELIVERY&#x60; — заказ передан в службу доставки.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — заказ находится в обработке.  * &#x60;UNPAID&#x60; — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] 
**substatus** | **[list_t](order_substatus_type.md) \*** | Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  Возможные значения для заказа в статусе &#x60;PROCESSING&#x60;:  * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать. * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке. * &#x60;SHIPPED&#x60; — заказ передан службе доставки.  Возможные значения для заказа в статусе &#x60;CANCELLED&#x60;:  * &#x60;DELIVERY_SERVICE_UNDELIVERED&#x60; — служба доставки не смогла доставить заказ.  * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.  * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.  * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * &#x60;RESERVATION_FAILED&#x60; — Маркет не может продолжить дальнейшую обработку заказа.  * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.  * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.  * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.  * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.  * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.  * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.  * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * &#x60;USER_WANTS_TO_CHANGE_DELIVERY_DATE&#x60; — покупатель хочет получить заказ в другой день. * &#x60;CANCELLED_COURIER_NOT_FOUND&#x60; — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется.  | [optional] 
**fromDate** | **char** | Начальная дата для фильтрации заказов по дате оформления.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;toDate&#x60;) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты.  | [optional] 
**toDate** | **char** | Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;fromDate&#x60;) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата.  | [optional] 
**supplierShipmentDateFrom** | **char** | Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной и конечной датой (параметр &#x60;supplierShipmentDateTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] 
**supplierShipmentDateTo** | **char** | Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр &#x60;shipmentDate&#x60;).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  Между начальной (параметр &#x60;supplierShipmentDateFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] 
**updatedAtFrom** | **char** | Начальная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной и конечной датой (параметр &#x60;updatedAtTo&#x60;) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации.  | [optional] 
**updatedAtTo** | **char** | Конечная дата для фильтрации заказов по дате и времени обновления (параметр &#x60;updatedAt&#x60;).  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Между начальной (параметр &#x60;updatedAtFrom&#x60;) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации.  | [optional] 
**dispatchType** | **order_delivery_dispatch_type_e** | Способ отгрузки | [optional] 
**fake** | **int \*** | Фильтрация заказов по типам:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to false]
**hasCis** | **int \*** | Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да.  * &#x60;false&#x60; — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  | [optional] [default to false]
**onlyWaitingForCancellationApprove** | **int \*** | **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение &#x60;true&#x60; возвращаются только заказы, которые находятся в статусе &#x60;DELIVERY&#x60; или &#x60;PICKUP&#x60; и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation).  | [optional] [default to false]
**onlyEstimatedDelivery** | **int \*** | Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * &#x60;true&#x60; — возвращаются только заказы с неподтвержденной датой доставки. * &#x60;false&#x60; — фильтрация не применяется.  | [optional] [default to false]
**buyerType** | **order_buyer_type_e** | Фильтрация заказов по типу покупателя.  | [optional] 
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_orders_response_t](get_orders_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getOrdersStats**
```c
// Детальная информация по заказам
//
// Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_stats_response_t* ExpressAPI_getOrdersStats(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_orders_stats_request_t *get_orders_stats_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_orders_stats_request** | **[get_orders_stats_request_t](get_orders_stats_request.md) \*** |  | [optional] 

### Return type

[get_orders_stats_response_t](get_orders_stats_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getPrices**
```c
// Список цен
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
//
get_prices_response_t* ExpressAPI_getPrices(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, int *archived);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**archived** | **int \*** | Фильтр по нахождению в архиве. | [optional] [default to false]

### Return type

[get_prices_response_t](get_prices_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getPricesByOfferIds**
```c
// Просмотр цен на указанные товары в магазине
//
// Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
//
get_prices_by_offer_ids_response_t* ExpressAPI_getPricesByOfferIds(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_prices_by_offer_ids_request** | **[get_prices_by_offer_ids_request_t](get_prices_by_offer_ids_request.md) \*** |  | [optional] 

### Return type

[get_prices_by_offer_ids_response_t](get_prices_by_offer_ids_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getPromoOffers**
```c
// Получение списка товаров, которые участвуют или могут участвовать в акции
//
// Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_promo_offers_response_t* ExpressAPI_getPromoOffers(apiClient_t *apiClient, long businessId, get_promo_offers_request_t *get_promo_offers_request, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_promo_offers_request** | **[get_promo_offers_request_t](get_promo_offers_request.md) \*** |  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_promo_offers_response_t](get_promo_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getPromos**
```c
// Получение списка акций
//
// Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_promos_response_t* ExpressAPI_getPromos(apiClient_t *apiClient, long businessId, get_promos_request_t *get_promos_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_promos_request** | **[get_promos_request_t](get_promos_request.md) \*** |  | [optional] 

### Return type

[get_promos_response_t](get_promos_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getQualityRatingDetails**
```c
// Заказы, которые повлияли на индекс качества
//
// Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
//
get_quality_rating_details_response_t* ExpressAPI_getQualityRatingDetails(apiClient_t *apiClient, long campaignId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_quality_rating_details_response_t](get_quality_rating_details_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getQualityRatings**
```c
// Индекс качества магазинов
//
// Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_quality_rating_response_t* ExpressAPI_getQualityRatings(apiClient_t *apiClient, long businessId, get_quality_rating_request_t *get_quality_rating_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_quality_rating_request** | **[get_quality_rating_request_t](get_quality_rating_request.md) \*** |  | 

### Return type

[get_quality_rating_response_t](get_quality_rating_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getReportInfo**
```c
// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t* ExpressAPI_getReportInfo(apiClient_t *apiClient, char *reportId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**reportId** | **char \*** | Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[get_report_info_response_t](get_report_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getReturn**
```c
// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t* ExpressAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 

### Return type

[get_return_response_t](get_return_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getReturnApplication**
```c
// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t** ExpressAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getReturnPhoto**
```c
// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t** ExpressAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 
**itemId** | **long** | Идентификатор товара в возврате. | 
**imageHash** | **char \*** | Хеш ссылки изображения для загрузки. | 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getReturns**
```c
// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t* ExpressAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**orderIds** | **[list_t](long.md) \*** | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] 
**statuses** | **[list_t](refund_status_type.md) \*** | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] 
**type** | **return_type_e** | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] 
**fromDate** | **char** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**toDate** | **char** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**from_date** | **char** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 
**to_date** | **char** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 

### Return type

[get_returns_response_t](get_returns_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getStocks**
```c
// Информация об остатках и оборачиваемости
//
// Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
//
get_warehouse_stocks_response_t* ExpressAPI_getStocks(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_warehouse_stocks_request_t *get_warehouse_stocks_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_warehouse_stocks_request** | **[get_warehouse_stocks_request_t](get_warehouse_stocks_request.md) \*** |  | [optional] 

### Return type

[get_warehouse_stocks_response_t](get_warehouse_stocks_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getSuggestedOfferMappingEntries**
```c
// Рекомендованные карточки для товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
//
get_suggested_offer_mapping_entries_response_t* ExpressAPI_getSuggestedOfferMappingEntries(apiClient_t *apiClient, long campaignId, get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_suggested_offer_mapping_entries_request** | **[get_suggested_offer_mapping_entries_request_t](get_suggested_offer_mapping_entries_request.md) \*** |  | 

### Return type

[get_suggested_offer_mapping_entries_response_t](get_suggested_offer_mapping_entries_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getSuggestedOfferMappings**
```c
// Просмотр карточек на Маркете, которые подходят вашим товарам
//
// Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
get_suggested_offer_mappings_response_t* ExpressAPI_getSuggestedOfferMappings(apiClient_t *apiClient, long businessId, get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_suggested_offer_mappings_request** | **[get_suggested_offer_mappings_request_t](get_suggested_offer_mappings_request.md) \*** |  | [optional] 

### Return type

[get_suggested_offer_mappings_response_t](get_suggested_offer_mappings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getSuggestedPrices**
```c
// Цены для продвижения товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
suggest_prices_response_t* ExpressAPI_getSuggestedPrices(apiClient_t *apiClient, long campaignId, suggest_prices_request_t *suggest_prices_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**suggest_prices_request** | **[suggest_prices_request_t](suggest_prices_request.md) \*** |  | 

### Return type

[suggest_prices_response_t](suggest_prices_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_getWarehouses**
```c
// Список складов и групп складов
//
// Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_warehouses_response_t* ExpressAPI_getWarehouses(apiClient_t *apiClient, long businessId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_warehouses_response_t](get_warehouses_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_provideOrderItemIdentifiers**
```c
// Передача кодов маркировки единиц товара
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
provide_order_item_identifiers_response_t* ExpressAPI_provideOrderItemIdentifiers(apiClient_t *apiClient, long campaignId, long orderId, provide_order_item_identifiers_request_t *provide_order_item_identifiers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**provide_order_item_identifiers_request** | **[provide_order_item_identifiers_request_t](provide_order_item_identifiers_request.md) \*** |  | 

### Return type

[provide_order_item_identifiers_response_t](provide_order_item_identifiers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_putBidsForBusiness**
```c
// Включение буста продаж и установка ставок
//
// Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t* ExpressAPI_putBidsForBusiness(apiClient_t *apiClient, long businessId, put_sku_bids_request_t *put_sku_bids_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**put_sku_bids_request** | **[put_sku_bids_request_t](put_sku_bids_request.md) \*** | description | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_putBidsForCampaign**
```c
// Включение буста продаж и установка ставок для магазина
//
// Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t* ExpressAPI_putBidsForCampaign(apiClient_t *apiClient, long campaignId, put_sku_bids_request_t *put_sku_bids_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**put_sku_bids_request** | **[put_sku_bids_request_t](put_sku_bids_request.md) \*** | description | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_refreshFeed**
```c
// Сообщить, что прайс-лист обновился
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t* ExpressAPI_refreshFeed(apiClient_t *apiClient, long campaignId, long feedId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **long** | Идентификатор прайс-листа. | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_searchRegionChildren**
```c
// Информация о дочерних регионах
//
// Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_region_with_children_response_t* ExpressAPI_searchRegionChildren(apiClient_t *apiClient, long regionId, int *page, int *pageSize);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**regionId** | **long** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 
**page** | **int \*** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] [default to 1]
**pageSize** | **int \*** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] 

### Return type

[get_region_with_children_response_t](get_region_with_children_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_searchRegionsById**
```c
// Информация о регионе
//
// Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t* ExpressAPI_searchRegionsById(apiClient_t *apiClient, long regionId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**regionId** | **long** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  | 

### Return type

[get_regions_response_t](get_regions_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_searchRegionsByName**
```c
// Поиск регионов по их имени
//
// Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t* ExpressAPI_searchRegionsByName(apiClient_t *apiClient, char *name, char *page_token, int *limit);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**name** | **char \*** | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 

### Return type

[get_regions_response_t](get_regions_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_sendFileToChat**
```c
// Отправка файла в чат
//
// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t* ExpressAPI_sendFileToChat(apiClient_t *apiClient, long businessId, long chatId, binary_t* file);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**chatId** | **long** | Идентификатор чата. | 
**file** | **binary_t*** | Содержимое файла. Максимальный размер файла — 5 Мбайт. | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_sendMessageToChat**
```c
// Отправка сообщения в чат
//
// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t* ExpressAPI_sendMessageToChat(apiClient_t *apiClient, long businessId, long chatId, send_message_to_chat_request_t *send_message_to_chat_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**chatId** | **long** | Идентификатор чата. | 
**send_message_to_chat_request** | **[send_message_to_chat_request_t](send_message_to_chat_request.md) \*** | description | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_setFeedParams**
```c
// Изменение параметров прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t* ExpressAPI_setFeedParams(apiClient_t *apiClient, long campaignId, long feedId, set_feed_params_request_t *set_feed_params_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**feedId** | **long** | Идентификатор прайс-листа. | 
**set_feed_params_request** | **[set_feed_params_request_t](set_feed_params_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_setOrderBoxLayout**
```c
// Подготовка заказа
//
// {% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_box_layout_response_t* ExpressAPI_setOrderBoxLayout(apiClient_t *apiClient, long campaignId, long orderId, set_order_box_layout_request_t *set_order_box_layout_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**set_order_box_layout_request** | **[set_order_box_layout_request_t](set_order_box_layout_request.md) \*** |  | 

### Return type

[set_order_box_layout_response_t](set_order_box_layout_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_setOrderShipmentBoxes**
```c
// Передача количества грузовых мест в заказе
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_shipment_boxes_response_t* ExpressAPI_setOrderShipmentBoxes(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, set_order_shipment_boxes_request_t *set_order_shipment_boxes_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**shipmentId** | **long** | Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL.  | 
**set_order_shipment_boxes_request** | **[set_order_shipment_boxes_request_t](set_order_shipment_boxes_request.md) \*** |  | 

### Return type

[set_order_shipment_boxes_response_t](set_order_shipment_boxes_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_skipGoodsFeedbacksReaction**
```c
// Отказ от ответа на отзывы
//
// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t* ExpressAPI_skipGoodsFeedbacksReaction(apiClient_t *apiClient, long businessId, skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**skip_goods_feedback_reaction_request** | **[skip_goods_feedback_reaction_request_t](skip_goods_feedback_reaction_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateBusinessPrices**
```c
// Установка цен на товары во всех магазинах
//
// Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
empty_api_response_t* ExpressAPI_updateBusinessPrices(apiClient_t *apiClient, long businessId, update_business_prices_request_t *update_business_prices_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_business_prices_request** | **[update_business_prices_request_t](update_business_prices_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateCampaignOffers**
```c
// Изменение условий продажи товаров в магазине
//
// Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_updateCampaignOffers(apiClient_t *apiClient, long campaignId, update_campaign_offers_request_t *update_campaign_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_campaign_offers_request** | **[update_campaign_offers_request_t](update_campaign_offers_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateGoodsFeedbackComment**
```c
// Добавление нового или изменение созданного комментария
//
// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
update_goods_feedback_comment_response_t* ExpressAPI_updateGoodsFeedbackComment(apiClient_t *apiClient, long businessId, update_goods_feedback_comment_request_t *update_goods_feedback_comment_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_goods_feedback_comment_request** | **[update_goods_feedback_comment_request_t](update_goods_feedback_comment_request.md) \*** |  | 

### Return type

[update_goods_feedback_comment_response_t](update_goods_feedback_comment_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOfferContent**
```c
// Редактирование категорийных характеристик товара
//
// Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
update_offer_content_response_t* ExpressAPI_updateOfferContent(apiClient_t *apiClient, long businessId, update_offer_content_request_t *update_offer_content_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_offer_content_request** | **[update_offer_content_request_t](update_offer_content_request.md) \*** |  | 

### Return type

[update_offer_content_response_t](update_offer_content_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOfferMappingEntries**
```c
// Добавление и редактирование товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_updateOfferMappingEntries(apiClient_t *apiClient, long campaignId, update_offer_mapping_entry_request_t *update_offer_mapping_entry_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_offer_mapping_entry_request** | **[update_offer_mapping_entry_request_t](update_offer_mapping_entry_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOfferMappings**
```c
// Добавление товаров в каталог и изменение информации о них
//
// Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
update_offer_mappings_response_t* ExpressAPI_updateOfferMappings(apiClient_t *apiClient, long businessId, update_offer_mappings_request_t *update_offer_mappings_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_offer_mappings_request** | **[update_offer_mappings_request_t](update_offer_mappings_request.md) \*** |  | 

### Return type

[update_offer_mappings_response_t](update_offer_mappings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOrderItems**
```c
// Удаление товара из заказа или уменьшение числа единиц
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
void ExpressAPI_updateOrderItems(apiClient_t *apiClient, long campaignId, long orderId, update_order_item_request_t *update_order_item_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**update_order_item_request** | **[update_order_item_request_t](update_order_item_request.md) \*** |  | 

### Return type

void

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOrderStatus**
```c
// Изменение статуса одного заказа
//
// Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_status_response_t* ExpressAPI_updateOrderStatus(apiClient_t *apiClient, long campaignId, long orderId, update_order_status_request_t *update_order_status_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**update_order_status_request** | **[update_order_status_request_t](update_order_status_request.md) \*** |  | 

### Return type

[update_order_status_response_t](update_order_status_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateOrderStatuses**
```c
// Изменение статусов нескольких заказов
//
// Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_statuses_response_t* ExpressAPI_updateOrderStatuses(apiClient_t *apiClient, long campaignId, update_order_statuses_request_t *update_order_statuses_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_order_statuses_request** | **[update_order_statuses_request_t](update_order_statuses_request.md) \*** |  | 

### Return type

[update_order_statuses_response_t](update_order_statuses_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updatePrices**
```c
// Установка цен на товары в конкретном магазине
//
// Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_updatePrices(apiClient_t *apiClient, long campaignId, update_prices_request_t *update_prices_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_prices_request** | **[update_prices_request_t](update_prices_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updatePromoOffers**
```c
// Добавление товаров в акцию или изменение их цен
//
// Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
update_promo_offers_response_t* ExpressAPI_updatePromoOffers(apiClient_t *apiClient, long businessId, update_promo_offers_request_t *update_promo_offers_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_promo_offers_request** | **[update_promo_offers_request_t](update_promo_offers_request.md) \*** |  | 

### Return type

[update_promo_offers_response_t](update_promo_offers_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_updateStocks**
```c
// Передача информации об остатках
//
// Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
//
empty_api_response_t* ExpressAPI_updateStocks(apiClient_t *apiClient, long campaignId, update_stocks_request_t *update_stocks_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**update_stocks_request** | **[update_stocks_request_t](update_stocks_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ExpressAPI_verifyOrderEac**
```c
// Передача кода подтверждения
//
// Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
verify_order_eac_response_t* ExpressAPI_verifyOrderEac(apiClient_t *apiClient, long campaignId, long orderId, verify_order_eac_request_t *verify_order_eac_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**verify_order_eac_request** | **[verify_order_eac_request_t](verify_order_eac_request.md) \*** |  | 

### Return type

[verify_order_eac_response_t](verify_order_eac_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

