-module(ympa_erlang_client_prices_api).

-export([get_prices/2, get_prices/3,
         get_prices_by_offer_ids/3, get_prices_by_offer_ids/4,
         get_suggested_prices/3, get_suggested_prices/4,
         update_business_prices/3, update_business_prices/4,
         update_prices/3, update_prices/4]).

-define(BASE_URL, <<"">>).

%% @doc Список цен
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
-spec get_prices(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_prices_response:ympa_erlang_client_get_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices(Ctx, CampaignId) ->
    get_prices(Ctx, CampaignId, #{}).

-spec get_prices(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_prices_response:ympa_erlang_client_get_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'archived'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Просмотр цен на указанные товары в магазине
%% Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
-spec get_prices_by_offer_ids(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_prices_by_offer_ids_response:ympa_erlang_client_get_prices_by_offer_ids_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices_by_offer_ids(Ctx, CampaignId) ->
    get_prices_by_offer_ids(Ctx, CampaignId, #{}).

-spec get_prices_by_offer_ids(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_prices_by_offer_ids_response:ympa_erlang_client_get_prices_by_offer_ids_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices_by_offer_ids(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetPricesByOfferIdsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Цены для продвижения товаров
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
-spec get_suggested_prices(ctx:ctx(), integer(), ympa_erlang_client_suggest_prices_request:ympa_erlang_client_suggest_prices_request()) -> {ok, ympa_erlang_client_suggest_prices_response:ympa_erlang_client_suggest_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest) ->
    get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest, #{}).

-spec get_suggested_prices(ctx:ctx(), integer(), ympa_erlang_client_suggest_prices_request:ympa_erlang_client_suggest_prices_request(), maps:map()) -> {ok, ympa_erlang_client_suggest_prices_response:ympa_erlang_client_suggest_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices/suggestions"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSuggestPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Установка цен на товары во всех магазинах
%% Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec update_business_prices(ctx:ctx(), integer(), ympa_erlang_client_update_business_prices_request:ympa_erlang_client_update_business_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest) ->
    update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest, #{}).

-spec update_business_prices(ctx:ctx(), integer(), ympa_erlang_client_update_business_prices_request:ympa_erlang_client_update_business_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-prices/updates"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateBusinessPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Установка цен на товары в конкретном магазине
%% Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec update_prices(ctx:ctx(), integer(), ympa_erlang_client_update_prices_request:ympa_erlang_client_update_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest) ->
    update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest, #{}).

-spec update_prices(ctx:ctx(), integer(), ympa_erlang_client_update_prices_request:ympa_erlang_client_update_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices/updates"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdatePricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


