/**
 * 
 * Партнерский API Маркета
 * 
 * 
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 * 
 * Version: LATEST
 * 
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package ympa_graphql_nodejs_express_server

// fbs_api

export default {
    Query: {

        // @return String!
        DownloadShipmentAct: ($campaignId, $shipmentId) => {
            return {
                "campaignId": "789",
                "shipmentId": "789"
            };
        },

        // @return String!
        DownloadShipmentDiscrepancyAct: ($campaignId, $shipmentId) => {
            return {
                "campaignId": "789",
                "shipmentId": "789"
            };
        },

        // @return String!
        DownloadShipmentInboundAct: ($campaignId, $shipmentId) => {
            return {
                "campaignId": "789",
                "shipmentId": "789"
            };
        },

        // @return String!
        DownloadShipmentPalletLabels: ($campaignId, $shipmentId, $format) => {
            return {
                "campaignId": "789",
                "shipmentId": "789",
                "format": ""
            };
        },

        // @return String!
        DownloadShipmentReceptionTransferAct: ($campaignId, $warehouseId) => {
            return {
                "campaignId": "789",
                "warehouseId": "123123"
            };
        },

        // @return String!
        DownloadShipmentTransportationWaybill: ($campaignId, $shipmentId) => {
            return {
                "campaignId": "789",
                "shipmentId": "789"
            };
        },

        // @return String!
        GenerateOrderLabel: ($campaignId, $orderId, $shipmentId, $boxId, $format) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "shipmentId": "789",
                "boxId": "789",
                "format": ""
            };
        },

        // @return String!
        GenerateOrderLabels: ($campaignId, $orderId, $format) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "format": ""
            };
        },

        // @return GetAllOffersResponse
        GetAllOffers: ($campaignId, $feedId, $chunk) => {
            return {
                "campaignId": "789",
                "feedId": "789",
                "chunk": "56"
            };
        },

        // @return GetCampaignResponse
        GetCampaign: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetCampaignLoginsResponse
        GetCampaignLogins: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetCampaignRegionResponse
        GetCampaignRegion: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetCampaignSettingsResponse
        GetCampaignSettings: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetCampaignsResponse
        GetCampaigns: ($page, $pageSize) => {
            return {
                "page": "56",
                "pageSize": "56"
            };
        },

        // @return GetCampaignsResponse
        GetCampaignsByLogin: ($login, $page, $pageSize) => {
            return {
                "login": "login_example",
                "page": "56",
                "pageSize": "56"
            };
        },

        // @return GetDeliveryServicesResponse
        GetDeliveryServices: () => {
            return {
                
            };
        },

        // @return GetFeedResponse
        GetFeed: ($campaignId, $feedId) => {
            return {
                "campaignId": "789",
                "feedId": "789"
            };
        },

        // @return GetFeedIndexLogsResponse
        GetFeedIndexLogs: ($campaignId, $feedId, $limit, $publishedTimeFrom, $publishedTimeTo, $status) => {
            return {
                "campaignId": "789",
                "feedId": "789",
                "limit": "20",
                "publishedTimeFrom": "2013-10-20T19:20:30+01:00",
                "publishedTimeTo": "2013-10-20T19:20:30+01:00",
                "status": ""
            };
        },

        // @return GetFeedbackListResponse
        GetFeedbackAndCommentUpdates: ($campaignId, $pageToken, $limit, $fromDate) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "fromDate": "2013-10-20"
            };
        },

        // @return GetFeedsResponse
        GetFeeds: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetHiddenOffersResponse
        GetHiddenOffers: ($campaignId, $offerId, $pageToken, $limit, $offset, $page, $pageSize) => {
            return {
                "campaignId": "789",
                "offerId": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "offset": "56",
                "page": "56",
                "pageSize": "56"
            };
        },

        // @return GetOfferMappingEntriesResponse
        GetOfferMappingEntries: ($campaignId, $offerId, $shopSku, $mappingKind, $status, $availability, $categoryId, $vendor, $pageToken, $limit) => {
            return {
                "campaignId": "789",
                "offerId": "",
                "shopSku": "",
                "mappingKind": "",
                "status": "",
                "availability": "",
                "categoryId": "",
                "vendor": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetOffersResponse
        GetOffers: ($campaignId, $Query_, $feedId, $shopCategoryId, $currency, $matched, $page, $pageSize) => {
            return {
                "campaignId": "789",
                "Query_": "Query__example",
                "feedId": "789",
                "shopCategoryId": "shopCategoryId_example",
                "currency": "",
                "matched": "true",
                "page": "56",
                "pageSize": "56"
            };
        },

        // @return GetOrderResponse
        GetOrder: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

        // @return GetOrderLabelsDataResponse
        GetOrderLabelsData: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

        // @return GetOrdersResponse
        GetOrders: ($campaignId, $orderIds, $status, $substatus, $fromDate, $toDate, $supplierShipmentDateFrom, $supplierShipmentDateTo, $updatedAtFrom, $updatedAtTo, $dispatchType, $fake, $hasCis, $onlyWaitingForCancellationApprove, $onlyEstimatedDelivery, $buyerType, $page, $pageSize, $pageToken, $limit) => {
            return {
                "campaignId": "789",
                "orderIds": "",
                "status": "",
                "substatus": "",
                "fromDate": "2013-10-20",
                "toDate": "2013-10-20",
                "supplierShipmentDateFrom": "2013-10-20",
                "supplierShipmentDateTo": "2013-10-20",
                "updatedAtFrom": "2013-10-20T19:20:30+01:00",
                "updatedAtTo": "2013-10-20T19:20:30+01:00",
                "dispatchType": "",
                "fake": "true",
                "hasCis": "true",
                "onlyWaitingForCancellationApprove": "true",
                "onlyEstimatedDelivery": "true",
                "buyerType": "",
                "page": "56",
                "pageSize": "56",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetPricesResponse
        GetPrices: ($campaignId, $pageToken, $limit, $archived) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "archived": "true"
            };
        },

        // @return GetReportInfoResponse
        GetReportInfo: ($reportId) => {
            return {
                "reportId": "reportId_example"
            };
        },

        // @return GetReturnResponse
        GetReturn: ($campaignId, $orderId, $returnId) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "returnId": "789"
            };
        },

        // @return String!
        GetReturnApplication: ($campaignId, $orderId, $returnId) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "returnId": "789"
            };
        },

        // @return String!
        GetReturnPhoto: ($campaignId, $orderId, $returnId, $itemId, $imageHash) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "returnId": "789",
                "itemId": "789",
                "imageHash": "imageHash_example"
            };
        },

        // @return GetReturnsResponse
        GetReturns: ($campaignId, $pageToken, $limit, $orderIds, $statuses, $Type_, $fromDate, $toDate, $fromDate2, $toDate2) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "orderIds": "",
                "statuses": "STARTED_BY_USER,WAITING_FOR_DECISION",
                "Type_": "",
                "fromDate": "2022-10-31",
                "toDate": "2022-11-30",
                "fromDate2": "2022-10-31",
                "toDate2": "2022-11-30"
            };
        },

        // @return GetShipmentResponse
        GetShipment: ($campaignId, $shipmentId, $cancelledOrders) => {
            return {
                "campaignId": "789",
                "shipmentId": "789",
                "cancelledOrders": "true"
            };
        },

        // @return GetShipmentOrdersInfoResponse
        GetShipmentOrdersInfo: ($campaignId, $shipmentId) => {
            return {
                "campaignId": "789",
                "shipmentId": "789"
            };
        },

        // @return GetWarehousesResponse
        GetWarehouses: ($businessId) => {
            return {
                "businessId": "789"
            };
        },

        // @return GetRegionWithChildrenResponse
        SearchRegionChildren: ($regionId, $page, $pageSize) => {
            return {
                "regionId": "789",
                "page": "56",
                "pageSize": "56"
            };
        },

        // @return GetRegionsResponse
        SearchRegionsById: ($regionId) => {
            return {
                "regionId": "789"
            };
        },

        // @return GetRegionsResponse
        SearchRegionsByName: ($name, $pageToken, $limit) => {
            return {
                "name": "name_example",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

    },

    Mutation: {

        // @return EmptyApiResponse
        AddHiddenOffers: ($campaignId, $addHiddenOffersRequest) => {
            return {
                "campaignId": "789",
                "addHiddenOffersRequest": ""
            };
        },

        // @return AddOffersToArchiveResponse
        AddOffersToArchive: ($businessId, $addOffersToArchiveRequest) => {
            return {
                "businessId": "789",
                "addOffersToArchiveRequest": ""
            };
        },

        // @return CalculateTariffsResponse
        CalculateTariffs: ($calculateTariffsRequest) => {
            return {
                "calculateTariffsRequest": ""
            };
        },

        // @return EmptyApiResponse
        ConfirmBusinessPrices: ($businessId, $confirmPricesRequest) => {
            return {
                "businessId": "789",
                "confirmPricesRequest": ""
            };
        },

        // @return EmptyApiResponse
        ConfirmCampaignPrices: ($campaignId, $confirmPricesRequest) => {
            return {
                "campaignId": "789",
                "confirmPricesRequest": ""
            };
        },

        // @return EmptyApiResponse
        ConfirmShipment: ($campaignId, $shipmentId, $confirmShipmentRequest) => {
            return {
                "campaignId": "789",
                "shipmentId": "789",
                "confirmShipmentRequest": ""
            };
        },

        // @return CreateChatResponse
        CreateChat: ($businessId, $createChatRequest) => {
            return {
                "businessId": "789",
                "createChatRequest": ""
            };
        },

        // @return DeleteCampaignOffersResponse
        DeleteCampaignOffers: ($campaignId, $deleteCampaignOffersRequest) => {
            return {
                "campaignId": "789",
                "deleteCampaignOffersRequest": ""
            };
        },

        // @return EmptyApiResponse
        DeleteGoodsFeedbackComment: ($businessId, $deleteGoodsFeedbackCommentRequest) => {
            return {
                "businessId": "789",
                "deleteGoodsFeedbackCommentRequest": ""
            };
        },

        // @return EmptyApiResponse
        DeleteHiddenOffers: ($campaignId, $deleteHiddenOffersRequest) => {
            return {
                "campaignId": "789",
                "deleteHiddenOffersRequest": ""
            };
        },

        // @return DeleteOffersResponse
        DeleteOffers: ($businessId, $deleteOffersRequest) => {
            return {
                "businessId": "789",
                "deleteOffersRequest": ""
            };
        },

        // @return DeleteOffersFromArchiveResponse
        DeleteOffersFromArchive: ($businessId, $deleteOffersFromArchiveRequest) => {
            return {
                "businessId": "789",
                "deleteOffersFromArchiveRequest": ""
            };
        },

        // @return DeletePromoOffersResponse
        DeletePromoOffers: ($businessId, $deletePromoOffersRequest) => {
            return {
                "businessId": "789",
                "deletePromoOffersRequest": ""
            };
        },

        // @return GenerateReportResponse
        GenerateBoostConsolidatedReport: ($generateBoostConsolidatedRequest, $format) => {
            return {
                "generateBoostConsolidatedRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateCompetitorsPositionReport: ($generateCompetitorsPositionReportRequest, $format) => {
            return {
                "generateCompetitorsPositionReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateGoodsFeedbackReport: ($generateGoodsFeedbackRequest, $format) => {
            return {
                "generateGoodsFeedbackRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateGoodsRealizationReport: ($generateGoodsRealizationReportRequest, $format) => {
            return {
                "generateGoodsRealizationReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateMassOrderLabelsReport: ($generateMassOrderLabelsRequest, $format) => {
            return {
                "generateMassOrderLabelsRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GeneratePricesReport: ($generatePricesReportRequest, $format) => {
            return {
                "generatePricesReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateShelfsStatisticsReport: ($generateShelfsStatisticsRequest, $format) => {
            return {
                "generateShelfsStatisticsRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateShipmentListDocumentReport: ($generateShipmentListDocumentReportRequest) => {
            return {
                "generateShipmentListDocumentReportRequest": ""
            };
        },

        // @return GenerateReportResponse
        GenerateShowsSalesReport: ($generateShowsSalesReportRequest, $format) => {
            return {
                "generateShowsSalesReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateStocksOnWarehousesReport: ($generateStocksOnWarehousesReportRequest, $format) => {
            return {
                "generateStocksOnWarehousesReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateUnitedMarketplaceServicesReport: ($generateUnitedMarketplaceServicesReportRequest, $format) => {
            return {
                "generateUnitedMarketplaceServicesReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateUnitedNettingReport: ($generateUnitedNettingReportRequest, $format) => {
            return {
                "generateUnitedNettingReportRequest": "",
                "format": ""
            };
        },

        // @return GenerateReportResponse
        GenerateUnitedOrdersReport: ($generateUnitedOrdersRequest, $format) => {
            return {
                "generateUnitedOrdersRequest": "",
                "format": ""
            };
        },

        // @return GetBidsInfoResponse
        GetBidsInfoForBusiness: ($businessId, $pageToken, $limit, $getBidsInfoRequest) => {
            return {
                "businessId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getBidsInfoRequest": ""
            };
        },

        // @return GetBidsRecommendationsResponse
        GetBidsRecommendations: ($businessId, $getBidsRecommendationsRequest) => {
            return {
                "businessId": "789",
                "getBidsRecommendationsRequest": ""
            };
        },

        // @return GetQuarantineOffersResponse
        GetBusinessQuarantineOffers: ($businessId, $getQuarantineOffersRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "getQuarantineOffersRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetBusinessSettingsResponse
        GetBusinessSettings: ($businessId) => {
            return {
                "businessId": "789"
            };
        },

        // @return GetCampaignOffersResponse
        GetCampaignOffers: ($campaignId, $getCampaignOffersRequest, $pageToken, $limit) => {
            return {
                "campaignId": "789",
                "getCampaignOffersRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetQuarantineOffersResponse
        GetCampaignQuarantineOffers: ($campaignId, $getQuarantineOffersRequest, $pageToken, $limit) => {
            return {
                "campaignId": "789",
                "getQuarantineOffersRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetCategoriesMaxSaleQuantumResponse
        GetCategoriesMaxSaleQuantum: ($getCategoriesMaxSaleQuantumRequest) => {
            return {
                "getCategoriesMaxSaleQuantumRequest": ""
            };
        },

        // @return GetCategoriesResponse
        GetCategoriesTree: ($getCategoriesRequest) => {
            return {
                "getCategoriesRequest": ""
            };
        },

        // @return GetCategoryContentParametersResponse
        GetCategoryContentParameters: ($categoryId) => {
            return {
                "categoryId": "789"
            };
        },

        // @return GetChatHistoryResponse
        GetChatHistory: ($businessId, $chatId, $getChatHistoryRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "chatId": "789",
                "getChatHistoryRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetChatsResponse
        GetChats: ($businessId, $getChatsRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "getChatsRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetGoodsFeedbackCommentsResponse
        GetGoodsFeedbackComments: ($businessId, $getGoodsFeedbackCommentsRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "getGoodsFeedbackCommentsRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetGoodsFeedbackResponse
        GetGoodsFeedbacks: ($businessId, $pageToken, $limit, $getGoodsFeedbackRequest) => {
            return {
                "businessId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getGoodsFeedbackRequest": ""
            };
        },

        // @return GetGoodsStatsResponse
        GetGoodsStats: ($campaignId, $getGoodsStatsRequest) => {
            return {
                "campaignId": "789",
                "getGoodsStatsRequest": ""
            };
        },

        // @return GetOfferCardsContentStatusResponse
        GetOfferCardsContentStatus: ($businessId, $pageToken, $limit, $getOfferCardsContentStatusRequest) => {
            return {
                "businessId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getOfferCardsContentStatusRequest": ""
            };
        },

        // @return GetOfferMappingsResponse
        GetOfferMappings: ($businessId, $pageToken, $limit, $getOfferMappingsRequest) => {
            return {
                "businessId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getOfferMappingsRequest": ""
            };
        },

        // @return GetOfferRecommendationsResponse
        GetOfferRecommendations: ($businessId, $getOfferRecommendationsRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "getOfferRecommendationsRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetBusinessBuyerInfoResponse
        GetOrderBusinessBuyerInfo: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

        // @return GetBusinessDocumentsInfoResponse
        GetOrderBusinessDocumentsInfo: ($campaignId, $orderId) => {
            return {
                "campaignId": "789",
                "orderId": "789"
            };
        },

        // @return GetOrdersStatsResponse
        GetOrdersStats: ($campaignId, $pageToken, $limit, $getOrdersStatsRequest) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getOrdersStatsRequest": ""
            };
        },

        // @return GetPricesByOfferIdsResponse
        GetPricesByOfferIds: ($campaignId, $pageToken, $limit, $getPricesByOfferIdsRequest) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getPricesByOfferIdsRequest": ""
            };
        },

        // @return GetPromoOffersResponse
        GetPromoOffers: ($businessId, $getPromoOffersRequest, $pageToken, $limit) => {
            return {
                "businessId": "789",
                "getPromoOffersRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return GetPromosResponse
        GetPromos: ($businessId, $getPromosRequest) => {
            return {
                "businessId": "789",
                "getPromosRequest": ""
            };
        },

        // @return GetQualityRatingDetailsResponse
        GetQualityRatingDetails: ($campaignId) => {
            return {
                "campaignId": "789"
            };
        },

        // @return GetQualityRatingResponse
        GetQualityRatings: ($businessId, $getQualityRatingRequest) => {
            return {
                "businessId": "789",
                "getQualityRatingRequest": ""
            };
        },

        // @return GetWarehouseStocksResponse
        GetStocks: ($campaignId, $pageToken, $limit, $getWarehouseStocksRequest) => {
            return {
                "campaignId": "789",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20",
                "getWarehouseStocksRequest": ""
            };
        },

        // @return GetSuggestedOfferMappingEntriesResponse
        GetSuggestedOfferMappingEntries: ($campaignId, $getSuggestedOfferMappingEntriesRequest) => {
            return {
                "campaignId": "789",
                "getSuggestedOfferMappingEntriesRequest": ""
            };
        },

        // @return GetSuggestedOfferMappingsResponse
        GetSuggestedOfferMappings: ($businessId, $getSuggestedOfferMappingsRequest) => {
            return {
                "businessId": "789",
                "getSuggestedOfferMappingsRequest": ""
            };
        },

        // @return SuggestPricesResponse
        GetSuggestedPrices: ($campaignId, $suggestPricesRequest) => {
            return {
                "campaignId": "789",
                "suggestPricesRequest": ""
            };
        },

        // @return ProvideOrderItemIdentifiersResponse
        ProvideOrderItemIdentifiers: ($campaignId, $orderId, $provideOrderItemIdentifiersRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "provideOrderItemIdentifiersRequest": ""
            };
        },

        // @return EmptyApiResponse
        PutBidsForBusiness: ($businessId, $putSkuBidsRequest) => {
            return {
                "businessId": "789",
                "putSkuBidsRequest": ""
            };
        },

        // @return EmptyApiResponse
        PutBidsForCampaign: ($campaignId, $putSkuBidsRequest) => {
            return {
                "campaignId": "789",
                "putSkuBidsRequest": ""
            };
        },

        // @return EmptyApiResponse
        RefreshFeed: ($campaignId, $feedId) => {
            return {
                "campaignId": "789",
                "feedId": "789"
            };
        },

        // @return SearchShipmentsResponse
        SearchShipments: ($campaignId, $searchShipmentsRequest, $pageToken, $limit) => {
            return {
                "campaignId": "789",
                "searchShipmentsRequest": "",
                "pageToken": "eyBuZXh0SWQ6IDIzNDIgfQ&#x3D;&#x3D;",
                "limit": "20"
            };
        },

        // @return EmptyApiResponse
        SendFileToChat: ($businessId, $chatId, $file) => {
            return {
                "businessId": "789",
                "chatId": "789",
                "file": "BINARY_DATA_HERE"
            };
        },

        // @return EmptyApiResponse
        SendMessageToChat: ($businessId, $chatId, $sendMessageToChatRequest) => {
            return {
                "businessId": "789",
                "chatId": "789",
                "sendMessageToChatRequest": ""
            };
        },

        // @return EmptyApiResponse
        SetFeedParams: ($campaignId, $feedId, $setFeedParamsRequest) => {
            return {
                "campaignId": "789",
                "feedId": "789",
                "setFeedParamsRequest": ""
            };
        },

        // @return SetOrderBoxLayoutResponse
        SetOrderBoxLayout: ($campaignId, $orderId, $setOrderBoxLayoutRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "setOrderBoxLayoutRequest": ""
            };
        },

        // @return SetOrderShipmentBoxesResponse
        SetOrderShipmentBoxes: ($campaignId, $orderId, $shipmentId, $setOrderShipmentBoxesRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "shipmentId": "789",
                "setOrderShipmentBoxesRequest": ""
            };
        },

        // @return EmptyApiResponse
        SetShipmentPalletsCount: ($campaignId, $shipmentId, $setShipmentPalletsCountRequest) => {
            return {
                "campaignId": "789",
                "shipmentId": "789",
                "setShipmentPalletsCountRequest": ""
            };
        },

        // @return EmptyApiResponse
        SkipGoodsFeedbacksReaction: ($businessId, $skipGoodsFeedbackReactionRequest) => {
            return {
                "businessId": "789",
                "skipGoodsFeedbackReactionRequest": ""
            };
        },

        // @return EmptyApiResponse
        TransferOrdersFromShipment: ($campaignId, $shipmentId, $transferOrdersFromShipmentRequest) => {
            return {
                "campaignId": "789",
                "shipmentId": "789",
                "transferOrdersFromShipmentRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdateBusinessPrices: ($businessId, $updateBusinessPricesRequest) => {
            return {
                "businessId": "789",
                "updateBusinessPricesRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdateCampaignOffers: ($campaignId, $updateCampaignOffersRequest) => {
            return {
                "campaignId": "789",
                "updateCampaignOffersRequest": ""
            };
        },

        // @return UpdateGoodsFeedbackCommentResponse
        UpdateGoodsFeedbackComment: ($businessId, $updateGoodsFeedbackCommentRequest) => {
            return {
                "businessId": "789",
                "updateGoodsFeedbackCommentRequest": ""
            };
        },

        // @return UpdateOfferContentResponse
        UpdateOfferContent: ($businessId, $updateOfferContentRequest) => {
            return {
                "businessId": "789",
                "updateOfferContentRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdateOfferMappingEntries: ($campaignId, $updateOfferMappingEntryRequest) => {
            return {
                "campaignId": "789",
                "updateOfferMappingEntryRequest": ""
            };
        },

        // @return UpdateOfferMappingsResponse
        UpdateOfferMappings: ($businessId, $updateOfferMappingsRequest) => {
            return {
                "businessId": "789",
                "updateOfferMappingsRequest": ""
            };
        },

        // @return 
        UpdateOrderItems: ($campaignId, $orderId, $updateOrderItemRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "updateOrderItemRequest": ""
            };
        },

        // @return UpdateOrderStatusResponse
        UpdateOrderStatus: ($campaignId, $orderId, $updateOrderStatusRequest) => {
            return {
                "campaignId": "789",
                "orderId": "789",
                "updateOrderStatusRequest": ""
            };
        },

        // @return UpdateOrderStatusesResponse
        UpdateOrderStatuses: ($campaignId, $updateOrderStatusesRequest) => {
            return {
                "campaignId": "789",
                "updateOrderStatusesRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdatePrices: ($campaignId, $updatePricesRequest) => {
            return {
                "campaignId": "789",
                "updatePricesRequest": ""
            };
        },

        // @return UpdatePromoOffersResponse
        UpdatePromoOffers: ($businessId, $updatePromoOffersRequest) => {
            return {
                "businessId": "789",
                "updatePromoOffersRequest": ""
            };
        },

        // @return EmptyApiResponse
        UpdateStocks: ($campaignId, $updateStocksRequest) => {
            return {
                "campaignId": "789",
                "updateStocksRequest": ""
            };
        },

    }
}