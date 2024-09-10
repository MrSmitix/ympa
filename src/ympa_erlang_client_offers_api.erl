-module(ympa_erlang_client_offers_api).

-export([delete_campaign_offers/3, delete_campaign_offers/4,
         get_all_offers/2, get_all_offers/3,
         get_campaign_offers/3, get_campaign_offers/4,
         get_offer_recommendations/3, get_offer_recommendations/4,
         get_offers/2, get_offers/3,
         update_campaign_offers/3, update_campaign_offers/4]).

-define(BASE_URL, <<"">>).

%% @doc Удаление товаров из ассортимента магазина
%% Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec delete_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_campaign_offers_request:ympa_erlang_client_delete_campaign_offers_request()) -> {ok, ympa_erlang_client_delete_campaign_offers_response:ympa_erlang_client_delete_campaign_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_campaign_offers(Ctx, CampaignId, YmpaErlangClientDeleteCampaignOffersRequest) ->
    delete_campaign_offers(Ctx, CampaignId, YmpaErlangClientDeleteCampaignOffersRequest, #{}).

-spec delete_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_campaign_offers_request:ympa_erlang_client_delete_campaign_offers_request(), maps:map()) -> {ok, ympa_erlang_client_delete_campaign_offers_response:ympa_erlang_client_delete_campaign_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_campaign_offers(Ctx, CampaignId, YmpaErlangClientDeleteCampaignOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteCampaignOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Все предложения магазина
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
-spec get_all_offers(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_all_offers_response:ympa_erlang_client_get_all_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_all_offers(Ctx, CampaignId) ->
    get_all_offers(Ctx, CampaignId, #{}).

-spec get_all_offers(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_all_offers_response:ympa_erlang_client_get_all_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_all_offers(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers/all"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['feedId', 'chunk'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о товарах, которые размещены в заданном магазине
%% Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec get_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_get_campaign_offers_request:ympa_erlang_client_get_campaign_offers_request()) -> {ok, ympa_erlang_client_get_campaign_offers_response:ympa_erlang_client_get_campaign_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_offers(Ctx, CampaignId, YmpaErlangClientGetCampaignOffersRequest) ->
    get_campaign_offers(Ctx, CampaignId, YmpaErlangClientGetCampaignOffersRequest, #{}).

-spec get_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_get_campaign_offers_request:ympa_erlang_client_get_campaign_offers_request(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_offers_response:ympa_erlang_client_get_campaign_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_offers(Ctx, CampaignId, YmpaErlangClientGetCampaignOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetCampaignOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Рекомендации Маркета, касающиеся цен
%% Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_offer_recommendations(ctx:ctx(), integer(), ympa_erlang_client_get_offer_recommendations_request:ympa_erlang_client_get_offer_recommendations_request()) -> {ok, ympa_erlang_client_get_offer_recommendations_response:ympa_erlang_client_get_offer_recommendations_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_recommendations(Ctx, BusinessId, YmpaErlangClientGetOfferRecommendationsRequest) ->
    get_offer_recommendations(Ctx, BusinessId, YmpaErlangClientGetOfferRecommendationsRequest, #{}).

-spec get_offer_recommendations(ctx:ctx(), integer(), ympa_erlang_client_get_offer_recommendations_request:ympa_erlang_client_get_offer_recommendations_request(), maps:map()) -> {ok, ympa_erlang_client_get_offer_recommendations_response:ympa_erlang_client_get_offer_recommendations_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_recommendations(Ctx, BusinessId, YmpaErlangClientGetOfferRecommendationsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offers/recommendations"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetOfferRecommendationsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Предложения магазина
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
-spec get_offers(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_offers_response:ympa_erlang_client_get_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offers(Ctx, CampaignId) ->
    get_offers(Ctx, CampaignId, #{}).

-spec get_offers(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_offers_response:ympa_erlang_client_get_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offers(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['query', 'feedId', 'shopCategoryId', 'currency', 'matched', 'page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение условий продажи товаров в магазине
%% Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec update_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_update_campaign_offers_request:ympa_erlang_client_update_campaign_offers_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_campaign_offers(Ctx, CampaignId, YmpaErlangClientUpdateCampaignOffersRequest) ->
    update_campaign_offers(Ctx, CampaignId, YmpaErlangClientUpdateCampaignOffersRequest, #{}).

-spec update_campaign_offers(ctx:ctx(), integer(), ympa_erlang_client_update_campaign_offers_request:ympa_erlang_client_update_campaign_offers_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_campaign_offers(Ctx, CampaignId, YmpaErlangClientUpdateCampaignOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateCampaignOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


