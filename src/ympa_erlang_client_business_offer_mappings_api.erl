-module(ympa_erlang_client_business_offer_mappings_api).

-export([add_offers_to_archive/3, add_offers_to_archive/4,
         delete_offers/3, delete_offers/4,
         delete_offers_from_archive/3, delete_offers_from_archive/4,
         get_offer_mappings/3, get_offer_mappings/4,
         get_suggested_offer_mappings/3, get_suggested_offer_mappings/4,
         update_offer_mappings/3, update_offer_mappings/4]).

-define(BASE_URL, <<"">>).

%% @doc Добавление товаров в архив
%% Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-spec add_offers_to_archive(ctx:ctx(), integer(), ympa_erlang_client_add_offers_to_archive_request:ympa_erlang_client_add_offers_to_archive_request()) -> {ok, ympa_erlang_client_add_offers_to_archive_response:ympa_erlang_client_add_offers_to_archive_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_offers_to_archive(Ctx, BusinessId, YmpaErlangClientAddOffersToArchiveRequest) ->
    add_offers_to_archive(Ctx, BusinessId, YmpaErlangClientAddOffersToArchiveRequest, #{}).

-spec add_offers_to_archive(ctx:ctx(), integer(), ympa_erlang_client_add_offers_to_archive_request:ympa_erlang_client_add_offers_to_archive_request(), maps:map()) -> {ok, ympa_erlang_client_add_offers_to_archive_response:ympa_erlang_client_add_offers_to_archive_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_offers_to_archive(Ctx, BusinessId, YmpaErlangClientAddOffersToArchiveRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings/archive"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientAddOffersToArchiveRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Удаление товаров из каталога
%% Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-spec delete_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_offers_request:ympa_erlang_client_delete_offers_request()) -> {ok, ympa_erlang_client_delete_offers_response:ympa_erlang_client_delete_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_offers(Ctx, BusinessId, YmpaErlangClientDeleteOffersRequest) ->
    delete_offers(Ctx, BusinessId, YmpaErlangClientDeleteOffersRequest, #{}).

-spec delete_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_offers_request:ympa_erlang_client_delete_offers_request(), maps:map()) -> {ok, ympa_erlang_client_delete_offers_response:ympa_erlang_client_delete_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_offers(Ctx, BusinessId, YmpaErlangClientDeleteOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Удаление товаров из архива
%% Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
-spec delete_offers_from_archive(ctx:ctx(), integer(), ympa_erlang_client_delete_offers_from_archive_request:ympa_erlang_client_delete_offers_from_archive_request()) -> {ok, ympa_erlang_client_delete_offers_from_archive_response:ympa_erlang_client_delete_offers_from_archive_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_offers_from_archive(Ctx, BusinessId, YmpaErlangClientDeleteOffersFromArchiveRequest) ->
    delete_offers_from_archive(Ctx, BusinessId, YmpaErlangClientDeleteOffersFromArchiveRequest, #{}).

-spec delete_offers_from_archive(ctx:ctx(), integer(), ympa_erlang_client_delete_offers_from_archive_request:ympa_erlang_client_delete_offers_from_archive_request(), maps:map()) -> {ok, ympa_erlang_client_delete_offers_from_archive_response:ympa_erlang_client_delete_offers_from_archive_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_offers_from_archive(Ctx, BusinessId, YmpaErlangClientDeleteOffersFromArchiveRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings/unarchive"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteOffersFromArchiveRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о товарах в каталоге
%% Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
-spec get_offer_mappings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_offer_mappings_response:ympa_erlang_client_get_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_mappings(Ctx, BusinessId) ->
    get_offer_mappings(Ctx, BusinessId, #{}).

-spec get_offer_mappings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_offer_mappings_response:ympa_erlang_client_get_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_mappings(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetOfferMappingsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Просмотр карточек на Маркете, которые подходят вашим товарам
%% Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
-spec get_suggested_offer_mappings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_suggested_offer_mappings_response:ympa_erlang_client_get_suggested_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_offer_mappings(Ctx, BusinessId) ->
    get_suggested_offer_mappings(Ctx, BusinessId, #{}).

-spec get_suggested_offer_mappings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_suggested_offer_mappings_response:ympa_erlang_client_get_suggested_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_offer_mappings(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings/suggestions"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetSuggestedOfferMappingsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Добавление товаров в каталог и изменение информации о них
%% Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec update_offer_mappings(ctx:ctx(), integer(), ympa_erlang_client_update_offer_mappings_request:ympa_erlang_client_update_offer_mappings_request()) -> {ok, ympa_erlang_client_update_offer_mappings_response:ympa_erlang_client_update_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_mappings(Ctx, BusinessId, YmpaErlangClientUpdateOfferMappingsRequest) ->
    update_offer_mappings(Ctx, BusinessId, YmpaErlangClientUpdateOfferMappingsRequest, #{}).

-spec update_offer_mappings(ctx:ctx(), integer(), ympa_erlang_client_update_offer_mappings_request:ympa_erlang_client_update_offer_mappings_request(), maps:map()) -> {ok, ympa_erlang_client_update_offer_mappings_response:ympa_erlang_client_update_offer_mappings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_mappings(Ctx, BusinessId, YmpaErlangClientUpdateOfferMappingsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-mappings/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOfferMappingsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


