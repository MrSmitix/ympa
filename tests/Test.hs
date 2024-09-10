{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import ПартнерскийAPIМаркета.Model
import ПартнерскийAPIМаркета.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy AcceptOrderCancellationRequest)
      propMimeEq MimeJSON (Proxy :: Proxy AddHiddenOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy AddOffersToArchiveDTO)
      propMimeEq MimeJSON (Proxy :: Proxy AddOffersToArchiveErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy AddOffersToArchiveErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy AddOffersToArchiveRequest)
      propMimeEq MimeJSON (Proxy :: Proxy AddOffersToArchiveResponse)
      propMimeEq MimeJSON (Proxy :: Proxy AffectedOrderQualityRatingComponentType)
      propMimeEq MimeJSON (Proxy :: Proxy AgeDTO)
      propMimeEq MimeJSON (Proxy :: Proxy AgeUnitType)
      propMimeEq MimeJSON (Proxy :: Proxy ApiClientDataErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ApiErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiForbiddenErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiLimitErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiLockedErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiNotFoundErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiResponseStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ApiServerErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ApiUnauthorizedErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy BaseCampaignOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BaseOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BasePriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BaseShipmentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BidRecommendationItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BriefOrderItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BriefOrderItemInstanceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BusinessDTO)
      propMimeEq MimeJSON (Proxy :: Proxy BusinessSettingsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsOfferInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsParametersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CalculateTariffsResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculatedTariffDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CalculatedTariffType)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignQualityRatingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsDeliveryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsLocalRegionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsScheduleDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsScheduleSourceType)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignSettingsTimePeriodDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CampaignsQualityRatingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryContentParametersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryParameterDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CategoryParameterUnitDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ChangeOutletRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ChannelType)
      propMimeEq MimeJSON (Proxy :: Proxy ChatMessageDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ChatMessagePayloadDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ChatMessageSenderType)
      propMimeEq MimeJSON (Proxy :: Proxy ChatMessagesResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ChatStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ChatType)
      propMimeEq MimeJSON (Proxy :: Proxy ConfirmPricesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ConfirmShipmentRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy CreateOutletResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CurrencyType)
      propMimeEq MimeJSON (Proxy :: Proxy DayOfWeekType)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteCampaignOffersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteCampaignOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteCampaignOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteGoodsFeedbackCommentRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteHiddenOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersFromArchiveDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersFromArchiveRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersFromArchiveResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeletePromoOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy DeletePromoOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeletePromoOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeliveryServiceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeliveryServiceInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DeliveryServicesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy DocumentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy EacVerificationResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy EacVerificationStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy EmptyApiResponse)
      propMimeEq MimeJSON (Proxy :: Proxy EnrichedMappingsOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy EnrichedModelDTO)
      propMimeEq MimeJSON (Proxy :: Proxy EnrichedModelsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy EnrichedOrderBoxLayoutDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ExtensionShipmentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedContentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedContentErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedContentErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedDownloadDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedDownloadErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedDownloadErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsFeedDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsIndexType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsOffersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsRecordDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedIndexLogsStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedParameterDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedPlacementDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedPublicationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedPublicationFullDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedPublicationPriceAndStockUpdateDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackAuthorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackCommentAuthorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackCommentAuthorType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackCommentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackDeliveryType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackFactorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackGradesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackListDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackOrderDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackReactionStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackShopDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FeedbackStateType)
      propMimeEq MimeJSON (Proxy :: Proxy FieldStateType)
      propMimeEq MimeJSON (Proxy :: Proxy FlippingPagerDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ForwardScrollingPagerDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FulfillmentWarehouseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FulfillmentWarehousesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FullOutletDTO)
      propMimeEq MimeJSON (Proxy :: Proxy FullOutletLicenseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateBoostConsolidatedRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateCompetitorsPositionReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateGoodsFeedbackRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateGoodsMovementReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateGoodsRealizationReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateGoodsTurnoverRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateMassOrderLabelsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GeneratePricesReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateReportDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateReportResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateShelfsStatisticsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateShipmentListDocumentReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateShowsSalesReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateStocksOnWarehousesReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateUnitedMarketplaceServicesReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateUnitedNettingReportRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GenerateUnitedOrdersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetAllOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsInfoRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsInfoResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsRecommendationsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsRecommendationsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetBidsRecommendationsResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetBusinessBuyerInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetBusinessDocumentsInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetBusinessSettingsInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetBusinessSettingsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignLoginsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignRegionResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignSettingsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCampaignsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoriesMaxSaleQuantumDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoriesMaxSaleQuantumRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoriesMaxSaleQuantumResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoriesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoriesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetCategoryContentParametersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatHistoryRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatHistoryResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatsInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetChatsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetDeliveryServicesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetFeedIndexLogsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetFeedResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetFeedbackListResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetFeedsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetFulfillmentWarehousesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsFeedbackCommentsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsFeedbackCommentsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsFeedbackRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsFeedbackResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsStatsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetGoodsStatsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetHiddenOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetHiddenOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetModelsOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetModelsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetModelsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferCardsContentStatusRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferCardsContentStatusResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferMappingEntriesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferMappingsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferMappingsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferMappingsResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferRecommendationsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetOfferRecommendationsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrderBuyerInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrderLabelsDataResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrderResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrdersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrdersStatsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetOrdersStatsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOutletLicensesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOutletResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetOutletsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPriceWithDiscountDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPriceWithVatDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPricesByOfferIdsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetPricesByOfferIdsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetPricesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoAssortmentInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoBestsellerInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoConstraintsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoMechanicsInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromoPromocodeInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromosRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromosResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetPromosResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetQualityRatingDetailsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetQualityRatingRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetQualityRatingResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetQuarantineOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetQuarantineOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetQuarantineOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetRegionWithChildrenResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetRegionsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetReportInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetReturnResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetReturnsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetShipmentOrdersInfoResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetShipmentResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetSuggestedOfferMappingEntriesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetSuggestedOfferMappingEntriesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetSuggestedOfferMappingsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetSuggestedOfferMappingsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetSuggestedOfferMappingsResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetWarehouseStocksDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GetWarehouseStocksRequest)
      propMimeEq MimeJSON (Proxy :: Proxy GetWarehouseStocksResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GetWarehousesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackCommentAuthorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackCommentAuthorType)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackCommentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackCommentListDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackCommentStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackDescriptionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackIdentifiersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackListDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackMediaDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsFeedbackStatisticsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsStatsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsStatsGoodsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsStatsWarehouseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GoodsStatsWeightDimensionsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy GpsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy HiddenOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy LanguageType)
      propMimeEq MimeJSON (Proxy :: Proxy LicenseCheckStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy LicenseType)
      propMimeEq MimeJSON (Proxy :: Proxy LogisticPickupPointDTO)
      propMimeEq MimeJSON (Proxy :: Proxy LogisticPointType)
      propMimeEq MimeJSON (Proxy :: Proxy MappingsOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy MappingsOfferInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy MaxSaleQuantumDTO)
      propMimeEq MimeJSON (Proxy :: Proxy MechanicsType)
      propMimeEq MimeJSON (Proxy :: Proxy ModelDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ModelOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ModelPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ModelsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferAvailabilityStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCampaignStatusDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCampaignStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCardDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCardRecommendationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCardRecommendationType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCardStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferCardsContentStatusDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferConditionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferConditionQualityType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferConditionType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferContentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferContentErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferContentErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferForRecommendationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferManualDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingEntriesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingEntryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingErrorDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingErrorType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingKindType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferMappingSuggestionsListDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferParamDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferPriceByOfferIdsListResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferPriceByOfferIdsResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferPriceListResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferPriceResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferProcessingNoteDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferProcessingNoteType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferProcessingStateDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferProcessingStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferRecommendationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferRecommendationInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferRecommendationsResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferSellingProgramDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OfferSellingProgramStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferType)
      propMimeEq MimeJSON (Proxy :: Proxy OfferWeightDimensionsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OffersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OptionValuesLimitedDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBoxLayoutDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBoxLayoutItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBoxLayoutPartialCountDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBoxesLayoutDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBusinessBuyerDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBusinessDocumentsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBuyerBasicInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBuyerDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBuyerInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderBuyerType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderCancellationReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderCourierDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryAddressDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryDateDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryDateReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryDatesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryDispatchType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryEacType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryPartnerType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDeliveryType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDigitalItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderDocumentStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemDetailDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemInstanceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemInstanceModificationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemInstanceType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemModificationDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemPromoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemSubsidyDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemSubsidyType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemsModificationRequestReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderItemsModificationResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderLabelDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderLiftType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderParcelBoxDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderPaymentMethodType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderPaymentType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderPromoType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderShipmentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStateDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatsStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatusChangeDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatusChangeDeliveryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatusChangeDeliveryDatesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderSubsidyDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderSubsidyType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderSubstatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderTaxSystemType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderTrackDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrderUpdateStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrderVatType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersShipmentInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsCommissionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsCommissionType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsDeliveryRegionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsDetailsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsItemStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsOrderDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsOrderPaymentType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPaymentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPaymentOrderDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPaymentSourceType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPaymentType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsPriceType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsStockType)
      propMimeEq MimeJSON (Proxy :: Proxy OrdersStatsWarehouseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletAddressDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletDeliveryRuleDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletLicenseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletLicensesResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy OutletType)
      propMimeEq MimeJSON (Proxy :: Proxy OutletVisibilityType)
      propMimeEq MimeJSON (Proxy :: Proxy OutletWorkingScheduleDTO)
      propMimeEq MimeJSON (Proxy :: Proxy OutletWorkingScheduleItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PageFormatType)
      propMimeEq MimeJSON (Proxy :: Proxy PagedReturnsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PalletsCountDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParameterType)
      propMimeEq MimeJSON (Proxy :: Proxy ParameterValueConstraintsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParameterValueDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParameterValueOptionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParcelBoxDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParcelBoxLabelDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ParcelDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PartnerShipmentWarehouseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PaymentFrequencyType)
      propMimeEq MimeJSON (Proxy :: Proxy PickupAddressDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PlacementType)
      propMimeEq MimeJSON (Proxy :: Proxy PriceCompetitivenessThresholdsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceCompetitivenessType)
      propMimeEq MimeJSON (Proxy :: Proxy PriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceQuarantineVerdictDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceQuarantineVerdictParamNameType)
      propMimeEq MimeJSON (Proxy :: Proxy PriceQuarantineVerdictParameterDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceQuarantineVerdictType)
      propMimeEq MimeJSON (Proxy :: Proxy PriceRecommendationItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceSuggestDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceSuggestOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PriceSuggestType)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferAutoParticipatingDetailsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferDiscountParamsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferParamsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferParticipationStatusFilterType)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferParticipationStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferPromocodeParamsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferUpdateWarningCodeType)
      propMimeEq MimeJSON (Proxy :: Proxy PromoOfferUpdateWarningDTO)
      propMimeEq MimeJSON (Proxy :: Proxy PromoParticipationType)
      propMimeEq MimeJSON (Proxy :: Proxy PromoPeriodDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ProvideOrderDigitalCodesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ProvideOrderItemIdentifiersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ProvideOrderItemIdentifiersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy PutSkuBidsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy QualityRatingAffectedOrderDTO)
      propMimeEq MimeJSON (Proxy :: Proxy QualityRatingComponentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy QualityRatingComponentType)
      propMimeEq MimeJSON (Proxy :: Proxy QualityRatingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy QualityRatingDetailsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy QuantumDTO)
      propMimeEq MimeJSON (Proxy :: Proxy QuarantineOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy RecipientType)
      propMimeEq MimeJSON (Proxy :: Proxy RefundStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy RegionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy RegionType)
      propMimeEq MimeJSON (Proxy :: Proxy RegionalModelInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy RejectedPromoOfferDeleteDTO)
      propMimeEq MimeJSON (Proxy :: Proxy RejectedPromoOfferDeleteReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy RejectedPromoOfferUpdateDTO)
      propMimeEq MimeJSON (Proxy :: Proxy RejectedPromoOfferUpdateReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy ReportFormatType)
      propMimeEq MimeJSON (Proxy :: Proxy ReportInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ReportStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ReportSubStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnDecisionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnDecisionReasonType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnDecisionSubreasonType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnDecisionType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnInstanceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnInstanceStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnInstanceStockType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnRequestDecisionType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnShipmentStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ReturnType)
      propMimeEq MimeJSON (Proxy :: Proxy ScrollingPagerDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SearchModelsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SearchShipmentsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SearchShipmentsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SearchShipmentsResponseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SellingProgramType)
      propMimeEq MimeJSON (Proxy :: Proxy SendMessageToChatRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetFeedParamsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderBoxLayoutRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderBoxLayoutResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderDeliveryDateRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderDeliveryTrackCodeRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderShipmentBoxesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetOrderShipmentBoxesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SetReturnDecisionRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SetShipmentPalletsCountRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ShelfsStatisticsAttributionType)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentActionType)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentBoxesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentInfoDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentPalletLabelPageFormatType)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentStatusChangeDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentStatusType)
      propMimeEq MimeJSON (Proxy :: Proxy ShipmentType)
      propMimeEq MimeJSON (Proxy :: Proxy ShowsSalesGroupingType)
      propMimeEq MimeJSON (Proxy :: Proxy SkipGoodsFeedbackReactionRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SkuBidItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SkuBidRecommendationItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SortOrderType)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestOfferPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestPricesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestPricesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestPricesResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestedOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy SuggestedOfferMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TariffDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TariffParameterDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TariffType)
      propMimeEq MimeJSON (Proxy :: Proxy TimePeriodDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TimeUnitType)
      propMimeEq MimeJSON (Proxy :: Proxy TrackDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TransferOrdersFromShipmentRequest)
      propMimeEq MimeJSON (Proxy :: Proxy TurnoverDTO)
      propMimeEq MimeJSON (Proxy :: Proxy TurnoverType)
      propMimeEq MimeJSON (Proxy :: Proxy UnitDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateBusinessOfferPriceDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateBusinessPricesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateCampaignOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateCampaignOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateGoodsFeedbackCommentDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateGoodsFeedbackCommentRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateGoodsFeedbackCommentResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateMappingsOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferContentRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferContentResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferContentResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingEntryDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingEntryRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingsRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOfferMappingsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderItemRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStatusesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOrderStorageLimitRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateOutletLicenseRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePriceWithDiscountDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePricesRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOfferDiscountParamsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOfferParamsDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOffersRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOffersResponse)
      propMimeEq MimeJSON (Proxy :: Proxy UpdatePromoOffersResultDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateStockDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateStockItemDTO)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateStocksRequest)
      propMimeEq MimeJSON (Proxy :: Proxy UpdateTimeDTO)
      propMimeEq MimeJSON (Proxy :: Proxy ValueRestrictionDTO)
      propMimeEq MimeJSON (Proxy :: Proxy VerifyOrderEacRequest)
      propMimeEq MimeJSON (Proxy :: Proxy VerifyOrderEacResponse)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseAddressDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseGroupDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseOfferDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseOffersDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseStockDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarehouseStockType)
      propMimeEq MimeJSON (Proxy :: Proxy WarehousesDTO)
      propMimeEq MimeJSON (Proxy :: Proxy WarningPromoOfferUpdateDTO)
      
