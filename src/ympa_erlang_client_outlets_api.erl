-module(ympa_erlang_client_outlets_api).

-export([create_outlet/3, create_outlet/4,
         delete_outlet/3, delete_outlet/4,
         get_outlet/3, get_outlet/4,
         get_outlets/2, get_outlets/3,
         update_outlet/4, update_outlet/5]).

-define(BASE_URL, <<"">>).

%% @doc Создание точки продаж
%% Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-spec create_outlet(ctx:ctx(), integer(), ympa_erlang_client_change_outlet_request:ympa_erlang_client_change_outlet_request()) -> {ok, ympa_erlang_client_create_outlet_response:ympa_erlang_client_create_outlet_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_outlet(Ctx, CampaignId, YmpaErlangClientChangeOutletRequest) ->
    create_outlet(Ctx, CampaignId, YmpaErlangClientChangeOutletRequest, #{}).

-spec create_outlet(ctx:ctx(), integer(), ympa_erlang_client_change_outlet_request:ympa_erlang_client_change_outlet_request(), maps:map()) -> {ok, ympa_erlang_client_create_outlet_response:ympa_erlang_client_create_outlet_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_outlet(Ctx, CampaignId, YmpaErlangClientChangeOutletRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/outlets"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientChangeOutletRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Удаление точки продаж
%% Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-spec delete_outlet(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_outlet(Ctx, CampaignId, OutletId) ->
    delete_outlet(Ctx, CampaignId, OutletId, #{}).

-spec delete_outlet(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_outlet(Ctx, CampaignId, OutletId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = delete,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/outlets/", OutletId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация об одной точке продаж
%% Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-spec get_outlet(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_outlet_response:ympa_erlang_client_get_outlet_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_outlet(Ctx, CampaignId, OutletId) ->
    get_outlet(Ctx, CampaignId, OutletId, #{}).

-spec get_outlet(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_outlet_response:ympa_erlang_client_get_outlet_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_outlet(Ctx, CampaignId, OutletId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/outlets/", OutletId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о нескольких точках продаж
%% Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-spec get_outlets(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_outlets_response:ympa_erlang_client_get_outlets_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_outlets(Ctx, CampaignId) ->
    get_outlets(Ctx, CampaignId, #{}).

-spec get_outlets(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_outlets_response:ympa_erlang_client_get_outlets_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_outlets(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/outlets"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'region_id', 'shop_outlet_code', 'regionId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение информации о точке продаж
%% Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
-spec update_outlet(ctx:ctx(), integer(), integer(), ympa_erlang_client_change_outlet_request:ympa_erlang_client_change_outlet_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_outlet(Ctx, CampaignId, OutletId, YmpaErlangClientChangeOutletRequest) ->
    update_outlet(Ctx, CampaignId, OutletId, YmpaErlangClientChangeOutletRequest, #{}).

-spec update_outlet(ctx:ctx(), integer(), integer(), ympa_erlang_client_change_outlet_request:ympa_erlang_client_change_outlet_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_outlet(Ctx, CampaignId, OutletId, YmpaErlangClientChangeOutletRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/outlets/", OutletId, ""],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientChangeOutletRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


