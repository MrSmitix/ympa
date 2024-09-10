-module(ympa_erlang_client_returns_api).

-export([get_return/4, get_return/5,
         get_return_application/4, get_return_application/5,
         get_return_photo/6, get_return_photo/7,
         get_returns/2, get_returns/3,
         set_return_decision/5, set_return_decision/6,
         submit_return_decision/4, submit_return_decision/5]).

-define(BASE_URL, <<"">>).

%% @doc Информация о невыкупе или возврате
%% Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return(ctx:ctx(), integer(), integer(), integer()) -> {ok, ympa_erlang_client_get_return_response:ympa_erlang_client_get_return_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return(Ctx, CampaignId, OrderId, ReturnId) ->
    get_return(Ctx, CampaignId, OrderId, ReturnId, #{}).

-spec get_return(ctx:ctx(), integer(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_return_response:ympa_erlang_client_get_return_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return(Ctx, CampaignId, OrderId, ReturnId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение заявления на возврат
%% Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return_application(ctx:ctx(), integer(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_application(Ctx, CampaignId, OrderId, ReturnId) ->
    get_return_application(Ctx, CampaignId, OrderId, ReturnId, #{}).

-spec get_return_application(ctx:ctx(), integer(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_application(Ctx, CampaignId, OrderId, ReturnId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/application"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение фотографии возврата
%% Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return_photo(ctx:ctx(), integer(), integer(), integer(), integer(), binary()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash) ->
    get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash, #{}).

-spec get_return_photo(ctx:ctx(), integer(), integer(), integer(), integer(), binary(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/decision/", ItemId, "/image/", ImageHash, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список невыкупов и возвратов
%% Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_returns(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_returns_response:ympa_erlang_client_get_returns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_returns(Ctx, CampaignId) ->
    get_returns(Ctx, CampaignId, #{}).

-spec get_returns(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_returns_response:ympa_erlang_client_get_returns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_returns(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/returns"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'orderIds', 'statuses', 'type', 'fromDate', 'toDate', 'from_date', 'to_date'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Принятие или изменение решения по возврату
%% Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec set_return_decision(ctx:ctx(), integer(), integer(), integer(), ympa_erlang_client_set_return_decision_request:ympa_erlang_client_set_return_decision_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_return_decision(Ctx, CampaignId, OrderId, ReturnId, YmpaErlangClientSetReturnDecisionRequest) ->
    set_return_decision(Ctx, CampaignId, OrderId, ReturnId, YmpaErlangClientSetReturnDecisionRequest, #{}).

-spec set_return_decision(ctx:ctx(), integer(), integer(), integer(), ympa_erlang_client_set_return_decision_request:ympa_erlang_client_set_return_decision_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_return_decision(Ctx, CampaignId, OrderId, ReturnId, YmpaErlangClientSetReturnDecisionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/decision"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetReturnDecisionRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Подтверждение решения по возврату
%% Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec submit_return_decision(ctx:ctx(), integer(), integer(), integer()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
submit_return_decision(Ctx, CampaignId, OrderId, ReturnId) ->
    submit_return_decision(Ctx, CampaignId, OrderId, ReturnId, #{}).

-spec submit_return_decision(ctx:ctx(), integer(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
submit_return_decision(Ctx, CampaignId, OrderId, ReturnId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/decision/submit"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


