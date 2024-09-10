-module(ympa_erlang_client_order_delivery_api).

-export([get_order_buyer_info/3, get_order_buyer_info/4,
         set_order_delivery_date/4, set_order_delivery_date/5,
         set_order_delivery_track_code/4, set_order_delivery_track_code/5,
         update_order_storage_limit/4, update_order_storage_limit/5,
         verify_order_eac/4, verify_order_eac/5]).

-define(BASE_URL, <<"">>).

%% @doc Информация о покупателе — физическом лице
%% Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
-spec get_order_buyer_info(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_order_buyer_info_response:ympa_erlang_client_get_order_buyer_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_buyer_info(Ctx, CampaignId, OrderId) ->
    get_order_buyer_info(Ctx, CampaignId, OrderId, #{}).

-spec get_order_buyer_info(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_order_buyer_info_response:ympa_erlang_client_get_order_buyer_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_buyer_info(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/buyer"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение даты доставки заказа
%% Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec set_order_delivery_date(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_delivery_date_request:ympa_erlang_client_set_order_delivery_date_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_delivery_date(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryDateRequest) ->
    set_order_delivery_date(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryDateRequest, #{}).

-spec set_order_delivery_date(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_delivery_date_request:ympa_erlang_client_set_order_delivery_date_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_delivery_date(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryDateRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/date"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetOrderDeliveryDateRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача трек‑номера посылки
%% {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec set_order_delivery_track_code(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_delivery_track_code_request:ympa_erlang_client_set_order_delivery_track_code_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_delivery_track_code(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryTrackCodeRequest) ->
    set_order_delivery_track_code(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryTrackCodeRequest, #{}).

-spec set_order_delivery_track_code(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_delivery_track_code_request:ympa_erlang_client_set_order_delivery_track_code_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_delivery_track_code(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderDeliveryTrackCodeRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/track"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetOrderDeliveryTrackCodeRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Продление срока хранения заказа
%% Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec update_order_storage_limit(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_storage_limit_request:ympa_erlang_client_update_order_storage_limit_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_storage_limit(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStorageLimitRequest) ->
    update_order_storage_limit(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStorageLimitRequest, #{}).

-spec update_order_storage_limit(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_storage_limit_request:ympa_erlang_client_update_order_storage_limit_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_storage_limit(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStorageLimitRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/storage-limit"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOrderStorageLimitRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача кода подтверждения
%% Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec verify_order_eac(ctx:ctx(), integer(), integer(), ympa_erlang_client_verify_order_eac_request:ympa_erlang_client_verify_order_eac_request()) -> {ok, ympa_erlang_client_verify_order_eac_response:ympa_erlang_client_verify_order_eac_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
verify_order_eac(Ctx, CampaignId, OrderId, YmpaErlangClientVerifyOrderEacRequest) ->
    verify_order_eac(Ctx, CampaignId, OrderId, YmpaErlangClientVerifyOrderEacRequest, #{}).

-spec verify_order_eac(ctx:ctx(), integer(), integer(), ympa_erlang_client_verify_order_eac_request:ympa_erlang_client_verify_order_eac_request(), maps:map()) -> {ok, ympa_erlang_client_verify_order_eac_response:ympa_erlang_client_verify_order_eac_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
verify_order_eac(Ctx, CampaignId, OrderId, YmpaErlangClientVerifyOrderEacRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/verifyEac"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientVerifyOrderEacRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


