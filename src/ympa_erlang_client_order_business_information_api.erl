-module(ympa_erlang_client_order_business_information_api).

-export([get_order_business_buyer_info/3, get_order_business_buyer_info/4,
         get_order_business_documents_info/3, get_order_business_documents_info/4]).

-define(BASE_URL, <<"">>).

%% @doc Информация о покупателе — юридическом лице
%% Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
-spec get_order_business_buyer_info(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_business_buyer_info_response:ympa_erlang_client_get_business_buyer_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_business_buyer_info(Ctx, CampaignId, OrderId) ->
    get_order_business_buyer_info(Ctx, CampaignId, OrderId, #{}).

-spec get_order_business_buyer_info(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_business_buyer_info_response:ympa_erlang_client_get_business_buyer_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_business_buyer_info(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/business-buyer"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о документах
%% Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
-spec get_order_business_documents_info(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_business_documents_info_response:ympa_erlang_client_get_business_documents_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_business_documents_info(Ctx, CampaignId, OrderId) ->
    get_order_business_documents_info(Ctx, CampaignId, OrderId, #{}).

-spec get_order_business_documents_info(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_business_documents_info_response:ympa_erlang_client_get_business_documents_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_business_documents_info(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/documents"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


