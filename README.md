# Партнерский API Маркета API Client


API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.\n\nВ числе возможностей интеграции:\n\n* управление каталогом товаров и витриной,\n\n* обработка заказов,\n\n* изменение настроек магазина,\n\n* получение отчетов.\n

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASBidsApi api = new OASBidsApi();
OASClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'businessId' => 2147483648L,
    'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
    'r_limit' => 20,
    'oaSGetBidsInfoRequest' => ''
};

try {
    // cross your fingers
    OASGetBidsInfoResponse result = api.getBidsInfoForBusiness(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASBidsApi* | [**getBidsInfoForBusiness**](OASBidsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*OASBidsApi* | [**getBidsRecommendations**](OASBidsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*OASBidsApi* | [**putBidsForBusiness**](OASBidsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*OASBidsApi* | [**putBidsForCampaign**](OASBidsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*OASBusinessOfferMappingsApi* | [**addOffersToArchive**](OASBusinessOfferMappingsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*OASBusinessOfferMappingsApi* | [**deleteOffers**](OASBusinessOfferMappingsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*OASBusinessOfferMappingsApi* | [**deleteOffersFromArchive**](OASBusinessOfferMappingsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*OASBusinessOfferMappingsApi* | [**getOfferMappings**](OASBusinessOfferMappingsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*OASBusinessOfferMappingsApi* | [**getSuggestedOfferMappings**](OASBusinessOfferMappingsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*OASBusinessOfferMappingsApi* | [**updateOfferMappings**](OASBusinessOfferMappingsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*OASBusinessesApi* | [**getBusinessSettings**](OASBusinessesApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*OASCampaignsApi* | [**getCampaign**](OASCampaignsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*OASCampaignsApi* | [**getCampaignLogins**](OASCampaignsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*OASCampaignsApi* | [**getCampaignRegion**](OASCampaignsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*OASCampaignsApi* | [**getCampaignSettings**](OASCampaignsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*OASCampaignsApi* | [**getCampaigns**](OASCampaignsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*OASCampaignsApi* | [**getCampaignsByLogin**](OASCampaignsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*OASCategoriesApi* | [**getCategoriesMaxSaleQuantum**](OASCategoriesApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*OASCategoriesApi* | [**getCategoriesTree**](OASCategoriesApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*OASChatsApi* | [**createChat**](OASChatsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*OASChatsApi* | [**getChatHistory**](OASChatsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*OASChatsApi* | [**getChats**](OASChatsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*OASChatsApi* | [**sendFileToChat**](OASChatsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*OASChatsApi* | [**sendMessageToChat**](OASChatsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*OASContentApi* | [**getCategoryContentParameters**](OASContentApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*OASContentApi* | [**getOfferCardsContentStatus**](OASContentApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*OASContentApi* | [**updateOfferContent**](OASContentApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*OASDbsApi* | [**acceptOrderCancellation**](OASDbsApi.md#acceptOrderCancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*OASDbsApi* | [**addHiddenOffers**](OASDbsApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*OASDbsApi* | [**addOffersToArchive**](OASDbsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*OASDbsApi* | [**calculateTariffs**](OASDbsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*OASDbsApi* | [**confirmBusinessPrices**](OASDbsApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*OASDbsApi* | [**confirmCampaignPrices**](OASDbsApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*OASDbsApi* | [**createChat**](OASDbsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*OASDbsApi* | [**createOutlet**](OASDbsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*OASDbsApi* | [**deleteCampaignOffers**](OASDbsApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OASDbsApi* | [**deleteGoodsFeedbackComment**](OASDbsApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*OASDbsApi* | [**deleteHiddenOffers**](OASDbsApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*OASDbsApi* | [**deleteOffers**](OASDbsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*OASDbsApi* | [**deleteOffersFromArchive**](OASDbsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*OASDbsApi* | [**deleteOutlet**](OASDbsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*OASDbsApi* | [**deleteOutletLicenses**](OASDbsApi.md#deleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*OASDbsApi* | [**deletePromoOffers**](OASDbsApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*OASDbsApi* | [**generateBoostConsolidatedReport**](OASDbsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*OASDbsApi* | [**generateCompetitorsPositionReport**](OASDbsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*OASDbsApi* | [**generateGoodsFeedbackReport**](OASDbsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*OASDbsApi* | [**generateMassOrderLabelsReport**](OASDbsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*OASDbsApi* | [**generateOrderLabel**](OASDbsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OASDbsApi* | [**generateOrderLabels**](OASDbsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OASDbsApi* | [**generatePricesReport**](OASDbsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*OASDbsApi* | [**generateShelfsStatisticsReport**](OASDbsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*OASDbsApi* | [**generateShowsSalesReport**](OASDbsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*OASDbsApi* | [**generateStocksOnWarehousesReport**](OASDbsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*OASDbsApi* | [**generateUnitedMarketplaceServicesReport**](OASDbsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*OASDbsApi* | [**generateUnitedNettingReport**](OASDbsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*OASDbsApi* | [**generateUnitedOrdersReport**](OASDbsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*OASDbsApi* | [**getAllOffers**](OASDbsApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OASDbsApi* | [**getBidsInfoForBusiness**](OASDbsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*OASDbsApi* | [**getBidsRecommendations**](OASDbsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*OASDbsApi* | [**getBusinessQuarantineOffers**](OASDbsApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*OASDbsApi* | [**getBusinessSettings**](OASDbsApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*OASDbsApi* | [**getCampaign**](OASDbsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*OASDbsApi* | [**getCampaignLogins**](OASDbsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*OASDbsApi* | [**getCampaignOffers**](OASDbsApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OASDbsApi* | [**getCampaignQuarantineOffers**](OASDbsApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*OASDbsApi* | [**getCampaignRegion**](OASDbsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*OASDbsApi* | [**getCampaignSettings**](OASDbsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*OASDbsApi* | [**getCampaigns**](OASDbsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*OASDbsApi* | [**getCampaignsByLogin**](OASDbsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*OASDbsApi* | [**getCategoriesMaxSaleQuantum**](OASDbsApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*OASDbsApi* | [**getCategoriesTree**](OASDbsApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*OASDbsApi* | [**getCategoryContentParameters**](OASDbsApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*OASDbsApi* | [**getChatHistory**](OASDbsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*OASDbsApi* | [**getChats**](OASDbsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*OASDbsApi* | [**getDeliveryServices**](OASDbsApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*OASDbsApi* | [**getFeed**](OASDbsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*OASDbsApi* | [**getFeedIndexLogs**](OASDbsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*OASDbsApi* | [**getFeedbackAndCommentUpdates**](OASDbsApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*OASDbsApi* | [**getFeeds**](OASDbsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*OASDbsApi* | [**getGoodsFeedbackComments**](OASDbsApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*OASDbsApi* | [**getGoodsFeedbacks**](OASDbsApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*OASDbsApi* | [**getGoodsStats**](OASDbsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*OASDbsApi* | [**getHiddenOffers**](OASDbsApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*OASDbsApi* | [**getModel**](OASDbsApi.md#getModel) | **GET** /models/{modelId} | Информация об одной модели
*OASDbsApi* | [**getModelOffers**](OASDbsApi.md#getModelOffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*OASDbsApi* | [**getModels**](OASDbsApi.md#getModels) | **POST** /models | Информация о нескольких моделях
*OASDbsApi* | [**getModelsOffers**](OASDbsApi.md#getModelsOffers) | **POST** /models/offers | Список предложений для нескольких моделей
*OASDbsApi* | [**getOfferCardsContentStatus**](OASDbsApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*OASDbsApi* | [**getOfferMappingEntries**](OASDbsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OASDbsApi* | [**getOfferMappings**](OASDbsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*OASDbsApi* | [**getOfferRecommendations**](OASDbsApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OASDbsApi* | [**getOffers**](OASDbsApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OASDbsApi* | [**getOrder**](OASDbsApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OASDbsApi* | [**getOrderBusinessBuyerInfo**](OASDbsApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OASDbsApi* | [**getOrderBusinessDocumentsInfo**](OASDbsApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OASDbsApi* | [**getOrderBuyerInfo**](OASDbsApi.md#getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*OASDbsApi* | [**getOrderLabelsData**](OASDbsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OASDbsApi* | [**getOrders**](OASDbsApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OASDbsApi* | [**getOrdersStats**](OASDbsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OASDbsApi* | [**getOutlet**](OASDbsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*OASDbsApi* | [**getOutletLicenses**](OASDbsApi.md#getOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*OASDbsApi* | [**getOutlets**](OASDbsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*OASDbsApi* | [**getPrices**](OASDbsApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*OASDbsApi* | [**getPricesByOfferIds**](OASDbsApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*OASDbsApi* | [**getPromoOffers**](OASDbsApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*OASDbsApi* | [**getPromos**](OASDbsApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*OASDbsApi* | [**getQualityRatingDetails**](OASDbsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*OASDbsApi* | [**getQualityRatings**](OASDbsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*OASDbsApi* | [**getReportInfo**](OASDbsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*OASDbsApi* | [**getReturn**](OASDbsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*OASDbsApi* | [**getReturnApplication**](OASDbsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*OASDbsApi* | [**getReturnPhoto**](OASDbsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*OASDbsApi* | [**getReturns**](OASDbsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*OASDbsApi* | [**getStocks**](OASDbsApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*OASDbsApi* | [**getSuggestedOfferMappingEntries**](OASDbsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OASDbsApi* | [**getSuggestedOfferMappings**](OASDbsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*OASDbsApi* | [**getSuggestedPrices**](OASDbsApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*OASDbsApi* | [**getWarehouses**](OASDbsApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*OASDbsApi* | [**provideOrderDigitalCodes**](OASDbsApi.md#provideOrderDigitalCodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*OASDbsApi* | [**provideOrderItemIdentifiers**](OASDbsApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OASDbsApi* | [**putBidsForBusiness**](OASDbsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*OASDbsApi* | [**putBidsForCampaign**](OASDbsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*OASDbsApi* | [**refreshFeed**](OASDbsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*OASDbsApi* | [**searchModels**](OASDbsApi.md#searchModels) | **GET** /models | Поиск модели товара
*OASDbsApi* | [**searchRegionChildren**](OASDbsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*OASDbsApi* | [**searchRegionsById**](OASDbsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*OASDbsApi* | [**searchRegionsByName**](OASDbsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*OASDbsApi* | [**sendFileToChat**](OASDbsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*OASDbsApi* | [**sendMessageToChat**](OASDbsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*OASDbsApi* | [**setFeedParams**](OASDbsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*OASDbsApi* | [**setOrderBoxLayout**](OASDbsApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OASDbsApi* | [**setOrderDeliveryDate**](OASDbsApi.md#setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*OASDbsApi* | [**setOrderDeliveryTrackCode**](OASDbsApi.md#setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*OASDbsApi* | [**setOrderShipmentBoxes**](OASDbsApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OASDbsApi* | [**setReturnDecision**](OASDbsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*OASDbsApi* | [**skipGoodsFeedbacksReaction**](OASDbsApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*OASDbsApi* | [**submitReturnDecision**](OASDbsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*OASDbsApi* | [**updateBusinessPrices**](OASDbsApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*OASDbsApi* | [**updateCampaignOffers**](OASDbsApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OASDbsApi* | [**updateGoodsFeedbackComment**](OASDbsApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*OASDbsApi* | [**updateOfferContent**](OASDbsApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*OASDbsApi* | [**updateOfferMappingEntries**](OASDbsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OASDbsApi* | [**updateOfferMappings**](OASDbsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*OASDbsApi* | [**updateOrderItems**](OASDbsApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OASDbsApi* | [**updateOrderStatus**](OASDbsApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OASDbsApi* | [**updateOrderStatuses**](OASDbsApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OASDbsApi* | [**updateOrderStorageLimit**](OASDbsApi.md#updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*OASDbsApi* | [**updateOutlet**](OASDbsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*OASDbsApi* | [**updateOutletLicenses**](OASDbsApi.md#updateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*OASDbsApi* | [**updatePrices**](OASDbsApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*OASDbsApi* | [**updatePromoOffers**](OASDbsApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*OASDbsApi* | [**updateStocks**](OASDbsApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*OASDeliveryServicesApi* | [**getDeliveryServices**](OASDeliveryServicesApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*OASExpressApi* | [**addHiddenOffers**](OASExpressApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*OASExpressApi* | [**addOffersToArchive**](OASExpressApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*OASExpressApi* | [**calculateTariffs**](OASExpressApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*OASExpressApi* | [**confirmBusinessPrices**](OASExpressApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*OASExpressApi* | [**confirmCampaignPrices**](OASExpressApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*OASExpressApi* | [**createChat**](OASExpressApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*OASExpressApi* | [**deleteCampaignOffers**](OASExpressApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OASExpressApi* | [**deleteGoodsFeedbackComment**](OASExpressApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*OASExpressApi* | [**deleteHiddenOffers**](OASExpressApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*OASExpressApi* | [**deleteOffers**](OASExpressApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*OASExpressApi* | [**deleteOffersFromArchive**](OASExpressApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*OASExpressApi* | [**deletePromoOffers**](OASExpressApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*OASExpressApi* | [**generateBoostConsolidatedReport**](OASExpressApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*OASExpressApi* | [**generateCompetitorsPositionReport**](OASExpressApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*OASExpressApi* | [**generateGoodsFeedbackReport**](OASExpressApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*OASExpressApi* | [**generateGoodsRealizationReport**](OASExpressApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*OASExpressApi* | [**generateMassOrderLabelsReport**](OASExpressApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*OASExpressApi* | [**generateOrderLabel**](OASExpressApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OASExpressApi* | [**generateOrderLabels**](OASExpressApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OASExpressApi* | [**generatePricesReport**](OASExpressApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*OASExpressApi* | [**generateShelfsStatisticsReport**](OASExpressApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*OASExpressApi* | [**generateShowsSalesReport**](OASExpressApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*OASExpressApi* | [**generateStocksOnWarehousesReport**](OASExpressApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*OASExpressApi* | [**generateUnitedMarketplaceServicesReport**](OASExpressApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*OASExpressApi* | [**generateUnitedNettingReport**](OASExpressApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*OASExpressApi* | [**generateUnitedOrdersReport**](OASExpressApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*OASExpressApi* | [**getAllOffers**](OASExpressApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OASExpressApi* | [**getBidsInfoForBusiness**](OASExpressApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*OASExpressApi* | [**getBidsRecommendations**](OASExpressApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*OASExpressApi* | [**getBusinessQuarantineOffers**](OASExpressApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*OASExpressApi* | [**getBusinessSettings**](OASExpressApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*OASExpressApi* | [**getCampaign**](OASExpressApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*OASExpressApi* | [**getCampaignLogins**](OASExpressApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*OASExpressApi* | [**getCampaignOffers**](OASExpressApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OASExpressApi* | [**getCampaignQuarantineOffers**](OASExpressApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*OASExpressApi* | [**getCampaignRegion**](OASExpressApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*OASExpressApi* | [**getCampaignSettings**](OASExpressApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*OASExpressApi* | [**getCampaigns**](OASExpressApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*OASExpressApi* | [**getCampaignsByLogin**](OASExpressApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*OASExpressApi* | [**getCategoriesMaxSaleQuantum**](OASExpressApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*OASExpressApi* | [**getCategoriesTree**](OASExpressApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*OASExpressApi* | [**getCategoryContentParameters**](OASExpressApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*OASExpressApi* | [**getChatHistory**](OASExpressApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*OASExpressApi* | [**getChats**](OASExpressApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*OASExpressApi* | [**getDeliveryServices**](OASExpressApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*OASExpressApi* | [**getFeed**](OASExpressApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*OASExpressApi* | [**getFeedIndexLogs**](OASExpressApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*OASExpressApi* | [**getFeedbackAndCommentUpdates**](OASExpressApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*OASExpressApi* | [**getFeeds**](OASExpressApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*OASExpressApi* | [**getGoodsFeedbackComments**](OASExpressApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*OASExpressApi* | [**getGoodsFeedbacks**](OASExpressApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*OASExpressApi* | [**getGoodsStats**](OASExpressApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*OASExpressApi* | [**getHiddenOffers**](OASExpressApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*OASExpressApi* | [**getOfferCardsContentStatus**](OASExpressApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*OASExpressApi* | [**getOfferMappingEntries**](OASExpressApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OASExpressApi* | [**getOfferMappings**](OASExpressApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*OASExpressApi* | [**getOfferRecommendations**](OASExpressApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OASExpressApi* | [**getOffers**](OASExpressApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OASExpressApi* | [**getOrder**](OASExpressApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OASExpressApi* | [**getOrderBusinessBuyerInfo**](OASExpressApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OASExpressApi* | [**getOrderBusinessDocumentsInfo**](OASExpressApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OASExpressApi* | [**getOrderLabelsData**](OASExpressApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OASExpressApi* | [**getOrders**](OASExpressApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OASExpressApi* | [**getOrdersStats**](OASExpressApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OASExpressApi* | [**getPrices**](OASExpressApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*OASExpressApi* | [**getPricesByOfferIds**](OASExpressApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*OASExpressApi* | [**getPromoOffers**](OASExpressApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*OASExpressApi* | [**getPromos**](OASExpressApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*OASExpressApi* | [**getQualityRatingDetails**](OASExpressApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*OASExpressApi* | [**getQualityRatings**](OASExpressApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*OASExpressApi* | [**getReportInfo**](OASExpressApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*OASExpressApi* | [**getReturn**](OASExpressApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*OASExpressApi* | [**getReturnApplication**](OASExpressApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*OASExpressApi* | [**getReturnPhoto**](OASExpressApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*OASExpressApi* | [**getReturns**](OASExpressApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*OASExpressApi* | [**getStocks**](OASExpressApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*OASExpressApi* | [**getSuggestedOfferMappingEntries**](OASExpressApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OASExpressApi* | [**getSuggestedOfferMappings**](OASExpressApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*OASExpressApi* | [**getSuggestedPrices**](OASExpressApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*OASExpressApi* | [**getWarehouses**](OASExpressApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*OASExpressApi* | [**provideOrderItemIdentifiers**](OASExpressApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OASExpressApi* | [**putBidsForBusiness**](OASExpressApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*OASExpressApi* | [**putBidsForCampaign**](OASExpressApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*OASExpressApi* | [**refreshFeed**](OASExpressApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*OASExpressApi* | [**searchRegionChildren**](OASExpressApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*OASExpressApi* | [**searchRegionsById**](OASExpressApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*OASExpressApi* | [**searchRegionsByName**](OASExpressApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*OASExpressApi* | [**sendFileToChat**](OASExpressApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*OASExpressApi* | [**sendMessageToChat**](OASExpressApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*OASExpressApi* | [**setFeedParams**](OASExpressApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*OASExpressApi* | [**setOrderBoxLayout**](OASExpressApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OASExpressApi* | [**setOrderShipmentBoxes**](OASExpressApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OASExpressApi* | [**skipGoodsFeedbacksReaction**](OASExpressApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*OASExpressApi* | [**updateBusinessPrices**](OASExpressApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*OASExpressApi* | [**updateCampaignOffers**](OASExpressApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OASExpressApi* | [**updateGoodsFeedbackComment**](OASExpressApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*OASExpressApi* | [**updateOfferContent**](OASExpressApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*OASExpressApi* | [**updateOfferMappingEntries**](OASExpressApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OASExpressApi* | [**updateOfferMappings**](OASExpressApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*OASExpressApi* | [**updateOrderItems**](OASExpressApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OASExpressApi* | [**updateOrderStatus**](OASExpressApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OASExpressApi* | [**updateOrderStatuses**](OASExpressApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OASExpressApi* | [**updatePrices**](OASExpressApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*OASExpressApi* | [**updatePromoOffers**](OASExpressApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*OASExpressApi* | [**updateStocks**](OASExpressApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*OASExpressApi* | [**verifyOrderEac**](OASExpressApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*OASFbsApi* | [**addHiddenOffers**](OASFbsApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*OASFbsApi* | [**addOffersToArchive**](OASFbsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*OASFbsApi* | [**calculateTariffs**](OASFbsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*OASFbsApi* | [**confirmBusinessPrices**](OASFbsApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*OASFbsApi* | [**confirmCampaignPrices**](OASFbsApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*OASFbsApi* | [**confirmShipment**](OASFbsApi.md#confirmShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*OASFbsApi* | [**createChat**](OASFbsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*OASFbsApi* | [**deleteCampaignOffers**](OASFbsApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OASFbsApi* | [**deleteGoodsFeedbackComment**](OASFbsApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*OASFbsApi* | [**deleteHiddenOffers**](OASFbsApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*OASFbsApi* | [**deleteOffers**](OASFbsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*OASFbsApi* | [**deleteOffersFromArchive**](OASFbsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*OASFbsApi* | [**deletePromoOffers**](OASFbsApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*OASFbsApi* | [**downloadShipmentAct**](OASFbsApi.md#downloadShipmentAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*OASFbsApi* | [**downloadShipmentDiscrepancyAct**](OASFbsApi.md#downloadShipmentDiscrepancyAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*OASFbsApi* | [**downloadShipmentInboundAct**](OASFbsApi.md#downloadShipmentInboundAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*OASFbsApi* | [**downloadShipmentPalletLabels**](OASFbsApi.md#downloadShipmentPalletLabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*OASFbsApi* | [**downloadShipmentReceptionTransferAct**](OASFbsApi.md#downloadShipmentReceptionTransferAct) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*OASFbsApi* | [**downloadShipmentTransportationWaybill**](OASFbsApi.md#downloadShipmentTransportationWaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*OASFbsApi* | [**generateBoostConsolidatedReport**](OASFbsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*OASFbsApi* | [**generateCompetitorsPositionReport**](OASFbsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*OASFbsApi* | [**generateGoodsFeedbackReport**](OASFbsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*OASFbsApi* | [**generateGoodsRealizationReport**](OASFbsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*OASFbsApi* | [**generateMassOrderLabelsReport**](OASFbsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*OASFbsApi* | [**generateOrderLabel**](OASFbsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OASFbsApi* | [**generateOrderLabels**](OASFbsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OASFbsApi* | [**generatePricesReport**](OASFbsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*OASFbsApi* | [**generateShelfsStatisticsReport**](OASFbsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*OASFbsApi* | [**generateShipmentListDocumentReport**](OASFbsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*OASFbsApi* | [**generateShowsSalesReport**](OASFbsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*OASFbsApi* | [**generateStocksOnWarehousesReport**](OASFbsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*OASFbsApi* | [**generateUnitedMarketplaceServicesReport**](OASFbsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*OASFbsApi* | [**generateUnitedNettingReport**](OASFbsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*OASFbsApi* | [**generateUnitedOrdersReport**](OASFbsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*OASFbsApi* | [**getAllOffers**](OASFbsApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OASFbsApi* | [**getBidsInfoForBusiness**](OASFbsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*OASFbsApi* | [**getBidsRecommendations**](OASFbsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*OASFbsApi* | [**getBusinessQuarantineOffers**](OASFbsApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*OASFbsApi* | [**getBusinessSettings**](OASFbsApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*OASFbsApi* | [**getCampaign**](OASFbsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*OASFbsApi* | [**getCampaignLogins**](OASFbsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*OASFbsApi* | [**getCampaignOffers**](OASFbsApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OASFbsApi* | [**getCampaignQuarantineOffers**](OASFbsApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*OASFbsApi* | [**getCampaignRegion**](OASFbsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*OASFbsApi* | [**getCampaignSettings**](OASFbsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*OASFbsApi* | [**getCampaigns**](OASFbsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*OASFbsApi* | [**getCampaignsByLogin**](OASFbsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*OASFbsApi* | [**getCategoriesMaxSaleQuantum**](OASFbsApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*OASFbsApi* | [**getCategoriesTree**](OASFbsApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*OASFbsApi* | [**getCategoryContentParameters**](OASFbsApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*OASFbsApi* | [**getChatHistory**](OASFbsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*OASFbsApi* | [**getChats**](OASFbsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*OASFbsApi* | [**getDeliveryServices**](OASFbsApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*OASFbsApi* | [**getFeed**](OASFbsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*OASFbsApi* | [**getFeedIndexLogs**](OASFbsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*OASFbsApi* | [**getFeedbackAndCommentUpdates**](OASFbsApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*OASFbsApi* | [**getFeeds**](OASFbsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*OASFbsApi* | [**getGoodsFeedbackComments**](OASFbsApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*OASFbsApi* | [**getGoodsFeedbacks**](OASFbsApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*OASFbsApi* | [**getGoodsStats**](OASFbsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*OASFbsApi* | [**getHiddenOffers**](OASFbsApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*OASFbsApi* | [**getOfferCardsContentStatus**](OASFbsApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*OASFbsApi* | [**getOfferMappingEntries**](OASFbsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OASFbsApi* | [**getOfferMappings**](OASFbsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*OASFbsApi* | [**getOfferRecommendations**](OASFbsApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OASFbsApi* | [**getOffers**](OASFbsApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OASFbsApi* | [**getOrder**](OASFbsApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OASFbsApi* | [**getOrderBusinessBuyerInfo**](OASFbsApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OASFbsApi* | [**getOrderBusinessDocumentsInfo**](OASFbsApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OASFbsApi* | [**getOrderLabelsData**](OASFbsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OASFbsApi* | [**getOrders**](OASFbsApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OASFbsApi* | [**getOrdersStats**](OASFbsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OASFbsApi* | [**getPrices**](OASFbsApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*OASFbsApi* | [**getPricesByOfferIds**](OASFbsApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*OASFbsApi* | [**getPromoOffers**](OASFbsApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*OASFbsApi* | [**getPromos**](OASFbsApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*OASFbsApi* | [**getQualityRatingDetails**](OASFbsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*OASFbsApi* | [**getQualityRatings**](OASFbsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*OASFbsApi* | [**getReportInfo**](OASFbsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*OASFbsApi* | [**getReturn**](OASFbsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*OASFbsApi* | [**getReturnApplication**](OASFbsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*OASFbsApi* | [**getReturnPhoto**](OASFbsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*OASFbsApi* | [**getReturns**](OASFbsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*OASFbsApi* | [**getShipment**](OASFbsApi.md#getShipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*OASFbsApi* | [**getShipmentOrdersInfo**](OASFbsApi.md#getShipmentOrdersInfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*OASFbsApi* | [**getStocks**](OASFbsApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*OASFbsApi* | [**getSuggestedOfferMappingEntries**](OASFbsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OASFbsApi* | [**getSuggestedOfferMappings**](OASFbsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*OASFbsApi* | [**getSuggestedPrices**](OASFbsApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*OASFbsApi* | [**getWarehouses**](OASFbsApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*OASFbsApi* | [**provideOrderItemIdentifiers**](OASFbsApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OASFbsApi* | [**putBidsForBusiness**](OASFbsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*OASFbsApi* | [**putBidsForCampaign**](OASFbsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*OASFbsApi* | [**refreshFeed**](OASFbsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*OASFbsApi* | [**searchRegionChildren**](OASFbsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*OASFbsApi* | [**searchRegionsById**](OASFbsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*OASFbsApi* | [**searchRegionsByName**](OASFbsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*OASFbsApi* | [**searchShipments**](OASFbsApi.md#searchShipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*OASFbsApi* | [**sendFileToChat**](OASFbsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*OASFbsApi* | [**sendMessageToChat**](OASFbsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*OASFbsApi* | [**setFeedParams**](OASFbsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*OASFbsApi* | [**setOrderBoxLayout**](OASFbsApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OASFbsApi* | [**setOrderShipmentBoxes**](OASFbsApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OASFbsApi* | [**setShipmentPalletsCount**](OASFbsApi.md#setShipmentPalletsCount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*OASFbsApi* | [**skipGoodsFeedbacksReaction**](OASFbsApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*OASFbsApi* | [**transferOrdersFromShipment**](OASFbsApi.md#transferOrdersFromShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*OASFbsApi* | [**updateBusinessPrices**](OASFbsApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*OASFbsApi* | [**updateCampaignOffers**](OASFbsApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OASFbsApi* | [**updateGoodsFeedbackComment**](OASFbsApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*OASFbsApi* | [**updateOfferContent**](OASFbsApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*OASFbsApi* | [**updateOfferMappingEntries**](OASFbsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OASFbsApi* | [**updateOfferMappings**](OASFbsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*OASFbsApi* | [**updateOrderItems**](OASFbsApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OASFbsApi* | [**updateOrderStatus**](OASFbsApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OASFbsApi* | [**updateOrderStatuses**](OASFbsApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OASFbsApi* | [**updatePrices**](OASFbsApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*OASFbsApi* | [**updatePromoOffers**](OASFbsApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*OASFbsApi* | [**updateStocks**](OASFbsApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*OASFbyApi* | [**addHiddenOffers**](OASFbyApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*OASFbyApi* | [**addOffersToArchive**](OASFbyApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*OASFbyApi* | [**calculateTariffs**](OASFbyApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*OASFbyApi* | [**confirmBusinessPrices**](OASFbyApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*OASFbyApi* | [**confirmCampaignPrices**](OASFbyApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*OASFbyApi* | [**createChat**](OASFbyApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*OASFbyApi* | [**deleteCampaignOffers**](OASFbyApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OASFbyApi* | [**deleteGoodsFeedbackComment**](OASFbyApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*OASFbyApi* | [**deleteHiddenOffers**](OASFbyApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*OASFbyApi* | [**deleteOffers**](OASFbyApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*OASFbyApi* | [**deleteOffersFromArchive**](OASFbyApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*OASFbyApi* | [**deletePromoOffers**](OASFbyApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*OASFbyApi* | [**generateBoostConsolidatedReport**](OASFbyApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*OASFbyApi* | [**generateCompetitorsPositionReport**](OASFbyApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*OASFbyApi* | [**generateGoodsFeedbackReport**](OASFbyApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*OASFbyApi* | [**generateGoodsMovementReport**](OASFbyApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*OASFbyApi* | [**generateGoodsRealizationReport**](OASFbyApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*OASFbyApi* | [**generateGoodsTurnoverReport**](OASFbyApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*OASFbyApi* | [**generatePricesReport**](OASFbyApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*OASFbyApi* | [**generateShelfsStatisticsReport**](OASFbyApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*OASFbyApi* | [**generateShowsSalesReport**](OASFbyApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*OASFbyApi* | [**generateStocksOnWarehousesReport**](OASFbyApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*OASFbyApi* | [**generateUnitedMarketplaceServicesReport**](OASFbyApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*OASFbyApi* | [**generateUnitedNettingReport**](OASFbyApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*OASFbyApi* | [**generateUnitedOrdersReport**](OASFbyApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*OASFbyApi* | [**getAllOffers**](OASFbyApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OASFbyApi* | [**getBidsInfoForBusiness**](OASFbyApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*OASFbyApi* | [**getBidsRecommendations**](OASFbyApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*OASFbyApi* | [**getBusinessQuarantineOffers**](OASFbyApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*OASFbyApi* | [**getBusinessSettings**](OASFbyApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*OASFbyApi* | [**getCampaign**](OASFbyApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*OASFbyApi* | [**getCampaignLogins**](OASFbyApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*OASFbyApi* | [**getCampaignOffers**](OASFbyApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OASFbyApi* | [**getCampaignQuarantineOffers**](OASFbyApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*OASFbyApi* | [**getCampaignRegion**](OASFbyApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*OASFbyApi* | [**getCampaignSettings**](OASFbyApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*OASFbyApi* | [**getCampaigns**](OASFbyApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*OASFbyApi* | [**getCampaignsByLogin**](OASFbyApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*OASFbyApi* | [**getCategoriesMaxSaleQuantum**](OASFbyApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*OASFbyApi* | [**getCategoriesTree**](OASFbyApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*OASFbyApi* | [**getCategoryContentParameters**](OASFbyApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*OASFbyApi* | [**getChatHistory**](OASFbyApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*OASFbyApi* | [**getChats**](OASFbyApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*OASFbyApi* | [**getFeed**](OASFbyApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*OASFbyApi* | [**getFeedIndexLogs**](OASFbyApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*OASFbyApi* | [**getFeedbackAndCommentUpdates**](OASFbyApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*OASFbyApi* | [**getFeeds**](OASFbyApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*OASFbyApi* | [**getFulfillmentWarehouses**](OASFbyApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*OASFbyApi* | [**getGoodsFeedbackComments**](OASFbyApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*OASFbyApi* | [**getGoodsFeedbacks**](OASFbyApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*OASFbyApi* | [**getGoodsStats**](OASFbyApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*OASFbyApi* | [**getHiddenOffers**](OASFbyApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*OASFbyApi* | [**getOfferCardsContentStatus**](OASFbyApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*OASFbyApi* | [**getOfferMappingEntries**](OASFbyApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OASFbyApi* | [**getOfferMappings**](OASFbyApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*OASFbyApi* | [**getOfferRecommendations**](OASFbyApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OASFbyApi* | [**getOffers**](OASFbyApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OASFbyApi* | [**getOrder**](OASFbyApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OASFbyApi* | [**getOrderBusinessBuyerInfo**](OASFbyApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OASFbyApi* | [**getOrderBusinessDocumentsInfo**](OASFbyApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OASFbyApi* | [**getOrders**](OASFbyApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OASFbyApi* | [**getOrdersStats**](OASFbyApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OASFbyApi* | [**getPrices**](OASFbyApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*OASFbyApi* | [**getPricesByOfferIds**](OASFbyApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*OASFbyApi* | [**getPromoOffers**](OASFbyApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*OASFbyApi* | [**getPromos**](OASFbyApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*OASFbyApi* | [**getQualityRatings**](OASFbyApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*OASFbyApi* | [**getReportInfo**](OASFbyApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*OASFbyApi* | [**getReturn**](OASFbyApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*OASFbyApi* | [**getReturnPhoto**](OASFbyApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*OASFbyApi* | [**getReturns**](OASFbyApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*OASFbyApi* | [**getStocks**](OASFbyApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*OASFbyApi* | [**getSuggestedOfferMappingEntries**](OASFbyApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OASFbyApi* | [**getSuggestedOfferMappings**](OASFbyApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*OASFbyApi* | [**getSuggestedPrices**](OASFbyApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*OASFbyApi* | [**putBidsForBusiness**](OASFbyApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*OASFbyApi* | [**putBidsForCampaign**](OASFbyApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*OASFbyApi* | [**refreshFeed**](OASFbyApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*OASFbyApi* | [**searchRegionChildren**](OASFbyApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*OASFbyApi* | [**searchRegionsById**](OASFbyApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*OASFbyApi* | [**searchRegionsByName**](OASFbyApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*OASFbyApi* | [**sendFileToChat**](OASFbyApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*OASFbyApi* | [**sendMessageToChat**](OASFbyApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*OASFbyApi* | [**setFeedParams**](OASFbyApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*OASFbyApi* | [**skipGoodsFeedbacksReaction**](OASFbyApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*OASFbyApi* | [**updateBusinessPrices**](OASFbyApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*OASFbyApi* | [**updateCampaignOffers**](OASFbyApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OASFbyApi* | [**updateGoodsFeedbackComment**](OASFbyApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*OASFbyApi* | [**updateOfferContent**](OASFbyApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*OASFbyApi* | [**updateOfferMappingEntries**](OASFbyApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OASFbyApi* | [**updateOfferMappings**](OASFbyApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*OASFbyApi* | [**updatePrices**](OASFbyApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*OASFbyApi* | [**updatePromoOffers**](OASFbyApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*OASFeedbacksApi* | [**getFeedbackAndCommentUpdates**](OASFeedbacksApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*OASFeedsApi* | [**getFeed**](OASFeedsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*OASFeedsApi* | [**getFeedIndexLogs**](OASFeedsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*OASFeedsApi* | [**getFeeds**](OASFeedsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*OASFeedsApi* | [**refreshFeed**](OASFeedsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*OASFeedsApi* | [**setFeedParams**](OASFeedsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*OASGoodsFeedbackApi* | [**deleteGoodsFeedbackComment**](OASGoodsFeedbackApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*OASGoodsFeedbackApi* | [**getGoodsFeedbackComments**](OASGoodsFeedbackApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*OASGoodsFeedbackApi* | [**getGoodsFeedbacks**](OASGoodsFeedbackApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*OASGoodsFeedbackApi* | [**skipGoodsFeedbacksReaction**](OASGoodsFeedbackApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*OASGoodsFeedbackApi* | [**updateGoodsFeedbackComment**](OASGoodsFeedbackApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*OASGoodsStatsApi* | [**getGoodsStats**](OASGoodsStatsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*OASHiddenOffersApi* | [**addHiddenOffers**](OASHiddenOffersApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*OASHiddenOffersApi* | [**deleteHiddenOffers**](OASHiddenOffersApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*OASHiddenOffersApi* | [**getHiddenOffers**](OASHiddenOffersApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*OASModelsApi* | [**getModel**](OASModelsApi.md#getModel) | **GET** /models/{modelId} | Информация об одной модели
*OASModelsApi* | [**getModelOffers**](OASModelsApi.md#getModelOffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*OASModelsApi* | [**getModels**](OASModelsApi.md#getModels) | **POST** /models | Информация о нескольких моделях
*OASModelsApi* | [**getModelsOffers**](OASModelsApi.md#getModelsOffers) | **POST** /models/offers | Список предложений для нескольких моделей
*OASModelsApi* | [**searchModels**](OASModelsApi.md#searchModels) | **GET** /models | Поиск модели товара
*OASOfferMappingsApi* | [**getOfferMappingEntries**](OASOfferMappingsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OASOfferMappingsApi* | [**getSuggestedOfferMappingEntries**](OASOfferMappingsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OASOfferMappingsApi* | [**updateOfferMappingEntries**](OASOfferMappingsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OASOffersApi* | [**deleteCampaignOffers**](OASOffersApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OASOffersApi* | [**getAllOffers**](OASOffersApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OASOffersApi* | [**getCampaignOffers**](OASOffersApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OASOffersApi* | [**getOfferRecommendations**](OASOffersApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OASOffersApi* | [**getOffers**](OASOffersApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OASOffersApi* | [**updateCampaignOffers**](OASOffersApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OASOrderBusinessInformationApi* | [**getOrderBusinessBuyerInfo**](OASOrderBusinessInformationApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OASOrderBusinessInformationApi* | [**getOrderBusinessDocumentsInfo**](OASOrderBusinessInformationApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OASOrderDeliveryApi* | [**getOrderBuyerInfo**](OASOrderDeliveryApi.md#getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*OASOrderDeliveryApi* | [**setOrderDeliveryDate**](OASOrderDeliveryApi.md#setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*OASOrderDeliveryApi* | [**setOrderDeliveryTrackCode**](OASOrderDeliveryApi.md#setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*OASOrderDeliveryApi* | [**updateOrderStorageLimit**](OASOrderDeliveryApi.md#updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*OASOrderDeliveryApi* | [**verifyOrderEac**](OASOrderDeliveryApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*OASOrderLabelsApi* | [**generateOrderLabel**](OASOrderLabelsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OASOrderLabelsApi* | [**generateOrderLabels**](OASOrderLabelsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OASOrderLabelsApi* | [**getOrderLabelsData**](OASOrderLabelsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OASOrdersApi* | [**acceptOrderCancellation**](OASOrdersApi.md#acceptOrderCancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*OASOrdersApi* | [**getOrder**](OASOrdersApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OASOrdersApi* | [**getOrders**](OASOrdersApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OASOrdersApi* | [**provideOrderDigitalCodes**](OASOrdersApi.md#provideOrderDigitalCodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*OASOrdersApi* | [**provideOrderItemIdentifiers**](OASOrdersApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OASOrdersApi* | [**setOrderBoxLayout**](OASOrdersApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OASOrdersApi* | [**setOrderShipmentBoxes**](OASOrdersApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OASOrdersApi* | [**updateOrderItems**](OASOrdersApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OASOrdersApi* | [**updateOrderStatus**](OASOrdersApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OASOrdersApi* | [**updateOrderStatuses**](OASOrdersApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OASOrdersStatsApi* | [**getOrdersStats**](OASOrdersStatsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OASOutletLicensesApi* | [**deleteOutletLicenses**](OASOutletLicensesApi.md#deleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*OASOutletLicensesApi* | [**getOutletLicenses**](OASOutletLicensesApi.md#getOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*OASOutletLicensesApi* | [**updateOutletLicenses**](OASOutletLicensesApi.md#updateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*OASOutletsApi* | [**createOutlet**](OASOutletsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*OASOutletsApi* | [**deleteOutlet**](OASOutletsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*OASOutletsApi* | [**getOutlet**](OASOutletsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*OASOutletsApi* | [**getOutlets**](OASOutletsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*OASOutletsApi* | [**updateOutlet**](OASOutletsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*OASPriceQuarantineApi* | [**confirmBusinessPrices**](OASPriceQuarantineApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*OASPriceQuarantineApi* | [**confirmCampaignPrices**](OASPriceQuarantineApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*OASPriceQuarantineApi* | [**getBusinessQuarantineOffers**](OASPriceQuarantineApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*OASPriceQuarantineApi* | [**getCampaignQuarantineOffers**](OASPriceQuarantineApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*OASPricesApi* | [**getPrices**](OASPricesApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*OASPricesApi* | [**getPricesByOfferIds**](OASPricesApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*OASPricesApi* | [**getSuggestedPrices**](OASPricesApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*OASPricesApi* | [**updateBusinessPrices**](OASPricesApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*OASPricesApi* | [**updatePrices**](OASPricesApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*OASPromosApi* | [**deletePromoOffers**](OASPromosApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*OASPromosApi* | [**getPromoOffers**](OASPromosApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*OASPromosApi* | [**getPromos**](OASPromosApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*OASPromosApi* | [**updatePromoOffers**](OASPromosApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*OASRatingsApi* | [**getQualityRatingDetails**](OASRatingsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*OASRatingsApi* | [**getQualityRatings**](OASRatingsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*OASRegionsApi* | [**searchRegionChildren**](OASRegionsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*OASRegionsApi* | [**searchRegionsById**](OASRegionsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*OASRegionsApi* | [**searchRegionsByName**](OASRegionsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*OASReportsApi* | [**generateBoostConsolidatedReport**](OASReportsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*OASReportsApi* | [**generateCompetitorsPositionReport**](OASReportsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*OASReportsApi* | [**generateGoodsFeedbackReport**](OASReportsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*OASReportsApi* | [**generateGoodsMovementReport**](OASReportsApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*OASReportsApi* | [**generateGoodsRealizationReport**](OASReportsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*OASReportsApi* | [**generateGoodsTurnoverReport**](OASReportsApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*OASReportsApi* | [**generateMassOrderLabelsReport**](OASReportsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*OASReportsApi* | [**generatePricesReport**](OASReportsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*OASReportsApi* | [**generateShelfsStatisticsReport**](OASReportsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*OASReportsApi* | [**generateShipmentListDocumentReport**](OASReportsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*OASReportsApi* | [**generateShowsSalesReport**](OASReportsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*OASReportsApi* | [**generateStocksOnWarehousesReport**](OASReportsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*OASReportsApi* | [**generateUnitedMarketplaceServicesReport**](OASReportsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*OASReportsApi* | [**generateUnitedNettingReport**](OASReportsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*OASReportsApi* | [**generateUnitedOrdersReport**](OASReportsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*OASReportsApi* | [**getReportInfo**](OASReportsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*OASReturnsApi* | [**getReturn**](OASReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*OASReturnsApi* | [**getReturnApplication**](OASReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*OASReturnsApi* | [**getReturnPhoto**](OASReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*OASReturnsApi* | [**getReturns**](OASReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*OASReturnsApi* | [**setReturnDecision**](OASReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*OASReturnsApi* | [**submitReturnDecision**](OASReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*OASShipmentsApi* | [**confirmShipment**](OASShipmentsApi.md#confirmShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*OASShipmentsApi* | [**downloadShipmentAct**](OASShipmentsApi.md#downloadShipmentAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*OASShipmentsApi* | [**downloadShipmentDiscrepancyAct**](OASShipmentsApi.md#downloadShipmentDiscrepancyAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*OASShipmentsApi* | [**downloadShipmentInboundAct**](OASShipmentsApi.md#downloadShipmentInboundAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*OASShipmentsApi* | [**downloadShipmentPalletLabels**](OASShipmentsApi.md#downloadShipmentPalletLabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*OASShipmentsApi* | [**downloadShipmentReceptionTransferAct**](OASShipmentsApi.md#downloadShipmentReceptionTransferAct) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*OASShipmentsApi* | [**downloadShipmentTransportationWaybill**](OASShipmentsApi.md#downloadShipmentTransportationWaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*OASShipmentsApi* | [**getShipment**](OASShipmentsApi.md#getShipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*OASShipmentsApi* | [**getShipmentOrdersInfo**](OASShipmentsApi.md#getShipmentOrdersInfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*OASShipmentsApi* | [**searchShipments**](OASShipmentsApi.md#searchShipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*OASShipmentsApi* | [**setShipmentPalletsCount**](OASShipmentsApi.md#setShipmentPalletsCount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*OASShipmentsApi* | [**transferOrdersFromShipment**](OASShipmentsApi.md#transferOrdersFromShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*OASStocksApi* | [**getStocks**](OASStocksApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*OASStocksApi* | [**updateStocks**](OASStocksApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*OASTariffsApi* | [**calculateTariffs**](OASTariffsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*OASWarehousesApi* | [**getFulfillmentWarehouses**](OASWarehousesApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*OASWarehousesApi* | [**getWarehouses**](OASWarehousesApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


## Documentation for Models

 - [OASAcceptOrderCancellationRequest](OASAcceptOrderCancellationRequest.md)
 - [OASAddHiddenOffersRequest](OASAddHiddenOffersRequest.md)
 - [OASAddOffersToArchiveDTO](OASAddOffersToArchiveDTO.md)
 - [OASAddOffersToArchiveErrorDTO](OASAddOffersToArchiveErrorDTO.md)
 - [OASAddOffersToArchiveErrorType](OASAddOffersToArchiveErrorType.md)
 - [OASAddOffersToArchiveRequest](OASAddOffersToArchiveRequest.md)
 - [OASAddOffersToArchiveResponse](OASAddOffersToArchiveResponse.md)
 - [OASAffectedOrderQualityRatingCompone](OASAffectedOrderQualityRatingCompone.md)
 - [OASAgeDTO](OASAgeDTO.md)
 - [OASAgeUnitType](OASAgeUnitType.md)
 - [OASApiClientDataErrorResponse](OASApiClientDataErrorResponse.md)
 - [OASApiErrorDTO](OASApiErrorDTO.md)
 - [OASApiErrorResponse](OASApiErrorResponse.md)
 - [OASApiForbiddenErrorResponse](OASApiForbiddenErrorResponse.md)
 - [OASApiLimitErrorResponse](OASApiLimitErrorResponse.md)
 - [OASApiLockedErrorResponse](OASApiLockedErrorResponse.md)
 - [OASApiNotFoundErrorResponse](OASApiNotFoundErrorResponse.md)
 - [OASApiResponse](OASApiResponse.md)
 - [OASApiResponseStatusType](OASApiResponseStatusType.md)
 - [OASApiServerErrorResponse](OASApiServerErrorResponse.md)
 - [OASApiUnauthorizedErrorResponse](OASApiUnauthorizedErrorResponse.md)
 - [OASBaseCampaignOfferDTO](OASBaseCampaignOfferDTO.md)
 - [OASBaseOfferDTO](OASBaseOfferDTO.md)
 - [OASBasePriceDTO](OASBasePriceDTO.md)
 - [OASBaseShipmentDTO](OASBaseShipmentDTO.md)
 - [OASBidRecommendationItemDTO](OASBidRecommendationItemDTO.md)
 - [OASBriefOrderItemDTO](OASBriefOrderItemDTO.md)
 - [OASBriefOrderItemInstanceDTO](OASBriefOrderItemInstanceDTO.md)
 - [OASBusinessDTO](OASBusinessDTO.md)
 - [OASBusinessSettingsDTO](OASBusinessSettingsDTO.md)
 - [OASCalculateTariffsOfferDTO](OASCalculateTariffsOfferDTO.md)
 - [OASCalculateTariffsOfferInfoDTO](OASCalculateTariffsOfferInfoDTO.md)
 - [OASCalculateTariffsParametersDTO](OASCalculateTariffsParametersDTO.md)
 - [OASCalculateTariffsRequest](OASCalculateTariffsRequest.md)
 - [OASCalculateTariffsResponse](OASCalculateTariffsResponse.md)
 - [OASCalculateTariffsResponseDTO](OASCalculateTariffsResponseDTO.md)
 - [OASCalculatedTariffDTO](OASCalculatedTariffDTO.md)
 - [OASCalculatedTariffType](OASCalculatedTariffType.md)
 - [OASCampaignDTO](OASCampaignDTO.md)
 - [OASCampaignQualityRatingDTO](OASCampaignQualityRatingDTO.md)
 - [OASCampaignSettingsDTO](OASCampaignSettingsDTO.md)
 - [OASCampaignSettingsDeliveryDTO](OASCampaignSettingsDeliveryDTO.md)
 - [OASCampaignSettingsLocalRegionDTO](OASCampaignSettingsLocalRegionDTO.md)
 - [OASCampaignSettingsScheduleDTO](OASCampaignSettingsScheduleDTO.md)
 - [OASCampaignSettingsScheduleSourceTyp](OASCampaignSettingsScheduleSourceTyp.md)
 - [OASCampaignSettingsTimePeriodDTO](OASCampaignSettingsTimePeriodDTO.md)
 - [OASCampaignsQualityRatingDTO](OASCampaignsQualityRatingDTO.md)
 - [OASCategoryContentParametersDTO](OASCategoryContentParametersDTO.md)
 - [OASCategoryDTO](OASCategoryDTO.md)
 - [OASCategoryErrorDTO](OASCategoryErrorDTO.md)
 - [OASCategoryErrorType](OASCategoryErrorType.md)
 - [OASCategoryParameterDTO](OASCategoryParameterDTO.md)
 - [OASCategoryParameterUnitDTO](OASCategoryParameterUnitDTO.md)
 - [OASChangeOutletRequest](OASChangeOutletRequest.md)
 - [OASChannelType](OASChannelType.md)
 - [OASChatMessageDTO](OASChatMessageDTO.md)
 - [OASChatMessagePayloadDTO](OASChatMessagePayloadDTO.md)
 - [OASChatMessageSenderType](OASChatMessageSenderType.md)
 - [OASChatMessagesResultDTO](OASChatMessagesResultDTO.md)
 - [OASChatStatusType](OASChatStatusType.md)
 - [OASChatType](OASChatType.md)
 - [OASConfirmPricesRequest](OASConfirmPricesRequest.md)
 - [OASConfirmShipmentRequest](OASConfirmShipmentRequest.md)
 - [OASCreateChatRequest](OASCreateChatRequest.md)
 - [OASCreateChatResponse](OASCreateChatResponse.md)
 - [OASCreateChatResultDTO](OASCreateChatResultDTO.md)
 - [OASCreateOutletResponse](OASCreateOutletResponse.md)
 - [OASCurrencyType](OASCurrencyType.md)
 - [OASDayOfWeekType](OASDayOfWeekType.md)
 - [OASDeleteCampaignOffersDTO](OASDeleteCampaignOffersDTO.md)
 - [OASDeleteCampaignOffersRequest](OASDeleteCampaignOffersRequest.md)
 - [OASDeleteCampaignOffersResponse](OASDeleteCampaignOffersResponse.md)
 - [OASDeleteGoodsFeedbackCommentRequest](OASDeleteGoodsFeedbackCommentRequest.md)
 - [OASDeleteHiddenOffersRequest](OASDeleteHiddenOffersRequest.md)
 - [OASDeleteOffersDTO](OASDeleteOffersDTO.md)
 - [OASDeleteOffersFromArchiveDTO](OASDeleteOffersFromArchiveDTO.md)
 - [OASDeleteOffersFromArchiveRequest](OASDeleteOffersFromArchiveRequest.md)
 - [OASDeleteOffersFromArchiveResponse](OASDeleteOffersFromArchiveResponse.md)
 - [OASDeleteOffersRequest](OASDeleteOffersRequest.md)
 - [OASDeleteOffersResponse](OASDeleteOffersResponse.md)
 - [OASDeletePromoOffersRequest](OASDeletePromoOffersRequest.md)
 - [OASDeletePromoOffersResponse](OASDeletePromoOffersResponse.md)
 - [OASDeletePromoOffersResultDTO](OASDeletePromoOffersResultDTO.md)
 - [OASDeliveryServiceDTO](OASDeliveryServiceDTO.md)
 - [OASDeliveryServiceInfoDTO](OASDeliveryServiceInfoDTO.md)
 - [OASDeliveryServicesDTO](OASDeliveryServicesDTO.md)
 - [OASDocumentDTO](OASDocumentDTO.md)
 - [OASEacVerificationResultDTO](OASEacVerificationResultDTO.md)
 - [OASEacVerificationStatusType](OASEacVerificationStatusType.md)
 - [OASEmptyApiResponse](OASEmptyApiResponse.md)
 - [OASEnrichedMappingsOfferDTO](OASEnrichedMappingsOfferDTO.md)
 - [OASEnrichedModelDTO](OASEnrichedModelDTO.md)
 - [OASEnrichedModelsDTO](OASEnrichedModelsDTO.md)
 - [OASEnrichedOrderBoxLayoutDTO](OASEnrichedOrderBoxLayoutDTO.md)
 - [OASExtensionShipmentDTO](OASExtensionShipmentDTO.md)
 - [OASFeedContentDTO](OASFeedContentDTO.md)
 - [OASFeedContentErrorDTO](OASFeedContentErrorDTO.md)
 - [OASFeedContentErrorType](OASFeedContentErrorType.md)
 - [OASFeedDTO](OASFeedDTO.md)
 - [OASFeedDownloadDTO](OASFeedDownloadDTO.md)
 - [OASFeedDownloadErrorDTO](OASFeedDownloadErrorDTO.md)
 - [OASFeedDownloadErrorType](OASFeedDownloadErrorType.md)
 - [OASFeedIndexLogsErrorDTO](OASFeedIndexLogsErrorDTO.md)
 - [OASFeedIndexLogsErrorType](OASFeedIndexLogsErrorType.md)
 - [OASFeedIndexLogsFeedDTO](OASFeedIndexLogsFeedDTO.md)
 - [OASFeedIndexLogsIndexType](OASFeedIndexLogsIndexType.md)
 - [OASFeedIndexLogsOffersDTO](OASFeedIndexLogsOffersDTO.md)
 - [OASFeedIndexLogsRecordDTO](OASFeedIndexLogsRecordDTO.md)
 - [OASFeedIndexLogsResultDTO](OASFeedIndexLogsResultDTO.md)
 - [OASFeedIndexLogsStatusType](OASFeedIndexLogsStatusType.md)
 - [OASFeedParameterDTO](OASFeedParameterDTO.md)
 - [OASFeedPlacementDTO](OASFeedPlacementDTO.md)
 - [OASFeedPublicationDTO](OASFeedPublicationDTO.md)
 - [OASFeedPublicationFullDTO](OASFeedPublicationFullDTO.md)
 - [OASFeedPublicationPriceAndStockUpdat](OASFeedPublicationPriceAndStockUpdat.md)
 - [OASFeedStatusType](OASFeedStatusType.md)
 - [OASFeedbackAuthorDTO](OASFeedbackAuthorDTO.md)
 - [OASFeedbackCommentAuthorDTO](OASFeedbackCommentAuthorDTO.md)
 - [OASFeedbackCommentAuthorType](OASFeedbackCommentAuthorType.md)
 - [OASFeedbackCommentDTO](OASFeedbackCommentDTO.md)
 - [OASFeedbackDTO](OASFeedbackDTO.md)
 - [OASFeedbackDeliveryType](OASFeedbackDeliveryType.md)
 - [OASFeedbackFactorDTO](OASFeedbackFactorDTO.md)
 - [OASFeedbackGradesDTO](OASFeedbackGradesDTO.md)
 - [OASFeedbackListDTO](OASFeedbackListDTO.md)
 - [OASFeedbackOrderDTO](OASFeedbackOrderDTO.md)
 - [OASFeedbackReactionStatusType](OASFeedbackReactionStatusType.md)
 - [OASFeedbackShopDTO](OASFeedbackShopDTO.md)
 - [OASFeedbackStateType](OASFeedbackStateType.md)
 - [OASFieldStateType](OASFieldStateType.md)
 - [OASFlippingPagerDTO](OASFlippingPagerDTO.md)
 - [OASForwardScrollingPagerDTO](OASForwardScrollingPagerDTO.md)
 - [OASFulfillmentWarehouseDTO](OASFulfillmentWarehouseDTO.md)
 - [OASFulfillmentWarehousesDTO](OASFulfillmentWarehousesDTO.md)
 - [OASFullOutletDTO](OASFullOutletDTO.md)
 - [OASFullOutletLicenseDTO](OASFullOutletLicenseDTO.md)
 - [OASGenerateBoostConsolidatedRequest](OASGenerateBoostConsolidatedRequest.md)
 - [OASGenerateCompetitorsPositionReport](OASGenerateCompetitorsPositionReport.md)
 - [OASGenerateGoodsFeedbackRequest](OASGenerateGoodsFeedbackRequest.md)
 - [OASGenerateGoodsMovementReportReques](OASGenerateGoodsMovementReportReques.md)
 - [OASGenerateGoodsRealizationReportReq](OASGenerateGoodsRealizationReportReq.md)
 - [OASGenerateGoodsTurnoverRequest](OASGenerateGoodsTurnoverRequest.md)
 - [OASGenerateMassOrderLabelsRequest](OASGenerateMassOrderLabelsRequest.md)
 - [OASGeneratePricesReportRequest](OASGeneratePricesReportRequest.md)
 - [OASGenerateReportDTO](OASGenerateReportDTO.md)
 - [OASGenerateReportResponse](OASGenerateReportResponse.md)
 - [OASGenerateShelfsStatisticsRequest](OASGenerateShelfsStatisticsRequest.md)
 - [OASGenerateShipmentListDocumentRepor](OASGenerateShipmentListDocumentRepor.md)
 - [OASGenerateShowsSalesReportRequest](OASGenerateShowsSalesReportRequest.md)
 - [OASGenerateStocksOnWarehousesReportR](OASGenerateStocksOnWarehousesReportR.md)
 - [OASGenerateUnitedMarketplaceServices](OASGenerateUnitedMarketplaceServices.md)
 - [OASGenerateUnitedNettingReportReques](OASGenerateUnitedNettingReportReques.md)
 - [OASGenerateUnitedOrdersRequest](OASGenerateUnitedOrdersRequest.md)
 - [OASGetAllOffersResponse](OASGetAllOffersResponse.md)
 - [OASGetBidsInfoRequest](OASGetBidsInfoRequest.md)
 - [OASGetBidsInfoResponse](OASGetBidsInfoResponse.md)
 - [OASGetBidsInfoResponseDTO](OASGetBidsInfoResponseDTO.md)
 - [OASGetBidsRecommendationsRequest](OASGetBidsRecommendationsRequest.md)
 - [OASGetBidsRecommendationsResponse](OASGetBidsRecommendationsResponse.md)
 - [OASGetBidsRecommendationsResponseDTO](OASGetBidsRecommendationsResponseDTO.md)
 - [OASGetBusinessBuyerInfoResponse](OASGetBusinessBuyerInfoResponse.md)
 - [OASGetBusinessDocumentsInfoResponse](OASGetBusinessDocumentsInfoResponse.md)
 - [OASGetBusinessSettingsInfoDTO](OASGetBusinessSettingsInfoDTO.md)
 - [OASGetBusinessSettingsResponse](OASGetBusinessSettingsResponse.md)
 - [OASGetCampaignLoginsResponse](OASGetCampaignLoginsResponse.md)
 - [OASGetCampaignOfferDTO](OASGetCampaignOfferDTO.md)
 - [OASGetCampaignOffersRequest](OASGetCampaignOffersRequest.md)
 - [OASGetCampaignOffersResponse](OASGetCampaignOffersResponse.md)
 - [OASGetCampaignOffersResultDTO](OASGetCampaignOffersResultDTO.md)
 - [OASGetCampaignRegionResponse](OASGetCampaignRegionResponse.md)
 - [OASGetCampaignResponse](OASGetCampaignResponse.md)
 - [OASGetCampaignSettingsResponse](OASGetCampaignSettingsResponse.md)
 - [OASGetCampaignsResponse](OASGetCampaignsResponse.md)
 - [OASGetCategoriesMaxSaleQuantumDTO](OASGetCategoriesMaxSaleQuantumDTO.md)
 - [OASGetCategoriesMaxSaleQuantumReques](OASGetCategoriesMaxSaleQuantumReques.md)
 - [OASGetCategoriesMaxSaleQuantumRespon](OASGetCategoriesMaxSaleQuantumRespon.md)
 - [OASGetCategoriesRequest](OASGetCategoriesRequest.md)
 - [OASGetCategoriesResponse](OASGetCategoriesResponse.md)
 - [OASGetCategoryContentParametersRespo](OASGetCategoryContentParametersRespo.md)
 - [OASGetChatHistoryRequest](OASGetChatHistoryRequest.md)
 - [OASGetChatHistoryResponse](OASGetChatHistoryResponse.md)
 - [OASGetChatInfoDTO](OASGetChatInfoDTO.md)
 - [OASGetChatsInfoDTO](OASGetChatsInfoDTO.md)
 - [OASGetChatsRequest](OASGetChatsRequest.md)
 - [OASGetChatsResponse](OASGetChatsResponse.md)
 - [OASGetDeliveryServicesResponse](OASGetDeliveryServicesResponse.md)
 - [OASGetFeedIndexLogsResponse](OASGetFeedIndexLogsResponse.md)
 - [OASGetFeedResponse](OASGetFeedResponse.md)
 - [OASGetFeedbackListResponse](OASGetFeedbackListResponse.md)
 - [OASGetFeedsResponse](OASGetFeedsResponse.md)
 - [OASGetFulfillmentWarehousesResponse](OASGetFulfillmentWarehousesResponse.md)
 - [OASGetGoodsFeedbackCommentsRequest](OASGetGoodsFeedbackCommentsRequest.md)
 - [OASGetGoodsFeedbackCommentsResponse](OASGetGoodsFeedbackCommentsResponse.md)
 - [OASGetGoodsFeedbackRequest](OASGetGoodsFeedbackRequest.md)
 - [OASGetGoodsFeedbackResponse](OASGetGoodsFeedbackResponse.md)
 - [OASGetGoodsStatsRequest](OASGetGoodsStatsRequest.md)
 - [OASGetGoodsStatsResponse](OASGetGoodsStatsResponse.md)
 - [OASGetHiddenOffersResponse](OASGetHiddenOffersResponse.md)
 - [OASGetHiddenOffersResultDTO](OASGetHiddenOffersResultDTO.md)
 - [OASGetMappingDTO](OASGetMappingDTO.md)
 - [OASGetModelsOffersResponse](OASGetModelsOffersResponse.md)
 - [OASGetModelsRequest](OASGetModelsRequest.md)
 - [OASGetModelsResponse](OASGetModelsResponse.md)
 - [OASGetOfferCardsContentStatusRequest](OASGetOfferCardsContentStatusRequest.md)
 - [OASGetOfferCardsContentStatusRespons](OASGetOfferCardsContentStatusRespons.md)
 - [OASGetOfferDTO](OASGetOfferDTO.md)
 - [OASGetOfferMappingDTO](OASGetOfferMappingDTO.md)
 - [OASGetOfferMappingEntriesResponse](OASGetOfferMappingEntriesResponse.md)
 - [OASGetOfferMappingsRequest](OASGetOfferMappingsRequest.md)
 - [OASGetOfferMappingsResponse](OASGetOfferMappingsResponse.md)
 - [OASGetOfferMappingsResultDTO](OASGetOfferMappingsResultDTO.md)
 - [OASGetOfferRecommendationsRequest](OASGetOfferRecommendationsRequest.md)
 - [OASGetOfferRecommendationsResponse](OASGetOfferRecommendationsResponse.md)
 - [OASGetOffersResponse](OASGetOffersResponse.md)
 - [OASGetOrderBuyerInfoResponse](OASGetOrderBuyerInfoResponse.md)
 - [OASGetOrderLabelsDataResponse](OASGetOrderLabelsDataResponse.md)
 - [OASGetOrderResponse](OASGetOrderResponse.md)
 - [OASGetOrdersResponse](OASGetOrdersResponse.md)
 - [OASGetOrdersStatsRequest](OASGetOrdersStatsRequest.md)
 - [OASGetOrdersStatsResponse](OASGetOrdersStatsResponse.md)
 - [OASGetOutletLicensesResponse](OASGetOutletLicensesResponse.md)
 - [OASGetOutletResponse](OASGetOutletResponse.md)
 - [OASGetOutletsResponse](OASGetOutletsResponse.md)
 - [OASGetPriceDTO](OASGetPriceDTO.md)
 - [OASGetPriceWithDiscountDTO](OASGetPriceWithDiscountDTO.md)
 - [OASGetPriceWithVatDTO](OASGetPriceWithVatDTO.md)
 - [OASGetPricesByOfferIdsRequest](OASGetPricesByOfferIdsRequest.md)
 - [OASGetPricesByOfferIdsResponse](OASGetPricesByOfferIdsResponse.md)
 - [OASGetPricesResponse](OASGetPricesResponse.md)
 - [OASGetPromoAssortmentInfoDTO](OASGetPromoAssortmentInfoDTO.md)
 - [OASGetPromoBestsellerInfoDTO](OASGetPromoBestsellerInfoDTO.md)
 - [OASGetPromoConstraintsDTO](OASGetPromoConstraintsDTO.md)
 - [OASGetPromoDTO](OASGetPromoDTO.md)
 - [OASGetPromoMechanicsInfoDTO](OASGetPromoMechanicsInfoDTO.md)
 - [OASGetPromoOfferDTO](OASGetPromoOfferDTO.md)
 - [OASGetPromoOffersRequest](OASGetPromoOffersRequest.md)
 - [OASGetPromoOffersResponse](OASGetPromoOffersResponse.md)
 - [OASGetPromoOffersResultDTO](OASGetPromoOffersResultDTO.md)
 - [OASGetPromoPromocodeInfoDTO](OASGetPromoPromocodeInfoDTO.md)
 - [OASGetPromosRequest](OASGetPromosRequest.md)
 - [OASGetPromosResponse](OASGetPromosResponse.md)
 - [OASGetPromosResultDTO](OASGetPromosResultDTO.md)
 - [OASGetQualityRatingDetailsResponse](OASGetQualityRatingDetailsResponse.md)
 - [OASGetQualityRatingRequest](OASGetQualityRatingRequest.md)
 - [OASGetQualityRatingResponse](OASGetQualityRatingResponse.md)
 - [OASGetQuarantineOffersRequest](OASGetQuarantineOffersRequest.md)
 - [OASGetQuarantineOffersResponse](OASGetQuarantineOffersResponse.md)
 - [OASGetQuarantineOffersResultDTO](OASGetQuarantineOffersResultDTO.md)
 - [OASGetRegionWithChildrenResponse](OASGetRegionWithChildrenResponse.md)
 - [OASGetRegionsResponse](OASGetRegionsResponse.md)
 - [OASGetReportInfoResponse](OASGetReportInfoResponse.md)
 - [OASGetReturnResponse](OASGetReturnResponse.md)
 - [OASGetReturnsResponse](OASGetReturnsResponse.md)
 - [OASGetShipmentOrdersInfoResponse](OASGetShipmentOrdersInfoResponse.md)
 - [OASGetShipmentResponse](OASGetShipmentResponse.md)
 - [OASGetSuggestedOfferMappingEntriesRe](OASGetSuggestedOfferMappingEntriesRe.md)
 - [OASGetSuggestedOfferMappingsRequest](OASGetSuggestedOfferMappingsRequest.md)
 - [OASGetSuggestedOfferMappingsResponse](OASGetSuggestedOfferMappingsResponse.md)
 - [OASGetSuggestedOfferMappingsResultDT](OASGetSuggestedOfferMappingsResultDT.md)
 - [OASGetWarehouseStocksDTO](OASGetWarehouseStocksDTO.md)
 - [OASGetWarehouseStocksRequest](OASGetWarehouseStocksRequest.md)
 - [OASGetWarehouseStocksResponse](OASGetWarehouseStocksResponse.md)
 - [OASGetWarehousesResponse](OASGetWarehousesResponse.md)
 - [OASGoodsFeedbackCommentAuthorDTO](OASGoodsFeedbackCommentAuthorDTO.md)
 - [OASGoodsFeedbackCommentAuthorType](OASGoodsFeedbackCommentAuthorType.md)
 - [OASGoodsFeedbackCommentDTO](OASGoodsFeedbackCommentDTO.md)
 - [OASGoodsFeedbackCommentListDTO](OASGoodsFeedbackCommentListDTO.md)
 - [OASGoodsFeedbackCommentStatusType](OASGoodsFeedbackCommentStatusType.md)
 - [OASGoodsFeedbackDTO](OASGoodsFeedbackDTO.md)
 - [OASGoodsFeedbackDescriptionDTO](OASGoodsFeedbackDescriptionDTO.md)
 - [OASGoodsFeedbackIdentifiersDTO](OASGoodsFeedbackIdentifiersDTO.md)
 - [OASGoodsFeedbackListDTO](OASGoodsFeedbackListDTO.md)
 - [OASGoodsFeedbackMediaDTO](OASGoodsFeedbackMediaDTO.md)
 - [OASGoodsFeedbackStatisticsDTO](OASGoodsFeedbackStatisticsDTO.md)
 - [OASGoodsStatsDTO](OASGoodsStatsDTO.md)
 - [OASGoodsStatsGoodsDTO](OASGoodsStatsGoodsDTO.md)
 - [OASGoodsStatsWarehouseDTO](OASGoodsStatsWarehouseDTO.md)
 - [OASGoodsStatsWeightDimensionsDTO](OASGoodsStatsWeightDimensionsDTO.md)
 - [OASGpsDTO](OASGpsDTO.md)
 - [OASHiddenOfferDTO](OASHiddenOfferDTO.md)
 - [OASLanguageType](OASLanguageType.md)
 - [OASLicenseCheckStatusType](OASLicenseCheckStatusType.md)
 - [OASLicenseType](OASLicenseType.md)
 - [OASLogisticPickupPointDTO](OASLogisticPickupPointDTO.md)
 - [OASLogisticPointType](OASLogisticPointType.md)
 - [OASMappingsOfferDTO](OASMappingsOfferDTO.md)
 - [OASMappingsOfferInfoDTO](OASMappingsOfferInfoDTO.md)
 - [OASMaxSaleQuantumDTO](OASMaxSaleQuantumDTO.md)
 - [OASMechanicsType](OASMechanicsType.md)
 - [OASModelDTO](OASModelDTO.md)
 - [OASModelOfferDTO](OASModelOfferDTO.md)
 - [OASModelPriceDTO](OASModelPriceDTO.md)
 - [OASModelsDTO](OASModelsDTO.md)
 - [OASOfferAvailabilityStatusType](OASOfferAvailabilityStatusType.md)
 - [OASOfferCampaignStatusDTO](OASOfferCampaignStatusDTO.md)
 - [OASOfferCampaignStatusType](OASOfferCampaignStatusType.md)
 - [OASOfferCardDTO](OASOfferCardDTO.md)
 - [OASOfferCardRecommendationDTO](OASOfferCardRecommendationDTO.md)
 - [OASOfferCardRecommendationType](OASOfferCardRecommendationType.md)
 - [OASOfferCardStatusType](OASOfferCardStatusType.md)
 - [OASOfferCardsContentStatusDTO](OASOfferCardsContentStatusDTO.md)
 - [OASOfferConditionDTO](OASOfferConditionDTO.md)
 - [OASOfferConditionQualityType](OASOfferConditionQualityType.md)
 - [OASOfferConditionType](OASOfferConditionType.md)
 - [OASOfferContentDTO](OASOfferContentDTO.md)
 - [OASOfferContentErrorDTO](OASOfferContentErrorDTO.md)
 - [OASOfferContentErrorType](OASOfferContentErrorType.md)
 - [OASOfferDTO](OASOfferDTO.md)
 - [OASOfferErrorDTO](OASOfferErrorDTO.md)
 - [OASOfferForRecommendationDTO](OASOfferForRecommendationDTO.md)
 - [OASOfferManualDTO](OASOfferManualDTO.md)
 - [OASOfferMappingDTO](OASOfferMappingDTO.md)
 - [OASOfferMappingEntriesDTO](OASOfferMappingEntriesDTO.md)
 - [OASOfferMappingEntryDTO](OASOfferMappingEntryDTO.md)
 - [OASOfferMappingErrorDTO](OASOfferMappingErrorDTO.md)
 - [OASOfferMappingErrorType](OASOfferMappingErrorType.md)
 - [OASOfferMappingInfoDTO](OASOfferMappingInfoDTO.md)
 - [OASOfferMappingKindType](OASOfferMappingKindType.md)
 - [OASOfferMappingSuggestionsListDTO](OASOfferMappingSuggestionsListDTO.md)
 - [OASOfferParamDTO](OASOfferParamDTO.md)
 - [OASOfferPriceByOfferIdsListResponseD](OASOfferPriceByOfferIdsListResponseD.md)
 - [OASOfferPriceByOfferIdsResponseDTO](OASOfferPriceByOfferIdsResponseDTO.md)
 - [OASOfferPriceDTO](OASOfferPriceDTO.md)
 - [OASOfferPriceListResponseDTO](OASOfferPriceListResponseDTO.md)
 - [OASOfferPriceResponseDTO](OASOfferPriceResponseDTO.md)
 - [OASOfferProcessingNoteDTO](OASOfferProcessingNoteDTO.md)
 - [OASOfferProcessingNoteType](OASOfferProcessingNoteType.md)
 - [OASOfferProcessingStateDTO](OASOfferProcessingStateDTO.md)
 - [OASOfferProcessingStatusType](OASOfferProcessingStatusType.md)
 - [OASOfferRecommendationDTO](OASOfferRecommendationDTO.md)
 - [OASOfferRecommendationInfoDTO](OASOfferRecommendationInfoDTO.md)
 - [OASOfferRecommendationsResultDTO](OASOfferRecommendationsResultDTO.md)
 - [OASOfferSellingProgramDTO](OASOfferSellingProgramDTO.md)
 - [OASOfferSellingProgramStatusType](OASOfferSellingProgramStatusType.md)
 - [OASOfferType](OASOfferType.md)
 - [OASOfferWeightDimensionsDTO](OASOfferWeightDimensionsDTO.md)
 - [OASOffersDTO](OASOffersDTO.md)
 - [OASOptionValuesLimitedDTO](OASOptionValuesLimitedDTO.md)
 - [OASOrderBoxLayoutDTO](OASOrderBoxLayoutDTO.md)
 - [OASOrderBoxLayoutItemDTO](OASOrderBoxLayoutItemDTO.md)
 - [OASOrderBoxLayoutPartialCountDTO](OASOrderBoxLayoutPartialCountDTO.md)
 - [OASOrderBoxesLayoutDTO](OASOrderBoxesLayoutDTO.md)
 - [OASOrderBusinessBuyerDTO](OASOrderBusinessBuyerDTO.md)
 - [OASOrderBusinessDocumentsDTO](OASOrderBusinessDocumentsDTO.md)
 - [OASOrderBuyerBasicInfoDTO](OASOrderBuyerBasicInfoDTO.md)
 - [OASOrderBuyerDTO](OASOrderBuyerDTO.md)
 - [OASOrderBuyerInfoDTO](OASOrderBuyerInfoDTO.md)
 - [OASOrderBuyerType](OASOrderBuyerType.md)
 - [OASOrderCancellationReasonType](OASOrderCancellationReasonType.md)
 - [OASOrderCourierDTO](OASOrderCourierDTO.md)
 - [OASOrderDTO](OASOrderDTO.md)
 - [OASOrderDeliveryAddressDTO](OASOrderDeliveryAddressDTO.md)
 - [OASOrderDeliveryDTO](OASOrderDeliveryDTO.md)
 - [OASOrderDeliveryDateDTO](OASOrderDeliveryDateDTO.md)
 - [OASOrderDeliveryDateReasonType](OASOrderDeliveryDateReasonType.md)
 - [OASOrderDeliveryDatesDTO](OASOrderDeliveryDatesDTO.md)
 - [OASOrderDeliveryDispatchType](OASOrderDeliveryDispatchType.md)
 - [OASOrderDeliveryEacType](OASOrderDeliveryEacType.md)
 - [OASOrderDeliveryPartnerType](OASOrderDeliveryPartnerType.md)
 - [OASOrderDeliveryType](OASOrderDeliveryType.md)
 - [OASOrderDigitalItemDTO](OASOrderDigitalItemDTO.md)
 - [OASOrderDocumentStatusType](OASOrderDocumentStatusType.md)
 - [OASOrderItemDTO](OASOrderItemDTO.md)
 - [OASOrderItemDetailDTO](OASOrderItemDetailDTO.md)
 - [OASOrderItemInstanceDTO](OASOrderItemInstanceDTO.md)
 - [OASOrderItemInstanceModificationDTO](OASOrderItemInstanceModificationDTO.md)
 - [OASOrderItemInstanceType](OASOrderItemInstanceType.md)
 - [OASOrderItemModificationDTO](OASOrderItemModificationDTO.md)
 - [OASOrderItemPromoDTO](OASOrderItemPromoDTO.md)
 - [OASOrderItemStatusType](OASOrderItemStatusType.md)
 - [OASOrderItemSubsidyDTO](OASOrderItemSubsidyDTO.md)
 - [OASOrderItemSubsidyType](OASOrderItemSubsidyType.md)
 - [OASOrderItemsModificationRequestReas](OASOrderItemsModificationRequestReas.md)
 - [OASOrderItemsModificationResultDTO](OASOrderItemsModificationResultDTO.md)
 - [OASOrderLabelDTO](OASOrderLabelDTO.md)
 - [OASOrderLiftType](OASOrderLiftType.md)
 - [OASOrderParcelBoxDTO](OASOrderParcelBoxDTO.md)
 - [OASOrderPaymentMethodType](OASOrderPaymentMethodType.md)
 - [OASOrderPaymentType](OASOrderPaymentType.md)
 - [OASOrderPromoType](OASOrderPromoType.md)
 - [OASOrderShipmentDTO](OASOrderShipmentDTO.md)
 - [OASOrderStateDTO](OASOrderStateDTO.md)
 - [OASOrderStatsStatusType](OASOrderStatsStatusType.md)
 - [OASOrderStatusChangeDTO](OASOrderStatusChangeDTO.md)
 - [OASOrderStatusChangeDeliveryDTO](OASOrderStatusChangeDeliveryDTO.md)
 - [OASOrderStatusChangeDeliveryDatesDTO](OASOrderStatusChangeDeliveryDatesDTO.md)
 - [OASOrderStatusType](OASOrderStatusType.md)
 - [OASOrderSubsidyDTO](OASOrderSubsidyDTO.md)
 - [OASOrderSubsidyType](OASOrderSubsidyType.md)
 - [OASOrderSubstatusType](OASOrderSubstatusType.md)
 - [OASOrderTaxSystemType](OASOrderTaxSystemType.md)
 - [OASOrderTrackDTO](OASOrderTrackDTO.md)
 - [OASOrderUpdateStatusType](OASOrderUpdateStatusType.md)
 - [OASOrderVatType](OASOrderVatType.md)
 - [OASOrdersShipmentInfoDTO](OASOrdersShipmentInfoDTO.md)
 - [OASOrdersStatsCommissionDTO](OASOrdersStatsCommissionDTO.md)
 - [OASOrdersStatsCommissionType](OASOrdersStatsCommissionType.md)
 - [OASOrdersStatsDTO](OASOrdersStatsDTO.md)
 - [OASOrdersStatsDeliveryRegionDTO](OASOrdersStatsDeliveryRegionDTO.md)
 - [OASOrdersStatsDetailsDTO](OASOrdersStatsDetailsDTO.md)
 - [OASOrdersStatsItemDTO](OASOrdersStatsItemDTO.md)
 - [OASOrdersStatsItemStatusType](OASOrdersStatsItemStatusType.md)
 - [OASOrdersStatsOrderDTO](OASOrdersStatsOrderDTO.md)
 - [OASOrdersStatsOrderPaymentType](OASOrdersStatsOrderPaymentType.md)
 - [OASOrdersStatsPaymentDTO](OASOrdersStatsPaymentDTO.md)
 - [OASOrdersStatsPaymentOrderDTO](OASOrdersStatsPaymentOrderDTO.md)
 - [OASOrdersStatsPaymentSourceType](OASOrdersStatsPaymentSourceType.md)
 - [OASOrdersStatsPaymentType](OASOrdersStatsPaymentType.md)
 - [OASOrdersStatsPriceDTO](OASOrdersStatsPriceDTO.md)
 - [OASOrdersStatsPriceType](OASOrdersStatsPriceType.md)
 - [OASOrdersStatsStockType](OASOrdersStatsStockType.md)
 - [OASOrdersStatsWarehouseDTO](OASOrdersStatsWarehouseDTO.md)
 - [OASOutletAddressDTO](OASOutletAddressDTO.md)
 - [OASOutletDTO](OASOutletDTO.md)
 - [OASOutletDeliveryRuleDTO](OASOutletDeliveryRuleDTO.md)
 - [OASOutletLicenseDTO](OASOutletLicenseDTO.md)
 - [OASOutletLicensesResponseDTO](OASOutletLicensesResponseDTO.md)
 - [OASOutletResponseDTO](OASOutletResponseDTO.md)
 - [OASOutletStatusType](OASOutletStatusType.md)
 - [OASOutletType](OASOutletType.md)
 - [OASOutletVisibilityType](OASOutletVisibilityType.md)
 - [OASOutletWorkingScheduleDTO](OASOutletWorkingScheduleDTO.md)
 - [OASOutletWorkingScheduleItemDTO](OASOutletWorkingScheduleItemDTO.md)
 - [OASPageFormatType](OASPageFormatType.md)
 - [OASPagedReturnsDTO](OASPagedReturnsDTO.md)
 - [OASPalletsCountDTO](OASPalletsCountDTO.md)
 - [OASParameterType](OASParameterType.md)
 - [OASParameterValueConstraintsDTO](OASParameterValueConstraintsDTO.md)
 - [OASParameterValueDTO](OASParameterValueDTO.md)
 - [OASParameterValueOptionDTO](OASParameterValueOptionDTO.md)
 - [OASParcelBoxDTO](OASParcelBoxDTO.md)
 - [OASParcelBoxLabelDTO](OASParcelBoxLabelDTO.md)
 - [OASParcelDTO](OASParcelDTO.md)
 - [OASPartnerShipmentWarehouseDTO](OASPartnerShipmentWarehouseDTO.md)
 - [OASPaymentFrequencyType](OASPaymentFrequencyType.md)
 - [OASPickupAddressDTO](OASPickupAddressDTO.md)
 - [OASPlacementType](OASPlacementType.md)
 - [OASPriceCompetitivenessThresholdsDTO](OASPriceCompetitivenessThresholdsDTO.md)
 - [OASPriceCompetitivenessType](OASPriceCompetitivenessType.md)
 - [OASPriceDTO](OASPriceDTO.md)
 - [OASPriceQuarantineVerdictDTO](OASPriceQuarantineVerdictDTO.md)
 - [OASPriceQuarantineVerdictParamNameTy](OASPriceQuarantineVerdictParamNameTy.md)
 - [OASPriceQuarantineVerdictParameterDT](OASPriceQuarantineVerdictParameterDT.md)
 - [OASPriceQuarantineVerdictType](OASPriceQuarantineVerdictType.md)
 - [OASPriceRecommendationItemDTO](OASPriceRecommendationItemDTO.md)
 - [OASPriceSuggestDTO](OASPriceSuggestDTO.md)
 - [OASPriceSuggestOfferDTO](OASPriceSuggestOfferDTO.md)
 - [OASPriceSuggestType](OASPriceSuggestType.md)
 - [OASPromoOfferAutoParticipatingDetail](OASPromoOfferAutoParticipatingDetail.md)
 - [OASPromoOfferDiscountParamsDTO](OASPromoOfferDiscountParamsDTO.md)
 - [OASPromoOfferParamsDTO](OASPromoOfferParamsDTO.md)
 - [OASPromoOfferParticipationStatusFilt](OASPromoOfferParticipationStatusFilt.md)
 - [OASPromoOfferParticipationStatusType](OASPromoOfferParticipationStatusType.md)
 - [OASPromoOfferPromocodeParamsDTO](OASPromoOfferPromocodeParamsDTO.md)
 - [OASPromoOfferUpdateWarningCodeType](OASPromoOfferUpdateWarningCodeType.md)
 - [OASPromoOfferUpdateWarningDTO](OASPromoOfferUpdateWarningDTO.md)
 - [OASPromoParticipationType](OASPromoParticipationType.md)
 - [OASPromoPeriodDTO](OASPromoPeriodDTO.md)
 - [OASProvideOrderDigitalCodesRequest](OASProvideOrderDigitalCodesRequest.md)
 - [OASProvideOrderItemIdentifiersReques](OASProvideOrderItemIdentifiersReques.md)
 - [OASProvideOrderItemIdentifiersRespon](OASProvideOrderItemIdentifiersRespon.md)
 - [OASPutSkuBidsRequest](OASPutSkuBidsRequest.md)
 - [OASQualityRatingAffectedOrderDTO](OASQualityRatingAffectedOrderDTO.md)
 - [OASQualityRatingComponentDTO](OASQualityRatingComponentDTO.md)
 - [OASQualityRatingComponentType](OASQualityRatingComponentType.md)
 - [OASQualityRatingDTO](OASQualityRatingDTO.md)
 - [OASQualityRatingDetailsDTO](OASQualityRatingDetailsDTO.md)
 - [OASQuantumDTO](OASQuantumDTO.md)
 - [OASQuarantineOfferDTO](OASQuarantineOfferDTO.md)
 - [OASRecipientType](OASRecipientType.md)
 - [OASRefundStatusType](OASRefundStatusType.md)
 - [OASRegionDTO](OASRegionDTO.md)
 - [OASRegionType](OASRegionType.md)
 - [OASRegionalModelInfoDTO](OASRegionalModelInfoDTO.md)
 - [OASRejectedPromoOfferDeleteDTO](OASRejectedPromoOfferDeleteDTO.md)
 - [OASRejectedPromoOfferDeleteReasonTyp](OASRejectedPromoOfferDeleteReasonTyp.md)
 - [OASRejectedPromoOfferUpdateDTO](OASRejectedPromoOfferUpdateDTO.md)
 - [OASRejectedPromoOfferUpdateReasonTyp](OASRejectedPromoOfferUpdateReasonTyp.md)
 - [OASReportFormatType](OASReportFormatType.md)
 - [OASReportInfoDTO](OASReportInfoDTO.md)
 - [OASReportStatusType](OASReportStatusType.md)
 - [OASReportSubStatusType](OASReportSubStatusType.md)
 - [OASReturnDTO](OASReturnDTO.md)
 - [OASReturnDecisionDTO](OASReturnDecisionDTO.md)
 - [OASReturnDecisionReasonType](OASReturnDecisionReasonType.md)
 - [OASReturnDecisionSubreasonType](OASReturnDecisionSubreasonType.md)
 - [OASReturnDecisionType](OASReturnDecisionType.md)
 - [OASReturnInstanceDTO](OASReturnInstanceDTO.md)
 - [OASReturnInstanceStatusType](OASReturnInstanceStatusType.md)
 - [OASReturnInstanceStockType](OASReturnInstanceStockType.md)
 - [OASReturnItemDTO](OASReturnItemDTO.md)
 - [OASReturnRequestDecisionType](OASReturnRequestDecisionType.md)
 - [OASReturnShipmentStatusType](OASReturnShipmentStatusType.md)
 - [OASReturnType](OASReturnType.md)
 - [OASScrollingPagerDTO](OASScrollingPagerDTO.md)
 - [OASSearchModelsResponse](OASSearchModelsResponse.md)
 - [OASSearchShipmentsRequest](OASSearchShipmentsRequest.md)
 - [OASSearchShipmentsResponse](OASSearchShipmentsResponse.md)
 - [OASSearchShipmentsResponseDTO](OASSearchShipmentsResponseDTO.md)
 - [OASSellingProgramType](OASSellingProgramType.md)
 - [OASSendMessageToChatRequest](OASSendMessageToChatRequest.md)
 - [OASSetFeedParamsRequest](OASSetFeedParamsRequest.md)
 - [OASSetOrderBoxLayoutRequest](OASSetOrderBoxLayoutRequest.md)
 - [OASSetOrderBoxLayoutResponse](OASSetOrderBoxLayoutResponse.md)
 - [OASSetOrderDeliveryDateRequest](OASSetOrderDeliveryDateRequest.md)
 - [OASSetOrderDeliveryTrackCodeRequest](OASSetOrderDeliveryTrackCodeRequest.md)
 - [OASSetOrderShipmentBoxesRequest](OASSetOrderShipmentBoxesRequest.md)
 - [OASSetOrderShipmentBoxesResponse](OASSetOrderShipmentBoxesResponse.md)
 - [OASSetReturnDecisionRequest](OASSetReturnDecisionRequest.md)
 - [OASSetShipmentPalletsCountRequest](OASSetShipmentPalletsCountRequest.md)
 - [OASShelfsStatisticsAttributionType](OASShelfsStatisticsAttributionType.md)
 - [OASShipmentActionType](OASShipmentActionType.md)
 - [OASShipmentBoxesDTO](OASShipmentBoxesDTO.md)
 - [OASShipmentDTO](OASShipmentDTO.md)
 - [OASShipmentInfoDTO](OASShipmentInfoDTO.md)
 - [OASShipmentPalletLabelPageFormatType](OASShipmentPalletLabelPageFormatType.md)
 - [OASShipmentStatusChangeDTO](OASShipmentStatusChangeDTO.md)
 - [OASShipmentStatusType](OASShipmentStatusType.md)
 - [OASShipmentType](OASShipmentType.md)
 - [OASShowsSalesGroupingType](OASShowsSalesGroupingType.md)
 - [OASSkipGoodsFeedbackReactionRequest](OASSkipGoodsFeedbackReactionRequest.md)
 - [OASSkuBidItemDTO](OASSkuBidItemDTO.md)
 - [OASSkuBidRecommendationItemDTO](OASSkuBidRecommendationItemDTO.md)
 - [OASSortOrderType](OASSortOrderType.md)
 - [OASSuggestOfferPriceDTO](OASSuggestOfferPriceDTO.md)
 - [OASSuggestPricesRequest](OASSuggestPricesRequest.md)
 - [OASSuggestPricesResponse](OASSuggestPricesResponse.md)
 - [OASSuggestPricesResultDTO](OASSuggestPricesResultDTO.md)
 - [OASSuggestedOfferDTO](OASSuggestedOfferDTO.md)
 - [OASSuggestedOfferMappingDTO](OASSuggestedOfferMappingDTO.md)
 - [OASTariffDTO](OASTariffDTO.md)
 - [OASTariffParameterDTO](OASTariffParameterDTO.md)
 - [OASTariffType](OASTariffType.md)
 - [OASTimePeriodDTO](OASTimePeriodDTO.md)
 - [OASTimeUnitType](OASTimeUnitType.md)
 - [OASTrackDTO](OASTrackDTO.md)
 - [OASTransferOrdersFromShipmentRequest](OASTransferOrdersFromShipmentRequest.md)
 - [OASTurnoverDTO](OASTurnoverDTO.md)
 - [OASTurnoverType](OASTurnoverType.md)
 - [OASUnitDTO](OASUnitDTO.md)
 - [OASUpdateBusinessOfferPriceDTO](OASUpdateBusinessOfferPriceDTO.md)
 - [OASUpdateBusinessPricesRequest](OASUpdateBusinessPricesRequest.md)
 - [OASUpdateCampaignOfferDTO](OASUpdateCampaignOfferDTO.md)
 - [OASUpdateCampaignOffersRequest](OASUpdateCampaignOffersRequest.md)
 - [OASUpdateGoodsFeedbackCommentDTO](OASUpdateGoodsFeedbackCommentDTO.md)
 - [OASUpdateGoodsFeedbackCommentRequest](OASUpdateGoodsFeedbackCommentRequest.md)
 - [OASUpdateGoodsFeedbackCommentRespons](OASUpdateGoodsFeedbackCommentRespons.md)
 - [OASUpdateMappingDTO](OASUpdateMappingDTO.md)
 - [OASUpdateMappingsOfferDTO](OASUpdateMappingsOfferDTO.md)
 - [OASUpdateOfferContentRequest](OASUpdateOfferContentRequest.md)
 - [OASUpdateOfferContentResponse](OASUpdateOfferContentResponse.md)
 - [OASUpdateOfferContentResultDTO](OASUpdateOfferContentResultDTO.md)
 - [OASUpdateOfferDTO](OASUpdateOfferDTO.md)
 - [OASUpdateOfferMappingDTO](OASUpdateOfferMappingDTO.md)
 - [OASUpdateOfferMappingEntryDTO](OASUpdateOfferMappingEntryDTO.md)
 - [OASUpdateOfferMappingEntryRequest](OASUpdateOfferMappingEntryRequest.md)
 - [OASUpdateOfferMappingResultDTO](OASUpdateOfferMappingResultDTO.md)
 - [OASUpdateOfferMappingsRequest](OASUpdateOfferMappingsRequest.md)
 - [OASUpdateOfferMappingsResponse](OASUpdateOfferMappingsResponse.md)
 - [OASUpdateOrderItemRequest](OASUpdateOrderItemRequest.md)
 - [OASUpdateOrderStatusDTO](OASUpdateOrderStatusDTO.md)
 - [OASUpdateOrderStatusRequest](OASUpdateOrderStatusRequest.md)
 - [OASUpdateOrderStatusResponse](OASUpdateOrderStatusResponse.md)
 - [OASUpdateOrderStatusesDTO](OASUpdateOrderStatusesDTO.md)
 - [OASUpdateOrderStatusesRequest](OASUpdateOrderStatusesRequest.md)
 - [OASUpdateOrderStatusesResponse](OASUpdateOrderStatusesResponse.md)
 - [OASUpdateOrderStorageLimitRequest](OASUpdateOrderStorageLimitRequest.md)
 - [OASUpdateOutletLicenseRequest](OASUpdateOutletLicenseRequest.md)
 - [OASUpdatePriceWithDiscountDTO](OASUpdatePriceWithDiscountDTO.md)
 - [OASUpdatePricesRequest](OASUpdatePricesRequest.md)
 - [OASUpdatePromoOfferDTO](OASUpdatePromoOfferDTO.md)
 - [OASUpdatePromoOfferDiscountParamsDTO](OASUpdatePromoOfferDiscountParamsDTO.md)
 - [OASUpdatePromoOfferParamsDTO](OASUpdatePromoOfferParamsDTO.md)
 - [OASUpdatePromoOffersRequest](OASUpdatePromoOffersRequest.md)
 - [OASUpdatePromoOffersResponse](OASUpdatePromoOffersResponse.md)
 - [OASUpdatePromoOffersResultDTO](OASUpdatePromoOffersResultDTO.md)
 - [OASUpdateStockDTO](OASUpdateStockDTO.md)
 - [OASUpdateStockItemDTO](OASUpdateStockItemDTO.md)
 - [OASUpdateStocksRequest](OASUpdateStocksRequest.md)
 - [OASUpdateTimeDTO](OASUpdateTimeDTO.md)
 - [OASValueRestrictionDTO](OASValueRestrictionDTO.md)
 - [OASVerifyOrderEacRequest](OASVerifyOrderEacRequest.md)
 - [OASVerifyOrderEacResponse](OASVerifyOrderEacResponse.md)
 - [OASWarehouseAddressDTO](OASWarehouseAddressDTO.md)
 - [OASWarehouseDTO](OASWarehouseDTO.md)
 - [OASWarehouseGroupDTO](OASWarehouseGroupDTO.md)
 - [OASWarehouseOfferDTO](OASWarehouseOfferDTO.md)
 - [OASWarehouseOffersDTO](OASWarehouseOffersDTO.md)
 - [OASWarehouseStockDTO](OASWarehouseStockDTO.md)
 - [OASWarehouseStockType](OASWarehouseStockType.md)
 - [OASWarehousesDTO](OASWarehousesDTO.md)
 - [OASWarningPromoOfferUpdateDTO](OASWarningPromoOfferUpdateDTO.md)


## Documentation for Authorization


Authentication schemes defined for the API:
### OAuth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://oauth.yandex.ru/authorize
- **Scopes**: 
  - market:partner-api: API Яндекс.Маркета / Поиска по товарам для партнеров


## Author



