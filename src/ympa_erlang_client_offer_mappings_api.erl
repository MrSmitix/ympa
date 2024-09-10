-module(ympa_erlang_client_offer_mappings_api).

-export([get_offer_mapping_entries/2, get_offer_mapping_entries/3,
         get_suggested_offer_mapping_entries/3, get_suggested_offer_mapping_entries/4,
         update_offer_mapping_entries/3, update_offer_mapping_entries/4]).

-define(BASE_URL, <<"">>).

%% @doc Список товаров в каталоге
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
-spec get_offer_mapping_entries(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_offer_mapping_entries_response:ympa_erlang_client_get_offer_mapping_entries_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_mapping_entries(Ctx, CampaignId) ->
    get_offer_mapping_entries(Ctx, CampaignId, #{}).

-spec get_offer_mapping_entries(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_offer_mapping_entries_response:ympa_erlang_client_get_offer_mapping_entries_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_mapping_entries(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-mapping-entries"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['offer_id', 'shop_sku', 'mapping_kind', 'status', 'availability', 'category_id', 'vendor', 'page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Рекомендованные карточки для товаров
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
-spec get_suggested_offer_mapping_entries(ctx:ctx(), integer(), ympa_erlang_client_get_suggested_offer_mapping_entries_request:ympa_erlang_client_get_suggested_offer_mapping_entries_request()) -> {ok, ympa_erlang_client_get_suggested_offer_mapping_entries_response:ympa_erlang_client_get_suggested_offer_mapping_entries_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientGetSuggestedOfferMappingEntriesRequest) ->
    get_suggested_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientGetSuggestedOfferMappingEntriesRequest, #{}).

-spec get_suggested_offer_mapping_entries(ctx:ctx(), integer(), ympa_erlang_client_get_suggested_offer_mapping_entries_request:ympa_erlang_client_get_suggested_offer_mapping_entries_request(), maps:map()) -> {ok, ympa_erlang_client_get_suggested_offer_mapping_entries_response:ympa_erlang_client_get_suggested_offer_mapping_entries_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientGetSuggestedOfferMappingEntriesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-mapping-entries/suggestions"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetSuggestedOfferMappingEntriesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Добавление и редактирование товаров в каталоге
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
-spec update_offer_mapping_entries(ctx:ctx(), integer(), ympa_erlang_client_update_offer_mapping_entry_request:ympa_erlang_client_update_offer_mapping_entry_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientUpdateOfferMappingEntryRequest) ->
    update_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientUpdateOfferMappingEntryRequest, #{}).

-spec update_offer_mapping_entries(ctx:ctx(), integer(), ympa_erlang_client_update_offer_mapping_entry_request:ympa_erlang_client_update_offer_mapping_entry_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_mapping_entries(Ctx, CampaignId, YmpaErlangClientUpdateOfferMappingEntryRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-mapping-entries/updates"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOfferMappingEntryRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


