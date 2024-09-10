-module(ympa_erlang_client_reports_api).

-export([generate_boost_consolidated_report/2, generate_boost_consolidated_report/3,
         generate_competitors_position_report/2, generate_competitors_position_report/3,
         generate_goods_feedback_report/2, generate_goods_feedback_report/3,
         generate_goods_movement_report/2, generate_goods_movement_report/3,
         generate_goods_realization_report/2, generate_goods_realization_report/3,
         generate_goods_turnover_report/2, generate_goods_turnover_report/3,
         generate_mass_order_labels_report/2, generate_mass_order_labels_report/3,
         generate_prices_report/2, generate_prices_report/3,
         generate_shelfs_statistics_report/2, generate_shelfs_statistics_report/3,
         generate_shipment_list_document_report/2, generate_shipment_list_document_report/3,
         generate_shows_sales_report/2, generate_shows_sales_report/3,
         generate_stocks_on_warehouses_report/2, generate_stocks_on_warehouses_report/3,
         generate_united_marketplace_services_report/2, generate_united_marketplace_services_report/3,
         generate_united_netting_report/2, generate_united_netting_report/3,
         generate_united_orders_report/2, generate_united_orders_report/3,
         get_report_info/2, get_report_info/3]).

-define(BASE_URL, <<"">>).

%% @doc Отчет по бусту продаж
%% Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_boost_consolidated_report(ctx:ctx(), ympa_erlang_client_generate_boost_consolidated_request:ympa_erlang_client_generate_boost_consolidated_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_boost_consolidated_report(Ctx, YmpaErlangClientGenerateBoostConsolidatedRequest) ->
    generate_boost_consolidated_report(Ctx, YmpaErlangClientGenerateBoostConsolidatedRequest, #{}).

-spec generate_boost_consolidated_report(ctx:ctx(), ympa_erlang_client_generate_boost_consolidated_request:ympa_erlang_client_generate_boost_consolidated_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_boost_consolidated_report(Ctx, YmpaErlangClientGenerateBoostConsolidatedRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/boost-consolidated/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateBoostConsolidatedRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет «Конкурентная позиция»
%% Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
-spec generate_competitors_position_report(ctx:ctx(), ympa_erlang_client_generate_competitors_position_report_request:ympa_erlang_client_generate_competitors_position_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_competitors_position_report(Ctx, YmpaErlangClientGenerateCompetitorsPositionReportRequest) ->
    generate_competitors_position_report(Ctx, YmpaErlangClientGenerateCompetitorsPositionReportRequest, #{}).

-spec generate_competitors_position_report(ctx:ctx(), ympa_erlang_client_generate_competitors_position_report_request:ympa_erlang_client_generate_competitors_position_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_competitors_position_report(Ctx, YmpaErlangClientGenerateCompetitorsPositionReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/competitors-position/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateCompetitorsPositionReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по отзывам о товарах
%% Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_goods_feedback_report(ctx:ctx(), ympa_erlang_client_generate_goods_feedback_request:ympa_erlang_client_generate_goods_feedback_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_feedback_report(Ctx, YmpaErlangClientGenerateGoodsFeedbackRequest) ->
    generate_goods_feedback_report(Ctx, YmpaErlangClientGenerateGoodsFeedbackRequest, #{}).

-spec generate_goods_feedback_report(ctx:ctx(), ympa_erlang_client_generate_goods_feedback_request:ympa_erlang_client_generate_goods_feedback_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_feedback_report(Ctx, YmpaErlangClientGenerateGoodsFeedbackRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/goods-feedback/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateGoodsFeedbackRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по движению товаров
%% Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_goods_movement_report(ctx:ctx(), ympa_erlang_client_generate_goods_movement_report_request:ympa_erlang_client_generate_goods_movement_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_movement_report(Ctx, YmpaErlangClientGenerateGoodsMovementReportRequest) ->
    generate_goods_movement_report(Ctx, YmpaErlangClientGenerateGoodsMovementReportRequest, #{}).

-spec generate_goods_movement_report(ctx:ctx(), ympa_erlang_client_generate_goods_movement_report_request:ympa_erlang_client_generate_goods_movement_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_movement_report(Ctx, YmpaErlangClientGenerateGoodsMovementReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/goods-movement/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateGoodsMovementReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по реализации
%% Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_goods_realization_report(ctx:ctx(), ympa_erlang_client_generate_goods_realization_report_request:ympa_erlang_client_generate_goods_realization_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_realization_report(Ctx, YmpaErlangClientGenerateGoodsRealizationReportRequest) ->
    generate_goods_realization_report(Ctx, YmpaErlangClientGenerateGoodsRealizationReportRequest, #{}).

-spec generate_goods_realization_report(ctx:ctx(), ympa_erlang_client_generate_goods_realization_report_request:ympa_erlang_client_generate_goods_realization_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_realization_report(Ctx, YmpaErlangClientGenerateGoodsRealizationReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/goods-realization/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateGoodsRealizationReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по оборачиваемости
%% Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_goods_turnover_report(ctx:ctx(), ympa_erlang_client_generate_goods_turnover_request:ympa_erlang_client_generate_goods_turnover_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_turnover_report(Ctx, YmpaErlangClientGenerateGoodsTurnoverRequest) ->
    generate_goods_turnover_report(Ctx, YmpaErlangClientGenerateGoodsTurnoverRequest, #{}).

-spec generate_goods_turnover_report(ctx:ctx(), ympa_erlang_client_generate_goods_turnover_request:ympa_erlang_client_generate_goods_turnover_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_goods_turnover_report(Ctx, YmpaErlangClientGenerateGoodsTurnoverRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/goods-turnover/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateGoodsTurnoverRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Готовые ярлыки‑наклейки на все коробки в нескольких заказах
%% Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec generate_mass_order_labels_report(ctx:ctx(), ympa_erlang_client_generate_mass_order_labels_request:ympa_erlang_client_generate_mass_order_labels_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_mass_order_labels_report(Ctx, YmpaErlangClientGenerateMassOrderLabelsRequest) ->
    generate_mass_order_labels_report(Ctx, YmpaErlangClientGenerateMassOrderLabelsRequest, #{}).

-spec generate_mass_order_labels_report(ctx:ctx(), ympa_erlang_client_generate_mass_order_labels_request:ympa_erlang_client_generate_mass_order_labels_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_mass_order_labels_report(Ctx, YmpaErlangClientGenerateMassOrderLabelsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/documents/labels/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateMassOrderLabelsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет «Цены на рынке»
%% Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_prices_report(ctx:ctx(), ympa_erlang_client_generate_prices_report_request:ympa_erlang_client_generate_prices_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_prices_report(Ctx, YmpaErlangClientGeneratePricesReportRequest) ->
    generate_prices_report(Ctx, YmpaErlangClientGeneratePricesReportRequest, #{}).

-spec generate_prices_report(ctx:ctx(), ympa_erlang_client_generate_prices_report_request:ympa_erlang_client_generate_prices_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_prices_report(Ctx, YmpaErlangClientGeneratePricesReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/prices/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGeneratePricesReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по полкам
%% Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_shelfs_statistics_report(ctx:ctx(), ympa_erlang_client_generate_shelfs_statistics_request:ympa_erlang_client_generate_shelfs_statistics_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shelfs_statistics_report(Ctx, YmpaErlangClientGenerateShelfsStatisticsRequest) ->
    generate_shelfs_statistics_report(Ctx, YmpaErlangClientGenerateShelfsStatisticsRequest, #{}).

-spec generate_shelfs_statistics_report(ctx:ctx(), ympa_erlang_client_generate_shelfs_statistics_request:ympa_erlang_client_generate_shelfs_statistics_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shelfs_statistics_report(Ctx, YmpaErlangClientGenerateShelfsStatisticsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/shelf-statistics/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateShelfsStatisticsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение листа сборки
%% Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_shipment_list_document_report(ctx:ctx(), ympa_erlang_client_generate_shipment_list_document_report_request:ympa_erlang_client_generate_shipment_list_document_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shipment_list_document_report(Ctx, YmpaErlangClientGenerateShipmentListDocumentReportRequest) ->
    generate_shipment_list_document_report(Ctx, YmpaErlangClientGenerateShipmentListDocumentReportRequest, #{}).

-spec generate_shipment_list_document_report(ctx:ctx(), ympa_erlang_client_generate_shipment_list_document_report_request:ympa_erlang_client_generate_shipment_list_document_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shipment_list_document_report(Ctx, YmpaErlangClientGenerateShipmentListDocumentReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/documents/shipment-list/generate"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGenerateShipmentListDocumentReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет «Аналитика продаж»
%% Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
-spec generate_shows_sales_report(ctx:ctx(), ympa_erlang_client_generate_shows_sales_report_request:ympa_erlang_client_generate_shows_sales_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shows_sales_report(Ctx, YmpaErlangClientGenerateShowsSalesReportRequest) ->
    generate_shows_sales_report(Ctx, YmpaErlangClientGenerateShowsSalesReportRequest, #{}).

-spec generate_shows_sales_report(ctx:ctx(), ympa_erlang_client_generate_shows_sales_report_request:ympa_erlang_client_generate_shows_sales_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_shows_sales_report(Ctx, YmpaErlangClientGenerateShowsSalesReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/shows-sales/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateShowsSalesReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по остаткам на складах
%% Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_stocks_on_warehouses_report(ctx:ctx(), ympa_erlang_client_generate_stocks_on_warehouses_report_request:ympa_erlang_client_generate_stocks_on_warehouses_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_stocks_on_warehouses_report(Ctx, YmpaErlangClientGenerateStocksOnWarehousesReportRequest) ->
    generate_stocks_on_warehouses_report(Ctx, YmpaErlangClientGenerateStocksOnWarehousesReportRequest, #{}).

-spec generate_stocks_on_warehouses_report(ctx:ctx(), ympa_erlang_client_generate_stocks_on_warehouses_report_request:ympa_erlang_client_generate_stocks_on_warehouses_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_stocks_on_warehouses_report(Ctx, YmpaErlangClientGenerateStocksOnWarehousesReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/stocks-on-warehouses/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateStocksOnWarehousesReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по стоимости услуг
%% Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_united_marketplace_services_report(ctx:ctx(), ympa_erlang_client_generate_united_marketplace_services_report_request:ympa_erlang_client_generate_united_marketplace_services_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_marketplace_services_report(Ctx, YmpaErlangClientGenerateUnitedMarketplaceServicesReportRequest) ->
    generate_united_marketplace_services_report(Ctx, YmpaErlangClientGenerateUnitedMarketplaceServicesReportRequest, #{}).

-spec generate_united_marketplace_services_report(ctx:ctx(), ympa_erlang_client_generate_united_marketplace_services_report_request:ympa_erlang_client_generate_united_marketplace_services_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_marketplace_services_report(Ctx, YmpaErlangClientGenerateUnitedMarketplaceServicesReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/united-marketplace-services/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateUnitedMarketplaceServicesReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по платежам
%% Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_united_netting_report(ctx:ctx(), ympa_erlang_client_generate_united_netting_report_request:ympa_erlang_client_generate_united_netting_report_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_netting_report(Ctx, YmpaErlangClientGenerateUnitedNettingReportRequest) ->
    generate_united_netting_report(Ctx, YmpaErlangClientGenerateUnitedNettingReportRequest, #{}).

-spec generate_united_netting_report(ctx:ctx(), ympa_erlang_client_generate_united_netting_report_request:ympa_erlang_client_generate_united_netting_report_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_netting_report(Ctx, YmpaErlangClientGenerateUnitedNettingReportRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/united-netting/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateUnitedNettingReportRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по заказам
%% Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec generate_united_orders_report(ctx:ctx(), ympa_erlang_client_generate_united_orders_request:ympa_erlang_client_generate_united_orders_request()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_orders_report(Ctx, YmpaErlangClientGenerateUnitedOrdersRequest) ->
    generate_united_orders_report(Ctx, YmpaErlangClientGenerateUnitedOrdersRequest, #{}).

-spec generate_united_orders_report(ctx:ctx(), ympa_erlang_client_generate_united_orders_request:ympa_erlang_client_generate_united_orders_request(), maps:map()) -> {ok, ympa_erlang_client_generate_report_response:ympa_erlang_client_generate_report_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_united_orders_report(Ctx, YmpaErlangClientGenerateUnitedOrdersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/reports/united-orders/generate"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGenerateUnitedOrdersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение заданного отчета
%% Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_report_info(ctx:ctx(), binary()) -> {ok, ympa_erlang_client_get_report_info_response:ympa_erlang_client_get_report_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_report_info(Ctx, ReportId) ->
    get_report_info(Ctx, ReportId, #{}).

-spec get_report_info(ctx:ctx(), binary(), maps:map()) -> {ok, ympa_erlang_client_get_report_info_response:ympa_erlang_client_get_report_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_report_info(Ctx, ReportId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/reports/info/", ReportId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


