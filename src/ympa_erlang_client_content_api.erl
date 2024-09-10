-module(ympa_erlang_client_content_api).

-export([get_category_content_parameters/2, get_category_content_parameters/3,
         get_offer_cards_content_status/3, get_offer_cards_content_status/4,
         update_offer_content/3, update_offer_content/4]).

-define(BASE_URL, <<"">>).

%% @doc Списки характеристик товаров по категориям
%% Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
-spec get_category_content_parameters(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_category_content_parameters_response:ympa_erlang_client_get_category_content_parameters_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_category_content_parameters(Ctx, CategoryId) ->
    get_category_content_parameters(Ctx, CategoryId, #{}).

-spec get_category_content_parameters(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_category_content_parameters_response:ympa_erlang_client_get_category_content_parameters_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_category_content_parameters(Ctx, CategoryId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/category/", CategoryId, "/parameters"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение информации о заполненности карточек магазина
%% Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
-spec get_offer_cards_content_status(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_offer_cards_content_status_response:ympa_erlang_client_get_offer_cards_content_status_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_cards_content_status(Ctx, BusinessId) ->
    get_offer_cards_content_status(Ctx, BusinessId, #{}).

-spec get_offer_cards_content_status(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_offer_cards_content_status_response:ympa_erlang_client_get_offer_cards_content_status_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_offer_cards_content_status(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-cards"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetOfferCardsContentStatusRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Редактирование категорийных характеристик товара
%% Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec update_offer_content(ctx:ctx(), integer(), ympa_erlang_client_update_offer_content_request:ympa_erlang_client_update_offer_content_request()) -> {ok, ympa_erlang_client_update_offer_content_response:ympa_erlang_client_update_offer_content_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_content(Ctx, BusinessId, YmpaErlangClientUpdateOfferContentRequest) ->
    update_offer_content(Ctx, BusinessId, YmpaErlangClientUpdateOfferContentRequest, #{}).

-spec update_offer_content(ctx:ctx(), integer(), ympa_erlang_client_update_offer_content_request:ympa_erlang_client_update_offer_content_request(), maps:map()) -> {ok, ympa_erlang_client_update_offer_content_response:ympa_erlang_client_update_offer_content_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_offer_content(Ctx, BusinessId, YmpaErlangClientUpdateOfferContentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-cards/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOfferContentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


