# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.BidsApi;

public class BidsApiExample {

    public static void main(String[] args) {
        BidsApi apiInstance = new BidsApi();
        Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
        String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
        Integer limit = 20; // Integer | Количество значений на одной странице. 
        GetBidsInfoRequest getBidsInfoRequest = new GetBidsInfoRequest(); // GetBidsInfoRequest | description
        try {
            GetBidsInfoResponse result = apiInstance.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BidsApi#getBidsInfoForBusiness");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BidsApi* | [**getBidsInfoForBusiness**](docs/BidsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*BidsApi* | [**getBidsRecommendations**](docs/BidsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*BidsApi* | [**putBidsForBusiness**](docs/BidsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*BidsApi* | [**putBidsForCampaign**](docs/BidsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*BusinessOfferMappingsApi* | [**addOffersToArchive**](docs/BusinessOfferMappingsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*BusinessOfferMappingsApi* | [**deleteOffers**](docs/BusinessOfferMappingsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*BusinessOfferMappingsApi* | [**deleteOffersFromArchive**](docs/BusinessOfferMappingsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*BusinessOfferMappingsApi* | [**getOfferMappings**](docs/BusinessOfferMappingsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*BusinessOfferMappingsApi* | [**getSuggestedOfferMappings**](docs/BusinessOfferMappingsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*BusinessOfferMappingsApi* | [**updateOfferMappings**](docs/BusinessOfferMappingsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*BusinessesApi* | [**getBusinessSettings**](docs/BusinessesApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*CampaignsApi* | [**getCampaign**](docs/CampaignsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*CampaignsApi* | [**getCampaignLogins**](docs/CampaignsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*CampaignsApi* | [**getCampaignRegion**](docs/CampaignsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*CampaignsApi* | [**getCampaignSettings**](docs/CampaignsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*CampaignsApi* | [**getCampaigns**](docs/CampaignsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*CampaignsApi* | [**getCampaignsByLogin**](docs/CampaignsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*CategoriesApi* | [**getCategoriesMaxSaleQuantum**](docs/CategoriesApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*CategoriesApi* | [**getCategoriesTree**](docs/CategoriesApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*ChatsApi* | [**createChat**](docs/ChatsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ChatsApi* | [**getChatHistory**](docs/ChatsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ChatsApi* | [**getChats**](docs/ChatsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ChatsApi* | [**sendFileToChat**](docs/ChatsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ChatsApi* | [**sendMessageToChat**](docs/ChatsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ContentApi* | [**getCategoryContentParameters**](docs/ContentApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ContentApi* | [**getOfferCardsContentStatus**](docs/ContentApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ContentApi* | [**updateOfferContent**](docs/ContentApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**acceptOrderCancellation**](docs/DbsApi.md#acceptOrderCancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*DbsApi* | [**addHiddenOffers**](docs/DbsApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*DbsApi* | [**addOffersToArchive**](docs/DbsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*DbsApi* | [**calculateTariffs**](docs/DbsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*DbsApi* | [**confirmBusinessPrices**](docs/DbsApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*DbsApi* | [**confirmCampaignPrices**](docs/DbsApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*DbsApi* | [**createChat**](docs/DbsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*DbsApi* | [**createOutlet**](docs/DbsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*DbsApi* | [**deleteCampaignOffers**](docs/DbsApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*DbsApi* | [**deleteGoodsFeedbackComment**](docs/DbsApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*DbsApi* | [**deleteHiddenOffers**](docs/DbsApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*DbsApi* | [**deleteOffers**](docs/DbsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*DbsApi* | [**deleteOffersFromArchive**](docs/DbsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*DbsApi* | [**deleteOutlet**](docs/DbsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*DbsApi* | [**deleteOutletLicenses**](docs/DbsApi.md#deleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*DbsApi* | [**deletePromoOffers**](docs/DbsApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*DbsApi* | [**generateBoostConsolidatedReport**](docs/DbsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*DbsApi* | [**generateCompetitorsPositionReport**](docs/DbsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*DbsApi* | [**generateGoodsFeedbackReport**](docs/DbsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*DbsApi* | [**generateMassOrderLabelsReport**](docs/DbsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*DbsApi* | [**generateOrderLabel**](docs/DbsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*DbsApi* | [**generateOrderLabels**](docs/DbsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*DbsApi* | [**generatePricesReport**](docs/DbsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*DbsApi* | [**generateShelfsStatisticsReport**](docs/DbsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*DbsApi* | [**generateShowsSalesReport**](docs/DbsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*DbsApi* | [**generateStocksOnWarehousesReport**](docs/DbsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*DbsApi* | [**generateUnitedMarketplaceServicesReport**](docs/DbsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*DbsApi* | [**generateUnitedNettingReport**](docs/DbsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*DbsApi* | [**generateUnitedOrdersReport**](docs/DbsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*DbsApi* | [**getAllOffers**](docs/DbsApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*DbsApi* | [**getBidsInfoForBusiness**](docs/DbsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*DbsApi* | [**getBidsRecommendations**](docs/DbsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*DbsApi* | [**getBusinessQuarantineOffers**](docs/DbsApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*DbsApi* | [**getBusinessSettings**](docs/DbsApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*DbsApi* | [**getCampaign**](docs/DbsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*DbsApi* | [**getCampaignLogins**](docs/DbsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*DbsApi* | [**getCampaignOffers**](docs/DbsApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*DbsApi* | [**getCampaignQuarantineOffers**](docs/DbsApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*DbsApi* | [**getCampaignRegion**](docs/DbsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*DbsApi* | [**getCampaignSettings**](docs/DbsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*DbsApi* | [**getCampaigns**](docs/DbsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*DbsApi* | [**getCampaignsByLogin**](docs/DbsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*DbsApi* | [**getCategoriesMaxSaleQuantum**](docs/DbsApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*DbsApi* | [**getCategoriesTree**](docs/DbsApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*DbsApi* | [**getCategoryContentParameters**](docs/DbsApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*DbsApi* | [**getChatHistory**](docs/DbsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*DbsApi* | [**getChats**](docs/DbsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*DbsApi* | [**getDeliveryServices**](docs/DbsApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*DbsApi* | [**getFeed**](docs/DbsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*DbsApi* | [**getFeedIndexLogs**](docs/DbsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*DbsApi* | [**getFeedbackAndCommentUpdates**](docs/DbsApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*DbsApi* | [**getFeeds**](docs/DbsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*DbsApi* | [**getGoodsFeedbackComments**](docs/DbsApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*DbsApi* | [**getGoodsFeedbacks**](docs/DbsApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*DbsApi* | [**getGoodsStats**](docs/DbsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*DbsApi* | [**getHiddenOffers**](docs/DbsApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*DbsApi* | [**getModel**](docs/DbsApi.md#getModel) | **GET** /models/{modelId} | Информация об одной модели
*DbsApi* | [**getModelOffers**](docs/DbsApi.md#getModelOffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*DbsApi* | [**getModels**](docs/DbsApi.md#getModels) | **POST** /models | Информация о нескольких моделях
*DbsApi* | [**getModelsOffers**](docs/DbsApi.md#getModelsOffers) | **POST** /models/offers | Список предложений для нескольких моделей
*DbsApi* | [**getOfferCardsContentStatus**](docs/DbsApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*DbsApi* | [**getOfferMappingEntries**](docs/DbsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*DbsApi* | [**getOfferMappings**](docs/DbsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*DbsApi* | [**getOfferRecommendations**](docs/DbsApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*DbsApi* | [**getOffers**](docs/DbsApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*DbsApi* | [**getOrder**](docs/DbsApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*DbsApi* | [**getOrderBusinessBuyerInfo**](docs/DbsApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*DbsApi* | [**getOrderBusinessDocumentsInfo**](docs/DbsApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*DbsApi* | [**getOrderBuyerInfo**](docs/DbsApi.md#getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*DbsApi* | [**getOrderLabelsData**](docs/DbsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*DbsApi* | [**getOrders**](docs/DbsApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*DbsApi* | [**getOrdersStats**](docs/DbsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*DbsApi* | [**getOutlet**](docs/DbsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*DbsApi* | [**getOutletLicenses**](docs/DbsApi.md#getOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*DbsApi* | [**getOutlets**](docs/DbsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*DbsApi* | [**getPrices**](docs/DbsApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*DbsApi* | [**getPricesByOfferIds**](docs/DbsApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*DbsApi* | [**getPromoOffers**](docs/DbsApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*DbsApi* | [**getPromos**](docs/DbsApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*DbsApi* | [**getQualityRatingDetails**](docs/DbsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*DbsApi* | [**getQualityRatings**](docs/DbsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*DbsApi* | [**getReportInfo**](docs/DbsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*DbsApi* | [**getReturn**](docs/DbsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*DbsApi* | [**getReturnApplication**](docs/DbsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*DbsApi* | [**getReturnPhoto**](docs/DbsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*DbsApi* | [**getReturns**](docs/DbsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*DbsApi* | [**getStocks**](docs/DbsApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*DbsApi* | [**getSuggestedOfferMappingEntries**](docs/DbsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*DbsApi* | [**getSuggestedOfferMappings**](docs/DbsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*DbsApi* | [**getSuggestedPrices**](docs/DbsApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*DbsApi* | [**getWarehouses**](docs/DbsApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*DbsApi* | [**provideOrderDigitalCodes**](docs/DbsApi.md#provideOrderDigitalCodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*DbsApi* | [**provideOrderItemIdentifiers**](docs/DbsApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*DbsApi* | [**putBidsForBusiness**](docs/DbsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*DbsApi* | [**putBidsForCampaign**](docs/DbsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*DbsApi* | [**refreshFeed**](docs/DbsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*DbsApi* | [**searchModels**](docs/DbsApi.md#searchModels) | **GET** /models | Поиск модели товара
*DbsApi* | [**searchRegionChildren**](docs/DbsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*DbsApi* | [**searchRegionsById**](docs/DbsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*DbsApi* | [**searchRegionsByName**](docs/DbsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*DbsApi* | [**sendFileToChat**](docs/DbsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*DbsApi* | [**sendMessageToChat**](docs/DbsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*DbsApi* | [**setFeedParams**](docs/DbsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*DbsApi* | [**setOrderBoxLayout**](docs/DbsApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*DbsApi* | [**setOrderDeliveryDate**](docs/DbsApi.md#setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*DbsApi* | [**setOrderDeliveryTrackCode**](docs/DbsApi.md#setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*DbsApi* | [**setOrderShipmentBoxes**](docs/DbsApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*DbsApi* | [**setReturnDecision**](docs/DbsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*DbsApi* | [**skipGoodsFeedbacksReaction**](docs/DbsApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*DbsApi* | [**submitReturnDecision**](docs/DbsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*DbsApi* | [**updateBusinessPrices**](docs/DbsApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*DbsApi* | [**updateCampaignOffers**](docs/DbsApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*DbsApi* | [**updateGoodsFeedbackComment**](docs/DbsApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*DbsApi* | [**updateOfferContent**](docs/DbsApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**updateOfferMappingEntries**](docs/DbsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*DbsApi* | [**updateOfferMappings**](docs/DbsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*DbsApi* | [**updateOrderItems**](docs/DbsApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*DbsApi* | [**updateOrderStatus**](docs/DbsApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*DbsApi* | [**updateOrderStatuses**](docs/DbsApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*DbsApi* | [**updateOrderStorageLimit**](docs/DbsApi.md#updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*DbsApi* | [**updateOutlet**](docs/DbsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*DbsApi* | [**updateOutletLicenses**](docs/DbsApi.md#updateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*DbsApi* | [**updatePrices**](docs/DbsApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*DbsApi* | [**updatePromoOffers**](docs/DbsApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*DbsApi* | [**updateStocks**](docs/DbsApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*DeliveryServicesApi* | [**getDeliveryServices**](docs/DeliveryServicesApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**addHiddenOffers**](docs/ExpressApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*ExpressApi* | [**addOffersToArchive**](docs/ExpressApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*ExpressApi* | [**calculateTariffs**](docs/ExpressApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*ExpressApi* | [**confirmBusinessPrices**](docs/ExpressApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*ExpressApi* | [**confirmCampaignPrices**](docs/ExpressApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*ExpressApi* | [**createChat**](docs/ExpressApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ExpressApi* | [**deleteCampaignOffers**](docs/ExpressApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*ExpressApi* | [**deleteGoodsFeedbackComment**](docs/ExpressApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*ExpressApi* | [**deleteHiddenOffers**](docs/ExpressApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*ExpressApi* | [**deleteOffers**](docs/ExpressApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*ExpressApi* | [**deleteOffersFromArchive**](docs/ExpressApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*ExpressApi* | [**deletePromoOffers**](docs/ExpressApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*ExpressApi* | [**generateBoostConsolidatedReport**](docs/ExpressApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ExpressApi* | [**generateCompetitorsPositionReport**](docs/ExpressApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ExpressApi* | [**generateGoodsFeedbackReport**](docs/ExpressApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ExpressApi* | [**generateGoodsRealizationReport**](docs/ExpressApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ExpressApi* | [**generateMassOrderLabelsReport**](docs/ExpressApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ExpressApi* | [**generateOrderLabel**](docs/ExpressApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*ExpressApi* | [**generateOrderLabels**](docs/ExpressApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*ExpressApi* | [**generatePricesReport**](docs/ExpressApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ExpressApi* | [**generateShelfsStatisticsReport**](docs/ExpressApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ExpressApi* | [**generateShowsSalesReport**](docs/ExpressApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ExpressApi* | [**generateStocksOnWarehousesReport**](docs/ExpressApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ExpressApi* | [**generateUnitedMarketplaceServicesReport**](docs/ExpressApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ExpressApi* | [**generateUnitedNettingReport**](docs/ExpressApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ExpressApi* | [**generateUnitedOrdersReport**](docs/ExpressApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ExpressApi* | [**getAllOffers**](docs/ExpressApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*ExpressApi* | [**getBidsInfoForBusiness**](docs/ExpressApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*ExpressApi* | [**getBidsRecommendations**](docs/ExpressApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*ExpressApi* | [**getBusinessQuarantineOffers**](docs/ExpressApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*ExpressApi* | [**getBusinessSettings**](docs/ExpressApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*ExpressApi* | [**getCampaign**](docs/ExpressApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*ExpressApi* | [**getCampaignLogins**](docs/ExpressApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*ExpressApi* | [**getCampaignOffers**](docs/ExpressApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*ExpressApi* | [**getCampaignQuarantineOffers**](docs/ExpressApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*ExpressApi* | [**getCampaignRegion**](docs/ExpressApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*ExpressApi* | [**getCampaignSettings**](docs/ExpressApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*ExpressApi* | [**getCampaigns**](docs/ExpressApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*ExpressApi* | [**getCampaignsByLogin**](docs/ExpressApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*ExpressApi* | [**getCategoriesMaxSaleQuantum**](docs/ExpressApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*ExpressApi* | [**getCategoriesTree**](docs/ExpressApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*ExpressApi* | [**getCategoryContentParameters**](docs/ExpressApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ExpressApi* | [**getChatHistory**](docs/ExpressApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ExpressApi* | [**getChats**](docs/ExpressApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ExpressApi* | [**getDeliveryServices**](docs/ExpressApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**getFeed**](docs/ExpressApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*ExpressApi* | [**getFeedIndexLogs**](docs/ExpressApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*ExpressApi* | [**getFeedbackAndCommentUpdates**](docs/ExpressApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*ExpressApi* | [**getFeeds**](docs/ExpressApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*ExpressApi* | [**getGoodsFeedbackComments**](docs/ExpressApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*ExpressApi* | [**getGoodsFeedbacks**](docs/ExpressApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*ExpressApi* | [**getGoodsStats**](docs/ExpressApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*ExpressApi* | [**getHiddenOffers**](docs/ExpressApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ExpressApi* | [**getOfferCardsContentStatus**](docs/ExpressApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ExpressApi* | [**getOfferMappingEntries**](docs/ExpressApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*ExpressApi* | [**getOfferMappings**](docs/ExpressApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*ExpressApi* | [**getOfferRecommendations**](docs/ExpressApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*ExpressApi* | [**getOffers**](docs/ExpressApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*ExpressApi* | [**getOrder**](docs/ExpressApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*ExpressApi* | [**getOrderBusinessBuyerInfo**](docs/ExpressApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*ExpressApi* | [**getOrderBusinessDocumentsInfo**](docs/ExpressApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*ExpressApi* | [**getOrderLabelsData**](docs/ExpressApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*ExpressApi* | [**getOrders**](docs/ExpressApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*ExpressApi* | [**getOrdersStats**](docs/ExpressApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*ExpressApi* | [**getPrices**](docs/ExpressApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*ExpressApi* | [**getPricesByOfferIds**](docs/ExpressApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*ExpressApi* | [**getPromoOffers**](docs/ExpressApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*ExpressApi* | [**getPromos**](docs/ExpressApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*ExpressApi* | [**getQualityRatingDetails**](docs/ExpressApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*ExpressApi* | [**getQualityRatings**](docs/ExpressApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*ExpressApi* | [**getReportInfo**](docs/ExpressApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ExpressApi* | [**getReturn**](docs/ExpressApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ExpressApi* | [**getReturnApplication**](docs/ExpressApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ExpressApi* | [**getReturnPhoto**](docs/ExpressApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ExpressApi* | [**getReturns**](docs/ExpressApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ExpressApi* | [**getStocks**](docs/ExpressApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*ExpressApi* | [**getSuggestedOfferMappingEntries**](docs/ExpressApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*ExpressApi* | [**getSuggestedOfferMappings**](docs/ExpressApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*ExpressApi* | [**getSuggestedPrices**](docs/ExpressApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*ExpressApi* | [**getWarehouses**](docs/ExpressApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*ExpressApi* | [**provideOrderItemIdentifiers**](docs/ExpressApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*ExpressApi* | [**putBidsForBusiness**](docs/ExpressApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*ExpressApi* | [**putBidsForCampaign**](docs/ExpressApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*ExpressApi* | [**refreshFeed**](docs/ExpressApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*ExpressApi* | [**searchRegionChildren**](docs/ExpressApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*ExpressApi* | [**searchRegionsById**](docs/ExpressApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*ExpressApi* | [**searchRegionsByName**](docs/ExpressApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*ExpressApi* | [**sendFileToChat**](docs/ExpressApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ExpressApi* | [**sendMessageToChat**](docs/ExpressApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ExpressApi* | [**setFeedParams**](docs/ExpressApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*ExpressApi* | [**setOrderBoxLayout**](docs/ExpressApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*ExpressApi* | [**setOrderShipmentBoxes**](docs/ExpressApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*ExpressApi* | [**skipGoodsFeedbacksReaction**](docs/ExpressApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*ExpressApi* | [**updateBusinessPrices**](docs/ExpressApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*ExpressApi* | [**updateCampaignOffers**](docs/ExpressApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*ExpressApi* | [**updateGoodsFeedbackComment**](docs/ExpressApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*ExpressApi* | [**updateOfferContent**](docs/ExpressApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*ExpressApi* | [**updateOfferMappingEntries**](docs/ExpressApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*ExpressApi* | [**updateOfferMappings**](docs/ExpressApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*ExpressApi* | [**updateOrderItems**](docs/ExpressApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*ExpressApi* | [**updateOrderStatus**](docs/ExpressApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*ExpressApi* | [**updateOrderStatuses**](docs/ExpressApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*ExpressApi* | [**updatePrices**](docs/ExpressApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*ExpressApi* | [**updatePromoOffers**](docs/ExpressApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*ExpressApi* | [**updateStocks**](docs/ExpressApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*ExpressApi* | [**verifyOrderEac**](docs/ExpressApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*FbsApi* | [**addHiddenOffers**](docs/FbsApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbsApi* | [**addOffersToArchive**](docs/FbsApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbsApi* | [**calculateTariffs**](docs/FbsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbsApi* | [**confirmBusinessPrices**](docs/FbsApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbsApi* | [**confirmCampaignPrices**](docs/FbsApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbsApi* | [**confirmShipment**](docs/FbsApi.md#confirmShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*FbsApi* | [**createChat**](docs/FbsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbsApi* | [**deleteCampaignOffers**](docs/FbsApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbsApi* | [**deleteGoodsFeedbackComment**](docs/FbsApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbsApi* | [**deleteHiddenOffers**](docs/FbsApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbsApi* | [**deleteOffers**](docs/FbsApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbsApi* | [**deleteOffersFromArchive**](docs/FbsApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbsApi* | [**deletePromoOffers**](docs/FbsApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbsApi* | [**downloadShipmentAct**](docs/FbsApi.md#downloadShipmentAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*FbsApi* | [**downloadShipmentDiscrepancyAct**](docs/FbsApi.md#downloadShipmentDiscrepancyAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*FbsApi* | [**downloadShipmentInboundAct**](docs/FbsApi.md#downloadShipmentInboundAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*FbsApi* | [**downloadShipmentPalletLabels**](docs/FbsApi.md#downloadShipmentPalletLabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*FbsApi* | [**downloadShipmentReceptionTransferAct**](docs/FbsApi.md#downloadShipmentReceptionTransferAct) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*FbsApi* | [**downloadShipmentTransportationWaybill**](docs/FbsApi.md#downloadShipmentTransportationWaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*FbsApi* | [**generateBoostConsolidatedReport**](docs/FbsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbsApi* | [**generateCompetitorsPositionReport**](docs/FbsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbsApi* | [**generateGoodsFeedbackReport**](docs/FbsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbsApi* | [**generateGoodsRealizationReport**](docs/FbsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbsApi* | [**generateMassOrderLabelsReport**](docs/FbsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*FbsApi* | [**generateOrderLabel**](docs/FbsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*FbsApi* | [**generateOrderLabels**](docs/FbsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*FbsApi* | [**generatePricesReport**](docs/FbsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbsApi* | [**generateShelfsStatisticsReport**](docs/FbsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbsApi* | [**generateShipmentListDocumentReport**](docs/FbsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*FbsApi* | [**generateShowsSalesReport**](docs/FbsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbsApi* | [**generateStocksOnWarehousesReport**](docs/FbsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbsApi* | [**generateUnitedMarketplaceServicesReport**](docs/FbsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbsApi* | [**generateUnitedNettingReport**](docs/FbsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbsApi* | [**generateUnitedOrdersReport**](docs/FbsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbsApi* | [**getAllOffers**](docs/FbsApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbsApi* | [**getBidsInfoForBusiness**](docs/FbsApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbsApi* | [**getBidsRecommendations**](docs/FbsApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbsApi* | [**getBusinessQuarantineOffers**](docs/FbsApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbsApi* | [**getBusinessSettings**](docs/FbsApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbsApi* | [**getCampaign**](docs/FbsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbsApi* | [**getCampaignLogins**](docs/FbsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbsApi* | [**getCampaignOffers**](docs/FbsApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbsApi* | [**getCampaignQuarantineOffers**](docs/FbsApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbsApi* | [**getCampaignRegion**](docs/FbsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbsApi* | [**getCampaignSettings**](docs/FbsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbsApi* | [**getCampaigns**](docs/FbsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbsApi* | [**getCampaignsByLogin**](docs/FbsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbsApi* | [**getCategoriesMaxSaleQuantum**](docs/FbsApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbsApi* | [**getCategoriesTree**](docs/FbsApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*FbsApi* | [**getCategoryContentParameters**](docs/FbsApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbsApi* | [**getChatHistory**](docs/FbsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbsApi* | [**getChats**](docs/FbsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbsApi* | [**getDeliveryServices**](docs/FbsApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки
*FbsApi* | [**getFeed**](docs/FbsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbsApi* | [**getFeedIndexLogs**](docs/FbsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbsApi* | [**getFeedbackAndCommentUpdates**](docs/FbsApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbsApi* | [**getFeeds**](docs/FbsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbsApi* | [**getGoodsFeedbackComments**](docs/FbsApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbsApi* | [**getGoodsFeedbacks**](docs/FbsApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbsApi* | [**getGoodsStats**](docs/FbsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbsApi* | [**getHiddenOffers**](docs/FbsApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbsApi* | [**getOfferCardsContentStatus**](docs/FbsApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbsApi* | [**getOfferMappingEntries**](docs/FbsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbsApi* | [**getOfferMappings**](docs/FbsApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbsApi* | [**getOfferRecommendations**](docs/FbsApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbsApi* | [**getOffers**](docs/FbsApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbsApi* | [**getOrder**](docs/FbsApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbsApi* | [**getOrderBusinessBuyerInfo**](docs/FbsApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbsApi* | [**getOrderBusinessDocumentsInfo**](docs/FbsApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbsApi* | [**getOrderLabelsData**](docs/FbsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*FbsApi* | [**getOrders**](docs/FbsApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbsApi* | [**getOrdersStats**](docs/FbsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbsApi* | [**getPrices**](docs/FbsApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbsApi* | [**getPricesByOfferIds**](docs/FbsApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbsApi* | [**getPromoOffers**](docs/FbsApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbsApi* | [**getPromos**](docs/FbsApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbsApi* | [**getQualityRatingDetails**](docs/FbsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*FbsApi* | [**getQualityRatings**](docs/FbsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbsApi* | [**getReportInfo**](docs/FbsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbsApi* | [**getReturn**](docs/FbsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbsApi* | [**getReturnApplication**](docs/FbsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*FbsApi* | [**getReturnPhoto**](docs/FbsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbsApi* | [**getReturns**](docs/FbsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbsApi* | [**getShipment**](docs/FbsApi.md#getShipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*FbsApi* | [**getShipmentOrdersInfo**](docs/FbsApi.md#getShipmentOrdersInfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*FbsApi* | [**getStocks**](docs/FbsApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbsApi* | [**getSuggestedOfferMappingEntries**](docs/FbsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbsApi* | [**getSuggestedOfferMappings**](docs/FbsApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbsApi* | [**getSuggestedPrices**](docs/FbsApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbsApi* | [**getWarehouses**](docs/FbsApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*FbsApi* | [**provideOrderItemIdentifiers**](docs/FbsApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*FbsApi* | [**putBidsForBusiness**](docs/FbsApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbsApi* | [**putBidsForCampaign**](docs/FbsApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbsApi* | [**refreshFeed**](docs/FbsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbsApi* | [**searchRegionChildren**](docs/FbsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbsApi* | [**searchRegionsById**](docs/FbsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*FbsApi* | [**searchRegionsByName**](docs/FbsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*FbsApi* | [**searchShipments**](docs/FbsApi.md#searchShipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*FbsApi* | [**sendFileToChat**](docs/FbsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbsApi* | [**sendMessageToChat**](docs/FbsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbsApi* | [**setFeedParams**](docs/FbsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbsApi* | [**setOrderBoxLayout**](docs/FbsApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*FbsApi* | [**setOrderShipmentBoxes**](docs/FbsApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*FbsApi* | [**setShipmentPalletsCount**](docs/FbsApi.md#setShipmentPalletsCount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*FbsApi* | [**skipGoodsFeedbacksReaction**](docs/FbsApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbsApi* | [**transferOrdersFromShipment**](docs/FbsApi.md#transferOrdersFromShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*FbsApi* | [**updateBusinessPrices**](docs/FbsApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbsApi* | [**updateCampaignOffers**](docs/FbsApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbsApi* | [**updateGoodsFeedbackComment**](docs/FbsApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbsApi* | [**updateOfferContent**](docs/FbsApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbsApi* | [**updateOfferMappingEntries**](docs/FbsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbsApi* | [**updateOfferMappings**](docs/FbsApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbsApi* | [**updateOrderItems**](docs/FbsApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*FbsApi* | [**updateOrderStatus**](docs/FbsApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*FbsApi* | [**updateOrderStatuses**](docs/FbsApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*FbsApi* | [**updatePrices**](docs/FbsApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbsApi* | [**updatePromoOffers**](docs/FbsApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FbsApi* | [**updateStocks**](docs/FbsApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*FbyApi* | [**addHiddenOffers**](docs/FbyApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbyApi* | [**addOffersToArchive**](docs/FbyApi.md#addOffersToArchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbyApi* | [**calculateTariffs**](docs/FbyApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbyApi* | [**confirmBusinessPrices**](docs/FbyApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbyApi* | [**confirmCampaignPrices**](docs/FbyApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbyApi* | [**createChat**](docs/FbyApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbyApi* | [**deleteCampaignOffers**](docs/FbyApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbyApi* | [**deleteGoodsFeedbackComment**](docs/FbyApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbyApi* | [**deleteHiddenOffers**](docs/FbyApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbyApi* | [**deleteOffers**](docs/FbyApi.md#deleteOffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbyApi* | [**deleteOffersFromArchive**](docs/FbyApi.md#deleteOffersFromArchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbyApi* | [**deletePromoOffers**](docs/FbyApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbyApi* | [**generateBoostConsolidatedReport**](docs/FbyApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbyApi* | [**generateCompetitorsPositionReport**](docs/FbyApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbyApi* | [**generateGoodsFeedbackReport**](docs/FbyApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbyApi* | [**generateGoodsMovementReport**](docs/FbyApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*FbyApi* | [**generateGoodsRealizationReport**](docs/FbyApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbyApi* | [**generateGoodsTurnoverReport**](docs/FbyApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*FbyApi* | [**generatePricesReport**](docs/FbyApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbyApi* | [**generateShelfsStatisticsReport**](docs/FbyApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbyApi* | [**generateShowsSalesReport**](docs/FbyApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbyApi* | [**generateStocksOnWarehousesReport**](docs/FbyApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbyApi* | [**generateUnitedMarketplaceServicesReport**](docs/FbyApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbyApi* | [**generateUnitedNettingReport**](docs/FbyApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbyApi* | [**generateUnitedOrdersReport**](docs/FbyApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbyApi* | [**getAllOffers**](docs/FbyApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbyApi* | [**getBidsInfoForBusiness**](docs/FbyApi.md#getBidsInfoForBusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbyApi* | [**getBidsRecommendations**](docs/FbyApi.md#getBidsRecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbyApi* | [**getBusinessQuarantineOffers**](docs/FbyApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbyApi* | [**getBusinessSettings**](docs/FbyApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbyApi* | [**getCampaign**](docs/FbyApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbyApi* | [**getCampaignLogins**](docs/FbyApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbyApi* | [**getCampaignOffers**](docs/FbyApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbyApi* | [**getCampaignQuarantineOffers**](docs/FbyApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbyApi* | [**getCampaignRegion**](docs/FbyApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbyApi* | [**getCampaignSettings**](docs/FbyApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbyApi* | [**getCampaigns**](docs/FbyApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbyApi* | [**getCampaignsByLogin**](docs/FbyApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbyApi* | [**getCategoriesMaxSaleQuantum**](docs/FbyApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbyApi* | [**getCategoriesTree**](docs/FbyApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий
*FbyApi* | [**getCategoryContentParameters**](docs/FbyApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbyApi* | [**getChatHistory**](docs/FbyApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbyApi* | [**getChats**](docs/FbyApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbyApi* | [**getFeed**](docs/FbyApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbyApi* | [**getFeedIndexLogs**](docs/FbyApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbyApi* | [**getFeedbackAndCommentUpdates**](docs/FbyApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbyApi* | [**getFeeds**](docs/FbyApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbyApi* | [**getFulfillmentWarehouses**](docs/FbyApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*FbyApi* | [**getGoodsFeedbackComments**](docs/FbyApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbyApi* | [**getGoodsFeedbacks**](docs/FbyApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbyApi* | [**getGoodsStats**](docs/FbyApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbyApi* | [**getHiddenOffers**](docs/FbyApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbyApi* | [**getOfferCardsContentStatus**](docs/FbyApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbyApi* | [**getOfferMappingEntries**](docs/FbyApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbyApi* | [**getOfferMappings**](docs/FbyApi.md#getOfferMappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbyApi* | [**getOfferRecommendations**](docs/FbyApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbyApi* | [**getOffers**](docs/FbyApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbyApi* | [**getOrder**](docs/FbyApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbyApi* | [**getOrderBusinessBuyerInfo**](docs/FbyApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbyApi* | [**getOrderBusinessDocumentsInfo**](docs/FbyApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbyApi* | [**getOrders**](docs/FbyApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbyApi* | [**getOrdersStats**](docs/FbyApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbyApi* | [**getPrices**](docs/FbyApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbyApi* | [**getPricesByOfferIds**](docs/FbyApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbyApi* | [**getPromoOffers**](docs/FbyApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbyApi* | [**getPromos**](docs/FbyApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbyApi* | [**getQualityRatings**](docs/FbyApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbyApi* | [**getReportInfo**](docs/FbyApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbyApi* | [**getReturn**](docs/FbyApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbyApi* | [**getReturnPhoto**](docs/FbyApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbyApi* | [**getReturns**](docs/FbyApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbyApi* | [**getStocks**](docs/FbyApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbyApi* | [**getSuggestedOfferMappingEntries**](docs/FbyApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbyApi* | [**getSuggestedOfferMappings**](docs/FbyApi.md#getSuggestedOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbyApi* | [**getSuggestedPrices**](docs/FbyApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbyApi* | [**putBidsForBusiness**](docs/FbyApi.md#putBidsForBusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbyApi* | [**putBidsForCampaign**](docs/FbyApi.md#putBidsForCampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbyApi* | [**refreshFeed**](docs/FbyApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbyApi* | [**searchRegionChildren**](docs/FbyApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbyApi* | [**searchRegionsById**](docs/FbyApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*FbyApi* | [**searchRegionsByName**](docs/FbyApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*FbyApi* | [**sendFileToChat**](docs/FbyApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbyApi* | [**sendMessageToChat**](docs/FbyApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbyApi* | [**setFeedParams**](docs/FbyApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbyApi* | [**skipGoodsFeedbacksReaction**](docs/FbyApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbyApi* | [**updateBusinessPrices**](docs/FbyApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbyApi* | [**updateCampaignOffers**](docs/FbyApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbyApi* | [**updateGoodsFeedbackComment**](docs/FbyApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbyApi* | [**updateOfferContent**](docs/FbyApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbyApi* | [**updateOfferMappingEntries**](docs/FbyApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbyApi* | [**updateOfferMappings**](docs/FbyApi.md#updateOfferMappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbyApi* | [**updatePrices**](docs/FbyApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbyApi* | [**updatePromoOffers**](docs/FbyApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FeedbacksApi* | [**getFeedbackAndCommentUpdates**](docs/FeedbacksApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FeedsApi* | [**getFeed**](docs/FeedsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FeedsApi* | [**getFeedIndexLogs**](docs/FeedsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FeedsApi* | [**getFeeds**](docs/FeedsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FeedsApi* | [**refreshFeed**](docs/FeedsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FeedsApi* | [**setFeedParams**](docs/FeedsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*GoodsFeedbackApi* | [**deleteGoodsFeedbackComment**](docs/GoodsFeedbackApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbackComments**](docs/GoodsFeedbackApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbacks**](docs/GoodsFeedbackApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*GoodsFeedbackApi* | [**skipGoodsFeedbacksReaction**](docs/GoodsFeedbackApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*GoodsFeedbackApi* | [**updateGoodsFeedbackComment**](docs/GoodsFeedbackApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*GoodsStatsApi* | [**getGoodsStats**](docs/GoodsStatsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*HiddenOffersApi* | [**addHiddenOffers**](docs/HiddenOffersApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*HiddenOffersApi* | [**deleteHiddenOffers**](docs/HiddenOffersApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*HiddenOffersApi* | [**getHiddenOffers**](docs/HiddenOffersApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ModelsApi* | [**getModel**](docs/ModelsApi.md#getModel) | **GET** /models/{modelId} | Информация об одной модели
*ModelsApi* | [**getModelOffers**](docs/ModelsApi.md#getModelOffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*ModelsApi* | [**getModels**](docs/ModelsApi.md#getModels) | **POST** /models | Информация о нескольких моделях
*ModelsApi* | [**getModelsOffers**](docs/ModelsApi.md#getModelsOffers) | **POST** /models/offers | Список предложений для нескольких моделей
*ModelsApi* | [**searchModels**](docs/ModelsApi.md#searchModels) | **GET** /models | Поиск модели товара
*OfferMappingsApi* | [**getOfferMappingEntries**](docs/OfferMappingsApi.md#getOfferMappingEntries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OfferMappingsApi* | [**getSuggestedOfferMappingEntries**](docs/OfferMappingsApi.md#getSuggestedOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OfferMappingsApi* | [**updateOfferMappingEntries**](docs/OfferMappingsApi.md#updateOfferMappingEntries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OffersApi* | [**deleteCampaignOffers**](docs/OffersApi.md#deleteCampaignOffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OffersApi* | [**getAllOffers**](docs/OffersApi.md#getAllOffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OffersApi* | [**getCampaignOffers**](docs/OffersApi.md#getCampaignOffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OffersApi* | [**getOfferRecommendations**](docs/OffersApi.md#getOfferRecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OffersApi* | [**getOffers**](docs/OffersApi.md#getOffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OffersApi* | [**updateCampaignOffers**](docs/OffersApi.md#updateCampaignOffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OrderBusinessInformationApi* | [**getOrderBusinessBuyerInfo**](docs/OrderBusinessInformationApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OrderBusinessInformationApi* | [**getOrderBusinessDocumentsInfo**](docs/OrderBusinessInformationApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OrderDeliveryApi* | [**getOrderBuyerInfo**](docs/OrderDeliveryApi.md#getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*OrderDeliveryApi* | [**setOrderDeliveryDate**](docs/OrderDeliveryApi.md#setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*OrderDeliveryApi* | [**setOrderDeliveryTrackCode**](docs/OrderDeliveryApi.md#setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*OrderDeliveryApi* | [**updateOrderStorageLimit**](docs/OrderDeliveryApi.md#updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*OrderDeliveryApi* | [**verifyOrderEac**](docs/OrderDeliveryApi.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*OrderLabelsApi* | [**generateOrderLabel**](docs/OrderLabelsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OrderLabelsApi* | [**generateOrderLabels**](docs/OrderLabelsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OrderLabelsApi* | [**getOrderLabelsData**](docs/OrderLabelsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OrdersApi* | [**acceptOrderCancellation**](docs/OrdersApi.md#acceptOrderCancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getOrder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OrdersApi* | [**getOrders**](docs/OrdersApi.md#getOrders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OrdersApi* | [**provideOrderDigitalCodes**](docs/OrdersApi.md#provideOrderDigitalCodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*OrdersApi* | [**provideOrderItemIdentifiers**](docs/OrdersApi.md#provideOrderItemIdentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OrdersApi* | [**setOrderBoxLayout**](docs/OrdersApi.md#setOrderBoxLayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OrdersApi* | [**setOrderShipmentBoxes**](docs/OrdersApi.md#setOrderShipmentBoxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OrdersApi* | [**updateOrderItems**](docs/OrdersApi.md#updateOrderItems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OrdersApi* | [**updateOrderStatus**](docs/OrdersApi.md#updateOrderStatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OrdersApi* | [**updateOrderStatuses**](docs/OrdersApi.md#updateOrderStatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OrdersStatsApi* | [**getOrdersStats**](docs/OrdersStatsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OutletLicensesApi* | [**deleteOutletLicenses**](docs/OutletLicensesApi.md#deleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*OutletLicensesApi* | [**getOutletLicenses**](docs/OutletLicensesApi.md#getOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*OutletLicensesApi* | [**updateOutletLicenses**](docs/OutletLicensesApi.md#updateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*OutletsApi* | [**createOutlet**](docs/OutletsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*OutletsApi* | [**deleteOutlet**](docs/OutletsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*OutletsApi* | [**getOutlet**](docs/OutletsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*OutletsApi* | [**getOutlets**](docs/OutletsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*OutletsApi* | [**updateOutlet**](docs/OutletsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*PriceQuarantineApi* | [**confirmBusinessPrices**](docs/PriceQuarantineApi.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*PriceQuarantineApi* | [**confirmCampaignPrices**](docs/PriceQuarantineApi.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*PriceQuarantineApi* | [**getBusinessQuarantineOffers**](docs/PriceQuarantineApi.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*PriceQuarantineApi* | [**getCampaignQuarantineOffers**](docs/PriceQuarantineApi.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*PricesApi* | [**getPrices**](docs/PricesApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*PricesApi* | [**getPricesByOfferIds**](docs/PricesApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*PricesApi* | [**getSuggestedPrices**](docs/PricesApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*PricesApi* | [**updateBusinessPrices**](docs/PricesApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*PricesApi* | [**updatePrices**](docs/PricesApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*PromosApi* | [**deletePromoOffers**](docs/PromosApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*PromosApi* | [**getPromoOffers**](docs/PromosApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*PromosApi* | [**getPromos**](docs/PromosApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*PromosApi* | [**updatePromoOffers**](docs/PromosApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*RatingsApi* | [**getQualityRatingDetails**](docs/RatingsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*RatingsApi* | [**getQualityRatings**](docs/RatingsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*RegionsApi* | [**searchRegionChildren**](docs/RegionsApi.md#searchRegionChildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*RegionsApi* | [**searchRegionsById**](docs/RegionsApi.md#searchRegionsById) | **GET** /regions/{regionId} | Информация о регионе
*RegionsApi* | [**searchRegionsByName**](docs/RegionsApi.md#searchRegionsByName) | **GET** /regions | Поиск регионов по их имени
*ReportsApi* | [**generateBoostConsolidatedReport**](docs/ReportsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ReportsApi* | [**generateCompetitorsPositionReport**](docs/ReportsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ReportsApi* | [**generateGoodsFeedbackReport**](docs/ReportsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ReportsApi* | [**generateGoodsMovementReport**](docs/ReportsApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*ReportsApi* | [**generateGoodsRealizationReport**](docs/ReportsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ReportsApi* | [**generateGoodsTurnoverReport**](docs/ReportsApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*ReportsApi* | [**generateMassOrderLabelsReport**](docs/ReportsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ReportsApi* | [**generatePricesReport**](docs/ReportsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ReportsApi* | [**generateShelfsStatisticsReport**](docs/ReportsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ReportsApi* | [**generateShipmentListDocumentReport**](docs/ReportsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*ReportsApi* | [**generateShowsSalesReport**](docs/ReportsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ReportsApi* | [**generateStocksOnWarehousesReport**](docs/ReportsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ReportsApi* | [**generateUnitedMarketplaceServicesReport**](docs/ReportsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ReportsApi* | [**generateUnitedNettingReport**](docs/ReportsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ReportsApi* | [**generateUnitedOrdersReport**](docs/ReportsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ReportsApi* | [**getReportInfo**](docs/ReportsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ReturnsApi* | [**getReturn**](docs/ReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ReturnsApi* | [**getReturnApplication**](docs/ReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ReturnsApi* | [**getReturnPhoto**](docs/ReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ReturnsApi* | [**getReturns**](docs/ReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ReturnsApi* | [**setReturnDecision**](docs/ReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*ReturnsApi* | [**submitReturnDecision**](docs/ReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*ShipmentsApi* | [**confirmShipment**](docs/ShipmentsApi.md#confirmShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*ShipmentsApi* | [**downloadShipmentAct**](docs/ShipmentsApi.md#downloadShipmentAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*ShipmentsApi* | [**downloadShipmentDiscrepancyAct**](docs/ShipmentsApi.md#downloadShipmentDiscrepancyAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*ShipmentsApi* | [**downloadShipmentInboundAct**](docs/ShipmentsApi.md#downloadShipmentInboundAct) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*ShipmentsApi* | [**downloadShipmentPalletLabels**](docs/ShipmentsApi.md#downloadShipmentPalletLabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*ShipmentsApi* | [**downloadShipmentReceptionTransferAct**](docs/ShipmentsApi.md#downloadShipmentReceptionTransferAct) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*ShipmentsApi* | [**downloadShipmentTransportationWaybill**](docs/ShipmentsApi.md#downloadShipmentTransportationWaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*ShipmentsApi* | [**getShipment**](docs/ShipmentsApi.md#getShipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*ShipmentsApi* | [**getShipmentOrdersInfo**](docs/ShipmentsApi.md#getShipmentOrdersInfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*ShipmentsApi* | [**searchShipments**](docs/ShipmentsApi.md#searchShipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*ShipmentsApi* | [**setShipmentPalletsCount**](docs/ShipmentsApi.md#setShipmentPalletsCount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*ShipmentsApi* | [**transferOrdersFromShipment**](docs/ShipmentsApi.md#transferOrdersFromShipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*StocksApi* | [**getStocks**](docs/StocksApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*StocksApi* | [**updateStocks**](docs/StocksApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*TariffsApi* | [**calculateTariffs**](docs/TariffsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*WarehousesApi* | [**getFulfillmentWarehouses**](docs/WarehousesApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*WarehousesApi* | [**getWarehouses**](docs/WarehousesApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


## Documentation for Models

 - [AcceptOrderCancellationRequest](docs/AcceptOrderCancellationRequest.md)
 - [AddHiddenOffersRequest](docs/AddHiddenOffersRequest.md)
 - [AddOffersToArchiveDTO](docs/AddOffersToArchiveDTO.md)
 - [AddOffersToArchiveErrorDTO](docs/AddOffersToArchiveErrorDTO.md)
 - [AddOffersToArchiveErrorType](docs/AddOffersToArchiveErrorType.md)
 - [AddOffersToArchiveRequest](docs/AddOffersToArchiveRequest.md)
 - [AddOffersToArchiveResponse](docs/AddOffersToArchiveResponse.md)
 - [AffectedOrderQualityRatingComponentType](docs/AffectedOrderQualityRatingComponentType.md)
 - [AgeDTO](docs/AgeDTO.md)
 - [AgeUnitType](docs/AgeUnitType.md)
 - [ApiClientDataErrorResponse](docs/ApiClientDataErrorResponse.md)
 - [ApiErrorDTO](docs/ApiErrorDTO.md)
 - [ApiErrorResponse](docs/ApiErrorResponse.md)
 - [ApiForbiddenErrorResponse](docs/ApiForbiddenErrorResponse.md)
 - [ApiLimitErrorResponse](docs/ApiLimitErrorResponse.md)
 - [ApiLockedErrorResponse](docs/ApiLockedErrorResponse.md)
 - [ApiNotFoundErrorResponse](docs/ApiNotFoundErrorResponse.md)
 - [ApiResponse](docs/ApiResponse.md)
 - [ApiResponseStatusType](docs/ApiResponseStatusType.md)
 - [ApiServerErrorResponse](docs/ApiServerErrorResponse.md)
 - [ApiUnauthorizedErrorResponse](docs/ApiUnauthorizedErrorResponse.md)
 - [BaseCampaignOfferDTO](docs/BaseCampaignOfferDTO.md)
 - [BaseOfferDTO](docs/BaseOfferDTO.md)
 - [BasePriceDTO](docs/BasePriceDTO.md)
 - [BaseShipmentDTO](docs/BaseShipmentDTO.md)
 - [BidRecommendationItemDTO](docs/BidRecommendationItemDTO.md)
 - [BriefOrderItemDTO](docs/BriefOrderItemDTO.md)
 - [BriefOrderItemInstanceDTO](docs/BriefOrderItemInstanceDTO.md)
 - [BusinessDTO](docs/BusinessDTO.md)
 - [BusinessSettingsDTO](docs/BusinessSettingsDTO.md)
 - [CalculateTariffsOfferDTO](docs/CalculateTariffsOfferDTO.md)
 - [CalculateTariffsOfferInfoDTO](docs/CalculateTariffsOfferInfoDTO.md)
 - [CalculateTariffsParametersDTO](docs/CalculateTariffsParametersDTO.md)
 - [CalculateTariffsRequest](docs/CalculateTariffsRequest.md)
 - [CalculateTariffsResponse](docs/CalculateTariffsResponse.md)
 - [CalculateTariffsResponseDTO](docs/CalculateTariffsResponseDTO.md)
 - [CalculatedTariffDTO](docs/CalculatedTariffDTO.md)
 - [CalculatedTariffType](docs/CalculatedTariffType.md)
 - [CampaignDTO](docs/CampaignDTO.md)
 - [CampaignQualityRatingDTO](docs/CampaignQualityRatingDTO.md)
 - [CampaignSettingsDTO](docs/CampaignSettingsDTO.md)
 - [CampaignSettingsDeliveryDTO](docs/CampaignSettingsDeliveryDTO.md)
 - [CampaignSettingsLocalRegionDTO](docs/CampaignSettingsLocalRegionDTO.md)
 - [CampaignSettingsScheduleDTO](docs/CampaignSettingsScheduleDTO.md)
 - [CampaignSettingsScheduleSourceType](docs/CampaignSettingsScheduleSourceType.md)
 - [CampaignSettingsTimePeriodDTO](docs/CampaignSettingsTimePeriodDTO.md)
 - [CampaignsQualityRatingDTO](docs/CampaignsQualityRatingDTO.md)
 - [CategoryContentParametersDTO](docs/CategoryContentParametersDTO.md)
 - [CategoryDTO](docs/CategoryDTO.md)
 - [CategoryErrorDTO](docs/CategoryErrorDTO.md)
 - [CategoryErrorType](docs/CategoryErrorType.md)
 - [CategoryParameterDTO](docs/CategoryParameterDTO.md)
 - [CategoryParameterUnitDTO](docs/CategoryParameterUnitDTO.md)
 - [ChangeOutletRequest](docs/ChangeOutletRequest.md)
 - [ChannelType](docs/ChannelType.md)
 - [ChatMessageDTO](docs/ChatMessageDTO.md)
 - [ChatMessagePayloadDTO](docs/ChatMessagePayloadDTO.md)
 - [ChatMessageSenderType](docs/ChatMessageSenderType.md)
 - [ChatMessagesResultDTO](docs/ChatMessagesResultDTO.md)
 - [ChatStatusType](docs/ChatStatusType.md)
 - [ChatType](docs/ChatType.md)
 - [ConfirmPricesRequest](docs/ConfirmPricesRequest.md)
 - [ConfirmShipmentRequest](docs/ConfirmShipmentRequest.md)
 - [CreateChatRequest](docs/CreateChatRequest.md)
 - [CreateChatResponse](docs/CreateChatResponse.md)
 - [CreateChatResultDTO](docs/CreateChatResultDTO.md)
 - [CreateOutletResponse](docs/CreateOutletResponse.md)
 - [CurrencyType](docs/CurrencyType.md)
 - [DayOfWeekType](docs/DayOfWeekType.md)
 - [DeleteCampaignOffersDTO](docs/DeleteCampaignOffersDTO.md)
 - [DeleteCampaignOffersRequest](docs/DeleteCampaignOffersRequest.md)
 - [DeleteCampaignOffersResponse](docs/DeleteCampaignOffersResponse.md)
 - [DeleteGoodsFeedbackCommentRequest](docs/DeleteGoodsFeedbackCommentRequest.md)
 - [DeleteHiddenOffersRequest](docs/DeleteHiddenOffersRequest.md)
 - [DeleteOffersDTO](docs/DeleteOffersDTO.md)
 - [DeleteOffersFromArchiveDTO](docs/DeleteOffersFromArchiveDTO.md)
 - [DeleteOffersFromArchiveRequest](docs/DeleteOffersFromArchiveRequest.md)
 - [DeleteOffersFromArchiveResponse](docs/DeleteOffersFromArchiveResponse.md)
 - [DeleteOffersRequest](docs/DeleteOffersRequest.md)
 - [DeleteOffersResponse](docs/DeleteOffersResponse.md)
 - [DeletePromoOffersRequest](docs/DeletePromoOffersRequest.md)
 - [DeletePromoOffersResponse](docs/DeletePromoOffersResponse.md)
 - [DeletePromoOffersResultDTO](docs/DeletePromoOffersResultDTO.md)
 - [DeliveryServiceDTO](docs/DeliveryServiceDTO.md)
 - [DeliveryServiceInfoDTO](docs/DeliveryServiceInfoDTO.md)
 - [DeliveryServicesDTO](docs/DeliveryServicesDTO.md)
 - [DocumentDTO](docs/DocumentDTO.md)
 - [EacVerificationResultDTO](docs/EacVerificationResultDTO.md)
 - [EacVerificationStatusType](docs/EacVerificationStatusType.md)
 - [EmptyApiResponse](docs/EmptyApiResponse.md)
 - [EnrichedMappingsOfferDTO](docs/EnrichedMappingsOfferDTO.md)
 - [EnrichedModelDTO](docs/EnrichedModelDTO.md)
 - [EnrichedModelsDTO](docs/EnrichedModelsDTO.md)
 - [EnrichedOrderBoxLayoutDTO](docs/EnrichedOrderBoxLayoutDTO.md)
 - [ExtensionShipmentDTO](docs/ExtensionShipmentDTO.md)
 - [FeedContentDTO](docs/FeedContentDTO.md)
 - [FeedContentErrorDTO](docs/FeedContentErrorDTO.md)
 - [FeedContentErrorType](docs/FeedContentErrorType.md)
 - [FeedDTO](docs/FeedDTO.md)
 - [FeedDownloadDTO](docs/FeedDownloadDTO.md)
 - [FeedDownloadErrorDTO](docs/FeedDownloadErrorDTO.md)
 - [FeedDownloadErrorType](docs/FeedDownloadErrorType.md)
 - [FeedIndexLogsErrorDTO](docs/FeedIndexLogsErrorDTO.md)
 - [FeedIndexLogsErrorType](docs/FeedIndexLogsErrorType.md)
 - [FeedIndexLogsFeedDTO](docs/FeedIndexLogsFeedDTO.md)
 - [FeedIndexLogsIndexType](docs/FeedIndexLogsIndexType.md)
 - [FeedIndexLogsOffersDTO](docs/FeedIndexLogsOffersDTO.md)
 - [FeedIndexLogsRecordDTO](docs/FeedIndexLogsRecordDTO.md)
 - [FeedIndexLogsResultDTO](docs/FeedIndexLogsResultDTO.md)
 - [FeedIndexLogsStatusType](docs/FeedIndexLogsStatusType.md)
 - [FeedParameterDTO](docs/FeedParameterDTO.md)
 - [FeedPlacementDTO](docs/FeedPlacementDTO.md)
 - [FeedPublicationDTO](docs/FeedPublicationDTO.md)
 - [FeedPublicationFullDTO](docs/FeedPublicationFullDTO.md)
 - [FeedPublicationPriceAndStockUpdateDTO](docs/FeedPublicationPriceAndStockUpdateDTO.md)
 - [FeedStatusType](docs/FeedStatusType.md)
 - [FeedbackAuthorDTO](docs/FeedbackAuthorDTO.md)
 - [FeedbackCommentAuthorDTO](docs/FeedbackCommentAuthorDTO.md)
 - [FeedbackCommentAuthorType](docs/FeedbackCommentAuthorType.md)
 - [FeedbackCommentDTO](docs/FeedbackCommentDTO.md)
 - [FeedbackDTO](docs/FeedbackDTO.md)
 - [FeedbackDeliveryType](docs/FeedbackDeliveryType.md)
 - [FeedbackFactorDTO](docs/FeedbackFactorDTO.md)
 - [FeedbackGradesDTO](docs/FeedbackGradesDTO.md)
 - [FeedbackListDTO](docs/FeedbackListDTO.md)
 - [FeedbackOrderDTO](docs/FeedbackOrderDTO.md)
 - [FeedbackReactionStatusType](docs/FeedbackReactionStatusType.md)
 - [FeedbackShopDTO](docs/FeedbackShopDTO.md)
 - [FeedbackStateType](docs/FeedbackStateType.md)
 - [FieldStateType](docs/FieldStateType.md)
 - [FlippingPagerDTO](docs/FlippingPagerDTO.md)
 - [ForwardScrollingPagerDTO](docs/ForwardScrollingPagerDTO.md)
 - [FulfillmentWarehouseDTO](docs/FulfillmentWarehouseDTO.md)
 - [FulfillmentWarehousesDTO](docs/FulfillmentWarehousesDTO.md)
 - [FullOutletDTO](docs/FullOutletDTO.md)
 - [FullOutletLicenseDTO](docs/FullOutletLicenseDTO.md)
 - [GenerateBoostConsolidatedRequest](docs/GenerateBoostConsolidatedRequest.md)
 - [GenerateCompetitorsPositionReportRequest](docs/GenerateCompetitorsPositionReportRequest.md)
 - [GenerateGoodsFeedbackRequest](docs/GenerateGoodsFeedbackRequest.md)
 - [GenerateGoodsMovementReportRequest](docs/GenerateGoodsMovementReportRequest.md)
 - [GenerateGoodsRealizationReportRequest](docs/GenerateGoodsRealizationReportRequest.md)
 - [GenerateGoodsTurnoverRequest](docs/GenerateGoodsTurnoverRequest.md)
 - [GenerateMassOrderLabelsRequest](docs/GenerateMassOrderLabelsRequest.md)
 - [GeneratePricesReportRequest](docs/GeneratePricesReportRequest.md)
 - [GenerateReportDTO](docs/GenerateReportDTO.md)
 - [GenerateReportResponse](docs/GenerateReportResponse.md)
 - [GenerateShelfsStatisticsRequest](docs/GenerateShelfsStatisticsRequest.md)
 - [GenerateShipmentListDocumentReportRequest](docs/GenerateShipmentListDocumentReportRequest.md)
 - [GenerateShowsSalesReportRequest](docs/GenerateShowsSalesReportRequest.md)
 - [GenerateStocksOnWarehousesReportRequest](docs/GenerateStocksOnWarehousesReportRequest.md)
 - [GenerateUnitedMarketplaceServicesReportRequest](docs/GenerateUnitedMarketplaceServicesReportRequest.md)
 - [GenerateUnitedNettingReportRequest](docs/GenerateUnitedNettingReportRequest.md)
 - [GenerateUnitedOrdersRequest](docs/GenerateUnitedOrdersRequest.md)
 - [GetAllOffersResponse](docs/GetAllOffersResponse.md)
 - [GetBidsInfoRequest](docs/GetBidsInfoRequest.md)
 - [GetBidsInfoResponse](docs/GetBidsInfoResponse.md)
 - [GetBidsInfoResponseDTO](docs/GetBidsInfoResponseDTO.md)
 - [GetBidsRecommendationsRequest](docs/GetBidsRecommendationsRequest.md)
 - [GetBidsRecommendationsResponse](docs/GetBidsRecommendationsResponse.md)
 - [GetBidsRecommendationsResponseDTO](docs/GetBidsRecommendationsResponseDTO.md)
 - [GetBusinessBuyerInfoResponse](docs/GetBusinessBuyerInfoResponse.md)
 - [GetBusinessDocumentsInfoResponse](docs/GetBusinessDocumentsInfoResponse.md)
 - [GetBusinessSettingsInfoDTO](docs/GetBusinessSettingsInfoDTO.md)
 - [GetBusinessSettingsResponse](docs/GetBusinessSettingsResponse.md)
 - [GetCampaignLoginsResponse](docs/GetCampaignLoginsResponse.md)
 - [GetCampaignOfferDTO](docs/GetCampaignOfferDTO.md)
 - [GetCampaignOffersRequest](docs/GetCampaignOffersRequest.md)
 - [GetCampaignOffersResponse](docs/GetCampaignOffersResponse.md)
 - [GetCampaignOffersResultDTO](docs/GetCampaignOffersResultDTO.md)
 - [GetCampaignRegionResponse](docs/GetCampaignRegionResponse.md)
 - [GetCampaignResponse](docs/GetCampaignResponse.md)
 - [GetCampaignSettingsResponse](docs/GetCampaignSettingsResponse.md)
 - [GetCampaignsResponse](docs/GetCampaignsResponse.md)
 - [GetCategoriesMaxSaleQuantumDTO](docs/GetCategoriesMaxSaleQuantumDTO.md)
 - [GetCategoriesMaxSaleQuantumRequest](docs/GetCategoriesMaxSaleQuantumRequest.md)
 - [GetCategoriesMaxSaleQuantumResponse](docs/GetCategoriesMaxSaleQuantumResponse.md)
 - [GetCategoriesRequest](docs/GetCategoriesRequest.md)
 - [GetCategoriesResponse](docs/GetCategoriesResponse.md)
 - [GetCategoryContentParametersResponse](docs/GetCategoryContentParametersResponse.md)
 - [GetChatHistoryRequest](docs/GetChatHistoryRequest.md)
 - [GetChatHistoryResponse](docs/GetChatHistoryResponse.md)
 - [GetChatInfoDTO](docs/GetChatInfoDTO.md)
 - [GetChatsInfoDTO](docs/GetChatsInfoDTO.md)
 - [GetChatsRequest](docs/GetChatsRequest.md)
 - [GetChatsResponse](docs/GetChatsResponse.md)
 - [GetDeliveryServicesResponse](docs/GetDeliveryServicesResponse.md)
 - [GetFeedIndexLogsResponse](docs/GetFeedIndexLogsResponse.md)
 - [GetFeedResponse](docs/GetFeedResponse.md)
 - [GetFeedbackListResponse](docs/GetFeedbackListResponse.md)
 - [GetFeedsResponse](docs/GetFeedsResponse.md)
 - [GetFulfillmentWarehousesResponse](docs/GetFulfillmentWarehousesResponse.md)
 - [GetGoodsFeedbackCommentsRequest](docs/GetGoodsFeedbackCommentsRequest.md)
 - [GetGoodsFeedbackCommentsResponse](docs/GetGoodsFeedbackCommentsResponse.md)
 - [GetGoodsFeedbackRequest](docs/GetGoodsFeedbackRequest.md)
 - [GetGoodsFeedbackResponse](docs/GetGoodsFeedbackResponse.md)
 - [GetGoodsStatsRequest](docs/GetGoodsStatsRequest.md)
 - [GetGoodsStatsResponse](docs/GetGoodsStatsResponse.md)
 - [GetHiddenOffersResponse](docs/GetHiddenOffersResponse.md)
 - [GetHiddenOffersResultDTO](docs/GetHiddenOffersResultDTO.md)
 - [GetMappingDTO](docs/GetMappingDTO.md)
 - [GetModelsOffersResponse](docs/GetModelsOffersResponse.md)
 - [GetModelsRequest](docs/GetModelsRequest.md)
 - [GetModelsResponse](docs/GetModelsResponse.md)
 - [GetOfferCardsContentStatusRequest](docs/GetOfferCardsContentStatusRequest.md)
 - [GetOfferCardsContentStatusResponse](docs/GetOfferCardsContentStatusResponse.md)
 - [GetOfferDTO](docs/GetOfferDTO.md)
 - [GetOfferMappingDTO](docs/GetOfferMappingDTO.md)
 - [GetOfferMappingEntriesResponse](docs/GetOfferMappingEntriesResponse.md)
 - [GetOfferMappingsRequest](docs/GetOfferMappingsRequest.md)
 - [GetOfferMappingsResponse](docs/GetOfferMappingsResponse.md)
 - [GetOfferMappingsResultDTO](docs/GetOfferMappingsResultDTO.md)
 - [GetOfferRecommendationsRequest](docs/GetOfferRecommendationsRequest.md)
 - [GetOfferRecommendationsResponse](docs/GetOfferRecommendationsResponse.md)
 - [GetOffersResponse](docs/GetOffersResponse.md)
 - [GetOrderBuyerInfoResponse](docs/GetOrderBuyerInfoResponse.md)
 - [GetOrderLabelsDataResponse](docs/GetOrderLabelsDataResponse.md)
 - [GetOrderResponse](docs/GetOrderResponse.md)
 - [GetOrdersResponse](docs/GetOrdersResponse.md)
 - [GetOrdersStatsRequest](docs/GetOrdersStatsRequest.md)
 - [GetOrdersStatsResponse](docs/GetOrdersStatsResponse.md)
 - [GetOutletLicensesResponse](docs/GetOutletLicensesResponse.md)
 - [GetOutletResponse](docs/GetOutletResponse.md)
 - [GetOutletsResponse](docs/GetOutletsResponse.md)
 - [GetPriceDTO](docs/GetPriceDTO.md)
 - [GetPriceWithDiscountDTO](docs/GetPriceWithDiscountDTO.md)
 - [GetPriceWithVatDTO](docs/GetPriceWithVatDTO.md)
 - [GetPricesByOfferIdsRequest](docs/GetPricesByOfferIdsRequest.md)
 - [GetPricesByOfferIdsResponse](docs/GetPricesByOfferIdsResponse.md)
 - [GetPricesResponse](docs/GetPricesResponse.md)
 - [GetPromoAssortmentInfoDTO](docs/GetPromoAssortmentInfoDTO.md)
 - [GetPromoBestsellerInfoDTO](docs/GetPromoBestsellerInfoDTO.md)
 - [GetPromoConstraintsDTO](docs/GetPromoConstraintsDTO.md)
 - [GetPromoDTO](docs/GetPromoDTO.md)
 - [GetPromoMechanicsInfoDTO](docs/GetPromoMechanicsInfoDTO.md)
 - [GetPromoOfferDTO](docs/GetPromoOfferDTO.md)
 - [GetPromoOffersRequest](docs/GetPromoOffersRequest.md)
 - [GetPromoOffersResponse](docs/GetPromoOffersResponse.md)
 - [GetPromoOffersResultDTO](docs/GetPromoOffersResultDTO.md)
 - [GetPromoPromocodeInfoDTO](docs/GetPromoPromocodeInfoDTO.md)
 - [GetPromosRequest](docs/GetPromosRequest.md)
 - [GetPromosResponse](docs/GetPromosResponse.md)
 - [GetPromosResultDTO](docs/GetPromosResultDTO.md)
 - [GetQualityRatingDetailsResponse](docs/GetQualityRatingDetailsResponse.md)
 - [GetQualityRatingRequest](docs/GetQualityRatingRequest.md)
 - [GetQualityRatingResponse](docs/GetQualityRatingResponse.md)
 - [GetQuarantineOffersRequest](docs/GetQuarantineOffersRequest.md)
 - [GetQuarantineOffersResponse](docs/GetQuarantineOffersResponse.md)
 - [GetQuarantineOffersResultDTO](docs/GetQuarantineOffersResultDTO.md)
 - [GetRegionWithChildrenResponse](docs/GetRegionWithChildrenResponse.md)
 - [GetRegionsResponse](docs/GetRegionsResponse.md)
 - [GetReportInfoResponse](docs/GetReportInfoResponse.md)
 - [GetReturnResponse](docs/GetReturnResponse.md)
 - [GetReturnsResponse](docs/GetReturnsResponse.md)
 - [GetShipmentOrdersInfoResponse](docs/GetShipmentOrdersInfoResponse.md)
 - [GetShipmentResponse](docs/GetShipmentResponse.md)
 - [GetSuggestedOfferMappingEntriesRequest](docs/GetSuggestedOfferMappingEntriesRequest.md)
 - [GetSuggestedOfferMappingEntriesResponse](docs/GetSuggestedOfferMappingEntriesResponse.md)
 - [GetSuggestedOfferMappingsRequest](docs/GetSuggestedOfferMappingsRequest.md)
 - [GetSuggestedOfferMappingsResponse](docs/GetSuggestedOfferMappingsResponse.md)
 - [GetSuggestedOfferMappingsResultDTO](docs/GetSuggestedOfferMappingsResultDTO.md)
 - [GetWarehouseStocksDTO](docs/GetWarehouseStocksDTO.md)
 - [GetWarehouseStocksRequest](docs/GetWarehouseStocksRequest.md)
 - [GetWarehouseStocksResponse](docs/GetWarehouseStocksResponse.md)
 - [GetWarehousesResponse](docs/GetWarehousesResponse.md)
 - [GoodsFeedbackCommentAuthorDTO](docs/GoodsFeedbackCommentAuthorDTO.md)
 - [GoodsFeedbackCommentAuthorType](docs/GoodsFeedbackCommentAuthorType.md)
 - [GoodsFeedbackCommentDTO](docs/GoodsFeedbackCommentDTO.md)
 - [GoodsFeedbackCommentListDTO](docs/GoodsFeedbackCommentListDTO.md)
 - [GoodsFeedbackCommentStatusType](docs/GoodsFeedbackCommentStatusType.md)
 - [GoodsFeedbackDTO](docs/GoodsFeedbackDTO.md)
 - [GoodsFeedbackDescriptionDTO](docs/GoodsFeedbackDescriptionDTO.md)
 - [GoodsFeedbackIdentifiersDTO](docs/GoodsFeedbackIdentifiersDTO.md)
 - [GoodsFeedbackListDTO](docs/GoodsFeedbackListDTO.md)
 - [GoodsFeedbackMediaDTO](docs/GoodsFeedbackMediaDTO.md)
 - [GoodsFeedbackStatisticsDTO](docs/GoodsFeedbackStatisticsDTO.md)
 - [GoodsStatsDTO](docs/GoodsStatsDTO.md)
 - [GoodsStatsGoodsDTO](docs/GoodsStatsGoodsDTO.md)
 - [GoodsStatsWarehouseDTO](docs/GoodsStatsWarehouseDTO.md)
 - [GoodsStatsWeightDimensionsDTO](docs/GoodsStatsWeightDimensionsDTO.md)
 - [GpsDTO](docs/GpsDTO.md)
 - [HiddenOfferDTO](docs/HiddenOfferDTO.md)
 - [LanguageType](docs/LanguageType.md)
 - [LicenseCheckStatusType](docs/LicenseCheckStatusType.md)
 - [LicenseType](docs/LicenseType.md)
 - [LogisticPickupPointDTO](docs/LogisticPickupPointDTO.md)
 - [LogisticPointType](docs/LogisticPointType.md)
 - [MappingsOfferDTO](docs/MappingsOfferDTO.md)
 - [MappingsOfferInfoDTO](docs/MappingsOfferInfoDTO.md)
 - [MaxSaleQuantumDTO](docs/MaxSaleQuantumDTO.md)
 - [MechanicsType](docs/MechanicsType.md)
 - [ModelDTO](docs/ModelDTO.md)
 - [ModelOfferDTO](docs/ModelOfferDTO.md)
 - [ModelPriceDTO](docs/ModelPriceDTO.md)
 - [ModelsDTO](docs/ModelsDTO.md)
 - [OfferAvailabilityStatusType](docs/OfferAvailabilityStatusType.md)
 - [OfferCampaignStatusDTO](docs/OfferCampaignStatusDTO.md)
 - [OfferCampaignStatusType](docs/OfferCampaignStatusType.md)
 - [OfferCardDTO](docs/OfferCardDTO.md)
 - [OfferCardRecommendationDTO](docs/OfferCardRecommendationDTO.md)
 - [OfferCardRecommendationType](docs/OfferCardRecommendationType.md)
 - [OfferCardStatusType](docs/OfferCardStatusType.md)
 - [OfferCardsContentStatusDTO](docs/OfferCardsContentStatusDTO.md)
 - [OfferConditionDTO](docs/OfferConditionDTO.md)
 - [OfferConditionQualityType](docs/OfferConditionQualityType.md)
 - [OfferConditionType](docs/OfferConditionType.md)
 - [OfferContentDTO](docs/OfferContentDTO.md)
 - [OfferContentErrorDTO](docs/OfferContentErrorDTO.md)
 - [OfferContentErrorType](docs/OfferContentErrorType.md)
 - [OfferDTO](docs/OfferDTO.md)
 - [OfferErrorDTO](docs/OfferErrorDTO.md)
 - [OfferForRecommendationDTO](docs/OfferForRecommendationDTO.md)
 - [OfferManualDTO](docs/OfferManualDTO.md)
 - [OfferMappingDTO](docs/OfferMappingDTO.md)
 - [OfferMappingEntriesDTO](docs/OfferMappingEntriesDTO.md)
 - [OfferMappingEntryDTO](docs/OfferMappingEntryDTO.md)
 - [OfferMappingErrorDTO](docs/OfferMappingErrorDTO.md)
 - [OfferMappingErrorType](docs/OfferMappingErrorType.md)
 - [OfferMappingInfoDTO](docs/OfferMappingInfoDTO.md)
 - [OfferMappingKindType](docs/OfferMappingKindType.md)
 - [OfferMappingSuggestionsListDTO](docs/OfferMappingSuggestionsListDTO.md)
 - [OfferParamDTO](docs/OfferParamDTO.md)
 - [OfferPriceByOfferIdsListResponseDTO](docs/OfferPriceByOfferIdsListResponseDTO.md)
 - [OfferPriceByOfferIdsResponseDTO](docs/OfferPriceByOfferIdsResponseDTO.md)
 - [OfferPriceDTO](docs/OfferPriceDTO.md)
 - [OfferPriceListResponseDTO](docs/OfferPriceListResponseDTO.md)
 - [OfferPriceResponseDTO](docs/OfferPriceResponseDTO.md)
 - [OfferProcessingNoteDTO](docs/OfferProcessingNoteDTO.md)
 - [OfferProcessingNoteType](docs/OfferProcessingNoteType.md)
 - [OfferProcessingStateDTO](docs/OfferProcessingStateDTO.md)
 - [OfferProcessingStatusType](docs/OfferProcessingStatusType.md)
 - [OfferRecommendationDTO](docs/OfferRecommendationDTO.md)
 - [OfferRecommendationInfoDTO](docs/OfferRecommendationInfoDTO.md)
 - [OfferRecommendationsResultDTO](docs/OfferRecommendationsResultDTO.md)
 - [OfferSellingProgramDTO](docs/OfferSellingProgramDTO.md)
 - [OfferSellingProgramStatusType](docs/OfferSellingProgramStatusType.md)
 - [OfferType](docs/OfferType.md)
 - [OfferWeightDimensionsDTO](docs/OfferWeightDimensionsDTO.md)
 - [OffersDTO](docs/OffersDTO.md)
 - [OptionValuesLimitedDTO](docs/OptionValuesLimitedDTO.md)
 - [OrderBoxLayoutDTO](docs/OrderBoxLayoutDTO.md)
 - [OrderBoxLayoutItemDTO](docs/OrderBoxLayoutItemDTO.md)
 - [OrderBoxLayoutPartialCountDTO](docs/OrderBoxLayoutPartialCountDTO.md)
 - [OrderBoxesLayoutDTO](docs/OrderBoxesLayoutDTO.md)
 - [OrderBusinessBuyerDTO](docs/OrderBusinessBuyerDTO.md)
 - [OrderBusinessDocumentsDTO](docs/OrderBusinessDocumentsDTO.md)
 - [OrderBuyerBasicInfoDTO](docs/OrderBuyerBasicInfoDTO.md)
 - [OrderBuyerDTO](docs/OrderBuyerDTO.md)
 - [OrderBuyerInfoDTO](docs/OrderBuyerInfoDTO.md)
 - [OrderBuyerType](docs/OrderBuyerType.md)
 - [OrderCancellationReasonType](docs/OrderCancellationReasonType.md)
 - [OrderCourierDTO](docs/OrderCourierDTO.md)
 - [OrderDTO](docs/OrderDTO.md)
 - [OrderDeliveryAddressDTO](docs/OrderDeliveryAddressDTO.md)
 - [OrderDeliveryDTO](docs/OrderDeliveryDTO.md)
 - [OrderDeliveryDateDTO](docs/OrderDeliveryDateDTO.md)
 - [OrderDeliveryDateReasonType](docs/OrderDeliveryDateReasonType.md)
 - [OrderDeliveryDatesDTO](docs/OrderDeliveryDatesDTO.md)
 - [OrderDeliveryDispatchType](docs/OrderDeliveryDispatchType.md)
 - [OrderDeliveryEacType](docs/OrderDeliveryEacType.md)
 - [OrderDeliveryPartnerType](docs/OrderDeliveryPartnerType.md)
 - [OrderDeliveryType](docs/OrderDeliveryType.md)
 - [OrderDigitalItemDTO](docs/OrderDigitalItemDTO.md)
 - [OrderDocumentStatusType](docs/OrderDocumentStatusType.md)
 - [OrderItemDTO](docs/OrderItemDTO.md)
 - [OrderItemDetailDTO](docs/OrderItemDetailDTO.md)
 - [OrderItemInstanceDTO](docs/OrderItemInstanceDTO.md)
 - [OrderItemInstanceModificationDTO](docs/OrderItemInstanceModificationDTO.md)
 - [OrderItemInstanceType](docs/OrderItemInstanceType.md)
 - [OrderItemModificationDTO](docs/OrderItemModificationDTO.md)
 - [OrderItemPromoDTO](docs/OrderItemPromoDTO.md)
 - [OrderItemStatusType](docs/OrderItemStatusType.md)
 - [OrderItemSubsidyDTO](docs/OrderItemSubsidyDTO.md)
 - [OrderItemSubsidyType](docs/OrderItemSubsidyType.md)
 - [OrderItemsModificationRequestReasonType](docs/OrderItemsModificationRequestReasonType.md)
 - [OrderItemsModificationResultDTO](docs/OrderItemsModificationResultDTO.md)
 - [OrderLabelDTO](docs/OrderLabelDTO.md)
 - [OrderLiftType](docs/OrderLiftType.md)
 - [OrderParcelBoxDTO](docs/OrderParcelBoxDTO.md)
 - [OrderPaymentMethodType](docs/OrderPaymentMethodType.md)
 - [OrderPaymentType](docs/OrderPaymentType.md)
 - [OrderPromoType](docs/OrderPromoType.md)
 - [OrderShipmentDTO](docs/OrderShipmentDTO.md)
 - [OrderStateDTO](docs/OrderStateDTO.md)
 - [OrderStatsStatusType](docs/OrderStatsStatusType.md)
 - [OrderStatusChangeDTO](docs/OrderStatusChangeDTO.md)
 - [OrderStatusChangeDeliveryDTO](docs/OrderStatusChangeDeliveryDTO.md)
 - [OrderStatusChangeDeliveryDatesDTO](docs/OrderStatusChangeDeliveryDatesDTO.md)
 - [OrderStatusType](docs/OrderStatusType.md)
 - [OrderSubsidyDTO](docs/OrderSubsidyDTO.md)
 - [OrderSubsidyType](docs/OrderSubsidyType.md)
 - [OrderSubstatusType](docs/OrderSubstatusType.md)
 - [OrderTaxSystemType](docs/OrderTaxSystemType.md)
 - [OrderTrackDTO](docs/OrderTrackDTO.md)
 - [OrderUpdateStatusType](docs/OrderUpdateStatusType.md)
 - [OrderVatType](docs/OrderVatType.md)
 - [OrdersShipmentInfoDTO](docs/OrdersShipmentInfoDTO.md)
 - [OrdersStatsCommissionDTO](docs/OrdersStatsCommissionDTO.md)
 - [OrdersStatsCommissionType](docs/OrdersStatsCommissionType.md)
 - [OrdersStatsDTO](docs/OrdersStatsDTO.md)
 - [OrdersStatsDeliveryRegionDTO](docs/OrdersStatsDeliveryRegionDTO.md)
 - [OrdersStatsDetailsDTO](docs/OrdersStatsDetailsDTO.md)
 - [OrdersStatsItemDTO](docs/OrdersStatsItemDTO.md)
 - [OrdersStatsItemStatusType](docs/OrdersStatsItemStatusType.md)
 - [OrdersStatsOrderDTO](docs/OrdersStatsOrderDTO.md)
 - [OrdersStatsOrderPaymentType](docs/OrdersStatsOrderPaymentType.md)
 - [OrdersStatsPaymentDTO](docs/OrdersStatsPaymentDTO.md)
 - [OrdersStatsPaymentOrderDTO](docs/OrdersStatsPaymentOrderDTO.md)
 - [OrdersStatsPaymentSourceType](docs/OrdersStatsPaymentSourceType.md)
 - [OrdersStatsPaymentType](docs/OrdersStatsPaymentType.md)
 - [OrdersStatsPriceDTO](docs/OrdersStatsPriceDTO.md)
 - [OrdersStatsPriceType](docs/OrdersStatsPriceType.md)
 - [OrdersStatsStockType](docs/OrdersStatsStockType.md)
 - [OrdersStatsWarehouseDTO](docs/OrdersStatsWarehouseDTO.md)
 - [OutletAddressDTO](docs/OutletAddressDTO.md)
 - [OutletDTO](docs/OutletDTO.md)
 - [OutletDeliveryRuleDTO](docs/OutletDeliveryRuleDTO.md)
 - [OutletLicenseDTO](docs/OutletLicenseDTO.md)
 - [OutletLicensesResponseDTO](docs/OutletLicensesResponseDTO.md)
 - [OutletResponseDTO](docs/OutletResponseDTO.md)
 - [OutletStatusType](docs/OutletStatusType.md)
 - [OutletType](docs/OutletType.md)
 - [OutletVisibilityType](docs/OutletVisibilityType.md)
 - [OutletWorkingScheduleDTO](docs/OutletWorkingScheduleDTO.md)
 - [OutletWorkingScheduleItemDTO](docs/OutletWorkingScheduleItemDTO.md)
 - [PageFormatType](docs/PageFormatType.md)
 - [PagedReturnsDTO](docs/PagedReturnsDTO.md)
 - [PalletsCountDTO](docs/PalletsCountDTO.md)
 - [ParameterType](docs/ParameterType.md)
 - [ParameterValueConstraintsDTO](docs/ParameterValueConstraintsDTO.md)
 - [ParameterValueDTO](docs/ParameterValueDTO.md)
 - [ParameterValueOptionDTO](docs/ParameterValueOptionDTO.md)
 - [ParcelBoxDTO](docs/ParcelBoxDTO.md)
 - [ParcelBoxLabelDTO](docs/ParcelBoxLabelDTO.md)
 - [ParcelDTO](docs/ParcelDTO.md)
 - [PartnerShipmentWarehouseDTO](docs/PartnerShipmentWarehouseDTO.md)
 - [PaymentFrequencyType](docs/PaymentFrequencyType.md)
 - [PickupAddressDTO](docs/PickupAddressDTO.md)
 - [PlacementType](docs/PlacementType.md)
 - [PriceCompetitivenessThresholdsDTO](docs/PriceCompetitivenessThresholdsDTO.md)
 - [PriceCompetitivenessType](docs/PriceCompetitivenessType.md)
 - [PriceDTO](docs/PriceDTO.md)
 - [PriceQuarantineVerdictDTO](docs/PriceQuarantineVerdictDTO.md)
 - [PriceQuarantineVerdictParamNameType](docs/PriceQuarantineVerdictParamNameType.md)
 - [PriceQuarantineVerdictParameterDTO](docs/PriceQuarantineVerdictParameterDTO.md)
 - [PriceQuarantineVerdictType](docs/PriceQuarantineVerdictType.md)
 - [PriceRecommendationItemDTO](docs/PriceRecommendationItemDTO.md)
 - [PriceSuggestDTO](docs/PriceSuggestDTO.md)
 - [PriceSuggestOfferDTO](docs/PriceSuggestOfferDTO.md)
 - [PriceSuggestType](docs/PriceSuggestType.md)
 - [PromoOfferAutoParticipatingDetailsDTO](docs/PromoOfferAutoParticipatingDetailsDTO.md)
 - [PromoOfferDiscountParamsDTO](docs/PromoOfferDiscountParamsDTO.md)
 - [PromoOfferParamsDTO](docs/PromoOfferParamsDTO.md)
 - [PromoOfferParticipationStatusFilterType](docs/PromoOfferParticipationStatusFilterType.md)
 - [PromoOfferParticipationStatusType](docs/PromoOfferParticipationStatusType.md)
 - [PromoOfferPromocodeParamsDTO](docs/PromoOfferPromocodeParamsDTO.md)
 - [PromoOfferUpdateWarningCodeType](docs/PromoOfferUpdateWarningCodeType.md)
 - [PromoOfferUpdateWarningDTO](docs/PromoOfferUpdateWarningDTO.md)
 - [PromoParticipationType](docs/PromoParticipationType.md)
 - [PromoPeriodDTO](docs/PromoPeriodDTO.md)
 - [ProvideOrderDigitalCodesRequest](docs/ProvideOrderDigitalCodesRequest.md)
 - [ProvideOrderItemIdentifiersRequest](docs/ProvideOrderItemIdentifiersRequest.md)
 - [ProvideOrderItemIdentifiersResponse](docs/ProvideOrderItemIdentifiersResponse.md)
 - [PutSkuBidsRequest](docs/PutSkuBidsRequest.md)
 - [QualityRatingAffectedOrderDTO](docs/QualityRatingAffectedOrderDTO.md)
 - [QualityRatingComponentDTO](docs/QualityRatingComponentDTO.md)
 - [QualityRatingComponentType](docs/QualityRatingComponentType.md)
 - [QualityRatingDTO](docs/QualityRatingDTO.md)
 - [QualityRatingDetailsDTO](docs/QualityRatingDetailsDTO.md)
 - [QuantumDTO](docs/QuantumDTO.md)
 - [QuarantineOfferDTO](docs/QuarantineOfferDTO.md)
 - [RecipientType](docs/RecipientType.md)
 - [RefundStatusType](docs/RefundStatusType.md)
 - [RegionDTO](docs/RegionDTO.md)
 - [RegionType](docs/RegionType.md)
 - [RegionalModelInfoDTO](docs/RegionalModelInfoDTO.md)
 - [RejectedPromoOfferDeleteDTO](docs/RejectedPromoOfferDeleteDTO.md)
 - [RejectedPromoOfferDeleteReasonType](docs/RejectedPromoOfferDeleteReasonType.md)
 - [RejectedPromoOfferUpdateDTO](docs/RejectedPromoOfferUpdateDTO.md)
 - [RejectedPromoOfferUpdateReasonType](docs/RejectedPromoOfferUpdateReasonType.md)
 - [ReportFormatType](docs/ReportFormatType.md)
 - [ReportInfoDTO](docs/ReportInfoDTO.md)
 - [ReportStatusType](docs/ReportStatusType.md)
 - [ReportSubStatusType](docs/ReportSubStatusType.md)
 - [ReturnDTO](docs/ReturnDTO.md)
 - [ReturnDecisionDTO](docs/ReturnDecisionDTO.md)
 - [ReturnDecisionReasonType](docs/ReturnDecisionReasonType.md)
 - [ReturnDecisionSubreasonType](docs/ReturnDecisionSubreasonType.md)
 - [ReturnDecisionType](docs/ReturnDecisionType.md)
 - [ReturnInstanceDTO](docs/ReturnInstanceDTO.md)
 - [ReturnInstanceStatusType](docs/ReturnInstanceStatusType.md)
 - [ReturnInstanceStockType](docs/ReturnInstanceStockType.md)
 - [ReturnItemDTO](docs/ReturnItemDTO.md)
 - [ReturnRequestDecisionType](docs/ReturnRequestDecisionType.md)
 - [ReturnShipmentStatusType](docs/ReturnShipmentStatusType.md)
 - [ReturnType](docs/ReturnType.md)
 - [ScrollingPagerDTO](docs/ScrollingPagerDTO.md)
 - [SearchModelsResponse](docs/SearchModelsResponse.md)
 - [SearchShipmentsRequest](docs/SearchShipmentsRequest.md)
 - [SearchShipmentsResponse](docs/SearchShipmentsResponse.md)
 - [SearchShipmentsResponseDTO](docs/SearchShipmentsResponseDTO.md)
 - [SellingProgramType](docs/SellingProgramType.md)
 - [SendMessageToChatRequest](docs/SendMessageToChatRequest.md)
 - [SetFeedParamsRequest](docs/SetFeedParamsRequest.md)
 - [SetOrderBoxLayoutRequest](docs/SetOrderBoxLayoutRequest.md)
 - [SetOrderBoxLayoutResponse](docs/SetOrderBoxLayoutResponse.md)
 - [SetOrderDeliveryDateRequest](docs/SetOrderDeliveryDateRequest.md)
 - [SetOrderDeliveryTrackCodeRequest](docs/SetOrderDeliveryTrackCodeRequest.md)
 - [SetOrderShipmentBoxesRequest](docs/SetOrderShipmentBoxesRequest.md)
 - [SetOrderShipmentBoxesResponse](docs/SetOrderShipmentBoxesResponse.md)
 - [SetReturnDecisionRequest](docs/SetReturnDecisionRequest.md)
 - [SetShipmentPalletsCountRequest](docs/SetShipmentPalletsCountRequest.md)
 - [ShelfsStatisticsAttributionType](docs/ShelfsStatisticsAttributionType.md)
 - [ShipmentActionType](docs/ShipmentActionType.md)
 - [ShipmentBoxesDTO](docs/ShipmentBoxesDTO.md)
 - [ShipmentDTO](docs/ShipmentDTO.md)
 - [ShipmentInfoDTO](docs/ShipmentInfoDTO.md)
 - [ShipmentPalletLabelPageFormatType](docs/ShipmentPalletLabelPageFormatType.md)
 - [ShipmentStatusChangeDTO](docs/ShipmentStatusChangeDTO.md)
 - [ShipmentStatusType](docs/ShipmentStatusType.md)
 - [ShipmentType](docs/ShipmentType.md)
 - [ShowsSalesGroupingType](docs/ShowsSalesGroupingType.md)
 - [SkipGoodsFeedbackReactionRequest](docs/SkipGoodsFeedbackReactionRequest.md)
 - [SkuBidItemDTO](docs/SkuBidItemDTO.md)
 - [SkuBidRecommendationItemDTO](docs/SkuBidRecommendationItemDTO.md)
 - [SortOrderType](docs/SortOrderType.md)
 - [SuggestOfferPriceDTO](docs/SuggestOfferPriceDTO.md)
 - [SuggestPricesRequest](docs/SuggestPricesRequest.md)
 - [SuggestPricesResponse](docs/SuggestPricesResponse.md)
 - [SuggestPricesResultDTO](docs/SuggestPricesResultDTO.md)
 - [SuggestedOfferDTO](docs/SuggestedOfferDTO.md)
 - [SuggestedOfferMappingDTO](docs/SuggestedOfferMappingDTO.md)
 - [TariffDTO](docs/TariffDTO.md)
 - [TariffParameterDTO](docs/TariffParameterDTO.md)
 - [TariffType](docs/TariffType.md)
 - [TimePeriodDTO](docs/TimePeriodDTO.md)
 - [TimeUnitType](docs/TimeUnitType.md)
 - [TrackDTO](docs/TrackDTO.md)
 - [TransferOrdersFromShipmentRequest](docs/TransferOrdersFromShipmentRequest.md)
 - [TurnoverDTO](docs/TurnoverDTO.md)
 - [TurnoverType](docs/TurnoverType.md)
 - [UnitDTO](docs/UnitDTO.md)
 - [UpdateBusinessOfferPriceDTO](docs/UpdateBusinessOfferPriceDTO.md)
 - [UpdateBusinessPricesRequest](docs/UpdateBusinessPricesRequest.md)
 - [UpdateCampaignOfferDTO](docs/UpdateCampaignOfferDTO.md)
 - [UpdateCampaignOffersRequest](docs/UpdateCampaignOffersRequest.md)
 - [UpdateGoodsFeedbackCommentDTO](docs/UpdateGoodsFeedbackCommentDTO.md)
 - [UpdateGoodsFeedbackCommentRequest](docs/UpdateGoodsFeedbackCommentRequest.md)
 - [UpdateGoodsFeedbackCommentResponse](docs/UpdateGoodsFeedbackCommentResponse.md)
 - [UpdateMappingDTO](docs/UpdateMappingDTO.md)
 - [UpdateMappingsOfferDTO](docs/UpdateMappingsOfferDTO.md)
 - [UpdateOfferContentRequest](docs/UpdateOfferContentRequest.md)
 - [UpdateOfferContentResponse](docs/UpdateOfferContentResponse.md)
 - [UpdateOfferContentResultDTO](docs/UpdateOfferContentResultDTO.md)
 - [UpdateOfferDTO](docs/UpdateOfferDTO.md)
 - [UpdateOfferMappingDTO](docs/UpdateOfferMappingDTO.md)
 - [UpdateOfferMappingEntryDTO](docs/UpdateOfferMappingEntryDTO.md)
 - [UpdateOfferMappingEntryRequest](docs/UpdateOfferMappingEntryRequest.md)
 - [UpdateOfferMappingResultDTO](docs/UpdateOfferMappingResultDTO.md)
 - [UpdateOfferMappingsRequest](docs/UpdateOfferMappingsRequest.md)
 - [UpdateOfferMappingsResponse](docs/UpdateOfferMappingsResponse.md)
 - [UpdateOrderItemRequest](docs/UpdateOrderItemRequest.md)
 - [UpdateOrderStatusDTO](docs/UpdateOrderStatusDTO.md)
 - [UpdateOrderStatusRequest](docs/UpdateOrderStatusRequest.md)
 - [UpdateOrderStatusResponse](docs/UpdateOrderStatusResponse.md)
 - [UpdateOrderStatusesDTO](docs/UpdateOrderStatusesDTO.md)
 - [UpdateOrderStatusesRequest](docs/UpdateOrderStatusesRequest.md)
 - [UpdateOrderStatusesResponse](docs/UpdateOrderStatusesResponse.md)
 - [UpdateOrderStorageLimitRequest](docs/UpdateOrderStorageLimitRequest.md)
 - [UpdateOutletLicenseRequest](docs/UpdateOutletLicenseRequest.md)
 - [UpdatePriceWithDiscountDTO](docs/UpdatePriceWithDiscountDTO.md)
 - [UpdatePricesRequest](docs/UpdatePricesRequest.md)
 - [UpdatePromoOfferDTO](docs/UpdatePromoOfferDTO.md)
 - [UpdatePromoOfferDiscountParamsDTO](docs/UpdatePromoOfferDiscountParamsDTO.md)
 - [UpdatePromoOfferParamsDTO](docs/UpdatePromoOfferParamsDTO.md)
 - [UpdatePromoOffersRequest](docs/UpdatePromoOffersRequest.md)
 - [UpdatePromoOffersResponse](docs/UpdatePromoOffersResponse.md)
 - [UpdatePromoOffersResultDTO](docs/UpdatePromoOffersResultDTO.md)
 - [UpdateStockDTO](docs/UpdateStockDTO.md)
 - [UpdateStockItemDTO](docs/UpdateStockItemDTO.md)
 - [UpdateStocksRequest](docs/UpdateStocksRequest.md)
 - [UpdateTimeDTO](docs/UpdateTimeDTO.md)
 - [ValueRestrictionDTO](docs/ValueRestrictionDTO.md)
 - [VerifyOrderEacRequest](docs/VerifyOrderEacRequest.md)
 - [VerifyOrderEacResponse](docs/VerifyOrderEacResponse.md)
 - [WarehouseAddressDTO](docs/WarehouseAddressDTO.md)
 - [WarehouseDTO](docs/WarehouseDTO.md)
 - [WarehouseGroupDTO](docs/WarehouseGroupDTO.md)
 - [WarehouseOfferDTO](docs/WarehouseOfferDTO.md)
 - [WarehouseOffersDTO](docs/WarehouseOffersDTO.md)
 - [WarehouseStockDTO](docs/WarehouseStockDTO.md)
 - [WarehouseStockType](docs/WarehouseStockType.md)
 - [WarehousesDTO](docs/WarehousesDTO.md)
 - [WarningPromoOfferUpdateDTO](docs/WarningPromoOfferUpdateDTO.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://oauth.yandex.ru/authorize
- **Scopes**: 
  - market:partner-api: API Яндекс.Маркета / Поиска по товарам для партнеров


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



