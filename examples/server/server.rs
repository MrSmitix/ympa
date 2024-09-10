//! Main library entry point for ympa_rust_server implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use ympa_rust_server::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        ympa_rust_server::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();
            let tcp_listener = TcpListener::bind(&addr).await.unwrap();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, _)) = tcp_listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        Http::new()
                            .serve_connection(tls, service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use ympa_rust_server::{
    Api,
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
use ympa_rust_server::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Информация об установленных ставках
    async fn get_bids_info_for_business(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_bids_info_request: Option<models::GetBidsInfoRequest>,
        context: &C) -> Result<GetBidsInfoForBusinessResponse, ApiError>
    {
        info!("get_bids_info_for_business({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, page_token, limit, get_bids_info_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Рекомендованные ставки для заданных товаров
    async fn get_bids_recommendations(
        &self,
        business_id: i64,
        get_bids_recommendations_request: models::GetBidsRecommendationsRequest,
        context: &C) -> Result<GetBidsRecommendationsResponse, ApiError>
    {
        info!("get_bids_recommendations({}, {:?}) - X-Span-ID: {:?}", business_id, get_bids_recommendations_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Включение буста продаж и установка ставок
    async fn put_bids_for_business(
        &self,
        business_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        context: &C) -> Result<PutBidsForBusinessResponse, ApiError>
    {
        info!("put_bids_for_business({}, {:?}) - X-Span-ID: {:?}", business_id, put_sku_bids_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Включение буста продаж и установка ставок для магазина
    async fn put_bids_for_campaign(
        &self,
        campaign_id: i64,
        put_sku_bids_request: models::PutSkuBidsRequest,
        context: &C) -> Result<PutBidsForCampaignResponse, ApiError>
    {
        info!("put_bids_for_campaign({}, {:?}) - X-Span-ID: {:?}", campaign_id, put_sku_bids_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Добавление товаров в архив
    async fn add_offers_to_archive(
        &self,
        business_id: i64,
        add_offers_to_archive_request: models::AddOffersToArchiveRequest,
        context: &C) -> Result<AddOffersToArchiveResponse, ApiError>
    {
        info!("add_offers_to_archive({}, {:?}) - X-Span-ID: {:?}", business_id, add_offers_to_archive_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товаров из каталога
    async fn delete_offers(
        &self,
        business_id: i64,
        delete_offers_request: models::DeleteOffersRequest,
        context: &C) -> Result<DeleteOffersResponse, ApiError>
    {
        info!("delete_offers({}, {:?}) - X-Span-ID: {:?}", business_id, delete_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товаров из архива
    async fn delete_offers_from_archive(
        &self,
        business_id: i64,
        delete_offers_from_archive_request: models::DeleteOffersFromArchiveRequest,
        context: &C) -> Result<DeleteOffersFromArchiveResponse, ApiError>
    {
        info!("delete_offers_from_archive({}, {:?}) - X-Span-ID: {:?}", business_id, delete_offers_from_archive_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о товарах в каталоге
    async fn get_offer_mappings(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_mappings_request: Option<models::GetOfferMappingsRequest>,
        context: &C) -> Result<GetOfferMappingsResponse, ApiError>
    {
        info!("get_offer_mappings({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, page_token, limit, get_offer_mappings_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    async fn get_suggested_offer_mappings(
        &self,
        business_id: i64,
        get_suggested_offer_mappings_request: Option<models::GetSuggestedOfferMappingsRequest>,
        context: &C) -> Result<GetSuggestedOfferMappingsResponse, ApiError>
    {
        info!("get_suggested_offer_mappings({}, {:?}) - X-Span-ID: {:?}", business_id, get_suggested_offer_mappings_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Добавление товаров в каталог и изменение информации о них
    async fn update_offer_mappings(
        &self,
        business_id: i64,
        update_offer_mappings_request: models::UpdateOfferMappingsRequest,
        context: &C) -> Result<UpdateOfferMappingsResponse, ApiError>
    {
        info!("update_offer_mappings({}, {:?}) - X-Span-ID: {:?}", business_id, update_offer_mappings_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Настройки кабинета
    async fn get_business_settings(
        &self,
        business_id: i64,
        context: &C) -> Result<GetBusinessSettingsResponse, ApiError>
    {
        info!("get_business_settings({}) - X-Span-ID: {:?}", business_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список магазинов пользователя
    async fn get_campaigns(
        &self,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetCampaignsResponse, ApiError>
    {
        info!("get_campaigns({:?}, {:?}) - X-Span-ID: {:?}", page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о магазине
    async fn get_campaign(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignResponse, ApiError>
    {
        info!("get_campaign({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Логины, связанные с магазином
    async fn get_campaign_logins(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignLoginsResponse, ApiError>
    {
        info!("get_campaign_logins({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Регион магазина
    async fn get_campaign_region(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignRegionResponse, ApiError>
    {
        info!("get_campaign_region({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Настройки магазина
    async fn get_campaign_settings(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetCampaignSettingsResponse, ApiError>
    {
        info!("get_campaign_settings({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Магазины, доступные логину
    async fn get_campaigns_by_login(
        &self,
        login: String,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetCampaignsByLoginResponse, ApiError>
    {
        info!("get_campaigns_by_login(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", login, page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    async fn get_categories_max_sale_quantum(
        &self,
        get_categories_max_sale_quantum_request: models::GetCategoriesMaxSaleQuantumRequest,
        context: &C) -> Result<GetCategoriesMaxSaleQuantumResponse, ApiError>
    {
        info!("get_categories_max_sale_quantum({:?}) - X-Span-ID: {:?}", get_categories_max_sale_quantum_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Дерево категорий
    async fn get_categories_tree(
        &self,
        get_categories_request: Option<models::GetCategoriesRequest>,
        context: &C) -> Result<GetCategoriesTreeResponse, ApiError>
    {
        info!("get_categories_tree({:?}) - X-Span-ID: {:?}", get_categories_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Создание нового чата с покупателем
    async fn create_chat(
        &self,
        business_id: i64,
        create_chat_request: models::CreateChatRequest,
        context: &C) -> Result<CreateChatResponse, ApiError>
    {
        info!("create_chat({}, {:?}) - X-Span-ID: {:?}", business_id, create_chat_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение истории сообщений в чате
    async fn get_chat_history(
        &self,
        business_id: i64,
        chat_id: i64,
        get_chat_history_request: models::GetChatHistoryRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetChatHistoryResponse, ApiError>
    {
        info!("get_chat_history({}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, chat_id, get_chat_history_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение доступных чатов
    async fn get_chats(
        &self,
        business_id: i64,
        get_chats_request: models::GetChatsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetChatsResponse, ApiError>
    {
        info!("get_chats({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, get_chats_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отправка файла в чат
    async fn send_file_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        file: swagger::ByteArray,
        context: &C) -> Result<SendFileToChatResponse, ApiError>
    {
        info!("send_file_to_chat({}, {}, {:?}) - X-Span-ID: {:?}", business_id, chat_id, file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отправка сообщения в чат
    async fn send_message_to_chat(
        &self,
        business_id: i64,
        chat_id: i64,
        send_message_to_chat_request: models::SendMessageToChatRequest,
        context: &C) -> Result<SendMessageToChatResponse, ApiError>
    {
        info!("send_message_to_chat({}, {}, {:?}) - X-Span-ID: {:?}", business_id, chat_id, send_message_to_chat_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Списки характеристик товаров по категориям
    async fn get_category_content_parameters(
        &self,
        category_id: i64,
        context: &C) -> Result<GetCategoryContentParametersResponse, ApiError>
    {
        info!("get_category_content_parameters({}) - X-Span-ID: {:?}", category_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение информации о заполненности карточек магазина
    async fn get_offer_cards_content_status(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_offer_cards_content_status_request: Option<models::GetOfferCardsContentStatusRequest>,
        context: &C) -> Result<GetOfferCardsContentStatusResponse, ApiError>
    {
        info!("get_offer_cards_content_status({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, page_token, limit, get_offer_cards_content_status_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Редактирование категорийных характеристик товара
    async fn update_offer_content(
        &self,
        business_id: i64,
        update_offer_content_request: models::UpdateOfferContentRequest,
        context: &C) -> Result<UpdateOfferContentResponse, ApiError>
    {
        info!("update_offer_content({}, {:?}) - X-Span-ID: {:?}", business_id, update_offer_content_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Справочник служб доставки
    async fn get_delivery_services(
        &self,
        context: &C) -> Result<GetDeliveryServicesResponse, ApiError>
    {
        info!("get_delivery_services() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Новые и обновленные отзывы о магазине
    async fn get_feedback_and_comment_updates(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        from_date: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<GetFeedbackAndCommentUpdatesResponse, ApiError>
    {
        info!("get_feedback_and_comment_updates({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, from_date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список прайс-листов магазина
    async fn get_feeds(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetFeedsResponse, ApiError>
    {
        info!("get_feeds({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о прайс-листе
    async fn get_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        context: &C) -> Result<GetFeedResponse, ApiError>
    {
        info!("get_feed({}, {}) - X-Span-ID: {:?}", campaign_id, feed_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по индексации прайс-листа
    async fn get_feed_index_logs(
        &self,
        campaign_id: i64,
        feed_id: i64,
        limit: Option<i32>,
        published_time_from: Option<chrono::DateTime::<chrono::Utc>>,
        published_time_to: Option<chrono::DateTime::<chrono::Utc>>,
        status: Option<models::FeedIndexLogsStatusType>,
        context: &C) -> Result<GetFeedIndexLogsResponse, ApiError>
    {
        info!("get_feed_index_logs({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, feed_id, limit, published_time_from, published_time_to, status, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Сообщить, что прайс-лист обновился
    async fn refresh_feed(
        &self,
        campaign_id: i64,
        feed_id: i64,
        context: &C) -> Result<RefreshFeedResponse, ApiError>
    {
        info!("refresh_feed({}, {}) - X-Span-ID: {:?}", campaign_id, feed_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение параметров прайс-листа
    async fn set_feed_params(
        &self,
        campaign_id: i64,
        feed_id: i64,
        set_feed_params_request: models::SetFeedParamsRequest,
        context: &C) -> Result<SetFeedParamsResponse, ApiError>
    {
        info!("set_feed_params({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, feed_id, set_feed_params_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление комментария к отзыву
    async fn delete_goods_feedback_comment(
        &self,
        business_id: i64,
        delete_goods_feedback_comment_request: models::DeleteGoodsFeedbackCommentRequest,
        context: &C) -> Result<DeleteGoodsFeedbackCommentResponse, ApiError>
    {
        info!("delete_goods_feedback_comment({}, {:?}) - X-Span-ID: {:?}", business_id, delete_goods_feedback_comment_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение комментариев к отзыву
    async fn get_goods_feedback_comments(
        &self,
        business_id: i64,
        get_goods_feedback_comments_request: models::GetGoodsFeedbackCommentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetGoodsFeedbackCommentsResponse, ApiError>
    {
        info!("get_goods_feedback_comments({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, get_goods_feedback_comments_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение отзывов о товарах продавца
    async fn get_goods_feedbacks(
        &self,
        business_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_goods_feedback_request: Option<models::GetGoodsFeedbackRequest>,
        context: &C) -> Result<GetGoodsFeedbacksResponse, ApiError>
    {
        info!("get_goods_feedbacks({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, page_token, limit, get_goods_feedback_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отказ от ответа на отзывы
    async fn skip_goods_feedbacks_reaction(
        &self,
        business_id: i64,
        skip_goods_feedback_reaction_request: models::SkipGoodsFeedbackReactionRequest,
        context: &C) -> Result<SkipGoodsFeedbacksReactionResponse, ApiError>
    {
        info!("skip_goods_feedbacks_reaction({}, {:?}) - X-Span-ID: {:?}", business_id, skip_goods_feedback_reaction_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Добавление нового или изменение созданного комментария
    async fn update_goods_feedback_comment(
        &self,
        business_id: i64,
        update_goods_feedback_comment_request: models::UpdateGoodsFeedbackCommentRequest,
        context: &C) -> Result<UpdateGoodsFeedbackCommentResponse, ApiError>
    {
        info!("update_goods_feedback_comment({}, {:?}) - X-Span-ID: {:?}", business_id, update_goods_feedback_comment_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по товарам
    async fn get_goods_stats(
        &self,
        campaign_id: i64,
        get_goods_stats_request: models::GetGoodsStatsRequest,
        context: &C) -> Result<GetGoodsStatsResponse, ApiError>
    {
        info!("get_goods_stats({}, {:?}) - X-Span-ID: {:?}", campaign_id, get_goods_stats_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Скрытие товаров и настройки скрытия
    async fn add_hidden_offers(
        &self,
        campaign_id: i64,
        add_hidden_offers_request: models::AddHiddenOffersRequest,
        context: &C) -> Result<AddHiddenOffersResponse, ApiError>
    {
        info!("add_hidden_offers({}, {:?}) - X-Span-ID: {:?}", campaign_id, add_hidden_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Возобновление показа товаров
    async fn delete_hidden_offers(
        &self,
        campaign_id: i64,
        delete_hidden_offers_request: models::DeleteHiddenOffersRequest,
        context: &C) -> Result<DeleteHiddenOffersResponse, ApiError>
    {
        info!("delete_hidden_offers({}, {:?}) - X-Span-ID: {:?}", campaign_id, delete_hidden_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о скрытых вами товарах
    async fn get_hidden_offers(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<models::ShopSku>>,
        page_token: Option<String>,
        limit: Option<i32>,
        offset: Option<i32>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetHiddenOffersResponse, ApiError>
    {
        info!("get_hidden_offers({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, offer_id, page_token, limit, offset, page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о нескольких моделях
    async fn get_models(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        context: &C) -> Result<GetModelsResponse, ApiError>
    {
        info!("get_models({}, {:?}, {:?}) - X-Span-ID: {:?}", region_id, get_models_request, currency, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список предложений для нескольких моделей
    async fn get_models_offers(
        &self,
        region_id: i64,
        get_models_request: models::GetModelsRequest,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        context: &C) -> Result<GetModelsOffersResponse, ApiError>
    {
        info!("get_models_offers({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", region_id, get_models_request, currency, order_by_price, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Поиск модели товара
    async fn search_models(
        &self,
        query: String,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<SearchModelsResponse, ApiError>
    {
        info!("search_models(\"{}\", {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", query, region_id, currency, page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация об одной модели
    async fn get_model(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        context: &C) -> Result<GetModelResponse, ApiError>
    {
        info!("get_model({}, {}, {:?}) - X-Span-ID: {:?}", model_id, region_id, currency, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список предложений для одной модели
    async fn get_model_offers(
        &self,
        model_id: i64,
        region_id: i64,
        currency: Option<models::CurrencyType>,
        order_by_price: Option<models::SortOrderType>,
        count: Option<i32>,
        page: Option<i32>,
        context: &C) -> Result<GetModelOffersResponse, ApiError>
    {
        info!("get_model_offers({}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", model_id, region_id, currency, order_by_price, count, page, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список товаров в каталоге
    async fn get_offer_mapping_entries(
        &self,
        campaign_id: i64,
        offer_id: Option<&Vec<String>>,
        shop_sku: Option<&Vec<models::ShopSku>>,
        mapping_kind: Option<models::OfferMappingKindType>,
        status: Option<&Vec<models::OfferProcessingStatusType>>,
        availability: Option<&Vec<models::OfferAvailabilityStatusType>>,
        category_id: Option<&Vec<i32>>,
        vendor: Option<&Vec<String>>,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOfferMappingEntriesResponse, ApiError>
    {
        info!("get_offer_mapping_entries({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, offer_id, shop_sku, mapping_kind, status, availability, category_id, vendor, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Рекомендованные карточки для товаров
    async fn get_suggested_offer_mapping_entries(
        &self,
        campaign_id: i64,
        get_suggested_offer_mapping_entries_request: models::GetSuggestedOfferMappingEntriesRequest,
        context: &C) -> Result<GetSuggestedOfferMappingEntriesResponse, ApiError>
    {
        info!("get_suggested_offer_mapping_entries({}, {:?}) - X-Span-ID: {:?}", campaign_id, get_suggested_offer_mapping_entries_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Добавление и редактирование товаров в каталоге
    async fn update_offer_mapping_entries(
        &self,
        campaign_id: i64,
        update_offer_mapping_entry_request: models::UpdateOfferMappingEntryRequest,
        context: &C) -> Result<UpdateOfferMappingEntriesResponse, ApiError>
    {
        info!("update_offer_mapping_entries({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_offer_mapping_entry_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товаров из ассортимента магазина
    async fn delete_campaign_offers(
        &self,
        campaign_id: i64,
        delete_campaign_offers_request: models::DeleteCampaignOffersRequest,
        context: &C) -> Result<DeleteCampaignOffersResponse, ApiError>
    {
        info!("delete_campaign_offers({}, {:?}) - X-Span-ID: {:?}", campaign_id, delete_campaign_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Все предложения магазина
    async fn get_all_offers(
        &self,
        campaign_id: i64,
        feed_id: Option<i64>,
        chunk: Option<i32>,
        context: &C) -> Result<GetAllOffersResponse, ApiError>
    {
        info!("get_all_offers({}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, feed_id, chunk, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о товарах, которые размещены в заданном магазине
    async fn get_campaign_offers(
        &self,
        campaign_id: i64,
        get_campaign_offers_request: models::GetCampaignOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetCampaignOffersResponse, ApiError>
    {
        info!("get_campaign_offers({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, get_campaign_offers_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Рекомендации Маркета, касающиеся цен
    async fn get_offer_recommendations(
        &self,
        business_id: i64,
        get_offer_recommendations_request: models::GetOfferRecommendationsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOfferRecommendationsResponse, ApiError>
    {
        info!("get_offer_recommendations({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, get_offer_recommendations_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Предложения магазина
    async fn get_offers(
        &self,
        campaign_id: i64,
        query: Option<String>,
        feed_id: Option<i64>,
        shop_category_id: Option<String>,
        currency: Option<models::CurrencyType>,
        matched: Option<bool>,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<GetOffersResponse, ApiError>
    {
        info!("get_offers({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, query, feed_id, shop_category_id, currency, matched, page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение условий продажи товаров в магазине
    async fn update_campaign_offers(
        &self,
        campaign_id: i64,
        update_campaign_offers_request: models::UpdateCampaignOffersRequest,
        context: &C) -> Result<UpdateCampaignOffersResponse, ApiError>
    {
        info!("update_campaign_offers({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_campaign_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о покупателе — юридическом лице
    async fn get_order_business_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBusinessBuyerInfoResponse, ApiError>
    {
        info!("get_order_business_buyer_info({}, {}) - X-Span-ID: {:?}", campaign_id, order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о документах
    async fn get_order_business_documents_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBusinessDocumentsInfoResponse, ApiError>
    {
        info!("get_order_business_documents_info({}, {}) - X-Span-ID: {:?}", campaign_id, order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о покупателе — физическом лице
    async fn get_order_buyer_info(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderBuyerInfoResponse, ApiError>
    {
        info!("get_order_buyer_info({}, {}) - X-Span-ID: {:?}", campaign_id, order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение даты доставки заказа
    async fn set_order_delivery_date(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_date_request: models::SetOrderDeliveryDateRequest,
        context: &C) -> Result<SetOrderDeliveryDateResponse, ApiError>
    {
        info!("set_order_delivery_date({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, set_order_delivery_date_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача трек‑номера посылки
    async fn set_order_delivery_track_code(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_delivery_track_code_request: models::SetOrderDeliveryTrackCodeRequest,
        context: &C) -> Result<SetOrderDeliveryTrackCodeResponse, ApiError>
    {
        info!("set_order_delivery_track_code({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, set_order_delivery_track_code_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Продление срока хранения заказа
    async fn update_order_storage_limit(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_storage_limit_request: models::UpdateOrderStorageLimitRequest,
        context: &C) -> Result<UpdateOrderStorageLimitResponse, ApiError>
    {
        info!("update_order_storage_limit({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, update_order_storage_limit_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача кода подтверждения
    async fn verify_order_eac(
        &self,
        campaign_id: i64,
        order_id: i64,
        verify_order_eac_request: models::VerifyOrderEacRequest,
        context: &C) -> Result<VerifyOrderEacResponse, ApiError>
    {
        info!("verify_order_eac({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, verify_order_eac_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    async fn generate_order_labels(
        &self,
        campaign_id: i64,
        order_id: i64,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateOrderLabelsResponse, ApiError>
    {
        info!("generate_order_labels({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Данные для самостоятельного изготовления ярлыков
    async fn get_order_labels_data(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderLabelsDataResponse, ApiError>
    {
        info!("get_order_labels_data({}, {}) - X-Span-ID: {:?}", campaign_id, order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Готовый ярлык‑наклейка для коробки в заказе
    async fn generate_order_label(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        box_id: i64,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateOrderLabelResponse, ApiError>
    {
        info!("generate_order_label({}, {}, {}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, shipment_id, box_id, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о нескольких заказах
    async fn get_orders(
        &self,
        campaign_id: i64,
        order_ids: Option<&Vec<i64>>,
        status: Option<&Vec<models::OrderStatusType>>,
        substatus: Option<&Vec<models::OrderSubstatusType>>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_from: Option<chrono::naive::NaiveDate>,
        supplier_shipment_date_to: Option<chrono::naive::NaiveDate>,
        updated_at_from: Option<chrono::DateTime::<chrono::Utc>>,
        updated_at_to: Option<chrono::DateTime::<chrono::Utc>>,
        dispatch_type: Option<models::OrderDeliveryDispatchType>,
        fake: Option<bool>,
        has_cis: Option<bool>,
        only_waiting_for_cancellation_approve: Option<bool>,
        only_estimated_delivery: Option<bool>,
        buyer_type: Option<models::OrderBuyerType>,
        page: Option<i32>,
        page_size: Option<i32>,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetOrdersResponse, ApiError>
    {
        info!("get_orders({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, order_ids, status, substatus, from_date, to_date, supplier_shipment_date_from, supplier_shipment_date_to, updated_at_from, updated_at_to, dispatch_type, fake, has_cis, only_waiting_for_cancellation_approve, only_estimated_delivery, buyer_type, page, page_size, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение статусов нескольких заказов
    async fn update_order_statuses(
        &self,
        campaign_id: i64,
        update_order_statuses_request: models::UpdateOrderStatusesRequest,
        context: &C) -> Result<UpdateOrderStatusesResponse, ApiError>
    {
        info!("update_order_statuses({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_order_statuses_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отмена заказа покупателем
    async fn accept_order_cancellation(
        &self,
        campaign_id: i64,
        order_id: i64,
        accept_order_cancellation_request: models::AcceptOrderCancellationRequest,
        context: &C) -> Result<AcceptOrderCancellationResponse, ApiError>
    {
        info!("accept_order_cancellation({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, accept_order_cancellation_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация об одном заказе
    async fn get_order(
        &self,
        campaign_id: i64,
        order_id: i64,
        context: &C) -> Result<GetOrderResponse, ApiError>
    {
        info!("get_order({}, {}) - X-Span-ID: {:?}", campaign_id, order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача ключей цифровых товаров
    async fn provide_order_digital_codes(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_digital_codes_request: models::ProvideOrderDigitalCodesRequest,
        context: &C) -> Result<ProvideOrderDigitalCodesResponse, ApiError>
    {
        info!("provide_order_digital_codes({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, provide_order_digital_codes_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача кодов маркировки единиц товара
    async fn provide_order_item_identifiers(
        &self,
        campaign_id: i64,
        order_id: i64,
        provide_order_item_identifiers_request: models::ProvideOrderItemIdentifiersRequest,
        context: &C) -> Result<ProvideOrderItemIdentifiersResponse, ApiError>
    {
        info!("provide_order_item_identifiers({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, provide_order_item_identifiers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Подготовка заказа
    async fn set_order_box_layout(
        &self,
        campaign_id: i64,
        order_id: i64,
        set_order_box_layout_request: models::SetOrderBoxLayoutRequest,
        context: &C) -> Result<SetOrderBoxLayoutResponse, ApiError>
    {
        info!("set_order_box_layout({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, set_order_box_layout_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товара из заказа или уменьшение числа единиц
    async fn update_order_items(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_item_request: models::UpdateOrderItemRequest,
        context: &C) -> Result<UpdateOrderItemsResponse, ApiError>
    {
        info!("update_order_items({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, update_order_item_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение статуса одного заказа
    async fn update_order_status(
        &self,
        campaign_id: i64,
        order_id: i64,
        update_order_status_request: models::UpdateOrderStatusRequest,
        context: &C) -> Result<UpdateOrderStatusResponse, ApiError>
    {
        info!("update_order_status({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, update_order_status_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача количества грузовых мест в заказе
    async fn set_order_shipment_boxes(
        &self,
        campaign_id: i64,
        order_id: i64,
        shipment_id: i64,
        set_order_shipment_boxes_request: models::SetOrderShipmentBoxesRequest,
        context: &C) -> Result<SetOrderShipmentBoxesResponse, ApiError>
    {
        info!("set_order_shipment_boxes({}, {}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, shipment_id, set_order_shipment_boxes_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Детальная информация по заказам
    async fn get_orders_stats(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_orders_stats_request: Option<models::GetOrdersStatsRequest>,
        context: &C) -> Result<GetOrdersStatsResponse, ApiError>
    {
        info!("get_orders_stats({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, get_orders_stats_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление лицензий для точек продаж
    async fn delete_outlet_licenses(
        &self,
        campaign_id: i64,
        ids: Option<&Vec<i64>>,
        context: &C) -> Result<DeleteOutletLicensesResponse, ApiError>
    {
        info!("delete_outlet_licenses({}, {:?}) - X-Span-ID: {:?}", campaign_id, ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о лицензиях для точек продаж
    async fn get_outlet_licenses(
        &self,
        campaign_id: i64,
        outlet_ids: Option<&Vec<i64>>,
        ids: Option<&Vec<i64>>,
        context: &C) -> Result<GetOutletLicensesResponse, ApiError>
    {
        info!("get_outlet_licenses({}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, outlet_ids, ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Создание и изменение лицензий для точек продаж
    async fn update_outlet_licenses(
        &self,
        campaign_id: i64,
        update_outlet_license_request: models::UpdateOutletLicenseRequest,
        context: &C) -> Result<UpdateOutletLicensesResponse, ApiError>
    {
        info!("update_outlet_licenses({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_outlet_license_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Создание точки продаж
    async fn create_outlet(
        &self,
        campaign_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        context: &C) -> Result<CreateOutletResponse, ApiError>
    {
        info!("create_outlet({}, {:?}) - X-Span-ID: {:?}", campaign_id, change_outlet_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о нескольких точках продаж
    async fn get_outlets(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        region_id: Option<i64>,
        shop_outlet_code: Option<String>,
        region_id2: Option<i64>,
        context: &C) -> Result<GetOutletsResponse, ApiError>
    {
        info!("get_outlets({}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, region_id, shop_outlet_code, region_id2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление точки продаж
    async fn delete_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        context: &C) -> Result<DeleteOutletResponse, ApiError>
    {
        info!("delete_outlet({}, {}) - X-Span-ID: {:?}", campaign_id, outlet_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация об одной точке продаж
    async fn get_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        context: &C) -> Result<GetOutletResponse, ApiError>
    {
        info!("get_outlet({}, {}) - X-Span-ID: {:?}", campaign_id, outlet_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Изменение информации о точке продаж
    async fn update_outlet(
        &self,
        campaign_id: i64,
        outlet_id: i64,
        change_outlet_request: models::ChangeOutletRequest,
        context: &C) -> Result<UpdateOutletResponse, ApiError>
    {
        info!("update_outlet({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, outlet_id, change_outlet_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товара из карантина по цене в кабинете
    async fn confirm_business_prices(
        &self,
        business_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        context: &C) -> Result<ConfirmBusinessPricesResponse, ApiError>
    {
        info!("confirm_business_prices({}, {:?}) - X-Span-ID: {:?}", business_id, confirm_prices_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товара из карантина по цене в магазине
    async fn confirm_campaign_prices(
        &self,
        campaign_id: i64,
        confirm_prices_request: models::ConfirmPricesRequest,
        context: &C) -> Result<ConfirmCampaignPricesResponse, ApiError>
    {
        info!("confirm_campaign_prices({}, {:?}) - X-Span-ID: {:?}", campaign_id, confirm_prices_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список товаров, находящихся в карантине по цене в кабинете
    async fn get_business_quarantine_offers(
        &self,
        business_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetBusinessQuarantineOffersResponse, ApiError>
    {
        info!("get_business_quarantine_offers({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, get_quarantine_offers_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список товаров, находящихся в карантине по цене в магазине
    async fn get_campaign_quarantine_offers(
        &self,
        campaign_id: i64,
        get_quarantine_offers_request: models::GetQuarantineOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetCampaignQuarantineOffersResponse, ApiError>
    {
        info!("get_campaign_quarantine_offers({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, get_quarantine_offers_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список цен
    async fn get_prices(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        archived: Option<bool>,
        context: &C) -> Result<GetPricesResponse, ApiError>
    {
        info!("get_prices({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, archived, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Просмотр цен на указанные товары в магазине
    async fn get_prices_by_offer_ids(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_prices_by_offer_ids_request: Option<models::GetPricesByOfferIdsRequest>,
        context: &C) -> Result<GetPricesByOfferIdsResponse, ApiError>
    {
        info!("get_prices_by_offer_ids({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, get_prices_by_offer_ids_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Цены для продвижения товаров
    async fn get_suggested_prices(
        &self,
        campaign_id: i64,
        suggest_prices_request: models::SuggestPricesRequest,
        context: &C) -> Result<GetSuggestedPricesResponse, ApiError>
    {
        info!("get_suggested_prices({}, {:?}) - X-Span-ID: {:?}", campaign_id, suggest_prices_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Установка цен на товары во всех магазинах
    async fn update_business_prices(
        &self,
        business_id: i64,
        update_business_prices_request: models::UpdateBusinessPricesRequest,
        context: &C) -> Result<UpdateBusinessPricesResponse, ApiError>
    {
        info!("update_business_prices({}, {:?}) - X-Span-ID: {:?}", business_id, update_business_prices_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Установка цен на товары в конкретном магазине
    async fn update_prices(
        &self,
        campaign_id: i64,
        update_prices_request: models::UpdatePricesRequest,
        context: &C) -> Result<UpdatePricesResponse, ApiError>
    {
        info!("update_prices({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_prices_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Удаление товаров из акции
    async fn delete_promo_offers(
        &self,
        business_id: i64,
        delete_promo_offers_request: models::DeletePromoOffersRequest,
        context: &C) -> Result<DeletePromoOffersResponse, ApiError>
    {
        info!("delete_promo_offers({}, {:?}) - X-Span-ID: {:?}", business_id, delete_promo_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    async fn get_promo_offers(
        &self,
        business_id: i64,
        get_promo_offers_request: models::GetPromoOffersRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<GetPromoOffersResponse, ApiError>
    {
        info!("get_promo_offers({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, get_promo_offers_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение списка акций
    async fn get_promos(
        &self,
        business_id: i64,
        get_promos_request: Option<models::GetPromosRequest>,
        context: &C) -> Result<GetPromosResponse, ApiError>
    {
        info!("get_promos({}, {:?}) - X-Span-ID: {:?}", business_id, get_promos_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Добавление товаров в акцию или изменение их цен
    async fn update_promo_offers(
        &self,
        business_id: i64,
        update_promo_offers_request: models::UpdatePromoOffersRequest,
        context: &C) -> Result<UpdatePromoOffersResponse, ApiError>
    {
        info!("update_promo_offers({}, {:?}) - X-Span-ID: {:?}", business_id, update_promo_offers_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Заказы, которые повлияли на индекс качества
    async fn get_quality_rating_details(
        &self,
        campaign_id: i64,
        context: &C) -> Result<GetQualityRatingDetailsResponse, ApiError>
    {
        info!("get_quality_rating_details({}) - X-Span-ID: {:?}", campaign_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Индекс качества магазинов
    async fn get_quality_ratings(
        &self,
        business_id: i64,
        get_quality_rating_request: models::GetQualityRatingRequest,
        context: &C) -> Result<GetQualityRatingsResponse, ApiError>
    {
        info!("get_quality_ratings({}, {:?}) - X-Span-ID: {:?}", business_id, get_quality_rating_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Поиск регионов по их имени
    async fn search_regions_by_name(
        &self,
        name: String,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchRegionsByNameResponse, ApiError>
    {
        info!("search_regions_by_name(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", name, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о дочерних регионах
    async fn search_region_children(
        &self,
        region_id: i64,
        page: Option<i32>,
        page_size: Option<i32>,
        context: &C) -> Result<SearchRegionChildrenResponse, ApiError>
    {
        info!("search_region_children({}, {:?}, {:?}) - X-Span-ID: {:?}", region_id, page, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о регионе
    async fn search_regions_by_id(
        &self,
        region_id: i64,
        context: &C) -> Result<SearchRegionsByIdResponse, ApiError>
    {
        info!("search_regions_by_id({}) - X-Span-ID: {:?}", region_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по бусту продаж
    async fn generate_boost_consolidated_report(
        &self,
        generate_boost_consolidated_request: models::GenerateBoostConsolidatedRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateBoostConsolidatedReportResponse, ApiError>
    {
        info!("generate_boost_consolidated_report({:?}, {:?}) - X-Span-ID: {:?}", generate_boost_consolidated_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет «Конкурентная позиция»
    async fn generate_competitors_position_report(
        &self,
        generate_competitors_position_report_request: models::GenerateCompetitorsPositionReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateCompetitorsPositionReportResponse, ApiError>
    {
        info!("generate_competitors_position_report({:?}, {:?}) - X-Span-ID: {:?}", generate_competitors_position_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по отзывам о товарах
    async fn generate_goods_feedback_report(
        &self,
        generate_goods_feedback_request: models::GenerateGoodsFeedbackRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsFeedbackReportResponse, ApiError>
    {
        info!("generate_goods_feedback_report({:?}, {:?}) - X-Span-ID: {:?}", generate_goods_feedback_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по движению товаров
    async fn generate_goods_movement_report(
        &self,
        generate_goods_movement_report_request: models::GenerateGoodsMovementReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsMovementReportResponse, ApiError>
    {
        info!("generate_goods_movement_report({:?}, {:?}) - X-Span-ID: {:?}", generate_goods_movement_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по реализации
    async fn generate_goods_realization_report(
        &self,
        generate_goods_realization_report_request: models::GenerateGoodsRealizationReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsRealizationReportResponse, ApiError>
    {
        info!("generate_goods_realization_report({:?}, {:?}) - X-Span-ID: {:?}", generate_goods_realization_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по оборачиваемости
    async fn generate_goods_turnover_report(
        &self,
        generate_goods_turnover_request: models::GenerateGoodsTurnoverRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateGoodsTurnoverReportResponse, ApiError>
    {
        info!("generate_goods_turnover_report({:?}, {:?}) - X-Span-ID: {:?}", generate_goods_turnover_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    async fn generate_mass_order_labels_report(
        &self,
        generate_mass_order_labels_request: models::GenerateMassOrderLabelsRequest,
        format: Option<models::PageFormatType>,
        context: &C) -> Result<GenerateMassOrderLabelsReportResponse, ApiError>
    {
        info!("generate_mass_order_labels_report({:?}, {:?}) - X-Span-ID: {:?}", generate_mass_order_labels_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет «Цены на рынке»
    async fn generate_prices_report(
        &self,
        generate_prices_report_request: models::GeneratePricesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GeneratePricesReportResponse, ApiError>
    {
        info!("generate_prices_report({:?}, {:?}) - X-Span-ID: {:?}", generate_prices_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по полкам
    async fn generate_shelfs_statistics_report(
        &self,
        generate_shelfs_statistics_request: models::GenerateShelfsStatisticsRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateShelfsStatisticsReportResponse, ApiError>
    {
        info!("generate_shelfs_statistics_report({:?}, {:?}) - X-Span-ID: {:?}", generate_shelfs_statistics_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение листа сборки
    async fn generate_shipment_list_document_report(
        &self,
        generate_shipment_list_document_report_request: models::GenerateShipmentListDocumentReportRequest,
        context: &C) -> Result<GenerateShipmentListDocumentReportResponse, ApiError>
    {
        info!("generate_shipment_list_document_report({:?}) - X-Span-ID: {:?}", generate_shipment_list_document_report_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет «Аналитика продаж»
    async fn generate_shows_sales_report(
        &self,
        generate_shows_sales_report_request: models::GenerateShowsSalesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateShowsSalesReportResponse, ApiError>
    {
        info!("generate_shows_sales_report({:?}, {:?}) - X-Span-ID: {:?}", generate_shows_sales_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по остаткам на складах
    async fn generate_stocks_on_warehouses_report(
        &self,
        generate_stocks_on_warehouses_report_request: models::GenerateStocksOnWarehousesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateStocksOnWarehousesReportResponse, ApiError>
    {
        info!("generate_stocks_on_warehouses_report({:?}, {:?}) - X-Span-ID: {:?}", generate_stocks_on_warehouses_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по стоимости услуг
    async fn generate_united_marketplace_services_report(
        &self,
        generate_united_marketplace_services_report_request: models::GenerateUnitedMarketplaceServicesReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedMarketplaceServicesReportResponse, ApiError>
    {
        info!("generate_united_marketplace_services_report({:?}, {:?}) - X-Span-ID: {:?}", generate_united_marketplace_services_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по платежам
    async fn generate_united_netting_report(
        &self,
        generate_united_netting_report_request: models::GenerateUnitedNettingReportRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedNettingReportResponse, ApiError>
    {
        info!("generate_united_netting_report({:?}, {:?}) - X-Span-ID: {:?}", generate_united_netting_report_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Отчет по заказам
    async fn generate_united_orders_report(
        &self,
        generate_united_orders_request: models::GenerateUnitedOrdersRequest,
        format: Option<models::ReportFormatType>,
        context: &C) -> Result<GenerateUnitedOrdersReportResponse, ApiError>
    {
        info!("generate_united_orders_report({:?}, {:?}) - X-Span-ID: {:?}", generate_united_orders_request, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение заданного отчета
    async fn get_report_info(
        &self,
        report_id: String,
        context: &C) -> Result<GetReportInfoResponse, ApiError>
    {
        info!("get_report_info(\"{}\") - X-Span-ID: {:?}", report_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список невыкупов и возвратов
    async fn get_returns(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        order_ids: Option<&Vec<i64>>,
        statuses: Option<&Vec<models::RefundStatusType>>,
        r#type: Option<models::ReturnType>,
        from_date: Option<chrono::naive::NaiveDate>,
        to_date: Option<chrono::naive::NaiveDate>,
        from_date2: Option<chrono::naive::NaiveDate>,
        to_date2: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<GetReturnsResponse, ApiError>
    {
        info!("get_returns({}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, order_ids, statuses, r#type, from_date, to_date, from_date2, to_date2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация о невыкупе или возврате
    async fn get_return(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<GetReturnResponse, ApiError>
    {
        info!("get_return({}, {}, {}) - X-Span-ID: {:?}", campaign_id, order_id, return_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение заявления на возврат
    async fn get_return_application(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<GetReturnApplicationResponse, ApiError>
    {
        info!("get_return_application({}, {}, {}) - X-Span-ID: {:?}", campaign_id, order_id, return_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Принятие или изменение решения по возврату
    async fn set_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        set_return_decision_request: models::SetReturnDecisionRequest,
        context: &C) -> Result<SetReturnDecisionResponse, ApiError>
    {
        info!("set_return_decision({}, {}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, order_id, return_id, set_return_decision_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Подтверждение решения по возврату
    async fn submit_return_decision(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        context: &C) -> Result<SubmitReturnDecisionResponse, ApiError>
    {
        info!("submit_return_decision({}, {}, {}) - X-Span-ID: {:?}", campaign_id, order_id, return_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение фотографии возврата
    async fn get_return_photo(
        &self,
        campaign_id: i64,
        order_id: i64,
        return_id: i64,
        item_id: i64,
        image_hash: String,
        context: &C) -> Result<GetReturnPhotoResponse, ApiError>
    {
        info!("get_return_photo({}, {}, {}, {}, \"{}\") - X-Span-ID: {:?}", campaign_id, order_id, return_id, item_id, image_hash, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
    async fn download_shipment_reception_transfer_act(
        &self,
        campaign_id: i64,
        warehouse_id: Option<i32>,
        context: &C) -> Result<DownloadShipmentReceptionTransferActResponse, ApiError>
    {
        info!("download_shipment_reception_transfer_act({}, {:?}) - X-Span-ID: {:?}", campaign_id, warehouse_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение информации о нескольких отгрузках
    async fn search_shipments(
        &self,
        campaign_id: i64,
        search_shipments_request: models::SearchShipmentsRequest,
        page_token: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchShipmentsResponse, ApiError>
    {
        info!("search_shipments({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, search_shipments_request, page_token, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Подтверждение отгрузки
    async fn confirm_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        confirm_shipment_request: Option<models::ConfirmShipmentRequest>,
        context: &C) -> Result<ConfirmShipmentResponse, ApiError>
    {
        info!("confirm_shipment({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, shipment_id, confirm_shipment_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение акта приема-передачи
    async fn download_shipment_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentActResponse, ApiError>
    {
        info!("download_shipment_act({}, {}) - X-Span-ID: {:?}", campaign_id, shipment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение акта расхождений
    async fn download_shipment_discrepancy_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentDiscrepancyActResponse, ApiError>
    {
        info!("download_shipment_discrepancy_act({}, {}) - X-Span-ID: {:?}", campaign_id, shipment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение фактического акта приема-передачи
    async fn download_shipment_inbound_act(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentInboundActResponse, ApiError>
    {
        info!("download_shipment_inbound_act({}, {}) - X-Span-ID: {:?}", campaign_id, shipment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Ярлыки для доверительной приемки (FBS)
    async fn download_shipment_pallet_labels(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        format: Option<models::ShipmentPalletLabelPageFormatType>,
        context: &C) -> Result<DownloadShipmentPalletLabelsResponse, ApiError>
    {
        info!("download_shipment_pallet_labels({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, shipment_id, format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение транспортной накладной
    async fn download_shipment_transportation_waybill(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<DownloadShipmentTransportationWaybillResponse, ApiError>
    {
        info!("download_shipment_transportation_waybill({}, {}) - X-Span-ID: {:?}", campaign_id, shipment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение информации об одной отгрузке
    async fn get_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        cancelled_orders: Option<bool>,
        context: &C) -> Result<GetShipmentResponse, ApiError>
    {
        info!("get_shipment({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, shipment_id, cancelled_orders, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Получение информации о возможности печати ярлыков (FBS)
    async fn get_shipment_orders_info(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        context: &C) -> Result<GetShipmentOrdersInfoResponse, ApiError>
    {
        info!("get_shipment_orders_info({}, {}) - X-Span-ID: {:?}", campaign_id, shipment_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача количества упаковок в отгрузке
    async fn set_shipment_pallets_count(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        set_shipment_pallets_count_request: models::SetShipmentPalletsCountRequest,
        context: &C) -> Result<SetShipmentPalletsCountResponse, ApiError>
    {
        info!("set_shipment_pallets_count({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, shipment_id, set_shipment_pallets_count_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Перенос заказов в следующую отгрузку
    async fn transfer_orders_from_shipment(
        &self,
        campaign_id: i64,
        shipment_id: i64,
        transfer_orders_from_shipment_request: models::TransferOrdersFromShipmentRequest,
        context: &C) -> Result<TransferOrdersFromShipmentResponse, ApiError>
    {
        info!("transfer_orders_from_shipment({}, {}, {:?}) - X-Span-ID: {:?}", campaign_id, shipment_id, transfer_orders_from_shipment_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Информация об остатках и оборачиваемости
    async fn get_stocks(
        &self,
        campaign_id: i64,
        page_token: Option<String>,
        limit: Option<i32>,
        get_warehouse_stocks_request: Option<models::GetWarehouseStocksRequest>,
        context: &C) -> Result<GetStocksResponse, ApiError>
    {
        info!("get_stocks({}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, page_token, limit, get_warehouse_stocks_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Передача информации об остатках
    async fn update_stocks(
        &self,
        campaign_id: i64,
        update_stocks_request: models::UpdateStocksRequest,
        context: &C) -> Result<UpdateStocksResponse, ApiError>
    {
        info!("update_stocks({}, {:?}) - X-Span-ID: {:?}", campaign_id, update_stocks_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Калькулятор стоимости услуг
    async fn calculate_tariffs(
        &self,
        calculate_tariffs_request: models::CalculateTariffsRequest,
        context: &C) -> Result<CalculateTariffsResponse, ApiError>
    {
        info!("calculate_tariffs({:?}) - X-Span-ID: {:?}", calculate_tariffs_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Идентификаторы складов Маркета (FBY)
    async fn get_fulfillment_warehouses(
        &self,
        context: &C) -> Result<GetFulfillmentWarehousesResponse, ApiError>
    {
        info!("get_fulfillment_warehouses() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Список складов и групп складов
    async fn get_warehouses(
        &self,
        business_id: i64,
        context: &C) -> Result<GetWarehousesResponse, ApiError>
    {
        info!("get_warehouses({}) - X-Span-ID: {:?}", business_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
