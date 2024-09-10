-module(ympa_erlang_client_order_labels_api).

-export([generate_order_label/5, generate_order_label/6,
         generate_order_labels/3, generate_order_labels/4,
         get_order_labels_data/3, get_order_labels_data/4]).

-define(BASE_URL, <<"">>).

%% @doc Готовый ярлык‑наклейка для коробки в заказе
%% Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec generate_order_label(ctx:ctx(), integer(), integer(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId) ->
    generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId, #{}).

-spec generate_order_label(ctx:ctx(), integer(), integer(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/shipments/", ShipmentId, "/boxes/", BoxId, "/label"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Готовые ярлыки‑наклейки на все коробки в одном заказе
%% Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec generate_order_labels(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_labels(Ctx, CampaignId, OrderId) ->
    generate_order_labels(Ctx, CampaignId, OrderId, #{}).

-spec generate_order_labels(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_labels(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/labels"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Данные для самостоятельного изготовления ярлыков
%% Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec get_order_labels_data(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_order_labels_data_response:ympa_erlang_client_get_order_labels_data_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_labels_data(Ctx, CampaignId, OrderId) ->
    get_order_labels_data(Ctx, CampaignId, OrderId, #{}).

-spec get_order_labels_data(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_order_labels_data_response:ympa_erlang_client_get_order_labels_data_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_labels_data(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/labels/data"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


