-module(ympa_erlang_client_delivery_services_api).

-export([get_delivery_services/1, get_delivery_services/2]).

-define(BASE_URL, <<"">>).

%% @doc Справочник служб доставки
%% Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-spec get_delivery_services(ctx:ctx()) -> {ok, ympa_erlang_client_get_delivery_services_response:ympa_erlang_client_get_delivery_services_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_delivery_services(Ctx) ->
    get_delivery_services(Ctx, #{}).

-spec get_delivery_services(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_delivery_services_response:ympa_erlang_client_get_delivery_services_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_delivery_services(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/delivery/services"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


