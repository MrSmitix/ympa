# ympa_kotlin_vertx_server - Kotlin Server library for Партнерский API Маркета

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BidsApi* | [**getBidsInfoForBusiness**](docs/BidsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*BidsApi* | [**getBidsRecommendations**](docs/BidsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*BidsApi* | [**putBidsForBusiness**](docs/BidsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*BidsApi* | [**putBidsForCampaign**](docs/BidsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*BusinessOfferMappingsApi* | [**addOffersToArchive**](docs/BusinessOfferMappingsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*BusinessOfferMappingsApi* | [**deleteOffers**](docs/BusinessOfferMappingsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*BusinessOfferMappingsApi* | [**deleteOffersFromArchive**](docs/BusinessOfferMappingsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*BusinessOfferMappingsApi* | [**getOfferMappings**](docs/BusinessOfferMappingsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*BusinessOfferMappingsApi* | [**getSuggestedOfferMappings**](docs/BusinessOfferMappingsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*BusinessOfferMappingsApi* | [**updateOfferMappings**](docs/BusinessOfferMappingsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*BusinessesApi* | [**getBusinessSettings**](docs/BusinessesApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*CampaignsApi* | [**getCampaign**](docs/CampaignsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*CampaignsApi* | [**getCampaignLogins**](docs/CampaignsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*CampaignsApi* | [**getCampaignRegion**](docs/CampaignsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*CampaignsApi* | [**getCampaignSettings**](docs/CampaignsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*CampaignsApi* | [**getCampaigns**](docs/CampaignsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*CampaignsApi* | [**getCampaignsByLogin**](docs/CampaignsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*CategoriesApi* | [**getCategoriesMaxSaleQuantum**](docs/CategoriesApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*CategoriesApi* | [**getCategoriesTree**](docs/CategoriesApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*ChatsApi* | [**createChat**](docs/ChatsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ChatsApi* | [**getChatHistory**](docs/ChatsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ChatsApi* | [**getChats**](docs/ChatsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ChatsApi* | [**sendFileToChat**](docs/ChatsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ChatsApi* | [**sendMessageToChat**](docs/ChatsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ContentApi* | [**getCategoryContentParameters**](docs/ContentApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ContentApi* | [**getOfferCardsContentStatus**](docs/ContentApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ContentApi* | [**updateOfferContent**](docs/ContentApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**acceptOrderCancellation**](docs/DbsApi.md#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*DbsApi* | [**addHiddenOffers**](docs/DbsApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*DbsApi* | [**addOffersToArchive**](docs/DbsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*DbsApi* | [**calculateTariffs**](docs/DbsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*DbsApi* | [**confirmBusinessPrices**](docs/DbsApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*DbsApi* | [**confirmCampaignPrices**](docs/DbsApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*DbsApi* | [**createChat**](docs/DbsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*DbsApi* | [**createOutlet**](docs/DbsApi.md#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*DbsApi* | [**deleteCampaignOffers**](docs/DbsApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*DbsApi* | [**deleteGoodsFeedbackComment**](docs/DbsApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*DbsApi* | [**deleteHiddenOffers**](docs/DbsApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*DbsApi* | [**deleteOffers**](docs/DbsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*DbsApi* | [**deleteOffersFromArchive**](docs/DbsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*DbsApi* | [**deleteOutlet**](docs/DbsApi.md#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*DbsApi* | [**deleteOutletLicenses**](docs/DbsApi.md#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*DbsApi* | [**deletePromoOffers**](docs/DbsApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*DbsApi* | [**generateBoostConsolidatedReport**](docs/DbsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*DbsApi* | [**generateCompetitorsPositionReport**](docs/DbsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*DbsApi* | [**generateGoodsFeedbackReport**](docs/DbsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*DbsApi* | [**generateMassOrderLabelsReport**](docs/DbsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*DbsApi* | [**generateOrderLabel**](docs/DbsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*DbsApi* | [**generateOrderLabels**](docs/DbsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*DbsApi* | [**generatePricesReport**](docs/DbsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*DbsApi* | [**generateShelfsStatisticsReport**](docs/DbsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*DbsApi* | [**generateShowsSalesReport**](docs/DbsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*DbsApi* | [**generateStocksOnWarehousesReport**](docs/DbsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*DbsApi* | [**generateUnitedMarketplaceServicesReport**](docs/DbsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*DbsApi* | [**generateUnitedNettingReport**](docs/DbsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*DbsApi* | [**generateUnitedOrdersReport**](docs/DbsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*DbsApi* | [**getAllOffers**](docs/DbsApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*DbsApi* | [**getBidsInfoForBusiness**](docs/DbsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*DbsApi* | [**getBidsRecommendations**](docs/DbsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*DbsApi* | [**getBusinessQuarantineOffers**](docs/DbsApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*DbsApi* | [**getBusinessSettings**](docs/DbsApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*DbsApi* | [**getCampaign**](docs/DbsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*DbsApi* | [**getCampaignLogins**](docs/DbsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*DbsApi* | [**getCampaignOffers**](docs/DbsApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*DbsApi* | [**getCampaignQuarantineOffers**](docs/DbsApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*DbsApi* | [**getCampaignRegion**](docs/DbsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*DbsApi* | [**getCampaignSettings**](docs/DbsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*DbsApi* | [**getCampaigns**](docs/DbsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*DbsApi* | [**getCampaignsByLogin**](docs/DbsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*DbsApi* | [**getCategoriesMaxSaleQuantum**](docs/DbsApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*DbsApi* | [**getCategoriesTree**](docs/DbsApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*DbsApi* | [**getCategoryContentParameters**](docs/DbsApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*DbsApi* | [**getChatHistory**](docs/DbsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*DbsApi* | [**getChats**](docs/DbsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*DbsApi* | [**getDeliveryServices**](docs/DbsApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*DbsApi* | [**getFeed**](docs/DbsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*DbsApi* | [**getFeedIndexLogs**](docs/DbsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*DbsApi* | [**getFeedbackAndCommentUpdates**](docs/DbsApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*DbsApi* | [**getFeeds**](docs/DbsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*DbsApi* | [**getGoodsFeedbackComments**](docs/DbsApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*DbsApi* | [**getGoodsFeedbacks**](docs/DbsApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*DbsApi* | [**getGoodsStats**](docs/DbsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*DbsApi* | [**getHiddenOffers**](docs/DbsApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*DbsApi* | [**getModel**](docs/DbsApi.md#getmodel) | **GET** /models/{modelId} | Информация об одной модели
*DbsApi* | [**getModelOffers**](docs/DbsApi.md#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*DbsApi* | [**getModels**](docs/DbsApi.md#getmodels) | **POST** /models | Информация о нескольких моделях
*DbsApi* | [**getModelsOffers**](docs/DbsApi.md#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей
*DbsApi* | [**getOfferCardsContentStatus**](docs/DbsApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*DbsApi* | [**getOfferMappingEntries**](docs/DbsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*DbsApi* | [**getOfferMappings**](docs/DbsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*DbsApi* | [**getOfferRecommendations**](docs/DbsApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*DbsApi* | [**getOffers**](docs/DbsApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*DbsApi* | [**getOrder**](docs/DbsApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*DbsApi* | [**getOrderBusinessBuyerInfo**](docs/DbsApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*DbsApi* | [**getOrderBusinessDocumentsInfo**](docs/DbsApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*DbsApi* | [**getOrderBuyerInfo**](docs/DbsApi.md#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*DbsApi* | [**getOrderLabelsData**](docs/DbsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*DbsApi* | [**getOrders**](docs/DbsApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*DbsApi* | [**getOrdersStats**](docs/DbsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*DbsApi* | [**getOutlet**](docs/DbsApi.md#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*DbsApi* | [**getOutletLicenses**](docs/DbsApi.md#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*DbsApi* | [**getOutlets**](docs/DbsApi.md#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*DbsApi* | [**getPrices**](docs/DbsApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*DbsApi* | [**getPricesByOfferIds**](docs/DbsApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*DbsApi* | [**getPromoOffers**](docs/DbsApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*DbsApi* | [**getPromos**](docs/DbsApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*DbsApi* | [**getQualityRatingDetails**](docs/DbsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*DbsApi* | [**getQualityRatings**](docs/DbsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*DbsApi* | [**getReportInfo**](docs/DbsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*DbsApi* | [**getReturn**](docs/DbsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*DbsApi* | [**getReturnApplication**](docs/DbsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*DbsApi* | [**getReturnPhoto**](docs/DbsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*DbsApi* | [**getReturns**](docs/DbsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*DbsApi* | [**getStocks**](docs/DbsApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*DbsApi* | [**getSuggestedOfferMappingEntries**](docs/DbsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*DbsApi* | [**getSuggestedOfferMappings**](docs/DbsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*DbsApi* | [**getSuggestedPrices**](docs/DbsApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*DbsApi* | [**getWarehouses**](docs/DbsApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*DbsApi* | [**provideOrderDigitalCodes**](docs/DbsApi.md#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*DbsApi* | [**provideOrderItemIdentifiers**](docs/DbsApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*DbsApi* | [**putBidsForBusiness**](docs/DbsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*DbsApi* | [**putBidsForCampaign**](docs/DbsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*DbsApi* | [**refreshFeed**](docs/DbsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*DbsApi* | [**searchModels**](docs/DbsApi.md#searchmodels) | **GET** /models | Поиск модели товара
*DbsApi* | [**searchRegionChildren**](docs/DbsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*DbsApi* | [**searchRegionsById**](docs/DbsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*DbsApi* | [**searchRegionsByName**](docs/DbsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*DbsApi* | [**sendFileToChat**](docs/DbsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*DbsApi* | [**sendMessageToChat**](docs/DbsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*DbsApi* | [**setFeedParams**](docs/DbsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*DbsApi* | [**setOrderBoxLayout**](docs/DbsApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*DbsApi* | [**setOrderDeliveryDate**](docs/DbsApi.md#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*DbsApi* | [**setOrderDeliveryTrackCode**](docs/DbsApi.md#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*DbsApi* | [**setOrderShipmentBoxes**](docs/DbsApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*DbsApi* | [**setReturnDecision**](docs/DbsApi.md#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*DbsApi* | [**skipGoodsFeedbacksReaction**](docs/DbsApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*DbsApi* | [**submitReturnDecision**](docs/DbsApi.md#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*DbsApi* | [**updateBusinessPrices**](docs/DbsApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*DbsApi* | [**updateCampaignOffers**](docs/DbsApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*DbsApi* | [**updateGoodsFeedbackComment**](docs/DbsApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*DbsApi* | [**updateOfferContent**](docs/DbsApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**updateOfferMappingEntries**](docs/DbsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*DbsApi* | [**updateOfferMappings**](docs/DbsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*DbsApi* | [**updateOrderItems**](docs/DbsApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*DbsApi* | [**updateOrderStatus**](docs/DbsApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*DbsApi* | [**updateOrderStatuses**](docs/DbsApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*DbsApi* | [**updateOrderStorageLimit**](docs/DbsApi.md#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*DbsApi* | [**updateOutlet**](docs/DbsApi.md#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*DbsApi* | [**updateOutletLicenses**](docs/DbsApi.md#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*DbsApi* | [**updatePrices**](docs/DbsApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*DbsApi* | [**updatePromoOffers**](docs/DbsApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*DbsApi* | [**updateStocks**](docs/DbsApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*DeliveryServicesApi* | [**getDeliveryServices**](docs/DeliveryServicesApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**addHiddenOffers**](docs/ExpressApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*ExpressApi* | [**addOffersToArchive**](docs/ExpressApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*ExpressApi* | [**calculateTariffs**](docs/ExpressApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*ExpressApi* | [**confirmBusinessPrices**](docs/ExpressApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*ExpressApi* | [**confirmCampaignPrices**](docs/ExpressApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*ExpressApi* | [**createChat**](docs/ExpressApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ExpressApi* | [**deleteCampaignOffers**](docs/ExpressApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*ExpressApi* | [**deleteGoodsFeedbackComment**](docs/ExpressApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*ExpressApi* | [**deleteHiddenOffers**](docs/ExpressApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*ExpressApi* | [**deleteOffers**](docs/ExpressApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*ExpressApi* | [**deleteOffersFromArchive**](docs/ExpressApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*ExpressApi* | [**deletePromoOffers**](docs/ExpressApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*ExpressApi* | [**generateBoostConsolidatedReport**](docs/ExpressApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ExpressApi* | [**generateCompetitorsPositionReport**](docs/ExpressApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ExpressApi* | [**generateGoodsFeedbackReport**](docs/ExpressApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ExpressApi* | [**generateGoodsRealizationReport**](docs/ExpressApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ExpressApi* | [**generateMassOrderLabelsReport**](docs/ExpressApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ExpressApi* | [**generateOrderLabel**](docs/ExpressApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*ExpressApi* | [**generateOrderLabels**](docs/ExpressApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*ExpressApi* | [**generatePricesReport**](docs/ExpressApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ExpressApi* | [**generateShelfsStatisticsReport**](docs/ExpressApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ExpressApi* | [**generateShowsSalesReport**](docs/ExpressApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ExpressApi* | [**generateStocksOnWarehousesReport**](docs/ExpressApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ExpressApi* | [**generateUnitedMarketplaceServicesReport**](docs/ExpressApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ExpressApi* | [**generateUnitedNettingReport**](docs/ExpressApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ExpressApi* | [**generateUnitedOrdersReport**](docs/ExpressApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ExpressApi* | [**getAllOffers**](docs/ExpressApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*ExpressApi* | [**getBidsInfoForBusiness**](docs/ExpressApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*ExpressApi* | [**getBidsRecommendations**](docs/ExpressApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*ExpressApi* | [**getBusinessQuarantineOffers**](docs/ExpressApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*ExpressApi* | [**getBusinessSettings**](docs/ExpressApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*ExpressApi* | [**getCampaign**](docs/ExpressApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*ExpressApi* | [**getCampaignLogins**](docs/ExpressApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*ExpressApi* | [**getCampaignOffers**](docs/ExpressApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*ExpressApi* | [**getCampaignQuarantineOffers**](docs/ExpressApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*ExpressApi* | [**getCampaignRegion**](docs/ExpressApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*ExpressApi* | [**getCampaignSettings**](docs/ExpressApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*ExpressApi* | [**getCampaigns**](docs/ExpressApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*ExpressApi* | [**getCampaignsByLogin**](docs/ExpressApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*ExpressApi* | [**getCategoriesMaxSaleQuantum**](docs/ExpressApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*ExpressApi* | [**getCategoriesTree**](docs/ExpressApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*ExpressApi* | [**getCategoryContentParameters**](docs/ExpressApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ExpressApi* | [**getChatHistory**](docs/ExpressApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ExpressApi* | [**getChats**](docs/ExpressApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ExpressApi* | [**getDeliveryServices**](docs/ExpressApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**getFeed**](docs/ExpressApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*ExpressApi* | [**getFeedIndexLogs**](docs/ExpressApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*ExpressApi* | [**getFeedbackAndCommentUpdates**](docs/ExpressApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*ExpressApi* | [**getFeeds**](docs/ExpressApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*ExpressApi* | [**getGoodsFeedbackComments**](docs/ExpressApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*ExpressApi* | [**getGoodsFeedbacks**](docs/ExpressApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*ExpressApi* | [**getGoodsStats**](docs/ExpressApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*ExpressApi* | [**getHiddenOffers**](docs/ExpressApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ExpressApi* | [**getOfferCardsContentStatus**](docs/ExpressApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ExpressApi* | [**getOfferMappingEntries**](docs/ExpressApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*ExpressApi* | [**getOfferMappings**](docs/ExpressApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*ExpressApi* | [**getOfferRecommendations**](docs/ExpressApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*ExpressApi* | [**getOffers**](docs/ExpressApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*ExpressApi* | [**getOrder**](docs/ExpressApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*ExpressApi* | [**getOrderBusinessBuyerInfo**](docs/ExpressApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*ExpressApi* | [**getOrderBusinessDocumentsInfo**](docs/ExpressApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*ExpressApi* | [**getOrderLabelsData**](docs/ExpressApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*ExpressApi* | [**getOrders**](docs/ExpressApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*ExpressApi* | [**getOrdersStats**](docs/ExpressApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*ExpressApi* | [**getPrices**](docs/ExpressApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*ExpressApi* | [**getPricesByOfferIds**](docs/ExpressApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*ExpressApi* | [**getPromoOffers**](docs/ExpressApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*ExpressApi* | [**getPromos**](docs/ExpressApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*ExpressApi* | [**getQualityRatingDetails**](docs/ExpressApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*ExpressApi* | [**getQualityRatings**](docs/ExpressApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*ExpressApi* | [**getReportInfo**](docs/ExpressApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ExpressApi* | [**getReturn**](docs/ExpressApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ExpressApi* | [**getReturnApplication**](docs/ExpressApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ExpressApi* | [**getReturnPhoto**](docs/ExpressApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ExpressApi* | [**getReturns**](docs/ExpressApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ExpressApi* | [**getStocks**](docs/ExpressApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*ExpressApi* | [**getSuggestedOfferMappingEntries**](docs/ExpressApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*ExpressApi* | [**getSuggestedOfferMappings**](docs/ExpressApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*ExpressApi* | [**getSuggestedPrices**](docs/ExpressApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*ExpressApi* | [**getWarehouses**](docs/ExpressApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*ExpressApi* | [**provideOrderItemIdentifiers**](docs/ExpressApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*ExpressApi* | [**putBidsForBusiness**](docs/ExpressApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*ExpressApi* | [**putBidsForCampaign**](docs/ExpressApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*ExpressApi* | [**refreshFeed**](docs/ExpressApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*ExpressApi* | [**searchRegionChildren**](docs/ExpressApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*ExpressApi* | [**searchRegionsById**](docs/ExpressApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*ExpressApi* | [**searchRegionsByName**](docs/ExpressApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*ExpressApi* | [**sendFileToChat**](docs/ExpressApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ExpressApi* | [**sendMessageToChat**](docs/ExpressApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ExpressApi* | [**setFeedParams**](docs/ExpressApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*ExpressApi* | [**setOrderBoxLayout**](docs/ExpressApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*ExpressApi* | [**setOrderShipmentBoxes**](docs/ExpressApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*ExpressApi* | [**skipGoodsFeedbacksReaction**](docs/ExpressApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*ExpressApi* | [**updateBusinessPrices**](docs/ExpressApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*ExpressApi* | [**updateCampaignOffers**](docs/ExpressApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*ExpressApi* | [**updateGoodsFeedbackComment**](docs/ExpressApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*ExpressApi* | [**updateOfferContent**](docs/ExpressApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*ExpressApi* | [**updateOfferMappingEntries**](docs/ExpressApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*ExpressApi* | [**updateOfferMappings**](docs/ExpressApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*ExpressApi* | [**updateOrderItems**](docs/ExpressApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*ExpressApi* | [**updateOrderStatus**](docs/ExpressApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*ExpressApi* | [**updateOrderStatuses**](docs/ExpressApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*ExpressApi* | [**updatePrices**](docs/ExpressApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*ExpressApi* | [**updatePromoOffers**](docs/ExpressApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*ExpressApi* | [**updateStocks**](docs/ExpressApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*ExpressApi* | [**verifyOrderEac**](docs/ExpressApi.md#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*FbsApi* | [**addHiddenOffers**](docs/FbsApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbsApi* | [**addOffersToArchive**](docs/FbsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbsApi* | [**calculateTariffs**](docs/FbsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbsApi* | [**confirmBusinessPrices**](docs/FbsApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbsApi* | [**confirmCampaignPrices**](docs/FbsApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbsApi* | [**confirmShipment**](docs/FbsApi.md#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*FbsApi* | [**createChat**](docs/FbsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbsApi* | [**deleteCampaignOffers**](docs/FbsApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbsApi* | [**deleteGoodsFeedbackComment**](docs/FbsApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbsApi* | [**deleteHiddenOffers**](docs/FbsApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbsApi* | [**deleteOffers**](docs/FbsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbsApi* | [**deleteOffersFromArchive**](docs/FbsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbsApi* | [**deletePromoOffers**](docs/FbsApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbsApi* | [**downloadShipmentAct**](docs/FbsApi.md#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*FbsApi* | [**downloadShipmentDiscrepancyAct**](docs/FbsApi.md#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*FbsApi* | [**downloadShipmentInboundAct**](docs/FbsApi.md#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*FbsApi* | [**downloadShipmentPalletLabels**](docs/FbsApi.md#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*FbsApi* | [**downloadShipmentReceptionTransferAct**](docs/FbsApi.md#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*FbsApi* | [**downloadShipmentTransportationWaybill**](docs/FbsApi.md#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*FbsApi* | [**generateBoostConsolidatedReport**](docs/FbsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbsApi* | [**generateCompetitorsPositionReport**](docs/FbsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbsApi* | [**generateGoodsFeedbackReport**](docs/FbsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbsApi* | [**generateGoodsRealizationReport**](docs/FbsApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbsApi* | [**generateMassOrderLabelsReport**](docs/FbsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*FbsApi* | [**generateOrderLabel**](docs/FbsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*FbsApi* | [**generateOrderLabels**](docs/FbsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*FbsApi* | [**generatePricesReport**](docs/FbsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbsApi* | [**generateShelfsStatisticsReport**](docs/FbsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbsApi* | [**generateShipmentListDocumentReport**](docs/FbsApi.md#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*FbsApi* | [**generateShowsSalesReport**](docs/FbsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbsApi* | [**generateStocksOnWarehousesReport**](docs/FbsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbsApi* | [**generateUnitedMarketplaceServicesReport**](docs/FbsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbsApi* | [**generateUnitedNettingReport**](docs/FbsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbsApi* | [**generateUnitedOrdersReport**](docs/FbsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbsApi* | [**getAllOffers**](docs/FbsApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbsApi* | [**getBidsInfoForBusiness**](docs/FbsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbsApi* | [**getBidsRecommendations**](docs/FbsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbsApi* | [**getBusinessQuarantineOffers**](docs/FbsApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbsApi* | [**getBusinessSettings**](docs/FbsApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbsApi* | [**getCampaign**](docs/FbsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbsApi* | [**getCampaignLogins**](docs/FbsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbsApi* | [**getCampaignOffers**](docs/FbsApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbsApi* | [**getCampaignQuarantineOffers**](docs/FbsApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbsApi* | [**getCampaignRegion**](docs/FbsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbsApi* | [**getCampaignSettings**](docs/FbsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbsApi* | [**getCampaigns**](docs/FbsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbsApi* | [**getCampaignsByLogin**](docs/FbsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbsApi* | [**getCategoriesMaxSaleQuantum**](docs/FbsApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbsApi* | [**getCategoriesTree**](docs/FbsApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*FbsApi* | [**getCategoryContentParameters**](docs/FbsApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbsApi* | [**getChatHistory**](docs/FbsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbsApi* | [**getChats**](docs/FbsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbsApi* | [**getDeliveryServices**](docs/FbsApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*FbsApi* | [**getFeed**](docs/FbsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbsApi* | [**getFeedIndexLogs**](docs/FbsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbsApi* | [**getFeedbackAndCommentUpdates**](docs/FbsApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbsApi* | [**getFeeds**](docs/FbsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbsApi* | [**getGoodsFeedbackComments**](docs/FbsApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbsApi* | [**getGoodsFeedbacks**](docs/FbsApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbsApi* | [**getGoodsStats**](docs/FbsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbsApi* | [**getHiddenOffers**](docs/FbsApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbsApi* | [**getOfferCardsContentStatus**](docs/FbsApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbsApi* | [**getOfferMappingEntries**](docs/FbsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbsApi* | [**getOfferMappings**](docs/FbsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbsApi* | [**getOfferRecommendations**](docs/FbsApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbsApi* | [**getOffers**](docs/FbsApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbsApi* | [**getOrder**](docs/FbsApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbsApi* | [**getOrderBusinessBuyerInfo**](docs/FbsApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbsApi* | [**getOrderBusinessDocumentsInfo**](docs/FbsApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbsApi* | [**getOrderLabelsData**](docs/FbsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*FbsApi* | [**getOrders**](docs/FbsApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbsApi* | [**getOrdersStats**](docs/FbsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbsApi* | [**getPrices**](docs/FbsApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbsApi* | [**getPricesByOfferIds**](docs/FbsApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbsApi* | [**getPromoOffers**](docs/FbsApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbsApi* | [**getPromos**](docs/FbsApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbsApi* | [**getQualityRatingDetails**](docs/FbsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*FbsApi* | [**getQualityRatings**](docs/FbsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbsApi* | [**getReportInfo**](docs/FbsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbsApi* | [**getReturn**](docs/FbsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbsApi* | [**getReturnApplication**](docs/FbsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*FbsApi* | [**getReturnPhoto**](docs/FbsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbsApi* | [**getReturns**](docs/FbsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbsApi* | [**getShipment**](docs/FbsApi.md#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*FbsApi* | [**getShipmentOrdersInfo**](docs/FbsApi.md#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*FbsApi* | [**getStocks**](docs/FbsApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbsApi* | [**getSuggestedOfferMappingEntries**](docs/FbsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbsApi* | [**getSuggestedOfferMappings**](docs/FbsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbsApi* | [**getSuggestedPrices**](docs/FbsApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbsApi* | [**getWarehouses**](docs/FbsApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*FbsApi* | [**provideOrderItemIdentifiers**](docs/FbsApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*FbsApi* | [**putBidsForBusiness**](docs/FbsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbsApi* | [**putBidsForCampaign**](docs/FbsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbsApi* | [**refreshFeed**](docs/FbsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbsApi* | [**searchRegionChildren**](docs/FbsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbsApi* | [**searchRegionsById**](docs/FbsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*FbsApi* | [**searchRegionsByName**](docs/FbsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*FbsApi* | [**searchShipments**](docs/FbsApi.md#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*FbsApi* | [**sendFileToChat**](docs/FbsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbsApi* | [**sendMessageToChat**](docs/FbsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbsApi* | [**setFeedParams**](docs/FbsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbsApi* | [**setOrderBoxLayout**](docs/FbsApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*FbsApi* | [**setOrderShipmentBoxes**](docs/FbsApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*FbsApi* | [**setShipmentPalletsCount**](docs/FbsApi.md#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*FbsApi* | [**skipGoodsFeedbacksReaction**](docs/FbsApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbsApi* | [**transferOrdersFromShipment**](docs/FbsApi.md#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*FbsApi* | [**updateBusinessPrices**](docs/FbsApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbsApi* | [**updateCampaignOffers**](docs/FbsApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbsApi* | [**updateGoodsFeedbackComment**](docs/FbsApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbsApi* | [**updateOfferContent**](docs/FbsApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbsApi* | [**updateOfferMappingEntries**](docs/FbsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbsApi* | [**updateOfferMappings**](docs/FbsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbsApi* | [**updateOrderItems**](docs/FbsApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*FbsApi* | [**updateOrderStatus**](docs/FbsApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*FbsApi* | [**updateOrderStatuses**](docs/FbsApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*FbsApi* | [**updatePrices**](docs/FbsApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbsApi* | [**updatePromoOffers**](docs/FbsApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FbsApi* | [**updateStocks**](docs/FbsApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*FbyApi* | [**addHiddenOffers**](docs/FbyApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbyApi* | [**addOffersToArchive**](docs/FbyApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbyApi* | [**calculateTariffs**](docs/FbyApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbyApi* | [**confirmBusinessPrices**](docs/FbyApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbyApi* | [**confirmCampaignPrices**](docs/FbyApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbyApi* | [**createChat**](docs/FbyApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbyApi* | [**deleteCampaignOffers**](docs/FbyApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbyApi* | [**deleteGoodsFeedbackComment**](docs/FbyApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbyApi* | [**deleteHiddenOffers**](docs/FbyApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbyApi* | [**deleteOffers**](docs/FbyApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbyApi* | [**deleteOffersFromArchive**](docs/FbyApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbyApi* | [**deletePromoOffers**](docs/FbyApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbyApi* | [**generateBoostConsolidatedReport**](docs/FbyApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbyApi* | [**generateCompetitorsPositionReport**](docs/FbyApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbyApi* | [**generateGoodsFeedbackReport**](docs/FbyApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbyApi* | [**generateGoodsMovementReport**](docs/FbyApi.md#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*FbyApi* | [**generateGoodsRealizationReport**](docs/FbyApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbyApi* | [**generateGoodsTurnoverReport**](docs/FbyApi.md#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*FbyApi* | [**generatePricesReport**](docs/FbyApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbyApi* | [**generateShelfsStatisticsReport**](docs/FbyApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbyApi* | [**generateShowsSalesReport**](docs/FbyApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbyApi* | [**generateStocksOnWarehousesReport**](docs/FbyApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbyApi* | [**generateUnitedMarketplaceServicesReport**](docs/FbyApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbyApi* | [**generateUnitedNettingReport**](docs/FbyApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbyApi* | [**generateUnitedOrdersReport**](docs/FbyApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbyApi* | [**getAllOffers**](docs/FbyApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbyApi* | [**getBidsInfoForBusiness**](docs/FbyApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbyApi* | [**getBidsRecommendations**](docs/FbyApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbyApi* | [**getBusinessQuarantineOffers**](docs/FbyApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbyApi* | [**getBusinessSettings**](docs/FbyApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbyApi* | [**getCampaign**](docs/FbyApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbyApi* | [**getCampaignLogins**](docs/FbyApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbyApi* | [**getCampaignOffers**](docs/FbyApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbyApi* | [**getCampaignQuarantineOffers**](docs/FbyApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbyApi* | [**getCampaignRegion**](docs/FbyApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbyApi* | [**getCampaignSettings**](docs/FbyApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbyApi* | [**getCampaigns**](docs/FbyApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbyApi* | [**getCampaignsByLogin**](docs/FbyApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbyApi* | [**getCategoriesMaxSaleQuantum**](docs/FbyApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbyApi* | [**getCategoriesTree**](docs/FbyApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*FbyApi* | [**getCategoryContentParameters**](docs/FbyApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbyApi* | [**getChatHistory**](docs/FbyApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbyApi* | [**getChats**](docs/FbyApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbyApi* | [**getFeed**](docs/FbyApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbyApi* | [**getFeedIndexLogs**](docs/FbyApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbyApi* | [**getFeedbackAndCommentUpdates**](docs/FbyApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbyApi* | [**getFeeds**](docs/FbyApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbyApi* | [**getFulfillmentWarehouses**](docs/FbyApi.md#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*FbyApi* | [**getGoodsFeedbackComments**](docs/FbyApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbyApi* | [**getGoodsFeedbacks**](docs/FbyApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbyApi* | [**getGoodsStats**](docs/FbyApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbyApi* | [**getHiddenOffers**](docs/FbyApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbyApi* | [**getOfferCardsContentStatus**](docs/FbyApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbyApi* | [**getOfferMappingEntries**](docs/FbyApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbyApi* | [**getOfferMappings**](docs/FbyApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbyApi* | [**getOfferRecommendations**](docs/FbyApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbyApi* | [**getOffers**](docs/FbyApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbyApi* | [**getOrder**](docs/FbyApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbyApi* | [**getOrderBusinessBuyerInfo**](docs/FbyApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbyApi* | [**getOrderBusinessDocumentsInfo**](docs/FbyApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbyApi* | [**getOrders**](docs/FbyApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbyApi* | [**getOrdersStats**](docs/FbyApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbyApi* | [**getPrices**](docs/FbyApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbyApi* | [**getPricesByOfferIds**](docs/FbyApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbyApi* | [**getPromoOffers**](docs/FbyApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbyApi* | [**getPromos**](docs/FbyApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbyApi* | [**getQualityRatings**](docs/FbyApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbyApi* | [**getReportInfo**](docs/FbyApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbyApi* | [**getReturn**](docs/FbyApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbyApi* | [**getReturnPhoto**](docs/FbyApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbyApi* | [**getReturns**](docs/FbyApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbyApi* | [**getStocks**](docs/FbyApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbyApi* | [**getSuggestedOfferMappingEntries**](docs/FbyApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbyApi* | [**getSuggestedOfferMappings**](docs/FbyApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbyApi* | [**getSuggestedPrices**](docs/FbyApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbyApi* | [**putBidsForBusiness**](docs/FbyApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbyApi* | [**putBidsForCampaign**](docs/FbyApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbyApi* | [**refreshFeed**](docs/FbyApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbyApi* | [**searchRegionChildren**](docs/FbyApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbyApi* | [**searchRegionsById**](docs/FbyApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*FbyApi* | [**searchRegionsByName**](docs/FbyApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*FbyApi* | [**sendFileToChat**](docs/FbyApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbyApi* | [**sendMessageToChat**](docs/FbyApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbyApi* | [**setFeedParams**](docs/FbyApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbyApi* | [**skipGoodsFeedbacksReaction**](docs/FbyApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbyApi* | [**updateBusinessPrices**](docs/FbyApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbyApi* | [**updateCampaignOffers**](docs/FbyApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbyApi* | [**updateGoodsFeedbackComment**](docs/FbyApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbyApi* | [**updateOfferContent**](docs/FbyApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbyApi* | [**updateOfferMappingEntries**](docs/FbyApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbyApi* | [**updateOfferMappings**](docs/FbyApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbyApi* | [**updatePrices**](docs/FbyApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbyApi* | [**updatePromoOffers**](docs/FbyApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FeedbacksApi* | [**getFeedbackAndCommentUpdates**](docs/FeedbacksApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FeedsApi* | [**getFeed**](docs/FeedsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FeedsApi* | [**getFeedIndexLogs**](docs/FeedsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FeedsApi* | [**getFeeds**](docs/FeedsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FeedsApi* | [**refreshFeed**](docs/FeedsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FeedsApi* | [**setFeedParams**](docs/FeedsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*GoodsFeedbackApi* | [**deleteGoodsFeedbackComment**](docs/GoodsFeedbackApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbackComments**](docs/GoodsFeedbackApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbacks**](docs/GoodsFeedbackApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*GoodsFeedbackApi* | [**skipGoodsFeedbacksReaction**](docs/GoodsFeedbackApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*GoodsFeedbackApi* | [**updateGoodsFeedbackComment**](docs/GoodsFeedbackApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*GoodsStatsApi* | [**getGoodsStats**](docs/GoodsStatsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*HiddenOffersApi* | [**addHiddenOffers**](docs/HiddenOffersApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*HiddenOffersApi* | [**deleteHiddenOffers**](docs/HiddenOffersApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*HiddenOffersApi* | [**getHiddenOffers**](docs/HiddenOffersApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ModelsApi* | [**getModel**](docs/ModelsApi.md#getmodel) | **GET** /models/{modelId} | Информация об одной модели
*ModelsApi* | [**getModelOffers**](docs/ModelsApi.md#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*ModelsApi* | [**getModels**](docs/ModelsApi.md#getmodels) | **POST** /models | Информация о нескольких моделях
*ModelsApi* | [**getModelsOffers**](docs/ModelsApi.md#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей
*ModelsApi* | [**searchModels**](docs/ModelsApi.md#searchmodels) | **GET** /models | Поиск модели товара
*OfferMappingsApi* | [**getOfferMappingEntries**](docs/OfferMappingsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OfferMappingsApi* | [**getSuggestedOfferMappingEntries**](docs/OfferMappingsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OfferMappingsApi* | [**updateOfferMappingEntries**](docs/OfferMappingsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OffersApi* | [**deleteCampaignOffers**](docs/OffersApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OffersApi* | [**getAllOffers**](docs/OffersApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OffersApi* | [**getCampaignOffers**](docs/OffersApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OffersApi* | [**getOfferRecommendations**](docs/OffersApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OffersApi* | [**getOffers**](docs/OffersApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OffersApi* | [**updateCampaignOffers**](docs/OffersApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OrderBusinessInformationApi* | [**getOrderBusinessBuyerInfo**](docs/OrderBusinessInformationApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OrderBusinessInformationApi* | [**getOrderBusinessDocumentsInfo**](docs/OrderBusinessInformationApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OrderDeliveryApi* | [**getOrderBuyerInfo**](docs/OrderDeliveryApi.md#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*OrderDeliveryApi* | [**setOrderDeliveryDate**](docs/OrderDeliveryApi.md#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*OrderDeliveryApi* | [**setOrderDeliveryTrackCode**](docs/OrderDeliveryApi.md#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*OrderDeliveryApi* | [**updateOrderStorageLimit**](docs/OrderDeliveryApi.md#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*OrderDeliveryApi* | [**verifyOrderEac**](docs/OrderDeliveryApi.md#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*OrderLabelsApi* | [**generateOrderLabel**](docs/OrderLabelsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OrderLabelsApi* | [**generateOrderLabels**](docs/OrderLabelsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OrderLabelsApi* | [**getOrderLabelsData**](docs/OrderLabelsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OrdersApi* | [**acceptOrderCancellation**](docs/OrdersApi.md#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OrdersApi* | [**getOrders**](docs/OrdersApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OrdersApi* | [**provideOrderDigitalCodes**](docs/OrdersApi.md#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*OrdersApi* | [**provideOrderItemIdentifiers**](docs/OrdersApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OrdersApi* | [**setOrderBoxLayout**](docs/OrdersApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OrdersApi* | [**setOrderShipmentBoxes**](docs/OrdersApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OrdersApi* | [**updateOrderItems**](docs/OrdersApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OrdersApi* | [**updateOrderStatus**](docs/OrdersApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OrdersApi* | [**updateOrderStatuses**](docs/OrdersApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OrdersStatsApi* | [**getOrdersStats**](docs/OrdersStatsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OutletLicensesApi* | [**deleteOutletLicenses**](docs/OutletLicensesApi.md#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*OutletLicensesApi* | [**getOutletLicenses**](docs/OutletLicensesApi.md#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*OutletLicensesApi* | [**updateOutletLicenses**](docs/OutletLicensesApi.md#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*OutletsApi* | [**createOutlet**](docs/OutletsApi.md#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*OutletsApi* | [**deleteOutlet**](docs/OutletsApi.md#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*OutletsApi* | [**getOutlet**](docs/OutletsApi.md#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*OutletsApi* | [**getOutlets**](docs/OutletsApi.md#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*OutletsApi* | [**updateOutlet**](docs/OutletsApi.md#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*PriceQuarantineApi* | [**confirmBusinessPrices**](docs/PriceQuarantineApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*PriceQuarantineApi* | [**confirmCampaignPrices**](docs/PriceQuarantineApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*PriceQuarantineApi* | [**getBusinessQuarantineOffers**](docs/PriceQuarantineApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*PriceQuarantineApi* | [**getCampaignQuarantineOffers**](docs/PriceQuarantineApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*PricesApi* | [**getPrices**](docs/PricesApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*PricesApi* | [**getPricesByOfferIds**](docs/PricesApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*PricesApi* | [**getSuggestedPrices**](docs/PricesApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*PricesApi* | [**updateBusinessPrices**](docs/PricesApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*PricesApi* | [**updatePrices**](docs/PricesApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*PromosApi* | [**deletePromoOffers**](docs/PromosApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*PromosApi* | [**getPromoOffers**](docs/PromosApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*PromosApi* | [**getPromos**](docs/PromosApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*PromosApi* | [**updatePromoOffers**](docs/PromosApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*RatingsApi* | [**getQualityRatingDetails**](docs/RatingsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*RatingsApi* | [**getQualityRatings**](docs/RatingsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*RegionsApi* | [**searchRegionChildren**](docs/RegionsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*RegionsApi* | [**searchRegionsById**](docs/RegionsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*RegionsApi* | [**searchRegionsByName**](docs/RegionsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*ReportsApi* | [**generateBoostConsolidatedReport**](docs/ReportsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ReportsApi* | [**generateCompetitorsPositionReport**](docs/ReportsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ReportsApi* | [**generateGoodsFeedbackReport**](docs/ReportsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ReportsApi* | [**generateGoodsMovementReport**](docs/ReportsApi.md#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*ReportsApi* | [**generateGoodsRealizationReport**](docs/ReportsApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ReportsApi* | [**generateGoodsTurnoverReport**](docs/ReportsApi.md#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*ReportsApi* | [**generateMassOrderLabelsReport**](docs/ReportsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ReportsApi* | [**generatePricesReport**](docs/ReportsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ReportsApi* | [**generateShelfsStatisticsReport**](docs/ReportsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ReportsApi* | [**generateShipmentListDocumentReport**](docs/ReportsApi.md#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*ReportsApi* | [**generateShowsSalesReport**](docs/ReportsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ReportsApi* | [**generateStocksOnWarehousesReport**](docs/ReportsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ReportsApi* | [**generateUnitedMarketplaceServicesReport**](docs/ReportsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ReportsApi* | [**generateUnitedNettingReport**](docs/ReportsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ReportsApi* | [**generateUnitedOrdersReport**](docs/ReportsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ReportsApi* | [**getReportInfo**](docs/ReportsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ReturnsApi* | [**getReturn**](docs/ReturnsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ReturnsApi* | [**getReturnApplication**](docs/ReturnsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ReturnsApi* | [**getReturnPhoto**](docs/ReturnsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ReturnsApi* | [**getReturns**](docs/ReturnsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ReturnsApi* | [**setReturnDecision**](docs/ReturnsApi.md#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*ReturnsApi* | [**submitReturnDecision**](docs/ReturnsApi.md#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*ShipmentsApi* | [**confirmShipment**](docs/ShipmentsApi.md#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*ShipmentsApi* | [**downloadShipmentAct**](docs/ShipmentsApi.md#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*ShipmentsApi* | [**downloadShipmentDiscrepancyAct**](docs/ShipmentsApi.md#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*ShipmentsApi* | [**downloadShipmentInboundAct**](docs/ShipmentsApi.md#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*ShipmentsApi* | [**downloadShipmentPalletLabels**](docs/ShipmentsApi.md#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*ShipmentsApi* | [**downloadShipmentReceptionTransferAct**](docs/ShipmentsApi.md#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*ShipmentsApi* | [**downloadShipmentTransportationWaybill**](docs/ShipmentsApi.md#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*ShipmentsApi* | [**getShipment**](docs/ShipmentsApi.md#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*ShipmentsApi* | [**getShipmentOrdersInfo**](docs/ShipmentsApi.md#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*ShipmentsApi* | [**searchShipments**](docs/ShipmentsApi.md#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*ShipmentsApi* | [**setShipmentPalletsCount**](docs/ShipmentsApi.md#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*ShipmentsApi* | [**transferOrdersFromShipment**](docs/ShipmentsApi.md#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*StocksApi* | [**getStocks**](docs/StocksApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*StocksApi* | [**updateStocks**](docs/StocksApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*TariffsApi* | [**calculateTariffs**](docs/TariffsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*WarehousesApi* | [**getFulfillmentWarehouses**](docs/WarehousesApi.md#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*WarehousesApi* | [**getWarehouses**](docs/WarehousesApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


<a id="documentation-for-models"></a>
## Documentation for Models

 - [ympa_kotlin_vertx_server.models.AcceptOrderCancellationRequest](docs/AcceptOrderCancellationRequest.md)
 - [ympa_kotlin_vertx_server.models.AddHiddenOffersRequest](docs/AddHiddenOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.AddOffersToArchiveDTO](docs/AddOffersToArchiveDTO.md)
 - [ympa_kotlin_vertx_server.models.AddOffersToArchiveErrorDTO](docs/AddOffersToArchiveErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.AddOffersToArchiveErrorType](docs/AddOffersToArchiveErrorType.md)
 - [ympa_kotlin_vertx_server.models.AddOffersToArchiveRequest](docs/AddOffersToArchiveRequest.md)
 - [ympa_kotlin_vertx_server.models.AddOffersToArchiveResponse](docs/AddOffersToArchiveResponse.md)
 - [ympa_kotlin_vertx_server.models.AffectedOrderQualityRatingComponentType](docs/AffectedOrderQualityRatingComponentType.md)
 - [ympa_kotlin_vertx_server.models.AgeDTO](docs/AgeDTO.md)
 - [ympa_kotlin_vertx_server.models.AgeUnitType](docs/AgeUnitType.md)
 - [ympa_kotlin_vertx_server.models.ApiClientDataErrorResponse](docs/ApiClientDataErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiErrorDTO](docs/ApiErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.ApiErrorResponse](docs/ApiErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiForbiddenErrorResponse](docs/ApiForbiddenErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiLimitErrorResponse](docs/ApiLimitErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiLockedErrorResponse](docs/ApiLockedErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiNotFoundErrorResponse](docs/ApiNotFoundErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiResponseStatusType](docs/ApiResponseStatusType.md)
 - [ympa_kotlin_vertx_server.models.ApiServerErrorResponse](docs/ApiServerErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.ApiUnauthorizedErrorResponse](docs/ApiUnauthorizedErrorResponse.md)
 - [ympa_kotlin_vertx_server.models.BaseCampaignOfferDTO](docs/BaseCampaignOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.BaseOfferDTO](docs/BaseOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.BasePriceDTO](docs/BasePriceDTO.md)
 - [ympa_kotlin_vertx_server.models.BaseShipmentDTO](docs/BaseShipmentDTO.md)
 - [ympa_kotlin_vertx_server.models.BidRecommendationItemDTO](docs/BidRecommendationItemDTO.md)
 - [ympa_kotlin_vertx_server.models.BriefOrderItemDTO](docs/BriefOrderItemDTO.md)
 - [ympa_kotlin_vertx_server.models.BriefOrderItemInstanceDTO](docs/BriefOrderItemInstanceDTO.md)
 - [ympa_kotlin_vertx_server.models.BusinessDTO](docs/BusinessDTO.md)
 - [ympa_kotlin_vertx_server.models.BusinessSettingsDTO](docs/BusinessSettingsDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsOfferDTO](docs/CalculateTariffsOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsOfferInfoDTO](docs/CalculateTariffsOfferInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsParametersDTO](docs/CalculateTariffsParametersDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsRequest](docs/CalculateTariffsRequest.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsResponse](docs/CalculateTariffsResponse.md)
 - [ympa_kotlin_vertx_server.models.CalculateTariffsResponseDTO](docs/CalculateTariffsResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculatedTariffDTO](docs/CalculatedTariffDTO.md)
 - [ympa_kotlin_vertx_server.models.CalculatedTariffType](docs/CalculatedTariffType.md)
 - [ympa_kotlin_vertx_server.models.CampaignDTO](docs/CampaignDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignQualityRatingDTO](docs/CampaignQualityRatingDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsDTO](docs/CampaignSettingsDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsDeliveryDTO](docs/CampaignSettingsDeliveryDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsLocalRegionDTO](docs/CampaignSettingsLocalRegionDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsScheduleDTO](docs/CampaignSettingsScheduleDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsScheduleSourceType](docs/CampaignSettingsScheduleSourceType.md)
 - [ympa_kotlin_vertx_server.models.CampaignSettingsTimePeriodDTO](docs/CampaignSettingsTimePeriodDTO.md)
 - [ympa_kotlin_vertx_server.models.CampaignsQualityRatingDTO](docs/CampaignsQualityRatingDTO.md)
 - [ympa_kotlin_vertx_server.models.CategoryContentParametersDTO](docs/CategoryContentParametersDTO.md)
 - [ympa_kotlin_vertx_server.models.CategoryDTO](docs/CategoryDTO.md)
 - [ympa_kotlin_vertx_server.models.CategoryErrorDTO](docs/CategoryErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.CategoryErrorType](docs/CategoryErrorType.md)
 - [ympa_kotlin_vertx_server.models.CategoryParameterDTO](docs/CategoryParameterDTO.md)
 - [ympa_kotlin_vertx_server.models.CategoryParameterUnitDTO](docs/CategoryParameterUnitDTO.md)
 - [ympa_kotlin_vertx_server.models.ChangeOutletRequest](docs/ChangeOutletRequest.md)
 - [ympa_kotlin_vertx_server.models.ChannelType](docs/ChannelType.md)
 - [ympa_kotlin_vertx_server.models.ChatMessageDTO](docs/ChatMessageDTO.md)
 - [ympa_kotlin_vertx_server.models.ChatMessagePayloadDTO](docs/ChatMessagePayloadDTO.md)
 - [ympa_kotlin_vertx_server.models.ChatMessageSenderType](docs/ChatMessageSenderType.md)
 - [ympa_kotlin_vertx_server.models.ChatMessagesResultDTO](docs/ChatMessagesResultDTO.md)
 - [ympa_kotlin_vertx_server.models.ChatStatusType](docs/ChatStatusType.md)
 - [ympa_kotlin_vertx_server.models.ChatType](docs/ChatType.md)
 - [ympa_kotlin_vertx_server.models.ConfirmPricesRequest](docs/ConfirmPricesRequest.md)
 - [ympa_kotlin_vertx_server.models.ConfirmShipmentRequest](docs/ConfirmShipmentRequest.md)
 - [ympa_kotlin_vertx_server.models.CreateChatRequest](docs/CreateChatRequest.md)
 - [ympa_kotlin_vertx_server.models.CreateChatResponse](docs/CreateChatResponse.md)
 - [ympa_kotlin_vertx_server.models.CreateChatResultDTO](docs/CreateChatResultDTO.md)
 - [ympa_kotlin_vertx_server.models.CreateOutletResponse](docs/CreateOutletResponse.md)
 - [ympa_kotlin_vertx_server.models.CurrencyType](docs/CurrencyType.md)
 - [ympa_kotlin_vertx_server.models.DayOfWeekType](docs/DayOfWeekType.md)
 - [ympa_kotlin_vertx_server.models.DeleteCampaignOffersDTO](docs/DeleteCampaignOffersDTO.md)
 - [ympa_kotlin_vertx_server.models.DeleteCampaignOffersRequest](docs/DeleteCampaignOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.DeleteCampaignOffersResponse](docs/DeleteCampaignOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.DeleteGoodsFeedbackCommentRequest](docs/DeleteGoodsFeedbackCommentRequest.md)
 - [ympa_kotlin_vertx_server.models.DeleteHiddenOffersRequest](docs/DeleteHiddenOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersDTO](docs/DeleteOffersDTO.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveDTO](docs/DeleteOffersFromArchiveDTO.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveRequest](docs/DeleteOffersFromArchiveRequest.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersFromArchiveResponse](docs/DeleteOffersFromArchiveResponse.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersRequest](docs/DeleteOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.DeleteOffersResponse](docs/DeleteOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.DeletePromoOffersRequest](docs/DeletePromoOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.DeletePromoOffersResponse](docs/DeletePromoOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.DeletePromoOffersResultDTO](docs/DeletePromoOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.DeliveryServiceDTO](docs/DeliveryServiceDTO.md)
 - [ympa_kotlin_vertx_server.models.DeliveryServiceInfoDTO](docs/DeliveryServiceInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.DeliveryServicesDTO](docs/DeliveryServicesDTO.md)
 - [ympa_kotlin_vertx_server.models.DocumentDTO](docs/DocumentDTO.md)
 - [ympa_kotlin_vertx_server.models.EacVerificationResultDTO](docs/EacVerificationResultDTO.md)
 - [ympa_kotlin_vertx_server.models.EacVerificationStatusType](docs/EacVerificationStatusType.md)
 - [ympa_kotlin_vertx_server.models.EmptyApiResponse](docs/EmptyApiResponse.md)
 - [ympa_kotlin_vertx_server.models.EnrichedMappingsOfferDTO](docs/EnrichedMappingsOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.EnrichedModelDTO](docs/EnrichedModelDTO.md)
 - [ympa_kotlin_vertx_server.models.EnrichedModelsDTO](docs/EnrichedModelsDTO.md)
 - [ympa_kotlin_vertx_server.models.EnrichedOrderBoxLayoutDTO](docs/EnrichedOrderBoxLayoutDTO.md)
 - [ympa_kotlin_vertx_server.models.ExtensionShipmentDTO](docs/ExtensionShipmentDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedContentDTO](docs/FeedContentDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedContentErrorDTO](docs/FeedContentErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedContentErrorType](docs/FeedContentErrorType.md)
 - [ympa_kotlin_vertx_server.models.FeedDTO](docs/FeedDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedDownloadDTO](docs/FeedDownloadDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedDownloadErrorDTO](docs/FeedDownloadErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedDownloadErrorType](docs/FeedDownloadErrorType.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsErrorDTO](docs/FeedIndexLogsErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsErrorType](docs/FeedIndexLogsErrorType.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsFeedDTO](docs/FeedIndexLogsFeedDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsIndexType](docs/FeedIndexLogsIndexType.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsOffersDTO](docs/FeedIndexLogsOffersDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsRecordDTO](docs/FeedIndexLogsRecordDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsResultDTO](docs/FeedIndexLogsResultDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedIndexLogsStatusType](docs/FeedIndexLogsStatusType.md)
 - [ympa_kotlin_vertx_server.models.FeedParameterDTO](docs/FeedParameterDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedPlacementDTO](docs/FeedPlacementDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedPublicationDTO](docs/FeedPublicationDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedPublicationFullDTO](docs/FeedPublicationFullDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedPublicationPriceAndStockUpdateDTO](docs/FeedPublicationPriceAndStockUpdateDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedStatusType](docs/FeedStatusType.md)
 - [ympa_kotlin_vertx_server.models.FeedbackAuthorDTO](docs/FeedbackAuthorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackCommentAuthorDTO](docs/FeedbackCommentAuthorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackCommentAuthorType](docs/FeedbackCommentAuthorType.md)
 - [ympa_kotlin_vertx_server.models.FeedbackCommentDTO](docs/FeedbackCommentDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackDTO](docs/FeedbackDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackDeliveryType](docs/FeedbackDeliveryType.md)
 - [ympa_kotlin_vertx_server.models.FeedbackFactorDTO](docs/FeedbackFactorDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackGradesDTO](docs/FeedbackGradesDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackListDTO](docs/FeedbackListDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackOrderDTO](docs/FeedbackOrderDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackReactionStatusType](docs/FeedbackReactionStatusType.md)
 - [ympa_kotlin_vertx_server.models.FeedbackShopDTO](docs/FeedbackShopDTO.md)
 - [ympa_kotlin_vertx_server.models.FeedbackStateType](docs/FeedbackStateType.md)
 - [ympa_kotlin_vertx_server.models.FieldStateType](docs/FieldStateType.md)
 - [ympa_kotlin_vertx_server.models.FlippingPagerDTO](docs/FlippingPagerDTO.md)
 - [ympa_kotlin_vertx_server.models.ForwardScrollingPagerDTO](docs/ForwardScrollingPagerDTO.md)
 - [ympa_kotlin_vertx_server.models.FulfillmentWarehouseDTO](docs/FulfillmentWarehouseDTO.md)
 - [ympa_kotlin_vertx_server.models.FulfillmentWarehousesDTO](docs/FulfillmentWarehousesDTO.md)
 - [ympa_kotlin_vertx_server.models.FullOutletDTO](docs/FullOutletDTO.md)
 - [ympa_kotlin_vertx_server.models.FullOutletLicenseDTO](docs/FullOutletLicenseDTO.md)
 - [ympa_kotlin_vertx_server.models.GenerateBoostConsolidatedRequest](docs/GenerateBoostConsolidatedRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateCompetitorsPositionReportRequest](docs/GenerateCompetitorsPositionReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateGoodsFeedbackRequest](docs/GenerateGoodsFeedbackRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateGoodsMovementReportRequest](docs/GenerateGoodsMovementReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateGoodsRealizationReportRequest](docs/GenerateGoodsRealizationReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateGoodsTurnoverRequest](docs/GenerateGoodsTurnoverRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateMassOrderLabelsRequest](docs/GenerateMassOrderLabelsRequest.md)
 - [ympa_kotlin_vertx_server.models.GeneratePricesReportRequest](docs/GeneratePricesReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateReportDTO](docs/GenerateReportDTO.md)
 - [ympa_kotlin_vertx_server.models.GenerateReportResponse](docs/GenerateReportResponse.md)
 - [ympa_kotlin_vertx_server.models.GenerateShelfsStatisticsRequest](docs/GenerateShelfsStatisticsRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateShipmentListDocumentReportRequest](docs/GenerateShipmentListDocumentReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateShowsSalesReportRequest](docs/GenerateShowsSalesReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateStocksOnWarehousesReportRequest](docs/GenerateStocksOnWarehousesReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateUnitedMarketplaceServicesReportRequest](docs/GenerateUnitedMarketplaceServicesReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateUnitedNettingReportRequest](docs/GenerateUnitedNettingReportRequest.md)
 - [ympa_kotlin_vertx_server.models.GenerateUnitedOrdersRequest](docs/GenerateUnitedOrdersRequest.md)
 - [ympa_kotlin_vertx_server.models.GetAllOffersResponse](docs/GetAllOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetBidsInfoRequest](docs/GetBidsInfoRequest.md)
 - [ympa_kotlin_vertx_server.models.GetBidsInfoResponse](docs/GetBidsInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetBidsInfoResponseDTO](docs/GetBidsInfoResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.GetBidsRecommendationsRequest](docs/GetBidsRecommendationsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetBidsRecommendationsResponse](docs/GetBidsRecommendationsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetBidsRecommendationsResponseDTO](docs/GetBidsRecommendationsResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.GetBusinessBuyerInfoResponse](docs/GetBusinessBuyerInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetBusinessDocumentsInfoResponse](docs/GetBusinessDocumentsInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetBusinessSettingsInfoDTO](docs/GetBusinessSettingsInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetBusinessSettingsResponse](docs/GetBusinessSettingsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignLoginsResponse](docs/GetCampaignLoginsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignOfferDTO](docs/GetCampaignOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignOffersRequest](docs/GetCampaignOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignOffersResponse](docs/GetCampaignOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignOffersResultDTO](docs/GetCampaignOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignRegionResponse](docs/GetCampaignRegionResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignResponse](docs/GetCampaignResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignSettingsResponse](docs/GetCampaignSettingsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCampaignsResponse](docs/GetCampaignsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCategoriesMaxSaleQuantumDTO](docs/GetCategoriesMaxSaleQuantumDTO.md)
 - [ympa_kotlin_vertx_server.models.GetCategoriesMaxSaleQuantumRequest](docs/GetCategoriesMaxSaleQuantumRequest.md)
 - [ympa_kotlin_vertx_server.models.GetCategoriesMaxSaleQuantumResponse](docs/GetCategoriesMaxSaleQuantumResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCategoriesRequest](docs/GetCategoriesRequest.md)
 - [ympa_kotlin_vertx_server.models.GetCategoriesResponse](docs/GetCategoriesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetCategoryContentParametersResponse](docs/GetCategoryContentParametersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetChatHistoryRequest](docs/GetChatHistoryRequest.md)
 - [ympa_kotlin_vertx_server.models.GetChatHistoryResponse](docs/GetChatHistoryResponse.md)
 - [ympa_kotlin_vertx_server.models.GetChatInfoDTO](docs/GetChatInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetChatsInfoDTO](docs/GetChatsInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetChatsRequest](docs/GetChatsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetChatsResponse](docs/GetChatsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetDeliveryServicesResponse](docs/GetDeliveryServicesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetFeedIndexLogsResponse](docs/GetFeedIndexLogsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetFeedResponse](docs/GetFeedResponse.md)
 - [ympa_kotlin_vertx_server.models.GetFeedbackListResponse](docs/GetFeedbackListResponse.md)
 - [ympa_kotlin_vertx_server.models.GetFeedsResponse](docs/GetFeedsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetFulfillmentWarehousesResponse](docs/GetFulfillmentWarehousesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsRequest](docs/GetGoodsFeedbackCommentsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsFeedbackCommentsResponse](docs/GetGoodsFeedbackCommentsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsFeedbackRequest](docs/GetGoodsFeedbackRequest.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsFeedbackResponse](docs/GetGoodsFeedbackResponse.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsStatsRequest](docs/GetGoodsStatsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetGoodsStatsResponse](docs/GetGoodsStatsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetHiddenOffersResponse](docs/GetHiddenOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetHiddenOffersResultDTO](docs/GetHiddenOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetMappingDTO](docs/GetMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.GetModelsOffersResponse](docs/GetModelsOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetModelsRequest](docs/GetModelsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetModelsResponse](docs/GetModelsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusRequest](docs/GetOfferCardsContentStatusRequest.md)
 - [ympa_kotlin_vertx_server.models.GetOfferCardsContentStatusResponse](docs/GetOfferCardsContentStatusResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOfferDTO](docs/GetOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.GetOfferMappingDTO](docs/GetOfferMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.GetOfferMappingEntriesResponse](docs/GetOfferMappingEntriesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOfferMappingsRequest](docs/GetOfferMappingsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetOfferMappingsResponse](docs/GetOfferMappingsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOfferMappingsResultDTO](docs/GetOfferMappingsResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetOfferRecommendationsRequest](docs/GetOfferRecommendationsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetOfferRecommendationsResponse](docs/GetOfferRecommendationsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOffersResponse](docs/GetOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOrderBuyerInfoResponse](docs/GetOrderBuyerInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOrderLabelsDataResponse](docs/GetOrderLabelsDataResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOrderResponse](docs/GetOrderResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOrdersResponse](docs/GetOrdersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOrdersStatsRequest](docs/GetOrdersStatsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetOrdersStatsResponse](docs/GetOrdersStatsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOutletLicensesResponse](docs/GetOutletLicensesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOutletResponse](docs/GetOutletResponse.md)
 - [ympa_kotlin_vertx_server.models.GetOutletsResponse](docs/GetOutletsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetPriceDTO](docs/GetPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPriceWithDiscountDTO](docs/GetPriceWithDiscountDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPriceWithVatDTO](docs/GetPriceWithVatDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPricesByOfferIdsRequest](docs/GetPricesByOfferIdsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetPricesByOfferIdsResponse](docs/GetPricesByOfferIdsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetPricesResponse](docs/GetPricesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetPromoAssortmentInfoDTO](docs/GetPromoAssortmentInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoBestsellerInfoDTO](docs/GetPromoBestsellerInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoConstraintsDTO](docs/GetPromoConstraintsDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoDTO](docs/GetPromoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoMechanicsInfoDTO](docs/GetPromoMechanicsInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoOfferDTO](docs/GetPromoOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoOffersRequest](docs/GetPromoOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.GetPromoOffersResponse](docs/GetPromoOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetPromoOffersResultDTO](docs/GetPromoOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromoPromocodeInfoDTO](docs/GetPromoPromocodeInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.GetPromosRequest](docs/GetPromosRequest.md)
 - [ympa_kotlin_vertx_server.models.GetPromosResponse](docs/GetPromosResponse.md)
 - [ympa_kotlin_vertx_server.models.GetPromosResultDTO](docs/GetPromosResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetQualityRatingDetailsResponse](docs/GetQualityRatingDetailsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetQualityRatingRequest](docs/GetQualityRatingRequest.md)
 - [ympa_kotlin_vertx_server.models.GetQualityRatingResponse](docs/GetQualityRatingResponse.md)
 - [ympa_kotlin_vertx_server.models.GetQuarantineOffersRequest](docs/GetQuarantineOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.GetQuarantineOffersResponse](docs/GetQuarantineOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.GetQuarantineOffersResultDTO](docs/GetQuarantineOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetRegionWithChildrenResponse](docs/GetRegionWithChildrenResponse.md)
 - [ympa_kotlin_vertx_server.models.GetRegionsResponse](docs/GetRegionsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetReportInfoResponse](docs/GetReportInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetReturnResponse](docs/GetReturnResponse.md)
 - [ympa_kotlin_vertx_server.models.GetReturnsResponse](docs/GetReturnsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetShipmentOrdersInfoResponse](docs/GetShipmentOrdersInfoResponse.md)
 - [ympa_kotlin_vertx_server.models.GetShipmentResponse](docs/GetShipmentResponse.md)
 - [ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesRequest](docs/GetSuggestedOfferMappingEntriesRequest.md)
 - [ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingEntriesResponse](docs/GetSuggestedOfferMappingEntriesResponse.md)
 - [ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsRequest](docs/GetSuggestedOfferMappingsRequest.md)
 - [ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResponse](docs/GetSuggestedOfferMappingsResponse.md)
 - [ympa_kotlin_vertx_server.models.GetSuggestedOfferMappingsResultDTO](docs/GetSuggestedOfferMappingsResultDTO.md)
 - [ympa_kotlin_vertx_server.models.GetWarehouseStocksDTO](docs/GetWarehouseStocksDTO.md)
 - [ympa_kotlin_vertx_server.models.GetWarehouseStocksRequest](docs/GetWarehouseStocksRequest.md)
 - [ympa_kotlin_vertx_server.models.GetWarehouseStocksResponse](docs/GetWarehouseStocksResponse.md)
 - [ympa_kotlin_vertx_server.models.GetWarehousesResponse](docs/GetWarehousesResponse.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackCommentAuthorDTO](docs/GoodsFeedbackCommentAuthorDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackCommentAuthorType](docs/GoodsFeedbackCommentAuthorType.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackCommentDTO](docs/GoodsFeedbackCommentDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackCommentListDTO](docs/GoodsFeedbackCommentListDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackCommentStatusType](docs/GoodsFeedbackCommentStatusType.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackDTO](docs/GoodsFeedbackDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackDescriptionDTO](docs/GoodsFeedbackDescriptionDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackIdentifiersDTO](docs/GoodsFeedbackIdentifiersDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackListDTO](docs/GoodsFeedbackListDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackMediaDTO](docs/GoodsFeedbackMediaDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsFeedbackStatisticsDTO](docs/GoodsFeedbackStatisticsDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsStatsDTO](docs/GoodsStatsDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsStatsGoodsDTO](docs/GoodsStatsGoodsDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsStatsWarehouseDTO](docs/GoodsStatsWarehouseDTO.md)
 - [ympa_kotlin_vertx_server.models.GoodsStatsWeightDimensionsDTO](docs/GoodsStatsWeightDimensionsDTO.md)
 - [ympa_kotlin_vertx_server.models.GpsDTO](docs/GpsDTO.md)
 - [ympa_kotlin_vertx_server.models.HiddenOfferDTO](docs/HiddenOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.LanguageType](docs/LanguageType.md)
 - [ympa_kotlin_vertx_server.models.LicenseCheckStatusType](docs/LicenseCheckStatusType.md)
 - [ympa_kotlin_vertx_server.models.LicenseType](docs/LicenseType.md)
 - [ympa_kotlin_vertx_server.models.LogisticPickupPointDTO](docs/LogisticPickupPointDTO.md)
 - [ympa_kotlin_vertx_server.models.LogisticPointType](docs/LogisticPointType.md)
 - [ympa_kotlin_vertx_server.models.MappingsOfferDTO](docs/MappingsOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.MappingsOfferInfoDTO](docs/MappingsOfferInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.MaxSaleQuantumDTO](docs/MaxSaleQuantumDTO.md)
 - [ympa_kotlin_vertx_server.models.MechanicsType](docs/MechanicsType.md)
 - [ympa_kotlin_vertx_server.models.ModelApiResponse](docs/ModelApiResponse.md)
 - [ympa_kotlin_vertx_server.models.ModelDTO](docs/ModelDTO.md)
 - [ympa_kotlin_vertx_server.models.ModelOfferDTO](docs/ModelOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.ModelPriceDTO](docs/ModelPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.ModelsDTO](docs/ModelsDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferAvailabilityStatusType](docs/OfferAvailabilityStatusType.md)
 - [ympa_kotlin_vertx_server.models.OfferCampaignStatusDTO](docs/OfferCampaignStatusDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferCampaignStatusType](docs/OfferCampaignStatusType.md)
 - [ympa_kotlin_vertx_server.models.OfferCardDTO](docs/OfferCardDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferCardRecommendationDTO](docs/OfferCardRecommendationDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferCardRecommendationType](docs/OfferCardRecommendationType.md)
 - [ympa_kotlin_vertx_server.models.OfferCardStatusType](docs/OfferCardStatusType.md)
 - [ympa_kotlin_vertx_server.models.OfferCardsContentStatusDTO](docs/OfferCardsContentStatusDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferConditionDTO](docs/OfferConditionDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferConditionQualityType](docs/OfferConditionQualityType.md)
 - [ympa_kotlin_vertx_server.models.OfferConditionType](docs/OfferConditionType.md)
 - [ympa_kotlin_vertx_server.models.OfferContentDTO](docs/OfferContentDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferContentErrorDTO](docs/OfferContentErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferContentErrorType](docs/OfferContentErrorType.md)
 - [ympa_kotlin_vertx_server.models.OfferDTO](docs/OfferDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferErrorDTO](docs/OfferErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferForRecommendationDTO](docs/OfferForRecommendationDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferManualDTO](docs/OfferManualDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingDTO](docs/OfferMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingEntriesDTO](docs/OfferMappingEntriesDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingEntryDTO](docs/OfferMappingEntryDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingErrorDTO](docs/OfferMappingErrorDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingErrorType](docs/OfferMappingErrorType.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingInfoDTO](docs/OfferMappingInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingKindType](docs/OfferMappingKindType.md)
 - [ympa_kotlin_vertx_server.models.OfferMappingSuggestionsListDTO](docs/OfferMappingSuggestionsListDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferParamDTO](docs/OfferParamDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferPriceByOfferIdsListResponseDTO](docs/OfferPriceByOfferIdsListResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferPriceByOfferIdsResponseDTO](docs/OfferPriceByOfferIdsResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferPriceDTO](docs/OfferPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferPriceListResponseDTO](docs/OfferPriceListResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferPriceResponseDTO](docs/OfferPriceResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferProcessingNoteDTO](docs/OfferProcessingNoteDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferProcessingNoteType](docs/OfferProcessingNoteType.md)
 - [ympa_kotlin_vertx_server.models.OfferProcessingStateDTO](docs/OfferProcessingStateDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferProcessingStatusType](docs/OfferProcessingStatusType.md)
 - [ympa_kotlin_vertx_server.models.OfferRecommendationDTO](docs/OfferRecommendationDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferRecommendationInfoDTO](docs/OfferRecommendationInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferRecommendationsResultDTO](docs/OfferRecommendationsResultDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferSellingProgramDTO](docs/OfferSellingProgramDTO.md)
 - [ympa_kotlin_vertx_server.models.OfferSellingProgramStatusType](docs/OfferSellingProgramStatusType.md)
 - [ympa_kotlin_vertx_server.models.OfferType](docs/OfferType.md)
 - [ympa_kotlin_vertx_server.models.OfferWeightDimensionsDTO](docs/OfferWeightDimensionsDTO.md)
 - [ympa_kotlin_vertx_server.models.OffersDTO](docs/OffersDTO.md)
 - [ympa_kotlin_vertx_server.models.OptionValuesLimitedDTO](docs/OptionValuesLimitedDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBoxLayoutDTO](docs/OrderBoxLayoutDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBoxLayoutItemDTO](docs/OrderBoxLayoutItemDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBoxLayoutPartialCountDTO](docs/OrderBoxLayoutPartialCountDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBoxesLayoutDTO](docs/OrderBoxesLayoutDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBusinessBuyerDTO](docs/OrderBusinessBuyerDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBusinessDocumentsDTO](docs/OrderBusinessDocumentsDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBuyerBasicInfoDTO](docs/OrderBuyerBasicInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBuyerDTO](docs/OrderBuyerDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBuyerInfoDTO](docs/OrderBuyerInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderBuyerType](docs/OrderBuyerType.md)
 - [ympa_kotlin_vertx_server.models.OrderCancellationReasonType](docs/OrderCancellationReasonType.md)
 - [ympa_kotlin_vertx_server.models.OrderCourierDTO](docs/OrderCourierDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDTO](docs/OrderDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryAddressDTO](docs/OrderDeliveryAddressDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryDTO](docs/OrderDeliveryDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryDateDTO](docs/OrderDeliveryDateDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryDateReasonType](docs/OrderDeliveryDateReasonType.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryDatesDTO](docs/OrderDeliveryDatesDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryDispatchType](docs/OrderDeliveryDispatchType.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryEacType](docs/OrderDeliveryEacType.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryPartnerType](docs/OrderDeliveryPartnerType.md)
 - [ympa_kotlin_vertx_server.models.OrderDeliveryType](docs/OrderDeliveryType.md)
 - [ympa_kotlin_vertx_server.models.OrderDigitalItemDTO](docs/OrderDigitalItemDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderDocumentStatusType](docs/OrderDocumentStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderItemDTO](docs/OrderItemDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemDetailDTO](docs/OrderItemDetailDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemInstanceDTO](docs/OrderItemInstanceDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemInstanceModificationDTO](docs/OrderItemInstanceModificationDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemInstanceType](docs/OrderItemInstanceType.md)
 - [ympa_kotlin_vertx_server.models.OrderItemModificationDTO](docs/OrderItemModificationDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemPromoDTO](docs/OrderItemPromoDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemStatusType](docs/OrderItemStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderItemSubsidyDTO](docs/OrderItemSubsidyDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderItemSubsidyType](docs/OrderItemSubsidyType.md)
 - [ympa_kotlin_vertx_server.models.OrderItemsModificationRequestReasonType](docs/OrderItemsModificationRequestReasonType.md)
 - [ympa_kotlin_vertx_server.models.OrderItemsModificationResultDTO](docs/OrderItemsModificationResultDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderLabelDTO](docs/OrderLabelDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderLiftType](docs/OrderLiftType.md)
 - [ympa_kotlin_vertx_server.models.OrderParcelBoxDTO](docs/OrderParcelBoxDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderPaymentMethodType](docs/OrderPaymentMethodType.md)
 - [ympa_kotlin_vertx_server.models.OrderPaymentType](docs/OrderPaymentType.md)
 - [ympa_kotlin_vertx_server.models.OrderPromoType](docs/OrderPromoType.md)
 - [ympa_kotlin_vertx_server.models.OrderShipmentDTO](docs/OrderShipmentDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderStateDTO](docs/OrderStateDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderStatsStatusType](docs/OrderStatsStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderStatusChangeDTO](docs/OrderStatusChangeDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderStatusChangeDeliveryDTO](docs/OrderStatusChangeDeliveryDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderStatusChangeDeliveryDatesDTO](docs/OrderStatusChangeDeliveryDatesDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderStatusType](docs/OrderStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderSubsidyDTO](docs/OrderSubsidyDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderSubsidyType](docs/OrderSubsidyType.md)
 - [ympa_kotlin_vertx_server.models.OrderSubstatusType](docs/OrderSubstatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderTaxSystemType](docs/OrderTaxSystemType.md)
 - [ympa_kotlin_vertx_server.models.OrderTrackDTO](docs/OrderTrackDTO.md)
 - [ympa_kotlin_vertx_server.models.OrderUpdateStatusType](docs/OrderUpdateStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrderVatType](docs/OrderVatType.md)
 - [ympa_kotlin_vertx_server.models.OrdersShipmentInfoDTO](docs/OrdersShipmentInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsCommissionDTO](docs/OrdersStatsCommissionDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsCommissionType](docs/OrdersStatsCommissionType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsDTO](docs/OrdersStatsDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsDeliveryRegionDTO](docs/OrdersStatsDeliveryRegionDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsDetailsDTO](docs/OrdersStatsDetailsDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsItemDTO](docs/OrdersStatsItemDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsItemStatusType](docs/OrdersStatsItemStatusType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsOrderDTO](docs/OrdersStatsOrderDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsOrderPaymentType](docs/OrdersStatsOrderPaymentType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPaymentDTO](docs/OrdersStatsPaymentDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPaymentOrderDTO](docs/OrdersStatsPaymentOrderDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPaymentSourceType](docs/OrdersStatsPaymentSourceType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPaymentType](docs/OrdersStatsPaymentType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPriceDTO](docs/OrdersStatsPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsPriceType](docs/OrdersStatsPriceType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsStockType](docs/OrdersStatsStockType.md)
 - [ympa_kotlin_vertx_server.models.OrdersStatsWarehouseDTO](docs/OrdersStatsWarehouseDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletAddressDTO](docs/OutletAddressDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletDTO](docs/OutletDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletDeliveryRuleDTO](docs/OutletDeliveryRuleDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletLicenseDTO](docs/OutletLicenseDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletLicensesResponseDTO](docs/OutletLicensesResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletResponseDTO](docs/OutletResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletStatusType](docs/OutletStatusType.md)
 - [ympa_kotlin_vertx_server.models.OutletType](docs/OutletType.md)
 - [ympa_kotlin_vertx_server.models.OutletVisibilityType](docs/OutletVisibilityType.md)
 - [ympa_kotlin_vertx_server.models.OutletWorkingScheduleDTO](docs/OutletWorkingScheduleDTO.md)
 - [ympa_kotlin_vertx_server.models.OutletWorkingScheduleItemDTO](docs/OutletWorkingScheduleItemDTO.md)
 - [ympa_kotlin_vertx_server.models.PageFormatType](docs/PageFormatType.md)
 - [ympa_kotlin_vertx_server.models.PagedReturnsDTO](docs/PagedReturnsDTO.md)
 - [ympa_kotlin_vertx_server.models.PalletsCountDTO](docs/PalletsCountDTO.md)
 - [ympa_kotlin_vertx_server.models.ParameterType](docs/ParameterType.md)
 - [ympa_kotlin_vertx_server.models.ParameterValueConstraintsDTO](docs/ParameterValueConstraintsDTO.md)
 - [ympa_kotlin_vertx_server.models.ParameterValueDTO](docs/ParameterValueDTO.md)
 - [ympa_kotlin_vertx_server.models.ParameterValueOptionDTO](docs/ParameterValueOptionDTO.md)
 - [ympa_kotlin_vertx_server.models.ParcelBoxDTO](docs/ParcelBoxDTO.md)
 - [ympa_kotlin_vertx_server.models.ParcelBoxLabelDTO](docs/ParcelBoxLabelDTO.md)
 - [ympa_kotlin_vertx_server.models.ParcelDTO](docs/ParcelDTO.md)
 - [ympa_kotlin_vertx_server.models.PartnerShipmentWarehouseDTO](docs/PartnerShipmentWarehouseDTO.md)
 - [ympa_kotlin_vertx_server.models.PaymentFrequencyType](docs/PaymentFrequencyType.md)
 - [ympa_kotlin_vertx_server.models.PickupAddressDTO](docs/PickupAddressDTO.md)
 - [ympa_kotlin_vertx_server.models.PlacementType](docs/PlacementType.md)
 - [ympa_kotlin_vertx_server.models.PriceCompetitivenessThresholdsDTO](docs/PriceCompetitivenessThresholdsDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceCompetitivenessType](docs/PriceCompetitivenessType.md)
 - [ympa_kotlin_vertx_server.models.PriceDTO](docs/PriceDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceQuarantineVerdictDTO](docs/PriceQuarantineVerdictDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceQuarantineVerdictParamNameType](docs/PriceQuarantineVerdictParamNameType.md)
 - [ympa_kotlin_vertx_server.models.PriceQuarantineVerdictParameterDTO](docs/PriceQuarantineVerdictParameterDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceQuarantineVerdictType](docs/PriceQuarantineVerdictType.md)
 - [ympa_kotlin_vertx_server.models.PriceRecommendationItemDTO](docs/PriceRecommendationItemDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceSuggestDTO](docs/PriceSuggestDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceSuggestOfferDTO](docs/PriceSuggestOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.PriceSuggestType](docs/PriceSuggestType.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferAutoParticipatingDetailsDTO](docs/PromoOfferAutoParticipatingDetailsDTO.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferDiscountParamsDTO](docs/PromoOfferDiscountParamsDTO.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferParamsDTO](docs/PromoOfferParamsDTO.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferParticipationStatusFilterType](docs/PromoOfferParticipationStatusFilterType.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferParticipationStatusType](docs/PromoOfferParticipationStatusType.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferPromocodeParamsDTO](docs/PromoOfferPromocodeParamsDTO.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferUpdateWarningCodeType](docs/PromoOfferUpdateWarningCodeType.md)
 - [ympa_kotlin_vertx_server.models.PromoOfferUpdateWarningDTO](docs/PromoOfferUpdateWarningDTO.md)
 - [ympa_kotlin_vertx_server.models.PromoParticipationType](docs/PromoParticipationType.md)
 - [ympa_kotlin_vertx_server.models.PromoPeriodDTO](docs/PromoPeriodDTO.md)
 - [ympa_kotlin_vertx_server.models.ProvideOrderDigitalCodesRequest](docs/ProvideOrderDigitalCodesRequest.md)
 - [ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersRequest](docs/ProvideOrderItemIdentifiersRequest.md)
 - [ympa_kotlin_vertx_server.models.ProvideOrderItemIdentifiersResponse](docs/ProvideOrderItemIdentifiersResponse.md)
 - [ympa_kotlin_vertx_server.models.PutSkuBidsRequest](docs/PutSkuBidsRequest.md)
 - [ympa_kotlin_vertx_server.models.QualityRatingAffectedOrderDTO](docs/QualityRatingAffectedOrderDTO.md)
 - [ympa_kotlin_vertx_server.models.QualityRatingComponentDTO](docs/QualityRatingComponentDTO.md)
 - [ympa_kotlin_vertx_server.models.QualityRatingComponentType](docs/QualityRatingComponentType.md)
 - [ympa_kotlin_vertx_server.models.QualityRatingDTO](docs/QualityRatingDTO.md)
 - [ympa_kotlin_vertx_server.models.QualityRatingDetailsDTO](docs/QualityRatingDetailsDTO.md)
 - [ympa_kotlin_vertx_server.models.QuantumDTO](docs/QuantumDTO.md)
 - [ympa_kotlin_vertx_server.models.QuarantineOfferDTO](docs/QuarantineOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.RecipientType](docs/RecipientType.md)
 - [ympa_kotlin_vertx_server.models.RefundStatusType](docs/RefundStatusType.md)
 - [ympa_kotlin_vertx_server.models.RegionDTO](docs/RegionDTO.md)
 - [ympa_kotlin_vertx_server.models.RegionType](docs/RegionType.md)
 - [ympa_kotlin_vertx_server.models.RegionalModelInfoDTO](docs/RegionalModelInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.RejectedPromoOfferDeleteDTO](docs/RejectedPromoOfferDeleteDTO.md)
 - [ympa_kotlin_vertx_server.models.RejectedPromoOfferDeleteReasonType](docs/RejectedPromoOfferDeleteReasonType.md)
 - [ympa_kotlin_vertx_server.models.RejectedPromoOfferUpdateDTO](docs/RejectedPromoOfferUpdateDTO.md)
 - [ympa_kotlin_vertx_server.models.RejectedPromoOfferUpdateReasonType](docs/RejectedPromoOfferUpdateReasonType.md)
 - [ympa_kotlin_vertx_server.models.ReportFormatType](docs/ReportFormatType.md)
 - [ympa_kotlin_vertx_server.models.ReportInfoDTO](docs/ReportInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.ReportStatusType](docs/ReportStatusType.md)
 - [ympa_kotlin_vertx_server.models.ReportSubStatusType](docs/ReportSubStatusType.md)
 - [ympa_kotlin_vertx_server.models.ReturnDTO](docs/ReturnDTO.md)
 - [ympa_kotlin_vertx_server.models.ReturnDecisionDTO](docs/ReturnDecisionDTO.md)
 - [ympa_kotlin_vertx_server.models.ReturnDecisionReasonType](docs/ReturnDecisionReasonType.md)
 - [ympa_kotlin_vertx_server.models.ReturnDecisionSubreasonType](docs/ReturnDecisionSubreasonType.md)
 - [ympa_kotlin_vertx_server.models.ReturnDecisionType](docs/ReturnDecisionType.md)
 - [ympa_kotlin_vertx_server.models.ReturnInstanceDTO](docs/ReturnInstanceDTO.md)
 - [ympa_kotlin_vertx_server.models.ReturnInstanceStatusType](docs/ReturnInstanceStatusType.md)
 - [ympa_kotlin_vertx_server.models.ReturnInstanceStockType](docs/ReturnInstanceStockType.md)
 - [ympa_kotlin_vertx_server.models.ReturnItemDTO](docs/ReturnItemDTO.md)
 - [ympa_kotlin_vertx_server.models.ReturnRequestDecisionType](docs/ReturnRequestDecisionType.md)
 - [ympa_kotlin_vertx_server.models.ReturnShipmentStatusType](docs/ReturnShipmentStatusType.md)
 - [ympa_kotlin_vertx_server.models.ReturnType](docs/ReturnType.md)
 - [ympa_kotlin_vertx_server.models.ScrollingPagerDTO](docs/ScrollingPagerDTO.md)
 - [ympa_kotlin_vertx_server.models.SearchModelsResponse](docs/SearchModelsResponse.md)
 - [ympa_kotlin_vertx_server.models.SearchShipmentsRequest](docs/SearchShipmentsRequest.md)
 - [ympa_kotlin_vertx_server.models.SearchShipmentsResponse](docs/SearchShipmentsResponse.md)
 - [ympa_kotlin_vertx_server.models.SearchShipmentsResponseDTO](docs/SearchShipmentsResponseDTO.md)
 - [ympa_kotlin_vertx_server.models.SellingProgramType](docs/SellingProgramType.md)
 - [ympa_kotlin_vertx_server.models.SendMessageToChatRequest](docs/SendMessageToChatRequest.md)
 - [ympa_kotlin_vertx_server.models.SetFeedParamsRequest](docs/SetFeedParamsRequest.md)
 - [ympa_kotlin_vertx_server.models.SetOrderBoxLayoutRequest](docs/SetOrderBoxLayoutRequest.md)
 - [ympa_kotlin_vertx_server.models.SetOrderBoxLayoutResponse](docs/SetOrderBoxLayoutResponse.md)
 - [ympa_kotlin_vertx_server.models.SetOrderDeliveryDateRequest](docs/SetOrderDeliveryDateRequest.md)
 - [ympa_kotlin_vertx_server.models.SetOrderDeliveryTrackCodeRequest](docs/SetOrderDeliveryTrackCodeRequest.md)
 - [ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesRequest](docs/SetOrderShipmentBoxesRequest.md)
 - [ympa_kotlin_vertx_server.models.SetOrderShipmentBoxesResponse](docs/SetOrderShipmentBoxesResponse.md)
 - [ympa_kotlin_vertx_server.models.SetReturnDecisionRequest](docs/SetReturnDecisionRequest.md)
 - [ympa_kotlin_vertx_server.models.SetShipmentPalletsCountRequest](docs/SetShipmentPalletsCountRequest.md)
 - [ympa_kotlin_vertx_server.models.ShelfsStatisticsAttributionType](docs/ShelfsStatisticsAttributionType.md)
 - [ympa_kotlin_vertx_server.models.ShipmentActionType](docs/ShipmentActionType.md)
 - [ympa_kotlin_vertx_server.models.ShipmentBoxesDTO](docs/ShipmentBoxesDTO.md)
 - [ympa_kotlin_vertx_server.models.ShipmentDTO](docs/ShipmentDTO.md)
 - [ympa_kotlin_vertx_server.models.ShipmentInfoDTO](docs/ShipmentInfoDTO.md)
 - [ympa_kotlin_vertx_server.models.ShipmentPalletLabelPageFormatType](docs/ShipmentPalletLabelPageFormatType.md)
 - [ympa_kotlin_vertx_server.models.ShipmentStatusChangeDTO](docs/ShipmentStatusChangeDTO.md)
 - [ympa_kotlin_vertx_server.models.ShipmentStatusType](docs/ShipmentStatusType.md)
 - [ympa_kotlin_vertx_server.models.ShipmentType](docs/ShipmentType.md)
 - [ympa_kotlin_vertx_server.models.ShowsSalesGroupingType](docs/ShowsSalesGroupingType.md)
 - [ympa_kotlin_vertx_server.models.SkipGoodsFeedbackReactionRequest](docs/SkipGoodsFeedbackReactionRequest.md)
 - [ympa_kotlin_vertx_server.models.SkuBidItemDTO](docs/SkuBidItemDTO.md)
 - [ympa_kotlin_vertx_server.models.SkuBidRecommendationItemDTO](docs/SkuBidRecommendationItemDTO.md)
 - [ympa_kotlin_vertx_server.models.SortOrderType](docs/SortOrderType.md)
 - [ympa_kotlin_vertx_server.models.SuggestOfferPriceDTO](docs/SuggestOfferPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.SuggestPricesRequest](docs/SuggestPricesRequest.md)
 - [ympa_kotlin_vertx_server.models.SuggestPricesResponse](docs/SuggestPricesResponse.md)
 - [ympa_kotlin_vertx_server.models.SuggestPricesResultDTO](docs/SuggestPricesResultDTO.md)
 - [ympa_kotlin_vertx_server.models.SuggestedOfferDTO](docs/SuggestedOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.SuggestedOfferMappingDTO](docs/SuggestedOfferMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.TariffDTO](docs/TariffDTO.md)
 - [ympa_kotlin_vertx_server.models.TariffParameterDTO](docs/TariffParameterDTO.md)
 - [ympa_kotlin_vertx_server.models.TariffType](docs/TariffType.md)
 - [ympa_kotlin_vertx_server.models.TimePeriodDTO](docs/TimePeriodDTO.md)
 - [ympa_kotlin_vertx_server.models.TimeUnitType](docs/TimeUnitType.md)
 - [ympa_kotlin_vertx_server.models.TrackDTO](docs/TrackDTO.md)
 - [ympa_kotlin_vertx_server.models.TransferOrdersFromShipmentRequest](docs/TransferOrdersFromShipmentRequest.md)
 - [ympa_kotlin_vertx_server.models.TurnoverDTO](docs/TurnoverDTO.md)
 - [ympa_kotlin_vertx_server.models.TurnoverType](docs/TurnoverType.md)
 - [ympa_kotlin_vertx_server.models.UnitDTO](docs/UnitDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateBusinessOfferPriceDTO](docs/UpdateBusinessOfferPriceDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateBusinessPricesRequest](docs/UpdateBusinessPricesRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateCampaignOfferDTO](docs/UpdateCampaignOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateCampaignOffersRequest](docs/UpdateCampaignOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentDTO](docs/UpdateGoodsFeedbackCommentDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentRequest](docs/UpdateGoodsFeedbackCommentRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateGoodsFeedbackCommentResponse](docs/UpdateGoodsFeedbackCommentResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdateMappingDTO](docs/UpdateMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateMappingsOfferDTO](docs/UpdateMappingsOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferContentRequest](docs/UpdateOfferContentRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferContentResponse](docs/UpdateOfferContentResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferContentResultDTO](docs/UpdateOfferContentResultDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferDTO](docs/UpdateOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingDTO](docs/UpdateOfferMappingDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryDTO](docs/UpdateOfferMappingEntryDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingEntryRequest](docs/UpdateOfferMappingEntryRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingResultDTO](docs/UpdateOfferMappingResultDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingsRequest](docs/UpdateOfferMappingsRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOfferMappingsResponse](docs/UpdateOfferMappingsResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderItemRequest](docs/UpdateOrderItemRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusDTO](docs/UpdateOrderStatusDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusRequest](docs/UpdateOrderStatusRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusResponse](docs/UpdateOrderStatusResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusesDTO](docs/UpdateOrderStatusesDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusesRequest](docs/UpdateOrderStatusesRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStatusesResponse](docs/UpdateOrderStatusesResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdateOrderStorageLimitRequest](docs/UpdateOrderStorageLimitRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateOutletLicenseRequest](docs/UpdateOutletLicenseRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdatePriceWithDiscountDTO](docs/UpdatePriceWithDiscountDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdatePricesRequest](docs/UpdatePricesRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOfferDTO](docs/UpdatePromoOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOfferDiscountParamsDTO](docs/UpdatePromoOfferDiscountParamsDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOfferParamsDTO](docs/UpdatePromoOfferParamsDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOffersRequest](docs/UpdatePromoOffersRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOffersResponse](docs/UpdatePromoOffersResponse.md)
 - [ympa_kotlin_vertx_server.models.UpdatePromoOffersResultDTO](docs/UpdatePromoOffersResultDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateStockDTO](docs/UpdateStockDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateStockItemDTO](docs/UpdateStockItemDTO.md)
 - [ympa_kotlin_vertx_server.models.UpdateStocksRequest](docs/UpdateStocksRequest.md)
 - [ympa_kotlin_vertx_server.models.UpdateTimeDTO](docs/UpdateTimeDTO.md)
 - [ympa_kotlin_vertx_server.models.ValueRestrictionDTO](docs/ValueRestrictionDTO.md)
 - [ympa_kotlin_vertx_server.models.VerifyOrderEacRequest](docs/VerifyOrderEacRequest.md)
 - [ympa_kotlin_vertx_server.models.VerifyOrderEacResponse](docs/VerifyOrderEacResponse.md)
 - [ympa_kotlin_vertx_server.models.WarehouseAddressDTO](docs/WarehouseAddressDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseDTO](docs/WarehouseDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseGroupDTO](docs/WarehouseGroupDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseOfferDTO](docs/WarehouseOfferDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseOffersDTO](docs/WarehouseOffersDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseStockDTO](docs/WarehouseStockDTO.md)
 - [ympa_kotlin_vertx_server.models.WarehouseStockType](docs/WarehouseStockType.md)
 - [ympa_kotlin_vertx_server.models.WarehousesDTO](docs/WarehousesDTO.md)
 - [ympa_kotlin_vertx_server.models.WarningPromoOfferUpdateDTO](docs/WarningPromoOfferUpdateDTO.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="OAuth"></a>
### OAuth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://oauth.yandex.ru/authorize
- **Scopes**: 
  - market:partner-api: API Яндекс.Маркета / Поиска по товарам для партнеров

