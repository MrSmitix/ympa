#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/accept_order_cancellation_request.h"
#include "../model/add_hidden_offers_request.h"
#include "../model/add_offers_to_archive_request.h"
#include "../model/add_offers_to_archive_response.h"
#include "../model/api_client_data_error_response.h"
#include "../model/api_forbidden_error_response.h"
#include "../model/api_limit_error_response.h"
#include "../model/api_locked_error_response.h"
#include "../model/api_not_found_error_response.h"
#include "../model/api_server_error_response.h"
#include "../model/api_unauthorized_error_response.h"
#include "../model/calculate_tariffs_request.h"
#include "../model/calculate_tariffs_response.h"
#include "../model/change_outlet_request.h"
#include "../model/confirm_prices_request.h"
#include "../model/create_chat_request.h"
#include "../model/create_chat_response.h"
#include "../model/create_outlet_response.h"
#include "../model/currency_type.h"
#include "../model/delete_campaign_offers_request.h"
#include "../model/delete_campaign_offers_response.h"
#include "../model/delete_goods_feedback_comment_request.h"
#include "../model/delete_hidden_offers_request.h"
#include "../model/delete_offers_from_archive_request.h"
#include "../model/delete_offers_from_archive_response.h"
#include "../model/delete_offers_request.h"
#include "../model/delete_offers_response.h"
#include "../model/delete_promo_offers_request.h"
#include "../model/delete_promo_offers_response.h"
#include "../model/empty_api_response.h"
#include "../model/feed_index_logs_status_type.h"
#include "../model/generate_boost_consolidated_request.h"
#include "../model/generate_competitors_position_report_request.h"
#include "../model/generate_goods_feedback_request.h"
#include "../model/generate_mass_order_labels_request.h"
#include "../model/generate_prices_report_request.h"
#include "../model/generate_report_response.h"
#include "../model/generate_shelfs_statistics_request.h"
#include "../model/generate_shows_sales_report_request.h"
#include "../model/generate_stocks_on_warehouses_report_request.h"
#include "../model/generate_united_marketplace_services_report_request.h"
#include "../model/generate_united_netting_report_request.h"
#include "../model/generate_united_orders_request.h"
#include "../model/get_all_offers_response.h"
#include "../model/get_bids_info_request.h"
#include "../model/get_bids_info_response.h"
#include "../model/get_bids_recommendations_request.h"
#include "../model/get_bids_recommendations_response.h"
#include "../model/get_business_buyer_info_response.h"
#include "../model/get_business_documents_info_response.h"
#include "../model/get_business_settings_response.h"
#include "../model/get_campaign_logins_response.h"
#include "../model/get_campaign_offers_request.h"
#include "../model/get_campaign_offers_response.h"
#include "../model/get_campaign_region_response.h"
#include "../model/get_campaign_response.h"
#include "../model/get_campaign_settings_response.h"
#include "../model/get_campaigns_response.h"
#include "../model/get_categories_max_sale_quantum_request.h"
#include "../model/get_categories_max_sale_quantum_response.h"
#include "../model/get_categories_request.h"
#include "../model/get_categories_response.h"
#include "../model/get_category_content_parameters_response.h"
#include "../model/get_chat_history_request.h"
#include "../model/get_chat_history_response.h"
#include "../model/get_chats_request.h"
#include "../model/get_chats_response.h"
#include "../model/get_delivery_services_response.h"
#include "../model/get_feed_index_logs_response.h"
#include "../model/get_feed_response.h"
#include "../model/get_feedback_list_response.h"
#include "../model/get_feeds_response.h"
#include "../model/get_goods_feedback_comments_request.h"
#include "../model/get_goods_feedback_comments_response.h"
#include "../model/get_goods_feedback_request.h"
#include "../model/get_goods_feedback_response.h"
#include "../model/get_goods_stats_request.h"
#include "../model/get_goods_stats_response.h"
#include "../model/get_hidden_offers_response.h"
#include "../model/get_models_offers_response.h"
#include "../model/get_models_request.h"
#include "../model/get_models_response.h"
#include "../model/get_offer_cards_content_status_request.h"
#include "../model/get_offer_cards_content_status_response.h"
#include "../model/get_offer_mapping_entries_response.h"
#include "../model/get_offer_mappings_request.h"
#include "../model/get_offer_mappings_response.h"
#include "../model/get_offer_recommendations_request.h"
#include "../model/get_offer_recommendations_response.h"
#include "../model/get_offers_response.h"
#include "../model/get_order_buyer_info_response.h"
#include "../model/get_order_labels_data_response.h"
#include "../model/get_order_response.h"
#include "../model/get_orders_response.h"
#include "../model/get_orders_stats_request.h"
#include "../model/get_orders_stats_response.h"
#include "../model/get_outlet_licenses_response.h"
#include "../model/get_outlet_response.h"
#include "../model/get_outlets_response.h"
#include "../model/get_prices_by_offer_ids_request.h"
#include "../model/get_prices_by_offer_ids_response.h"
#include "../model/get_prices_response.h"
#include "../model/get_promo_offers_request.h"
#include "../model/get_promo_offers_response.h"
#include "../model/get_promos_request.h"
#include "../model/get_promos_response.h"
#include "../model/get_quality_rating_details_response.h"
#include "../model/get_quality_rating_request.h"
#include "../model/get_quality_rating_response.h"
#include "../model/get_quarantine_offers_request.h"
#include "../model/get_quarantine_offers_response.h"
#include "../model/get_region_with_children_response.h"
#include "../model/get_regions_response.h"
#include "../model/get_report_info_response.h"
#include "../model/get_return_response.h"
#include "../model/get_returns_response.h"
#include "../model/get_suggested_offer_mapping_entries_request.h"
#include "../model/get_suggested_offer_mapping_entries_response.h"
#include "../model/get_suggested_offer_mappings_request.h"
#include "../model/get_suggested_offer_mappings_response.h"
#include "../model/get_warehouse_stocks_request.h"
#include "../model/get_warehouse_stocks_response.h"
#include "../model/get_warehouses_response.h"
#include "../model/offer_availability_status_type.h"
#include "../model/offer_mapping_kind_type.h"
#include "../model/offer_processing_status_type.h"
#include "../model/order_buyer_type.h"
#include "../model/order_delivery_dispatch_type.h"
#include "../model/order_status_type.h"
#include "../model/order_substatus_type.h"
#include "../model/page_format_type.h"
#include "../model/provide_order_digital_codes_request.h"
#include "../model/provide_order_item_identifiers_request.h"
#include "../model/provide_order_item_identifiers_response.h"
#include "../model/put_sku_bids_request.h"
#include "../model/refund_status_type.h"
#include "../model/report_format_type.h"
#include "../model/return_type.h"
#include "../model/search_models_response.h"
#include "../model/send_message_to_chat_request.h"
#include "../model/set_feed_params_request.h"
#include "../model/set_order_box_layout_request.h"
#include "../model/set_order_box_layout_response.h"
#include "../model/set_order_delivery_date_request.h"
#include "../model/set_order_delivery_track_code_request.h"
#include "../model/set_order_shipment_boxes_request.h"
#include "../model/set_order_shipment_boxes_response.h"
#include "../model/set_return_decision_request.h"
#include "../model/skip_goods_feedback_reaction_request.h"
#include "../model/sort_order_type.h"
#include "../model/suggest_prices_request.h"
#include "../model/suggest_prices_response.h"
#include "../model/update_business_prices_request.h"
#include "../model/update_campaign_offers_request.h"
#include "../model/update_goods_feedback_comment_request.h"
#include "../model/update_goods_feedback_comment_response.h"
#include "../model/update_offer_content_request.h"
#include "../model/update_offer_content_response.h"
#include "../model/update_offer_mapping_entry_request.h"
#include "../model/update_offer_mappings_request.h"
#include "../model/update_offer_mappings_response.h"
#include "../model/update_order_item_request.h"
#include "../model/update_order_status_request.h"
#include "../model/update_order_status_response.h"
#include "../model/update_order_statuses_request.h"
#include "../model/update_order_statuses_response.h"
#include "../model/update_order_storage_limit_request.h"
#include "../model/update_outlet_license_request.h"
#include "../model/update_prices_request.h"
#include "../model/update_promo_offers_request.h"
#include "../model/update_promo_offers_response.h"
#include "../model/update_stocks_request.h"

// Enum  for DbsAPI_generateBoostConsolidatedReport
typedef enum  { _api__generateBoostConsolidatedReport__NULL = 0, _api__generateBoostConsolidatedReport__FILE, _api__generateBoostConsolidatedReport__CSV } _api__generateBoostConsolidatedReport_format_e;

// Enum  for DbsAPI_generateCompetitorsPositionReport
typedef enum  { _api__generateCompetitorsPositionReport__NULL = 0, _api__generateCompetitorsPositionReport__FILE, _api__generateCompetitorsPositionReport__CSV } _api__generateCompetitorsPositionReport_format_e;

// Enum  for DbsAPI_generateGoodsFeedbackReport
typedef enum  { _api__generateGoodsFeedbackReport__NULL = 0, _api__generateGoodsFeedbackReport__FILE, _api__generateGoodsFeedbackReport__CSV } _api__generateGoodsFeedbackReport_format_e;

// Enum  for DbsAPI_generateMassOrderLabelsReport
typedef enum  { _api__generateMassOrderLabelsReport__NULL = 0, _api__generateMassOrderLabelsReport__A7, _api__generateMassOrderLabelsReport__A4 } _api__generateMassOrderLabelsReport_format_e;

// Enum  for DbsAPI_generateOrderLabel
typedef enum  { _api__generateOrderLabel__NULL = 0, _api__generateOrderLabel__A7, _api__generateOrderLabel__A4 } _api__generateOrderLabel_format_e;

// Enum  for DbsAPI_generateOrderLabels
typedef enum  { _api__generateOrderLabels__NULL = 0, _api__generateOrderLabels__A7, _api__generateOrderLabels__A4 } _api__generateOrderLabels_format_e;

// Enum  for DbsAPI_generatePricesReport
typedef enum  { _api__generatePricesReport__NULL = 0, _api__generatePricesReport__FILE, _api__generatePricesReport__CSV } _api__generatePricesReport_format_e;

// Enum  for DbsAPI_generateShelfsStatisticsReport
typedef enum  { _api__generateShelfsStatisticsReport__NULL = 0, _api__generateShelfsStatisticsReport__FILE, _api__generateShelfsStatisticsReport__CSV } _api__generateShelfsStatisticsReport_format_e;

// Enum  for DbsAPI_generateShowsSalesReport
typedef enum  { _api__generateShowsSalesReport__NULL = 0, _api__generateShowsSalesReport__FILE, _api__generateShowsSalesReport__CSV } _api__generateShowsSalesReport_format_e;

// Enum  for DbsAPI_generateStocksOnWarehousesReport
typedef enum  { _api__generateStocksOnWarehousesReport__NULL = 0, _api__generateStocksOnWarehousesReport__FILE, _api__generateStocksOnWarehousesReport__CSV } _api__generateStocksOnWarehousesReport_format_e;

// Enum  for DbsAPI_generateUnitedMarketplaceServicesReport
typedef enum  { _api__generateUnitedMarketplaceServicesReport__NULL = 0, _api__generateUnitedMarketplaceServicesReport__FILE, _api__generateUnitedMarketplaceServicesReport__CSV } _api__generateUnitedMarketplaceServicesReport_format_e;

// Enum  for DbsAPI_generateUnitedNettingReport
typedef enum  { _api__generateUnitedNettingReport__NULL = 0, _api__generateUnitedNettingReport__FILE, _api__generateUnitedNettingReport__CSV } _api__generateUnitedNettingReport_format_e;

// Enum  for DbsAPI_generateUnitedOrdersReport
typedef enum  { _api__generateUnitedOrdersReport__NULL = 0, _api__generateUnitedOrdersReport__FILE, _api__generateUnitedOrdersReport__CSV } _api__generateUnitedOrdersReport_format_e;

// Enum  for DbsAPI_getFeedIndexLogs
typedef enum  { _api__getFeedIndexLogs__NULL = 0, _api__getFeedIndexLogs__ERROR, _api__getFeedIndexLogs__OK, _api__getFeedIndexLogs__WARNING } _api__getFeedIndexLogs_status_e;

// Enum  for DbsAPI_getModel
typedef enum  { _api__getModel__NULL = 0, _api__getModel__RUR, _api__getModel__USD, _api__getModel__EUR, _api__getModel__UAH, _api__getModel__AUD, _api__getModel__GBP, _api__getModel__BYR, _api__getModel__BYN, _api__getModel__DKK, _api__getModel__ISK, _api__getModel__KZT, _api__getModel__CAD, _api__getModel__CNY, _api__getModel__NOK, _api__getModel__XDR, _api__getModel__SGD, _api__getModel___TRY, _api__getModel__SEK, _api__getModel__CHF, _api__getModel__JPY, _api__getModel__AZN, _api__getModel__ALL, _api__getModel__DZD, _api__getModel__AOA, _api__getModel__ARS, _api__getModel__AMD, _api__getModel__AFN, _api__getModel__BHD, _api__getModel__BGN, _api__getModel__BOB, _api__getModel__BWP, _api__getModel__BND, _api__getModel__BRL, _api__getModel__BIF, _api__getModel__HUF, _api__getModel__VEF, _api__getModel__KPW, _api__getModel__VND, _api__getModel__GMD, _api__getModel__GHS, _api__getModel__GNF, _api__getModel__HKD, _api__getModel__GEL, _api__getModel__AED, _api__getModel__EGP, _api__getModel__ZMK, _api__getModel__ILS, _api__getModel__INR, _api__getModel__IDR, _api__getModel__JOD, _api__getModel__IQD, _api__getModel__IRR, _api__getModel__YER, _api__getModel__QAR, _api__getModel__KES, _api__getModel__KGS, _api__getModel__COP, _api__getModel__CDF, _api__getModel__CRC, _api__getModel__KWD, _api__getModel__CUP, _api__getModel__LAK, _api__getModel__LVL, _api__getModel__SLL, _api__getModel__LBP, _api__getModel__LYD, _api__getModel__SZL, _api__getModel__LTL, _api__getModel__MUR, _api__getModel__MRO, _api__getModel__MKD, _api__getModel__MWK, _api__getModel__MGA, _api__getModel__MYR, _api__getModel__MAD, _api__getModel__MXN, _api__getModel__MZN, _api__getModel__MDL, _api__getModel__MNT, _api__getModel__NPR, _api__getModel__NGN, _api__getModel__NIO, _api__getModel__NZD, _api__getModel__OMR, _api__getModel__PKR, _api__getModel__PYG, _api__getModel__PEN, _api__getModel__PLN, _api__getModel__KHR, _api__getModel__SAR, _api__getModel__RON, _api__getModel__SCR, _api__getModel__SYP, _api__getModel__SKK, _api__getModel__SOS, _api__getModel__SDG, _api__getModel__SRD, _api__getModel__TJS, _api__getModel__THB, _api__getModel__TWD, _api__getModel__BDT, _api__getModel__TZS, _api__getModel__TND, _api__getModel__TMM, _api__getModel__UGX, _api__getModel__UZS, _api__getModel__UYU, _api__getModel__PHP, _api__getModel__DJF, _api__getModel__XAF, _api__getModel__XOF, _api__getModel__HRK, _api__getModel__CZK, _api__getModel__CLP, _api__getModel__LKR, _api__getModel__EEK, _api__getModel__ETB, _api__getModel__RSD, _api__getModel__ZAR, _api__getModel__KRW, _api__getModel__NAD, _api__getModel__TL, _api__getModel__UE } _api__getModel_currency_e;

// Enum  for DbsAPI_getModelOffers
typedef enum  { _api__getModelOffers__NULL = 0, _api__getModelOffers__RUR, _api__getModelOffers__USD, _api__getModelOffers__EUR, _api__getModelOffers__UAH, _api__getModelOffers__AUD, _api__getModelOffers__GBP, _api__getModelOffers__BYR, _api__getModelOffers__BYN, _api__getModelOffers__DKK, _api__getModelOffers__ISK, _api__getModelOffers__KZT, _api__getModelOffers__CAD, _api__getModelOffers__CNY, _api__getModelOffers__NOK, _api__getModelOffers__XDR, _api__getModelOffers__SGD, _api__getModelOffers___TRY, _api__getModelOffers__SEK, _api__getModelOffers__CHF, _api__getModelOffers__JPY, _api__getModelOffers__AZN, _api__getModelOffers__ALL, _api__getModelOffers__DZD, _api__getModelOffers__AOA, _api__getModelOffers__ARS, _api__getModelOffers__AMD, _api__getModelOffers__AFN, _api__getModelOffers__BHD, _api__getModelOffers__BGN, _api__getModelOffers__BOB, _api__getModelOffers__BWP, _api__getModelOffers__BND, _api__getModelOffers__BRL, _api__getModelOffers__BIF, _api__getModelOffers__HUF, _api__getModelOffers__VEF, _api__getModelOffers__KPW, _api__getModelOffers__VND, _api__getModelOffers__GMD, _api__getModelOffers__GHS, _api__getModelOffers__GNF, _api__getModelOffers__HKD, _api__getModelOffers__GEL, _api__getModelOffers__AED, _api__getModelOffers__EGP, _api__getModelOffers__ZMK, _api__getModelOffers__ILS, _api__getModelOffers__INR, _api__getModelOffers__IDR, _api__getModelOffers__JOD, _api__getModelOffers__IQD, _api__getModelOffers__IRR, _api__getModelOffers__YER, _api__getModelOffers__QAR, _api__getModelOffers__KES, _api__getModelOffers__KGS, _api__getModelOffers__COP, _api__getModelOffers__CDF, _api__getModelOffers__CRC, _api__getModelOffers__KWD, _api__getModelOffers__CUP, _api__getModelOffers__LAK, _api__getModelOffers__LVL, _api__getModelOffers__SLL, _api__getModelOffers__LBP, _api__getModelOffers__LYD, _api__getModelOffers__SZL, _api__getModelOffers__LTL, _api__getModelOffers__MUR, _api__getModelOffers__MRO, _api__getModelOffers__MKD, _api__getModelOffers__MWK, _api__getModelOffers__MGA, _api__getModelOffers__MYR, _api__getModelOffers__MAD, _api__getModelOffers__MXN, _api__getModelOffers__MZN, _api__getModelOffers__MDL, _api__getModelOffers__MNT, _api__getModelOffers__NPR, _api__getModelOffers__NGN, _api__getModelOffers__NIO, _api__getModelOffers__NZD, _api__getModelOffers__OMR, _api__getModelOffers__PKR, _api__getModelOffers__PYG, _api__getModelOffers__PEN, _api__getModelOffers__PLN, _api__getModelOffers__KHR, _api__getModelOffers__SAR, _api__getModelOffers__RON, _api__getModelOffers__SCR, _api__getModelOffers__SYP, _api__getModelOffers__SKK, _api__getModelOffers__SOS, _api__getModelOffers__SDG, _api__getModelOffers__SRD, _api__getModelOffers__TJS, _api__getModelOffers__THB, _api__getModelOffers__TWD, _api__getModelOffers__BDT, _api__getModelOffers__TZS, _api__getModelOffers__TND, _api__getModelOffers__TMM, _api__getModelOffers__UGX, _api__getModelOffers__UZS, _api__getModelOffers__UYU, _api__getModelOffers__PHP, _api__getModelOffers__DJF, _api__getModelOffers__XAF, _api__getModelOffers__XOF, _api__getModelOffers__HRK, _api__getModelOffers__CZK, _api__getModelOffers__CLP, _api__getModelOffers__LKR, _api__getModelOffers__EEK, _api__getModelOffers__ETB, _api__getModelOffers__RSD, _api__getModelOffers__ZAR, _api__getModelOffers__KRW, _api__getModelOffers__NAD, _api__getModelOffers__TL, _api__getModelOffers__UE } _api__getModelOffers_currency_e;

// Enum  for DbsAPI_getModelOffers
typedef enum  { _api__getModelOffers__NULL = 0, _api__getModelOffers__ASC, _api__getModelOffers__DESC } _api__getModelOffers_orderByPrice_e;

// Enum  for DbsAPI_getModels
typedef enum  { _api__getModels__NULL = 0, _api__getModels__RUR, _api__getModels__USD, _api__getModels__EUR, _api__getModels__UAH, _api__getModels__AUD, _api__getModels__GBP, _api__getModels__BYR, _api__getModels__BYN, _api__getModels__DKK, _api__getModels__ISK, _api__getModels__KZT, _api__getModels__CAD, _api__getModels__CNY, _api__getModels__NOK, _api__getModels__XDR, _api__getModels__SGD, _api__getModels___TRY, _api__getModels__SEK, _api__getModels__CHF, _api__getModels__JPY, _api__getModels__AZN, _api__getModels__ALL, _api__getModels__DZD, _api__getModels__AOA, _api__getModels__ARS, _api__getModels__AMD, _api__getModels__AFN, _api__getModels__BHD, _api__getModels__BGN, _api__getModels__BOB, _api__getModels__BWP, _api__getModels__BND, _api__getModels__BRL, _api__getModels__BIF, _api__getModels__HUF, _api__getModels__VEF, _api__getModels__KPW, _api__getModels__VND, _api__getModels__GMD, _api__getModels__GHS, _api__getModels__GNF, _api__getModels__HKD, _api__getModels__GEL, _api__getModels__AED, _api__getModels__EGP, _api__getModels__ZMK, _api__getModels__ILS, _api__getModels__INR, _api__getModels__IDR, _api__getModels__JOD, _api__getModels__IQD, _api__getModels__IRR, _api__getModels__YER, _api__getModels__QAR, _api__getModels__KES, _api__getModels__KGS, _api__getModels__COP, _api__getModels__CDF, _api__getModels__CRC, _api__getModels__KWD, _api__getModels__CUP, _api__getModels__LAK, _api__getModels__LVL, _api__getModels__SLL, _api__getModels__LBP, _api__getModels__LYD, _api__getModels__SZL, _api__getModels__LTL, _api__getModels__MUR, _api__getModels__MRO, _api__getModels__MKD, _api__getModels__MWK, _api__getModels__MGA, _api__getModels__MYR, _api__getModels__MAD, _api__getModels__MXN, _api__getModels__MZN, _api__getModels__MDL, _api__getModels__MNT, _api__getModels__NPR, _api__getModels__NGN, _api__getModels__NIO, _api__getModels__NZD, _api__getModels__OMR, _api__getModels__PKR, _api__getModels__PYG, _api__getModels__PEN, _api__getModels__PLN, _api__getModels__KHR, _api__getModels__SAR, _api__getModels__RON, _api__getModels__SCR, _api__getModels__SYP, _api__getModels__SKK, _api__getModels__SOS, _api__getModels__SDG, _api__getModels__SRD, _api__getModels__TJS, _api__getModels__THB, _api__getModels__TWD, _api__getModels__BDT, _api__getModels__TZS, _api__getModels__TND, _api__getModels__TMM, _api__getModels__UGX, _api__getModels__UZS, _api__getModels__UYU, _api__getModels__PHP, _api__getModels__DJF, _api__getModels__XAF, _api__getModels__XOF, _api__getModels__HRK, _api__getModels__CZK, _api__getModels__CLP, _api__getModels__LKR, _api__getModels__EEK, _api__getModels__ETB, _api__getModels__RSD, _api__getModels__ZAR, _api__getModels__KRW, _api__getModels__NAD, _api__getModels__TL, _api__getModels__UE } _api__getModels_currency_e;

// Enum  for DbsAPI_getModelsOffers
typedef enum  { _api__getModelsOffers__NULL = 0, _api__getModelsOffers__RUR, _api__getModelsOffers__USD, _api__getModelsOffers__EUR, _api__getModelsOffers__UAH, _api__getModelsOffers__AUD, _api__getModelsOffers__GBP, _api__getModelsOffers__BYR, _api__getModelsOffers__BYN, _api__getModelsOffers__DKK, _api__getModelsOffers__ISK, _api__getModelsOffers__KZT, _api__getModelsOffers__CAD, _api__getModelsOffers__CNY, _api__getModelsOffers__NOK, _api__getModelsOffers__XDR, _api__getModelsOffers__SGD, _api__getModelsOffers___TRY, _api__getModelsOffers__SEK, _api__getModelsOffers__CHF, _api__getModelsOffers__JPY, _api__getModelsOffers__AZN, _api__getModelsOffers__ALL, _api__getModelsOffers__DZD, _api__getModelsOffers__AOA, _api__getModelsOffers__ARS, _api__getModelsOffers__AMD, _api__getModelsOffers__AFN, _api__getModelsOffers__BHD, _api__getModelsOffers__BGN, _api__getModelsOffers__BOB, _api__getModelsOffers__BWP, _api__getModelsOffers__BND, _api__getModelsOffers__BRL, _api__getModelsOffers__BIF, _api__getModelsOffers__HUF, _api__getModelsOffers__VEF, _api__getModelsOffers__KPW, _api__getModelsOffers__VND, _api__getModelsOffers__GMD, _api__getModelsOffers__GHS, _api__getModelsOffers__GNF, _api__getModelsOffers__HKD, _api__getModelsOffers__GEL, _api__getModelsOffers__AED, _api__getModelsOffers__EGP, _api__getModelsOffers__ZMK, _api__getModelsOffers__ILS, _api__getModelsOffers__INR, _api__getModelsOffers__IDR, _api__getModelsOffers__JOD, _api__getModelsOffers__IQD, _api__getModelsOffers__IRR, _api__getModelsOffers__YER, _api__getModelsOffers__QAR, _api__getModelsOffers__KES, _api__getModelsOffers__KGS, _api__getModelsOffers__COP, _api__getModelsOffers__CDF, _api__getModelsOffers__CRC, _api__getModelsOffers__KWD, _api__getModelsOffers__CUP, _api__getModelsOffers__LAK, _api__getModelsOffers__LVL, _api__getModelsOffers__SLL, _api__getModelsOffers__LBP, _api__getModelsOffers__LYD, _api__getModelsOffers__SZL, _api__getModelsOffers__LTL, _api__getModelsOffers__MUR, _api__getModelsOffers__MRO, _api__getModelsOffers__MKD, _api__getModelsOffers__MWK, _api__getModelsOffers__MGA, _api__getModelsOffers__MYR, _api__getModelsOffers__MAD, _api__getModelsOffers__MXN, _api__getModelsOffers__MZN, _api__getModelsOffers__MDL, _api__getModelsOffers__MNT, _api__getModelsOffers__NPR, _api__getModelsOffers__NGN, _api__getModelsOffers__NIO, _api__getModelsOffers__NZD, _api__getModelsOffers__OMR, _api__getModelsOffers__PKR, _api__getModelsOffers__PYG, _api__getModelsOffers__PEN, _api__getModelsOffers__PLN, _api__getModelsOffers__KHR, _api__getModelsOffers__SAR, _api__getModelsOffers__RON, _api__getModelsOffers__SCR, _api__getModelsOffers__SYP, _api__getModelsOffers__SKK, _api__getModelsOffers__SOS, _api__getModelsOffers__SDG, _api__getModelsOffers__SRD, _api__getModelsOffers__TJS, _api__getModelsOffers__THB, _api__getModelsOffers__TWD, _api__getModelsOffers__BDT, _api__getModelsOffers__TZS, _api__getModelsOffers__TND, _api__getModelsOffers__TMM, _api__getModelsOffers__UGX, _api__getModelsOffers__UZS, _api__getModelsOffers__UYU, _api__getModelsOffers__PHP, _api__getModelsOffers__DJF, _api__getModelsOffers__XAF, _api__getModelsOffers__XOF, _api__getModelsOffers__HRK, _api__getModelsOffers__CZK, _api__getModelsOffers__CLP, _api__getModelsOffers__LKR, _api__getModelsOffers__EEK, _api__getModelsOffers__ETB, _api__getModelsOffers__RSD, _api__getModelsOffers__ZAR, _api__getModelsOffers__KRW, _api__getModelsOffers__NAD, _api__getModelsOffers__TL, _api__getModelsOffers__UE } _api__getModelsOffers_currency_e;

// Enum  for DbsAPI_getModelsOffers
typedef enum  { _api__getModelsOffers__NULL = 0, _api__getModelsOffers__ASC, _api__getModelsOffers__DESC } _api__getModelsOffers_orderByPrice_e;

// Enum  for DbsAPI_getOfferMappingEntries
typedef enum  { _api__getOfferMappingEntries__NULL = 0, _api__getOfferMappingEntries__ACTIVE, _api__getOfferMappingEntries__ALL } _api__getOfferMappingEntries_mapping_kind_e;

// Enum STATUS for DbsAPI_getOfferMappingEntries
typedef enum  { _api__getOfferMappingEntries_STATUS_NULL = 0, _api__getOfferMappingEntries_STATUS_UNKNOWN, _api__getOfferMappingEntries_STATUS_READY, _api__getOfferMappingEntries_STATUS_IN_WORK, _api__getOfferMappingEntries_STATUS_NEED_INFO, _api__getOfferMappingEntries_STATUS_NEED_MAPPING, _api__getOfferMappingEntries_STATUS_NEED_CONTENT, _api__getOfferMappingEntries_STATUS_CONTENT_PROCESSING, _api__getOfferMappingEntries_STATUS_SUSPENDED, _api__getOfferMappingEntries_STATUS_REJECTED, _api__getOfferMappingEntries_STATUS_REVIEW, _api__getOfferMappingEntries_STATUS_CREATE_ERROR, _api__getOfferMappingEntries_STATUS_UPDATE_ERROR } _api__getOfferMappingEntries_status_e;

// Enum AVAILABILITY for DbsAPI_getOfferMappingEntries
typedef enum  { _api__getOfferMappingEntries_AVAILABILITY_NULL = 0, _api__getOfferMappingEntries_AVAILABILITY_ACTIVE, _api__getOfferMappingEntries_AVAILABILITY_INACTIVE, _api__getOfferMappingEntries_AVAILABILITY_DELISTED } _api__getOfferMappingEntries_availability_e;

// Enum  for DbsAPI_getOffers
typedef enum  { _api__getOffers__NULL = 0, _api__getOffers__RUR, _api__getOffers__USD, _api__getOffers__EUR, _api__getOffers__UAH, _api__getOffers__AUD, _api__getOffers__GBP, _api__getOffers__BYR, _api__getOffers__BYN, _api__getOffers__DKK, _api__getOffers__ISK, _api__getOffers__KZT, _api__getOffers__CAD, _api__getOffers__CNY, _api__getOffers__NOK, _api__getOffers__XDR, _api__getOffers__SGD, _api__getOffers___TRY, _api__getOffers__SEK, _api__getOffers__CHF, _api__getOffers__JPY, _api__getOffers__AZN, _api__getOffers__ALL, _api__getOffers__DZD, _api__getOffers__AOA, _api__getOffers__ARS, _api__getOffers__AMD, _api__getOffers__AFN, _api__getOffers__BHD, _api__getOffers__BGN, _api__getOffers__BOB, _api__getOffers__BWP, _api__getOffers__BND, _api__getOffers__BRL, _api__getOffers__BIF, _api__getOffers__HUF, _api__getOffers__VEF, _api__getOffers__KPW, _api__getOffers__VND, _api__getOffers__GMD, _api__getOffers__GHS, _api__getOffers__GNF, _api__getOffers__HKD, _api__getOffers__GEL, _api__getOffers__AED, _api__getOffers__EGP, _api__getOffers__ZMK, _api__getOffers__ILS, _api__getOffers__INR, _api__getOffers__IDR, _api__getOffers__JOD, _api__getOffers__IQD, _api__getOffers__IRR, _api__getOffers__YER, _api__getOffers__QAR, _api__getOffers__KES, _api__getOffers__KGS, _api__getOffers__COP, _api__getOffers__CDF, _api__getOffers__CRC, _api__getOffers__KWD, _api__getOffers__CUP, _api__getOffers__LAK, _api__getOffers__LVL, _api__getOffers__SLL, _api__getOffers__LBP, _api__getOffers__LYD, _api__getOffers__SZL, _api__getOffers__LTL, _api__getOffers__MUR, _api__getOffers__MRO, _api__getOffers__MKD, _api__getOffers__MWK, _api__getOffers__MGA, _api__getOffers__MYR, _api__getOffers__MAD, _api__getOffers__MXN, _api__getOffers__MZN, _api__getOffers__MDL, _api__getOffers__MNT, _api__getOffers__NPR, _api__getOffers__NGN, _api__getOffers__NIO, _api__getOffers__NZD, _api__getOffers__OMR, _api__getOffers__PKR, _api__getOffers__PYG, _api__getOffers__PEN, _api__getOffers__PLN, _api__getOffers__KHR, _api__getOffers__SAR, _api__getOffers__RON, _api__getOffers__SCR, _api__getOffers__SYP, _api__getOffers__SKK, _api__getOffers__SOS, _api__getOffers__SDG, _api__getOffers__SRD, _api__getOffers__TJS, _api__getOffers__THB, _api__getOffers__TWD, _api__getOffers__BDT, _api__getOffers__TZS, _api__getOffers__TND, _api__getOffers__TMM, _api__getOffers__UGX, _api__getOffers__UZS, _api__getOffers__UYU, _api__getOffers__PHP, _api__getOffers__DJF, _api__getOffers__XAF, _api__getOffers__XOF, _api__getOffers__HRK, _api__getOffers__CZK, _api__getOffers__CLP, _api__getOffers__LKR, _api__getOffers__EEK, _api__getOffers__ETB, _api__getOffers__RSD, _api__getOffers__ZAR, _api__getOffers__KRW, _api__getOffers__NAD, _api__getOffers__TL, _api__getOffers__UE } _api__getOffers_currency_e;

// Enum STATUS for DbsAPI_getOrders
typedef enum  { _api__getOrders_STATUS_NULL = 0, _api__getOrders_STATUS_PLACING, _api__getOrders_STATUS_RESERVED, _api__getOrders_STATUS_UNPAID, _api__getOrders_STATUS_PROCESSING, _api__getOrders_STATUS_DELIVERY, _api__getOrders_STATUS_PICKUP, _api__getOrders_STATUS_DELIVERED, _api__getOrders_STATUS_CANCELLED, _api__getOrders_STATUS_PENDING, _api__getOrders_STATUS_PARTIALLY_RETURNED, _api__getOrders_STATUS_RETURNED, _api__getOrders_STATUS_UNKNOWN } _api__getOrders_status_e;

// Enum SUBSTATUS for DbsAPI_getOrders
typedef enum  { _api__getOrders_SUBSTATUS_NULL = 0, _api__getOrders_SUBSTATUS_RESERVATION_EXPIRED, _api__getOrders_SUBSTATUS_USER_NOT_PAID, _api__getOrders_SUBSTATUS_USER_UNREACHABLE, _api__getOrders_SUBSTATUS_USER_CHANGED_MIND, _api__getOrders_SUBSTATUS_USER_REFUSED_DELIVERY, _api__getOrders_SUBSTATUS_USER_REFUSED_PRODUCT, _api__getOrders_SUBSTATUS_SHOP_FAILED, _api__getOrders_SUBSTATUS_USER_REFUSED_QUALITY, _api__getOrders_SUBSTATUS_REPLACING_ORDER, _api__getOrders_SUBSTATUS_PROCESSING_EXPIRED, _api__getOrders_SUBSTATUS_PENDING_EXPIRED, _api__getOrders_SUBSTATUS_SHOP_PENDING_CANCELLED, _api__getOrders_SUBSTATUS_PENDING_CANCELLED, _api__getOrders_SUBSTATUS_USER_FRAUD, _api__getOrders_SUBSTATUS_RESERVATION_FAILED, _api__getOrders_SUBSTATUS_USER_PLACED_OTHER_ORDER, _api__getOrders_SUBSTATUS_USER_BOUGHT_CHEAPER, _api__getOrders_SUBSTATUS_MISSING_ITEM, _api__getOrders_SUBSTATUS_BROKEN_ITEM, _api__getOrders_SUBSTATUS_WRONG_ITEM, _api__getOrders_SUBSTATUS_PICKUP_EXPIRED, _api__getOrders_SUBSTATUS_DELIVERY_PROBLEMS, _api__getOrders_SUBSTATUS_LATE_CONTACT, _api__getOrders_SUBSTATUS_CUSTOM, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_FAILED, _api__getOrders_SUBSTATUS_WAREHOUSE_FAILED_TO_SHIP, _api__getOrders_SUBSTATUS_DELIVERY_SERIVCE_UNDELIVERED, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_UNDELIVERED, _api__getOrders_SUBSTATUS_PREORDER, _api__getOrders_SUBSTATUS_AWAIT_CONFIRMATION, _api__getOrders_SUBSTATUS_STARTED, _api__getOrders_SUBSTATUS_PACKAGING, _api__getOrders_SUBSTATUS_READY_TO_SHIP, _api__getOrders_SUBSTATUS_SHIPPED, _api__getOrders_SUBSTATUS_ASYNC_PROCESSING, _api__getOrders_SUBSTATUS_USER_REFUSED_TO_PROVIDE_PERSONAL_DATA, _api__getOrders_SUBSTATUS_WAITING_USER_INPUT, _api__getOrders_SUBSTATUS_WAITING_BANK_DECISION, _api__getOrders_SUBSTATUS_BANK_REJECT_CREDIT_OFFER, _api__getOrders_SUBSTATUS_CUSTOMER_REJECT_CREDIT_OFFER, _api__getOrders_SUBSTATUS_CREDIT_OFFER_FAILED, _api__getOrders_SUBSTATUS_AWAIT_DELIVERY_DATES_CONFIRMATION, _api__getOrders_SUBSTATUS_SERVICE_FAULT, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_RECEIVED, _api__getOrders_SUBSTATUS_USER_RECEIVED, _api__getOrders_SUBSTATUS_WAITING_FOR_STOCKS, _api__getOrders_SUBSTATUS_AS_PART_OF_MULTI_ORDER, _api__getOrders_SUBSTATUS_READY_FOR_LAST_MILE, _api__getOrders_SUBSTATUS_LAST_MILE_STARTED, _api__getOrders_SUBSTATUS_ANTIFRAUD, _api__getOrders_SUBSTATUS_DELIVERY_USER_NOT_RECEIVED, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_DELIVERED, _api__getOrders_SUBSTATUS_DELIVERED_USER_NOT_RECEIVED, _api__getOrders_SUBSTATUS_USER_WANTED_ANOTHER_PAYMENT_METHOD, _api__getOrders_SUBSTATUS_USER_RECEIVED_TECHNICAL_ERROR, _api__getOrders_SUBSTATUS_USER_FORGOT_TO_USE_BONUS, _api__getOrders_SUBSTATUS_RECEIVED_ON_DISTRIBUTION_CENTER, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_NOT_RECEIVED, _api__getOrders_SUBSTATUS_DELIVERY_SERVICE_LOST, _api__getOrders_SUBSTATUS_SHIPPED_TO_WRONG_DELIVERY_SERVICE, _api__getOrders_SUBSTATUS_DELIVERED_USER_RECEIVED, _api__getOrders_SUBSTATUS_WAITING_TINKOFF_DECISION, _api__getOrders_SUBSTATUS_COURIER_SEARCH, _api__getOrders_SUBSTATUS_COURIER_FOUND, _api__getOrders_SUBSTATUS_COURIER_IN_TRANSIT_TO_SENDER, _api__getOrders_SUBSTATUS_COURIER_ARRIVED_TO_SENDER, _api__getOrders_SUBSTATUS_COURIER_RECEIVED, _api__getOrders_SUBSTATUS_COURIER_NOT_FOUND, _api__getOrders_SUBSTATUS_COURIER_NOT_DELIVER_ORDER, _api__getOrders_SUBSTATUS_COURIER_RETURNS_ORDER, _api__getOrders_SUBSTATUS_COURIER_RETURNED_ORDER, _api__getOrders_SUBSTATUS_WAITING_USER_DELIVERY_INPUT, _api__getOrders_SUBSTATUS_PICKUP_SERVICE_RECEIVED, _api__getOrders_SUBSTATUS_PICKUP_USER_RECEIVED, _api__getOrders_SUBSTATUS_CANCELLED_COURIER_NOT_FOUND, _api__getOrders_SUBSTATUS_COURIER_NOT_COME_FOR_ORDER, _api__getOrders_SUBSTATUS_DELIVERY_NOT_MANAGED_REGION, _api__getOrders_SUBSTATUS_INCOMPLETE_CONTACT_INFORMATION, _api__getOrders_SUBSTATUS_INCOMPLETE_MULTI_ORDER, _api__getOrders_SUBSTATUS_INAPPROPRIATE_WEIGHT_SIZE, _api__getOrders_SUBSTATUS_TECHNICAL_ERROR, _api__getOrders_SUBSTATUS_SORTING_CENTER_LOST, _api__getOrders_SUBSTATUS_COURIER_SEARCH_NOT_STARTED, _api__getOrders_SUBSTATUS_LOST, _api__getOrders_SUBSTATUS_AWAIT_PAYMENT, _api__getOrders_SUBSTATUS_AWAIT_LAVKA_RESERVATION, _api__getOrders_SUBSTATUS_USER_WANTS_TO_CHANGE_ADDRESS, _api__getOrders_SUBSTATUS_FULL_NOT_RANSOM, _api__getOrders_SUBSTATUS_PRESCRIPTION_MISMATCH, _api__getOrders_SUBSTATUS_DROPOFF_LOST, _api__getOrders_SUBSTATUS_DROPOFF_CLOSED, _api__getOrders_SUBSTATUS_DELIVERY_TO_STORE_STARTED, _api__getOrders_SUBSTATUS_USER_WANTS_TO_CHANGE_DELIVERY_DATE, _api__getOrders_SUBSTATUS_WRONG_ITEM_DELIVERED, _api__getOrders_SUBSTATUS_DAMAGED_BOX, _api__getOrders_SUBSTATUS_AWAIT_DELIVERY_DATES, _api__getOrders_SUBSTATUS_LAST_MILE_COURIER_SEARCH, _api__getOrders_SUBSTATUS_PICKUP_POINT_CLOSED, _api__getOrders_SUBSTATUS_LEGAL_INFO_CHANGED, _api__getOrders_SUBSTATUS_USER_HAS_NO_TIME_TO_PICKUP_ORDER, _api__getOrders_SUBSTATUS_DELIVERY_CUSTOMS_ARRIVED, _api__getOrders_SUBSTATUS_DELIVERY_CUSTOMS_CLEARED, _api__getOrders_SUBSTATUS_FIRST_MILE_DELIVERY_SERVICE_RECEIVED, _api__getOrders_SUBSTATUS_AWAIT_AUTO_DELIVERY_DATES, _api__getOrders_SUBSTATUS_AWAIT_USER_PERSONAL_DATA, _api__getOrders_SUBSTATUS_NO_PERSONAL_DATA_EXPIRED, _api__getOrders_SUBSTATUS_CUSTOMS_PROBLEMS, _api__getOrders_SUBSTATUS_AWAIT_CASHIER, _api__getOrders_SUBSTATUS_WAITING_POSTPAID_BUDGET_RESERVATION, _api__getOrders_SUBSTATUS_AWAIT_SERVICEABLE_CONFIRMATION, _api__getOrders_SUBSTATUS_POSTPAID_BUDGET_RESERVATION_FAILED, _api__getOrders_SUBSTATUS_AWAIT_CUSTOM_PRICE_CONFIRMATION, _api__getOrders_SUBSTATUS_READY_FOR_PICKUP, _api__getOrders_SUBSTATUS_UNKNOWN } _api__getOrders_substatus_e;

// Enum  for DbsAPI_getOrders
typedef enum  { _api__getOrders__NULL = 0, _api__getOrders__UNKNOWN, _api__getOrders__BUYER, _api__getOrders__MARKET_PARTNER_OUTLET, _api__getOrders__MARKET_BRANDED_OUTLET, _api__getOrders__SHOP_OUTLET, _api__getOrders__DROPOFF } _api__getOrders_dispatchType_e;

// Enum  for DbsAPI_getOrders
typedef enum  { _api__getOrders__NULL = 0, _api__getOrders__PERSON, _api__getOrders__BUSINESS } _api__getOrders_buyerType_e;

// Enum STATUSES for DbsAPI_getReturns
typedef enum  { _api__getReturns_STATUSES_NULL = 0, _api__getReturns_STATUSES_STARTED_BY_USER, _api__getReturns_STATUSES_REFUND_IN_PROGRESS, _api__getReturns_STATUSES_REFUNDED, _api__getReturns_STATUSES_FAILED, _api__getReturns_STATUSES_WAITING_FOR_DECISION, _api__getReturns_STATUSES_DECISION_MADE, _api__getReturns_STATUSES_REFUNDED_WITH_BONUSES, _api__getReturns_STATUSES_REFUNDED_BY_SHOP, _api__getReturns_STATUSES_CANCELLED, _api__getReturns_STATUSES_COMPLETE_WITHOUT_REFUND, _api__getReturns_STATUSES_UNKNOWN } _api__getReturns_statuses_e;

// Enum  for DbsAPI_getReturns
typedef enum  { _api__getReturns__NULL = 0, _api__getReturns__UNREDEEMED, _api__getReturns___RETURN } _api__getReturns_type_e;

// Enum  for DbsAPI_searchModels
typedef enum  { _api__searchModels__NULL = 0, _api__searchModels__RUR, _api__searchModels__USD, _api__searchModels__EUR, _api__searchModels__UAH, _api__searchModels__AUD, _api__searchModels__GBP, _api__searchModels__BYR, _api__searchModels__BYN, _api__searchModels__DKK, _api__searchModels__ISK, _api__searchModels__KZT, _api__searchModels__CAD, _api__searchModels__CNY, _api__searchModels__NOK, _api__searchModels__XDR, _api__searchModels__SGD, _api__searchModels___TRY, _api__searchModels__SEK, _api__searchModels__CHF, _api__searchModels__JPY, _api__searchModels__AZN, _api__searchModels__ALL, _api__searchModels__DZD, _api__searchModels__AOA, _api__searchModels__ARS, _api__searchModels__AMD, _api__searchModels__AFN, _api__searchModels__BHD, _api__searchModels__BGN, _api__searchModels__BOB, _api__searchModels__BWP, _api__searchModels__BND, _api__searchModels__BRL, _api__searchModels__BIF, _api__searchModels__HUF, _api__searchModels__VEF, _api__searchModels__KPW, _api__searchModels__VND, _api__searchModels__GMD, _api__searchModels__GHS, _api__searchModels__GNF, _api__searchModels__HKD, _api__searchModels__GEL, _api__searchModels__AED, _api__searchModels__EGP, _api__searchModels__ZMK, _api__searchModels__ILS, _api__searchModels__INR, _api__searchModels__IDR, _api__searchModels__JOD, _api__searchModels__IQD, _api__searchModels__IRR, _api__searchModels__YER, _api__searchModels__QAR, _api__searchModels__KES, _api__searchModels__KGS, _api__searchModels__COP, _api__searchModels__CDF, _api__searchModels__CRC, _api__searchModels__KWD, _api__searchModels__CUP, _api__searchModels__LAK, _api__searchModels__LVL, _api__searchModels__SLL, _api__searchModels__LBP, _api__searchModels__LYD, _api__searchModels__SZL, _api__searchModels__LTL, _api__searchModels__MUR, _api__searchModels__MRO, _api__searchModels__MKD, _api__searchModels__MWK, _api__searchModels__MGA, _api__searchModels__MYR, _api__searchModels__MAD, _api__searchModels__MXN, _api__searchModels__MZN, _api__searchModels__MDL, _api__searchModels__MNT, _api__searchModels__NPR, _api__searchModels__NGN, _api__searchModels__NIO, _api__searchModels__NZD, _api__searchModels__OMR, _api__searchModels__PKR, _api__searchModels__PYG, _api__searchModels__PEN, _api__searchModels__PLN, _api__searchModels__KHR, _api__searchModels__SAR, _api__searchModels__RON, _api__searchModels__SCR, _api__searchModels__SYP, _api__searchModels__SKK, _api__searchModels__SOS, _api__searchModels__SDG, _api__searchModels__SRD, _api__searchModels__TJS, _api__searchModels__THB, _api__searchModels__TWD, _api__searchModels__BDT, _api__searchModels__TZS, _api__searchModels__TND, _api__searchModels__TMM, _api__searchModels__UGX, _api__searchModels__UZS, _api__searchModels__UYU, _api__searchModels__PHP, _api__searchModels__DJF, _api__searchModels__XAF, _api__searchModels__XOF, _api__searchModels__HRK, _api__searchModels__CZK, _api__searchModels__CLP, _api__searchModels__LKR, _api__searchModels__EEK, _api__searchModels__ETB, _api__searchModels__RSD, _api__searchModels__ZAR, _api__searchModels__KRW, _api__searchModels__NAD, _api__searchModels__TL, _api__searchModels__UE } _api__searchModels_currency_e;


// Отмена заказа покупателем
//
// Подтверждает или отклоняет запрос покупателя на отмену заказа, который передан службе доставки.  Покупатель может отменить заказ в течение его обработки или доставки. Если заказ еще обрабатывается (имеет статус PROCESSING), вам не нужно подтверждать отмену заказа — он будет отменен автоматически.  Если заказ уже передан службе доставки (принимает статус `DELIVERY` или `PICKUP`) и пользователь отменил его, вы можете предупредить службу об отмене в течение 48 часов. Если служба доставки узнала об отмене до передачи заказа покупателю, подтвердите отмену с помощью запроса [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation.md). Если заказ уже доставлен, отклоните отмену с помощью этого же запроса. Тогда у покупателя останется заказ, и деньги за него возвращаться не будут.  Чтобы узнать, какие заказы были отменены в статусе `DELIVERY` или `PICKUP`, отправьте запрос [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md). В его URL добавьте входной параметр `onlyWaitingForCancellationApprove=true`. Вы также можете узнать об отмененных заказах в кабинете или через почту — на нее придет уведомление об отмене.  Если в течение 48 часов вы не подтвердите или отклоните отмену, заказ будет отменен автоматически.  |**⚙️ Лимит:** 500 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_acceptOrderCancellation(apiClient_t *apiClient, long campaignId, long orderId, accept_order_cancellation_request_t *accept_order_cancellation_request);


// Скрытие товаров и настройки скрытия
//
// Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_addHiddenOffers(apiClient_t *apiClient, long campaignId, add_hidden_offers_request_t *add_hidden_offers_request);


// Добавление товаров в архив
//
// Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \"В архив нельзя отправить товар, который хранится на складе Маркета\" %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
add_offers_to_archive_response_t*
DbsAPI_addOffersToArchive(apiClient_t *apiClient, long businessId, add_offers_to_archive_request_t *add_offers_to_archive_request);


// Калькулятор стоимости услуг
//
// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
calculate_tariffs_response_t*
DbsAPI_calculateTariffs(apiClient_t *apiClient, calculate_tariffs_request_t *calculate_tariffs_request);


// Удаление товара из карантина по цене в кабинете
//
// Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
empty_api_response_t*
DbsAPI_confirmBusinessPrices(apiClient_t *apiClient, long businessId, confirm_prices_request_t *confirm_prices_request);


// Удаление товара из карантина по цене в магазине
//
// Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_confirmCampaignPrices(apiClient_t *apiClient, long campaignId, confirm_prices_request_t *confirm_prices_request);


// Создание нового чата с покупателем
//
// Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
create_chat_response_t*
DbsAPI_createChat(apiClient_t *apiClient, long businessId, create_chat_request_t *create_chat_request);


// Создание точки продаж
//
// Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
create_outlet_response_t*
DbsAPI_createOutlet(apiClient_t *apiClient, long campaignId, change_outlet_request_t *change_outlet_request);


// Удаление товаров из ассортимента магазина
//
// Удаляет заданные товары из заданного магазина.  {% note warning \"Запрос удаляет товары именно из конкретного магазина\" %}  На продажи в других магазинах и на наличие товара в общем каталоге он не влияет.  {% endnote %}  Товар не получится удалить, если он хранится на складах Маркета.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
delete_campaign_offers_response_t*
DbsAPI_deleteCampaignOffers(apiClient_t *apiClient, long campaignId, delete_campaign_offers_request_t *delete_campaign_offers_request);


// Удаление комментария к отзыву
//
// Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteGoodsFeedbackComment(apiClient_t *apiClient, long businessId, delete_goods_feedback_comment_request_t *delete_goods_feedback_comment_request);


// Возобновление показа товаров
//
// Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_deleteHiddenOffers(apiClient_t *apiClient, long campaignId, delete_hidden_offers_request_t *delete_hidden_offers_request);


// Удаление товаров из каталога
//
// Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_response_t*
DbsAPI_deleteOffers(apiClient_t *apiClient, long businessId, delete_offers_request_t *delete_offers_request);


// Удаление товаров из архива
//
// Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 
//
delete_offers_from_archive_response_t*
DbsAPI_deleteOffersFromArchive(apiClient_t *apiClient, long businessId, delete_offers_from_archive_request_t *delete_offers_from_archive_request);


// Удаление точки продаж
//
// Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteOutlet(apiClient_t *apiClient, long campaignId, long outletId);


// Удаление лицензий для точек продаж
//
// Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_deleteOutletLicenses(apiClient_t *apiClient, long campaignId, list_t *ids);


// Удаление товаров из акции
//
// Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
delete_promo_offers_response_t*
DbsAPI_deletePromoOffers(apiClient_t *apiClient, long businessId, delete_promo_offers_request_t *delete_promo_offers_request);


// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format);


// Отчет «Конкурентная позиция»
//
// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format);


// Отчет по отзывам о товарах
//
// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format);


// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
//
// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format);


// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
DbsAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format);


// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t**
DbsAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format);


// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format);


// Отчет по полкам
//
// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format);


// Отчет «Аналитика продаж»
//
// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format);


// Отчет по остаткам на складах
//
// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format);


// Отчет по стоимости услуг
//
// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format);


// Отчет по платежам
//
// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format);


// Отчет по заказам
//
// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t*
DbsAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format);


// Все предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_all_offers_response_t*
DbsAPI_getAllOffers(apiClient_t *apiClient, long campaignId, long feedId, int *chunk);


// Информация об установленных ставках
//
// Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_info_response_t*
DbsAPI_getBidsInfoForBusiness(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_bids_info_request_t *get_bids_info_request);


// Рекомендованные ставки для заданных товаров
//
// Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
get_bids_recommendations_response_t*
DbsAPI_getBidsRecommendations(apiClient_t *apiClient, long businessId, get_bids_recommendations_request_t *get_bids_recommendations_request);


// Список товаров, находящихся в карантине по цене в кабинете
//
// Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_quarantine_offers_response_t*
DbsAPI_getBusinessQuarantineOffers(apiClient_t *apiClient, long businessId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit);


// Настройки кабинета
//
// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_business_settings_response_t*
DbsAPI_getBusinessSettings(apiClient_t *apiClient, long businessId);


// Информация о магазине
//
// Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_response_t*
DbsAPI_getCampaign(apiClient_t *apiClient, long campaignId);


// Логины, связанные с магазином
//
// Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_logins_response_t*
DbsAPI_getCampaignLogins(apiClient_t *apiClient, long campaignId);


// Информация о товарах, которые размещены в заданном магазине
//
// Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_campaign_offers_response_t*
DbsAPI_getCampaignOffers(apiClient_t *apiClient, long campaignId, get_campaign_offers_request_t *get_campaign_offers_request, char *page_token, int *limit);


// Список товаров, находящихся в карантине по цене в магазине
//
// Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_quarantine_offers_response_t*
DbsAPI_getCampaignQuarantineOffers(apiClient_t *apiClient, long campaignId, get_quarantine_offers_request_t *get_quarantine_offers_request, char *page_token, int *limit);


// Регион магазина
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_campaign_region_response_t*
DbsAPI_getCampaignRegion(apiClient_t *apiClient, long campaignId);


// Настройки магазина
//
// Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaign_settings_response_t*
DbsAPI_getCampaignSettings(apiClient_t *apiClient, long campaignId);


// Список магазинов пользователя
//
// Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_campaigns_response_t*
DbsAPI_getCampaigns(apiClient_t *apiClient, int *page, int *pageSize);


// Магазины, доступные логину
//
// Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_campaigns_response_t*
DbsAPI_getCampaignsByLogin(apiClient_t *apiClient, char *login, int *page, int *pageSize);


// Лимит на установку кванта продажи и минимального количества товаров в заказе
//
// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_max_sale_quantum_response_t*
DbsAPI_getCategoriesMaxSaleQuantum(apiClient_t *apiClient, get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request);


// Дерево категорий
//
// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_response_t*
DbsAPI_getCategoriesTree(apiClient_t *apiClient, get_categories_request_t *get_categories_request);


// Списки характеристик товаров по категориям
//
// Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 
//
get_category_content_parameters_response_t*
DbsAPI_getCategoryContentParameters(apiClient_t *apiClient, long categoryId);


// Получение истории сообщений в чате
//
// Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chat_history_response_t*
DbsAPI_getChatHistory(apiClient_t *apiClient, long businessId, long chatId, get_chat_history_request_t *get_chat_history_request, char *page_token, int *limit);


// Получение доступных чатов
//
// Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_chats_response_t*
DbsAPI_getChats(apiClient_t *apiClient, long businessId, get_chats_request_t *get_chats_request, char *page_token, int *limit);


// Справочник служб доставки
//
// Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_delivery_services_response_t*
DbsAPI_getDeliveryServices(apiClient_t *apiClient);


// Информация о прайс-листе
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feed_response_t*
DbsAPI_getFeed(apiClient_t *apiClient, long campaignId, long feedId);


// Отчет по индексации прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_feed_index_logs_response_t*
DbsAPI_getFeedIndexLogs(apiClient_t *apiClient, long campaignId, long feedId, int *limit, char published_time_from, char published_time_to, feed_index_logs_status_type_e status);


// Новые и обновленные отзывы о магазине
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
get_feedback_list_response_t*
DbsAPI_getFeedbackAndCommentUpdates(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, char from_date);


// Список прайс-листов магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_feeds_response_t*
DbsAPI_getFeeds(apiClient_t *apiClient, long campaignId);


// Получение комментариев к отзыву
//
// Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_comments_response_t*
DbsAPI_getGoodsFeedbackComments(apiClient_t *apiClient, long businessId, get_goods_feedback_comments_request_t *get_goods_feedback_comments_request, char *page_token, int *limit);


// Получение отзывов о товарах продавца
//
// Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_goods_feedback_response_t*
DbsAPI_getGoodsFeedbacks(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_goods_feedback_request_t *get_goods_feedback_request);


// Отчет по товарам
//
// Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_goods_stats_response_t*
DbsAPI_getGoodsStats(apiClient_t *apiClient, long campaignId, get_goods_stats_request_t *get_goods_stats_request);


// Информация о скрытых вами товарах
//
// Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
get_hidden_offers_response_t*
DbsAPI_getHiddenOffers(apiClient_t *apiClient, long campaignId, list_t *offer_id, char *page_token, int *limit, int *offset, int *page, int *pageSize);


// Информация об одной модели
//
// Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_response_t*
DbsAPI_getModel(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency);


// Список предложений для одной модели
//
// Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_offers_response_t*
DbsAPI_getModelOffers(apiClient_t *apiClient, long modelId, long regionId, currency_type_e currency, sort_order_type_e orderByPrice, int *count, int *page);


// Информация о нескольких моделях
//
// Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_response_t*
DbsAPI_getModels(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency);


// Список предложений для нескольких моделей
//
// Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
get_models_offers_response_t*
DbsAPI_getModelsOffers(apiClient_t *apiClient, long regionId, get_models_request_t *get_models_request, currency_type_e currency, sort_order_type_e orderByPrice);


// Получение информации о заполненности карточек магазина
//
// Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 
//
get_offer_cards_content_status_response_t*
DbsAPI_getOfferCardsContentStatus(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_cards_content_status_request_t *get_offer_cards_content_status_request);


// Список товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  Для каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:  * Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки. * Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.  Результаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.  {% note info %}  Количество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25) 
//
get_offer_mapping_entries_response_t*
DbsAPI_getOfferMappingEntries(apiClient_t *apiClient, long campaignId, list_t *offer_id, list_t *shop_sku, offer_mapping_kind_type_e mapping_kind, list_t *status, list_t *availability, list_t *category_id, list_t *vendor, char *page_token, int *limit);


// Информация о товарах в каталоге
//
// Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| 
//
get_offer_mappings_response_t*
DbsAPI_getOfferMappings(apiClient_t *apiClient, long businessId, char *page_token, int *limit, get_offer_mappings_request_t *get_offer_mappings_request);


// Рекомендации Маркета, касающиеся цен
//
// Метод возвращает рекомендации нескольких типов.  **1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**  Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  **2. Оценка привлекательности цен на витрине.**  Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_offer_recommendations_response_t*
DbsAPI_getOfferRecommendations(apiClient_t *apiClient, long businessId, get_offer_recommendations_request_t *get_offer_recommendations_request, char *page_token, int *limit);


// Предложения магазина
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.  Поиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.  В ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.  {% note info %}  Из-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.  В связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.  {% endnote %}  {% note info %}  Количество предложений считается по данным за последние семь дней (не включая сегодня).  Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25) 
//
get_offers_response_t*
DbsAPI_getOffers(apiClient_t *apiClient, long campaignId, char *query, long feedId, char *shopCategoryId, currency_type_e currency, int *matched, int *page, int *pageSize);


// Информация об одном заказе
//
// Возвращает информацию о заказе.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_response_t*
DbsAPI_getOrder(apiClient_t *apiClient, long campaignId, long orderId);


// Информация о покупателе — юридическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_buyer_info_response_t*
DbsAPI_getOrderBusinessBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId);


// Информация о документах
//
// Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_business_documents_info_response_t*
DbsAPI_getOrderBusinessDocumentsInfo(apiClient_t *apiClient, long campaignId, long orderId);


// Информация о покупателе — физическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_order_buyer_info_response_t*
DbsAPI_getOrderBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId);


// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t*
DbsAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId);


// Информация о нескольких заказах
//
// Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.  Доступна фильтрация по нескольким характеристикам заказов:  * дате оформления;  * статусу;  * идентификаторам заказов;  * этапу обработки или причине отмены;  * типу (настоящий или тестовый);  * дате отгрузки в службу доставки;  * дате и времени обновления заказа.  Информация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).  Максимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.  Результаты возвращаются постранично. Для навигации по страницам используйте параметры `page_token` и `limit`.  Получить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_response_t*
DbsAPI_getOrders(apiClient_t *apiClient, long campaignId, list_t *orderIds, list_t *status, list_t *substatus, char fromDate, char toDate, char supplierShipmentDateFrom, char supplierShipmentDateTo, char updatedAtFrom, char updatedAtTo, order_delivery_dispatch_type_e dispatchType, int *fake, int *hasCis, int *onlyWaitingForCancellationApprove, int *onlyEstimatedDelivery, order_buyer_type_e buyerType, int *page, int *pageSize, char *page_token, int *limit);


// Детальная информация по заказам
//
// Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_stats_response_t*
DbsAPI_getOrdersStats(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_orders_stats_request_t *get_orders_stats_request);


// Информация об одной точке продаж
//
// Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlet_response_t*
DbsAPI_getOutlet(apiClient_t *apiClient, long campaignId, long outletId);


// Информация о лицензиях для точек продаж
//
// Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlet_licenses_response_t*
DbsAPI_getOutletLicenses(apiClient_t *apiClient, long campaignId, list_t *outletIds, list_t *ids);


// Информация о нескольких точках продаж
//
// Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
get_outlets_response_t*
DbsAPI_getOutlets(apiClient_t *apiClient, long campaignId, char *page_token, long region_id, char *shop_outlet_code, long regionId);


// Список цен
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 
//
get_prices_response_t*
DbsAPI_getPrices(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, int *archived);


// Просмотр цен на указанные товары в магазине
//
// Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 
//
get_prices_by_offer_ids_response_t*
DbsAPI_getPricesByOfferIds(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_prices_by_offer_ids_request_t *get_prices_by_offer_ids_request);


// Получение списка товаров, которые участвуют или могут участвовать в акции
//
// Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_promo_offers_response_t*
DbsAPI_getPromoOffers(apiClient_t *apiClient, long businessId, get_promo_offers_request_t *get_promo_offers_request, char *page_token, int *limit);


// Получение списка акций
//
// Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_promos_response_t*
DbsAPI_getPromos(apiClient_t *apiClient, long businessId, get_promos_request_t *get_promos_request);


// Заказы, которые повлияли на индекс качества
//
// Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
//
get_quality_rating_details_response_t*
DbsAPI_getQualityRatingDetails(apiClient_t *apiClient, long campaignId);


// Индекс качества магазинов
//
// Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
get_quality_rating_response_t*
DbsAPI_getQualityRatings(apiClient_t *apiClient, long businessId, get_quality_rating_request_t *get_quality_rating_request);


// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t*
DbsAPI_getReportInfo(apiClient_t *apiClient, char *reportId);


// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t*
DbsAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
DbsAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t**
DbsAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash);


// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t*
DbsAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date);


// Информация об остатках и оборачиваемости
//
// Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 
//
get_warehouse_stocks_response_t*
DbsAPI_getStocks(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_warehouse_stocks_request_t *get_warehouse_stocks_request);


// Рекомендованные карточки для товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).  {% endnote %}  Возвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.  Каждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku=», например:  ##https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016…##  Чтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.  Полученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).  В одном запросе можно получить не более 500 рекомендаций.  |**⚙️ Лимит:** 100 000 рекомендаций в час| |-| 
//
get_suggested_offer_mapping_entries_response_t*
DbsAPI_getSuggestedOfferMappingEntries(apiClient_t *apiClient, long campaignId, get_suggested_offer_mapping_entries_request_t *get_suggested_offer_mapping_entries_request);


// Просмотр карточек на Маркете, которые подходят вашим товарам
//
// Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.  {% note info \"𝓠 Как определить `marketSku` товара, найденного на Маркете?\" %}  𝓐 Он есть в адресе страницы товара — расположен после `sku=`.  Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
get_suggested_offer_mappings_response_t*
DbsAPI_getSuggestedOfferMappings(apiClient_t *apiClient, long businessId, get_suggested_offer_mappings_request_t *get_suggested_offer_mappings_request);


// Цены для продвижения товаров
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 
//
suggest_prices_response_t*
DbsAPI_getSuggestedPrices(apiClient_t *apiClient, long campaignId, suggest_prices_request_t *suggest_prices_request);


// Список складов и групп складов
//
// Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_warehouses_response_t*
DbsAPI_getWarehouses(apiClient_t *apiClient, long businessId);


// Передача ключей цифровых товаров
//
// Передает ключи цифровых товаров, которые покупатель заказал и оплатил. После выполнения запроса Маркет отправит ему письмо с ключами и инструкциями по активации, а также переведет заказ в финальный статус `DELIVERED`.  Ключ нужно передать в течение 30 минут после перехода заказа в статус `PROCESSING`.  Если в один заказ входят несколько ключей, передавайте их все в одном запросе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_provideOrderDigitalCodes(apiClient_t *apiClient, long campaignId, long orderId, provide_order_digital_codes_request_t *provide_order_digital_codes_request);


// Передача кодов маркировки единиц товара
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Передает Маркету коды маркировки для единиц товара в указанном заказе.  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  {% note warning %}  Прежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).  {% endnote %}  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
provide_order_item_identifiers_response_t*
DbsAPI_provideOrderItemIdentifiers(apiClient_t *apiClient, long campaignId, long orderId, provide_order_item_identifiers_request_t *provide_order_item_identifiers_request);


// Включение буста продаж и установка ставок
//
// Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t*
DbsAPI_putBidsForBusiness(apiClient_t *apiClient, long businessId, put_sku_bids_request_t *put_sku_bids_request);


// Включение буста продаж и установка ставок для магазина
//
// Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 
//
empty_api_response_t*
DbsAPI_putBidsForCampaign(apiClient_t *apiClient, long campaignId, put_sku_bids_request_t *put_sku_bids_request);


// Сообщить, что прайс-лист обновился
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
DbsAPI_refreshFeed(apiClient_t *apiClient, long campaignId, long feedId);


// Поиск модели товара
//
// Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 
//
search_models_response_t*
DbsAPI_searchModels(apiClient_t *apiClient, char *query, long regionId, currency_type_e currency, int *page, int *pageSize);


// Информация о дочерних регионах
//
// Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_region_with_children_response_t*
DbsAPI_searchRegionChildren(apiClient_t *apiClient, long regionId, int *page, int *pageSize);


// Информация о регионе
//
// Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t*
DbsAPI_searchRegionsById(apiClient_t *apiClient, long regionId);


// Поиск регионов по их имени
//
// Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
//
get_regions_response_t*
DbsAPI_searchRegionsByName(apiClient_t *apiClient, char *name, char *page_token, int *limit);


// Отправка файла в чат
//
// Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_sendFileToChat(apiClient_t *apiClient, long businessId, long chatId, binary_t* file);


// Отправка сообщения в чат
//
// Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_sendMessageToChat(apiClient_t *apiClient, long businessId, long chatId, send_message_to_chat_request_t *send_message_to_chat_request);


// Изменение параметров прайс-листа
//
// {% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
//
empty_api_response_t*
DbsAPI_setFeedParams(apiClient_t *apiClient, long campaignId, long feedId, set_feed_params_request_t *set_feed_params_request);


// Подготовка заказа
//
// {% note tip \"Подходит и для DBS\" %}  Запрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.  {% endnote %}  Позволяет выполнить три операции:  * передать Маркету информацию о распределении товаров по коробкам; * передать Маркету коды маркировки для товаров; * удалить товар из заказа, если его не оказалось на складе.  Если нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.  ## Как передать информацию о распределении товаров  В этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:  * **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.  * **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.  ⚠️ Одна коробка не может содержать и товары целиком, и части товаров.  ## Как передавать коды маркировки  Если в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)  Принимаются коды следующих типов:  * Коды «Честного знака». * УИН для ювелирных изделий. * РНПТ и ГТД для импортных прослеживаемых товаров.  Для каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.  Если товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.  ## Как удалить товар из заказа  Чтобы удалить товар из заказа:  1. Добавьте в запрос `allowRemove: true`. 2. Передайте распределение по коробкам без товара, который нужно удалить.  {% note warning \"Удаление нельзя отменить\" %}  Эта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.  {% endnote %}  Чтобы удалить позицию целиком, не передавайте соответствующий `OrderBoxLayoutItemDTO`. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле `fullCount`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  ## Примеры  {% cut \"Товар умещается в коробку\" %}  Вот как будет выглядеть запрос, если в одной коробке едут:    * три единицы одного товара, требующего маркировки;   * одна единица другого товара, не требущего маркировки.    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"fullCount\": 3,                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           },                           {                               \"cis\": \"010304109478gftJ14545762!\\u001dhGt264\"                           },                           {                               \"cis\": \"010304109478fRs28323ks23!\\u001dhet201\"                           }                       ]                   },                   {                       \"id\": 654321,                       \"fullCount\": 1                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Товар едет в разных коробках\" %}  Вот как будет выглядеть запрос, если товар едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  {% cut \"Одинаковые товары, где каждый едет в нескольких коробках\" %}  Вот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:    ```json   {       \"boxes\": [           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 1,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           },           {               \"items\": [                   {                       \"id\": 123456,                       \"partialCount\": {                           \"current\": 2,                           \"total\": 2                       },                       \"instances\": [                           {                               \"cis\": \"01030410947874432155Qbag!\\u001d93Zjqw\"                           }                       ]                   }               ]           }       ]   }   ```  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_box_layout_response_t*
DbsAPI_setOrderBoxLayout(apiClient_t *apiClient, long campaignId, long orderId, set_order_box_layout_request_t *set_order_box_layout_request);


// Изменение даты доставки заказа
//
// Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setOrderDeliveryDate(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_date_request_t *set_order_delivery_date_request);


// Передача трек‑номера посылки
//
// {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setOrderDeliveryTrackCode(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_track_code_request_t *set_order_delivery_track_code_request);


// Передача количества грузовых мест в заказе
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Отгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.  Количество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).  Метод устроен немного нестандартно: количество задается длиной массива пустых объектов.  Раньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.  {% cut \"Как было раньше\" %}  Структура тела PUT-запроса:  ``` {   \"boxes\":   [     {       \"fulfilmentId\": \"{string}\",       \"weight\": {int64},       \"width\": {int64},       \"height\": {int64},       \"depth\": {int64},       \"items\":       [         {           \"id\": {int64},           \"count\": {int32}         },         ...       ]     },     ...   ] } ``` | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `boxes`       |           | Список грузовых мест.       |  **Параметры, вложенные в `boxes`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `fulfilmentId`       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: `номер заказа на Маркете-номер грузового места`. Например, `7206821‑1, 7206821‑2` и т. д. | | `weight`       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. | | `width`       | Int64   | Ширина грузового места в сантиметрах.       | | `height`       | Int64   | Высота грузового места в сантиметрах.       | | `depth`       | Int64   | Глубина грузового места в сантиметрах.        | | `items`       | Int64   | Список товаров в грузовом месте.       |  **Параметры, вложенные в `items`** | **Параметр**  | **Тип**  | **Значение**  | | ----------- | ----------- | ----------- | | `id`       | Int64     | Идентификатор товара в рамках заказа.   | | `count`    | Int32     | Количество единиц товара в грузовом месте.       |  {% endcut %}  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
set_order_shipment_boxes_response_t*
DbsAPI_setOrderShipmentBoxes(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, set_order_shipment_boxes_request_t *set_order_shipment_boxes_request);


// Принятие или изменение решения по возврату
//
// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_setReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId, set_return_decision_request_t *set_return_decision_request);


// Отказ от ответа на отзывы
//
// Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_skipGoodsFeedbacksReaction(apiClient_t *apiClient, long businessId, skip_goods_feedback_reaction_request_t *skip_goods_feedback_reaction_request);


// Подтверждение решения по возврату
//
// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_submitReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId);


// Установка цен на товары во всех магазинах
//
// Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
empty_api_response_t*
DbsAPI_updateBusinessPrices(apiClient_t *apiClient, long businessId, update_business_prices_request_t *update_business_prices_request);


// Изменение условий продажи товаров в магазине
//
// Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateCampaignOffers(apiClient_t *apiClient, long campaignId, update_campaign_offers_request_t *update_campaign_offers_request);


// Добавление нового или изменение созданного комментария
//
// Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
update_goods_feedback_comment_response_t*
DbsAPI_updateGoodsFeedbackComment(apiClient_t *apiClient, long businessId, update_goods_feedback_comment_request_t *update_goods_feedback_comment_request);


// Редактирование категорийных характеристик товара
//
// Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
update_offer_content_response_t*
DbsAPI_updateOfferContent(apiClient_t *apiClient, long businessId, update_offer_content_request_t *update_offer_content_request);


// Добавление и редактирование товаров в каталоге
//
// {% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Добавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.  Информацию о товарах нужно передать в теле POST-запроса.  У каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:  * Чтобы добавить в каталог новый товар, укажите в параметре `shopSku` ваш SKU, которого еще нет в каталоге. * Чтобы отредактировать товар из каталога, укажите в параметре `shopSku` ваш SKU этого товара в каталоге.  В обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.  Если вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус `NEED_CONTENT` (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  Перед публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус `NEED_INFO` (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).  В одном запросе можно добавить не более 500 товаров.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5 000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateOfferMappingEntries(apiClient_t *apiClient, long campaignId, update_offer_mapping_entry_request_t *update_offer_mapping_entry_request);


// Добавление товаров в каталог и изменение информации о них
//
// Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.  Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.  Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \"Правила использования SKU\" %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 
//
update_offer_mappings_response_t*
DbsAPI_updateOfferMappings(apiClient_t *apiClient, long businessId, update_offer_mappings_request_t *update_offer_mappings_request);


// Удаление товара из заказа или уменьшение числа единиц
//
// {% note warning \"Этот запрос только для DBS\" %}  Если вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).  {% endnote %}  Изменяет состав заказа, если позволяет выбранная служба доставки, в случаях:  * покупатель уменьшил количество товара; * магазин не может поставить все товары в заказе.  Для этого заказ должен находится в статусе `\"status\": \"PROCESSING\"` этапа обработки `\"substatus\": \"STARTED\"`. После передачи статуса `\"substatus\": \"READY_TO_SHIP\"` изменить состав невозможно.  Если одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте `count` параметра `item`.  Чтобы полностью удалить товар из заказа:  * передайте значение `0`; или * не передавайте параметр `item`.  Нельзя удалить или уменьшить количество товара, если он:  * добавлен по акции; * составляет 99% стоимости заказа; * единственный товар в заказе.  Если необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа `CANCELLED` с причиной отмены `SHOP_FAILED`.  {% note info \"Увеличить заказ нельзя\" %}  С помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.  {% endnote %}  **Возврат денег покупателю**  Если покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:  * при оплате банковской картой — с момента, когда магазин переведет заказ в статус `SHIPPED`;  * при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
void
DbsAPI_updateOrderItems(apiClient_t *apiClient, long campaignId, long orderId, update_order_item_request_t *update_order_item_request);


// Изменение статуса одного заказа
//
// Изменяет статус заказа. Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_status_response_t*
DbsAPI_updateOrderStatus(apiClient_t *apiClient, long campaignId, long orderId, update_order_status_request_t *update_order_status_request);


// Изменение статусов нескольких заказов
//
// Изменяет статусы нескольких заказов.  Возможные изменения статусов:  * Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса `\"status\": \"PROCESSING\"`и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"PROCESSING\"` и этап обработки `\"substatus\": \"READY_TO_SHIP\"`. * Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"STARTED\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`. * Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса `\"status\": \"PROCESSING\"` и этапа обработки `\"substatus\": \"READY_TO_SHIP\"` нужно перевести в статус `\"status\": \"CANCELLED\"` с причиной отмены заказа `\"substatus\": \"SHOP_FAILED\"`.  Максимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
update_order_statuses_response_t*
DbsAPI_updateOrderStatuses(apiClient_t *apiClient, long campaignId, update_order_statuses_request_t *update_order_statuses_request);


// Продление срока хранения заказа
//
// Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOrderStorageLimit(apiClient_t *apiClient, long campaignId, long orderId, update_order_storage_limit_request_t *update_order_storage_limit_request);


// Изменение информации о точке продаж
//
// Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOutlet(apiClient_t *apiClient, long campaignId, long outletId, change_outlet_request_t *change_outlet_request);


// Создание и изменение лицензий для точек продаж
//
// Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 
//
empty_api_response_t*
DbsAPI_updateOutletLicenses(apiClient_t *apiClient, long campaignId, update_outlet_license_request_t *update_outlet_license_request);


// Установка цен на товары в конкретном магазине
//
// Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updatePrices(apiClient_t *apiClient, long campaignId, update_prices_request_t *update_prices_request);


// Добавление товаров в акцию или изменение их цен
//
// Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
//
update_promo_offers_response_t*
DbsAPI_updatePromoOffers(apiClient_t *apiClient, long businessId, update_promo_offers_request_t *update_promo_offers_request);


// Передача информации об остатках
//
// Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 
//
empty_api_response_t*
DbsAPI_updateStocks(apiClient_t *apiClient, long campaignId, update_stocks_request_t *update_stocks_request);


