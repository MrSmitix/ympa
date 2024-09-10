-module(ympa_erlang_client_campaigns_api).

-export([get_campaign/2, get_campaign/3,
         get_campaign_logins/2, get_campaign_logins/3,
         get_campaign_region/2, get_campaign_region/3,
         get_campaign_settings/2, get_campaign_settings/3,
         get_campaigns/1, get_campaigns/2,
         get_campaigns_by_login/2, get_campaigns_by_login/3]).

-define(BASE_URL, <<"">>).

%% @doc Информация о магазине
%% Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_response:ympa_erlang_client_get_campaign_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign(Ctx, CampaignId) ->
    get_campaign(Ctx, CampaignId, #{}).

-spec get_campaign(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_response:ympa_erlang_client_get_campaign_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Логины, связанные с магазином
%% Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign_logins(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_logins_response:ympa_erlang_client_get_campaign_logins_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_logins(Ctx, CampaignId) ->
    get_campaign_logins(Ctx, CampaignId, #{}).

-spec get_campaign_logins(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_logins_response:ympa_erlang_client_get_campaign_logins_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_logins(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/logins"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Регион магазина
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-spec get_campaign_region(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_region_response:ympa_erlang_client_get_campaign_region_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_region(Ctx, CampaignId) ->
    get_campaign_region(Ctx, CampaignId, #{}).

-spec get_campaign_region(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_region_response:ympa_erlang_client_get_campaign_region_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_region(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/region"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Настройки магазина
%% Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign_settings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_settings_response:ympa_erlang_client_get_campaign_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_settings(Ctx, CampaignId) ->
    get_campaign_settings(Ctx, CampaignId, #{}).

-spec get_campaign_settings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_settings_response:ympa_erlang_client_get_campaign_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_settings(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/settings"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список магазинов пользователя
%% Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaigns(ctx:ctx()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns(Ctx) ->
    get_campaigns(Ctx, #{}).

-spec get_campaigns(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Магазины, доступные логину
%% Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_campaigns_by_login(ctx:ctx(), binary()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns_by_login(Ctx, Login) ->
    get_campaigns_by_login(Ctx, Login, #{}).

-spec get_campaigns_by_login(ctx:ctx(), binary(), maps:map()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns_by_login(Ctx, Login, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/by_login/", Login, ""],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


