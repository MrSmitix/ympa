-module(ympa_erlang_client_ratings_api).

-export([get_quality_rating_details/2, get_quality_rating_details/3,
         get_quality_ratings/3, get_quality_ratings/4]).

-define(BASE_URL, <<"">>).

%% @doc Заказы, которые повлияли на индекс качества
%% Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
-spec get_quality_rating_details(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_quality_rating_details_response:ympa_erlang_client_get_quality_rating_details_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_rating_details(Ctx, CampaignId) ->
    get_quality_rating_details(Ctx, CampaignId, #{}).

-spec get_quality_rating_details(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_quality_rating_details_response:ympa_erlang_client_get_quality_rating_details_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_rating_details(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/ratings/quality/details"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Индекс качества магазинов
%% Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_quality_ratings(ctx:ctx(), integer(), ympa_erlang_client_get_quality_rating_request:ympa_erlang_client_get_quality_rating_request()) -> {ok, ympa_erlang_client_get_quality_rating_response:ympa_erlang_client_get_quality_rating_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest) ->
    get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest, #{}).

-spec get_quality_ratings(ctx:ctx(), integer(), ympa_erlang_client_get_quality_rating_request:ympa_erlang_client_get_quality_rating_request(), maps:map()) -> {ok, ympa_erlang_client_get_quality_rating_response:ympa_erlang_client_get_quality_rating_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/ratings/quality"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetQualityRatingRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


