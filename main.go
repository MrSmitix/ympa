package main

import (
	"github.com/yandex-market/yandex-market-partner-api/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetBidsInfoForBusiness - Информация об установленных ставках
	e.POST("/businesses/:businessId/bids/info", c.GetBidsInfoForBusiness)

	// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
	e.POST("/businesses/:businessId/bids/recommendations", c.GetBidsRecommendations)

	// PutBidsForBusiness - Включение буста продаж и установка ставок
	e.PUT("/businesses/:businessId/bids", c.PutBidsForBusiness)

	// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
	e.PUT("/campaigns/:campaignId/bids", c.PutBidsForCampaign)

	// AddOffersToArchive - Добавление товаров в архив
	e.POST("/businesses/:businessId/offer-mappings/archive", c.AddOffersToArchive)

	// DeleteOffers - Удаление товаров из каталога
	e.POST("/businesses/:businessId/offer-mappings/delete", c.DeleteOffers)

	// DeleteOffersFromArchive - Удаление товаров из архива
	e.POST("/businesses/:businessId/offer-mappings/unarchive", c.DeleteOffersFromArchive)

	// GetOfferMappings - Информация о товарах в каталоге
	e.POST("/businesses/:businessId/offer-mappings", c.GetOfferMappings)

	// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
	e.POST("/businesses/:businessId/offer-mappings/suggestions", c.GetSuggestedOfferMappings)

	// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
	e.POST("/businesses/:businessId/offer-mappings/update", c.UpdateOfferMappings)

	// GetBusinessSettings - Настройки кабинета
	e.POST("/businesses/:businessId/settings", c.GetBusinessSettings)

	// GetCampaign - Информация о магазине
	e.GET("/campaigns/:campaignId", c.GetCampaign)

	// GetCampaignLogins - Логины, связанные с магазином
	e.GET("/campaigns/:campaignId/logins", c.GetCampaignLogins)

	// GetCampaignRegion - Регион магазина (deprecated)
	e.GET("/campaigns/:campaignId/region", c.GetCampaignRegion)

	// GetCampaignSettings - Настройки магазина
	e.GET("/campaigns/:campaignId/settings", c.GetCampaignSettings)

	// GetCampaigns - Список магазинов пользователя
	e.GET("/campaigns", c.GetCampaigns)

	// GetCampaignsByLogin - Магазины, доступные логину
	e.GET("/campaigns/by_login/:login", c.GetCampaignsByLogin)

	// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
	e.POST("/categories/max-sale-quantum", c.GetCategoriesMaxSaleQuantum)

	// GetCategoriesTree - Дерево категорий
	e.POST("/categories/tree", c.GetCategoriesTree)

	// CreateChat - Создание нового чата с покупателем
	e.POST("/businesses/:businessId/chats/new", c.CreateChat)

	// GetChatHistory - Получение истории сообщений в чате
	e.POST("/businesses/:businessId/chats/history", c.GetChatHistory)

	// GetChats - Получение доступных чатов
	e.POST("/businesses/:businessId/chats", c.GetChats)

	// SendFileToChat - Отправка файла в чат
	e.POST("/businesses/:businessId/chats/file/send", c.SendFileToChat)

	// SendMessageToChat - Отправка сообщения в чат
	e.POST("/businesses/:businessId/chats/message", c.SendMessageToChat)

	// GetCategoryContentParameters - Списки характеристик товаров по категориям
	e.POST("/category/:categoryId/parameters", c.GetCategoryContentParameters)

	// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
	e.POST("/businesses/:businessId/offer-cards", c.GetOfferCardsContentStatus)

	// UpdateOfferContent - Редактирование категорийных характеристик товара
	e.POST("/businesses/:businessId/offer-cards/update", c.UpdateOfferContent)

	// AcceptOrderCancellation - Отмена заказа покупателем
	e.PUT("/campaigns/:campaignId/orders/:orderId/cancellation/accept", c.AcceptOrderCancellation)

	// AddHiddenOffers - Скрытие товаров и настройки скрытия
	e.POST("/campaigns/:campaignId/hidden-offers", c.AddHiddenOffers)

	// AddOffersToArchive - Добавление товаров в архив
	e.POST("/businesses/:businessId/offer-mappings/archive", c.AddOffersToArchive)

	// CalculateTariffs - Калькулятор стоимости услуг
	e.POST("/tariffs/calculate", c.CalculateTariffs)

	// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine/confirm", c.ConfirmBusinessPrices)

	// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine/confirm", c.ConfirmCampaignPrices)

	// CreateChat - Создание нового чата с покупателем
	e.POST("/businesses/:businessId/chats/new", c.CreateChat)

	// CreateOutlet - Создание точки продаж
	e.POST("/campaigns/:campaignId/outlets", c.CreateOutlet)

	// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
	e.POST("/campaigns/:campaignId/offers/delete", c.DeleteCampaignOffers)

	// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments/delete", c.DeleteGoodsFeedbackComment)

	// DeleteHiddenOffers - Возобновление показа товаров
	e.POST("/campaigns/:campaignId/hidden-offers/delete", c.DeleteHiddenOffers)

	// DeleteOffers - Удаление товаров из каталога
	e.POST("/businesses/:businessId/offer-mappings/delete", c.DeleteOffers)

	// DeleteOffersFromArchive - Удаление товаров из архива
	e.POST("/businesses/:businessId/offer-mappings/unarchive", c.DeleteOffersFromArchive)

	// DeleteOutlet - Удаление точки продаж
	e.DELETE("/campaigns/:campaignId/outlets/:outletId", c.DeleteOutlet)

	// DeleteOutletLicenses - Удаление лицензий для точек продаж
	e.DELETE("/campaigns/:campaignId/outlets/licenses", c.DeleteOutletLicenses)

	// DeletePromoOffers - Удаление товаров из акции
	e.POST("/businesses/:businessId/promos/offers/delete", c.DeletePromoOffers)

	// GenerateBoostConsolidatedReport - Отчет по бусту продаж
	e.POST("/reports/boost-consolidated/generate", c.GenerateBoostConsolidatedReport)

	// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
	e.POST("/reports/competitors-position/generate", c.GenerateCompetitorsPositionReport)

	// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
	e.POST("/reports/goods-feedback/generate", c.GenerateGoodsFeedbackReport)

	// GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах
	e.POST("/reports/documents/labels/generate", c.GenerateMassOrderLabelsReport)

	// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label", c.GenerateOrderLabel)

	// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels", c.GenerateOrderLabels)

	// GeneratePricesReport - Отчет «Цены на рынке»
	e.POST("/reports/prices/generate", c.GeneratePricesReport)

	// GenerateShelfsStatisticsReport - Отчет по полкам
	e.POST("/reports/shelf-statistics/generate", c.GenerateShelfsStatisticsReport)

	// GenerateShowsSalesReport - Отчет «Аналитика продаж»
	e.POST("/reports/shows-sales/generate", c.GenerateShowsSalesReport)

	// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
	e.POST("/reports/stocks-on-warehouses/generate", c.GenerateStocksOnWarehousesReport)

	// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
	e.POST("/reports/united-marketplace-services/generate", c.GenerateUnitedMarketplaceServicesReport)

	// GenerateUnitedNettingReport - Отчет по платежам
	e.POST("/reports/united-netting/generate", c.GenerateUnitedNettingReport)

	// GenerateUnitedOrdersReport - Отчет по заказам
	e.POST("/reports/united-orders/generate", c.GenerateUnitedOrdersReport)

	// GetAllOffers - Все предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers/all", c.GetAllOffers)

	// GetBidsInfoForBusiness - Информация об установленных ставках
	e.POST("/businesses/:businessId/bids/info", c.GetBidsInfoForBusiness)

	// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
	e.POST("/businesses/:businessId/bids/recommendations", c.GetBidsRecommendations)

	// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine", c.GetBusinessQuarantineOffers)

	// GetBusinessSettings - Настройки кабинета
	e.POST("/businesses/:businessId/settings", c.GetBusinessSettings)

	// GetCampaign - Информация о магазине
	e.GET("/campaigns/:campaignId", c.GetCampaign)

	// GetCampaignLogins - Логины, связанные с магазином
	e.GET("/campaigns/:campaignId/logins", c.GetCampaignLogins)

	// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
	e.POST("/campaigns/:campaignId/offers", c.GetCampaignOffers)

	// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine", c.GetCampaignQuarantineOffers)

	// GetCampaignRegion - Регион магазина (deprecated)
	e.GET("/campaigns/:campaignId/region", c.GetCampaignRegion)

	// GetCampaignSettings - Настройки магазина
	e.GET("/campaigns/:campaignId/settings", c.GetCampaignSettings)

	// GetCampaigns - Список магазинов пользователя
	e.GET("/campaigns", c.GetCampaigns)

	// GetCampaignsByLogin - Магазины, доступные логину
	e.GET("/campaigns/by_login/:login", c.GetCampaignsByLogin)

	// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
	e.POST("/categories/max-sale-quantum", c.GetCategoriesMaxSaleQuantum)

	// GetCategoriesTree - Дерево категорий
	e.POST("/categories/tree", c.GetCategoriesTree)

	// GetCategoryContentParameters - Списки характеристик товаров по категориям
	e.POST("/category/:categoryId/parameters", c.GetCategoryContentParameters)

	// GetChatHistory - Получение истории сообщений в чате
	e.POST("/businesses/:businessId/chats/history", c.GetChatHistory)

	// GetChats - Получение доступных чатов
	e.POST("/businesses/:businessId/chats", c.GetChats)

	// GetDeliveryServices - Справочник служб доставки
	e.GET("/delivery/services", c.GetDeliveryServices)

	// GetFeed - Информация о прайс-листе (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId", c.GetFeed)

	// GetFeedIndexLogs - Отчет по индексации прайс-листа (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId/index-logs", c.GetFeedIndexLogs)

	// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине (deprecated)
	e.GET("/campaigns/:campaignId/feedback/updates", c.GetFeedbackAndCommentUpdates)

	// GetFeeds - Список прайс-листов магазина (deprecated)
	e.GET("/campaigns/:campaignId/feeds", c.GetFeeds)

	// GetGoodsFeedbackComments - Получение комментариев к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments", c.GetGoodsFeedbackComments)

	// GetGoodsFeedbacks - Получение отзывов о товарах продавца
	e.POST("/businesses/:businessId/goods-feedback", c.GetGoodsFeedbacks)

	// GetGoodsStats - Отчет по товарам
	e.POST("/campaigns/:campaignId/stats/skus", c.GetGoodsStats)

	// GetHiddenOffers - Информация о скрытых вами товарах
	e.GET("/campaigns/:campaignId/hidden-offers", c.GetHiddenOffers)

	// GetModel - Информация об одной модели
	e.GET("/models/:modelId", c.GetModel)

	// GetModelOffers - Список предложений для одной модели
	e.GET("/models/:modelId/offers", c.GetModelOffers)

	// GetModels - Информация о нескольких моделях
	e.POST("/models", c.GetModels)

	// GetModelsOffers - Список предложений для нескольких моделей
	e.POST("/models/offers", c.GetModelsOffers)

	// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
	e.POST("/businesses/:businessId/offer-cards", c.GetOfferCardsContentStatus)

	// GetOfferMappingEntries - Список товаров в каталоге (deprecated)
	e.GET("/campaigns/:campaignId/offer-mapping-entries", c.GetOfferMappingEntries)

	// GetOfferMappings - Информация о товарах в каталоге
	e.POST("/businesses/:businessId/offer-mappings", c.GetOfferMappings)

	// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
	e.POST("/businesses/:businessId/offers/recommendations", c.GetOfferRecommendations)

	// GetOffers - Предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers", c.GetOffers)

	// GetOrder - Информация об одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId", c.GetOrder)

	// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
	e.POST("/campaigns/:campaignId/orders/:orderId/business-buyer", c.GetOrderBusinessBuyerInfo)

	// GetOrderBusinessDocumentsInfo - Информация о документах
	e.POST("/campaigns/:campaignId/orders/:orderId/documents", c.GetOrderBusinessDocumentsInfo)

	// GetOrderBuyerInfo - Информация о покупателе — физическом лице
	e.GET("/campaigns/:campaignId/orders/:orderId/buyer", c.GetOrderBuyerInfo)

	// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels/data", c.GetOrderLabelsData)

	// GetOrders - Информация о нескольких заказах
	e.GET("/campaigns/:campaignId/orders", c.GetOrders)

	// GetOrdersStats - Детальная информация по заказам
	e.POST("/campaigns/:campaignId/stats/orders", c.GetOrdersStats)

	// GetOutlet - Информация об одной точке продаж
	e.GET("/campaigns/:campaignId/outlets/:outletId", c.GetOutlet)

	// GetOutletLicenses - Информация о лицензиях для точек продаж
	e.GET("/campaigns/:campaignId/outlets/licenses", c.GetOutletLicenses)

	// GetOutlets - Информация о нескольких точках продаж
	e.GET("/campaigns/:campaignId/outlets", c.GetOutlets)

	// GetPrices - Список цен (deprecated)
	e.GET("/campaigns/:campaignId/offer-prices", c.GetPrices)

	// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
	e.POST("/campaigns/:campaignId/offer-prices", c.GetPricesByOfferIds)

	// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
	e.POST("/businesses/:businessId/promos/offers", c.GetPromoOffers)

	// GetPromos - Получение списка акций
	e.POST("/businesses/:businessId/promos", c.GetPromos)

	// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
	e.POST("/campaigns/:campaignId/ratings/quality/details", c.GetQualityRatingDetails)

	// GetQualityRatings - Индекс качества магазинов
	e.POST("/businesses/:businessId/ratings/quality", c.GetQualityRatings)

	// GetReportInfo - Получение заданного отчета
	e.GET("/reports/info/:reportId", c.GetReportInfo)

	// GetReturn - Информация о невыкупе или возврате
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId", c.GetReturn)

	// GetReturnApplication - Получение заявления на возврат
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/application", c.GetReturnApplication)

	// GetReturnPhoto - Получение фотографии возврата
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", c.GetReturnPhoto)

	// GetReturns - Список невыкупов и возвратов
	e.GET("/campaigns/:campaignId/returns", c.GetReturns)

	// GetStocks - Информация об остатках и оборачиваемости
	e.POST("/campaigns/:campaignId/offers/stocks", c.GetStocks)

	// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/suggestions", c.GetSuggestedOfferMappingEntries)

	// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
	e.POST("/businesses/:businessId/offer-mappings/suggestions", c.GetSuggestedOfferMappings)

	// GetSuggestedPrices - Цены для продвижения товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-prices/suggestions", c.GetSuggestedPrices)

	// GetWarehouses - Список складов и групп складов
	e.GET("/businesses/:businessId/warehouses", c.GetWarehouses)

	// ProvideOrderDigitalCodes - Передача ключей цифровых товаров
	e.POST("/campaigns/:campaignId/orders/:orderId/deliverDigitalGoods", c.ProvideOrderDigitalCodes)

	// ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара
	e.PUT("/campaigns/:campaignId/orders/:orderId/identifiers", c.ProvideOrderItemIdentifiers)

	// PutBidsForBusiness - Включение буста продаж и установка ставок
	e.PUT("/businesses/:businessId/bids", c.PutBidsForBusiness)

	// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
	e.PUT("/campaigns/:campaignId/bids", c.PutBidsForCampaign)

	// RefreshFeed - Сообщить, что прайс-лист обновился (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/refresh", c.RefreshFeed)

	// SearchModels - Поиск модели товара
	e.GET("/models", c.SearchModels)

	// SearchRegionChildren - Информация о дочерних регионах
	e.GET("/regions/:regionId/children", c.SearchRegionChildren)

	// SearchRegionsById - Информация о регионе
	e.GET("/regions/:regionId", c.SearchRegionsById)

	// SearchRegionsByName - Поиск регионов по их имени
	e.GET("/regions", c.SearchRegionsByName)

	// SendFileToChat - Отправка файла в чат
	e.POST("/businesses/:businessId/chats/file/send", c.SendFileToChat)

	// SendMessageToChat - Отправка сообщения в чат
	e.POST("/businesses/:businessId/chats/message", c.SendMessageToChat)

	// SetFeedParams - Изменение параметров прайс-листа (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/params", c.SetFeedParams)

	// SetOrderBoxLayout - Подготовка заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/boxes", c.SetOrderBoxLayout)

	// SetOrderDeliveryDate - Изменение даты доставки заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/date", c.SetOrderDeliveryDate)

	// SetOrderDeliveryTrackCode - Передача трек‑номера посылки
	e.POST("/campaigns/:campaignId/orders/:orderId/delivery/track", c.SetOrderDeliveryTrackCode)

	// SetOrderShipmentBoxes - Передача количества грузовых мест в заказе
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes", c.SetOrderShipmentBoxes)

	// SetReturnDecision - Принятие или изменение решения по возврату
	e.POST("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision", c.SetReturnDecision)

	// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
	e.POST("/businesses/:businessId/goods-feedback/skip-reaction", c.SkipGoodsFeedbacksReaction)

	// SubmitReturnDecision - Подтверждение решения по возврату
	e.POST("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit", c.SubmitReturnDecision)

	// UpdateBusinessPrices - Установка цен на товары во всех магазинах
	e.POST("/businesses/:businessId/offer-prices/updates", c.UpdateBusinessPrices)

	// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
	e.POST("/campaigns/:campaignId/offers/update", c.UpdateCampaignOffers)

	// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
	e.POST("/businesses/:businessId/goods-feedback/comments/update", c.UpdateGoodsFeedbackComment)

	// UpdateOfferContent - Редактирование категорийных характеристик товара
	e.POST("/businesses/:businessId/offer-cards/update", c.UpdateOfferContent)

	// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/updates", c.UpdateOfferMappingEntries)

	// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
	e.POST("/businesses/:businessId/offer-mappings/update", c.UpdateOfferMappings)

	// UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц
	e.PUT("/campaigns/:campaignId/orders/:orderId/items", c.UpdateOrderItems)

	// UpdateOrderStatus - Изменение статуса одного заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/status", c.UpdateOrderStatus)

	// UpdateOrderStatuses - Изменение статусов нескольких заказов
	e.POST("/campaigns/:campaignId/orders/status-update", c.UpdateOrderStatuses)

	// UpdateOrderStorageLimit - Продление срока хранения заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/storage-limit", c.UpdateOrderStorageLimit)

	// UpdateOutlet - Изменение информации о точке продаж
	e.PUT("/campaigns/:campaignId/outlets/:outletId", c.UpdateOutlet)

	// UpdateOutletLicenses - Создание и изменение лицензий для точек продаж
	e.POST("/campaigns/:campaignId/outlets/licenses", c.UpdateOutletLicenses)

	// UpdatePrices - Установка цен на товары в конкретном магазине
	e.POST("/campaigns/:campaignId/offer-prices/updates", c.UpdatePrices)

	// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
	e.POST("/businesses/:businessId/promos/offers/update", c.UpdatePromoOffers)

	// UpdateStocks - Передача информации об остатках
	e.PUT("/campaigns/:campaignId/offers/stocks", c.UpdateStocks)

	// GetDeliveryServices - Справочник служб доставки
	e.GET("/delivery/services", c.GetDeliveryServices)

	// AddHiddenOffers - Скрытие товаров и настройки скрытия
	e.POST("/campaigns/:campaignId/hidden-offers", c.AddHiddenOffers)

	// AddOffersToArchive - Добавление товаров в архив
	e.POST("/businesses/:businessId/offer-mappings/archive", c.AddOffersToArchive)

	// CalculateTariffs - Калькулятор стоимости услуг
	e.POST("/tariffs/calculate", c.CalculateTariffs)

	// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine/confirm", c.ConfirmBusinessPrices)

	// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine/confirm", c.ConfirmCampaignPrices)

	// CreateChat - Создание нового чата с покупателем
	e.POST("/businesses/:businessId/chats/new", c.CreateChat)

	// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
	e.POST("/campaigns/:campaignId/offers/delete", c.DeleteCampaignOffers)

	// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments/delete", c.DeleteGoodsFeedbackComment)

	// DeleteHiddenOffers - Возобновление показа товаров
	e.POST("/campaigns/:campaignId/hidden-offers/delete", c.DeleteHiddenOffers)

	// DeleteOffers - Удаление товаров из каталога
	e.POST("/businesses/:businessId/offer-mappings/delete", c.DeleteOffers)

	// DeleteOffersFromArchive - Удаление товаров из архива
	e.POST("/businesses/:businessId/offer-mappings/unarchive", c.DeleteOffersFromArchive)

	// DeletePromoOffers - Удаление товаров из акции
	e.POST("/businesses/:businessId/promos/offers/delete", c.DeletePromoOffers)

	// GenerateBoostConsolidatedReport - Отчет по бусту продаж
	e.POST("/reports/boost-consolidated/generate", c.GenerateBoostConsolidatedReport)

	// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
	e.POST("/reports/competitors-position/generate", c.GenerateCompetitorsPositionReport)

	// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
	e.POST("/reports/goods-feedback/generate", c.GenerateGoodsFeedbackReport)

	// GenerateGoodsRealizationReport - Отчет по реализации
	e.POST("/reports/goods-realization/generate", c.GenerateGoodsRealizationReport)

	// GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах
	e.POST("/reports/documents/labels/generate", c.GenerateMassOrderLabelsReport)

	// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label", c.GenerateOrderLabel)

	// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels", c.GenerateOrderLabels)

	// GeneratePricesReport - Отчет «Цены на рынке»
	e.POST("/reports/prices/generate", c.GeneratePricesReport)

	// GenerateShelfsStatisticsReport - Отчет по полкам
	e.POST("/reports/shelf-statistics/generate", c.GenerateShelfsStatisticsReport)

	// GenerateShowsSalesReport - Отчет «Аналитика продаж»
	e.POST("/reports/shows-sales/generate", c.GenerateShowsSalesReport)

	// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
	e.POST("/reports/stocks-on-warehouses/generate", c.GenerateStocksOnWarehousesReport)

	// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
	e.POST("/reports/united-marketplace-services/generate", c.GenerateUnitedMarketplaceServicesReport)

	// GenerateUnitedNettingReport - Отчет по платежам
	e.POST("/reports/united-netting/generate", c.GenerateUnitedNettingReport)

	// GenerateUnitedOrdersReport - Отчет по заказам
	e.POST("/reports/united-orders/generate", c.GenerateUnitedOrdersReport)

	// GetAllOffers - Все предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers/all", c.GetAllOffers)

	// GetBidsInfoForBusiness - Информация об установленных ставках
	e.POST("/businesses/:businessId/bids/info", c.GetBidsInfoForBusiness)

	// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
	e.POST("/businesses/:businessId/bids/recommendations", c.GetBidsRecommendations)

	// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine", c.GetBusinessQuarantineOffers)

	// GetBusinessSettings - Настройки кабинета
	e.POST("/businesses/:businessId/settings", c.GetBusinessSettings)

	// GetCampaign - Информация о магазине
	e.GET("/campaigns/:campaignId", c.GetCampaign)

	// GetCampaignLogins - Логины, связанные с магазином
	e.GET("/campaigns/:campaignId/logins", c.GetCampaignLogins)

	// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
	e.POST("/campaigns/:campaignId/offers", c.GetCampaignOffers)

	// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine", c.GetCampaignQuarantineOffers)

	// GetCampaignRegion - Регион магазина (deprecated)
	e.GET("/campaigns/:campaignId/region", c.GetCampaignRegion)

	// GetCampaignSettings - Настройки магазина
	e.GET("/campaigns/:campaignId/settings", c.GetCampaignSettings)

	// GetCampaigns - Список магазинов пользователя
	e.GET("/campaigns", c.GetCampaigns)

	// GetCampaignsByLogin - Магазины, доступные логину
	e.GET("/campaigns/by_login/:login", c.GetCampaignsByLogin)

	// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
	e.POST("/categories/max-sale-quantum", c.GetCategoriesMaxSaleQuantum)

	// GetCategoriesTree - Дерево категорий
	e.POST("/categories/tree", c.GetCategoriesTree)

	// GetCategoryContentParameters - Списки характеристик товаров по категориям
	e.POST("/category/:categoryId/parameters", c.GetCategoryContentParameters)

	// GetChatHistory - Получение истории сообщений в чате
	e.POST("/businesses/:businessId/chats/history", c.GetChatHistory)

	// GetChats - Получение доступных чатов
	e.POST("/businesses/:businessId/chats", c.GetChats)

	// GetDeliveryServices - Справочник служб доставки
	e.GET("/delivery/services", c.GetDeliveryServices)

	// GetFeed - Информация о прайс-листе (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId", c.GetFeed)

	// GetFeedIndexLogs - Отчет по индексации прайс-листа (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId/index-logs", c.GetFeedIndexLogs)

	// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине (deprecated)
	e.GET("/campaigns/:campaignId/feedback/updates", c.GetFeedbackAndCommentUpdates)

	// GetFeeds - Список прайс-листов магазина (deprecated)
	e.GET("/campaigns/:campaignId/feeds", c.GetFeeds)

	// GetGoodsFeedbackComments - Получение комментариев к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments", c.GetGoodsFeedbackComments)

	// GetGoodsFeedbacks - Получение отзывов о товарах продавца
	e.POST("/businesses/:businessId/goods-feedback", c.GetGoodsFeedbacks)

	// GetGoodsStats - Отчет по товарам
	e.POST("/campaigns/:campaignId/stats/skus", c.GetGoodsStats)

	// GetHiddenOffers - Информация о скрытых вами товарах
	e.GET("/campaigns/:campaignId/hidden-offers", c.GetHiddenOffers)

	// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
	e.POST("/businesses/:businessId/offer-cards", c.GetOfferCardsContentStatus)

	// GetOfferMappingEntries - Список товаров в каталоге (deprecated)
	e.GET("/campaigns/:campaignId/offer-mapping-entries", c.GetOfferMappingEntries)

	// GetOfferMappings - Информация о товарах в каталоге
	e.POST("/businesses/:businessId/offer-mappings", c.GetOfferMappings)

	// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
	e.POST("/businesses/:businessId/offers/recommendations", c.GetOfferRecommendations)

	// GetOffers - Предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers", c.GetOffers)

	// GetOrder - Информация об одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId", c.GetOrder)

	// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
	e.POST("/campaigns/:campaignId/orders/:orderId/business-buyer", c.GetOrderBusinessBuyerInfo)

	// GetOrderBusinessDocumentsInfo - Информация о документах
	e.POST("/campaigns/:campaignId/orders/:orderId/documents", c.GetOrderBusinessDocumentsInfo)

	// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels/data", c.GetOrderLabelsData)

	// GetOrders - Информация о нескольких заказах
	e.GET("/campaigns/:campaignId/orders", c.GetOrders)

	// GetOrdersStats - Детальная информация по заказам
	e.POST("/campaigns/:campaignId/stats/orders", c.GetOrdersStats)

	// GetPrices - Список цен (deprecated)
	e.GET("/campaigns/:campaignId/offer-prices", c.GetPrices)

	// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
	e.POST("/campaigns/:campaignId/offer-prices", c.GetPricesByOfferIds)

	// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
	e.POST("/businesses/:businessId/promos/offers", c.GetPromoOffers)

	// GetPromos - Получение списка акций
	e.POST("/businesses/:businessId/promos", c.GetPromos)

	// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
	e.POST("/campaigns/:campaignId/ratings/quality/details", c.GetQualityRatingDetails)

	// GetQualityRatings - Индекс качества магазинов
	e.POST("/businesses/:businessId/ratings/quality", c.GetQualityRatings)

	// GetReportInfo - Получение заданного отчета
	e.GET("/reports/info/:reportId", c.GetReportInfo)

	// GetReturn - Информация о невыкупе или возврате
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId", c.GetReturn)

	// GetReturnApplication - Получение заявления на возврат
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/application", c.GetReturnApplication)

	// GetReturnPhoto - Получение фотографии возврата
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", c.GetReturnPhoto)

	// GetReturns - Список невыкупов и возвратов
	e.GET("/campaigns/:campaignId/returns", c.GetReturns)

	// GetStocks - Информация об остатках и оборачиваемости
	e.POST("/campaigns/:campaignId/offers/stocks", c.GetStocks)

	// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/suggestions", c.GetSuggestedOfferMappingEntries)

	// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
	e.POST("/businesses/:businessId/offer-mappings/suggestions", c.GetSuggestedOfferMappings)

	// GetSuggestedPrices - Цены для продвижения товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-prices/suggestions", c.GetSuggestedPrices)

	// GetWarehouses - Список складов и групп складов
	e.GET("/businesses/:businessId/warehouses", c.GetWarehouses)

	// ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара
	e.PUT("/campaigns/:campaignId/orders/:orderId/identifiers", c.ProvideOrderItemIdentifiers)

	// PutBidsForBusiness - Включение буста продаж и установка ставок
	e.PUT("/businesses/:businessId/bids", c.PutBidsForBusiness)

	// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
	e.PUT("/campaigns/:campaignId/bids", c.PutBidsForCampaign)

	// RefreshFeed - Сообщить, что прайс-лист обновился (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/refresh", c.RefreshFeed)

	// SearchRegionChildren - Информация о дочерних регионах
	e.GET("/regions/:regionId/children", c.SearchRegionChildren)

	// SearchRegionsById - Информация о регионе
	e.GET("/regions/:regionId", c.SearchRegionsById)

	// SearchRegionsByName - Поиск регионов по их имени
	e.GET("/regions", c.SearchRegionsByName)

	// SendFileToChat - Отправка файла в чат
	e.POST("/businesses/:businessId/chats/file/send", c.SendFileToChat)

	// SendMessageToChat - Отправка сообщения в чат
	e.POST("/businesses/:businessId/chats/message", c.SendMessageToChat)

	// SetFeedParams - Изменение параметров прайс-листа (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/params", c.SetFeedParams)

	// SetOrderBoxLayout - Подготовка заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/boxes", c.SetOrderBoxLayout)

	// SetOrderShipmentBoxes - Передача количества грузовых мест в заказе
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes", c.SetOrderShipmentBoxes)

	// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
	e.POST("/businesses/:businessId/goods-feedback/skip-reaction", c.SkipGoodsFeedbacksReaction)

	// UpdateBusinessPrices - Установка цен на товары во всех магазинах
	e.POST("/businesses/:businessId/offer-prices/updates", c.UpdateBusinessPrices)

	// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
	e.POST("/campaigns/:campaignId/offers/update", c.UpdateCampaignOffers)

	// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
	e.POST("/businesses/:businessId/goods-feedback/comments/update", c.UpdateGoodsFeedbackComment)

	// UpdateOfferContent - Редактирование категорийных характеристик товара
	e.POST("/businesses/:businessId/offer-cards/update", c.UpdateOfferContent)

	// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/updates", c.UpdateOfferMappingEntries)

	// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
	e.POST("/businesses/:businessId/offer-mappings/update", c.UpdateOfferMappings)

	// UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц
	e.PUT("/campaigns/:campaignId/orders/:orderId/items", c.UpdateOrderItems)

	// UpdateOrderStatus - Изменение статуса одного заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/status", c.UpdateOrderStatus)

	// UpdateOrderStatuses - Изменение статусов нескольких заказов
	e.POST("/campaigns/:campaignId/orders/status-update", c.UpdateOrderStatuses)

	// UpdatePrices - Установка цен на товары в конкретном магазине
	e.POST("/campaigns/:campaignId/offer-prices/updates", c.UpdatePrices)

	// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
	e.POST("/businesses/:businessId/promos/offers/update", c.UpdatePromoOffers)

	// UpdateStocks - Передача информации об остатках
	e.PUT("/campaigns/:campaignId/offers/stocks", c.UpdateStocks)

	// VerifyOrderEac - Передача кода подтверждения
	e.PUT("/campaigns/:campaignId/orders/:orderId/verifyEac", c.VerifyOrderEac)

	// AddHiddenOffers - Скрытие товаров и настройки скрытия
	e.POST("/campaigns/:campaignId/hidden-offers", c.AddHiddenOffers)

	// AddOffersToArchive - Добавление товаров в архив
	e.POST("/businesses/:businessId/offer-mappings/archive", c.AddOffersToArchive)

	// CalculateTariffs - Калькулятор стоимости услуг
	e.POST("/tariffs/calculate", c.CalculateTariffs)

	// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine/confirm", c.ConfirmBusinessPrices)

	// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine/confirm", c.ConfirmCampaignPrices)

	// ConfirmShipment - Подтверждение отгрузки
	e.POST("/campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm", c.ConfirmShipment)

	// CreateChat - Создание нового чата с покупателем
	e.POST("/businesses/:businessId/chats/new", c.CreateChat)

	// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
	e.POST("/campaigns/:campaignId/offers/delete", c.DeleteCampaignOffers)

	// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments/delete", c.DeleteGoodsFeedbackComment)

	// DeleteHiddenOffers - Возобновление показа товаров
	e.POST("/campaigns/:campaignId/hidden-offers/delete", c.DeleteHiddenOffers)

	// DeleteOffers - Удаление товаров из каталога
	e.POST("/businesses/:businessId/offer-mappings/delete", c.DeleteOffers)

	// DeleteOffersFromArchive - Удаление товаров из архива
	e.POST("/businesses/:businessId/offer-mappings/unarchive", c.DeleteOffersFromArchive)

	// DeletePromoOffers - Удаление товаров из акции
	e.POST("/businesses/:businessId/promos/offers/delete", c.DeletePromoOffers)

	// DownloadShipmentAct - Получение акта приема-передачи
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/act", c.DownloadShipmentAct)

	// DownloadShipmentDiscrepancyAct - Получение акта расхождений
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act", c.DownloadShipmentDiscrepancyAct)

	// DownloadShipmentInboundAct - Получение фактического акта приема-передачи
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act", c.DownloadShipmentInboundAct)

	// DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS)
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels", c.DownloadShipmentPalletLabels)

	// DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
	e.GET("/campaigns/:campaignId/shipments/reception-transfer-act", c.DownloadShipmentReceptionTransferAct)

	// DownloadShipmentTransportationWaybill - Получение транспортной накладной
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill", c.DownloadShipmentTransportationWaybill)

	// GenerateBoostConsolidatedReport - Отчет по бусту продаж
	e.POST("/reports/boost-consolidated/generate", c.GenerateBoostConsolidatedReport)

	// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
	e.POST("/reports/competitors-position/generate", c.GenerateCompetitorsPositionReport)

	// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
	e.POST("/reports/goods-feedback/generate", c.GenerateGoodsFeedbackReport)

	// GenerateGoodsRealizationReport - Отчет по реализации
	e.POST("/reports/goods-realization/generate", c.GenerateGoodsRealizationReport)

	// GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах
	e.POST("/reports/documents/labels/generate", c.GenerateMassOrderLabelsReport)

	// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label", c.GenerateOrderLabel)

	// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels", c.GenerateOrderLabels)

	// GeneratePricesReport - Отчет «Цены на рынке»
	e.POST("/reports/prices/generate", c.GeneratePricesReport)

	// GenerateShelfsStatisticsReport - Отчет по полкам
	e.POST("/reports/shelf-statistics/generate", c.GenerateShelfsStatisticsReport)

	// GenerateShipmentListDocumentReport - Получение листа сборки
	e.POST("/reports/documents/shipment-list/generate", c.GenerateShipmentListDocumentReport)

	// GenerateShowsSalesReport - Отчет «Аналитика продаж»
	e.POST("/reports/shows-sales/generate", c.GenerateShowsSalesReport)

	// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
	e.POST("/reports/stocks-on-warehouses/generate", c.GenerateStocksOnWarehousesReport)

	// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
	e.POST("/reports/united-marketplace-services/generate", c.GenerateUnitedMarketplaceServicesReport)

	// GenerateUnitedNettingReport - Отчет по платежам
	e.POST("/reports/united-netting/generate", c.GenerateUnitedNettingReport)

	// GenerateUnitedOrdersReport - Отчет по заказам
	e.POST("/reports/united-orders/generate", c.GenerateUnitedOrdersReport)

	// GetAllOffers - Все предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers/all", c.GetAllOffers)

	// GetBidsInfoForBusiness - Информация об установленных ставках
	e.POST("/businesses/:businessId/bids/info", c.GetBidsInfoForBusiness)

	// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
	e.POST("/businesses/:businessId/bids/recommendations", c.GetBidsRecommendations)

	// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine", c.GetBusinessQuarantineOffers)

	// GetBusinessSettings - Настройки кабинета
	e.POST("/businesses/:businessId/settings", c.GetBusinessSettings)

	// GetCampaign - Информация о магазине
	e.GET("/campaigns/:campaignId", c.GetCampaign)

	// GetCampaignLogins - Логины, связанные с магазином
	e.GET("/campaigns/:campaignId/logins", c.GetCampaignLogins)

	// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
	e.POST("/campaigns/:campaignId/offers", c.GetCampaignOffers)

	// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine", c.GetCampaignQuarantineOffers)

	// GetCampaignRegion - Регион магазина (deprecated)
	e.GET("/campaigns/:campaignId/region", c.GetCampaignRegion)

	// GetCampaignSettings - Настройки магазина
	e.GET("/campaigns/:campaignId/settings", c.GetCampaignSettings)

	// GetCampaigns - Список магазинов пользователя
	e.GET("/campaigns", c.GetCampaigns)

	// GetCampaignsByLogin - Магазины, доступные логину
	e.GET("/campaigns/by_login/:login", c.GetCampaignsByLogin)

	// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
	e.POST("/categories/max-sale-quantum", c.GetCategoriesMaxSaleQuantum)

	// GetCategoriesTree - Дерево категорий
	e.POST("/categories/tree", c.GetCategoriesTree)

	// GetCategoryContentParameters - Списки характеристик товаров по категориям
	e.POST("/category/:categoryId/parameters", c.GetCategoryContentParameters)

	// GetChatHistory - Получение истории сообщений в чате
	e.POST("/businesses/:businessId/chats/history", c.GetChatHistory)

	// GetChats - Получение доступных чатов
	e.POST("/businesses/:businessId/chats", c.GetChats)

	// GetDeliveryServices - Справочник служб доставки
	e.GET("/delivery/services", c.GetDeliveryServices)

	// GetFeed - Информация о прайс-листе (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId", c.GetFeed)

	// GetFeedIndexLogs - Отчет по индексации прайс-листа (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId/index-logs", c.GetFeedIndexLogs)

	// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине (deprecated)
	e.GET("/campaigns/:campaignId/feedback/updates", c.GetFeedbackAndCommentUpdates)

	// GetFeeds - Список прайс-листов магазина (deprecated)
	e.GET("/campaigns/:campaignId/feeds", c.GetFeeds)

	// GetGoodsFeedbackComments - Получение комментариев к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments", c.GetGoodsFeedbackComments)

	// GetGoodsFeedbacks - Получение отзывов о товарах продавца
	e.POST("/businesses/:businessId/goods-feedback", c.GetGoodsFeedbacks)

	// GetGoodsStats - Отчет по товарам
	e.POST("/campaigns/:campaignId/stats/skus", c.GetGoodsStats)

	// GetHiddenOffers - Информация о скрытых вами товарах
	e.GET("/campaigns/:campaignId/hidden-offers", c.GetHiddenOffers)

	// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
	e.POST("/businesses/:businessId/offer-cards", c.GetOfferCardsContentStatus)

	// GetOfferMappingEntries - Список товаров в каталоге (deprecated)
	e.GET("/campaigns/:campaignId/offer-mapping-entries", c.GetOfferMappingEntries)

	// GetOfferMappings - Информация о товарах в каталоге
	e.POST("/businesses/:businessId/offer-mappings", c.GetOfferMappings)

	// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
	e.POST("/businesses/:businessId/offers/recommendations", c.GetOfferRecommendations)

	// GetOffers - Предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers", c.GetOffers)

	// GetOrder - Информация об одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId", c.GetOrder)

	// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
	e.POST("/campaigns/:campaignId/orders/:orderId/business-buyer", c.GetOrderBusinessBuyerInfo)

	// GetOrderBusinessDocumentsInfo - Информация о документах
	e.POST("/campaigns/:campaignId/orders/:orderId/documents", c.GetOrderBusinessDocumentsInfo)

	// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels/data", c.GetOrderLabelsData)

	// GetOrders - Информация о нескольких заказах
	e.GET("/campaigns/:campaignId/orders", c.GetOrders)

	// GetOrdersStats - Детальная информация по заказам
	e.POST("/campaigns/:campaignId/stats/orders", c.GetOrdersStats)

	// GetPrices - Список цен (deprecated)
	e.GET("/campaigns/:campaignId/offer-prices", c.GetPrices)

	// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
	e.POST("/campaigns/:campaignId/offer-prices", c.GetPricesByOfferIds)

	// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
	e.POST("/businesses/:businessId/promos/offers", c.GetPromoOffers)

	// GetPromos - Получение списка акций
	e.POST("/businesses/:businessId/promos", c.GetPromos)

	// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
	e.POST("/campaigns/:campaignId/ratings/quality/details", c.GetQualityRatingDetails)

	// GetQualityRatings - Индекс качества магазинов
	e.POST("/businesses/:businessId/ratings/quality", c.GetQualityRatings)

	// GetReportInfo - Получение заданного отчета
	e.GET("/reports/info/:reportId", c.GetReportInfo)

	// GetReturn - Информация о невыкупе или возврате
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId", c.GetReturn)

	// GetReturnApplication - Получение заявления на возврат
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/application", c.GetReturnApplication)

	// GetReturnPhoto - Получение фотографии возврата
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", c.GetReturnPhoto)

	// GetReturns - Список невыкупов и возвратов
	e.GET("/campaigns/:campaignId/returns", c.GetReturns)

	// GetShipment - Получение информации об одной отгрузке
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId", c.GetShipment)

	// GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS)
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info", c.GetShipmentOrdersInfo)

	// GetStocks - Информация об остатках и оборачиваемости
	e.POST("/campaigns/:campaignId/offers/stocks", c.GetStocks)

	// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/suggestions", c.GetSuggestedOfferMappingEntries)

	// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
	e.POST("/businesses/:businessId/offer-mappings/suggestions", c.GetSuggestedOfferMappings)

	// GetSuggestedPrices - Цены для продвижения товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-prices/suggestions", c.GetSuggestedPrices)

	// GetWarehouses - Список складов и групп складов
	e.GET("/businesses/:businessId/warehouses", c.GetWarehouses)

	// ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара
	e.PUT("/campaigns/:campaignId/orders/:orderId/identifiers", c.ProvideOrderItemIdentifiers)

	// PutBidsForBusiness - Включение буста продаж и установка ставок
	e.PUT("/businesses/:businessId/bids", c.PutBidsForBusiness)

	// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
	e.PUT("/campaigns/:campaignId/bids", c.PutBidsForCampaign)

	// RefreshFeed - Сообщить, что прайс-лист обновился (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/refresh", c.RefreshFeed)

	// SearchRegionChildren - Информация о дочерних регионах
	e.GET("/regions/:regionId/children", c.SearchRegionChildren)

	// SearchRegionsById - Информация о регионе
	e.GET("/regions/:regionId", c.SearchRegionsById)

	// SearchRegionsByName - Поиск регионов по их имени
	e.GET("/regions", c.SearchRegionsByName)

	// SearchShipments - Получение информации о нескольких отгрузках
	e.PUT("/campaigns/:campaignId/first-mile/shipments", c.SearchShipments)

	// SendFileToChat - Отправка файла в чат
	e.POST("/businesses/:businessId/chats/file/send", c.SendFileToChat)

	// SendMessageToChat - Отправка сообщения в чат
	e.POST("/businesses/:businessId/chats/message", c.SendMessageToChat)

	// SetFeedParams - Изменение параметров прайс-листа (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/params", c.SetFeedParams)

	// SetOrderBoxLayout - Подготовка заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/boxes", c.SetOrderBoxLayout)

	// SetOrderShipmentBoxes - Передача количества грузовых мест в заказе
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes", c.SetOrderShipmentBoxes)

	// SetShipmentPalletsCount - Передача количества упаковок в отгрузке
	e.PUT("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets", c.SetShipmentPalletsCount)

	// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
	e.POST("/businesses/:businessId/goods-feedback/skip-reaction", c.SkipGoodsFeedbacksReaction)

	// TransferOrdersFromShipment - Перенос заказов в следующую отгрузку
	e.POST("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer", c.TransferOrdersFromShipment)

	// UpdateBusinessPrices - Установка цен на товары во всех магазинах
	e.POST("/businesses/:businessId/offer-prices/updates", c.UpdateBusinessPrices)

	// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
	e.POST("/campaigns/:campaignId/offers/update", c.UpdateCampaignOffers)

	// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
	e.POST("/businesses/:businessId/goods-feedback/comments/update", c.UpdateGoodsFeedbackComment)

	// UpdateOfferContent - Редактирование категорийных характеристик товара
	e.POST("/businesses/:businessId/offer-cards/update", c.UpdateOfferContent)

	// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/updates", c.UpdateOfferMappingEntries)

	// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
	e.POST("/businesses/:businessId/offer-mappings/update", c.UpdateOfferMappings)

	// UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц
	e.PUT("/campaigns/:campaignId/orders/:orderId/items", c.UpdateOrderItems)

	// UpdateOrderStatus - Изменение статуса одного заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/status", c.UpdateOrderStatus)

	// UpdateOrderStatuses - Изменение статусов нескольких заказов
	e.POST("/campaigns/:campaignId/orders/status-update", c.UpdateOrderStatuses)

	// UpdatePrices - Установка цен на товары в конкретном магазине
	e.POST("/campaigns/:campaignId/offer-prices/updates", c.UpdatePrices)

	// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
	e.POST("/businesses/:businessId/promos/offers/update", c.UpdatePromoOffers)

	// UpdateStocks - Передача информации об остатках
	e.PUT("/campaigns/:campaignId/offers/stocks", c.UpdateStocks)

	// AddHiddenOffers - Скрытие товаров и настройки скрытия
	e.POST("/campaigns/:campaignId/hidden-offers", c.AddHiddenOffers)

	// AddOffersToArchive - Добавление товаров в архив
	e.POST("/businesses/:businessId/offer-mappings/archive", c.AddOffersToArchive)

	// CalculateTariffs - Калькулятор стоимости услуг
	e.POST("/tariffs/calculate", c.CalculateTariffs)

	// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine/confirm", c.ConfirmBusinessPrices)

	// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine/confirm", c.ConfirmCampaignPrices)

	// CreateChat - Создание нового чата с покупателем
	e.POST("/businesses/:businessId/chats/new", c.CreateChat)

	// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
	e.POST("/campaigns/:campaignId/offers/delete", c.DeleteCampaignOffers)

	// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments/delete", c.DeleteGoodsFeedbackComment)

	// DeleteHiddenOffers - Возобновление показа товаров
	e.POST("/campaigns/:campaignId/hidden-offers/delete", c.DeleteHiddenOffers)

	// DeleteOffers - Удаление товаров из каталога
	e.POST("/businesses/:businessId/offer-mappings/delete", c.DeleteOffers)

	// DeleteOffersFromArchive - Удаление товаров из архива
	e.POST("/businesses/:businessId/offer-mappings/unarchive", c.DeleteOffersFromArchive)

	// DeletePromoOffers - Удаление товаров из акции
	e.POST("/businesses/:businessId/promos/offers/delete", c.DeletePromoOffers)

	// GenerateBoostConsolidatedReport - Отчет по бусту продаж
	e.POST("/reports/boost-consolidated/generate", c.GenerateBoostConsolidatedReport)

	// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
	e.POST("/reports/competitors-position/generate", c.GenerateCompetitorsPositionReport)

	// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
	e.POST("/reports/goods-feedback/generate", c.GenerateGoodsFeedbackReport)

	// GenerateGoodsMovementReport - Отчет по движению товаров
	e.POST("/reports/goods-movement/generate", c.GenerateGoodsMovementReport)

	// GenerateGoodsRealizationReport - Отчет по реализации
	e.POST("/reports/goods-realization/generate", c.GenerateGoodsRealizationReport)

	// GenerateGoodsTurnoverReport - Отчет по оборачиваемости
	e.POST("/reports/goods-turnover/generate", c.GenerateGoodsTurnoverReport)

	// GeneratePricesReport - Отчет «Цены на рынке»
	e.POST("/reports/prices/generate", c.GeneratePricesReport)

	// GenerateShelfsStatisticsReport - Отчет по полкам
	e.POST("/reports/shelf-statistics/generate", c.GenerateShelfsStatisticsReport)

	// GenerateShowsSalesReport - Отчет «Аналитика продаж»
	e.POST("/reports/shows-sales/generate", c.GenerateShowsSalesReport)

	// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
	e.POST("/reports/stocks-on-warehouses/generate", c.GenerateStocksOnWarehousesReport)

	// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
	e.POST("/reports/united-marketplace-services/generate", c.GenerateUnitedMarketplaceServicesReport)

	// GenerateUnitedNettingReport - Отчет по платежам
	e.POST("/reports/united-netting/generate", c.GenerateUnitedNettingReport)

	// GenerateUnitedOrdersReport - Отчет по заказам
	e.POST("/reports/united-orders/generate", c.GenerateUnitedOrdersReport)

	// GetAllOffers - Все предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers/all", c.GetAllOffers)

	// GetBidsInfoForBusiness - Информация об установленных ставках
	e.POST("/businesses/:businessId/bids/info", c.GetBidsInfoForBusiness)

	// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
	e.POST("/businesses/:businessId/bids/recommendations", c.GetBidsRecommendations)

	// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine", c.GetBusinessQuarantineOffers)

	// GetBusinessSettings - Настройки кабинета
	e.POST("/businesses/:businessId/settings", c.GetBusinessSettings)

	// GetCampaign - Информация о магазине
	e.GET("/campaigns/:campaignId", c.GetCampaign)

	// GetCampaignLogins - Логины, связанные с магазином
	e.GET("/campaigns/:campaignId/logins", c.GetCampaignLogins)

	// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
	e.POST("/campaigns/:campaignId/offers", c.GetCampaignOffers)

	// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine", c.GetCampaignQuarantineOffers)

	// GetCampaignRegion - Регион магазина (deprecated)
	e.GET("/campaigns/:campaignId/region", c.GetCampaignRegion)

	// GetCampaignSettings - Настройки магазина
	e.GET("/campaigns/:campaignId/settings", c.GetCampaignSettings)

	// GetCampaigns - Список магазинов пользователя
	e.GET("/campaigns", c.GetCampaigns)

	// GetCampaignsByLogin - Магазины, доступные логину
	e.GET("/campaigns/by_login/:login", c.GetCampaignsByLogin)

	// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
	e.POST("/categories/max-sale-quantum", c.GetCategoriesMaxSaleQuantum)

	// GetCategoriesTree - Дерево категорий
	e.POST("/categories/tree", c.GetCategoriesTree)

	// GetCategoryContentParameters - Списки характеристик товаров по категориям
	e.POST("/category/:categoryId/parameters", c.GetCategoryContentParameters)

	// GetChatHistory - Получение истории сообщений в чате
	e.POST("/businesses/:businessId/chats/history", c.GetChatHistory)

	// GetChats - Получение доступных чатов
	e.POST("/businesses/:businessId/chats", c.GetChats)

	// GetFeed - Информация о прайс-листе (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId", c.GetFeed)

	// GetFeedIndexLogs - Отчет по индексации прайс-листа (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId/index-logs", c.GetFeedIndexLogs)

	// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине (deprecated)
	e.GET("/campaigns/:campaignId/feedback/updates", c.GetFeedbackAndCommentUpdates)

	// GetFeeds - Список прайс-листов магазина (deprecated)
	e.GET("/campaigns/:campaignId/feeds", c.GetFeeds)

	// GetFulfillmentWarehouses - Идентификаторы складов Маркета (FBY)
	e.GET("/warehouses", c.GetFulfillmentWarehouses)

	// GetGoodsFeedbackComments - Получение комментариев к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments", c.GetGoodsFeedbackComments)

	// GetGoodsFeedbacks - Получение отзывов о товарах продавца
	e.POST("/businesses/:businessId/goods-feedback", c.GetGoodsFeedbacks)

	// GetGoodsStats - Отчет по товарам
	e.POST("/campaigns/:campaignId/stats/skus", c.GetGoodsStats)

	// GetHiddenOffers - Информация о скрытых вами товарах
	e.GET("/campaigns/:campaignId/hidden-offers", c.GetHiddenOffers)

	// GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина
	e.POST("/businesses/:businessId/offer-cards", c.GetOfferCardsContentStatus)

	// GetOfferMappingEntries - Список товаров в каталоге (deprecated)
	e.GET("/campaigns/:campaignId/offer-mapping-entries", c.GetOfferMappingEntries)

	// GetOfferMappings - Информация о товарах в каталоге
	e.POST("/businesses/:businessId/offer-mappings", c.GetOfferMappings)

	// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
	e.POST("/businesses/:businessId/offers/recommendations", c.GetOfferRecommendations)

	// GetOffers - Предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers", c.GetOffers)

	// GetOrder - Информация об одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId", c.GetOrder)

	// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
	e.POST("/campaigns/:campaignId/orders/:orderId/business-buyer", c.GetOrderBusinessBuyerInfo)

	// GetOrderBusinessDocumentsInfo - Информация о документах
	e.POST("/campaigns/:campaignId/orders/:orderId/documents", c.GetOrderBusinessDocumentsInfo)

	// GetOrders - Информация о нескольких заказах
	e.GET("/campaigns/:campaignId/orders", c.GetOrders)

	// GetOrdersStats - Детальная информация по заказам
	e.POST("/campaigns/:campaignId/stats/orders", c.GetOrdersStats)

	// GetPrices - Список цен (deprecated)
	e.GET("/campaigns/:campaignId/offer-prices", c.GetPrices)

	// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
	e.POST("/campaigns/:campaignId/offer-prices", c.GetPricesByOfferIds)

	// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
	e.POST("/businesses/:businessId/promos/offers", c.GetPromoOffers)

	// GetPromos - Получение списка акций
	e.POST("/businesses/:businessId/promos", c.GetPromos)

	// GetQualityRatings - Индекс качества магазинов
	e.POST("/businesses/:businessId/ratings/quality", c.GetQualityRatings)

	// GetReportInfo - Получение заданного отчета
	e.GET("/reports/info/:reportId", c.GetReportInfo)

	// GetReturn - Информация о невыкупе или возврате
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId", c.GetReturn)

	// GetReturnPhoto - Получение фотографии возврата
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", c.GetReturnPhoto)

	// GetReturns - Список невыкупов и возвратов
	e.GET("/campaigns/:campaignId/returns", c.GetReturns)

	// GetStocks - Информация об остатках и оборачиваемости
	e.POST("/campaigns/:campaignId/offers/stocks", c.GetStocks)

	// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/suggestions", c.GetSuggestedOfferMappingEntries)

	// GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам
	e.POST("/businesses/:businessId/offer-mappings/suggestions", c.GetSuggestedOfferMappings)

	// GetSuggestedPrices - Цены для продвижения товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-prices/suggestions", c.GetSuggestedPrices)

	// PutBidsForBusiness - Включение буста продаж и установка ставок
	e.PUT("/businesses/:businessId/bids", c.PutBidsForBusiness)

	// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
	e.PUT("/campaigns/:campaignId/bids", c.PutBidsForCampaign)

	// RefreshFeed - Сообщить, что прайс-лист обновился (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/refresh", c.RefreshFeed)

	// SearchRegionChildren - Информация о дочерних регионах
	e.GET("/regions/:regionId/children", c.SearchRegionChildren)

	// SearchRegionsById - Информация о регионе
	e.GET("/regions/:regionId", c.SearchRegionsById)

	// SearchRegionsByName - Поиск регионов по их имени
	e.GET("/regions", c.SearchRegionsByName)

	// SendFileToChat - Отправка файла в чат
	e.POST("/businesses/:businessId/chats/file/send", c.SendFileToChat)

	// SendMessageToChat - Отправка сообщения в чат
	e.POST("/businesses/:businessId/chats/message", c.SendMessageToChat)

	// SetFeedParams - Изменение параметров прайс-листа (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/params", c.SetFeedParams)

	// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
	e.POST("/businesses/:businessId/goods-feedback/skip-reaction", c.SkipGoodsFeedbacksReaction)

	// UpdateBusinessPrices - Установка цен на товары во всех магазинах
	e.POST("/businesses/:businessId/offer-prices/updates", c.UpdateBusinessPrices)

	// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
	e.POST("/campaigns/:campaignId/offers/update", c.UpdateCampaignOffers)

	// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
	e.POST("/businesses/:businessId/goods-feedback/comments/update", c.UpdateGoodsFeedbackComment)

	// UpdateOfferContent - Редактирование категорийных характеристик товара
	e.POST("/businesses/:businessId/offer-cards/update", c.UpdateOfferContent)

	// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/updates", c.UpdateOfferMappingEntries)

	// UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них
	e.POST("/businesses/:businessId/offer-mappings/update", c.UpdateOfferMappings)

	// UpdatePrices - Установка цен на товары в конкретном магазине
	e.POST("/campaigns/:campaignId/offer-prices/updates", c.UpdatePrices)

	// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
	e.POST("/businesses/:businessId/promos/offers/update", c.UpdatePromoOffers)

	// GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине (deprecated)
	e.GET("/campaigns/:campaignId/feedback/updates", c.GetFeedbackAndCommentUpdates)

	// GetFeed - Информация о прайс-листе (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId", c.GetFeed)

	// GetFeedIndexLogs - Отчет по индексации прайс-листа (deprecated)
	e.GET("/campaigns/:campaignId/feeds/:feedId/index-logs", c.GetFeedIndexLogs)

	// GetFeeds - Список прайс-листов магазина (deprecated)
	e.GET("/campaigns/:campaignId/feeds", c.GetFeeds)

	// RefreshFeed - Сообщить, что прайс-лист обновился (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/refresh", c.RefreshFeed)

	// SetFeedParams - Изменение параметров прайс-листа (deprecated)
	e.POST("/campaigns/:campaignId/feeds/:feedId/params", c.SetFeedParams)

	// DeleteGoodsFeedbackComment - Удаление комментария к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments/delete", c.DeleteGoodsFeedbackComment)

	// GetGoodsFeedbackComments - Получение комментариев к отзыву
	e.POST("/businesses/:businessId/goods-feedback/comments", c.GetGoodsFeedbackComments)

	// GetGoodsFeedbacks - Получение отзывов о товарах продавца
	e.POST("/businesses/:businessId/goods-feedback", c.GetGoodsFeedbacks)

	// SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы
	e.POST("/businesses/:businessId/goods-feedback/skip-reaction", c.SkipGoodsFeedbacksReaction)

	// UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария
	e.POST("/businesses/:businessId/goods-feedback/comments/update", c.UpdateGoodsFeedbackComment)

	// GetGoodsStats - Отчет по товарам
	e.POST("/campaigns/:campaignId/stats/skus", c.GetGoodsStats)

	// AddHiddenOffers - Скрытие товаров и настройки скрытия
	e.POST("/campaigns/:campaignId/hidden-offers", c.AddHiddenOffers)

	// DeleteHiddenOffers - Возобновление показа товаров
	e.POST("/campaigns/:campaignId/hidden-offers/delete", c.DeleteHiddenOffers)

	// GetHiddenOffers - Информация о скрытых вами товарах
	e.GET("/campaigns/:campaignId/hidden-offers", c.GetHiddenOffers)

	// GetModel - Информация об одной модели
	e.GET("/models/:modelId", c.GetModel)

	// GetModelOffers - Список предложений для одной модели
	e.GET("/models/:modelId/offers", c.GetModelOffers)

	// GetModels - Информация о нескольких моделях
	e.POST("/models", c.GetModels)

	// GetModelsOffers - Список предложений для нескольких моделей
	e.POST("/models/offers", c.GetModelsOffers)

	// SearchModels - Поиск модели товара
	e.GET("/models", c.SearchModels)

	// GetOfferMappingEntries - Список товаров в каталоге (deprecated)
	e.GET("/campaigns/:campaignId/offer-mapping-entries", c.GetOfferMappingEntries)

	// GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/suggestions", c.GetSuggestedOfferMappingEntries)

	// UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге (deprecated)
	e.POST("/campaigns/:campaignId/offer-mapping-entries/updates", c.UpdateOfferMappingEntries)

	// DeleteCampaignOffers - Удаление товаров из ассортимента магазина
	e.POST("/campaigns/:campaignId/offers/delete", c.DeleteCampaignOffers)

	// GetAllOffers - Все предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers/all", c.GetAllOffers)

	// GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине
	e.POST("/campaigns/:campaignId/offers", c.GetCampaignOffers)

	// GetOfferRecommendations - Рекомендации Маркета, касающиеся цен
	e.POST("/businesses/:businessId/offers/recommendations", c.GetOfferRecommendations)

	// GetOffers - Предложения магазина (deprecated)
	e.GET("/campaigns/:campaignId/offers", c.GetOffers)

	// UpdateCampaignOffers - Изменение условий продажи товаров в магазине
	e.POST("/campaigns/:campaignId/offers/update", c.UpdateCampaignOffers)

	// GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице
	e.POST("/campaigns/:campaignId/orders/:orderId/business-buyer", c.GetOrderBusinessBuyerInfo)

	// GetOrderBusinessDocumentsInfo - Информация о документах
	e.POST("/campaigns/:campaignId/orders/:orderId/documents", c.GetOrderBusinessDocumentsInfo)

	// GetOrderBuyerInfo - Информация о покупателе — физическом лице
	e.GET("/campaigns/:campaignId/orders/:orderId/buyer", c.GetOrderBuyerInfo)

	// SetOrderDeliveryDate - Изменение даты доставки заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/date", c.SetOrderDeliveryDate)

	// SetOrderDeliveryTrackCode - Передача трек‑номера посылки
	e.POST("/campaigns/:campaignId/orders/:orderId/delivery/track", c.SetOrderDeliveryTrackCode)

	// UpdateOrderStorageLimit - Продление срока хранения заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/storage-limit", c.UpdateOrderStorageLimit)

	// VerifyOrderEac - Передача кода подтверждения
	e.PUT("/campaigns/:campaignId/orders/:orderId/verifyEac", c.VerifyOrderEac)

	// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label", c.GenerateOrderLabel)

	// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels", c.GenerateOrderLabels)

	// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
	e.GET("/campaigns/:campaignId/orders/:orderId/delivery/labels/data", c.GetOrderLabelsData)

	// AcceptOrderCancellation - Отмена заказа покупателем
	e.PUT("/campaigns/:campaignId/orders/:orderId/cancellation/accept", c.AcceptOrderCancellation)

	// GetOrder - Информация об одном заказе
	e.GET("/campaigns/:campaignId/orders/:orderId", c.GetOrder)

	// GetOrders - Информация о нескольких заказах
	e.GET("/campaigns/:campaignId/orders", c.GetOrders)

	// ProvideOrderDigitalCodes - Передача ключей цифровых товаров
	e.POST("/campaigns/:campaignId/orders/:orderId/deliverDigitalGoods", c.ProvideOrderDigitalCodes)

	// ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара
	e.PUT("/campaigns/:campaignId/orders/:orderId/identifiers", c.ProvideOrderItemIdentifiers)

	// SetOrderBoxLayout - Подготовка заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/boxes", c.SetOrderBoxLayout)

	// SetOrderShipmentBoxes - Передача количества грузовых мест в заказе
	e.PUT("/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes", c.SetOrderShipmentBoxes)

	// UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц
	e.PUT("/campaigns/:campaignId/orders/:orderId/items", c.UpdateOrderItems)

	// UpdateOrderStatus - Изменение статуса одного заказа
	e.PUT("/campaigns/:campaignId/orders/:orderId/status", c.UpdateOrderStatus)

	// UpdateOrderStatuses - Изменение статусов нескольких заказов
	e.POST("/campaigns/:campaignId/orders/status-update", c.UpdateOrderStatuses)

	// GetOrdersStats - Детальная информация по заказам
	e.POST("/campaigns/:campaignId/stats/orders", c.GetOrdersStats)

	// DeleteOutletLicenses - Удаление лицензий для точек продаж
	e.DELETE("/campaigns/:campaignId/outlets/licenses", c.DeleteOutletLicenses)

	// GetOutletLicenses - Информация о лицензиях для точек продаж
	e.GET("/campaigns/:campaignId/outlets/licenses", c.GetOutletLicenses)

	// UpdateOutletLicenses - Создание и изменение лицензий для точек продаж
	e.POST("/campaigns/:campaignId/outlets/licenses", c.UpdateOutletLicenses)

	// CreateOutlet - Создание точки продаж
	e.POST("/campaigns/:campaignId/outlets", c.CreateOutlet)

	// DeleteOutlet - Удаление точки продаж
	e.DELETE("/campaigns/:campaignId/outlets/:outletId", c.DeleteOutlet)

	// GetOutlet - Информация об одной точке продаж
	e.GET("/campaigns/:campaignId/outlets/:outletId", c.GetOutlet)

	// GetOutlets - Информация о нескольких точках продаж
	e.GET("/campaigns/:campaignId/outlets", c.GetOutlets)

	// UpdateOutlet - Изменение информации о точке продаж
	e.PUT("/campaigns/:campaignId/outlets/:outletId", c.UpdateOutlet)

	// ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine/confirm", c.ConfirmBusinessPrices)

	// ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine/confirm", c.ConfirmCampaignPrices)

	// GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете
	e.POST("/businesses/:businessId/price-quarantine", c.GetBusinessQuarantineOffers)

	// GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине
	e.POST("/campaigns/:campaignId/price-quarantine", c.GetCampaignQuarantineOffers)

	// GetPrices - Список цен (deprecated)
	e.GET("/campaigns/:campaignId/offer-prices", c.GetPrices)

	// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
	e.POST("/campaigns/:campaignId/offer-prices", c.GetPricesByOfferIds)

	// GetSuggestedPrices - Цены для продвижения товаров (deprecated)
	e.POST("/campaigns/:campaignId/offer-prices/suggestions", c.GetSuggestedPrices)

	// UpdateBusinessPrices - Установка цен на товары во всех магазинах
	e.POST("/businesses/:businessId/offer-prices/updates", c.UpdateBusinessPrices)

	// UpdatePrices - Установка цен на товары в конкретном магазине
	e.POST("/campaigns/:campaignId/offer-prices/updates", c.UpdatePrices)

	// DeletePromoOffers - Удаление товаров из акции
	e.POST("/businesses/:businessId/promos/offers/delete", c.DeletePromoOffers)

	// GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции
	e.POST("/businesses/:businessId/promos/offers", c.GetPromoOffers)

	// GetPromos - Получение списка акций
	e.POST("/businesses/:businessId/promos", c.GetPromos)

	// UpdatePromoOffers - Добавление товаров в акцию или изменение их цен
	e.POST("/businesses/:businessId/promos/offers/update", c.UpdatePromoOffers)

	// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
	e.POST("/campaigns/:campaignId/ratings/quality/details", c.GetQualityRatingDetails)

	// GetQualityRatings - Индекс качества магазинов
	e.POST("/businesses/:businessId/ratings/quality", c.GetQualityRatings)

	// SearchRegionChildren - Информация о дочерних регионах
	e.GET("/regions/:regionId/children", c.SearchRegionChildren)

	// SearchRegionsById - Информация о регионе
	e.GET("/regions/:regionId", c.SearchRegionsById)

	// SearchRegionsByName - Поиск регионов по их имени
	e.GET("/regions", c.SearchRegionsByName)

	// GenerateBoostConsolidatedReport - Отчет по бусту продаж
	e.POST("/reports/boost-consolidated/generate", c.GenerateBoostConsolidatedReport)

	// GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция»
	e.POST("/reports/competitors-position/generate", c.GenerateCompetitorsPositionReport)

	// GenerateGoodsFeedbackReport - Отчет по отзывам о товарах
	e.POST("/reports/goods-feedback/generate", c.GenerateGoodsFeedbackReport)

	// GenerateGoodsMovementReport - Отчет по движению товаров
	e.POST("/reports/goods-movement/generate", c.GenerateGoodsMovementReport)

	// GenerateGoodsRealizationReport - Отчет по реализации
	e.POST("/reports/goods-realization/generate", c.GenerateGoodsRealizationReport)

	// GenerateGoodsTurnoverReport - Отчет по оборачиваемости
	e.POST("/reports/goods-turnover/generate", c.GenerateGoodsTurnoverReport)

	// GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах
	e.POST("/reports/documents/labels/generate", c.GenerateMassOrderLabelsReport)

	// GeneratePricesReport - Отчет «Цены на рынке»
	e.POST("/reports/prices/generate", c.GeneratePricesReport)

	// GenerateShelfsStatisticsReport - Отчет по полкам
	e.POST("/reports/shelf-statistics/generate", c.GenerateShelfsStatisticsReport)

	// GenerateShipmentListDocumentReport - Получение листа сборки
	e.POST("/reports/documents/shipment-list/generate", c.GenerateShipmentListDocumentReport)

	// GenerateShowsSalesReport - Отчет «Аналитика продаж»
	e.POST("/reports/shows-sales/generate", c.GenerateShowsSalesReport)

	// GenerateStocksOnWarehousesReport - Отчет по остаткам на складах
	e.POST("/reports/stocks-on-warehouses/generate", c.GenerateStocksOnWarehousesReport)

	// GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг
	e.POST("/reports/united-marketplace-services/generate", c.GenerateUnitedMarketplaceServicesReport)

	// GenerateUnitedNettingReport - Отчет по платежам
	e.POST("/reports/united-netting/generate", c.GenerateUnitedNettingReport)

	// GenerateUnitedOrdersReport - Отчет по заказам
	e.POST("/reports/united-orders/generate", c.GenerateUnitedOrdersReport)

	// GetReportInfo - Получение заданного отчета
	e.GET("/reports/info/:reportId", c.GetReportInfo)

	// GetReturn - Информация о невыкупе или возврате
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId", c.GetReturn)

	// GetReturnApplication - Получение заявления на возврат
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/application", c.GetReturnApplication)

	// GetReturnPhoto - Получение фотографии возврата
	e.GET("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", c.GetReturnPhoto)

	// GetReturns - Список невыкупов и возвратов
	e.GET("/campaigns/:campaignId/returns", c.GetReturns)

	// SetReturnDecision - Принятие или изменение решения по возврату
	e.POST("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision", c.SetReturnDecision)

	// SubmitReturnDecision - Подтверждение решения по возврату
	e.POST("/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit", c.SubmitReturnDecision)

	// ConfirmShipment - Подтверждение отгрузки
	e.POST("/campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm", c.ConfirmShipment)

	// DownloadShipmentAct - Получение акта приема-передачи
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/act", c.DownloadShipmentAct)

	// DownloadShipmentDiscrepancyAct - Получение акта расхождений
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act", c.DownloadShipmentDiscrepancyAct)

	// DownloadShipmentInboundAct - Получение фактического акта приема-передачи
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act", c.DownloadShipmentInboundAct)

	// DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS)
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels", c.DownloadShipmentPalletLabels)

	// DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
	e.GET("/campaigns/:campaignId/shipments/reception-transfer-act", c.DownloadShipmentReceptionTransferAct)

	// DownloadShipmentTransportationWaybill - Получение транспортной накладной
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill", c.DownloadShipmentTransportationWaybill)

	// GetShipment - Получение информации об одной отгрузке
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId", c.GetShipment)

	// GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS)
	e.GET("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info", c.GetShipmentOrdersInfo)

	// SearchShipments - Получение информации о нескольких отгрузках
	e.PUT("/campaigns/:campaignId/first-mile/shipments", c.SearchShipments)

	// SetShipmentPalletsCount - Передача количества упаковок в отгрузке
	e.PUT("/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets", c.SetShipmentPalletsCount)

	// TransferOrdersFromShipment - Перенос заказов в следующую отгрузку
	e.POST("/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer", c.TransferOrdersFromShipment)

	// GetStocks - Информация об остатках и оборачиваемости
	e.POST("/campaigns/:campaignId/offers/stocks", c.GetStocks)

	// UpdateStocks - Передача информации об остатках
	e.PUT("/campaigns/:campaignId/offers/stocks", c.UpdateStocks)

	// CalculateTariffs - Калькулятор стоимости услуг
	e.POST("/tariffs/calculate", c.CalculateTariffs)

	// GetFulfillmentWarehouses - Идентификаторы складов Маркета (FBY)
	e.GET("/warehouses", c.GetFulfillmentWarehouses)

	// GetWarehouses - Список складов и групп складов
	e.GET("/businesses/:businessId/warehouses", c.GetWarehouses)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
