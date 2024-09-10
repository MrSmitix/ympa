#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use ympa_rust_server::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
                      GetBidsInfoForBusinessResponse,
                      GetBidsRecommendationsResponse,
                      PutBidsForBusinessResponse,
                      PutBidsForCampaignResponse,
                      AddOffersToArchiveResponse,
                      DeleteOffersResponse,
                      DeleteOffersFromArchiveResponse,
                      GetOfferMappingsResponse,
                      GetSuggestedOfferMappingsResponse,
                      UpdateOfferMappingsResponse,
                      GetBusinessSettingsResponse,
                      GetCampaignsResponse,
                      GetCampaignResponse,
                      GetCampaignLoginsResponse,
                      GetCampaignRegionResponse,
                      GetCampaignSettingsResponse,
                      GetCampaignsByLoginResponse,
                      GetCategoriesMaxSaleQuantumResponse,
                      GetCategoriesTreeResponse,
                      CreateChatResponse,
                      GetChatHistoryResponse,
                      GetChatsResponse,
                      SendFileToChatResponse,
                      SendMessageToChatResponse,
                      GetCategoryContentParametersResponse,
                      GetOfferCardsContentStatusResponse,
                      UpdateOfferContentResponse,
                      GetDeliveryServicesResponse,
                      GetFeedbackAndCommentUpdatesResponse,
                      GetFeedsResponse,
                      GetFeedResponse,
                      GetFeedIndexLogsResponse,
                      RefreshFeedResponse,
                      SetFeedParamsResponse,
                      DeleteGoodsFeedbackCommentResponse,
                      GetGoodsFeedbackCommentsResponse,
                      GetGoodsFeedbacksResponse,
                      SkipGoodsFeedbacksReactionResponse,
                      UpdateGoodsFeedbackCommentResponse,
                      GetGoodsStatsResponse,
                      AddHiddenOffersResponse,
                      DeleteHiddenOffersResponse,
                      GetHiddenOffersResponse,
                      GetModelsResponse,
                      GetModelsOffersResponse,
                      SearchModelsResponse,
                      GetModelResponse,
                      GetModelOffersResponse,
                      GetOfferMappingEntriesResponse,
                      GetSuggestedOfferMappingEntriesResponse,
                      UpdateOfferMappingEntriesResponse,
                      DeleteCampaignOffersResponse,
                      GetAllOffersResponse,
                      GetCampaignOffersResponse,
                      GetOfferRecommendationsResponse,
                      GetOffersResponse,
                      UpdateCampaignOffersResponse,
                      GetOrderBusinessBuyerInfoResponse,
                      GetOrderBusinessDocumentsInfoResponse,
                      GetOrderBuyerInfoResponse,
                      SetOrderDeliveryDateResponse,
                      SetOrderDeliveryTrackCodeResponse,
                      UpdateOrderStorageLimitResponse,
                      VerifyOrderEacResponse,
                      GenerateOrderLabelsResponse,
                      GetOrderLabelsDataResponse,
                      GenerateOrderLabelResponse,
                      GetOrdersResponse,
                      UpdateOrderStatusesResponse,
                      AcceptOrderCancellationResponse,
                      GetOrderResponse,
                      ProvideOrderDigitalCodesResponse,
                      ProvideOrderItemIdentifiersResponse,
                      SetOrderBoxLayoutResponse,
                      UpdateOrderItemsResponse,
                      UpdateOrderStatusResponse,
                      SetOrderShipmentBoxesResponse,
                      GetOrdersStatsResponse,
                      DeleteOutletLicensesResponse,
                      GetOutletLicensesResponse,
                      UpdateOutletLicensesResponse,
                      CreateOutletResponse,
                      GetOutletsResponse,
                      DeleteOutletResponse,
                      GetOutletResponse,
                      UpdateOutletResponse,
                      ConfirmBusinessPricesResponse,
                      ConfirmCampaignPricesResponse,
                      GetBusinessQuarantineOffersResponse,
                      GetCampaignQuarantineOffersResponse,
                      GetPricesResponse,
                      GetPricesByOfferIdsResponse,
                      GetSuggestedPricesResponse,
                      UpdateBusinessPricesResponse,
                      UpdatePricesResponse,
                      DeletePromoOffersResponse,
                      GetPromoOffersResponse,
                      GetPromosResponse,
                      UpdatePromoOffersResponse,
                      GetQualityRatingDetailsResponse,
                      GetQualityRatingsResponse,
                      SearchRegionsByNameResponse,
                      SearchRegionChildrenResponse,
                      SearchRegionsByIdResponse,
                      GenerateBoostConsolidatedReportResponse,
                      GenerateCompetitorsPositionReportResponse,
                      GenerateGoodsFeedbackReportResponse,
                      GenerateGoodsMovementReportResponse,
                      GenerateGoodsRealizationReportResponse,
                      GenerateGoodsTurnoverReportResponse,
                      GenerateMassOrderLabelsReportResponse,
                      GeneratePricesReportResponse,
                      GenerateShelfsStatisticsReportResponse,
                      GenerateShipmentListDocumentReportResponse,
                      GenerateShowsSalesReportResponse,
                      GenerateStocksOnWarehousesReportResponse,
                      GenerateUnitedMarketplaceServicesReportResponse,
                      GenerateUnitedNettingReportResponse,
                      GenerateUnitedOrdersReportResponse,
                      GetReportInfoResponse,
                      GetReturnsResponse,
                      GetReturnResponse,
                      GetReturnApplicationResponse,
                      SetReturnDecisionResponse,
                      SubmitReturnDecisionResponse,
                      GetReturnPhotoResponse,
                      DownloadShipmentReceptionTransferActResponse,
                      SearchShipmentsResponse,
                      ConfirmShipmentResponse,
                      DownloadShipmentActResponse,
                      DownloadShipmentDiscrepancyActResponse,
                      DownloadShipmentInboundActResponse,
                      DownloadShipmentPalletLabelsResponse,
                      DownloadShipmentTransportationWaybillResponse,
                      GetShipmentResponse,
                      GetShipmentOrdersInfoResponse,
                      SetShipmentPalletsCountResponse,
                      TransferOrdersFromShipmentResponse,
                      GetStocksResponse,
                      UpdateStocksResponse,
                      CalculateTariffsResponse,
                      GetFulfillmentWarehousesResponse,
                      GetWarehousesResponse,
                     };
use clap::{App, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "GetBidsInfoForBusiness",
                "GetOfferMappings",
                "GetSuggestedOfferMappings",
                "GetBusinessSettings",
                "GetCampaigns",
                "GetCampaign",
                "GetCampaignLogins",
                "GetCampaignRegion",
                "GetCampaignSettings",
                "GetCampaignsByLogin",
                "GetCategoriesTree",
                "SendFileToChat",
                "GetCategoryContentParameters",
                "GetOfferCardsContentStatus",
                "GetDeliveryServices",
                "GetFeedbackAndCommentUpdates",
                "GetFeeds",
                "GetFeed",
                "GetFeedIndexLogs",
                "RefreshFeed",
                "GetGoodsFeedbacks",
                "GetHiddenOffers",
                "SearchModels",
                "GetModel",
                "GetModelOffers",
                "GetOfferMappingEntries",
                "GetAllOffers",
                "GetOffers",
                "GetOrderBusinessBuyerInfo",
                "GetOrderBusinessDocumentsInfo",
                "GetOrderBuyerInfo",
                "GenerateOrderLabels",
                "GetOrderLabelsData",
                "GenerateOrderLabel",
                "GetOrders",
                "GetOrder",
                "GetOrdersStats",
                "DeleteOutletLicenses",
                "GetOutletLicenses",
                "GetOutlets",
                "DeleteOutlet",
                "GetOutlet",
                "GetPrices",
                "GetPricesByOfferIds",
                "GetPromos",
                "GetQualityRatingDetails",
                "SearchRegionsByName",
                "SearchRegionChildren",
                "SearchRegionsById",
                "GetReportInfo",
                "GetReturns",
                "GetReturn",
                "GetReturnApplication",
                "SubmitReturnDecision",
                "GetReturnPhoto",
                "DownloadShipmentReceptionTransferAct",
                "ConfirmShipment",
                "DownloadShipmentAct",
                "DownloadShipmentDiscrepancyAct",
                "DownloadShipmentInboundAct",
                "DownloadShipmentPalletLabels",
                "DownloadShipmentTransportationWaybill",
                "GetShipment",
                "GetShipmentOrdersInfo",
                "GetStocks",
                "GetFulfillmentWarehouses",
                "GetWarehouses",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("api.partner.market.yandex.ru")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  [
                            "market:partner-api",
                  ].join::<&str>(", ")
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(swagger::auth::Bearer { token: auth_token}))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.value_of("host").unwrap(),
        matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.value_of("operation") {
        Some("GetBidsInfoForBusiness") => {
            let result = rt.block_on(client.get_bids_info_for_business(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetBidsRecommendations") => {
            let result = rt.block_on(client.get_bids_recommendations(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PutBidsForBusiness") => {
            let result = rt.block_on(client.put_bids_for_business(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PutBidsForCampaign") => {
            let result = rt.block_on(client.put_bids_for_campaign(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AddOffersToArchive") => {
            let result = rt.block_on(client.add_offers_to_archive(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteOffers") => {
            let result = rt.block_on(client.delete_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteOffersFromArchive") => {
            let result = rt.block_on(client.delete_offers_from_archive(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOfferMappings") => {
            let result = rt.block_on(client.get_offer_mappings(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSuggestedOfferMappings") => {
            let result = rt.block_on(client.get_suggested_offer_mappings(
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateOfferMappings") => {
            let result = rt.block_on(client.update_offer_mappings(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetBusinessSettings") => {
            let result = rt.block_on(client.get_business_settings(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaigns") => {
            let result = rt.block_on(client.get_campaigns(
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaign") => {
            let result = rt.block_on(client.get_campaign(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignLogins") => {
            let result = rt.block_on(client.get_campaign_logins(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignRegion") => {
            let result = rt.block_on(client.get_campaign_region(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignSettings") => {
            let result = rt.block_on(client.get_campaign_settings(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetCampaignsByLogin") => {
            let result = rt.block_on(client.get_campaigns_by_login(
                  "login_example".to_string(),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetCategoriesMaxSaleQuantum") => {
            let result = rt.block_on(client.get_categories_max_sale_quantum(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetCategoriesTree") => {
            let result = rt.block_on(client.get_categories_tree(
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CreateChat") => {
            let result = rt.block_on(client.create_chat(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetChatHistory") => {
            let result = rt.block_on(client.get_chat_history(
                  789,
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetChats") => {
            let result = rt.block_on(client.get_chats(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("SendFileToChat") => {
            let result = rt.block_on(client.send_file_to_chat(
                  789,
                  789,
                  swagger::ByteArray(Vec::from("BINARY_DATA_HERE"))
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SendMessageToChat") => {
            let result = rt.block_on(client.send_message_to_chat(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetCategoryContentParameters") => {
            let result = rt.block_on(client.get_category_content_parameters(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferCardsContentStatus") => {
            let result = rt.block_on(client.get_offer_cards_content_status(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateOfferContent") => {
            let result = rt.block_on(client.update_offer_content(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetDeliveryServices") => {
            let result = rt.block_on(client.get_delivery_services(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFeedbackAndCommentUpdates") => {
            let result = rt.block_on(client.get_feedback_and_comment_updates(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFeeds") => {
            let result = rt.block_on(client.get_feeds(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFeed") => {
            let result = rt.block_on(client.get_feed(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetFeedIndexLogs") => {
            let result = rt.block_on(client.get_feed_index_logs(
                  789,
                  789,
                  Some(20),
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("RefreshFeed") => {
            let result = rt.block_on(client.refresh_feed(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SetFeedParams") => {
            let result = rt.block_on(client.set_feed_params(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteGoodsFeedbackComment") => {
            let result = rt.block_on(client.delete_goods_feedback_comment(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetGoodsFeedbackComments") => {
            let result = rt.block_on(client.get_goods_feedback_comments(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetGoodsFeedbacks") => {
            let result = rt.block_on(client.get_goods_feedbacks(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SkipGoodsFeedbacksReaction") => {
            let result = rt.block_on(client.skip_goods_feedbacks_reaction(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateGoodsFeedbackComment") => {
            let result = rt.block_on(client.update_goods_feedback_comment(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetGoodsStats") => {
            let result = rt.block_on(client.get_goods_stats(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AddHiddenOffers") => {
            let result = rt.block_on(client.add_hidden_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteHiddenOffers") => {
            let result = rt.block_on(client.delete_hidden_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetHiddenOffers") => {
            let result = rt.block_on(client.get_hidden_offers(
                  789,
                  Some(&Vec::new()),
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  Some(56),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetModels") => {
            let result = rt.block_on(client.get_models(
                  789,
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetModelsOffers") => {
            let result = rt.block_on(client.get_models_offers(
                  789,
                  ???,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("SearchModels") => {
            let result = rt.block_on(client.search_models(
                  "query_example".to_string(),
                  789,
                  None,
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetModel") => {
            let result = rt.block_on(client.get_model(
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetModelOffers") => {
            let result = rt.block_on(client.get_model_offers(
                  789,
                  789,
                  None,
                  None,
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOfferMappingEntries") => {
            let result = rt.block_on(client.get_offer_mapping_entries(
                  789,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  None,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetSuggestedOfferMappingEntries") => {
            let result = rt.block_on(client.get_suggested_offer_mapping_entries(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateOfferMappingEntries") => {
            let result = rt.block_on(client.update_offer_mapping_entries(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteCampaignOffers") => {
            let result = rt.block_on(client.delete_campaign_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetAllOffers") => {
            let result = rt.block_on(client.get_all_offers(
                  789,
                  Some(789),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetCampaignOffers") => {
            let result = rt.block_on(client.get_campaign_offers(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetOfferRecommendations") => {
            let result = rt.block_on(client.get_offer_recommendations(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOffers") => {
            let result = rt.block_on(client.get_offers(
                  789,
                  Some("query_example".to_string()),
                  Some(789),
                  Some("shop_category_id_example".to_string()),
                  None,
                  Some(true),
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateCampaignOffers") => {
            let result = rt.block_on(client.update_campaign_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOrderBusinessBuyerInfo") => {
            let result = rt.block_on(client.get_order_business_buyer_info(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOrderBusinessDocumentsInfo") => {
            let result = rt.block_on(client.get_order_business_documents_info(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOrderBuyerInfo") => {
            let result = rt.block_on(client.get_order_buyer_info(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SetOrderDeliveryDate") => {
            let result = rt.block_on(client.set_order_delivery_date(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SetOrderDeliveryTrackCode") => {
            let result = rt.block_on(client.set_order_delivery_track_code(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateOrderStorageLimit") => {
            let result = rt.block_on(client.update_order_storage_limit(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("VerifyOrderEac") => {
            let result = rt.block_on(client.verify_order_eac(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GenerateOrderLabels") => {
            let result = rt.block_on(client.generate_order_labels(
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOrderLabelsData") => {
            let result = rt.block_on(client.get_order_labels_data(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GenerateOrderLabel") => {
            let result = rt.block_on(client.generate_order_label(
                  789,
                  789,
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOrders") => {
            let result = rt.block_on(client.get_orders(
                  789,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  None,
                  Some(true),
                  Some(true),
                  Some(true),
                  Some(true),
                  None,
                  Some(56),
                  Some(56),
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateOrderStatuses") => {
            let result = rt.block_on(client.update_order_statuses(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AcceptOrderCancellation") => {
            let result = rt.block_on(client.accept_order_cancellation(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOrder") => {
            let result = rt.block_on(client.get_order(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ProvideOrderDigitalCodes") => {
            let result = rt.block_on(client.provide_order_digital_codes(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ProvideOrderItemIdentifiers") => {
            let result = rt.block_on(client.provide_order_item_identifiers(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SetOrderBoxLayout") => {
            let result = rt.block_on(client.set_order_box_layout(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateOrderItems") => {
            let result = rt.block_on(client.update_order_items(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateOrderStatus") => {
            let result = rt.block_on(client.update_order_status(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SetOrderShipmentBoxes") => {
            let result = rt.block_on(client.set_order_shipment_boxes(
                  789,
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOrdersStats") => {
            let result = rt.block_on(client.get_orders_stats(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOutletLicenses") => {
            let result = rt.block_on(client.delete_outlet_licenses(
                  789,
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOutletLicenses") => {
            let result = rt.block_on(client.get_outlet_licenses(
                  789,
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateOutletLicenses") => {
            let result = rt.block_on(client.update_outlet_licenses(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateOutlet") => {
            let result = rt.block_on(client.create_outlet(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetOutlets") => {
            let result = rt.block_on(client.get_outlets(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(789),
                  Some("shop_outlet_code_example".to_string()),
                  Some(789)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeleteOutlet") => {
            let result = rt.block_on(client.delete_outlet(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetOutlet") => {
            let result = rt.block_on(client.get_outlet(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateOutlet") => {
            let result = rt.block_on(client.update_outlet(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ConfirmBusinessPrices") => {
            let result = rt.block_on(client.confirm_business_prices(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ConfirmCampaignPrices") => {
            let result = rt.block_on(client.confirm_campaign_prices(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetBusinessQuarantineOffers") => {
            let result = rt.block_on(client.get_business_quarantine_offers(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetCampaignQuarantineOffers") => {
            let result = rt.block_on(client.get_campaign_quarantine_offers(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetPrices") => {
            let result = rt.block_on(client.get_prices(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetPricesByOfferIds") => {
            let result = rt.block_on(client.get_prices_by_offer_ids(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetSuggestedPrices") => {
            let result = rt.block_on(client.get_suggested_prices(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateBusinessPrices") => {
            let result = rt.block_on(client.update_business_prices(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdatePrices") => {
            let result = rt.block_on(client.update_prices(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeletePromoOffers") => {
            let result = rt.block_on(client.delete_promo_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetPromoOffers") => {
            let result = rt.block_on(client.get_promo_offers(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetPromos") => {
            let result = rt.block_on(client.get_promos(
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdatePromoOffers") => {
            let result = rt.block_on(client.update_promo_offers(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetQualityRatingDetails") => {
            let result = rt.block_on(client.get_quality_rating_details(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GetQualityRatings") => {
            let result = rt.block_on(client.get_quality_ratings(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("SearchRegionsByName") => {
            let result = rt.block_on(client.search_regions_by_name(
                  "name_example".to_string(),
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRegionChildren") => {
            let result = rt.block_on(client.search_region_children(
                  789,
                  Some(56),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchRegionsById") => {
            let result = rt.block_on(client.search_regions_by_id(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("GenerateBoostConsolidatedReport") => {
            let result = rt.block_on(client.generate_boost_consolidated_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateCompetitorsPositionReport") => {
            let result = rt.block_on(client.generate_competitors_position_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateGoodsFeedbackReport") => {
            let result = rt.block_on(client.generate_goods_feedback_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateGoodsMovementReport") => {
            let result = rt.block_on(client.generate_goods_movement_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateGoodsRealizationReport") => {
            let result = rt.block_on(client.generate_goods_realization_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateGoodsTurnoverReport") => {
            let result = rt.block_on(client.generate_goods_turnover_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateMassOrderLabelsReport") => {
            let result = rt.block_on(client.generate_mass_order_labels_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GeneratePricesReport") => {
            let result = rt.block_on(client.generate_prices_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateShelfsStatisticsReport") => {
            let result = rt.block_on(client.generate_shelfs_statistics_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateShipmentListDocumentReport") => {
            let result = rt.block_on(client.generate_shipment_list_document_report(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateShowsSalesReport") => {
            let result = rt.block_on(client.generate_shows_sales_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateStocksOnWarehousesReport") => {
            let result = rt.block_on(client.generate_stocks_on_warehouses_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateUnitedMarketplaceServicesReport") => {
            let result = rt.block_on(client.generate_united_marketplace_services_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateUnitedNettingReport") => {
            let result = rt.block_on(client.generate_united_netting_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GenerateUnitedOrdersReport") => {
            let result = rt.block_on(client.generate_united_orders_report(
                  ???,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetReportInfo") => {
            let result = rt.block_on(client.get_report_info(
                  "report_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReturns") => {
            let result = rt.block_on(client.get_returns(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  Some(&Vec::new()),
                  Some(STARTED_BY_USER,WAITING_FOR_DECISION),
                  None,
                  None,
                  None,
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReturn") => {
            let result = rt.block_on(client.get_return(
                  789,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReturnApplication") => {
            let result = rt.block_on(client.get_return_application(
                  789,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SetReturnDecision") => {
            let result = rt.block_on(client.set_return_decision(
                  789,
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("SubmitReturnDecision") => {
            let result = rt.block_on(client.submit_return_decision(
                  789,
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetReturnPhoto") => {
            let result = rt.block_on(client.get_return_photo(
                  789,
                  789,
                  789,
                  789,
                  "image_hash_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentReceptionTransferAct") => {
            let result = rt.block_on(client.download_shipment_reception_transfer_act(
                  789,
                  Some(123123)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SearchShipments") => {
            let result = rt.block_on(client.search_shipments(
                  789,
                  ???,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ConfirmShipment") => {
            let result = rt.block_on(client.confirm_shipment(
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentAct") => {
            let result = rt.block_on(client.download_shipment_act(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentDiscrepancyAct") => {
            let result = rt.block_on(client.download_shipment_discrepancy_act(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentInboundAct") => {
            let result = rt.block_on(client.download_shipment_inbound_act(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentPalletLabels") => {
            let result = rt.block_on(client.download_shipment_pallet_labels(
                  789,
                  789,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DownloadShipmentTransportationWaybill") => {
            let result = rt.block_on(client.download_shipment_transportation_waybill(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipment") => {
            let result = rt.block_on(client.get_shipment(
                  789,
                  789,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetShipmentOrdersInfo") => {
            let result = rt.block_on(client.get_shipment_orders_info(
                  789,
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SetShipmentPalletsCount") => {
            let result = rt.block_on(client.set_shipment_pallets_count(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("TransferOrdersFromShipment") => {
            let result = rt.block_on(client.transfer_orders_from_shipment(
                  789,
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetStocks") => {
            let result = rt.block_on(client.get_stocks(
                  789,
                  Some("eyBuZXh0SWQ6IDIzNDIgfQ==".to_string()),
                  Some(20),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateStocks") => {
            let result = rt.block_on(client.update_stocks(
                  789,
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CalculateTariffs") => {
            let result = rt.block_on(client.calculate_tariffs(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetFulfillmentWarehouses") => {
            let result = rt.block_on(client.get_fulfillment_warehouses(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetWarehouses") => {
            let result = rt.block_on(client.get_warehouses(
                  789
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
