# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Партнерский API Маркета LATEST Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://api.partner.market.yandex.ruhttps://api.partner.market.yandex.ru

### BidsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getBidsInfoForBusiness* | *POST* /businesses/{businessId}/bids/info | Информация об установленных ставках.|
|*getBidsRecommendations* | *POST* /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров.|
|*putBidsForBusiness* | *PUT* /businesses/{businessId}/bids | Включение буста продаж и установка ставок.|
|*putBidsForCampaign* | *PUT* /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина.|

### BusinessOfferMappingsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addOffersToArchive* | *POST* /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив.|
|*deleteOffers* | *POST* /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога.|
|*deleteOffersFromArchive* | *POST* /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива.|
|*getOfferMappings* | *POST* /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге.|
|*getSuggestedOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам.|
|*updateOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них.|

### BusinessesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getBusinessSettings* | *POST* /businesses/{businessId}/settings | Настройки кабинета.|

### CampaignsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getCampaign* | *GET* /campaigns/{campaignId} | Информация о магазине.|
|*getCampaignLogins* | *GET* /campaigns/{campaignId}/logins | Логины, связанные с магазином.|
|*getCampaignRegion* | *GET* /campaigns/{campaignId}/region | Регион магазина.|
|*getCampaignSettings* | *GET* /campaigns/{campaignId}/settings | Настройки магазина.|
|*getCampaigns* | *GET* /campaigns | Список магазинов пользователя.|
|*getCampaignsByLogin* | *GET* /campaigns/by_login/{login} | Магазины, доступные логину.|

### CategoriesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getCategoriesMaxSaleQuantum* | *POST* /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе.|
|*getCategoriesTree* | *POST* /categories/tree | Дерево категорий.|

### ChatsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createChat* | *POST* /businesses/{businessId}/chats/new | Создание нового чата с покупателем.|
|*getChatHistory* | *POST* /businesses/{businessId}/chats/history | Получение истории сообщений в чате.|
|*getChats* | *POST* /businesses/{businessId}/chats | Получение доступных чатов.|
|*sendFileToChat* | *POST* /businesses/{businessId}/chats/file/send | Отправка файла в чат.|
|*sendMessageToChat* | *POST* /businesses/{businessId}/chats/message | Отправка сообщения в чат.|

### ContentApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getCategoryContentParameters* | *POST* /category/{categoryId}/parameters | Списки характеристик товаров по категориям.|
|*getOfferCardsContentStatus* | *POST* /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина.|
|*updateOfferContent* | *POST* /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара.|

### DbsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*acceptOrderCancellation* | *PUT* /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем.|
|*addHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия.|
|*addOffersToArchive* | *POST* /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив.|
|*calculateTariffs* | *POST* /tariffs/calculate | Калькулятор стоимости услуг.|
|*confirmBusinessPrices* | *POST* /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете.|
|*confirmCampaignPrices* | *POST* /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине.|
|*createChat* | *POST* /businesses/{businessId}/chats/new | Создание нового чата с покупателем.|
|*createOutlet* | *POST* /campaigns/{campaignId}/outlets | Создание точки продаж.|
|*deleteCampaignOffers* | *POST* /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина.|
|*deleteGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву.|
|*deleteHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров.|
|*deleteOffers* | *POST* /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога.|
|*deleteOffersFromArchive* | *POST* /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива.|
|*deleteOutlet* | *DELETE* /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж.|
|*deleteOutletLicenses* | *DELETE* /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж.|
|*deletePromoOffers* | *POST* /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции.|
|*generateBoostConsolidatedReport* | *POST* /reports/boost-consolidated/generate | Отчет по бусту продаж.|
|*generateCompetitorsPositionReport* | *POST* /reports/competitors-position/generate | Отчет «Конкурентная позиция».|
|*generateGoodsFeedbackReport* | *POST* /reports/goods-feedback/generate | Отчет по отзывам о товарах.|
|*generateMassOrderLabelsReport* | *POST* /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах.|
|*generateOrderLabel* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе.|
|*generateOrderLabels* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе.|
|*generatePricesReport* | *POST* /reports/prices/generate | Отчет «Цены на рынке».|
|*generateShelfsStatisticsReport* | *POST* /reports/shelf-statistics/generate | Отчет по полкам.|
|*generateShowsSalesReport* | *POST* /reports/shows-sales/generate | Отчет «Аналитика продаж».|
|*generateStocksOnWarehousesReport* | *POST* /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах.|
|*generateUnitedMarketplaceServicesReport* | *POST* /reports/united-marketplace-services/generate | Отчет по стоимости услуг.|
|*generateUnitedNettingReport* | *POST* /reports/united-netting/generate | Отчет по платежам.|
|*generateUnitedOrdersReport* | *POST* /reports/united-orders/generate | Отчет по заказам.|
|*getAllOffers* | *GET* /campaigns/{campaignId}/offers/all | Все предложения магазина.|
|*getBidsInfoForBusiness* | *POST* /businesses/{businessId}/bids/info | Информация об установленных ставках.|
|*getBidsRecommendations* | *POST* /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров.|
|*getBusinessQuarantineOffers* | *POST* /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете.|
|*getBusinessSettings* | *POST* /businesses/{businessId}/settings | Настройки кабинета.|
|*getCampaign* | *GET* /campaigns/{campaignId} | Информация о магазине.|
|*getCampaignLogins* | *GET* /campaigns/{campaignId}/logins | Логины, связанные с магазином.|
|*getCampaignOffers* | *POST* /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине.|
|*getCampaignQuarantineOffers* | *POST* /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине.|
|*getCampaignRegion* | *GET* /campaigns/{campaignId}/region | Регион магазина.|
|*getCampaignSettings* | *GET* /campaigns/{campaignId}/settings | Настройки магазина.|
|*getCampaigns* | *GET* /campaigns | Список магазинов пользователя.|
|*getCampaignsByLogin* | *GET* /campaigns/by_login/{login} | Магазины, доступные логину.|
|*getCategoriesMaxSaleQuantum* | *POST* /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе.|
|*getCategoriesTree* | *POST* /categories/tree | Дерево категорий.|
|*getCategoryContentParameters* | *POST* /category/{categoryId}/parameters | Списки характеристик товаров по категориям.|
|*getChatHistory* | *POST* /businesses/{businessId}/chats/history | Получение истории сообщений в чате.|
|*getChats* | *POST* /businesses/{businessId}/chats | Получение доступных чатов.|
|*getDeliveryServices* | *GET* /delivery/services | Справочник служб доставки.|
|*getFeed* | *GET* /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе.|
|*getFeedIndexLogs* | *GET* /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа.|
|*getFeedbackAndCommentUpdates* | *GET* /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине.|
|*getFeeds* | *GET* /campaigns/{campaignId}/feeds | Список прайс-листов магазина.|
|*getGoodsFeedbackComments* | *POST* /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву.|
|*getGoodsFeedbacks* | *POST* /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца.|
|*getGoodsStats* | *POST* /campaigns/{campaignId}/stats/skus | Отчет по товарам.|
|*getHiddenOffers* | *GET* /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах.|
|*getModel* | *GET* /models/{modelId} | Информация об одной модели.|
|*getModelOffers* | *GET* /models/{modelId}/offers | Список предложений для одной модели.|
|*getModels* | *POST* /models | Информация о нескольких моделях.|
|*getModelsOffers* | *POST* /models/offers | Список предложений для нескольких моделей.|
|*getOfferCardsContentStatus* | *POST* /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина.|
|*getOfferMappingEntries* | *GET* /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге.|
|*getOfferMappings* | *POST* /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге.|
|*getOfferRecommendations* | *POST* /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен.|
|*getOffers* | *GET* /campaigns/{campaignId}/offers | Предложения магазина.|
|*getOrder* | *GET* /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе.|
|*getOrderBusinessBuyerInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице.|
|*getOrderBusinessDocumentsInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах.|
|*getOrderBuyerInfo* | *GET* /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице.|
|*getOrderLabelsData* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков.|
|*getOrders* | *GET* /campaigns/{campaignId}/orders | Информация о нескольких заказах.|
|*getOrdersStats* | *POST* /campaigns/{campaignId}/stats/orders | Детальная информация по заказам.|
|*getOutlet* | *GET* /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж.|
|*getOutletLicenses* | *GET* /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж.|
|*getOutlets* | *GET* /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж.|
|*getPrices* | *GET* /campaigns/{campaignId}/offer-prices | Список цен.|
|*getPricesByOfferIds* | *POST* /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине.|
|*getPromoOffers* | *POST* /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*getPromos* | *POST* /businesses/{businessId}/promos | Получение списка акций.|
|*getQualityRatingDetails* | *POST* /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества.|
|*getQualityRatings* | *POST* /businesses/{businessId}/ratings/quality | Индекс качества магазинов.|
|*getReportInfo* | *GET* /reports/info/{reportId} | Получение заданного отчета.|
|*getReturn* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате.|
|*getReturnApplication* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат.|
|*getReturnPhoto* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата.|
|*getReturns* | *GET* /campaigns/{campaignId}/returns | Список невыкупов и возвратов.|
|*getStocks* | *POST* /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости.|
|*getSuggestedOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров.|
|*getSuggestedOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам.|
|*getSuggestedPrices* | *POST* /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров.|
|*getWarehouses* | *GET* /businesses/{businessId}/warehouses | Список складов и групп складов.|
|*provideOrderDigitalCodes* | *POST* /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров.|
|*provideOrderItemIdentifiers* | *PUT* /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара.|
|*putBidsForBusiness* | *PUT* /businesses/{businessId}/bids | Включение буста продаж и установка ставок.|
|*putBidsForCampaign* | *PUT* /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина.|
|*refreshFeed* | *POST* /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился.|
|*searchModels* | *GET* /models | Поиск модели товара.|
|*searchRegionChildren* | *GET* /regions/{regionId}/children | Информация о дочерних регионах.|
|*searchRegionsById* | *GET* /regions/{regionId} | Информация о регионе.|
|*searchRegionsByName* | *GET* /regions | Поиск регионов по их имени.|
|*sendFileToChat* | *POST* /businesses/{businessId}/chats/file/send | Отправка файла в чат.|
|*sendMessageToChat* | *POST* /businesses/{businessId}/chats/message | Отправка сообщения в чат.|
|*setFeedParams* | *POST* /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа.|
|*setOrderBoxLayout* | *PUT* /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа.|
|*setOrderDeliveryDate* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа.|
|*setOrderDeliveryTrackCode* | *POST* /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки.|
|*setOrderShipmentBoxes* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе.|
|*setReturnDecision* | *POST* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату.|
|*skipGoodsFeedbacksReaction* | *POST* /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы.|
|*submitReturnDecision* | *POST* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату.|
|*updateBusinessPrices* | *POST* /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах.|
|*updateCampaignOffers* | *POST* /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине.|
|*updateGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария.|
|*updateOfferContent* | *POST* /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара.|
|*updateOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге.|
|*updateOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них.|
|*updateOrderItems* | *PUT* /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц.|
|*updateOrderStatus* | *PUT* /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа.|
|*updateOrderStatuses* | *POST* /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов.|
|*updateOrderStorageLimit* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа.|
|*updateOutlet* | *PUT* /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж.|
|*updateOutletLicenses* | *POST* /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж.|
|*updatePrices* | *POST* /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине.|
|*updatePromoOffers* | *POST* /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен.|
|*updateStocks* | *PUT* /campaigns/{campaignId}/offers/stocks | Передача информации об остатках.|

### DeliveryServicesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getDeliveryServices* | *GET* /delivery/services | Справочник служб доставки.|

### ExpressApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия.|
|*addOffersToArchive* | *POST* /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив.|
|*calculateTariffs* | *POST* /tariffs/calculate | Калькулятор стоимости услуг.|
|*confirmBusinessPrices* | *POST* /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете.|
|*confirmCampaignPrices* | *POST* /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине.|
|*createChat* | *POST* /businesses/{businessId}/chats/new | Создание нового чата с покупателем.|
|*deleteCampaignOffers* | *POST* /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина.|
|*deleteGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву.|
|*deleteHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров.|
|*deleteOffers* | *POST* /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога.|
|*deleteOffersFromArchive* | *POST* /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива.|
|*deletePromoOffers* | *POST* /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции.|
|*generateBoostConsolidatedReport* | *POST* /reports/boost-consolidated/generate | Отчет по бусту продаж.|
|*generateCompetitorsPositionReport* | *POST* /reports/competitors-position/generate | Отчет «Конкурентная позиция».|
|*generateGoodsFeedbackReport* | *POST* /reports/goods-feedback/generate | Отчет по отзывам о товарах.|
|*generateGoodsRealizationReport* | *POST* /reports/goods-realization/generate | Отчет по реализации.|
|*generateMassOrderLabelsReport* | *POST* /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах.|
|*generateOrderLabel* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе.|
|*generateOrderLabels* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе.|
|*generatePricesReport* | *POST* /reports/prices/generate | Отчет «Цены на рынке».|
|*generateShelfsStatisticsReport* | *POST* /reports/shelf-statistics/generate | Отчет по полкам.|
|*generateShowsSalesReport* | *POST* /reports/shows-sales/generate | Отчет «Аналитика продаж».|
|*generateStocksOnWarehousesReport* | *POST* /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах.|
|*generateUnitedMarketplaceServicesReport* | *POST* /reports/united-marketplace-services/generate | Отчет по стоимости услуг.|
|*generateUnitedNettingReport* | *POST* /reports/united-netting/generate | Отчет по платежам.|
|*generateUnitedOrdersReport* | *POST* /reports/united-orders/generate | Отчет по заказам.|
|*getAllOffers* | *GET* /campaigns/{campaignId}/offers/all | Все предложения магазина.|
|*getBidsInfoForBusiness* | *POST* /businesses/{businessId}/bids/info | Информация об установленных ставках.|
|*getBidsRecommendations* | *POST* /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров.|
|*getBusinessQuarantineOffers* | *POST* /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете.|
|*getBusinessSettings* | *POST* /businesses/{businessId}/settings | Настройки кабинета.|
|*getCampaign* | *GET* /campaigns/{campaignId} | Информация о магазине.|
|*getCampaignLogins* | *GET* /campaigns/{campaignId}/logins | Логины, связанные с магазином.|
|*getCampaignOffers* | *POST* /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине.|
|*getCampaignQuarantineOffers* | *POST* /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине.|
|*getCampaignRegion* | *GET* /campaigns/{campaignId}/region | Регион магазина.|
|*getCampaignSettings* | *GET* /campaigns/{campaignId}/settings | Настройки магазина.|
|*getCampaigns* | *GET* /campaigns | Список магазинов пользователя.|
|*getCampaignsByLogin* | *GET* /campaigns/by_login/{login} | Магазины, доступные логину.|
|*getCategoriesMaxSaleQuantum* | *POST* /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе.|
|*getCategoriesTree* | *POST* /categories/tree | Дерево категорий.|
|*getCategoryContentParameters* | *POST* /category/{categoryId}/parameters | Списки характеристик товаров по категориям.|
|*getChatHistory* | *POST* /businesses/{businessId}/chats/history | Получение истории сообщений в чате.|
|*getChats* | *POST* /businesses/{businessId}/chats | Получение доступных чатов.|
|*getDeliveryServices* | *GET* /delivery/services | Справочник служб доставки.|
|*getFeed* | *GET* /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе.|
|*getFeedIndexLogs* | *GET* /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа.|
|*getFeedbackAndCommentUpdates* | *GET* /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине.|
|*getFeeds* | *GET* /campaigns/{campaignId}/feeds | Список прайс-листов магазина.|
|*getGoodsFeedbackComments* | *POST* /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву.|
|*getGoodsFeedbacks* | *POST* /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца.|
|*getGoodsStats* | *POST* /campaigns/{campaignId}/stats/skus | Отчет по товарам.|
|*getHiddenOffers* | *GET* /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах.|
|*getOfferCardsContentStatus* | *POST* /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина.|
|*getOfferMappingEntries* | *GET* /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге.|
|*getOfferMappings* | *POST* /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге.|
|*getOfferRecommendations* | *POST* /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен.|
|*getOffers* | *GET* /campaigns/{campaignId}/offers | Предложения магазина.|
|*getOrder* | *GET* /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе.|
|*getOrderBusinessBuyerInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице.|
|*getOrderBusinessDocumentsInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах.|
|*getOrderLabelsData* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков.|
|*getOrders* | *GET* /campaigns/{campaignId}/orders | Информация о нескольких заказах.|
|*getOrdersStats* | *POST* /campaigns/{campaignId}/stats/orders | Детальная информация по заказам.|
|*getPrices* | *GET* /campaigns/{campaignId}/offer-prices | Список цен.|
|*getPricesByOfferIds* | *POST* /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине.|
|*getPromoOffers* | *POST* /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*getPromos* | *POST* /businesses/{businessId}/promos | Получение списка акций.|
|*getQualityRatingDetails* | *POST* /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества.|
|*getQualityRatings* | *POST* /businesses/{businessId}/ratings/quality | Индекс качества магазинов.|
|*getReportInfo* | *GET* /reports/info/{reportId} | Получение заданного отчета.|
|*getReturn* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате.|
|*getReturnApplication* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат.|
|*getReturnPhoto* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата.|
|*getReturns* | *GET* /campaigns/{campaignId}/returns | Список невыкупов и возвратов.|
|*getStocks* | *POST* /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости.|
|*getSuggestedOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров.|
|*getSuggestedOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам.|
|*getSuggestedPrices* | *POST* /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров.|
|*getWarehouses* | *GET* /businesses/{businessId}/warehouses | Список складов и групп складов.|
|*provideOrderItemIdentifiers* | *PUT* /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара.|
|*putBidsForBusiness* | *PUT* /businesses/{businessId}/bids | Включение буста продаж и установка ставок.|
|*putBidsForCampaign* | *PUT* /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина.|
|*refreshFeed* | *POST* /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился.|
|*searchRegionChildren* | *GET* /regions/{regionId}/children | Информация о дочерних регионах.|
|*searchRegionsById* | *GET* /regions/{regionId} | Информация о регионе.|
|*searchRegionsByName* | *GET* /regions | Поиск регионов по их имени.|
|*sendFileToChat* | *POST* /businesses/{businessId}/chats/file/send | Отправка файла в чат.|
|*sendMessageToChat* | *POST* /businesses/{businessId}/chats/message | Отправка сообщения в чат.|
|*setFeedParams* | *POST* /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа.|
|*setOrderBoxLayout* | *PUT* /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа.|
|*setOrderShipmentBoxes* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе.|
|*skipGoodsFeedbacksReaction* | *POST* /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы.|
|*updateBusinessPrices* | *POST* /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах.|
|*updateCampaignOffers* | *POST* /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине.|
|*updateGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария.|
|*updateOfferContent* | *POST* /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара.|
|*updateOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге.|
|*updateOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них.|
|*updateOrderItems* | *PUT* /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц.|
|*updateOrderStatus* | *PUT* /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа.|
|*updateOrderStatuses* | *POST* /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов.|
|*updatePrices* | *POST* /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине.|
|*updatePromoOffers* | *POST* /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен.|
|*updateStocks* | *PUT* /campaigns/{campaignId}/offers/stocks | Передача информации об остатках.|
|*verifyOrderEac* | *PUT* /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения.|

### FbsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия.|
|*addOffersToArchive* | *POST* /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив.|
|*calculateTariffs* | *POST* /tariffs/calculate | Калькулятор стоимости услуг.|
|*confirmBusinessPrices* | *POST* /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете.|
|*confirmCampaignPrices* | *POST* /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине.|
|*confirmShipment* | *POST* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки.|
|*createChat* | *POST* /businesses/{businessId}/chats/new | Создание нового чата с покупателем.|
|*deleteCampaignOffers* | *POST* /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина.|
|*deleteGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву.|
|*deleteHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров.|
|*deleteOffers* | *POST* /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога.|
|*deleteOffersFromArchive* | *POST* /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива.|
|*deletePromoOffers* | *POST* /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции.|
|*downloadShipmentAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи.|
|*downloadShipmentDiscrepancyAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений.|
|*downloadShipmentInboundAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи.|
|*downloadShipmentPalletLabels* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS).|
|*downloadShipmentReceptionTransferAct* | *GET* /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее.|
|*downloadShipmentTransportationWaybill* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной.|
|*generateBoostConsolidatedReport* | *POST* /reports/boost-consolidated/generate | Отчет по бусту продаж.|
|*generateCompetitorsPositionReport* | *POST* /reports/competitors-position/generate | Отчет «Конкурентная позиция».|
|*generateGoodsFeedbackReport* | *POST* /reports/goods-feedback/generate | Отчет по отзывам о товарах.|
|*generateGoodsRealizationReport* | *POST* /reports/goods-realization/generate | Отчет по реализации.|
|*generateMassOrderLabelsReport* | *POST* /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах.|
|*generateOrderLabel* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе.|
|*generateOrderLabels* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе.|
|*generatePricesReport* | *POST* /reports/prices/generate | Отчет «Цены на рынке».|
|*generateShelfsStatisticsReport* | *POST* /reports/shelf-statistics/generate | Отчет по полкам.|
|*generateShipmentListDocumentReport* | *POST* /reports/documents/shipment-list/generate | Получение листа сборки.|
|*generateShowsSalesReport* | *POST* /reports/shows-sales/generate | Отчет «Аналитика продаж».|
|*generateStocksOnWarehousesReport* | *POST* /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах.|
|*generateUnitedMarketplaceServicesReport* | *POST* /reports/united-marketplace-services/generate | Отчет по стоимости услуг.|
|*generateUnitedNettingReport* | *POST* /reports/united-netting/generate | Отчет по платежам.|
|*generateUnitedOrdersReport* | *POST* /reports/united-orders/generate | Отчет по заказам.|
|*getAllOffers* | *GET* /campaigns/{campaignId}/offers/all | Все предложения магазина.|
|*getBidsInfoForBusiness* | *POST* /businesses/{businessId}/bids/info | Информация об установленных ставках.|
|*getBidsRecommendations* | *POST* /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров.|
|*getBusinessQuarantineOffers* | *POST* /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете.|
|*getBusinessSettings* | *POST* /businesses/{businessId}/settings | Настройки кабинета.|
|*getCampaign* | *GET* /campaigns/{campaignId} | Информация о магазине.|
|*getCampaignLogins* | *GET* /campaigns/{campaignId}/logins | Логины, связанные с магазином.|
|*getCampaignOffers* | *POST* /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине.|
|*getCampaignQuarantineOffers* | *POST* /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине.|
|*getCampaignRegion* | *GET* /campaigns/{campaignId}/region | Регион магазина.|
|*getCampaignSettings* | *GET* /campaigns/{campaignId}/settings | Настройки магазина.|
|*getCampaigns* | *GET* /campaigns | Список магазинов пользователя.|
|*getCampaignsByLogin* | *GET* /campaigns/by_login/{login} | Магазины, доступные логину.|
|*getCategoriesMaxSaleQuantum* | *POST* /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе.|
|*getCategoriesTree* | *POST* /categories/tree | Дерево категорий.|
|*getCategoryContentParameters* | *POST* /category/{categoryId}/parameters | Списки характеристик товаров по категориям.|
|*getChatHistory* | *POST* /businesses/{businessId}/chats/history | Получение истории сообщений в чате.|
|*getChats* | *POST* /businesses/{businessId}/chats | Получение доступных чатов.|
|*getDeliveryServices* | *GET* /delivery/services | Справочник служб доставки.|
|*getFeed* | *GET* /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе.|
|*getFeedIndexLogs* | *GET* /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа.|
|*getFeedbackAndCommentUpdates* | *GET* /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине.|
|*getFeeds* | *GET* /campaigns/{campaignId}/feeds | Список прайс-листов магазина.|
|*getGoodsFeedbackComments* | *POST* /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву.|
|*getGoodsFeedbacks* | *POST* /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца.|
|*getGoodsStats* | *POST* /campaigns/{campaignId}/stats/skus | Отчет по товарам.|
|*getHiddenOffers* | *GET* /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах.|
|*getOfferCardsContentStatus* | *POST* /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина.|
|*getOfferMappingEntries* | *GET* /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге.|
|*getOfferMappings* | *POST* /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге.|
|*getOfferRecommendations* | *POST* /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен.|
|*getOffers* | *GET* /campaigns/{campaignId}/offers | Предложения магазина.|
|*getOrder* | *GET* /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе.|
|*getOrderBusinessBuyerInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице.|
|*getOrderBusinessDocumentsInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах.|
|*getOrderLabelsData* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков.|
|*getOrders* | *GET* /campaigns/{campaignId}/orders | Информация о нескольких заказах.|
|*getOrdersStats* | *POST* /campaigns/{campaignId}/stats/orders | Детальная информация по заказам.|
|*getPrices* | *GET* /campaigns/{campaignId}/offer-prices | Список цен.|
|*getPricesByOfferIds* | *POST* /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине.|
|*getPromoOffers* | *POST* /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*getPromos* | *POST* /businesses/{businessId}/promos | Получение списка акций.|
|*getQualityRatingDetails* | *POST* /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества.|
|*getQualityRatings* | *POST* /businesses/{businessId}/ratings/quality | Индекс качества магазинов.|
|*getReportInfo* | *GET* /reports/info/{reportId} | Получение заданного отчета.|
|*getReturn* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате.|
|*getReturnApplication* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат.|
|*getReturnPhoto* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата.|
|*getReturns* | *GET* /campaigns/{campaignId}/returns | Список невыкупов и возвратов.|
|*getShipment* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке.|
|*getShipmentOrdersInfo* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS).|
|*getStocks* | *POST* /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости.|
|*getSuggestedOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров.|
|*getSuggestedOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам.|
|*getSuggestedPrices* | *POST* /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров.|
|*getWarehouses* | *GET* /businesses/{businessId}/warehouses | Список складов и групп складов.|
|*provideOrderItemIdentifiers* | *PUT* /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара.|
|*putBidsForBusiness* | *PUT* /businesses/{businessId}/bids | Включение буста продаж и установка ставок.|
|*putBidsForCampaign* | *PUT* /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина.|
|*refreshFeed* | *POST* /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился.|
|*searchRegionChildren* | *GET* /regions/{regionId}/children | Информация о дочерних регионах.|
|*searchRegionsById* | *GET* /regions/{regionId} | Информация о регионе.|
|*searchRegionsByName* | *GET* /regions | Поиск регионов по их имени.|
|*searchShipments* | *PUT* /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках.|
|*sendFileToChat* | *POST* /businesses/{businessId}/chats/file/send | Отправка файла в чат.|
|*sendMessageToChat* | *POST* /businesses/{businessId}/chats/message | Отправка сообщения в чат.|
|*setFeedParams* | *POST* /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа.|
|*setOrderBoxLayout* | *PUT* /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа.|
|*setOrderShipmentBoxes* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе.|
|*setShipmentPalletsCount* | *PUT* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке.|
|*skipGoodsFeedbacksReaction* | *POST* /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы.|
|*transferOrdersFromShipment* | *POST* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку.|
|*updateBusinessPrices* | *POST* /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах.|
|*updateCampaignOffers* | *POST* /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине.|
|*updateGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария.|
|*updateOfferContent* | *POST* /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара.|
|*updateOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге.|
|*updateOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них.|
|*updateOrderItems* | *PUT* /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц.|
|*updateOrderStatus* | *PUT* /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа.|
|*updateOrderStatuses* | *POST* /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов.|
|*updatePrices* | *POST* /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине.|
|*updatePromoOffers* | *POST* /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен.|
|*updateStocks* | *PUT* /campaigns/{campaignId}/offers/stocks | Передача информации об остатках.|

### FbyApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия.|
|*addOffersToArchive* | *POST* /businesses/{businessId}/offer-mappings/archive | Добавление товаров в архив.|
|*calculateTariffs* | *POST* /tariffs/calculate | Калькулятор стоимости услуг.|
|*confirmBusinessPrices* | *POST* /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете.|
|*confirmCampaignPrices* | *POST* /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине.|
|*createChat* | *POST* /businesses/{businessId}/chats/new | Создание нового чата с покупателем.|
|*deleteCampaignOffers* | *POST* /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина.|
|*deleteGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву.|
|*deleteHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров.|
|*deleteOffers* | *POST* /businesses/{businessId}/offer-mappings/delete | Удаление товаров из каталога.|
|*deleteOffersFromArchive* | *POST* /businesses/{businessId}/offer-mappings/unarchive | Удаление товаров из архива.|
|*deletePromoOffers* | *POST* /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции.|
|*generateBoostConsolidatedReport* | *POST* /reports/boost-consolidated/generate | Отчет по бусту продаж.|
|*generateCompetitorsPositionReport* | *POST* /reports/competitors-position/generate | Отчет «Конкурентная позиция».|
|*generateGoodsFeedbackReport* | *POST* /reports/goods-feedback/generate | Отчет по отзывам о товарах.|
|*generateGoodsMovementReport* | *POST* /reports/goods-movement/generate | Отчет по движению товаров.|
|*generateGoodsRealizationReport* | *POST* /reports/goods-realization/generate | Отчет по реализации.|
|*generateGoodsTurnoverReport* | *POST* /reports/goods-turnover/generate | Отчет по оборачиваемости.|
|*generatePricesReport* | *POST* /reports/prices/generate | Отчет «Цены на рынке».|
|*generateShelfsStatisticsReport* | *POST* /reports/shelf-statistics/generate | Отчет по полкам.|
|*generateShowsSalesReport* | *POST* /reports/shows-sales/generate | Отчет «Аналитика продаж».|
|*generateStocksOnWarehousesReport* | *POST* /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах.|
|*generateUnitedMarketplaceServicesReport* | *POST* /reports/united-marketplace-services/generate | Отчет по стоимости услуг.|
|*generateUnitedNettingReport* | *POST* /reports/united-netting/generate | Отчет по платежам.|
|*generateUnitedOrdersReport* | *POST* /reports/united-orders/generate | Отчет по заказам.|
|*getAllOffers* | *GET* /campaigns/{campaignId}/offers/all | Все предложения магазина.|
|*getBidsInfoForBusiness* | *POST* /businesses/{businessId}/bids/info | Информация об установленных ставках.|
|*getBidsRecommendations* | *POST* /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров.|
|*getBusinessQuarantineOffers* | *POST* /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете.|
|*getBusinessSettings* | *POST* /businesses/{businessId}/settings | Настройки кабинета.|
|*getCampaign* | *GET* /campaigns/{campaignId} | Информация о магазине.|
|*getCampaignLogins* | *GET* /campaigns/{campaignId}/logins | Логины, связанные с магазином.|
|*getCampaignOffers* | *POST* /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине.|
|*getCampaignQuarantineOffers* | *POST* /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине.|
|*getCampaignRegion* | *GET* /campaigns/{campaignId}/region | Регион магазина.|
|*getCampaignSettings* | *GET* /campaigns/{campaignId}/settings | Настройки магазина.|
|*getCampaigns* | *GET* /campaigns | Список магазинов пользователя.|
|*getCampaignsByLogin* | *GET* /campaigns/by_login/{login} | Магазины, доступные логину.|
|*getCategoriesMaxSaleQuantum* | *POST* /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе.|
|*getCategoriesTree* | *POST* /categories/tree | Дерево категорий.|
|*getCategoryContentParameters* | *POST* /category/{categoryId}/parameters | Списки характеристик товаров по категориям.|
|*getChatHistory* | *POST* /businesses/{businessId}/chats/history | Получение истории сообщений в чате.|
|*getChats* | *POST* /businesses/{businessId}/chats | Получение доступных чатов.|
|*getFeed* | *GET* /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе.|
|*getFeedIndexLogs* | *GET* /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа.|
|*getFeedbackAndCommentUpdates* | *GET* /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине.|
|*getFeeds* | *GET* /campaigns/{campaignId}/feeds | Список прайс-листов магазина.|
|*getFulfillmentWarehouses* | *GET* /warehouses | Идентификаторы складов Маркета (FBY).|
|*getGoodsFeedbackComments* | *POST* /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву.|
|*getGoodsFeedbacks* | *POST* /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца.|
|*getGoodsStats* | *POST* /campaigns/{campaignId}/stats/skus | Отчет по товарам.|
|*getHiddenOffers* | *GET* /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах.|
|*getOfferCardsContentStatus* | *POST* /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина.|
|*getOfferMappingEntries* | *GET* /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге.|
|*getOfferMappings* | *POST* /businesses/{businessId}/offer-mappings | Информация о товарах в каталоге.|
|*getOfferRecommendations* | *POST* /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен.|
|*getOffers* | *GET* /campaigns/{campaignId}/offers | Предложения магазина.|
|*getOrder* | *GET* /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе.|
|*getOrderBusinessBuyerInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице.|
|*getOrderBusinessDocumentsInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах.|
|*getOrders* | *GET* /campaigns/{campaignId}/orders | Информация о нескольких заказах.|
|*getOrdersStats* | *POST* /campaigns/{campaignId}/stats/orders | Детальная информация по заказам.|
|*getPrices* | *GET* /campaigns/{campaignId}/offer-prices | Список цен.|
|*getPricesByOfferIds* | *POST* /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине.|
|*getPromoOffers* | *POST* /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*getPromos* | *POST* /businesses/{businessId}/promos | Получение списка акций.|
|*getQualityRatings* | *POST* /businesses/{businessId}/ratings/quality | Индекс качества магазинов.|
|*getReportInfo* | *GET* /reports/info/{reportId} | Получение заданного отчета.|
|*getReturn* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате.|
|*getReturnPhoto* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата.|
|*getReturns* | *GET* /campaigns/{campaignId}/returns | Список невыкупов и возвратов.|
|*getStocks* | *POST* /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости.|
|*getSuggestedOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров.|
|*getSuggestedOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/suggestions | Просмотр карточек на Маркете, которые подходят вашим товарам.|
|*getSuggestedPrices* | *POST* /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров.|
|*putBidsForBusiness* | *PUT* /businesses/{businessId}/bids | Включение буста продаж и установка ставок.|
|*putBidsForCampaign* | *PUT* /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина.|
|*refreshFeed* | *POST* /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился.|
|*searchRegionChildren* | *GET* /regions/{regionId}/children | Информация о дочерних регионах.|
|*searchRegionsById* | *GET* /regions/{regionId} | Информация о регионе.|
|*searchRegionsByName* | *GET* /regions | Поиск регионов по их имени.|
|*sendFileToChat* | *POST* /businesses/{businessId}/chats/file/send | Отправка файла в чат.|
|*sendMessageToChat* | *POST* /businesses/{businessId}/chats/message | Отправка сообщения в чат.|
|*setFeedParams* | *POST* /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа.|
|*skipGoodsFeedbacksReaction* | *POST* /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы.|
|*updateBusinessPrices* | *POST* /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах.|
|*updateCampaignOffers* | *POST* /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине.|
|*updateGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария.|
|*updateOfferContent* | *POST* /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара.|
|*updateOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге.|
|*updateOfferMappings* | *POST* /businesses/{businessId}/offer-mappings/update | Добавление товаров в каталог и изменение информации о них.|
|*updatePrices* | *POST* /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине.|
|*updatePromoOffers* | *POST* /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен.|

### FeedbacksApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getFeedbackAndCommentUpdates* | *GET* /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине.|

### FeedsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getFeed* | *GET* /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе.|
|*getFeedIndexLogs* | *GET* /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа.|
|*getFeeds* | *GET* /campaigns/{campaignId}/feeds | Список прайс-листов магазина.|
|*refreshFeed* | *POST* /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился.|
|*setFeedParams* | *POST* /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа.|

### GoodsFeedbackApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву.|
|*getGoodsFeedbackComments* | *POST* /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву.|
|*getGoodsFeedbacks* | *POST* /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца.|
|*skipGoodsFeedbacksReaction* | *POST* /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы.|
|*updateGoodsFeedbackComment* | *POST* /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария.|

### GoodsStatsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getGoodsStats* | *POST* /campaigns/{campaignId}/stats/skus | Отчет по товарам.|

### HiddenOffersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*addHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия.|
|*deleteHiddenOffers* | *POST* /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров.|
|*getHiddenOffers* | *GET* /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах.|

### ModelsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getModel* | *GET* /models/{modelId} | Информация об одной модели.|
|*getModelOffers* | *GET* /models/{modelId}/offers | Список предложений для одной модели.|
|*getModels* | *POST* /models | Информация о нескольких моделях.|
|*getModelsOffers* | *POST* /models/offers | Список предложений для нескольких моделей.|
|*searchModels* | *GET* /models | Поиск модели товара.|

### OfferMappingsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getOfferMappingEntries* | *GET* /campaigns/{campaignId}/offer-mapping-entries | Список товаров в каталоге.|
|*getSuggestedOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/suggestions | Рекомендованные карточки для товаров.|
|*updateOfferMappingEntries* | *POST* /campaigns/{campaignId}/offer-mapping-entries/updates | Добавление и редактирование товаров в каталоге.|

### OffersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteCampaignOffers* | *POST* /campaigns/{campaignId}/offers/delete | Удаление товаров из ассортимента магазина.|
|*getAllOffers* | *GET* /campaigns/{campaignId}/offers/all | Все предложения магазина.|
|*getCampaignOffers* | *POST* /campaigns/{campaignId}/offers | Информация о товарах, которые размещены в заданном магазине.|
|*getOfferRecommendations* | *POST* /businesses/{businessId}/offers/recommendations | Рекомендации Маркета, касающиеся цен.|
|*getOffers* | *GET* /campaigns/{campaignId}/offers | Предложения магазина.|
|*updateCampaignOffers* | *POST* /campaigns/{campaignId}/offers/update | Изменение условий продажи товаров в магазине.|

### OrderBusinessInformationApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getOrderBusinessBuyerInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице.|
|*getOrderBusinessDocumentsInfo* | *POST* /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах.|

### OrderDeliveryApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getOrderBuyerInfo* | *GET* /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице.|
|*setOrderDeliveryDate* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа.|
|*setOrderDeliveryTrackCode* | *POST* /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки.|
|*updateOrderStorageLimit* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа.|
|*verifyOrderEac* | *PUT* /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения.|

### OrderLabelsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*generateOrderLabel* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе.|
|*generateOrderLabels* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе.|
|*getOrderLabelsData* | *GET* /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков.|

### OrdersApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*acceptOrderCancellation* | *PUT* /campaigns/{campaignId}/orders/{orderId}/cancellation/accept | Отмена заказа покупателем.|
|*getOrder* | *GET* /campaigns/{campaignId}/orders/{orderId} | Информация об одном заказе.|
|*getOrders* | *GET* /campaigns/{campaignId}/orders | Информация о нескольких заказах.|
|*provideOrderDigitalCodes* | *POST* /campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods | Передача ключей цифровых товаров.|
|*provideOrderItemIdentifiers* | *PUT* /campaigns/{campaignId}/orders/{orderId}/identifiers | Передача кодов маркировки единиц товара.|
|*setOrderBoxLayout* | *PUT* /campaigns/{campaignId}/orders/{orderId}/boxes | Подготовка заказа.|
|*setOrderShipmentBoxes* | *PUT* /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes | Передача количества грузовых мест в заказе.|
|*updateOrderItems* | *PUT* /campaigns/{campaignId}/orders/{orderId}/items | Удаление товара из заказа или уменьшение числа единиц.|
|*updateOrderStatus* | *PUT* /campaigns/{campaignId}/orders/{orderId}/status | Изменение статуса одного заказа.|
|*updateOrderStatuses* | *POST* /campaigns/{campaignId}/orders/status-update | Изменение статусов нескольких заказов.|

### OrdersStatsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getOrdersStats* | *POST* /campaigns/{campaignId}/stats/orders | Детальная информация по заказам.|

### OutletLicensesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deleteOutletLicenses* | *DELETE* /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж.|
|*getOutletLicenses* | *GET* /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж.|
|*updateOutletLicenses* | *POST* /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж.|

### OutletsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*createOutlet* | *POST* /campaigns/{campaignId}/outlets | Создание точки продаж.|
|*deleteOutlet* | *DELETE* /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж.|
|*getOutlet* | *GET* /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж.|
|*getOutlets* | *GET* /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж.|
|*updateOutlet* | *PUT* /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж.|

### PriceQuarantineApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*confirmBusinessPrices* | *POST* /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете.|
|*confirmCampaignPrices* | *POST* /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине.|
|*getBusinessQuarantineOffers* | *POST* /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете.|
|*getCampaignQuarantineOffers* | *POST* /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине.|

### PricesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getPrices* | *GET* /campaigns/{campaignId}/offer-prices | Список цен.|
|*getPricesByOfferIds* | *POST* /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине.|
|*getSuggestedPrices* | *POST* /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров.|
|*updateBusinessPrices* | *POST* /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах.|
|*updatePrices* | *POST* /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине.|

### PromosApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*deletePromoOffers* | *POST* /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции.|
|*getPromoOffers* | *POST* /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*getPromos* | *POST* /businesses/{businessId}/promos | Получение списка акций.|
|*updatePromoOffers* | *POST* /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен.|

### RatingsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getQualityRatingDetails* | *POST* /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества.|
|*getQualityRatings* | *POST* /businesses/{businessId}/ratings/quality | Индекс качества магазинов.|

### RegionsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*searchRegionChildren* | *GET* /regions/{regionId}/children | Информация о дочерних регионах.|
|*searchRegionsById* | *GET* /regions/{regionId} | Информация о регионе.|
|*searchRegionsByName* | *GET* /regions | Поиск регионов по их имени.|

### ReportsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*generateBoostConsolidatedReport* | *POST* /reports/boost-consolidated/generate | Отчет по бусту продаж.|
|*generateCompetitorsPositionReport* | *POST* /reports/competitors-position/generate | Отчет «Конкурентная позиция».|
|*generateGoodsFeedbackReport* | *POST* /reports/goods-feedback/generate | Отчет по отзывам о товарах.|
|*generateGoodsMovementReport* | *POST* /reports/goods-movement/generate | Отчет по движению товаров.|
|*generateGoodsRealizationReport* | *POST* /reports/goods-realization/generate | Отчет по реализации.|
|*generateGoodsTurnoverReport* | *POST* /reports/goods-turnover/generate | Отчет по оборачиваемости.|
|*generateMassOrderLabelsReport* | *POST* /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах.|
|*generatePricesReport* | *POST* /reports/prices/generate | Отчет «Цены на рынке».|
|*generateShelfsStatisticsReport* | *POST* /reports/shelf-statistics/generate | Отчет по полкам.|
|*generateShipmentListDocumentReport* | *POST* /reports/documents/shipment-list/generate | Получение листа сборки.|
|*generateShowsSalesReport* | *POST* /reports/shows-sales/generate | Отчет «Аналитика продаж».|
|*generateStocksOnWarehousesReport* | *POST* /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах.|
|*generateUnitedMarketplaceServicesReport* | *POST* /reports/united-marketplace-services/generate | Отчет по стоимости услуг.|
|*generateUnitedNettingReport* | *POST* /reports/united-netting/generate | Отчет по платежам.|
|*generateUnitedOrdersReport* | *POST* /reports/united-orders/generate | Отчет по заказам.|
|*getReportInfo* | *GET* /reports/info/{reportId} | Получение заданного отчета.|

### ReturnsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getReturn* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате.|
|*getReturnApplication* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат.|
|*getReturnPhoto* | *GET* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата.|
|*getReturns* | *GET* /campaigns/{campaignId}/returns | Список невыкупов и возвратов.|
|*setReturnDecision* | *POST* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату.|
|*submitReturnDecision* | *POST* /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату.|

### ShipmentsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*confirmShipment* | *POST* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки.|
|*downloadShipmentAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи.|
|*downloadShipmentDiscrepancyAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений.|
|*downloadShipmentInboundAct* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи.|
|*downloadShipmentPalletLabels* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS).|
|*downloadShipmentReceptionTransferAct* | *GET* /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее.|
|*downloadShipmentTransportationWaybill* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной.|
|*getShipment* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке.|
|*getShipmentOrdersInfo* | *GET* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS).|
|*searchShipments* | *PUT* /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках.|
|*setShipmentPalletsCount* | *PUT* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке.|
|*transferOrdersFromShipment* | *POST* /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку.|

### StocksApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getStocks* | *POST* /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости.|
|*updateStocks* | *PUT* /campaigns/{campaignId}/offers/stocks | Передача информации об остатках.|

### TariffsApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*calculateTariffs* | *POST* /tariffs/calculate | Калькулятор стоимости услуг.|

### WarehousesApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getFulfillmentWarehouses* | *GET* /warehouses | Идентификаторы складов Маркета (FBY).|
|*getWarehouses* | *GET* /businesses/{businessId}/warehouses | Список складов и групп складов.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*AcceptOrderCancellationRequest* | |
|*AddHiddenOffersRequest* | Запрос на скрытие оферов.|
|*AddOffersToArchiveDTO* | Товары, которые не удалось поместить в архив.|
|*AddOffersToArchiveErrorDTO* | Товар, который не удалось поместить в архив.|
|*AddOffersToArchiveErrorType* | Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. |
|*AddOffersToArchiveRequest* | Товары, которые нужно поместить в архив. |
|*AddOffersToArchiveResponse* | Результат архивации товаров.|
|*AffectedOrderQualityRatingComponentType* | Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов. |
|*AgeDTO* | Возраст в заданных единицах измерения.|
|*AgeUnitType* | Единицы измерения возраста:  * `YEAR` — год. * `MONTH` — месяц. |
|*ApiClientDataErrorResponse* | Ошибка в данных переданных от клиента.|
|*ApiErrorDTO* | Общий формат ошибки.|
|*ApiErrorResponse* | Стандартная обертка для ошибок сервера.|
|*ApiForbiddenErrorResponse* | Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.|
|*ApiLimitErrorResponse* | Превышено ограничение на доступ к ресурсу.|
|*ApiLockedErrorResponse* | Ресурс из запроса заблокирован от применения к нему указанного метода.|
|*ApiNotFoundErrorResponse* | Запрашиваемый ресурс не найден.|
|*ApiResponse* | Стандартная обертка для ответов сервера.|
|*ApiResponseStatusType* | Тип ответа.|
|*ApiServerErrorResponse* | Внутренняя ошибка сервера.|
|*ApiUnauthorizedErrorResponse* | В запросе не указаны авторизационные данные.|
|*BaseCampaignOfferDTO* | Информация о новой цене на товар.|
|*BaseOfferDTO* | Основные параметры товара.|
|*BasePriceDTO* | Цена на товар.|
|*BaseShipmentDTO* | Информация об отгрузке.|
|*BidRecommendationItemDTO* | Рекомендованная ставка и возможная доля показов.|
|*BriefOrderItemDTO* | Информация о маркированном товаре.|
|*BriefOrderItemInstanceDTO* | Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). |
|*BusinessDTO* | Информация о кабинете.|
|*BusinessSettingsDTO* | Настройки кабинета.|
|*CalculateTariffsOfferDTO* | Параметры товара, для которого нужно рассчитать стоимость услуг.|
|*CalculateTariffsOfferInfoDTO* | Стоимость услуг.|
|*CalculateTariffsParametersDTO* | Параметры для расчета стоимости услуг.|
|*CalculateTariffsRequest* | |
|*CalculateTariffsResponse* | |
|*CalculateTariffsResponseDTO* | Расчет стоимости услуг.|
|*CalculatedTariffDTO* | Информация об услугах Маркета.|
|*CalculatedTariffType* | Услуга Маркета:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). |
|*CampaignDTO* | Информация о магазине.|
|*CampaignQualityRatingDTO* | Информация об индексе качества магазина.|
|*CampaignSettingsDTO* | Настройки магазина.|
|*CampaignSettingsDeliveryDTO* | Информация о доставке в своем регионе магазина.|
|*CampaignSettingsLocalRegionDTO* | Информация о своем регионе магазина.|
|*CampaignSettingsScheduleDTO* | Расписание работы службы доставки в своем регионе.|
|*CampaignSettingsScheduleSourceType* | Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. |
|*CampaignSettingsTimePeriodDTO* | Период, за который рассчитывается итоговый список нерабочих дней службы доставки.|
|*CampaignsQualityRatingDTO* | Информация об индексе качества магазинов.|
|*CategoryContentParametersDTO* | Информация о параметрах категории.|
|*CategoryDTO* | Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. |
|*CategoryErrorDTO* | Текст ошибки.|
|*CategoryErrorType* | Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_IS_NOT_LEAF` — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. |
|*CategoryParameterDTO* | Характеристика товара.|
|*CategoryParameterUnitDTO* | Единицы измерения характеристики товара.|
|*ChangeOutletRequest* | |
|*ChannelType* | Каналы продвижения товаров:  * `PUSH` — пуш-уведомление из приложения Яндекс Маркет.  * `STRETCH_MAIN` — верхний баннер-растяжка на главной странице Яндекс Маркета.  * `MAIN_PAGE_CAROUSEL` — карусель акций на главной странице Яндекс Маркета.  * `PRODUCT_RETAIL_PAGE` — товар на странице ритейл-повода.  * `MAIN_PAGE_CAROUSEL_WEB` — карусель акций на главной странице веб версии Яндекс Маркета.  * `PRODUCT_SEPARATE_LANDING` — товар на лендинге акции.  * `SUPER_SHELF_CATEGORY` — полка в категориях.  * `CAROUSEL_RETAIL_PAGE` — карусель на лендинге ритейл-повода.  * `POPUP_APPLICATION` — всплывающее окно в приложении Яндекс Маркет.  * `POST_TELEGRAM` — пост в Телеграм-канале Яндекс Маркета.  * `CPA` — реклама в партнерской сети Яндекс Маркета.  * `WEB_PERFORMANCE_DIRECT` — реклама в Яндекс Директе.  * `APP_PERFORMANCE` — реклама в AppStore и Google Play.  * `BANNER_PICKUP_POINT` — баннер в ПВЗ Маркета.  * `BLOGGER_PERFORMANCE` — рекламная интеграция у блогеров.  * `DIGITAL_CHANNEL_BANNER` — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * `YANDEX_ECOSYSTEM_CHANNELS` — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * `PARTNERS_MAIN_BANNER` — баннер на главной странице mail.ru, auto.ru, ya.ru.  * `OTHER` — прочее. |
|*ChatMessageDTO* | Информация о сообщениях.|
|*ChatMessagePayloadDTO* | Информация о приложенных к сообщению файлах.|
|*ChatMessageSenderType* | Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. |
|*ChatMessagesResultDTO* | Информация о сообщениях.|
|*ChatStatusType* | Статус чата:  * `NEW` — новый чат. * `WAITING_FOR_CUSTOMER` — нужен ответ покупателя. * `WAITING_FOR_PARTNER` — нужен ответ магазина. * `WAITING_FOR_ARBITER` — нужен ответ арбитра. * `WAITING_FOR_MARKET` — нужен ответ Маркета. * `FINISHED` — чат завершен. |
|*ChatType* | Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. |
|*ConfirmPricesRequest* | Запрос на подтверждение цены. |
|*ConfirmShipmentRequest* | Запрос для подтверждения отгрузки.|
|*CreateChatRequest* | Заказ, для которого нужно создать чат. |
|*CreateChatResponse* | Результат создания чата.|
|*CreateChatResultDTO* | Информация о созданном чате.|
|*CreateOutletResponse* | Ответ на запрос о создании точки продаж.|
|*CurrencyType* | Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. |
|*DayOfWeekType* | День недели:  * `MONDAY` — понедельник. * `TUESDAY` — вторник. * `WEDNESDAY` — среда. * `THURSDAY` — четверг. * `FRIDAY` — пятница. * `SATURDAY` — суббота. * `SUNDAY` — воскресенье. |
|*DeleteCampaignOffersDTO* | Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.|
|*DeleteCampaignOffersRequest* | Фильтрации удаляемых товаров по offerIds. |
|*DeleteCampaignOffersResponse* | Результат удаления товаров.|
|*DeleteGoodsFeedbackCommentRequest* | Фильтр запроса отзывов по бизнесу. |
|*DeleteHiddenOffersRequest* | Запрос на возобновление показа оферов.|
|*DeleteOffersDTO* | Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.|
|*DeleteOffersFromArchiveDTO* | Товары, которые не удалось восстановить из архива.|
|*DeleteOffersFromArchiveRequest* | Товары, которые нужно восстановить из архива. |
|*DeleteOffersFromArchiveResponse* | Результат разархивации товаров.|
|*DeleteOffersRequest* | Фильтрации удаляемых товаров по offerIds. |
|*DeleteOffersResponse* | Результат удаления товаров.|
|*DeletePromoOffersRequest* | Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. |
|*DeletePromoOffersResponse* | Результат удаления товаров из акции.|
|*DeletePromoOffersResultDTO* | Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. |
|*DeliveryServiceDTO* | Служба доставки.|
|*DeliveryServiceInfoDTO* | Информация о службе доставки.|
|*DeliveryServicesDTO* | Информация о службах доставки.|
|*DocumentDTO* | Информация о документе.|
|*EacVerificationResultDTO* | Результат выполнения запроса.|
|*EacVerificationStatusType* | Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. |
|*EmptyApiResponse* | Пустой ответ сервера.|
|*EnrichedMappingsOfferDTO* | Информация о рекомендованных карточках товаров.|
|*EnrichedModelDTO* | Модель товара.|
|*EnrichedModelsDTO* | Список моделей товаров.|
|*EnrichedOrderBoxLayoutDTO* | Информация о коробке.|
|*ExtensionShipmentDTO* | Информация об отгрузке.|
|*FeedContentDTO* | Информация о проверке содержимого прайс-листа, загруженного на Маркет.|
|*FeedContentErrorDTO* | Информация об ошибке в содержимом прайс-листа. Выводится, если параметр `content status=ERROR`. |
|*FeedContentErrorType* | Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. |
|*FeedDTO* | Информация о прайс-листе.|
|*FeedDownloadDTO* | Информация о последней загрузке прайс-листа.|
|*FeedDownloadErrorDTO* | Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. |
|*FeedDownloadErrorType* | Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`. |
|*FeedIndexLogsErrorDTO* | Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`). |
|*FeedIndexLogsErrorType* | Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. |
|*FeedIndexLogsFeedDTO* | Информация о прайс-листе.|
|*FeedIndexLogsIndexType* | Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. |
|*FeedIndexLogsOffersDTO* | Информация о предложениях прайс-листа.|
|*FeedIndexLogsRecordDTO* | Список отчетов по индексации прайс-листа.|
|*FeedIndexLogsResultDTO* | Результат выполнения запроса отчета по индексации прайс-листа.|
|*FeedIndexLogsStatusType* | Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. |
|*FeedParameterDTO* | Параметр прайс-листа.|
|*FeedPlacementDTO* | Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.|
|*FeedPublicationDTO* | Информация о последней публикации предложений из прайс-листа на Маркете.|
|*FeedPublicationFullDTO* | Информация о последней публикации предложений из прайс-листа на Маркете. |
|*FeedPublicationPriceAndStockUpdateDTO* | Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. |
|*FeedStatusType* | Статус прайс-листа.  Возможные значения:    * `ERROR` — найдены ошибки.   * `NA` — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * `OK` — ошибок не найдено. |
|*FeedbackAuthorDTO* | Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. |
|*FeedbackCommentAuthorDTO* | Информация об авторе комментария.|
|*FeedbackCommentAuthorType* | Тип автора:  * `USER` — пользователь. * `SHOP` — магазин. |
|*FeedbackCommentDTO* | Комментарий к отзыву на магазин.|
|*FeedbackDTO* | Отзыв пользователя Яндекс Маркета об указанном магазине.|
|*FeedbackDeliveryType* | Способ покупки, указанный в отзыве:  * `DELIVERY` — доставка. * `PICKUP` — самовывоз. * `INSTORE` — в магазине. |
|*FeedbackFactorDTO* | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. |
|*FeedbackGradesDTO* | Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.|
|*FeedbackListDTO* | Отзывы пользователей Яндекс Маркета об указанном магазине.|
|*FeedbackOrderDTO* | Информация о заказе, указанная в отзыве.|
|*FeedbackReactionStatusType* | Статус реакции на отзыв:  * `ALL` — все отзывы.  * `NEED_REACTION` — отзывы, на которые нужно ответить. |
|*FeedbackShopDTO* | Информация о магазине.|
|*FeedbackStateType* | Статус отзыва:  * `LAST` — актуален. * `PREVIOUS` — устарел. * `DELETED` — удален. |
|*FieldStateType* | Фильтр по заполненности или незаполненности поля:  * `SPECIFIED` — вывести товары, у которых поле заполнено. * `EMPTY` — вывести товары, у которых поле не заполнено. |
|*FlippingPagerDTO* | Модель для пагинации.|
|*ForwardScrollingPagerDTO* | Ссылка на следующую страницу. |
|*FulfillmentWarehouseDTO* | Склад Маркета (FBY).|
|*FulfillmentWarehousesDTO* | Список складов Маркета (FBY).|
|*FullOutletDTO* | Информация о точке продаж.|
|*FullOutletLicenseDTO* | Информация о лицензии.|
|*GenerateBoostConsolidatedRequest* | Данные, необходимые для генерации отчета. |
|*GenerateCompetitorsPositionReportRequest* | Данные, необходимые для генерации отчета.|
|*GenerateGoodsFeedbackRequest* | Данные, необходимые для генерации отчета. |
|*GenerateGoodsMovementReportRequest* | Данные, необходимые для генерации отчета.|
|*GenerateGoodsRealizationReportRequest* | Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. |
|*GenerateGoodsTurnoverRequest* | Данные, необходимые для генерации отчета. |
|*GenerateMassOrderLabelsRequest* | Данные, необходимые для генерации файла. |
|*GeneratePricesReportRequest* | Данные, необходимые для генерации отчета.|
|*GenerateReportDTO* | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.|
|*GenerateReportResponse* | Ответ на запрос генерации отчета.|
|*GenerateShelfsStatisticsRequest* | Данные, необходимые для генерации отчета. |
|*GenerateShipmentListDocumentReportRequest* | Данные, необходимые для генерации документа. |
|*GenerateShowsSalesReportRequest* | Данные, необходимые для генерации отчета.|
|*GenerateStocksOnWarehousesReportRequest* | Данные, необходимые для генерации отчета. |
|*GenerateUnitedMarketplaceServicesReportRequest* | Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. |
|*GenerateUnitedNettingReportRequest* | Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. |
|*GenerateUnitedOrdersRequest* | Данные, необходимые для генерации отчета. |
|*GetAllOffersResponse* | Список предложений.|
|*GetBidsInfoRequest* | description.|
|*GetBidsInfoResponse* | description.|
|*GetBidsInfoResponseDTO* | Список товаров с указанными ставками.|
|*GetBidsRecommendationsRequest* | description.|
|*GetBidsRecommendationsResponse* | description.|
|*GetBidsRecommendationsResponseDTO* | Список товаров с рекомендованными ставками.|
|*GetBusinessBuyerInfoResponse* | |
|*GetBusinessDocumentsInfoResponse* | |
|*GetBusinessSettingsInfoDTO* | Информация о кабинете и его настройках.|
|*GetBusinessSettingsResponse* | Ответ на запрос настроек кабинета.|
|*GetCampaignLoginsResponse* | Ответ на запрос списка логинов, связанных с магазином.|
|*GetCampaignOfferDTO* | Параметры размещения товара в магазине.|
|*GetCampaignOffersRequest* | Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. |
|*GetCampaignOffersResponse* | Ответ на запрос списка товаров в магазине.|
|*GetCampaignOffersResultDTO* | Список товаров в заданном магазине.|
|*GetCampaignRegionResponse* | Ответ на запрос региона магазина.|
|*GetCampaignResponse* | Информация о магазине к данным идентификатора кампании.|
|*GetCampaignSettingsResponse* | Ответ на запрос настроек магазина.|
|*GetCampaignsResponse* | Результаты поиска магазинов.|
|*GetCategoriesMaxSaleQuantumDTO* | Категории и лимит на установку кванта и минимального количества товаров.|
|*GetCategoriesMaxSaleQuantumRequest* | Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. |
|*GetCategoriesMaxSaleQuantumResponse* | |
|*GetCategoriesRequest* | Параметры запроса категорий. |
|*GetCategoriesResponse* | |
|*GetCategoryContentParametersResponse* | Ответ со списком характеристик для категории и их допустимыми значениями.|
|*GetChatHistoryRequest* | Историю какого чата нужно получить — и начиная с какого сообщения. |
|*GetChatHistoryResponse* | |
|*GetChatInfoDTO* | Информация о чатах.|
|*GetChatsInfoDTO* | Список чатов.|
|*GetChatsRequest* | Фильтры по чатам, которые нужно вернуть. |
|*GetChatsResponse* | |
|*GetDeliveryServicesResponse* | Ответ на запрос списка служб доставки.|
|*GetFeedIndexLogsResponse* | |
|*GetFeedResponse* | Ответ на запрос информации о прайс-листе.|
|*GetFeedbackListResponse* | |
|*GetFeedsResponse* | Ответ на запрос списка прайс-листов.|
|*GetFulfillmentWarehousesResponse* | |
|*GetGoodsFeedbackCommentsRequest* | Фильтр запроса комментариев отзыва. |
|*GetGoodsFeedbackCommentsResponse* | |
|*GetGoodsFeedbackRequest* | Фильтр запроса отзывов в кабинете. |
|*GetGoodsFeedbackResponse* | |
|*GetGoodsStatsRequest* | Запрос отчета по товарам.|
|*GetGoodsStatsResponse* | Ответ на запрос отчета по товарам.|
|*GetHiddenOffersResponse* | Ответ на запрос списка скрытий.|
|*GetHiddenOffersResultDTO* | Список скрытых вами товаров. |
|*GetMappingDTO* | Информация о товарах в каталоге. |
|*GetModelsOffersResponse* | Ответ на запрос списка предложений для моделей.|
|*GetModelsRequest* | Запрос информации о моделях.|
|*GetModelsResponse* | Ответ на запрос информации о моделях.|
|*GetOfferCardsContentStatusRequest* | |
|*GetOfferCardsContentStatusResponse* | Ответ со списком состояний товаров и пагинацией.|
|*GetOfferDTO* | Параметры товара.|
|*GetOfferMappingDTO* | Информация о товаре.|
|*GetOfferMappingEntriesResponse* | Ответ на запрос списка товаров в каталоге.|
|*GetOfferMappingsRequest* | |
|*GetOfferMappingsResponse* | |
|*GetOfferMappingsResultDTO* | Информация о товарах.|
|*GetOfferRecommendationsRequest* | |
|*GetOfferRecommendationsResponse* | |
|*GetOffersResponse* | Список предложений с пагинатором.|
|*GetOrderBuyerInfoResponse* | |
|*GetOrderLabelsDataResponse* | Ответ с информацией для печати ярлыков.|
|*GetOrderResponse* | |
|*GetOrdersResponse* | Модель для ответа API списка информации по заказам.|
|*GetOrdersStatsRequest* | Запрос информации по заказам.|
|*GetOrdersStatsResponse* | Ответ на запрос информации по заказам.|
|*GetOutletLicensesResponse* | |
|*GetOutletResponse* | Ответ на запрос информации о точке продаж.|
|*GetOutletsResponse* | Ответ на запрос информации о точках продаж.|
|*GetPriceDTO* | Цена с указанием времени последнего обновления.|
|*GetPriceWithDiscountDTO* | Цена с указанием скидки и времени последнего обновления.|
|*GetPriceWithVatDTO* | Цена с указанием ставки НДС и времени последнего обновления.|
|*GetPricesByOfferIdsRequest* | Запрос списка цен.|
|*GetPricesByOfferIdsResponse* | Ответ на запрос списка цен.|
|*GetPricesResponse* | Ответ на запрос списка цен.|
|*GetPromoAssortmentInfoDTO* | Информация о товарах в акции.|
|*GetPromoBestsellerInfoDTO* | Информация об акции «Бестселлеры Маркета».|
|*GetPromoConstraintsDTO* | Ограничения в акции.|
|*GetPromoDTO* | Информация об акции.|
|*GetPromoMechanicsInfoDTO* | Информация о типе акции.|
|*GetPromoOfferDTO* | Товар, который участвует или может участвовать в акции.|
|*GetPromoOffersRequest* | Получение списка товаров, которые участвуют или могут участвовать в акции.|
|*GetPromoOffersResponse* | |
|*GetPromoOffersResultDTO* | Список товаров, которые участвуют или могут участвовать в акции.|
|*GetPromoPromocodeInfoDTO* | Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. |
|*GetPromosRequest* | Фильтры для получения списка акций.|
|*GetPromosResponse* | |
|*GetPromosResultDTO* | Информация об акциях Маркета.|
|*GetQualityRatingDetailsResponse* | |
|*GetQualityRatingRequest* | Запрос информации по индексу качества.|
|*GetQualityRatingResponse* | Информация об индексе качества магазинов.|
|*GetQuarantineOffersRequest* | Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. |
|*GetQuarantineOffersResponse* | Ответ на запрос списка товаров в карантине.|
|*GetQuarantineOffersResultDTO* | Список товаров в карантине.|
|*GetRegionWithChildrenResponse* | |
|*GetRegionsResponse* | |
|*GetReportInfoResponse* | Ответ на запрос информации об отчете.|
|*GetReturnResponse* | |
|*GetReturnsResponse* | |
|*GetShipmentOrdersInfoResponse* | |
|*GetShipmentResponse* | |
|*GetSuggestedOfferMappingEntriesRequest* | Запрос рекомендованных карточек товара.|
|*GetSuggestedOfferMappingEntriesResponse* | Ответ со списком рекомендованных карточек товара.|
|*GetSuggestedOfferMappingsRequest* | |
|*GetSuggestedOfferMappingsResponse* | |
|*GetSuggestedOfferMappingsResultDTO* | Подобранные карточки на Маркете.|
|*GetWarehouseStocksDTO* | Список складов с информацией об остатках на каждом из них.|
|*GetWarehouseStocksRequest* | Фильтры для запроса остатков. |
|*GetWarehouseStocksResponse* | |
|*GetWarehousesResponse* | |
|*GoodsFeedbackCommentAuthorDTO* | Информация об авторе комментария.|
|*GoodsFeedbackCommentAuthorType* | Тип автора:  * `USER` — пользователь. * `BUSINESS` — кабинет. |
|*GoodsFeedbackCommentDTO* | Комментарий к отзыву.|
|*GoodsFeedbackCommentListDTO* | Комментарии к отзыву.|
|*GoodsFeedbackCommentStatusType* | Статус комментария:  * `PUBLISHED` — опубликован. * `UNMODERATED` — не проверен. * `BANNED` — заблокирован. * `DELETED` — удален. |
|*GoodsFeedbackDTO* | Отзыв о товаре.|
|*GoodsFeedbackDescriptionDTO* | Текстовая часть отзыва.|
|*GoodsFeedbackIdentifiersDTO* | Идентификаторы, которые связаны с отзывом.|
|*GoodsFeedbackListDTO* | Список отзывов о товарах. |
|*GoodsFeedbackMediaDTO* | Фото и видео.|
|*GoodsFeedbackStatisticsDTO* | Статистическая информация по отзыву.|
|*GoodsStatsDTO* | Отчет по товарам.|
|*GoodsStatsGoodsDTO* | Информация о товаре.|
|*GoodsStatsWarehouseDTO* | Информация о складе.|
|*GoodsStatsWeightDimensionsDTO* | Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. |
|*GpsDTO* | GPS-координаты широты и долготы. |
|*HiddenOfferDTO* | Информация о скрытии.|
|*LanguageType* | Язык:  * `RU` — русский.  * `EN` — английский. |
|*LicenseCheckStatusType* | Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. |
|*LicenseType* | Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. |
|*LogisticPickupPointDTO* | Описание пункта вывоза для возврата.|
|*LogisticPointType* | Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. |
|*MappingsOfferDTO* | Информация о товарах в каталоге.|
|*MappingsOfferInfoDTO* | Базовая информация о товарах в каталоге.|
|*MaxSaleQuantumDTO* | Лимит на установку кванта и минимального количества товаров по категориям. |
|*MechanicsType* | Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. |
|*ModelDTO* | Модель товара.|
|*ModelOfferDTO* | Информация о предложении.|
|*ModelPriceDTO* | Информация о ценах на модель товара.|
|*ModelsDTO* | Список моделей товаров.|
|*OfferAvailabilityStatusType* | Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`. |
|*OfferCampaignStatusDTO* | Статус товара в магазине.|
|*OfferCampaignStatusType* | Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) |
|*OfferCardDTO* | Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. |
|*OfferCardRecommendationDTO* | Рекомендация по заполнению карточки товара.|
|*OfferCardRecommendationType* | Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в `updateOfferMappings`:  * `RECOGNIZED_VENDOR` — напишите название производителя так, как его пишет сам производитель (параметр `vendor`). * `PICTURE_COUNT` — добавьте изображения (параметр `pictures`). * `FIRST_PICTURE_SIZE` — замените первое изображение более крупным (параметр `pictures`). * `TITLE_LENGTH` — измените название (параметр `name`). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * `DESCRIPTION_LENGTH` — добавьте описание рекомендуемого размера (параметр `description`). * `AVERAGE_PICTURE_SIZE` — замените все изображения на изображения высокого качества (параметр `pictures`). * `FIRST_VIDEO_LENGTH` — добавьте первое видео рекомендуемой длины (параметр `videos`). * `AVERAGE_VIDEO_SIZE` — замените все видео на видео высокого качества (параметр `videos`). * `VIDEO_COUNT` — добавьте больше видео (параметр `videos`).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию `MAIN`, нужно заполнить характеристики, имеющие `MAIN` в массиве `recommendationTypes`.  Рекомендации:  * `MAIN` — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * `ADDITIONAL` — заполните дополнительные характеристики товара. * `DISTINCTIVE` — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * `HAS_VIDEO`. * `FILTERABLE`. * `HAS_DESCRIPTION`. * `HAS_BARCODE`. |
|*OfferCardStatusType* | Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) |
|*OfferCardsContentStatusDTO* | Список товаров с информацией о состоянии карточек.|
|*OfferConditionDTO* | Состояние уцененного товара. |
|*OfferConditionQualityType* | Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. |
|*OfferConditionType* | Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. |
|*OfferContentDTO* | Товар с указанными характеристиками.|
|*OfferContentErrorDTO* | Текст ошибки.|
|*OfferContentErrorType* | Типы ошибок:  * `OFFER_NOT_FOUND` — такого товара нет в каталоге. * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). |
|*OfferDTO* | Предложение.|
|*OfferErrorDTO* | Сообщение об ошибке, связанной с размещением товара.|
|*OfferForRecommendationDTO* | Информация о состоянии цены на товар.|
|*OfferManualDTO* | Инструкция по использованию товара. |
|*OfferMappingDTO* | Информация о текущей карточке товара на Маркете.|
|*OfferMappingEntriesDTO* | Информация о товарах в каталоге.|
|*OfferMappingEntryDTO* | Список товаров. |
|*OfferMappingErrorDTO* | Текст ошибки.|
|*OfferMappingErrorType* | Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. |
|*OfferMappingInfoDTO* | Информация о карточке товара.|
|*OfferMappingKindType* | Вид маппинга.|
|*OfferMappingSuggestionsListDTO* | Список рекомендованных карточек товара.|
|*OfferParamDTO* | Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же `name`, но разными `value`.  {% cut \"Пример\" %}  ```json \"params\": [   {     \"name\": \"Цвет\",     \"value\": \"Зеленый\"   },   {     \"name\": \"Цвет\",     \"value\": \"Желтый\"   } ] ```  {% endcut %} |
|*OfferPriceByOfferIdsListResponseDTO* | Список цен.|
|*OfferPriceByOfferIdsResponseDTO* | Информация об установленной цене.|
|*OfferPriceDTO* | Товар с информацией о новой цене на него.|
|*OfferPriceListResponseDTO* | Список цен на товары.|
|*OfferPriceResponseDTO* | Информация об установленной цене на товар.|
|*OfferProcessingNoteDTO* | Причины, по которым товар не прошел модерацию.|
|*OfferProcessingNoteType* | Тип причины, по которой товар не прошел модерацию:  * `ASSORTMENT` — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр `offer-mapping-entry` запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * `CANCELLED` — товар отозван с модерации по вашей инициативе. * `CONFLICTING_INFORMATION` _(ранее ошибочно `CONFLICTING`)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре `payload`. * `DEPARTMENT_FROZEN` — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * `INCORRECT_INFORMATION` — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре `payload`. * `LEGAL_CONFLICT` — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * `NEED_CLASSIFICATION_INFORMATION` — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * `NEED_INFORMATION` — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * `NEED_PICTURES` — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * `NEED_VENDOR` — неверно указан производитель товара. * `NO_CATEGORY`, `NO_KNOWLEDGE` — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * `NO_PARAMETERS_IN_SHOP_TITLE` — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре `payload`. * `NO_SIZE_MEASURE` — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре `payload`. * `UNKNOWN` — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. |
|*OfferProcessingStateDTO* | Информация о статусе публикации товара на Маркете.|
|*OfferProcessingStatusType* | Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. |
|*OfferRecommendationDTO* | Информация о состоянии цен и рекомендации. |
|*OfferRecommendationInfoDTO* | Рекомендации, касающиеся цены на товар.|
|*OfferRecommendationsResultDTO* | Список товаров с рекомендациями.|
|*OfferSellingProgramDTO* | Информация о том, по каким моделям можно продавать товар, а по каким нельзя.|
|*OfferSellingProgramStatusType* | Информация о доступности или недоступности.  * `FINE` — доступно. * `REJECT` — недоступно. |
|*OfferType* | Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} |
|*OfferWeightDimensionsDTO* | Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) |
|*OffersDTO* | Найденные предложения магазина.|
|*OptionValuesLimitedDTO* | Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.|
|*OrderBoxLayoutDTO* | Информация о коробке.|
|*OrderBoxLayoutItemDTO* | Информация о товаре в коробке.|
|*OrderBoxLayoutPartialCountDTO* | Информация о части товара в коробке.|
|*OrderBoxesLayoutDTO* | Распределение товаров по коробкам.|
|*OrderBusinessBuyerDTO* | Информация о покупателе. |
|*OrderBusinessDocumentsDTO* | Информация о документах. |
|*OrderBuyerBasicInfoDTO* | Информация о покупателе с базовыми полями.|
|*OrderBuyerDTO* | Информация о покупателе.  Параметры `id`, `lastName`, `firstName` и `middleName` возвращаются, только если вы работаете по модели DBS. |
|*OrderBuyerInfoDTO* | Информация о покупателе и его номере телефона.|
|*OrderBuyerType* | Тип покупателя:  * `PERSON` — физическое лицо.  * `BUSINESS` — организация. |
|*OrderCancellationReasonType* | Варианты причин, по которым заказ не может быть отменен.  * `ORDER_DELIVERED` — заказ уже доставлен. * `ORDER_IN_DELIVERY` — заказ уже у курьера. |
|*OrderCourierDTO* | Информация о курьере.|
|*OrderDTO* | Заказ.|
|*OrderDeliveryAddressDTO* | Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). |
|*OrderDeliveryDTO* | Информация о доставке.|
|*OrderDeliveryDateDTO* | Информация о новой дате доставки заказа.|
|*OrderDeliveryDateReasonType* | Причина переноса доставки заказа. Возможные причины изменения даты:   - ```USER_MOVED_DELIVERY_DATES``` — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - ```PARTNER_MOVED_DELIVERY_DATES``` — магазин не может доставить заказ в срок. |
|*OrderDeliveryDatesDTO* | Диапазон дат доставки.|
|*OrderDeliveryDispatchType* | Способ отгрузки:  * `BUYER` — доставка покупателю.  * `MARKET_PARTNER_OUTLET` — доставка в пункт выдачи партнера.  * `MARKET_BRANDED_OUTLET` — доставка в пункт выдачи заказов Маркета.  * `SHOP_OUTLET` — доставка в пункт выдачи заказов магазина.  * `DROPOFF` — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * `UNKNOWN` — неизвестный тип. |
|*OrderDeliveryEacType* | Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. |
|*OrderDeliveryPartnerType* | Тип сотрудничества со службой доставки в рамках конкретного заказа:  * `SHOP` — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * `YANDEX_MARKET` — магазин работает со службой доставки через Маркет.  * `UNKNOWN` — неизвестный тип. |
|*OrderDeliveryType* | Способ доставки заказа:  * `DELIVERY` — курьерская доставка.  * `PICKUP` — самовывоз.  * `POST` — почта.  * `DIGITAL` — для цифровых товаров.  * `UNKNOWN` — неизвестный тип. |
|*OrderDigitalItemDTO* | Ключ цифрового товара.|
|*OrderDocumentStatusType* | Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. |
|*OrderItemDTO* | Список товаров в заказе.|
|*OrderItemDetailDTO* | Детали по товару в заказе.|
|*OrderItemInstanceDTO* | Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. |
|*OrderItemInstanceModificationDTO* | Позиция в корзине, требующая маркировки.|
|*OrderItemInstanceType* | Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. |
|*OrderItemModificationDTO* | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. |
|*OrderItemPromoDTO* | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.|
|*OrderItemStatusType* | Возвращенный или невыкупленный товар:  * `REJECTED` — невыкупленный.  * `RETURNED` — возвращенный. |
|*OrderItemSubsidyDTO* | Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. |
|*OrderItemSubsidyType* | Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.). |
|*OrderItemsModificationRequestReasonType* | Причина обновления состава заказа.|
|*OrderItemsModificationResultDTO* | Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. |
|*OrderLabelDTO* | Данные для печати ярлыка.|
|*OrderLiftType* | Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. |
|*OrderParcelBoxDTO* | Информация о грузоместе.|
|*OrderPaymentMethodType* | Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (`\"paymentType\": \"PREPAID\"`):    * `YANDEX` — банковской картой.    * `APPLE_PAY` — Apple Pay.    * `GOOGLE_PAY` — Google Pay.    * `CREDIT` — в кредит.    * `TINKOFF_CREDIT` — в кредит в Тинькофф Банке.    * `TINKOFF_INSTALLMENTS` — рассрочка в Тинькофф Банке.    * `EXTERNAL_CERTIFICATE` — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * `SBP` — через систему быстрых платежей.    * `B2B_ACCOUNT_PREPAYMENT` — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (`\"paymentType\": \"POSTPAID\"`):    * `CARD_ON_DELIVERY` — банковской картой.    * `BOUND_CARD_ON_DELIVERY` — привязанной картой при получении.    * `CASH_ON_DELIVERY` — наличными.    * `B2B_ACCOUNT_POSTPAYMENT` — заказ оплачивает организация после доставки.  * `UNKNOWN` — неизвестный тип.  Значение по умолчанию: `CASH_ON_DELIVERY`. |
|*OrderPaymentType* | Тип оплаты заказа:  * `PREPAID` — оплата при оформлении заказа.  * `POSTPAID` — оплата при получении заказа.  * `UNKNOWN` — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. |
|*OrderPromoType* | Тип скидки:  * `DIRECT_DISCOUNT` — прямая скидка, которую устанавливает продавец или Маркет.  * `BLUE_SET` — комплекты.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_COUPON` — скидка по промокоду Маркета.  * `MARKET_PROMOCODE` — скидка по промокоду магазина.  * `MARKET_BLUE` — скидка на Маркете.  * `YANDEX_PLUS` — бесплатная доставка с подпиской Яндекс Плюс.  * `YANDEX_EMPLOYEE` — бесплатная доставка по определенным адресам.  * `LIMITED_FREE_DELIVERY_PROMO` — бесплатная доставка по ограниченному предложению.  * `FREE_DELIVERY_THRESHOLD` — бесплатная доставка при достижении определенной суммы заказа.  * `MULTICART_DISCOUNT` — скидка за то, что оформлена мультикорзина.  * `FREE_DELIVERY_FOR_LDI` — бесплатная доставка за то, что один из товаров крупногабаритный.  * `FREE_DELIVERY_FOR_LSC` — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * `FREE_PICKUP` — бесплатная доставка в пункт выдачи заказов.  * `CHEAPEST_AS_GIFT` — самый дешевый товар в подарок.  * `CASHBACK` — кешбэк.  * `SUPPLIER_MULTICART_DISCOUNT` — скидка за доставку.  * `SPREAD_DISCOUNT_COUNT` — скидка за количество одинаковых товаров.  * `SPREAD_DISCOUNT_RECEIPT` — скидка от суммы чека.  * `ANNOUNCEMENT_PROMO` — информационная акция, скидка не применяется к товарам.  * `DISCOUNT_BY_PAYMENT_TYPE` — прямая скидка при оплате картой Плюса.  * `PERCENT_DISCOUNT` — прямая скидка в процентах.  * `DCO_EXTRA_DISCOUNT` — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * `EMPTY_PROMO` — скрытые промокоды.  * `BLOCKING_PROMO` — блокирующее промо.  * `UNKNOWN` — неизвестный тип.  Устаревшие типы:  * `GENERIC_BUNDLE`.  * `MARKET_DEAL`.  * `MARKET_PRIME`.  * `MARKET_COIN`.  * `BERU_PLUS`.  * `PRICE_DROP_AS_YOU_SHOP`.  * `SECRET_SALE`. |
|*OrderShipmentDTO* | Список посылок.  В параметре может указываться несколько посылок. |
|*OrderStateDTO* | Информация по заказу.|
|*OrderStatsStatusType* | Текущий статус заказа:  * `CANCELLED_BEFORE_PROCESSING` — заказ отменен до начала его обработки.  * `CANCELLED_IN_DELIVERY` — заказ отменен во время его доставки.  * `CANCELLED_IN_PROCESSING` — заказ отменен во время его обработки.  * `DELIVERY` — заказ передан службе доставки.  * `DELIVERED` — заказ доставлен.  * `PARTIALLY_DELIVERED` — заказ частично доставлен.  * `PARTIALLY_RETURNED` — заказ частично возвращен покупателем.  * `PENDING` — заказ ожидает подтверждения.  * `PICKUP` — заказ доставлен в пункт выдачи.  * `PROCESSING` — заказ в обработке.  * `RESERVED` — товар зарезервирован на складе.  * `RETURNED` — заказ полностью возвращен покупателем.  * `UNKNOWN` — неизвестный статус заказа.  * `UNPAID` — заказ от юридического лица ожидает оплаты.  * `LOST` — заказ утерян. |
|*OrderStatusChangeDTO* | Заказ.|
|*OrderStatusChangeDeliveryDTO* | Информация о доставке.|
|*OrderStatusChangeDeliveryDatesDTO* | Диапазон дат доставки.|
|*OrderStatusType* | Статус заказа:  * `CANCELLED` — отменен.  * `DELIVERED` — получен покупателем.  * `DELIVERY` — передан в службу доставки.  * `PICKUP` — доставлен в пункт самовывоза.  * `PROCESSING` — находится в обработке.  * `PENDING` — ожидает обработки со стороны продавца.  * `UNPAID` — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * `PLACING` — оформляется, подготовка к резервированию.  * `RESERVED` — зарезервирован, но недооформлен.  * `PARTIALLY_RETURNED` — возвращен частично.  * `RETURNED` — возвращен полностью.  * `UNKNOWN` — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. |
|*OrderSubsidyDTO* | Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. |
|*OrderSubsidyType* | Тип субсидии:  * `YANDEX_CASHBACK` — скидка по подписке Яндекс Плюс.  * `SUBSIDY` — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * `DELIVERY` — скидка за доставку (DBS). |
|*OrderSubstatusType* | Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  * Значения для заказа в статусе `PROCESSING`:      * `STARTED` — заказ подтвержден, его можно начать обрабатывать.      * `READY_TO_SHIP` — заказ собран и готов к отправке.  * Значения для заказа в статусе `CANCELLED`:      * `PROCESSING_EXPIRED` — значение более не используется.      * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.      * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * `SHOP_FAILED` — магазин не может выполнить заказ.      * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.      * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.      * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.      * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.      * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.      * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * `TECHNICAL_ERROR` — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. |
|*OrderTaxSystemType* | Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. |
|*OrderTrackDTO* | Информация о трек-номере посылки (DBS).|
|*OrderUpdateStatusType* | Изменился ли статус заказа:  * `OK` — статус изменен.  * `ERROR` — статус не изменен. В этом случае появится сообщение об ошибке в параметре `errorDetails`. |
|*OrderVatType* | Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. |
|*OrdersShipmentInfoDTO* | Годные/негодные ярлыки по заказам в отгрузке.|
|*OrdersStatsCommissionDTO* | Информация о стоимости услуг.|
|*OrdersStatsCommissionType* | Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров. |
|*OrdersStatsDTO* | Информация по заказам.|
|*OrdersStatsDeliveryRegionDTO* | Информация о регионе доставки.|
|*OrdersStatsDetailsDTO* | Информация об удалении товара из заказа.|
|*OrdersStatsItemDTO* | Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке `items` — только в списке `initialItems`.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке `items` (с уменьшенным количеством единиц `count`), и в списке `initialItems` (с первоначальным количеством единиц `initialCount`). |
|*OrdersStatsItemStatusType* | Статус товара:  * `REJECTED` — товар был добавлен в созданный заказ, но не был оплачен. * `RETURNED` — товар вернули. |
|*OrdersStatsOrderDTO* | Информация о заказе.|
|*OrdersStatsOrderPaymentType* | Тип оплаты заказа: - `CREDIT` — заказ оформлен в кредит. - `POSTPAID` — заказ оплачен после того, как был получен. - `PREPAID` — заказ оплачен до того, как был получен. |
|*OrdersStatsPaymentDTO* | Информация о денежных переводах по заказу.|
|*OrdersStatsPaymentOrderDTO* | Информация о платежном получении.|
|*OrdersStatsPaymentSourceType* | Способ денежного перевода: - `BUYER` — оплата или возврат деньгами. - `CASHBACK` — оплата или возврат баллами Плюса. - `MARKETPLACE` — оплата или возврат купонами. - `SPLIT` — оплата картой по частям (Сплит). |
|*OrdersStatsPaymentType* | Тип денежного перевода: - `PAYMENT` — оплата. - `REFUND` — возврат. |
|*OrdersStatsPriceDTO* | Цена или скидки на товар.|
|*OrdersStatsPriceType* | Тип скидки или цена на товар: - `BUYER` — цена на товар с учетом скидок, в том числе купонов. - `CASHBACK` — баллы Плюса. - `MARKETPLACE` — купоны. |
|*OrdersStatsStockType* | Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. |
|*OrdersStatsWarehouseDTO* | Информация о складе, на котором хранится товар.|
|*OutletAddressDTO* | Адрес точки продаж. |
|*OutletDTO* | Информация о точке продаж.|
|*OutletDeliveryRuleDTO* | Информация об условиях доставки для данной точки продаж.|
|*OutletLicenseDTO* | Информация о лицензии.|
|*OutletLicensesResponseDTO* | Ответ на запрос информации о лицензиях для точек продаж.|
|*OutletResponseDTO* | Результат выполнения запроса. Выводится, если `status=\"OK\"`. |
|*OutletStatusType* | Статус точки продаж.  Возможные значения:  * `AT_MODERATION` — проверяется. * `FAILED` — не прошла проверку и отклонена модератором. * `MODERATED` — проверена и одобрена. * `NONMODERATED` — новая точка, нуждается в проверке. |
|*OutletType* | Тип точки продаж.  Возможные значения:  * `DEPOT` — пункт выдачи заказов. * `MIXED` — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * `RETAIL` — розничная точка продаж (торговый зал). |
|*OutletVisibilityType* | Состояние точки продаж.  Возможные значения:  * `HIDDEN` — точка продаж выключена. * `VISIBLE` — точка продаж включена. |
|*OutletWorkingScheduleDTO* | Список режимов работы точки продаж. |
|*OutletWorkingScheduleItemDTO* | Расписание работы точки продаж.|
|*PageFormatType* | Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. |
|*PagedReturnsDTO* | Возвраты.|
|*PalletsCountDTO* | Количество палет в отгрузке.|
|*ParameterType* | Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. |
|*ParameterValueConstraintsDTO* | Ограничения на значения характеристик.|
|*ParameterValueDTO* | Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — `ENUM`. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле `multivalue` имеет значение `true`.  Для этого в `parameterValues` передавайте каждое значение отдельно — несколько объектов с параметрами `parameterId`, `valueId` и `value`. Параметр `parameterId` должен быть одинаковым. |
|*ParameterValueOptionDTO* | Значение характеристики.|
|*ParcelBoxDTO* | Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.|
|*ParcelBoxLabelDTO* | Информация о ярлыке для коробки.|
|*ParcelDTO* | Информация о грузовых местах в заказе.|
|*PartnerShipmentWarehouseDTO* | Данные о складе отправления.|
|*PaymentFrequencyType* | Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). |
|*PickupAddressDTO* | Адрес доставки.|
|*PlacementType* | Модель, по которой работает магазин:  * `FBS` — FBS или Экспресс. * `FBY` — FBY. * `DBS` — DBS. |
|*PriceCompetitivenessThresholdsDTO* | Максимальные значения цены, при которых она является привлекательной или умеренной.|
|*PriceCompetitivenessType* | Привлекательность цены:  * `OPTIMAL` — привлекательная. * `AVERAGE` — умеренная. * `LOW` — непривлекательная. |
|*PriceDTO* | Цена с указанием скидки, валюты и времени последнего обновления.|
|*PriceQuarantineVerdictDTO* | Причина попадания товара в карантин.|
|*PriceQuarantineVerdictParamNameType* | Имя параметра причины скрытия товара по цене.  * `CURRENT_PRICE` — цена, из-за которой товар попал в карантин. * `LAST_VALID_PRICE` — последняя цена до попадания в карантин (только для карантина типа `PRICE_CHANGE`). * `MIN_PRICE` — порог попадания в карантин (только для карантина типов `LOW_PRICE` и `LOW_PRICE_PROMO`). * `CURRENCY` — валюта. |
|*PriceQuarantineVerdictParameterDTO* | Параметр карантина.|
|*PriceQuarantineVerdictType* | Типы карантина:  * `PRICE_CHANGE` — новая цена слишком сильно отличается от прежней. В поле `params` будет  новая цена `CURRENT_PRICE` и последняя цена до попадания в карантин `LAST_VALID_PRICE`. * `LOW_PRICE` — установленная цена слишком сильно отличается от рыночной. В поле `params` будет установленная вами цена `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. * `LOW_PRICE_PROMO` — цена после применения акций слишком сильно отличается от рыночной. В поле `params` будет цена после применения акций `CURRENT_PRICE` и порог попадания в карантин `MIN_PRICE`. |
|*PriceRecommendationItemDTO* | Рекомендованная цена.|
|*PriceSuggestDTO* | Тип цены.|
|*PriceSuggestOfferDTO* | Товар с ценами для продвижения.|
|*PriceSuggestType* | Тип цены:  * `BUYBOX` — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре `price` указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * `DEFAULT_OFFER` — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * `MIN_PRICE_MARKET` — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. |
|*PromoOfferAutoParticipatingDetailsDTO* | Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). |
|*PromoOfferDiscountParamsDTO* | Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.|
|*PromoOfferParamsDTO* | Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. |
|*PromoOfferParticipationStatusFilterType* | Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). |
|*PromoOfferParticipationStatusType* | Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). |
|*PromoOfferPromocodeParamsDTO* | Параметры товара в акции с типом `MARKET_PROMOCODE`.|
|*PromoOfferUpdateWarningCodeType* | Предупреждение, которое появилось при добавлении товара:  * `DEEP_DISCOUNT_OFFER` — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * `CATALOG_PRICE_IS_LOWER_THAN_PROMO` — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * `SHOP_PRICES_ARE_LOWER_THAN_PROMO` — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * `PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE` — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * `SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар в отдельном магазине не подходит под условия акции. |
|*PromoOfferUpdateWarningDTO* | Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.|
|*PromoParticipationType* | Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. |
|*PromoPeriodDTO* | Время проведения акции.|
|*ProvideOrderDigitalCodesRequest* | Запрос на передачу ключей цифровых товаров.|
|*ProvideOrderItemIdentifiersRequest* | |
|*ProvideOrderItemIdentifiersResponse* | |
|*PutSkuBidsRequest* | description.|
|*QualityRatingAffectedOrderDTO* | Информация о заказе, который повлиял на индекс качества.|
|*QualityRatingComponentDTO* | Составляющая индекса качества.|
|*QualityRatingComponentType* | Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. |
|*QualityRatingDTO* | Информация об индексе качества.|
|*QualityRatingDetailsDTO* | Информация о заказах, которые повлияли на индекс качества.|
|*QuantumDTO* | Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр `quantum`.  {% cut \"Пример\" %}  ```json {   \"offers\": [     {       \"offerId\": \"08e35dc1-89a2-11e3-8055-0015e9b8c48d\",       \"quantum\": {}     }   ] } ```  {% endcut %} |
|*QuarantineOfferDTO* | Товар в карантине.|
|*RecipientType* | Способ возврата товара покупателем:  * `SHOP` — в точку возврата магазина.  * `DELIVERY_SERVICE` — отправить курьером.  * `POST` — почта. |
|*RefundStatusType* | Cтатус возврата денег:  * `STARTED_BY_USER` — создан клиентом из личного кабинета.  * `REFUND_IN_PROGRESS` — ждет решение о возврате денег.  * `REFUNDED` — по возврату проведены все возвратные денежные транзакции.  * `FAILED` — невозможно провести возврат покупателю.  * `WAITING_FOR_DECISION` — ожидает решения.  * `DECISION_MADE` — по возврату принято решение.  * `REFUNDED_WITH_BONUSES` — возврат осуществлен баллами Плюса или промокодом.  * `REFUNDED_BY_SHOP` — магазин сделал самостоятельно возврат денег.  * `COMPLETE_WITHOUT_REFUND` — возврат денег не требуется.  * `CANCELLED` — возврат отменен. |
|*RegionDTO* | Регион доставки.|
|*RegionType* | Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. |
|*RegionalModelInfoDTO* | Региональная информация.|
|*RejectedPromoOfferDeleteDTO* | Информация о товаре и ошибки, которые появились при его удалении.|
|*RejectedPromoOfferDeleteReasonType* | Описание ошибки:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU. |
|*RejectedPromoOfferUpdateDTO* | Описание отклоненного изменения.|
|*RejectedPromoOfferUpdateReasonType* | Причина отклонения изменения:  * `OFFER_DOES_NOT_EXIST` — в кабинете нет товара с таким SKU.  * `OFFER_DUPLICATION` — один и тот же товар передан несколько раз.  * `OFFER_NOT_ELIGIBLE_FOR_PROMO` — товар не подходит под условия акции.  * `OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED` — товар не добавлен в акцию по техническим причинам.  * `DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED` — истек срок добавления товаров в акцию.  * `EMPTY_OLD_PRICE` — не указана зачеркнутая цена.  * `EMPTY_PROMO_PRICE` — не указана цена по акции.  * `MAX_PROMO_PRICE_EXCEEDED` — цена по акции превышает максимально возможную цену для участия в акции.  * `PROMO_PRICE_BIGGER_THAN_MAX` — цена по акции больше 95% от зачеркнутой цены.  * `PROMO_PRICE_SMALLER_THAN_MIN` — цена по акции меньше 1% от зачеркнутой цены. |
|*ReportFormatType* | Формат отчета:  * `FILE` — файл с электронной таблицей. * `CSV` — ZIP-архив с CSV-файлами на каждый лист отчета. |
|*ReportInfoDTO* | Статус генерации и ссылка на готовый отчет.|
|*ReportStatusType* | Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. |
|*ReportSubStatusType* | Подстатус генерации отчета: * `NO_DATA` — для такого отчета нет данных. * `TOO_LARGE` — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * `RESOURCE_NOT_FOUND` — для такого отчета не удалось найти часть сущностей. |
|*ReturnDTO* | Возврат заказа.|
|*ReturnDecisionDTO* | Решения по возвратам.|
|*ReturnDecisionReasonType* | Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. |
|*ReturnDecisionSubreasonType* | Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. |
|*ReturnDecisionType* | Решение по возврату:  * `REFUND_MONEY` — вернуть деньги покупателю.  * `REFUND_MONEY_INCLUDING_SHIPMENT` — вернуть деньги за товар и пересылку.  * `REPAIR` — отремонтировать товар.  * `REPLACE` — заменить товар.  * `SEND_TO_EXAMINATION` — взять товар на экспертизу.  * `DECLINE_REFUND` — отказать в возврате.  * `OTHER_DECISION` — другое решение. |
|*ReturnInstanceDTO* | Логистическая информация по возврату.|
|*ReturnInstanceStatusType* | Логистический статус конкретного товара.|
|*ReturnInstanceStockType* | Тип остатка на складе.|
|*ReturnItemDTO* | Список товаров в возврате.|
|*ReturnRequestDecisionType* | Решение по возврату.|
|*ReturnShipmentStatusType* | Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. |
|*ReturnType* | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. |
|*ScrollingPagerDTO* | Информация о страницах результатов.|
|*SearchModelsResponse* | |
|*SearchShipmentsRequest* | Запрос информации об отгрузках.|
|*SearchShipmentsResponse* | Ответ на запрос информации об отгрузках.|
|*SearchShipmentsResponseDTO* | Информация об отгрузках.|
|*SellingProgramType* | Модель размещения:  * `FBY` — FBY. * `FBS` — FBS. * `DBS` — DBS. * `EXPRESS` — Экспресс. |
|*SendMessageToChatRequest* | В какой чат нужно отправить сообщение и текст сообщения.|
|*SetFeedParamsRequest* | Запрос на обновление изменение параметров прайс-листа.|
|*SetOrderBoxLayoutRequest* | |
|*SetOrderBoxLayoutResponse* | |
|*SetOrderDeliveryDateRequest* | |
|*SetOrderDeliveryTrackCodeRequest* | |
|*SetOrderShipmentBoxesRequest* | |
|*SetOrderShipmentBoxesResponse* | |
|*SetReturnDecisionRequest* | Решения по позиции в возврате.|
|*SetShipmentPalletsCountRequest* | Запрос на передачу количества упаковок в отгрузке.|
|*ShelfsStatisticsAttributionType* | Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). |
|*ShipmentActionType* | Действия с отгрузкой:  * `CONFIRM` — подтвердить отгрузку. * `DOWNLOAD_ACT` — скачать акт приема-передачи отгрузки. * `DOWNLOAD_INBOUND_ACT` — скачать список принятых заказов. * `DOWNLOAD_DISCREPANCY_ACT` — скачать акт расхождений. * `CHANGE_PALLETS_COUNT` — указать количество палет. |
|*ShipmentBoxesDTO* | В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. |
|*ShipmentDTO* | Информация об отгрузке.|
|*ShipmentInfoDTO* | Список с информацией об отгрузках.|
|*ShipmentPalletLabelPageFormatType* | Формат страницы: * `A4` — формат страницы A4. * `A8` — формат страницы A8. |
|*ShipmentStatusChangeDTO* | Статус отгрузки.|
|*ShipmentStatusType* | Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки. |
|*ShipmentType* | Способ отгрузки заказов:  * `IMPORT` — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * `WITHDRAW` — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. |
|*ShowsSalesGroupingType* | Группировка данных отчета. Возможные значения: * `CATEGORIES` — группировка по категориям. * `OFFERS` — группировка по товарам. |
|*SkipGoodsFeedbackReactionRequest* | Идентификаторы отзывов.|
|*SkuBidItemDTO* | Список товаров и ставок на них.|
|*SkuBidRecommendationItemDTO* | Список товаров с рекомендованными ставками.|
|*SortOrderType* | Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. |
|*SuggestOfferPriceDTO* | Товар, для которого требуется получить цены для продвижения.|
|*SuggestPricesRequest* | Запрос на получение списка цен для продвижения.|
|*SuggestPricesResponse* | Ответ на запрос списка цен для продвижения.|
|*SuggestPricesResultDTO* | Результат запроса цен для продвижения.|
|*SuggestedOfferDTO* | Информация о товаре.|
|*SuggestedOfferMappingDTO* | Товар с соответствующей карточкой на Маркете.|
|*TariffDTO* | Информация о тарифах, по которым нужно заплатить за услуги Маркета.|
|*TariffParameterDTO* | Детали расчета конкретной услуги Маркета.|
|*TariffType* | Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). |
|*TimePeriodDTO* | Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.|
|*TimeUnitType* | Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. |
|*TrackDTO* | Информация о трек-номерах.|
|*TransferOrdersFromShipmentRequest* | Запрос переноса заказов из отгрузки.|
|*TurnoverDTO* | Информация об оборачиваемости товара.|
|*TurnoverType* | Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| |
|*UnitDTO* | Единица измерения.|
|*UpdateBusinessOfferPriceDTO* | Товар с новой ценой.|
|*UpdateBusinessPricesRequest* | Запрос на установку базовых цен на товары.|
|*UpdateCampaignOfferDTO* | Параметры размещения товара в магазине.|
|*UpdateCampaignOffersRequest* | Запрос на обновление предложений товаров магазина.|
|*UpdateGoodsFeedbackCommentDTO* | Комментарий к отзыву или другому комментарию.|
|*UpdateGoodsFeedbackCommentRequest* | Комментарий к отзыву.|
|*UpdateGoodsFeedbackCommentResponse* | |
|*UpdateMappingDTO* | Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. |
|*UpdateMappingsOfferDTO* | Информация о товарах в каталоге.|
|*UpdateOfferContentRequest* | Запрос на установку новых значений для параметров.|
|*UpdateOfferContentResponse* | Описывает проблемы, которые появились при сохранении товара.|
|*UpdateOfferContentResultDTO* | Ошибки и предупреждения, которые появились из-за переданных характеристик.|
|*UpdateOfferDTO* | Параметры товара.|
|*UpdateOfferMappingDTO* | Информация о товаре.|
|*UpdateOfferMappingEntryDTO* | Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. |
|*UpdateOfferMappingEntryRequest* | Запрос на обновление товаров.|
|*UpdateOfferMappingResultDTO* | Ошибки и предупреждения, которые появились из-за переданных характеристик.|
|*UpdateOfferMappingsRequest* | |
|*UpdateOfferMappingsResponse* | Описывает проблемы, возникшие при сохранении товара.|
|*UpdateOrderItemRequest* | Запрос на обновление состава заказа.|
|*UpdateOrderStatusDTO* | Список заказов.|
|*UpdateOrderStatusRequest* | |
|*UpdateOrderStatusResponse* | Информация об изменении статуса заказа.|
|*UpdateOrderStatusesDTO* | Список заказов, статус которых обновился.|
|*UpdateOrderStatusesRequest* | Список заказов.|
|*UpdateOrderStatusesResponse* | |
|*UpdateOrderStorageLimitRequest* | Запрос на обновление срока хранения заказа в ПВЗ.|
|*UpdateOutletLicenseRequest* | Запрос на создание или изменение лицензий для точек продаж.|
|*UpdatePriceWithDiscountDTO* | Цена с указанием скидки.|
|*UpdatePricesRequest* | Запрос на установку цен на товары.|
|*UpdatePromoOfferDTO* | Описание товаров, которые участвуют в акции.|
|*UpdatePromoOfferDiscountParamsDTO* | Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. |
|*UpdatePromoOfferParamsDTO* | Параметры товара, который участвует в акции.|
|*UpdatePromoOffersRequest* | Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. |
|*UpdatePromoOffersResponse* | Результат добавления товаров в акцию.|
|*UpdatePromoOffersResultDTO* | Ошибки и предупреждения, которые появились при добавлении товаров в акцию.|
|*UpdateStockDTO* | Информация об остатках одного товара на одном из складов.|
|*UpdateStockItemDTO* | Информация об остатках товара. |
|*UpdateStocksRequest* | Запрос на изменение информации по остаткам товаров.|
|*UpdateTimeDTO* | Время последнего обновления.|
|*ValueRestrictionDTO* | Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: `S`, `M`, `L`, `44`, `46`, `48`, `42/164`, `46/176`, `44S`.  Если ограничивающая характеристика **размерная сетка** принимает значение `RU`, список возможных значений размера сокращается до `44`, `46`, `48`. |
|*VerifyOrderEacRequest* | |
|*VerifyOrderEacResponse* | |
|*WarehouseAddressDTO* | Адрес склада.|
|*WarehouseDTO* | Информация о складе.|
|*WarehouseGroupDTO* | Информация о группе складов.|
|*WarehouseOfferDTO* | Информация об остатках товара.|
|*WarehouseOffersDTO* | Информация об остатках товаров на складе.|
|*WarehouseStockDTO* | Информация об остатках товара.|
|*WarehouseStockType* | Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. |
|*WarehousesDTO* | Информация о складах и группах складов.|
|*WarningPromoOfferUpdateDTO* | Описание предупреждения, которое появилось при добавлении товара.|

