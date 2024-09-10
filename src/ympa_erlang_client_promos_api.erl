-module(ympa_erlang_client_promos_api).

-export([delete_promo_offers/3, delete_promo_offers/4,
         get_promo_offers/3, get_promo_offers/4,
         get_promos/3, get_promos/4,
         update_promo_offers/3, update_promo_offers/4]).

-define(BASE_URL, <<"">>).

%% @doc Удаление товаров из акции
%% Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec delete_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_promo_offers_request:ympa_erlang_client_delete_promo_offers_request()) -> {ok, ympa_erlang_client_delete_promo_offers_response:ympa_erlang_client_delete_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest) ->
    delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest, #{}).

-spec delete_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_promo_offers_request:ympa_erlang_client_delete_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_delete_promo_offers_response:ympa_erlang_client_delete_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeletePromoOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение списка товаров, которые участвуют или могут участвовать в акции
%% Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_get_promo_offers_request:ympa_erlang_client_get_promo_offers_request()) -> {ok, ympa_erlang_client_get_promo_offers_response:ympa_erlang_client_get_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest) ->
    get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest, #{}).

-spec get_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_get_promo_offers_request:ympa_erlang_client_get_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_get_promo_offers_response:ympa_erlang_client_get_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetPromoOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение списка акций
%% Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_promos(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_promos_response:ympa_erlang_client_get_promos_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promos(Ctx, BusinessId) ->
    get_promos(Ctx, BusinessId, #{}).

-spec get_promos(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_promos_response:ympa_erlang_client_get_promos_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promos(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetPromosRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Добавление товаров в акцию или изменение их цен
%% Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec update_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_update_promo_offers_request:ympa_erlang_client_update_promo_offers_request()) -> {ok, ympa_erlang_client_update_promo_offers_response:ympa_erlang_client_update_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest) ->
    update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest, #{}).

-spec update_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_update_promo_offers_request:ympa_erlang_client_update_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_update_promo_offers_response:ympa_erlang_client_update_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdatePromoOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


