-module(ympa_erlang_client_warehouses_api).

-export([get_fulfillment_warehouses/1, get_fulfillment_warehouses/2,
         get_warehouses/2, get_warehouses/3]).

-define(BASE_URL, <<"">>).

%% @doc Идентификаторы складов Маркета (FBY)
%% Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_fulfillment_warehouses(ctx:ctx()) -> {ok, ympa_erlang_client_get_fulfillment_warehouses_response:ympa_erlang_client_get_fulfillment_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_fulfillment_warehouses(Ctx) ->
    get_fulfillment_warehouses(Ctx, #{}).

-spec get_fulfillment_warehouses(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_fulfillment_warehouses_response:ympa_erlang_client_get_fulfillment_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_fulfillment_warehouses(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/warehouses"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список складов и групп складов
%% Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_warehouses(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_warehouses_response:ympa_erlang_client_get_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_warehouses(Ctx, BusinessId) ->
    get_warehouses(Ctx, BusinessId, #{}).

-spec get_warehouses(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_warehouses_response:ympa_erlang_client_get_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_warehouses(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/warehouses"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


