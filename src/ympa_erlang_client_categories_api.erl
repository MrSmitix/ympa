-module(ympa_erlang_client_categories_api).

-export([get_categories_max_sale_quantum/2, get_categories_max_sale_quantum/3,
         get_categories_tree/2, get_categories_tree/3]).

-define(BASE_URL, <<"">>).

%% @doc Лимит на установку кванта продажи и минимального количества товаров в заказе
%% Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_categories_max_sale_quantum(ctx:ctx(), ympa_erlang_client_get_categories_max_sale_quantum_request:ympa_erlang_client_get_categories_max_sale_quantum_request()) -> {ok, ympa_erlang_client_get_categories_max_sale_quantum_response:ympa_erlang_client_get_categories_max_sale_quantum_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_categories_max_sale_quantum(Ctx, YmpaErlangClientGetCategoriesMaxSaleQuantumRequest) ->
    get_categories_max_sale_quantum(Ctx, YmpaErlangClientGetCategoriesMaxSaleQuantumRequest, #{}).

-spec get_categories_max_sale_quantum(ctx:ctx(), ympa_erlang_client_get_categories_max_sale_quantum_request:ympa_erlang_client_get_categories_max_sale_quantum_request(), maps:map()) -> {ok, ympa_erlang_client_get_categories_max_sale_quantum_response:ympa_erlang_client_get_categories_max_sale_quantum_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_categories_max_sale_quantum(Ctx, YmpaErlangClientGetCategoriesMaxSaleQuantumRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/categories/max-sale-quantum"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetCategoriesMaxSaleQuantumRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Дерево категорий
%% Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_categories_tree(ctx:ctx()) -> {ok, ympa_erlang_client_get_categories_response:ympa_erlang_client_get_categories_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_categories_tree(Ctx) ->
    get_categories_tree(Ctx, #{}).

-spec get_categories_tree(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_categories_response:ympa_erlang_client_get_categories_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_categories_tree(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/categories/tree"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetCategoriesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


