-module(ympa_erlang_client_shipments_api).

-export([confirm_shipment/4, confirm_shipment/5,
         download_shipment_act/3, download_shipment_act/4,
         download_shipment_discrepancy_act/3, download_shipment_discrepancy_act/4,
         download_shipment_inbound_act/3, download_shipment_inbound_act/4,
         download_shipment_pallet_labels/3, download_shipment_pallet_labels/4,
         download_shipment_reception_transfer_act/2, download_shipment_reception_transfer_act/3,
         download_shipment_transportation_waybill/3, download_shipment_transportation_waybill/4,
         get_shipment/3, get_shipment/4,
         get_shipment_orders_info/3, get_shipment_orders_info/4,
         search_shipments/3, search_shipments/4,
         set_shipment_pallets_count/4, set_shipment_pallets_count/5,
         transfer_orders_from_shipment/4, transfer_orders_from_shipment/5]).

-define(BASE_URL, <<"">>).

%% @doc Подтверждение отгрузки
%% Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec confirm_shipment(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_shipment(Ctx, CampaignId, ShipmentId) ->
    confirm_shipment(Ctx, CampaignId, ShipmentId, #{}).

-spec confirm_shipment(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
confirm_shipment(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/confirm"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientConfirmShipmentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение акта приема-передачи
%% {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec download_shipment_act(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_act(Ctx, CampaignId, ShipmentId) ->
    download_shipment_act(Ctx, CampaignId, ShipmentId, #{}).

-spec download_shipment_act(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_act(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/act"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение акта расхождений
%% Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec download_shipment_discrepancy_act(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_discrepancy_act(Ctx, CampaignId, ShipmentId) ->
    download_shipment_discrepancy_act(Ctx, CampaignId, ShipmentId, #{}).

-spec download_shipment_discrepancy_act(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_discrepancy_act(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/discrepancy-act"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение фактического акта приема-передачи
%% Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec download_shipment_inbound_act(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_inbound_act(Ctx, CampaignId, ShipmentId) ->
    download_shipment_inbound_act(Ctx, CampaignId, ShipmentId, #{}).

-spec download_shipment_inbound_act(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_inbound_act(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/inbound-act"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Ярлыки для доверительной приемки (FBS)
%% PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec download_shipment_pallet_labels(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_pallet_labels(Ctx, CampaignId, ShipmentId) ->
    download_shipment_pallet_labels(Ctx, CampaignId, ShipmentId, #{}).

-spec download_shipment_pallet_labels(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_pallet_labels(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/pallet/labels"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
%% Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec download_shipment_reception_transfer_act(ctx:ctx(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_reception_transfer_act(Ctx, CampaignId) ->
    download_shipment_reception_transfer_act(Ctx, CampaignId, #{}).

-spec download_shipment_reception_transfer_act(ctx:ctx(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_reception_transfer_act(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/shipments/reception-transfer-act"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['warehouse_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение транспортной накладной
%% Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec download_shipment_transportation_waybill(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_transportation_waybill(Ctx, CampaignId, ShipmentId) ->
    download_shipment_transportation_waybill(Ctx, CampaignId, ShipmentId, #{}).

-spec download_shipment_transportation_waybill(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
download_shipment_transportation_waybill(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/transportation-waybill"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение информации об одной отгрузке
%% Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_shipment(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_shipment_response:ympa_erlang_client_get_shipment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_shipment(Ctx, CampaignId, ShipmentId) ->
    get_shipment(Ctx, CampaignId, ShipmentId, #{}).

-spec get_shipment(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_shipment_response:ympa_erlang_client_get_shipment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_shipment(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, ""],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['cancelledOrders'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение информации о возможности печати ярлыков (FBS)
%% Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_shipment_orders_info(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_shipment_orders_info_response:ympa_erlang_client_get_shipment_orders_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_shipment_orders_info(Ctx, CampaignId, ShipmentId) ->
    get_shipment_orders_info(Ctx, CampaignId, ShipmentId, #{}).

-spec get_shipment_orders_info(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_shipment_orders_info_response:ympa_erlang_client_get_shipment_orders_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_shipment_orders_info(Ctx, CampaignId, ShipmentId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/orders/info"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение информации о нескольких отгрузках
%% Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec search_shipments(ctx:ctx(), integer(), ympa_erlang_client_search_shipments_request:ympa_erlang_client_search_shipments_request()) -> {ok, ympa_erlang_client_search_shipments_response:ympa_erlang_client_search_shipments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_shipments(Ctx, CampaignId, YmpaErlangClientSearchShipmentsRequest) ->
    search_shipments(Ctx, CampaignId, YmpaErlangClientSearchShipmentsRequest, #{}).

-spec search_shipments(ctx:ctx(), integer(), ympa_erlang_client_search_shipments_request:ympa_erlang_client_search_shipments_request(), maps:map()) -> {ok, ympa_erlang_client_search_shipments_response:ympa_erlang_client_search_shipments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_shipments(Ctx, CampaignId, YmpaErlangClientSearchShipmentsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientSearchShipmentsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача количества упаковок в отгрузке
%% Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec set_shipment_pallets_count(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_shipment_pallets_count_request:ympa_erlang_client_set_shipment_pallets_count_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_shipment_pallets_count(Ctx, CampaignId, ShipmentId, YmpaErlangClientSetShipmentPalletsCountRequest) ->
    set_shipment_pallets_count(Ctx, CampaignId, ShipmentId, YmpaErlangClientSetShipmentPalletsCountRequest, #{}).

-spec set_shipment_pallets_count(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_shipment_pallets_count_request:ympa_erlang_client_set_shipment_pallets_count_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_shipment_pallets_count(Ctx, CampaignId, ShipmentId, YmpaErlangClientSetShipmentPalletsCountRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/pallets"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetShipmentPalletsCountRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Перенос заказов в следующую отгрузку
%% Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
-spec transfer_orders_from_shipment(ctx:ctx(), integer(), integer(), ympa_erlang_client_transfer_orders_from_shipment_request:ympa_erlang_client_transfer_orders_from_shipment_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
transfer_orders_from_shipment(Ctx, CampaignId, ShipmentId, YmpaErlangClientTransferOrdersFromShipmentRequest) ->
    transfer_orders_from_shipment(Ctx, CampaignId, ShipmentId, YmpaErlangClientTransferOrdersFromShipmentRequest, #{}).

-spec transfer_orders_from_shipment(ctx:ctx(), integer(), integer(), ympa_erlang_client_transfer_orders_from_shipment_request:ympa_erlang_client_transfer_orders_from_shipment_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
transfer_orders_from_shipment(Ctx, CampaignId, ShipmentId, YmpaErlangClientTransferOrdersFromShipmentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/first-mile/shipments/", ShipmentId, "/orders/transfer"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientTransferOrdersFromShipmentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


