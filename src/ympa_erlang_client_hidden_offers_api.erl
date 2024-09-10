-module(ympa_erlang_client_hidden_offers_api).

-export([add_hidden_offers/3, add_hidden_offers/4,
         delete_hidden_offers/3, delete_hidden_offers/4,
         get_hidden_offers/2, get_hidden_offers/3]).

-define(BASE_URL, <<"">>).

%% @doc Скрытие товаров и настройки скрытия
%% Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec add_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_add_hidden_offers_request:ympa_erlang_client_add_hidden_offers_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest) ->
    add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest, #{}).

-spec add_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_add_hidden_offers_request:ympa_erlang_client_add_hidden_offers_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientAddHiddenOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Возобновление показа товаров
%% Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec delete_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_hidden_offers_request:ympa_erlang_client_delete_hidden_offers_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest) ->
    delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest, #{}).

-spec delete_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_hidden_offers_request:ympa_erlang_client_delete_hidden_offers_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteHiddenOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о скрытых вами товарах
%% Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec get_hidden_offers(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_hidden_offers_response:ympa_erlang_client_get_hidden_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_hidden_offers(Ctx, CampaignId) ->
    get_hidden_offers(Ctx, CampaignId, #{}).

-spec get_hidden_offers(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_hidden_offers_response:ympa_erlang_client_get_hidden_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_hidden_offers(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['offer_id', 'page_token', 'limit', 'offset', 'page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


