%% basic handler
-module(ympa_erlang_server_express_handler).

%% Cowboy REST callbacks
-export([allowed_methods/2]).
-export([init/2]).
-export([allow_missing_post/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([known_content_type/2]).
-export([malformed_request/2]).
-export([valid_content_headers/2]).
-export([valid_entity_length/2]).

%% Handlers
-export([handle_request_json/2]).

-record(state, {
    operation_id :: ympa_erlang_server_api:operation_id(),
    logic_handler :: atom(),
    validator_state :: jesse_state:state(),
    context=#{} :: #{}
}).

-type state() :: state().

-spec init(Req :: cowboy_req:req(), Opts :: ympa_erlang_server_router:init_opts()) ->
    {cowboy_rest, Req :: cowboy_req:req(), State :: state()}.

init(Req, {Operations, LogicHandler, ValidatorMod}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),

    ValidatorState = ValidatorMod:get_validator_state(),

    error_logger:info_msg("Attempt to process operation: ~p", [OperationID]),

    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState
    },
    {cowboy_rest, Req, State}.

-spec allowed_methods(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: [binary()], Req :: cowboy_req:req(), State :: state()}.


allowed_methods(
    Req,
    State = #state{
        operation_id = 'AddHiddenOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'AddOffersToArchive'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CalculateTariffs'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ConfirmBusinessPrices'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ConfirmCampaignPrices'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateChat'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteCampaignOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteGoodsFeedbackComment'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteHiddenOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteOffersFromArchive'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeletePromoOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateBoostConsolidatedReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateCompetitorsPositionReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateGoodsFeedbackReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateGoodsRealizationReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateMassOrderLabelsReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateOrderLabel'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateOrderLabels'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GeneratePricesReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateShelfsStatisticsReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateShowsSalesReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateStocksOnWarehousesReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateUnitedMarketplaceServicesReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateUnitedNettingReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GenerateUnitedOrdersReport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAllOffers'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetBidsInfoForBusiness'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetBidsRecommendations'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetBusinessQuarantineOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetBusinessSettings'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaign'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignLogins'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignQuarantineOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignRegion'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignSettings'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaigns'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCampaignsByLogin'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCategoriesMaxSaleQuantum'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCategoriesTree'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetCategoryContentParameters'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetChatHistory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetChats'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDeliveryServices'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFeed'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFeedIndexLogs'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFeedbackAndCommentUpdates'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFeeds'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetGoodsFeedbackComments'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetGoodsFeedbacks'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetGoodsStats'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetHiddenOffers'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOfferCardsContentStatus'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOfferMappingEntries'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOfferMappings'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOfferRecommendations'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOffers'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrder'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrderBusinessBuyerInfo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrderBusinessDocumentsInfo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrderLabelsData'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrders'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrdersStats'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetPrices'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetPricesByOfferIds'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetPromoOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetPromos'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetQualityRatingDetails'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetQualityRatings'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetReportInfo'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetReturn'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetReturnApplication'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetReturnPhoto'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetReturns'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetStocks'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetSuggestedOfferMappingEntries'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetSuggestedOfferMappings'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetSuggestedPrices'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetWarehouses'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ProvideOrderItemIdentifiers'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'PutBidsForBusiness'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'PutBidsForCampaign'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'RefreshFeed'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SearchRegionChildren'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SearchRegionsById'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SearchRegionsByName'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SendFileToChat'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SendMessageToChat'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SetFeedParams'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SetOrderBoxLayout'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SetOrderShipmentBoxes'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'SkipGoodsFeedbacksReaction'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateBusinessPrices'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateCampaignOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateGoodsFeedbackComment'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOfferContent'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOfferMappingEntries'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOfferMappings'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOrderItems'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOrderStatus'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOrderStatuses'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdatePrices'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdatePromoOffers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateStocks'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'VerifyOrderEac'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: true | {false, AuthHeader :: iodata()},
        Req :: cowboy_req:req(),
        State :: state()
    }.
is_authorized(
    Req0,
    State = #state{
        operation_id = 'AddHiddenOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'AddOffersToArchive' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'CalculateTariffs' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ConfirmBusinessPrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ConfirmCampaignPrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'CreateChat' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeleteCampaignOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeleteGoodsFeedbackComment' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeleteHiddenOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeleteOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeleteOffersFromArchive' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'DeletePromoOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateBoostConsolidatedReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateCompetitorsPositionReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateGoodsFeedbackReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateGoodsRealizationReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateMassOrderLabelsReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateOrderLabel' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateOrderLabels' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GeneratePricesReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateShelfsStatisticsReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateShowsSalesReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateStocksOnWarehousesReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedMarketplaceServicesReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedNettingReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedOrdersReport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetAllOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetBidsInfoForBusiness' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetBidsRecommendations' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetBusinessQuarantineOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetBusinessSettings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaign' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignLogins' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignQuarantineOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignRegion' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignSettings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaigns' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCampaignsByLogin' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCategoriesMaxSaleQuantum' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCategoriesTree' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetCategoryContentParameters' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetChatHistory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetChats' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetDeliveryServices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetFeed' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetFeedIndexLogs' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetFeedbackAndCommentUpdates' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetFeeds' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetGoodsFeedbackComments' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetGoodsFeedbacks' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetGoodsStats' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetHiddenOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOfferCardsContentStatus' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOfferMappingEntries' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOfferMappings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOfferRecommendations' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrder' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrderBusinessBuyerInfo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrderBusinessDocumentsInfo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrderLabelsData' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrders' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetOrdersStats' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetPrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetPricesByOfferIds' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetPromoOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetPromos' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetQualityRatingDetails' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetQualityRatings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetReportInfo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetReturn' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetReturnApplication' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetReturnPhoto' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetReturns' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetStocks' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedOfferMappingEntries' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedOfferMappings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedPrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GetWarehouses' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ProvideOrderItemIdentifiers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'PutBidsForBusiness' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'PutBidsForCampaign' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'RefreshFeed' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SearchRegionChildren' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SearchRegionsById' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SearchRegionsByName' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SendFileToChat' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SendMessageToChat' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SetFeedParams' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SetOrderBoxLayout' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SetOrderShipmentBoxes' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'SkipGoodsFeedbacksReaction' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateBusinessPrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateCampaignOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateGoodsFeedbackComment' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferContent' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferMappingEntries' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferMappings' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderItems' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderStatus' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderStatuses' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdatePrices' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdatePromoOffers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'UpdateStocks' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(
    Req0,
    State = #state{
        operation_id = 'VerifyOrderEac' = OperationID,
        logic_handler = LogicHandler
    }
) ->
    From = header,
    Result = ympa_erlang_server_auth:authorize_api_key(
        LogicHandler,
        OperationID,
        From,
        "Authorization",
        Req0
    ),
    case Result of
        {true, Context, Req} ->  {true, Req, State#state{context = Context}};
        {false, AuthHeader, Req} ->  {{false, AuthHeader}, Req, State}
    end;
is_authorized(Req, State) ->
    {{false, <<"">>}, Req, State}.

-spec content_types_accepted(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), AcceptResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_accepted(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec valid_content_headers(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: boolean(), Req :: cowboy_req:req(), State :: state()}.

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AddHiddenOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AddOffersToArchive'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CalculateTariffs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ConfirmBusinessPrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ConfirmCampaignPrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateChat'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteCampaignOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteGoodsFeedbackComment'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteHiddenOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteOffersFromArchive'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeletePromoOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateBoostConsolidatedReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateCompetitorsPositionReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateGoodsFeedbackReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateGoodsRealizationReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateMassOrderLabelsReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateOrderLabel'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateOrderLabels'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GeneratePricesReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateShelfsStatisticsReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateShowsSalesReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateStocksOnWarehousesReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedMarketplaceServicesReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedNettingReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GenerateUnitedOrdersReport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAllOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetBidsInfoForBusiness'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetBidsRecommendations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetBusinessQuarantineOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetBusinessSettings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaign'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignLogins'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignQuarantineOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignRegion'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignSettings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaigns'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCampaignsByLogin'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCategoriesMaxSaleQuantum'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCategoriesTree'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetCategoryContentParameters'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetChatHistory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetChats'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDeliveryServices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFeed'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFeedIndexLogs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFeedbackAndCommentUpdates'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFeeds'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetGoodsFeedbackComments'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetGoodsFeedbacks'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetGoodsStats'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetHiddenOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOfferCardsContentStatus'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOfferMappingEntries'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOfferMappings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOfferRecommendations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrder'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrderBusinessBuyerInfo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrderBusinessDocumentsInfo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrderLabelsData'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrders'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrdersStats'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetPrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetPricesByOfferIds'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetPromoOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetPromos'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetQualityRatingDetails'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetQualityRatings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetReportInfo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetReturn'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetReturnApplication'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetReturnPhoto'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetReturns'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetStocks'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedOfferMappingEntries'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedOfferMappings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetSuggestedPrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetWarehouses'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ProvideOrderItemIdentifiers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'PutBidsForBusiness'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'PutBidsForCampaign'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'RefreshFeed'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SearchRegionChildren'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SearchRegionsById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SearchRegionsByName'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SendFileToChat'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SendMessageToChat'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SetFeedParams'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SetOrderBoxLayout'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SetOrderShipmentBoxes'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'SkipGoodsFeedbacksReaction'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateBusinessPrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateCampaignOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateGoodsFeedbackComment'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferContent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferMappingEntries'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOfferMappings'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderItems'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderStatus'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOrderStatuses'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdatePrices'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdatePromoOffers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateStocks'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'VerifyOrderEac'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), ProvideResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_provided(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec malformed_request(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

malformed_request(Req, State) ->
    {false, Req, State}.

-spec allow_missing_post(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

allow_missing_post(Req, State) ->
    {false, Req, State}.

-spec delete_resource(Req :: cowboy_req:req(), State :: state()) ->
    processed_response().

delete_resource(Req, State) ->
    handle_request_json(Req, State).

-spec known_content_type(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

known_content_type(Req, State) ->
    {true, Req, State}.

-spec valid_entity_length(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

valid_entity_length(Req, State) ->
    %% @TODO check the length
    {true, Req, State}.

%%%%
-type result_ok() :: {
    ok,
    {Status :: cowboy:http_status(), Headers :: cowboy:http_headers(), Body :: iodata()}
}.

-type result_error() :: {error, Reason :: any()}.

-type processed_response() :: {stop, cowboy_req:req(), state()}.

-spec process_response(result_ok() | result_error(), cowboy_req:req(), state()) ->
    processed_response().

process_response(Response, Req0, State = #state{operation_id = OperationID}) ->
    case Response of
        {ok, {Code, Headers, Body}} ->
            Req = cowboy_req:reply(Code, Headers, Body, Req0),
            {stop, Req, State};
        {error, Message} ->
            error_logger:error_msg("Unable to process request for ~p: ~p", [OperationID, Message]),

            Req = cowboy_req:reply(400, Req0),
            {stop, Req, State}
    end.

-spec handle_request_json(cowboy_req:req(), state()) -> processed_response().

handle_request_json(
    Req0,
    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState
    }
) ->
    case ympa_erlang_server_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Populated, Req1} ->
            {Code, Headers, Body} = ympa_erlang_server_logic_handler:handle_request(
                LogicHandler,
                OperationID,
                Req1,
                maps:merge(State#state.context, Populated)
            ),
            _ = ympa_erlang_server_api:validate_response(
                OperationID,
                Code,
                Body,
                ValidatorState
            ),
            PreparedBody = prepare_body(Code, Body),
            Response = {ok, {Code, Headers, PreparedBody}},
            process_response(Response, Req1, State);
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, State)
    end.

validate_headers(_, Req) -> {true, Req}.

prepare_body(204, Body) when map_size(Body) == 0; length(Body) == 0 ->
    <<>>;
prepare_body(304, Body) when map_size(Body) == 0; length(Body) == 0 ->
    <<>>;
prepare_body(_Code, Body) ->
    jsx:encode(Body).
