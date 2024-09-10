-module(ympa_erlang_client_businesses_api).

-export([get_business_settings/2, get_business_settings/3]).

-define(BASE_URL, <<"">>).

%% @doc Настройки кабинета
%% Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_business_settings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_business_settings_response:ympa_erlang_client_get_business_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_settings(Ctx, BusinessId) ->
    get_business_settings(Ctx, BusinessId, #{}).

-spec get_business_settings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_business_settings_response:ympa_erlang_client_get_business_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_settings(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/settings"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


