# Documentation for Партнерский API Маркета

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.partner.market.yandex.ru*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *BidsApi* | [**getBidsInfoForBusiness**](Apis/BidsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
*BidsApi* | [**getBidsRecommendations**](Apis/BidsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
*BidsApi* | [**putBidsForBusiness**](Apis/BidsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
*BidsApi* | [**putBidsForCampaign**](Apis/BidsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
| *BusinessOfferMappingsApi* | [**addOffersToArchive**](Apis/BusinessOfferMappingsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
*BusinessOfferMappingsApi* | [**deleteOffers**](Apis/BusinessOfferMappingsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
*BusinessOfferMappingsApi* | [**deleteOffersFromArchive**](Apis/BusinessOfferMappingsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
*BusinessOfferMappingsApi* | [**getOfferMappings**](Apis/BusinessOfferMappingsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
*BusinessOfferMappingsApi* | [**getSuggestedOfferMappings**](Apis/BusinessOfferMappingsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
*BusinessOfferMappingsApi* | [**updateOfferMappings**](Apis/BusinessOfferMappingsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
| *BusinessesApi* | [**getBusinessSettings**](Apis/BusinessesApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
| *CampaignsApi* | [**getCampaign**](Apis/CampaignsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
*CampaignsApi* | [**getCampaignLogins**](Apis/CampaignsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
*CampaignsApi* | [**getCampaignRegion**](Apis/CampaignsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
*CampaignsApi* | [**getCampaignSettings**](Apis/CampaignsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
*CampaignsApi* | [**getCampaigns**](Apis/CampaignsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя |
*CampaignsApi* | [**getCampaignsByLogin**](Apis/CampaignsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
| *CategoriesApi* | [**getCategoriesMaxSaleQuantum**](Apis/CategoriesApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
*CategoriesApi* | [**getCategoriesTree**](Apis/CategoriesApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |
| *ChatsApi* | [**createChat**](Apis/ChatsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
*ChatsApi* | [**getChatHistory**](Apis/ChatsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
*ChatsApi* | [**getChats**](Apis/ChatsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
*ChatsApi* | [**sendFileToChat**](Apis/ChatsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
*ChatsApi* | [**sendMessageToChat**](Apis/ChatsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
| *ContentApi* | [**getCategoryContentParameters**](Apis/ContentApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
*ContentApi* | [**getOfferCardsContentStatus**](Apis/ContentApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
*ContentApi* | [**updateOfferContent**](Apis/ContentApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
| *DbsApi* | [**acceptOrderCancellation**](Apis/DbsApi.md#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем |
*DbsApi* | [**addHiddenOffers**](Apis/DbsApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
*DbsApi* | [**addOffersToArchive**](Apis/DbsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
*DbsApi* | [**calculateTariffs**](Apis/DbsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
*DbsApi* | [**confirmBusinessPrices**](Apis/DbsApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
*DbsApi* | [**confirmCampaignPrices**](Apis/DbsApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
*DbsApi* | [**createChat**](Apis/DbsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
*DbsApi* | [**createOutlet**](Apis/DbsApi.md#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж |
*DbsApi* | [**deleteCampaignOffers**](Apis/DbsApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
*DbsApi* | [**deleteGoodsFeedbackComment**](Apis/DbsApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
*DbsApi* | [**deleteHiddenOffers**](Apis/DbsApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
*DbsApi* | [**deleteOffers**](Apis/DbsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
*DbsApi* | [**deleteOffersFromArchive**](Apis/DbsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
*DbsApi* | [**deleteOutlet**](Apis/DbsApi.md#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж |
*DbsApi* | [**deleteOutletLicenses**](Apis/DbsApi.md#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж |
*DbsApi* | [**deletePromoOffers**](Apis/DbsApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
*DbsApi* | [**generateBoostConsolidatedReport**](Apis/DbsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
*DbsApi* | [**generateCompetitorsPositionReport**](Apis/DbsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
*DbsApi* | [**generateGoodsFeedbackReport**](Apis/DbsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
*DbsApi* | [**generateMassOrderLabelsReport**](Apis/DbsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
*DbsApi* | [**generateOrderLabel**](Apis/DbsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
*DbsApi* | [**generateOrderLabels**](Apis/DbsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
*DbsApi* | [**generatePricesReport**](Apis/DbsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
*DbsApi* | [**generateShelfsStatisticsReport**](Apis/DbsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
*DbsApi* | [**generateShowsSalesReport**](Apis/DbsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
*DbsApi* | [**generateStocksOnWarehousesReport**](Apis/DbsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
*DbsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/DbsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
*DbsApi* | [**generateUnitedNettingReport**](Apis/DbsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам |
*DbsApi* | [**generateUnitedOrdersReport**](Apis/DbsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам |
*DbsApi* | [**getAllOffers**](Apis/DbsApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
*DbsApi* | [**getBidsInfoForBusiness**](Apis/DbsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
*DbsApi* | [**getBidsRecommendations**](Apis/DbsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
*DbsApi* | [**getBusinessQuarantineOffers**](Apis/DbsApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
*DbsApi* | [**getBusinessSettings**](Apis/DbsApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
*DbsApi* | [**getCampaign**](Apis/DbsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
*DbsApi* | [**getCampaignLogins**](Apis/DbsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
*DbsApi* | [**getCampaignOffers**](Apis/DbsApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
*DbsApi* | [**getCampaignQuarantineOffers**](Apis/DbsApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
*DbsApi* | [**getCampaignRegion**](Apis/DbsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
*DbsApi* | [**getCampaignSettings**](Apis/DbsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
*DbsApi* | [**getCampaigns**](Apis/DbsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя |
*DbsApi* | [**getCampaignsByLogin**](Apis/DbsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
*DbsApi* | [**getCategoriesMaxSaleQuantum**](Apis/DbsApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
*DbsApi* | [**getCategoriesTree**](Apis/DbsApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |
*DbsApi* | [**getCategoryContentParameters**](Apis/DbsApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
*DbsApi* | [**getChatHistory**](Apis/DbsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
*DbsApi* | [**getChats**](Apis/DbsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
*DbsApi* | [**getDeliveryServices**](Apis/DbsApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки |
*DbsApi* | [**getFeed**](Apis/DbsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
*DbsApi* | [**getFeedIndexLogs**](Apis/DbsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
*DbsApi* | [**getFeedbackAndCommentUpdates**](Apis/DbsApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
*DbsApi* | [**getFeeds**](Apis/DbsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
*DbsApi* | [**getGoodsFeedbackComments**](Apis/DbsApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
*DbsApi* | [**getGoodsFeedbacks**](Apis/DbsApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
*DbsApi* | [**getGoodsStats**](Apis/DbsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
*DbsApi* | [**getHiddenOffers**](Apis/DbsApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
*DbsApi* | [**getModel**](Apis/DbsApi.md#getmodel) | **GET** /models/{modelId} | Информация об одной модели |
*DbsApi* | [**getModelOffers**](Apis/DbsApi.md#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели |
*DbsApi* | [**getModels**](Apis/DbsApi.md#getmodels) | **POST** /models | Информация о нескольких моделях |
*DbsApi* | [**getModelsOffers**](Apis/DbsApi.md#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей |
*DbsApi* | [**getOfferCardsContentStatus**](Apis/DbsApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
*DbsApi* | [**getOfferMappingEntries**](Apis/DbsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
*DbsApi* | [**getOfferMappings**](Apis/DbsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
*DbsApi* | [**getOfferRecommendations**](Apis/DbsApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
*DbsApi* | [**getOffers**](Apis/DbsApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
*DbsApi* | [**getOrder**](Apis/DbsApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
*DbsApi* | [**getOrderBusinessBuyerInfo**](Apis/DbsApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
*DbsApi* | [**getOrderBusinessDocumentsInfo**](Apis/DbsApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
*DbsApi* | [**getOrderBuyerInfo**](Apis/DbsApi.md#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице |
*DbsApi* | [**getOrderLabelsData**](Apis/DbsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
*DbsApi* | [**getOrders**](Apis/DbsApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
*DbsApi* | [**getOrdersStats**](Apis/DbsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
*DbsApi* | [**getOutlet**](Apis/DbsApi.md#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж |
*DbsApi* | [**getOutletLicenses**](Apis/DbsApi.md#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж |
*DbsApi* | [**getOutlets**](Apis/DbsApi.md#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж |
*DbsApi* | [**getPrices**](Apis/DbsApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
*DbsApi* | [**getPricesByOfferIds**](Apis/DbsApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
*DbsApi* | [**getPromoOffers**](Apis/DbsApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
*DbsApi* | [**getPromos**](Apis/DbsApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
*DbsApi* | [**getQualityRatingDetails**](Apis/DbsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
*DbsApi* | [**getQualityRatings**](Apis/DbsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
*DbsApi* | [**getReportInfo**](Apis/DbsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
*DbsApi* | [**getReturn**](Apis/DbsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
*DbsApi* | [**getReturnApplication**](Apis/DbsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
*DbsApi* | [**getReturnPhoto**](Apis/DbsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
*DbsApi* | [**getReturns**](Apis/DbsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
*DbsApi* | [**getStocks**](Apis/DbsApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
*DbsApi* | [**getSuggestedOfferMappingEntries**](Apis/DbsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
*DbsApi* | [**getSuggestedOfferMappings**](Apis/DbsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
*DbsApi* | [**getSuggestedPrices**](Apis/DbsApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
*DbsApi* | [**getWarehouses**](Apis/DbsApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |
*DbsApi* | [**provideOrderDigitalCodes**](Apis/DbsApi.md#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров |
*DbsApi* | [**provideOrderItemIdentifiers**](Apis/DbsApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
*DbsApi* | [**putBidsForBusiness**](Apis/DbsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
*DbsApi* | [**putBidsForCampaign**](Apis/DbsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
*DbsApi* | [**refreshFeed**](Apis/DbsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
*DbsApi* | [**searchModels**](Apis/DbsApi.md#searchmodels) | **GET** /models | Поиск модели товара |
*DbsApi* | [**searchRegionChildren**](Apis/DbsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
*DbsApi* | [**searchRegionsById**](Apis/DbsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе |
*DbsApi* | [**searchRegionsByName**](Apis/DbsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени |
*DbsApi* | [**sendFileToChat**](Apis/DbsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
*DbsApi* | [**sendMessageToChat**](Apis/DbsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
*DbsApi* | [**setFeedParams**](Apis/DbsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
*DbsApi* | [**setOrderBoxLayout**](Apis/DbsApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
*DbsApi* | [**setOrderDeliveryDate**](Apis/DbsApi.md#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа |
*DbsApi* | [**setOrderDeliveryTrackCode**](Apis/DbsApi.md#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки |
*DbsApi* | [**setOrderShipmentBoxes**](Apis/DbsApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
*DbsApi* | [**setReturnDecision**](Apis/DbsApi.md#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
*DbsApi* | [**skipGoodsFeedbacksReaction**](Apis/DbsApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
*DbsApi* | [**submitReturnDecision**](Apis/DbsApi.md#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |
*DbsApi* | [**updateBusinessPrices**](Apis/DbsApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
*DbsApi* | [**updateCampaignOffers**](Apis/DbsApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
*DbsApi* | [**updateGoodsFeedbackComment**](Apis/DbsApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
*DbsApi* | [**updateOfferContent**](Apis/DbsApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
*DbsApi* | [**updateOfferMappingEntries**](Apis/DbsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
*DbsApi* | [**updateOfferMappings**](Apis/DbsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
*DbsApi* | [**updateOrderItems**](Apis/DbsApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
*DbsApi* | [**updateOrderStatus**](Apis/DbsApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
*DbsApi* | [**updateOrderStatuses**](Apis/DbsApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
*DbsApi* | [**updateOrderStorageLimit**](Apis/DbsApi.md#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа |
*DbsApi* | [**updateOutlet**](Apis/DbsApi.md#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж |
*DbsApi* | [**updateOutletLicenses**](Apis/DbsApi.md#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж |
*DbsApi* | [**updatePrices**](Apis/DbsApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
*DbsApi* | [**updatePromoOffers**](Apis/DbsApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
*DbsApi* | [**updateStocks**](Apis/DbsApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |
| *DeliveryServicesApi* | [**getDeliveryServices**](Apis/DeliveryServicesApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки |
| *ExpressApi* | [**addHiddenOffers**](Apis/ExpressApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
*ExpressApi* | [**addOffersToArchive**](Apis/ExpressApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
*ExpressApi* | [**calculateTariffs**](Apis/ExpressApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
*ExpressApi* | [**confirmBusinessPrices**](Apis/ExpressApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
*ExpressApi* | [**confirmCampaignPrices**](Apis/ExpressApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
*ExpressApi* | [**createChat**](Apis/ExpressApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
*ExpressApi* | [**deleteCampaignOffers**](Apis/ExpressApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
*ExpressApi* | [**deleteGoodsFeedbackComment**](Apis/ExpressApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
*ExpressApi* | [**deleteHiddenOffers**](Apis/ExpressApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
*ExpressApi* | [**deleteOffers**](Apis/ExpressApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
*ExpressApi* | [**deleteOffersFromArchive**](Apis/ExpressApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
*ExpressApi* | [**deletePromoOffers**](Apis/ExpressApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
*ExpressApi* | [**generateBoostConsolidatedReport**](Apis/ExpressApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
*ExpressApi* | [**generateCompetitorsPositionReport**](Apis/ExpressApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
*ExpressApi* | [**generateGoodsFeedbackReport**](Apis/ExpressApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
*ExpressApi* | [**generateGoodsRealizationReport**](Apis/ExpressApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
*ExpressApi* | [**generateMassOrderLabelsReport**](Apis/ExpressApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
*ExpressApi* | [**generateOrderLabel**](Apis/ExpressApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
*ExpressApi* | [**generateOrderLabels**](Apis/ExpressApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
*ExpressApi* | [**generatePricesReport**](Apis/ExpressApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
*ExpressApi* | [**generateShelfsStatisticsReport**](Apis/ExpressApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
*ExpressApi* | [**generateShowsSalesReport**](Apis/ExpressApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
*ExpressApi* | [**generateStocksOnWarehousesReport**](Apis/ExpressApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
*ExpressApi* | [**generateUnitedMarketplaceServicesReport**](Apis/ExpressApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
*ExpressApi* | [**generateUnitedNettingReport**](Apis/ExpressApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам |
*ExpressApi* | [**generateUnitedOrdersReport**](Apis/ExpressApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам |
*ExpressApi* | [**getAllOffers**](Apis/ExpressApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
*ExpressApi* | [**getBidsInfoForBusiness**](Apis/ExpressApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
*ExpressApi* | [**getBidsRecommendations**](Apis/ExpressApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
*ExpressApi* | [**getBusinessQuarantineOffers**](Apis/ExpressApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
*ExpressApi* | [**getBusinessSettings**](Apis/ExpressApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
*ExpressApi* | [**getCampaign**](Apis/ExpressApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
*ExpressApi* | [**getCampaignLogins**](Apis/ExpressApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
*ExpressApi* | [**getCampaignOffers**](Apis/ExpressApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
*ExpressApi* | [**getCampaignQuarantineOffers**](Apis/ExpressApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
*ExpressApi* | [**getCampaignRegion**](Apis/ExpressApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
*ExpressApi* | [**getCampaignSettings**](Apis/ExpressApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
*ExpressApi* | [**getCampaigns**](Apis/ExpressApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя |
*ExpressApi* | [**getCampaignsByLogin**](Apis/ExpressApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
*ExpressApi* | [**getCategoriesMaxSaleQuantum**](Apis/ExpressApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
*ExpressApi* | [**getCategoriesTree**](Apis/ExpressApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |
*ExpressApi* | [**getCategoryContentParameters**](Apis/ExpressApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
*ExpressApi* | [**getChatHistory**](Apis/ExpressApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
*ExpressApi* | [**getChats**](Apis/ExpressApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
*ExpressApi* | [**getDeliveryServices**](Apis/ExpressApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки |
*ExpressApi* | [**getFeed**](Apis/ExpressApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
*ExpressApi* | [**getFeedIndexLogs**](Apis/ExpressApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
*ExpressApi* | [**getFeedbackAndCommentUpdates**](Apis/ExpressApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
*ExpressApi* | [**getFeeds**](Apis/ExpressApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
*ExpressApi* | [**getGoodsFeedbackComments**](Apis/ExpressApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
*ExpressApi* | [**getGoodsFeedbacks**](Apis/ExpressApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
*ExpressApi* | [**getGoodsStats**](Apis/ExpressApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
*ExpressApi* | [**getHiddenOffers**](Apis/ExpressApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
*ExpressApi* | [**getOfferCardsContentStatus**](Apis/ExpressApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
*ExpressApi* | [**getOfferMappingEntries**](Apis/ExpressApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
*ExpressApi* | [**getOfferMappings**](Apis/ExpressApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
*ExpressApi* | [**getOfferRecommendations**](Apis/ExpressApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
*ExpressApi* | [**getOffers**](Apis/ExpressApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
*ExpressApi* | [**getOrder**](Apis/ExpressApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
*ExpressApi* | [**getOrderBusinessBuyerInfo**](Apis/ExpressApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
*ExpressApi* | [**getOrderBusinessDocumentsInfo**](Apis/ExpressApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
*ExpressApi* | [**getOrderLabelsData**](Apis/ExpressApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
*ExpressApi* | [**getOrders**](Apis/ExpressApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
*ExpressApi* | [**getOrdersStats**](Apis/ExpressApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
*ExpressApi* | [**getPrices**](Apis/ExpressApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
*ExpressApi* | [**getPricesByOfferIds**](Apis/ExpressApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
*ExpressApi* | [**getPromoOffers**](Apis/ExpressApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
*ExpressApi* | [**getPromos**](Apis/ExpressApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
*ExpressApi* | [**getQualityRatingDetails**](Apis/ExpressApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
*ExpressApi* | [**getQualityRatings**](Apis/ExpressApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
*ExpressApi* | [**getReportInfo**](Apis/ExpressApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
*ExpressApi* | [**getReturn**](Apis/ExpressApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
*ExpressApi* | [**getReturnApplication**](Apis/ExpressApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
*ExpressApi* | [**getReturnPhoto**](Apis/ExpressApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
*ExpressApi* | [**getReturns**](Apis/ExpressApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
*ExpressApi* | [**getStocks**](Apis/ExpressApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
*ExpressApi* | [**getSuggestedOfferMappingEntries**](Apis/ExpressApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
*ExpressApi* | [**getSuggestedOfferMappings**](Apis/ExpressApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
*ExpressApi* | [**getSuggestedPrices**](Apis/ExpressApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
*ExpressApi* | [**getWarehouses**](Apis/ExpressApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |
*ExpressApi* | [**provideOrderItemIdentifiers**](Apis/ExpressApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
*ExpressApi* | [**putBidsForBusiness**](Apis/ExpressApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
*ExpressApi* | [**putBidsForCampaign**](Apis/ExpressApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
*ExpressApi* | [**refreshFeed**](Apis/ExpressApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
*ExpressApi* | [**searchRegionChildren**](Apis/ExpressApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
*ExpressApi* | [**searchRegionsById**](Apis/ExpressApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе |
*ExpressApi* | [**searchRegionsByName**](Apis/ExpressApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени |
*ExpressApi* | [**sendFileToChat**](Apis/ExpressApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
*ExpressApi* | [**sendMessageToChat**](Apis/ExpressApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
*ExpressApi* | [**setFeedParams**](Apis/ExpressApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
*ExpressApi* | [**setOrderBoxLayout**](Apis/ExpressApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
*ExpressApi* | [**setOrderShipmentBoxes**](Apis/ExpressApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
*ExpressApi* | [**skipGoodsFeedbacksReaction**](Apis/ExpressApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
*ExpressApi* | [**updateBusinessPrices**](Apis/ExpressApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
*ExpressApi* | [**updateCampaignOffers**](Apis/ExpressApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
*ExpressApi* | [**updateGoodsFeedbackComment**](Apis/ExpressApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
*ExpressApi* | [**updateOfferContent**](Apis/ExpressApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
*ExpressApi* | [**updateOfferMappingEntries**](Apis/ExpressApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
*ExpressApi* | [**updateOfferMappings**](Apis/ExpressApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
*ExpressApi* | [**updateOrderItems**](Apis/ExpressApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
*ExpressApi* | [**updateOrderStatus**](Apis/ExpressApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
*ExpressApi* | [**updateOrderStatuses**](Apis/ExpressApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
*ExpressApi* | [**updatePrices**](Apis/ExpressApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
*ExpressApi* | [**updatePromoOffers**](Apis/ExpressApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
*ExpressApi* | [**updateStocks**](Apis/ExpressApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |
*ExpressApi* | [**verifyOrderEac**](Apis/ExpressApi.md#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения |
| *FbsApi* | [**addHiddenOffers**](Apis/FbsApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
*FbsApi* | [**addOffersToArchive**](Apis/FbsApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
*FbsApi* | [**calculateTariffs**](Apis/FbsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
*FbsApi* | [**confirmBusinessPrices**](Apis/FbsApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
*FbsApi* | [**confirmCampaignPrices**](Apis/FbsApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
*FbsApi* | [**confirmShipment**](Apis/FbsApi.md#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки |
*FbsApi* | [**createChat**](Apis/FbsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
*FbsApi* | [**deleteCampaignOffers**](Apis/FbsApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
*FbsApi* | [**deleteGoodsFeedbackComment**](Apis/FbsApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
*FbsApi* | [**deleteHiddenOffers**](Apis/FbsApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
*FbsApi* | [**deleteOffers**](Apis/FbsApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
*FbsApi* | [**deleteOffersFromArchive**](Apis/FbsApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
*FbsApi* | [**deletePromoOffers**](Apis/FbsApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
*FbsApi* | [**downloadShipmentAct**](Apis/FbsApi.md#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи |
*FbsApi* | [**downloadShipmentDiscrepancyAct**](Apis/FbsApi.md#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений |
*FbsApi* | [**downloadShipmentInboundAct**](Apis/FbsApi.md#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи |
*FbsApi* | [**downloadShipmentPalletLabels**](Apis/FbsApi.md#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS) |
*FbsApi* | [**downloadShipmentReceptionTransferAct**](Apis/FbsApi.md#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее |
*FbsApi* | [**downloadShipmentTransportationWaybill**](Apis/FbsApi.md#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной |
*FbsApi* | [**generateBoostConsolidatedReport**](Apis/FbsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
*FbsApi* | [**generateCompetitorsPositionReport**](Apis/FbsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
*FbsApi* | [**generateGoodsFeedbackReport**](Apis/FbsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
*FbsApi* | [**generateGoodsRealizationReport**](Apis/FbsApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
*FbsApi* | [**generateMassOrderLabelsReport**](Apis/FbsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
*FbsApi* | [**generateOrderLabel**](Apis/FbsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
*FbsApi* | [**generateOrderLabels**](Apis/FbsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
*FbsApi* | [**generatePricesReport**](Apis/FbsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
*FbsApi* | [**generateShelfsStatisticsReport**](Apis/FbsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
*FbsApi* | [**generateShipmentListDocumentReport**](Apis/FbsApi.md#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки |
*FbsApi* | [**generateShowsSalesReport**](Apis/FbsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
*FbsApi* | [**generateStocksOnWarehousesReport**](Apis/FbsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
*FbsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/FbsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
*FbsApi* | [**generateUnitedNettingReport**](Apis/FbsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам |
*FbsApi* | [**generateUnitedOrdersReport**](Apis/FbsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам |
*FbsApi* | [**getAllOffers**](Apis/FbsApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
*FbsApi* | [**getBidsInfoForBusiness**](Apis/FbsApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
*FbsApi* | [**getBidsRecommendations**](Apis/FbsApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
*FbsApi* | [**getBusinessQuarantineOffers**](Apis/FbsApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
*FbsApi* | [**getBusinessSettings**](Apis/FbsApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
*FbsApi* | [**getCampaign**](Apis/FbsApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
*FbsApi* | [**getCampaignLogins**](Apis/FbsApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
*FbsApi* | [**getCampaignOffers**](Apis/FbsApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
*FbsApi* | [**getCampaignQuarantineOffers**](Apis/FbsApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
*FbsApi* | [**getCampaignRegion**](Apis/FbsApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
*FbsApi* | [**getCampaignSettings**](Apis/FbsApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
*FbsApi* | [**getCampaigns**](Apis/FbsApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя |
*FbsApi* | [**getCampaignsByLogin**](Apis/FbsApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
*FbsApi* | [**getCategoriesMaxSaleQuantum**](Apis/FbsApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
*FbsApi* | [**getCategoriesTree**](Apis/FbsApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |
*FbsApi* | [**getCategoryContentParameters**](Apis/FbsApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
*FbsApi* | [**getChatHistory**](Apis/FbsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
*FbsApi* | [**getChats**](Apis/FbsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
*FbsApi* | [**getDeliveryServices**](Apis/FbsApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки |
*FbsApi* | [**getFeed**](Apis/FbsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
*FbsApi* | [**getFeedIndexLogs**](Apis/FbsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
*FbsApi* | [**getFeedbackAndCommentUpdates**](Apis/FbsApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
*FbsApi* | [**getFeeds**](Apis/FbsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
*FbsApi* | [**getGoodsFeedbackComments**](Apis/FbsApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
*FbsApi* | [**getGoodsFeedbacks**](Apis/FbsApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
*FbsApi* | [**getGoodsStats**](Apis/FbsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
*FbsApi* | [**getHiddenOffers**](Apis/FbsApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
*FbsApi* | [**getOfferCardsContentStatus**](Apis/FbsApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
*FbsApi* | [**getOfferMappingEntries**](Apis/FbsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
*FbsApi* | [**getOfferMappings**](Apis/FbsApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
*FbsApi* | [**getOfferRecommendations**](Apis/FbsApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
*FbsApi* | [**getOffers**](Apis/FbsApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
*FbsApi* | [**getOrder**](Apis/FbsApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
*FbsApi* | [**getOrderBusinessBuyerInfo**](Apis/FbsApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
*FbsApi* | [**getOrderBusinessDocumentsInfo**](Apis/FbsApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
*FbsApi* | [**getOrderLabelsData**](Apis/FbsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
*FbsApi* | [**getOrders**](Apis/FbsApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
*FbsApi* | [**getOrdersStats**](Apis/FbsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
*FbsApi* | [**getPrices**](Apis/FbsApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
*FbsApi* | [**getPricesByOfferIds**](Apis/FbsApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
*FbsApi* | [**getPromoOffers**](Apis/FbsApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
*FbsApi* | [**getPromos**](Apis/FbsApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
*FbsApi* | [**getQualityRatingDetails**](Apis/FbsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
*FbsApi* | [**getQualityRatings**](Apis/FbsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
*FbsApi* | [**getReportInfo**](Apis/FbsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
*FbsApi* | [**getReturn**](Apis/FbsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
*FbsApi* | [**getReturnApplication**](Apis/FbsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
*FbsApi* | [**getReturnPhoto**](Apis/FbsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
*FbsApi* | [**getReturns**](Apis/FbsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
*FbsApi* | [**getShipment**](Apis/FbsApi.md#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке |
*FbsApi* | [**getShipmentOrdersInfo**](Apis/FbsApi.md#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS) |
*FbsApi* | [**getStocks**](Apis/FbsApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
*FbsApi* | [**getSuggestedOfferMappingEntries**](Apis/FbsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
*FbsApi* | [**getSuggestedOfferMappings**](Apis/FbsApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
*FbsApi* | [**getSuggestedPrices**](Apis/FbsApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
*FbsApi* | [**getWarehouses**](Apis/FbsApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |
*FbsApi* | [**provideOrderItemIdentifiers**](Apis/FbsApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
*FbsApi* | [**putBidsForBusiness**](Apis/FbsApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
*FbsApi* | [**putBidsForCampaign**](Apis/FbsApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
*FbsApi* | [**refreshFeed**](Apis/FbsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
*FbsApi* | [**searchRegionChildren**](Apis/FbsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
*FbsApi* | [**searchRegionsById**](Apis/FbsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе |
*FbsApi* | [**searchRegionsByName**](Apis/FbsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени |
*FbsApi* | [**searchShipments**](Apis/FbsApi.md#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках |
*FbsApi* | [**sendFileToChat**](Apis/FbsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
*FbsApi* | [**sendMessageToChat**](Apis/FbsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
*FbsApi* | [**setFeedParams**](Apis/FbsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
*FbsApi* | [**setOrderBoxLayout**](Apis/FbsApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
*FbsApi* | [**setOrderShipmentBoxes**](Apis/FbsApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
*FbsApi* | [**setShipmentPalletsCount**](Apis/FbsApi.md#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке |
*FbsApi* | [**skipGoodsFeedbacksReaction**](Apis/FbsApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
*FbsApi* | [**transferOrdersFromShipment**](Apis/FbsApi.md#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку |
*FbsApi* | [**updateBusinessPrices**](Apis/FbsApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
*FbsApi* | [**updateCampaignOffers**](Apis/FbsApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
*FbsApi* | [**updateGoodsFeedbackComment**](Apis/FbsApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
*FbsApi* | [**updateOfferContent**](Apis/FbsApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
*FbsApi* | [**updateOfferMappingEntries**](Apis/FbsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
*FbsApi* | [**updateOfferMappings**](Apis/FbsApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
*FbsApi* | [**updateOrderItems**](Apis/FbsApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
*FbsApi* | [**updateOrderStatus**](Apis/FbsApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
*FbsApi* | [**updateOrderStatuses**](Apis/FbsApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
*FbsApi* | [**updatePrices**](Apis/FbsApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
*FbsApi* | [**updatePromoOffers**](Apis/FbsApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
*FbsApi* | [**updateStocks**](Apis/FbsApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |
| *FbyApi* | [**addHiddenOffers**](Apis/FbyApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
*FbyApi* | [**addOffersToArchive**](Apis/FbyApi.md#addofferstoarchive) | **POST** /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив |
*FbyApi* | [**calculateTariffs**](Apis/FbyApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
*FbyApi* | [**confirmBusinessPrices**](Apis/FbyApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
*FbyApi* | [**confirmCampaignPrices**](Apis/FbyApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
*FbyApi* | [**createChat**](Apis/FbyApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
*FbyApi* | [**deleteCampaignOffers**](Apis/FbyApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
*FbyApi* | [**deleteGoodsFeedbackComment**](Apis/FbyApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
*FbyApi* | [**deleteHiddenOffers**](Apis/FbyApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
*FbyApi* | [**deleteOffers**](Apis/FbyApi.md#deleteoffers) | **POST** /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога |
*FbyApi* | [**deleteOffersFromArchive**](Apis/FbyApi.md#deleteoffersfromarchive) | **POST** /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива |
*FbyApi* | [**deletePromoOffers**](Apis/FbyApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
*FbyApi* | [**generateBoostConsolidatedReport**](Apis/FbyApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
*FbyApi* | [**generateCompetitorsPositionReport**](Apis/FbyApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
*FbyApi* | [**generateGoodsFeedbackReport**](Apis/FbyApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
*FbyApi* | [**generateGoodsMovementReport**](Apis/FbyApi.md#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров |
*FbyApi* | [**generateGoodsRealizationReport**](Apis/FbyApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
*FbyApi* | [**generateGoodsTurnoverReport**](Apis/FbyApi.md#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости |
*FbyApi* | [**generatePricesReport**](Apis/FbyApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
*FbyApi* | [**generateShelfsStatisticsReport**](Apis/FbyApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
*FbyApi* | [**generateShowsSalesReport**](Apis/FbyApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
*FbyApi* | [**generateStocksOnWarehousesReport**](Apis/FbyApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
*FbyApi* | [**generateUnitedMarketplaceServicesReport**](Apis/FbyApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
*FbyApi* | [**generateUnitedNettingReport**](Apis/FbyApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам |
*FbyApi* | [**generateUnitedOrdersReport**](Apis/FbyApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам |
*FbyApi* | [**getAllOffers**](Apis/FbyApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
*FbyApi* | [**getBidsInfoForBusiness**](Apis/FbyApi.md#getbidsinfoforbusiness) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
*FbyApi* | [**getBidsRecommendations**](Apis/FbyApi.md#getbidsrecommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
*FbyApi* | [**getBusinessQuarantineOffers**](Apis/FbyApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
*FbyApi* | [**getBusinessSettings**](Apis/FbyApi.md#getbusinesssettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |
*FbyApi* | [**getCampaign**](Apis/FbyApi.md#getcampaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
*FbyApi* | [**getCampaignLogins**](Apis/FbyApi.md#getcampaignlogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
*FbyApi* | [**getCampaignOffers**](Apis/FbyApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
*FbyApi* | [**getCampaignQuarantineOffers**](Apis/FbyApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
*FbyApi* | [**getCampaignRegion**](Apis/FbyApi.md#getcampaignregion) | **GET** /campaigns/{campaignId}/region | Регион магазина |
*FbyApi* | [**getCampaignSettings**](Apis/FbyApi.md#getcampaignsettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
*FbyApi* | [**getCampaigns**](Apis/FbyApi.md#getcampaigns) | **GET** /campaigns | Список магазинов пользователя |
*FbyApi* | [**getCampaignsByLogin**](Apis/FbyApi.md#getcampaignsbylogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |
*FbyApi* | [**getCategoriesMaxSaleQuantum**](Apis/FbyApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
*FbyApi* | [**getCategoriesTree**](Apis/FbyApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |
*FbyApi* | [**getCategoryContentParameters**](Apis/FbyApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
*FbyApi* | [**getChatHistory**](Apis/FbyApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
*FbyApi* | [**getChats**](Apis/FbyApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
*FbyApi* | [**getFeed**](Apis/FbyApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
*FbyApi* | [**getFeedIndexLogs**](Apis/FbyApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
*FbyApi* | [**getFeedbackAndCommentUpdates**](Apis/FbyApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
*FbyApi* | [**getFeeds**](Apis/FbyApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
*FbyApi* | [**getFulfillmentWarehouses**](Apis/FbyApi.md#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY) |
*FbyApi* | [**getGoodsFeedbackComments**](Apis/FbyApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
*FbyApi* | [**getGoodsFeedbacks**](Apis/FbyApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
*FbyApi* | [**getGoodsStats**](Apis/FbyApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
*FbyApi* | [**getHiddenOffers**](Apis/FbyApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
*FbyApi* | [**getOfferCardsContentStatus**](Apis/FbyApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
*FbyApi* | [**getOfferMappingEntries**](Apis/FbyApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
*FbyApi* | [**getOfferMappings**](Apis/FbyApi.md#getoffermappings) | **POST** /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге |
*FbyApi* | [**getOfferRecommendations**](Apis/FbyApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
*FbyApi* | [**getOffers**](Apis/FbyApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
*FbyApi* | [**getOrder**](Apis/FbyApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
*FbyApi* | [**getOrderBusinessBuyerInfo**](Apis/FbyApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
*FbyApi* | [**getOrderBusinessDocumentsInfo**](Apis/FbyApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
*FbyApi* | [**getOrders**](Apis/FbyApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
*FbyApi* | [**getOrdersStats**](Apis/FbyApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
*FbyApi* | [**getPrices**](Apis/FbyApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
*FbyApi* | [**getPricesByOfferIds**](Apis/FbyApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
*FbyApi* | [**getPromoOffers**](Apis/FbyApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
*FbyApi* | [**getPromos**](Apis/FbyApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
*FbyApi* | [**getQualityRatings**](Apis/FbyApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
*FbyApi* | [**getReportInfo**](Apis/FbyApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
*FbyApi* | [**getReturn**](Apis/FbyApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
*FbyApi* | [**getReturnPhoto**](Apis/FbyApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
*FbyApi* | [**getReturns**](Apis/FbyApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
*FbyApi* | [**getStocks**](Apis/FbyApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
*FbyApi* | [**getSuggestedOfferMappingEntries**](Apis/FbyApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
*FbyApi* | [**getSuggestedOfferMappings**](Apis/FbyApi.md#getsuggestedoffermappings) | **POST** /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам |
*FbyApi* | [**getSuggestedPrices**](Apis/FbyApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
*FbyApi* | [**putBidsForBusiness**](Apis/FbyApi.md#putbidsforbusiness) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
*FbyApi* | [**putBidsForCampaign**](Apis/FbyApi.md#putbidsforcampaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |
*FbyApi* | [**refreshFeed**](Apis/FbyApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
*FbyApi* | [**searchRegionChildren**](Apis/FbyApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
*FbyApi* | [**searchRegionsById**](Apis/FbyApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе |
*FbyApi* | [**searchRegionsByName**](Apis/FbyApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени |
*FbyApi* | [**sendFileToChat**](Apis/FbyApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
*FbyApi* | [**sendMessageToChat**](Apis/FbyApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |
*FbyApi* | [**setFeedParams**](Apis/FbyApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
*FbyApi* | [**skipGoodsFeedbacksReaction**](Apis/FbyApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
*FbyApi* | [**updateBusinessPrices**](Apis/FbyApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
*FbyApi* | [**updateCampaignOffers**](Apis/FbyApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
*FbyApi* | [**updateGoodsFeedbackComment**](Apis/FbyApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
*FbyApi* | [**updateOfferContent**](Apis/FbyApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |
*FbyApi* | [**updateOfferMappingEntries**](Apis/FbyApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
*FbyApi* | [**updateOfferMappings**](Apis/FbyApi.md#updateoffermappings) | **POST** /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них |
*FbyApi* | [**updatePrices**](Apis/FbyApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
*FbyApi* | [**updatePromoOffers**](Apis/FbyApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
| *FeedbacksApi* | [**getFeedbackAndCommentUpdates**](Apis/FeedbacksApi.md#getfeedbackandcommentupdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине |
| *FeedsApi* | [**getFeed**](Apis/FeedsApi.md#getfeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
*FeedsApi* | [**getFeedIndexLogs**](Apis/FeedsApi.md#getfeedindexlogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
*FeedsApi* | [**getFeeds**](Apis/FeedsApi.md#getfeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
*FeedsApi* | [**refreshFeed**](Apis/FeedsApi.md#refreshfeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
*FeedsApi* | [**setFeedParams**](Apis/FeedsApi.md#setfeedparams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |
| *GoodsFeedbackApi* | [**deleteGoodsFeedbackComment**](Apis/GoodsFeedbackApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
*GoodsFeedbackApi* | [**getGoodsFeedbackComments**](Apis/GoodsFeedbackApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
*GoodsFeedbackApi* | [**getGoodsFeedbacks**](Apis/GoodsFeedbackApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
*GoodsFeedbackApi* | [**skipGoodsFeedbacksReaction**](Apis/GoodsFeedbackApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
*GoodsFeedbackApi* | [**updateGoodsFeedbackComment**](Apis/GoodsFeedbackApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |
| *GoodsStatsApi* | [**getGoodsStats**](Apis/GoodsStatsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |
| *HiddenOffersApi* | [**addHiddenOffers**](Apis/HiddenOffersApi.md#addhiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
*HiddenOffersApi* | [**deleteHiddenOffers**](Apis/HiddenOffersApi.md#deletehiddenoffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
*HiddenOffersApi* | [**getHiddenOffers**](Apis/HiddenOffersApi.md#gethiddenoffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |
| *ModelsApi* | [**getModel**](Apis/ModelsApi.md#getmodel) | **GET** /models/{modelId} | Информация об одной модели |
*ModelsApi* | [**getModelOffers**](Apis/ModelsApi.md#getmodeloffers) | **GET** /models/{modelId}/offers | Список предложений для одной модели |
*ModelsApi* | [**getModels**](Apis/ModelsApi.md#getmodels) | **POST** /models | Информация о нескольких моделях |
*ModelsApi* | [**getModelsOffers**](Apis/ModelsApi.md#getmodelsoffers) | **POST** /models/offers | Список предложений для нескольких моделей |
*ModelsApi* | [**searchModels**](Apis/ModelsApi.md#searchmodels) | **GET** /models | Поиск модели товара |
| *OfferMappingsApi* | [**getOfferMappingEntries**](Apis/OfferMappingsApi.md#getoffermappingentries) | **GET** /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге |
*OfferMappingsApi* | [**getSuggestedOfferMappingEntries**](Apis/OfferMappingsApi.md#getsuggestedoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров |
*OfferMappingsApi* | [**updateOfferMappingEntries**](Apis/OfferMappingsApi.md#updateoffermappingentries) | **POST** /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге |
| *OffersApi* | [**deleteCampaignOffers**](Apis/OffersApi.md#deletecampaignoffers) | **POST** /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина |
*OffersApi* | [**getAllOffers**](Apis/OffersApi.md#getalloffers) | **GET** /campaigns/{campaignId}/offers/all | Все предложения магазина |
*OffersApi* | [**getCampaignOffers**](Apis/OffersApi.md#getcampaignoffers) | **POST** /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине |
*OffersApi* | [**getOfferRecommendations**](Apis/OffersApi.md#getofferrecommendations) | **POST** /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен |
*OffersApi* | [**getOffers**](Apis/OffersApi.md#getoffers) | **GET** /campaigns/{campaignId}/offers | Предложения магазина |
*OffersApi* | [**updateCampaignOffers**](Apis/OffersApi.md#updatecampaignoffers) | **POST** /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине |
| *OrderBusinessInformationApi* | [**getOrderBusinessBuyerInfo**](Apis/OrderBusinessInformationApi.md#getorderbusinessbuyerinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
*OrderBusinessInformationApi* | [**getOrderBusinessDocumentsInfo**](Apis/OrderBusinessInformationApi.md#getorderbusinessdocumentsinfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |
| *OrderDeliveryApi* | [**getOrderBuyerInfo**](Apis/OrderDeliveryApi.md#getorderbuyerinfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице |
*OrderDeliveryApi* | [**setOrderDeliveryDate**](Apis/OrderDeliveryApi.md#setorderdeliverydate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа |
*OrderDeliveryApi* | [**setOrderDeliveryTrackCode**](Apis/OrderDeliveryApi.md#setorderdeliverytrackcode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки |
*OrderDeliveryApi* | [**updateOrderStorageLimit**](Apis/OrderDeliveryApi.md#updateorderstoragelimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа |
*OrderDeliveryApi* | [**verifyOrderEac**](Apis/OrderDeliveryApi.md#verifyordereac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения |
| *OrderLabelsApi* | [**generateOrderLabel**](Apis/OrderLabelsApi.md#generateorderlabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
*OrderLabelsApi* | [**generateOrderLabels**](Apis/OrderLabelsApi.md#generateorderlabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
*OrderLabelsApi* | [**getOrderLabelsData**](Apis/OrderLabelsApi.md#getorderlabelsdata) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |
| *OrdersApi* | [**acceptOrderCancellation**](Apis/OrdersApi.md#acceptordercancellation) | **PUT** /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем |
*OrdersApi* | [**getOrder**](Apis/OrdersApi.md#getorder) | **GET** /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе |
*OrdersApi* | [**getOrders**](Apis/OrdersApi.md#getorders) | **GET** /campaigns/{campaignId}/orders | Информация о нескольких заказах |
*OrdersApi* | [**provideOrderDigitalCodes**](Apis/OrdersApi.md#provideorderdigitalcodes) | **POST** /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров |
*OrdersApi* | [**provideOrderItemIdentifiers**](Apis/OrdersApi.md#provideorderitemidentifiers) | **PUT** /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара |
*OrdersApi* | [**setOrderBoxLayout**](Apis/OrdersApi.md#setorderboxlayout) | **PUT** /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа |
*OrdersApi* | [**setOrderShipmentBoxes**](Apis/OrdersApi.md#setordershipmentboxes) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе |
*OrdersApi* | [**updateOrderItems**](Apis/OrdersApi.md#updateorderitems) | **PUT** /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц |
*OrdersApi* | [**updateOrderStatus**](Apis/OrdersApi.md#updateorderstatus) | **PUT** /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа |
*OrdersApi* | [**updateOrderStatuses**](Apis/OrdersApi.md#updateorderstatuses) | **POST** /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов |
| *OrdersStatsApi* | [**getOrdersStats**](Apis/OrdersStatsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам |
| *OutletLicensesApi* | [**deleteOutletLicenses**](Apis/OutletLicensesApi.md#deleteoutletlicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж |
*OutletLicensesApi* | [**getOutletLicenses**](Apis/OutletLicensesApi.md#getoutletlicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж |
*OutletLicensesApi* | [**updateOutletLicenses**](Apis/OutletLicensesApi.md#updateoutletlicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж |
| *OutletsApi* | [**createOutlet**](Apis/OutletsApi.md#createoutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж |
*OutletsApi* | [**deleteOutlet**](Apis/OutletsApi.md#deleteoutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж |
*OutletsApi* | [**getOutlet**](Apis/OutletsApi.md#getoutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж |
*OutletsApi* | [**getOutlets**](Apis/OutletsApi.md#getoutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж |
*OutletsApi* | [**updateOutlet**](Apis/OutletsApi.md#updateoutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж |
| *PriceQuarantineApi* | [**confirmBusinessPrices**](Apis/PriceQuarantineApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
*PriceQuarantineApi* | [**confirmCampaignPrices**](Apis/PriceQuarantineApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
*PriceQuarantineApi* | [**getBusinessQuarantineOffers**](Apis/PriceQuarantineApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
*PriceQuarantineApi* | [**getCampaignQuarantineOffers**](Apis/PriceQuarantineApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |
| *PricesApi* | [**getPrices**](Apis/PricesApi.md#getprices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
*PricesApi* | [**getPricesByOfferIds**](Apis/PricesApi.md#getpricesbyofferids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
*PricesApi* | [**getSuggestedPrices**](Apis/PricesApi.md#getsuggestedprices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
*PricesApi* | [**updateBusinessPrices**](Apis/PricesApi.md#updatebusinessprices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
*PricesApi* | [**updatePrices**](Apis/PricesApi.md#updateprices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |
| *PromosApi* | [**deletePromoOffers**](Apis/PromosApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
*PromosApi* | [**getPromoOffers**](Apis/PromosApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
*PromosApi* | [**getPromos**](Apis/PromosApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
*PromosApi* | [**updatePromoOffers**](Apis/PromosApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |
| *RatingsApi* | [**getQualityRatingDetails**](Apis/RatingsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
*RatingsApi* | [**getQualityRatings**](Apis/RatingsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |
| *RegionsApi* | [**searchRegionChildren**](Apis/RegionsApi.md#searchregionchildren) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
*RegionsApi* | [**searchRegionsById**](Apis/RegionsApi.md#searchregionsbyid) | **GET** /regions/{regionId} | Информация о регионе |
*RegionsApi* | [**searchRegionsByName**](Apis/RegionsApi.md#searchregionsbyname) | **GET** /regions | Поиск регионов по их имени |
| *ReportsApi* | [**generateBoostConsolidatedReport**](Apis/ReportsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
*ReportsApi* | [**generateCompetitorsPositionReport**](Apis/ReportsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
*ReportsApi* | [**generateGoodsFeedbackReport**](Apis/ReportsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
*ReportsApi* | [**generateGoodsMovementReport**](Apis/ReportsApi.md#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров |
*ReportsApi* | [**generateGoodsRealizationReport**](Apis/ReportsApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
*ReportsApi* | [**generateGoodsTurnoverReport**](Apis/ReportsApi.md#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости |
*ReportsApi* | [**generateMassOrderLabelsReport**](Apis/ReportsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
*ReportsApi* | [**generatePricesReport**](Apis/ReportsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
*ReportsApi* | [**generateShelfsStatisticsReport**](Apis/ReportsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
*ReportsApi* | [**generateShipmentListDocumentReport**](Apis/ReportsApi.md#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки |
*ReportsApi* | [**generateShowsSalesReport**](Apis/ReportsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
*ReportsApi* | [**generateStocksOnWarehousesReport**](Apis/ReportsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
*ReportsApi* | [**generateUnitedMarketplaceServicesReport**](Apis/ReportsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
*ReportsApi* | [**generateUnitedNettingReport**](Apis/ReportsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам |
*ReportsApi* | [**generateUnitedOrdersReport**](Apis/ReportsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам |
*ReportsApi* | [**getReportInfo**](Apis/ReportsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |
| *ReturnsApi* | [**getReturn**](Apis/ReturnsApi.md#getreturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
*ReturnsApi* | [**getReturnApplication**](Apis/ReturnsApi.md#getreturnapplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
*ReturnsApi* | [**getReturnPhoto**](Apis/ReturnsApi.md#getreturnphoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
*ReturnsApi* | [**getReturns**](Apis/ReturnsApi.md#getreturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
*ReturnsApi* | [**setReturnDecision**](Apis/ReturnsApi.md#setreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
*ReturnsApi* | [**submitReturnDecision**](Apis/ReturnsApi.md#submitreturndecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |
| *ShipmentsApi* | [**confirmShipment**](Apis/ShipmentsApi.md#confirmshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки |
*ShipmentsApi* | [**downloadShipmentAct**](Apis/ShipmentsApi.md#downloadshipmentact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи |
*ShipmentsApi* | [**downloadShipmentDiscrepancyAct**](Apis/ShipmentsApi.md#downloadshipmentdiscrepancyact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений |
*ShipmentsApi* | [**downloadShipmentInboundAct**](Apis/ShipmentsApi.md#downloadshipmentinboundact) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи |
*ShipmentsApi* | [**downloadShipmentPalletLabels**](Apis/ShipmentsApi.md#downloadshipmentpalletlabels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS) |
*ShipmentsApi* | [**downloadShipmentReceptionTransferAct**](Apis/ShipmentsApi.md#downloadshipmentreceptiontransferact) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее |
*ShipmentsApi* | [**downloadShipmentTransportationWaybill**](Apis/ShipmentsApi.md#downloadshipmenttransportationwaybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной |
*ShipmentsApi* | [**getShipment**](Apis/ShipmentsApi.md#getshipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке |
*ShipmentsApi* | [**getShipmentOrdersInfo**](Apis/ShipmentsApi.md#getshipmentordersinfo) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS) |
*ShipmentsApi* | [**searchShipments**](Apis/ShipmentsApi.md#searchshipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках |
*ShipmentsApi* | [**setShipmentPalletsCount**](Apis/ShipmentsApi.md#setshipmentpalletscount) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке |
*ShipmentsApi* | [**transferOrdersFromShipment**](Apis/ShipmentsApi.md#transferordersfromshipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку |
| *StocksApi* | [**getStocks**](Apis/StocksApi.md#getstocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
*StocksApi* | [**updateStocks**](Apis/StocksApi.md#updatestocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |
| *TariffsApi* | [**calculateTariffs**](Apis/TariffsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |
| *WarehousesApi* | [**getFulfillmentWarehouses**](Apis/WarehousesApi.md#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY) |
*WarehousesApi* | [**getWarehouses**](Apis/WarehousesApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [AcceptOrderCancellationRequest](./Models/AcceptOrderCancellationRequest.md)
 - [AddHiddenOffersRequest](./Models/AddHiddenOffersRequest.md)
 - [AddOffersToArchiveDTO](./Models/AddOffersToArchiveDTO.md)
 - [AddOffersToArchiveErrorDTO](./Models/AddOffersToArchiveErrorDTO.md)
 - [AddOffersToArchiveErrorType](./Models/AddOffersToArchiveErrorType.md)
 - [AddOffersToArchiveRequest](./Models/AddOffersToArchiveRequest.md)
 - [AddOffersToArchiveResponse](./Models/AddOffersToArchiveResponse.md)
 - [AffectedOrderQualityRatingComponentType](./Models/AffectedOrderQualityRatingComponentType.md)
 - [AgeDTO](./Models/AgeDTO.md)
 - [AgeUnitType](./Models/AgeUnitType.md)
 - [ApiClientDataErrorResponse](./Models/ApiClientDataErrorResponse.md)
 - [ApiErrorDTO](./Models/ApiErrorDTO.md)
 - [ApiErrorResponse](./Models/ApiErrorResponse.md)
 - [ApiForbiddenErrorResponse](./Models/ApiForbiddenErrorResponse.md)
 - [ApiLimitErrorResponse](./Models/ApiLimitErrorResponse.md)
 - [ApiLockedErrorResponse](./Models/ApiLockedErrorResponse.md)
 - [ApiNotFoundErrorResponse](./Models/ApiNotFoundErrorResponse.md)
 - [ApiResponse](./Models/ApiResponse.md)
 - [ApiResponseStatusType](./Models/ApiResponseStatusType.md)
 - [ApiServerErrorResponse](./Models/ApiServerErrorResponse.md)
 - [ApiUnauthorizedErrorResponse](./Models/ApiUnauthorizedErrorResponse.md)
 - [BaseCampaignOfferDTO](./Models/BaseCampaignOfferDTO.md)
 - [BaseOfferDTO](./Models/BaseOfferDTO.md)
 - [BasePriceDTO](./Models/BasePriceDTO.md)
 - [BaseShipmentDTO](./Models/BaseShipmentDTO.md)
 - [BidRecommendationItemDTO](./Models/BidRecommendationItemDTO.md)
 - [BriefOrderItemDTO](./Models/BriefOrderItemDTO.md)
 - [BriefOrderItemInstanceDTO](./Models/BriefOrderItemInstanceDTO.md)
 - [BusinessDTO](./Models/BusinessDTO.md)
 - [BusinessSettingsDTO](./Models/BusinessSettingsDTO.md)
 - [CalculateTariffsOfferDTO](./Models/CalculateTariffsOfferDTO.md)
 - [CalculateTariffsOfferInfoDTO](./Models/CalculateTariffsOfferInfoDTO.md)
 - [CalculateTariffsParametersDTO](./Models/CalculateTariffsParametersDTO.md)
 - [CalculateTariffsRequest](./Models/CalculateTariffsRequest.md)
 - [CalculateTariffsResponse](./Models/CalculateTariffsResponse.md)
 - [CalculateTariffsResponseDTO](./Models/CalculateTariffsResponseDTO.md)
 - [CalculatedTariffDTO](./Models/CalculatedTariffDTO.md)
 - [CalculatedTariffType](./Models/CalculatedTariffType.md)
 - [CampaignDTO](./Models/CampaignDTO.md)
 - [CampaignQualityRatingDTO](./Models/CampaignQualityRatingDTO.md)
 - [CampaignSettingsDTO](./Models/CampaignSettingsDTO.md)
 - [CampaignSettingsDeliveryDTO](./Models/CampaignSettingsDeliveryDTO.md)
 - [CampaignSettingsLocalRegionDTO](./Models/CampaignSettingsLocalRegionDTO.md)
 - [CampaignSettingsScheduleDTO](./Models/CampaignSettingsScheduleDTO.md)
 - [CampaignSettingsScheduleSourceType](./Models/CampaignSettingsScheduleSourceType.md)
 - [CampaignSettingsTimePeriodDTO](./Models/CampaignSettingsTimePeriodDTO.md)
 - [CampaignsQualityRatingDTO](./Models/CampaignsQualityRatingDTO.md)
 - [CategoryContentParametersDTO](./Models/CategoryContentParametersDTO.md)
 - [CategoryDTO](./Models/CategoryDTO.md)
 - [CategoryErrorDTO](./Models/CategoryErrorDTO.md)
 - [CategoryErrorType](./Models/CategoryErrorType.md)
 - [CategoryParameterDTO](./Models/CategoryParameterDTO.md)
 - [CategoryParameterUnitDTO](./Models/CategoryParameterUnitDTO.md)
 - [ChangeOutletRequest](./Models/ChangeOutletRequest.md)
 - [ChannelType](./Models/ChannelType.md)
 - [ChatMessageDTO](./Models/ChatMessageDTO.md)
 - [ChatMessagePayloadDTO](./Models/ChatMessagePayloadDTO.md)
 - [ChatMessageSenderType](./Models/ChatMessageSenderType.md)
 - [ChatMessagesResultDTO](./Models/ChatMessagesResultDTO.md)
 - [ChatStatusType](./Models/ChatStatusType.md)
 - [ChatType](./Models/ChatType.md)
 - [ConfirmPricesRequest](./Models/ConfirmPricesRequest.md)
 - [ConfirmShipmentRequest](./Models/ConfirmShipmentRequest.md)
 - [CreateChatRequest](./Models/CreateChatRequest.md)
 - [CreateChatResponse](./Models/CreateChatResponse.md)
 - [CreateChatResultDTO](./Models/CreateChatResultDTO.md)
 - [CreateOutletResponse](./Models/CreateOutletResponse.md)
 - [CurrencyType](./Models/CurrencyType.md)
 - [DayOfWeekType](./Models/DayOfWeekType.md)
 - [DeleteCampaignOffersDTO](./Models/DeleteCampaignOffersDTO.md)
 - [DeleteCampaignOffersRequest](./Models/DeleteCampaignOffersRequest.md)
 - [DeleteCampaignOffersResponse](./Models/DeleteCampaignOffersResponse.md)
 - [DeleteGoodsFeedbackCommentRequest](./Models/DeleteGoodsFeedbackCommentRequest.md)
 - [DeleteHiddenOffersRequest](./Models/DeleteHiddenOffersRequest.md)
 - [DeleteOffersDTO](./Models/DeleteOffersDTO.md)
 - [DeleteOffersFromArchiveDTO](./Models/DeleteOffersFromArchiveDTO.md)
 - [DeleteOffersFromArchiveRequest](./Models/DeleteOffersFromArchiveRequest.md)
 - [DeleteOffersFromArchiveResponse](./Models/DeleteOffersFromArchiveResponse.md)
 - [DeleteOffersRequest](./Models/DeleteOffersRequest.md)
 - [DeleteOffersResponse](./Models/DeleteOffersResponse.md)
 - [DeletePromoOffersRequest](./Models/DeletePromoOffersRequest.md)
 - [DeletePromoOffersResponse](./Models/DeletePromoOffersResponse.md)
 - [DeletePromoOffersResultDTO](./Models/DeletePromoOffersResultDTO.md)
 - [DeliveryServiceDTO](./Models/DeliveryServiceDTO.md)
 - [DeliveryServiceInfoDTO](./Models/DeliveryServiceInfoDTO.md)
 - [DeliveryServicesDTO](./Models/DeliveryServicesDTO.md)
 - [DocumentDTO](./Models/DocumentDTO.md)
 - [EacVerificationResultDTO](./Models/EacVerificationResultDTO.md)
 - [EacVerificationStatusType](./Models/EacVerificationStatusType.md)
 - [EmptyApiResponse](./Models/EmptyApiResponse.md)
 - [EnrichedMappingsOfferDTO](./Models/EnrichedMappingsOfferDTO.md)
 - [EnrichedModelDTO](./Models/EnrichedModelDTO.md)
 - [EnrichedModelsDTO](./Models/EnrichedModelsDTO.md)
 - [EnrichedOrderBoxLayoutDTO](./Models/EnrichedOrderBoxLayoutDTO.md)
 - [ExtensionShipmentDTO](./Models/ExtensionShipmentDTO.md)
 - [FeedContentDTO](./Models/FeedContentDTO.md)
 - [FeedContentErrorDTO](./Models/FeedContentErrorDTO.md)
 - [FeedContentErrorType](./Models/FeedContentErrorType.md)
 - [FeedDTO](./Models/FeedDTO.md)
 - [FeedDownloadDTO](./Models/FeedDownloadDTO.md)
 - [FeedDownloadErrorDTO](./Models/FeedDownloadErrorDTO.md)
 - [FeedDownloadErrorType](./Models/FeedDownloadErrorType.md)
 - [FeedIndexLogsErrorDTO](./Models/FeedIndexLogsErrorDTO.md)
 - [FeedIndexLogsErrorType](./Models/FeedIndexLogsErrorType.md)
 - [FeedIndexLogsFeedDTO](./Models/FeedIndexLogsFeedDTO.md)
 - [FeedIndexLogsIndexType](./Models/FeedIndexLogsIndexType.md)
 - [FeedIndexLogsOffersDTO](./Models/FeedIndexLogsOffersDTO.md)
 - [FeedIndexLogsRecordDTO](./Models/FeedIndexLogsRecordDTO.md)
 - [FeedIndexLogsResultDTO](./Models/FeedIndexLogsResultDTO.md)
 - [FeedIndexLogsStatusType](./Models/FeedIndexLogsStatusType.md)
 - [FeedParameterDTO](./Models/FeedParameterDTO.md)
 - [FeedPlacementDTO](./Models/FeedPlacementDTO.md)
 - [FeedPublicationDTO](./Models/FeedPublicationDTO.md)
 - [FeedPublicationFullDTO](./Models/FeedPublicationFullDTO.md)
 - [FeedPublicationPriceAndStockUpdateDTO](./Models/FeedPublicationPriceAndStockUpdateDTO.md)
 - [FeedStatusType](./Models/FeedStatusType.md)
 - [FeedbackAuthorDTO](./Models/FeedbackAuthorDTO.md)
 - [FeedbackCommentAuthorDTO](./Models/FeedbackCommentAuthorDTO.md)
 - [FeedbackCommentAuthorType](./Models/FeedbackCommentAuthorType.md)
 - [FeedbackCommentDTO](./Models/FeedbackCommentDTO.md)
 - [FeedbackDTO](./Models/FeedbackDTO.md)
 - [FeedbackDeliveryType](./Models/FeedbackDeliveryType.md)
 - [FeedbackFactorDTO](./Models/FeedbackFactorDTO.md)
 - [FeedbackGradesDTO](./Models/FeedbackGradesDTO.md)
 - [FeedbackListDTO](./Models/FeedbackListDTO.md)
 - [FeedbackOrderDTO](./Models/FeedbackOrderDTO.md)
 - [FeedbackReactionStatusType](./Models/FeedbackReactionStatusType.md)
 - [FeedbackShopDTO](./Models/FeedbackShopDTO.md)
 - [FeedbackStateType](./Models/FeedbackStateType.md)
 - [FieldStateType](./Models/FieldStateType.md)
 - [FlippingPagerDTO](./Models/FlippingPagerDTO.md)
 - [ForwardScrollingPagerDTO](./Models/ForwardScrollingPagerDTO.md)
 - [FulfillmentWarehouseDTO](./Models/FulfillmentWarehouseDTO.md)
 - [FulfillmentWarehousesDTO](./Models/FulfillmentWarehousesDTO.md)
 - [FullOutletDTO](./Models/FullOutletDTO.md)
 - [FullOutletLicenseDTO](./Models/FullOutletLicenseDTO.md)
 - [GenerateBoostConsolidatedRequest](./Models/GenerateBoostConsolidatedRequest.md)
 - [GenerateCompetitorsPositionReportRequest](./Models/GenerateCompetitorsPositionReportRequest.md)
 - [GenerateGoodsFeedbackRequest](./Models/GenerateGoodsFeedbackRequest.md)
 - [GenerateGoodsMovementReportRequest](./Models/GenerateGoodsMovementReportRequest.md)
 - [GenerateGoodsRealizationReportRequest](./Models/GenerateGoodsRealizationReportRequest.md)
 - [GenerateGoodsTurnoverRequest](./Models/GenerateGoodsTurnoverRequest.md)
 - [GenerateMassOrderLabelsRequest](./Models/GenerateMassOrderLabelsRequest.md)
 - [GeneratePricesReportRequest](./Models/GeneratePricesReportRequest.md)
 - [GenerateReportDTO](./Models/GenerateReportDTO.md)
 - [GenerateReportResponse](./Models/GenerateReportResponse.md)
 - [GenerateShelfsStatisticsRequest](./Models/GenerateShelfsStatisticsRequest.md)
 - [GenerateShipmentListDocumentReportRequest](./Models/GenerateShipmentListDocumentReportRequest.md)
 - [GenerateShowsSalesReportRequest](./Models/GenerateShowsSalesReportRequest.md)
 - [GenerateStocksOnWarehousesReportRequest](./Models/GenerateStocksOnWarehousesReportRequest.md)
 - [GenerateUnitedMarketplaceServicesReportRequest](./Models/GenerateUnitedMarketplaceServicesReportRequest.md)
 - [GenerateUnitedNettingReportRequest](./Models/GenerateUnitedNettingReportRequest.md)
 - [GenerateUnitedOrdersRequest](./Models/GenerateUnitedOrdersRequest.md)
 - [GetAllOffersResponse](./Models/GetAllOffersResponse.md)
 - [GetBidsInfoRequest](./Models/GetBidsInfoRequest.md)
 - [GetBidsInfoResponse](./Models/GetBidsInfoResponse.md)
 - [GetBidsInfoResponseDTO](./Models/GetBidsInfoResponseDTO.md)
 - [GetBidsRecommendationsRequest](./Models/GetBidsRecommendationsRequest.md)
 - [GetBidsRecommendationsResponse](./Models/GetBidsRecommendationsResponse.md)
 - [GetBidsRecommendationsResponseDTO](./Models/GetBidsRecommendationsResponseDTO.md)
 - [GetBusinessBuyerInfoResponse](./Models/GetBusinessBuyerInfoResponse.md)
 - [GetBusinessDocumentsInfoResponse](./Models/GetBusinessDocumentsInfoResponse.md)
 - [GetBusinessSettingsInfoDTO](./Models/GetBusinessSettingsInfoDTO.md)
 - [GetBusinessSettingsResponse](./Models/GetBusinessSettingsResponse.md)
 - [GetCampaignLoginsResponse](./Models/GetCampaignLoginsResponse.md)
 - [GetCampaignOfferDTO](./Models/GetCampaignOfferDTO.md)
 - [GetCampaignOffersRequest](./Models/GetCampaignOffersRequest.md)
 - [GetCampaignOffersResponse](./Models/GetCampaignOffersResponse.md)
 - [GetCampaignOffersResultDTO](./Models/GetCampaignOffersResultDTO.md)
 - [GetCampaignRegionResponse](./Models/GetCampaignRegionResponse.md)
 - [GetCampaignResponse](./Models/GetCampaignResponse.md)
 - [GetCampaignSettingsResponse](./Models/GetCampaignSettingsResponse.md)
 - [GetCampaignsResponse](./Models/GetCampaignsResponse.md)
 - [GetCategoriesMaxSaleQuantumDTO](./Models/GetCategoriesMaxSaleQuantumDTO.md)
 - [GetCategoriesMaxSaleQuantumRequest](./Models/GetCategoriesMaxSaleQuantumRequest.md)
 - [GetCategoriesMaxSaleQuantumResponse](./Models/GetCategoriesMaxSaleQuantumResponse.md)
 - [GetCategoriesRequest](./Models/GetCategoriesRequest.md)
 - [GetCategoriesResponse](./Models/GetCategoriesResponse.md)
 - [GetCategoryContentParametersResponse](./Models/GetCategoryContentParametersResponse.md)
 - [GetChatHistoryRequest](./Models/GetChatHistoryRequest.md)
 - [GetChatHistoryResponse](./Models/GetChatHistoryResponse.md)
 - [GetChatInfoDTO](./Models/GetChatInfoDTO.md)
 - [GetChatsInfoDTO](./Models/GetChatsInfoDTO.md)
 - [GetChatsRequest](./Models/GetChatsRequest.md)
 - [GetChatsResponse](./Models/GetChatsResponse.md)
 - [GetDeliveryServicesResponse](./Models/GetDeliveryServicesResponse.md)
 - [GetFeedIndexLogsResponse](./Models/GetFeedIndexLogsResponse.md)
 - [GetFeedResponse](./Models/GetFeedResponse.md)
 - [GetFeedbackListResponse](./Models/GetFeedbackListResponse.md)
 - [GetFeedsResponse](./Models/GetFeedsResponse.md)
 - [GetFulfillmentWarehousesResponse](./Models/GetFulfillmentWarehousesResponse.md)
 - [GetGoodsFeedbackCommentsRequest](./Models/GetGoodsFeedbackCommentsRequest.md)
 - [GetGoodsFeedbackCommentsResponse](./Models/GetGoodsFeedbackCommentsResponse.md)
 - [GetGoodsFeedbackRequest](./Models/GetGoodsFeedbackRequest.md)
 - [GetGoodsFeedbackResponse](./Models/GetGoodsFeedbackResponse.md)
 - [GetGoodsStatsRequest](./Models/GetGoodsStatsRequest.md)
 - [GetGoodsStatsResponse](./Models/GetGoodsStatsResponse.md)
 - [GetHiddenOffersResponse](./Models/GetHiddenOffersResponse.md)
 - [GetHiddenOffersResultDTO](./Models/GetHiddenOffersResultDTO.md)
 - [GetMappingDTO](./Models/GetMappingDTO.md)
 - [GetModelsOffersResponse](./Models/GetModelsOffersResponse.md)
 - [GetModelsRequest](./Models/GetModelsRequest.md)
 - [GetModelsResponse](./Models/GetModelsResponse.md)
 - [GetOfferCardsContentStatusRequest](./Models/GetOfferCardsContentStatusRequest.md)
 - [GetOfferCardsContentStatusResponse](./Models/GetOfferCardsContentStatusResponse.md)
 - [GetOfferDTO](./Models/GetOfferDTO.md)
 - [GetOfferMappingDTO](./Models/GetOfferMappingDTO.md)
 - [GetOfferMappingEntriesResponse](./Models/GetOfferMappingEntriesResponse.md)
 - [GetOfferMappingsRequest](./Models/GetOfferMappingsRequest.md)
 - [GetOfferMappingsResponse](./Models/GetOfferMappingsResponse.md)
 - [GetOfferMappingsResultDTO](./Models/GetOfferMappingsResultDTO.md)
 - [GetOfferRecommendationsRequest](./Models/GetOfferRecommendationsRequest.md)
 - [GetOfferRecommendationsResponse](./Models/GetOfferRecommendationsResponse.md)
 - [GetOffersResponse](./Models/GetOffersResponse.md)
 - [GetOrderBuyerInfoResponse](./Models/GetOrderBuyerInfoResponse.md)
 - [GetOrderLabelsDataResponse](./Models/GetOrderLabelsDataResponse.md)
 - [GetOrderResponse](./Models/GetOrderResponse.md)
 - [GetOrdersResponse](./Models/GetOrdersResponse.md)
 - [GetOrdersStatsRequest](./Models/GetOrdersStatsRequest.md)
 - [GetOrdersStatsResponse](./Models/GetOrdersStatsResponse.md)
 - [GetOutletLicensesResponse](./Models/GetOutletLicensesResponse.md)
 - [GetOutletResponse](./Models/GetOutletResponse.md)
 - [GetOutletsResponse](./Models/GetOutletsResponse.md)
 - [GetPriceDTO](./Models/GetPriceDTO.md)
 - [GetPriceWithDiscountDTO](./Models/GetPriceWithDiscountDTO.md)
 - [GetPriceWithVatDTO](./Models/GetPriceWithVatDTO.md)
 - [GetPricesByOfferIdsRequest](./Models/GetPricesByOfferIdsRequest.md)
 - [GetPricesByOfferIdsResponse](./Models/GetPricesByOfferIdsResponse.md)
 - [GetPricesResponse](./Models/GetPricesResponse.md)
 - [GetPromoAssortmentInfoDTO](./Models/GetPromoAssortmentInfoDTO.md)
 - [GetPromoBestsellerInfoDTO](./Models/GetPromoBestsellerInfoDTO.md)
 - [GetPromoConstraintsDTO](./Models/GetPromoConstraintsDTO.md)
 - [GetPromoDTO](./Models/GetPromoDTO.md)
 - [GetPromoMechanicsInfoDTO](./Models/GetPromoMechanicsInfoDTO.md)
 - [GetPromoOfferDTO](./Models/GetPromoOfferDTO.md)
 - [GetPromoOffersRequest](./Models/GetPromoOffersRequest.md)
 - [GetPromoOffersResponse](./Models/GetPromoOffersResponse.md)
 - [GetPromoOffersResultDTO](./Models/GetPromoOffersResultDTO.md)
 - [GetPromoPromocodeInfoDTO](./Models/GetPromoPromocodeInfoDTO.md)
 - [GetPromosRequest](./Models/GetPromosRequest.md)
 - [GetPromosResponse](./Models/GetPromosResponse.md)
 - [GetPromosResultDTO](./Models/GetPromosResultDTO.md)
 - [GetQualityRatingDetailsResponse](./Models/GetQualityRatingDetailsResponse.md)
 - [GetQualityRatingRequest](./Models/GetQualityRatingRequest.md)
 - [GetQualityRatingResponse](./Models/GetQualityRatingResponse.md)
 - [GetQuarantineOffersRequest](./Models/GetQuarantineOffersRequest.md)
 - [GetQuarantineOffersResponse](./Models/GetQuarantineOffersResponse.md)
 - [GetQuarantineOffersResultDTO](./Models/GetQuarantineOffersResultDTO.md)
 - [GetRegionWithChildrenResponse](./Models/GetRegionWithChildrenResponse.md)
 - [GetRegionsResponse](./Models/GetRegionsResponse.md)
 - [GetReportInfoResponse](./Models/GetReportInfoResponse.md)
 - [GetReturnResponse](./Models/GetReturnResponse.md)
 - [GetReturnsResponse](./Models/GetReturnsResponse.md)
 - [GetShipmentOrdersInfoResponse](./Models/GetShipmentOrdersInfoResponse.md)
 - [GetShipmentResponse](./Models/GetShipmentResponse.md)
 - [GetSuggestedOfferMappingEntriesRequest](./Models/GetSuggestedOfferMappingEntriesRequest.md)
 - [GetSuggestedOfferMappingEntriesResponse](./Models/GetSuggestedOfferMappingEntriesResponse.md)
 - [GetSuggestedOfferMappingsRequest](./Models/GetSuggestedOfferMappingsRequest.md)
 - [GetSuggestedOfferMappingsResponse](./Models/GetSuggestedOfferMappingsResponse.md)
 - [GetSuggestedOfferMappingsResultDTO](./Models/GetSuggestedOfferMappingsResultDTO.md)
 - [GetWarehouseStocksDTO](./Models/GetWarehouseStocksDTO.md)
 - [GetWarehouseStocksRequest](./Models/GetWarehouseStocksRequest.md)
 - [GetWarehouseStocksResponse](./Models/GetWarehouseStocksResponse.md)
 - [GetWarehousesResponse](./Models/GetWarehousesResponse.md)
 - [GoodsFeedbackCommentAuthorDTO](./Models/GoodsFeedbackCommentAuthorDTO.md)
 - [GoodsFeedbackCommentAuthorType](./Models/GoodsFeedbackCommentAuthorType.md)
 - [GoodsFeedbackCommentDTO](./Models/GoodsFeedbackCommentDTO.md)
 - [GoodsFeedbackCommentListDTO](./Models/GoodsFeedbackCommentListDTO.md)
 - [GoodsFeedbackCommentStatusType](./Models/GoodsFeedbackCommentStatusType.md)
 - [GoodsFeedbackDTO](./Models/GoodsFeedbackDTO.md)
 - [GoodsFeedbackDescriptionDTO](./Models/GoodsFeedbackDescriptionDTO.md)
 - [GoodsFeedbackIdentifiersDTO](./Models/GoodsFeedbackIdentifiersDTO.md)
 - [GoodsFeedbackListDTO](./Models/GoodsFeedbackListDTO.md)
 - [GoodsFeedbackMediaDTO](./Models/GoodsFeedbackMediaDTO.md)
 - [GoodsFeedbackStatisticsDTO](./Models/GoodsFeedbackStatisticsDTO.md)
 - [GoodsStatsDTO](./Models/GoodsStatsDTO.md)
 - [GoodsStatsGoodsDTO](./Models/GoodsStatsGoodsDTO.md)
 - [GoodsStatsWarehouseDTO](./Models/GoodsStatsWarehouseDTO.md)
 - [GoodsStatsWeightDimensionsDTO](./Models/GoodsStatsWeightDimensionsDTO.md)
 - [GpsDTO](./Models/GpsDTO.md)
 - [HiddenOfferDTO](./Models/HiddenOfferDTO.md)
 - [LanguageType](./Models/LanguageType.md)
 - [LicenseCheckStatusType](./Models/LicenseCheckStatusType.md)
 - [LicenseType](./Models/LicenseType.md)
 - [LogisticPickupPointDTO](./Models/LogisticPickupPointDTO.md)
 - [LogisticPointType](./Models/LogisticPointType.md)
 - [MappingsOfferDTO](./Models/MappingsOfferDTO.md)
 - [MappingsOfferInfoDTO](./Models/MappingsOfferInfoDTO.md)
 - [MaxSaleQuantumDTO](./Models/MaxSaleQuantumDTO.md)
 - [MechanicsType](./Models/MechanicsType.md)
 - [ModelDTO](./Models/ModelDTO.md)
 - [ModelOfferDTO](./Models/ModelOfferDTO.md)
 - [ModelPriceDTO](./Models/ModelPriceDTO.md)
 - [ModelsDTO](./Models/ModelsDTO.md)
 - [OfferAvailabilityStatusType](./Models/OfferAvailabilityStatusType.md)
 - [OfferCampaignStatusDTO](./Models/OfferCampaignStatusDTO.md)
 - [OfferCampaignStatusType](./Models/OfferCampaignStatusType.md)
 - [OfferCardDTO](./Models/OfferCardDTO.md)
 - [OfferCardRecommendationDTO](./Models/OfferCardRecommendationDTO.md)
 - [OfferCardRecommendationType](./Models/OfferCardRecommendationType.md)
 - [OfferCardStatusType](./Models/OfferCardStatusType.md)
 - [OfferCardsContentStatusDTO](./Models/OfferCardsContentStatusDTO.md)
 - [OfferConditionDTO](./Models/OfferConditionDTO.md)
 - [OfferConditionQualityType](./Models/OfferConditionQualityType.md)
 - [OfferConditionType](./Models/OfferConditionType.md)
 - [OfferContentDTO](./Models/OfferContentDTO.md)
 - [OfferContentErrorDTO](./Models/OfferContentErrorDTO.md)
 - [OfferContentErrorType](./Models/OfferContentErrorType.md)
 - [OfferDTO](./Models/OfferDTO.md)
 - [OfferErrorDTO](./Models/OfferErrorDTO.md)
 - [OfferForRecommendationDTO](./Models/OfferForRecommendationDTO.md)
 - [OfferManualDTO](./Models/OfferManualDTO.md)
 - [OfferMappingDTO](./Models/OfferMappingDTO.md)
 - [OfferMappingEntriesDTO](./Models/OfferMappingEntriesDTO.md)
 - [OfferMappingEntryDTO](./Models/OfferMappingEntryDTO.md)
 - [OfferMappingErrorDTO](./Models/OfferMappingErrorDTO.md)
 - [OfferMappingErrorType](./Models/OfferMappingErrorType.md)
 - [OfferMappingInfoDTO](./Models/OfferMappingInfoDTO.md)
 - [OfferMappingKindType](./Models/OfferMappingKindType.md)
 - [OfferMappingSuggestionsListDTO](./Models/OfferMappingSuggestionsListDTO.md)
 - [OfferParamDTO](./Models/OfferParamDTO.md)
 - [OfferPriceByOfferIdsListResponseDTO](./Models/OfferPriceByOfferIdsListResponseDTO.md)
 - [OfferPriceByOfferIdsResponseDTO](./Models/OfferPriceByOfferIdsResponseDTO.md)
 - [OfferPriceDTO](./Models/OfferPriceDTO.md)
 - [OfferPriceListResponseDTO](./Models/OfferPriceListResponseDTO.md)
 - [OfferPriceResponseDTO](./Models/OfferPriceResponseDTO.md)
 - [OfferProcessingNoteDTO](./Models/OfferProcessingNoteDTO.md)
 - [OfferProcessingNoteType](./Models/OfferProcessingNoteType.md)
 - [OfferProcessingStateDTO](./Models/OfferProcessingStateDTO.md)
 - [OfferProcessingStatusType](./Models/OfferProcessingStatusType.md)
 - [OfferRecommendationDTO](./Models/OfferRecommendationDTO.md)
 - [OfferRecommendationInfoDTO](./Models/OfferRecommendationInfoDTO.md)
 - [OfferRecommendationsResultDTO](./Models/OfferRecommendationsResultDTO.md)
 - [OfferSellingProgramDTO](./Models/OfferSellingProgramDTO.md)
 - [OfferSellingProgramStatusType](./Models/OfferSellingProgramStatusType.md)
 - [OfferType](./Models/OfferType.md)
 - [OfferWeightDimensionsDTO](./Models/OfferWeightDimensionsDTO.md)
 - [OffersDTO](./Models/OffersDTO.md)
 - [OptionValuesLimitedDTO](./Models/OptionValuesLimitedDTO.md)
 - [OrderBoxLayoutDTO](./Models/OrderBoxLayoutDTO.md)
 - [OrderBoxLayoutItemDTO](./Models/OrderBoxLayoutItemDTO.md)
 - [OrderBoxLayoutPartialCountDTO](./Models/OrderBoxLayoutPartialCountDTO.md)
 - [OrderBoxesLayoutDTO](./Models/OrderBoxesLayoutDTO.md)
 - [OrderBusinessBuyerDTO](./Models/OrderBusinessBuyerDTO.md)
 - [OrderBusinessDocumentsDTO](./Models/OrderBusinessDocumentsDTO.md)
 - [OrderBuyerBasicInfoDTO](./Models/OrderBuyerBasicInfoDTO.md)
 - [OrderBuyerDTO](./Models/OrderBuyerDTO.md)
 - [OrderBuyerInfoDTO](./Models/OrderBuyerInfoDTO.md)
 - [OrderBuyerType](./Models/OrderBuyerType.md)
 - [OrderCancellationReasonType](./Models/OrderCancellationReasonType.md)
 - [OrderCourierDTO](./Models/OrderCourierDTO.md)
 - [OrderDTO](./Models/OrderDTO.md)
 - [OrderDeliveryAddressDTO](./Models/OrderDeliveryAddressDTO.md)
 - [OrderDeliveryDTO](./Models/OrderDeliveryDTO.md)
 - [OrderDeliveryDateDTO](./Models/OrderDeliveryDateDTO.md)
 - [OrderDeliveryDateReasonType](./Models/OrderDeliveryDateReasonType.md)
 - [OrderDeliveryDatesDTO](./Models/OrderDeliveryDatesDTO.md)
 - [OrderDeliveryDispatchType](./Models/OrderDeliveryDispatchType.md)
 - [OrderDeliveryEacType](./Models/OrderDeliveryEacType.md)
 - [OrderDeliveryPartnerType](./Models/OrderDeliveryPartnerType.md)
 - [OrderDeliveryType](./Models/OrderDeliveryType.md)
 - [OrderDigitalItemDTO](./Models/OrderDigitalItemDTO.md)
 - [OrderDocumentStatusType](./Models/OrderDocumentStatusType.md)
 - [OrderItemDTO](./Models/OrderItemDTO.md)
 - [OrderItemDetailDTO](./Models/OrderItemDetailDTO.md)
 - [OrderItemInstanceDTO](./Models/OrderItemInstanceDTO.md)
 - [OrderItemInstanceModificationDTO](./Models/OrderItemInstanceModificationDTO.md)
 - [OrderItemInstanceType](./Models/OrderItemInstanceType.md)
 - [OrderItemModificationDTO](./Models/OrderItemModificationDTO.md)
 - [OrderItemPromoDTO](./Models/OrderItemPromoDTO.md)
 - [OrderItemStatusType](./Models/OrderItemStatusType.md)
 - [OrderItemSubsidyDTO](./Models/OrderItemSubsidyDTO.md)
 - [OrderItemSubsidyType](./Models/OrderItemSubsidyType.md)
 - [OrderItemsModificationRequestReasonType](./Models/OrderItemsModificationRequestReasonType.md)
 - [OrderItemsModificationResultDTO](./Models/OrderItemsModificationResultDTO.md)
 - [OrderLabelDTO](./Models/OrderLabelDTO.md)
 - [OrderLiftType](./Models/OrderLiftType.md)
 - [OrderParcelBoxDTO](./Models/OrderParcelBoxDTO.md)
 - [OrderPaymentMethodType](./Models/OrderPaymentMethodType.md)
 - [OrderPaymentType](./Models/OrderPaymentType.md)
 - [OrderPromoType](./Models/OrderPromoType.md)
 - [OrderShipmentDTO](./Models/OrderShipmentDTO.md)
 - [OrderStateDTO](./Models/OrderStateDTO.md)
 - [OrderStatsStatusType](./Models/OrderStatsStatusType.md)
 - [OrderStatusChangeDTO](./Models/OrderStatusChangeDTO.md)
 - [OrderStatusChangeDeliveryDTO](./Models/OrderStatusChangeDeliveryDTO.md)
 - [OrderStatusChangeDeliveryDatesDTO](./Models/OrderStatusChangeDeliveryDatesDTO.md)
 - [OrderStatusType](./Models/OrderStatusType.md)
 - [OrderSubsidyDTO](./Models/OrderSubsidyDTO.md)
 - [OrderSubsidyType](./Models/OrderSubsidyType.md)
 - [OrderSubstatusType](./Models/OrderSubstatusType.md)
 - [OrderTaxSystemType](./Models/OrderTaxSystemType.md)
 - [OrderTrackDTO](./Models/OrderTrackDTO.md)
 - [OrderUpdateStatusType](./Models/OrderUpdateStatusType.md)
 - [OrderVatType](./Models/OrderVatType.md)
 - [OrdersShipmentInfoDTO](./Models/OrdersShipmentInfoDTO.md)
 - [OrdersStatsCommissionDTO](./Models/OrdersStatsCommissionDTO.md)
 - [OrdersStatsCommissionType](./Models/OrdersStatsCommissionType.md)
 - [OrdersStatsDTO](./Models/OrdersStatsDTO.md)
 - [OrdersStatsDeliveryRegionDTO](./Models/OrdersStatsDeliveryRegionDTO.md)
 - [OrdersStatsDetailsDTO](./Models/OrdersStatsDetailsDTO.md)
 - [OrdersStatsItemDTO](./Models/OrdersStatsItemDTO.md)
 - [OrdersStatsItemStatusType](./Models/OrdersStatsItemStatusType.md)
 - [OrdersStatsOrderDTO](./Models/OrdersStatsOrderDTO.md)
 - [OrdersStatsOrderPaymentType](./Models/OrdersStatsOrderPaymentType.md)
 - [OrdersStatsPaymentDTO](./Models/OrdersStatsPaymentDTO.md)
 - [OrdersStatsPaymentOrderDTO](./Models/OrdersStatsPaymentOrderDTO.md)
 - [OrdersStatsPaymentSourceType](./Models/OrdersStatsPaymentSourceType.md)
 - [OrdersStatsPaymentType](./Models/OrdersStatsPaymentType.md)
 - [OrdersStatsPriceDTO](./Models/OrdersStatsPriceDTO.md)
 - [OrdersStatsPriceType](./Models/OrdersStatsPriceType.md)
 - [OrdersStatsStockType](./Models/OrdersStatsStockType.md)
 - [OrdersStatsWarehouseDTO](./Models/OrdersStatsWarehouseDTO.md)
 - [OutletAddressDTO](./Models/OutletAddressDTO.md)
 - [OutletDTO](./Models/OutletDTO.md)
 - [OutletDeliveryRuleDTO](./Models/OutletDeliveryRuleDTO.md)
 - [OutletLicenseDTO](./Models/OutletLicenseDTO.md)
 - [OutletLicensesResponseDTO](./Models/OutletLicensesResponseDTO.md)
 - [OutletResponseDTO](./Models/OutletResponseDTO.md)
 - [OutletStatusType](./Models/OutletStatusType.md)
 - [OutletType](./Models/OutletType.md)
 - [OutletVisibilityType](./Models/OutletVisibilityType.md)
 - [OutletWorkingScheduleDTO](./Models/OutletWorkingScheduleDTO.md)
 - [OutletWorkingScheduleItemDTO](./Models/OutletWorkingScheduleItemDTO.md)
 - [PageFormatType](./Models/PageFormatType.md)
 - [PagedReturnsDTO](./Models/PagedReturnsDTO.md)
 - [PalletsCountDTO](./Models/PalletsCountDTO.md)
 - [ParameterType](./Models/ParameterType.md)
 - [ParameterValueConstraintsDTO](./Models/ParameterValueConstraintsDTO.md)
 - [ParameterValueDTO](./Models/ParameterValueDTO.md)
 - [ParameterValueOptionDTO](./Models/ParameterValueOptionDTO.md)
 - [ParcelBoxDTO](./Models/ParcelBoxDTO.md)
 - [ParcelBoxLabelDTO](./Models/ParcelBoxLabelDTO.md)
 - [ParcelDTO](./Models/ParcelDTO.md)
 - [PartnerShipmentWarehouseDTO](./Models/PartnerShipmentWarehouseDTO.md)
 - [PaymentFrequencyType](./Models/PaymentFrequencyType.md)
 - [PickupAddressDTO](./Models/PickupAddressDTO.md)
 - [PlacementType](./Models/PlacementType.md)
 - [PriceCompetitivenessThresholdsDTO](./Models/PriceCompetitivenessThresholdsDTO.md)
 - [PriceCompetitivenessType](./Models/PriceCompetitivenessType.md)
 - [PriceDTO](./Models/PriceDTO.md)
 - [PriceQuarantineVerdictDTO](./Models/PriceQuarantineVerdictDTO.md)
 - [PriceQuarantineVerdictParamNameType](./Models/PriceQuarantineVerdictParamNameType.md)
 - [PriceQuarantineVerdictParameterDTO](./Models/PriceQuarantineVerdictParameterDTO.md)
 - [PriceQuarantineVerdictType](./Models/PriceQuarantineVerdictType.md)
 - [PriceRecommendationItemDTO](./Models/PriceRecommendationItemDTO.md)
 - [PriceSuggestDTO](./Models/PriceSuggestDTO.md)
 - [PriceSuggestOfferDTO](./Models/PriceSuggestOfferDTO.md)
 - [PriceSuggestType](./Models/PriceSuggestType.md)
 - [PromoOfferAutoParticipatingDetailsDTO](./Models/PromoOfferAutoParticipatingDetailsDTO.md)
 - [PromoOfferDiscountParamsDTO](./Models/PromoOfferDiscountParamsDTO.md)
 - [PromoOfferParamsDTO](./Models/PromoOfferParamsDTO.md)
 - [PromoOfferParticipationStatusFilterType](./Models/PromoOfferParticipationStatusFilterType.md)
 - [PromoOfferParticipationStatusType](./Models/PromoOfferParticipationStatusType.md)
 - [PromoOfferPromocodeParamsDTO](./Models/PromoOfferPromocodeParamsDTO.md)
 - [PromoOfferUpdateWarningCodeType](./Models/PromoOfferUpdateWarningCodeType.md)
 - [PromoOfferUpdateWarningDTO](./Models/PromoOfferUpdateWarningDTO.md)
 - [PromoParticipationType](./Models/PromoParticipationType.md)
 - [PromoPeriodDTO](./Models/PromoPeriodDTO.md)
 - [ProvideOrderDigitalCodesRequest](./Models/ProvideOrderDigitalCodesRequest.md)
 - [ProvideOrderItemIdentifiersRequest](./Models/ProvideOrderItemIdentifiersRequest.md)
 - [ProvideOrderItemIdentifiersResponse](./Models/ProvideOrderItemIdentifiersResponse.md)
 - [PutSkuBidsRequest](./Models/PutSkuBidsRequest.md)
 - [QualityRatingAffectedOrderDTO](./Models/QualityRatingAffectedOrderDTO.md)
 - [QualityRatingComponentDTO](./Models/QualityRatingComponentDTO.md)
 - [QualityRatingComponentType](./Models/QualityRatingComponentType.md)
 - [QualityRatingDTO](./Models/QualityRatingDTO.md)
 - [QualityRatingDetailsDTO](./Models/QualityRatingDetailsDTO.md)
 - [QuantumDTO](./Models/QuantumDTO.md)
 - [QuarantineOfferDTO](./Models/QuarantineOfferDTO.md)
 - [RecipientType](./Models/RecipientType.md)
 - [RefundStatusType](./Models/RefundStatusType.md)
 - [RegionDTO](./Models/RegionDTO.md)
 - [RegionType](./Models/RegionType.md)
 - [RegionalModelInfoDTO](./Models/RegionalModelInfoDTO.md)
 - [RejectedPromoOfferDeleteDTO](./Models/RejectedPromoOfferDeleteDTO.md)
 - [RejectedPromoOfferDeleteReasonType](./Models/RejectedPromoOfferDeleteReasonType.md)
 - [RejectedPromoOfferUpdateDTO](./Models/RejectedPromoOfferUpdateDTO.md)
 - [RejectedPromoOfferUpdateReasonType](./Models/RejectedPromoOfferUpdateReasonType.md)
 - [ReportFormatType](./Models/ReportFormatType.md)
 - [ReportInfoDTO](./Models/ReportInfoDTO.md)
 - [ReportStatusType](./Models/ReportStatusType.md)
 - [ReportSubStatusType](./Models/ReportSubStatusType.md)
 - [ReturnDTO](./Models/ReturnDTO.md)
 - [ReturnDecisionDTO](./Models/ReturnDecisionDTO.md)
 - [ReturnDecisionReasonType](./Models/ReturnDecisionReasonType.md)
 - [ReturnDecisionSubreasonType](./Models/ReturnDecisionSubreasonType.md)
 - [ReturnDecisionType](./Models/ReturnDecisionType.md)
 - [ReturnInstanceDTO](./Models/ReturnInstanceDTO.md)
 - [ReturnInstanceStatusType](./Models/ReturnInstanceStatusType.md)
 - [ReturnInstanceStockType](./Models/ReturnInstanceStockType.md)
 - [ReturnItemDTO](./Models/ReturnItemDTO.md)
 - [ReturnRequestDecisionType](./Models/ReturnRequestDecisionType.md)
 - [ReturnShipmentStatusType](./Models/ReturnShipmentStatusType.md)
 - [ReturnType](./Models/ReturnType.md)
 - [ScrollingPagerDTO](./Models/ScrollingPagerDTO.md)
 - [SearchModelsResponse](./Models/SearchModelsResponse.md)
 - [SearchShipmentsRequest](./Models/SearchShipmentsRequest.md)
 - [SearchShipmentsResponse](./Models/SearchShipmentsResponse.md)
 - [SearchShipmentsResponseDTO](./Models/SearchShipmentsResponseDTO.md)
 - [SellingProgramType](./Models/SellingProgramType.md)
 - [SendMessageToChatRequest](./Models/SendMessageToChatRequest.md)
 - [SetFeedParamsRequest](./Models/SetFeedParamsRequest.md)
 - [SetOrderBoxLayoutRequest](./Models/SetOrderBoxLayoutRequest.md)
 - [SetOrderBoxLayoutResponse](./Models/SetOrderBoxLayoutResponse.md)
 - [SetOrderDeliveryDateRequest](./Models/SetOrderDeliveryDateRequest.md)
 - [SetOrderDeliveryTrackCodeRequest](./Models/SetOrderDeliveryTrackCodeRequest.md)
 - [SetOrderShipmentBoxesRequest](./Models/SetOrderShipmentBoxesRequest.md)
 - [SetOrderShipmentBoxesResponse](./Models/SetOrderShipmentBoxesResponse.md)
 - [SetReturnDecisionRequest](./Models/SetReturnDecisionRequest.md)
 - [SetShipmentPalletsCountRequest](./Models/SetShipmentPalletsCountRequest.md)
 - [ShelfsStatisticsAttributionType](./Models/ShelfsStatisticsAttributionType.md)
 - [ShipmentActionType](./Models/ShipmentActionType.md)
 - [ShipmentBoxesDTO](./Models/ShipmentBoxesDTO.md)
 - [ShipmentDTO](./Models/ShipmentDTO.md)
 - [ShipmentInfoDTO](./Models/ShipmentInfoDTO.md)
 - [ShipmentPalletLabelPageFormatType](./Models/ShipmentPalletLabelPageFormatType.md)
 - [ShipmentStatusChangeDTO](./Models/ShipmentStatusChangeDTO.md)
 - [ShipmentStatusType](./Models/ShipmentStatusType.md)
 - [ShipmentType](./Models/ShipmentType.md)
 - [ShowsSalesGroupingType](./Models/ShowsSalesGroupingType.md)
 - [SkipGoodsFeedbackReactionRequest](./Models/SkipGoodsFeedbackReactionRequest.md)
 - [SkuBidItemDTO](./Models/SkuBidItemDTO.md)
 - [SkuBidRecommendationItemDTO](./Models/SkuBidRecommendationItemDTO.md)
 - [SortOrderType](./Models/SortOrderType.md)
 - [SuggestOfferPriceDTO](./Models/SuggestOfferPriceDTO.md)
 - [SuggestPricesRequest](./Models/SuggestPricesRequest.md)
 - [SuggestPricesResponse](./Models/SuggestPricesResponse.md)
 - [SuggestPricesResultDTO](./Models/SuggestPricesResultDTO.md)
 - [SuggestedOfferDTO](./Models/SuggestedOfferDTO.md)
 - [SuggestedOfferMappingDTO](./Models/SuggestedOfferMappingDTO.md)
 - [TariffDTO](./Models/TariffDTO.md)
 - [TariffParameterDTO](./Models/TariffParameterDTO.md)
 - [TariffType](./Models/TariffType.md)
 - [TimePeriodDTO](./Models/TimePeriodDTO.md)
 - [TimeUnitType](./Models/TimeUnitType.md)
 - [TrackDTO](./Models/TrackDTO.md)
 - [TransferOrdersFromShipmentRequest](./Models/TransferOrdersFromShipmentRequest.md)
 - [TurnoverDTO](./Models/TurnoverDTO.md)
 - [TurnoverType](./Models/TurnoverType.md)
 - [UnitDTO](./Models/UnitDTO.md)
 - [UpdateBusinessOfferPriceDTO](./Models/UpdateBusinessOfferPriceDTO.md)
 - [UpdateBusinessPricesRequest](./Models/UpdateBusinessPricesRequest.md)
 - [UpdateCampaignOfferDTO](./Models/UpdateCampaignOfferDTO.md)
 - [UpdateCampaignOffersRequest](./Models/UpdateCampaignOffersRequest.md)
 - [UpdateGoodsFeedbackCommentDTO](./Models/UpdateGoodsFeedbackCommentDTO.md)
 - [UpdateGoodsFeedbackCommentRequest](./Models/UpdateGoodsFeedbackCommentRequest.md)
 - [UpdateGoodsFeedbackCommentResponse](./Models/UpdateGoodsFeedbackCommentResponse.md)
 - [UpdateMappingDTO](./Models/UpdateMappingDTO.md)
 - [UpdateMappingsOfferDTO](./Models/UpdateMappingsOfferDTO.md)
 - [UpdateOfferContentRequest](./Models/UpdateOfferContentRequest.md)
 - [UpdateOfferContentResponse](./Models/UpdateOfferContentResponse.md)
 - [UpdateOfferContentResultDTO](./Models/UpdateOfferContentResultDTO.md)
 - [UpdateOfferDTO](./Models/UpdateOfferDTO.md)
 - [UpdateOfferMappingDTO](./Models/UpdateOfferMappingDTO.md)
 - [UpdateOfferMappingEntryDTO](./Models/UpdateOfferMappingEntryDTO.md)
 - [UpdateOfferMappingEntryRequest](./Models/UpdateOfferMappingEntryRequest.md)
 - [UpdateOfferMappingResultDTO](./Models/UpdateOfferMappingResultDTO.md)
 - [UpdateOfferMappingsRequest](./Models/UpdateOfferMappingsRequest.md)
 - [UpdateOfferMappingsResponse](./Models/UpdateOfferMappingsResponse.md)
 - [UpdateOrderItemRequest](./Models/UpdateOrderItemRequest.md)
 - [UpdateOrderStatusDTO](./Models/UpdateOrderStatusDTO.md)
 - [UpdateOrderStatusRequest](./Models/UpdateOrderStatusRequest.md)
 - [UpdateOrderStatusResponse](./Models/UpdateOrderStatusResponse.md)
 - [UpdateOrderStatusesDTO](./Models/UpdateOrderStatusesDTO.md)
 - [UpdateOrderStatusesRequest](./Models/UpdateOrderStatusesRequest.md)
 - [UpdateOrderStatusesResponse](./Models/UpdateOrderStatusesResponse.md)
 - [UpdateOrderStorageLimitRequest](./Models/UpdateOrderStorageLimitRequest.md)
 - [UpdateOutletLicenseRequest](./Models/UpdateOutletLicenseRequest.md)
 - [UpdatePriceWithDiscountDTO](./Models/UpdatePriceWithDiscountDTO.md)
 - [UpdatePricesRequest](./Models/UpdatePricesRequest.md)
 - [UpdatePromoOfferDTO](./Models/UpdatePromoOfferDTO.md)
 - [UpdatePromoOfferDiscountParamsDTO](./Models/UpdatePromoOfferDiscountParamsDTO.md)
 - [UpdatePromoOfferParamsDTO](./Models/UpdatePromoOfferParamsDTO.md)
 - [UpdatePromoOffersRequest](./Models/UpdatePromoOffersRequest.md)
 - [UpdatePromoOffersResponse](./Models/UpdatePromoOffersResponse.md)
 - [UpdatePromoOffersResultDTO](./Models/UpdatePromoOffersResultDTO.md)
 - [UpdateStockDTO](./Models/UpdateStockDTO.md)
 - [UpdateStockItemDTO](./Models/UpdateStockItemDTO.md)
 - [UpdateStocksRequest](./Models/UpdateStocksRequest.md)
 - [UpdateTimeDTO](./Models/UpdateTimeDTO.md)
 - [ValueRestrictionDTO](./Models/ValueRestrictionDTO.md)
 - [VerifyOrderEacRequest](./Models/VerifyOrderEacRequest.md)
 - [VerifyOrderEacResponse](./Models/VerifyOrderEacResponse.md)
 - [WarehouseAddressDTO](./Models/WarehouseAddressDTO.md)
 - [WarehouseDTO](./Models/WarehouseDTO.md)
 - [WarehouseGroupDTO](./Models/WarehouseGroupDTO.md)
 - [WarehouseOfferDTO](./Models/WarehouseOfferDTO.md)
 - [WarehouseOffersDTO](./Models/WarehouseOffersDTO.md)
 - [WarehouseStockDTO](./Models/WarehouseStockDTO.md)
 - [WarehouseStockType](./Models/WarehouseStockType.md)
 - [WarehousesDTO](./Models/WarehousesDTO.md)
 - [WarningPromoOfferUpdateDTO](./Models/WarningPromoOfferUpdateDTO.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="OAuth"></a>
### OAuth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://oauth.yandex.ru/authorize
- **Scopes**: 
  - market:partner-api: API Яндекс.Маркета / Поиска по товарам для партнеров

