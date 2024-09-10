-module(ympa_erlang_server_router).

-export([get_paths/1, get_validator_state/0]).

-type operations() :: #{
    Method :: binary() => ympa_erlang_server_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorMod :: module()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'GetBidsInfoForBusiness' => #{
            path => "/businesses/:businessId/bids/info",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_bids_handler'
        },
        'GetBidsRecommendations' => #{
            path => "/businesses/:businessId/bids/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_bids_handler'
        },
        'PutBidsForBusiness' => #{
            path => "/businesses/:businessId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_bids_handler'
        },
        'PutBidsForCampaign' => #{
            path => "/campaigns/:campaignId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_bids_handler'
        },
        'AddOffersToArchive' => #{
            path => "/businesses/:businessId/offer-mappings/archive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'DeleteOffers' => #{
            path => "/businesses/:businessId/offer-mappings/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'DeleteOffersFromArchive' => #{
            path => "/businesses/:businessId/offer-mappings/unarchive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'GetOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'GetSuggestedOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'UpdateOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_business_offer_mappings_handler'
        },
        'GetBusinessSettings' => #{
            path => "/businesses/:businessId/settings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_businesses_handler'
        },
        'GetCampaign' => #{
            path => "/campaigns/:campaignId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCampaignLogins' => #{
            path => "/campaigns/:campaignId/logins",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCampaignRegion' => #{
            path => "/campaigns/:campaignId/region",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCampaignSettings' => #{
            path => "/campaigns/:campaignId/settings",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCampaigns' => #{
            path => "/campaigns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCampaignsByLogin' => #{
            path => "/campaigns/by_login/:login",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_campaigns_handler'
        },
        'GetCategoriesMaxSaleQuantum' => #{
            path => "/categories/max-sale-quantum",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_categories_handler'
        },
        'GetCategoriesTree' => #{
            path => "/categories/tree",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_categories_handler'
        },
        'CreateChat' => #{
            path => "/businesses/:businessId/chats/new",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_chats_handler'
        },
        'GetChatHistory' => #{
            path => "/businesses/:businessId/chats/history",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_chats_handler'
        },
        'GetChats' => #{
            path => "/businesses/:businessId/chats",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_chats_handler'
        },
        'SendFileToChat' => #{
            path => "/businesses/:businessId/chats/file/send",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_chats_handler'
        },
        'SendMessageToChat' => #{
            path => "/businesses/:businessId/chats/message",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_chats_handler'
        },
        'GetCategoryContentParameters' => #{
            path => "/category/:categoryId/parameters",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_content_handler'
        },
        'GetOfferCardsContentStatus' => #{
            path => "/businesses/:businessId/offer-cards",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_content_handler'
        },
        'UpdateOfferContent' => #{
            path => "/businesses/:businessId/offer-cards/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_content_handler'
        },
        'AcceptOrderCancellation' => #{
            path => "/campaigns/:campaignId/orders/:orderId/cancellation/accept",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'AddHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'AddOffersToArchive' => #{
            path => "/businesses/:businessId/offer-mappings/archive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'CalculateTariffs' => #{
            path => "/tariffs/calculate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'ConfirmBusinessPrices' => #{
            path => "/businesses/:businessId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'ConfirmCampaignPrices' => #{
            path => "/campaigns/:campaignId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'CreateChat' => #{
            path => "/businesses/:businessId/chats/new",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'CreateOutlet' => #{
            path => "/campaigns/:campaignId/outlets",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteOffers' => #{
            path => "/businesses/:businessId/offer-mappings/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteOffersFromArchive' => #{
            path => "/businesses/:businessId/offer-mappings/unarchive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"DELETE">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeleteOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"DELETE">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'DeletePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateBoostConsolidatedReport' => #{
            path => "/reports/boost-consolidated/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateCompetitorsPositionReport' => #{
            path => "/reports/competitors-position/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateGoodsFeedbackReport' => #{
            path => "/reports/goods-feedback/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateMassOrderLabelsReport' => #{
            path => "/reports/documents/labels/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateOrderLabel' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateOrderLabels' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GeneratePricesReport' => #{
            path => "/reports/prices/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateShelfsStatisticsReport' => #{
            path => "/reports/shelf-statistics/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateShowsSalesReport' => #{
            path => "/reports/shows-sales/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateStocksOnWarehousesReport' => #{
            path => "/reports/stocks-on-warehouses/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateUnitedMarketplaceServicesReport' => #{
            path => "/reports/united-marketplace-services/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateUnitedNettingReport' => #{
            path => "/reports/united-netting/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GenerateUnitedOrdersReport' => #{
            path => "/reports/united-orders/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetAllOffers' => #{
            path => "/campaigns/:campaignId/offers/all",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetBidsInfoForBusiness' => #{
            path => "/businesses/:businessId/bids/info",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetBidsRecommendations' => #{
            path => "/businesses/:businessId/bids/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetBusinessQuarantineOffers' => #{
            path => "/businesses/:businessId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetBusinessSettings' => #{
            path => "/businesses/:businessId/settings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaign' => #{
            path => "/campaigns/:campaignId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignLogins' => #{
            path => "/campaigns/:campaignId/logins",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignQuarantineOffers' => #{
            path => "/campaigns/:campaignId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignRegion' => #{
            path => "/campaigns/:campaignId/region",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignSettings' => #{
            path => "/campaigns/:campaignId/settings",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaigns' => #{
            path => "/campaigns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCampaignsByLogin' => #{
            path => "/campaigns/by_login/:login",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCategoriesMaxSaleQuantum' => #{
            path => "/categories/max-sale-quantum",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCategoriesTree' => #{
            path => "/categories/tree",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetCategoryContentParameters' => #{
            path => "/category/:categoryId/parameters",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetChatHistory' => #{
            path => "/businesses/:businessId/chats/history",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetChats' => #{
            path => "/businesses/:businessId/chats",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetDeliveryServices' => #{
            path => "/delivery/services",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetFeedIndexLogs' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/index-logs",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetFeedbackAndCommentUpdates' => #{
            path => "/campaigns/:campaignId/feedback/updates",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetFeeds' => #{
            path => "/campaigns/:campaignId/feeds",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetGoodsFeedbackComments' => #{
            path => "/businesses/:businessId/goods-feedback/comments",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetGoodsFeedbacks' => #{
            path => "/businesses/:businessId/goods-feedback",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetGoodsStats' => #{
            path => "/campaigns/:campaignId/stats/skus",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetModel' => #{
            path => "/models/:modelId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetModelOffers' => #{
            path => "/models/:modelId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetModels' => #{
            path => "/models",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetModelsOffers' => #{
            path => "/models/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOfferCardsContentStatus' => #{
            path => "/businesses/:businessId/offer-cards",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOfferRecommendations' => #{
            path => "/businesses/:businessId/offers/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrder' => #{
            path => "/campaigns/:campaignId/orders/:orderId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrderBusinessBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/business-buyer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrderBusinessDocumentsInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/documents",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrderBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/buyer",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrderLabelsData' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels/data",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrders' => #{
            path => "/campaigns/:campaignId/orders",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOrdersStats' => #{
            path => "/campaigns/:campaignId/stats/orders",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetOutlets' => #{
            path => "/campaigns/:campaignId/outlets",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetPrices' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetPricesByOfferIds' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetPromoOffers' => #{
            path => "/businesses/:businessId/promos/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetPromos' => #{
            path => "/businesses/:businessId/promos",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetQualityRatingDetails' => #{
            path => "/campaigns/:campaignId/ratings/quality/details",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetQualityRatings' => #{
            path => "/businesses/:businessId/ratings/quality",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetReportInfo' => #{
            path => "/reports/info/:reportId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetReturn' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetReturnApplication' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/application",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetReturnPhoto' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetReturns' => #{
            path => "/campaigns/:campaignId/returns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetSuggestedOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetSuggestedOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetSuggestedPrices' => #{
            path => "/campaigns/:campaignId/offer-prices/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetWarehouses' => #{
            path => "/businesses/:businessId/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'ProvideOrderDigitalCodes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/deliverDigitalGoods",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'ProvideOrderItemIdentifiers' => #{
            path => "/campaigns/:campaignId/orders/:orderId/identifiers",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'PutBidsForBusiness' => #{
            path => "/businesses/:businessId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'PutBidsForCampaign' => #{
            path => "/campaigns/:campaignId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'RefreshFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/refresh",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SearchModels' => #{
            path => "/models",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SearchRegionChildren' => #{
            path => "/regions/:regionId/children",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SearchRegionsById' => #{
            path => "/regions/:regionId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SearchRegionsByName' => #{
            path => "/regions",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SendFileToChat' => #{
            path => "/businesses/:businessId/chats/file/send",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SendMessageToChat' => #{
            path => "/businesses/:businessId/chats/message",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetFeedParams' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/params",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetOrderBoxLayout' => #{
            path => "/campaigns/:campaignId/orders/:orderId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetOrderDeliveryDate' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/date",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetOrderDeliveryTrackCode' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/track",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetOrderShipmentBoxes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SetReturnDecision' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SkipGoodsFeedbacksReaction' => #{
            path => "/businesses/:businessId/goods-feedback/skip-reaction",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'SubmitReturnDecision' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateBusinessPrices' => #{
            path => "/businesses/:businessId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOfferContent' => #{
            path => "/businesses/:businessId/offer-cards/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOrderItems' => #{
            path => "/campaigns/:campaignId/orders/:orderId/items",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOrderStatus' => #{
            path => "/campaigns/:campaignId/orders/:orderId/status",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOrderStatuses' => #{
            path => "/campaigns/:campaignId/orders/status-update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOrderStorageLimit' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/storage-limit",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdatePrices' => #{
            path => "/campaigns/:campaignId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdatePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'UpdateStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_dbs_handler'
        },
        'GetDeliveryServices' => #{
            path => "/delivery/services",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_delivery_services_handler'
        },
        'AddHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'AddOffersToArchive' => #{
            path => "/businesses/:businessId/offer-mappings/archive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'CalculateTariffs' => #{
            path => "/tariffs/calculate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'ConfirmBusinessPrices' => #{
            path => "/businesses/:businessId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'ConfirmCampaignPrices' => #{
            path => "/campaigns/:campaignId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'CreateChat' => #{
            path => "/businesses/:businessId/chats/new",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeleteCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeleteGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeleteHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeleteOffers' => #{
            path => "/businesses/:businessId/offer-mappings/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeleteOffersFromArchive' => #{
            path => "/businesses/:businessId/offer-mappings/unarchive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'DeletePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateBoostConsolidatedReport' => #{
            path => "/reports/boost-consolidated/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateCompetitorsPositionReport' => #{
            path => "/reports/competitors-position/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateGoodsFeedbackReport' => #{
            path => "/reports/goods-feedback/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateGoodsRealizationReport' => #{
            path => "/reports/goods-realization/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateMassOrderLabelsReport' => #{
            path => "/reports/documents/labels/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateOrderLabel' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateOrderLabels' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GeneratePricesReport' => #{
            path => "/reports/prices/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateShelfsStatisticsReport' => #{
            path => "/reports/shelf-statistics/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateShowsSalesReport' => #{
            path => "/reports/shows-sales/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateStocksOnWarehousesReport' => #{
            path => "/reports/stocks-on-warehouses/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateUnitedMarketplaceServicesReport' => #{
            path => "/reports/united-marketplace-services/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateUnitedNettingReport' => #{
            path => "/reports/united-netting/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GenerateUnitedOrdersReport' => #{
            path => "/reports/united-orders/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetAllOffers' => #{
            path => "/campaigns/:campaignId/offers/all",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetBidsInfoForBusiness' => #{
            path => "/businesses/:businessId/bids/info",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetBidsRecommendations' => #{
            path => "/businesses/:businessId/bids/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetBusinessQuarantineOffers' => #{
            path => "/businesses/:businessId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetBusinessSettings' => #{
            path => "/businesses/:businessId/settings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaign' => #{
            path => "/campaigns/:campaignId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignLogins' => #{
            path => "/campaigns/:campaignId/logins",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignQuarantineOffers' => #{
            path => "/campaigns/:campaignId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignRegion' => #{
            path => "/campaigns/:campaignId/region",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignSettings' => #{
            path => "/campaigns/:campaignId/settings",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaigns' => #{
            path => "/campaigns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCampaignsByLogin' => #{
            path => "/campaigns/by_login/:login",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCategoriesMaxSaleQuantum' => #{
            path => "/categories/max-sale-quantum",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCategoriesTree' => #{
            path => "/categories/tree",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetCategoryContentParameters' => #{
            path => "/category/:categoryId/parameters",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetChatHistory' => #{
            path => "/businesses/:businessId/chats/history",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetChats' => #{
            path => "/businesses/:businessId/chats",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetDeliveryServices' => #{
            path => "/delivery/services",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetFeedIndexLogs' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/index-logs",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetFeedbackAndCommentUpdates' => #{
            path => "/campaigns/:campaignId/feedback/updates",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetFeeds' => #{
            path => "/campaigns/:campaignId/feeds",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetGoodsFeedbackComments' => #{
            path => "/businesses/:businessId/goods-feedback/comments",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetGoodsFeedbacks' => #{
            path => "/businesses/:businessId/goods-feedback",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetGoodsStats' => #{
            path => "/campaigns/:campaignId/stats/skus",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOfferCardsContentStatus' => #{
            path => "/businesses/:businessId/offer-cards",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOfferRecommendations' => #{
            path => "/businesses/:businessId/offers/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrder' => #{
            path => "/campaigns/:campaignId/orders/:orderId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrderBusinessBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/business-buyer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrderBusinessDocumentsInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/documents",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrderLabelsData' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels/data",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrders' => #{
            path => "/campaigns/:campaignId/orders",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetOrdersStats' => #{
            path => "/campaigns/:campaignId/stats/orders",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetPrices' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetPricesByOfferIds' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetPromoOffers' => #{
            path => "/businesses/:businessId/promos/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetPromos' => #{
            path => "/businesses/:businessId/promos",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetQualityRatingDetails' => #{
            path => "/campaigns/:campaignId/ratings/quality/details",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetQualityRatings' => #{
            path => "/businesses/:businessId/ratings/quality",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetReportInfo' => #{
            path => "/reports/info/:reportId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetReturn' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetReturnApplication' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/application",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetReturnPhoto' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetReturns' => #{
            path => "/campaigns/:campaignId/returns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetSuggestedOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetSuggestedOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetSuggestedPrices' => #{
            path => "/campaigns/:campaignId/offer-prices/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'GetWarehouses' => #{
            path => "/businesses/:businessId/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'ProvideOrderItemIdentifiers' => #{
            path => "/campaigns/:campaignId/orders/:orderId/identifiers",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'PutBidsForBusiness' => #{
            path => "/businesses/:businessId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'PutBidsForCampaign' => #{
            path => "/campaigns/:campaignId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'RefreshFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/refresh",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SearchRegionChildren' => #{
            path => "/regions/:regionId/children",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SearchRegionsById' => #{
            path => "/regions/:regionId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SearchRegionsByName' => #{
            path => "/regions",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SendFileToChat' => #{
            path => "/businesses/:businessId/chats/file/send",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SendMessageToChat' => #{
            path => "/businesses/:businessId/chats/message",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SetFeedParams' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/params",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SetOrderBoxLayout' => #{
            path => "/campaigns/:campaignId/orders/:orderId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SetOrderShipmentBoxes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'SkipGoodsFeedbacksReaction' => #{
            path => "/businesses/:businessId/goods-feedback/skip-reaction",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateBusinessPrices' => #{
            path => "/businesses/:businessId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOfferContent' => #{
            path => "/businesses/:businessId/offer-cards/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOrderItems' => #{
            path => "/campaigns/:campaignId/orders/:orderId/items",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOrderStatus' => #{
            path => "/campaigns/:campaignId/orders/:orderId/status",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateOrderStatuses' => #{
            path => "/campaigns/:campaignId/orders/status-update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdatePrices' => #{
            path => "/campaigns/:campaignId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdatePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'UpdateStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'VerifyOrderEac' => #{
            path => "/campaigns/:campaignId/orders/:orderId/verifyEac",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_express_handler'
        },
        'AddHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'AddOffersToArchive' => #{
            path => "/businesses/:businessId/offer-mappings/archive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'CalculateTariffs' => #{
            path => "/tariffs/calculate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'ConfirmBusinessPrices' => #{
            path => "/businesses/:businessId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'ConfirmCampaignPrices' => #{
            path => "/campaigns/:campaignId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'ConfirmShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'CreateChat' => #{
            path => "/businesses/:businessId/chats/new",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeleteCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeleteGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeleteHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeleteOffers' => #{
            path => "/businesses/:businessId/offer-mappings/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeleteOffersFromArchive' => #{
            path => "/businesses/:businessId/offer-mappings/unarchive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DeletePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentDiscrepancyAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentInboundAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentPalletLabels' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentReceptionTransferAct' => #{
            path => "/campaigns/:campaignId/shipments/reception-transfer-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'DownloadShipmentTransportationWaybill' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateBoostConsolidatedReport' => #{
            path => "/reports/boost-consolidated/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateCompetitorsPositionReport' => #{
            path => "/reports/competitors-position/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateGoodsFeedbackReport' => #{
            path => "/reports/goods-feedback/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateGoodsRealizationReport' => #{
            path => "/reports/goods-realization/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateMassOrderLabelsReport' => #{
            path => "/reports/documents/labels/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateOrderLabel' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateOrderLabels' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GeneratePricesReport' => #{
            path => "/reports/prices/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateShelfsStatisticsReport' => #{
            path => "/reports/shelf-statistics/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateShipmentListDocumentReport' => #{
            path => "/reports/documents/shipment-list/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateShowsSalesReport' => #{
            path => "/reports/shows-sales/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateStocksOnWarehousesReport' => #{
            path => "/reports/stocks-on-warehouses/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateUnitedMarketplaceServicesReport' => #{
            path => "/reports/united-marketplace-services/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateUnitedNettingReport' => #{
            path => "/reports/united-netting/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GenerateUnitedOrdersReport' => #{
            path => "/reports/united-orders/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetAllOffers' => #{
            path => "/campaigns/:campaignId/offers/all",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetBidsInfoForBusiness' => #{
            path => "/businesses/:businessId/bids/info",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetBidsRecommendations' => #{
            path => "/businesses/:businessId/bids/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetBusinessQuarantineOffers' => #{
            path => "/businesses/:businessId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetBusinessSettings' => #{
            path => "/businesses/:businessId/settings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaign' => #{
            path => "/campaigns/:campaignId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignLogins' => #{
            path => "/campaigns/:campaignId/logins",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignQuarantineOffers' => #{
            path => "/campaigns/:campaignId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignRegion' => #{
            path => "/campaigns/:campaignId/region",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignSettings' => #{
            path => "/campaigns/:campaignId/settings",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaigns' => #{
            path => "/campaigns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCampaignsByLogin' => #{
            path => "/campaigns/by_login/:login",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCategoriesMaxSaleQuantum' => #{
            path => "/categories/max-sale-quantum",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCategoriesTree' => #{
            path => "/categories/tree",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetCategoryContentParameters' => #{
            path => "/category/:categoryId/parameters",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetChatHistory' => #{
            path => "/businesses/:businessId/chats/history",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetChats' => #{
            path => "/businesses/:businessId/chats",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetDeliveryServices' => #{
            path => "/delivery/services",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetFeedIndexLogs' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/index-logs",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetFeedbackAndCommentUpdates' => #{
            path => "/campaigns/:campaignId/feedback/updates",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetFeeds' => #{
            path => "/campaigns/:campaignId/feeds",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetGoodsFeedbackComments' => #{
            path => "/businesses/:businessId/goods-feedback/comments",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetGoodsFeedbacks' => #{
            path => "/businesses/:businessId/goods-feedback",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetGoodsStats' => #{
            path => "/campaigns/:campaignId/stats/skus",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOfferCardsContentStatus' => #{
            path => "/businesses/:businessId/offer-cards",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOfferRecommendations' => #{
            path => "/businesses/:businessId/offers/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrder' => #{
            path => "/campaigns/:campaignId/orders/:orderId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrderBusinessBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/business-buyer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrderBusinessDocumentsInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/documents",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrderLabelsData' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels/data",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrders' => #{
            path => "/campaigns/:campaignId/orders",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetOrdersStats' => #{
            path => "/campaigns/:campaignId/stats/orders",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetPrices' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetPricesByOfferIds' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetPromoOffers' => #{
            path => "/businesses/:businessId/promos/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetPromos' => #{
            path => "/businesses/:businessId/promos",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetQualityRatingDetails' => #{
            path => "/campaigns/:campaignId/ratings/quality/details",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetQualityRatings' => #{
            path => "/businesses/:businessId/ratings/quality",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetReportInfo' => #{
            path => "/reports/info/:reportId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetReturn' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetReturnApplication' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/application",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetReturnPhoto' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetReturns' => #{
            path => "/campaigns/:campaignId/returns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetShipmentOrdersInfo' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetSuggestedOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetSuggestedOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetSuggestedPrices' => #{
            path => "/campaigns/:campaignId/offer-prices/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'GetWarehouses' => #{
            path => "/businesses/:businessId/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'ProvideOrderItemIdentifiers' => #{
            path => "/campaigns/:campaignId/orders/:orderId/identifiers",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'PutBidsForBusiness' => #{
            path => "/businesses/:businessId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'PutBidsForCampaign' => #{
            path => "/campaigns/:campaignId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'RefreshFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/refresh",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SearchRegionChildren' => #{
            path => "/regions/:regionId/children",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SearchRegionsById' => #{
            path => "/regions/:regionId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SearchRegionsByName' => #{
            path => "/regions",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SearchShipments' => #{
            path => "/campaigns/:campaignId/first-mile/shipments",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SendFileToChat' => #{
            path => "/businesses/:businessId/chats/file/send",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SendMessageToChat' => #{
            path => "/businesses/:businessId/chats/message",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SetFeedParams' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/params",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SetOrderBoxLayout' => #{
            path => "/campaigns/:campaignId/orders/:orderId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SetOrderShipmentBoxes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SetShipmentPalletsCount' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'SkipGoodsFeedbacksReaction' => #{
            path => "/businesses/:businessId/goods-feedback/skip-reaction",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'TransferOrdersFromShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateBusinessPrices' => #{
            path => "/businesses/:businessId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOfferContent' => #{
            path => "/businesses/:businessId/offer-cards/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOrderItems' => #{
            path => "/campaigns/:campaignId/orders/:orderId/items",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOrderStatus' => #{
            path => "/campaigns/:campaignId/orders/:orderId/status",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateOrderStatuses' => #{
            path => "/campaigns/:campaignId/orders/status-update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdatePrices' => #{
            path => "/campaigns/:campaignId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdatePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'UpdateStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fbs_handler'
        },
        'AddHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'AddOffersToArchive' => #{
            path => "/businesses/:businessId/offer-mappings/archive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'CalculateTariffs' => #{
            path => "/tariffs/calculate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'ConfirmBusinessPrices' => #{
            path => "/businesses/:businessId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'ConfirmCampaignPrices' => #{
            path => "/campaigns/:campaignId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'CreateChat' => #{
            path => "/businesses/:businessId/chats/new",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeleteCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeleteGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeleteHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeleteOffers' => #{
            path => "/businesses/:businessId/offer-mappings/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeleteOffersFromArchive' => #{
            path => "/businesses/:businessId/offer-mappings/unarchive",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'DeletePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateBoostConsolidatedReport' => #{
            path => "/reports/boost-consolidated/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateCompetitorsPositionReport' => #{
            path => "/reports/competitors-position/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateGoodsFeedbackReport' => #{
            path => "/reports/goods-feedback/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateGoodsMovementReport' => #{
            path => "/reports/goods-movement/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateGoodsRealizationReport' => #{
            path => "/reports/goods-realization/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateGoodsTurnoverReport' => #{
            path => "/reports/goods-turnover/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GeneratePricesReport' => #{
            path => "/reports/prices/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateShelfsStatisticsReport' => #{
            path => "/reports/shelf-statistics/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateShowsSalesReport' => #{
            path => "/reports/shows-sales/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateStocksOnWarehousesReport' => #{
            path => "/reports/stocks-on-warehouses/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateUnitedMarketplaceServicesReport' => #{
            path => "/reports/united-marketplace-services/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateUnitedNettingReport' => #{
            path => "/reports/united-netting/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GenerateUnitedOrdersReport' => #{
            path => "/reports/united-orders/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetAllOffers' => #{
            path => "/campaigns/:campaignId/offers/all",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetBidsInfoForBusiness' => #{
            path => "/businesses/:businessId/bids/info",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetBidsRecommendations' => #{
            path => "/businesses/:businessId/bids/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetBusinessQuarantineOffers' => #{
            path => "/businesses/:businessId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetBusinessSettings' => #{
            path => "/businesses/:businessId/settings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaign' => #{
            path => "/campaigns/:campaignId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignLogins' => #{
            path => "/campaigns/:campaignId/logins",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignQuarantineOffers' => #{
            path => "/campaigns/:campaignId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignRegion' => #{
            path => "/campaigns/:campaignId/region",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignSettings' => #{
            path => "/campaigns/:campaignId/settings",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaigns' => #{
            path => "/campaigns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCampaignsByLogin' => #{
            path => "/campaigns/by_login/:login",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCategoriesMaxSaleQuantum' => #{
            path => "/categories/max-sale-quantum",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCategoriesTree' => #{
            path => "/categories/tree",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetCategoryContentParameters' => #{
            path => "/category/:categoryId/parameters",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetChatHistory' => #{
            path => "/businesses/:businessId/chats/history",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetChats' => #{
            path => "/businesses/:businessId/chats",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFeedIndexLogs' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/index-logs",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFeedbackAndCommentUpdates' => #{
            path => "/campaigns/:campaignId/feedback/updates",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFeeds' => #{
            path => "/campaigns/:campaignId/feeds",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFulfillmentWarehouses' => #{
            path => "/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetGoodsFeedbackComments' => #{
            path => "/businesses/:businessId/goods-feedback/comments",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetGoodsFeedbacks' => #{
            path => "/businesses/:businessId/goods-feedback",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetGoodsStats' => #{
            path => "/campaigns/:campaignId/stats/skus",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOfferCardsContentStatus' => #{
            path => "/businesses/:businessId/offer-cards",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOfferRecommendations' => #{
            path => "/businesses/:businessId/offers/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOrder' => #{
            path => "/campaigns/:campaignId/orders/:orderId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOrderBusinessBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/business-buyer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOrderBusinessDocumentsInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/documents",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOrders' => #{
            path => "/campaigns/:campaignId/orders",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetOrdersStats' => #{
            path => "/campaigns/:campaignId/stats/orders",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetPrices' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetPricesByOfferIds' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetPromoOffers' => #{
            path => "/businesses/:businessId/promos/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetPromos' => #{
            path => "/businesses/:businessId/promos",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetQualityRatings' => #{
            path => "/businesses/:businessId/ratings/quality",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetReportInfo' => #{
            path => "/reports/info/:reportId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetReturn' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetReturnPhoto' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetReturns' => #{
            path => "/campaigns/:campaignId/returns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetSuggestedOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetSuggestedOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetSuggestedPrices' => #{
            path => "/campaigns/:campaignId/offer-prices/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'PutBidsForBusiness' => #{
            path => "/businesses/:businessId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'PutBidsForCampaign' => #{
            path => "/campaigns/:campaignId/bids",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'RefreshFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/refresh",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SearchRegionChildren' => #{
            path => "/regions/:regionId/children",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SearchRegionsById' => #{
            path => "/regions/:regionId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SearchRegionsByName' => #{
            path => "/regions",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SendFileToChat' => #{
            path => "/businesses/:businessId/chats/file/send",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SendMessageToChat' => #{
            path => "/businesses/:businessId/chats/message",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SetFeedParams' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/params",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'SkipGoodsFeedbacksReaction' => #{
            path => "/businesses/:businessId/goods-feedback/skip-reaction",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateBusinessPrices' => #{
            path => "/businesses/:businessId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateOfferContent' => #{
            path => "/businesses/:businessId/offer-cards/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdateOfferMappings' => #{
            path => "/businesses/:businessId/offer-mappings/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdatePrices' => #{
            path => "/campaigns/:campaignId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'UpdatePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_fby_handler'
        },
        'GetFeedbackAndCommentUpdates' => #{
            path => "/campaigns/:campaignId/feedback/updates",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_feedbacks_handler'
        },
        'GetFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_feeds_handler'
        },
        'GetFeedIndexLogs' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/index-logs",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_feeds_handler'
        },
        'GetFeeds' => #{
            path => "/campaigns/:campaignId/feeds",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_feeds_handler'
        },
        'RefreshFeed' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/refresh",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_feeds_handler'
        },
        'SetFeedParams' => #{
            path => "/campaigns/:campaignId/feeds/:feedId/params",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_feeds_handler'
        },
        'DeleteGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_feedback_handler'
        },
        'GetGoodsFeedbackComments' => #{
            path => "/businesses/:businessId/goods-feedback/comments",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_feedback_handler'
        },
        'GetGoodsFeedbacks' => #{
            path => "/businesses/:businessId/goods-feedback",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_feedback_handler'
        },
        'SkipGoodsFeedbacksReaction' => #{
            path => "/businesses/:businessId/goods-feedback/skip-reaction",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_feedback_handler'
        },
        'UpdateGoodsFeedbackComment' => #{
            path => "/businesses/:businessId/goods-feedback/comments/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_feedback_handler'
        },
        'GetGoodsStats' => #{
            path => "/campaigns/:campaignId/stats/skus",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_goods_stats_handler'
        },
        'AddHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_hidden_offers_handler'
        },
        'DeleteHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_hidden_offers_handler'
        },
        'GetHiddenOffers' => #{
            path => "/campaigns/:campaignId/hidden-offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_hidden_offers_handler'
        },
        'GetModel' => #{
            path => "/models/:modelId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_models_handler'
        },
        'GetModelOffers' => #{
            path => "/models/:modelId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_models_handler'
        },
        'GetModels' => #{
            path => "/models",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_models_handler'
        },
        'GetModelsOffers' => #{
            path => "/models/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_models_handler'
        },
        'SearchModels' => #{
            path => "/models",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_models_handler'
        },
        'GetOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_offer_mappings_handler'
        },
        'GetSuggestedOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offer_mappings_handler'
        },
        'UpdateOfferMappingEntries' => #{
            path => "/campaigns/:campaignId/offer-mapping-entries/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offer_mappings_handler'
        },
        'DeleteCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'GetAllOffers' => #{
            path => "/campaigns/:campaignId/offers/all",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'GetCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'GetOfferRecommendations' => #{
            path => "/businesses/:businessId/offers/recommendations",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'GetOffers' => #{
            path => "/campaigns/:campaignId/offers",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'UpdateCampaignOffers' => #{
            path => "/campaigns/:campaignId/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_offers_handler'
        },
        'GetOrderBusinessBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/business-buyer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_order_business_information_handler'
        },
        'GetOrderBusinessDocumentsInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/documents",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_order_business_information_handler'
        },
        'GetOrderBuyerInfo' => #{
            path => "/campaigns/:campaignId/orders/:orderId/buyer",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_order_delivery_handler'
        },
        'SetOrderDeliveryDate' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/date",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_order_delivery_handler'
        },
        'SetOrderDeliveryTrackCode' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/track",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_order_delivery_handler'
        },
        'UpdateOrderStorageLimit' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/storage-limit",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_order_delivery_handler'
        },
        'VerifyOrderEac' => #{
            path => "/campaigns/:campaignId/orders/:orderId/verifyEac",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_order_delivery_handler'
        },
        'GenerateOrderLabel' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes/:boxId/label",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_order_labels_handler'
        },
        'GenerateOrderLabels' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_order_labels_handler'
        },
        'GetOrderLabelsData' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/labels/data",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_order_labels_handler'
        },
        'AcceptOrderCancellation' => #{
            path => "/campaigns/:campaignId/orders/:orderId/cancellation/accept",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'GetOrder' => #{
            path => "/campaigns/:campaignId/orders/:orderId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'GetOrders' => #{
            path => "/campaigns/:campaignId/orders",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'ProvideOrderDigitalCodes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/deliverDigitalGoods",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'ProvideOrderItemIdentifiers' => #{
            path => "/campaigns/:campaignId/orders/:orderId/identifiers",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'SetOrderBoxLayout' => #{
            path => "/campaigns/:campaignId/orders/:orderId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'SetOrderShipmentBoxes' => #{
            path => "/campaigns/:campaignId/orders/:orderId/delivery/shipments/:shipmentId/boxes",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'UpdateOrderItems' => #{
            path => "/campaigns/:campaignId/orders/:orderId/items",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'UpdateOrderStatus' => #{
            path => "/campaigns/:campaignId/orders/:orderId/status",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'UpdateOrderStatuses' => #{
            path => "/campaigns/:campaignId/orders/status-update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_orders_handler'
        },
        'GetOrdersStats' => #{
            path => "/campaigns/:campaignId/stats/orders",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_orders_stats_handler'
        },
        'DeleteOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"DELETE">>,
            handler => 'ympa_erlang_server_outlet_licenses_handler'
        },
        'GetOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_outlet_licenses_handler'
        },
        'UpdateOutletLicenses' => #{
            path => "/campaigns/:campaignId/outlets/licenses",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_outlet_licenses_handler'
        },
        'CreateOutlet' => #{
            path => "/campaigns/:campaignId/outlets",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_outlets_handler'
        },
        'DeleteOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"DELETE">>,
            handler => 'ympa_erlang_server_outlets_handler'
        },
        'GetOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_outlets_handler'
        },
        'GetOutlets' => #{
            path => "/campaigns/:campaignId/outlets",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_outlets_handler'
        },
        'UpdateOutlet' => #{
            path => "/campaigns/:campaignId/outlets/:outletId",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_outlets_handler'
        },
        'ConfirmBusinessPrices' => #{
            path => "/businesses/:businessId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_price_quarantine_handler'
        },
        'ConfirmCampaignPrices' => #{
            path => "/campaigns/:campaignId/price-quarantine/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_price_quarantine_handler'
        },
        'GetBusinessQuarantineOffers' => #{
            path => "/businesses/:businessId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_price_quarantine_handler'
        },
        'GetCampaignQuarantineOffers' => #{
            path => "/campaigns/:campaignId/price-quarantine",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_price_quarantine_handler'
        },
        'GetPrices' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_prices_handler'
        },
        'GetPricesByOfferIds' => #{
            path => "/campaigns/:campaignId/offer-prices",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_prices_handler'
        },
        'GetSuggestedPrices' => #{
            path => "/campaigns/:campaignId/offer-prices/suggestions",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_prices_handler'
        },
        'UpdateBusinessPrices' => #{
            path => "/businesses/:businessId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_prices_handler'
        },
        'UpdatePrices' => #{
            path => "/campaigns/:campaignId/offer-prices/updates",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_prices_handler'
        },
        'DeletePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/delete",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_promos_handler'
        },
        'GetPromoOffers' => #{
            path => "/businesses/:businessId/promos/offers",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_promos_handler'
        },
        'GetPromos' => #{
            path => "/businesses/:businessId/promos",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_promos_handler'
        },
        'UpdatePromoOffers' => #{
            path => "/businesses/:businessId/promos/offers/update",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_promos_handler'
        },
        'GetQualityRatingDetails' => #{
            path => "/campaigns/:campaignId/ratings/quality/details",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_ratings_handler'
        },
        'GetQualityRatings' => #{
            path => "/businesses/:businessId/ratings/quality",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_ratings_handler'
        },
        'SearchRegionChildren' => #{
            path => "/regions/:regionId/children",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_regions_handler'
        },
        'SearchRegionsById' => #{
            path => "/regions/:regionId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_regions_handler'
        },
        'SearchRegionsByName' => #{
            path => "/regions",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_regions_handler'
        },
        'GenerateBoostConsolidatedReport' => #{
            path => "/reports/boost-consolidated/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateCompetitorsPositionReport' => #{
            path => "/reports/competitors-position/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateGoodsFeedbackReport' => #{
            path => "/reports/goods-feedback/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateGoodsMovementReport' => #{
            path => "/reports/goods-movement/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateGoodsRealizationReport' => #{
            path => "/reports/goods-realization/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateGoodsTurnoverReport' => #{
            path => "/reports/goods-turnover/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateMassOrderLabelsReport' => #{
            path => "/reports/documents/labels/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GeneratePricesReport' => #{
            path => "/reports/prices/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateShelfsStatisticsReport' => #{
            path => "/reports/shelf-statistics/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateShipmentListDocumentReport' => #{
            path => "/reports/documents/shipment-list/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateShowsSalesReport' => #{
            path => "/reports/shows-sales/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateStocksOnWarehousesReport' => #{
            path => "/reports/stocks-on-warehouses/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateUnitedMarketplaceServicesReport' => #{
            path => "/reports/united-marketplace-services/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateUnitedNettingReport' => #{
            path => "/reports/united-netting/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GenerateUnitedOrdersReport' => #{
            path => "/reports/united-orders/generate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GetReportInfo' => #{
            path => "/reports/info/:reportId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_reports_handler'
        },
        'GetReturn' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'GetReturnApplication' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/application",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'GetReturnPhoto' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'GetReturns' => #{
            path => "/campaigns/:campaignId/returns",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'SetReturnDecision' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'SubmitReturnDecision' => #{
            path => "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_returns_handler'
        },
        'ConfirmShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/confirm",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentDiscrepancyAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/discrepancy-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentInboundAct' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/inbound-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentPalletLabels' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallet/labels",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentReceptionTransferAct' => #{
            path => "/campaigns/:campaignId/shipments/reception-transfer-act",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'DownloadShipmentTransportationWaybill' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/transportation-waybill",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'GetShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'GetShipmentOrdersInfo' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/info",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'SearchShipments' => #{
            path => "/campaigns/:campaignId/first-mile/shipments",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'SetShipmentPalletsCount' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/pallets",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'TransferOrdersFromShipment' => #{
            path => "/campaigns/:campaignId/first-mile/shipments/:shipmentId/orders/transfer",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_shipments_handler'
        },
        'GetStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_stocks_handler'
        },
        'UpdateStocks' => #{
            path => "/campaigns/:campaignId/offers/stocks",
            method => <<"PUT">>,
            handler => 'ympa_erlang_server_stocks_handler'
        },
        'CalculateTariffs' => #{
            path => "/tariffs/calculate",
            method => <<"POST">>,
            handler => 'ympa_erlang_server_tariffs_handler'
        },
        'GetFulfillmentWarehouses' => #{
            path => "/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_warehouses_handler'
        },
        'GetWarehouses' => #{
            path => "/businesses/:businessId/warehouses",
            method => <<"GET">>,
            handler => 'ympa_erlang_server_warehouses_handler'
        }
    }.

get_validator_state() ->
    persistent_term:get({?MODULE, validator_state}).


prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    JesseState = jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]),
    persistent_term:put({?MODULE, validator_state}, JesseState),
    ?MODULE.


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(ympa_erlang_server_utils:priv_dir(AppName), "openapi.json").
