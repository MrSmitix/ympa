-module(ympa_erlang_client_fbs_api).

-export([add_hidden_offers/3, add_hidden_offers/4,
         add_offers_to_archive/3, add_offers_to_archive/4,
         calculate_tariffs/2, calculate_tariffs/3,
         confirm_business_prices/3, confirm_business_prices/4,
         confirm_campaign_prices/3, confirm_campaign_prices/4,
         confirm_shipment/4, confirm_shipment/5,
         create_chat/3, create_chat/4,
         delete_campaign_offers/3, delete_campaign_offers/4,
         delete_goods_feedback_comment/3, delete_goods_feedback_comment/4,
         delete_hidden_offers/3, delete_hidden_offers/4,
         delete_offers/3, delete_offers/4,
         delete_offers_from_archive/3, delete_offers_from_archive/4,
         delete_promo_offers/3, delete_promo_offers/4,
         download_shipment_act/3, download_shipment_act/4,
         download_shipment_discrepancy_act/3, download_shipment_discrepancy_act/4,
         download_shipment_inbound_act/3, download_shipment_inbound_act/4,
         download_shipment_pallet_labels/3, download_shipment_pallet_labels/4,
         download_shipment_reception_transfer_act/2, download_shipment_reception_transfer_act/3,
         download_shipment_transportation_waybill/3, download_shipment_transportation_waybill/4,
         generate_boost_consolidated_report/2, generate_boost_consolidated_report/3,
         generate_competitors_position_report/2, generate_competitors_position_report/3,
         generate_goods_feedback_report/2, generate_goods_feedback_report/3,
         generate_goods_realization_report/2, generate_goods_realization_report/3,
         generate_mass_order_labels_report/2, generate_mass_order_labels_report/3,
         generate_order_label/5, generate_order_label/6,
         generate_order_labels/3, generate_order_labels/4,
         generate_prices_report/2, generate_prices_report/3,
         generate_shelfs_statistics_report/2, generate_shelfs_statistics_report/3,
         generate_shipment_list_document_report/2, generate_shipment_list_document_report/3,
         generate_shows_sales_report/2, generate_shows_sales_report/3,
         generate_stocks_on_warehouses_report/2, generate_stocks_on_warehouses_report/3,
         generate_united_marketplace_services_report/2, generate_united_marketplace_services_report/3,
         generate_united_netting_report/2, generate_united_netting_report/3,
         generate_united_orders_report/2, generate_united_orders_report/3,
         get_all_offers/2, get_all_offers/3,
         get_bids_info_for_business/3, get_bids_info_for_business/4,
         get_bids_recommendations/3, get_bids_recommendations/4,
         get_business_quarantine_offers/3, get_business_quarantine_offers/4,
         get_business_settings/2, get_business_settings/3,
         get_campaign/2, get_campaign/3,
         get_campaign_logins/2, get_campaign_logins/3,
         get_campaign_offers/3, get_campaign_offers/4,
         get_campaign_quarantine_offers/3, get_campaign_quarantine_offers/4,
         get_campaign_region/2, get_campaign_region/3,
         get_campaign_settings/2, get_campaign_settings/3,
         get_campaigns/1, get_campaigns/2,
         get_campaigns_by_login/2, get_campaigns_by_login/3,
         get_categories_max_sale_quantum/2, get_categories_max_sale_quantum/3,
         get_categories_tree/2, get_categories_tree/3,
         get_category_content_parameters/2, get_category_content_parameters/3,
         get_chat_history/4, get_chat_history/5,
         get_chats/3, get_chats/4,
         get_delivery_services/1, get_delivery_services/2,
         get_feed/3, get_feed/4,
         get_feed_index_logs/3, get_feed_index_logs/4,
         get_feedback_and_comment_updates/2, get_feedback_and_comment_updates/3,
         get_feeds/2, get_feeds/3,
         get_goods_feedback_comments/3, get_goods_feedback_comments/4,
         get_goods_feedbacks/3, get_goods_feedbacks/4,
         get_goods_stats/3, get_goods_stats/4,
         get_hidden_offers/2, get_hidden_offers/3,
         get_offer_cards_content_status/3, get_offer_cards_content_status/4,
         get_offer_mapping_entries/2, get_offer_mapping_entries/3,
         get_offer_mappings/3, get_offer_mappings/4,
         get_offer_recommendations/3, get_offer_recommendations/4,
         get_offers/2, get_offers/3,
         get_order/3, get_order/4,
         get_order_business_buyer_info/3, get_order_business_buyer_info/4,
         get_order_business_documents_info/3, get_order_business_documents_info/4,
         get_order_labels_data/3, get_order_labels_data/4,
         get_orders/2, get_orders/3,
         get_orders_stats/3, get_orders_stats/4,
         get_prices/2, get_prices/3,
         get_prices_by_offer_ids/3, get_prices_by_offer_ids/4,
         get_promo_offers/3, get_promo_offers/4,
         get_promos/3, get_promos/4,
         get_quality_rating_details/2, get_quality_rating_details/3,
         get_quality_ratings/3, get_quality_ratings/4,
         get_report_info/2, get_report_info/3,
         get_return/4, get_return/5,
         get_return_application/4, get_return_application/5,
         get_return_photo/6, get_return_photo/7,
         get_returns/2, get_returns/3,
         get_shipment/3, get_shipment/4,
         get_shipment_orders_info/3, get_shipment_orders_info/4,
         get_stocks/3, get_stocks/4,
         get_suggested_offer_mapping_entries/3, get_suggested_offer_mapping_entries/4,
         get_suggested_offer_mappings/3, get_suggested_offer_mappings/4,
         get_suggested_prices/3, get_suggested_prices/4,
         get_warehouses/2, get_warehouses/3,
         provide_order_item_identifiers/4, provide_order_item_identifiers/5,
         put_bids_for_business/3, put_bids_for_business/4,
         put_bids_for_campaign/3, put_bids_for_campaign/4,
         refresh_feed/3, refresh_feed/4,
         search_region_children/2, search_region_children/3,
         search_regions_by_id/2, search_regions_by_id/3,
         search_regions_by_name/2, search_regions_by_name/3,
         search_shipments/3, search_shipments/4,
         send_file_to_chat/4, send_file_to_chat/5,
         send_message_to_chat/4, send_message_to_chat/5,
         set_feed_params/4, set_feed_params/5,
         set_order_box_layout/4, set_order_box_layout/5,
         set_order_shipment_boxes/5, set_order_shipment_boxes/6,
         set_shipment_pallets_count/4, set_shipment_pallets_count/5,
         skip_goods_feedbacks_reaction/3, skip_goods_feedbacks_reaction/4,
         transfer_orders_from_shipment/4, transfer_orders_from_shipment/5,
         update_business_prices/3, update_business_prices/4,
         update_campaign_offers/3, update_campaign_offers/4,
         update_goods_feedback_comment/3, update_goods_feedback_comment/4,
         update_offer_content/3, update_offer_content/4,
         update_offer_mapping_entries/3, update_offer_mapping_entries/4,
         update_offer_mappings/3, update_offer_mappings/4,
         update_order_items/4, update_order_items/5,
         update_order_status/4, update_order_status/5,
         update_order_statuses/3, update_order_statuses/4,
         update_prices/3, update_prices/4,
         update_promo_offers/3, update_promo_offers/4,
         update_stocks/3, update_stocks/4]).

-define(BASE_URL, <<"">>).

%% @doc Скрытие товаров и настройки скрытия
%% Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec add_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_add_hidden_offers_request:ympa_erlang_client_add_hidden_offers_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest) ->
    add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest, #{}).

-spec add_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_add_hidden_offers_request:ympa_erlang_client_add_hidden_offers_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
add_hidden_offers(Ctx, CampaignId, YmpaErlangClientAddHiddenOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientAddHiddenOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

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

%% @doc Калькулятор стоимости услуг
%% Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec calculate_tariffs(ctx:ctx(), ympa_erlang_client_calculate_tariffs_request:ympa_erlang_client_calculate_tariffs_request()) -> {ok, ympa_erlang_client_calculate_tariffs_response:ympa_erlang_client_calculate_tariffs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest) ->
    calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest, #{}).

-spec calculate_tariffs(ctx:ctx(), ympa_erlang_client_calculate_tariffs_request:ympa_erlang_client_calculate_tariffs_request(), maps:map()) -> {ok, ympa_erlang_client_calculate_tariffs_response:ympa_erlang_client_calculate_tariffs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
calculate_tariffs(Ctx, YmpaErlangClientCalculateTariffsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/tariffs/calculate"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientCalculateTariffsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

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

%% @doc Создание нового чата с покупателем
%% Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec create_chat(ctx:ctx(), integer(), ympa_erlang_client_create_chat_request:ympa_erlang_client_create_chat_request()) -> {ok, ympa_erlang_client_create_chat_response:ympa_erlang_client_create_chat_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest) ->
    create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest, #{}).

-spec create_chat(ctx:ctx(), integer(), ympa_erlang_client_create_chat_request:ympa_erlang_client_create_chat_request(), maps:map()) -> {ok, ympa_erlang_client_create_chat_response:ympa_erlang_client_create_chat_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
create_chat(Ctx, BusinessId, YmpaErlangClientCreateChatRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/new"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientCreateChatRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

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

%% @doc Удаление комментария к отзыву
%% Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec delete_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_delete_goods_feedback_comment_request:ympa_erlang_client_delete_goods_feedback_comment_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest) ->
    delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest, #{}).

-spec delete_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_delete_goods_feedback_comment_request:ympa_erlang_client_delete_goods_feedback_comment_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientDeleteGoodsFeedbackCommentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteGoodsFeedbackCommentRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Возобновление показа товаров
%% Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec delete_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_hidden_offers_request:ympa_erlang_client_delete_hidden_offers_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest) ->
    delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest, #{}).

-spec delete_hidden_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_hidden_offers_request:ympa_erlang_client_delete_hidden_offers_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_hidden_offers(Ctx, CampaignId, YmpaErlangClientDeleteHiddenOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeleteHiddenOffersRequest,
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

%% @doc Удаление товаров из акции
%% Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec delete_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_promo_offers_request:ympa_erlang_client_delete_promo_offers_request()) -> {ok, ympa_erlang_client_delete_promo_offers_response:ympa_erlang_client_delete_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest) ->
    delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest, #{}).

-spec delete_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_delete_promo_offers_request:ympa_erlang_client_delete_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_delete_promo_offers_response:ympa_erlang_client_delete_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
delete_promo_offers(Ctx, BusinessId, YmpaErlangClientDeletePromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers/delete"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientDeletePromoOffersRequest,
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

%% @doc Готовый ярлык‑наклейка для коробки в заказе
%% Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec generate_order_label(ctx:ctx(), integer(), integer(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId) ->
    generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId, #{}).

-spec generate_order_label(ctx:ctx(), integer(), integer(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_label(Ctx, CampaignId, OrderId, ShipmentId, BoxId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/shipments/", ShipmentId, "/boxes/", BoxId, "/label"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Готовые ярлыки‑наклейки на все коробки в одном заказе
%% Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec generate_order_labels(ctx:ctx(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_labels(Ctx, CampaignId, OrderId) ->
    generate_order_labels(Ctx, CampaignId, OrderId, #{}).

-spec generate_order_labels(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
generate_order_labels(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/labels"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['format'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
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

%% @doc Информация об установленных ставках
%% Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
-spec get_bids_info_for_business(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_bids_info_response:ympa_erlang_client_get_bids_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_bids_info_for_business(Ctx, BusinessId) ->
    get_bids_info_for_business(Ctx, BusinessId, #{}).

-spec get_bids_info_for_business(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_bids_info_response:ympa_erlang_client_get_bids_info_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_bids_info_for_business(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/bids/info"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetBidsInfoRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Рекомендованные ставки для заданных товаров
%% Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
-spec get_bids_recommendations(ctx:ctx(), integer(), ympa_erlang_client_get_bids_recommendations_request:ympa_erlang_client_get_bids_recommendations_request()) -> {ok, ympa_erlang_client_get_bids_recommendations_response:ympa_erlang_client_get_bids_recommendations_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_bids_recommendations(Ctx, BusinessId, YmpaErlangClientGetBidsRecommendationsRequest) ->
    get_bids_recommendations(Ctx, BusinessId, YmpaErlangClientGetBidsRecommendationsRequest, #{}).

-spec get_bids_recommendations(ctx:ctx(), integer(), ympa_erlang_client_get_bids_recommendations_request:ympa_erlang_client_get_bids_recommendations_request(), maps:map()) -> {ok, ympa_erlang_client_get_bids_recommendations_response:ympa_erlang_client_get_bids_recommendations_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_bids_recommendations(Ctx, BusinessId, YmpaErlangClientGetBidsRecommendationsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/bids/recommendations"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetBidsRecommendationsRequest,
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

%% @doc Настройки кабинета
%% Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_business_settings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_business_settings_response:ympa_erlang_client_get_business_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_settings(Ctx, BusinessId) ->
    get_business_settings(Ctx, BusinessId, #{}).

-spec get_business_settings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_business_settings_response:ympa_erlang_client_get_business_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_business_settings(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/settings"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о магазине
%% Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_response:ympa_erlang_client_get_campaign_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign(Ctx, CampaignId) ->
    get_campaign(Ctx, CampaignId, #{}).

-spec get_campaign(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_response:ympa_erlang_client_get_campaign_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Логины, связанные с магазином
%% Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign_logins(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_logins_response:ympa_erlang_client_get_campaign_logins_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_logins(Ctx, CampaignId) ->
    get_campaign_logins(Ctx, CampaignId, #{}).

-spec get_campaign_logins(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_logins_response:ympa_erlang_client_get_campaign_logins_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_logins(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/logins"],
    QS = [],
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

%% @doc Регион магазина
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-spec get_campaign_region(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_region_response:ympa_erlang_client_get_campaign_region_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_region(Ctx, CampaignId) ->
    get_campaign_region(Ctx, CampaignId, #{}).

-spec get_campaign_region(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_region_response:ympa_erlang_client_get_campaign_region_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_region(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/region"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Настройки магазина
%% Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaign_settings(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_campaign_settings_response:ympa_erlang_client_get_campaign_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_settings(Ctx, CampaignId) ->
    get_campaign_settings(Ctx, CampaignId, #{}).

-spec get_campaign_settings(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_campaign_settings_response:ympa_erlang_client_get_campaign_settings_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaign_settings(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/settings"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список магазинов пользователя
%% Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_campaigns(ctx:ctx()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns(Ctx) ->
    get_campaigns(Ctx, #{}).

-spec get_campaigns(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Магазины, доступные логину
%% Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_campaigns_by_login(ctx:ctx(), binary()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns_by_login(Ctx, Login) ->
    get_campaigns_by_login(Ctx, Login, #{}).

-spec get_campaigns_by_login(ctx:ctx(), binary(), maps:map()) -> {ok, ympa_erlang_client_get_campaigns_response:ympa_erlang_client_get_campaigns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_campaigns_by_login(Ctx, Login, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/by_login/", Login, ""],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

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

%% @doc Получение истории сообщений в чате
%% Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_chat_history(ctx:ctx(), integer(), integer(), ympa_erlang_client_get_chat_history_request:ympa_erlang_client_get_chat_history_request()) -> {ok, ympa_erlang_client_get_chat_history_response:ympa_erlang_client_get_chat_history_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest) ->
    get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest, #{}).

-spec get_chat_history(ctx:ctx(), integer(), integer(), ympa_erlang_client_get_chat_history_request:ympa_erlang_client_get_chat_history_request(), maps:map()) -> {ok, ympa_erlang_client_get_chat_history_response:ympa_erlang_client_get_chat_history_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chat_history(Ctx, BusinessId, ChatId, YmpaErlangClientGetChatHistoryRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/history"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetChatHistoryRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение доступных чатов
%% Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_chats(ctx:ctx(), integer(), ympa_erlang_client_get_chats_request:ympa_erlang_client_get_chats_request()) -> {ok, ympa_erlang_client_get_chats_response:ympa_erlang_client_get_chats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest) ->
    get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest, #{}).

-spec get_chats(ctx:ctx(), integer(), ympa_erlang_client_get_chats_request:ympa_erlang_client_get_chats_request(), maps:map()) -> {ok, ympa_erlang_client_get_chats_response:ympa_erlang_client_get_chats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_chats(Ctx, BusinessId, YmpaErlangClientGetChatsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetChatsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Справочник служб доставки
%% Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
-spec get_delivery_services(ctx:ctx()) -> {ok, ympa_erlang_client_get_delivery_services_response:ympa_erlang_client_get_delivery_services_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_delivery_services(Ctx) ->
    get_delivery_services(Ctx, #{}).

-spec get_delivery_services(ctx:ctx(), maps:map()) -> {ok, ympa_erlang_client_get_delivery_services_response:ympa_erlang_client_get_delivery_services_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_delivery_services(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/delivery/services"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о прайс-листе
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_feed(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_feed_response:ympa_erlang_client_get_feed_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feed(Ctx, CampaignId, FeedId) ->
    get_feed(Ctx, CampaignId, FeedId, #{}).

-spec get_feed(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_feed_response:ympa_erlang_client_get_feed_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feed(Ctx, CampaignId, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feeds/", FeedId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по индексации прайс-листа
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_feed_index_logs(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_feed_index_logs_response:ympa_erlang_client_get_feed_index_logs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feed_index_logs(Ctx, CampaignId, FeedId) ->
    get_feed_index_logs(Ctx, CampaignId, FeedId, #{}).

-spec get_feed_index_logs(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_feed_index_logs_response:ympa_erlang_client_get_feed_index_logs_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feed_index_logs(Ctx, CampaignId, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feeds/", FeedId, "/index-logs"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['limit', 'published_time_from', 'published_time_to', 'status'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Новые и обновленные отзывы о магазине
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
-spec get_feedback_and_comment_updates(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_feedback_list_response:ympa_erlang_client_get_feedback_list_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feedback_and_comment_updates(Ctx, CampaignId) ->
    get_feedback_and_comment_updates(Ctx, CampaignId, #{}).

-spec get_feedback_and_comment_updates(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_feedback_list_response:ympa_erlang_client_get_feedback_list_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feedback_and_comment_updates(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feedback/updates"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'from_date'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список прайс-листов магазина
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_feeds(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_feeds_response:ympa_erlang_client_get_feeds_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feeds(Ctx, CampaignId) ->
    get_feeds(Ctx, CampaignId, #{}).

-spec get_feeds(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_feeds_response:ympa_erlang_client_get_feeds_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_feeds(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feeds"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение комментариев к отзыву
%% Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_goods_feedback_comments(ctx:ctx(), integer(), ympa_erlang_client_get_goods_feedback_comments_request:ympa_erlang_client_get_goods_feedback_comments_request()) -> {ok, ympa_erlang_client_get_goods_feedback_comments_response:ympa_erlang_client_get_goods_feedback_comments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest) ->
    get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest, #{}).

-spec get_goods_feedback_comments(ctx:ctx(), integer(), ympa_erlang_client_get_goods_feedback_comments_request:ympa_erlang_client_get_goods_feedback_comments_request(), maps:map()) -> {ok, ympa_erlang_client_get_goods_feedback_comments_response:ympa_erlang_client_get_goods_feedback_comments_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedback_comments(Ctx, BusinessId, YmpaErlangClientGetGoodsFeedbackCommentsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsFeedbackCommentsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение отзывов о товарах продавца
%% Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec get_goods_feedbacks(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_goods_feedback_response:ympa_erlang_client_get_goods_feedback_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedbacks(Ctx, BusinessId) ->
    get_goods_feedbacks(Ctx, BusinessId, #{}).

-spec get_goods_feedbacks(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_goods_feedback_response:ympa_erlang_client_get_goods_feedback_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_feedbacks(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsFeedbackRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отчет по товарам
%% Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec get_goods_stats(ctx:ctx(), integer(), ympa_erlang_client_get_goods_stats_request:ympa_erlang_client_get_goods_stats_request()) -> {ok, ympa_erlang_client_get_goods_stats_response:ympa_erlang_client_get_goods_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest) ->
    get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest, #{}).

-spec get_goods_stats(ctx:ctx(), integer(), ympa_erlang_client_get_goods_stats_request:ympa_erlang_client_get_goods_stats_request(), maps:map()) -> {ok, ympa_erlang_client_get_goods_stats_response:ympa_erlang_client_get_goods_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_goods_stats(Ctx, CampaignId, YmpaErlangClientGetGoodsStatsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/stats/skus"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetGoodsStatsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о скрытых вами товарах
%% Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec get_hidden_offers(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_hidden_offers_response:ympa_erlang_client_get_hidden_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_hidden_offers(Ctx, CampaignId) ->
    get_hidden_offers(Ctx, CampaignId, #{}).

-spec get_hidden_offers(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_hidden_offers_response:ympa_erlang_client_get_hidden_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_hidden_offers(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/hidden-offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['offer_id', 'page_token', 'limit', 'offset', 'page', 'pageSize'], _OptionalParams),
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

%% @doc Информация об одном заказе
%% Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec get_order(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_order_response:ympa_erlang_client_get_order_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order(Ctx, CampaignId, OrderId) ->
    get_order(Ctx, CampaignId, OrderId, #{}).

-spec get_order(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_order_response:ympa_erlang_client_get_order_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

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

%% @doc Данные для самостоятельного изготовления ярлыков
%% Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec get_order_labels_data(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_get_order_labels_data_response:ympa_erlang_client_get_order_labels_data_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_labels_data(Ctx, CampaignId, OrderId) ->
    get_order_labels_data(Ctx, CampaignId, OrderId, #{}).

-spec get_order_labels_data(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_order_labels_data_response:ympa_erlang_client_get_order_labels_data_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_order_labels_data(Ctx, CampaignId, OrderId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/labels/data"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о нескольких заказах
%% Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec get_orders(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_orders_response:ympa_erlang_client_get_orders_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_orders(Ctx, CampaignId) ->
    get_orders(Ctx, CampaignId, #{}).

-spec get_orders(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_orders_response:ympa_erlang_client_get_orders_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_orders(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['orderIds', 'status', 'substatus', 'fromDate', 'toDate', 'supplierShipmentDateFrom', 'supplierShipmentDateTo', 'updatedAtFrom', 'updatedAtTo', 'dispatchType', 'fake', 'hasCis', 'onlyWaitingForCancellationApprove', 'onlyEstimatedDelivery', 'buyerType', 'page', 'pageSize', 'page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Детальная информация по заказам
%% Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec get_orders_stats(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_orders_stats_response:ympa_erlang_client_get_orders_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_orders_stats(Ctx, CampaignId) ->
    get_orders_stats(Ctx, CampaignId, #{}).

-spec get_orders_stats(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_orders_stats_response:ympa_erlang_client_get_orders_stats_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_orders_stats(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/stats/orders"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetOrdersStatsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список цен
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
-spec get_prices(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_prices_response:ympa_erlang_client_get_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices(Ctx, CampaignId) ->
    get_prices(Ctx, CampaignId, #{}).

-spec get_prices(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_prices_response:ympa_erlang_client_get_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'archived'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Просмотр цен на указанные товары в магазине
%% Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
-spec get_prices_by_offer_ids(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_prices_by_offer_ids_response:ympa_erlang_client_get_prices_by_offer_ids_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices_by_offer_ids(Ctx, CampaignId) ->
    get_prices_by_offer_ids(Ctx, CampaignId, #{}).

-spec get_prices_by_offer_ids(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_prices_by_offer_ids_response:ympa_erlang_client_get_prices_by_offer_ids_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_prices_by_offer_ids(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetPricesByOfferIdsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение списка товаров, которые участвуют или могут участвовать в акции
%% Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_get_promo_offers_request:ympa_erlang_client_get_promo_offers_request()) -> {ok, ympa_erlang_client_get_promo_offers_response:ympa_erlang_client_get_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest) ->
    get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest, #{}).

-spec get_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_get_promo_offers_request:ympa_erlang_client_get_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_get_promo_offers_response:ympa_erlang_client_get_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promo_offers(Ctx, BusinessId, YmpaErlangClientGetPromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetPromoOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение списка акций
%% Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec get_promos(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_promos_response:ympa_erlang_client_get_promos_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promos(Ctx, BusinessId) ->
    get_promos(Ctx, BusinessId, #{}).

-spec get_promos(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_promos_response:ympa_erlang_client_get_promos_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_promos(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetPromosRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Заказы, которые повлияли на индекс качества
%% Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
-spec get_quality_rating_details(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_quality_rating_details_response:ympa_erlang_client_get_quality_rating_details_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_rating_details(Ctx, CampaignId) ->
    get_quality_rating_details(Ctx, CampaignId, #{}).

-spec get_quality_rating_details(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_quality_rating_details_response:ympa_erlang_client_get_quality_rating_details_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_rating_details(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/ratings/quality/details"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Индекс качества магазинов
%% Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec get_quality_ratings(ctx:ctx(), integer(), ympa_erlang_client_get_quality_rating_request:ympa_erlang_client_get_quality_rating_request()) -> {ok, ympa_erlang_client_get_quality_rating_response:ympa_erlang_client_get_quality_rating_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest) ->
    get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest, #{}).

-spec get_quality_ratings(ctx:ctx(), integer(), ympa_erlang_client_get_quality_rating_request:ympa_erlang_client_get_quality_rating_request(), maps:map()) -> {ok, ympa_erlang_client_get_quality_rating_response:ympa_erlang_client_get_quality_rating_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_quality_ratings(Ctx, BusinessId, YmpaErlangClientGetQualityRatingRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/ratings/quality"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientGetQualityRatingRequest,
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

%% @doc Информация о невыкупе или возврате
%% Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return(ctx:ctx(), integer(), integer(), integer()) -> {ok, ympa_erlang_client_get_return_response:ympa_erlang_client_get_return_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return(Ctx, CampaignId, OrderId, ReturnId) ->
    get_return(Ctx, CampaignId, OrderId, ReturnId, #{}).

-spec get_return(ctx:ctx(), integer(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_return_response:ympa_erlang_client_get_return_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return(Ctx, CampaignId, OrderId, ReturnId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение заявления на возврат
%% Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return_application(ctx:ctx(), integer(), integer(), integer()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_application(Ctx, CampaignId, OrderId, ReturnId) ->
    get_return_application(Ctx, CampaignId, OrderId, ReturnId, #{}).

-spec get_return_application(ctx:ctx(), integer(), integer(), integer(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_application(Ctx, CampaignId, OrderId, ReturnId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/application"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Получение фотографии возврата
%% Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_return_photo(ctx:ctx(), integer(), integer(), integer(), integer(), binary()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash) ->
    get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash, #{}).

-spec get_return_photo(ctx:ctx(), integer(), integer(), integer(), integer(), binary(), maps:map()) -> {ok, binary(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_return_photo(Ctx, CampaignId, OrderId, ReturnId, ItemId, ImageHash, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/returns/", ReturnId, "/decision/", ItemId, "/image/", ImageHash, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список невыкупов и возвратов
%% Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
-spec get_returns(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_returns_response:ympa_erlang_client_get_returns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_returns(Ctx, CampaignId) ->
    get_returns(Ctx, CampaignId, #{}).

-spec get_returns(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_returns_response:ympa_erlang_client_get_returns_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_returns(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/returns"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit', 'orderIds', 'statuses', 'type', 'fromDate', 'toDate', 'from_date', 'to_date'], _OptionalParams),
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

%% @doc Информация об остатках и оборачиваемости
%% Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
-spec get_stocks(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_warehouse_stocks_response:ympa_erlang_client_get_warehouse_stocks_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_stocks(Ctx, CampaignId) ->
    get_stocks(Ctx, CampaignId, #{}).

-spec get_stocks(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_warehouse_stocks_response:ympa_erlang_client_get_warehouse_stocks_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_stocks(Ctx, CampaignId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers/stocks"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientGetWarehouseStocksRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
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

%% @doc Цены для продвижения товаров
%% {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
-spec get_suggested_prices(ctx:ctx(), integer(), ympa_erlang_client_suggest_prices_request:ympa_erlang_client_suggest_prices_request()) -> {ok, ympa_erlang_client_suggest_prices_response:ympa_erlang_client_suggest_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest) ->
    get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest, #{}).

-spec get_suggested_prices(ctx:ctx(), integer(), ympa_erlang_client_suggest_prices_request:ympa_erlang_client_suggest_prices_request(), maps:map()) -> {ok, ympa_erlang_client_suggest_prices_response:ympa_erlang_client_suggest_prices_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_suggested_prices(Ctx, CampaignId, YmpaErlangClientSuggestPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices/suggestions"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSuggestPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Список складов и групп складов
%% Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-spec get_warehouses(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_warehouses_response:ympa_erlang_client_get_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_warehouses(Ctx, BusinessId) ->
    get_warehouses(Ctx, BusinessId, #{}).

-spec get_warehouses(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_warehouses_response:ympa_erlang_client_get_warehouses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
get_warehouses(Ctx, BusinessId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/warehouses"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача кодов маркировки единиц товара
%% {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec provide_order_item_identifiers(ctx:ctx(), integer(), integer(), ympa_erlang_client_provide_order_item_identifiers_request:ympa_erlang_client_provide_order_item_identifiers_request()) -> {ok, ympa_erlang_client_provide_order_item_identifiers_response:ympa_erlang_client_provide_order_item_identifiers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
provide_order_item_identifiers(Ctx, CampaignId, OrderId, YmpaErlangClientProvideOrderItemIdentifiersRequest) ->
    provide_order_item_identifiers(Ctx, CampaignId, OrderId, YmpaErlangClientProvideOrderItemIdentifiersRequest, #{}).

-spec provide_order_item_identifiers(ctx:ctx(), integer(), integer(), ympa_erlang_client_provide_order_item_identifiers_request:ympa_erlang_client_provide_order_item_identifiers_request(), maps:map()) -> {ok, ympa_erlang_client_provide_order_item_identifiers_response:ympa_erlang_client_provide_order_item_identifiers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
provide_order_item_identifiers(Ctx, CampaignId, OrderId, YmpaErlangClientProvideOrderItemIdentifiersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/identifiers"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientProvideOrderItemIdentifiersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Включение буста продаж и установка ставок
%% Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
-spec put_bids_for_business(ctx:ctx(), integer(), ympa_erlang_client_put_sku_bids_request:ympa_erlang_client_put_sku_bids_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
put_bids_for_business(Ctx, BusinessId, YmpaErlangClientPutSkuBidsRequest) ->
    put_bids_for_business(Ctx, BusinessId, YmpaErlangClientPutSkuBidsRequest, #{}).

-spec put_bids_for_business(ctx:ctx(), integer(), ympa_erlang_client_put_sku_bids_request:ympa_erlang_client_put_sku_bids_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
put_bids_for_business(Ctx, BusinessId, YmpaErlangClientPutSkuBidsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/bids"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientPutSkuBidsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Включение буста продаж и установка ставок для магазина
%% Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
-spec put_bids_for_campaign(ctx:ctx(), integer(), ympa_erlang_client_put_sku_bids_request:ympa_erlang_client_put_sku_bids_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
put_bids_for_campaign(Ctx, CampaignId, YmpaErlangClientPutSkuBidsRequest) ->
    put_bids_for_campaign(Ctx, CampaignId, YmpaErlangClientPutSkuBidsRequest, #{}).

-spec put_bids_for_campaign(ctx:ctx(), integer(), ympa_erlang_client_put_sku_bids_request:ympa_erlang_client_put_sku_bids_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
put_bids_for_campaign(Ctx, CampaignId, YmpaErlangClientPutSkuBidsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/bids"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientPutSkuBidsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Сообщить, что прайс-лист обновился
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
-spec refresh_feed(ctx:ctx(), integer(), integer()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
refresh_feed(Ctx, CampaignId, FeedId) ->
    refresh_feed(Ctx, CampaignId, FeedId, #{}).

-spec refresh_feed(ctx:ctx(), integer(), integer(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
refresh_feed(Ctx, CampaignId, FeedId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feeds/", FeedId, "/refresh"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о дочерних регионах
%% Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
-spec search_region_children(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_region_with_children_response:ympa_erlang_client_get_region_with_children_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_region_children(Ctx, RegionId) ->
    search_region_children(Ctx, RegionId, #{}).

-spec search_region_children(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_region_with_children_response:ympa_erlang_client_get_region_with_children_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_region_children(Ctx, RegionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/regions/", RegionId, "/children"],
    QS = lists:flatten([])++ympa_erlang_client_utils:optional_params(['page', 'pageSize'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Информация о регионе
%% Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
-spec search_regions_by_id(ctx:ctx(), integer()) -> {ok, ympa_erlang_client_get_regions_response:ympa_erlang_client_get_regions_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_regions_by_id(Ctx, RegionId) ->
    search_regions_by_id(Ctx, RegionId, #{}).

-spec search_regions_by_id(ctx:ctx(), integer(), maps:map()) -> {ok, ympa_erlang_client_get_regions_response:ympa_erlang_client_get_regions_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_regions_by_id(Ctx, RegionId, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/regions/", RegionId, ""],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Поиск регионов по их имени
%% Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
-spec search_regions_by_name(ctx:ctx(), binary()) -> {ok, ympa_erlang_client_get_regions_response:ympa_erlang_client_get_regions_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_regions_by_name(Ctx, Name) ->
    search_regions_by_name(Ctx, Name, #{}).

-spec search_regions_by_name(ctx:ctx(), binary(), maps:map()) -> {ok, ympa_erlang_client_get_regions_response:ympa_erlang_client_get_regions_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
search_regions_by_name(Ctx, Name, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/regions"],
    QS = lists:flatten([{<<"name">>, Name}])++ympa_erlang_client_utils:optional_params(['page_token', 'limit'], _OptionalParams),
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

%% @doc Отправка файла в чат
%% Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec send_file_to_chat(ctx:ctx(), integer(), integer(), binary()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_file_to_chat(Ctx, BusinessId, ChatId, File) ->
    send_file_to_chat(Ctx, BusinessId, ChatId, File, #{}).

-spec send_file_to_chat(ctx:ctx(), integer(), integer(), binary(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_file_to_chat(Ctx, BusinessId, ChatId, File, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/file/send"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = {form, [{<<"file">>, File}]++ympa_erlang_client_utils:optional_params([], _OptionalParams)},
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"multipart/form-data">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Отправка сообщения в чат
%% Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-spec send_message_to_chat(ctx:ctx(), integer(), integer(), ympa_erlang_client_send_message_to_chat_request:ympa_erlang_client_send_message_to_chat_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest) ->
    send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest, #{}).

-spec send_message_to_chat(ctx:ctx(), integer(), integer(), ympa_erlang_client_send_message_to_chat_request:ympa_erlang_client_send_message_to_chat_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
send_message_to_chat(Ctx, BusinessId, ChatId, YmpaErlangClientSendMessageToChatRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/chats/message"],
    QS = lists:flatten([{<<"chatId">>, ChatId}])++ympa_erlang_client_utils:optional_params([], _OptionalParams),
    Headers = [],
    Body1 = YmpaErlangClientSendMessageToChatRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение параметров прайс-листа
%% {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
-spec set_feed_params(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_feed_params_request:ympa_erlang_client_set_feed_params_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_feed_params(Ctx, CampaignId, FeedId, YmpaErlangClientSetFeedParamsRequest) ->
    set_feed_params(Ctx, CampaignId, FeedId, YmpaErlangClientSetFeedParamsRequest, #{}).

-spec set_feed_params(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_feed_params_request:ympa_erlang_client_set_feed_params_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_feed_params(Ctx, CampaignId, FeedId, YmpaErlangClientSetFeedParamsRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/feeds/", FeedId, "/params"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetFeedParamsRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Подготовка заказа
%% {% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec set_order_box_layout(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_box_layout_request:ympa_erlang_client_set_order_box_layout_request()) -> {ok, ympa_erlang_client_set_order_box_layout_response:ympa_erlang_client_set_order_box_layout_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_box_layout(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderBoxLayoutRequest) ->
    set_order_box_layout(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderBoxLayoutRequest, #{}).

-spec set_order_box_layout(ctx:ctx(), integer(), integer(), ympa_erlang_client_set_order_box_layout_request:ympa_erlang_client_set_order_box_layout_request(), maps:map()) -> {ok, ympa_erlang_client_set_order_box_layout_response:ympa_erlang_client_set_order_box_layout_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_box_layout(Ctx, CampaignId, OrderId, YmpaErlangClientSetOrderBoxLayoutRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/boxes"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetOrderBoxLayoutRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача количества грузовых мест в заказе
%% {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec set_order_shipment_boxes(ctx:ctx(), integer(), integer(), integer(), ympa_erlang_client_set_order_shipment_boxes_request:ympa_erlang_client_set_order_shipment_boxes_request()) -> {ok, ympa_erlang_client_set_order_shipment_boxes_response:ympa_erlang_client_set_order_shipment_boxes_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_shipment_boxes(Ctx, CampaignId, OrderId, ShipmentId, YmpaErlangClientSetOrderShipmentBoxesRequest) ->
    set_order_shipment_boxes(Ctx, CampaignId, OrderId, ShipmentId, YmpaErlangClientSetOrderShipmentBoxesRequest, #{}).

-spec set_order_shipment_boxes(ctx:ctx(), integer(), integer(), integer(), ympa_erlang_client_set_order_shipment_boxes_request:ympa_erlang_client_set_order_shipment_boxes_request(), maps:map()) -> {ok, ympa_erlang_client_set_order_shipment_boxes_response:ympa_erlang_client_set_order_shipment_boxes_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
set_order_shipment_boxes(Ctx, CampaignId, OrderId, ShipmentId, YmpaErlangClientSetOrderShipmentBoxesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/delivery/shipments/", ShipmentId, "/boxes"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSetOrderShipmentBoxesRequest,
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

%% @doc Отказ от ответа на отзывы
%% Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec skip_goods_feedbacks_reaction(ctx:ctx(), integer(), ympa_erlang_client_skip_goods_feedback_reaction_request:ympa_erlang_client_skip_goods_feedback_reaction_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest) ->
    skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest, #{}).

-spec skip_goods_feedbacks_reaction(ctx:ctx(), integer(), ympa_erlang_client_skip_goods_feedback_reaction_request:ympa_erlang_client_skip_goods_feedback_reaction_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
skip_goods_feedbacks_reaction(Ctx, BusinessId, YmpaErlangClientSkipGoodsFeedbackReactionRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/skip-reaction"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientSkipGoodsFeedbackReactionRequest,
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

%% @doc Установка цен на товары во всех магазинах
%% Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
-spec update_business_prices(ctx:ctx(), integer(), ympa_erlang_client_update_business_prices_request:ympa_erlang_client_update_business_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest) ->
    update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest, #{}).

-spec update_business_prices(ctx:ctx(), integer(), ympa_erlang_client_update_business_prices_request:ympa_erlang_client_update_business_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_business_prices(Ctx, BusinessId, YmpaErlangClientUpdateBusinessPricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/offer-prices/updates"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateBusinessPricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
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

%% @doc Добавление нового или изменение созданного комментария
%% Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
-spec update_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_update_goods_feedback_comment_request:ympa_erlang_client_update_goods_feedback_comment_request()) -> {ok, ympa_erlang_client_update_goods_feedback_comment_response:ympa_erlang_client_update_goods_feedback_comment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest) ->
    update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest, #{}).

-spec update_goods_feedback_comment(ctx:ctx(), integer(), ympa_erlang_client_update_goods_feedback_comment_request:ympa_erlang_client_update_goods_feedback_comment_request(), maps:map()) -> {ok, ympa_erlang_client_update_goods_feedback_comment_response:ympa_erlang_client_update_goods_feedback_comment_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_goods_feedback_comment(Ctx, BusinessId, YmpaErlangClientUpdateGoodsFeedbackCommentRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/goods-feedback/comments/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateGoodsFeedbackCommentRequest,
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

%% @doc Удаление товара из заказа или уменьшение числа единиц
%% {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec update_order_items(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_item_request:ympa_erlang_client_update_order_item_request()) -> {ok, [], ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_items(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderItemRequest) ->
    update_order_items(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderItemRequest, #{}).

-spec update_order_items(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_item_request:ympa_erlang_client_update_order_item_request(), maps:map()) -> {ok, [], ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_items(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderItemRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/items"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOrderItemRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение статуса одного заказа
%% Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec update_order_status(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_status_request:ympa_erlang_client_update_order_status_request()) -> {ok, ympa_erlang_client_update_order_status_response:ympa_erlang_client_update_order_status_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_status(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStatusRequest) ->
    update_order_status(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStatusRequest, #{}).

-spec update_order_status(ctx:ctx(), integer(), integer(), ympa_erlang_client_update_order_status_request:ympa_erlang_client_update_order_status_request(), maps:map()) -> {ok, ympa_erlang_client_update_order_status_response:ympa_erlang_client_update_order_status_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_status(Ctx, CampaignId, OrderId, YmpaErlangClientUpdateOrderStatusRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/", OrderId, "/status"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOrderStatusRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Изменение статусов нескольких заказов
%% Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
-spec update_order_statuses(ctx:ctx(), integer(), ympa_erlang_client_update_order_statuses_request:ympa_erlang_client_update_order_statuses_request()) -> {ok, ympa_erlang_client_update_order_statuses_response:ympa_erlang_client_update_order_statuses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_statuses(Ctx, CampaignId, YmpaErlangClientUpdateOrderStatusesRequest) ->
    update_order_statuses(Ctx, CampaignId, YmpaErlangClientUpdateOrderStatusesRequest, #{}).

-spec update_order_statuses(ctx:ctx(), integer(), ympa_erlang_client_update_order_statuses_request:ympa_erlang_client_update_order_statuses_request(), maps:map()) -> {ok, ympa_erlang_client_update_order_statuses_response:ympa_erlang_client_update_order_statuses_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_order_statuses(Ctx, CampaignId, YmpaErlangClientUpdateOrderStatusesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/orders/status-update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateOrderStatusesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Установка цен на товары в конкретном магазине
%% Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
-spec update_prices(ctx:ctx(), integer(), ympa_erlang_client_update_prices_request:ympa_erlang_client_update_prices_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest) ->
    update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest, #{}).

-spec update_prices(ctx:ctx(), integer(), ympa_erlang_client_update_prices_request:ympa_erlang_client_update_prices_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_prices(Ctx, CampaignId, YmpaErlangClientUpdatePricesRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offer-prices/updates"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdatePricesRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Добавление товаров в акцию или изменение их цен
%% Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
-spec update_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_update_promo_offers_request:ympa_erlang_client_update_promo_offers_request()) -> {ok, ympa_erlang_client_update_promo_offers_response:ympa_erlang_client_update_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest) ->
    update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest, #{}).

-spec update_promo_offers(ctx:ctx(), integer(), ympa_erlang_client_update_promo_offers_request:ympa_erlang_client_update_promo_offers_request(), maps:map()) -> {ok, ympa_erlang_client_update_promo_offers_response:ympa_erlang_client_update_promo_offers_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_promo_offers(Ctx, BusinessId, YmpaErlangClientUpdatePromoOffersRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = post,
    Path = [?BASE_URL, "/businesses/", BusinessId, "/promos/offers/update"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdatePromoOffersRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Передача информации об остатках
%% Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
-spec update_stocks(ctx:ctx(), integer(), ympa_erlang_client_update_stocks_request:ympa_erlang_client_update_stocks_request()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_stocks(Ctx, CampaignId, YmpaErlangClientUpdateStocksRequest) ->
    update_stocks(Ctx, CampaignId, YmpaErlangClientUpdateStocksRequest, #{}).

-spec update_stocks(ctx:ctx(), integer(), ympa_erlang_client_update_stocks_request:ympa_erlang_client_update_stocks_request(), maps:map()) -> {ok, ympa_erlang_client_empty_api_response:ympa_erlang_client_empty_api_response(), ympa_erlang_client_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), ympa_erlang_client_utils:response_info()}.
update_stocks(Ctx, CampaignId, YmpaErlangClientUpdateStocksRequest, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(ympa_erlang_client_api, config, #{})),

    Method = put,
    Path = [?BASE_URL, "/campaigns/", CampaignId, "/offers/stocks"],
    QS = [],
    Headers = [],
    Body1 = YmpaErlangClientUpdateStocksRequest,
    ContentTypeHeader = ympa_erlang_client_utils:select_header_content_type([<<"application/json">>]),
    Opts = maps:get(hackney_opts, Optional, []),

    ympa_erlang_client_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


