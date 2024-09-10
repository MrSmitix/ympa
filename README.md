# Партнерский API Маркета - Jetbrains API Client

## General API description

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

* API basepath : [https://api.partner.market.yandex.ru](https://api.partner.market.yandex.ru)
* Version : LATEST

## Documentation for API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*, but will link to the `.http` file that contains the endpoint definition.
There may be multiple requests for a single endpoint, one for each example described in the OpenAPI specification.

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BidsApi* | [**getBidsInfoForBusiness**](Apis/BidsApi.http#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*BidsApi* | [**getBidsRecommendations**](Apis/BidsApi.http#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*BidsApi* | [**putBidsForBusiness**](Apis/BidsApi.http#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*BidsApi* | [**putBidsForCampaign**](Apis/BidsApi.http#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*BusinessOfferMappingsApi* | [**addOffersToArchive**](Apis/BusinessOfferMappingsApi.http#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*BusinessOfferMappingsApi* | [**deleteOffers**](Apis/BusinessOfferMappingsApi.http#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*BusinessOfferMappingsApi* | [**deleteOffersFromArchive**](Apis/BusinessOfferMappingsApi.http#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*BusinessOfferMappingsApi* | [**getOfferMappings**](Apis/BusinessOfferMappingsApi.http#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*BusinessOfferMappingsApi* | [**getSuggestedOfferMappings**](Apis/BusinessOfferMappingsApi.http#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*BusinessOfferMappingsApi* | [**updateOfferMappings**](Apis/BusinessOfferMappingsApi.http#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*BusinessesApi* | [**getBusinessSettings**](Apis/BusinessesApi.http#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*CampaignsApi* | [**getCampaign**](Apis/CampaignsApi.http#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*CampaignsApi* | [**getCampaignLogins**](Apis/CampaignsApi.http#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*CampaignsApi* | [**getCampaignRegion**](Apis/CampaignsApi.http#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*CampaignsApi* | [**getCampaignSettings**](Apis/CampaignsApi.http#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*CampaignsApi* | [**getCampaigns**](Apis/CampaignsApi.http#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*CampaignsApi* | [**getCampaignsByLogin**](Apis/CampaignsApi.http#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*CategoriesApi* | [**getCategoriesMaxSaleQuantum**](Apis/CategoriesApi.http#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*CategoriesApi* | [**getCategoriesTree**](Apis/CategoriesApi.http#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*ChatsApi* | [**createChat**](Apis/ChatsApi.http#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ChatsApi* | [**getChatHistory**](Apis/ChatsApi.http#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ChatsApi* | [**getChats**](Apis/ChatsApi.http#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ChatsApi* | [**sendFileToChat**](Apis/ChatsApi.http#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ChatsApi* | [**sendMessageToChat**](Apis/ChatsApi.http#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ContentApi* | [**getCategoryContentParameters**](Apis/ContentApi.http#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ContentApi* | [**getOfferCardsContentStatus**](Apis/ContentApi.http#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ContentApi* | [**updateOfferContent**](Apis/ContentApi.http#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**acceptOrderCancellation**](Apis/DbsApi.http#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*DbsApi* | [**addHiddenOffers**](Apis/DbsApi.http#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*DbsApi* | [**addOffersToArchive**](Apis/DbsApi.http#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*DbsApi* | [**calculateTariffs**](Apis/DbsApi.http#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*DbsApi* | [**confirmBusinessPrices**](Apis/DbsApi.http#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*DbsApi* | [**confirmCampaignPrices**](Apis/DbsApi.http#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*DbsApi* | [**createChat**](Apis/DbsApi.http#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*DbsApi* | [**createOutlet**](Apis/DbsApi.http#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*DbsApi* | [**deleteCampaignOffers**](Apis/DbsApi.http#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*DbsApi* | [**deleteGoodsFeedbackComment**](Apis/DbsApi.http#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*DbsApi* | [**deleteHiddenOffers**](Apis/DbsApi.http#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*DbsApi* | [**deleteOffers**](Apis/DbsApi.http#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*DbsApi* | [**deleteOffersFromArchive**](Apis/DbsApi.http#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*DbsApi* | [**deleteOutlet**](Apis/DbsApi.http#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*DbsApi* | [**deleteOutletLicenses**](Apis/DbsApi.http#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*DbsApi* | [**deletePromoOffers**](Apis/DbsApi.http#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*DbsApi* | [**generateBoostConsolidatedReport**](Apis/DbsApi.http#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*DbsApi* | [**generateCompetitorsPositionReport**](Apis/DbsApi.http#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*DbsApi* | [**generateGoodsFeedbackReport**](Apis/DbsApi.http#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*DbsApi* | [**generateMassOrderLabelsReport**](Apis/DbsApi.http#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*DbsApi* | [**generateOrderLabel**](Apis/DbsApi.http#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*DbsApi* | [**generateOrderLabels**](Apis/DbsApi.http#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*DbsApi* | [**generatePricesReport**](Apis/DbsApi.http#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*DbsApi* | [**generateShelfsStatisticsReport**](Apis/DbsApi.http#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*DbsApi* | [**generateShowsSalesReport**](Apis/DbsApi.http#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*DbsApi* | [**generateStocksOnWarehousesReport**](Apis/DbsApi.http#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*DbsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/DbsApi.http#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*DbsApi* | [**generateUnitedNettingReport**](Apis/DbsApi.http#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*DbsApi* | [**generateUnitedOrdersReport**](Apis/DbsApi.http#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*DbsApi* | [**getAllOffers**](Apis/DbsApi.http#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*DbsApi* | [**getBidsInfoForBusiness**](Apis/DbsApi.http#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*DbsApi* | [**getBidsRecommendations**](Apis/DbsApi.http#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*DbsApi* | [**getBusinessQuarantineOffers**](Apis/DbsApi.http#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*DbsApi* | [**getBusinessSettings**](Apis/DbsApi.http#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*DbsApi* | [**getCampaign**](Apis/DbsApi.http#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*DbsApi* | [**getCampaignLogins**](Apis/DbsApi.http#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*DbsApi* | [**getCampaignOffers**](Apis/DbsApi.http#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*DbsApi* | [**getCampaignQuarantineOffers**](Apis/DbsApi.http#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*DbsApi* | [**getCampaignRegion**](Apis/DbsApi.http#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*DbsApi* | [**getCampaignSettings**](Apis/DbsApi.http#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*DbsApi* | [**getCampaigns**](Apis/DbsApi.http#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*DbsApi* | [**getCampaignsByLogin**](Apis/DbsApi.http#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*DbsApi* | [**getCategoriesMaxSaleQuantum**](Apis/DbsApi.http#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*DbsApi* | [**getCategoriesTree**](Apis/DbsApi.http#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*DbsApi* | [**getCategoryContentParameters**](Apis/DbsApi.http#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*DbsApi* | [**getChatHistory**](Apis/DbsApi.http#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*DbsApi* | [**getChats**](Apis/DbsApi.http#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*DbsApi* | [**getDeliveryServices**](Apis/DbsApi.http#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*DbsApi* | [**getFeed**](Apis/DbsApi.http#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*DbsApi* | [**getFeedIndexLogs**](Apis/DbsApi.http#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*DbsApi* | [**getFeedbackAndCommentUpdates**](Apis/DbsApi.http#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*DbsApi* | [**getFeeds**](Apis/DbsApi.http#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*DbsApi* | [**getGoodsFeedbackComments**](Apis/DbsApi.http#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*DbsApi* | [**getGoodsFeedbacks**](Apis/DbsApi.http#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*DbsApi* | [**getGoodsStats**](Apis/DbsApi.http#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*DbsApi* | [**getHiddenOffers**](Apis/DbsApi.http#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*DbsApi* | [**getModel**](Apis/DbsApi.http#getmodel) | **GET** /models/{modelId} | Информация об одной модели
*DbsApi* | [**getModelOffers**](Apis/DbsApi.http#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*DbsApi* | [**getModels**](Apis/DbsApi.http#getmodels) | **POST** /models | Информация о нескольких моделях
*DbsApi* | [**getModelsOffers**](Apis/DbsApi.http#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей
*DbsApi* | [**getOfferCardsContentStatus**](Apis/DbsApi.http#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*DbsApi* | [**getOfferMappingEntries**](Apis/DbsApi.http#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*DbsApi* | [**getOfferMappings**](Apis/DbsApi.http#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*DbsApi* | [**getOfferRecommendations**](Apis/DbsApi.http#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*DbsApi* | [**getOffers**](Apis/DbsApi.http#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*DbsApi* | [**getOrder**](Apis/DbsApi.http#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*DbsApi* | [**getOrderBusinessBuyerInfo**](Apis/DbsApi.http#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*DbsApi* | [**getOrderBusinessDocumentsInfo**](Apis/DbsApi.http#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*DbsApi* | [**getOrderBuyerInfo**](Apis/DbsApi.http#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*DbsApi* | [**getOrderLabelsData**](Apis/DbsApi.http#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*DbsApi* | [**getOrders**](Apis/DbsApi.http#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*DbsApi* | [**getOrdersStats**](Apis/DbsApi.http#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*DbsApi* | [**getOutlet**](Apis/DbsApi.http#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*DbsApi* | [**getOutletLicenses**](Apis/DbsApi.http#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*DbsApi* | [**getOutlets**](Apis/DbsApi.http#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*DbsApi* | [**getPrices**](Apis/DbsApi.http#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*DbsApi* | [**getPricesByOfferIds**](Apis/DbsApi.http#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*DbsApi* | [**getPromoOffers**](Apis/DbsApi.http#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*DbsApi* | [**getPromos**](Apis/DbsApi.http#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*DbsApi* | [**getQualityRatingDetails**](Apis/DbsApi.http#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*DbsApi* | [**getQualityRatings**](Apis/DbsApi.http#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*DbsApi* | [**getReportInfo**](Apis/DbsApi.http#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*DbsApi* | [**getReturn**](Apis/DbsApi.http#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*DbsApi* | [**getReturnApplication**](Apis/DbsApi.http#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*DbsApi* | [**getReturnPhoto**](Apis/DbsApi.http#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*DbsApi* | [**getReturns**](Apis/DbsApi.http#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*DbsApi* | [**getStocks**](Apis/DbsApi.http#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*DbsApi* | [**getSuggestedOfferMappingEntries**](Apis/DbsApi.http#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*DbsApi* | [**getSuggestedOfferMappings**](Apis/DbsApi.http#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*DbsApi* | [**getSuggestedPrices**](Apis/DbsApi.http#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*DbsApi* | [**getWarehouses**](Apis/DbsApi.http#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*DbsApi* | [**provideOrderDigitalCodes**](Apis/DbsApi.http#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*DbsApi* | [**provideOrderItemIdentifiers**](Apis/DbsApi.http#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*DbsApi* | [**putBidsForBusiness**](Apis/DbsApi.http#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*DbsApi* | [**putBidsForCampaign**](Apis/DbsApi.http#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*DbsApi* | [**refreshFeed**](Apis/DbsApi.http#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*DbsApi* | [**searchModels**](Apis/DbsApi.http#searchmodels) | **GET** /models | Поиск модели товара
*DbsApi* | [**searchRegionChildren**](Apis/DbsApi.http#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*DbsApi* | [**searchRegionsById**](Apis/DbsApi.http#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*DbsApi* | [**searchRegionsByName**](Apis/DbsApi.http#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*DbsApi* | [**sendFileToChat**](Apis/DbsApi.http#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*DbsApi* | [**sendMessageToChat**](Apis/DbsApi.http#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*DbsApi* | [**setFeedParams**](Apis/DbsApi.http#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*DbsApi* | [**setOrderBoxLayout**](Apis/DbsApi.http#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*DbsApi* | [**setOrderDeliveryDate**](Apis/DbsApi.http#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*DbsApi* | [**setOrderDeliveryTrackCode**](Apis/DbsApi.http#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*DbsApi* | [**setOrderShipmentBoxes**](Apis/DbsApi.http#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*DbsApi* | [**setReturnDecision**](Apis/DbsApi.http#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*DbsApi* | [**skipGoodsFeedbacksReaction**](Apis/DbsApi.http#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*DbsApi* | [**submitReturnDecision**](Apis/DbsApi.http#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*DbsApi* | [**updateBusinessPrices**](Apis/DbsApi.http#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*DbsApi* | [**updateCampaignOffers**](Apis/DbsApi.http#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*DbsApi* | [**updateGoodsFeedbackComment**](Apis/DbsApi.http#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*DbsApi* | [**updateOfferContent**](Apis/DbsApi.http#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*DbsApi* | [**updateOfferMappingEntries**](Apis/DbsApi.http#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*DbsApi* | [**updateOfferMappings**](Apis/DbsApi.http#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*DbsApi* | [**updateOrderItems**](Apis/DbsApi.http#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*DbsApi* | [**updateOrderStatus**](Apis/DbsApi.http#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*DbsApi* | [**updateOrderStatuses**](Apis/DbsApi.http#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*DbsApi* | [**updateOrderStorageLimit**](Apis/DbsApi.http#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*DbsApi* | [**updateOutlet**](Apis/DbsApi.http#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*DbsApi* | [**updateOutletLicenses**](Apis/DbsApi.http#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*DbsApi* | [**updatePrices**](Apis/DbsApi.http#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*DbsApi* | [**updatePromoOffers**](Apis/DbsApi.http#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*DbsApi* | [**updateStocks**](Apis/DbsApi.http#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*DeliveryServicesApi* | [**getDeliveryServices**](Apis/DeliveryServicesApi.http#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**addHiddenOffers**](Apis/ExpressApi.http#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*ExpressApi* | [**addOffersToArchive**](Apis/ExpressApi.http#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*ExpressApi* | [**calculateTariffs**](Apis/ExpressApi.http#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*ExpressApi* | [**confirmBusinessPrices**](Apis/ExpressApi.http#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*ExpressApi* | [**confirmCampaignPrices**](Apis/ExpressApi.http#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*ExpressApi* | [**createChat**](Apis/ExpressApi.http#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*ExpressApi* | [**deleteCampaignOffers**](Apis/ExpressApi.http#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*ExpressApi* | [**deleteGoodsFeedbackComment**](Apis/ExpressApi.http#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*ExpressApi* | [**deleteHiddenOffers**](Apis/ExpressApi.http#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*ExpressApi* | [**deleteOffers**](Apis/ExpressApi.http#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*ExpressApi* | [**deleteOffersFromArchive**](Apis/ExpressApi.http#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*ExpressApi* | [**deletePromoOffers**](Apis/ExpressApi.http#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*ExpressApi* | [**generateBoostConsolidatedReport**](Apis/ExpressApi.http#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ExpressApi* | [**generateCompetitorsPositionReport**](Apis/ExpressApi.http#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ExpressApi* | [**generateGoodsFeedbackReport**](Apis/ExpressApi.http#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ExpressApi* | [**generateGoodsRealizationReport**](Apis/ExpressApi.http#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ExpressApi* | [**generateMassOrderLabelsReport**](Apis/ExpressApi.http#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ExpressApi* | [**generateOrderLabel**](Apis/ExpressApi.http#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*ExpressApi* | [**generateOrderLabels**](Apis/ExpressApi.http#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*ExpressApi* | [**generatePricesReport**](Apis/ExpressApi.http#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ExpressApi* | [**generateShelfsStatisticsReport**](Apis/ExpressApi.http#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ExpressApi* | [**generateShowsSalesReport**](Apis/ExpressApi.http#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ExpressApi* | [**generateStocksOnWarehousesReport**](Apis/ExpressApi.http#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ExpressApi* | [**generateUnitedMarketplaceServicesReport**](Apis/ExpressApi.http#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ExpressApi* | [**generateUnitedNettingReport**](Apis/ExpressApi.http#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ExpressApi* | [**generateUnitedOrdersReport**](Apis/ExpressApi.http#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ExpressApi* | [**getAllOffers**](Apis/ExpressApi.http#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*ExpressApi* | [**getBidsInfoForBusiness**](Apis/ExpressApi.http#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*ExpressApi* | [**getBidsRecommendations**](Apis/ExpressApi.http#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*ExpressApi* | [**getBusinessQuarantineOffers**](Apis/ExpressApi.http#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*ExpressApi* | [**getBusinessSettings**](Apis/ExpressApi.http#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*ExpressApi* | [**getCampaign**](Apis/ExpressApi.http#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*ExpressApi* | [**getCampaignLogins**](Apis/ExpressApi.http#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*ExpressApi* | [**getCampaignOffers**](Apis/ExpressApi.http#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*ExpressApi* | [**getCampaignQuarantineOffers**](Apis/ExpressApi.http#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*ExpressApi* | [**getCampaignRegion**](Apis/ExpressApi.http#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*ExpressApi* | [**getCampaignSettings**](Apis/ExpressApi.http#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*ExpressApi* | [**getCampaigns**](Apis/ExpressApi.http#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*ExpressApi* | [**getCampaignsByLogin**](Apis/ExpressApi.http#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*ExpressApi* | [**getCategoriesMaxSaleQuantum**](Apis/ExpressApi.http#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*ExpressApi* | [**getCategoriesTree**](Apis/ExpressApi.http#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*ExpressApi* | [**getCategoryContentParameters**](Apis/ExpressApi.http#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*ExpressApi* | [**getChatHistory**](Apis/ExpressApi.http#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*ExpressApi* | [**getChats**](Apis/ExpressApi.http#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*ExpressApi* | [**getDeliveryServices**](Apis/ExpressApi.http#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*ExpressApi* | [**getFeed**](Apis/ExpressApi.http#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*ExpressApi* | [**getFeedIndexLogs**](Apis/ExpressApi.http#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*ExpressApi* | [**getFeedbackAndCommentUpdates**](Apis/ExpressApi.http#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*ExpressApi* | [**getFeeds**](Apis/ExpressApi.http#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*ExpressApi* | [**getGoodsFeedbackComments**](Apis/ExpressApi.http#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*ExpressApi* | [**getGoodsFeedbacks**](Apis/ExpressApi.http#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*ExpressApi* | [**getGoodsStats**](Apis/ExpressApi.http#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*ExpressApi* | [**getHiddenOffers**](Apis/ExpressApi.http#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ExpressApi* | [**getOfferCardsContentStatus**](Apis/ExpressApi.http#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*ExpressApi* | [**getOfferMappingEntries**](Apis/ExpressApi.http#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*ExpressApi* | [**getOfferMappings**](Apis/ExpressApi.http#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*ExpressApi* | [**getOfferRecommendations**](Apis/ExpressApi.http#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*ExpressApi* | [**getOffers**](Apis/ExpressApi.http#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*ExpressApi* | [**getOrder**](Apis/ExpressApi.http#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*ExpressApi* | [**getOrderBusinessBuyerInfo**](Apis/ExpressApi.http#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*ExpressApi* | [**getOrderBusinessDocumentsInfo**](Apis/ExpressApi.http#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*ExpressApi* | [**getOrderLabelsData**](Apis/ExpressApi.http#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*ExpressApi* | [**getOrders**](Apis/ExpressApi.http#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*ExpressApi* | [**getOrdersStats**](Apis/ExpressApi.http#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*ExpressApi* | [**getPrices**](Apis/ExpressApi.http#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*ExpressApi* | [**getPricesByOfferIds**](Apis/ExpressApi.http#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*ExpressApi* | [**getPromoOffers**](Apis/ExpressApi.http#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*ExpressApi* | [**getPromos**](Apis/ExpressApi.http#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*ExpressApi* | [**getQualityRatingDetails**](Apis/ExpressApi.http#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*ExpressApi* | [**getQualityRatings**](Apis/ExpressApi.http#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*ExpressApi* | [**getReportInfo**](Apis/ExpressApi.http#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ExpressApi* | [**getReturn**](Apis/ExpressApi.http#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ExpressApi* | [**getReturnApplication**](Apis/ExpressApi.http#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ExpressApi* | [**getReturnPhoto**](Apis/ExpressApi.http#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ExpressApi* | [**getReturns**](Apis/ExpressApi.http#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ExpressApi* | [**getStocks**](Apis/ExpressApi.http#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*ExpressApi* | [**getSuggestedOfferMappingEntries**](Apis/ExpressApi.http#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*ExpressApi* | [**getSuggestedOfferMappings**](Apis/ExpressApi.http#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*ExpressApi* | [**getSuggestedPrices**](Apis/ExpressApi.http#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*ExpressApi* | [**getWarehouses**](Apis/ExpressApi.http#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*ExpressApi* | [**provideOrderItemIdentifiers**](Apis/ExpressApi.http#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*ExpressApi* | [**putBidsForBusiness**](Apis/ExpressApi.http#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*ExpressApi* | [**putBidsForCampaign**](Apis/ExpressApi.http#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*ExpressApi* | [**refreshFeed**](Apis/ExpressApi.http#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*ExpressApi* | [**searchRegionChildren**](Apis/ExpressApi.http#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*ExpressApi* | [**searchRegionsById**](Apis/ExpressApi.http#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*ExpressApi* | [**searchRegionsByName**](Apis/ExpressApi.http#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*ExpressApi* | [**sendFileToChat**](Apis/ExpressApi.http#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*ExpressApi* | [**sendMessageToChat**](Apis/ExpressApi.http#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*ExpressApi* | [**setFeedParams**](Apis/ExpressApi.http#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*ExpressApi* | [**setOrderBoxLayout**](Apis/ExpressApi.http#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*ExpressApi* | [**setOrderShipmentBoxes**](Apis/ExpressApi.http#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*ExpressApi* | [**skipGoodsFeedbacksReaction**](Apis/ExpressApi.http#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*ExpressApi* | [**updateBusinessPrices**](Apis/ExpressApi.http#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*ExpressApi* | [**updateCampaignOffers**](Apis/ExpressApi.http#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*ExpressApi* | [**updateGoodsFeedbackComment**](Apis/ExpressApi.http#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*ExpressApi* | [**updateOfferContent**](Apis/ExpressApi.http#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*ExpressApi* | [**updateOfferMappingEntries**](Apis/ExpressApi.http#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*ExpressApi* | [**updateOfferMappings**](Apis/ExpressApi.http#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*ExpressApi* | [**updateOrderItems**](Apis/ExpressApi.http#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*ExpressApi* | [**updateOrderStatus**](Apis/ExpressApi.http#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*ExpressApi* | [**updateOrderStatuses**](Apis/ExpressApi.http#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*ExpressApi* | [**updatePrices**](Apis/ExpressApi.http#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*ExpressApi* | [**updatePromoOffers**](Apis/ExpressApi.http#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*ExpressApi* | [**updateStocks**](Apis/ExpressApi.http#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*ExpressApi* | [**verifyOrderEac**](Apis/ExpressApi.http#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*FbsApi* | [**addHiddenOffers**](Apis/FbsApi.http#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbsApi* | [**addOffersToArchive**](Apis/FbsApi.http#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbsApi* | [**calculateTariffs**](Apis/FbsApi.http#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbsApi* | [**confirmBusinessPrices**](Apis/FbsApi.http#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbsApi* | [**confirmCampaignPrices**](Apis/FbsApi.http#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbsApi* | [**confirmShipment**](Apis/FbsApi.http#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*FbsApi* | [**createChat**](Apis/FbsApi.http#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbsApi* | [**deleteCampaignOffers**](Apis/FbsApi.http#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbsApi* | [**deleteGoodsFeedbackComment**](Apis/FbsApi.http#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbsApi* | [**deleteHiddenOffers**](Apis/FbsApi.http#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbsApi* | [**deleteOffers**](Apis/FbsApi.http#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbsApi* | [**deleteOffersFromArchive**](Apis/FbsApi.http#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbsApi* | [**deletePromoOffers**](Apis/FbsApi.http#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbsApi* | [**downloadShipmentAct**](Apis/FbsApi.http#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*FbsApi* | [**downloadShipmentDiscrepancyAct**](Apis/FbsApi.http#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*FbsApi* | [**downloadShipmentInboundAct**](Apis/FbsApi.http#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*FbsApi* | [**downloadShipmentPalletLabels**](Apis/FbsApi.http#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*FbsApi* | [**downloadShipmentReceptionTransferAct**](Apis/FbsApi.http#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*FbsApi* | [**downloadShipmentTransportationWaybill**](Apis/FbsApi.http#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*FbsApi* | [**generateBoostConsolidatedReport**](Apis/FbsApi.http#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbsApi* | [**generateCompetitorsPositionReport**](Apis/FbsApi.http#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbsApi* | [**generateGoodsFeedbackReport**](Apis/FbsApi.http#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbsApi* | [**generateGoodsRealizationReport**](Apis/FbsApi.http#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbsApi* | [**generateMassOrderLabelsReport**](Apis/FbsApi.http#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*FbsApi* | [**generateOrderLabel**](Apis/FbsApi.http#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*FbsApi* | [**generateOrderLabels**](Apis/FbsApi.http#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*FbsApi* | [**generatePricesReport**](Apis/FbsApi.http#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbsApi* | [**generateShelfsStatisticsReport**](Apis/FbsApi.http#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbsApi* | [**generateShipmentListDocumentReport**](Apis/FbsApi.http#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*FbsApi* | [**generateShowsSalesReport**](Apis/FbsApi.http#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbsApi* | [**generateStocksOnWarehousesReport**](Apis/FbsApi.http#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/FbsApi.http#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbsApi* | [**generateUnitedNettingReport**](Apis/FbsApi.http#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbsApi* | [**generateUnitedOrdersReport**](Apis/FbsApi.http#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbsApi* | [**getAllOffers**](Apis/FbsApi.http#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbsApi* | [**getBidsInfoForBusiness**](Apis/FbsApi.http#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbsApi* | [**getBidsRecommendations**](Apis/FbsApi.http#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbsApi* | [**getBusinessQuarantineOffers**](Apis/FbsApi.http#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbsApi* | [**getBusinessSettings**](Apis/FbsApi.http#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbsApi* | [**getCampaign**](Apis/FbsApi.http#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbsApi* | [**getCampaignLogins**](Apis/FbsApi.http#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbsApi* | [**getCampaignOffers**](Apis/FbsApi.http#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbsApi* | [**getCampaignQuarantineOffers**](Apis/FbsApi.http#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbsApi* | [**getCampaignRegion**](Apis/FbsApi.http#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbsApi* | [**getCampaignSettings**](Apis/FbsApi.http#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbsApi* | [**getCampaigns**](Apis/FbsApi.http#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbsApi* | [**getCampaignsByLogin**](Apis/FbsApi.http#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbsApi* | [**getCategoriesMaxSaleQuantum**](Apis/FbsApi.http#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbsApi* | [**getCategoriesTree**](Apis/FbsApi.http#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*FbsApi* | [**getCategoryContentParameters**](Apis/FbsApi.http#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbsApi* | [**getChatHistory**](Apis/FbsApi.http#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbsApi* | [**getChats**](Apis/FbsApi.http#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbsApi* | [**getDeliveryServices**](Apis/FbsApi.http#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки
*FbsApi* | [**getFeed**](Apis/FbsApi.http#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbsApi* | [**getFeedIndexLogs**](Apis/FbsApi.http#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbsApi* | [**getFeedbackAndCommentUpdates**](Apis/FbsApi.http#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbsApi* | [**getFeeds**](Apis/FbsApi.http#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbsApi* | [**getGoodsFeedbackComments**](Apis/FbsApi.http#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbsApi* | [**getGoodsFeedbacks**](Apis/FbsApi.http#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbsApi* | [**getGoodsStats**](Apis/FbsApi.http#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbsApi* | [**getHiddenOffers**](Apis/FbsApi.http#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbsApi* | [**getOfferCardsContentStatus**](Apis/FbsApi.http#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbsApi* | [**getOfferMappingEntries**](Apis/FbsApi.http#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbsApi* | [**getOfferMappings**](Apis/FbsApi.http#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbsApi* | [**getOfferRecommendations**](Apis/FbsApi.http#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbsApi* | [**getOffers**](Apis/FbsApi.http#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbsApi* | [**getOrder**](Apis/FbsApi.http#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbsApi* | [**getOrderBusinessBuyerInfo**](Apis/FbsApi.http#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbsApi* | [**getOrderBusinessDocumentsInfo**](Apis/FbsApi.http#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbsApi* | [**getOrderLabelsData**](Apis/FbsApi.http#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*FbsApi* | [**getOrders**](Apis/FbsApi.http#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbsApi* | [**getOrdersStats**](Apis/FbsApi.http#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbsApi* | [**getPrices**](Apis/FbsApi.http#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbsApi* | [**getPricesByOfferIds**](Apis/FbsApi.http#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbsApi* | [**getPromoOffers**](Apis/FbsApi.http#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbsApi* | [**getPromos**](Apis/FbsApi.http#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbsApi* | [**getQualityRatingDetails**](Apis/FbsApi.http#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*FbsApi* | [**getQualityRatings**](Apis/FbsApi.http#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbsApi* | [**getReportInfo**](Apis/FbsApi.http#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbsApi* | [**getReturn**](Apis/FbsApi.http#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbsApi* | [**getReturnApplication**](Apis/FbsApi.http#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*FbsApi* | [**getReturnPhoto**](Apis/FbsApi.http#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbsApi* | [**getReturns**](Apis/FbsApi.http#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbsApi* | [**getShipment**](Apis/FbsApi.http#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*FbsApi* | [**getShipmentOrdersInfo**](Apis/FbsApi.http#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*FbsApi* | [**getStocks**](Apis/FbsApi.http#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbsApi* | [**getSuggestedOfferMappingEntries**](Apis/FbsApi.http#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbsApi* | [**getSuggestedOfferMappings**](Apis/FbsApi.http#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbsApi* | [**getSuggestedPrices**](Apis/FbsApi.http#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbsApi* | [**getWarehouses**](Apis/FbsApi.http#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов
*FbsApi* | [**provideOrderItemIdentifiers**](Apis/FbsApi.http#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*FbsApi* | [**putBidsForBusiness**](Apis/FbsApi.http#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbsApi* | [**putBidsForCampaign**](Apis/FbsApi.http#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbsApi* | [**refreshFeed**](Apis/FbsApi.http#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbsApi* | [**searchRegionChildren**](Apis/FbsApi.http#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbsApi* | [**searchRegionsById**](Apis/FbsApi.http#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*FbsApi* | [**searchRegionsByName**](Apis/FbsApi.http#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*FbsApi* | [**searchShipments**](Apis/FbsApi.http#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*FbsApi* | [**sendFileToChat**](Apis/FbsApi.http#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbsApi* | [**sendMessageToChat**](Apis/FbsApi.http#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbsApi* | [**setFeedParams**](Apis/FbsApi.http#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbsApi* | [**setOrderBoxLayout**](Apis/FbsApi.http#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*FbsApi* | [**setOrderShipmentBoxes**](Apis/FbsApi.http#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*FbsApi* | [**setShipmentPalletsCount**](Apis/FbsApi.http#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*FbsApi* | [**skipGoodsFeedbacksReaction**](Apis/FbsApi.http#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbsApi* | [**transferOrdersFromShipment**](Apis/FbsApi.http#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*FbsApi* | [**updateBusinessPrices**](Apis/FbsApi.http#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbsApi* | [**updateCampaignOffers**](Apis/FbsApi.http#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbsApi* | [**updateGoodsFeedbackComment**](Apis/FbsApi.http#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbsApi* | [**updateOfferContent**](Apis/FbsApi.http#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbsApi* | [**updateOfferMappingEntries**](Apis/FbsApi.http#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbsApi* | [**updateOfferMappings**](Apis/FbsApi.http#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbsApi* | [**updateOrderItems**](Apis/FbsApi.http#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*FbsApi* | [**updateOrderStatus**](Apis/FbsApi.http#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*FbsApi* | [**updateOrderStatuses**](Apis/FbsApi.http#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*FbsApi* | [**updatePrices**](Apis/FbsApi.http#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbsApi* | [**updatePromoOffers**](Apis/FbsApi.http#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FbsApi* | [**updateStocks**](Apis/FbsApi.http#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*FbyApi* | [**addHiddenOffers**](Apis/FbyApi.http#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*FbyApi* | [**addOffersToArchive**](Apis/FbyApi.http#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив
*FbyApi* | [**calculateTariffs**](Apis/FbyApi.http#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*FbyApi* | [**confirmBusinessPrices**](Apis/FbyApi.http#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*FbyApi* | [**confirmCampaignPrices**](Apis/FbyApi.http#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*FbyApi* | [**createChat**](Apis/FbyApi.http#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
*FbyApi* | [**deleteCampaignOffers**](Apis/FbyApi.http#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*FbyApi* | [**deleteGoodsFeedbackComment**](Apis/FbyApi.http#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*FbyApi* | [**deleteHiddenOffers**](Apis/FbyApi.http#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*FbyApi* | [**deleteOffers**](Apis/FbyApi.http#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога
*FbyApi* | [**deleteOffersFromArchive**](Apis/FbyApi.http#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива
*FbyApi* | [**deletePromoOffers**](Apis/FbyApi.http#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*FbyApi* | [**generateBoostConsolidatedReport**](Apis/FbyApi.http#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*FbyApi* | [**generateCompetitorsPositionReport**](Apis/FbyApi.http#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*FbyApi* | [**generateGoodsFeedbackReport**](Apis/FbyApi.http#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*FbyApi* | [**generateGoodsMovementReport**](Apis/FbyApi.http#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*FbyApi* | [**generateGoodsRealizationReport**](Apis/FbyApi.http#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*FbyApi* | [**generateGoodsTurnoverReport**](Apis/FbyApi.http#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*FbyApi* | [**generatePricesReport**](Apis/FbyApi.http#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*FbyApi* | [**generateShelfsStatisticsReport**](Apis/FbyApi.http#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*FbyApi* | [**generateShowsSalesReport**](Apis/FbyApi.http#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*FbyApi* | [**generateStocksOnWarehousesReport**](Apis/FbyApi.http#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*FbyApi* | [**generateUnitedMarketplaceServicesReport**](Apis/FbyApi.http#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*FbyApi* | [**generateUnitedNettingReport**](Apis/FbyApi.http#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*FbyApi* | [**generateUnitedOrdersReport**](Apis/FbyApi.http#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*FbyApi* | [**getAllOffers**](Apis/FbyApi.http#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*FbyApi* | [**getBidsInfoForBusiness**](Apis/FbyApi.http#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках
*FbyApi* | [**getBidsRecommendations**](Apis/FbyApi.http#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров
*FbyApi* | [**getBusinessQuarantineOffers**](Apis/FbyApi.http#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*FbyApi* | [**getBusinessSettings**](Apis/FbyApi.http#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета
*FbyApi* | [**getCampaign**](Apis/FbyApi.http#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
*FbyApi* | [**getCampaignLogins**](Apis/FbyApi.http#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
*FbyApi* | [**getCampaignOffers**](Apis/FbyApi.http#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*FbyApi* | [**getCampaignQuarantineOffers**](Apis/FbyApi.http#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*FbyApi* | [**getCampaignRegion**](Apis/FbyApi.http#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина
*FbyApi* | [**getCampaignSettings**](Apis/FbyApi.http#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
*FbyApi* | [**getCampaigns**](Apis/FbyApi.http#getcampaigns) | **GET** /campaigns | Список магазинов пользователя
*FbyApi* | [**getCampaignsByLogin**](Apis/FbyApi.http#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину
*FbyApi* | [**getCategoriesMaxSaleQuantum**](Apis/FbyApi.http#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
*FbyApi* | [**getCategoriesTree**](Apis/FbyApi.http#getcategoriestree) | **POST** /categories/tree | Дерево категорий
*FbyApi* | [**getCategoryContentParameters**](Apis/FbyApi.http#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
*FbyApi* | [**getChatHistory**](Apis/FbyApi.http#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
*FbyApi* | [**getChats**](Apis/FbyApi.http#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
*FbyApi* | [**getFeed**](Apis/FbyApi.http#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FbyApi* | [**getFeedIndexLogs**](Apis/FbyApi.http#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FbyApi* | [**getFeedbackAndCommentUpdates**](Apis/FbyApi.http#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FbyApi* | [**getFeeds**](Apis/FbyApi.http#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FbyApi* | [**getFulfillmentWarehouses**](Apis/FbyApi.http#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*FbyApi* | [**getGoodsFeedbackComments**](Apis/FbyApi.http#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*FbyApi* | [**getGoodsFeedbacks**](Apis/FbyApi.http#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*FbyApi* | [**getGoodsStats**](Apis/FbyApi.http#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*FbyApi* | [**getHiddenOffers**](Apis/FbyApi.http#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*FbyApi* | [**getOfferCardsContentStatus**](Apis/FbyApi.http#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
*FbyApi* | [**getOfferMappingEntries**](Apis/FbyApi.http#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*FbyApi* | [**getOfferMappings**](Apis/FbyApi.http#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге
*FbyApi* | [**getOfferRecommendations**](Apis/FbyApi.http#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*FbyApi* | [**getOffers**](Apis/FbyApi.http#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*FbyApi* | [**getOrder**](Apis/FbyApi.http#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*FbyApi* | [**getOrderBusinessBuyerInfo**](Apis/FbyApi.http#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*FbyApi* | [**getOrderBusinessDocumentsInfo**](Apis/FbyApi.http#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*FbyApi* | [**getOrders**](Apis/FbyApi.http#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*FbyApi* | [**getOrdersStats**](Apis/FbyApi.http#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*FbyApi* | [**getPrices**](Apis/FbyApi.http#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*FbyApi* | [**getPricesByOfferIds**](Apis/FbyApi.http#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*FbyApi* | [**getPromoOffers**](Apis/FbyApi.http#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*FbyApi* | [**getPromos**](Apis/FbyApi.http#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*FbyApi* | [**getQualityRatings**](Apis/FbyApi.http#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*FbyApi* | [**getReportInfo**](Apis/FbyApi.http#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*FbyApi* | [**getReturn**](Apis/FbyApi.http#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*FbyApi* | [**getReturnPhoto**](Apis/FbyApi.http#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*FbyApi* | [**getReturns**](Apis/FbyApi.http#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*FbyApi* | [**getStocks**](Apis/FbyApi.http#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*FbyApi* | [**getSuggestedOfferMappingEntries**](Apis/FbyApi.http#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*FbyApi* | [**getSuggestedOfferMappings**](Apis/FbyApi.http#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам
*FbyApi* | [**getSuggestedPrices**](Apis/FbyApi.http#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*FbyApi* | [**putBidsForBusiness**](Apis/FbyApi.http#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок
*FbyApi* | [**putBidsForCampaign**](Apis/FbyApi.http#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина
*FbyApi* | [**refreshFeed**](Apis/FbyApi.http#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FbyApi* | [**searchRegionChildren**](Apis/FbyApi.http#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*FbyApi* | [**searchRegionsById**](Apis/FbyApi.http#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*FbyApi* | [**searchRegionsByName**](Apis/FbyApi.http#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*FbyApi* | [**sendFileToChat**](Apis/FbyApi.http#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
*FbyApi* | [**sendMessageToChat**](Apis/FbyApi.http#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат
*FbyApi* | [**setFeedParams**](Apis/FbyApi.http#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*FbyApi* | [**skipGoodsFeedbacksReaction**](Apis/FbyApi.http#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*FbyApi* | [**updateBusinessPrices**](Apis/FbyApi.http#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*FbyApi* | [**updateCampaignOffers**](Apis/FbyApi.http#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*FbyApi* | [**updateGoodsFeedbackComment**](Apis/FbyApi.http#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*FbyApi* | [**updateOfferContent**](Apis/FbyApi.http#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара
*FbyApi* | [**updateOfferMappingEntries**](Apis/FbyApi.http#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*FbyApi* | [**updateOfferMappings**](Apis/FbyApi.http#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них
*FbyApi* | [**updatePrices**](Apis/FbyApi.http#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*FbyApi* | [**updatePromoOffers**](Apis/FbyApi.http#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*FeedbacksApi* | [**getFeedbackAndCommentUpdates**](Apis/FeedbacksApi.http#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине
*FeedsApi* | [**getFeed**](Apis/FeedsApi.http#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
*FeedsApi* | [**getFeedIndexLogs**](Apis/FeedsApi.http#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
*FeedsApi* | [**getFeeds**](Apis/FeedsApi.http#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
*FeedsApi* | [**refreshFeed**](Apis/FeedsApi.http#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
*FeedsApi* | [**setFeedParams**](Apis/FeedsApi.http#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа
*GoodsFeedbackApi* | [**deleteGoodsFeedbackComment**](Apis/GoodsFeedbackApi.http#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbackComments**](Apis/GoodsFeedbackApi.http#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
*GoodsFeedbackApi* | [**getGoodsFeedbacks**](Apis/GoodsFeedbackApi.http#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
*GoodsFeedbackApi* | [**skipGoodsFeedbacksReaction**](Apis/GoodsFeedbackApi.http#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
*GoodsFeedbackApi* | [**updateGoodsFeedbackComment**](Apis/GoodsFeedbackApi.http#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария
*GoodsStatsApi* | [**getGoodsStats**](Apis/GoodsStatsApi.http#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам
*HiddenOffersApi* | [**addHiddenOffers**](Apis/HiddenOffersApi.http#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
*HiddenOffersApi* | [**deleteHiddenOffers**](Apis/HiddenOffersApi.http#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
*HiddenOffersApi* | [**getHiddenOffers**](Apis/HiddenOffersApi.http#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах
*ModelsApi* | [**getModel**](Apis/ModelsApi.http#getmodel) | **GET** /models/{modelId} | Информация об одной модели
*ModelsApi* | [**getModelOffers**](Apis/ModelsApi.http#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели
*ModelsApi* | [**getModels**](Apis/ModelsApi.http#getmodels) | **POST** /models | Информация о нескольких моделях
*ModelsApi* | [**getModelsOffers**](Apis/ModelsApi.http#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей
*ModelsApi* | [**searchModels**](Apis/ModelsApi.http#searchmodels) | **GET** /models | Поиск модели товара
*OfferMappingsApi* | [**getOfferMappingEntries**](Apis/OfferMappingsApi.http#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге
*OfferMappingsApi* | [**getSuggestedOfferMappingEntries**](Apis/OfferMappingsApi.http#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров
*OfferMappingsApi* | [**updateOfferMappingEntries**](Apis/OfferMappingsApi.http#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге
*OffersApi* | [**deleteCampaignOffers**](Apis/OffersApi.http#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина
*OffersApi* | [**getAllOffers**](Apis/OffersApi.http#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина
*OffersApi* | [**getCampaignOffers**](Apis/OffersApi.http#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине
*OffersApi* | [**getOfferRecommendations**](Apis/OffersApi.http#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен
*OffersApi* | [**getOffers**](Apis/OffersApi.http#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина
*OffersApi* | [**updateCampaignOffers**](Apis/OffersApi.http#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине
*OrderBusinessInformationApi* | [**getOrderBusinessBuyerInfo**](Apis/OrderBusinessInformationApi.http#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
*OrderBusinessInformationApi* | [**getOrderBusinessDocumentsInfo**](Apis/OrderBusinessInformationApi.http#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах
*OrderDeliveryApi* | [**getOrderBuyerInfo**](Apis/OrderDeliveryApi.http#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
*OrderDeliveryApi* | [**setOrderDeliveryDate**](Apis/OrderDeliveryApi.http#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
*OrderDeliveryApi* | [**setOrderDeliveryTrackCode**](Apis/OrderDeliveryApi.http#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
*OrderDeliveryApi* | [**updateOrderStorageLimit**](Apis/OrderDeliveryApi.http#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
*OrderDeliveryApi* | [**verifyOrderEac**](Apis/OrderDeliveryApi.http#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения
*OrderLabelsApi* | [**generateOrderLabel**](Apis/OrderLabelsApi.http#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
*OrderLabelsApi* | [**generateOrderLabels**](Apis/OrderLabelsApi.http#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
*OrderLabelsApi* | [**getOrderLabelsData**](Apis/OrderLabelsApi.http#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков
*OrdersApi* | [**acceptOrderCancellation**](Apis/OrdersApi.http#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем
*OrdersApi* | [**getOrder**](Apis/OrdersApi.http#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе
*OrdersApi* | [**getOrders**](Apis/OrdersApi.http#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах
*OrdersApi* | [**provideOrderDigitalCodes**](Apis/OrdersApi.http#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров
*OrdersApi* | [**provideOrderItemIdentifiers**](Apis/OrdersApi.http#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара
*OrdersApi* | [**setOrderBoxLayout**](Apis/OrdersApi.http#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа
*OrdersApi* | [**setOrderShipmentBoxes**](Apis/OrdersApi.http#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе
*OrdersApi* | [**updateOrderItems**](Apis/OrdersApi.http#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц
*OrdersApi* | [**updateOrderStatus**](Apis/OrdersApi.http#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа
*OrdersApi* | [**updateOrderStatuses**](Apis/OrdersApi.http#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов
*OrdersStatsApi* | [**getOrdersStats**](Apis/OrdersStatsApi.http#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам
*OutletLicensesApi* | [**deleteOutletLicenses**](Apis/OutletLicensesApi.http#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
*OutletLicensesApi* | [**getOutletLicenses**](Apis/OutletLicensesApi.http#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
*OutletLicensesApi* | [**updateOutletLicenses**](Apis/OutletLicensesApi.http#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж
*OutletsApi* | [**createOutlet**](Apis/OutletsApi.http#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
*OutletsApi* | [**deleteOutlet**](Apis/OutletsApi.http#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
*OutletsApi* | [**getOutlet**](Apis/OutletsApi.http#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
*OutletsApi* | [**getOutlets**](Apis/OutletsApi.http#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
*OutletsApi* | [**updateOutlet**](Apis/OutletsApi.http#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж
*PriceQuarantineApi* | [**confirmBusinessPrices**](Apis/PriceQuarantineApi.http#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
*PriceQuarantineApi* | [**confirmCampaignPrices**](Apis/PriceQuarantineApi.http#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
*PriceQuarantineApi* | [**getBusinessQuarantineOffers**](Apis/PriceQuarantineApi.http#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
*PriceQuarantineApi* | [**getCampaignQuarantineOffers**](Apis/PriceQuarantineApi.http#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине
*PricesApi* | [**getPrices**](Apis/PricesApi.http#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
*PricesApi* | [**getPricesByOfferIds**](Apis/PricesApi.http#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
*PricesApi* | [**getSuggestedPrices**](Apis/PricesApi.http#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
*PricesApi* | [**updateBusinessPrices**](Apis/PricesApi.http#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
*PricesApi* | [**updatePrices**](Apis/PricesApi.http#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине
*PromosApi* | [**deletePromoOffers**](Apis/PromosApi.http#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
*PromosApi* | [**getPromoOffers**](Apis/PromosApi.http#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
*PromosApi* | [**getPromos**](Apis/PromosApi.http#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
*PromosApi* | [**updatePromoOffers**](Apis/PromosApi.http#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен
*RatingsApi* | [**getQualityRatingDetails**](Apis/RatingsApi.http#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
*RatingsApi* | [**getQualityRatings**](Apis/RatingsApi.http#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов
*RegionsApi* | [**searchRegionChildren**](Apis/RegionsApi.http#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах
*RegionsApi* | [**searchRegionsById**](Apis/RegionsApi.http#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе
*RegionsApi* | [**searchRegionsByName**](Apis/RegionsApi.http#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени
*ReportsApi* | [**generateBoostConsolidatedReport**](Apis/ReportsApi.http#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
*ReportsApi* | [**generateCompetitorsPositionReport**](Apis/ReportsApi.http#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
*ReportsApi* | [**generateGoodsFeedbackReport**](Apis/ReportsApi.http#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
*ReportsApi* | [**generateGoodsMovementReport**](Apis/ReportsApi.http#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
*ReportsApi* | [**generateGoodsRealizationReport**](Apis/ReportsApi.http#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
*ReportsApi* | [**generateGoodsTurnoverReport**](Apis/ReportsApi.http#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
*ReportsApi* | [**generateMassOrderLabelsReport**](Apis/ReportsApi.http#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
*ReportsApi* | [**generatePricesReport**](Apis/ReportsApi.http#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
*ReportsApi* | [**generateShelfsStatisticsReport**](Apis/ReportsApi.http#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
*ReportsApi* | [**generateShipmentListDocumentReport**](Apis/ReportsApi.http#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
*ReportsApi* | [**generateShowsSalesReport**](Apis/ReportsApi.http#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
*ReportsApi* | [**generateStocksOnWarehousesReport**](Apis/ReportsApi.http#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
*ReportsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/ReportsApi.http#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
*ReportsApi* | [**generateUnitedNettingReport**](Apis/ReportsApi.http#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
*ReportsApi* | [**generateUnitedOrdersReport**](Apis/ReportsApi.http#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
*ReportsApi* | [**getReportInfo**](Apis/ReportsApi.http#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета
*ReturnsApi* | [**getReturn**](Apis/ReturnsApi.http#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
*ReturnsApi* | [**getReturnApplication**](Apis/ReturnsApi.http#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
*ReturnsApi* | [**getReturnPhoto**](Apis/ReturnsApi.http#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
*ReturnsApi* | [**getReturns**](Apis/ReturnsApi.http#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
*ReturnsApi* | [**setReturnDecision**](Apis/ReturnsApi.http#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
*ReturnsApi* | [**submitReturnDecision**](Apis/ReturnsApi.http#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату
*ShipmentsApi* | [**confirmShipment**](Apis/ShipmentsApi.http#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки
*ShipmentsApi* | [**downloadShipmentAct**](Apis/ShipmentsApi.http#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи
*ShipmentsApi* | [**downloadShipmentDiscrepancyAct**](Apis/ShipmentsApi.http#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений
*ShipmentsApi* | [**downloadShipmentInboundAct**](Apis/ShipmentsApi.http#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи
*ShipmentsApi* | [**downloadShipmentPalletLabels**](Apis/ShipmentsApi.http#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS)
*ShipmentsApi* | [**downloadShipmentReceptionTransferAct**](Apis/ShipmentsApi.http#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
*ShipmentsApi* | [**downloadShipmentTransportationWaybill**](Apis/ShipmentsApi.http#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной
*ShipmentsApi* | [**getShipment**](Apis/ShipmentsApi.http#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке
*ShipmentsApi* | [**getShipmentOrdersInfo**](Apis/ShipmentsApi.http#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS)
*ShipmentsApi* | [**searchShipments**](Apis/ShipmentsApi.http#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках
*ShipmentsApi* | [**setShipmentPalletsCount**](Apis/ShipmentsApi.http#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке
*ShipmentsApi* | [**transferOrdersFromShipment**](Apis/ShipmentsApi.http#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку
*StocksApi* | [**getStocks**](Apis/StocksApi.http#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
*StocksApi* | [**updateStocks**](Apis/StocksApi.http#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках
*TariffsApi* | [**calculateTariffs**](Apis/TariffsApi.http#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг
*WarehousesApi* | [**getFulfillmentWarehouses**](Apis/WarehousesApi.http#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
*WarehousesApi* | [**getWarehouses**](Apis/WarehousesApi.http#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


## Usage

### Prerequisites

You need [IntelliJ](https://www.jetbrains.com/idea/) to be able to run those queries. More information can be found [here](https://www.jetbrains.com/help/idea/http-client-in-product-code-editor.html).
You may have some luck running queries using the [Code REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) as well, but your mileage may vary.

### Variables and Environment files

* Generally speaking, you want queries to be specific using custom variables. All variables in the `.http` files have the `` format.
* You can create [public or private environment files](https://www.jetbrains.com/help/idea/exploring-http-syntax.html#environment-variables) to dynamically replace the variables at runtime.

_Note: don't commit private environment files! They typically will contain sensitive information like API Keys._

### Customizations

If you have control over the generation of the files here, there are two main things you can do

* Select elements to replace as variables during generation. The process is case-sensitive. For example, API_KEY -> 
    * For this, run the generation with the `bodyVariables` property, followed by a "-" separated list of variables
    * Example: `--additional-properties bodyVariables=YOUR_MERCHANT_ACCOUNT-YOUR_COMPANY_ACCOUNT-YOUR_BALANCE_PLATFORM`
* Add custom headers to _all_ requests. This can be useful for example if your specifications are missing [security schemes](https://github.com/github/rest-api-description/issues/237).
    * For this, run the generation with the `customHeaders` property, followed by a "&" separated list of variables
    * Example : `--additional-properties=customHeaders="Cookie:X-API-KEY="&"Accept-Encoding=gzip"`

_This client was generated by the [jetbrains-http-client](https://openapi-generator.tech/docs/generators/jetbrains-http-client) generator of OpenAPI Generator_