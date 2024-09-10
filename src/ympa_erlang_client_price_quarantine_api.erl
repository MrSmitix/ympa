-module(ympa_erlang_client_price_quarantine_api).

-export([confirm_business_prices/3, confirm_business_prices/4,
         confirm_campaign_prices/3, confirm_campaign_prices/4,
         get_business_quarantine_offers/3, get_business_quarantine_offers/4,
         get_campaign_quarantine_offers/3, get_campaign_quarantine_offers/4]).

-define(BASE_URL, <<"">>).

%% @doc Удаление товара из карантина по цене в кабинете
%% Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-spec confirm_business_prices(ctx:ctx(), integer(), ympa_erlang_client_confirm_prices_request:ympa_erlang_client_confirm_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_business_prices(Ctx, BusinessId, YmpaErlangClientConfirmPricesRequest) ->
    confirm_business_prices(Ctx, BusinessId, YmpaErlangClientConfirmPricesRequest, #{}).

-spec confirm_business_prices(ctx:ctx(), integer(), ympa_erlang_client_confirm_prices_request:ympa_erlang_client_confirm_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_business_prices(Ctx, BusinessId, YmpaErlangClientConfirmPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/price-quarantine/confirm"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientConfirmPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Удаление товара из карантина по цене в магазине
%% Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec confirm_campaign_prices(ctx:ctx(), integer(), ympa_erlang_client_confirm_prices_request:ympa_erlang_client_confirm_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_campaign_prices(Ctx, CampaignId, YmpaErlangClientConfirmPricesRequest) ->
    confirm_campaign_prices(Ctx, CampaignId, YmpaErlangClientConfirmPricesRequest, #{}).

-spec confirm_campaign_prices(ctx:ctx(), integer(), ympa_erlang_client_confirm_prices_request:ympa_erlang_client_confirm_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_campaign_prices(Ctx, CampaignId, YmpaErlangClientConfirmPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/price-quarantine/confirm"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientConfirmPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список товаров, находящихся в карантине по цене в кабинете
%% Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec get_business_quarantine_offers(ctx:ctx(), integer(), ympa_erlang_client_get_quarantine_offers_request:ympa_erlang_client_get_quarantine_offers_request()) -> {ok, ympa_erlang_client_get_quarantine_offers_response:ympa_erlang_client_get_quarantine_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_quarantine_offers(Ctx, BusinessId, YmpaErlangClientGetQuarantineOffersRequest) ->
    get_business_quarantine_offers(Ctx, BusinessId, YmpaErlangClientGetQuarantineOffersRequest, #{}).

-spec get_business_quarantine_offers(ctx:ctx(), integer(), ympa_erlang_client_get_quarantine_offers_request:ympa_erlang_client_get_quarantine_offers_request(), maps:map()) -> {ok, ympa_erlang_client_get_quarantine_offers_response:ympa_erlang_client_get_quarantine_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_quarantine_offers(Ctx, BusinessId, YmpaErlangClientGetQuarantineOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/price-quarantine"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetQuarantineOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список товаров, находящихся в карантине по цене в магазине
%% Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec get_campaign_quarantine_offers(ctx:ctx(), integer(), ympa_erlang_client_get_quarantine_offers_request:ympa_erlang_client_get_quarantine_offers_request()) -> {ok, ympa_erlang_client_get_quarantine_offers_response:ympa_erlang_client_get_quarantine_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_quarantine_offers(Ctx, CampaignId, YmpaErlangClientGetQuarantineOffersRequest) ->
    get_campaign_quarantine_offers(Ctx, CampaignId, YmpaErlangClientGetQuarantineOffersRequest, #{}).

-spec get_campaign_quarantine_offers(ctx:ctx(), integer(), ympa_erlang_client_get_quarantine_offers_request:ympa_erlang_client_get_quarantine_offers_request(), maps:map()) -> {ok, ympa_erlang_client_get_quarantine_offers_response:ympa_erlang_client_get_quarantine_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_quarantine_offers(Ctx, CampaignId, YmpaErlangClientGetQuarantineOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/price-quarantine"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetQuarantineOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


