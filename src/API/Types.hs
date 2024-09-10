{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module API.Types (
  AcceptOrderCancellationRequest (..),
  AddHiddenOffersRequest (..),
  AddOffersToArchiveDTO (..),
  AddOffersToArchiveErrorDTO (..),
  AddOffersToArchiveErrorType (..),
  AddOffersToArchiveRequest (..),
  AddOffersToArchiveResponse (..),
  AffectedOrderQualityRatingComponentType (..),
  AgeDTO (..),
  AgeUnitType (..),
  ApiClientDataErrorResponse (..),
  ApiErrorDTO (..),
  ApiErrorResponse (..),
  ApiForbiddenErrorResponse (..),
  ApiLimitErrorResponse (..),
  ApiLockedErrorResponse (..),
  ApiNotFoundErrorResponse (..),
  ApiResponse (..),
  ApiResponseStatusType (..),
  ApiServerErrorResponse (..),
  ApiUnauthorizedErrorResponse (..),
  BaseCampaignOfferDTO (..),
  BaseOfferDTO (..),
  BasePriceDTO (..),
  BaseShipmentDTO (..),
  BidRecommendationItemDTO (..),
  BriefOrderItemDTO (..),
  BriefOrderItemInstanceDTO (..),
  BusinessDTO (..),
  BusinessSettingsDTO (..),
  CalculateTariffsOfferDTO (..),
  CalculateTariffsOfferInfoDTO (..),
  CalculateTariffsParametersDTO (..),
  CalculateTariffsRequest (..),
  CalculateTariffsResponse (..),
  CalculateTariffsResponseDTO (..),
  CalculatedTariffDTO (..),
  CalculatedTariffType (..),
  CampaignDTO (..),
  CampaignQualityRatingDTO (..),
  CampaignSettingsDTO (..),
  CampaignSettingsDeliveryDTO (..),
  CampaignSettingsLocalRegionDTO (..),
  CampaignSettingsScheduleDTO (..),
  CampaignSettingsScheduleSourceType (..),
  CampaignSettingsTimePeriodDTO (..),
  CampaignsQualityRatingDTO (..),
  CategoryContentParametersDTO (..),
  CategoryDTO (..),
  CategoryErrorDTO (..),
  CategoryErrorType (..),
  CategoryParameterDTO (..),
  CategoryParameterUnitDTO (..),
  ChangeOutletRequest (..),
  ChannelType (..),
  ChatMessageDTO (..),
  ChatMessagePayloadDTO (..),
  ChatMessageSenderType (..),
  ChatMessagesResultDTO (..),
  ChatStatusType (..),
  ChatType (..),
  ConfirmPricesRequest (..),
  ConfirmShipmentRequest (..),
  CreateChatRequest (..),
  CreateChatResponse (..),
  CreateChatResultDTO (..),
  CreateOutletResponse (..),
  CurrencyType (..),
  DayOfWeekType (..),
  DeleteCampaignOffersDTO (..),
  DeleteCampaignOffersRequest (..),
  DeleteCampaignOffersResponse (..),
  DeleteGoodsFeedbackCommentRequest (..),
  DeleteHiddenOffersRequest (..),
  DeleteOffersDTO (..),
  DeleteOffersFromArchiveDTO (..),
  DeleteOffersFromArchiveRequest (..),
  DeleteOffersFromArchiveResponse (..),
  DeleteOffersRequest (..),
  DeleteOffersResponse (..),
  DeletePromoOffersRequest (..),
  DeletePromoOffersResponse (..),
  DeletePromoOffersResultDTO (..),
  DeliveryServiceDTO (..),
  DeliveryServiceInfoDTO (..),
  DeliveryServicesDTO (..),
  DocumentDTO (..),
  EacVerificationResultDTO (..),
  EacVerificationStatusType (..),
  EmptyApiResponse (..),
  EnrichedMappingsOfferDTO (..),
  EnrichedModelDTO (..),
  EnrichedModelsDTO (..),
  EnrichedOrderBoxLayoutDTO (..),
  ExtensionShipmentDTO (..),
  FeedContentDTO (..),
  FeedContentErrorDTO (..),
  FeedContentErrorType (..),
  FeedDTO (..),
  FeedDownloadDTO (..),
  FeedDownloadErrorDTO (..),
  FeedDownloadErrorType (..),
  FeedIndexLogsErrorDTO (..),
  FeedIndexLogsErrorType (..),
  FeedIndexLogsFeedDTO (..),
  FeedIndexLogsIndexType (..),
  FeedIndexLogsOffersDTO (..),
  FeedIndexLogsRecordDTO (..),
  FeedIndexLogsResultDTO (..),
  FeedIndexLogsStatusType (..),
  FeedParameterDTO (..),
  FeedPlacementDTO (..),
  FeedPublicationDTO (..),
  FeedPublicationFullDTO (..),
  FeedPublicationPriceAndStockUpdateDTO (..),
  FeedStatusType (..),
  FeedbackAuthorDTO (..),
  FeedbackCommentAuthorDTO (..),
  FeedbackCommentAuthorType (..),
  FeedbackCommentDTO (..),
  FeedbackDTO (..),
  FeedbackDeliveryType (..),
  FeedbackFactorDTO (..),
  FeedbackGradesDTO (..),
  FeedbackListDTO (..),
  FeedbackOrderDTO (..),
  FeedbackReactionStatusType (..),
  FeedbackShopDTO (..),
  FeedbackStateType (..),
  FieldStateType (..),
  FlippingPagerDTO (..),
  ForwardScrollingPagerDTO (..),
  FulfillmentWarehouseDTO (..),
  FulfillmentWarehousesDTO (..),
  FullOutletDTO (..),
  FullOutletLicenseDTO (..),
  GenerateBoostConsolidatedRequest (..),
  GenerateCompetitorsPositionReportRequest (..),
  GenerateGoodsFeedbackRequest (..),
  GenerateGoodsMovementReportRequest (..),
  GenerateGoodsRealizationReportRequest (..),
  GenerateGoodsTurnoverRequest (..),
  GenerateMassOrderLabelsRequest (..),
  GeneratePricesReportRequest (..),
  GenerateReportDTO (..),
  GenerateReportResponse (..),
  GenerateShelfsStatisticsRequest (..),
  GenerateShipmentListDocumentReportRequest (..),
  GenerateShowsSalesReportRequest (..),
  GenerateStocksOnWarehousesReportRequest (..),
  GenerateUnitedMarketplaceServicesReportRequest (..),
  GenerateUnitedNettingReportRequest (..),
  GenerateUnitedOrdersRequest (..),
  GetAllOffersResponse (..),
  GetBidsInfoRequest (..),
  GetBidsInfoResponse (..),
  GetBidsInfoResponseDTO (..),
  GetBidsRecommendationsRequest (..),
  GetBidsRecommendationsResponse (..),
  GetBidsRecommendationsResponseDTO (..),
  GetBusinessBuyerInfoResponse (..),
  GetBusinessDocumentsInfoResponse (..),
  GetBusinessSettingsInfoDTO (..),
  GetBusinessSettingsResponse (..),
  GetCampaignLoginsResponse (..),
  GetCampaignOfferDTO (..),
  GetCampaignOffersRequest (..),
  GetCampaignOffersResponse (..),
  GetCampaignOffersResultDTO (..),
  GetCampaignRegionResponse (..),
  GetCampaignResponse (..),
  GetCampaignSettingsResponse (..),
  GetCampaignsResponse (..),
  GetCategoriesMaxSaleQuantumDTO (..),
  GetCategoriesMaxSaleQuantumRequest (..),
  GetCategoriesMaxSaleQuantumResponse (..),
  GetCategoriesRequest (..),
  GetCategoriesResponse (..),
  GetCategoryContentParametersResponse (..),
  GetChatHistoryRequest (..),
  GetChatHistoryResponse (..),
  GetChatInfoDTO (..),
  GetChatsInfoDTO (..),
  GetChatsRequest (..),
  GetChatsResponse (..),
  GetDeliveryServicesResponse (..),
  GetFeedIndexLogsResponse (..),
  GetFeedResponse (..),
  GetFeedbackListResponse (..),
  GetFeedsResponse (..),
  GetFulfillmentWarehousesResponse (..),
  GetGoodsFeedbackCommentsRequest (..),
  GetGoodsFeedbackCommentsResponse (..),
  GetGoodsFeedbackRequest (..),
  GetGoodsFeedbackResponse (..),
  GetGoodsStatsRequest (..),
  GetGoodsStatsResponse (..),
  GetHiddenOffersResponse (..),
  GetHiddenOffersResultDTO (..),
  GetMappingDTO (..),
  GetModelsOffersResponse (..),
  GetModelsRequest (..),
  GetModelsResponse (..),
  GetOfferCardsContentStatusRequest (..),
  GetOfferCardsContentStatusResponse (..),
  GetOfferDTO (..),
  GetOfferMappingDTO (..),
  GetOfferMappingEntriesResponse (..),
  GetOfferMappingsRequest (..),
  GetOfferMappingsResponse (..),
  GetOfferMappingsResultDTO (..),
  GetOfferRecommendationsRequest (..),
  GetOfferRecommendationsResponse (..),
  GetOffersResponse (..),
  GetOrderBuyerInfoResponse (..),
  GetOrderLabelsDataResponse (..),
  GetOrderResponse (..),
  GetOrdersResponse (..),
  GetOrdersStatsRequest (..),
  GetOrdersStatsResponse (..),
  GetOutletLicensesResponse (..),
  GetOutletResponse (..),
  GetOutletsResponse (..),
  GetPriceDTO (..),
  GetPriceWithDiscountDTO (..),
  GetPriceWithVatDTO (..),
  GetPricesByOfferIdsRequest (..),
  GetPricesByOfferIdsResponse (..),
  GetPricesResponse (..),
  GetPromoAssortmentInfoDTO (..),
  GetPromoBestsellerInfoDTO (..),
  GetPromoConstraintsDTO (..),
  GetPromoDTO (..),
  GetPromoMechanicsInfoDTO (..),
  GetPromoOfferDTO (..),
  GetPromoOffersRequest (..),
  GetPromoOffersResponse (..),
  GetPromoOffersResultDTO (..),
  GetPromoPromocodeInfoDTO (..),
  GetPromosRequest (..),
  GetPromosResponse (..),
  GetPromosResultDTO (..),
  GetQualityRatingDetailsResponse (..),
  GetQualityRatingRequest (..),
  GetQualityRatingResponse (..),
  GetQuarantineOffersRequest (..),
  GetQuarantineOffersResponse (..),
  GetQuarantineOffersResultDTO (..),
  GetRegionWithChildrenResponse (..),
  GetRegionsResponse (..),
  GetReportInfoResponse (..),
  GetReturnResponse (..),
  GetReturnsResponse (..),
  GetShipmentOrdersInfoResponse (..),
  GetShipmentResponse (..),
  GetSuggestedOfferMappingEntriesRequest (..),
  GetSuggestedOfferMappingEntriesResponse (..),
  GetSuggestedOfferMappingsRequest (..),
  GetSuggestedOfferMappingsResponse (..),
  GetSuggestedOfferMappingsResultDTO (..),
  GetWarehouseStocksDTO (..),
  GetWarehouseStocksRequest (..),
  GetWarehouseStocksResponse (..),
  GetWarehousesResponse (..),
  GoodsFeedbackCommentAuthorDTO (..),
  GoodsFeedbackCommentAuthorType (..),
  GoodsFeedbackCommentDTO (..),
  GoodsFeedbackCommentListDTO (..),
  GoodsFeedbackCommentStatusType (..),
  GoodsFeedbackDTO (..),
  GoodsFeedbackDescriptionDTO (..),
  GoodsFeedbackIdentifiersDTO (..),
  GoodsFeedbackListDTO (..),
  GoodsFeedbackMediaDTO (..),
  GoodsFeedbackStatisticsDTO (..),
  GoodsStatsDTO (..),
  GoodsStatsGoodsDTO (..),
  GoodsStatsWarehouseDTO (..),
  GoodsStatsWeightDimensionsDTO (..),
  GpsDTO (..),
  HiddenOfferDTO (..),
  LanguageType (..),
  LicenseCheckStatusType (..),
  LicenseType (..),
  LogisticPickupPointDTO (..),
  LogisticPointType (..),
  MappingsOfferDTO (..),
  MappingsOfferInfoDTO (..),
  MaxSaleQuantumDTO (..),
  MechanicsType (..),
  ModelDTO (..),
  ModelOfferDTO (..),
  ModelPriceDTO (..),
  ModelsDTO (..),
  OfferAvailabilityStatusType (..),
  OfferCampaignStatusDTO (..),
  OfferCampaignStatusType (..),
  OfferCardDTO (..),
  OfferCardRecommendationDTO (..),
  OfferCardRecommendationType (..),
  OfferCardStatusType (..),
  OfferCardsContentStatusDTO (..),
  OfferConditionDTO (..),
  OfferConditionQualityType (..),
  OfferConditionType (..),
  OfferContentDTO (..),
  OfferContentErrorDTO (..),
  OfferContentErrorType (..),
  OfferDTO (..),
  OfferErrorDTO (..),
  OfferForRecommendationDTO (..),
  OfferManualDTO (..),
  OfferMappingDTO (..),
  OfferMappingEntriesDTO (..),
  OfferMappingEntryDTO (..),
  OfferMappingErrorDTO (..),
  OfferMappingErrorType (..),
  OfferMappingInfoDTO (..),
  OfferMappingKindType (..),
  OfferMappingSuggestionsListDTO (..),
  OfferParamDTO (..),
  OfferPriceByOfferIdsListResponseDTO (..),
  OfferPriceByOfferIdsResponseDTO (..),
  OfferPriceDTO (..),
  OfferPriceListResponseDTO (..),
  OfferPriceResponseDTO (..),
  OfferProcessingNoteDTO (..),
  OfferProcessingNoteType (..),
  OfferProcessingStateDTO (..),
  OfferProcessingStatusType (..),
  OfferRecommendationDTO (..),
  OfferRecommendationInfoDTO (..),
  OfferRecommendationsResultDTO (..),
  OfferSellingProgramDTO (..),
  OfferSellingProgramStatusType (..),
  OfferType (..),
  OfferWeightDimensionsDTO (..),
  OffersDTO (..),
  OptionValuesLimitedDTO (..),
  OrderBoxLayoutDTO (..),
  OrderBoxLayoutItemDTO (..),
  OrderBoxLayoutPartialCountDTO (..),
  OrderBoxesLayoutDTO (..),
  OrderBusinessBuyerDTO (..),
  OrderBusinessDocumentsDTO (..),
  OrderBuyerBasicInfoDTO (..),
  OrderBuyerDTO (..),
  OrderBuyerInfoDTO (..),
  OrderBuyerType (..),
  OrderCancellationReasonType (..),
  OrderCourierDTO (..),
  OrderDTO (..),
  OrderDeliveryAddressDTO (..),
  OrderDeliveryDTO (..),
  OrderDeliveryDateDTO (..),
  OrderDeliveryDateReasonType (..),
  OrderDeliveryDatesDTO (..),
  OrderDeliveryDispatchType (..),
  OrderDeliveryEacType (..),
  OrderDeliveryPartnerType (..),
  OrderDeliveryType (..),
  OrderDigitalItemDTO (..),
  OrderDocumentStatusType (..),
  OrderItemDTO (..),
  OrderItemDetailDTO (..),
  OrderItemInstanceDTO (..),
  OrderItemInstanceModificationDTO (..),
  OrderItemInstanceType (..),
  OrderItemModificationDTO (..),
  OrderItemPromoDTO (..),
  OrderItemStatusType (..),
  OrderItemSubsidyDTO (..),
  OrderItemSubsidyType (..),
  OrderItemsModificationRequestReasonType (..),
  OrderItemsModificationResultDTO (..),
  OrderLabelDTO (..),
  OrderLiftType (..),
  OrderParcelBoxDTO (..),
  OrderPaymentMethodType (..),
  OrderPaymentType (..),
  OrderPromoType (..),
  OrderShipmentDTO (..),
  OrderStateDTO (..),
  OrderStatsStatusType (..),
  OrderStatusChangeDTO (..),
  OrderStatusChangeDeliveryDTO (..),
  OrderStatusChangeDeliveryDatesDTO (..),
  OrderStatusType (..),
  OrderSubsidyDTO (..),
  OrderSubsidyType (..),
  OrderSubstatusType (..),
  OrderTaxSystemType (..),
  OrderTrackDTO (..),
  OrderUpdateStatusType (..),
  OrderVatType (..),
  OrdersShipmentInfoDTO (..),
  OrdersStatsCommissionDTO (..),
  OrdersStatsCommissionType (..),
  OrdersStatsDTO (..),
  OrdersStatsDeliveryRegionDTO (..),
  OrdersStatsDetailsDTO (..),
  OrdersStatsItemDTO (..),
  OrdersStatsItemStatusType (..),
  OrdersStatsOrderDTO (..),
  OrdersStatsOrderPaymentType (..),
  OrdersStatsPaymentDTO (..),
  OrdersStatsPaymentOrderDTO (..),
  OrdersStatsPaymentSourceType (..),
  OrdersStatsPaymentType (..),
  OrdersStatsPriceDTO (..),
  OrdersStatsPriceType (..),
  OrdersStatsStockType (..),
  OrdersStatsWarehouseDTO (..),
  OutletAddressDTO (..),
  OutletDTO (..),
  OutletDeliveryRuleDTO (..),
  OutletLicenseDTO (..),
  OutletLicensesResponseDTO (..),
  OutletResponseDTO (..),
  OutletStatusType (..),
  OutletType (..),
  OutletVisibilityType (..),
  OutletWorkingScheduleDTO (..),
  OutletWorkingScheduleItemDTO (..),
  PageFormatType (..),
  PagedReturnsDTO (..),
  PalletsCountDTO (..),
  ParameterType (..),
  ParameterValueConstraintsDTO (..),
  ParameterValueDTO (..),
  ParameterValueOptionDTO (..),
  ParcelBoxDTO (..),
  ParcelBoxLabelDTO (..),
  ParcelDTO (..),
  PartnerShipmentWarehouseDTO (..),
  PaymentFrequencyType (..),
  PickupAddressDTO (..),
  PlacementType (..),
  PriceCompetitivenessThresholdsDTO (..),
  PriceCompetitivenessType (..),
  PriceDTO (..),
  PriceQuarantineVerdictDTO (..),
  PriceQuarantineVerdictParamNameType (..),
  PriceQuarantineVerdictParameterDTO (..),
  PriceQuarantineVerdictType (..),
  PriceRecommendationItemDTO (..),
  PriceSuggestDTO (..),
  PriceSuggestOfferDTO (..),
  PriceSuggestType (..),
  PromoOfferAutoParticipatingDetailsDTO (..),
  PromoOfferDiscountParamsDTO (..),
  PromoOfferParamsDTO (..),
  PromoOfferParticipationStatusFilterType (..),
  PromoOfferParticipationStatusType (..),
  PromoOfferPromocodeParamsDTO (..),
  PromoOfferUpdateWarningCodeType (..),
  PromoOfferUpdateWarningDTO (..),
  PromoParticipationType (..),
  PromoPeriodDTO (..),
  ProvideOrderDigitalCodesRequest (..),
  ProvideOrderItemIdentifiersRequest (..),
  ProvideOrderItemIdentifiersResponse (..),
  PutSkuBidsRequest (..),
  QualityRatingAffectedOrderDTO (..),
  QualityRatingComponentDTO (..),
  QualityRatingComponentType (..),
  QualityRatingDTO (..),
  QualityRatingDetailsDTO (..),
  QuantumDTO (..),
  QuarantineOfferDTO (..),
  RecipientType (..),
  RefundStatusType (..),
  RegionDTO (..),
  RegionType (..),
  RegionalModelInfoDTO (..),
  RejectedPromoOfferDeleteDTO (..),
  RejectedPromoOfferDeleteReasonType (..),
  RejectedPromoOfferUpdateDTO (..),
  RejectedPromoOfferUpdateReasonType (..),
  ReportFormatType (..),
  ReportInfoDTO (..),
  ReportStatusType (..),
  ReportSubStatusType (..),
  ReturnDTO (..),
  ReturnDecisionDTO (..),
  ReturnDecisionReasonType (..),
  ReturnDecisionSubreasonType (..),
  ReturnDecisionType (..),
  ReturnInstanceDTO (..),
  ReturnInstanceStatusType (..),
  ReturnInstanceStockType (..),
  ReturnItemDTO (..),
  ReturnRequestDecisionType (..),
  ReturnShipmentStatusType (..),
  ReturnType (..),
  ScrollingPagerDTO (..),
  SearchModelsResponse (..),
  SearchShipmentsRequest (..),
  SearchShipmentsResponse (..),
  SearchShipmentsResponseDTO (..),
  SellingProgramType (..),
  SendMessageToChatRequest (..),
  SetFeedParamsRequest (..),
  SetOrderBoxLayoutRequest (..),
  SetOrderBoxLayoutResponse (..),
  SetOrderDeliveryDateRequest (..),
  SetOrderDeliveryTrackCodeRequest (..),
  SetOrderShipmentBoxesRequest (..),
  SetOrderShipmentBoxesResponse (..),
  SetReturnDecisionRequest (..),
  SetShipmentPalletsCountRequest (..),
  ShelfsStatisticsAttributionType (..),
  ShipmentActionType (..),
  ShipmentBoxesDTO (..),
  ShipmentDTO (..),
  ShipmentInfoDTO (..),
  ShipmentPalletLabelPageFormatType (..),
  ShipmentStatusChangeDTO (..),
  ShipmentStatusType (..),
  ShipmentType (..),
  ShowsSalesGroupingType (..),
  SkipGoodsFeedbackReactionRequest (..),
  SkuBidItemDTO (..),
  SkuBidRecommendationItemDTO (..),
  SortOrderType (..),
  SuggestOfferPriceDTO (..),
  SuggestPricesRequest (..),
  SuggestPricesResponse (..),
  SuggestPricesResultDTO (..),
  SuggestedOfferDTO (..),
  SuggestedOfferMappingDTO (..),
  TariffDTO (..),
  TariffParameterDTO (..),
  TariffType (..),
  TimePeriodDTO (..),
  TimeUnitType (..),
  TrackDTO (..),
  TransferOrdersFromShipmentRequest (..),
  TurnoverDTO (..),
  TurnoverType (..),
  UnitDTO (..),
  UpdateBusinessOfferPriceDTO (..),
  UpdateBusinessPricesRequest (..),
  UpdateCampaignOfferDTO (..),
  UpdateCampaignOffersRequest (..),
  UpdateGoodsFeedbackCommentDTO (..),
  UpdateGoodsFeedbackCommentRequest (..),
  UpdateGoodsFeedbackCommentResponse (..),
  UpdateMappingDTO (..),
  UpdateMappingsOfferDTO (..),
  UpdateOfferContentRequest (..),
  UpdateOfferContentResponse (..),
  UpdateOfferContentResultDTO (..),
  UpdateOfferDTO (..),
  UpdateOfferMappingDTO (..),
  UpdateOfferMappingEntryDTO (..),
  UpdateOfferMappingEntryRequest (..),
  UpdateOfferMappingResultDTO (..),
  UpdateOfferMappingsRequest (..),
  UpdateOfferMappingsResponse (..),
  UpdateOrderItemRequest (..),
  UpdateOrderStatusDTO (..),
  UpdateOrderStatusRequest (..),
  UpdateOrderStatusResponse (..),
  UpdateOrderStatusesDTO (..),
  UpdateOrderStatusesRequest (..),
  UpdateOrderStatusesResponse (..),
  UpdateOrderStorageLimitRequest (..),
  UpdateOutletLicenseRequest (..),
  UpdatePriceWithDiscountDTO (..),
  UpdatePricesRequest (..),
  UpdatePromoOfferDTO (..),
  UpdatePromoOfferDiscountParamsDTO (..),
  UpdatePromoOfferParamsDTO (..),
  UpdatePromoOffersRequest (..),
  UpdatePromoOffersResponse (..),
  UpdatePromoOffersResultDTO (..),
  UpdateStockDTO (..),
  UpdateStockItemDTO (..),
  UpdateStocksRequest (..),
  UpdateTimeDTO (..),
  ValueRestrictionDTO (..),
  VerifyOrderEacRequest (..),
  VerifyOrderEacResponse (..),
  WarehouseAddressDTO (..),
  WarehouseDTO (..),
  WarehouseGroupDTO (..),
  WarehouseOfferDTO (..),
  WarehouseOffersDTO (..),
  WarehouseStockDTO (..),
  WarehouseStockType (..),
  WarehousesDTO (..),
  WarningPromoOfferUpdateDTO (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data AcceptOrderCancellationRequest = AcceptOrderCancellationRequest
  { acceptOrderCancellationRequestAccepted :: Bool -- ^ Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
  , acceptOrderCancellationRequestReason :: Maybe OrderCancellationReasonType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AcceptOrderCancellationRequest where
  parseJSON = genericParseJSON optionsAcceptOrderCancellationRequest
instance ToJSON AcceptOrderCancellationRequest where
  toJSON = genericToJSON optionsAcceptOrderCancellationRequest

optionsAcceptOrderCancellationRequest :: Options
optionsAcceptOrderCancellationRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("acceptOrderCancellationRequestAccepted", "accepted")
      , ("acceptOrderCancellationRequestReason", "reason")
      ]


-- | Запрос на скрытие оферов.
data AddHiddenOffersRequest = AddHiddenOffersRequest
  { addHiddenOffersRequestHiddenOffers :: [HiddenOfferDTO] -- ^ Список скрытых товаров. 
  } deriving (Show, Eq, Generic)

instance FromJSON AddHiddenOffersRequest where
  parseJSON = genericParseJSON optionsAddHiddenOffersRequest
instance ToJSON AddHiddenOffersRequest where
  toJSON = genericToJSON optionsAddHiddenOffersRequest

optionsAddHiddenOffersRequest :: Options
optionsAddHiddenOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("addHiddenOffersRequestHiddenOffers", "hiddenOffers")
      ]


-- | Товары, которые не удалось поместить в архив.
data AddOffersToArchiveDTO = AddOffersToArchiveDTO
  { addOffersToArchiveDTONotArchivedOffers :: Maybe [AddOffersToArchiveErrorDTO] -- ^ Список товаров, которые не удалось поместить в архив.
  } deriving (Show, Eq, Generic)

instance FromJSON AddOffersToArchiveDTO where
  parseJSON = genericParseJSON optionsAddOffersToArchiveDTO
instance ToJSON AddOffersToArchiveDTO where
  toJSON = genericToJSON optionsAddOffersToArchiveDTO

optionsAddOffersToArchiveDTO :: Options
optionsAddOffersToArchiveDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("addOffersToArchiveDTONotArchivedOffers", "notArchivedOffers")
      ]


-- | Товар, который не удалось поместить в архив.
data AddOffersToArchiveErrorDTO = AddOffersToArchiveErrorDTO
  { addOffersToArchiveErrorDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , addOffersToArchiveErrorDTOError :: AddOffersToArchiveErrorType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AddOffersToArchiveErrorDTO where
  parseJSON = genericParseJSON optionsAddOffersToArchiveErrorDTO
instance ToJSON AddOffersToArchiveErrorDTO where
  toJSON = genericToJSON optionsAddOffersToArchiveErrorDTO

optionsAddOffersToArchiveErrorDTO :: Options
optionsAddOffersToArchiveErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("addOffersToArchiveErrorDTOOfferId", "offerId")
      , ("addOffersToArchiveErrorDTOError", "error")
      ]


-- | Причина, по которой товар не удалось поместить в архив:  * &#x60;OFFER_HAS_STOCKS&#x60; — товар хранится на складе Маркета. 
data AddOffersToArchiveErrorType = AddOffersToArchiveErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AddOffersToArchiveErrorType where
  parseJSON = genericParseJSON optionsAddOffersToArchiveErrorType
instance ToJSON AddOffersToArchiveErrorType where
  toJSON = genericToJSON optionsAddOffersToArchiveErrorType

optionsAddOffersToArchiveErrorType :: Options
optionsAddOffersToArchiveErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Товары, которые нужно поместить в архив. 
data AddOffersToArchiveRequest = AddOffersToArchiveRequest
  { addOffersToArchiveRequestOfferIds :: [Text] -- ^ Список товаров, которые нужно поместить в архив.
  } deriving (Show, Eq, Generic)

instance FromJSON AddOffersToArchiveRequest where
  parseJSON = genericParseJSON optionsAddOffersToArchiveRequest
instance ToJSON AddOffersToArchiveRequest where
  toJSON = genericToJSON optionsAddOffersToArchiveRequest

optionsAddOffersToArchiveRequest :: Options
optionsAddOffersToArchiveRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("addOffersToArchiveRequestOfferIds", "offerIds")
      ]


-- | Результат архивации товаров.
data AddOffersToArchiveResponse = AddOffersToArchiveResponse
  { addOffersToArchiveResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , addOffersToArchiveResponseResult :: Maybe AddOffersToArchiveDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AddOffersToArchiveResponse where
  parseJSON = genericParseJSON optionsAddOffersToArchiveResponse
instance ToJSON AddOffersToArchiveResponse where
  toJSON = genericToJSON optionsAddOffersToArchiveResponse

optionsAddOffersToArchiveResponse :: Options
optionsAddOffersToArchiveResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("addOffersToArchiveResponseStatus", "status")
      , ("addOffersToArchiveResponseResult", "result")
      ]


-- | Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
data AffectedOrderQualityRatingComponentType = AffectedOrderQualityRatingComponentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AffectedOrderQualityRatingComponentType where
  parseJSON = genericParseJSON optionsAffectedOrderQualityRatingComponentType
instance ToJSON AffectedOrderQualityRatingComponentType where
  toJSON = genericToJSON optionsAffectedOrderQualityRatingComponentType

optionsAffectedOrderQualityRatingComponentType :: Options
optionsAffectedOrderQualityRatingComponentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Возраст в заданных единицах измерения.
data AgeDTO = AgeDTO
  { ageDTOValue :: Double -- ^ Значение. 
  , ageDTOAgeUnit :: AgeUnitType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AgeDTO where
  parseJSON = genericParseJSON optionsAgeDTO
instance ToJSON AgeDTO where
  toJSON = genericToJSON optionsAgeDTO

optionsAgeDTO :: Options
optionsAgeDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ageDTOValue", "value")
      , ("ageDTOAgeUnit", "ageUnit")
      ]


-- | Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
data AgeUnitType = AgeUnitType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AgeUnitType where
  parseJSON = genericParseJSON optionsAgeUnitType
instance ToJSON AgeUnitType where
  toJSON = genericToJSON optionsAgeUnitType

optionsAgeUnitType :: Options
optionsAgeUnitType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ошибка в данных переданных от клиента.
data ApiClientDataErrorResponse = ApiClientDataErrorResponse
  { apiClientDataErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiClientDataErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiClientDataErrorResponse where
  parseJSON = genericParseJSON optionsApiClientDataErrorResponse
instance ToJSON ApiClientDataErrorResponse where
  toJSON = genericToJSON optionsApiClientDataErrorResponse

optionsApiClientDataErrorResponse :: Options
optionsApiClientDataErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiClientDataErrorResponseStatus", "status")
      , ("apiClientDataErrorResponseErrors", "errors")
      ]


-- | Общий формат ошибки.
data ApiErrorDTO = ApiErrorDTO
  { apiErrorDTOCode :: Text -- ^ Код ошибки.
  , apiErrorDTOMessage :: Maybe Text -- ^ Описание ошибки.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiErrorDTO where
  parseJSON = genericParseJSON optionsApiErrorDTO
instance ToJSON ApiErrorDTO where
  toJSON = genericToJSON optionsApiErrorDTO

optionsApiErrorDTO :: Options
optionsApiErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiErrorDTOCode", "code")
      , ("apiErrorDTOMessage", "message")
      ]


-- | Стандартная обертка для ошибок сервера.
data ApiErrorResponse = ApiErrorResponse
  { apiErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiErrorResponse where
  parseJSON = genericParseJSON optionsApiErrorResponse
instance ToJSON ApiErrorResponse where
  toJSON = genericToJSON optionsApiErrorResponse

optionsApiErrorResponse :: Options
optionsApiErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiErrorResponseStatus", "status")
      , ("apiErrorResponseErrors", "errors")
      ]


-- | Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
data ApiForbiddenErrorResponse = ApiForbiddenErrorResponse
  { apiForbiddenErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiForbiddenErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiForbiddenErrorResponse where
  parseJSON = genericParseJSON optionsApiForbiddenErrorResponse
instance ToJSON ApiForbiddenErrorResponse where
  toJSON = genericToJSON optionsApiForbiddenErrorResponse

optionsApiForbiddenErrorResponse :: Options
optionsApiForbiddenErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiForbiddenErrorResponseStatus", "status")
      , ("apiForbiddenErrorResponseErrors", "errors")
      ]


-- | Превышено ограничение на доступ к ресурсу.
data ApiLimitErrorResponse = ApiLimitErrorResponse
  { apiLimitErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiLimitErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiLimitErrorResponse where
  parseJSON = genericParseJSON optionsApiLimitErrorResponse
instance ToJSON ApiLimitErrorResponse where
  toJSON = genericToJSON optionsApiLimitErrorResponse

optionsApiLimitErrorResponse :: Options
optionsApiLimitErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiLimitErrorResponseStatus", "status")
      , ("apiLimitErrorResponseErrors", "errors")
      ]


-- | Ресурс из запроса заблокирован от применения к нему указанного метода.
data ApiLockedErrorResponse = ApiLockedErrorResponse
  { apiLockedErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiLockedErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiLockedErrorResponse where
  parseJSON = genericParseJSON optionsApiLockedErrorResponse
instance ToJSON ApiLockedErrorResponse where
  toJSON = genericToJSON optionsApiLockedErrorResponse

optionsApiLockedErrorResponse :: Options
optionsApiLockedErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiLockedErrorResponseStatus", "status")
      , ("apiLockedErrorResponseErrors", "errors")
      ]


-- | Запрашиваемый ресурс не найден.
data ApiNotFoundErrorResponse = ApiNotFoundErrorResponse
  { apiNotFoundErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiNotFoundErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiNotFoundErrorResponse where
  parseJSON = genericParseJSON optionsApiNotFoundErrorResponse
instance ToJSON ApiNotFoundErrorResponse where
  toJSON = genericToJSON optionsApiNotFoundErrorResponse

optionsApiNotFoundErrorResponse :: Options
optionsApiNotFoundErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiNotFoundErrorResponseStatus", "status")
      , ("apiNotFoundErrorResponseErrors", "errors")
      ]


-- | Стандартная обертка для ответов сервера.
data ApiResponse = ApiResponse
  { apiResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ApiResponse where
  parseJSON = genericParseJSON optionsApiResponse
instance ToJSON ApiResponse where
  toJSON = genericToJSON optionsApiResponse

optionsApiResponse :: Options
optionsApiResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiResponseStatus", "status")
      ]


-- | Тип ответа.
data ApiResponseStatusType = ApiResponseStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ApiResponseStatusType where
  parseJSON = genericParseJSON optionsApiResponseStatusType
instance ToJSON ApiResponseStatusType where
  toJSON = genericToJSON optionsApiResponseStatusType

optionsApiResponseStatusType :: Options
optionsApiResponseStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Внутренняя ошибка сервера.
data ApiServerErrorResponse = ApiServerErrorResponse
  { apiServerErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiServerErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiServerErrorResponse where
  parseJSON = genericParseJSON optionsApiServerErrorResponse
instance ToJSON ApiServerErrorResponse where
  toJSON = genericToJSON optionsApiServerErrorResponse

optionsApiServerErrorResponse :: Options
optionsApiServerErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiServerErrorResponseStatus", "status")
      , ("apiServerErrorResponseErrors", "errors")
      ]


-- | В запросе не указаны авторизационные данные.
data ApiUnauthorizedErrorResponse = ApiUnauthorizedErrorResponse
  { apiUnauthorizedErrorResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , apiUnauthorizedErrorResponseErrors :: Maybe [ApiErrorDTO] -- ^ Список ошибок.
  } deriving (Show, Eq, Generic)

instance FromJSON ApiUnauthorizedErrorResponse where
  parseJSON = genericParseJSON optionsApiUnauthorizedErrorResponse
instance ToJSON ApiUnauthorizedErrorResponse where
  toJSON = genericToJSON optionsApiUnauthorizedErrorResponse

optionsApiUnauthorizedErrorResponse :: Options
optionsApiUnauthorizedErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiUnauthorizedErrorResponseStatus", "status")
      , ("apiUnauthorizedErrorResponseErrors", "errors")
      ]


-- | Информация о новой цене на товар.
data BaseCampaignOfferDTO = BaseCampaignOfferDTO
  { baseCampaignOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , baseCampaignOfferDTOQuantum :: Maybe QuantumDTO -- ^ 
  , baseCampaignOfferDTOAvailable :: Maybe Bool -- ^ Есть ли товар в продаже. 
  } deriving (Show, Eq, Generic)

instance FromJSON BaseCampaignOfferDTO where
  parseJSON = genericParseJSON optionsBaseCampaignOfferDTO
instance ToJSON BaseCampaignOfferDTO where
  toJSON = genericToJSON optionsBaseCampaignOfferDTO

optionsBaseCampaignOfferDTO :: Options
optionsBaseCampaignOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("baseCampaignOfferDTOOfferId", "offerId")
      , ("baseCampaignOfferDTOQuantum", "quantum")
      , ("baseCampaignOfferDTOAvailable", "available")
      ]


-- | Основные параметры товара.
data BaseOfferDTO = BaseOfferDTO
  { baseOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , baseOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , baseOfferDTOMarketCategoryId :: Maybe Int64 -- ^ Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  , baseOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , baseOfferDTOPictures :: Maybe [Text] -- ^ Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  , baseOfferDTOVideos :: Maybe [Text] -- ^ Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  , baseOfferDTOManuals :: Maybe [OfferManualDTO] -- ^ Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
  , baseOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , baseOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , baseOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , baseOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  , baseOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , baseOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , baseOfferDTOTags :: Maybe [Text] -- ^ Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  , baseOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , baseOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , baseOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , baseOfferDTOCustomsCommodityCode :: Maybe Text -- ^ Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  , baseOfferDTOCertificates :: Maybe [Text] -- ^ Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  , baseOfferDTOBoxCount :: Maybe Int -- ^ Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  , baseOfferDTOCondition :: Maybe OfferConditionDTO -- ^ 
  , baseOfferDTOType :: Maybe OfferType -- ^ 
  , baseOfferDTODownloadable :: Maybe Bool -- ^ Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  , baseOfferDTOAdult :: Maybe Bool -- ^ Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  , baseOfferDTOAge :: Maybe AgeDTO -- ^ 
  , baseOfferDTOParams :: Maybe [OfferParamDTO] -- ^ {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  } deriving (Show, Eq, Generic)

instance FromJSON BaseOfferDTO where
  parseJSON = genericParseJSON optionsBaseOfferDTO
instance ToJSON BaseOfferDTO where
  toJSON = genericToJSON optionsBaseOfferDTO

optionsBaseOfferDTO :: Options
optionsBaseOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("baseOfferDTOOfferId", "offerId")
      , ("baseOfferDTOName", "name")
      , ("baseOfferDTOMarketCategoryId", "marketCategoryId")
      , ("baseOfferDTOCategory", "category")
      , ("baseOfferDTOPictures", "pictures")
      , ("baseOfferDTOVideos", "videos")
      , ("baseOfferDTOManuals", "manuals")
      , ("baseOfferDTOVendor", "vendor")
      , ("baseOfferDTOBarcodes", "barcodes")
      , ("baseOfferDTODescription", "description")
      , ("baseOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("baseOfferDTOWeightDimensions", "weightDimensions")
      , ("baseOfferDTOVendorCode", "vendorCode")
      , ("baseOfferDTOTags", "tags")
      , ("baseOfferDTOShelfLife", "shelfLife")
      , ("baseOfferDTOLifeTime", "lifeTime")
      , ("baseOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("baseOfferDTOCustomsCommodityCode", "customsCommodityCode")
      , ("baseOfferDTOCertificates", "certificates")
      , ("baseOfferDTOBoxCount", "boxCount")
      , ("baseOfferDTOCondition", "condition")
      , ("baseOfferDTOType", "type")
      , ("baseOfferDTODownloadable", "downloadable")
      , ("baseOfferDTOAdult", "adult")
      , ("baseOfferDTOAge", "age")
      , ("baseOfferDTOParams", "params")
      ]


-- | Цена на товар.
data BasePriceDTO = BasePriceDTO
  { basePriceDTOValue :: Double -- ^ Значение.
  , basePriceDTOCurrencyId :: CurrencyType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BasePriceDTO where
  parseJSON = genericParseJSON optionsBasePriceDTO
instance ToJSON BasePriceDTO where
  toJSON = genericToJSON optionsBasePriceDTO

optionsBasePriceDTO :: Options
optionsBasePriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("basePriceDTOValue", "value")
      , ("basePriceDTOCurrencyId", "currencyId")
      ]


-- | Информация об отгрузке.
data BaseShipmentDTO = BaseShipmentDTO
  { baseShipmentDTOId :: Maybe Int64 -- ^ Идентификатор отгрузки.
  , baseShipmentDTOPlanIntervalFrom :: Maybe UTCTime -- ^ Начало планового интервала отгрузки.
  , baseShipmentDTOPlanIntervalTo :: Maybe UTCTime -- ^ Конец планового интервала отгрузки.
  , baseShipmentDTOShipmentType :: Maybe ShipmentType -- ^ 
  , baseShipmentDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , baseShipmentDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , baseShipmentDTOExternalId :: Maybe Text -- ^ Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  , baseShipmentDTODeliveryService :: Maybe DeliveryServiceDTO -- ^ 
  , baseShipmentDTOPalletsCount :: Maybe PalletsCountDTO -- ^ 
  , baseShipmentDTOOrderIds :: [Int64] -- ^ Идентификаторы заказов в отгрузке.
  , baseShipmentDTODraftCount :: Maybe Int -- ^ Количество заказов, которое Маркет запланировал к отгрузке.
  , baseShipmentDTOPlannedCount :: Maybe Int -- ^ Количество заказов, которое Маркет подтвердил к отгрузке.
  , baseShipmentDTOFactCount :: Maybe Int -- ^ Количество заказов, принятых в сортировочном центре или пункте приема.
  } deriving (Show, Eq, Generic)

instance FromJSON BaseShipmentDTO where
  parseJSON = genericParseJSON optionsBaseShipmentDTO
instance ToJSON BaseShipmentDTO where
  toJSON = genericToJSON optionsBaseShipmentDTO

optionsBaseShipmentDTO :: Options
optionsBaseShipmentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("baseShipmentDTOId", "id")
      , ("baseShipmentDTOPlanIntervalFrom", "planIntervalFrom")
      , ("baseShipmentDTOPlanIntervalTo", "planIntervalTo")
      , ("baseShipmentDTOShipmentType", "shipmentType")
      , ("baseShipmentDTOWarehouse", "warehouse")
      , ("baseShipmentDTOWarehouseTo", "warehouseTo")
      , ("baseShipmentDTOExternalId", "externalId")
      , ("baseShipmentDTODeliveryService", "deliveryService")
      , ("baseShipmentDTOPalletsCount", "palletsCount")
      , ("baseShipmentDTOOrderIds", "orderIds")
      , ("baseShipmentDTODraftCount", "draftCount")
      , ("baseShipmentDTOPlannedCount", "plannedCount")
      , ("baseShipmentDTOFactCount", "factCount")
      ]


-- | Рекомендованная ставка и возможная доля показов.
data BidRecommendationItemDTO = BidRecommendationItemDTO
  { bidRecommendationItemDTOBid :: Int -- ^ Значение ставки.
  , bidRecommendationItemDTOShowPercent :: Int64 -- ^ Доля показов. 
  } deriving (Show, Eq, Generic)

instance FromJSON BidRecommendationItemDTO where
  parseJSON = genericParseJSON optionsBidRecommendationItemDTO
instance ToJSON BidRecommendationItemDTO where
  toJSON = genericToJSON optionsBidRecommendationItemDTO

optionsBidRecommendationItemDTO :: Options
optionsBidRecommendationItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("bidRecommendationItemDTOBid", "bid")
      , ("bidRecommendationItemDTOShowPercent", "showPercent")
      ]


-- | Информация о маркированном товаре.
data BriefOrderItemDTO = BriefOrderItemDTO
  { briefOrderItemDTOId :: Maybe Int64 -- ^ Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  , briefOrderItemDTOVat :: Maybe OrderVatType -- ^ 
  , briefOrderItemDTOCount :: Maybe Int -- ^ Количество единиц товара.
  , briefOrderItemDTOPrice :: Maybe Double -- ^ Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
  , briefOrderItemDTOOfferName :: Maybe Text -- ^ Название товара.
  , briefOrderItemDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , briefOrderItemDTOInstances :: Maybe [OrderItemInstanceDTO] -- ^ Переданные вами коды маркировки.
  } deriving (Show, Eq, Generic)

instance FromJSON BriefOrderItemDTO where
  parseJSON = genericParseJSON optionsBriefOrderItemDTO
instance ToJSON BriefOrderItemDTO where
  toJSON = genericToJSON optionsBriefOrderItemDTO

optionsBriefOrderItemDTO :: Options
optionsBriefOrderItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("briefOrderItemDTOId", "id")
      , ("briefOrderItemDTOVat", "vat")
      , ("briefOrderItemDTOCount", "count")
      , ("briefOrderItemDTOPrice", "price")
      , ("briefOrderItemDTOOfferName", "offerName")
      , ("briefOrderItemDTOOfferId", "offerId")
      , ("briefOrderItemDTOInstances", "instances")
      ]


-- | Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 
data BriefOrderItemInstanceDTO = BriefOrderItemInstanceDTO
  { briefOrderItemInstanceDTOCis :: Maybe Text -- ^ Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя `\\u001d`!  ✅ `01030410947874432155Qbag!\\u001d93Zjqw`  ❌ `01030410947874432155Qbag!\\\\u001d93Zjqw`  Косые черты и кавычки в других местах экранируйте по правилам JSON: `\\\\` и `\\\"`  {% endnote %} 
  , briefOrderItemInstanceDTOUin :: Maybe Text -- ^ Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр. 
  , briefOrderItemInstanceDTORnpt :: Maybe Text -- ^ Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
  , briefOrderItemInstanceDTOGtd :: Maybe Text -- ^ Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
  } deriving (Show, Eq, Generic)

instance FromJSON BriefOrderItemInstanceDTO where
  parseJSON = genericParseJSON optionsBriefOrderItemInstanceDTO
instance ToJSON BriefOrderItemInstanceDTO where
  toJSON = genericToJSON optionsBriefOrderItemInstanceDTO

optionsBriefOrderItemInstanceDTO :: Options
optionsBriefOrderItemInstanceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("briefOrderItemInstanceDTOCis", "cis")
      , ("briefOrderItemInstanceDTOUin", "uin")
      , ("briefOrderItemInstanceDTORnpt", "rnpt")
      , ("briefOrderItemInstanceDTOGtd", "gtd")
      ]


-- | Информация о кабинете.
data BusinessDTO = BusinessDTO
  { businessDTOId :: Maybe Int64 -- ^ Идентификатор кабинета.
  , businessDTOName :: Maybe Text -- ^ Название бизнеса.
  } deriving (Show, Eq, Generic)

instance FromJSON BusinessDTO where
  parseJSON = genericParseJSON optionsBusinessDTO
instance ToJSON BusinessDTO where
  toJSON = genericToJSON optionsBusinessDTO

optionsBusinessDTO :: Options
optionsBusinessDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("businessDTOId", "id")
      , ("businessDTOName", "name")
      ]


-- | Настройки кабинета.
data BusinessSettingsDTO = BusinessSettingsDTO
  { businessSettingsDTOOnlyDefaultPrice :: Maybe Bool -- ^ Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену. 
  , businessSettingsDTOCurrency :: Maybe CurrencyType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BusinessSettingsDTO where
  parseJSON = genericParseJSON optionsBusinessSettingsDTO
instance ToJSON BusinessSettingsDTO where
  toJSON = genericToJSON optionsBusinessSettingsDTO

optionsBusinessSettingsDTO :: Options
optionsBusinessSettingsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("businessSettingsDTOOnlyDefaultPrice", "onlyDefaultPrice")
      , ("businessSettingsDTOCurrency", "currency")
      ]


-- | Параметры товара, для которого нужно рассчитать стоимость услуг.
data CalculateTariffsOfferDTO = CalculateTariffsOfferDTO
  { calculateTariffsOfferDTOCategoryId :: Int64 -- ^ Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  , calculateTariffsOfferDTOPrice :: Double -- ^ Цена на товар в рублях.
  , calculateTariffsOfferDTOLength :: Double -- ^ Длина товара в сантиметрах.
  , calculateTariffsOfferDTOWidth :: Double -- ^ Ширина товара в сантиметрах.
  , calculateTariffsOfferDTOHeight :: Double -- ^ Высота товара в сантиметрах.
  , calculateTariffsOfferDTOWeight :: Double -- ^ Вес товара в килограммах.
  , calculateTariffsOfferDTOQuantity :: Maybe Int -- ^ Квант продажи — количество единиц товара в одном товарном предложении.
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsOfferDTO where
  parseJSON = genericParseJSON optionsCalculateTariffsOfferDTO
instance ToJSON CalculateTariffsOfferDTO where
  toJSON = genericToJSON optionsCalculateTariffsOfferDTO

optionsCalculateTariffsOfferDTO :: Options
optionsCalculateTariffsOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsOfferDTOCategoryId", "categoryId")
      , ("calculateTariffsOfferDTOPrice", "price")
      , ("calculateTariffsOfferDTOLength", "length")
      , ("calculateTariffsOfferDTOWidth", "width")
      , ("calculateTariffsOfferDTOHeight", "height")
      , ("calculateTariffsOfferDTOWeight", "weight")
      , ("calculateTariffsOfferDTOQuantity", "quantity")
      ]


-- | Стоимость услуг.
data CalculateTariffsOfferInfoDTO = CalculateTariffsOfferInfoDTO
  { calculateTariffsOfferInfoDTOOffer :: CalculateTariffsOfferDTO -- ^ 
  , calculateTariffsOfferInfoDTOTariffs :: [CalculatedTariffDTO] -- ^ Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsOfferInfoDTO where
  parseJSON = genericParseJSON optionsCalculateTariffsOfferInfoDTO
instance ToJSON CalculateTariffsOfferInfoDTO where
  toJSON = genericToJSON optionsCalculateTariffsOfferInfoDTO

optionsCalculateTariffsOfferInfoDTO :: Options
optionsCalculateTariffsOfferInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsOfferInfoDTOOffer", "offer")
      , ("calculateTariffsOfferInfoDTOTariffs", "tariffs")
      ]


-- | Параметры для расчета стоимости услуг.
data CalculateTariffsParametersDTO = CalculateTariffsParametersDTO
  { calculateTariffsParametersDTOCampaignId :: Maybe Int64 -- ^ Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
  , calculateTariffsParametersDTOSellingProgram :: Maybe SellingProgramType -- ^ 
  , calculateTariffsParametersDTOFrequency :: Maybe PaymentFrequencyType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsParametersDTO where
  parseJSON = genericParseJSON optionsCalculateTariffsParametersDTO
instance ToJSON CalculateTariffsParametersDTO where
  toJSON = genericToJSON optionsCalculateTariffsParametersDTO

optionsCalculateTariffsParametersDTO :: Options
optionsCalculateTariffsParametersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsParametersDTOCampaignId", "campaignId")
      , ("calculateTariffsParametersDTOSellingProgram", "sellingProgram")
      , ("calculateTariffsParametersDTOFrequency", "frequency")
      ]


-- | 
data CalculateTariffsRequest = CalculateTariffsRequest
  { calculateTariffsRequestParameters :: CalculateTariffsParametersDTO -- ^ 
  , calculateTariffsRequestOffers :: [CalculateTariffsOfferDTO] -- ^ Товары, для которых нужно рассчитать стоимость услуг.
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsRequest where
  parseJSON = genericParseJSON optionsCalculateTariffsRequest
instance ToJSON CalculateTariffsRequest where
  toJSON = genericToJSON optionsCalculateTariffsRequest

optionsCalculateTariffsRequest :: Options
optionsCalculateTariffsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsRequestParameters", "parameters")
      , ("calculateTariffsRequestOffers", "offers")
      ]


-- | 
data CalculateTariffsResponse = CalculateTariffsResponse
  { calculateTariffsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , calculateTariffsResponseResult :: Maybe CalculateTariffsResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsResponse where
  parseJSON = genericParseJSON optionsCalculateTariffsResponse
instance ToJSON CalculateTariffsResponse where
  toJSON = genericToJSON optionsCalculateTariffsResponse

optionsCalculateTariffsResponse :: Options
optionsCalculateTariffsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsResponseStatus", "status")
      , ("calculateTariffsResponseResult", "result")
      ]


-- | Расчет стоимости услуг.
data CalculateTariffsResponseDTO = CalculateTariffsResponseDTO
  { calculateTariffsResponseDTOOffers :: [CalculateTariffsOfferInfoDTO] -- ^ Стоимость услуг.
  } deriving (Show, Eq, Generic)

instance FromJSON CalculateTariffsResponseDTO where
  parseJSON = genericParseJSON optionsCalculateTariffsResponseDTO
instance ToJSON CalculateTariffsResponseDTO where
  toJSON = genericToJSON optionsCalculateTariffsResponseDTO

optionsCalculateTariffsResponseDTO :: Options
optionsCalculateTariffsResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculateTariffsResponseDTOOffers", "offers")
      ]


-- | Информация об услугах Маркета.
data CalculatedTariffDTO = CalculatedTariffDTO
  { calculatedTariffDTOType :: CalculatedTariffType -- ^ 
  , calculatedTariffDTOAmount :: Maybe Double -- ^ Стоимость услуги в рублях.
  , calculatedTariffDTOParameters :: [TariffParameterDTO] -- ^ Параметры расчета тарифа.
  } deriving (Show, Eq, Generic)

instance FromJSON CalculatedTariffDTO where
  parseJSON = genericParseJSON optionsCalculatedTariffDTO
instance ToJSON CalculatedTariffDTO where
  toJSON = genericToJSON optionsCalculatedTariffDTO

optionsCalculatedTariffDTO :: Options
optionsCalculatedTariffDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("calculatedTariffDTOType", "type")
      , ("calculatedTariffDTOAmount", "amount")
      , ("calculatedTariffDTOParameters", "parameters")
      ]


-- | Услуга Маркета:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
data CalculatedTariffType = CalculatedTariffType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CalculatedTariffType where
  parseJSON = genericParseJSON optionsCalculatedTariffType
instance ToJSON CalculatedTariffType where
  toJSON = genericToJSON optionsCalculatedTariffType

optionsCalculatedTariffType :: Options
optionsCalculatedTariffType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о магазине.
data CampaignDTO = CampaignDTO
  { campaignDTODomain :: Maybe Text -- ^ URL магазина.
  , campaignDTOId :: Maybe Int64 -- ^ Идентификатор кампании.
  , campaignDTOClientId :: Maybe Int64 -- ^ Идентификатор плательщика в Яндекс Балансе.
  , campaignDTOBusiness :: Maybe BusinessDTO -- ^ 
  , campaignDTOPlacementType :: Maybe PlacementType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignDTO where
  parseJSON = genericParseJSON optionsCampaignDTO
instance ToJSON CampaignDTO where
  toJSON = genericToJSON optionsCampaignDTO

optionsCampaignDTO :: Options
optionsCampaignDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignDTODomain", "domain")
      , ("campaignDTOId", "id")
      , ("campaignDTOClientId", "clientId")
      , ("campaignDTOBusiness", "business")
      , ("campaignDTOPlacementType", "placementType")
      ]


-- | Информация об индексе качества магазина.
data CampaignQualityRatingDTO = CampaignQualityRatingDTO
  { campaignQualityRatingDTOCampaignId :: Int64 -- ^ Идентификатор магазина.
  , campaignQualityRatingDTORatings :: [QualityRatingDTO] -- ^ Список значений индекса качества.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignQualityRatingDTO where
  parseJSON = genericParseJSON optionsCampaignQualityRatingDTO
instance ToJSON CampaignQualityRatingDTO where
  toJSON = genericToJSON optionsCampaignQualityRatingDTO

optionsCampaignQualityRatingDTO :: Options
optionsCampaignQualityRatingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignQualityRatingDTOCampaignId", "campaignId")
      , ("campaignQualityRatingDTORatings", "ratings")
      ]


-- | Настройки магазина.
data CampaignSettingsDTO = CampaignSettingsDTO
  { campaignSettingsDTOCountryRegion :: Maybe Int64 -- ^ Идентификатор региона, в котором находится магазин.
  , campaignSettingsDTOShopName :: Maybe Text -- ^ Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
  , campaignSettingsDTOShowInContext :: Maybe Bool -- ^ Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
  , campaignSettingsDTOShowInPremium :: Maybe Bool -- ^ Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
  , campaignSettingsDTOUseOpenStat :: Maybe Bool -- ^ Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
  , campaignSettingsDTOLocalRegion :: Maybe CampaignSettingsLocalRegionDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsDTO where
  parseJSON = genericParseJSON optionsCampaignSettingsDTO
instance ToJSON CampaignSettingsDTO where
  toJSON = genericToJSON optionsCampaignSettingsDTO

optionsCampaignSettingsDTO :: Options
optionsCampaignSettingsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignSettingsDTOCountryRegion", "countryRegion")
      , ("campaignSettingsDTOShopName", "shopName")
      , ("campaignSettingsDTOShowInContext", "showInContext")
      , ("campaignSettingsDTOShowInPremium", "showInPremium")
      , ("campaignSettingsDTOUseOpenStat", "useOpenStat")
      , ("campaignSettingsDTOLocalRegion", "localRegion")
      ]


-- | Информация о доставке в своем регионе магазина.
data CampaignSettingsDeliveryDTO = CampaignSettingsDeliveryDTO
  { campaignSettingsDeliveryDTOSchedule :: Maybe CampaignSettingsScheduleDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsDeliveryDTO where
  parseJSON = genericParseJSON optionsCampaignSettingsDeliveryDTO
instance ToJSON CampaignSettingsDeliveryDTO where
  toJSON = genericToJSON optionsCampaignSettingsDeliveryDTO

optionsCampaignSettingsDeliveryDTO :: Options
optionsCampaignSettingsDeliveryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignSettingsDeliveryDTOSchedule", "schedule")
      ]


-- | Информация о своем регионе магазина.
data CampaignSettingsLocalRegionDTO = CampaignSettingsLocalRegionDTO
  { campaignSettingsLocalRegionDTOId :: Maybe Int64 -- ^ Идентификатор региона.
  , campaignSettingsLocalRegionDTOName :: Maybe Text -- ^ Название региона.
  , campaignSettingsLocalRegionDTOType :: Maybe RegionType -- ^ 
  , campaignSettingsLocalRegionDTODeliveryOptionsSource :: Maybe CampaignSettingsScheduleSourceType -- ^ 
  , campaignSettingsLocalRegionDTODelivery :: Maybe CampaignSettingsDeliveryDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsLocalRegionDTO where
  parseJSON = genericParseJSON optionsCampaignSettingsLocalRegionDTO
instance ToJSON CampaignSettingsLocalRegionDTO where
  toJSON = genericToJSON optionsCampaignSettingsLocalRegionDTO

optionsCampaignSettingsLocalRegionDTO :: Options
optionsCampaignSettingsLocalRegionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignSettingsLocalRegionDTOId", "id")
      , ("campaignSettingsLocalRegionDTOName", "name")
      , ("campaignSettingsLocalRegionDTOType", "type")
      , ("campaignSettingsLocalRegionDTODeliveryOptionsSource", "deliveryOptionsSource")
      , ("campaignSettingsLocalRegionDTODelivery", "delivery")
      ]


-- | Расписание работы службы доставки в своем регионе.
data CampaignSettingsScheduleDTO = CampaignSettingsScheduleDTO
  { campaignSettingsScheduleDTOAvailableOnHolidays :: Maybe Bool -- ^ Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
  , campaignSettingsScheduleDTOCustomHolidays :: [Text] -- ^ Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  , campaignSettingsScheduleDTOCustomWorkingDays :: [Text] -- ^ Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  , campaignSettingsScheduleDTOPeriod :: Maybe CampaignSettingsTimePeriodDTO -- ^ 
  , campaignSettingsScheduleDTOTotalHolidays :: [Text] -- ^ Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  , campaignSettingsScheduleDTOWeeklyHolidays :: [Int] -- ^ Список выходных дней недели и государственных праздников.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsScheduleDTO where
  parseJSON = genericParseJSON optionsCampaignSettingsScheduleDTO
instance ToJSON CampaignSettingsScheduleDTO where
  toJSON = genericToJSON optionsCampaignSettingsScheduleDTO

optionsCampaignSettingsScheduleDTO :: Options
optionsCampaignSettingsScheduleDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignSettingsScheduleDTOAvailableOnHolidays", "availableOnHolidays")
      , ("campaignSettingsScheduleDTOCustomHolidays", "customHolidays")
      , ("campaignSettingsScheduleDTOCustomWorkingDays", "customWorkingDays")
      , ("campaignSettingsScheduleDTOPeriod", "period")
      , ("campaignSettingsScheduleDTOTotalHolidays", "totalHolidays")
      , ("campaignSettingsScheduleDTOWeeklyHolidays", "weeklyHolidays")
      ]


-- | Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
data CampaignSettingsScheduleSourceType = CampaignSettingsScheduleSourceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsScheduleSourceType where
  parseJSON = genericParseJSON optionsCampaignSettingsScheduleSourceType
instance ToJSON CampaignSettingsScheduleSourceType where
  toJSON = genericToJSON optionsCampaignSettingsScheduleSourceType

optionsCampaignSettingsScheduleSourceType :: Options
optionsCampaignSettingsScheduleSourceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
data CampaignSettingsTimePeriodDTO = CampaignSettingsTimePeriodDTO
  { campaignSettingsTimePeriodDTOFromDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  , campaignSettingsTimePeriodDTOToDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignSettingsTimePeriodDTO where
  parseJSON = genericParseJSON optionsCampaignSettingsTimePeriodDTO
instance ToJSON CampaignSettingsTimePeriodDTO where
  toJSON = genericToJSON optionsCampaignSettingsTimePeriodDTO

optionsCampaignSettingsTimePeriodDTO :: Options
optionsCampaignSettingsTimePeriodDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignSettingsTimePeriodDTOFromDate", "fromDate")
      , ("campaignSettingsTimePeriodDTOToDate", "toDate")
      ]


-- | Информация об индексе качества магазинов.
data CampaignsQualityRatingDTO = CampaignsQualityRatingDTO
  { campaignsQualityRatingDTOCampaignRatings :: [CampaignQualityRatingDTO] -- ^ Список магазинов c информацией об их индексе качества.
  } deriving (Show, Eq, Generic)

instance FromJSON CampaignsQualityRatingDTO where
  parseJSON = genericParseJSON optionsCampaignsQualityRatingDTO
instance ToJSON CampaignsQualityRatingDTO where
  toJSON = genericToJSON optionsCampaignsQualityRatingDTO

optionsCampaignsQualityRatingDTO :: Options
optionsCampaignsQualityRatingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("campaignsQualityRatingDTOCampaignRatings", "campaignRatings")
      ]


-- | Информация о параметрах категории.
data CategoryContentParametersDTO = CategoryContentParametersDTO
  { categoryContentParametersDTOCategoryId :: Int -- ^ Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  , categoryContentParametersDTOParameters :: Maybe [CategoryParameterDTO] -- ^ Список характеристик.
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryContentParametersDTO where
  parseJSON = genericParseJSON optionsCategoryContentParametersDTO
instance ToJSON CategoryContentParametersDTO where
  toJSON = genericToJSON optionsCategoryContentParametersDTO

optionsCategoryContentParametersDTO :: Options
optionsCategoryContentParametersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("categoryContentParametersDTOCategoryId", "categoryId")
      , ("categoryContentParametersDTOParameters", "parameters")
      ]


-- | Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 
data CategoryDTO = CategoryDTO
  { categoryDTOId :: Int64 -- ^ Идентификатор категории.
  , categoryDTOName :: Text -- ^ Название категории.
  , categoryDTOChildren :: Maybe [CategoryDTO] -- ^ Дочерние категории.
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryDTO where
  parseJSON = genericParseJSON optionsCategoryDTO
instance ToJSON CategoryDTO where
  toJSON = genericToJSON optionsCategoryDTO

optionsCategoryDTO :: Options
optionsCategoryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("categoryDTOId", "id")
      , ("categoryDTOName", "name")
      , ("categoryDTOChildren", "children")
      ]


-- | Текст ошибки.
data CategoryErrorDTO = CategoryErrorDTO
  { categoryErrorDTOCategoryId :: Maybe Int64 -- ^ Идентификатор категории.
  , categoryErrorDTOType :: Maybe CategoryErrorType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryErrorDTO where
  parseJSON = genericParseJSON optionsCategoryErrorDTO
instance ToJSON CategoryErrorDTO where
  toJSON = genericToJSON optionsCategoryErrorDTO

optionsCategoryErrorDTO :: Options
optionsCategoryErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("categoryErrorDTOCategoryId", "categoryId")
      , ("categoryErrorDTOType", "type")
      ]


-- | Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_IS_NOT_LEAF&#x60; — указана нелистовая категория. Укажите ту, которая не имеет дочерних категорий. 
data CategoryErrorType = CategoryErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryErrorType where
  parseJSON = genericParseJSON optionsCategoryErrorType
instance ToJSON CategoryErrorType where
  toJSON = genericToJSON optionsCategoryErrorType

optionsCategoryErrorType :: Options
optionsCategoryErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Характеристика товара.
data CategoryParameterDTO = CategoryParameterDTO
  { categoryParameterDTOId :: Int64 -- ^ Идентификатор характеристики.
  , categoryParameterDTOName :: Maybe Text -- ^ Название характеристики.
  , categoryParameterDTOType :: ParameterType -- ^ 
  , categoryParameterDTOUnit :: Maybe CategoryParameterUnitDTO -- ^ 
  , categoryParameterDTODescription :: Maybe Text -- ^ Описание характеристики.
  , categoryParameterDTORecommendationTypes :: Maybe [OfferCardRecommendationType] -- ^ Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
  , categoryParameterDTORequired :: Bool -- ^ Обязательность характеристики.
  , categoryParameterDTOFiltering :: Bool -- ^ Используется ли характеристика в фильтре.
  , categoryParameterDTODistinctive :: Bool -- ^ Является ли характеристика особенностью варианта.
  , categoryParameterDTOMultivalue :: Bool -- ^ Можно ли передать сразу несколько значений.
  , categoryParameterDTOAllowCustomValues :: Bool -- ^ Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
  , categoryParameterDTOValues :: Maybe [ParameterValueOptionDTO] -- ^ Список допустимых значений параметра. Только для характеристик типа `ENUM`.
  , categoryParameterDTOConstraints :: Maybe ParameterValueConstraintsDTO -- ^ 
  , categoryParameterDTOValueRestrictions :: Maybe [ValueRestrictionDTO] -- ^ Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryParameterDTO where
  parseJSON = genericParseJSON optionsCategoryParameterDTO
instance ToJSON CategoryParameterDTO where
  toJSON = genericToJSON optionsCategoryParameterDTO

optionsCategoryParameterDTO :: Options
optionsCategoryParameterDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("categoryParameterDTOId", "id")
      , ("categoryParameterDTOName", "name")
      , ("categoryParameterDTOType", "type")
      , ("categoryParameterDTOUnit", "unit")
      , ("categoryParameterDTODescription", "description")
      , ("categoryParameterDTORecommendationTypes", "recommendationTypes")
      , ("categoryParameterDTORequired", "required")
      , ("categoryParameterDTOFiltering", "filtering")
      , ("categoryParameterDTODistinctive", "distinctive")
      , ("categoryParameterDTOMultivalue", "multivalue")
      , ("categoryParameterDTOAllowCustomValues", "allowCustomValues")
      , ("categoryParameterDTOValues", "values")
      , ("categoryParameterDTOConstraints", "constraints")
      , ("categoryParameterDTOValueRestrictions", "valueRestrictions")
      ]


-- | Единицы измерения характеристики товара.
data CategoryParameterUnitDTO = CategoryParameterUnitDTO
  { categoryParameterUnitDTODefaultUnitId :: Int64 -- ^ Единица измерения по умолчанию.
  , categoryParameterUnitDTOUnits :: [UnitDTO] -- ^ Допустимые единицы измерения.
  } deriving (Show, Eq, Generic)

instance FromJSON CategoryParameterUnitDTO where
  parseJSON = genericParseJSON optionsCategoryParameterUnitDTO
instance ToJSON CategoryParameterUnitDTO where
  toJSON = genericToJSON optionsCategoryParameterUnitDTO

optionsCategoryParameterUnitDTO :: Options
optionsCategoryParameterUnitDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("categoryParameterUnitDTODefaultUnitId", "defaultUnitId")
      , ("categoryParameterUnitDTOUnits", "units")
      ]


-- | 
data ChangeOutletRequest = ChangeOutletRequest
  { changeOutletRequestName :: Text -- ^ Название точки продаж. 
  , changeOutletRequestType :: OutletType -- ^ 
  , changeOutletRequestCoords :: Maybe Text -- ^ Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  , changeOutletRequestIsMain :: Maybe Bool -- ^ Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  , changeOutletRequestShopOutletCode :: Maybe Text -- ^ Идентификатор точки продаж, присвоенный магазином.
  , changeOutletRequestVisibility :: Maybe OutletVisibilityType -- ^ 
  , changeOutletRequestAddress :: OutletAddressDTO -- ^ 
  , changeOutletRequestPhones :: [Text] -- ^ Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  , changeOutletRequestWorkingSchedule :: OutletWorkingScheduleDTO -- ^ 
  , changeOutletRequestDeliveryRules :: Maybe [OutletDeliveryRuleDTO] -- ^ Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  , changeOutletRequestStoragePeriod :: Maybe Int64 -- ^ Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  } deriving (Show, Eq, Generic)

instance FromJSON ChangeOutletRequest where
  parseJSON = genericParseJSON optionsChangeOutletRequest
instance ToJSON ChangeOutletRequest where
  toJSON = genericToJSON optionsChangeOutletRequest

optionsChangeOutletRequest :: Options
optionsChangeOutletRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("changeOutletRequestName", "name")
      , ("changeOutletRequestType", "type")
      , ("changeOutletRequestCoords", "coords")
      , ("changeOutletRequestIsMain", "isMain")
      , ("changeOutletRequestShopOutletCode", "shopOutletCode")
      , ("changeOutletRequestVisibility", "visibility")
      , ("changeOutletRequestAddress", "address")
      , ("changeOutletRequestPhones", "phones")
      , ("changeOutletRequestWorkingSchedule", "workingSchedule")
      , ("changeOutletRequestDeliveryRules", "deliveryRules")
      , ("changeOutletRequestStoragePeriod", "storagePeriod")
      ]


-- | Каналы продвижения товаров:  * &#x60;PUSH&#x60; — пуш-уведомление из приложения Яндекс Маркет.  * &#x60;STRETCH_MAIN&#x60; — верхний баннер-растяжка на главной странице Яндекс Маркета.  * &#x60;MAIN_PAGE_CAROUSEL&#x60; — карусель акций на главной странице Яндекс Маркета.  * &#x60;PRODUCT_RETAIL_PAGE&#x60; — товар на странице ритейл-повода.  * &#x60;MAIN_PAGE_CAROUSEL_WEB&#x60; — карусель акций на главной странице веб версии Яндекс Маркета.  * &#x60;PRODUCT_SEPARATE_LANDING&#x60; — товар на лендинге акции.  * &#x60;SUPER_SHELF_CATEGORY&#x60; — полка в категориях.  * &#x60;CAROUSEL_RETAIL_PAGE&#x60; — карусель на лендинге ритейл-повода.  * &#x60;POPUP_APPLICATION&#x60; — всплывающее окно в приложении Яндекс Маркет.  * &#x60;POST_TELEGRAM&#x60; — пост в Телеграм-канале Яндекс Маркета.  * &#x60;CPA&#x60; — реклама в партнерской сети Яндекс Маркета.  * &#x60;WEB_PERFORMANCE_DIRECT&#x60; — реклама в Яндекс Директе.  * &#x60;APP_PERFORMANCE&#x60; — реклама в AppStore и Google Play.  * &#x60;BANNER_PICKUP_POINT&#x60; — баннер в ПВЗ Маркета.  * &#x60;BLOGGER_PERFORMANCE&#x60; — рекламная интеграция у блогеров.  * &#x60;DIGITAL_CHANNEL_BANNER&#x60; — баннер в digital-каналах и социальных сетях VK, Одноклассники.  * &#x60;YANDEX_ECOSYSTEM_CHANNELS&#x60; — реклама в других сервисах Яндекса: GO, Delivery, Еда.  * &#x60;PARTNERS_MAIN_BANNER&#x60; — баннер на главной странице mail.ru, auto.ru, ya.ru.  * &#x60;OTHER&#x60; — прочее. 
data ChannelType = ChannelType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChannelType where
  parseJSON = genericParseJSON optionsChannelType
instance ToJSON ChannelType where
  toJSON = genericToJSON optionsChannelType

optionsChannelType :: Options
optionsChannelType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о сообщениях.
data ChatMessageDTO = ChatMessageDTO
  { chatMessageDTOMessageId :: Int64 -- ^ Идентификатор сообщения.
  , chatMessageDTOCreatedAt :: UTCTime -- ^ Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  , chatMessageDTOSender :: ChatMessageSenderType -- ^ 
  , chatMessageDTOMessage :: Maybe Text -- ^ Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. 
  , chatMessageDTOPayload :: Maybe [ChatMessagePayloadDTO] -- ^ Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatMessageDTO where
  parseJSON = genericParseJSON optionsChatMessageDTO
instance ToJSON ChatMessageDTO where
  toJSON = genericToJSON optionsChatMessageDTO

optionsChatMessageDTO :: Options
optionsChatMessageDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatMessageDTOMessageId", "messageId")
      , ("chatMessageDTOCreatedAt", "createdAt")
      , ("chatMessageDTOSender", "sender")
      , ("chatMessageDTOMessage", "message")
      , ("chatMessageDTOPayload", "payload")
      ]


-- | Информация о приложенных к сообщению файлах.
data ChatMessagePayloadDTO = ChatMessagePayloadDTO
  { chatMessagePayloadDTOName :: Text -- ^ Имя файла.
  , chatMessagePayloadDTOUrl :: Text -- ^ Ссылка для скачивания файла.
  , chatMessagePayloadDTOSize :: Int -- ^ Размер файла в байтах.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatMessagePayloadDTO where
  parseJSON = genericParseJSON optionsChatMessagePayloadDTO
instance ToJSON ChatMessagePayloadDTO where
  toJSON = genericToJSON optionsChatMessagePayloadDTO

optionsChatMessagePayloadDTO :: Options
optionsChatMessagePayloadDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatMessagePayloadDTOName", "name")
      , ("chatMessagePayloadDTOUrl", "url")
      , ("chatMessagePayloadDTOSize", "size")
      ]


-- | Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
data ChatMessageSenderType = ChatMessageSenderType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatMessageSenderType where
  parseJSON = genericParseJSON optionsChatMessageSenderType
instance ToJSON ChatMessageSenderType where
  toJSON = genericToJSON optionsChatMessageSenderType

optionsChatMessageSenderType :: Options
optionsChatMessageSenderType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о сообщениях.
data ChatMessagesResultDTO = ChatMessagesResultDTO
  { chatMessagesResultDTOOrderId :: Int64 -- ^ Идентификатор заказа.
  , chatMessagesResultDTOMessages :: [ChatMessageDTO] -- ^ Информация о сообщениях.
  , chatMessagesResultDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatMessagesResultDTO where
  parseJSON = genericParseJSON optionsChatMessagesResultDTO
instance ToJSON ChatMessagesResultDTO where
  toJSON = genericToJSON optionsChatMessagesResultDTO

optionsChatMessagesResultDTO :: Options
optionsChatMessagesResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatMessagesResultDTOOrderId", "orderId")
      , ("chatMessagesResultDTOMessages", "messages")
      , ("chatMessagesResultDTOPaging", "paging")
      ]


-- | Статус чата:  * &#x60;NEW&#x60; — новый чат. * &#x60;WAITING_FOR_CUSTOMER&#x60; — нужен ответ покупателя. * &#x60;WAITING_FOR_PARTNER&#x60; — нужен ответ магазина. * &#x60;WAITING_FOR_ARBITER&#x60; — нужен ответ арбитра. * &#x60;WAITING_FOR_MARKET&#x60; — нужен ответ Маркета. * &#x60;FINISHED&#x60; — чат завершен. 
data ChatStatusType = ChatStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatStatusType where
  parseJSON = genericParseJSON optionsChatStatusType
instance ToJSON ChatStatusType where
  toJSON = genericToJSON optionsChatStatusType

optionsChatStatusType :: Options
optionsChatStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип чата:  * &#x60;CHAT&#x60; — чат с покупателем. * &#x60;ARBITRAGE&#x60; — спор. 
data ChatType = ChatType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatType where
  parseJSON = genericParseJSON optionsChatType
instance ToJSON ChatType where
  toJSON = genericToJSON optionsChatType

optionsChatType :: Options
optionsChatType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Запрос на подтверждение цены. 
data ConfirmPricesRequest = ConfirmPricesRequest
  { confirmPricesRequestOfferIds :: [Text] -- ^ Идентификаторы товаров, у которых подтверждается цена.
  } deriving (Show, Eq, Generic)

instance FromJSON ConfirmPricesRequest where
  parseJSON = genericParseJSON optionsConfirmPricesRequest
instance ToJSON ConfirmPricesRequest where
  toJSON = genericToJSON optionsConfirmPricesRequest

optionsConfirmPricesRequest :: Options
optionsConfirmPricesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("confirmPricesRequestOfferIds", "offerIds")
      ]


-- | Запрос для подтверждения отгрузки.
data ConfirmShipmentRequest = ConfirmShipmentRequest
  { confirmShipmentRequestExternalShipmentId :: Maybe Text -- ^ Идентификатор отгрузки в системе поставщика.
  } deriving (Show, Eq, Generic)

instance FromJSON ConfirmShipmentRequest where
  parseJSON = genericParseJSON optionsConfirmShipmentRequest
instance ToJSON ConfirmShipmentRequest where
  toJSON = genericToJSON optionsConfirmShipmentRequest

optionsConfirmShipmentRequest :: Options
optionsConfirmShipmentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("confirmShipmentRequestExternalShipmentId", "externalShipmentId")
      ]


-- | Заказ, для которого нужно создать чат. 
data CreateChatRequest = CreateChatRequest
  { createChatRequestOrderId :: Int64 -- ^ Идентификатор заказа на Маркете.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatRequest where
  parseJSON = genericParseJSON optionsCreateChatRequest
instance ToJSON CreateChatRequest where
  toJSON = genericToJSON optionsCreateChatRequest

optionsCreateChatRequest :: Options
optionsCreateChatRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatRequestOrderId", "orderId")
      ]


-- | Результат создания чата.
data CreateChatResponse = CreateChatResponse
  { createChatResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , createChatResponseResult :: Maybe CreateChatResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatResponse where
  parseJSON = genericParseJSON optionsCreateChatResponse
instance ToJSON CreateChatResponse where
  toJSON = genericToJSON optionsCreateChatResponse

optionsCreateChatResponse :: Options
optionsCreateChatResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatResponseStatus", "status")
      , ("createChatResponseResult", "result")
      ]


-- | Информация о созданном чате.
data CreateChatResultDTO = CreateChatResultDTO
  { createChatResultDTOChatId :: Int64 -- ^ Идентификатор чата.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatResultDTO where
  parseJSON = genericParseJSON optionsCreateChatResultDTO
instance ToJSON CreateChatResultDTO where
  toJSON = genericToJSON optionsCreateChatResultDTO

optionsCreateChatResultDTO :: Options
optionsCreateChatResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatResultDTOChatId", "chatId")
      ]


-- | Ответ на запрос о создании точки продаж.
data CreateOutletResponse = CreateOutletResponse
  { createOutletResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , createOutletResponseResult :: Maybe OutletResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateOutletResponse where
  parseJSON = genericParseJSON optionsCreateOutletResponse
instance ToJSON CreateOutletResponse where
  toJSON = genericToJSON optionsCreateOutletResponse

optionsCreateOutletResponse :: Options
optionsCreateOutletResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createOutletResponseStatus", "status")
      , ("createOutletResponseResult", "result")
      ]


-- | Коды валют. Возможные значения: * &#x60;BYR&#x60; — белорусский рубль. * &#x60;KZT&#x60; — казахстанский тенге. * &#x60;RUR&#x60; — российский рубль. * &#x60;UAH&#x60; — украинская гривна. 
data CurrencyType = CurrencyType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CurrencyType where
  parseJSON = genericParseJSON optionsCurrencyType
instance ToJSON CurrencyType where
  toJSON = genericToJSON optionsCurrencyType

optionsCurrencyType :: Options
optionsCurrencyType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | День недели:  * &#x60;MONDAY&#x60; — понедельник. * &#x60;TUESDAY&#x60; — вторник. * &#x60;WEDNESDAY&#x60; — среда. * &#x60;THURSDAY&#x60; — четверг. * &#x60;FRIDAY&#x60; — пятница. * &#x60;SATURDAY&#x60; — суббота. * &#x60;SUNDAY&#x60; — воскресенье. 
data DayOfWeekType = DayOfWeekType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON DayOfWeekType where
  parseJSON = genericParseJSON optionsDayOfWeekType
instance ToJSON DayOfWeekType where
  toJSON = genericToJSON optionsDayOfWeekType

optionsDayOfWeekType :: Options
optionsDayOfWeekType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.
data DeleteCampaignOffersDTO = DeleteCampaignOffersDTO
  { deleteCampaignOffersDTONotDeletedOfferIds :: Maybe [Text] -- ^ Список SKU.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteCampaignOffersDTO where
  parseJSON = genericParseJSON optionsDeleteCampaignOffersDTO
instance ToJSON DeleteCampaignOffersDTO where
  toJSON = genericToJSON optionsDeleteCampaignOffersDTO

optionsDeleteCampaignOffersDTO :: Options
optionsDeleteCampaignOffersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteCampaignOffersDTONotDeletedOfferIds", "notDeletedOfferIds")
      ]


-- | Фильтрации удаляемых товаров по offerIds. 
data DeleteCampaignOffersRequest = DeleteCampaignOffersRequest
  { deleteCampaignOffersRequestOfferIds :: [Text] -- ^ Идентификаторы товаров в каталоге.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteCampaignOffersRequest where
  parseJSON = genericParseJSON optionsDeleteCampaignOffersRequest
instance ToJSON DeleteCampaignOffersRequest where
  toJSON = genericToJSON optionsDeleteCampaignOffersRequest

optionsDeleteCampaignOffersRequest :: Options
optionsDeleteCampaignOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteCampaignOffersRequestOfferIds", "offerIds")
      ]


-- | Результат удаления товаров.
data DeleteCampaignOffersResponse = DeleteCampaignOffersResponse
  { deleteCampaignOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , deleteCampaignOffersResponseResult :: Maybe DeleteCampaignOffersDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteCampaignOffersResponse where
  parseJSON = genericParseJSON optionsDeleteCampaignOffersResponse
instance ToJSON DeleteCampaignOffersResponse where
  toJSON = genericToJSON optionsDeleteCampaignOffersResponse

optionsDeleteCampaignOffersResponse :: Options
optionsDeleteCampaignOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteCampaignOffersResponseStatus", "status")
      , ("deleteCampaignOffersResponseResult", "result")
      ]


-- | Фильтр запроса отзывов по бизнесу. 
data DeleteGoodsFeedbackCommentRequest = DeleteGoodsFeedbackCommentRequest
  { deleteGoodsFeedbackCommentRequestId :: Int64 -- ^ Идентификатор комментария к отзыву. 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteGoodsFeedbackCommentRequest where
  parseJSON = genericParseJSON optionsDeleteGoodsFeedbackCommentRequest
instance ToJSON DeleteGoodsFeedbackCommentRequest where
  toJSON = genericToJSON optionsDeleteGoodsFeedbackCommentRequest

optionsDeleteGoodsFeedbackCommentRequest :: Options
optionsDeleteGoodsFeedbackCommentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteGoodsFeedbackCommentRequestId", "id")
      ]


-- | Запрос на возобновление показа оферов.
data DeleteHiddenOffersRequest = DeleteHiddenOffersRequest
  { deleteHiddenOffersRequestHiddenOffers :: [HiddenOfferDTO] -- ^ Список скрытых товаров. 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteHiddenOffersRequest where
  parseJSON = genericParseJSON optionsDeleteHiddenOffersRequest
instance ToJSON DeleteHiddenOffersRequest where
  toJSON = genericToJSON optionsDeleteHiddenOffersRequest

optionsDeleteHiddenOffersRequest :: Options
optionsDeleteHiddenOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteHiddenOffersRequestHiddenOffers", "hiddenOffers")
      ]


-- | Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
data DeleteOffersDTO = DeleteOffersDTO
  { deleteOffersDTONotDeletedOfferIds :: Maybe [Text] -- ^ Список SKU товаров, которые не удалось удалить.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersDTO where
  parseJSON = genericParseJSON optionsDeleteOffersDTO
instance ToJSON DeleteOffersDTO where
  toJSON = genericToJSON optionsDeleteOffersDTO

optionsDeleteOffersDTO :: Options
optionsDeleteOffersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersDTONotDeletedOfferIds", "notDeletedOfferIds")
      ]


-- | Товары, которые не удалось восстановить из архива.
data DeleteOffersFromArchiveDTO = DeleteOffersFromArchiveDTO
  { deleteOffersFromArchiveDTONotUnarchivedOfferIds :: Maybe [Text] -- ^ Список товаров, которые не удалось восстановить из архива.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersFromArchiveDTO where
  parseJSON = genericParseJSON optionsDeleteOffersFromArchiveDTO
instance ToJSON DeleteOffersFromArchiveDTO where
  toJSON = genericToJSON optionsDeleteOffersFromArchiveDTO

optionsDeleteOffersFromArchiveDTO :: Options
optionsDeleteOffersFromArchiveDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersFromArchiveDTONotUnarchivedOfferIds", "notUnarchivedOfferIds")
      ]


-- | Товары, которые нужно восстановить из архива. 
data DeleteOffersFromArchiveRequest = DeleteOffersFromArchiveRequest
  { deleteOffersFromArchiveRequestOfferIds :: [Text] -- ^ Список товаров, которые нужно восстановить из архива.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersFromArchiveRequest where
  parseJSON = genericParseJSON optionsDeleteOffersFromArchiveRequest
instance ToJSON DeleteOffersFromArchiveRequest where
  toJSON = genericToJSON optionsDeleteOffersFromArchiveRequest

optionsDeleteOffersFromArchiveRequest :: Options
optionsDeleteOffersFromArchiveRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersFromArchiveRequestOfferIds", "offerIds")
      ]


-- | Результат разархивации товаров.
data DeleteOffersFromArchiveResponse = DeleteOffersFromArchiveResponse
  { deleteOffersFromArchiveResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , deleteOffersFromArchiveResponseResult :: Maybe DeleteOffersFromArchiveDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersFromArchiveResponse where
  parseJSON = genericParseJSON optionsDeleteOffersFromArchiveResponse
instance ToJSON DeleteOffersFromArchiveResponse where
  toJSON = genericToJSON optionsDeleteOffersFromArchiveResponse

optionsDeleteOffersFromArchiveResponse :: Options
optionsDeleteOffersFromArchiveResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersFromArchiveResponseStatus", "status")
      , ("deleteOffersFromArchiveResponseResult", "result")
      ]


-- | Фильтрации удаляемых товаров по offerIds. 
data DeleteOffersRequest = DeleteOffersRequest
  { deleteOffersRequestOfferIds :: [Text] -- ^ Список SKU товаров, которые нужно удалить.
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersRequest where
  parseJSON = genericParseJSON optionsDeleteOffersRequest
instance ToJSON DeleteOffersRequest where
  toJSON = genericToJSON optionsDeleteOffersRequest

optionsDeleteOffersRequest :: Options
optionsDeleteOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersRequestOfferIds", "offerIds")
      ]


-- | Результат удаления товаров.
data DeleteOffersResponse = DeleteOffersResponse
  { deleteOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , deleteOffersResponseResult :: Maybe DeleteOffersDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteOffersResponse where
  parseJSON = genericParseJSON optionsDeleteOffersResponse
instance ToJSON DeleteOffersResponse where
  toJSON = genericToJSON optionsDeleteOffersResponse

optionsDeleteOffersResponse :: Options
optionsDeleteOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteOffersResponseStatus", "status")
      , ("deleteOffersResponseResult", "result")
      ]


-- | Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
data DeletePromoOffersRequest = DeletePromoOffersRequest
  { deletePromoOffersRequestPromoId :: Text -- ^ Идентификатор акции.
  , deletePromoOffersRequestDeleteAllOffers :: Maybe Bool -- ^ Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
  , deletePromoOffersRequestOfferIds :: Maybe [Text] -- ^ Товары, которые нужно убрать из акции.
  } deriving (Show, Eq, Generic)

instance FromJSON DeletePromoOffersRequest where
  parseJSON = genericParseJSON optionsDeletePromoOffersRequest
instance ToJSON DeletePromoOffersRequest where
  toJSON = genericToJSON optionsDeletePromoOffersRequest

optionsDeletePromoOffersRequest :: Options
optionsDeletePromoOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deletePromoOffersRequestPromoId", "promoId")
      , ("deletePromoOffersRequestDeleteAllOffers", "deleteAllOffers")
      , ("deletePromoOffersRequestOfferIds", "offerIds")
      ]


-- | Результат удаления товаров из акции.
data DeletePromoOffersResponse = DeletePromoOffersResponse
  { deletePromoOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , deletePromoOffersResponseResult :: Maybe DeletePromoOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeletePromoOffersResponse where
  parseJSON = genericParseJSON optionsDeletePromoOffersResponse
instance ToJSON DeletePromoOffersResponse where
  toJSON = genericToJSON optionsDeletePromoOffersResponse

optionsDeletePromoOffersResponse :: Options
optionsDeletePromoOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deletePromoOffersResponseStatus", "status")
      , ("deletePromoOffersResponseResult", "result")
      ]


-- | Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
data DeletePromoOffersResultDTO = DeletePromoOffersResultDTO
  { deletePromoOffersResultDTORejectedOffers :: Maybe [RejectedPromoOfferDeleteDTO] -- ^ Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
  } deriving (Show, Eq, Generic)

instance FromJSON DeletePromoOffersResultDTO where
  parseJSON = genericParseJSON optionsDeletePromoOffersResultDTO
instance ToJSON DeletePromoOffersResultDTO where
  toJSON = genericToJSON optionsDeletePromoOffersResultDTO

optionsDeletePromoOffersResultDTO :: Options
optionsDeletePromoOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deletePromoOffersResultDTORejectedOffers", "rejectedOffers")
      ]


-- | Служба доставки.
data DeliveryServiceDTO = DeliveryServiceDTO
  { deliveryServiceDTOId :: Maybe Int64 -- ^ Идентификатор службы доставки.
  , deliveryServiceDTOName :: Maybe Text -- ^ Наименование службы доставки.
  } deriving (Show, Eq, Generic)

instance FromJSON DeliveryServiceDTO where
  parseJSON = genericParseJSON optionsDeliveryServiceDTO
instance ToJSON DeliveryServiceDTO where
  toJSON = genericToJSON optionsDeliveryServiceDTO

optionsDeliveryServiceDTO :: Options
optionsDeliveryServiceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deliveryServiceDTOId", "id")
      , ("deliveryServiceDTOName", "name")
      ]


-- | Информация о службе доставки.
data DeliveryServiceInfoDTO = DeliveryServiceInfoDTO
  { deliveryServiceInfoDTOId :: Int64 -- ^ Идентификатор службы доставки.
  , deliveryServiceInfoDTOName :: Text -- ^ Наименование службы доставки.
  } deriving (Show, Eq, Generic)

instance FromJSON DeliveryServiceInfoDTO where
  parseJSON = genericParseJSON optionsDeliveryServiceInfoDTO
instance ToJSON DeliveryServiceInfoDTO where
  toJSON = genericToJSON optionsDeliveryServiceInfoDTO

optionsDeliveryServiceInfoDTO :: Options
optionsDeliveryServiceInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deliveryServiceInfoDTOId", "id")
      , ("deliveryServiceInfoDTOName", "name")
      ]


-- | Информация о службах доставки.
data DeliveryServicesDTO = DeliveryServicesDTO
  { deliveryServicesDTODeliveryService :: [DeliveryServiceInfoDTO] -- ^ Информация о службе доставки.
  } deriving (Show, Eq, Generic)

instance FromJSON DeliveryServicesDTO where
  parseJSON = genericParseJSON optionsDeliveryServicesDTO
instance ToJSON DeliveryServicesDTO where
  toJSON = genericToJSON optionsDeliveryServicesDTO

optionsDeliveryServicesDTO :: Options
optionsDeliveryServicesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deliveryServicesDTODeliveryService", "deliveryService")
      ]


-- | Информация о документе.
data DocumentDTO = DocumentDTO
  { documentDTOStatus :: Maybe OrderDocumentStatusType -- ^ 
  , documentDTONumber :: Maybe Text -- ^ Номер документа.
  , documentDTODate :: Maybe Day -- ^ Дата создания документа.
  } deriving (Show, Eq, Generic)

instance FromJSON DocumentDTO where
  parseJSON = genericParseJSON optionsDocumentDTO
instance ToJSON DocumentDTO where
  toJSON = genericToJSON optionsDocumentDTO

optionsDocumentDTO :: Options
optionsDocumentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("documentDTOStatus", "status")
      , ("documentDTONumber", "number")
      , ("documentDTODate", "date")
      ]


-- | Результат выполнения запроса.
data EacVerificationResultDTO = EacVerificationResultDTO
  { eacVerificationResultDTOVerificationResult :: Maybe EacVerificationStatusType -- ^ 
  , eacVerificationResultDTOAttemptsLeft :: Maybe Int -- ^ Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
  } deriving (Show, Eq, Generic)

instance FromJSON EacVerificationResultDTO where
  parseJSON = genericParseJSON optionsEacVerificationResultDTO
instance ToJSON EacVerificationResultDTO where
  toJSON = genericToJSON optionsEacVerificationResultDTO

optionsEacVerificationResultDTO :: Options
optionsEacVerificationResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("eacVerificationResultDTOVerificationResult", "verificationResult")
      , ("eacVerificationResultDTOAttemptsLeft", "attemptsLeft")
      ]


-- | Статус проверки кода подтверждения:  * &#x60;ACCEPTED&#x60; — код верный. * &#x60;REJECTED&#x60; — код неверный. * &#x60;NEED_UPDATE&#x60; — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
data EacVerificationStatusType = EacVerificationStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON EacVerificationStatusType where
  parseJSON = genericParseJSON optionsEacVerificationStatusType
instance ToJSON EacVerificationStatusType where
  toJSON = genericToJSON optionsEacVerificationStatusType

optionsEacVerificationStatusType :: Options
optionsEacVerificationStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Пустой ответ сервера.
data EmptyApiResponse = EmptyApiResponse
  { emptyApiResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON EmptyApiResponse where
  parseJSON = genericParseJSON optionsEmptyApiResponse
instance ToJSON EmptyApiResponse where
  toJSON = genericToJSON optionsEmptyApiResponse

optionsEmptyApiResponse :: Options
optionsEmptyApiResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("emptyApiResponseStatus", "status")
      ]


-- | Информация о рекомендованных карточках товаров.
data EnrichedMappingsOfferDTO = EnrichedMappingsOfferDTO
  { enrichedMappingsOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , enrichedMappingsOfferDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , enrichedMappingsOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , enrichedMappingsOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , enrichedMappingsOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , enrichedMappingsOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , enrichedMappingsOfferDTOId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , enrichedMappingsOfferDTOFeedId :: Maybe Int64 -- ^ Идентификатор фида.
  , enrichedMappingsOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , enrichedMappingsOfferDTOUrls :: Maybe [Text] -- ^ URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  , enrichedMappingsOfferDTOPictures :: Maybe [Text] -- ^ Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  , enrichedMappingsOfferDTOManufacturer :: Maybe Text -- ^ Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  , enrichedMappingsOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  , enrichedMappingsOfferDTOMinShipment :: Maybe Int -- ^ Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  , enrichedMappingsOfferDTOTransportUnitSize :: Maybe Int -- ^ Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  , enrichedMappingsOfferDTOQuantumOfSupply :: Maybe Int -- ^ Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  , enrichedMappingsOfferDTODeliveryDurationDays :: Maybe Int -- ^ Срок, за который продавец поставляет товары на склад, в днях.
  , enrichedMappingsOfferDTOBoxCount :: Maybe Int -- ^ Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  , enrichedMappingsOfferDTOCustomsCommodityCodes :: Maybe [Text] -- ^ Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  , enrichedMappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , enrichedMappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType] -- ^ Дни недели, в которые продавец поставляет товары на склад.
  , enrichedMappingsOfferDTOShelfLifeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  , enrichedMappingsOfferDTOLifeTimeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  , enrichedMappingsOfferDTOGuaranteePeriodDays :: Maybe Int -- ^ Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  , enrichedMappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO -- ^ 
  , enrichedMappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType -- ^ 
  , enrichedMappingsOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , enrichedMappingsOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , enrichedMappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , enrichedMappingsOfferDTOCertificate :: Maybe Text -- ^ Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  , enrichedMappingsOfferDTOPrice :: Maybe Double -- ^ Цена на товар в рублях.
  , enrichedMappingsOfferDTOMarketCategoryId :: Maybe Int64 -- ^ Идентификатор категории для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
  , enrichedMappingsOfferDTOMarketCategoryName :: Maybe Text -- ^ Название категории для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
  , enrichedMappingsOfferDTOMarketModelId :: Maybe Int64 -- ^ Идентификатор модели для рекомендованной карточки товара на Маркете.  Может отсутствовать в ответе. 
  , enrichedMappingsOfferDTOMarketModelName :: Maybe Text -- ^ Название модели для рекомендованной карточки товара на Маркете.  Возвращается только вместе с параметром ##marketSku##. 
  , enrichedMappingsOfferDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , enrichedMappingsOfferDTOMarketSkuName :: Maybe Text -- ^ Название товара с рекомендованной карточки на Маркете.  Может отсутствовать в ответе. 
  } deriving (Show, Eq, Generic)

instance FromJSON EnrichedMappingsOfferDTO where
  parseJSON = genericParseJSON optionsEnrichedMappingsOfferDTO
instance ToJSON EnrichedMappingsOfferDTO where
  toJSON = genericToJSON optionsEnrichedMappingsOfferDTO

optionsEnrichedMappingsOfferDTO :: Options
optionsEnrichedMappingsOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("enrichedMappingsOfferDTOName", "name")
      , ("enrichedMappingsOfferDTOShopSku", "shopSku")
      , ("enrichedMappingsOfferDTOCategory", "category")
      , ("enrichedMappingsOfferDTOVendor", "vendor")
      , ("enrichedMappingsOfferDTOVendorCode", "vendorCode")
      , ("enrichedMappingsOfferDTODescription", "description")
      , ("enrichedMappingsOfferDTOId", "id")
      , ("enrichedMappingsOfferDTOFeedId", "feedId")
      , ("enrichedMappingsOfferDTOBarcodes", "barcodes")
      , ("enrichedMappingsOfferDTOUrls", "urls")
      , ("enrichedMappingsOfferDTOPictures", "pictures")
      , ("enrichedMappingsOfferDTOManufacturer", "manufacturer")
      , ("enrichedMappingsOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("enrichedMappingsOfferDTOMinShipment", "minShipment")
      , ("enrichedMappingsOfferDTOTransportUnitSize", "transportUnitSize")
      , ("enrichedMappingsOfferDTOQuantumOfSupply", "quantumOfSupply")
      , ("enrichedMappingsOfferDTODeliveryDurationDays", "deliveryDurationDays")
      , ("enrichedMappingsOfferDTOBoxCount", "boxCount")
      , ("enrichedMappingsOfferDTOCustomsCommodityCodes", "customsCommodityCodes")
      , ("enrichedMappingsOfferDTOWeightDimensions", "weightDimensions")
      , ("enrichedMappingsOfferDTOSupplyScheduleDays", "supplyScheduleDays")
      , ("enrichedMappingsOfferDTOShelfLifeDays", "shelfLifeDays")
      , ("enrichedMappingsOfferDTOLifeTimeDays", "lifeTimeDays")
      , ("enrichedMappingsOfferDTOGuaranteePeriodDays", "guaranteePeriodDays")
      , ("enrichedMappingsOfferDTOProcessingState", "processingState")
      , ("enrichedMappingsOfferDTOAvailability", "availability")
      , ("enrichedMappingsOfferDTOShelfLife", "shelfLife")
      , ("enrichedMappingsOfferDTOLifeTime", "lifeTime")
      , ("enrichedMappingsOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("enrichedMappingsOfferDTOCertificate", "certificate")
      , ("enrichedMappingsOfferDTOPrice", "price")
      , ("enrichedMappingsOfferDTOMarketCategoryId", "marketCategoryId")
      , ("enrichedMappingsOfferDTOMarketCategoryName", "marketCategoryName")
      , ("enrichedMappingsOfferDTOMarketModelId", "marketModelId")
      , ("enrichedMappingsOfferDTOMarketModelName", "marketModelName")
      , ("enrichedMappingsOfferDTOMarketSku", "marketSku")
      , ("enrichedMappingsOfferDTOMarketSkuName", "marketSkuName")
      ]


-- | Модель товара.
data EnrichedModelDTO = EnrichedModelDTO
  { enrichedModelDTOId :: Maybe Int64 -- ^ Идентификатор модели товара.
  , enrichedModelDTOName :: Maybe Text -- ^ Название модели товара.
  , enrichedModelDTOPrices :: Maybe ModelPriceDTO -- ^ 
  , enrichedModelDTOOffers :: Maybe [ModelOfferDTO] -- ^ Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
  , enrichedModelDTOOfflineOffers :: Maybe Int -- ^ Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
  , enrichedModelDTOOnlineOffers :: Maybe Int -- ^ Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON EnrichedModelDTO where
  parseJSON = genericParseJSON optionsEnrichedModelDTO
instance ToJSON EnrichedModelDTO where
  toJSON = genericToJSON optionsEnrichedModelDTO

optionsEnrichedModelDTO :: Options
optionsEnrichedModelDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("enrichedModelDTOId", "id")
      , ("enrichedModelDTOName", "name")
      , ("enrichedModelDTOPrices", "prices")
      , ("enrichedModelDTOOffers", "offers")
      , ("enrichedModelDTOOfflineOffers", "offlineOffers")
      , ("enrichedModelDTOOnlineOffers", "onlineOffers")
      ]


-- | Список моделей товаров.
data EnrichedModelsDTO = EnrichedModelsDTO
  { enrichedModelsDTOModels :: [EnrichedModelDTO] -- ^ Список моделей товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON EnrichedModelsDTO where
  parseJSON = genericParseJSON optionsEnrichedModelsDTO
instance ToJSON EnrichedModelsDTO where
  toJSON = genericToJSON optionsEnrichedModelsDTO

optionsEnrichedModelsDTO :: Options
optionsEnrichedModelsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("enrichedModelsDTOModels", "models")
      ]


-- | Информация о коробке.
data EnrichedOrderBoxLayoutDTO = EnrichedOrderBoxLayoutDTO
  { enrichedOrderBoxLayoutDTOItems :: [OrderBoxLayoutItemDTO] -- ^ Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  , enrichedOrderBoxLayoutDTOBoxId :: Maybe Int64 -- ^ Идентификатор коробки.
  } deriving (Show, Eq, Generic)

instance FromJSON EnrichedOrderBoxLayoutDTO where
  parseJSON = genericParseJSON optionsEnrichedOrderBoxLayoutDTO
instance ToJSON EnrichedOrderBoxLayoutDTO where
  toJSON = genericToJSON optionsEnrichedOrderBoxLayoutDTO

optionsEnrichedOrderBoxLayoutDTO :: Options
optionsEnrichedOrderBoxLayoutDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("enrichedOrderBoxLayoutDTOItems", "items")
      , ("enrichedOrderBoxLayoutDTOBoxId", "boxId")
      ]


-- | Информация об отгрузке.
data ExtensionShipmentDTO = ExtensionShipmentDTO
  { extensionShipmentDTOCurrentStatus :: Maybe ShipmentStatusChangeDTO -- ^ 
  , extensionShipmentDTOAvailableActions :: [ShipmentActionType] -- ^ Доступные действия над отгрузкой.
  } deriving (Show, Eq, Generic)

instance FromJSON ExtensionShipmentDTO where
  parseJSON = genericParseJSON optionsExtensionShipmentDTO
instance ToJSON ExtensionShipmentDTO where
  toJSON = genericToJSON optionsExtensionShipmentDTO

optionsExtensionShipmentDTO :: Options
optionsExtensionShipmentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("extensionShipmentDTOCurrentStatus", "currentStatus")
      , ("extensionShipmentDTOAvailableActions", "availableActions")
      ]


-- | Информация о проверке содержимого прайс-листа, загруженного на Маркет.
data FeedContentDTO = FeedContentDTO
  { feedContentDTORejectedOffersCount :: Maybe Int64 -- ^ Количество предложений, в которых найдены ошибки на этапе загрузки прайс-листа. Выводится, если параметр `content status=OK`. 
  , feedContentDTOStatus :: Maybe FeedStatusType -- ^ 
  , feedContentDTOTotalOffersCount :: Maybe Int64 -- ^ Количество предложений в прайс-листе. Выводится, если параметр `content status=OK`. 
  , feedContentDTOError :: Maybe FeedContentErrorDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedContentDTO where
  parseJSON = genericParseJSON optionsFeedContentDTO
instance ToJSON FeedContentDTO where
  toJSON = genericToJSON optionsFeedContentDTO

optionsFeedContentDTO :: Options
optionsFeedContentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedContentDTORejectedOffersCount", "rejectedOffersCount")
      , ("feedContentDTOStatus", "status")
      , ("feedContentDTOTotalOffersCount", "totalOffersCount")
      , ("feedContentDTOError", "error")
      ]


-- | Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
data FeedContentErrorDTO = FeedContentErrorDTO
  { feedContentErrorDTOType :: Maybe FeedContentErrorType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedContentErrorDTO where
  parseJSON = genericParseJSON optionsFeedContentErrorDTO
instance ToJSON FeedContentErrorDTO where
  toJSON = genericToJSON optionsFeedContentErrorDTO

optionsFeedContentErrorDTO :: Options
optionsFeedContentErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedContentErrorDTOType", "type")
      ]


-- | Тип ошибки в содержимом прайс-листа.  Возможные значения:  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
data FeedContentErrorType = FeedContentErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedContentErrorType where
  parseJSON = genericParseJSON optionsFeedContentErrorType
instance ToJSON FeedContentErrorType where
  toJSON = genericToJSON optionsFeedContentErrorType

optionsFeedContentErrorType :: Options
optionsFeedContentErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о прайс-листе.
data FeedDTO = FeedDTO
  { feedDTOId :: Maybe Int64 -- ^ Идентификатор прайс-листа.
  , feedDTOLogin :: Maybe Text -- ^ Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  , feedDTOName :: Maybe Text -- ^ Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 
  , feedDTOPassword :: Maybe Text -- ^ Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 
  , feedDTOUploadDate :: Maybe UTCTime -- ^ Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 
  , feedDTOUrl :: Maybe Text -- ^ URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 
  , feedDTOContent :: Maybe FeedContentDTO -- ^ 
  , feedDTODownload :: Maybe FeedDownloadDTO -- ^ 
  , feedDTOPlacement :: Maybe FeedPlacementDTO -- ^ 
  , feedDTOPublication :: Maybe FeedPublicationDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedDTO where
  parseJSON = genericParseJSON optionsFeedDTO
instance ToJSON FeedDTO where
  toJSON = genericToJSON optionsFeedDTO

optionsFeedDTO :: Options
optionsFeedDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedDTOId", "id")
      , ("feedDTOLogin", "login")
      , ("feedDTOName", "name")
      , ("feedDTOPassword", "password")
      , ("feedDTOUploadDate", "uploadDate")
      , ("feedDTOUrl", "url")
      , ("feedDTOContent", "content")
      , ("feedDTODownload", "download")
      , ("feedDTOPlacement", "placement")
      , ("feedDTOPublication", "publication")
      ]


-- | Информация о последней загрузке прайс-листа.
data FeedDownloadDTO = FeedDownloadDTO
  { feedDownloadDTOStatus :: Maybe FeedStatusType -- ^ 
  , feedDownloadDTOError :: Maybe FeedDownloadErrorDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedDownloadDTO where
  parseJSON = genericParseJSON optionsFeedDownloadDTO
instance ToJSON FeedDownloadDTO where
  toJSON = genericToJSON optionsFeedDownloadDTO

optionsFeedDownloadDTO :: Options
optionsFeedDownloadDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedDownloadDTOStatus", "status")
      , ("feedDownloadDTOError", "error")
      ]


-- | Информация об ошибке при загрузке прайс-листа. Выводится, если параметр &#x60;download status&#x3D;ERROR&#x60;. 
data FeedDownloadErrorDTO = FeedDownloadErrorDTO
  { feedDownloadErrorDTOHttpStatusCode :: Maybe Int -- ^ HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  , feedDownloadErrorDTOType :: Maybe FeedDownloadErrorType -- ^ 
  , feedDownloadErrorDTODescription :: Maybe Text -- ^ Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedDownloadErrorDTO where
  parseJSON = genericParseJSON optionsFeedDownloadErrorDTO
instance ToJSON FeedDownloadErrorDTO where
  toJSON = genericToJSON optionsFeedDownloadErrorDTO

optionsFeedDownloadErrorDTO :: Options
optionsFeedDownloadErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedDownloadErrorDTOHttpStatusCode", "httpStatusCode")
      , ("feedDownloadErrorDTOType", "type")
      , ("feedDownloadErrorDTODescription", "description")
      ]


-- | Тип ошибки загрузки прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;. 
data FeedDownloadErrorType = FeedDownloadErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedDownloadErrorType where
  parseJSON = genericParseJSON optionsFeedDownloadErrorType
instance ToJSON FeedDownloadErrorType where
  toJSON = genericToJSON optionsFeedDownloadErrorType

optionsFeedDownloadErrorType :: Options
optionsFeedDownloadErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (&#x60;index-log-record status&#x3D;ERROR&#x60;). 
data FeedIndexLogsErrorDTO = FeedIndexLogsErrorDTO
  { feedIndexLogsErrorDTOHttpStatusCode :: Maybe Int -- ^ HTTP-код ошибки индексации прайс-листа.  Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
  , feedIndexLogsErrorDTOType :: Maybe FeedIndexLogsErrorType -- ^ 
  , feedIndexLogsErrorDTODescription :: Maybe Text -- ^ Описание ошибки.  Выводится, если `type=DOWNLOAD_ERROR`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsErrorDTO where
  parseJSON = genericParseJSON optionsFeedIndexLogsErrorDTO
instance ToJSON FeedIndexLogsErrorDTO where
  toJSON = genericToJSON optionsFeedIndexLogsErrorDTO

optionsFeedIndexLogsErrorDTO :: Options
optionsFeedIndexLogsErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedIndexLogsErrorDTOHttpStatusCode", "httpStatusCode")
      , ("feedIndexLogsErrorDTOType", "type")
      , ("feedIndexLogsErrorDTODescription", "description")
      ]


-- | Тип ошибки индексации прайс-листа.  Возможные значения:  * &#x60;DOWNLOAD_ERROR&#x60; — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре &#x60;description&#x60;.  * &#x60;DOWNLOAD_HTTP_ERROR&#x60; — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре &#x60;httpStatusCode&#x60;.  * &#x60;PARSE_ERROR&#x60; — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * &#x60;PARSE_XML_ERROR&#x60; — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * &#x60;TOO_MANY_REJECTED_OFFERS&#x60; — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете. 
data FeedIndexLogsErrorType = FeedIndexLogsErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsErrorType where
  parseJSON = genericParseJSON optionsFeedIndexLogsErrorType
instance ToJSON FeedIndexLogsErrorType where
  toJSON = genericToJSON optionsFeedIndexLogsErrorType

optionsFeedIndexLogsErrorType :: Options
optionsFeedIndexLogsErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о прайс-листе.
data FeedIndexLogsFeedDTO = FeedIndexLogsFeedDTO
  { feedIndexLogsFeedDTOId :: Maybe Int64 -- ^ Идентификатор прайс-листа.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsFeedDTO where
  parseJSON = genericParseJSON optionsFeedIndexLogsFeedDTO
instance ToJSON FeedIndexLogsFeedDTO where
  toJSON = genericToJSON optionsFeedIndexLogsFeedDTO

optionsFeedIndexLogsFeedDTO :: Options
optionsFeedIndexLogsFeedDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedIndexLogsFeedDTOId", "id")
      ]


-- | Тип обновления.  Возможные значения:  * &#x60;DIFF&#x60; — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * &#x60;FAST_PRICE&#x60; — только обновление цен ранее опубликованных предложений. * &#x60;FULL&#x60; — полное обновление данных на Яндекс Маркете. 
data FeedIndexLogsIndexType = FeedIndexLogsIndexType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsIndexType where
  parseJSON = genericParseJSON optionsFeedIndexLogsIndexType
instance ToJSON FeedIndexLogsIndexType where
  toJSON = genericToJSON optionsFeedIndexLogsIndexType

optionsFeedIndexLogsIndexType :: Options
optionsFeedIndexLogsIndexType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о предложениях прайс-листа.
data FeedIndexLogsOffersDTO = FeedIndexLogsOffersDTO
  { feedIndexLogsOffersDTORejectedCount :: Maybe Int64 -- ^ Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.
  , feedIndexLogsOffersDTOTotalCount :: Maybe Int64 -- ^ Количество предложений в прайс-листе.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsOffersDTO where
  parseJSON = genericParseJSON optionsFeedIndexLogsOffersDTO
instance ToJSON FeedIndexLogsOffersDTO where
  toJSON = genericToJSON optionsFeedIndexLogsOffersDTO

optionsFeedIndexLogsOffersDTO :: Options
optionsFeedIndexLogsOffersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedIndexLogsOffersDTORejectedCount", "rejectedCount")
      , ("feedIndexLogsOffersDTOTotalCount", "totalCount")
      ]


-- | Список отчетов по индексации прайс-листа.
data FeedIndexLogsRecordDTO = FeedIndexLogsRecordDTO
  { feedIndexLogsRecordDTODownloadTime :: Maybe UTCTime -- ^ Дата и время загрузки прайс-листа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  , feedIndexLogsRecordDTOFileTime :: Maybe UTCTime -- ^ Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  , feedIndexLogsRecordDTOGenerationId :: Maybe Int64 -- ^ Идентификатор индексации.
  , feedIndexLogsRecordDTOIndexType :: Maybe FeedIndexLogsIndexType -- ^ 
  , feedIndexLogsRecordDTOPublishedTime :: Maybe UTCTime -- ^ Дата и время публикации предложений из прайс-листа на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  , feedIndexLogsRecordDTOStatus :: Maybe FeedIndexLogsStatusType -- ^ 
  , feedIndexLogsRecordDTOError :: Maybe FeedIndexLogsErrorDTO -- ^ 
  , feedIndexLogsRecordDTOOffers :: Maybe FeedIndexLogsOffersDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsRecordDTO where
  parseJSON = genericParseJSON optionsFeedIndexLogsRecordDTO
instance ToJSON FeedIndexLogsRecordDTO where
  toJSON = genericToJSON optionsFeedIndexLogsRecordDTO

optionsFeedIndexLogsRecordDTO :: Options
optionsFeedIndexLogsRecordDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedIndexLogsRecordDTODownloadTime", "downloadTime")
      , ("feedIndexLogsRecordDTOFileTime", "fileTime")
      , ("feedIndexLogsRecordDTOGenerationId", "generationId")
      , ("feedIndexLogsRecordDTOIndexType", "indexType")
      , ("feedIndexLogsRecordDTOPublishedTime", "publishedTime")
      , ("feedIndexLogsRecordDTOStatus", "status")
      , ("feedIndexLogsRecordDTOError", "error")
      , ("feedIndexLogsRecordDTOOffers", "offers")
      ]


-- | Результат выполнения запроса отчета по индексации прайс-листа.
data FeedIndexLogsResultDTO = FeedIndexLogsResultDTO
  { feedIndexLogsResultDTOFeed :: Maybe FeedIndexLogsFeedDTO -- ^ 
  , feedIndexLogsResultDTOIndexLogRecords :: [FeedIndexLogsRecordDTO] -- ^ Список отчетов по индексации прайс-листа.
  , feedIndexLogsResultDTOTotal :: Maybe Int64 -- ^ Количество отчетов на всех страницах выходных данных.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsResultDTO where
  parseJSON = genericParseJSON optionsFeedIndexLogsResultDTO
instance ToJSON FeedIndexLogsResultDTO where
  toJSON = genericToJSON optionsFeedIndexLogsResultDTO

optionsFeedIndexLogsResultDTO :: Options
optionsFeedIndexLogsResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedIndexLogsResultDTOFeed", "feed")
      , ("feedIndexLogsResultDTOIndexLogRecords", "indexLogRecords")
      , ("feedIndexLogsResultDTOTotal", "total")
      ]


-- | Статус индексации прайс-листа и проверки на соответствие техническим требованиям.  Возможные значения:  * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. 
data FeedIndexLogsStatusType = FeedIndexLogsStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedIndexLogsStatusType where
  parseJSON = genericParseJSON optionsFeedIndexLogsStatusType
instance ToJSON FeedIndexLogsStatusType where
  toJSON = genericToJSON optionsFeedIndexLogsStatusType

optionsFeedIndexLogsStatusType :: Options
optionsFeedIndexLogsStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Параметр прайс-листа.
data FeedParameterDTO = FeedParameterDTO
  { feedParameterDTODeleted :: Maybe Bool -- ^ Удалить ли значение параметра.  Возможное значение: * `true` — удалить значение параметра.  Используется вместе с параметром `name`. 
  , feedParameterDTOName :: Text -- ^ Название параметра.  Возможное значение: - `reparseIntervalMinutes` — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре `value`. Например, при `value=1440`, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр. 
  , feedParameterDTOValues :: Maybe [Int] -- ^ Значения параметра.  Используется вместе с параметром `name`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedParameterDTO where
  parseJSON = genericParseJSON optionsFeedParameterDTO
instance ToJSON FeedParameterDTO where
  toJSON = genericToJSON optionsFeedParameterDTO

optionsFeedParameterDTO :: Options
optionsFeedParameterDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedParameterDTODeleted", "deleted")
      , ("feedParameterDTOName", "name")
      , ("feedParameterDTOValues", "values")
      ]


-- | Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
data FeedPlacementDTO = FeedPlacementDTO
  { feedPlacementDTOStatus :: Maybe FeedStatusType -- ^ 
  , feedPlacementDTOTotalOffersCount :: Maybe Int -- ^ Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedPlacementDTO where
  parseJSON = genericParseJSON optionsFeedPlacementDTO
instance ToJSON FeedPlacementDTO where
  toJSON = genericToJSON optionsFeedPlacementDTO

optionsFeedPlacementDTO :: Options
optionsFeedPlacementDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedPlacementDTOStatus", "status")
      , ("feedPlacementDTOTotalOffersCount", "totalOffersCount")
      ]


-- | Информация о последней публикации предложений из прайс-листа на Маркете.
data FeedPublicationDTO = FeedPublicationDTO
  { feedPublicationDTOStatus :: Maybe FeedStatusType -- ^ 
  , feedPublicationDTOFull :: Maybe FeedPublicationFullDTO -- ^ 
  , feedPublicationDTOPriceAndStockUpdate :: Maybe FeedPublicationPriceAndStockUpdateDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedPublicationDTO where
  parseJSON = genericParseJSON optionsFeedPublicationDTO
instance ToJSON FeedPublicationDTO where
  toJSON = genericToJSON optionsFeedPublicationDTO

optionsFeedPublicationDTO :: Options
optionsFeedPublicationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedPublicationDTOStatus", "status")
      , ("feedPublicationDTOFull", "full")
      , ("feedPublicationDTOPriceAndStockUpdate", "priceAndStockUpdate")
      ]


-- | Информация о последней публикации предложений из прайс-листа на Маркете. 
data FeedPublicationFullDTO = FeedPublicationFullDTO
  { feedPublicationFullDTOFileTime :: Maybe UTCTime -- ^ Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  , feedPublicationFullDTOPublishedTime :: Maybe UTCTime -- ^ Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedPublicationFullDTO where
  parseJSON = genericParseJSON optionsFeedPublicationFullDTO
instance ToJSON FeedPublicationFullDTO where
  toJSON = genericToJSON optionsFeedPublicationFullDTO

optionsFeedPublicationFullDTO :: Options
optionsFeedPublicationFullDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedPublicationFullDTOFileTime", "fileTime")
      , ("feedPublicationFullDTOPublishedTime", "publishedTime")
      ]


-- | Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
data FeedPublicationPriceAndStockUpdateDTO = FeedPublicationPriceAndStockUpdateDTO
  { feedPublicationPriceAndStockUpdateDTOFileTime :: Maybe UTCTime -- ^ Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  , feedPublicationPriceAndStockUpdateDTOPublishedTime :: Maybe UTCTime -- ^ Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedPublicationPriceAndStockUpdateDTO where
  parseJSON = genericParseJSON optionsFeedPublicationPriceAndStockUpdateDTO
instance ToJSON FeedPublicationPriceAndStockUpdateDTO where
  toJSON = genericToJSON optionsFeedPublicationPriceAndStockUpdateDTO

optionsFeedPublicationPriceAndStockUpdateDTO :: Options
optionsFeedPublicationPriceAndStockUpdateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedPublicationPriceAndStockUpdateDTOFileTime", "fileTime")
      , ("feedPublicationPriceAndStockUpdateDTOPublishedTime", "publishedTime")
      ]


-- | Статус прайс-листа.  Возможные значения:    * &#x60;ERROR&#x60; — найдены ошибки.   * &#x60;NA&#x60; — прайс-лист не загружался более семи дней или на этапе загрузки произошла ошибка.   * &#x60;OK&#x60; — ошибок не найдено. 
data FeedStatusType = FeedStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedStatusType where
  parseJSON = genericParseJSON optionsFeedStatusType
instance ToJSON FeedStatusType where
  toJSON = genericToJSON optionsFeedStatusType

optionsFeedStatusType :: Options
optionsFeedStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
data FeedbackAuthorDTO = FeedbackAuthorDTO
  { feedbackAuthorDTOName :: Maybe Text -- ^ Имя автора отзыва.
  , feedbackAuthorDTORegion :: Maybe RegionDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackAuthorDTO where
  parseJSON = genericParseJSON optionsFeedbackAuthorDTO
instance ToJSON FeedbackAuthorDTO where
  toJSON = genericToJSON optionsFeedbackAuthorDTO

optionsFeedbackAuthorDTO :: Options
optionsFeedbackAuthorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackAuthorDTOName", "name")
      , ("feedbackAuthorDTORegion", "region")
      ]


-- | Информация об авторе комментария.
data FeedbackCommentAuthorDTO = FeedbackCommentAuthorDTO
  { feedbackCommentAuthorDTOType :: Maybe FeedbackCommentAuthorType -- ^ 
  , feedbackCommentAuthorDTOName :: Maybe Text -- ^ Имя автора отзыва или название магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackCommentAuthorDTO where
  parseJSON = genericParseJSON optionsFeedbackCommentAuthorDTO
instance ToJSON FeedbackCommentAuthorDTO where
  toJSON = genericToJSON optionsFeedbackCommentAuthorDTO

optionsFeedbackCommentAuthorDTO :: Options
optionsFeedbackCommentAuthorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackCommentAuthorDTOType", "type")
      , ("feedbackCommentAuthorDTOName", "name")
      ]


-- | Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
data FeedbackCommentAuthorType = FeedbackCommentAuthorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackCommentAuthorType where
  parseJSON = genericParseJSON optionsFeedbackCommentAuthorType
instance ToJSON FeedbackCommentAuthorType where
  toJSON = genericToJSON optionsFeedbackCommentAuthorType

optionsFeedbackCommentAuthorType :: Options
optionsFeedbackCommentAuthorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Комментарий к отзыву на магазин.
data FeedbackCommentDTO = FeedbackCommentDTO
  { feedbackCommentDTOId :: Maybe Int64 -- ^ Идентификатор ответа.
  , feedbackCommentDTOParentId :: Maybe Int64 -- ^ Идентификатор родительского ответа.
  , feedbackCommentDTOBody :: Maybe Text -- ^ Текст ответа.
  , feedbackCommentDTOCreatedAt :: Maybe UTCTime -- ^ Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  , feedbackCommentDTOUpdatedAt :: Maybe UTCTime -- ^ Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  , feedbackCommentDTOAuthor :: Maybe FeedbackCommentAuthorDTO -- ^ 
  , feedbackCommentDTOChildren :: Maybe [FeedbackCommentDTO] -- ^ Дочерние ответы.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackCommentDTO where
  parseJSON = genericParseJSON optionsFeedbackCommentDTO
instance ToJSON FeedbackCommentDTO where
  toJSON = genericToJSON optionsFeedbackCommentDTO

optionsFeedbackCommentDTO :: Options
optionsFeedbackCommentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackCommentDTOId", "id")
      , ("feedbackCommentDTOParentId", "parentId")
      , ("feedbackCommentDTOBody", "body")
      , ("feedbackCommentDTOCreatedAt", "createdAt")
      , ("feedbackCommentDTOUpdatedAt", "updatedAt")
      , ("feedbackCommentDTOAuthor", "author")
      , ("feedbackCommentDTOChildren", "children")
      ]


-- | Отзыв пользователя Яндекс Маркета об указанном магазине.
data FeedbackDTO = FeedbackDTO
  { feedbackDTOId :: Maybe Int64 -- ^ Идентификатор отзыва.
  , feedbackDTOCreatedAt :: Maybe UTCTime -- ^ Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  , feedbackDTOText :: Maybe Text -- ^ Комментарий автора отзыва.
  , feedbackDTOState :: Maybe FeedbackStateType -- ^ 
  , feedbackDTOAuthor :: Maybe FeedbackAuthorDTO -- ^ 
  , feedbackDTOPro :: Maybe Text -- ^ Достоинства магазина, описанные в отзыве.
  , feedbackDTOContra :: Maybe Text -- ^ Недостатки магазина, описанные в отзыве.
  , feedbackDTOComments :: [FeedbackCommentDTO] -- ^ Переписка автора отзыва с магазином.
  , feedbackDTOShop :: Maybe FeedbackShopDTO -- ^ 
  , feedbackDTOResolved :: Maybe Bool -- ^ Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
  , feedbackDTOVerified :: Maybe Bool -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
  , feedbackDTORecommend :: Maybe Bool -- ^ Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
  , feedbackDTOGrades :: Maybe FeedbackGradesDTO -- ^ 
  , feedbackDTOOrder :: Maybe FeedbackOrderDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackDTO where
  parseJSON = genericParseJSON optionsFeedbackDTO
instance ToJSON FeedbackDTO where
  toJSON = genericToJSON optionsFeedbackDTO

optionsFeedbackDTO :: Options
optionsFeedbackDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackDTOId", "id")
      , ("feedbackDTOCreatedAt", "createdAt")
      , ("feedbackDTOText", "text")
      , ("feedbackDTOState", "state")
      , ("feedbackDTOAuthor", "author")
      , ("feedbackDTOPro", "pro")
      , ("feedbackDTOContra", "contra")
      , ("feedbackDTOComments", "comments")
      , ("feedbackDTOShop", "shop")
      , ("feedbackDTOResolved", "resolved")
      , ("feedbackDTOVerified", "verified")
      , ("feedbackDTORecommend", "recommend")
      , ("feedbackDTOGrades", "grades")
      , ("feedbackDTOOrder", "order")
      ]


-- | Способ покупки, указанный в отзыве:  * &#x60;DELIVERY&#x60; — доставка. * &#x60;PICKUP&#x60; — самовывоз. * &#x60;INSTORE&#x60; — в магазине. 
data FeedbackDeliveryType = FeedbackDeliveryType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackDeliveryType where
  parseJSON = genericParseJSON optionsFeedbackDeliveryType
instance ToJSON FeedbackDeliveryType where
  toJSON = genericToJSON optionsFeedbackDeliveryType

optionsFeedbackDeliveryType :: Options
optionsFeedbackDeliveryType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр &#x60;delivery&#x60;) указал автор. 
data FeedbackFactorDTO = FeedbackFactorDTO
  { feedbackFactorDTOId :: Maybe Int64 -- ^ Идентификатор параметра.
  , feedbackFactorDTOTitle :: Maybe Text -- ^ Название параметра. Например, `Скорость обработки заказа`.
  , feedbackFactorDTODescription :: Maybe Text -- ^ Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
  , feedbackFactorDTOValue :: Maybe Int -- ^ Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackFactorDTO where
  parseJSON = genericParseJSON optionsFeedbackFactorDTO
instance ToJSON FeedbackFactorDTO where
  toJSON = genericToJSON optionsFeedbackFactorDTO

optionsFeedbackFactorDTO :: Options
optionsFeedbackFactorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackFactorDTOId", "id")
      , ("feedbackFactorDTOTitle", "title")
      , ("feedbackFactorDTODescription", "description")
      , ("feedbackFactorDTOValue", "value")
      ]


-- | Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
data FeedbackGradesDTO = FeedbackGradesDTO
  { feedbackGradesDTOAverage :: Maybe Double -- ^ Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
  , feedbackGradesDTOAgreeCount :: Maybe Int64 -- ^ Количество пользователей, считающих отзыв полезным.
  , feedbackGradesDTORejectCount :: Maybe Int64 -- ^ Количество пользователей, считающих отзыв бесполезным.
  , feedbackGradesDTOFactors :: [FeedbackFactorDTO] -- ^ Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackGradesDTO where
  parseJSON = genericParseJSON optionsFeedbackGradesDTO
instance ToJSON FeedbackGradesDTO where
  toJSON = genericToJSON optionsFeedbackGradesDTO

optionsFeedbackGradesDTO :: Options
optionsFeedbackGradesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackGradesDTOAverage", "average")
      , ("feedbackGradesDTOAgreeCount", "agreeCount")
      , ("feedbackGradesDTORejectCount", "rejectCount")
      , ("feedbackGradesDTOFactors", "factors")
      ]


-- | Отзывы пользователей Яндекс Маркета об указанном магазине.
data FeedbackListDTO = FeedbackListDTO
  { feedbackListDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , feedbackListDTOFeedbackList :: [FeedbackDTO] -- ^ Список отзывов.  Содержит не более 20 отзывов. 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackListDTO where
  parseJSON = genericParseJSON optionsFeedbackListDTO
instance ToJSON FeedbackListDTO where
  toJSON = genericToJSON optionsFeedbackListDTO

optionsFeedbackListDTO :: Options
optionsFeedbackListDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackListDTOPaging", "paging")
      , ("feedbackListDTOFeedbackList", "feedbackList")
      ]


-- | Информация о заказе, указанная в отзыве.
data FeedbackOrderDTO = FeedbackOrderDTO
  { feedbackOrderDTOShopOrderId :: Maybe Text -- ^ Номер заказа, указанный в отзыве.
  , feedbackOrderDTODelivery :: Maybe FeedbackDeliveryType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackOrderDTO where
  parseJSON = genericParseJSON optionsFeedbackOrderDTO
instance ToJSON FeedbackOrderDTO where
  toJSON = genericToJSON optionsFeedbackOrderDTO

optionsFeedbackOrderDTO :: Options
optionsFeedbackOrderDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackOrderDTOShopOrderId", "shopOrderId")
      , ("feedbackOrderDTODelivery", "delivery")
      ]


-- | Статус реакции на отзыв:  * &#x60;ALL&#x60; — все отзывы.  * &#x60;NEED_REACTION&#x60; — отзывы, на которые нужно ответить. 
data FeedbackReactionStatusType = FeedbackReactionStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackReactionStatusType where
  parseJSON = genericParseJSON optionsFeedbackReactionStatusType
instance ToJSON FeedbackReactionStatusType where
  toJSON = genericToJSON optionsFeedbackReactionStatusType

optionsFeedbackReactionStatusType :: Options
optionsFeedbackReactionStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о магазине.
data FeedbackShopDTO = FeedbackShopDTO
  { feedbackShopDTOName :: Maybe Text -- ^ Название магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackShopDTO where
  parseJSON = genericParseJSON optionsFeedbackShopDTO
instance ToJSON FeedbackShopDTO where
  toJSON = genericToJSON optionsFeedbackShopDTO

optionsFeedbackShopDTO :: Options
optionsFeedbackShopDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("feedbackShopDTOName", "name")
      ]


-- | Статус отзыва:  * &#x60;LAST&#x60; — актуален. * &#x60;PREVIOUS&#x60; — устарел. * &#x60;DELETED&#x60; — удален. 
data FeedbackStateType = FeedbackStateType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FeedbackStateType where
  parseJSON = genericParseJSON optionsFeedbackStateType
instance ToJSON FeedbackStateType where
  toJSON = genericToJSON optionsFeedbackStateType

optionsFeedbackStateType :: Options
optionsFeedbackStateType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Фильтр по заполненности или незаполненности поля:  * &#x60;SPECIFIED&#x60; — вывести товары, у которых поле заполнено. * &#x60;EMPTY&#x60; — вывести товары, у которых поле не заполнено. 
data FieldStateType = FieldStateType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FieldStateType where
  parseJSON = genericParseJSON optionsFieldStateType
instance ToJSON FieldStateType where
  toJSON = genericToJSON optionsFieldStateType

optionsFieldStateType :: Options
optionsFieldStateType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Модель для пагинации.
data FlippingPagerDTO = FlippingPagerDTO
  { flippingPagerDTOTotal :: Maybe Int -- ^ Сколько всего найдено элементов.
  , flippingPagerDTOFrom :: Maybe Int -- ^ Начальный номер найденного элемента на странице.
  , flippingPagerDTOTo :: Maybe Int -- ^ Конечный номер найденного элемента на странице.
  , flippingPagerDTOCurrentPage :: Maybe Int -- ^ Текущая страница.
  , flippingPagerDTOPagesCount :: Maybe Int -- ^ Общее количество страниц.
  , flippingPagerDTOPageSize :: Maybe Int -- ^ Размер страницы.
  } deriving (Show, Eq, Generic)

instance FromJSON FlippingPagerDTO where
  parseJSON = genericParseJSON optionsFlippingPagerDTO
instance ToJSON FlippingPagerDTO where
  toJSON = genericToJSON optionsFlippingPagerDTO

optionsFlippingPagerDTO :: Options
optionsFlippingPagerDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("flippingPagerDTOTotal", "total")
      , ("flippingPagerDTOFrom", "from")
      , ("flippingPagerDTOTo", "to")
      , ("flippingPagerDTOCurrentPage", "currentPage")
      , ("flippingPagerDTOPagesCount", "pagesCount")
      , ("flippingPagerDTOPageSize", "pageSize")
      ]


-- | Ссылка на следующую страницу. 
data ForwardScrollingPagerDTO = ForwardScrollingPagerDTO
  { forwardScrollingPagerDTONextPageToken :: Maybe Text -- ^ Идентификатор следующей страницы результатов.
  } deriving (Show, Eq, Generic)

instance FromJSON ForwardScrollingPagerDTO where
  parseJSON = genericParseJSON optionsForwardScrollingPagerDTO
instance ToJSON ForwardScrollingPagerDTO where
  toJSON = genericToJSON optionsForwardScrollingPagerDTO

optionsForwardScrollingPagerDTO :: Options
optionsForwardScrollingPagerDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("forwardScrollingPagerDTONextPageToken", "nextPageToken")
      ]


-- | Склад Маркета (FBY).
data FulfillmentWarehouseDTO = FulfillmentWarehouseDTO
  { fulfillmentWarehouseDTOId :: Int64 -- ^ Идентификатор склада.
  , fulfillmentWarehouseDTOName :: Text -- ^ Название склада.
  , fulfillmentWarehouseDTOAddress :: Maybe WarehouseAddressDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FulfillmentWarehouseDTO where
  parseJSON = genericParseJSON optionsFulfillmentWarehouseDTO
instance ToJSON FulfillmentWarehouseDTO where
  toJSON = genericToJSON optionsFulfillmentWarehouseDTO

optionsFulfillmentWarehouseDTO :: Options
optionsFulfillmentWarehouseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fulfillmentWarehouseDTOId", "id")
      , ("fulfillmentWarehouseDTOName", "name")
      , ("fulfillmentWarehouseDTOAddress", "address")
      ]


-- | Список складов Маркета (FBY).
data FulfillmentWarehousesDTO = FulfillmentWarehousesDTO
  { fulfillmentWarehousesDTOWarehouses :: [FulfillmentWarehouseDTO] -- ^ Список складов Маркета (FBY).
  } deriving (Show, Eq, Generic)

instance FromJSON FulfillmentWarehousesDTO where
  parseJSON = genericParseJSON optionsFulfillmentWarehousesDTO
instance ToJSON FulfillmentWarehousesDTO where
  toJSON = genericToJSON optionsFulfillmentWarehousesDTO

optionsFulfillmentWarehousesDTO :: Options
optionsFulfillmentWarehousesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fulfillmentWarehousesDTOWarehouses", "warehouses")
      ]


-- | Информация о точке продаж.
data FullOutletDTO = FullOutletDTO
  { fullOutletDTOName :: Text -- ^ Название точки продаж. 
  , fullOutletDTOType :: OutletType -- ^ 
  , fullOutletDTOCoords :: Maybe Text -- ^ Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  , fullOutletDTOIsMain :: Maybe Bool -- ^ Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  , fullOutletDTOShopOutletCode :: Maybe Text -- ^ Идентификатор точки продаж, присвоенный магазином.
  , fullOutletDTOVisibility :: Maybe OutletVisibilityType -- ^ 
  , fullOutletDTOAddress :: OutletAddressDTO -- ^ 
  , fullOutletDTOPhones :: [Text] -- ^ Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  , fullOutletDTOWorkingSchedule :: OutletWorkingScheduleDTO -- ^ 
  , fullOutletDTODeliveryRules :: Maybe [OutletDeliveryRuleDTO] -- ^ Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  , fullOutletDTOStoragePeriod :: Maybe Int64 -- ^ Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  , fullOutletDTOId :: Maybe Int64 -- ^ Идентификатор точки продаж, присвоенный Маркетом.
  , fullOutletDTOStatus :: Maybe OutletStatusType -- ^ 
  , fullOutletDTORegion :: Maybe RegionDTO -- ^ 
  , fullOutletDTOShopOutletId :: Maybe Text -- ^ Идентификатор точки продаж, заданный магазином.
  , fullOutletDTOWorkingTime :: Maybe Text -- ^ Рабочее время.
  , fullOutletDTOModerationReason :: Maybe Text -- ^ Статус модерации.
  } deriving (Show, Eq, Generic)

instance FromJSON FullOutletDTO where
  parseJSON = genericParseJSON optionsFullOutletDTO
instance ToJSON FullOutletDTO where
  toJSON = genericToJSON optionsFullOutletDTO

optionsFullOutletDTO :: Options
optionsFullOutletDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fullOutletDTOName", "name")
      , ("fullOutletDTOType", "type")
      , ("fullOutletDTOCoords", "coords")
      , ("fullOutletDTOIsMain", "isMain")
      , ("fullOutletDTOShopOutletCode", "shopOutletCode")
      , ("fullOutletDTOVisibility", "visibility")
      , ("fullOutletDTOAddress", "address")
      , ("fullOutletDTOPhones", "phones")
      , ("fullOutletDTOWorkingSchedule", "workingSchedule")
      , ("fullOutletDTODeliveryRules", "deliveryRules")
      , ("fullOutletDTOStoragePeriod", "storagePeriod")
      , ("fullOutletDTOId", "id")
      , ("fullOutletDTOStatus", "status")
      , ("fullOutletDTORegion", "region")
      , ("fullOutletDTOShopOutletId", "shopOutletId")
      , ("fullOutletDTOWorkingTime", "workingTime")
      , ("fullOutletDTOModerationReason", "moderationReason")
      ]


-- | Информация о лицензии.
data FullOutletLicenseDTO = FullOutletLicenseDTO
  { fullOutletLicenseDTOId :: Maybe Int64 -- ^ Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
  , fullOutletLicenseDTOOutletId :: Maybe Int64 -- ^ Идентификатор точки продаж, для которой действительна лицензия.
  , fullOutletLicenseDTOLicenseType :: Maybe LicenseType -- ^ 
  , fullOutletLicenseDTONumber :: Maybe Text -- ^ Номер лицензии.
  , fullOutletLicenseDTODateOfIssue :: Maybe UTCTime -- ^ Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
  , fullOutletLicenseDTODateOfExpiry :: Maybe UTCTime -- ^ Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
  , fullOutletLicenseDTOCheckStatus :: Maybe LicenseCheckStatusType -- ^ 
  , fullOutletLicenseDTOCheckComment :: Maybe Text -- ^ Причина, по которой лицензия не прошла проверку.  Параметр возвращается, только если параметр `checkStatus` имеет значение `FAIL`. 
  } deriving (Show, Eq, Generic)

instance FromJSON FullOutletLicenseDTO where
  parseJSON = genericParseJSON optionsFullOutletLicenseDTO
instance ToJSON FullOutletLicenseDTO where
  toJSON = genericToJSON optionsFullOutletLicenseDTO

optionsFullOutletLicenseDTO :: Options
optionsFullOutletLicenseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fullOutletLicenseDTOId", "id")
      , ("fullOutletLicenseDTOOutletId", "outletId")
      , ("fullOutletLicenseDTOLicenseType", "licenseType")
      , ("fullOutletLicenseDTONumber", "number")
      , ("fullOutletLicenseDTODateOfIssue", "dateOfIssue")
      , ("fullOutletLicenseDTODateOfExpiry", "dateOfExpiry")
      , ("fullOutletLicenseDTOCheckStatus", "checkStatus")
      , ("fullOutletLicenseDTOCheckComment", "checkComment")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateBoostConsolidatedRequest = GenerateBoostConsolidatedRequest
  { generateBoostConsolidatedRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateBoostConsolidatedRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateBoostConsolidatedRequestDateTo :: Day -- ^ Конец периода, включительно.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateBoostConsolidatedRequest where
  parseJSON = genericParseJSON optionsGenerateBoostConsolidatedRequest
instance ToJSON GenerateBoostConsolidatedRequest where
  toJSON = genericToJSON optionsGenerateBoostConsolidatedRequest

optionsGenerateBoostConsolidatedRequest :: Options
optionsGenerateBoostConsolidatedRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateBoostConsolidatedRequestBusinessId", "businessId")
      , ("generateBoostConsolidatedRequestDateFrom", "dateFrom")
      , ("generateBoostConsolidatedRequestDateTo", "dateTo")
      ]


-- | Данные, необходимые для генерации отчета.
data GenerateCompetitorsPositionReportRequest = GenerateCompetitorsPositionReportRequest
  { generateCompetitorsPositionReportRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateCompetitorsPositionReportRequestCategoryId :: Int64 -- ^ Идентификатор категории.
  , generateCompetitorsPositionReportRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateCompetitorsPositionReportRequestDateTo :: Day -- ^ Конец периода, включительно.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateCompetitorsPositionReportRequest where
  parseJSON = genericParseJSON optionsGenerateCompetitorsPositionReportRequest
instance ToJSON GenerateCompetitorsPositionReportRequest where
  toJSON = genericToJSON optionsGenerateCompetitorsPositionReportRequest

optionsGenerateCompetitorsPositionReportRequest :: Options
optionsGenerateCompetitorsPositionReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateCompetitorsPositionReportRequestBusinessId", "businessId")
      , ("generateCompetitorsPositionReportRequestCategoryId", "categoryId")
      , ("generateCompetitorsPositionReportRequestDateFrom", "dateFrom")
      , ("generateCompetitorsPositionReportRequestDateTo", "dateTo")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateGoodsFeedbackRequest = GenerateGoodsFeedbackRequest
  { generateGoodsFeedbackRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateGoodsFeedbackRequest where
  parseJSON = genericParseJSON optionsGenerateGoodsFeedbackRequest
instance ToJSON GenerateGoodsFeedbackRequest where
  toJSON = genericToJSON optionsGenerateGoodsFeedbackRequest

optionsGenerateGoodsFeedbackRequest :: Options
optionsGenerateGoodsFeedbackRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateGoodsFeedbackRequestBusinessId", "businessId")
      ]


-- | Данные, необходимые для генерации отчета.
data GenerateGoodsMovementReportRequest = GenerateGoodsMovementReportRequest
  { generateGoodsMovementReportRequestCampaignId :: Int64 -- ^ Идентификатор кампании.
  , generateGoodsMovementReportRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateGoodsMovementReportRequestDateTo :: Day -- ^ Конец периода, включительно.
  , generateGoodsMovementReportRequestShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateGoodsMovementReportRequest where
  parseJSON = genericParseJSON optionsGenerateGoodsMovementReportRequest
instance ToJSON GenerateGoodsMovementReportRequest where
  toJSON = genericToJSON optionsGenerateGoodsMovementReportRequest

optionsGenerateGoodsMovementReportRequest :: Options
optionsGenerateGoodsMovementReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateGoodsMovementReportRequestCampaignId", "campaignId")
      , ("generateGoodsMovementReportRequestDateFrom", "dateFrom")
      , ("generateGoodsMovementReportRequestDateTo", "dateTo")
      , ("generateGoodsMovementReportRequestShopSku", "shopSku")
      ]


-- | Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
data GenerateGoodsRealizationReportRequest = GenerateGoodsRealizationReportRequest
  { generateGoodsRealizationReportRequestCampaignId :: Int64 -- ^ Идентификатор кампании.
  , generateGoodsRealizationReportRequestYear :: Int -- ^ Год.
  , generateGoodsRealizationReportRequestMonth :: Int -- ^ Номер месяца.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateGoodsRealizationReportRequest where
  parseJSON = genericParseJSON optionsGenerateGoodsRealizationReportRequest
instance ToJSON GenerateGoodsRealizationReportRequest where
  toJSON = genericToJSON optionsGenerateGoodsRealizationReportRequest

optionsGenerateGoodsRealizationReportRequest :: Options
optionsGenerateGoodsRealizationReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateGoodsRealizationReportRequestCampaignId", "campaignId")
      , ("generateGoodsRealizationReportRequestYear", "year")
      , ("generateGoodsRealizationReportRequestMonth", "month")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateGoodsTurnoverRequest = GenerateGoodsTurnoverRequest
  { generateGoodsTurnoverRequestCampaignId :: Int64 -- ^ Идентификатор кампании.
  , generateGoodsTurnoverRequestDate :: Maybe Day -- ^ Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateGoodsTurnoverRequest where
  parseJSON = genericParseJSON optionsGenerateGoodsTurnoverRequest
instance ToJSON GenerateGoodsTurnoverRequest where
  toJSON = genericToJSON optionsGenerateGoodsTurnoverRequest

optionsGenerateGoodsTurnoverRequest :: Options
optionsGenerateGoodsTurnoverRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateGoodsTurnoverRequestCampaignId", "campaignId")
      , ("generateGoodsTurnoverRequestDate", "date")
      ]


-- | Данные, необходимые для генерации файла. 
data GenerateMassOrderLabelsRequest = GenerateMassOrderLabelsRequest
  { generateMassOrderLabelsRequestBusinessId :: Int64 -- ^ Идентификатор кабинета.
  , generateMassOrderLabelsRequestOrderIds :: [Int64] -- ^ Список идентификаторов заказов.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateMassOrderLabelsRequest where
  parseJSON = genericParseJSON optionsGenerateMassOrderLabelsRequest
instance ToJSON GenerateMassOrderLabelsRequest where
  toJSON = genericToJSON optionsGenerateMassOrderLabelsRequest

optionsGenerateMassOrderLabelsRequest :: Options
optionsGenerateMassOrderLabelsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateMassOrderLabelsRequestBusinessId", "businessId")
      , ("generateMassOrderLabelsRequestOrderIds", "orderIds")
      ]


-- | Данные, необходимые для генерации отчета.
data GeneratePricesReportRequest = GeneratePricesReportRequest
  { generatePricesReportRequestBusinessId :: Maybe Int64 -- ^ Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан `campaignId`. 
  , generatePricesReportRequestCampaignId :: Maybe Int64 -- ^ Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать `businessId` не нужно. 
  , generatePricesReportRequestCategoryIds :: Maybe [Int64] -- ^ Фильтр по категориям на Маркете.
  , generatePricesReportRequestCreationDateFrom :: Maybe Day -- ^ Фильтр по времени появления предложения — начало периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  , generatePricesReportRequestCreationDateTo :: Maybe Day -- ^ Фильтр по времени появления предложения — окончание периода.  Формат даты: `ДД-ММ-ГГГГ`. 
  } deriving (Show, Eq, Generic)

instance FromJSON GeneratePricesReportRequest where
  parseJSON = genericParseJSON optionsGeneratePricesReportRequest
instance ToJSON GeneratePricesReportRequest where
  toJSON = genericToJSON optionsGeneratePricesReportRequest

optionsGeneratePricesReportRequest :: Options
optionsGeneratePricesReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generatePricesReportRequestBusinessId", "businessId")
      , ("generatePricesReportRequestCampaignId", "campaignId")
      , ("generatePricesReportRequestCategoryIds", "categoryIds")
      , ("generatePricesReportRequestCreationDateFrom", "creationDateFrom")
      , ("generatePricesReportRequestCreationDateTo", "creationDateTo")
      ]


-- | Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
data GenerateReportDTO = GenerateReportDTO
  { generateReportDTOReportId :: Text -- ^ Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  , generateReportDTOEstimatedGenerationTime :: Int64 -- ^ Ожидаемая продолжительность генерации в миллисекундах.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateReportDTO where
  parseJSON = genericParseJSON optionsGenerateReportDTO
instance ToJSON GenerateReportDTO where
  toJSON = genericToJSON optionsGenerateReportDTO

optionsGenerateReportDTO :: Options
optionsGenerateReportDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateReportDTOReportId", "reportId")
      , ("generateReportDTOEstimatedGenerationTime", "estimatedGenerationTime")
      ]


-- | Ответ на запрос генерации отчета.
data GenerateReportResponse = GenerateReportResponse
  { generateReportResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , generateReportResponseResult :: Maybe GenerateReportDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateReportResponse where
  parseJSON = genericParseJSON optionsGenerateReportResponse
instance ToJSON GenerateReportResponse where
  toJSON = genericToJSON optionsGenerateReportResponse

optionsGenerateReportResponse :: Options
optionsGenerateReportResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateReportResponseStatus", "status")
      , ("generateReportResponseResult", "result")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateShelfsStatisticsRequest = GenerateShelfsStatisticsRequest
  { generateShelfsStatisticsRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateShelfsStatisticsRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateShelfsStatisticsRequestDateTo :: Day -- ^ Конец периода, включительно.
  , generateShelfsStatisticsRequestAttributionType :: ShelfsStatisticsAttributionType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateShelfsStatisticsRequest where
  parseJSON = genericParseJSON optionsGenerateShelfsStatisticsRequest
instance ToJSON GenerateShelfsStatisticsRequest where
  toJSON = genericToJSON optionsGenerateShelfsStatisticsRequest

optionsGenerateShelfsStatisticsRequest :: Options
optionsGenerateShelfsStatisticsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateShelfsStatisticsRequestBusinessId", "businessId")
      , ("generateShelfsStatisticsRequestDateFrom", "dateFrom")
      , ("generateShelfsStatisticsRequestDateTo", "dateTo")
      , ("generateShelfsStatisticsRequestAttributionType", "attributionType")
      ]


-- | Данные, необходимые для генерации документа. 
data GenerateShipmentListDocumentReportRequest = GenerateShipmentListDocumentReportRequest
  { generateShipmentListDocumentReportRequestCampaignId :: Int64 -- ^ Идентификатор кампании.
  , generateShipmentListDocumentReportRequestShipmentId :: Maybe Int64 -- ^ Идентификатор отгрузки.
  , generateShipmentListDocumentReportRequestOrderIds :: Maybe [Int64] -- ^ Фильтр по идентификаторам заказа в отгрузке.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateShipmentListDocumentReportRequest where
  parseJSON = genericParseJSON optionsGenerateShipmentListDocumentReportRequest
instance ToJSON GenerateShipmentListDocumentReportRequest where
  toJSON = genericToJSON optionsGenerateShipmentListDocumentReportRequest

optionsGenerateShipmentListDocumentReportRequest :: Options
optionsGenerateShipmentListDocumentReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateShipmentListDocumentReportRequestCampaignId", "campaignId")
      , ("generateShipmentListDocumentReportRequestShipmentId", "shipmentId")
      , ("generateShipmentListDocumentReportRequestOrderIds", "orderIds")
      ]


-- | Данные, необходимые для генерации отчета.
data GenerateShowsSalesReportRequest = GenerateShowsSalesReportRequest
  { generateShowsSalesReportRequestBusinessId :: Maybe Int64 -- ^ Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  , generateShowsSalesReportRequestCampaignId :: Maybe Int64 -- ^ Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
  , generateShowsSalesReportRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateShowsSalesReportRequestDateTo :: Day -- ^ Конец периода, включительно.
  , generateShowsSalesReportRequestGrouping :: ShowsSalesGroupingType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateShowsSalesReportRequest where
  parseJSON = genericParseJSON optionsGenerateShowsSalesReportRequest
instance ToJSON GenerateShowsSalesReportRequest where
  toJSON = genericToJSON optionsGenerateShowsSalesReportRequest

optionsGenerateShowsSalesReportRequest :: Options
optionsGenerateShowsSalesReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateShowsSalesReportRequestBusinessId", "businessId")
      , ("generateShowsSalesReportRequestCampaignId", "campaignId")
      , ("generateShowsSalesReportRequestDateFrom", "dateFrom")
      , ("generateShowsSalesReportRequestDateTo", "dateTo")
      , ("generateShowsSalesReportRequestGrouping", "grouping")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateStocksOnWarehousesReportRequest = GenerateStocksOnWarehousesReportRequest
  { generateStocksOnWarehousesReportRequestCampaignId :: Int64 -- ^ Идентификатор магазина.
  , generateStocksOnWarehousesReportRequestWarehouseIds :: Maybe [Int64] -- ^ Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
  , generateStocksOnWarehousesReportRequestReportDate :: Maybe Day -- ^ Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
  , generateStocksOnWarehousesReportRequestCategoryIds :: Maybe [Int64] -- ^ Фильтр по категориям на Маркете (кроме модели FBY).
  , generateStocksOnWarehousesReportRequestHasStocks :: Maybe Bool -- ^ Фильтр по наличию остатков (кроме модели FBY).
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateStocksOnWarehousesReportRequest where
  parseJSON = genericParseJSON optionsGenerateStocksOnWarehousesReportRequest
instance ToJSON GenerateStocksOnWarehousesReportRequest where
  toJSON = genericToJSON optionsGenerateStocksOnWarehousesReportRequest

optionsGenerateStocksOnWarehousesReportRequest :: Options
optionsGenerateStocksOnWarehousesReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateStocksOnWarehousesReportRequestCampaignId", "campaignId")
      , ("generateStocksOnWarehousesReportRequestWarehouseIds", "warehouseIds")
      , ("generateStocksOnWarehousesReportRequestReportDate", "reportDate")
      , ("generateStocksOnWarehousesReportRequestCategoryIds", "categoryIds")
      , ("generateStocksOnWarehousesReportRequestHasStocks", "hasStocks")
      ]


-- | Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
data GenerateUnitedMarketplaceServicesReportRequest = GenerateUnitedMarketplaceServicesReportRequest
  { generateUnitedMarketplaceServicesReportRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateUnitedMarketplaceServicesReportRequestDateTimeFrom :: Maybe UTCTime -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  , generateUnitedMarketplaceServicesReportRequestDateTimeTo :: Maybe UTCTime -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  , generateUnitedMarketplaceServicesReportRequestDateFrom :: Maybe Day -- ^ Начало периода, включительно.
  , generateUnitedMarketplaceServicesReportRequestDateTo :: Maybe Day -- ^ Конец периода, включительно. Максимальный период — 1 год.
  , generateUnitedMarketplaceServicesReportRequestYearFrom :: Maybe Int -- ^ Начальный год формирования акта.
  , generateUnitedMarketplaceServicesReportRequestMonthFrom :: Maybe Int -- ^ Начальный номер месяца формирования акта.
  , generateUnitedMarketplaceServicesReportRequestYearTo :: Maybe Int -- ^ Конечный год формирования акта.
  , generateUnitedMarketplaceServicesReportRequestMonthTo :: Maybe Int -- ^ Конечный номер месяца формирования акта.
  , generateUnitedMarketplaceServicesReportRequestPlacementPrograms :: Maybe [PlacementType] -- ^ Список моделей, которые нужны в отчете. 
  , generateUnitedMarketplaceServicesReportRequestInns :: Maybe [Text] -- ^ Список ИНН, которые нужны в отчете.
  , generateUnitedMarketplaceServicesReportRequestCampaignIds :: Maybe [Int64] -- ^ Список магазинов, которые нужны в отчете.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateUnitedMarketplaceServicesReportRequest where
  parseJSON = genericParseJSON optionsGenerateUnitedMarketplaceServicesReportRequest
instance ToJSON GenerateUnitedMarketplaceServicesReportRequest where
  toJSON = genericToJSON optionsGenerateUnitedMarketplaceServicesReportRequest

optionsGenerateUnitedMarketplaceServicesReportRequest :: Options
optionsGenerateUnitedMarketplaceServicesReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateUnitedMarketplaceServicesReportRequestBusinessId", "businessId")
      , ("generateUnitedMarketplaceServicesReportRequestDateTimeFrom", "dateTimeFrom")
      , ("generateUnitedMarketplaceServicesReportRequestDateTimeTo", "dateTimeTo")
      , ("generateUnitedMarketplaceServicesReportRequestDateFrom", "dateFrom")
      , ("generateUnitedMarketplaceServicesReportRequestDateTo", "dateTo")
      , ("generateUnitedMarketplaceServicesReportRequestYearFrom", "yearFrom")
      , ("generateUnitedMarketplaceServicesReportRequestMonthFrom", "monthFrom")
      , ("generateUnitedMarketplaceServicesReportRequestYearTo", "yearTo")
      , ("generateUnitedMarketplaceServicesReportRequestMonthTo", "monthTo")
      , ("generateUnitedMarketplaceServicesReportRequestPlacementPrograms", "placementPrograms")
      , ("generateUnitedMarketplaceServicesReportRequestInns", "inns")
      , ("generateUnitedMarketplaceServicesReportRequestCampaignIds", "campaignIds")
      ]


-- | Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
data GenerateUnitedNettingReportRequest = GenerateUnitedNettingReportRequest
  { generateUnitedNettingReportRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateUnitedNettingReportRequestDateTimeFrom :: Maybe UTCTime -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
  , generateUnitedNettingReportRequestDateTimeTo :: Maybe UTCTime -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
  , generateUnitedNettingReportRequestDateFrom :: Maybe Day -- ^ Начало периода, включительно.
  , generateUnitedNettingReportRequestDateTo :: Maybe Day -- ^ Конец периода, включительно. Максимальный период — 1 год.
  , generateUnitedNettingReportRequestBankOrderId :: Maybe Int64 -- ^ Номер платежного поручения.
  , generateUnitedNettingReportRequestBankOrderDateTime :: Maybe UTCTime -- ^ Дата платежного поручения.
  , generateUnitedNettingReportRequestPlacementPrograms :: Maybe [PlacementType] -- ^ Список моделей, которые нужны в отчете. 
  , generateUnitedNettingReportRequestInns :: Maybe [Text] -- ^ Список ИНН, которые нужны в отчете.
  , generateUnitedNettingReportRequestCampaignIds :: Maybe [Int64] -- ^ Список магазинов, которые нужны в отчете.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateUnitedNettingReportRequest where
  parseJSON = genericParseJSON optionsGenerateUnitedNettingReportRequest
instance ToJSON GenerateUnitedNettingReportRequest where
  toJSON = genericToJSON optionsGenerateUnitedNettingReportRequest

optionsGenerateUnitedNettingReportRequest :: Options
optionsGenerateUnitedNettingReportRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateUnitedNettingReportRequestBusinessId", "businessId")
      , ("generateUnitedNettingReportRequestDateTimeFrom", "dateTimeFrom")
      , ("generateUnitedNettingReportRequestDateTimeTo", "dateTimeTo")
      , ("generateUnitedNettingReportRequestDateFrom", "dateFrom")
      , ("generateUnitedNettingReportRequestDateTo", "dateTo")
      , ("generateUnitedNettingReportRequestBankOrderId", "bankOrderId")
      , ("generateUnitedNettingReportRequestBankOrderDateTime", "bankOrderDateTime")
      , ("generateUnitedNettingReportRequestPlacementPrograms", "placementPrograms")
      , ("generateUnitedNettingReportRequestInns", "inns")
      , ("generateUnitedNettingReportRequestCampaignIds", "campaignIds")
      ]


-- | Данные, необходимые для генерации отчета. 
data GenerateUnitedOrdersRequest = GenerateUnitedOrdersRequest
  { generateUnitedOrdersRequestBusinessId :: Int64 -- ^ Идентификатор бизнеса.
  , generateUnitedOrdersRequestDateFrom :: Day -- ^ Начало периода, включительно.
  , generateUnitedOrdersRequestDateTo :: Day -- ^ Конец периода, включительно. Максимальный период — 1 год.
  , generateUnitedOrdersRequestCampaignIds :: Maybe [Int64] -- ^ Список магазинов, которые нужны в отчете.
  , generateUnitedOrdersRequestPromoId :: Maybe Text -- ^ Идентификатор акции, товары из которой нужны в отчете.
  } deriving (Show, Eq, Generic)

instance FromJSON GenerateUnitedOrdersRequest where
  parseJSON = genericParseJSON optionsGenerateUnitedOrdersRequest
instance ToJSON GenerateUnitedOrdersRequest where
  toJSON = genericToJSON optionsGenerateUnitedOrdersRequest

optionsGenerateUnitedOrdersRequest :: Options
optionsGenerateUnitedOrdersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("generateUnitedOrdersRequestBusinessId", "businessId")
      , ("generateUnitedOrdersRequestDateFrom", "dateFrom")
      , ("generateUnitedOrdersRequestDateTo", "dateTo")
      , ("generateUnitedOrdersRequestCampaignIds", "campaignIds")
      , ("generateUnitedOrdersRequestPromoId", "promoId")
      ]


-- | Список предложений.
data GetAllOffersResponse = GetAllOffersResponse
  { getAllOffersResponseOffers :: [OfferDTO] -- ^ Список предложений магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON GetAllOffersResponse where
  parseJSON = genericParseJSON optionsGetAllOffersResponse
instance ToJSON GetAllOffersResponse where
  toJSON = genericToJSON optionsGetAllOffersResponse

optionsGetAllOffersResponse :: Options
optionsGetAllOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getAllOffersResponseOffers", "offers")
      ]


-- | description.
data GetBidsInfoRequest = GetBidsInfoRequest
  { getBidsInfoRequestSkus :: Maybe [Text] -- ^ Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsInfoRequest where
  parseJSON = genericParseJSON optionsGetBidsInfoRequest
instance ToJSON GetBidsInfoRequest where
  toJSON = genericToJSON optionsGetBidsInfoRequest

optionsGetBidsInfoRequest :: Options
optionsGetBidsInfoRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsInfoRequestSkus", "skus")
      ]


-- | description.
data GetBidsInfoResponse = GetBidsInfoResponse
  { getBidsInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getBidsInfoResponseResult :: Maybe GetBidsInfoResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsInfoResponse where
  parseJSON = genericParseJSON optionsGetBidsInfoResponse
instance ToJSON GetBidsInfoResponse where
  toJSON = genericToJSON optionsGetBidsInfoResponse

optionsGetBidsInfoResponse :: Options
optionsGetBidsInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsInfoResponseStatus", "status")
      , ("getBidsInfoResponseResult", "result")
      ]


-- | Список товаров с указанными ставками.
data GetBidsInfoResponseDTO = GetBidsInfoResponseDTO
  { getBidsInfoResponseDTOBids :: [SkuBidItemDTO] -- ^ Страница списка товаров.
  , getBidsInfoResponseDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsInfoResponseDTO where
  parseJSON = genericParseJSON optionsGetBidsInfoResponseDTO
instance ToJSON GetBidsInfoResponseDTO where
  toJSON = genericToJSON optionsGetBidsInfoResponseDTO

optionsGetBidsInfoResponseDTO :: Options
optionsGetBidsInfoResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsInfoResponseDTOBids", "bids")
      , ("getBidsInfoResponseDTOPaging", "paging")
      ]


-- | description.
data GetBidsRecommendationsRequest = GetBidsRecommendationsRequest
  { getBidsRecommendationsRequestSkus :: [Text] -- ^ Список товаров, для которых нужно получить рекомендации по ставкам. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsRecommendationsRequest where
  parseJSON = genericParseJSON optionsGetBidsRecommendationsRequest
instance ToJSON GetBidsRecommendationsRequest where
  toJSON = genericToJSON optionsGetBidsRecommendationsRequest

optionsGetBidsRecommendationsRequest :: Options
optionsGetBidsRecommendationsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsRecommendationsRequestSkus", "skus")
      ]


-- | description.
data GetBidsRecommendationsResponse = GetBidsRecommendationsResponse
  { getBidsRecommendationsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getBidsRecommendationsResponseResult :: Maybe GetBidsRecommendationsResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsRecommendationsResponse where
  parseJSON = genericParseJSON optionsGetBidsRecommendationsResponse
instance ToJSON GetBidsRecommendationsResponse where
  toJSON = genericToJSON optionsGetBidsRecommendationsResponse

optionsGetBidsRecommendationsResponse :: Options
optionsGetBidsRecommendationsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsRecommendationsResponseStatus", "status")
      , ("getBidsRecommendationsResponseResult", "result")
      ]


-- | Список товаров с рекомендованными ставками.
data GetBidsRecommendationsResponseDTO = GetBidsRecommendationsResponseDTO
  { getBidsRecommendationsResponseDTORecommendations :: [SkuBidRecommendationItemDTO] -- ^ Список товаров с рекомендованными ставками.
  } deriving (Show, Eq, Generic)

instance FromJSON GetBidsRecommendationsResponseDTO where
  parseJSON = genericParseJSON optionsGetBidsRecommendationsResponseDTO
instance ToJSON GetBidsRecommendationsResponseDTO where
  toJSON = genericToJSON optionsGetBidsRecommendationsResponseDTO

optionsGetBidsRecommendationsResponseDTO :: Options
optionsGetBidsRecommendationsResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBidsRecommendationsResponseDTORecommendations", "recommendations")
      ]


-- | 
data GetBusinessBuyerInfoResponse = GetBusinessBuyerInfoResponse
  { getBusinessBuyerInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getBusinessBuyerInfoResponseResult :: Maybe OrderBusinessBuyerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBusinessBuyerInfoResponse where
  parseJSON = genericParseJSON optionsGetBusinessBuyerInfoResponse
instance ToJSON GetBusinessBuyerInfoResponse where
  toJSON = genericToJSON optionsGetBusinessBuyerInfoResponse

optionsGetBusinessBuyerInfoResponse :: Options
optionsGetBusinessBuyerInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBusinessBuyerInfoResponseStatus", "status")
      , ("getBusinessBuyerInfoResponseResult", "result")
      ]


-- | 
data GetBusinessDocumentsInfoResponse = GetBusinessDocumentsInfoResponse
  { getBusinessDocumentsInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getBusinessDocumentsInfoResponseResult :: Maybe OrderBusinessDocumentsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBusinessDocumentsInfoResponse where
  parseJSON = genericParseJSON optionsGetBusinessDocumentsInfoResponse
instance ToJSON GetBusinessDocumentsInfoResponse where
  toJSON = genericToJSON optionsGetBusinessDocumentsInfoResponse

optionsGetBusinessDocumentsInfoResponse :: Options
optionsGetBusinessDocumentsInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBusinessDocumentsInfoResponseStatus", "status")
      , ("getBusinessDocumentsInfoResponseResult", "result")
      ]


-- | Информация о кабинете и его настройках.
data GetBusinessSettingsInfoDTO = GetBusinessSettingsInfoDTO
  { getBusinessSettingsInfoDTOInfo :: Maybe BusinessDTO -- ^ 
  , getBusinessSettingsInfoDTOSettings :: Maybe BusinessSettingsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBusinessSettingsInfoDTO where
  parseJSON = genericParseJSON optionsGetBusinessSettingsInfoDTO
instance ToJSON GetBusinessSettingsInfoDTO where
  toJSON = genericToJSON optionsGetBusinessSettingsInfoDTO

optionsGetBusinessSettingsInfoDTO :: Options
optionsGetBusinessSettingsInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBusinessSettingsInfoDTOInfo", "info")
      , ("getBusinessSettingsInfoDTOSettings", "settings")
      ]


-- | Ответ на запрос настроек кабинета.
data GetBusinessSettingsResponse = GetBusinessSettingsResponse
  { getBusinessSettingsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getBusinessSettingsResponseResult :: Maybe GetBusinessSettingsInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetBusinessSettingsResponse where
  parseJSON = genericParseJSON optionsGetBusinessSettingsResponse
instance ToJSON GetBusinessSettingsResponse where
  toJSON = genericToJSON optionsGetBusinessSettingsResponse

optionsGetBusinessSettingsResponse :: Options
optionsGetBusinessSettingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getBusinessSettingsResponseStatus", "status")
      , ("getBusinessSettingsResponseResult", "result")
      ]


-- | Ответ на запрос списка логинов, связанных с магазином.
data GetCampaignLoginsResponse = GetCampaignLoginsResponse
  { getCampaignLoginsResponseLogins :: [Text] -- ^ Список логинов.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignLoginsResponse where
  parseJSON = genericParseJSON optionsGetCampaignLoginsResponse
instance ToJSON GetCampaignLoginsResponse where
  toJSON = genericToJSON optionsGetCampaignLoginsResponse

optionsGetCampaignLoginsResponse :: Options
optionsGetCampaignLoginsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignLoginsResponseLogins", "logins")
      ]


-- | Параметры размещения товара в магазине.
data GetCampaignOfferDTO = GetCampaignOfferDTO
  { getCampaignOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , getCampaignOfferDTOQuantum :: Maybe QuantumDTO -- ^ 
  , getCampaignOfferDTOAvailable :: Maybe Bool -- ^ Есть ли товар в продаже. 
  , getCampaignOfferDTOBasicPrice :: Maybe GetPriceWithDiscountDTO -- ^ 
  , getCampaignOfferDTOCampaignPrice :: Maybe GetPriceWithVatDTO -- ^ 
  , getCampaignOfferDTOStatus :: Maybe OfferCampaignStatusType -- ^ 
  , getCampaignOfferDTOErrors :: Maybe [OfferErrorDTO] -- ^ Ошибки, препятствующие размещению товара на витрине. 
  , getCampaignOfferDTOWarnings :: Maybe [OfferErrorDTO] -- ^ Предупреждения, не препятствующие размещению товара на витрине. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignOfferDTO where
  parseJSON = genericParseJSON optionsGetCampaignOfferDTO
instance ToJSON GetCampaignOfferDTO where
  toJSON = genericToJSON optionsGetCampaignOfferDTO

optionsGetCampaignOfferDTO :: Options
optionsGetCampaignOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignOfferDTOOfferId", "offerId")
      , ("getCampaignOfferDTOQuantum", "quantum")
      , ("getCampaignOfferDTOAvailable", "available")
      , ("getCampaignOfferDTOBasicPrice", "basicPrice")
      , ("getCampaignOfferDTOCampaignPrice", "campaignPrice")
      , ("getCampaignOfferDTOStatus", "status")
      , ("getCampaignOfferDTOErrors", "errors")
      , ("getCampaignOfferDTOWarnings", "warnings")
      ]


-- | Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
data GetCampaignOffersRequest = GetCampaignOffersRequest
  { getCampaignOffersRequestOfferIds :: Maybe [Text] -- ^ Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  , getCampaignOffersRequestStatuses :: Maybe [OfferCampaignStatusType] -- ^ Фильтр по статусам товаров. 
  , getCampaignOffersRequestCategoryIds :: Maybe [Int] -- ^ Фильтр по категориям на Маркете.
  , getCampaignOffersRequestVendorNames :: Maybe [Text] -- ^ Фильтр по брендам.
  , getCampaignOffersRequestTags :: Maybe [Text] -- ^ Фильтр по тегам.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignOffersRequest where
  parseJSON = genericParseJSON optionsGetCampaignOffersRequest
instance ToJSON GetCampaignOffersRequest where
  toJSON = genericToJSON optionsGetCampaignOffersRequest

optionsGetCampaignOffersRequest :: Options
optionsGetCampaignOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignOffersRequestOfferIds", "offerIds")
      , ("getCampaignOffersRequestStatuses", "statuses")
      , ("getCampaignOffersRequestCategoryIds", "categoryIds")
      , ("getCampaignOffersRequestVendorNames", "vendorNames")
      , ("getCampaignOffersRequestTags", "tags")
      ]


-- | Ответ на запрос списка товаров в магазине.
data GetCampaignOffersResponse = GetCampaignOffersResponse
  { getCampaignOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getCampaignOffersResponseResult :: Maybe GetCampaignOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignOffersResponse where
  parseJSON = genericParseJSON optionsGetCampaignOffersResponse
instance ToJSON GetCampaignOffersResponse where
  toJSON = genericToJSON optionsGetCampaignOffersResponse

optionsGetCampaignOffersResponse :: Options
optionsGetCampaignOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignOffersResponseStatus", "status")
      , ("getCampaignOffersResponseResult", "result")
      ]


-- | Список товаров в заданном магазине.
data GetCampaignOffersResultDTO = GetCampaignOffersResultDTO
  { getCampaignOffersResultDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , getCampaignOffersResultDTOOffers :: [GetCampaignOfferDTO] -- ^ Страница списка товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignOffersResultDTO where
  parseJSON = genericParseJSON optionsGetCampaignOffersResultDTO
instance ToJSON GetCampaignOffersResultDTO where
  toJSON = genericToJSON optionsGetCampaignOffersResultDTO

optionsGetCampaignOffersResultDTO :: Options
optionsGetCampaignOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignOffersResultDTOPaging", "paging")
      , ("getCampaignOffersResultDTOOffers", "offers")
      ]


-- | Ответ на запрос региона магазина.
data GetCampaignRegionResponse = GetCampaignRegionResponse
  { getCampaignRegionResponseRegion :: Maybe RegionDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignRegionResponse where
  parseJSON = genericParseJSON optionsGetCampaignRegionResponse
instance ToJSON GetCampaignRegionResponse where
  toJSON = genericToJSON optionsGetCampaignRegionResponse

optionsGetCampaignRegionResponse :: Options
optionsGetCampaignRegionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignRegionResponseRegion", "region")
      ]


-- | Информация о магазине к данным идентификатора кампании.
data GetCampaignResponse = GetCampaignResponse
  { getCampaignResponseCampaign :: Maybe CampaignDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignResponse where
  parseJSON = genericParseJSON optionsGetCampaignResponse
instance ToJSON GetCampaignResponse where
  toJSON = genericToJSON optionsGetCampaignResponse

optionsGetCampaignResponse :: Options
optionsGetCampaignResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignResponseCampaign", "campaign")
      ]


-- | Ответ на запрос настроек магазина.
data GetCampaignSettingsResponse = GetCampaignSettingsResponse
  { getCampaignSettingsResponseSettings :: Maybe CampaignSettingsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignSettingsResponse where
  parseJSON = genericParseJSON optionsGetCampaignSettingsResponse
instance ToJSON GetCampaignSettingsResponse where
  toJSON = genericToJSON optionsGetCampaignSettingsResponse

optionsGetCampaignSettingsResponse :: Options
optionsGetCampaignSettingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignSettingsResponseSettings", "settings")
      ]


-- | Результаты поиска магазинов.
data GetCampaignsResponse = GetCampaignsResponse
  { getCampaignsResponseCampaigns :: [CampaignDTO] -- ^ Список с информацией по каждому магазину.
  , getCampaignsResponsePager :: Maybe FlippingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCampaignsResponse where
  parseJSON = genericParseJSON optionsGetCampaignsResponse
instance ToJSON GetCampaignsResponse where
  toJSON = genericToJSON optionsGetCampaignsResponse

optionsGetCampaignsResponse :: Options
optionsGetCampaignsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCampaignsResponseCampaigns", "campaigns")
      , ("getCampaignsResponsePager", "pager")
      ]


-- | Категории и лимит на установку кванта и минимального количества товаров.
data GetCategoriesMaxSaleQuantumDTO = GetCategoriesMaxSaleQuantumDTO
  { getCategoriesMaxSaleQuantumDTOResults :: [MaxSaleQuantumDTO] -- ^ Категории и лимит на установку кванта и минимального количества товаров.
  , getCategoriesMaxSaleQuantumDTOErrors :: Maybe [CategoryErrorDTO] -- ^ Ошибки, которые появились из-за переданных категорий.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoriesMaxSaleQuantumDTO where
  parseJSON = genericParseJSON optionsGetCategoriesMaxSaleQuantumDTO
instance ToJSON GetCategoriesMaxSaleQuantumDTO where
  toJSON = genericToJSON optionsGetCategoriesMaxSaleQuantumDTO

optionsGetCategoriesMaxSaleQuantumDTO :: Options
optionsGetCategoriesMaxSaleQuantumDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoriesMaxSaleQuantumDTOResults", "results")
      , ("getCategoriesMaxSaleQuantumDTOErrors", "errors")
      ]


-- | Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
data GetCategoriesMaxSaleQuantumRequest = GetCategoriesMaxSaleQuantumRequest
  { getCategoriesMaxSaleQuantumRequestMarketCategoryIds :: [Int64] -- ^ Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoriesMaxSaleQuantumRequest where
  parseJSON = genericParseJSON optionsGetCategoriesMaxSaleQuantumRequest
instance ToJSON GetCategoriesMaxSaleQuantumRequest where
  toJSON = genericToJSON optionsGetCategoriesMaxSaleQuantumRequest

optionsGetCategoriesMaxSaleQuantumRequest :: Options
optionsGetCategoriesMaxSaleQuantumRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoriesMaxSaleQuantumRequestMarketCategoryIds", "marketCategoryIds")
      ]


-- | 
data GetCategoriesMaxSaleQuantumResponse = GetCategoriesMaxSaleQuantumResponse
  { getCategoriesMaxSaleQuantumResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getCategoriesMaxSaleQuantumResponseResults :: [MaxSaleQuantumDTO] -- ^ Категории и лимит на установку кванта и минимального количества товаров.
  , getCategoriesMaxSaleQuantumResponseErrors :: Maybe [CategoryErrorDTO] -- ^ Ошибки, которые появились из-за переданных категорий.
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoriesMaxSaleQuantumResponse where
  parseJSON = genericParseJSON optionsGetCategoriesMaxSaleQuantumResponse
instance ToJSON GetCategoriesMaxSaleQuantumResponse where
  toJSON = genericToJSON optionsGetCategoriesMaxSaleQuantumResponse

optionsGetCategoriesMaxSaleQuantumResponse :: Options
optionsGetCategoriesMaxSaleQuantumResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoriesMaxSaleQuantumResponseStatus", "status")
      , ("getCategoriesMaxSaleQuantumResponseResults", "results")
      , ("getCategoriesMaxSaleQuantumResponseErrors", "errors")
      ]


-- | Параметры запроса категорий. 
data GetCategoriesRequest = GetCategoriesRequest
  { getCategoriesRequestLanguage :: Maybe LanguageType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoriesRequest where
  parseJSON = genericParseJSON optionsGetCategoriesRequest
instance ToJSON GetCategoriesRequest where
  toJSON = genericToJSON optionsGetCategoriesRequest

optionsGetCategoriesRequest :: Options
optionsGetCategoriesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoriesRequestLanguage", "language")
      ]


-- | 
data GetCategoriesResponse = GetCategoriesResponse
  { getCategoriesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getCategoriesResponseResult :: Maybe CategoryDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoriesResponse where
  parseJSON = genericParseJSON optionsGetCategoriesResponse
instance ToJSON GetCategoriesResponse where
  toJSON = genericToJSON optionsGetCategoriesResponse

optionsGetCategoriesResponse :: Options
optionsGetCategoriesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoriesResponseStatus", "status")
      , ("getCategoriesResponseResult", "result")
      ]


-- | Ответ со списком характеристик для категории и их допустимыми значениями.
data GetCategoryContentParametersResponse = GetCategoryContentParametersResponse
  { getCategoryContentParametersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getCategoryContentParametersResponseResult :: Maybe CategoryContentParametersDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetCategoryContentParametersResponse where
  parseJSON = genericParseJSON optionsGetCategoryContentParametersResponse
instance ToJSON GetCategoryContentParametersResponse where
  toJSON = genericToJSON optionsGetCategoryContentParametersResponse

optionsGetCategoryContentParametersResponse :: Options
optionsGetCategoryContentParametersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getCategoryContentParametersResponseStatus", "status")
      , ("getCategoryContentParametersResponseResult", "result")
      ]


-- | Историю какого чата нужно получить — и начиная с какого сообщения. 
data GetChatHistoryRequest = GetChatHistoryRequest
  { getChatHistoryRequestMessageIdFrom :: Maybe Int64 -- ^ Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatHistoryRequest where
  parseJSON = genericParseJSON optionsGetChatHistoryRequest
instance ToJSON GetChatHistoryRequest where
  toJSON = genericToJSON optionsGetChatHistoryRequest

optionsGetChatHistoryRequest :: Options
optionsGetChatHistoryRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatHistoryRequestMessageIdFrom", "messageIdFrom")
      ]


-- | 
data GetChatHistoryResponse = GetChatHistoryResponse
  { getChatHistoryResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getChatHistoryResponseResult :: Maybe ChatMessagesResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatHistoryResponse where
  parseJSON = genericParseJSON optionsGetChatHistoryResponse
instance ToJSON GetChatHistoryResponse where
  toJSON = genericToJSON optionsGetChatHistoryResponse

optionsGetChatHistoryResponse :: Options
optionsGetChatHistoryResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatHistoryResponseStatus", "status")
      , ("getChatHistoryResponseResult", "result")
      ]


-- | Информация о чатах.
data GetChatInfoDTO = GetChatInfoDTO
  { getChatInfoDTOChatId :: Int64 -- ^ Идентификатор чата.
  , getChatInfoDTOOrderId :: Int64 -- ^ Идентификатор заказа.
  , getChatInfoDTOType :: ChatType -- ^ 
  , getChatInfoDTOStatus :: ChatStatusType -- ^ 
  , getChatInfoDTOCreatedAt :: UTCTime -- ^ Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
  , getChatInfoDTOUpdatedAt :: UTCTime -- ^ Дата и время последнего сообщения в чате.
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatInfoDTO where
  parseJSON = genericParseJSON optionsGetChatInfoDTO
instance ToJSON GetChatInfoDTO where
  toJSON = genericToJSON optionsGetChatInfoDTO

optionsGetChatInfoDTO :: Options
optionsGetChatInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatInfoDTOChatId", "chatId")
      , ("getChatInfoDTOOrderId", "orderId")
      , ("getChatInfoDTOType", "type")
      , ("getChatInfoDTOStatus", "status")
      , ("getChatInfoDTOCreatedAt", "createdAt")
      , ("getChatInfoDTOUpdatedAt", "updatedAt")
      ]


-- | Список чатов.
data GetChatsInfoDTO = GetChatsInfoDTO
  { getChatsInfoDTOChats :: [GetChatInfoDTO] -- ^ Информация о чатах.
  , getChatsInfoDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatsInfoDTO where
  parseJSON = genericParseJSON optionsGetChatsInfoDTO
instance ToJSON GetChatsInfoDTO where
  toJSON = genericToJSON optionsGetChatsInfoDTO

optionsGetChatsInfoDTO :: Options
optionsGetChatsInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatsInfoDTOChats", "chats")
      , ("getChatsInfoDTOPaging", "paging")
      ]


-- | Фильтры по чатам, которые нужно вернуть. 
data GetChatsRequest = GetChatsRequest
  { getChatsRequestOrderIds :: Maybe [Int64] -- ^ Фильтр по идентификаторам заказов на Маркете.
  , getChatsRequestTypes :: Maybe [ChatType] -- ^ Фильтр по типам чатов.
  , getChatsRequestStatuses :: Maybe [ChatStatusType] -- ^ Фильтр по статусам чатов.
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatsRequest where
  parseJSON = genericParseJSON optionsGetChatsRequest
instance ToJSON GetChatsRequest where
  toJSON = genericToJSON optionsGetChatsRequest

optionsGetChatsRequest :: Options
optionsGetChatsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatsRequestOrderIds", "orderIds")
      , ("getChatsRequestTypes", "types")
      , ("getChatsRequestStatuses", "statuses")
      ]


-- | 
data GetChatsResponse = GetChatsResponse
  { getChatsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getChatsResponseResult :: Maybe GetChatsInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetChatsResponse where
  parseJSON = genericParseJSON optionsGetChatsResponse
instance ToJSON GetChatsResponse where
  toJSON = genericToJSON optionsGetChatsResponse

optionsGetChatsResponse :: Options
optionsGetChatsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getChatsResponseStatus", "status")
      , ("getChatsResponseResult", "result")
      ]


-- | Ответ на запрос списка служб доставки.
data GetDeliveryServicesResponse = GetDeliveryServicesResponse
  { getDeliveryServicesResponseResult :: Maybe DeliveryServicesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetDeliveryServicesResponse where
  parseJSON = genericParseJSON optionsGetDeliveryServicesResponse
instance ToJSON GetDeliveryServicesResponse where
  toJSON = genericToJSON optionsGetDeliveryServicesResponse

optionsGetDeliveryServicesResponse :: Options
optionsGetDeliveryServicesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getDeliveryServicesResponseResult", "result")
      ]


-- | 
data GetFeedIndexLogsResponse = GetFeedIndexLogsResponse
  { getFeedIndexLogsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getFeedIndexLogsResponseResult :: Maybe FeedIndexLogsResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetFeedIndexLogsResponse where
  parseJSON = genericParseJSON optionsGetFeedIndexLogsResponse
instance ToJSON GetFeedIndexLogsResponse where
  toJSON = genericToJSON optionsGetFeedIndexLogsResponse

optionsGetFeedIndexLogsResponse :: Options
optionsGetFeedIndexLogsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getFeedIndexLogsResponseStatus", "status")
      , ("getFeedIndexLogsResponseResult", "result")
      ]


-- | Ответ на запрос информации о прайс-листе.
data GetFeedResponse = GetFeedResponse
  { getFeedResponseFeed :: Maybe FeedDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetFeedResponse where
  parseJSON = genericParseJSON optionsGetFeedResponse
instance ToJSON GetFeedResponse where
  toJSON = genericToJSON optionsGetFeedResponse

optionsGetFeedResponse :: Options
optionsGetFeedResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getFeedResponseFeed", "feed")
      ]


-- | 
data GetFeedbackListResponse = GetFeedbackListResponse
  { getFeedbackListResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getFeedbackListResponseResult :: Maybe FeedbackListDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetFeedbackListResponse where
  parseJSON = genericParseJSON optionsGetFeedbackListResponse
instance ToJSON GetFeedbackListResponse where
  toJSON = genericToJSON optionsGetFeedbackListResponse

optionsGetFeedbackListResponse :: Options
optionsGetFeedbackListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getFeedbackListResponseStatus", "status")
      , ("getFeedbackListResponseResult", "result")
      ]


-- | Ответ на запрос списка прайс-листов.
data GetFeedsResponse = GetFeedsResponse
  { getFeedsResponseFeeds :: [FeedDTO] -- ^ Список прайс-листов.
  } deriving (Show, Eq, Generic)

instance FromJSON GetFeedsResponse where
  parseJSON = genericParseJSON optionsGetFeedsResponse
instance ToJSON GetFeedsResponse where
  toJSON = genericToJSON optionsGetFeedsResponse

optionsGetFeedsResponse :: Options
optionsGetFeedsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getFeedsResponseFeeds", "feeds")
      ]


-- | 
data GetFulfillmentWarehousesResponse = GetFulfillmentWarehousesResponse
  { getFulfillmentWarehousesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getFulfillmentWarehousesResponseResult :: Maybe FulfillmentWarehousesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetFulfillmentWarehousesResponse where
  parseJSON = genericParseJSON optionsGetFulfillmentWarehousesResponse
instance ToJSON GetFulfillmentWarehousesResponse where
  toJSON = genericToJSON optionsGetFulfillmentWarehousesResponse

optionsGetFulfillmentWarehousesResponse :: Options
optionsGetFulfillmentWarehousesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getFulfillmentWarehousesResponseStatus", "status")
      , ("getFulfillmentWarehousesResponseResult", "result")
      ]


-- | Фильтр запроса комментариев отзыва. 
data GetGoodsFeedbackCommentsRequest = GetGoodsFeedbackCommentsRequest
  { getGoodsFeedbackCommentsRequestFeedbackId :: Int64 -- ^ Идентификатор отзыва. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsFeedbackCommentsRequest where
  parseJSON = genericParseJSON optionsGetGoodsFeedbackCommentsRequest
instance ToJSON GetGoodsFeedbackCommentsRequest where
  toJSON = genericToJSON optionsGetGoodsFeedbackCommentsRequest

optionsGetGoodsFeedbackCommentsRequest :: Options
optionsGetGoodsFeedbackCommentsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsFeedbackCommentsRequestFeedbackId", "feedbackId")
      ]


-- | 
data GetGoodsFeedbackCommentsResponse = GetGoodsFeedbackCommentsResponse
  { getGoodsFeedbackCommentsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getGoodsFeedbackCommentsResponseResult :: Maybe GoodsFeedbackCommentListDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsFeedbackCommentsResponse where
  parseJSON = genericParseJSON optionsGetGoodsFeedbackCommentsResponse
instance ToJSON GetGoodsFeedbackCommentsResponse where
  toJSON = genericToJSON optionsGetGoodsFeedbackCommentsResponse

optionsGetGoodsFeedbackCommentsResponse :: Options
optionsGetGoodsFeedbackCommentsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsFeedbackCommentsResponseStatus", "status")
      , ("getGoodsFeedbackCommentsResponseResult", "result")
      ]


-- | Фильтр запроса отзывов в кабинете. 
data GetGoodsFeedbackRequest = GetGoodsFeedbackRequest
  { getGoodsFeedbackRequestDateTimeFrom :: Maybe UTCTime -- ^ Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
  , getGoodsFeedbackRequestDateTimeTo :: Maybe UTCTime -- ^ Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
  , getGoodsFeedbackRequestReactionStatus :: Maybe FeedbackReactionStatusType -- ^ 
  , getGoodsFeedbackRequestRatingValues :: Maybe [Int] -- ^ Оценка товара.
  , getGoodsFeedbackRequestModelIds :: Maybe [Int64] -- ^ Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
  , getGoodsFeedbackRequestPaid :: Maybe Bool -- ^ Фильтр отзывов за баллы Плюса.
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsFeedbackRequest where
  parseJSON = genericParseJSON optionsGetGoodsFeedbackRequest
instance ToJSON GetGoodsFeedbackRequest where
  toJSON = genericToJSON optionsGetGoodsFeedbackRequest

optionsGetGoodsFeedbackRequest :: Options
optionsGetGoodsFeedbackRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsFeedbackRequestDateTimeFrom", "dateTimeFrom")
      , ("getGoodsFeedbackRequestDateTimeTo", "dateTimeTo")
      , ("getGoodsFeedbackRequestReactionStatus", "reactionStatus")
      , ("getGoodsFeedbackRequestRatingValues", "ratingValues")
      , ("getGoodsFeedbackRequestModelIds", "modelIds")
      , ("getGoodsFeedbackRequestPaid", "paid")
      ]


-- | 
data GetGoodsFeedbackResponse = GetGoodsFeedbackResponse
  { getGoodsFeedbackResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getGoodsFeedbackResponseResult :: Maybe GoodsFeedbackListDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsFeedbackResponse where
  parseJSON = genericParseJSON optionsGetGoodsFeedbackResponse
instance ToJSON GetGoodsFeedbackResponse where
  toJSON = genericToJSON optionsGetGoodsFeedbackResponse

optionsGetGoodsFeedbackResponse :: Options
optionsGetGoodsFeedbackResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsFeedbackResponseStatus", "status")
      , ("getGoodsFeedbackResponseResult", "result")
      ]


-- | Запрос отчета по товарам.
data GetGoodsStatsRequest = GetGoodsStatsRequest
  { getGoodsStatsRequestShopSkus :: [Text] -- ^ Список ваших идентификаторов SKU. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsStatsRequest where
  parseJSON = genericParseJSON optionsGetGoodsStatsRequest
instance ToJSON GetGoodsStatsRequest where
  toJSON = genericToJSON optionsGetGoodsStatsRequest

optionsGetGoodsStatsRequest :: Options
optionsGetGoodsStatsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsStatsRequestShopSkus", "shopSkus")
      ]


-- | Ответ на запрос отчета по товарам.
data GetGoodsStatsResponse = GetGoodsStatsResponse
  { getGoodsStatsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getGoodsStatsResponseResult :: Maybe GoodsStatsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetGoodsStatsResponse where
  parseJSON = genericParseJSON optionsGetGoodsStatsResponse
instance ToJSON GetGoodsStatsResponse where
  toJSON = genericToJSON optionsGetGoodsStatsResponse

optionsGetGoodsStatsResponse :: Options
optionsGetGoodsStatsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getGoodsStatsResponseStatus", "status")
      , ("getGoodsStatsResponseResult", "result")
      ]


-- | Ответ на запрос списка скрытий.
data GetHiddenOffersResponse = GetHiddenOffersResponse
  { getHiddenOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getHiddenOffersResponseResult :: Maybe GetHiddenOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetHiddenOffersResponse where
  parseJSON = genericParseJSON optionsGetHiddenOffersResponse
instance ToJSON GetHiddenOffersResponse where
  toJSON = genericToJSON optionsGetHiddenOffersResponse

optionsGetHiddenOffersResponse :: Options
optionsGetHiddenOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getHiddenOffersResponseStatus", "status")
      , ("getHiddenOffersResponseResult", "result")
      ]


-- | Список скрытых вами товаров. 
data GetHiddenOffersResultDTO = GetHiddenOffersResultDTO
  { getHiddenOffersResultDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , getHiddenOffersResultDTOHiddenOffers :: [HiddenOfferDTO] -- ^ Список скрытых товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GetHiddenOffersResultDTO where
  parseJSON = genericParseJSON optionsGetHiddenOffersResultDTO
instance ToJSON GetHiddenOffersResultDTO where
  toJSON = genericToJSON optionsGetHiddenOffersResultDTO

optionsGetHiddenOffersResultDTO :: Options
optionsGetHiddenOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getHiddenOffersResultDTOPaging", "paging")
      , ("getHiddenOffersResultDTOHiddenOffers", "hiddenOffers")
      ]


-- | Информация о товарах в каталоге. 
data GetMappingDTO = GetMappingDTO
  { getMappingDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , getMappingDTOMarketSkuName :: Maybe Text -- ^ Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  , getMappingDTOMarketModelId :: Maybe Int64 -- ^ Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  , getMappingDTOMarketModelName :: Maybe Text -- ^ Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  , getMappingDTOMarketCategoryId :: Maybe Int64 -- ^ Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  , getMappingDTOMarketCategoryName :: Maybe Text -- ^ Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetMappingDTO where
  parseJSON = genericParseJSON optionsGetMappingDTO
instance ToJSON GetMappingDTO where
  toJSON = genericToJSON optionsGetMappingDTO

optionsGetMappingDTO :: Options
optionsGetMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getMappingDTOMarketSku", "marketSku")
      , ("getMappingDTOMarketSkuName", "marketSkuName")
      , ("getMappingDTOMarketModelId", "marketModelId")
      , ("getMappingDTOMarketModelName", "marketModelName")
      , ("getMappingDTOMarketCategoryId", "marketCategoryId")
      , ("getMappingDTOMarketCategoryName", "marketCategoryName")
      ]


-- | Ответ на запрос списка предложений для моделей.
data GetModelsOffersResponse = GetModelsOffersResponse
  { getModelsOffersResponseModels :: [EnrichedModelDTO] -- ^ Список моделей товаров.
  , getModelsOffersResponseCurrency :: Maybe CurrencyType -- ^ 
  , getModelsOffersResponseRegionId :: Maybe Int64 -- ^ Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  } deriving (Show, Eq, Generic)

instance FromJSON GetModelsOffersResponse where
  parseJSON = genericParseJSON optionsGetModelsOffersResponse
instance ToJSON GetModelsOffersResponse where
  toJSON = genericToJSON optionsGetModelsOffersResponse

optionsGetModelsOffersResponse :: Options
optionsGetModelsOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getModelsOffersResponseModels", "models")
      , ("getModelsOffersResponseCurrency", "currency")
      , ("getModelsOffersResponseRegionId", "regionId")
      ]


-- | Запрос информации о моделях.
data GetModelsRequest = GetModelsRequest
  { getModelsRequestModels :: [Int64] -- ^ Список моделей.
  } deriving (Show, Eq, Generic)

instance FromJSON GetModelsRequest where
  parseJSON = genericParseJSON optionsGetModelsRequest
instance ToJSON GetModelsRequest where
  toJSON = genericToJSON optionsGetModelsRequest

optionsGetModelsRequest :: Options
optionsGetModelsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getModelsRequestModels", "models")
      ]


-- | Ответ на запрос информации о моделях.
data GetModelsResponse = GetModelsResponse
  { getModelsResponseModels :: [ModelDTO] -- ^ Список моделей товаров.
  , getModelsResponseCurrency :: Maybe CurrencyType -- ^ 
  , getModelsResponseRegionId :: Maybe Int64 -- ^ Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  } deriving (Show, Eq, Generic)

instance FromJSON GetModelsResponse where
  parseJSON = genericParseJSON optionsGetModelsResponse
instance ToJSON GetModelsResponse where
  toJSON = genericToJSON optionsGetModelsResponse

optionsGetModelsResponse :: Options
optionsGetModelsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getModelsResponseModels", "models")
      , ("getModelsResponseCurrency", "currency")
      , ("getModelsResponseRegionId", "regionId")
      ]


-- | 
data GetOfferCardsContentStatusRequest = GetOfferCardsContentStatusRequest
  { getOfferCardsContentStatusRequestOfferIds :: Maybe [Text] -- ^ Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  , getOfferCardsContentStatusRequestCardStatuses :: Maybe [OfferCardStatusType] -- ^ Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  , getOfferCardsContentStatusRequestCategoryIds :: Maybe [Int] -- ^ Фильтр по категориям на Маркете.
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferCardsContentStatusRequest where
  parseJSON = genericParseJSON optionsGetOfferCardsContentStatusRequest
instance ToJSON GetOfferCardsContentStatusRequest where
  toJSON = genericToJSON optionsGetOfferCardsContentStatusRequest

optionsGetOfferCardsContentStatusRequest :: Options
optionsGetOfferCardsContentStatusRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferCardsContentStatusRequestOfferIds", "offerIds")
      , ("getOfferCardsContentStatusRequestCardStatuses", "cardStatuses")
      , ("getOfferCardsContentStatusRequestCategoryIds", "categoryIds")
      ]


-- | Ответ со списком состояний товаров и пагинацией.
data GetOfferCardsContentStatusResponse = GetOfferCardsContentStatusResponse
  { getOfferCardsContentStatusResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOfferCardsContentStatusResponseResult :: Maybe OfferCardsContentStatusDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferCardsContentStatusResponse where
  parseJSON = genericParseJSON optionsGetOfferCardsContentStatusResponse
instance ToJSON GetOfferCardsContentStatusResponse where
  toJSON = genericToJSON optionsGetOfferCardsContentStatusResponse

optionsGetOfferCardsContentStatusResponse :: Options
optionsGetOfferCardsContentStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferCardsContentStatusResponseStatus", "status")
      , ("getOfferCardsContentStatusResponseResult", "result")
      ]


-- | Параметры товара.
data GetOfferDTO = GetOfferDTO
  { getOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , getOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , getOfferDTOMarketCategoryId :: Maybe Int64 -- ^ Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  , getOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , getOfferDTOPictures :: Maybe [Text] -- ^ Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  , getOfferDTOVideos :: Maybe [Text] -- ^ Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  , getOfferDTOManuals :: Maybe [OfferManualDTO] -- ^ Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
  , getOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , getOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , getOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , getOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  , getOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , getOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , getOfferDTOTags :: Maybe [Text] -- ^ Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  , getOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , getOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , getOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , getOfferDTOCustomsCommodityCode :: Maybe Text -- ^ Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  , getOfferDTOCertificates :: Maybe [Text] -- ^ Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  , getOfferDTOBoxCount :: Maybe Int -- ^ Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  , getOfferDTOCondition :: Maybe OfferConditionDTO -- ^ 
  , getOfferDTOType :: Maybe OfferType -- ^ 
  , getOfferDTODownloadable :: Maybe Bool -- ^ Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  , getOfferDTOAdult :: Maybe Bool -- ^ Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  , getOfferDTOAge :: Maybe AgeDTO -- ^ 
  , getOfferDTOParams :: Maybe [OfferParamDTO] -- ^ {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  , getOfferDTOBasicPrice :: Maybe GetPriceWithDiscountDTO -- ^ 
  , getOfferDTOPurchasePrice :: Maybe GetPriceDTO -- ^ 
  , getOfferDTOAdditionalExpenses :: Maybe GetPriceDTO -- ^ 
  , getOfferDTOCofinancePrice :: Maybe GetPriceDTO -- ^ 
  , getOfferDTOCardStatus :: Maybe OfferCardStatusType -- ^ 
  , getOfferDTOCampaigns :: Maybe [OfferCampaignStatusDTO] -- ^ Список магазинов, в которых размещен товар. 
  , getOfferDTOSellingPrograms :: Maybe [OfferSellingProgramDTO] -- ^ Информация о том, какие для товара доступны модели размещения. 
  , getOfferDTOArchived :: Maybe Bool -- ^ Товар помещен в архив. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferDTO where
  parseJSON = genericParseJSON optionsGetOfferDTO
instance ToJSON GetOfferDTO where
  toJSON = genericToJSON optionsGetOfferDTO

optionsGetOfferDTO :: Options
optionsGetOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferDTOOfferId", "offerId")
      , ("getOfferDTOName", "name")
      , ("getOfferDTOMarketCategoryId", "marketCategoryId")
      , ("getOfferDTOCategory", "category")
      , ("getOfferDTOPictures", "pictures")
      , ("getOfferDTOVideos", "videos")
      , ("getOfferDTOManuals", "manuals")
      , ("getOfferDTOVendor", "vendor")
      , ("getOfferDTOBarcodes", "barcodes")
      , ("getOfferDTODescription", "description")
      , ("getOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("getOfferDTOWeightDimensions", "weightDimensions")
      , ("getOfferDTOVendorCode", "vendorCode")
      , ("getOfferDTOTags", "tags")
      , ("getOfferDTOShelfLife", "shelfLife")
      , ("getOfferDTOLifeTime", "lifeTime")
      , ("getOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("getOfferDTOCustomsCommodityCode", "customsCommodityCode")
      , ("getOfferDTOCertificates", "certificates")
      , ("getOfferDTOBoxCount", "boxCount")
      , ("getOfferDTOCondition", "condition")
      , ("getOfferDTOType", "type")
      , ("getOfferDTODownloadable", "downloadable")
      , ("getOfferDTOAdult", "adult")
      , ("getOfferDTOAge", "age")
      , ("getOfferDTOParams", "params")
      , ("getOfferDTOBasicPrice", "basicPrice")
      , ("getOfferDTOPurchasePrice", "purchasePrice")
      , ("getOfferDTOAdditionalExpenses", "additionalExpenses")
      , ("getOfferDTOCofinancePrice", "cofinancePrice")
      , ("getOfferDTOCardStatus", "cardStatus")
      , ("getOfferDTOCampaigns", "campaigns")
      , ("getOfferDTOSellingPrograms", "sellingPrograms")
      , ("getOfferDTOArchived", "archived")
      ]


-- | Информация о товаре.
data GetOfferMappingDTO = GetOfferMappingDTO
  { getOfferMappingDTOOffer :: Maybe GetOfferDTO -- ^ 
  , getOfferMappingDTOMapping :: Maybe GetMappingDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferMappingDTO where
  parseJSON = genericParseJSON optionsGetOfferMappingDTO
instance ToJSON GetOfferMappingDTO where
  toJSON = genericToJSON optionsGetOfferMappingDTO

optionsGetOfferMappingDTO :: Options
optionsGetOfferMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferMappingDTOOffer", "offer")
      , ("getOfferMappingDTOMapping", "mapping")
      ]


-- | Ответ на запрос списка товаров в каталоге.
data GetOfferMappingEntriesResponse = GetOfferMappingEntriesResponse
  { getOfferMappingEntriesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOfferMappingEntriesResponseResult :: Maybe OfferMappingEntriesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferMappingEntriesResponse where
  parseJSON = genericParseJSON optionsGetOfferMappingEntriesResponse
instance ToJSON GetOfferMappingEntriesResponse where
  toJSON = genericToJSON optionsGetOfferMappingEntriesResponse

optionsGetOfferMappingEntriesResponse :: Options
optionsGetOfferMappingEntriesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferMappingEntriesResponseStatus", "status")
      , ("getOfferMappingEntriesResponseResult", "result")
      ]


-- | 
data GetOfferMappingsRequest = GetOfferMappingsRequest
  { getOfferMappingsRequestOfferIds :: Maybe [Text] -- ^ Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
  , getOfferMappingsRequestCardStatuses :: Maybe [OfferCardStatusType] -- ^ Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  , getOfferMappingsRequestCategoryIds :: Maybe [Int] -- ^ Фильтр по категориям на Маркете.
  , getOfferMappingsRequestVendorNames :: Maybe [Text] -- ^ Фильтр по брендам.
  , getOfferMappingsRequestTags :: Maybe [Text] -- ^ Фильтр по тегам.
  , getOfferMappingsRequestArchived :: Maybe Bool -- ^ Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferMappingsRequest where
  parseJSON = genericParseJSON optionsGetOfferMappingsRequest
instance ToJSON GetOfferMappingsRequest where
  toJSON = genericToJSON optionsGetOfferMappingsRequest

optionsGetOfferMappingsRequest :: Options
optionsGetOfferMappingsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferMappingsRequestOfferIds", "offerIds")
      , ("getOfferMappingsRequestCardStatuses", "cardStatuses")
      , ("getOfferMappingsRequestCategoryIds", "categoryIds")
      , ("getOfferMappingsRequestVendorNames", "vendorNames")
      , ("getOfferMappingsRequestTags", "tags")
      , ("getOfferMappingsRequestArchived", "archived")
      ]


-- | 
data GetOfferMappingsResponse = GetOfferMappingsResponse
  { getOfferMappingsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOfferMappingsResponseResult :: Maybe GetOfferMappingsResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferMappingsResponse where
  parseJSON = genericParseJSON optionsGetOfferMappingsResponse
instance ToJSON GetOfferMappingsResponse where
  toJSON = genericToJSON optionsGetOfferMappingsResponse

optionsGetOfferMappingsResponse :: Options
optionsGetOfferMappingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferMappingsResponseStatus", "status")
      , ("getOfferMappingsResponseResult", "result")
      ]


-- | Информация о товарах.
data GetOfferMappingsResultDTO = GetOfferMappingsResultDTO
  { getOfferMappingsResultDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , getOfferMappingsResultDTOOfferMappings :: [GetOfferMappingDTO] -- ^ Информация о товарах.
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferMappingsResultDTO where
  parseJSON = genericParseJSON optionsGetOfferMappingsResultDTO
instance ToJSON GetOfferMappingsResultDTO where
  toJSON = genericToJSON optionsGetOfferMappingsResultDTO

optionsGetOfferMappingsResultDTO :: Options
optionsGetOfferMappingsResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferMappingsResultDTOPaging", "paging")
      , ("getOfferMappingsResultDTOOfferMappings", "offerMappings")
      ]


-- | 
data GetOfferRecommendationsRequest = GetOfferRecommendationsRequest
  { getOfferRecommendationsRequestOfferIds :: Maybe [Text] -- ^ Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.
  , getOfferRecommendationsRequestCofinancePriceFilter :: Maybe FieldStateType -- ^ 
  , getOfferRecommendationsRequestRecommendedCofinancePriceFilter :: Maybe FieldStateType -- ^ 
  , getOfferRecommendationsRequestCompetitivenessFilter :: Maybe PriceCompetitivenessType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferRecommendationsRequest where
  parseJSON = genericParseJSON optionsGetOfferRecommendationsRequest
instance ToJSON GetOfferRecommendationsRequest where
  toJSON = genericToJSON optionsGetOfferRecommendationsRequest

optionsGetOfferRecommendationsRequest :: Options
optionsGetOfferRecommendationsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferRecommendationsRequestOfferIds", "offerIds")
      , ("getOfferRecommendationsRequestCofinancePriceFilter", "cofinancePriceFilter")
      , ("getOfferRecommendationsRequestRecommendedCofinancePriceFilter", "recommendedCofinancePriceFilter")
      , ("getOfferRecommendationsRequestCompetitivenessFilter", "competitivenessFilter")
      ]


-- | 
data GetOfferRecommendationsResponse = GetOfferRecommendationsResponse
  { getOfferRecommendationsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOfferRecommendationsResponseResult :: Maybe OfferRecommendationsResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOfferRecommendationsResponse where
  parseJSON = genericParseJSON optionsGetOfferRecommendationsResponse
instance ToJSON GetOfferRecommendationsResponse where
  toJSON = genericToJSON optionsGetOfferRecommendationsResponse

optionsGetOfferRecommendationsResponse :: Options
optionsGetOfferRecommendationsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOfferRecommendationsResponseStatus", "status")
      , ("getOfferRecommendationsResponseResult", "result")
      ]


-- | Список предложений с пагинатором.
data GetOffersResponse = GetOffersResponse
  { getOffersResponseOffers :: [OfferDTO] -- ^ Список предложений магазина.
  , getOffersResponsePager :: Maybe FlippingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOffersResponse where
  parseJSON = genericParseJSON optionsGetOffersResponse
instance ToJSON GetOffersResponse where
  toJSON = genericToJSON optionsGetOffersResponse

optionsGetOffersResponse :: Options
optionsGetOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOffersResponseOffers", "offers")
      , ("getOffersResponsePager", "pager")
      ]


-- | 
data GetOrderBuyerInfoResponse = GetOrderBuyerInfoResponse
  { getOrderBuyerInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOrderBuyerInfoResponseResult :: Maybe OrderBuyerInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrderBuyerInfoResponse where
  parseJSON = genericParseJSON optionsGetOrderBuyerInfoResponse
instance ToJSON GetOrderBuyerInfoResponse where
  toJSON = genericToJSON optionsGetOrderBuyerInfoResponse

optionsGetOrderBuyerInfoResponse :: Options
optionsGetOrderBuyerInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrderBuyerInfoResponseStatus", "status")
      , ("getOrderBuyerInfoResponseResult", "result")
      ]


-- | Ответ с информацией для печати ярлыков.
data GetOrderLabelsDataResponse = GetOrderLabelsDataResponse
  { getOrderLabelsDataResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOrderLabelsDataResponseResult :: Maybe OrderLabelDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrderLabelsDataResponse where
  parseJSON = genericParseJSON optionsGetOrderLabelsDataResponse
instance ToJSON GetOrderLabelsDataResponse where
  toJSON = genericToJSON optionsGetOrderLabelsDataResponse

optionsGetOrderLabelsDataResponse :: Options
optionsGetOrderLabelsDataResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrderLabelsDataResponseStatus", "status")
      , ("getOrderLabelsDataResponseResult", "result")
      ]


-- | 
data GetOrderResponse = GetOrderResponse
  { getOrderResponseOrder :: Maybe OrderDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrderResponse where
  parseJSON = genericParseJSON optionsGetOrderResponse
instance ToJSON GetOrderResponse where
  toJSON = genericToJSON optionsGetOrderResponse

optionsGetOrderResponse :: Options
optionsGetOrderResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrderResponseOrder", "order")
      ]


-- | Модель для ответа API списка информации по заказам.
data GetOrdersResponse = GetOrdersResponse
  { getOrdersResponsePager :: Maybe FlippingPagerDTO -- ^ 
  , getOrdersResponseOrders :: [OrderDTO] -- ^ Модель заказа. 
  , getOrdersResponsePaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrdersResponse where
  parseJSON = genericParseJSON optionsGetOrdersResponse
instance ToJSON GetOrdersResponse where
  toJSON = genericToJSON optionsGetOrdersResponse

optionsGetOrdersResponse :: Options
optionsGetOrdersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrdersResponsePager", "pager")
      , ("getOrdersResponseOrders", "orders")
      , ("getOrdersResponsePaging", "paging")
      ]


-- | Запрос информации по заказам.
data GetOrdersStatsRequest = GetOrdersStatsRequest
  { getOrdersStatsRequestDateFrom :: Maybe Day -- ^ Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  , getOrdersStatsRequestDateTo :: Maybe Day -- ^ Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  , getOrdersStatsRequestUpdateFrom :: Maybe Day -- ^ Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  , getOrdersStatsRequestUpdateTo :: Maybe Day -- ^ Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  , getOrdersStatsRequestOrders :: Maybe [Int64] -- ^ Список идентификаторов заказов.
  , getOrdersStatsRequestStatuses :: Maybe [OrderStatsStatusType] -- ^ Список статусов заказов.
  , getOrdersStatsRequestHasCis :: Maybe Bool -- ^ Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrdersStatsRequest where
  parseJSON = genericParseJSON optionsGetOrdersStatsRequest
instance ToJSON GetOrdersStatsRequest where
  toJSON = genericToJSON optionsGetOrdersStatsRequest

optionsGetOrdersStatsRequest :: Options
optionsGetOrdersStatsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrdersStatsRequestDateFrom", "dateFrom")
      , ("getOrdersStatsRequestDateTo", "dateTo")
      , ("getOrdersStatsRequestUpdateFrom", "updateFrom")
      , ("getOrdersStatsRequestUpdateTo", "updateTo")
      , ("getOrdersStatsRequestOrders", "orders")
      , ("getOrdersStatsRequestStatuses", "statuses")
      , ("getOrdersStatsRequestHasCis", "hasCis")
      ]


-- | Ответ на запрос информации по заказам.
data GetOrdersStatsResponse = GetOrdersStatsResponse
  { getOrdersStatsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOrdersStatsResponseResult :: Maybe OrdersStatsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOrdersStatsResponse where
  parseJSON = genericParseJSON optionsGetOrdersStatsResponse
instance ToJSON GetOrdersStatsResponse where
  toJSON = genericToJSON optionsGetOrdersStatsResponse

optionsGetOrdersStatsResponse :: Options
optionsGetOrdersStatsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOrdersStatsResponseStatus", "status")
      , ("getOrdersStatsResponseResult", "result")
      ]


-- | 
data GetOutletLicensesResponse = GetOutletLicensesResponse
  { getOutletLicensesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getOutletLicensesResponseResult :: Maybe OutletLicensesResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOutletLicensesResponse where
  parseJSON = genericParseJSON optionsGetOutletLicensesResponse
instance ToJSON GetOutletLicensesResponse where
  toJSON = genericToJSON optionsGetOutletLicensesResponse

optionsGetOutletLicensesResponse :: Options
optionsGetOutletLicensesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOutletLicensesResponseStatus", "status")
      , ("getOutletLicensesResponseResult", "result")
      ]


-- | Ответ на запрос информации о точке продаж.
data GetOutletResponse = GetOutletResponse
  { getOutletResponseOutlet :: Maybe FullOutletDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOutletResponse where
  parseJSON = genericParseJSON optionsGetOutletResponse
instance ToJSON GetOutletResponse where
  toJSON = genericToJSON optionsGetOutletResponse

optionsGetOutletResponse :: Options
optionsGetOutletResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOutletResponseOutlet", "outlet")
      ]


-- | Ответ на запрос информации о точках продаж.
data GetOutletsResponse = GetOutletsResponse
  { getOutletsResponseOutlets :: [FullOutletDTO] -- ^ Информация о точках продаж.
  , getOutletsResponsePaging :: Maybe ScrollingPagerDTO -- ^ 
  , getOutletsResponsePager :: Maybe FlippingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetOutletsResponse where
  parseJSON = genericParseJSON optionsGetOutletsResponse
instance ToJSON GetOutletsResponse where
  toJSON = genericToJSON optionsGetOutletsResponse

optionsGetOutletsResponse :: Options
optionsGetOutletsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getOutletsResponseOutlets", "outlets")
      , ("getOutletsResponsePaging", "paging")
      , ("getOutletsResponsePager", "pager")
      ]


-- | Цена с указанием времени последнего обновления.
data GetPriceDTO = GetPriceDTO
  { getPriceDTOValue :: Double -- ^ Значение.
  , getPriceDTOCurrencyId :: CurrencyType -- ^ 
  , getPriceDTOUpdatedAt :: UTCTime -- ^ Время последнего обновления.
  } deriving (Show, Eq, Generic)

instance FromJSON GetPriceDTO where
  parseJSON = genericParseJSON optionsGetPriceDTO
instance ToJSON GetPriceDTO where
  toJSON = genericToJSON optionsGetPriceDTO

optionsGetPriceDTO :: Options
optionsGetPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPriceDTOValue", "value")
      , ("getPriceDTOCurrencyId", "currencyId")
      , ("getPriceDTOUpdatedAt", "updatedAt")
      ]


-- | Цена с указанием скидки и времени последнего обновления.
data GetPriceWithDiscountDTO = GetPriceWithDiscountDTO
  { getPriceWithDiscountDTOValue :: Double -- ^ Значение.
  , getPriceWithDiscountDTOCurrencyId :: CurrencyType -- ^ 
  , getPriceWithDiscountDTODiscountBase :: Maybe Double -- ^ Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  , getPriceWithDiscountDTOUpdatedAt :: UTCTime -- ^ Время последнего обновления.
  } deriving (Show, Eq, Generic)

instance FromJSON GetPriceWithDiscountDTO where
  parseJSON = genericParseJSON optionsGetPriceWithDiscountDTO
instance ToJSON GetPriceWithDiscountDTO where
  toJSON = genericToJSON optionsGetPriceWithDiscountDTO

optionsGetPriceWithDiscountDTO :: Options
optionsGetPriceWithDiscountDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPriceWithDiscountDTOValue", "value")
      , ("getPriceWithDiscountDTOCurrencyId", "currencyId")
      , ("getPriceWithDiscountDTODiscountBase", "discountBase")
      , ("getPriceWithDiscountDTOUpdatedAt", "updatedAt")
      ]


-- | Цена с указанием ставки НДС и времени последнего обновления.
data GetPriceWithVatDTO = GetPriceWithVatDTO
  { getPriceWithVatDTOValue :: Maybe Double -- ^ Цена на товар.
  , getPriceWithVatDTODiscountBase :: Maybe Double -- ^ Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  , getPriceWithVatDTOCurrencyId :: Maybe CurrencyType -- ^ 
  , getPriceWithVatDTOVat :: Maybe Int -- ^ Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
  , getPriceWithVatDTOUpdatedAt :: UTCTime -- ^ Время последнего обновления.
  } deriving (Show, Eq, Generic)

instance FromJSON GetPriceWithVatDTO where
  parseJSON = genericParseJSON optionsGetPriceWithVatDTO
instance ToJSON GetPriceWithVatDTO where
  toJSON = genericToJSON optionsGetPriceWithVatDTO

optionsGetPriceWithVatDTO :: Options
optionsGetPriceWithVatDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPriceWithVatDTOValue", "value")
      , ("getPriceWithVatDTODiscountBase", "discountBase")
      , ("getPriceWithVatDTOCurrencyId", "currencyId")
      , ("getPriceWithVatDTOVat", "vat")
      , ("getPriceWithVatDTOUpdatedAt", "updatedAt")
      ]


-- | Запрос списка цен.
data GetPricesByOfferIdsRequest = GetPricesByOfferIdsRequest
  { getPricesByOfferIdsRequestOfferIds :: Maybe [Text] -- ^ Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  } deriving (Show, Eq, Generic)

instance FromJSON GetPricesByOfferIdsRequest where
  parseJSON = genericParseJSON optionsGetPricesByOfferIdsRequest
instance ToJSON GetPricesByOfferIdsRequest where
  toJSON = genericToJSON optionsGetPricesByOfferIdsRequest

optionsGetPricesByOfferIdsRequest :: Options
optionsGetPricesByOfferIdsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPricesByOfferIdsRequestOfferIds", "offerIds")
      ]


-- | Ответ на запрос списка цен.
data GetPricesByOfferIdsResponse = GetPricesByOfferIdsResponse
  { getPricesByOfferIdsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getPricesByOfferIdsResponseResult :: Maybe OfferPriceByOfferIdsListResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPricesByOfferIdsResponse where
  parseJSON = genericParseJSON optionsGetPricesByOfferIdsResponse
instance ToJSON GetPricesByOfferIdsResponse where
  toJSON = genericToJSON optionsGetPricesByOfferIdsResponse

optionsGetPricesByOfferIdsResponse :: Options
optionsGetPricesByOfferIdsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPricesByOfferIdsResponseStatus", "status")
      , ("getPricesByOfferIdsResponseResult", "result")
      ]


-- | Ответ на запрос списка цен.
data GetPricesResponse = GetPricesResponse
  { getPricesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getPricesResponseResult :: Maybe OfferPriceListResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPricesResponse where
  parseJSON = genericParseJSON optionsGetPricesResponse
instance ToJSON GetPricesResponse where
  toJSON = genericToJSON optionsGetPricesResponse

optionsGetPricesResponse :: Options
optionsGetPricesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPricesResponseStatus", "status")
      , ("getPricesResponseResult", "result")
      ]


-- | Информация о товарах в акции.
data GetPromoAssortmentInfoDTO = GetPromoAssortmentInfoDTO
  { getPromoAssortmentInfoDTOActiveOffers :: Int -- ^ Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  , getPromoAssortmentInfoDTOPotentialOffers :: Maybe Int -- ^ Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
  , getPromoAssortmentInfoDTOProcessing :: Maybe Bool -- ^ Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoAssortmentInfoDTO where
  parseJSON = genericParseJSON optionsGetPromoAssortmentInfoDTO
instance ToJSON GetPromoAssortmentInfoDTO where
  toJSON = genericToJSON optionsGetPromoAssortmentInfoDTO

optionsGetPromoAssortmentInfoDTO :: Options
optionsGetPromoAssortmentInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoAssortmentInfoDTOActiveOffers", "activeOffers")
      , ("getPromoAssortmentInfoDTOPotentialOffers", "potentialOffers")
      , ("getPromoAssortmentInfoDTOProcessing", "processing")
      ]


-- | Информация об акции «Бестселлеры Маркета».
data GetPromoBestsellerInfoDTO = GetPromoBestsellerInfoDTO
  { getPromoBestsellerInfoDTOBestseller :: Bool -- ^ Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers).
  , getPromoBestsellerInfoDTOEntryDeadline :: Maybe UTCTime -- ^ До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета». 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoBestsellerInfoDTO where
  parseJSON = genericParseJSON optionsGetPromoBestsellerInfoDTO
instance ToJSON GetPromoBestsellerInfoDTO where
  toJSON = genericToJSON optionsGetPromoBestsellerInfoDTO

optionsGetPromoBestsellerInfoDTO :: Options
optionsGetPromoBestsellerInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoBestsellerInfoDTOBestseller", "bestseller")
      , ("getPromoBestsellerInfoDTOEntryDeadline", "entryDeadline")
      ]


-- | Ограничения в акции.
data GetPromoConstraintsDTO = GetPromoConstraintsDTO
  { getPromoConstraintsDTOWarehouseIds :: Maybe [Int64] -- ^ Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoConstraintsDTO where
  parseJSON = genericParseJSON optionsGetPromoConstraintsDTO
instance ToJSON GetPromoConstraintsDTO where
  toJSON = genericToJSON optionsGetPromoConstraintsDTO

optionsGetPromoConstraintsDTO :: Options
optionsGetPromoConstraintsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoConstraintsDTOWarehouseIds", "warehouseIds")
      ]


-- | Информация об акции.
data GetPromoDTO = GetPromoDTO
  { getPromoDTOId :: Text -- ^ Идентификатор акции.
  , getPromoDTOName :: Text -- ^ Название акции.
  , getPromoDTOPeriod :: PromoPeriodDTO -- ^ 
  , getPromoDTOParticipating :: Bool -- ^ Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
  , getPromoDTOAssortmentInfo :: GetPromoAssortmentInfoDTO -- ^ 
  , getPromoDTOMechanicsInfo :: GetPromoMechanicsInfoDTO -- ^ 
  , getPromoDTOBestsellerInfo :: GetPromoBestsellerInfoDTO -- ^ 
  , getPromoDTOChannels :: Maybe [ChannelType] -- ^ Список каналов продвижения товаров.
  , getPromoDTOConstraints :: Maybe GetPromoConstraintsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoDTO where
  parseJSON = genericParseJSON optionsGetPromoDTO
instance ToJSON GetPromoDTO where
  toJSON = genericToJSON optionsGetPromoDTO

optionsGetPromoDTO :: Options
optionsGetPromoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoDTOId", "id")
      , ("getPromoDTOName", "name")
      , ("getPromoDTOPeriod", "period")
      , ("getPromoDTOParticipating", "participating")
      , ("getPromoDTOAssortmentInfo", "assortmentInfo")
      , ("getPromoDTOMechanicsInfo", "mechanicsInfo")
      , ("getPromoDTOBestsellerInfo", "bestsellerInfo")
      , ("getPromoDTOChannels", "channels")
      , ("getPromoDTOConstraints", "constraints")
      ]


-- | Информация о типе акции.
data GetPromoMechanicsInfoDTO = GetPromoMechanicsInfoDTO
  { getPromoMechanicsInfoDTOType :: MechanicsType -- ^ 
  , getPromoMechanicsInfoDTOPromocodeInfo :: Maybe GetPromoPromocodeInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoMechanicsInfoDTO where
  parseJSON = genericParseJSON optionsGetPromoMechanicsInfoDTO
instance ToJSON GetPromoMechanicsInfoDTO where
  toJSON = genericToJSON optionsGetPromoMechanicsInfoDTO

optionsGetPromoMechanicsInfoDTO :: Options
optionsGetPromoMechanicsInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoMechanicsInfoDTOType", "type")
      , ("getPromoMechanicsInfoDTOPromocodeInfo", "promocodeInfo")
      ]


-- | Товар, который участвует или может участвовать в акции.
data GetPromoOfferDTO = GetPromoOfferDTO
  { getPromoOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , getPromoOfferDTOStatus :: PromoOfferParticipationStatusType -- ^ 
  , getPromoOfferDTOParams :: PromoOfferParamsDTO -- ^ 
  , getPromoOfferDTOAutoParticipatingDetails :: Maybe PromoOfferAutoParticipatingDetailsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoOfferDTO where
  parseJSON = genericParseJSON optionsGetPromoOfferDTO
instance ToJSON GetPromoOfferDTO where
  toJSON = genericToJSON optionsGetPromoOfferDTO

optionsGetPromoOfferDTO :: Options
optionsGetPromoOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoOfferDTOOfferId", "offerId")
      , ("getPromoOfferDTOStatus", "status")
      , ("getPromoOfferDTOParams", "params")
      , ("getPromoOfferDTOAutoParticipatingDetails", "autoParticipatingDetails")
      ]


-- | Получение списка товаров, которые участвуют или могут участвовать в акции.
data GetPromoOffersRequest = GetPromoOffersRequest
  { getPromoOffersRequestPromoId :: Text -- ^ Идентификатор акции.
  , getPromoOffersRequestStatusType :: Maybe PromoOfferParticipationStatusFilterType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoOffersRequest where
  parseJSON = genericParseJSON optionsGetPromoOffersRequest
instance ToJSON GetPromoOffersRequest where
  toJSON = genericToJSON optionsGetPromoOffersRequest

optionsGetPromoOffersRequest :: Options
optionsGetPromoOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoOffersRequestPromoId", "promoId")
      , ("getPromoOffersRequestStatusType", "statusType")
      ]


-- | 
data GetPromoOffersResponse = GetPromoOffersResponse
  { getPromoOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getPromoOffersResponseResult :: Maybe GetPromoOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoOffersResponse where
  parseJSON = genericParseJSON optionsGetPromoOffersResponse
instance ToJSON GetPromoOffersResponse where
  toJSON = genericToJSON optionsGetPromoOffersResponse

optionsGetPromoOffersResponse :: Options
optionsGetPromoOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoOffersResponseStatus", "status")
      , ("getPromoOffersResponseResult", "result")
      ]


-- | Список товаров, которые участвуют или могут участвовать в акции.
data GetPromoOffersResultDTO = GetPromoOffersResultDTO
  { getPromoOffersResultDTOOffers :: [GetPromoOfferDTO] -- ^ Товары, которые участвуют или могут участвовать в акции.
  , getPromoOffersResultDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoOffersResultDTO where
  parseJSON = genericParseJSON optionsGetPromoOffersResultDTO
instance ToJSON GetPromoOffersResultDTO where
  toJSON = genericToJSON optionsGetPromoOffersResultDTO

optionsGetPromoOffersResultDTO :: Options
optionsGetPromoOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoOffersResultDTOOffers", "offers")
      , ("getPromoOffersResultDTOPaging", "paging")
      ]


-- | Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
data GetPromoPromocodeInfoDTO = GetPromoPromocodeInfoDTO
  { getPromoPromocodeInfoDTOPromocode :: Text -- ^ Промокод.
  , getPromoPromocodeInfoDTODiscount :: Int -- ^ Процент скидки по промокоду.
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromoPromocodeInfoDTO where
  parseJSON = genericParseJSON optionsGetPromoPromocodeInfoDTO
instance ToJSON GetPromoPromocodeInfoDTO where
  toJSON = genericToJSON optionsGetPromoPromocodeInfoDTO

optionsGetPromoPromocodeInfoDTO :: Options
optionsGetPromoPromocodeInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromoPromocodeInfoDTOPromocode", "promocode")
      , ("getPromoPromocodeInfoDTODiscount", "discount")
      ]


-- | Фильтры для получения списка акций.
data GetPromosRequest = GetPromosRequest
  { getPromosRequestParticipation :: Maybe PromoParticipationType -- ^ 
  , getPromosRequestMechanics :: Maybe MechanicsType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromosRequest where
  parseJSON = genericParseJSON optionsGetPromosRequest
instance ToJSON GetPromosRequest where
  toJSON = genericToJSON optionsGetPromosRequest

optionsGetPromosRequest :: Options
optionsGetPromosRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromosRequestParticipation", "participation")
      , ("getPromosRequestMechanics", "mechanics")
      ]


-- | 
data GetPromosResponse = GetPromosResponse
  { getPromosResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getPromosResponseResult :: Maybe GetPromosResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromosResponse where
  parseJSON = genericParseJSON optionsGetPromosResponse
instance ToJSON GetPromosResponse where
  toJSON = genericToJSON optionsGetPromosResponse

optionsGetPromosResponse :: Options
optionsGetPromosResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromosResponseStatus", "status")
      , ("getPromosResponseResult", "result")
      ]


-- | Информация об акциях Маркета.
data GetPromosResultDTO = GetPromosResultDTO
  { getPromosResultDTOPromos :: [GetPromoDTO] -- ^ Акции Маркета.
  } deriving (Show, Eq, Generic)

instance FromJSON GetPromosResultDTO where
  parseJSON = genericParseJSON optionsGetPromosResultDTO
instance ToJSON GetPromosResultDTO where
  toJSON = genericToJSON optionsGetPromosResultDTO

optionsGetPromosResultDTO :: Options
optionsGetPromosResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getPromosResultDTOPromos", "promos")
      ]


-- | 
data GetQualityRatingDetailsResponse = GetQualityRatingDetailsResponse
  { getQualityRatingDetailsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getQualityRatingDetailsResponseResult :: Maybe QualityRatingDetailsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetQualityRatingDetailsResponse where
  parseJSON = genericParseJSON optionsGetQualityRatingDetailsResponse
instance ToJSON GetQualityRatingDetailsResponse where
  toJSON = genericToJSON optionsGetQualityRatingDetailsResponse

optionsGetQualityRatingDetailsResponse :: Options
optionsGetQualityRatingDetailsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQualityRatingDetailsResponseStatus", "status")
      , ("getQualityRatingDetailsResponseResult", "result")
      ]


-- | Запрос информации по индексу качества.
data GetQualityRatingRequest = GetQualityRatingRequest
  { getQualityRatingRequestDateFrom :: Maybe Day -- ^ Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
  , getQualityRatingRequestDateTo :: Maybe Day -- ^ Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
  , getQualityRatingRequestCampaignIds :: [Int64] -- ^ Список идентификаторов магазинов.
  } deriving (Show, Eq, Generic)

instance FromJSON GetQualityRatingRequest where
  parseJSON = genericParseJSON optionsGetQualityRatingRequest
instance ToJSON GetQualityRatingRequest where
  toJSON = genericToJSON optionsGetQualityRatingRequest

optionsGetQualityRatingRequest :: Options
optionsGetQualityRatingRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQualityRatingRequestDateFrom", "dateFrom")
      , ("getQualityRatingRequestDateTo", "dateTo")
      , ("getQualityRatingRequestCampaignIds", "campaignIds")
      ]


-- | Информация об индексе качества магазинов.
data GetQualityRatingResponse = GetQualityRatingResponse
  { getQualityRatingResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getQualityRatingResponseResult :: Maybe CampaignsQualityRatingDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetQualityRatingResponse where
  parseJSON = genericParseJSON optionsGetQualityRatingResponse
instance ToJSON GetQualityRatingResponse where
  toJSON = genericToJSON optionsGetQualityRatingResponse

optionsGetQualityRatingResponse :: Options
optionsGetQualityRatingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQualityRatingResponseStatus", "status")
      , ("getQualityRatingResponseResult", "result")
      ]


-- | Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
data GetQuarantineOffersRequest = GetQuarantineOffersRequest
  { getQuarantineOffersRequestOfferIds :: Maybe [Text] -- ^ Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  , getQuarantineOffersRequestCardStatuses :: Maybe [OfferCardStatusType] -- ^ Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  , getQuarantineOffersRequestCategoryIds :: Maybe [Int] -- ^ Фильтр по категориям на Маркете.
  , getQuarantineOffersRequestVendorNames :: Maybe [Text] -- ^ Фильтр по брендам.
  , getQuarantineOffersRequestTags :: Maybe [Text] -- ^ Фильтр по тегам.
  } deriving (Show, Eq, Generic)

instance FromJSON GetQuarantineOffersRequest where
  parseJSON = genericParseJSON optionsGetQuarantineOffersRequest
instance ToJSON GetQuarantineOffersRequest where
  toJSON = genericToJSON optionsGetQuarantineOffersRequest

optionsGetQuarantineOffersRequest :: Options
optionsGetQuarantineOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQuarantineOffersRequestOfferIds", "offerIds")
      , ("getQuarantineOffersRequestCardStatuses", "cardStatuses")
      , ("getQuarantineOffersRequestCategoryIds", "categoryIds")
      , ("getQuarantineOffersRequestVendorNames", "vendorNames")
      , ("getQuarantineOffersRequestTags", "tags")
      ]


-- | Ответ на запрос списка товаров в карантине.
data GetQuarantineOffersResponse = GetQuarantineOffersResponse
  { getQuarantineOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getQuarantineOffersResponseResult :: Maybe GetQuarantineOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetQuarantineOffersResponse where
  parseJSON = genericParseJSON optionsGetQuarantineOffersResponse
instance ToJSON GetQuarantineOffersResponse where
  toJSON = genericToJSON optionsGetQuarantineOffersResponse

optionsGetQuarantineOffersResponse :: Options
optionsGetQuarantineOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQuarantineOffersResponseStatus", "status")
      , ("getQuarantineOffersResponseResult", "result")
      ]


-- | Список товаров в карантине.
data GetQuarantineOffersResultDTO = GetQuarantineOffersResultDTO
  { getQuarantineOffersResultDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , getQuarantineOffersResultDTOOffers :: [QuarantineOfferDTO] -- ^ Страница списка товаров в карантине.
  } deriving (Show, Eq, Generic)

instance FromJSON GetQuarantineOffersResultDTO where
  parseJSON = genericParseJSON optionsGetQuarantineOffersResultDTO
instance ToJSON GetQuarantineOffersResultDTO where
  toJSON = genericToJSON optionsGetQuarantineOffersResultDTO

optionsGetQuarantineOffersResultDTO :: Options
optionsGetQuarantineOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getQuarantineOffersResultDTOPaging", "paging")
      , ("getQuarantineOffersResultDTOOffers", "offers")
      ]


-- | 
data GetRegionWithChildrenResponse = GetRegionWithChildrenResponse
  { getRegionWithChildrenResponsePager :: Maybe FlippingPagerDTO -- ^ 
  , getRegionWithChildrenResponseRegions :: Maybe RegionDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetRegionWithChildrenResponse where
  parseJSON = genericParseJSON optionsGetRegionWithChildrenResponse
instance ToJSON GetRegionWithChildrenResponse where
  toJSON = genericToJSON optionsGetRegionWithChildrenResponse

optionsGetRegionWithChildrenResponse :: Options
optionsGetRegionWithChildrenResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getRegionWithChildrenResponsePager", "pager")
      , ("getRegionWithChildrenResponseRegions", "regions")
      ]


-- | 
data GetRegionsResponse = GetRegionsResponse
  { getRegionsResponseRegions :: [RegionDTO] -- ^ Регион доставки.
  , getRegionsResponsePaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetRegionsResponse where
  parseJSON = genericParseJSON optionsGetRegionsResponse
instance ToJSON GetRegionsResponse where
  toJSON = genericToJSON optionsGetRegionsResponse

optionsGetRegionsResponse :: Options
optionsGetRegionsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getRegionsResponseRegions", "regions")
      , ("getRegionsResponsePaging", "paging")
      ]


-- | Ответ на запрос информации об отчете.
data GetReportInfoResponse = GetReportInfoResponse
  { getReportInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getReportInfoResponseResult :: Maybe ReportInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetReportInfoResponse where
  parseJSON = genericParseJSON optionsGetReportInfoResponse
instance ToJSON GetReportInfoResponse where
  toJSON = genericToJSON optionsGetReportInfoResponse

optionsGetReportInfoResponse :: Options
optionsGetReportInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getReportInfoResponseStatus", "status")
      , ("getReportInfoResponseResult", "result")
      ]


-- | 
data GetReturnResponse = GetReturnResponse
  { getReturnResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getReturnResponseResult :: Maybe ReturnDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetReturnResponse where
  parseJSON = genericParseJSON optionsGetReturnResponse
instance ToJSON GetReturnResponse where
  toJSON = genericToJSON optionsGetReturnResponse

optionsGetReturnResponse :: Options
optionsGetReturnResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getReturnResponseStatus", "status")
      , ("getReturnResponseResult", "result")
      ]


-- | 
data GetReturnsResponse = GetReturnsResponse
  { getReturnsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getReturnsResponseResult :: Maybe PagedReturnsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetReturnsResponse where
  parseJSON = genericParseJSON optionsGetReturnsResponse
instance ToJSON GetReturnsResponse where
  toJSON = genericToJSON optionsGetReturnsResponse

optionsGetReturnsResponse :: Options
optionsGetReturnsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getReturnsResponseStatus", "status")
      , ("getReturnsResponseResult", "result")
      ]


-- | 
data GetShipmentOrdersInfoResponse = GetShipmentOrdersInfoResponse
  { getShipmentOrdersInfoResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getShipmentOrdersInfoResponseResult :: Maybe OrdersShipmentInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetShipmentOrdersInfoResponse where
  parseJSON = genericParseJSON optionsGetShipmentOrdersInfoResponse
instance ToJSON GetShipmentOrdersInfoResponse where
  toJSON = genericToJSON optionsGetShipmentOrdersInfoResponse

optionsGetShipmentOrdersInfoResponse :: Options
optionsGetShipmentOrdersInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getShipmentOrdersInfoResponseStatus", "status")
      , ("getShipmentOrdersInfoResponseResult", "result")
      ]


-- | 
data GetShipmentResponse = GetShipmentResponse
  { getShipmentResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getShipmentResponseResult :: Maybe ShipmentDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetShipmentResponse where
  parseJSON = genericParseJSON optionsGetShipmentResponse
instance ToJSON GetShipmentResponse where
  toJSON = genericToJSON optionsGetShipmentResponse

optionsGetShipmentResponse :: Options
optionsGetShipmentResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getShipmentResponseStatus", "status")
      , ("getShipmentResponseResult", "result")
      ]


-- | Запрос рекомендованных карточек товара.
data GetSuggestedOfferMappingEntriesRequest = GetSuggestedOfferMappingEntriesRequest
  { getSuggestedOfferMappingEntriesRequestOffers :: [MappingsOfferDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GetSuggestedOfferMappingEntriesRequest where
  parseJSON = genericParseJSON optionsGetSuggestedOfferMappingEntriesRequest
instance ToJSON GetSuggestedOfferMappingEntriesRequest where
  toJSON = genericToJSON optionsGetSuggestedOfferMappingEntriesRequest

optionsGetSuggestedOfferMappingEntriesRequest :: Options
optionsGetSuggestedOfferMappingEntriesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getSuggestedOfferMappingEntriesRequestOffers", "offers")
      ]


-- | Ответ со списком рекомендованных карточек товара.
data GetSuggestedOfferMappingEntriesResponse = GetSuggestedOfferMappingEntriesResponse
  { getSuggestedOfferMappingEntriesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getSuggestedOfferMappingEntriesResponseResult :: Maybe OfferMappingSuggestionsListDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetSuggestedOfferMappingEntriesResponse where
  parseJSON = genericParseJSON optionsGetSuggestedOfferMappingEntriesResponse
instance ToJSON GetSuggestedOfferMappingEntriesResponse where
  toJSON = genericToJSON optionsGetSuggestedOfferMappingEntriesResponse

optionsGetSuggestedOfferMappingEntriesResponse :: Options
optionsGetSuggestedOfferMappingEntriesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getSuggestedOfferMappingEntriesResponseStatus", "status")
      , ("getSuggestedOfferMappingEntriesResponseResult", "result")
      ]


-- | 
data GetSuggestedOfferMappingsRequest = GetSuggestedOfferMappingsRequest
  { getSuggestedOfferMappingsRequestOffers :: Maybe [SuggestedOfferDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GetSuggestedOfferMappingsRequest where
  parseJSON = genericParseJSON optionsGetSuggestedOfferMappingsRequest
instance ToJSON GetSuggestedOfferMappingsRequest where
  toJSON = genericToJSON optionsGetSuggestedOfferMappingsRequest

optionsGetSuggestedOfferMappingsRequest :: Options
optionsGetSuggestedOfferMappingsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getSuggestedOfferMappingsRequestOffers", "offers")
      ]


-- | 
data GetSuggestedOfferMappingsResponse = GetSuggestedOfferMappingsResponse
  { getSuggestedOfferMappingsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getSuggestedOfferMappingsResponseResult :: Maybe GetSuggestedOfferMappingsResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetSuggestedOfferMappingsResponse where
  parseJSON = genericParseJSON optionsGetSuggestedOfferMappingsResponse
instance ToJSON GetSuggestedOfferMappingsResponse where
  toJSON = genericToJSON optionsGetSuggestedOfferMappingsResponse

optionsGetSuggestedOfferMappingsResponse :: Options
optionsGetSuggestedOfferMappingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getSuggestedOfferMappingsResponseStatus", "status")
      , ("getSuggestedOfferMappingsResponseResult", "result")
      ]


-- | Подобранные карточки на Маркете.
data GetSuggestedOfferMappingsResultDTO = GetSuggestedOfferMappingsResultDTO
  { getSuggestedOfferMappingsResultDTOOffers :: [SuggestedOfferMappingDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GetSuggestedOfferMappingsResultDTO where
  parseJSON = genericParseJSON optionsGetSuggestedOfferMappingsResultDTO
instance ToJSON GetSuggestedOfferMappingsResultDTO where
  toJSON = genericToJSON optionsGetSuggestedOfferMappingsResultDTO

optionsGetSuggestedOfferMappingsResultDTO :: Options
optionsGetSuggestedOfferMappingsResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getSuggestedOfferMappingsResultDTOOffers", "offers")
      ]


-- | Список складов с информацией об остатках на каждом из них.
data GetWarehouseStocksDTO = GetWarehouseStocksDTO
  { getWarehouseStocksDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , getWarehouseStocksDTOWarehouses :: [WarehouseOffersDTO] -- ^ Страница списка складов.
  } deriving (Show, Eq, Generic)

instance FromJSON GetWarehouseStocksDTO where
  parseJSON = genericParseJSON optionsGetWarehouseStocksDTO
instance ToJSON GetWarehouseStocksDTO where
  toJSON = genericToJSON optionsGetWarehouseStocksDTO

optionsGetWarehouseStocksDTO :: Options
optionsGetWarehouseStocksDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getWarehouseStocksDTOPaging", "paging")
      , ("getWarehouseStocksDTOWarehouses", "warehouses")
      ]


-- | Фильтры для запроса остатков. 
data GetWarehouseStocksRequest = GetWarehouseStocksRequest
  { getWarehouseStocksRequestWithTurnover :: Maybe Bool -- ^ **Только для модели FBY**  Возвращать ли информацию по оборачиваемости.  Значение по умолчанию — `false`. Если информация нужна, передайте значение `true`. 
  , getWarehouseStocksRequestArchived :: Maybe Bool -- ^ Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить информацию об остатках товаров, которые находятся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращается информация о товарах, которые не находятся в архиве. 
  , getWarehouseStocksRequestOfferIds :: Maybe [Text] -- ^ Фильтр по вашим SKU товаров.  Возвращается информация об остатках всех переданных SKU, включая товары в архиве.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit` * `archived`  {% endnote %}    
  } deriving (Show, Eq, Generic)

instance FromJSON GetWarehouseStocksRequest where
  parseJSON = genericParseJSON optionsGetWarehouseStocksRequest
instance ToJSON GetWarehouseStocksRequest where
  toJSON = genericToJSON optionsGetWarehouseStocksRequest

optionsGetWarehouseStocksRequest :: Options
optionsGetWarehouseStocksRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getWarehouseStocksRequestWithTurnover", "withTurnover")
      , ("getWarehouseStocksRequestArchived", "archived")
      , ("getWarehouseStocksRequestOfferIds", "offerIds")
      ]


-- | 
data GetWarehouseStocksResponse = GetWarehouseStocksResponse
  { getWarehouseStocksResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getWarehouseStocksResponseResult :: Maybe GetWarehouseStocksDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetWarehouseStocksResponse where
  parseJSON = genericParseJSON optionsGetWarehouseStocksResponse
instance ToJSON GetWarehouseStocksResponse where
  toJSON = genericToJSON optionsGetWarehouseStocksResponse

optionsGetWarehouseStocksResponse :: Options
optionsGetWarehouseStocksResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getWarehouseStocksResponseStatus", "status")
      , ("getWarehouseStocksResponseResult", "result")
      ]


-- | 
data GetWarehousesResponse = GetWarehousesResponse
  { getWarehousesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , getWarehousesResponseResult :: Maybe WarehousesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GetWarehousesResponse where
  parseJSON = genericParseJSON optionsGetWarehousesResponse
instance ToJSON GetWarehousesResponse where
  toJSON = genericToJSON optionsGetWarehousesResponse

optionsGetWarehousesResponse :: Options
optionsGetWarehousesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("getWarehousesResponseStatus", "status")
      , ("getWarehousesResponseResult", "result")
      ]


-- | Информация об авторе комментария.
data GoodsFeedbackCommentAuthorDTO = GoodsFeedbackCommentAuthorDTO
  { goodsFeedbackCommentAuthorDTOType :: Maybe GoodsFeedbackCommentAuthorType -- ^ 
  , goodsFeedbackCommentAuthorDTOName :: Maybe Text -- ^ Имя автора или название кабинета.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackCommentAuthorDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackCommentAuthorDTO
instance ToJSON GoodsFeedbackCommentAuthorDTO where
  toJSON = genericToJSON optionsGoodsFeedbackCommentAuthorDTO

optionsGoodsFeedbackCommentAuthorDTO :: Options
optionsGoodsFeedbackCommentAuthorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackCommentAuthorDTOType", "type")
      , ("goodsFeedbackCommentAuthorDTOName", "name")
      ]


-- | Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;BUSINESS&#x60; — кабинет. 
data GoodsFeedbackCommentAuthorType = GoodsFeedbackCommentAuthorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackCommentAuthorType where
  parseJSON = genericParseJSON optionsGoodsFeedbackCommentAuthorType
instance ToJSON GoodsFeedbackCommentAuthorType where
  toJSON = genericToJSON optionsGoodsFeedbackCommentAuthorType

optionsGoodsFeedbackCommentAuthorType :: Options
optionsGoodsFeedbackCommentAuthorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Комментарий к отзыву.
data GoodsFeedbackCommentDTO = GoodsFeedbackCommentDTO
  { goodsFeedbackCommentDTOId :: Int64 -- ^ Идентификатор комментария к отзыву. 
  , goodsFeedbackCommentDTOText :: Text -- ^ Текст комментария.
  , goodsFeedbackCommentDTOCanModify :: Maybe Bool -- ^ Может ли продавец изменять комментарий или удалять его.
  , goodsFeedbackCommentDTOParentId :: Maybe Int64 -- ^ Идентификатор комментария к отзыву. 
  , goodsFeedbackCommentDTOAuthor :: GoodsFeedbackCommentAuthorDTO -- ^ 
  , goodsFeedbackCommentDTOStatus :: GoodsFeedbackCommentStatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackCommentDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackCommentDTO
instance ToJSON GoodsFeedbackCommentDTO where
  toJSON = genericToJSON optionsGoodsFeedbackCommentDTO

optionsGoodsFeedbackCommentDTO :: Options
optionsGoodsFeedbackCommentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackCommentDTOId", "id")
      , ("goodsFeedbackCommentDTOText", "text")
      , ("goodsFeedbackCommentDTOCanModify", "canModify")
      , ("goodsFeedbackCommentDTOParentId", "parentId")
      , ("goodsFeedbackCommentDTOAuthor", "author")
      , ("goodsFeedbackCommentDTOStatus", "status")
      ]


-- | Комментарии к отзыву.
data GoodsFeedbackCommentListDTO = GoodsFeedbackCommentListDTO
  { goodsFeedbackCommentListDTOComments :: [GoodsFeedbackCommentDTO] -- ^ Список комментариев.
  , goodsFeedbackCommentListDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackCommentListDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackCommentListDTO
instance ToJSON GoodsFeedbackCommentListDTO where
  toJSON = genericToJSON optionsGoodsFeedbackCommentListDTO

optionsGoodsFeedbackCommentListDTO :: Options
optionsGoodsFeedbackCommentListDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackCommentListDTOComments", "comments")
      , ("goodsFeedbackCommentListDTOPaging", "paging")
      ]


-- | Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
data GoodsFeedbackCommentStatusType = GoodsFeedbackCommentStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackCommentStatusType where
  parseJSON = genericParseJSON optionsGoodsFeedbackCommentStatusType
instance ToJSON GoodsFeedbackCommentStatusType where
  toJSON = genericToJSON optionsGoodsFeedbackCommentStatusType

optionsGoodsFeedbackCommentStatusType :: Options
optionsGoodsFeedbackCommentStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Отзыв о товаре.
data GoodsFeedbackDTO = GoodsFeedbackDTO
  { goodsFeedbackDTOFeedbackId :: Int64 -- ^ Идентификатор отзыва. 
  , goodsFeedbackDTOCreatedAt :: UTCTime -- ^ Дата и время создания отзыва.
  , goodsFeedbackDTONeedReaction :: Bool -- ^ Нужен ли ответ на отзыв.
  , goodsFeedbackDTOIdentifiers :: GoodsFeedbackIdentifiersDTO -- ^ 
  , goodsFeedbackDTOAuthor :: Maybe Text -- ^ Имя автора отзыва.
  , goodsFeedbackDTODescription :: Maybe GoodsFeedbackDescriptionDTO -- ^ 
  , goodsFeedbackDTOMedia :: Maybe GoodsFeedbackMediaDTO -- ^ 
  , goodsFeedbackDTOStatistics :: GoodsFeedbackStatisticsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackDTO
instance ToJSON GoodsFeedbackDTO where
  toJSON = genericToJSON optionsGoodsFeedbackDTO

optionsGoodsFeedbackDTO :: Options
optionsGoodsFeedbackDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackDTOFeedbackId", "feedbackId")
      , ("goodsFeedbackDTOCreatedAt", "createdAt")
      , ("goodsFeedbackDTONeedReaction", "needReaction")
      , ("goodsFeedbackDTOIdentifiers", "identifiers")
      , ("goodsFeedbackDTOAuthor", "author")
      , ("goodsFeedbackDTODescription", "description")
      , ("goodsFeedbackDTOMedia", "media")
      , ("goodsFeedbackDTOStatistics", "statistics")
      ]


-- | Текстовая часть отзыва.
data GoodsFeedbackDescriptionDTO = GoodsFeedbackDescriptionDTO
  { goodsFeedbackDescriptionDTOAdvantages :: Maybe Text -- ^ Описание плюсов товара в отзыве.
  , goodsFeedbackDescriptionDTODisadvantages :: Maybe Text -- ^ Описание минусов товара в отзыве.
  , goodsFeedbackDescriptionDTOComment :: Maybe Text -- ^ Комментарий в отзыве.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackDescriptionDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackDescriptionDTO
instance ToJSON GoodsFeedbackDescriptionDTO where
  toJSON = genericToJSON optionsGoodsFeedbackDescriptionDTO

optionsGoodsFeedbackDescriptionDTO :: Options
optionsGoodsFeedbackDescriptionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackDescriptionDTOAdvantages", "advantages")
      , ("goodsFeedbackDescriptionDTODisadvantages", "disadvantages")
      , ("goodsFeedbackDescriptionDTOComment", "comment")
      ]


-- | Идентификаторы, которые связаны с отзывом.
data GoodsFeedbackIdentifiersDTO = GoodsFeedbackIdentifiersDTO
  { goodsFeedbackIdentifiersDTOOrderId :: Int64 -- ^ Идентификатор заказа на Маркете.
  , goodsFeedbackIdentifiersDTOModelId :: Int64 -- ^ Идентификатор модели товара.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackIdentifiersDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackIdentifiersDTO
instance ToJSON GoodsFeedbackIdentifiersDTO where
  toJSON = genericToJSON optionsGoodsFeedbackIdentifiersDTO

optionsGoodsFeedbackIdentifiersDTO :: Options
optionsGoodsFeedbackIdentifiersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackIdentifiersDTOOrderId", "orderId")
      , ("goodsFeedbackIdentifiersDTOModelId", "modelId")
      ]


-- | Список отзывов о товарах. 
data GoodsFeedbackListDTO = GoodsFeedbackListDTO
  { goodsFeedbackListDTOFeedbacks :: [GoodsFeedbackDTO] -- ^ Список отзывов.
  , goodsFeedbackListDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackListDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackListDTO
instance ToJSON GoodsFeedbackListDTO where
  toJSON = genericToJSON optionsGoodsFeedbackListDTO

optionsGoodsFeedbackListDTO :: Options
optionsGoodsFeedbackListDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackListDTOFeedbacks", "feedbacks")
      , ("goodsFeedbackListDTOPaging", "paging")
      ]


-- | Фото и видео.
data GoodsFeedbackMediaDTO = GoodsFeedbackMediaDTO
  { goodsFeedbackMediaDTOPhotos :: Maybe [Text] -- ^ Ссылки на фото.
  , goodsFeedbackMediaDTOVideos :: Maybe [Text] -- ^ Ссылки на видео.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackMediaDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackMediaDTO
instance ToJSON GoodsFeedbackMediaDTO where
  toJSON = genericToJSON optionsGoodsFeedbackMediaDTO

optionsGoodsFeedbackMediaDTO :: Options
optionsGoodsFeedbackMediaDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackMediaDTOPhotos", "photos")
      , ("goodsFeedbackMediaDTOVideos", "videos")
      ]


-- | Статистическая информация по отзыву.
data GoodsFeedbackStatisticsDTO = GoodsFeedbackStatisticsDTO
  { goodsFeedbackStatisticsDTORating :: Int -- ^ Оценка товара.
  , goodsFeedbackStatisticsDTOCommentsCount :: Int64 -- ^ Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии. 
  , goodsFeedbackStatisticsDTORecommended :: Maybe Bool -- ^ Рекомендуют ли этот товар.
  , goodsFeedbackStatisticsDTOPaidAmount :: Maybe Int64 -- ^ Количество баллов Плюса, которое автор получил за отзыв.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsFeedbackStatisticsDTO where
  parseJSON = genericParseJSON optionsGoodsFeedbackStatisticsDTO
instance ToJSON GoodsFeedbackStatisticsDTO where
  toJSON = genericToJSON optionsGoodsFeedbackStatisticsDTO

optionsGoodsFeedbackStatisticsDTO :: Options
optionsGoodsFeedbackStatisticsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsFeedbackStatisticsDTORating", "rating")
      , ("goodsFeedbackStatisticsDTOCommentsCount", "commentsCount")
      , ("goodsFeedbackStatisticsDTORecommended", "recommended")
      , ("goodsFeedbackStatisticsDTOPaidAmount", "paidAmount")
      ]


-- | Отчет по товарам.
data GoodsStatsDTO = GoodsStatsDTO
  { goodsStatsDTOShopSkus :: [GoodsStatsGoodsDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsStatsDTO where
  parseJSON = genericParseJSON optionsGoodsStatsDTO
instance ToJSON GoodsStatsDTO where
  toJSON = genericToJSON optionsGoodsStatsDTO

optionsGoodsStatsDTO :: Options
optionsGoodsStatsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsStatsDTOShopSkus", "shopSkus")
      ]


-- | Информация о товаре.
data GoodsStatsGoodsDTO = GoodsStatsGoodsDTO
  { goodsStatsGoodsDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , goodsStatsGoodsDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , goodsStatsGoodsDTOName :: Maybe Text -- ^ Название товара.
  , goodsStatsGoodsDTOPrice :: Maybe Double -- ^ Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
  , goodsStatsGoodsDTOCategoryId :: Maybe Int64 -- ^ Идентификатор категории товара на Маркете.
  , goodsStatsGoodsDTOCategoryName :: Maybe Text -- ^ Название категории товара на Маркете.
  , goodsStatsGoodsDTOWeightDimensions :: Maybe GoodsStatsWeightDimensionsDTO -- ^ 
  , goodsStatsGoodsDTOWarehouses :: Maybe [GoodsStatsWarehouseDTO] -- ^ Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
  , goodsStatsGoodsDTOTariffs :: Maybe [TariffDTO] -- ^ Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
  , goodsStatsGoodsDTOPictures :: Maybe [Text] -- ^ Ссылки (URL) изображений товара в хорошем качестве.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsStatsGoodsDTO where
  parseJSON = genericParseJSON optionsGoodsStatsGoodsDTO
instance ToJSON GoodsStatsGoodsDTO where
  toJSON = genericToJSON optionsGoodsStatsGoodsDTO

optionsGoodsStatsGoodsDTO :: Options
optionsGoodsStatsGoodsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsStatsGoodsDTOShopSku", "shopSku")
      , ("goodsStatsGoodsDTOMarketSku", "marketSku")
      , ("goodsStatsGoodsDTOName", "name")
      , ("goodsStatsGoodsDTOPrice", "price")
      , ("goodsStatsGoodsDTOCategoryId", "categoryId")
      , ("goodsStatsGoodsDTOCategoryName", "categoryName")
      , ("goodsStatsGoodsDTOWeightDimensions", "weightDimensions")
      , ("goodsStatsGoodsDTOWarehouses", "warehouses")
      , ("goodsStatsGoodsDTOTariffs", "tariffs")
      , ("goodsStatsGoodsDTOPictures", "pictures")
      ]


-- | Информация о складе.
data GoodsStatsWarehouseDTO = GoodsStatsWarehouseDTO
  { goodsStatsWarehouseDTOId :: Maybe Int64 -- ^ Идентификатор склада.
  , goodsStatsWarehouseDTOName :: Maybe Text -- ^ Название склада.
  , goodsStatsWarehouseDTOStocks :: [WarehouseStockDTO] -- ^ Информация об остатках товаров на складе.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsStatsWarehouseDTO where
  parseJSON = genericParseJSON optionsGoodsStatsWarehouseDTO
instance ToJSON GoodsStatsWarehouseDTO where
  toJSON = genericToJSON optionsGoodsStatsWarehouseDTO

optionsGoodsStatsWarehouseDTO :: Options
optionsGoodsStatsWarehouseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsStatsWarehouseDTOId", "id")
      , ("goodsStatsWarehouseDTOName", "name")
      , ("goodsStatsWarehouseDTOStocks", "stocks")
      ]


-- | Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
data GoodsStatsWeightDimensionsDTO = GoodsStatsWeightDimensionsDTO
  { goodsStatsWeightDimensionsDTOLength :: Maybe Double -- ^ Длина товара в сантиметрах.
  , goodsStatsWeightDimensionsDTOWidth :: Maybe Double -- ^ Ширина товара в сантиметрах.
  , goodsStatsWeightDimensionsDTOHeight :: Maybe Double -- ^ Высота товара в сантиметрах.
  , goodsStatsWeightDimensionsDTOWeight :: Maybe Double -- ^ Вес товара в килограммах.
  } deriving (Show, Eq, Generic)

instance FromJSON GoodsStatsWeightDimensionsDTO where
  parseJSON = genericParseJSON optionsGoodsStatsWeightDimensionsDTO
instance ToJSON GoodsStatsWeightDimensionsDTO where
  toJSON = genericToJSON optionsGoodsStatsWeightDimensionsDTO

optionsGoodsStatsWeightDimensionsDTO :: Options
optionsGoodsStatsWeightDimensionsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("goodsStatsWeightDimensionsDTOLength", "length")
      , ("goodsStatsWeightDimensionsDTOWidth", "width")
      , ("goodsStatsWeightDimensionsDTOHeight", "height")
      , ("goodsStatsWeightDimensionsDTOWeight", "weight")
      ]


-- | GPS-координаты широты и долготы. 
data GpsDTO = GpsDTO
  { gpsDTOLatitude :: Double -- ^ Широта.
  , gpsDTOLongitude :: Double -- ^ Долгота.
  } deriving (Show, Eq, Generic)

instance FromJSON GpsDTO where
  parseJSON = genericParseJSON optionsGpsDTO
instance ToJSON GpsDTO where
  toJSON = genericToJSON optionsGpsDTO

optionsGpsDTO :: Options
optionsGpsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("gpsDTOLatitude", "latitude")
      , ("gpsDTOLongitude", "longitude")
      ]


-- | Информация о скрытии.
data HiddenOfferDTO = HiddenOfferDTO
  { hiddenOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  } deriving (Show, Eq, Generic)

instance FromJSON HiddenOfferDTO where
  parseJSON = genericParseJSON optionsHiddenOfferDTO
instance ToJSON HiddenOfferDTO where
  toJSON = genericToJSON optionsHiddenOfferDTO

optionsHiddenOfferDTO :: Options
optionsHiddenOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("hiddenOfferDTOOfferId", "offerId")
      ]


-- | Язык:  * &#x60;RU&#x60; — русский.  * &#x60;EN&#x60; — английский. 
data LanguageType = LanguageType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LanguageType where
  parseJSON = genericParseJSON optionsLanguageType
instance ToJSON LanguageType where
  toJSON = genericToJSON optionsLanguageType

optionsLanguageType :: Options
optionsLanguageType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
data LicenseCheckStatusType = LicenseCheckStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LicenseCheckStatusType where
  parseJSON = genericParseJSON optionsLicenseCheckStatusType
instance ToJSON LicenseCheckStatusType where
  toJSON = genericToJSON optionsLicenseCheckStatusType

optionsLicenseCheckStatusType :: Options
optionsLicenseCheckStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип лицензии:  * &#x60;ALCOHOL&#x60; — лицензия на розничную продажу алкогольной продукции. 
data LicenseType = LicenseType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LicenseType where
  parseJSON = genericParseJSON optionsLicenseType
instance ToJSON LicenseType where
  toJSON = genericToJSON optionsLicenseType

optionsLicenseType :: Options
optionsLicenseType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Описание пункта вывоза для возврата.
data LogisticPickupPointDTO = LogisticPickupPointDTO
  { logisticPickupPointDTOId :: Maybe Int64 -- ^ Идентификатор пункта вывоза.
  , logisticPickupPointDTOName :: Maybe Text -- ^ Название пункта вывоза.
  , logisticPickupPointDTOAddress :: Maybe PickupAddressDTO -- ^ 
  , logisticPickupPointDTOInstruction :: Maybe Text -- ^ Дополнительные инструкции к вывозу.
  , logisticPickupPointDTOType :: Maybe LogisticPointType -- ^ 
  , logisticPickupPointDTOLogisticPartnerId :: Maybe Int64 -- ^ Идентификатор логистического партнера, к которому относится логистическая точка.
  } deriving (Show, Eq, Generic)

instance FromJSON LogisticPickupPointDTO where
  parseJSON = genericParseJSON optionsLogisticPickupPointDTO
instance ToJSON LogisticPickupPointDTO where
  toJSON = genericToJSON optionsLogisticPickupPointDTO

optionsLogisticPickupPointDTO :: Options
optionsLogisticPickupPointDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("logisticPickupPointDTOId", "id")
      , ("logisticPickupPointDTOName", "name")
      , ("logisticPickupPointDTOAddress", "address")
      , ("logisticPickupPointDTOInstruction", "instruction")
      , ("logisticPickupPointDTOType", "type")
      , ("logisticPickupPointDTOLogisticPartnerId", "logisticPartnerId")
      ]


-- | Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
data LogisticPointType = LogisticPointType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON LogisticPointType where
  parseJSON = genericParseJSON optionsLogisticPointType
instance ToJSON LogisticPointType where
  toJSON = genericToJSON optionsLogisticPointType

optionsLogisticPointType :: Options
optionsLogisticPointType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о товарах в каталоге.
data MappingsOfferDTO = MappingsOfferDTO
  { mappingsOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , mappingsOfferDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , mappingsOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , mappingsOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , mappingsOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , mappingsOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , mappingsOfferDTOId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , mappingsOfferDTOFeedId :: Maybe Int64 -- ^ Идентификатор фида.
  , mappingsOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , mappingsOfferDTOUrls :: Maybe [Text] -- ^ URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  , mappingsOfferDTOPictures :: Maybe [Text] -- ^ Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  , mappingsOfferDTOManufacturer :: Maybe Text -- ^ Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  , mappingsOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  , mappingsOfferDTOMinShipment :: Maybe Int -- ^ Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  , mappingsOfferDTOTransportUnitSize :: Maybe Int -- ^ Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  , mappingsOfferDTOQuantumOfSupply :: Maybe Int -- ^ Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  , mappingsOfferDTODeliveryDurationDays :: Maybe Int -- ^ Срок, за который продавец поставляет товары на склад, в днях.
  , mappingsOfferDTOBoxCount :: Maybe Int -- ^ Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  , mappingsOfferDTOCustomsCommodityCodes :: Maybe [Text] -- ^ Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  , mappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , mappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType] -- ^ Дни недели, в которые продавец поставляет товары на склад.
  , mappingsOfferDTOShelfLifeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  , mappingsOfferDTOLifeTimeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  , mappingsOfferDTOGuaranteePeriodDays :: Maybe Int -- ^ Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  , mappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO -- ^ 
  , mappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType -- ^ 
  , mappingsOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferDTOCertificate :: Maybe Text -- ^ Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  , mappingsOfferDTOPrice :: Maybe Double -- ^ Цена на товар в рублях.
  } deriving (Show, Eq, Generic)

instance FromJSON MappingsOfferDTO where
  parseJSON = genericParseJSON optionsMappingsOfferDTO
instance ToJSON MappingsOfferDTO where
  toJSON = genericToJSON optionsMappingsOfferDTO

optionsMappingsOfferDTO :: Options
optionsMappingsOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mappingsOfferDTOName", "name")
      , ("mappingsOfferDTOShopSku", "shopSku")
      , ("mappingsOfferDTOCategory", "category")
      , ("mappingsOfferDTOVendor", "vendor")
      , ("mappingsOfferDTOVendorCode", "vendorCode")
      , ("mappingsOfferDTODescription", "description")
      , ("mappingsOfferDTOId", "id")
      , ("mappingsOfferDTOFeedId", "feedId")
      , ("mappingsOfferDTOBarcodes", "barcodes")
      , ("mappingsOfferDTOUrls", "urls")
      , ("mappingsOfferDTOPictures", "pictures")
      , ("mappingsOfferDTOManufacturer", "manufacturer")
      , ("mappingsOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("mappingsOfferDTOMinShipment", "minShipment")
      , ("mappingsOfferDTOTransportUnitSize", "transportUnitSize")
      , ("mappingsOfferDTOQuantumOfSupply", "quantumOfSupply")
      , ("mappingsOfferDTODeliveryDurationDays", "deliveryDurationDays")
      , ("mappingsOfferDTOBoxCount", "boxCount")
      , ("mappingsOfferDTOCustomsCommodityCodes", "customsCommodityCodes")
      , ("mappingsOfferDTOWeightDimensions", "weightDimensions")
      , ("mappingsOfferDTOSupplyScheduleDays", "supplyScheduleDays")
      , ("mappingsOfferDTOShelfLifeDays", "shelfLifeDays")
      , ("mappingsOfferDTOLifeTimeDays", "lifeTimeDays")
      , ("mappingsOfferDTOGuaranteePeriodDays", "guaranteePeriodDays")
      , ("mappingsOfferDTOProcessingState", "processingState")
      , ("mappingsOfferDTOAvailability", "availability")
      , ("mappingsOfferDTOShelfLife", "shelfLife")
      , ("mappingsOfferDTOLifeTime", "lifeTime")
      , ("mappingsOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("mappingsOfferDTOCertificate", "certificate")
      , ("mappingsOfferDTOPrice", "price")
      ]


-- | Базовая информация о товарах в каталоге.
data MappingsOfferInfoDTO = MappingsOfferInfoDTO
  { mappingsOfferInfoDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , mappingsOfferInfoDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , mappingsOfferInfoDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , mappingsOfferInfoDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , mappingsOfferInfoDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , mappingsOfferInfoDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , mappingsOfferInfoDTOId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , mappingsOfferInfoDTOFeedId :: Maybe Int64 -- ^ Идентификатор фида.
  , mappingsOfferInfoDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , mappingsOfferInfoDTOUrls :: Maybe [Text] -- ^ URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  , mappingsOfferInfoDTOPictures :: Maybe [Text] -- ^ Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  , mappingsOfferInfoDTOManufacturer :: Maybe Text -- ^ Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  , mappingsOfferInfoDTOManufacturerCountries :: Maybe [Text] -- ^ Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  , mappingsOfferInfoDTOMinShipment :: Maybe Int -- ^ Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  , mappingsOfferInfoDTOTransportUnitSize :: Maybe Int -- ^ Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  , mappingsOfferInfoDTOQuantumOfSupply :: Maybe Int -- ^ Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  , mappingsOfferInfoDTODeliveryDurationDays :: Maybe Int -- ^ Срок, за который продавец поставляет товары на склад, в днях.
  , mappingsOfferInfoDTOBoxCount :: Maybe Int -- ^ Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  , mappingsOfferInfoDTOCustomsCommodityCodes :: Maybe [Text] -- ^ Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  , mappingsOfferInfoDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , mappingsOfferInfoDTOSupplyScheduleDays :: Maybe [DayOfWeekType] -- ^ Дни недели, в которые продавец поставляет товары на склад.
  , mappingsOfferInfoDTOShelfLifeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  , mappingsOfferInfoDTOLifeTimeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  , mappingsOfferInfoDTOGuaranteePeriodDays :: Maybe Int -- ^ Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  , mappingsOfferInfoDTOProcessingState :: Maybe OfferProcessingStateDTO -- ^ 
  , mappingsOfferInfoDTOAvailability :: Maybe OfferAvailabilityStatusType -- ^ 
  , mappingsOfferInfoDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferInfoDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferInfoDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , mappingsOfferInfoDTOCertificate :: Maybe Text -- ^ Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  } deriving (Show, Eq, Generic)

instance FromJSON MappingsOfferInfoDTO where
  parseJSON = genericParseJSON optionsMappingsOfferInfoDTO
instance ToJSON MappingsOfferInfoDTO where
  toJSON = genericToJSON optionsMappingsOfferInfoDTO

optionsMappingsOfferInfoDTO :: Options
optionsMappingsOfferInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("mappingsOfferInfoDTOName", "name")
      , ("mappingsOfferInfoDTOShopSku", "shopSku")
      , ("mappingsOfferInfoDTOCategory", "category")
      , ("mappingsOfferInfoDTOVendor", "vendor")
      , ("mappingsOfferInfoDTOVendorCode", "vendorCode")
      , ("mappingsOfferInfoDTODescription", "description")
      , ("mappingsOfferInfoDTOId", "id")
      , ("mappingsOfferInfoDTOFeedId", "feedId")
      , ("mappingsOfferInfoDTOBarcodes", "barcodes")
      , ("mappingsOfferInfoDTOUrls", "urls")
      , ("mappingsOfferInfoDTOPictures", "pictures")
      , ("mappingsOfferInfoDTOManufacturer", "manufacturer")
      , ("mappingsOfferInfoDTOManufacturerCountries", "manufacturerCountries")
      , ("mappingsOfferInfoDTOMinShipment", "minShipment")
      , ("mappingsOfferInfoDTOTransportUnitSize", "transportUnitSize")
      , ("mappingsOfferInfoDTOQuantumOfSupply", "quantumOfSupply")
      , ("mappingsOfferInfoDTODeliveryDurationDays", "deliveryDurationDays")
      , ("mappingsOfferInfoDTOBoxCount", "boxCount")
      , ("mappingsOfferInfoDTOCustomsCommodityCodes", "customsCommodityCodes")
      , ("mappingsOfferInfoDTOWeightDimensions", "weightDimensions")
      , ("mappingsOfferInfoDTOSupplyScheduleDays", "supplyScheduleDays")
      , ("mappingsOfferInfoDTOShelfLifeDays", "shelfLifeDays")
      , ("mappingsOfferInfoDTOLifeTimeDays", "lifeTimeDays")
      , ("mappingsOfferInfoDTOGuaranteePeriodDays", "guaranteePeriodDays")
      , ("mappingsOfferInfoDTOProcessingState", "processingState")
      , ("mappingsOfferInfoDTOAvailability", "availability")
      , ("mappingsOfferInfoDTOShelfLife", "shelfLife")
      , ("mappingsOfferInfoDTOLifeTime", "lifeTime")
      , ("mappingsOfferInfoDTOGuaranteePeriod", "guaranteePeriod")
      , ("mappingsOfferInfoDTOCertificate", "certificate")
      ]


-- | Лимит на установку кванта и минимального количества товаров по категориям. 
data MaxSaleQuantumDTO = MaxSaleQuantumDTO
  { maxSaleQuantumDTOId :: Int64 -- ^ Идентификатор категории.
  , maxSaleQuantumDTOName :: Maybe Text -- ^ Название категории.
  , maxSaleQuantumDTOMaxSaleQuantum :: Maybe Int -- ^ Лимит на установку кванта и минимального количества товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON MaxSaleQuantumDTO where
  parseJSON = genericParseJSON optionsMaxSaleQuantumDTO
instance ToJSON MaxSaleQuantumDTO where
  toJSON = genericToJSON optionsMaxSaleQuantumDTO

optionsMaxSaleQuantumDTO :: Options
optionsMaxSaleQuantumDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("maxSaleQuantumDTOId", "id")
      , ("maxSaleQuantumDTOName", "name")
      , ("maxSaleQuantumDTOMaxSaleQuantum", "maxSaleQuantum")
      ]


-- | Тип акции:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду. 
data MechanicsType = MechanicsType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON MechanicsType where
  parseJSON = genericParseJSON optionsMechanicsType
instance ToJSON MechanicsType where
  toJSON = genericToJSON optionsMechanicsType

optionsMechanicsType :: Options
optionsMechanicsType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Модель товара.
data ModelDTO = ModelDTO
  { modelDTOId :: Maybe Int64 -- ^ Идентификатор модели товара.
  , modelDTOName :: Maybe Text -- ^ Название модели товара.
  , modelDTOPrices :: Maybe ModelPriceDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ModelDTO where
  parseJSON = genericParseJSON optionsModelDTO
instance ToJSON ModelDTO where
  toJSON = genericToJSON optionsModelDTO

optionsModelDTO :: Options
optionsModelDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelDTOId", "id")
      , ("modelDTOName", "name")
      , ("modelDTOPrices", "prices")
      ]


-- | Информация о предложении.
data ModelOfferDTO = ModelOfferDTO
  { modelOfferDTODiscount :: Maybe Int -- ^ Скидка на предложение в процентах.
  , modelOfferDTOName :: Maybe Text -- ^ Наименование предложения.
  , modelOfferDTOPos :: Maybe Int -- ^ Позиция предложения в выдаче Маркета на карточке модели.
  , modelOfferDTOPreDiscountPrice :: Maybe Double -- ^ Цена предложения без скидки магазина.
  , modelOfferDTOPrice :: Maybe Double -- ^ Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  , modelOfferDTORegionId :: Maybe Int64 -- ^ Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  , modelOfferDTOShippingCost :: Maybe Double -- ^ Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  , modelOfferDTOShopName :: Maybe Text -- ^ Название магазина (в том виде, в котором отображается на Маркете).
  , modelOfferDTOShopRating :: Maybe Int -- ^ Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  , modelOfferDTOInStock :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  } deriving (Show, Eq, Generic)

instance FromJSON ModelOfferDTO where
  parseJSON = genericParseJSON optionsModelOfferDTO
instance ToJSON ModelOfferDTO where
  toJSON = genericToJSON optionsModelOfferDTO

optionsModelOfferDTO :: Options
optionsModelOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelOfferDTODiscount", "discount")
      , ("modelOfferDTOName", "name")
      , ("modelOfferDTOPos", "pos")
      , ("modelOfferDTOPreDiscountPrice", "preDiscountPrice")
      , ("modelOfferDTOPrice", "price")
      , ("modelOfferDTORegionId", "regionId")
      , ("modelOfferDTOShippingCost", "shippingCost")
      , ("modelOfferDTOShopName", "shopName")
      , ("modelOfferDTOShopRating", "shopRating")
      , ("modelOfferDTOInStock", "inStock")
      ]


-- | Информация о ценах на модель товара.
data ModelPriceDTO = ModelPriceDTO
  { modelPriceDTOAvg :: Maybe Double -- ^ Средняя цена предложения для модели в регионе.
  , modelPriceDTOMax :: Maybe Double -- ^ Максимальная цена предложения для модели в регионе.
  , modelPriceDTOMin :: Maybe Double -- ^ Минимальная цена предложения для модели в регионе.
  } deriving (Show, Eq, Generic)

instance FromJSON ModelPriceDTO where
  parseJSON = genericParseJSON optionsModelPriceDTO
instance ToJSON ModelPriceDTO where
  toJSON = genericToJSON optionsModelPriceDTO

optionsModelPriceDTO :: Options
optionsModelPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelPriceDTOAvg", "avg")
      , ("modelPriceDTOMax", "max")
      , ("modelPriceDTOMin", "min")
      ]


-- | Список моделей товаров.
data ModelsDTO = ModelsDTO
  { modelsDTOModels :: [ModelDTO] -- ^ Список моделей товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON ModelsDTO where
  parseJSON = genericParseJSON optionsModelsDTO
instance ToJSON ModelsDTO where
  toJSON = genericToJSON optionsModelsDTO

optionsModelsDTO :: Options
optionsModelsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelsDTOModels", "models")
      ]


-- | Планы по поставкам:  * &#x60;ACTIVE&#x60; — поставки будут. * &#x60;INACTIVE&#x60; — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на &#x60;DELISTED&#x60;. * &#x60;DELISTED&#x60; — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на &#x60;INACTIVE&#x60;. 
data OfferAvailabilityStatusType = OfferAvailabilityStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferAvailabilityStatusType where
  parseJSON = genericParseJSON optionsOfferAvailabilityStatusType
instance ToJSON OfferAvailabilityStatusType where
  toJSON = genericToJSON optionsOfferAvailabilityStatusType

optionsOfferAvailabilityStatusType :: Options
optionsOfferAvailabilityStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус товара в магазине.
data OfferCampaignStatusDTO = OfferCampaignStatusDTO
  { offerCampaignStatusDTOCampaignId :: Int64 -- ^ Идентификатор кампании. 
  , offerCampaignStatusDTOStatus :: OfferCampaignStatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCampaignStatusDTO where
  parseJSON = genericParseJSON optionsOfferCampaignStatusDTO
instance ToJSON OfferCampaignStatusDTO where
  toJSON = genericToJSON optionsOfferCampaignStatusDTO

optionsOfferCampaignStatusDTO :: Options
optionsOfferCampaignStatusDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerCampaignStatusDTOCampaignId", "campaignId")
      , ("offerCampaignStatusDTOStatus", "status")
      ]


-- | Статус товара:  * &#x60;PUBLISHED&#x60; — Готов к продаже. * &#x60;CHECKING&#x60; — На проверке. * &#x60;DISABLED_BY_PARTNER&#x60; — Скрыт вами. * &#x60;REJECTED_BY_MARKET&#x60; — Отклонен. * &#x60;DISABLED_AUTOMATICALLY&#x60; — Исправьте ошибки. * &#x60;CREATING_CARD&#x60; — Создается карточка. * &#x60;NO_CARD&#x60; — Нужна карточка. * &#x60;NO_STOCKS&#x60; — Нет на складе. * &#x60;ARCHIVED&#x60; — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
data OfferCampaignStatusType = OfferCampaignStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCampaignStatusType where
  parseJSON = genericParseJSON optionsOfferCampaignStatusType
instance ToJSON OfferCampaignStatusType where
  toJSON = genericToJSON optionsOfferCampaignStatusType

optionsOfferCampaignStatusType :: Options
optionsOfferCampaignStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
data OfferCardDTO = OfferCardDTO
  { offerCardDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerCardDTOMapping :: Maybe GetMappingDTO -- ^ 
  , offerCardDTOParameterValues :: Maybe [ParameterValueDTO] -- ^ Список характеристик с их значениями. 
  , offerCardDTOCardStatus :: Maybe OfferCardStatusType -- ^ 
  , offerCardDTOContentRating :: Maybe Int -- ^ Процент заполненности карточки.
  , offerCardDTORecommendations :: Maybe [OfferCardRecommendationDTO] -- ^ Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  , offerCardDTOErrors :: Maybe [OfferErrorDTO] -- ^ Ошибки в контенте, препятствующие размещению товара на витрине.
  , offerCardDTOWarnings :: Maybe [OfferErrorDTO] -- ^ Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCardDTO where
  parseJSON = genericParseJSON optionsOfferCardDTO
instance ToJSON OfferCardDTO where
  toJSON = genericToJSON optionsOfferCardDTO

optionsOfferCardDTO :: Options
optionsOfferCardDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerCardDTOOfferId", "offerId")
      , ("offerCardDTOMapping", "mapping")
      , ("offerCardDTOParameterValues", "parameterValues")
      , ("offerCardDTOCardStatus", "cardStatus")
      , ("offerCardDTOContentRating", "contentRating")
      , ("offerCardDTORecommendations", "recommendations")
      , ("offerCardDTOErrors", "errors")
      , ("offerCardDTOWarnings", "warnings")
      ]


-- | Рекомендация по заполнению карточки товара.
data OfferCardRecommendationDTO = OfferCardRecommendationDTO
  { offerCardRecommendationDTOType :: OfferCardRecommendationType -- ^ 
  , offerCardRecommendationDTOPercent :: Maybe Int -- ^ Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCardRecommendationDTO where
  parseJSON = genericParseJSON optionsOfferCardRecommendationDTO
instance ToJSON OfferCardRecommendationDTO where
  toJSON = genericToJSON optionsOfferCardRecommendationDTO

optionsOfferCardRecommendationDTO :: Options
optionsOfferCardRecommendationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerCardRecommendationDTOType", "type")
      , ("offerCardRecommendationDTOPercent", "percent")
      ]


-- | Рекомендация по дополнению или замене контента. Не возвращается для карточек, которые заполнены Маркетом или содержат бывшие в употреблении товары.  Часть рекомендаций относятся к **основным параметрам**, которые есть у товаров любых категорий. Другие — к тем **характеристикам**, которые есть у товара потому, что он относится к определенной категории.  **1. Рекомендации, относящиеся к основным параметрам**  Каждая такая рекомендация относится к **единственному параметру**. Чтобы заполнить этот параметр, пользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  Рекомендации по заполнению параметров в &#x60;updateOfferMappings&#x60;:  * &#x60;RECOGNIZED_VENDOR&#x60; — напишите название производителя так, как его пишет сам производитель (параметр &#x60;vendor&#x60;). * &#x60;PICTURE_COUNT&#x60; — добавьте изображения (параметр &#x60;pictures&#x60;). * &#x60;FIRST_PICTURE_SIZE&#x60; — замените первое изображение более крупным (параметр &#x60;pictures&#x60;). * &#x60;TITLE_LENGTH&#x60; — измените название (параметр &#x60;name&#x60;). Составьте название по схеме: тип + бренд или производитель + модель + особенности, если есть (размер, вес, цвет). * &#x60;DESCRIPTION_LENGTH&#x60; — добавьте описание рекомендуемого размера (параметр &#x60;description&#x60;). * &#x60;AVERAGE_PICTURE_SIZE&#x60; — замените все изображения на изображения высокого качества (параметр &#x60;pictures&#x60;). * &#x60;FIRST_VIDEO_LENGTH&#x60; — добавьте первое видео рекомендуемой длины (параметр &#x60;videos&#x60;). * &#x60;AVERAGE_VIDEO_SIZE&#x60; — замените все видео на видео высокого качества (параметр &#x60;videos&#x60;). * &#x60;VIDEO_COUNT&#x60; — добавьте больше видео (параметр &#x60;videos&#x60;).  Рекомендуемые значения параметров описаны в [Справке Яндекс Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/add/).  **2. Рекомендации, относящиеся к характеристикам по категориям**  Каждая такая рекомендация предполагает заполнение **одной или нескольких характеристик**. Чтобы узнать, какие именно характеристики нужно заполнить, воспользуйтесь запросом [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). Например, если вы получили рекомендацию &#x60;MAIN&#x60;, нужно заполнить характеристики, имеющие &#x60;MAIN&#x60; в массиве &#x60;recommendationTypes&#x60;.  Рекомендации:  * &#x60;MAIN&#x60; — заполните ключевые характеристики товара, которые используются в поиске и фильтрах. * &#x60;ADDITIONAL&#x60; — заполните дополнительные характеристики товара. * &#x60;DISTINCTIVE&#x60; — заполните характеристики, которыми отличаются друг от друга варианты товара.  **3. Устаревшие рекомендации**  * &#x60;HAS_VIDEO&#x60;. * &#x60;FILTERABLE&#x60;. * &#x60;HAS_DESCRIPTION&#x60;. * &#x60;HAS_BARCODE&#x60;. 
data OfferCardRecommendationType = OfferCardRecommendationType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCardRecommendationType where
  parseJSON = genericParseJSON optionsOfferCardRecommendationType
instance ToJSON OfferCardRecommendationType where
  toJSON = genericToJSON optionsOfferCardRecommendationType

optionsOfferCardRecommendationType :: Options
optionsOfferCardRecommendationType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус карточки товара:  * &#x60;HAS_CARD_CAN_NOT_UPDATE&#x60; — Карточка Маркета. * &#x60;HAS_CARD_CAN_UPDATE&#x60; — Можно дополнить. * &#x60;HAS_CARD_CAN_UPDATE_ERRORS&#x60; — Изменения не приняты. * &#x60;HAS_CARD_CAN_UPDATE_PROCESSING&#x60; — Изменения на проверке. * &#x60;NO_CARD_NEED_CONTENT&#x60; — Создайте карточку. * &#x60;NO_CARD_MARKET_WILL_CREATE&#x60; — Создаст Маркет. * &#x60;NO_CARD_ERRORS&#x60; — Не создана из-за ошибки. * &#x60;NO_CARD_PROCESSING&#x60; — Проверяем данные. * &#x60;NO_CARD_ADD_TO_CAMPAIGN&#x60; — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
data OfferCardStatusType = OfferCardStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCardStatusType where
  parseJSON = genericParseJSON optionsOfferCardStatusType
instance ToJSON OfferCardStatusType where
  toJSON = genericToJSON optionsOfferCardStatusType

optionsOfferCardStatusType :: Options
optionsOfferCardStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список товаров с информацией о состоянии карточек.
data OfferCardsContentStatusDTO = OfferCardsContentStatusDTO
  { offerCardsContentStatusDTOOfferCards :: [OfferCardDTO] -- ^ Страница списка товаров с информацией о состоянии карточек.
  , offerCardsContentStatusDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferCardsContentStatusDTO where
  parseJSON = genericParseJSON optionsOfferCardsContentStatusDTO
instance ToJSON OfferCardsContentStatusDTO where
  toJSON = genericToJSON optionsOfferCardsContentStatusDTO

optionsOfferCardsContentStatusDTO :: Options
optionsOfferCardsContentStatusDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerCardsContentStatusDTOOfferCards", "offerCards")
      , ("offerCardsContentStatusDTOPaging", "paging")
      ]


-- | Состояние уцененного товара. 
data OfferConditionDTO = OfferConditionDTO
  { offerConditionDTOType :: Maybe OfferConditionType -- ^ 
  , offerConditionDTOQuality :: Maybe OfferConditionQualityType -- ^ 
  , offerConditionDTOReason :: Maybe Text -- ^ Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferConditionDTO where
  parseJSON = genericParseJSON optionsOfferConditionDTO
instance ToJSON OfferConditionDTO where
  toJSON = genericToJSON optionsOfferConditionDTO

optionsOfferConditionDTO :: Options
optionsOfferConditionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerConditionDTOType", "type")
      , ("offerConditionDTOQuality", "quality")
      , ("offerConditionDTOReason", "reason")
      ]


-- | Внешний вид товара:  * &#x60;PERFECT&#x60; — идеальный. * &#x60;EXCELLENT&#x60; — отличный. * &#x60;GOOD&#x60; — хороший. * &#x60;NOT_SPECIFIED&#x60; — не выбран. 
data OfferConditionQualityType = OfferConditionQualityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferConditionQualityType where
  parseJSON = genericParseJSON optionsOfferConditionQualityType
instance ToJSON OfferConditionQualityType where
  toJSON = genericToJSON optionsOfferConditionQualityType

optionsOfferConditionQualityType :: Options
optionsOfferConditionQualityType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип уценки:  * &#x60;PREOWNED&#x60; —  бывший в употреблении товар, раньше принадлежал другому человеку. * &#x60;SHOWCASESAMPLE&#x60; — витринный образец. * &#x60;REFURBISHED&#x60; — повторная продажа товара. * &#x60;REDUCTION&#x60; — товар с дефектами. * &#x60;RENOVATED&#x60; — восстановленный товар. * &#x60;NOT_SPECIFIED&#x60; — не выбран.  &#x60;REFURBISHED&#x60; — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
data OfferConditionType = OfferConditionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferConditionType where
  parseJSON = genericParseJSON optionsOfferConditionType
instance ToJSON OfferConditionType where
  toJSON = genericToJSON optionsOfferConditionType

optionsOfferConditionType :: Options
optionsOfferConditionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Товар с указанными характеристиками.
data OfferContentDTO = OfferContentDTO
  { offerContentDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerContentDTOCategoryId :: Int -- ^ Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).
  , offerContentDTOParameterValues :: [ParameterValueDTO] -- ^ Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferContentDTO where
  parseJSON = genericParseJSON optionsOfferContentDTO
instance ToJSON OfferContentDTO where
  toJSON = genericToJSON optionsOfferContentDTO

optionsOfferContentDTO :: Options
optionsOfferContentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerContentDTOOfferId", "offerId")
      , ("offerContentDTOCategoryId", "categoryId")
      , ("offerContentDTOParameterValues", "parameterValues")
      ]


-- | Текст ошибки.
data OfferContentErrorDTO = OfferContentErrorDTO
  { offerContentErrorDTOType :: OfferContentErrorType -- ^ 
  , offerContentErrorDTOParameterId :: Maybe Int64 -- ^ Идентификатор характеристики, с которой связана ошибка.
  , offerContentErrorDTOMessage :: Text -- ^ Текст ошибки.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferContentErrorDTO where
  parseJSON = genericParseJSON optionsOfferContentErrorDTO
instance ToJSON OfferContentErrorDTO where
  toJSON = genericToJSON optionsOfferContentErrorDTO

optionsOfferContentErrorDTO :: Options
optionsOfferContentErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerContentErrorDTOType", "type")
      , ("offerContentErrorDTOParameterId", "parameterId")
      , ("offerContentErrorDTOMessage", "message")
      ]


-- | Типы ошибок:  * &#x60;OFFER_NOT_FOUND&#x60; — такого товара нет в каталоге. * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). 
data OfferContentErrorType = OfferContentErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferContentErrorType where
  parseJSON = genericParseJSON optionsOfferContentErrorType
instance ToJSON OfferContentErrorType where
  toJSON = genericToJSON optionsOfferContentErrorType

optionsOfferContentErrorType :: Options
optionsOfferContentErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Предложение.
data OfferDTO = OfferDTO
  { offerDTOPrice :: Maybe Double -- ^ Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
  , offerDTOFeedId :: Maybe Int64 -- ^ Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
  , offerDTOId :: Maybe Text -- ^ Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
  , offerDTOShopCategoryId :: Maybe Text -- ^ Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
  , offerDTOMarketCategoryId :: Maybe Int -- ^ Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
  , offerDTOPreDiscountPrice :: Maybe Double -- ^ Цена предложения без скидки.
  , offerDTODiscount :: Maybe Int -- ^ Скидка на предложение в процентах.
  , offerDTOCutPrice :: Maybe Bool -- ^ Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
  , offerDTOUrl :: Maybe Text -- ^ URL-адрес предложения на сайте магазина.
  , offerDTOModelId :: Int64 -- ^ Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
  , offerDTOName :: Maybe Text -- ^ Наименование предложения.
  , offerDTOCurrency :: Maybe CurrencyType -- ^ 
  , offerDTOBid :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  , offerDTOCbid :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  , offerDTOFee :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
  , offerDTOBlocked :: Maybe Bool -- ^ Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferDTO where
  parseJSON = genericParseJSON optionsOfferDTO
instance ToJSON OfferDTO where
  toJSON = genericToJSON optionsOfferDTO

optionsOfferDTO :: Options
optionsOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerDTOPrice", "price")
      , ("offerDTOFeedId", "feedId")
      , ("offerDTOId", "id")
      , ("offerDTOShopCategoryId", "shopCategoryId")
      , ("offerDTOMarketCategoryId", "marketCategoryId")
      , ("offerDTOPreDiscountPrice", "preDiscountPrice")
      , ("offerDTODiscount", "discount")
      , ("offerDTOCutPrice", "cutPrice")
      , ("offerDTOUrl", "url")
      , ("offerDTOModelId", "modelId")
      , ("offerDTOName", "name")
      , ("offerDTOCurrency", "currency")
      , ("offerDTOBid", "bid")
      , ("offerDTOCbid", "cbid")
      , ("offerDTOFee", "fee")
      , ("offerDTOBlocked", "blocked")
      ]


-- | Сообщение об ошибке, связанной с размещением товара.
data OfferErrorDTO = OfferErrorDTO
  { offerErrorDTOMessage :: Maybe Text -- ^ Тип ошибки.
  , offerErrorDTOComment :: Maybe Text -- ^ Пояснение.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferErrorDTO where
  parseJSON = genericParseJSON optionsOfferErrorDTO
instance ToJSON OfferErrorDTO where
  toJSON = genericToJSON optionsOfferErrorDTO

optionsOfferErrorDTO :: Options
optionsOfferErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerErrorDTOMessage", "message")
      , ("offerErrorDTOComment", "comment")
      ]


-- | Информация о состоянии цены на товар.
data OfferForRecommendationDTO = OfferForRecommendationDTO
  { offerForRecommendationDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerForRecommendationDTOPrice :: Maybe BasePriceDTO -- ^ 
  , offerForRecommendationDTOCofinancePrice :: Maybe GetPriceDTO -- ^ 
  , offerForRecommendationDTOCompetitiveness :: Maybe PriceCompetitivenessType -- ^ 
  , offerForRecommendationDTOShows :: Maybe Int64 -- ^ Количество показов карточки товара за последние 7 дней.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferForRecommendationDTO where
  parseJSON = genericParseJSON optionsOfferForRecommendationDTO
instance ToJSON OfferForRecommendationDTO where
  toJSON = genericToJSON optionsOfferForRecommendationDTO

optionsOfferForRecommendationDTO :: Options
optionsOfferForRecommendationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerForRecommendationDTOOfferId", "offerId")
      , ("offerForRecommendationDTOPrice", "price")
      , ("offerForRecommendationDTOCofinancePrice", "cofinancePrice")
      , ("offerForRecommendationDTOCompetitiveness", "competitiveness")
      , ("offerForRecommendationDTOShows", "shows")
      ]


-- | Инструкция по использованию товара. 
data OfferManualDTO = OfferManualDTO
  { offerManualDTOUrl :: Text -- ^ Ссылка на инструкцию.
  , offerManualDTOTitle :: Maybe Text -- ^ Название инструкции, которое будет отображаться на карточке товара. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferManualDTO where
  parseJSON = genericParseJSON optionsOfferManualDTO
instance ToJSON OfferManualDTO where
  toJSON = genericToJSON optionsOfferManualDTO

optionsOfferManualDTO :: Options
optionsOfferManualDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerManualDTOUrl", "url")
      , ("offerManualDTOTitle", "title")
      ]


-- | Информация о текущей карточке товара на Маркете.
data OfferMappingDTO = OfferMappingDTO
  { offerMappingDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , offerMappingDTOModelId :: Maybe Int64 -- ^ Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
  , offerMappingDTOCategoryId :: Maybe Int64 -- ^ Идентификатор категории для текущей карточки товара на Маркете.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingDTO where
  parseJSON = genericParseJSON optionsOfferMappingDTO
instance ToJSON OfferMappingDTO where
  toJSON = genericToJSON optionsOfferMappingDTO

optionsOfferMappingDTO :: Options
optionsOfferMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingDTOMarketSku", "marketSku")
      , ("offerMappingDTOModelId", "modelId")
      , ("offerMappingDTOCategoryId", "categoryId")
      ]


-- | Информация о товарах в каталоге.
data OfferMappingEntriesDTO = OfferMappingEntriesDTO
  { offerMappingEntriesDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , offerMappingEntriesDTOOfferMappingEntries :: [OfferMappingEntryDTO] -- ^ Информация о товарах в каталоге.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingEntriesDTO where
  parseJSON = genericParseJSON optionsOfferMappingEntriesDTO
instance ToJSON OfferMappingEntriesDTO where
  toJSON = genericToJSON optionsOfferMappingEntriesDTO

optionsOfferMappingEntriesDTO :: Options
optionsOfferMappingEntriesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingEntriesDTOPaging", "paging")
      , ("offerMappingEntriesDTOOfferMappingEntries", "offerMappingEntries")
      ]


-- | Список товаров. 
data OfferMappingEntryDTO = OfferMappingEntryDTO
  { offerMappingEntryDTOMapping :: Maybe OfferMappingDTO -- ^ 
  , offerMappingEntryDTOAwaitingModerationMapping :: Maybe OfferMappingDTO -- ^ 
  , offerMappingEntryDTORejectedMapping :: Maybe OfferMappingDTO -- ^ 
  , offerMappingEntryDTOOffer :: Maybe MappingsOfferDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingEntryDTO where
  parseJSON = genericParseJSON optionsOfferMappingEntryDTO
instance ToJSON OfferMappingEntryDTO where
  toJSON = genericToJSON optionsOfferMappingEntryDTO

optionsOfferMappingEntryDTO :: Options
optionsOfferMappingEntryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingEntryDTOMapping", "mapping")
      , ("offerMappingEntryDTOAwaitingModerationMapping", "awaitingModerationMapping")
      , ("offerMappingEntryDTORejectedMapping", "rejectedMapping")
      , ("offerMappingEntryDTOOffer", "offer")
      ]


-- | Текст ошибки.
data OfferMappingErrorDTO = OfferMappingErrorDTO
  { offerMappingErrorDTOType :: OfferMappingErrorType -- ^ 
  , offerMappingErrorDTOParameterId :: Maybe Int64 -- ^ Идентификатор характеристики, с которой связана ошибка.
  , offerMappingErrorDTOMessage :: Text -- ^ Текст ошибки.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingErrorDTO where
  parseJSON = genericParseJSON optionsOfferMappingErrorDTO
instance ToJSON OfferMappingErrorDTO where
  toJSON = genericToJSON optionsOfferMappingErrorDTO

optionsOfferMappingErrorDTO :: Options
optionsOfferMappingErrorDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingErrorDTOType", "type")
      , ("offerMappingErrorDTOParameterId", "parameterId")
      , ("offerMappingErrorDTOMessage", "message")
      ]


-- | Типы ошибок:  * &#x60;UNKNOWN_CATEGORY&#x60; — указана неизвестная категория. * &#x60;CATEGORY_MISMATCH&#x60; — указана категория, которая не совпадает с категорией товара. * &#x60;EMPTY_MARKET_CATEGORY&#x60; — не указана категория Маркета при передаче характеристик категории. * &#x60;UNKNOWN_PARAMETER&#x60; — передана характеристика, которой нет среди характеристик категории. * &#x60;UNEXPECTED_BOOLEAN_VALUE&#x60; — вместо boolean-значения передано что-то другое. * &#x60;NUMBER_FORMAT&#x60; — передана строка, не обозначающая число, вместо числа. * &#x60;VALUE_BLANK&#x60; — передано пустое значение. * &#x60;INVALID_UNIT_ID&#x60; — передана единица измерения, недопустимая для характеристики. * &#x60;INVALID_GROUP_ID_LENGTH&#x60; — в названии превышено допустимое значение символов — 255. * &#x60;INVALID_GROUP_ID_CHARACTERS&#x60; — переданы [недопустимые символы](*ascii-code). * &#x60;INVALID_PICKER_URL&#x60; — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
data OfferMappingErrorType = OfferMappingErrorType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingErrorType where
  parseJSON = genericParseJSON optionsOfferMappingErrorType
instance ToJSON OfferMappingErrorType where
  toJSON = genericToJSON optionsOfferMappingErrorType

optionsOfferMappingErrorType :: Options
optionsOfferMappingErrorType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о карточке товара.
data OfferMappingInfoDTO = OfferMappingInfoDTO
  { offerMappingInfoDTOMapping :: Maybe OfferMappingDTO -- ^ 
  , offerMappingInfoDTOAwaitingModerationMapping :: Maybe OfferMappingDTO -- ^ 
  , offerMappingInfoDTORejectedMapping :: Maybe OfferMappingDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingInfoDTO where
  parseJSON = genericParseJSON optionsOfferMappingInfoDTO
instance ToJSON OfferMappingInfoDTO where
  toJSON = genericToJSON optionsOfferMappingInfoDTO

optionsOfferMappingInfoDTO :: Options
optionsOfferMappingInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingInfoDTOMapping", "mapping")
      , ("offerMappingInfoDTOAwaitingModerationMapping", "awaitingModerationMapping")
      , ("offerMappingInfoDTORejectedMapping", "rejectedMapping")
      ]


-- | Вид маппинга.
data OfferMappingKindType = OfferMappingKindType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingKindType where
  parseJSON = genericParseJSON optionsOfferMappingKindType
instance ToJSON OfferMappingKindType where
  toJSON = genericToJSON optionsOfferMappingKindType

optionsOfferMappingKindType :: Options
optionsOfferMappingKindType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список рекомендованных карточек товара.
data OfferMappingSuggestionsListDTO = OfferMappingSuggestionsListDTO
  { offerMappingSuggestionsListDTOOffers :: [EnrichedMappingsOfferDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferMappingSuggestionsListDTO where
  parseJSON = genericParseJSON optionsOfferMappingSuggestionsListDTO
instance ToJSON OfferMappingSuggestionsListDTO where
  toJSON = genericToJSON optionsOfferMappingSuggestionsListDTO

optionsOfferMappingSuggestionsListDTO :: Options
optionsOfferMappingSuggestionsListDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerMappingSuggestionsListDTOOffers", "offers")
      ]


-- | Параметры товара.  Если у товара несколько значений одного параметра, передайте их с одним и тем же &#x60;name&#x60;, но разными &#x60;value&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json \&quot;params\&quot;: [   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Зеленый\&quot;   },   {     \&quot;name\&quot;: \&quot;Цвет\&quot;,     \&quot;value\&quot;: \&quot;Желтый\&quot;   } ] &#x60;&#x60;&#x60;  {% endcut %} 
data OfferParamDTO = OfferParamDTO
  { offerParamDTOName :: Text -- ^ Название.  Должно совпадать с названием характеристики на Маркете. Узнать его можно из Excel-шаблона категории или через запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md). 
  , offerParamDTOValue :: Text -- ^ Значение. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferParamDTO where
  parseJSON = genericParseJSON optionsOfferParamDTO
instance ToJSON OfferParamDTO where
  toJSON = genericToJSON optionsOfferParamDTO

optionsOfferParamDTO :: Options
optionsOfferParamDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerParamDTOName", "name")
      , ("offerParamDTOValue", "value")
      ]


-- | Список цен.
data OfferPriceByOfferIdsListResponseDTO = OfferPriceByOfferIdsListResponseDTO
  { offerPriceByOfferIdsListResponseDTOOffers :: [OfferPriceByOfferIdsResponseDTO] -- ^ Страница списка цен.
  , offerPriceByOfferIdsListResponseDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferPriceByOfferIdsListResponseDTO where
  parseJSON = genericParseJSON optionsOfferPriceByOfferIdsListResponseDTO
instance ToJSON OfferPriceByOfferIdsListResponseDTO where
  toJSON = genericToJSON optionsOfferPriceByOfferIdsListResponseDTO

optionsOfferPriceByOfferIdsListResponseDTO :: Options
optionsOfferPriceByOfferIdsListResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerPriceByOfferIdsListResponseDTOOffers", "offers")
      , ("offerPriceByOfferIdsListResponseDTOPaging", "paging")
      ]


-- | Информация об установленной цене.
data OfferPriceByOfferIdsResponseDTO = OfferPriceByOfferIdsResponseDTO
  { offerPriceByOfferIdsResponseDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerPriceByOfferIdsResponseDTOPrice :: Maybe PriceDTO -- ^ 
  , offerPriceByOfferIdsResponseDTOUpdatedAt :: Maybe UTCTime -- ^ Дата и время последнего обновления цены.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferPriceByOfferIdsResponseDTO where
  parseJSON = genericParseJSON optionsOfferPriceByOfferIdsResponseDTO
instance ToJSON OfferPriceByOfferIdsResponseDTO where
  toJSON = genericToJSON optionsOfferPriceByOfferIdsResponseDTO

optionsOfferPriceByOfferIdsResponseDTO :: Options
optionsOfferPriceByOfferIdsResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerPriceByOfferIdsResponseDTOOfferId", "offerId")
      , ("offerPriceByOfferIdsResponseDTOPrice", "price")
      , ("offerPriceByOfferIdsResponseDTOUpdatedAt", "updatedAt")
      ]


-- | Товар с информацией о новой цене на него.
data OfferPriceDTO = OfferPriceDTO
  { offerPriceDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerPriceDTOPrice :: Maybe PriceDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferPriceDTO where
  parseJSON = genericParseJSON optionsOfferPriceDTO
instance ToJSON OfferPriceDTO where
  toJSON = genericToJSON optionsOfferPriceDTO

optionsOfferPriceDTO :: Options
optionsOfferPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerPriceDTOOfferId", "offerId")
      , ("offerPriceDTOPrice", "price")
      ]


-- | Список цен на товары.
data OfferPriceListResponseDTO = OfferPriceListResponseDTO
  { offerPriceListResponseDTOOffers :: [OfferPriceResponseDTO] -- ^ Страница списка.
  , offerPriceListResponseDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , offerPriceListResponseDTOTotal :: Maybe Int -- ^ Количество всех цен магазина, измененных через API.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferPriceListResponseDTO where
  parseJSON = genericParseJSON optionsOfferPriceListResponseDTO
instance ToJSON OfferPriceListResponseDTO where
  toJSON = genericToJSON optionsOfferPriceListResponseDTO

optionsOfferPriceListResponseDTO :: Options
optionsOfferPriceListResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerPriceListResponseDTOOffers", "offers")
      , ("offerPriceListResponseDTOPaging", "paging")
      , ("offerPriceListResponseDTOTotal", "total")
      ]


-- | Информация об установленной цене на товар.
data OfferPriceResponseDTO = OfferPriceResponseDTO
  { offerPriceResponseDTOId :: Maybe Text -- ^ Идентификатор предложения из прайс-листа.
  , offerPriceResponseDTOPrice :: Maybe PriceDTO -- ^ 
  , offerPriceResponseDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , offerPriceResponseDTOUpdatedAt :: Maybe UTCTime -- ^ Дата и время последнего обновления цены на товар.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferPriceResponseDTO where
  parseJSON = genericParseJSON optionsOfferPriceResponseDTO
instance ToJSON OfferPriceResponseDTO where
  toJSON = genericToJSON optionsOfferPriceResponseDTO

optionsOfferPriceResponseDTO :: Options
optionsOfferPriceResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerPriceResponseDTOId", "id")
      , ("offerPriceResponseDTOPrice", "price")
      , ("offerPriceResponseDTOMarketSku", "marketSku")
      , ("offerPriceResponseDTOUpdatedAt", "updatedAt")
      ]


-- | Причины, по которым товар не прошел модерацию.
data OfferProcessingNoteDTO = OfferProcessingNoteDTO
  { offerProcessingNoteDTOType :: Maybe OfferProcessingNoteType -- ^ 
  , offerProcessingNoteDTOPayload :: Maybe Text -- ^ Дополнительная информация о причине отклонения товара. 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferProcessingNoteDTO where
  parseJSON = genericParseJSON optionsOfferProcessingNoteDTO
instance ToJSON OfferProcessingNoteDTO where
  toJSON = genericToJSON optionsOfferProcessingNoteDTO

optionsOfferProcessingNoteDTO :: Options
optionsOfferProcessingNoteDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerProcessingNoteDTOType", "type")
      , ("offerProcessingNoteDTOPayload", "payload")
      ]


-- | Тип причины, по которой товар не прошел модерацию:  * &#x60;ASSORTMENT&#x60; — товар производится в разных вариантах. Каждый из них нужно описать как отдельный товар (входной параметр &#x60;offer-mapping-entry&#x60; запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или строка в каталоге, если вы загружаете товары через кабинет продавца на Маркете). * &#x60;CANCELLED&#x60; — товар отозван с модерации по вашей инициативе. * &#x60;CONFLICTING_INFORMATION&#x60; _(ранее ошибочно &#x60;CONFLICTING&#x60;)_ — вы предоставили противоречивую информацию о товаре. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;DEPARTMENT_FROZEN&#x60; — правила размещения товаров в данной категории перерабатываются, поэтому товар пока не может пройти модерацию. * &#x60;INCORRECT_INFORMATION&#x60; — информация о товаре, которую вы предоставили, противоречит описанию от производителя. Параметры, которые нужно исправить, указаны в параметре &#x60;payload&#x60;. * &#x60;LEGAL_CONFLICT&#x60; — товар не прошел модерацию по юридическим причинам. Например, он официально не продается в России или у вас нет разрешения на его продажу. * &#x60;NEED_CLASSIFICATION_INFORMATION&#x60; — информации о товаре, которую вы предоставили, не хватает, чтобы отнести его к категории. Проверьте, что правильно указали название, категорию, производителя и страны производства товара, а также URL изображений или страниц с описанием, по которым можно идентифицировать товар. * &#x60;NEED_INFORMATION&#x60; — товар раньше не продавался в России и пока не размещается на Маркете. Для него можно создать карточку. Подробнее см. в разделе [Работа с карточкой товара](https://yandex.ru/support/marketplace/assortment/content/index.html) Справки Маркета для продавцов. * &#x60;NEED_PICTURES&#x60; — для идентификации товара нужны его изображения. Отправьте URL изображений товара в запросе [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md) или загрузите обновленный каталог через кабинет продавца на Маркете. * &#x60;NEED_VENDOR&#x60; — неверно указан производитель товара. * &#x60;NO_CATEGORY&#x60;, &#x60;NO_KNOWLEDGE&#x60; — товары из указанной категории пока не размещаются на Маркете. Если категория появится, товар будет снова отправлен на модерацию. * &#x60;NO_PARAMETERS_IN_SHOP_TITLE&#x60; — товар производится в разных вариантах, и из указанного названия непонятно, о каком идет речь. Параметры, которые нужно добавить в название товара, указаны в параметре &#x60;payload&#x60;. * &#x60;NO_SIZE_MEASURE&#x60; — для этого товара нужна размерная сетка. Отправьте ее в службу поддержки или вашему менеджеру. Требования к размерной сетке указаны в параметре &#x60;payload&#x60;. * &#x60;UNKNOWN&#x60; — товар не прошел модерацию по другой причине. Обратитесь в службу поддержки или к вашему менеджеру. 
data OfferProcessingNoteType = OfferProcessingNoteType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferProcessingNoteType where
  parseJSON = genericParseJSON optionsOfferProcessingNoteType
instance ToJSON OfferProcessingNoteType where
  toJSON = genericToJSON optionsOfferProcessingNoteType

optionsOfferProcessingNoteType :: Options
optionsOfferProcessingNoteType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о статусе публикации товара на Маркете.
data OfferProcessingStateDTO = OfferProcessingStateDTO
  { offerProcessingStateDTOStatus :: Maybe OfferProcessingStatusType -- ^ 
  , offerProcessingStateDTONotes :: Maybe [OfferProcessingNoteDTO] -- ^ Причины, по которым товар не прошел модерацию.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferProcessingStateDTO where
  parseJSON = genericParseJSON optionsOfferProcessingStateDTO
instance ToJSON OfferProcessingStateDTO where
  toJSON = genericToJSON optionsOfferProcessingStateDTO

optionsOfferProcessingStateDTO :: Options
optionsOfferProcessingStateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerProcessingStateDTOStatus", "status")
      , ("offerProcessingStateDTONotes", "notes")
      ]


-- | Статус публикации товара:  * &#x60;READY&#x60; — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * &#x60;IN_WORK&#x60; — товар проходит модерацию. Это занимает несколько дней. * &#x60;NEED_CONTENT&#x60; — для товара без SKU на Маркете &#x60;marketSku&#x60; нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * &#x60;NEED_INFO&#x60; — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре &#x60;notes&#x60;. * &#x60;REJECTED&#x60; — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * &#x60;SUSPENDED&#x60; — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
data OfferProcessingStatusType = OfferProcessingStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferProcessingStatusType where
  parseJSON = genericParseJSON optionsOfferProcessingStatusType
instance ToJSON OfferProcessingStatusType where
  toJSON = genericToJSON optionsOfferProcessingStatusType

optionsOfferProcessingStatusType :: Options
optionsOfferProcessingStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о состоянии цен и рекомендации. 
data OfferRecommendationDTO = OfferRecommendationDTO
  { offerRecommendationDTOOffer :: Maybe OfferForRecommendationDTO -- ^ 
  , offerRecommendationDTORecommendation :: Maybe OfferRecommendationInfoDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferRecommendationDTO where
  parseJSON = genericParseJSON optionsOfferRecommendationDTO
instance ToJSON OfferRecommendationDTO where
  toJSON = genericToJSON optionsOfferRecommendationDTO

optionsOfferRecommendationDTO :: Options
optionsOfferRecommendationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerRecommendationDTOOffer", "offer")
      , ("offerRecommendationDTORecommendation", "recommendation")
      ]


-- | Рекомендации, касающиеся цены на товар.
data OfferRecommendationInfoDTO = OfferRecommendationInfoDTO
  { offerRecommendationInfoDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , offerRecommendationInfoDTORecommendedCofinancePrice :: Maybe BasePriceDTO -- ^ 
  , offerRecommendationInfoDTOCompetitivenessThresholds :: Maybe PriceCompetitivenessThresholdsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferRecommendationInfoDTO where
  parseJSON = genericParseJSON optionsOfferRecommendationInfoDTO
instance ToJSON OfferRecommendationInfoDTO where
  toJSON = genericToJSON optionsOfferRecommendationInfoDTO

optionsOfferRecommendationInfoDTO :: Options
optionsOfferRecommendationInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerRecommendationInfoDTOOfferId", "offerId")
      , ("offerRecommendationInfoDTORecommendedCofinancePrice", "recommendedCofinancePrice")
      , ("offerRecommendationInfoDTOCompetitivenessThresholds", "competitivenessThresholds")
      ]


-- | Список товаров с рекомендациями.
data OfferRecommendationsResultDTO = OfferRecommendationsResultDTO
  { offerRecommendationsResultDTOPaging :: Maybe ScrollingPagerDTO -- ^ 
  , offerRecommendationsResultDTOOfferRecommendations :: [OfferRecommendationDTO] -- ^ Страница списка товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON OfferRecommendationsResultDTO where
  parseJSON = genericParseJSON optionsOfferRecommendationsResultDTO
instance ToJSON OfferRecommendationsResultDTO where
  toJSON = genericToJSON optionsOfferRecommendationsResultDTO

optionsOfferRecommendationsResultDTO :: Options
optionsOfferRecommendationsResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerRecommendationsResultDTOPaging", "paging")
      , ("offerRecommendationsResultDTOOfferRecommendations", "offerRecommendations")
      ]


-- | Информация о том, по каким моделям можно продавать товар, а по каким нельзя.
data OfferSellingProgramDTO = OfferSellingProgramDTO
  { offerSellingProgramDTOSellingProgram :: SellingProgramType -- ^ 
  , offerSellingProgramDTOStatus :: OfferSellingProgramStatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferSellingProgramDTO where
  parseJSON = genericParseJSON optionsOfferSellingProgramDTO
instance ToJSON OfferSellingProgramDTO where
  toJSON = genericToJSON optionsOfferSellingProgramDTO

optionsOfferSellingProgramDTO :: Options
optionsOfferSellingProgramDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerSellingProgramDTOSellingProgram", "sellingProgram")
      , ("offerSellingProgramDTOStatus", "status")
      ]


-- | Информация о доступности или недоступности.  * &#x60;FINE&#x60; — доступно. * &#x60;REJECT&#x60; — недоступно. 
data OfferSellingProgramStatusType = OfferSellingProgramStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferSellingProgramStatusType where
  parseJSON = genericParseJSON optionsOfferSellingProgramStatusType
instance ToJSON OfferSellingProgramStatusType where
  toJSON = genericToJSON optionsOfferSellingProgramStatusType

optionsOfferSellingProgramStatusType :: Options
optionsOfferSellingProgramStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
data OfferType = OfferType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferType where
  parseJSON = genericParseJSON optionsOfferType
instance ToJSON OfferType where
  toJSON = genericToJSON optionsOfferType

optionsOfferType :: Options
optionsOfferType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 
data OfferWeightDimensionsDTO = OfferWeightDimensionsDTO
  { offerWeightDimensionsDTOLength :: Double -- ^ Длина упаковки в см. 
  , offerWeightDimensionsDTOWidth :: Double -- ^ Ширина упаковки в см. 
  , offerWeightDimensionsDTOHeight :: Double -- ^ Высота упаковки в см. 
  , offerWeightDimensionsDTOWeight :: Double -- ^ Вес товара в кг с учетом упаковки (брутто). 
  } deriving (Show, Eq, Generic)

instance FromJSON OfferWeightDimensionsDTO where
  parseJSON = genericParseJSON optionsOfferWeightDimensionsDTO
instance ToJSON OfferWeightDimensionsDTO where
  toJSON = genericToJSON optionsOfferWeightDimensionsDTO

optionsOfferWeightDimensionsDTO :: Options
optionsOfferWeightDimensionsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offerWeightDimensionsDTOLength", "length")
      , ("offerWeightDimensionsDTOWidth", "width")
      , ("offerWeightDimensionsDTOHeight", "height")
      , ("offerWeightDimensionsDTOWeight", "weight")
      ]


-- | Найденные предложения магазина.
data OffersDTO = OffersDTO
  { offersDTOOffers :: [OfferDTO] -- ^ Список предложений магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON OffersDTO where
  parseJSON = genericParseJSON optionsOffersDTO
instance ToJSON OffersDTO where
  toJSON = genericToJSON optionsOffersDTO

optionsOffersDTO :: Options
optionsOffersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("offersDTOOffers", "offers")
      ]


-- | Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.
data OptionValuesLimitedDTO = OptionValuesLimitedDTO
  { optionValuesLimitedDTOLimitingOptionValueId :: Int64 -- ^ Идентификатор значения ограничивающей характеристики.
  , optionValuesLimitedDTOOptionValueIds :: [Int64] -- ^ Идентификаторы допустимых значений ограничиваемой характеристики. 
  } deriving (Show, Eq, Generic)

instance FromJSON OptionValuesLimitedDTO where
  parseJSON = genericParseJSON optionsOptionValuesLimitedDTO
instance ToJSON OptionValuesLimitedDTO where
  toJSON = genericToJSON optionsOptionValuesLimitedDTO

optionsOptionValuesLimitedDTO :: Options
optionsOptionValuesLimitedDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("optionValuesLimitedDTOLimitingOptionValueId", "limitingOptionValueId")
      , ("optionValuesLimitedDTOOptionValueIds", "optionValueIds")
      ]


-- | Информация о коробке.
data OrderBoxLayoutDTO = OrderBoxLayoutDTO
  { orderBoxLayoutDTOItems :: [OrderBoxLayoutItemDTO] -- ^ Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBoxLayoutDTO where
  parseJSON = genericParseJSON optionsOrderBoxLayoutDTO
instance ToJSON OrderBoxLayoutDTO where
  toJSON = genericToJSON optionsOrderBoxLayoutDTO

optionsOrderBoxLayoutDTO :: Options
optionsOrderBoxLayoutDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBoxLayoutDTOItems", "items")
      ]


-- | Информация о товаре в коробке.
data OrderBoxLayoutItemDTO = OrderBoxLayoutItemDTO
  { orderBoxLayoutItemDTOId :: Int64 -- ^ Идентификатор товара в заказе.  {% cut \"Где его взять\" %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`.  {% endcut %}   
  , orderBoxLayoutItemDTOFullCount :: Maybe Int -- ^ Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с `partialCount`. 
  , orderBoxLayoutItemDTOPartialCount :: Maybe OrderBoxLayoutPartialCountDTO -- ^ 
  , orderBoxLayoutItemDTOInstances :: Maybe [BriefOrderItemInstanceDTO] -- ^ Переданные вами коды маркировки.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBoxLayoutItemDTO where
  parseJSON = genericParseJSON optionsOrderBoxLayoutItemDTO
instance ToJSON OrderBoxLayoutItemDTO where
  toJSON = genericToJSON optionsOrderBoxLayoutItemDTO

optionsOrderBoxLayoutItemDTO :: Options
optionsOrderBoxLayoutItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBoxLayoutItemDTOId", "id")
      , ("orderBoxLayoutItemDTOFullCount", "fullCount")
      , ("orderBoxLayoutItemDTOPartialCount", "partialCount")
      , ("orderBoxLayoutItemDTOInstances", "instances")
      ]


-- | Информация о части товара в коробке.
data OrderBoxLayoutPartialCountDTO = OrderBoxLayoutPartialCountDTO
  { orderBoxLayoutPartialCountDTOCurrent :: Int -- ^ Номер части, начиная с 1.
  , orderBoxLayoutPartialCountDTOTotal :: Int -- ^ На сколько всего частей разделен товар.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBoxLayoutPartialCountDTO where
  parseJSON = genericParseJSON optionsOrderBoxLayoutPartialCountDTO
instance ToJSON OrderBoxLayoutPartialCountDTO where
  toJSON = genericToJSON optionsOrderBoxLayoutPartialCountDTO

optionsOrderBoxLayoutPartialCountDTO :: Options
optionsOrderBoxLayoutPartialCountDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBoxLayoutPartialCountDTOCurrent", "current")
      , ("orderBoxLayoutPartialCountDTOTotal", "total")
      ]


-- | Распределение товаров по коробкам.
data OrderBoxesLayoutDTO = OrderBoxesLayoutDTO
  { orderBoxesLayoutDTOBoxes :: [EnrichedOrderBoxLayoutDTO] -- ^ Список коробок.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBoxesLayoutDTO where
  parseJSON = genericParseJSON optionsOrderBoxesLayoutDTO
instance ToJSON OrderBoxesLayoutDTO where
  toJSON = genericToJSON optionsOrderBoxesLayoutDTO

optionsOrderBoxesLayoutDTO :: Options
optionsOrderBoxesLayoutDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBoxesLayoutDTOBoxes", "boxes")
      ]


-- | Информация о покупателе. 
data OrderBusinessBuyerDTO = OrderBusinessBuyerDTO
  { orderBusinessBuyerDTOInn :: Maybe Text -- ^ ИНН.
  , orderBusinessBuyerDTOKpp :: Maybe Text -- ^ КПП.
  , orderBusinessBuyerDTOOrganizationName :: Maybe Text -- ^ Наименование юридического лица.
  , orderBusinessBuyerDTOOrganizationJurAddress :: Maybe Text -- ^ Юридический адрес.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBusinessBuyerDTO where
  parseJSON = genericParseJSON optionsOrderBusinessBuyerDTO
instance ToJSON OrderBusinessBuyerDTO where
  toJSON = genericToJSON optionsOrderBusinessBuyerDTO

optionsOrderBusinessBuyerDTO :: Options
optionsOrderBusinessBuyerDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBusinessBuyerDTOInn", "inn")
      , ("orderBusinessBuyerDTOKpp", "kpp")
      , ("orderBusinessBuyerDTOOrganizationName", "organizationName")
      , ("orderBusinessBuyerDTOOrganizationJurAddress", "organizationJurAddress")
      ]


-- | Информация о документах. 
data OrderBusinessDocumentsDTO = OrderBusinessDocumentsDTO
  { orderBusinessDocumentsDTOUpd :: Maybe DocumentDTO -- ^ 
  , orderBusinessDocumentsDTOUkd :: Maybe DocumentDTO -- ^ 
  , orderBusinessDocumentsDTOTorgTwelve :: Maybe DocumentDTO -- ^ 
  , orderBusinessDocumentsDTOSf :: Maybe DocumentDTO -- ^ 
  , orderBusinessDocumentsDTOKsf :: Maybe DocumentDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBusinessDocumentsDTO where
  parseJSON = genericParseJSON optionsOrderBusinessDocumentsDTO
instance ToJSON OrderBusinessDocumentsDTO where
  toJSON = genericToJSON optionsOrderBusinessDocumentsDTO

optionsOrderBusinessDocumentsDTO :: Options
optionsOrderBusinessDocumentsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBusinessDocumentsDTOUpd", "upd")
      , ("orderBusinessDocumentsDTOUkd", "ukd")
      , ("orderBusinessDocumentsDTOTorgTwelve", "torgTwelve")
      , ("orderBusinessDocumentsDTOSf", "sf")
      , ("orderBusinessDocumentsDTOKsf", "ksf")
      ]


-- | Информация о покупателе с базовыми полями.
data OrderBuyerBasicInfoDTO = OrderBuyerBasicInfoDTO
  { orderBuyerBasicInfoDTOId :: Maybe Text -- ^ Идентификатор покупателя.
  , orderBuyerBasicInfoDTOLastName :: Maybe Text -- ^ Фамилия покупателя.
  , orderBuyerBasicInfoDTOFirstName :: Maybe Text -- ^ Имя покупателя.
  , orderBuyerBasicInfoDTOMiddleName :: Maybe Text -- ^ Отчество покупателя.
  , orderBuyerBasicInfoDTOType :: Maybe OrderBuyerType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBuyerBasicInfoDTO where
  parseJSON = genericParseJSON optionsOrderBuyerBasicInfoDTO
instance ToJSON OrderBuyerBasicInfoDTO where
  toJSON = genericToJSON optionsOrderBuyerBasicInfoDTO

optionsOrderBuyerBasicInfoDTO :: Options
optionsOrderBuyerBasicInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBuyerBasicInfoDTOId", "id")
      , ("orderBuyerBasicInfoDTOLastName", "lastName")
      , ("orderBuyerBasicInfoDTOFirstName", "firstName")
      , ("orderBuyerBasicInfoDTOMiddleName", "middleName")
      , ("orderBuyerBasicInfoDTOType", "type")
      ]


-- | Информация о покупателе.  Параметры &#x60;id&#x60;, &#x60;lastName&#x60;, &#x60;firstName&#x60; и &#x60;middleName&#x60; возвращаются, только если вы работаете по модели DBS. 
data OrderBuyerDTO = OrderBuyerDTO
  { orderBuyerDTOId :: Maybe Text -- ^ Идентификатор покупателя.
  , orderBuyerDTOLastName :: Maybe Text -- ^ Фамилия покупателя.
  , orderBuyerDTOFirstName :: Maybe Text -- ^ Имя покупателя.
  , orderBuyerDTOMiddleName :: Maybe Text -- ^ Отчество покупателя.
  , orderBuyerDTOType :: Maybe OrderBuyerType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBuyerDTO where
  parseJSON = genericParseJSON optionsOrderBuyerDTO
instance ToJSON OrderBuyerDTO where
  toJSON = genericToJSON optionsOrderBuyerDTO

optionsOrderBuyerDTO :: Options
optionsOrderBuyerDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBuyerDTOId", "id")
      , ("orderBuyerDTOLastName", "lastName")
      , ("orderBuyerDTOFirstName", "firstName")
      , ("orderBuyerDTOMiddleName", "middleName")
      , ("orderBuyerDTOType", "type")
      ]


-- | Информация о покупателе и его номере телефона.
data OrderBuyerInfoDTO = OrderBuyerInfoDTO
  { orderBuyerInfoDTOId :: Maybe Text -- ^ Идентификатор покупателя.
  , orderBuyerInfoDTOLastName :: Maybe Text -- ^ Фамилия покупателя.
  , orderBuyerInfoDTOFirstName :: Maybe Text -- ^ Имя покупателя.
  , orderBuyerInfoDTOMiddleName :: Maybe Text -- ^ Отчество покупателя.
  , orderBuyerInfoDTOType :: Maybe OrderBuyerType -- ^ 
  , orderBuyerInfoDTOPhone :: Maybe Text -- ^ Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBuyerInfoDTO where
  parseJSON = genericParseJSON optionsOrderBuyerInfoDTO
instance ToJSON OrderBuyerInfoDTO where
  toJSON = genericToJSON optionsOrderBuyerInfoDTO

optionsOrderBuyerInfoDTO :: Options
optionsOrderBuyerInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderBuyerInfoDTOId", "id")
      , ("orderBuyerInfoDTOLastName", "lastName")
      , ("orderBuyerInfoDTOFirstName", "firstName")
      , ("orderBuyerInfoDTOMiddleName", "middleName")
      , ("orderBuyerInfoDTOType", "type")
      , ("orderBuyerInfoDTOPhone", "phone")
      ]


-- | Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
data OrderBuyerType = OrderBuyerType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderBuyerType where
  parseJSON = genericParseJSON optionsOrderBuyerType
instance ToJSON OrderBuyerType where
  toJSON = genericToJSON optionsOrderBuyerType

optionsOrderBuyerType :: Options
optionsOrderBuyerType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Варианты причин, по которым заказ не может быть отменен.  * &#x60;ORDER_DELIVERED&#x60; — заказ уже доставлен. * &#x60;ORDER_IN_DELIVERY&#x60; — заказ уже у курьера. 
data OrderCancellationReasonType = OrderCancellationReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderCancellationReasonType where
  parseJSON = genericParseJSON optionsOrderCancellationReasonType
instance ToJSON OrderCancellationReasonType where
  toJSON = genericToJSON optionsOrderCancellationReasonType

optionsOrderCancellationReasonType :: Options
optionsOrderCancellationReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о курьере.
data OrderCourierDTO = OrderCourierDTO
  { orderCourierDTOFullName :: Maybe Text -- ^ Полное имя курьера.
  , orderCourierDTOPhone :: Maybe Text -- ^ Номер телефона курьера.
  , orderCourierDTOPhoneExtension :: Maybe Text -- ^ Добавочный номер телефона.
  , orderCourierDTOVehicleNumber :: Maybe Text -- ^ Номер транспортного средства.
  , orderCourierDTOVehicleDescription :: Maybe Text -- ^ Описание машины. Например, модель и цвет.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderCourierDTO where
  parseJSON = genericParseJSON optionsOrderCourierDTO
instance ToJSON OrderCourierDTO where
  toJSON = genericToJSON optionsOrderCourierDTO

optionsOrderCourierDTO :: Options
optionsOrderCourierDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderCourierDTOFullName", "fullName")
      , ("orderCourierDTOPhone", "phone")
      , ("orderCourierDTOPhoneExtension", "phoneExtension")
      , ("orderCourierDTOVehicleNumber", "vehicleNumber")
      , ("orderCourierDTOVehicleDescription", "vehicleDescription")
      ]


-- | Заказ.
data OrderDTO = OrderDTO
  { orderDTOId :: Maybe Int64 -- ^ Идентификатор заказа.
  , orderDTOStatus :: Maybe OrderStatusType -- ^ 
  , orderDTOSubstatus :: Maybe OrderSubstatusType -- ^ 
  , orderDTOCreationDate :: Maybe Text -- ^ 
  , orderDTOUpdatedAt :: Maybe Text -- ^ 
  , orderDTOCurrency :: Maybe CurrencyType -- ^ 
  , orderDTOItemsTotal :: Maybe Double -- ^ Платеж покупателя. 
  , orderDTODeliveryTotal :: Maybe Double -- ^ Стоимость доставки. 
  , orderDTOBuyerItemsTotal :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
  , orderDTOBuyerTotal :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
  , orderDTOBuyerItemsTotalBeforeDiscount :: Maybe Double -- ^ Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
  , orderDTOBuyerTotalBeforeDiscount :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки). 
  , orderDTOPaymentType :: Maybe OrderPaymentType -- ^ 
  , orderDTOPaymentMethod :: Maybe OrderPaymentMethodType -- ^ 
  , orderDTOFake :: Maybe Bool -- ^ Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  , orderDTOItems :: [OrderItemDTO] -- ^ Список товаров в заказе.
  , orderDTOSubsidies :: Maybe [OrderSubsidyDTO] -- ^ Список субсидий по типам.
  , orderDTODelivery :: Maybe OrderDeliveryDTO -- ^ 
  , orderDTOBuyer :: Maybe OrderBuyerDTO -- ^ 
  , orderDTONotes :: Maybe Text -- ^ Комментарий к заказу.
  , orderDTOTaxSystem :: Maybe OrderTaxSystemType -- ^ 
  , orderDTOCancelRequested :: Maybe Bool -- ^ **Только для модели DBS**  Запрошена ли отмена. 
  , orderDTOExpiryDate :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDTO where
  parseJSON = genericParseJSON optionsOrderDTO
instance ToJSON OrderDTO where
  toJSON = genericToJSON optionsOrderDTO

optionsOrderDTO :: Options
optionsOrderDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDTOId", "id")
      , ("orderDTOStatus", "status")
      , ("orderDTOSubstatus", "substatus")
      , ("orderDTOCreationDate", "creationDate")
      , ("orderDTOUpdatedAt", "updatedAt")
      , ("orderDTOCurrency", "currency")
      , ("orderDTOItemsTotal", "itemsTotal")
      , ("orderDTODeliveryTotal", "deliveryTotal")
      , ("orderDTOBuyerItemsTotal", "buyerItemsTotal")
      , ("orderDTOBuyerTotal", "buyerTotal")
      , ("orderDTOBuyerItemsTotalBeforeDiscount", "buyerItemsTotalBeforeDiscount")
      , ("orderDTOBuyerTotalBeforeDiscount", "buyerTotalBeforeDiscount")
      , ("orderDTOPaymentType", "paymentType")
      , ("orderDTOPaymentMethod", "paymentMethod")
      , ("orderDTOFake", "fake")
      , ("orderDTOItems", "items")
      , ("orderDTOSubsidies", "subsidies")
      , ("orderDTODelivery", "delivery")
      , ("orderDTOBuyer", "buyer")
      , ("orderDTONotes", "notes")
      , ("orderDTOTaxSystem", "taxSystem")
      , ("orderDTOCancelRequested", "cancelRequested")
      , ("orderDTOExpiryDate", "expiryDate")
      ]


-- | Адрес доставки.  Указывается, если &#x60;type&#x3D;DELIVERY&#x60;, &#x60;type&#x3D;POST&#x60; или &#x60;type&#x3D;PICKUP&#x60; (адрес пункта выдачи). 
data OrderDeliveryAddressDTO = OrderDeliveryAddressDTO
  { orderDeliveryAddressDTOCountry :: Maybe Text -- ^ Страна.  Обязательный параметр. 
  , orderDeliveryAddressDTOPostcode :: Maybe Text -- ^ Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
  , orderDeliveryAddressDTOCity :: Maybe Text -- ^ Город или населенный пункт.  Обязательный параметр. 
  , orderDeliveryAddressDTODistrict :: Maybe Text -- ^ Район.
  , orderDeliveryAddressDTOSubway :: Maybe Text -- ^ Станция метро.
  , orderDeliveryAddressDTOStreet :: Maybe Text -- ^ Улица.  Обязательный параметр. 
  , orderDeliveryAddressDTOHouse :: Maybe Text -- ^ Дом или владение.  Обязательный параметр. 
  , orderDeliveryAddressDTOBlock :: Maybe Text -- ^ Корпус или строение.
  , orderDeliveryAddressDTOEntrance :: Maybe Text -- ^ Подъезд.
  , orderDeliveryAddressDTOEntryphone :: Maybe Text -- ^ Код домофона.
  , orderDeliveryAddressDTOFloor :: Maybe Text -- ^ Этаж.
  , orderDeliveryAddressDTOApartment :: Maybe Text -- ^ Квартира или офис.
  , orderDeliveryAddressDTOPhone :: Maybe Text -- ^ Телефон получателя заказа.  Обязательный параметр. 
  , orderDeliveryAddressDTORecipient :: Maybe Text -- ^ Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
  , orderDeliveryAddressDTOGps :: Maybe GpsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryAddressDTO where
  parseJSON = genericParseJSON optionsOrderDeliveryAddressDTO
instance ToJSON OrderDeliveryAddressDTO where
  toJSON = genericToJSON optionsOrderDeliveryAddressDTO

optionsOrderDeliveryAddressDTO :: Options
optionsOrderDeliveryAddressDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDeliveryAddressDTOCountry", "country")
      , ("orderDeliveryAddressDTOPostcode", "postcode")
      , ("orderDeliveryAddressDTOCity", "city")
      , ("orderDeliveryAddressDTODistrict", "district")
      , ("orderDeliveryAddressDTOSubway", "subway")
      , ("orderDeliveryAddressDTOStreet", "street")
      , ("orderDeliveryAddressDTOHouse", "house")
      , ("orderDeliveryAddressDTOBlock", "block")
      , ("orderDeliveryAddressDTOEntrance", "entrance")
      , ("orderDeliveryAddressDTOEntryphone", "entryphone")
      , ("orderDeliveryAddressDTOFloor", "floor")
      , ("orderDeliveryAddressDTOApartment", "apartment")
      , ("orderDeliveryAddressDTOPhone", "phone")
      , ("orderDeliveryAddressDTORecipient", "recipient")
      , ("orderDeliveryAddressDTOGps", "gps")
      ]


-- | Информация о доставке.
data OrderDeliveryDTO = OrderDeliveryDTO
  { orderDeliveryDTOId :: Maybe Text -- ^ Идентификатор доставки, присвоенный магазином.  Указывается, только если магазин передал данный идентификатор в ответе на запрос методом [POST cart](../../pushapi/reference/cart.md). 
  , orderDeliveryDTOType :: Maybe OrderDeliveryType -- ^ 
  , orderDeliveryDTOServiceName :: Maybe Text -- ^ Наименование службы доставки.
  , orderDeliveryDTOPrice :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Стоимость доставки смотрите в параметре `deliveryTotal`.  {% endnote %}  Стоимость доставки в валюте заказа. 
  , orderDeliveryDTODeliveryPartnerType :: Maybe OrderDeliveryPartnerType -- ^ 
  , orderDeliveryDTOCourier :: Maybe OrderCourierDTO -- ^ 
  , orderDeliveryDTODates :: Maybe OrderDeliveryDatesDTO -- ^ 
  , orderDeliveryDTORegion :: Maybe RegionDTO -- ^ 
  , orderDeliveryDTOAddress :: Maybe OrderDeliveryAddressDTO -- ^ 
  , orderDeliveryDTOVat :: Maybe OrderVatType -- ^ 
  , orderDeliveryDTODeliveryServiceId :: Maybe Int64 -- ^ Идентификатор службы доставки.
  , orderDeliveryDTOLiftType :: Maybe OrderLiftType -- ^ 
  , orderDeliveryDTOLiftPrice :: Maybe Double -- ^ Стоимость подъема на этаж.
  , orderDeliveryDTOOutletCode :: Maybe Text -- ^ Идентификатор пункта самовывоза, присвоенный магазином.
  , orderDeliveryDTOOutletStorageLimitDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  , orderDeliveryDTODispatchType :: Maybe OrderDeliveryDispatchType -- ^ 
  , orderDeliveryDTOTracks :: Maybe [OrderTrackDTO] -- ^ Информация для отслеживания перемещений посылки.
  , orderDeliveryDTOShipments :: Maybe [OrderShipmentDTO] -- ^ Информация о посылках.
  , orderDeliveryDTOEstimated :: Maybe Bool -- ^ Приблизительная ли дата доставки.
  , orderDeliveryDTOEacType :: Maybe OrderDeliveryEacType -- ^ 
  , orderDeliveryDTOEacCode :: Maybe Text -- ^ Код подтверждения ЭАПП (для типа `MERCHANT_TO_COURIER`). 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryDTO where
  parseJSON = genericParseJSON optionsOrderDeliveryDTO
instance ToJSON OrderDeliveryDTO where
  toJSON = genericToJSON optionsOrderDeliveryDTO

optionsOrderDeliveryDTO :: Options
optionsOrderDeliveryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDeliveryDTOId", "id")
      , ("orderDeliveryDTOType", "type")
      , ("orderDeliveryDTOServiceName", "serviceName")
      , ("orderDeliveryDTOPrice", "price")
      , ("orderDeliveryDTODeliveryPartnerType", "deliveryPartnerType")
      , ("orderDeliveryDTOCourier", "courier")
      , ("orderDeliveryDTODates", "dates")
      , ("orderDeliveryDTORegion", "region")
      , ("orderDeliveryDTOAddress", "address")
      , ("orderDeliveryDTOVat", "vat")
      , ("orderDeliveryDTODeliveryServiceId", "deliveryServiceId")
      , ("orderDeliveryDTOLiftType", "liftType")
      , ("orderDeliveryDTOLiftPrice", "liftPrice")
      , ("orderDeliveryDTOOutletCode", "outletCode")
      , ("orderDeliveryDTOOutletStorageLimitDate", "outletStorageLimitDate")
      , ("orderDeliveryDTODispatchType", "dispatchType")
      , ("orderDeliveryDTOTracks", "tracks")
      , ("orderDeliveryDTOShipments", "shipments")
      , ("orderDeliveryDTOEstimated", "estimated")
      , ("orderDeliveryDTOEacType", "eacType")
      , ("orderDeliveryDTOEacCode", "eacCode")
      ]


-- | Информация о новой дате доставки заказа.
data OrderDeliveryDateDTO = OrderDeliveryDateDTO
  { orderDeliveryDateDTOToDate :: Day -- ^ Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryDateDTO where
  parseJSON = genericParseJSON optionsOrderDeliveryDateDTO
instance ToJSON OrderDeliveryDateDTO where
  toJSON = genericToJSON optionsOrderDeliveryDateDTO

optionsOrderDeliveryDateDTO :: Options
optionsOrderDeliveryDateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDeliveryDateDTOToDate", "toDate")
      ]


-- | Причина переноса доставки заказа. Возможные причины изменения даты:   - &#x60;&#x60;&#x60;USER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — покупатель попросил изменить дату или вы договорились привезти ему заказ раньше изначальной даты. Кроме этого указывается для подтверждения даты доставки товаров на заказ с долгой (31-60 дней) доставкой.   - &#x60;&#x60;&#x60;PARTNER_MOVED_DELIVERY_DATES&#x60;&#x60;&#x60; — магазин не может доставить заказ в срок. 
data OrderDeliveryDateReasonType = OrderDeliveryDateReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryDateReasonType where
  parseJSON = genericParseJSON optionsOrderDeliveryDateReasonType
instance ToJSON OrderDeliveryDateReasonType where
  toJSON = genericToJSON optionsOrderDeliveryDateReasonType

optionsOrderDeliveryDateReasonType :: Options
optionsOrderDeliveryDateReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Диапазон дат доставки.
data OrderDeliveryDatesDTO = OrderDeliveryDatesDTO
  { orderDeliveryDatesDTOFromDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  , orderDeliveryDatesDTOToDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  , orderDeliveryDatesDTOFromTime :: Maybe Text -- ^ Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
  , orderDeliveryDatesDTOToTime :: Maybe Text -- ^ Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
  , orderDeliveryDatesDTORealDeliveryDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryDatesDTO where
  parseJSON = genericParseJSON optionsOrderDeliveryDatesDTO
instance ToJSON OrderDeliveryDatesDTO where
  toJSON = genericToJSON optionsOrderDeliveryDatesDTO

optionsOrderDeliveryDatesDTO :: Options
optionsOrderDeliveryDatesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDeliveryDatesDTOFromDate", "fromDate")
      , ("orderDeliveryDatesDTOToDate", "toDate")
      , ("orderDeliveryDatesDTOFromTime", "fromTime")
      , ("orderDeliveryDatesDTOToTime", "toTime")
      , ("orderDeliveryDatesDTORealDeliveryDate", "realDeliveryDate")
      ]


-- | Способ отгрузки:  * &#x60;BUYER&#x60; — доставка покупателю.  * &#x60;MARKET_PARTNER_OUTLET&#x60; — доставка в пункт выдачи партнера.  * &#x60;MARKET_BRANDED_OUTLET&#x60; — доставка в пункт выдачи заказов Маркета.  * &#x60;SHOP_OUTLET&#x60; — доставка в пункт выдачи заказов магазина.  * &#x60;DROPOFF&#x60; — доставка в пункт выдачи, который принимает заказы от продавцов и передает их курьерам.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
data OrderDeliveryDispatchType = OrderDeliveryDispatchType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryDispatchType where
  parseJSON = genericParseJSON optionsOrderDeliveryDispatchType
instance ToJSON OrderDeliveryDispatchType where
  toJSON = genericToJSON optionsOrderDeliveryDispatchType

optionsOrderDeliveryDispatchType :: Options
optionsOrderDeliveryDispatchType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
data OrderDeliveryEacType = OrderDeliveryEacType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryEacType where
  parseJSON = genericParseJSON optionsOrderDeliveryEacType
instance ToJSON OrderDeliveryEacType where
  toJSON = genericToJSON optionsOrderDeliveryEacType

optionsOrderDeliveryEacType :: Options
optionsOrderDeliveryEacType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип сотрудничества со службой доставки в рамках конкретного заказа:  * &#x60;SHOP&#x60; — магазин работает со службой доставки напрямую или доставляет заказы самостоятельно.  * &#x60;YANDEX_MARKET&#x60; — магазин работает со службой доставки через Маркет.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
data OrderDeliveryPartnerType = OrderDeliveryPartnerType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryPartnerType where
  parseJSON = genericParseJSON optionsOrderDeliveryPartnerType
instance ToJSON OrderDeliveryPartnerType where
  toJSON = genericToJSON optionsOrderDeliveryPartnerType

optionsOrderDeliveryPartnerType :: Options
optionsOrderDeliveryPartnerType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Способ доставки заказа:  * &#x60;DELIVERY&#x60; — курьерская доставка.  * &#x60;PICKUP&#x60; — самовывоз.  * &#x60;POST&#x60; — почта.  * &#x60;DIGITAL&#x60; — для цифровых товаров.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
data OrderDeliveryType = OrderDeliveryType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDeliveryType where
  parseJSON = genericParseJSON optionsOrderDeliveryType
instance ToJSON OrderDeliveryType where
  toJSON = genericToJSON optionsOrderDeliveryType

optionsOrderDeliveryType :: Options
optionsOrderDeliveryType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ключ цифрового товара.
data OrderDigitalItemDTO = OrderDigitalItemDTO
  { orderDigitalItemDTOId :: Int64 -- ^ Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  , orderDigitalItemDTOCode :: Text -- ^ Сам ключ.
  , orderDigitalItemDTOSlip :: Text -- ^ Инструкция по активации.
  , orderDigitalItemDTOActivateUnderscoretill :: Day -- ^ Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: `ГГГГ-ММ-ДД`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDigitalItemDTO where
  parseJSON = genericParseJSON optionsOrderDigitalItemDTO
instance ToJSON OrderDigitalItemDTO where
  toJSON = genericToJSON optionsOrderDigitalItemDTO

optionsOrderDigitalItemDTO :: Options
optionsOrderDigitalItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderDigitalItemDTOId", "id")
      , ("orderDigitalItemDTOCode", "code")
      , ("orderDigitalItemDTOSlip", "slip")
      , ("orderDigitalItemDTOActivateUnderscoretill", "activate_till")
      ]


-- | Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
data OrderDocumentStatusType = OrderDocumentStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderDocumentStatusType where
  parseJSON = genericParseJSON optionsOrderDocumentStatusType
instance ToJSON OrderDocumentStatusType where
  toJSON = genericToJSON optionsOrderDocumentStatusType

optionsOrderDocumentStatusType :: Options
optionsOrderDocumentStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список товаров в заказе.
data OrderItemDTO = OrderItemDTO
  { orderItemDTOId :: Maybe Int64 -- ^ Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
  , orderItemDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , orderItemDTOOfferName :: Maybe Text -- ^ Название товара.
  , orderItemDTOPrice :: Maybe Double -- ^ Цена на товар в валюте заказа без учета вознаграждения партнеру за скидки по промокодам, купонам и акциям (параметр `subsidies`). 
  , orderItemDTOBuyerPrice :: Maybe Double -- ^ Цена на товар в валюте покупателя. В цене уже учтены скидки по:  * акциям; * купонам; * промокодам. 
  , orderItemDTOBuyerPriceBeforeDiscount :: Maybe Double -- ^ Стоимость товара в валюте покупателя до применения скидок по:  * акциям; * купонам; * промокодам. 
  , orderItemDTOPriceBeforeDiscount :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость товара в валюте магазина до применения скидок. 
  , orderItemDTOCount :: Maybe Int -- ^ Количество единиц товара.
  , orderItemDTOVat :: Maybe OrderVatType -- ^ 
  , orderItemDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , orderItemDTOSubsidy :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `subsidies`.  {% endnote %}  Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам; * по купонам; * по баллам Плюса; * по акциям.  Передается в валюте заказа. 
  , orderItemDTOPartnerWarehouseId :: Maybe Text -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Идентификатор склада в системе партнера, на который сформирован заказ. 
  , orderItemDTOPromos :: Maybe [OrderItemPromoDTO] -- ^ Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
  , orderItemDTOInstances :: Maybe [OrderItemInstanceDTO] -- ^ Информация о маркировке единиц товара.  Возвращаются данные для маркировки, переданные в запросе [PUT campaigns/{campaignId}/orders/{orderId}/cis](../../reference/orders/provideOrderItemCis.md).  Если магазин еще не передавал коды для этого заказа, `instances` отсутствует. 
  , orderItemDTODetails :: Maybe [OrderItemDetailDTO] -- ^ Информация об удалении товара из заказа. 
  , orderItemDTOSubsidies :: Maybe [OrderItemSubsidyDTO] -- ^ Список субсидий по типам.
  , orderItemDTORequiredInstanceTypes :: Maybe [OrderItemInstanceType] -- ^ Список необходимых маркировок товара.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemDTO where
  parseJSON = genericParseJSON optionsOrderItemDTO
instance ToJSON OrderItemDTO where
  toJSON = genericToJSON optionsOrderItemDTO

optionsOrderItemDTO :: Options
optionsOrderItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemDTOId", "id")
      , ("orderItemDTOOfferId", "offerId")
      , ("orderItemDTOOfferName", "offerName")
      , ("orderItemDTOPrice", "price")
      , ("orderItemDTOBuyerPrice", "buyerPrice")
      , ("orderItemDTOBuyerPriceBeforeDiscount", "buyerPriceBeforeDiscount")
      , ("orderItemDTOPriceBeforeDiscount", "priceBeforeDiscount")
      , ("orderItemDTOCount", "count")
      , ("orderItemDTOVat", "vat")
      , ("orderItemDTOShopSku", "shopSku")
      , ("orderItemDTOSubsidy", "subsidy")
      , ("orderItemDTOPartnerWarehouseId", "partnerWarehouseId")
      , ("orderItemDTOPromos", "promos")
      , ("orderItemDTOInstances", "instances")
      , ("orderItemDTODetails", "details")
      , ("orderItemDTOSubsidies", "subsidies")
      , ("orderItemDTORequiredInstanceTypes", "requiredInstanceTypes")
      ]


-- | Детали по товару в заказе.
data OrderItemDetailDTO = OrderItemDetailDTO
  { orderItemDetailDTOItemCount :: Maybe Int64 -- ^ Количество единиц товара.
  , orderItemDetailDTOItemStatus :: Maybe OrderItemStatusType -- ^ 
  , orderItemDetailDTOUpdateDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemDetailDTO where
  parseJSON = genericParseJSON optionsOrderItemDetailDTO
instance ToJSON OrderItemDetailDTO where
  toJSON = genericToJSON optionsOrderItemDetailDTO

optionsOrderItemDetailDTO :: Options
optionsOrderItemDetailDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemDetailDTOItemCount", "itemCount")
      , ("orderItemDetailDTOItemStatus", "itemStatus")
      , ("orderItemDetailDTOUpdateDate", "updateDate")
      ]


-- | Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 
data OrderItemInstanceDTO = OrderItemInstanceDTO
  { orderItemInstanceDTOCis :: Maybe Text -- ^ Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста.
  , orderItemInstanceDTOCisFull :: Maybe Text -- ^ Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом.
  , orderItemInstanceDTOUin :: Maybe Text -- ^ УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК. 
  , orderItemInstanceDTORnpt :: Maybe Text -- ^ Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации. 
  , orderItemInstanceDTOGtd :: Maybe Text -- ^ Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemInstanceDTO where
  parseJSON = genericParseJSON optionsOrderItemInstanceDTO
instance ToJSON OrderItemInstanceDTO where
  toJSON = genericToJSON optionsOrderItemInstanceDTO

optionsOrderItemInstanceDTO :: Options
optionsOrderItemInstanceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemInstanceDTOCis", "cis")
      , ("orderItemInstanceDTOCisFull", "cisFull")
      , ("orderItemInstanceDTOUin", "uin")
      , ("orderItemInstanceDTORnpt", "rnpt")
      , ("orderItemInstanceDTOGtd", "gtd")
      ]


-- | Позиция в корзине, требующая маркировки.
data OrderItemInstanceModificationDTO = OrderItemInstanceModificationDTO
  { orderItemInstanceModificationDTOId :: Int64 -- ^ Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр `id` в `items`. 
  , orderItemInstanceModificationDTOInstances :: [BriefOrderItemInstanceDTO] -- ^ Список кодов маркировки единиц товара. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemInstanceModificationDTO where
  parseJSON = genericParseJSON optionsOrderItemInstanceModificationDTO
instance ToJSON OrderItemInstanceModificationDTO where
  toJSON = genericToJSON optionsOrderItemInstanceModificationDTO

optionsOrderItemInstanceModificationDTO :: Options
optionsOrderItemInstanceModificationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemInstanceModificationDTOId", "id")
      , ("orderItemInstanceModificationDTOInstances", "instances")
      ]


-- | Вид маркировки товара:  * &#x60;CIS&#x60; — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * &#x60;UIN&#x60; — УИН, уникальный идентификационный номер.  * &#x60;RNPT&#x60; — РНПТ, регистрационный номер партии товара.  * &#x60;GTD&#x60; — номер ГТД, грузовой таможенной декларации. 
data OrderItemInstanceType = OrderItemInstanceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemInstanceType where
  parseJSON = genericParseJSON optionsOrderItemInstanceType
instance ToJSON OrderItemInstanceType where
  toJSON = genericToJSON optionsOrderItemInstanceType

optionsOrderItemInstanceType :: Options
optionsOrderItemInstanceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
data OrderItemModificationDTO = OrderItemModificationDTO
  { orderItemModificationDTOId :: Int64 -- ^ Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр. 
  , orderItemModificationDTOCount :: Int -- ^ Новое количество товара.
  , orderItemModificationDTOInstances :: Maybe [BriefOrderItemInstanceDTO] -- ^ Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/). 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemModificationDTO where
  parseJSON = genericParseJSON optionsOrderItemModificationDTO
instance ToJSON OrderItemModificationDTO where
  toJSON = genericToJSON optionsOrderItemModificationDTO

optionsOrderItemModificationDTO :: Options
optionsOrderItemModificationDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemModificationDTOId", "id")
      , ("orderItemModificationDTOCount", "count")
      , ("orderItemModificationDTOInstances", "instances")
      ]


-- | Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
data OrderItemPromoDTO = OrderItemPromoDTO
  { orderItemPromoDTOType :: OrderPromoType -- ^ 
  , orderItemPromoDTODiscount :: Maybe Double -- ^ Размер пользовательской скидки в валюте покупателя. 
  , orderItemPromoDTOSubsidy :: Maybe Double -- ^ Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
  , orderItemPromoDTOShopPromoId :: Maybe Text -- ^ Идентификатор акции поставщика. 
  , orderItemPromoDTOMarketPromoId :: Maybe Text -- ^ Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemPromoDTO where
  parseJSON = genericParseJSON optionsOrderItemPromoDTO
instance ToJSON OrderItemPromoDTO where
  toJSON = genericToJSON optionsOrderItemPromoDTO

optionsOrderItemPromoDTO :: Options
optionsOrderItemPromoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemPromoDTOType", "type")
      , ("orderItemPromoDTODiscount", "discount")
      , ("orderItemPromoDTOSubsidy", "subsidy")
      , ("orderItemPromoDTOShopPromoId", "shopPromoId")
      , ("orderItemPromoDTOMarketPromoId", "marketPromoId")
      ]


-- | Возвращенный или невыкупленный товар:  * &#x60;REJECTED&#x60; — невыкупленный.  * &#x60;RETURNED&#x60; — возвращенный. 
data OrderItemStatusType = OrderItemStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemStatusType where
  parseJSON = genericParseJSON optionsOrderItemStatusType
instance ToJSON OrderItemStatusType where
  toJSON = genericToJSON optionsOrderItemStatusType

optionsOrderItemStatusType :: Options
optionsOrderItemStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
data OrderItemSubsidyDTO = OrderItemSubsidyDTO
  { orderItemSubsidyDTOType :: Maybe OrderItemSubsidyType -- ^ 
  , orderItemSubsidyDTOAmount :: Maybe Double -- ^ Сумма субсидии.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemSubsidyDTO where
  parseJSON = genericParseJSON optionsOrderItemSubsidyDTO
instance ToJSON OrderItemSubsidyDTO where
  toJSON = genericToJSON optionsOrderItemSubsidyDTO

optionsOrderItemSubsidyDTO :: Options
optionsOrderItemSubsidyDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemSubsidyDTOType", "type")
      , ("orderItemSubsidyDTOAmount", "amount")
      ]


-- | Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.). 
data OrderItemSubsidyType = OrderItemSubsidyType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemSubsidyType where
  parseJSON = genericParseJSON optionsOrderItemSubsidyType
instance ToJSON OrderItemSubsidyType where
  toJSON = genericToJSON optionsOrderItemSubsidyType

optionsOrderItemSubsidyType :: Options
optionsOrderItemSubsidyType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Причина обновления состава заказа.
data OrderItemsModificationRequestReasonType = OrderItemsModificationRequestReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemsModificationRequestReasonType where
  parseJSON = genericParseJSON optionsOrderItemsModificationRequestReasonType
instance ToJSON OrderItemsModificationRequestReasonType where
  toJSON = genericToJSON optionsOrderItemsModificationRequestReasonType

optionsOrderItemsModificationRequestReasonType :: Options
optionsOrderItemsModificationRequestReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
data OrderItemsModificationResultDTO = OrderItemsModificationResultDTO
  { orderItemsModificationResultDTOItems :: [BriefOrderItemDTO] -- ^ Список позиций в заказе, подлежащих маркировке.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderItemsModificationResultDTO where
  parseJSON = genericParseJSON optionsOrderItemsModificationResultDTO
instance ToJSON OrderItemsModificationResultDTO where
  toJSON = genericToJSON optionsOrderItemsModificationResultDTO

optionsOrderItemsModificationResultDTO :: Options
optionsOrderItemsModificationResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderItemsModificationResultDTOItems", "items")
      ]


-- | Данные для печати ярлыка.
data OrderLabelDTO = OrderLabelDTO
  { orderLabelDTOOrderId :: Int64 -- ^ Идентификатор заказа.
  , orderLabelDTOPlacesNumber :: Int -- ^ Количество коробок в заказе.
  , orderLabelDTOUrl :: Text -- ^ URL файла с ярлыками‑наклейками на все коробки в заказе.  Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/labels](../../reference/orders/generateOrderLabels.md). 
  , orderLabelDTOParcelBoxLabels :: [ParcelBoxLabelDTO] -- ^ Информация на ярлыке.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLabelDTO where
  parseJSON = genericParseJSON optionsOrderLabelDTO
instance ToJSON OrderLabelDTO where
  toJSON = genericToJSON optionsOrderLabelDTO

optionsOrderLabelDTO :: Options
optionsOrderLabelDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderLabelDTOOrderId", "orderId")
      , ("orderLabelDTOPlacesNumber", "placesNumber")
      , ("orderLabelDTOUrl", "url")
      , ("orderLabelDTOParcelBoxLabels", "parcelBoxLabels")
      ]


-- | Тип подъема заказа на этаж:  * &#x60;NOT_NEEDED&#x60; — не требуется.  * &#x60;MANUAL&#x60; — ручной.  * &#x60;ELEVATOR&#x60; — лифт.  * &#x60;CARGO_ELEVATOR&#x60; — грузовой лифт.  * &#x60;FREE&#x60; — любой из перечисленных выше, если включена опция бесплатного подъема.  * &#x60;UNKNOWN&#x60; — неизвестный тип. 
data OrderLiftType = OrderLiftType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderLiftType where
  parseJSON = genericParseJSON optionsOrderLiftType
instance ToJSON OrderLiftType where
  toJSON = genericToJSON optionsOrderLiftType

optionsOrderLiftType :: Options
optionsOrderLiftType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о грузоместе.
data OrderParcelBoxDTO = OrderParcelBoxDTO
  { orderParcelBoxDTOId :: Maybe Int64 -- ^ Идентификатор грузоместа.
  , orderParcelBoxDTOFulfilmentId :: Maybe Text -- ^ Идентификатор грузового места в информационной системе магазина.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderParcelBoxDTO where
  parseJSON = genericParseJSON optionsOrderParcelBoxDTO
instance ToJSON OrderParcelBoxDTO where
  toJSON = genericToJSON optionsOrderParcelBoxDTO

optionsOrderParcelBoxDTO :: Options
optionsOrderParcelBoxDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderParcelBoxDTOId", "id")
      , ("orderParcelBoxDTOFulfilmentId", "fulfilmentId")
      ]


-- | Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
data OrderPaymentMethodType = OrderPaymentMethodType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderPaymentMethodType where
  parseJSON = genericParseJSON optionsOrderPaymentMethodType
instance ToJSON OrderPaymentMethodType where
  toJSON = genericToJSON optionsOrderPaymentMethodType

optionsOrderPaymentMethodType :: Options
optionsOrderPaymentMethodType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип оплаты заказа:  * &#x60;PREPAID&#x60; — оплата при оформлении заказа.  * &#x60;POSTPAID&#x60; — оплата при получении заказа.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Если параметр отсутствует, заказ будет оплачен при получении. 
data OrderPaymentType = OrderPaymentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderPaymentType where
  parseJSON = genericParseJSON optionsOrderPaymentType
instance ToJSON OrderPaymentType where
  toJSON = genericToJSON optionsOrderPaymentType

optionsOrderPaymentType :: Options
optionsOrderPaymentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип скидки:  * &#x60;DIRECT_DISCOUNT&#x60; — прямая скидка, которую устанавливает продавец или Маркет.  * &#x60;BLUE_SET&#x60; — комплекты.  * &#x60;BLUE_FLASH&#x60; — флеш-акция.  * &#x60;MARKET_COUPON&#x60; — скидка по промокоду Маркета.  * &#x60;MARKET_PROMOCODE&#x60; — скидка по промокоду магазина.  * &#x60;MARKET_BLUE&#x60; — скидка на Маркете.  * &#x60;YANDEX_PLUS&#x60; — бесплатная доставка с подпиской Яндекс Плюс.  * &#x60;YANDEX_EMPLOYEE&#x60; — бесплатная доставка по определенным адресам.  * &#x60;LIMITED_FREE_DELIVERY_PROMO&#x60; — бесплатная доставка по ограниченному предложению.  * &#x60;FREE_DELIVERY_THRESHOLD&#x60; — бесплатная доставка при достижении определенной суммы заказа.  * &#x60;MULTICART_DISCOUNT&#x60; — скидка за то, что оформлена мультикорзина.  * &#x60;FREE_DELIVERY_FOR_LDI&#x60; — бесплатная доставка за то, что один из товаров крупногабаритный.  * &#x60;FREE_DELIVERY_FOR_LSC&#x60; — бесплатная доставка за то, что одна из корзин в мультикорзине крупногабаритная.  * &#x60;FREE_PICKUP&#x60; — бесплатная доставка в пункт выдачи заказов.  * &#x60;CHEAPEST_AS_GIFT&#x60; — самый дешевый товар в подарок.  * &#x60;CASHBACK&#x60; — кешбэк.  * &#x60;SUPPLIER_MULTICART_DISCOUNT&#x60; — скидка за доставку.  * &#x60;SPREAD_DISCOUNT_COUNT&#x60; — скидка за количество одинаковых товаров.  * &#x60;SPREAD_DISCOUNT_RECEIPT&#x60; — скидка от суммы чека.  * &#x60;ANNOUNCEMENT_PROMO&#x60; — информационная акция, скидка не применяется к товарам.  * &#x60;DISCOUNT_BY_PAYMENT_TYPE&#x60; — прямая скидка при оплате картой Плюса.  * &#x60;PERCENT_DISCOUNT&#x60; — прямая скидка в процентах.  * &#x60;DCO_EXTRA_DISCOUNT&#x60; — дополнительная скидка, необходимая для расчета субсидии от Маркета.  * &#x60;EMPTY_PROMO&#x60; — скрытые промокоды.  * &#x60;BLOCKING_PROMO&#x60; — блокирующее промо.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Устаревшие типы:  * &#x60;GENERIC_BUNDLE&#x60;.  * &#x60;MARKET_DEAL&#x60;.  * &#x60;MARKET_PRIME&#x60;.  * &#x60;MARKET_COIN&#x60;.  * &#x60;BERU_PLUS&#x60;.  * &#x60;PRICE_DROP_AS_YOU_SHOP&#x60;.  * &#x60;SECRET_SALE&#x60;. 
data OrderPromoType = OrderPromoType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderPromoType where
  parseJSON = genericParseJSON optionsOrderPromoType
instance ToJSON OrderPromoType where
  toJSON = genericToJSON optionsOrderPromoType

optionsOrderPromoType :: Options
optionsOrderPromoType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список посылок.  В параметре может указываться несколько посылок. 
data OrderShipmentDTO = OrderShipmentDTO
  { orderShipmentDTOId :: Maybe Int64 -- ^ Идентификатор посылки, присвоенный Маркетом.
  , orderShipmentDTOShipmentDate :: Maybe Text -- ^ Формат даты: `ДД-ММ-ГГГГ`. 
  , orderShipmentDTOShipmentTime :: Maybe Text -- ^ **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
  , orderShipmentDTOTracks :: Maybe [OrderTrackDTO] -- ^ **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
  , orderShipmentDTOBoxes :: Maybe [OrderParcelBoxDTO] -- ^ Список грузовых мест.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderShipmentDTO where
  parseJSON = genericParseJSON optionsOrderShipmentDTO
instance ToJSON OrderShipmentDTO where
  toJSON = genericToJSON optionsOrderShipmentDTO

optionsOrderShipmentDTO :: Options
optionsOrderShipmentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderShipmentDTOId", "id")
      , ("orderShipmentDTOShipmentDate", "shipmentDate")
      , ("orderShipmentDTOShipmentTime", "shipmentTime")
      , ("orderShipmentDTOTracks", "tracks")
      , ("orderShipmentDTOBoxes", "boxes")
      ]


-- | Информация по заказу.
data OrderStateDTO = OrderStateDTO
  { orderStateDTOId :: Int64 -- ^ Идентификатор заказа.
  , orderStateDTOStatus :: OrderStatusType -- ^ 
  , orderStateDTOSubstatus :: Maybe OrderSubstatusType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStateDTO where
  parseJSON = genericParseJSON optionsOrderStateDTO
instance ToJSON OrderStateDTO where
  toJSON = genericToJSON optionsOrderStateDTO

optionsOrderStateDTO :: Options
optionsOrderStateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderStateDTOId", "id")
      , ("orderStateDTOStatus", "status")
      , ("orderStateDTOSubstatus", "substatus")
      ]


-- | Текущий статус заказа:  * &#x60;CANCELLED_BEFORE_PROCESSING&#x60; — заказ отменен до начала его обработки.  * &#x60;CANCELLED_IN_DELIVERY&#x60; — заказ отменен во время его доставки.  * &#x60;CANCELLED_IN_PROCESSING&#x60; — заказ отменен во время его обработки.  * &#x60;DELIVERY&#x60; — заказ передан службе доставки.  * &#x60;DELIVERED&#x60; — заказ доставлен.  * &#x60;PARTIALLY_DELIVERED&#x60; — заказ частично доставлен.  * &#x60;PARTIALLY_RETURNED&#x60; — заказ частично возвращен покупателем.  * &#x60;PENDING&#x60; — заказ ожидает подтверждения.  * &#x60;PICKUP&#x60; — заказ доставлен в пункт выдачи.  * &#x60;PROCESSING&#x60; — заказ в обработке.  * &#x60;RESERVED&#x60; — товар зарезервирован на складе.  * &#x60;RETURNED&#x60; — заказ полностью возвращен покупателем.  * &#x60;UNKNOWN&#x60; — неизвестный статус заказа.  * &#x60;UNPAID&#x60; — заказ от юридического лица ожидает оплаты.  * &#x60;LOST&#x60; — заказ утерян. 
data OrderStatsStatusType = OrderStatsStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatsStatusType where
  parseJSON = genericParseJSON optionsOrderStatsStatusType
instance ToJSON OrderStatsStatusType where
  toJSON = genericToJSON optionsOrderStatsStatusType

optionsOrderStatsStatusType :: Options
optionsOrderStatsStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Заказ.
data OrderStatusChangeDTO = OrderStatusChangeDTO
  { orderStatusChangeDTOStatus :: OrderStatusType -- ^ 
  , orderStatusChangeDTOSubstatus :: Maybe OrderSubstatusType -- ^ 
  , orderStatusChangeDTODelivery :: Maybe OrderStatusChangeDeliveryDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatusChangeDTO where
  parseJSON = genericParseJSON optionsOrderStatusChangeDTO
instance ToJSON OrderStatusChangeDTO where
  toJSON = genericToJSON optionsOrderStatusChangeDTO

optionsOrderStatusChangeDTO :: Options
optionsOrderStatusChangeDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderStatusChangeDTOStatus", "status")
      , ("orderStatusChangeDTOSubstatus", "substatus")
      , ("orderStatusChangeDTODelivery", "delivery")
      ]


-- | Информация о доставке.
data OrderStatusChangeDeliveryDTO = OrderStatusChangeDeliveryDTO
  { orderStatusChangeDeliveryDTODates :: Maybe OrderStatusChangeDeliveryDatesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatusChangeDeliveryDTO where
  parseJSON = genericParseJSON optionsOrderStatusChangeDeliveryDTO
instance ToJSON OrderStatusChangeDeliveryDTO where
  toJSON = genericToJSON optionsOrderStatusChangeDeliveryDTO

optionsOrderStatusChangeDeliveryDTO :: Options
optionsOrderStatusChangeDeliveryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderStatusChangeDeliveryDTODates", "dates")
      ]


-- | Диапазон дат доставки.
data OrderStatusChangeDeliveryDatesDTO = OrderStatusChangeDeliveryDatesDTO
  { orderStatusChangeDeliveryDatesDTORealDeliveryDate :: Maybe Day -- ^ **Только для модели DBS**  Фактическая дата доставки. <br><br> Когда передавать параметр `realDeliveryDate`:  * Не передавайте параметр, если:   * переводите заказ в любой статус, кроме `PICKUP` или `DELIVERED`;   * меняете статус заказа на `PICKUP` или `DELIVERED` в день доставки — будет указана дата выполнения запроса. * Передавайте дату доставки, если переводите заказ в статус `PICKUP` или `DELIVERED` не в день доставки. Нельзя указывать дату доставки в будущем.    {% note warning \"Индекс качества\" %}    Передача статуса после установленного срока снижает индекс качества. О сроках читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/tech#dbs).    {% endnote %}      
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatusChangeDeliveryDatesDTO where
  parseJSON = genericParseJSON optionsOrderStatusChangeDeliveryDatesDTO
instance ToJSON OrderStatusChangeDeliveryDatesDTO where
  toJSON = genericToJSON optionsOrderStatusChangeDeliveryDatesDTO

optionsOrderStatusChangeDeliveryDatesDTO :: Options
optionsOrderStatusChangeDeliveryDatesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderStatusChangeDeliveryDatesDTORealDeliveryDate", "realDeliveryDate")
      ]


-- | Статус заказа:  * &#x60;CANCELLED&#x60; — отменен.  * &#x60;DELIVERED&#x60; — получен покупателем.  * &#x60;DELIVERY&#x60; — передан в службу доставки.  * &#x60;PICKUP&#x60; — доставлен в пункт самовывоза.  * &#x60;PROCESSING&#x60; — находится в обработке.  * &#x60;PENDING&#x60; — ожидает обработки со стороны продавца.  * &#x60;UNPAID&#x60; — оформлен, но еще не оплачен (если выбрана оплата при оформлении).  * &#x60;PLACING&#x60; — оформляется, подготовка к резервированию.  * &#x60;RESERVED&#x60; — зарезервирован, но недооформлен.  * &#x60;PARTIALLY_RETURNED&#x60; — возвращен частично.  * &#x60;RETURNED&#x60; — возвращен полностью.  * &#x60;UNKNOWN&#x60; — неизвестный статус.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
data OrderStatusType = OrderStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderStatusType where
  parseJSON = genericParseJSON optionsOrderStatusType
instance ToJSON OrderStatusType where
  toJSON = genericToJSON optionsOrderStatusType

optionsOrderStatusType :: Options
optionsOrderStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
data OrderSubsidyDTO = OrderSubsidyDTO
  { orderSubsidyDTOType :: Maybe OrderSubsidyType -- ^ 
  , orderSubsidyDTOAmount :: Maybe Double -- ^ Сумма субсидии.
  } deriving (Show, Eq, Generic)

instance FromJSON OrderSubsidyDTO where
  parseJSON = genericParseJSON optionsOrderSubsidyDTO
instance ToJSON OrderSubsidyDTO where
  toJSON = genericToJSON optionsOrderSubsidyDTO

optionsOrderSubsidyDTO :: Options
optionsOrderSubsidyDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderSubsidyDTOType", "type")
      , ("orderSubsidyDTOAmount", "amount")
      ]


-- | Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
data OrderSubsidyType = OrderSubsidyType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderSubsidyType where
  parseJSON = genericParseJSON optionsOrderSubsidyType
instance ToJSON OrderSubsidyType where
  toJSON = genericToJSON optionsOrderSubsidyType

optionsOrderSubsidyType :: Options
optionsOrderSubsidyType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Этап обработки заказа (если он имеет статус &#x60;PROCESSING&#x60;) или причина отмены заказа (если он имеет статус &#x60;CANCELLED&#x60;).  * Значения для заказа в статусе &#x60;PROCESSING&#x60;:      * &#x60;STARTED&#x60; — заказ подтвержден, его можно начать обрабатывать.      * &#x60;READY_TO_SHIP&#x60; — заказ собран и готов к отправке.  * Значения для заказа в статусе &#x60;CANCELLED&#x60;:      * &#x60;PROCESSING_EXPIRED&#x60; — значение более не используется.      * &#x60;REPLACING_ORDER&#x60; — покупатель решил заменить товар другим по собственной инициативе.      * &#x60;RESERVATION_EXPIRED&#x60; — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.      * &#x60;SHOP_FAILED&#x60; — магазин не может выполнить заказ.      * &#x60;USER_CHANGED_MIND&#x60; — покупатель отменил заказ по личным причинам.      * &#x60;USER_NOT_PAID&#x60; — покупатель не оплатил заказ (для типа оплаты &#x60;PREPAID&#x60;) в течение 30 минут.      * &#x60;USER_REFUSED_DELIVERY&#x60; — покупателя не устроили условия доставки.      * &#x60;USER_REFUSED_PRODUCT&#x60; — покупателю не подошел товар.      * &#x60;USER_REFUSED_QUALITY&#x60; — покупателя не устроило качество товара.      * &#x60;USER_UNREACHABLE&#x60; — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:        * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;       * перерыв между первым и третьим звонком не менее 90 минут;       * соединение не короче 5 секунд.        Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400.  * &#x60;TECHNICAL_ERROR&#x60; — техническая ошибка на стороне Маркета. Обратитесь в поддержку.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
data OrderSubstatusType = OrderSubstatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderSubstatusType where
  parseJSON = genericParseJSON optionsOrderSubstatusType
instance ToJSON OrderSubstatusType where
  toJSON = genericToJSON optionsOrderSubstatusType

optionsOrderSubstatusType :: Options
optionsOrderSubstatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Система налогообложения (СНО) магазина на момент оформления заказа:  * &#x60;ECHN&#x60; — единый сельскохозяйственный налог (ЕСХН).  * &#x60;ENVD&#x60; — единый налог на вмененный доход (ЕНВД).  * &#x60;OSN&#x60; — общая система налогообложения (ОСН).  * &#x60;PSN&#x60; — патентная система налогообложения (ПСН).  * &#x60;USN&#x60; — упрощенная система налогообложения (УСН).  * &#x60;USN_MINUS_COST&#x60; — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * &#x60;NPD&#x60; — налог на профессиональный доход (НПД).  * &#x60;UNKNOWN_VALUE&#x60; — неизвестное значение. Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
data OrderTaxSystemType = OrderTaxSystemType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderTaxSystemType where
  parseJSON = genericParseJSON optionsOrderTaxSystemType
instance ToJSON OrderTaxSystemType where
  toJSON = genericToJSON optionsOrderTaxSystemType

optionsOrderTaxSystemType :: Options
optionsOrderTaxSystemType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о трек-номере посылки (DBS).
data OrderTrackDTO = OrderTrackDTO
  { orderTrackDTOTrackCode :: Maybe Text -- ^ Трек‑номер посылки.
  , orderTrackDTODeliveryServiceId :: Maybe Int64 -- ^ Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  } deriving (Show, Eq, Generic)

instance FromJSON OrderTrackDTO where
  parseJSON = genericParseJSON optionsOrderTrackDTO
instance ToJSON OrderTrackDTO where
  toJSON = genericToJSON optionsOrderTrackDTO

optionsOrderTrackDTO :: Options
optionsOrderTrackDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("orderTrackDTOTrackCode", "trackCode")
      , ("orderTrackDTODeliveryServiceId", "deliveryServiceId")
      ]


-- | Изменился ли статус заказа:  * &#x60;OK&#x60; — статус изменен.  * &#x60;ERROR&#x60; — статус не изменен. В этом случае появится сообщение об ошибке в параметре &#x60;errorDetails&#x60;. 
data OrderUpdateStatusType = OrderUpdateStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderUpdateStatusType where
  parseJSON = genericParseJSON optionsOrderUpdateStatusType
instance ToJSON OrderUpdateStatusType where
  toJSON = genericToJSON optionsOrderUpdateStatusType

optionsOrderUpdateStatusType :: Options
optionsOrderUpdateStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ставка налога на добавленную стоимость (НДС) на товар:  * &#x60;NO_VAT&#x60; — НДС не облагается, используется только для отдельных видов услуг.  * &#x60;VAT_0&#x60; — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * &#x60;VAT_10&#x60; — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * &#x60;VAT_10_110&#x60; — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * &#x60;VAT_20&#x60; — НДС 20%. Основная ставка с 2019 года.  * &#x60;VAT_20_120&#x60; — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * &#x60;VAT_18&#x60; — НДС 18%. Основная ставка до 2019 года.  * &#x60;VAT_18_118&#x60; — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * &#x60;UNKNOWN_VALUE&#x60; — неизвестный тип.  Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
data OrderVatType = OrderVatType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrderVatType where
  parseJSON = genericParseJSON optionsOrderVatType
instance ToJSON OrderVatType where
  toJSON = genericToJSON optionsOrderVatType

optionsOrderVatType :: Options
optionsOrderVatType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Годные/негодные ярлыки по заказам в отгрузке.
data OrdersShipmentInfoDTO = OrdersShipmentInfoDTO
  { ordersShipmentInfoDTOOrderIdsWithLabels :: [Int64] -- ^ Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
  , ordersShipmentInfoDTOOrderIdsWithoutLabels :: [Int64] -- ^ Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersShipmentInfoDTO where
  parseJSON = genericParseJSON optionsOrdersShipmentInfoDTO
instance ToJSON OrdersShipmentInfoDTO where
  toJSON = genericToJSON optionsOrdersShipmentInfoDTO

optionsOrdersShipmentInfoDTO :: Options
optionsOrdersShipmentInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersShipmentInfoDTOOrderIdsWithLabels", "orderIdsWithLabels")
      , ("ordersShipmentInfoDTOOrderIdsWithoutLabels", "orderIdsWithoutLabels")
      ]


-- | Информация о стоимости услуг.
data OrdersStatsCommissionDTO = OrdersStatsCommissionDTO
  { ordersStatsCommissionDTOType :: Maybe OrdersStatsCommissionType -- ^ 
  , ordersStatsCommissionDTOActual :: Maybe Double -- ^ Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsCommissionDTO where
  parseJSON = genericParseJSON optionsOrdersStatsCommissionDTO
instance ToJSON OrdersStatsCommissionDTO where
  toJSON = genericToJSON optionsOrdersStatsCommissionDTO

optionsOrdersStatsCommissionDTO :: Options
optionsOrdersStatsCommissionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsCommissionDTOType", "type")
      , ("ordersStatsCommissionDTOActual", "actual")
      ]


-- | Услуга:  * &#x60;FEE&#x60; — размещение товара на Маркете. * &#x60;FULFILLMENT&#x60; — складская обработка. Не возвращается с 1 января 2024 года. * &#x60;LOYALTY_PARTICIPATION_FEE&#x60; — участие в программе лояльности и отзывы за баллы. * &#x60;AUCTION_PROMOTION&#x60; — буст продаж с оплатой за продажи. * &#x60;INSTALLMENT&#x60; — рассрочка. Не возвращается с 24 февраля 2022 года. * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;EXPRESS_DELIVERY_TO_CUSTOMER&#x60; — экспресс-доставка покупателю (Экспресс). * &#x60;AGENCY&#x60; — прием платежа покупателя. * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя. * &#x60;RETURNED_ORDERS_STORAGE&#x60; — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;SORTING&#x60; — обработка заказа (FBS). * &#x60;INTAKE_SORTING&#x60; — организация забора заказов со склада продавца (FBS). * &#x60;RETURN_PROCESSING&#x60; — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * &#x60;ILLIQUID_GOODS_SALE&#x60; — вознаграждение за продажу невывезенных товаров. 
data OrdersStatsCommissionType = OrdersStatsCommissionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsCommissionType where
  parseJSON = genericParseJSON optionsOrdersStatsCommissionType
instance ToJSON OrdersStatsCommissionType where
  toJSON = genericToJSON optionsOrdersStatsCommissionType

optionsOrdersStatsCommissionType :: Options
optionsOrdersStatsCommissionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация по заказам.
data OrdersStatsDTO = OrdersStatsDTO
  { ordersStatsDTOOrders :: [OrdersStatsOrderDTO] -- ^ Список заказов.
  , ordersStatsDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsDTO where
  parseJSON = genericParseJSON optionsOrdersStatsDTO
instance ToJSON OrdersStatsDTO where
  toJSON = genericToJSON optionsOrdersStatsDTO

optionsOrdersStatsDTO :: Options
optionsOrdersStatsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsDTOOrders", "orders")
      , ("ordersStatsDTOPaging", "paging")
      ]


-- | Информация о регионе доставки.
data OrdersStatsDeliveryRegionDTO = OrdersStatsDeliveryRegionDTO
  { ordersStatsDeliveryRegionDTOId :: Maybe Int64 -- ^ Идентификатор региона доставки.
  , ordersStatsDeliveryRegionDTOName :: Maybe Text -- ^ Название региона доставки.
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsDeliveryRegionDTO where
  parseJSON = genericParseJSON optionsOrdersStatsDeliveryRegionDTO
instance ToJSON OrdersStatsDeliveryRegionDTO where
  toJSON = genericToJSON optionsOrdersStatsDeliveryRegionDTO

optionsOrdersStatsDeliveryRegionDTO :: Options
optionsOrdersStatsDeliveryRegionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsDeliveryRegionDTOId", "id")
      , ("ordersStatsDeliveryRegionDTOName", "name")
      ]


-- | Информация об удалении товара из заказа.
data OrdersStatsDetailsDTO = OrdersStatsDetailsDTO
  { ordersStatsDetailsDTOItemStatus :: Maybe OrdersStatsItemStatusType -- ^ 
  , ordersStatsDetailsDTOItemCount :: Maybe Int64 -- ^ Количество товара со статусом, указанном в параметре `itemStatus`.
  , ordersStatsDetailsDTOUpdateDate :: Maybe Day -- ^ Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
  , ordersStatsDetailsDTOStockType :: Maybe OrdersStatsStockType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsDetailsDTO where
  parseJSON = genericParseJSON optionsOrdersStatsDetailsDTO
instance ToJSON OrdersStatsDetailsDTO where
  toJSON = genericToJSON optionsOrdersStatsDetailsDTO

optionsOrdersStatsDetailsDTO :: Options
optionsOrdersStatsDetailsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsDetailsDTOItemStatus", "itemStatus")
      , ("ordersStatsDetailsDTOItemCount", "itemCount")
      , ("ordersStatsDetailsDTOUpdateDate", "updateDate")
      , ("ordersStatsDetailsDTOStockType", "stockType")
      ]


-- | Список товаров в заказе после возможных изменений.  В ходе обработки заказа Маркет может удалить из него единицы товаров — при проблемах на складе или по инициативе пользователя.  * Если из заказа удалены все единицы товара, его не будет в списке &#x60;items&#x60; — только в списке &#x60;initialItems&#x60;.  * Если в заказе осталась хотя бы одна единица товара, он будет и в списке &#x60;items&#x60; (с уменьшенным количеством единиц &#x60;count&#x60;), и в списке &#x60;initialItems&#x60; (с первоначальным количеством единиц &#x60;initialCount&#x60;). 
data OrdersStatsItemDTO = OrdersStatsItemDTO
  { ordersStatsItemDTOOfferName :: Maybe Text -- ^ Название товара.
  , ordersStatsItemDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , ordersStatsItemDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , ordersStatsItemDTOCount :: Maybe Int -- ^ Количество единиц товара с учетом удаленных единиц.  Если из заказа удалены все единицы товара, он попадет только в список `initialItems`. 
  , ordersStatsItemDTOPrices :: Maybe [OrdersStatsPriceDTO] -- ^ Цена или скидки на товар.
  , ordersStatsItemDTOWarehouse :: Maybe OrdersStatsWarehouseDTO -- ^ 
  , ordersStatsItemDTODetails :: Maybe [OrdersStatsDetailsDTO] -- ^ Информация об удалении товара из заказа.
  , ordersStatsItemDTOCisList :: Maybe [Text] -- ^ Список кодов идентификации товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  , ordersStatsItemDTOInitialCount :: Maybe Int -- ^ Первоначальное количество единиц товара.
  , ordersStatsItemDTOBidFee :: Maybe Int -- ^ Списанная ставка ближайшего конкурента.  Указывается в процентах от стоимости товара и умножается на 100. Например, ставка 5% обозначается как 500. 
  , ordersStatsItemDTOCofinanceThreshold :: Maybe Double -- ^ Порог для скидок с Маркетом на момент оформления заказа. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указан в рублях. Точность — два знака после запятой. 
  , ordersStatsItemDTOCofinanceValue :: Maybe Double -- ^ Скидка с Маркетом. [Что это такое?](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)  Указана в рублях. Точность — два знака после запятой. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsItemDTO where
  parseJSON = genericParseJSON optionsOrdersStatsItemDTO
instance ToJSON OrdersStatsItemDTO where
  toJSON = genericToJSON optionsOrdersStatsItemDTO

optionsOrdersStatsItemDTO :: Options
optionsOrdersStatsItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsItemDTOOfferName", "offerName")
      , ("ordersStatsItemDTOMarketSku", "marketSku")
      , ("ordersStatsItemDTOShopSku", "shopSku")
      , ("ordersStatsItemDTOCount", "count")
      , ("ordersStatsItemDTOPrices", "prices")
      , ("ordersStatsItemDTOWarehouse", "warehouse")
      , ("ordersStatsItemDTODetails", "details")
      , ("ordersStatsItemDTOCisList", "cisList")
      , ("ordersStatsItemDTOInitialCount", "initialCount")
      , ("ordersStatsItemDTOBidFee", "bidFee")
      , ("ordersStatsItemDTOCofinanceThreshold", "cofinanceThreshold")
      , ("ordersStatsItemDTOCofinanceValue", "cofinanceValue")
      ]


-- | Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
data OrdersStatsItemStatusType = OrdersStatsItemStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsItemStatusType where
  parseJSON = genericParseJSON optionsOrdersStatsItemStatusType
instance ToJSON OrdersStatsItemStatusType where
  toJSON = genericToJSON optionsOrdersStatsItemStatusType

optionsOrdersStatsItemStatusType :: Options
optionsOrdersStatsItemStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о заказе.
data OrdersStatsOrderDTO = OrdersStatsOrderDTO
  { ordersStatsOrderDTOId :: Maybe Int64 -- ^ Идентификатор заказа.
  , ordersStatsOrderDTOCreationDate :: Maybe Day -- ^ Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
  , ordersStatsOrderDTOStatusUpdateDate :: Maybe UTCTime -- ^ Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва). 
  , ordersStatsOrderDTOStatus :: Maybe OrderStatsStatusType -- ^ 
  , ordersStatsOrderDTOPartnerOrderId :: Maybe Text -- ^ Идентификатор заказа в информационной системе магазина.
  , ordersStatsOrderDTOPaymentType :: Maybe OrdersStatsOrderPaymentType -- ^ 
  , ordersStatsOrderDTOFake :: Maybe Bool -- ^ Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
  , ordersStatsOrderDTODeliveryRegion :: Maybe OrdersStatsDeliveryRegionDTO -- ^ 
  , ordersStatsOrderDTOItems :: [OrdersStatsItemDTO] -- ^ Список товаров в заказе после возможных изменений.
  , ordersStatsOrderDTOInitialItems :: Maybe [OrdersStatsItemDTO] -- ^ Список товаров в заказе до изменений.
  , ordersStatsOrderDTOPayments :: [OrdersStatsPaymentDTO] -- ^ Информация о денежных переводах по заказу.
  , ordersStatsOrderDTOCommissions :: [OrdersStatsCommissionDTO] -- ^ Информация о комиссиях за заказ.
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsOrderDTO where
  parseJSON = genericParseJSON optionsOrdersStatsOrderDTO
instance ToJSON OrdersStatsOrderDTO where
  toJSON = genericToJSON optionsOrdersStatsOrderDTO

optionsOrdersStatsOrderDTO :: Options
optionsOrdersStatsOrderDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsOrderDTOId", "id")
      , ("ordersStatsOrderDTOCreationDate", "creationDate")
      , ("ordersStatsOrderDTOStatusUpdateDate", "statusUpdateDate")
      , ("ordersStatsOrderDTOStatus", "status")
      , ("ordersStatsOrderDTOPartnerOrderId", "partnerOrderId")
      , ("ordersStatsOrderDTOPaymentType", "paymentType")
      , ("ordersStatsOrderDTOFake", "fake")
      , ("ordersStatsOrderDTODeliveryRegion", "deliveryRegion")
      , ("ordersStatsOrderDTOItems", "items")
      , ("ordersStatsOrderDTOInitialItems", "initialItems")
      , ("ordersStatsOrderDTOPayments", "payments")
      , ("ordersStatsOrderDTOCommissions", "commissions")
      ]


-- | Тип оплаты заказа: - &#x60;CREDIT&#x60; — заказ оформлен в кредит. - &#x60;POSTPAID&#x60; — заказ оплачен после того, как был получен. - &#x60;PREPAID&#x60; — заказ оплачен до того, как был получен. 
data OrdersStatsOrderPaymentType = OrdersStatsOrderPaymentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsOrderPaymentType where
  parseJSON = genericParseJSON optionsOrdersStatsOrderPaymentType
instance ToJSON OrdersStatsOrderPaymentType where
  toJSON = genericToJSON optionsOrdersStatsOrderPaymentType

optionsOrdersStatsOrderPaymentType :: Options
optionsOrdersStatsOrderPaymentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о денежных переводах по заказу.
data OrdersStatsPaymentDTO = OrdersStatsPaymentDTO
  { ordersStatsPaymentDTOId :: Maybe Text -- ^ Идентификатор денежного перевода.
  , ordersStatsPaymentDTODate :: Maybe Day -- ^ Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
  , ordersStatsPaymentDTOType :: Maybe OrdersStatsPaymentType -- ^ 
  , ordersStatsPaymentDTOSource :: Maybe OrdersStatsPaymentSourceType -- ^ 
  , ordersStatsPaymentDTOTotal :: Maybe Double -- ^ Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
  , ordersStatsPaymentDTOPaymentOrder :: Maybe OrdersStatsPaymentOrderDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPaymentDTO where
  parseJSON = genericParseJSON optionsOrdersStatsPaymentDTO
instance ToJSON OrdersStatsPaymentDTO where
  toJSON = genericToJSON optionsOrdersStatsPaymentDTO

optionsOrdersStatsPaymentDTO :: Options
optionsOrdersStatsPaymentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsPaymentDTOId", "id")
      , ("ordersStatsPaymentDTODate", "date")
      , ("ordersStatsPaymentDTOType", "type")
      , ("ordersStatsPaymentDTOSource", "source")
      , ("ordersStatsPaymentDTOTotal", "total")
      , ("ordersStatsPaymentDTOPaymentOrder", "paymentOrder")
      ]


-- | Информация о платежном получении.
data OrdersStatsPaymentOrderDTO = OrdersStatsPaymentOrderDTO
  { ordersStatsPaymentOrderDTOId :: Maybe Text -- ^ Номер платежного поручения.
  , ordersStatsPaymentOrderDTODate :: Maybe Day -- ^ Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPaymentOrderDTO where
  parseJSON = genericParseJSON optionsOrdersStatsPaymentOrderDTO
instance ToJSON OrdersStatsPaymentOrderDTO where
  toJSON = genericToJSON optionsOrdersStatsPaymentOrderDTO

optionsOrdersStatsPaymentOrderDTO :: Options
optionsOrdersStatsPaymentOrderDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsPaymentOrderDTOId", "id")
      , ("ordersStatsPaymentOrderDTODate", "date")
      ]


-- | Способ денежного перевода: - &#x60;BUYER&#x60; — оплата или возврат деньгами. - &#x60;CASHBACK&#x60; — оплата или возврат баллами Плюса. - &#x60;MARKETPLACE&#x60; — оплата или возврат купонами. - &#x60;SPLIT&#x60; — оплата картой по частям (Сплит). 
data OrdersStatsPaymentSourceType = OrdersStatsPaymentSourceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPaymentSourceType where
  parseJSON = genericParseJSON optionsOrdersStatsPaymentSourceType
instance ToJSON OrdersStatsPaymentSourceType where
  toJSON = genericToJSON optionsOrdersStatsPaymentSourceType

optionsOrdersStatsPaymentSourceType :: Options
optionsOrdersStatsPaymentSourceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип денежного перевода: - &#x60;PAYMENT&#x60; — оплата. - &#x60;REFUND&#x60; — возврат. 
data OrdersStatsPaymentType = OrdersStatsPaymentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPaymentType where
  parseJSON = genericParseJSON optionsOrdersStatsPaymentType
instance ToJSON OrdersStatsPaymentType where
  toJSON = genericToJSON optionsOrdersStatsPaymentType

optionsOrdersStatsPaymentType :: Options
optionsOrdersStatsPaymentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Цена или скидки на товар.
data OrdersStatsPriceDTO = OrdersStatsPriceDTO
  { ordersStatsPriceDTOType :: Maybe OrdersStatsPriceType -- ^ 
  , ordersStatsPriceDTOCostPerItem :: Maybe Double -- ^ Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  , ordersStatsPriceDTOTotal :: Maybe Double -- ^ Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPriceDTO where
  parseJSON = genericParseJSON optionsOrdersStatsPriceDTO
instance ToJSON OrdersStatsPriceDTO where
  toJSON = genericToJSON optionsOrdersStatsPriceDTO

optionsOrdersStatsPriceDTO :: Options
optionsOrdersStatsPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsPriceDTOType", "type")
      , ("ordersStatsPriceDTOCostPerItem", "costPerItem")
      , ("ordersStatsPriceDTOTotal", "total")
      ]


-- | Тип скидки или цена на товар: - &#x60;BUYER&#x60; — цена на товар с учетом скидок, в том числе купонов. - &#x60;CASHBACK&#x60; — баллы Плюса. - &#x60;MARKETPLACE&#x60; — купоны. 
data OrdersStatsPriceType = OrdersStatsPriceType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsPriceType where
  parseJSON = genericParseJSON optionsOrdersStatsPriceType
instance ToJSON OrdersStatsPriceType where
  toJSON = genericToJSON optionsOrdersStatsPriceType

optionsOrdersStatsPriceType :: Options
optionsOrdersStatsPriceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип товара:  * &#x60;DEFECT&#x60; — товар бракованный.  * &#x60;FIT&#x60; — товар надлежащего качества. 
data OrdersStatsStockType = OrdersStatsStockType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsStockType where
  parseJSON = genericParseJSON optionsOrdersStatsStockType
instance ToJSON OrdersStatsStockType where
  toJSON = genericToJSON optionsOrdersStatsStockType

optionsOrdersStatsStockType :: Options
optionsOrdersStatsStockType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о складе, на котором хранится товар.
data OrdersStatsWarehouseDTO = OrdersStatsWarehouseDTO
  { ordersStatsWarehouseDTOId :: Maybe Int64 -- ^ Идентификатор склада.
  , ordersStatsWarehouseDTOName :: Maybe Text -- ^ Название склада.
  } deriving (Show, Eq, Generic)

instance FromJSON OrdersStatsWarehouseDTO where
  parseJSON = genericParseJSON optionsOrdersStatsWarehouseDTO
instance ToJSON OrdersStatsWarehouseDTO where
  toJSON = genericToJSON optionsOrdersStatsWarehouseDTO

optionsOrdersStatsWarehouseDTO :: Options
optionsOrdersStatsWarehouseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("ordersStatsWarehouseDTOId", "id")
      , ("ordersStatsWarehouseDTOName", "name")
      ]


-- | Адрес точки продаж. 
data OutletAddressDTO = OutletAddressDTO
  { outletAddressDTORegionId :: Int64 -- ^ Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
  , outletAddressDTOStreet :: Maybe Text -- ^ Улица.
  , outletAddressDTONumber :: Maybe Text -- ^ Номер дома.
  , outletAddressDTOBuilding :: Maybe Text -- ^ Номер строения.
  , outletAddressDTOEstate :: Maybe Text -- ^ Номер владения.
  , outletAddressDTOBlock :: Maybe Text -- ^ Номер корпуса.
  , outletAddressDTOAdditional :: Maybe Text -- ^ Дополнительная информация.
  , outletAddressDTOKm :: Maybe Int -- ^ Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
  , outletAddressDTOCity :: Maybe Text -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletAddressDTO where
  parseJSON = genericParseJSON optionsOutletAddressDTO
instance ToJSON OutletAddressDTO where
  toJSON = genericToJSON optionsOutletAddressDTO

optionsOutletAddressDTO :: Options
optionsOutletAddressDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletAddressDTORegionId", "regionId")
      , ("outletAddressDTOStreet", "street")
      , ("outletAddressDTONumber", "number")
      , ("outletAddressDTOBuilding", "building")
      , ("outletAddressDTOEstate", "estate")
      , ("outletAddressDTOBlock", "block")
      , ("outletAddressDTOAdditional", "additional")
      , ("outletAddressDTOKm", "km")
      , ("outletAddressDTOCity", "city")
      ]


-- | Информация о точке продаж.
data OutletDTO = OutletDTO
  { outletDTOName :: Text -- ^ Название точки продаж. 
  , outletDTOType :: OutletType -- ^ 
  , outletDTOCoords :: Maybe Text -- ^ Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  , outletDTOIsMain :: Maybe Bool -- ^ Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  , outletDTOShopOutletCode :: Maybe Text -- ^ Идентификатор точки продаж, присвоенный магазином.
  , outletDTOVisibility :: Maybe OutletVisibilityType -- ^ 
  , outletDTOAddress :: OutletAddressDTO -- ^ 
  , outletDTOPhones :: [Text] -- ^ Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  , outletDTOWorkingSchedule :: OutletWorkingScheduleDTO -- ^ 
  , outletDTODeliveryRules :: Maybe [OutletDeliveryRuleDTO] -- ^ Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  , outletDTOStoragePeriod :: Maybe Int64 -- ^ Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  } deriving (Show, Eq, Generic)

instance FromJSON OutletDTO where
  parseJSON = genericParseJSON optionsOutletDTO
instance ToJSON OutletDTO where
  toJSON = genericToJSON optionsOutletDTO

optionsOutletDTO :: Options
optionsOutletDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletDTOName", "name")
      , ("outletDTOType", "type")
      , ("outletDTOCoords", "coords")
      , ("outletDTOIsMain", "isMain")
      , ("outletDTOShopOutletCode", "shopOutletCode")
      , ("outletDTOVisibility", "visibility")
      , ("outletDTOAddress", "address")
      , ("outletDTOPhones", "phones")
      , ("outletDTOWorkingSchedule", "workingSchedule")
      , ("outletDTODeliveryRules", "deliveryRules")
      , ("outletDTOStoragePeriod", "storagePeriod")
      ]


-- | Информация об условиях доставки для данной точки продаж.
data OutletDeliveryRuleDTO = OutletDeliveryRuleDTO
  { outletDeliveryRuleDTOMinDeliveryDays :: Maybe Int -- ^ Минимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
  , outletDeliveryRuleDTOMaxDeliveryDays :: Maybe Int -- ^ Максимальный срок доставки товаров в точку продаж. Указан в рабочих днях.  Минимальное значение: `0` — доставка в день заказа.  Максимальное значение: `60`.  Допустимые сроки доставки (разница между `minDeliveryDays` и `maxDeliveryDays`) зависят от региона.  Для доставки по своему региону разница не должна превышать двух дней. Например, если `minDeliveryDays` равно 1, то для `maxDeliveryDays` допускаются значения от 1 до 3.  Для доставки в другие регионы:  * Если `minDeliveryDays` до 18 дней, разница не должна превышать четырех дней. Например, если `minDeliveryDays` равно 10, то для `maxDeliveryDays` допускаются значения от 10 до 14. * Если `minDeliveryDays` больше 18 дней, разница должна быть не больше чем в два раза. Например, если `minDeliveryDays` равно 21, то для `maxDeliveryDays` допускаются значения от 21 до 42.  Обязательный параметр, если `type=\"DEPOT\"` или `type=\"MIXED\"`.  Взаимоисключающий с параметром `unspecifiedDeliveryInterval`. 
  , outletDeliveryRuleDTODeliveryServiceId :: Maybe Int64 -- ^ Идентификатор службы доставки товаров в точку продаж.  Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md). 
  , outletDeliveryRuleDTOOrderBefore :: Maybe Int -- ^ Час, до которого покупателю нужно сделать заказ, чтобы он был доставлен в точку продаж в сроки от `minDeliveryDays` до `maxDeliveryDays`.  Если покупатель оформит заказ после указанного часа, он будет доставлен в сроки от `minDeliveryDays` + 1 рабочий день до `maxDeliveryDays` + 1 рабочий день.  Значение по умолчанию: `24`. 
  , outletDeliveryRuleDTOPriceFreePickup :: Maybe Double -- ^ Цена на товар, начиная с которой действует бесплатный самовывоз товара из точки продаж.
  , outletDeliveryRuleDTOUnspecifiedDeliveryInterval :: Maybe Bool -- ^ Признак доставки товаров в точку продаж на заказ.  Признак выставлен, если:  * точный срок доставки в точку продаж заранее неизвестен (например, если магазин собирает несколько заказов для отправки в точку или населенный пункт); * все товары изготавливаются или поставляются на заказ.  Возможные значения: * `true` — товары доставляются в точку продаж на заказ.  Параметр указывается только со значением `true`.  Взаимоисключающий с параметрами `minDeliveryDays` и `maxDeliveryDays`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletDeliveryRuleDTO where
  parseJSON = genericParseJSON optionsOutletDeliveryRuleDTO
instance ToJSON OutletDeliveryRuleDTO where
  toJSON = genericToJSON optionsOutletDeliveryRuleDTO

optionsOutletDeliveryRuleDTO :: Options
optionsOutletDeliveryRuleDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletDeliveryRuleDTOMinDeliveryDays", "minDeliveryDays")
      , ("outletDeliveryRuleDTOMaxDeliveryDays", "maxDeliveryDays")
      , ("outletDeliveryRuleDTODeliveryServiceId", "deliveryServiceId")
      , ("outletDeliveryRuleDTOOrderBefore", "orderBefore")
      , ("outletDeliveryRuleDTOPriceFreePickup", "priceFreePickup")
      , ("outletDeliveryRuleDTOUnspecifiedDeliveryInterval", "unspecifiedDeliveryInterval")
      ]


-- | Информация о лицензии.
data OutletLicenseDTO = OutletLicenseDTO
  { outletLicenseDTOId :: Maybe Int64 -- ^ Идентификатор лицензии.  Параметр указывается, только если нужно изменить информацию о существующей лицензии. Ее идентификатор можно узнать с помощью запроса [GET campaigns/{campaignId}/outlets/licenses](../../reference/outlets/getOutletLicenses.md). При передаче информации о новой лицензии указывать идентификатор не нужно.  Идентификатор лицензии присваивается Маркетом. Не путайте его с номером, указанным на лицензии: он передается в параметре `number`. 
  , outletLicenseDTOOutletId :: Maybe Int64 -- ^ Идентификатор точки продаж, для которой действительна лицензия.
  , outletLicenseDTOLicenseType :: Maybe LicenseType -- ^ 
  , outletLicenseDTONumber :: Maybe Text -- ^ Номер лицензии.
  , outletLicenseDTODateOfIssue :: Maybe UTCTime -- ^ Дата выдачи лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если лицензия для точки продаж в Москве выдана 13 ноября 2017 года, то параметр должен иметь значение `2017-11-13T00:00:00+03:00`.  Обязательный параметр.  Не может быть позже даты окончания срока действия, указанной в параметре `dateOfExpiry`. 
  , outletLicenseDTODateOfExpiry :: Maybe UTCTime -- ^ Дата окончания действия лицензии.  Формат даты: ISO 8601 со смещением относительно UTC. Нужно передать дату, указанную на лицензии, время `00:00:00` и часовой пояс, соответствующий региону точки продаж. Например, если действие лицензии для точки продаж в Москве заканчивается 20 ноября 2022 года, то параметр должен иметь значение `2022-11-20T00:00:00+03:00`.  Обязательный параметр.  Не может быть раньше даты выдачи, указанной в параметре `dateOfIssue`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletLicenseDTO where
  parseJSON = genericParseJSON optionsOutletLicenseDTO
instance ToJSON OutletLicenseDTO where
  toJSON = genericToJSON optionsOutletLicenseDTO

optionsOutletLicenseDTO :: Options
optionsOutletLicenseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletLicenseDTOId", "id")
      , ("outletLicenseDTOOutletId", "outletId")
      , ("outletLicenseDTOLicenseType", "licenseType")
      , ("outletLicenseDTONumber", "number")
      , ("outletLicenseDTODateOfIssue", "dateOfIssue")
      , ("outletLicenseDTODateOfExpiry", "dateOfExpiry")
      ]


-- | Ответ на запрос информации о лицензиях для точек продаж.
data OutletLicensesResponseDTO = OutletLicensesResponseDTO
  { outletLicensesResponseDTOLicenses :: [FullOutletLicenseDTO] -- ^ Список лицензий.
  } deriving (Show, Eq, Generic)

instance FromJSON OutletLicensesResponseDTO where
  parseJSON = genericParseJSON optionsOutletLicensesResponseDTO
instance ToJSON OutletLicensesResponseDTO where
  toJSON = genericToJSON optionsOutletLicensesResponseDTO

optionsOutletLicensesResponseDTO :: Options
optionsOutletLicensesResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletLicensesResponseDTOLicenses", "licenses")
      ]


-- | Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
data OutletResponseDTO = OutletResponseDTO
  { outletResponseDTOId :: Maybe Int64 -- ^ Идентификатор точки продаж, присвоенный Маркетом.
  } deriving (Show, Eq, Generic)

instance FromJSON OutletResponseDTO where
  parseJSON = genericParseJSON optionsOutletResponseDTO
instance ToJSON OutletResponseDTO where
  toJSON = genericToJSON optionsOutletResponseDTO

optionsOutletResponseDTO :: Options
optionsOutletResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletResponseDTOId", "id")
      ]


-- | Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
data OutletStatusType = OutletStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletStatusType where
  parseJSON = genericParseJSON optionsOutletStatusType
instance ToJSON OutletStatusType where
  toJSON = genericToJSON optionsOutletStatusType

optionsOutletStatusType :: Options
optionsOutletStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип точки продаж.  Возможные значения:  * &#x60;DEPOT&#x60; — пункт выдачи заказов. * &#x60;MIXED&#x60; — смешанный тип точки продаж (торговый зал и пункт выдачи заказов). * &#x60;RETAIL&#x60; — розничная точка продаж (торговый зал). 
data OutletType = OutletType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletType where
  parseJSON = genericParseJSON optionsOutletType
instance ToJSON OutletType where
  toJSON = genericToJSON optionsOutletType

optionsOutletType :: Options
optionsOutletType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Состояние точки продаж.  Возможные значения:  * &#x60;HIDDEN&#x60; — точка продаж выключена. * &#x60;VISIBLE&#x60; — точка продаж включена. 
data OutletVisibilityType = OutletVisibilityType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletVisibilityType where
  parseJSON = genericParseJSON optionsOutletVisibilityType
instance ToJSON OutletVisibilityType where
  toJSON = genericToJSON optionsOutletVisibilityType

optionsOutletVisibilityType :: Options
optionsOutletVisibilityType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список режимов работы точки продаж. 
data OutletWorkingScheduleDTO = OutletWorkingScheduleDTO
  { outletWorkingScheduleDTOWorkInHoliday :: Maybe Bool -- ^ Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
  , outletWorkingScheduleDTOScheduleItems :: [OutletWorkingScheduleItemDTO] -- ^ Список расписаний работы точки продаж. 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletWorkingScheduleDTO where
  parseJSON = genericParseJSON optionsOutletWorkingScheduleDTO
instance ToJSON OutletWorkingScheduleDTO where
  toJSON = genericToJSON optionsOutletWorkingScheduleDTO

optionsOutletWorkingScheduleDTO :: Options
optionsOutletWorkingScheduleDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletWorkingScheduleDTOWorkInHoliday", "workInHoliday")
      , ("outletWorkingScheduleDTOScheduleItems", "scheduleItems")
      ]


-- | Расписание работы точки продаж.
data OutletWorkingScheduleItemDTO = OutletWorkingScheduleItemDTO
  { outletWorkingScheduleItemDTOStartDay :: DayOfWeekType -- ^ 
  , outletWorkingScheduleItemDTOEndDay :: DayOfWeekType -- ^ 
  , outletWorkingScheduleItemDTOStartTime :: Text -- ^ Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  , outletWorkingScheduleItemDTOEndTime :: Text -- ^ Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
  } deriving (Show, Eq, Generic)

instance FromJSON OutletWorkingScheduleItemDTO where
  parseJSON = genericParseJSON optionsOutletWorkingScheduleItemDTO
instance ToJSON OutletWorkingScheduleItemDTO where
  toJSON = genericToJSON optionsOutletWorkingScheduleItemDTO

optionsOutletWorkingScheduleItemDTO :: Options
optionsOutletWorkingScheduleItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("outletWorkingScheduleItemDTOStartDay", "startDay")
      , ("outletWorkingScheduleItemDTOEndDay", "endDay")
      , ("outletWorkingScheduleItemDTOStartTime", "startTime")
      , ("outletWorkingScheduleItemDTOEndTime", "endTime")
      ]


-- | Размещение ярлыков на странице: * &#x60;A7&#x60; — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * &#x60;A4&#x60; — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
data PageFormatType = PageFormatType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PageFormatType where
  parseJSON = genericParseJSON optionsPageFormatType
instance ToJSON PageFormatType where
  toJSON = genericToJSON optionsPageFormatType

optionsPageFormatType :: Options
optionsPageFormatType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Возвраты.
data PagedReturnsDTO = PagedReturnsDTO
  { pagedReturnsDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  , pagedReturnsDTOReturns :: [ReturnDTO] -- ^ Список возвратов.
  } deriving (Show, Eq, Generic)

instance FromJSON PagedReturnsDTO where
  parseJSON = genericParseJSON optionsPagedReturnsDTO
instance ToJSON PagedReturnsDTO where
  toJSON = genericToJSON optionsPagedReturnsDTO

optionsPagedReturnsDTO :: Options
optionsPagedReturnsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pagedReturnsDTOPaging", "paging")
      , ("pagedReturnsDTOReturns", "returns")
      ]


-- | Количество палет в отгрузке.
data PalletsCountDTO = PalletsCountDTO
  { palletsCountDTOPlanned :: Maybe Int -- ^ Количество палет, которое заявил продавец.
  , palletsCountDTOFact :: Maybe Int -- ^ Количество палет, которое приняли в сортировочном центре.
  } deriving (Show, Eq, Generic)

instance FromJSON PalletsCountDTO where
  parseJSON = genericParseJSON optionsPalletsCountDTO
instance ToJSON PalletsCountDTO where
  toJSON = genericToJSON optionsPalletsCountDTO

optionsPalletsCountDTO :: Options
optionsPalletsCountDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("palletsCountDTOPlanned", "planned")
      , ("palletsCountDTOFact", "fact")
      ]


-- | Тип данных:  * &#x60;TEXT&#x60; — текст. * &#x60;ENUM&#x60; — список возможных значений. * &#x60;BOOLEAN&#x60; — &#x60;true&#x60; или &#x60;false&#x60;. * &#x60;NUMERIC&#x60; — число. 
data ParameterType = ParameterType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ParameterType where
  parseJSON = genericParseJSON optionsParameterType
instance ToJSON ParameterType where
  toJSON = genericToJSON optionsParameterType

optionsParameterType :: Options
optionsParameterType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Ограничения на значения характеристик.
data ParameterValueConstraintsDTO = ParameterValueConstraintsDTO
  { parameterValueConstraintsDTOMinValue :: Maybe Double -- ^ Минимальное число.
  , parameterValueConstraintsDTOMaxValue :: Maybe Double -- ^ Максимальное число.
  , parameterValueConstraintsDTOMaxLength :: Maybe Int -- ^ Максимальная длина текста.
  } deriving (Show, Eq, Generic)

instance FromJSON ParameterValueConstraintsDTO where
  parseJSON = genericParseJSON optionsParameterValueConstraintsDTO
instance ToJSON ParameterValueConstraintsDTO where
  toJSON = genericToJSON optionsParameterValueConstraintsDTO

optionsParameterValueConstraintsDTO :: Options
optionsParameterValueConstraintsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parameterValueConstraintsDTOMinValue", "minValue")
      , ("parameterValueConstraintsDTOMaxValue", "maxValue")
      , ("parameterValueConstraintsDTOMaxLength", "maxLength")
      ]


-- | Значение характеристики.  Вы можете указывать несколько значений одной характеристики при условии, что:  * Тип характеристики — &#x60;ENUM&#x60;. * В ответе на запрос [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md) у данной характеристики поле &#x60;multivalue&#x60; имеет значение &#x60;true&#x60;.  Для этого в &#x60;parameterValues&#x60; передавайте каждое значение отдельно — несколько объектов с параметрами &#x60;parameterId&#x60;, &#x60;valueId&#x60; и &#x60;value&#x60;. Параметр &#x60;parameterId&#x60; должен быть одинаковым. 
data ParameterValueDTO = ParameterValueDTO
  { parameterValueDTOParameterId :: Int64 -- ^ Идентификатор характеристики.
  , parameterValueDTOUnitId :: Maybe Int64 -- ^ Идентификатор единицы измерения. Если вы не передали параметр `unitId`, используется единица измерения по умолчанию.
  , parameterValueDTOValueId :: Maybe Int64 -- ^ Идентификатор значения.  Обязательно указывайте идентификатор, если передаете значение из перечня допустимых значений, полученного от Маркета.  Только для характеристик типа `ENUM`. 
  , parameterValueDTOValue :: Maybe Text -- ^ Значение.
  } deriving (Show, Eq, Generic)

instance FromJSON ParameterValueDTO where
  parseJSON = genericParseJSON optionsParameterValueDTO
instance ToJSON ParameterValueDTO where
  toJSON = genericToJSON optionsParameterValueDTO

optionsParameterValueDTO :: Options
optionsParameterValueDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parameterValueDTOParameterId", "parameterId")
      , ("parameterValueDTOUnitId", "unitId")
      , ("parameterValueDTOValueId", "valueId")
      , ("parameterValueDTOValue", "value")
      ]


-- | Значение характеристики.
data ParameterValueOptionDTO = ParameterValueOptionDTO
  { parameterValueOptionDTOId :: Int64 -- ^ Идентификатор значения.
  , parameterValueOptionDTOValue :: Text -- ^ Значение.
  , parameterValueOptionDTODescription :: Maybe Text -- ^ Описание значения.
  } deriving (Show, Eq, Generic)

instance FromJSON ParameterValueOptionDTO where
  parseJSON = genericParseJSON optionsParameterValueOptionDTO
instance ToJSON ParameterValueOptionDTO where
  toJSON = genericToJSON optionsParameterValueOptionDTO

optionsParameterValueOptionDTO :: Options
optionsParameterValueOptionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parameterValueOptionDTOId", "id")
      , ("parameterValueOptionDTOValue", "value")
      , ("parameterValueOptionDTODescription", "description")
      ]


-- | Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
data ParcelBoxDTO = ParcelBoxDTO
  { parcelBoxDTOId :: Maybe Int64 -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  , parcelBoxDTOFulfilmentId :: Maybe Text -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  } deriving (Show, Eq, Generic)

instance FromJSON ParcelBoxDTO where
  parseJSON = genericParseJSON optionsParcelBoxDTO
instance ToJSON ParcelBoxDTO where
  toJSON = genericToJSON optionsParcelBoxDTO

optionsParcelBoxDTO :: Options
optionsParcelBoxDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parcelBoxDTOId", "id")
      , ("parcelBoxDTOFulfilmentId", "fulfilmentId")
      ]


-- | Информация о ярлыке для коробки.
data ParcelBoxLabelDTO = ParcelBoxLabelDTO
  { parcelBoxLabelDTOUrl :: Text -- ^ Соответствует URL, по которому выполняется запрос [GET campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label](../../reference/orders/generateOrderLabel.md). 
  , parcelBoxLabelDTOSupplierName :: Text -- ^ Юридическое название магазина.
  , parcelBoxLabelDTODeliveryServiceName :: Text -- ^ Юридическое название службы доставки.
  , parcelBoxLabelDTOOrderId :: Int64 -- ^ Идентификатор заказа в системе Маркета.
  , parcelBoxLabelDTOOrderNum :: Text -- ^ Идентификатор заказа в информационной системе магазина.  Совпадает с `orderId`, если Маркету неизвестен номер заказа в системе магазина. 
  , parcelBoxLabelDTORecipientName :: Text -- ^ Фамилия и инициалы получателя заказа.
  , parcelBoxLabelDTOBoxId :: Int64 -- ^ Идентификатор коробки.
  , parcelBoxLabelDTOFulfilmentId :: Text -- ^ Идентификатор коробки в информационной системе магазина.  Возвращается в формате: `номер заказа на Маркете-номер коробки`. Например, `7206821‑1`, `7206821‑2` и т. д. 
  , parcelBoxLabelDTOPlace :: Text -- ^ Номер коробки в заказе. Возвращается в формате: `номер места/общее количество мест`. 
  , parcelBoxLabelDTOWeight :: Text -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Общая масса всех товаров в заказе. Возвращается в формате: `weight кг`. 
  , parcelBoxLabelDTODeliveryServiceId :: Text -- ^ Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  , parcelBoxLabelDTODeliveryAddress :: Maybe Text -- ^ Адрес получателя.
  , parcelBoxLabelDTOShipmentDate :: Maybe Text -- ^ Дата отгрузки в формате `dd.MM.yyyy`.
  } deriving (Show, Eq, Generic)

instance FromJSON ParcelBoxLabelDTO where
  parseJSON = genericParseJSON optionsParcelBoxLabelDTO
instance ToJSON ParcelBoxLabelDTO where
  toJSON = genericToJSON optionsParcelBoxLabelDTO

optionsParcelBoxLabelDTO :: Options
optionsParcelBoxLabelDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parcelBoxLabelDTOUrl", "url")
      , ("parcelBoxLabelDTOSupplierName", "supplierName")
      , ("parcelBoxLabelDTODeliveryServiceName", "deliveryServiceName")
      , ("parcelBoxLabelDTOOrderId", "orderId")
      , ("parcelBoxLabelDTOOrderNum", "orderNum")
      , ("parcelBoxLabelDTORecipientName", "recipientName")
      , ("parcelBoxLabelDTOBoxId", "boxId")
      , ("parcelBoxLabelDTOFulfilmentId", "fulfilmentId")
      , ("parcelBoxLabelDTOPlace", "place")
      , ("parcelBoxLabelDTOWeight", "weight")
      , ("parcelBoxLabelDTODeliveryServiceId", "deliveryServiceId")
      , ("parcelBoxLabelDTODeliveryAddress", "deliveryAddress")
      , ("parcelBoxLabelDTOShipmentDate", "shipmentDate")
      ]


-- | Информация о грузовых местах в заказе.
data ParcelDTO = ParcelDTO
  { parcelDTOBoxes :: [ParcelBoxDTO] -- ^ Список грузовых мест. Маркет определяет количество мест по длине этого списка.
  } deriving (Show, Eq, Generic)

instance FromJSON ParcelDTO where
  parseJSON = genericParseJSON optionsParcelDTO
instance ToJSON ParcelDTO where
  toJSON = genericToJSON optionsParcelDTO

optionsParcelDTO :: Options
optionsParcelDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("parcelDTOBoxes", "boxes")
      ]


-- | Данные о складе отправления.
data PartnerShipmentWarehouseDTO = PartnerShipmentWarehouseDTO
  { partnerShipmentWarehouseDTOId :: Maybe Int64 -- ^ Идентификатор склада отправления.
  , partnerShipmentWarehouseDTOName :: Maybe Text -- ^ Наименование склада отправления.
  , partnerShipmentWarehouseDTOAddress :: Maybe Text -- ^ Адрес склада отправления.
  } deriving (Show, Eq, Generic)

instance FromJSON PartnerShipmentWarehouseDTO where
  parseJSON = genericParseJSON optionsPartnerShipmentWarehouseDTO
instance ToJSON PartnerShipmentWarehouseDTO where
  toJSON = genericToJSON optionsPartnerShipmentWarehouseDTO

optionsPartnerShipmentWarehouseDTO :: Options
optionsPartnerShipmentWarehouseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("partnerShipmentWarehouseDTOId", "id")
      , ("partnerShipmentWarehouseDTOName", "name")
      , ("partnerShipmentWarehouseDTOAddress", "address")
      ]


-- | Частота выплат:  * &#x60;DAILY&#x60; — ежедневно. * &#x60;WEEKLY&#x60; — раз в неделю. * &#x60;BIWEEKLY&#x60; — раз в две недели. * &#x60;MONTHLY&#x60; — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
data PaymentFrequencyType = PaymentFrequencyType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PaymentFrequencyType where
  parseJSON = genericParseJSON optionsPaymentFrequencyType
instance ToJSON PaymentFrequencyType where
  toJSON = genericToJSON optionsPaymentFrequencyType

optionsPaymentFrequencyType :: Options
optionsPaymentFrequencyType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Адрес доставки.
data PickupAddressDTO = PickupAddressDTO
  { pickupAddressDTOCountry :: Maybe Text -- ^ Страна.
  , pickupAddressDTOCity :: Maybe Text -- ^ Город.
  , pickupAddressDTOStreet :: Maybe Text -- ^ Улица.
  , pickupAddressDTOHouse :: Maybe Text -- ^ Номер дома.
  , pickupAddressDTOPostcode :: Maybe Text -- ^ Почтовый индекс.
  } deriving (Show, Eq, Generic)

instance FromJSON PickupAddressDTO where
  parseJSON = genericParseJSON optionsPickupAddressDTO
instance ToJSON PickupAddressDTO where
  toJSON = genericToJSON optionsPickupAddressDTO

optionsPickupAddressDTO :: Options
optionsPickupAddressDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("pickupAddressDTOCountry", "country")
      , ("pickupAddressDTOCity", "city")
      , ("pickupAddressDTOStreet", "street")
      , ("pickupAddressDTOHouse", "house")
      , ("pickupAddressDTOPostcode", "postcode")
      ]


-- | Модель, по которой работает магазин:  * &#x60;FBS&#x60; — FBS или Экспресс. * &#x60;FBY&#x60; — FBY. * &#x60;DBS&#x60; — DBS. 
data PlacementType = PlacementType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PlacementType where
  parseJSON = genericParseJSON optionsPlacementType
instance ToJSON PlacementType where
  toJSON = genericToJSON optionsPlacementType

optionsPlacementType :: Options
optionsPlacementType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Максимальные значения цены, при которых она является привлекательной или умеренной.
data PriceCompetitivenessThresholdsDTO = PriceCompetitivenessThresholdsDTO
  { priceCompetitivenessThresholdsDTOOptimalPrice :: Maybe BasePriceDTO -- ^ 
  , priceCompetitivenessThresholdsDTOAveragePrice :: Maybe BasePriceDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceCompetitivenessThresholdsDTO where
  parseJSON = genericParseJSON optionsPriceCompetitivenessThresholdsDTO
instance ToJSON PriceCompetitivenessThresholdsDTO where
  toJSON = genericToJSON optionsPriceCompetitivenessThresholdsDTO

optionsPriceCompetitivenessThresholdsDTO :: Options
optionsPriceCompetitivenessThresholdsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceCompetitivenessThresholdsDTOOptimalPrice", "optimalPrice")
      , ("priceCompetitivenessThresholdsDTOAveragePrice", "averagePrice")
      ]


-- | Привлекательность цены:  * &#x60;OPTIMAL&#x60; — привлекательная. * &#x60;AVERAGE&#x60; — умеренная. * &#x60;LOW&#x60; — непривлекательная. 
data PriceCompetitivenessType = PriceCompetitivenessType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceCompetitivenessType where
  parseJSON = genericParseJSON optionsPriceCompetitivenessType
instance ToJSON PriceCompetitivenessType where
  toJSON = genericToJSON optionsPriceCompetitivenessType

optionsPriceCompetitivenessType :: Options
optionsPriceCompetitivenessType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Цена с указанием скидки, валюты и времени последнего обновления.
data PriceDTO = PriceDTO
  { priceDTOValue :: Maybe Double -- ^ Цена на товар.
  , priceDTODiscountBase :: Maybe Double -- ^ Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  , priceDTOCurrencyId :: Maybe CurrencyType -- ^ 
  , priceDTOVat :: Maybe Int -- ^ Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceDTO where
  parseJSON = genericParseJSON optionsPriceDTO
instance ToJSON PriceDTO where
  toJSON = genericToJSON optionsPriceDTO

optionsPriceDTO :: Options
optionsPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceDTOValue", "value")
      , ("priceDTODiscountBase", "discountBase")
      , ("priceDTOCurrencyId", "currencyId")
      , ("priceDTOVat", "vat")
      ]


-- | Причина попадания товара в карантин.
data PriceQuarantineVerdictDTO = PriceQuarantineVerdictDTO
  { priceQuarantineVerdictDTOType :: Maybe PriceQuarantineVerdictType -- ^ 
  , priceQuarantineVerdictDTOParams :: [PriceQuarantineVerdictParameterDTO] -- ^ Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.
  } deriving (Show, Eq, Generic)

instance FromJSON PriceQuarantineVerdictDTO where
  parseJSON = genericParseJSON optionsPriceQuarantineVerdictDTO
instance ToJSON PriceQuarantineVerdictDTO where
  toJSON = genericToJSON optionsPriceQuarantineVerdictDTO

optionsPriceQuarantineVerdictDTO :: Options
optionsPriceQuarantineVerdictDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceQuarantineVerdictDTOType", "type")
      , ("priceQuarantineVerdictDTOParams", "params")
      ]


-- | Имя параметра причины скрытия товара по цене.  * &#x60;CURRENT_PRICE&#x60; — цена, из-за которой товар попал в карантин. * &#x60;LAST_VALID_PRICE&#x60; — последняя цена до попадания в карантин (только для карантина типа &#x60;PRICE_CHANGE&#x60;). * &#x60;MIN_PRICE&#x60; — порог попадания в карантин (только для карантина типов &#x60;LOW_PRICE&#x60; и &#x60;LOW_PRICE_PROMO&#x60;). * &#x60;CURRENCY&#x60; — валюта. 
data PriceQuarantineVerdictParamNameType = PriceQuarantineVerdictParamNameType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceQuarantineVerdictParamNameType where
  parseJSON = genericParseJSON optionsPriceQuarantineVerdictParamNameType
instance ToJSON PriceQuarantineVerdictParamNameType where
  toJSON = genericToJSON optionsPriceQuarantineVerdictParamNameType

optionsPriceQuarantineVerdictParamNameType :: Options
optionsPriceQuarantineVerdictParamNameType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Параметр карантина.
data PriceQuarantineVerdictParameterDTO = PriceQuarantineVerdictParameterDTO
  { priceQuarantineVerdictParameterDTOName :: PriceQuarantineVerdictParamNameType -- ^ 
  , priceQuarantineVerdictParameterDTOValue :: Text -- ^ Значение параметра.
  } deriving (Show, Eq, Generic)

instance FromJSON PriceQuarantineVerdictParameterDTO where
  parseJSON = genericParseJSON optionsPriceQuarantineVerdictParameterDTO
instance ToJSON PriceQuarantineVerdictParameterDTO where
  toJSON = genericToJSON optionsPriceQuarantineVerdictParameterDTO

optionsPriceQuarantineVerdictParameterDTO :: Options
optionsPriceQuarantineVerdictParameterDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceQuarantineVerdictParameterDTOName", "name")
      , ("priceQuarantineVerdictParameterDTOValue", "value")
      ]


-- | Типы карантина:  * &#x60;PRICE_CHANGE&#x60; — новая цена слишком сильно отличается от прежней. В поле &#x60;params&#x60; будет  новая цена &#x60;CURRENT_PRICE&#x60; и последняя цена до попадания в карантин &#x60;LAST_VALID_PRICE&#x60;. * &#x60;LOW_PRICE&#x60; — установленная цена слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет установленная вами цена &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;. * &#x60;LOW_PRICE_PROMO&#x60; — цена после применения акций слишком сильно отличается от рыночной. В поле &#x60;params&#x60; будет цена после применения акций &#x60;CURRENT_PRICE&#x60; и порог попадания в карантин &#x60;MIN_PRICE&#x60;. 
data PriceQuarantineVerdictType = PriceQuarantineVerdictType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceQuarantineVerdictType where
  parseJSON = genericParseJSON optionsPriceQuarantineVerdictType
instance ToJSON PriceQuarantineVerdictType where
  toJSON = genericToJSON optionsPriceQuarantineVerdictType

optionsPriceQuarantineVerdictType :: Options
optionsPriceQuarantineVerdictType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Рекомендованная цена.
data PriceRecommendationItemDTO = PriceRecommendationItemDTO
  { priceRecommendationItemDTOCampaignId :: Int64 -- ^ Идентификатор кампании.
  , priceRecommendationItemDTOPrice :: Double -- ^ Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceRecommendationItemDTO where
  parseJSON = genericParseJSON optionsPriceRecommendationItemDTO
instance ToJSON PriceRecommendationItemDTO where
  toJSON = genericToJSON optionsPriceRecommendationItemDTO

optionsPriceRecommendationItemDTO :: Options
optionsPriceRecommendationItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceRecommendationItemDTOCampaignId", "campaignId")
      , ("priceRecommendationItemDTOPrice", "price")
      ]


-- | Тип цены.
data PriceSuggestDTO = PriceSuggestDTO
  { priceSuggestDTOType :: Maybe PriceSuggestType -- ^ 
  , priceSuggestDTOPrice :: Maybe Double -- ^ Цена в рублях.
  } deriving (Show, Eq, Generic)

instance FromJSON PriceSuggestDTO where
  parseJSON = genericParseJSON optionsPriceSuggestDTO
instance ToJSON PriceSuggestDTO where
  toJSON = genericToJSON optionsPriceSuggestDTO

optionsPriceSuggestDTO :: Options
optionsPriceSuggestDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceSuggestDTOType", "type")
      , ("priceSuggestDTOPrice", "price")
      ]


-- | Товар с ценами для продвижения.
data PriceSuggestOfferDTO = PriceSuggestOfferDTO
  { priceSuggestOfferDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , priceSuggestOfferDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , priceSuggestOfferDTOPriceSuggestion :: Maybe [PriceSuggestDTO] -- ^ Цены для продвижения. 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceSuggestOfferDTO where
  parseJSON = genericParseJSON optionsPriceSuggestOfferDTO
instance ToJSON PriceSuggestOfferDTO where
  toJSON = genericToJSON optionsPriceSuggestOfferDTO

optionsPriceSuggestOfferDTO :: Options
optionsPriceSuggestOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("priceSuggestOfferDTOMarketSku", "marketSku")
      , ("priceSuggestOfferDTOOfferId", "offerId")
      , ("priceSuggestOfferDTOPriceSuggestion", "priceSuggestion")
      ]


-- | Тип цены:  * &#x60;BUYBOX&#x60; — самая низкая цена на товар, по которой он продается сейчас. Эта цена обновляется в режиме реального времени. Если вы установите цену ниже, начнет показываться ваше предложение. Если для этого значения в параметре &#x60;price&#x60; указана цена, которая совпадает с вашей, значит, ваш товар уже показывается на витрине. Если кроме вас этот товар продают другие продавцы по такой же цене, их предложения также будут отображаться вместе с вашими по очереди. * &#x60;DEFAULT_OFFER&#x60; — рекомендованная Маркетом цена, которая привлекает покупателей. Рассчитывается только для популярных на сервисе товаров и обновляется раз в четыре часа. * &#x60;MIN_PRICE_MARKET&#x60; — минимальная цена на Маркете. Самая низкая цена среди всех предложений товара на Маркете во всех регионах, включая те, которые не видны на витрине. Эта цена обновляется в режиме реального времени и обеспечивает большее количество показов на Маркете, чем самая низкая или рекомендованная цена. 
data PriceSuggestType = PriceSuggestType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PriceSuggestType where
  parseJSON = genericParseJSON optionsPriceSuggestType
instance ToJSON PriceSuggestType where
  toJSON = genericToJSON optionsPriceSuggestType

optionsPriceSuggestType :: Options
optionsPriceSuggestType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
data PromoOfferAutoParticipatingDetailsDTO = PromoOfferAutoParticipatingDetailsDTO
  { promoOfferAutoParticipatingDetailsDTOCampaignIds :: Maybe [Int64] -- ^ Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferAutoParticipatingDetailsDTO where
  parseJSON = genericParseJSON optionsPromoOfferAutoParticipatingDetailsDTO
instance ToJSON PromoOfferAutoParticipatingDetailsDTO where
  toJSON = genericToJSON optionsPromoOfferAutoParticipatingDetailsDTO

optionsPromoOfferAutoParticipatingDetailsDTO :: Options
optionsPromoOfferAutoParticipatingDetailsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoOfferAutoParticipatingDetailsDTOCampaignIds", "campaignIds")
      ]


-- | Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.
data PromoOfferDiscountParamsDTO = PromoOfferDiscountParamsDTO
  { promoOfferDiscountParamsDTOPrice :: Maybe Int64 -- ^ Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  , promoOfferDiscountParamsDTOPromoPrice :: Maybe Int64 -- ^ Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
  , promoOfferDiscountParamsDTOMaxPromoPrice :: Int64 -- ^ Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferDiscountParamsDTO where
  parseJSON = genericParseJSON optionsPromoOfferDiscountParamsDTO
instance ToJSON PromoOfferDiscountParamsDTO where
  toJSON = genericToJSON optionsPromoOfferDiscountParamsDTO

optionsPromoOfferDiscountParamsDTO :: Options
optionsPromoOfferDiscountParamsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoOfferDiscountParamsDTOPrice", "price")
      , ("promoOfferDiscountParamsDTOPromoPrice", "promoPrice")
      , ("promoOfferDiscountParamsDTOMaxPromoPrice", "maxPromoPrice")
      ]


-- | Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
data PromoOfferParamsDTO = PromoOfferParamsDTO
  { promoOfferParamsDTODiscountParams :: Maybe PromoOfferDiscountParamsDTO -- ^ 
  , promoOfferParamsDTOPromocodeParams :: Maybe PromoOfferPromocodeParamsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferParamsDTO where
  parseJSON = genericParseJSON optionsPromoOfferParamsDTO
instance ToJSON PromoOfferParamsDTO where
  toJSON = genericToJSON optionsPromoOfferParamsDTO

optionsPromoOfferParamsDTO :: Options
optionsPromoOfferParamsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoOfferParamsDTODiscountParams", "discountParams")
      , ("promoOfferParamsDTOPromocodeParams", "promocodeParams")
      ]


-- | Фильтр для товаров, которые добавлены в акцию вручную:  * &#x60;MANUALLY_ADDED&#x60; — товары, которые добавлены вручную.  * &#x60;NOT_MANUALLY_ADDED&#x60;— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр &#x60;statusType&#x60;, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
data PromoOfferParticipationStatusFilterType = PromoOfferParticipationStatusFilterType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferParticipationStatusFilterType where
  parseJSON = genericParseJSON optionsPromoOfferParticipationStatusFilterType
instance ToJSON PromoOfferParticipationStatusFilterType where
  toJSON = genericToJSON optionsPromoOfferParticipationStatusFilterType

optionsPromoOfferParticipationStatusFilterType :: Options
optionsPromoOfferParticipationStatusFilterType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус товара в акции:  * &#x60;AUTO&#x60; — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * &#x60;PARTIALLY_AUTO&#x60; — добавлен автоматически у части магазинов.  * &#x60;MANUAL&#x60; — добавлен вручную.  * &#x60;NOT_PARTICIPATING&#x60; — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
data PromoOfferParticipationStatusType = PromoOfferParticipationStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferParticipationStatusType where
  parseJSON = genericParseJSON optionsPromoOfferParticipationStatusType
instance ToJSON PromoOfferParticipationStatusType where
  toJSON = genericToJSON optionsPromoOfferParticipationStatusType

optionsPromoOfferParticipationStatusType :: Options
optionsPromoOfferParticipationStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
data PromoOfferPromocodeParamsDTO = PromoOfferPromocodeParamsDTO
  { promoOfferPromocodeParamsDTOMaxPrice :: Int64 -- ^ Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferPromocodeParamsDTO where
  parseJSON = genericParseJSON optionsPromoOfferPromocodeParamsDTO
instance ToJSON PromoOfferPromocodeParamsDTO where
  toJSON = genericToJSON optionsPromoOfferPromocodeParamsDTO

optionsPromoOfferPromocodeParamsDTO :: Options
optionsPromoOfferPromocodeParamsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoOfferPromocodeParamsDTOMaxPrice", "maxPrice")
      ]


-- | Предупреждение, которое появилось при добавлении товара:  * &#x60;DEEP_DISCOUNT_OFFER&#x60; — большая разница с ценой в каталоге. Проверьте, нет ли ошибки.  * &#x60;CATALOG_PRICE_IS_LOWER_THAN_PROMO&#x60; — [базовая цена](*basic-price) в кабинете ниже цены по акции. У товара в акции будет отображаться базовая цена.  * &#x60;SHOP_PRICES_ARE_LOWER_THAN_PROMO&#x60; — цена в отдельном магазине ниже цены по акции. У товара в акции будет отображаться цена в магазине. Для остальных магазинов будет действовать цена по акции.  * &#x60;PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE&#x60; — в отдельном магазине цена с учетом промокода выше максимально возможной цены. Товар не будет участвовать в акции.  * &#x60;SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар в отдельном магазине не подходит под условия акции. 
data PromoOfferUpdateWarningCodeType = PromoOfferUpdateWarningCodeType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferUpdateWarningCodeType where
  parseJSON = genericParseJSON optionsPromoOfferUpdateWarningCodeType
instance ToJSON PromoOfferUpdateWarningCodeType where
  toJSON = genericToJSON optionsPromoOfferUpdateWarningCodeType

optionsPromoOfferUpdateWarningCodeType :: Options
optionsPromoOfferUpdateWarningCodeType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
data PromoOfferUpdateWarningDTO = PromoOfferUpdateWarningDTO
  { promoOfferUpdateWarningDTOCode :: PromoOfferUpdateWarningCodeType -- ^ 
  , promoOfferUpdateWarningDTOCampaignIds :: Maybe [Int64] -- ^ Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoOfferUpdateWarningDTO where
  parseJSON = genericParseJSON optionsPromoOfferUpdateWarningDTO
instance ToJSON PromoOfferUpdateWarningDTO where
  toJSON = genericToJSON optionsPromoOfferUpdateWarningDTO

optionsPromoOfferUpdateWarningDTO :: Options
optionsPromoOfferUpdateWarningDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoOfferUpdateWarningDTOCode", "code")
      , ("promoOfferUpdateWarningDTOCampaignIds", "campaignIds")
      ]


-- | Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
data PromoParticipationType = PromoParticipationType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PromoParticipationType where
  parseJSON = genericParseJSON optionsPromoParticipationType
instance ToJSON PromoParticipationType where
  toJSON = genericToJSON optionsPromoParticipationType

optionsPromoParticipationType :: Options
optionsPromoParticipationType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Время проведения акции.
data PromoPeriodDTO = PromoPeriodDTO
  { promoPeriodDTODateTimeFrom :: UTCTime -- ^ Дата и время начала акции.
  , promoPeriodDTODateTimeTo :: UTCTime -- ^ Дата и время окончания акции.
  } deriving (Show, Eq, Generic)

instance FromJSON PromoPeriodDTO where
  parseJSON = genericParseJSON optionsPromoPeriodDTO
instance ToJSON PromoPeriodDTO where
  toJSON = genericToJSON optionsPromoPeriodDTO

optionsPromoPeriodDTO :: Options
optionsPromoPeriodDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("promoPeriodDTODateTimeFrom", "dateTimeFrom")
      , ("promoPeriodDTODateTimeTo", "dateTimeTo")
      ]


-- | Запрос на передачу ключей цифровых товаров.
data ProvideOrderDigitalCodesRequest = ProvideOrderDigitalCodesRequest
  { provideOrderDigitalCodesRequestItems :: [OrderDigitalItemDTO] -- ^ Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
  } deriving (Show, Eq, Generic)

instance FromJSON ProvideOrderDigitalCodesRequest where
  parseJSON = genericParseJSON optionsProvideOrderDigitalCodesRequest
instance ToJSON ProvideOrderDigitalCodesRequest where
  toJSON = genericToJSON optionsProvideOrderDigitalCodesRequest

optionsProvideOrderDigitalCodesRequest :: Options
optionsProvideOrderDigitalCodesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("provideOrderDigitalCodesRequestItems", "items")
      ]


-- | 
data ProvideOrderItemIdentifiersRequest = ProvideOrderItemIdentifiersRequest
  { provideOrderItemIdentifiersRequestItems :: [OrderItemInstanceModificationDTO] -- ^ Список позиций, требующих маркировки. 
  } deriving (Show, Eq, Generic)

instance FromJSON ProvideOrderItemIdentifiersRequest where
  parseJSON = genericParseJSON optionsProvideOrderItemIdentifiersRequest
instance ToJSON ProvideOrderItemIdentifiersRequest where
  toJSON = genericToJSON optionsProvideOrderItemIdentifiersRequest

optionsProvideOrderItemIdentifiersRequest :: Options
optionsProvideOrderItemIdentifiersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("provideOrderItemIdentifiersRequestItems", "items")
      ]


-- | 
data ProvideOrderItemIdentifiersResponse = ProvideOrderItemIdentifiersResponse
  { provideOrderItemIdentifiersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , provideOrderItemIdentifiersResponseResult :: Maybe OrderItemsModificationResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProvideOrderItemIdentifiersResponse where
  parseJSON = genericParseJSON optionsProvideOrderItemIdentifiersResponse
instance ToJSON ProvideOrderItemIdentifiersResponse where
  toJSON = genericToJSON optionsProvideOrderItemIdentifiersResponse

optionsProvideOrderItemIdentifiersResponse :: Options
optionsProvideOrderItemIdentifiersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("provideOrderItemIdentifiersResponseStatus", "status")
      , ("provideOrderItemIdentifiersResponseResult", "result")
      ]


-- | description.
data PutSkuBidsRequest = PutSkuBidsRequest
  { putSkuBidsRequestBids :: [SkuBidItemDTO] -- ^ Список товаров и ставки для продвижения, которые на них нужно установить.
  } deriving (Show, Eq, Generic)

instance FromJSON PutSkuBidsRequest where
  parseJSON = genericParseJSON optionsPutSkuBidsRequest
instance ToJSON PutSkuBidsRequest where
  toJSON = genericToJSON optionsPutSkuBidsRequest

optionsPutSkuBidsRequest :: Options
optionsPutSkuBidsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("putSkuBidsRequestBids", "bids")
      ]


-- | Информация о заказе, который повлиял на индекс качества.
data QualityRatingAffectedOrderDTO = QualityRatingAffectedOrderDTO
  { qualityRatingAffectedOrderDTOOrderId :: Int64 -- ^ Идентификатор заказа.
  , qualityRatingAffectedOrderDTODescription :: Text -- ^ Описание проблемы.
  , qualityRatingAffectedOrderDTOComponentType :: AffectedOrderQualityRatingComponentType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QualityRatingAffectedOrderDTO where
  parseJSON = genericParseJSON optionsQualityRatingAffectedOrderDTO
instance ToJSON QualityRatingAffectedOrderDTO where
  toJSON = genericToJSON optionsQualityRatingAffectedOrderDTO

optionsQualityRatingAffectedOrderDTO :: Options
optionsQualityRatingAffectedOrderDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("qualityRatingAffectedOrderDTOOrderId", "orderId")
      , ("qualityRatingAffectedOrderDTODescription", "description")
      , ("qualityRatingAffectedOrderDTOComponentType", "componentType")
      ]


-- | Составляющая индекса качества.
data QualityRatingComponentDTO = QualityRatingComponentDTO
  { qualityRatingComponentDTOValue :: Double -- ^ Значение составляющей в процентах.
  , qualityRatingComponentDTOComponentType :: QualityRatingComponentType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON QualityRatingComponentDTO where
  parseJSON = genericParseJSON optionsQualityRatingComponentDTO
instance ToJSON QualityRatingComponentDTO where
  toJSON = genericToJSON optionsQualityRatingComponentDTO

optionsQualityRatingComponentDTO :: Options
optionsQualityRatingComponentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("qualityRatingComponentDTOValue", "value")
      , ("qualityRatingComponentDTOComponentType", "componentType")
      ]


-- | Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов.  **Для модели FBY:** * &#x60;FBY_LATE_DELIVERY_RATE&#x60; — доля товаров, которые приехали на склад с опозданием. * &#x60;FBY_CANCELLATION_RATE&#x60; — доля отмененных или недоставленных товаров. * &#x60;FBY_DELIVERY_DIFF_RATE&#x60; — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * &#x60;FBY_LATE_EDITING_RATE&#x60; — доля товаров, которые поздно убрали из заявки. 
data QualityRatingComponentType = QualityRatingComponentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON QualityRatingComponentType where
  parseJSON = genericParseJSON optionsQualityRatingComponentType
instance ToJSON QualityRatingComponentType where
  toJSON = genericToJSON optionsQualityRatingComponentType

optionsQualityRatingComponentType :: Options
optionsQualityRatingComponentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация об индексе качества.
data QualityRatingDTO = QualityRatingDTO
  { qualityRatingDTORating :: Int64 -- ^ Значение индекса качества.
  , qualityRatingDTOCalculationDate :: Day -- ^ Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
  , qualityRatingDTOComponents :: [QualityRatingComponentDTO] -- ^ Составляющие индекса качества.
  } deriving (Show, Eq, Generic)

instance FromJSON QualityRatingDTO where
  parseJSON = genericParseJSON optionsQualityRatingDTO
instance ToJSON QualityRatingDTO where
  toJSON = genericToJSON optionsQualityRatingDTO

optionsQualityRatingDTO :: Options
optionsQualityRatingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("qualityRatingDTORating", "rating")
      , ("qualityRatingDTOCalculationDate", "calculationDate")
      , ("qualityRatingDTOComponents", "components")
      ]


-- | Информация о заказах, которые повлияли на индекс качества.
data QualityRatingDetailsDTO = QualityRatingDetailsDTO
  { qualityRatingDetailsDTOAffectedOrders :: [QualityRatingAffectedOrderDTO] -- ^ Список заказов, которые повлияли на индекс качества.
  } deriving (Show, Eq, Generic)

instance FromJSON QualityRatingDetailsDTO where
  parseJSON = genericParseJSON optionsQualityRatingDetailsDTO
instance ToJSON QualityRatingDetailsDTO where
  toJSON = genericToJSON optionsQualityRatingDetailsDTO

optionsQualityRatingDetailsDTO :: Options
optionsQualityRatingDetailsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("qualityRatingDetailsDTOAffectedOrders", "affectedOrders")
      ]


-- | Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
data QuantumDTO = QuantumDTO
  { quantumDTOMinQuantity :: Maybe Int -- ^ Минимальное количество единиц товара в заказе. Например, если указать 10, покупатель сможет добавить в корзину не меньше 10 единиц.  ⚠️ Если количество товара на складе меньше заданного, ограничение не сработает и покупатель сможет его заказать. 
  , quantumDTOStepQuantity :: Maybe Int -- ^ На сколько единиц покупатель сможет увеличить количество товара в корзине.  Например, если задать 5, покупатель сможет добавить к заказу только 5, 10, 15, ... единиц товара.  ⚠️ Если количество товара на складе не дотягивает до кванта, ограничение не сработает и покупатель сможет заказать количество, не кратное кванту. 
  } deriving (Show, Eq, Generic)

instance FromJSON QuantumDTO where
  parseJSON = genericParseJSON optionsQuantumDTO
instance ToJSON QuantumDTO where
  toJSON = genericToJSON optionsQuantumDTO

optionsQuantumDTO :: Options
optionsQuantumDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quantumDTOMinQuantity", "minQuantity")
      , ("quantumDTOStepQuantity", "stepQuantity")
      ]


-- | Товар в карантине.
data QuarantineOfferDTO = QuarantineOfferDTO
  { quarantineOfferDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , quarantineOfferDTOCurrentPrice :: Maybe BasePriceDTO -- ^ 
  , quarantineOfferDTOLastValidPrice :: Maybe BasePriceDTO -- ^ 
  , quarantineOfferDTOVerdicts :: Maybe [PriceQuarantineVerdictDTO] -- ^ Причины попадания товара в карантин.
  } deriving (Show, Eq, Generic)

instance FromJSON QuarantineOfferDTO where
  parseJSON = genericParseJSON optionsQuarantineOfferDTO
instance ToJSON QuarantineOfferDTO where
  toJSON = genericToJSON optionsQuarantineOfferDTO

optionsQuarantineOfferDTO :: Options
optionsQuarantineOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("quarantineOfferDTOOfferId", "offerId")
      , ("quarantineOfferDTOCurrentPrice", "currentPrice")
      , ("quarantineOfferDTOLastValidPrice", "lastValidPrice")
      , ("quarantineOfferDTOVerdicts", "verdicts")
      ]


-- | Способ возврата товара покупателем:  * &#x60;SHOP&#x60; — в точку возврата магазина.  * &#x60;DELIVERY_SERVICE&#x60; — отправить курьером.  * &#x60;POST&#x60; — почта. 
data RecipientType = RecipientType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RecipientType where
  parseJSON = genericParseJSON optionsRecipientType
instance ToJSON RecipientType where
  toJSON = genericToJSON optionsRecipientType

optionsRecipientType :: Options
optionsRecipientType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Cтатус возврата денег:  * &#x60;STARTED_BY_USER&#x60; — создан клиентом из личного кабинета.  * &#x60;REFUND_IN_PROGRESS&#x60; — ждет решение о возврате денег.  * &#x60;REFUNDED&#x60; — по возврату проведены все возвратные денежные транзакции.  * &#x60;FAILED&#x60; — невозможно провести возврат покупателю.  * &#x60;WAITING_FOR_DECISION&#x60; — ожидает решения.  * &#x60;DECISION_MADE&#x60; — по возврату принято решение.  * &#x60;REFUNDED_WITH_BONUSES&#x60; — возврат осуществлен баллами Плюса или промокодом.  * &#x60;REFUNDED_BY_SHOP&#x60; — магазин сделал самостоятельно возврат денег.  * &#x60;COMPLETE_WITHOUT_REFUND&#x60; — возврат денег не требуется.  * &#x60;CANCELLED&#x60; — возврат отменен. 
data RefundStatusType = RefundStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RefundStatusType where
  parseJSON = genericParseJSON optionsRefundStatusType
instance ToJSON RefundStatusType where
  toJSON = genericToJSON optionsRefundStatusType

optionsRefundStatusType :: Options
optionsRefundStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Регион доставки.
data RegionDTO = RegionDTO
  { regionDTOId :: Maybe Int64 -- ^ Идентификатор региона.
  , regionDTOName :: Text -- ^ Название региона.
  , regionDTOType :: RegionType -- ^ 
  , regionDTOParent :: Maybe RegionDTO -- ^ 
  , regionDTOChildren :: Maybe [RegionDTO] -- ^ Дочерние регионы.
  } deriving (Show, Eq, Generic)

instance FromJSON RegionDTO where
  parseJSON = genericParseJSON optionsRegionDTO
instance ToJSON RegionDTO where
  toJSON = genericToJSON optionsRegionDTO

optionsRegionDTO :: Options
optionsRegionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("regionDTOId", "id")
      , ("regionDTOName", "name")
      , ("regionDTOType", "type")
      , ("regionDTOParent", "parent")
      , ("regionDTOChildren", "children")
      ]


-- | Тип региона.  Возможные значения:  * &#x60;CITY_DISTRICT&#x60; — район города.  * &#x60;CITY&#x60; — крупный город.  * &#x60;CONTINENT&#x60; — континент.  * &#x60;COUNTRY_DISTRICT&#x60; — область.  * &#x60;COUNTRY&#x60; — страна.  * &#x60;REGION&#x60; — регион.  * &#x60;REPUBLIC_AREA&#x60; — район субъекта федерации.  * &#x60;REPUBLIC&#x60; — субъект федерации.  * &#x60;SUBWAY_STATION&#x60; — станция метро.  * &#x60;VILLAGE&#x60; — город.  * &#x60;OTHER&#x60; — неизвестный регион. 
data RegionType = RegionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RegionType where
  parseJSON = genericParseJSON optionsRegionType
instance ToJSON RegionType where
  toJSON = genericToJSON optionsRegionType

optionsRegionType :: Options
optionsRegionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Региональная информация.
data RegionalModelInfoDTO = RegionalModelInfoDTO
  { regionalModelInfoDTOCurrency :: Maybe CurrencyType -- ^ 
  , regionalModelInfoDTORegionId :: Maybe Int64 -- ^ Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  } deriving (Show, Eq, Generic)

instance FromJSON RegionalModelInfoDTO where
  parseJSON = genericParseJSON optionsRegionalModelInfoDTO
instance ToJSON RegionalModelInfoDTO where
  toJSON = genericToJSON optionsRegionalModelInfoDTO

optionsRegionalModelInfoDTO :: Options
optionsRegionalModelInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("regionalModelInfoDTOCurrency", "currency")
      , ("regionalModelInfoDTORegionId", "regionId")
      ]


-- | Информация о товаре и ошибки, которые появились при его удалении.
data RejectedPromoOfferDeleteDTO = RejectedPromoOfferDeleteDTO
  { rejectedPromoOfferDeleteDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , rejectedPromoOfferDeleteDTOReason :: RejectedPromoOfferDeleteReasonType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RejectedPromoOfferDeleteDTO where
  parseJSON = genericParseJSON optionsRejectedPromoOfferDeleteDTO
instance ToJSON RejectedPromoOfferDeleteDTO where
  toJSON = genericToJSON optionsRejectedPromoOfferDeleteDTO

optionsRejectedPromoOfferDeleteDTO :: Options
optionsRejectedPromoOfferDeleteDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("rejectedPromoOfferDeleteDTOOfferId", "offerId")
      , ("rejectedPromoOfferDeleteDTOReason", "reason")
      ]


-- | Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
data RejectedPromoOfferDeleteReasonType = RejectedPromoOfferDeleteReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RejectedPromoOfferDeleteReasonType where
  parseJSON = genericParseJSON optionsRejectedPromoOfferDeleteReasonType
instance ToJSON RejectedPromoOfferDeleteReasonType where
  toJSON = genericToJSON optionsRejectedPromoOfferDeleteReasonType

optionsRejectedPromoOfferDeleteReasonType :: Options
optionsRejectedPromoOfferDeleteReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Описание отклоненного изменения.
data RejectedPromoOfferUpdateDTO = RejectedPromoOfferUpdateDTO
  { rejectedPromoOfferUpdateDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , rejectedPromoOfferUpdateDTOReason :: RejectedPromoOfferUpdateReasonType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RejectedPromoOfferUpdateDTO where
  parseJSON = genericParseJSON optionsRejectedPromoOfferUpdateDTO
instance ToJSON RejectedPromoOfferUpdateDTO where
  toJSON = genericToJSON optionsRejectedPromoOfferUpdateDTO

optionsRejectedPromoOfferUpdateDTO :: Options
optionsRejectedPromoOfferUpdateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("rejectedPromoOfferUpdateDTOOfferId", "offerId")
      , ("rejectedPromoOfferUpdateDTOReason", "reason")
      ]


-- | Причина отклонения изменения:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU.  * &#x60;OFFER_DUPLICATION&#x60; — один и тот же товар передан несколько раз.  * &#x60;OFFER_NOT_ELIGIBLE_FOR_PROMO&#x60; — товар не подходит под условия акции.  * &#x60;OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED&#x60; — товар не добавлен в акцию по техническим причинам.  * &#x60;DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED&#x60; — истек срок добавления товаров в акцию.  * &#x60;EMPTY_OLD_PRICE&#x60; — не указана зачеркнутая цена.  * &#x60;EMPTY_PROMO_PRICE&#x60; — не указана цена по акции.  * &#x60;MAX_PROMO_PRICE_EXCEEDED&#x60; — цена по акции превышает максимально возможную цену для участия в акции.  * &#x60;PROMO_PRICE_BIGGER_THAN_MAX&#x60; — цена по акции больше 95% от зачеркнутой цены.  * &#x60;PROMO_PRICE_SMALLER_THAN_MIN&#x60; — цена по акции меньше 1% от зачеркнутой цены. 
data RejectedPromoOfferUpdateReasonType = RejectedPromoOfferUpdateReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RejectedPromoOfferUpdateReasonType where
  parseJSON = genericParseJSON optionsRejectedPromoOfferUpdateReasonType
instance ToJSON RejectedPromoOfferUpdateReasonType where
  toJSON = genericToJSON optionsRejectedPromoOfferUpdateReasonType

optionsRejectedPromoOfferUpdateReasonType :: Options
optionsRejectedPromoOfferUpdateReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Формат отчета:  * &#x60;FILE&#x60; — файл с электронной таблицей. * &#x60;CSV&#x60; — ZIP-архив с CSV-файлами на каждый лист отчета. 
data ReportFormatType = ReportFormatType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReportFormatType where
  parseJSON = genericParseJSON optionsReportFormatType
instance ToJSON ReportFormatType where
  toJSON = genericToJSON optionsReportFormatType

optionsReportFormatType :: Options
optionsReportFormatType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус генерации и ссылка на готовый отчет.
data ReportInfoDTO = ReportInfoDTO
  { reportInfoDTOStatus :: ReportStatusType -- ^ 
  , reportInfoDTOSubStatus :: Maybe ReportSubStatusType -- ^ 
  , reportInfoDTOGenerationRequestedAt :: UTCTime -- ^ Дата и время запроса на генерацию.
  , reportInfoDTOGenerationFinishedAt :: Maybe UTCTime -- ^ Дата и время завершения генерации.
  , reportInfoDTOFile :: Maybe Text -- ^ Ссылка на готовый отчет.
  , reportInfoDTOEstimatedGenerationTime :: Maybe Int64 -- ^ Ожидаемая продолжительность генерации в миллисекундах.
  } deriving (Show, Eq, Generic)

instance FromJSON ReportInfoDTO where
  parseJSON = genericParseJSON optionsReportInfoDTO
instance ToJSON ReportInfoDTO where
  toJSON = genericToJSON optionsReportInfoDTO

optionsReportInfoDTO :: Options
optionsReportInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("reportInfoDTOStatus", "status")
      , ("reportInfoDTOSubStatus", "subStatus")
      , ("reportInfoDTOGenerationRequestedAt", "generationRequestedAt")
      , ("reportInfoDTOGenerationFinishedAt", "generationFinishedAt")
      , ("reportInfoDTOFile", "file")
      , ("reportInfoDTOEstimatedGenerationTime", "estimatedGenerationTime")
      ]


-- | Статус генерации отчета:  * &#x60;PENDING&#x60; — отчет ожидает генерации. * &#x60;PROCESSING&#x60; — отчет генерируется. * &#x60;FAILED&#x60; — во время генерации произошла ошибка. * &#x60;DONE&#x60; — отчет готов. 
data ReportStatusType = ReportStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReportStatusType where
  parseJSON = genericParseJSON optionsReportStatusType
instance ToJSON ReportStatusType where
  toJSON = genericToJSON optionsReportStatusType

optionsReportStatusType :: Options
optionsReportStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
data ReportSubStatusType = ReportSubStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReportSubStatusType where
  parseJSON = genericParseJSON optionsReportSubStatusType
instance ToJSON ReportSubStatusType where
  toJSON = genericToJSON optionsReportSubStatusType

optionsReportSubStatusType :: Options
optionsReportSubStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Возврат заказа.
data ReturnDTO = ReturnDTO
  { returnDTOId :: Maybe Int64 -- ^ Идентификатор возврата.
  , returnDTOOrderId :: Maybe Int64 -- ^ Номер заказа.
  , returnDTOCreationDate :: Maybe UTCTime -- ^ Дата создания возврата клиентом.
  , returnDTOUpdateDate :: Maybe UTCTime -- ^ Дата обновления возврата.
  , returnDTORefundStatus :: Maybe RefundStatusType -- ^ 
  , returnDTOLogisticPickupPoint :: Maybe LogisticPickupPointDTO -- ^ 
  , returnDTOShipmentRecipientType :: Maybe RecipientType -- ^ 
  , returnDTOShipmentStatus :: Maybe ReturnShipmentStatusType -- ^ 
  , returnDTORefundAmount :: Maybe Int64 -- ^ Сумма возврата.
  , returnDTOItems :: [ReturnItemDTO] -- ^ Список товаров в возврате.
  , returnDTOReturnType :: Maybe ReturnType -- ^ 
  , returnDTOFastReturn :: Maybe Bool -- ^ Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnDTO where
  parseJSON = genericParseJSON optionsReturnDTO
instance ToJSON ReturnDTO where
  toJSON = genericToJSON optionsReturnDTO

optionsReturnDTO :: Options
optionsReturnDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("returnDTOId", "id")
      , ("returnDTOOrderId", "orderId")
      , ("returnDTOCreationDate", "creationDate")
      , ("returnDTOUpdateDate", "updateDate")
      , ("returnDTORefundStatus", "refundStatus")
      , ("returnDTOLogisticPickupPoint", "logisticPickupPoint")
      , ("returnDTOShipmentRecipientType", "shipmentRecipientType")
      , ("returnDTOShipmentStatus", "shipmentStatus")
      , ("returnDTORefundAmount", "refundAmount")
      , ("returnDTOItems", "items")
      , ("returnDTOReturnType", "returnType")
      , ("returnDTOFastReturn", "fastReturn")
      ]


-- | Решения по возвратам.
data ReturnDecisionDTO = ReturnDecisionDTO
  { returnDecisionDTOReturnItemId :: Maybe Int64 -- ^ Идентификатор товара в возврате.
  , returnDecisionDTOCount :: Maybe Int -- ^ Количество единиц товара.
  , returnDecisionDTOComment :: Maybe Text -- ^ Комментарий.
  , returnDecisionDTOReasonType :: Maybe ReturnDecisionReasonType -- ^ 
  , returnDecisionDTOSubreasonType :: Maybe ReturnDecisionSubreasonType -- ^ 
  , returnDecisionDTODecisionType :: Maybe ReturnDecisionType -- ^ 
  , returnDecisionDTORefundAmount :: Maybe Int64 -- ^ Сумма возврата.
  , returnDecisionDTOPartnerCompensation :: Maybe Int64 -- ^ Компенсация за обратную доставку.
  , returnDecisionDTOImages :: Maybe [Text] -- ^ Список хеш-кодов фотографий товара от покупателя.
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnDecisionDTO where
  parseJSON = genericParseJSON optionsReturnDecisionDTO
instance ToJSON ReturnDecisionDTO where
  toJSON = genericToJSON optionsReturnDecisionDTO

optionsReturnDecisionDTO :: Options
optionsReturnDecisionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("returnDecisionDTOReturnItemId", "returnItemId")
      , ("returnDecisionDTOCount", "count")
      , ("returnDecisionDTOComment", "comment")
      , ("returnDecisionDTOReasonType", "reasonType")
      , ("returnDecisionDTOSubreasonType", "subreasonType")
      , ("returnDecisionDTODecisionType", "decisionType")
      , ("returnDecisionDTORefundAmount", "refundAmount")
      , ("returnDecisionDTOPartnerCompensation", "partnerCompensation")
      , ("returnDecisionDTOImages", "images")
      ]


-- | Причины возврата:  * &#x60;BAD_QUALITY&#x60; — бракованный товар (есть недостатки).  * &#x60;DO_NOT_FIT&#x60; — товар не подошел.  * &#x60;WRONG_ITEM&#x60; — привезли не тот товар.  * &#x60;DAMAGE_DELIVERY&#x60; — товар поврежден при доставке.  * &#x60;LOYALTY_FAIL&#x60; — невозможно установить виновного в браке/пересорте.  * &#x60;CONTENT_FAIL&#x60; — ошибочное описание товара по вине Маркета.  * &#x60;UNKNOWN&#x60; — причина не известна. 
data ReturnDecisionReasonType = ReturnDecisionReasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnDecisionReasonType where
  parseJSON = genericParseJSON optionsReturnDecisionReasonType
instance ToJSON ReturnDecisionReasonType where
  toJSON = genericToJSON optionsReturnDecisionReasonType

optionsReturnDecisionReasonType :: Options
optionsReturnDecisionReasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
data ReturnDecisionSubreasonType = ReturnDecisionSubreasonType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnDecisionSubreasonType where
  parseJSON = genericParseJSON optionsReturnDecisionSubreasonType
instance ToJSON ReturnDecisionSubreasonType where
  toJSON = genericToJSON optionsReturnDecisionSubreasonType

optionsReturnDecisionSubreasonType :: Options
optionsReturnDecisionSubreasonType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Решение по возврату:  * &#x60;REFUND_MONEY&#x60; — вернуть деньги покупателю.  * &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60; — вернуть деньги за товар и пересылку.  * &#x60;REPAIR&#x60; — отремонтировать товар.  * &#x60;REPLACE&#x60; — заменить товар.  * &#x60;SEND_TO_EXAMINATION&#x60; — взять товар на экспертизу.  * &#x60;DECLINE_REFUND&#x60; — отказать в возврате.  * &#x60;OTHER_DECISION&#x60; — другое решение. 
data ReturnDecisionType = ReturnDecisionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnDecisionType where
  parseJSON = genericParseJSON optionsReturnDecisionType
instance ToJSON ReturnDecisionType where
  toJSON = genericToJSON optionsReturnDecisionType

optionsReturnDecisionType :: Options
optionsReturnDecisionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Логистическая информация по возврату.
data ReturnInstanceDTO = ReturnInstanceDTO
  { returnInstanceDTOStockType :: Maybe ReturnInstanceStockType -- ^ 
  , returnInstanceDTOStatus :: Maybe ReturnInstanceStatusType -- ^ 
  , returnInstanceDTOCis :: Maybe Text -- ^ Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
  , returnInstanceDTOImei :: Maybe Text -- ^ Международный идентификатор мобильного оборудования.
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnInstanceDTO where
  parseJSON = genericParseJSON optionsReturnInstanceDTO
instance ToJSON ReturnInstanceDTO where
  toJSON = genericToJSON optionsReturnInstanceDTO

optionsReturnInstanceDTO :: Options
optionsReturnInstanceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("returnInstanceDTOStockType", "stockType")
      , ("returnInstanceDTOStatus", "status")
      , ("returnInstanceDTOCis", "cis")
      , ("returnInstanceDTOImei", "imei")
      ]


-- | Логистический статус конкретного товара.
data ReturnInstanceStatusType = ReturnInstanceStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnInstanceStatusType where
  parseJSON = genericParseJSON optionsReturnInstanceStatusType
instance ToJSON ReturnInstanceStatusType where
  toJSON = genericToJSON optionsReturnInstanceStatusType

optionsReturnInstanceStatusType :: Options
optionsReturnInstanceStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип остатка на складе.
data ReturnInstanceStockType = ReturnInstanceStockType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnInstanceStockType where
  parseJSON = genericParseJSON optionsReturnInstanceStockType
instance ToJSON ReturnInstanceStockType where
  toJSON = genericToJSON optionsReturnInstanceStockType

optionsReturnInstanceStockType :: Options
optionsReturnInstanceStockType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Список товаров в возврате.
data ReturnItemDTO = ReturnItemDTO
  { returnItemDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  , returnItemDTOShopSku :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , returnItemDTOCount :: Int64 -- ^ Количество единиц товара.
  , returnItemDTODecisions :: Maybe [ReturnDecisionDTO] -- ^ Список решений по возврату.
  , returnItemDTOInstances :: Maybe [ReturnInstanceDTO] -- ^ Список логистических позиций возврата.
  , returnItemDTOTracks :: Maybe [TrackDTO] -- ^ Список трек-кодов для почтовых отправлений.
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnItemDTO where
  parseJSON = genericParseJSON optionsReturnItemDTO
instance ToJSON ReturnItemDTO where
  toJSON = genericToJSON optionsReturnItemDTO

optionsReturnItemDTO :: Options
optionsReturnItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("returnItemDTOMarketSku", "marketSku")
      , ("returnItemDTOShopSku", "shopSku")
      , ("returnItemDTOCount", "count")
      , ("returnItemDTODecisions", "decisions")
      , ("returnItemDTOInstances", "instances")
      , ("returnItemDTOTracks", "tracks")
      ]


-- | Решение по возврату.
data ReturnRequestDecisionType = ReturnRequestDecisionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnRequestDecisionType where
  parseJSON = genericParseJSON optionsReturnRequestDecisionType
instance ToJSON ReturnRequestDecisionType where
  toJSON = genericToJSON optionsReturnRequestDecisionType

optionsReturnRequestDecisionType :: Options
optionsReturnRequestDecisionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус передачи возврата:  * &#x60;CREATED&#x60; — возврат создан.  * &#x60;RECEIVED&#x60; — принят у покупателя.  * &#x60;IN_TRANSIT&#x60; — возврат в пути.  * &#x60;READY_FOR_PICKUP&#x60; — возврат готов к выдаче магазину.  * &#x60;PICKED&#x60; — возврат выдан магазину.  * &#x60;LOST&#x60; — возврат утерян при транспортировке.  * &#x60;CANCELLED&#x60; — возврат отменен.  * &#x60;FULFILMENT_RECEIVED&#x60; — возврат принят на складе Маркета.  * &#x60;PREPARED_FOR_UTILIZATION&#x60; — возврат передан в утилизацию.  * &#x60;UTILIZED&#x60; — возврат утилизирован. 
data ReturnShipmentStatusType = ReturnShipmentStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnShipmentStatusType where
  parseJSON = genericParseJSON optionsReturnShipmentStatusType
instance ToJSON ReturnShipmentStatusType where
  toJSON = genericToJSON optionsReturnShipmentStatusType

optionsReturnShipmentStatusType :: Options
optionsReturnShipmentStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
data ReturnType = ReturnType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ReturnType where
  parseJSON = genericParseJSON optionsReturnType
instance ToJSON ReturnType where
  toJSON = genericToJSON optionsReturnType

optionsReturnType :: Options
optionsReturnType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о страницах результатов.
data ScrollingPagerDTO = ScrollingPagerDTO
  { scrollingPagerDTONextPageToken :: Maybe Text -- ^ Идентификатор следующей страницы результатов.
  , scrollingPagerDTOPrevPageToken :: Maybe Text -- ^ Идентификатор предыдущей страницы результатов.
  } deriving (Show, Eq, Generic)

instance FromJSON ScrollingPagerDTO where
  parseJSON = genericParseJSON optionsScrollingPagerDTO
instance ToJSON ScrollingPagerDTO where
  toJSON = genericToJSON optionsScrollingPagerDTO

optionsScrollingPagerDTO :: Options
optionsScrollingPagerDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("scrollingPagerDTONextPageToken", "nextPageToken")
      , ("scrollingPagerDTOPrevPageToken", "prevPageToken")
      ]


-- | 
data SearchModelsResponse = SearchModelsResponse
  { searchModelsResponseModels :: [ModelDTO] -- ^ Список моделей товаров.
  , searchModelsResponseCurrency :: Maybe CurrencyType -- ^ 
  , searchModelsResponseRegionId :: Maybe Int64 -- ^ Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
  , searchModelsResponsePager :: Maybe FlippingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchModelsResponse where
  parseJSON = genericParseJSON optionsSearchModelsResponse
instance ToJSON SearchModelsResponse where
  toJSON = genericToJSON optionsSearchModelsResponse

optionsSearchModelsResponse :: Options
optionsSearchModelsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchModelsResponseModels", "models")
      , ("searchModelsResponseCurrency", "currency")
      , ("searchModelsResponseRegionId", "regionId")
      , ("searchModelsResponsePager", "pager")
      ]


-- | Запрос информации об отгрузках.
data SearchShipmentsRequest = SearchShipmentsRequest
  { searchShipmentsRequestDateFrom :: Day -- ^ Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  , searchShipmentsRequestDateTo :: Day -- ^ Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  , searchShipmentsRequestStatuses :: Maybe [ShipmentStatusType] -- ^ Список статусов отгрузок.
  , searchShipmentsRequestOrderIds :: Maybe [Int64] -- ^ Список идентификаторов заказов из отгрузок.
  , searchShipmentsRequestCancelledOrders :: Maybe Bool -- ^ Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchShipmentsRequest where
  parseJSON = genericParseJSON optionsSearchShipmentsRequest
instance ToJSON SearchShipmentsRequest where
  toJSON = genericToJSON optionsSearchShipmentsRequest

optionsSearchShipmentsRequest :: Options
optionsSearchShipmentsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchShipmentsRequestDateFrom", "dateFrom")
      , ("searchShipmentsRequestDateTo", "dateTo")
      , ("searchShipmentsRequestStatuses", "statuses")
      , ("searchShipmentsRequestOrderIds", "orderIds")
      , ("searchShipmentsRequestCancelledOrders", "cancelledOrders")
      ]


-- | Ответ на запрос информации об отгрузках.
data SearchShipmentsResponse = SearchShipmentsResponse
  { searchShipmentsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , searchShipmentsResponseResult :: Maybe SearchShipmentsResponseDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchShipmentsResponse where
  parseJSON = genericParseJSON optionsSearchShipmentsResponse
instance ToJSON SearchShipmentsResponse where
  toJSON = genericToJSON optionsSearchShipmentsResponse

optionsSearchShipmentsResponse :: Options
optionsSearchShipmentsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchShipmentsResponseStatus", "status")
      , ("searchShipmentsResponseResult", "result")
      ]


-- | Информация об отгрузках.
data SearchShipmentsResponseDTO = SearchShipmentsResponseDTO
  { searchShipmentsResponseDTOShipments :: [ShipmentInfoDTO] -- ^ Список с информацией об отгрузках.
  , searchShipmentsResponseDTOPaging :: Maybe ForwardScrollingPagerDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SearchShipmentsResponseDTO where
  parseJSON = genericParseJSON optionsSearchShipmentsResponseDTO
instance ToJSON SearchShipmentsResponseDTO where
  toJSON = genericToJSON optionsSearchShipmentsResponseDTO

optionsSearchShipmentsResponseDTO :: Options
optionsSearchShipmentsResponseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("searchShipmentsResponseDTOShipments", "shipments")
      , ("searchShipmentsResponseDTOPaging", "paging")
      ]


-- | Модель размещения:  * &#x60;FBY&#x60; — FBY. * &#x60;FBS&#x60; — FBS. * &#x60;DBS&#x60; — DBS. * &#x60;EXPRESS&#x60; — Экспресс. 
data SellingProgramType = SellingProgramType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON SellingProgramType where
  parseJSON = genericParseJSON optionsSellingProgramType
instance ToJSON SellingProgramType where
  toJSON = genericToJSON optionsSellingProgramType

optionsSellingProgramType :: Options
optionsSellingProgramType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | В какой чат нужно отправить сообщение и текст сообщения.
data SendMessageToChatRequest = SendMessageToChatRequest
  { sendMessageToChatRequestMessage :: Text -- ^ Текст сообщения. Максимальная длина — 4096 символа.
  } deriving (Show, Eq, Generic)

instance FromJSON SendMessageToChatRequest where
  parseJSON = genericParseJSON optionsSendMessageToChatRequest
instance ToJSON SendMessageToChatRequest where
  toJSON = genericToJSON optionsSendMessageToChatRequest

optionsSendMessageToChatRequest :: Options
optionsSendMessageToChatRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("sendMessageToChatRequestMessage", "message")
      ]


-- | Запрос на обновление изменение параметров прайс-листа.
data SetFeedParamsRequest = SetFeedParamsRequest
  { setFeedParamsRequestParameters :: [FeedParameterDTO] -- ^ Параметры прайс-листа.  Обязательный параметр. 
  } deriving (Show, Eq, Generic)

instance FromJSON SetFeedParamsRequest where
  parseJSON = genericParseJSON optionsSetFeedParamsRequest
instance ToJSON SetFeedParamsRequest where
  toJSON = genericToJSON optionsSetFeedParamsRequest

optionsSetFeedParamsRequest :: Options
optionsSetFeedParamsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setFeedParamsRequestParameters", "parameters")
      ]


-- | 
data SetOrderBoxLayoutRequest = SetOrderBoxLayoutRequest
  { setOrderBoxLayoutRequestBoxes :: [OrderBoxLayoutDTO] -- ^ Список коробок.
  , setOrderBoxLayoutRequestAllowRemove :: Maybe Bool -- ^ Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderBoxLayoutRequest where
  parseJSON = genericParseJSON optionsSetOrderBoxLayoutRequest
instance ToJSON SetOrderBoxLayoutRequest where
  toJSON = genericToJSON optionsSetOrderBoxLayoutRequest

optionsSetOrderBoxLayoutRequest :: Options
optionsSetOrderBoxLayoutRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderBoxLayoutRequestBoxes", "boxes")
      , ("setOrderBoxLayoutRequestAllowRemove", "allowRemove")
      ]


-- | 
data SetOrderBoxLayoutResponse = SetOrderBoxLayoutResponse
  { setOrderBoxLayoutResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , setOrderBoxLayoutResponseResult :: Maybe OrderBoxesLayoutDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderBoxLayoutResponse where
  parseJSON = genericParseJSON optionsSetOrderBoxLayoutResponse
instance ToJSON SetOrderBoxLayoutResponse where
  toJSON = genericToJSON optionsSetOrderBoxLayoutResponse

optionsSetOrderBoxLayoutResponse :: Options
optionsSetOrderBoxLayoutResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderBoxLayoutResponseStatus", "status")
      , ("setOrderBoxLayoutResponseResult", "result")
      ]


-- | 
data SetOrderDeliveryDateRequest = SetOrderDeliveryDateRequest
  { setOrderDeliveryDateRequestDates :: OrderDeliveryDateDTO -- ^ 
  , setOrderDeliveryDateRequestReason :: OrderDeliveryDateReasonType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderDeliveryDateRequest where
  parseJSON = genericParseJSON optionsSetOrderDeliveryDateRequest
instance ToJSON SetOrderDeliveryDateRequest where
  toJSON = genericToJSON optionsSetOrderDeliveryDateRequest

optionsSetOrderDeliveryDateRequest :: Options
optionsSetOrderDeliveryDateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderDeliveryDateRequestDates", "dates")
      , ("setOrderDeliveryDateRequestReason", "reason")
      ]


-- | 
data SetOrderDeliveryTrackCodeRequest = SetOrderDeliveryTrackCodeRequest
  { setOrderDeliveryTrackCodeRequestTrackCode :: Text -- ^ Трек‑номер посылки.
  , setOrderDeliveryTrackCodeRequestDeliveryServiceId :: Int64 -- ^ Идентификатор службы доставки. Информацию о службе доставки можно получить с помощью запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md).
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderDeliveryTrackCodeRequest where
  parseJSON = genericParseJSON optionsSetOrderDeliveryTrackCodeRequest
instance ToJSON SetOrderDeliveryTrackCodeRequest where
  toJSON = genericToJSON optionsSetOrderDeliveryTrackCodeRequest

optionsSetOrderDeliveryTrackCodeRequest :: Options
optionsSetOrderDeliveryTrackCodeRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderDeliveryTrackCodeRequestTrackCode", "trackCode")
      , ("setOrderDeliveryTrackCodeRequestDeliveryServiceId", "deliveryServiceId")
      ]


-- | 
data SetOrderShipmentBoxesRequest = SetOrderShipmentBoxesRequest
  { setOrderShipmentBoxesRequestBoxes :: [ParcelBoxDTO] -- ^ Список грузовых мест. Маркет определяет количество мест по длине этого списка.
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderShipmentBoxesRequest where
  parseJSON = genericParseJSON optionsSetOrderShipmentBoxesRequest
instance ToJSON SetOrderShipmentBoxesRequest where
  toJSON = genericToJSON optionsSetOrderShipmentBoxesRequest

optionsSetOrderShipmentBoxesRequest :: Options
optionsSetOrderShipmentBoxesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderShipmentBoxesRequestBoxes", "boxes")
      ]


-- | 
data SetOrderShipmentBoxesResponse = SetOrderShipmentBoxesResponse
  { setOrderShipmentBoxesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , setOrderShipmentBoxesResponseResult :: Maybe ShipmentBoxesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SetOrderShipmentBoxesResponse where
  parseJSON = genericParseJSON optionsSetOrderShipmentBoxesResponse
instance ToJSON SetOrderShipmentBoxesResponse where
  toJSON = genericToJSON optionsSetOrderShipmentBoxesResponse

optionsSetOrderShipmentBoxesResponse :: Options
optionsSetOrderShipmentBoxesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setOrderShipmentBoxesResponseStatus", "status")
      , ("setOrderShipmentBoxesResponseResult", "result")
      ]


-- | Решения по позиции в возврате.
data SetReturnDecisionRequest = SetReturnDecisionRequest
  { setReturnDecisionRequestReturnItemId :: Int64 -- ^ Идентификатор товара в возврате.
  , setReturnDecisionRequestDecisionType :: ReturnRequestDecisionType -- ^ 
  , setReturnDecisionRequestComment :: Maybe Text -- ^ Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
  } deriving (Show, Eq, Generic)

instance FromJSON SetReturnDecisionRequest where
  parseJSON = genericParseJSON optionsSetReturnDecisionRequest
instance ToJSON SetReturnDecisionRequest where
  toJSON = genericToJSON optionsSetReturnDecisionRequest

optionsSetReturnDecisionRequest :: Options
optionsSetReturnDecisionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setReturnDecisionRequestReturnItemId", "returnItemId")
      , ("setReturnDecisionRequestDecisionType", "decisionType")
      , ("setReturnDecisionRequestComment", "comment")
      ]


-- | Запрос на передачу количества упаковок в отгрузке.
data SetShipmentPalletsCountRequest = SetShipmentPalletsCountRequest
  { setShipmentPalletsCountRequestPlacesCount :: Int -- ^ Количество упаковок в отгрузке.
  } deriving (Show, Eq, Generic)

instance FromJSON SetShipmentPalletsCountRequest where
  parseJSON = genericParseJSON optionsSetShipmentPalletsCountRequest
instance ToJSON SetShipmentPalletsCountRequest where
  toJSON = genericToJSON optionsSetShipmentPalletsCountRequest

optionsSetShipmentPalletsCountRequest :: Options
optionsSetShipmentPalletsCountRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("setShipmentPalletsCountRequestPlacesCount", "placesCount")
      ]


-- | Тип атрибуции:   * &#x60;CLICKS&#x60; — по кликам.   * &#x60;SHOWS&#x60; — по показам. &lt;br&gt;&lt;br&gt;  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
data ShelfsStatisticsAttributionType = ShelfsStatisticsAttributionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShelfsStatisticsAttributionType where
  parseJSON = genericParseJSON optionsShelfsStatisticsAttributionType
instance ToJSON ShelfsStatisticsAttributionType where
  toJSON = genericToJSON optionsShelfsStatisticsAttributionType

optionsShelfsStatisticsAttributionType :: Options
optionsShelfsStatisticsAttributionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Действия с отгрузкой:  * &#x60;CONFIRM&#x60; — подтвердить отгрузку. * &#x60;DOWNLOAD_ACT&#x60; — скачать акт приема-передачи отгрузки. * &#x60;DOWNLOAD_INBOUND_ACT&#x60; — скачать список принятых заказов. * &#x60;DOWNLOAD_DISCREPANCY_ACT&#x60; — скачать акт расхождений. * &#x60;CHANGE_PALLETS_COUNT&#x60; — указать количество палет. 
data ShipmentActionType = ShipmentActionType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentActionType where
  parseJSON = genericParseJSON optionsShipmentActionType
instance ToJSON ShipmentActionType where
  toJSON = genericToJSON optionsShipmentActionType

optionsShipmentActionType :: Options
optionsShipmentActionType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
data ShipmentBoxesDTO = ShipmentBoxesDTO
  { shipmentBoxesDTOBoxes :: [ParcelBoxDTO] -- ^ Список грузовых мест. Маркет определил количество мест по длине этого списка. 
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentBoxesDTO where
  parseJSON = genericParseJSON optionsShipmentBoxesDTO
instance ToJSON ShipmentBoxesDTO where
  toJSON = genericToJSON optionsShipmentBoxesDTO

optionsShipmentBoxesDTO :: Options
optionsShipmentBoxesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("shipmentBoxesDTOBoxes", "boxes")
      ]


-- | Информация об отгрузке.
data ShipmentDTO = ShipmentDTO
  { shipmentDTOId :: Maybe Int64 -- ^ Идентификатор отгрузки.
  , shipmentDTOPlanIntervalFrom :: Maybe UTCTime -- ^ Начало планового интервала отгрузки.
  , shipmentDTOPlanIntervalTo :: Maybe UTCTime -- ^ Конец планового интервала отгрузки.
  , shipmentDTOShipmentType :: Maybe ShipmentType -- ^ 
  , shipmentDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , shipmentDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , shipmentDTOExternalId :: Maybe Text -- ^ Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  , shipmentDTODeliveryService :: Maybe DeliveryServiceDTO -- ^ 
  , shipmentDTOPalletsCount :: Maybe PalletsCountDTO -- ^ 
  , shipmentDTOOrderIds :: [Int64] -- ^ Идентификаторы заказов в отгрузке.
  , shipmentDTODraftCount :: Maybe Int -- ^ Количество заказов, которое Маркет запланировал к отгрузке.
  , shipmentDTOPlannedCount :: Maybe Int -- ^ Количество заказов, которое Маркет подтвердил к отгрузке.
  , shipmentDTOFactCount :: Maybe Int -- ^ Количество заказов, принятых в сортировочном центре или пункте приема.
  , shipmentDTOCurrentStatus :: Maybe ShipmentStatusChangeDTO -- ^ 
  , shipmentDTOAvailableActions :: [ShipmentActionType] -- ^ Доступные действия над отгрузкой.
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentDTO where
  parseJSON = genericParseJSON optionsShipmentDTO
instance ToJSON ShipmentDTO where
  toJSON = genericToJSON optionsShipmentDTO

optionsShipmentDTO :: Options
optionsShipmentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("shipmentDTOId", "id")
      , ("shipmentDTOPlanIntervalFrom", "planIntervalFrom")
      , ("shipmentDTOPlanIntervalTo", "planIntervalTo")
      , ("shipmentDTOShipmentType", "shipmentType")
      , ("shipmentDTOWarehouse", "warehouse")
      , ("shipmentDTOWarehouseTo", "warehouseTo")
      , ("shipmentDTOExternalId", "externalId")
      , ("shipmentDTODeliveryService", "deliveryService")
      , ("shipmentDTOPalletsCount", "palletsCount")
      , ("shipmentDTOOrderIds", "orderIds")
      , ("shipmentDTODraftCount", "draftCount")
      , ("shipmentDTOPlannedCount", "plannedCount")
      , ("shipmentDTOFactCount", "factCount")
      , ("shipmentDTOCurrentStatus", "currentStatus")
      , ("shipmentDTOAvailableActions", "availableActions")
      ]


-- | Список с информацией об отгрузках.
data ShipmentInfoDTO = ShipmentInfoDTO
  { shipmentInfoDTOId :: Maybe Int64 -- ^ Идентификатор отгрузки.
  , shipmentInfoDTOPlanIntervalFrom :: Maybe UTCTime -- ^ Начало планового интервала отгрузки.
  , shipmentInfoDTOPlanIntervalTo :: Maybe UTCTime -- ^ Конец планового интервала отгрузки.
  , shipmentInfoDTOShipmentType :: Maybe ShipmentType -- ^ 
  , shipmentInfoDTOWarehouse :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , shipmentInfoDTOWarehouseTo :: Maybe PartnerShipmentWarehouseDTO -- ^ 
  , shipmentInfoDTOExternalId :: Maybe Text -- ^ Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  , shipmentInfoDTODeliveryService :: Maybe DeliveryServiceDTO -- ^ 
  , shipmentInfoDTOPalletsCount :: Maybe PalletsCountDTO -- ^ 
  , shipmentInfoDTOOrderIds :: [Int64] -- ^ Идентификаторы заказов в отгрузке.
  , shipmentInfoDTODraftCount :: Maybe Int -- ^ Количество заказов, которое Маркет запланировал к отгрузке.
  , shipmentInfoDTOPlannedCount :: Maybe Int -- ^ Количество заказов, которое Маркет подтвердил к отгрузке.
  , shipmentInfoDTOFactCount :: Maybe Int -- ^ Количество заказов, принятых в сортировочном центре или пункте приема.
  , shipmentInfoDTOStatus :: Maybe ShipmentStatusType -- ^ 
  , shipmentInfoDTOStatusDescription :: Maybe Text -- ^ Описание статуса отгрузки.
  , shipmentInfoDTOStatusUpdateTime :: Maybe UTCTime -- ^ Время последнего изменения статуса отгрузки.
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentInfoDTO where
  parseJSON = genericParseJSON optionsShipmentInfoDTO
instance ToJSON ShipmentInfoDTO where
  toJSON = genericToJSON optionsShipmentInfoDTO

optionsShipmentInfoDTO :: Options
optionsShipmentInfoDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("shipmentInfoDTOId", "id")
      , ("shipmentInfoDTOPlanIntervalFrom", "planIntervalFrom")
      , ("shipmentInfoDTOPlanIntervalTo", "planIntervalTo")
      , ("shipmentInfoDTOShipmentType", "shipmentType")
      , ("shipmentInfoDTOWarehouse", "warehouse")
      , ("shipmentInfoDTOWarehouseTo", "warehouseTo")
      , ("shipmentInfoDTOExternalId", "externalId")
      , ("shipmentInfoDTODeliveryService", "deliveryService")
      , ("shipmentInfoDTOPalletsCount", "palletsCount")
      , ("shipmentInfoDTOOrderIds", "orderIds")
      , ("shipmentInfoDTODraftCount", "draftCount")
      , ("shipmentInfoDTOPlannedCount", "plannedCount")
      , ("shipmentInfoDTOFactCount", "factCount")
      , ("shipmentInfoDTOStatus", "status")
      , ("shipmentInfoDTOStatusDescription", "statusDescription")
      , ("shipmentInfoDTOStatusUpdateTime", "statusUpdateTime")
      ]


-- | Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
data ShipmentPalletLabelPageFormatType = ShipmentPalletLabelPageFormatType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentPalletLabelPageFormatType where
  parseJSON = genericParseJSON optionsShipmentPalletLabelPageFormatType
instance ToJSON ShipmentPalletLabelPageFormatType where
  toJSON = genericToJSON optionsShipmentPalletLabelPageFormatType

optionsShipmentPalletLabelPageFormatType :: Options
optionsShipmentPalletLabelPageFormatType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Статус отгрузки.
data ShipmentStatusChangeDTO = ShipmentStatusChangeDTO
  { shipmentStatusChangeDTOStatus :: Maybe ShipmentStatusType -- ^ 
  , shipmentStatusChangeDTODescription :: Maybe Text -- ^ Описание статуса отгрузки.
  , shipmentStatusChangeDTOUpdateTime :: Maybe UTCTime -- ^ Время последнего изменения статуса отгрузки.
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentStatusChangeDTO where
  parseJSON = genericParseJSON optionsShipmentStatusChangeDTO
instance ToJSON ShipmentStatusChangeDTO where
  toJSON = genericToJSON optionsShipmentStatusChangeDTO

optionsShipmentStatusChangeDTO :: Options
optionsShipmentStatusChangeDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("shipmentStatusChangeDTOStatus", "status")
      , ("shipmentStatusChangeDTODescription", "description")
      , ("shipmentStatusChangeDTOUpdateTime", "updateTime")
      ]


-- | Статус отгрузки:  * &#x60;OUTBOUND_CREATED&#x60; — формируется. * &#x60;OUTBOUND_READY_FOR_CONFIRMATION&#x60; — можно обрабатывать. * &#x60;OUTBOUND_CONFIRMED&#x60; — подтверждена и готова к отправке. * &#x60;OUTBOUND_SIGNED&#x60; — по ней подписан электронный акт приема-передачи. * &#x60;ACCEPTED&#x60; — принята в сортировочном центре или пункте приема. * &#x60;ACCEPTED_WITH_DISCREPANCIES&#x60; — принята с расхождениями. * &#x60;FINISHED&#x60; — завершена. * &#x60;ERROR&#x60; — отменена из-за ошибки. 
data ShipmentStatusType = ShipmentStatusType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentStatusType where
  parseJSON = genericParseJSON optionsShipmentStatusType
instance ToJSON ShipmentStatusType where
  toJSON = genericToJSON optionsShipmentStatusType

optionsShipmentStatusType :: Options
optionsShipmentStatusType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Способ отгрузки заказов:  * &#x60;IMPORT&#x60; — вы самостоятельно привозите заказы в выбранный сортировочный центр или пункт приема заказов. * &#x60;WITHDRAW&#x60; — вы отгружаете заказы со своего склада курьерам Яндекс Маркета. 
data ShipmentType = ShipmentType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShipmentType where
  parseJSON = genericParseJSON optionsShipmentType
instance ToJSON ShipmentType where
  toJSON = genericToJSON optionsShipmentType

optionsShipmentType :: Options
optionsShipmentType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
data ShowsSalesGroupingType = ShowsSalesGroupingType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ShowsSalesGroupingType where
  parseJSON = genericParseJSON optionsShowsSalesGroupingType
instance ToJSON ShowsSalesGroupingType where
  toJSON = genericToJSON optionsShowsSalesGroupingType

optionsShowsSalesGroupingType :: Options
optionsShowsSalesGroupingType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Идентификаторы отзывов.
data SkipGoodsFeedbackReactionRequest = SkipGoodsFeedbackReactionRequest
  { skipGoodsFeedbackReactionRequestFeedbackIds :: [Int64] -- ^ Список идентификаторов отзывов, на которые магазин не будет отвечать.
  } deriving (Show, Eq, Generic)

instance FromJSON SkipGoodsFeedbackReactionRequest where
  parseJSON = genericParseJSON optionsSkipGoodsFeedbackReactionRequest
instance ToJSON SkipGoodsFeedbackReactionRequest where
  toJSON = genericToJSON optionsSkipGoodsFeedbackReactionRequest

optionsSkipGoodsFeedbackReactionRequest :: Options
optionsSkipGoodsFeedbackReactionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("skipGoodsFeedbackReactionRequestFeedbackIds", "feedbackIds")
      ]


-- | Список товаров и ставок на них.
data SkuBidItemDTO = SkuBidItemDTO
  { skuBidItemDTOSku :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , skuBidItemDTOBid :: Int -- ^ Значение ставки.
  } deriving (Show, Eq, Generic)

instance FromJSON SkuBidItemDTO where
  parseJSON = genericParseJSON optionsSkuBidItemDTO
instance ToJSON SkuBidItemDTO where
  toJSON = genericToJSON optionsSkuBidItemDTO

optionsSkuBidItemDTO :: Options
optionsSkuBidItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("skuBidItemDTOSku", "sku")
      , ("skuBidItemDTOBid", "bid")
      ]


-- | Список товаров с рекомендованными ставками.
data SkuBidRecommendationItemDTO = SkuBidRecommendationItemDTO
  { skuBidRecommendationItemDTOSku :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , skuBidRecommendationItemDTOBid :: Int -- ^ Значение ставки.
  , skuBidRecommendationItemDTOBidRecommendations :: Maybe [BidRecommendationItemDTO] -- ^ Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
  , skuBidRecommendationItemDTOPriceRecommendations :: Maybe [PriceRecommendationItemDTO] -- ^ Рекомендованные цены.
  } deriving (Show, Eq, Generic)

instance FromJSON SkuBidRecommendationItemDTO where
  parseJSON = genericParseJSON optionsSkuBidRecommendationItemDTO
instance ToJSON SkuBidRecommendationItemDTO where
  toJSON = genericToJSON optionsSkuBidRecommendationItemDTO

optionsSkuBidRecommendationItemDTO :: Options
optionsSkuBidRecommendationItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("skuBidRecommendationItemDTOSku", "sku")
      , ("skuBidRecommendationItemDTOBid", "bid")
      , ("skuBidRecommendationItemDTOBidRecommendations", "bidRecommendations")
      , ("skuBidRecommendationItemDTOPriceRecommendations", "priceRecommendations")
      ]


-- | Направление сортировки.  Возможные значения: - &#x60;ASC&#x60; — сортировка по возрастанию. - &#x60;DESC&#x60; — сортировка по убыванию. 
data SortOrderType = SortOrderType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON SortOrderType where
  parseJSON = genericParseJSON optionsSortOrderType
instance ToJSON SortOrderType where
  toJSON = genericToJSON optionsSortOrderType

optionsSortOrderType :: Options
optionsSortOrderType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Товар, для которого требуется получить цены для продвижения.
data SuggestOfferPriceDTO = SuggestOfferPriceDTO
  { suggestOfferPriceDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , suggestOfferPriceDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestOfferPriceDTO where
  parseJSON = genericParseJSON optionsSuggestOfferPriceDTO
instance ToJSON SuggestOfferPriceDTO where
  toJSON = genericToJSON optionsSuggestOfferPriceDTO

optionsSuggestOfferPriceDTO :: Options
optionsSuggestOfferPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestOfferPriceDTOOfferId", "offerId")
      , ("suggestOfferPriceDTOMarketSku", "marketSku")
      ]


-- | Запрос на получение списка цен для продвижения.
data SuggestPricesRequest = SuggestPricesRequest
  { suggestPricesRequestOffers :: [SuggestOfferPriceDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestPricesRequest where
  parseJSON = genericParseJSON optionsSuggestPricesRequest
instance ToJSON SuggestPricesRequest where
  toJSON = genericToJSON optionsSuggestPricesRequest

optionsSuggestPricesRequest :: Options
optionsSuggestPricesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestPricesRequestOffers", "offers")
      ]


-- | Ответ на запрос списка цен для продвижения.
data SuggestPricesResponse = SuggestPricesResponse
  { suggestPricesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , suggestPricesResponseResult :: Maybe SuggestPricesResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestPricesResponse where
  parseJSON = genericParseJSON optionsSuggestPricesResponse
instance ToJSON SuggestPricesResponse where
  toJSON = genericToJSON optionsSuggestPricesResponse

optionsSuggestPricesResponse :: Options
optionsSuggestPricesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestPricesResponseStatus", "status")
      , ("suggestPricesResponseResult", "result")
      ]


-- | Результат запроса цен для продвижения.
data SuggestPricesResultDTO = SuggestPricesResultDTO
  { suggestPricesResultDTOOffers :: [PriceSuggestOfferDTO] -- ^ Список товаров с ценами для продвижения.
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestPricesResultDTO where
  parseJSON = genericParseJSON optionsSuggestPricesResultDTO
instance ToJSON SuggestPricesResultDTO where
  toJSON = genericToJSON optionsSuggestPricesResultDTO

optionsSuggestPricesResultDTO :: Options
optionsSuggestPricesResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestPricesResultDTOOffers", "offers")
      ]


-- | Информация о товаре.
data SuggestedOfferDTO = SuggestedOfferDTO
  { suggestedOfferDTOOfferId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , suggestedOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , suggestedOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , suggestedOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , suggestedOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , suggestedOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , suggestedOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , suggestedOfferDTOBasicPrice :: Maybe BasePriceDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestedOfferDTO where
  parseJSON = genericParseJSON optionsSuggestedOfferDTO
instance ToJSON SuggestedOfferDTO where
  toJSON = genericToJSON optionsSuggestedOfferDTO

optionsSuggestedOfferDTO :: Options
optionsSuggestedOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestedOfferDTOOfferId", "offerId")
      , ("suggestedOfferDTOName", "name")
      , ("suggestedOfferDTOCategory", "category")
      , ("suggestedOfferDTOVendor", "vendor")
      , ("suggestedOfferDTOBarcodes", "barcodes")
      , ("suggestedOfferDTODescription", "description")
      , ("suggestedOfferDTOVendorCode", "vendorCode")
      , ("suggestedOfferDTOBasicPrice", "basicPrice")
      ]


-- | Товар с соответствующей карточкой на Маркете.
data SuggestedOfferMappingDTO = SuggestedOfferMappingDTO
  { suggestedOfferMappingDTOOffer :: Maybe SuggestedOfferDTO -- ^ 
  , suggestedOfferMappingDTOMapping :: Maybe GetMappingDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON SuggestedOfferMappingDTO where
  parseJSON = genericParseJSON optionsSuggestedOfferMappingDTO
instance ToJSON SuggestedOfferMappingDTO where
  toJSON = genericToJSON optionsSuggestedOfferMappingDTO

optionsSuggestedOfferMappingDTO :: Options
optionsSuggestedOfferMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("suggestedOfferMappingDTOOffer", "offer")
      , ("suggestedOfferMappingDTOMapping", "mapping")
      ]


-- | Информация о тарифах, по которым нужно заплатить за услуги Маркета.
data TariffDTO = TariffDTO
  { tariffDTOType :: TariffType -- ^ 
  , tariffDTOPercent :: Maybe Double -- ^ {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
  , tariffDTOAmount :: Double -- ^ Значение тарифа в рублях.
  , tariffDTOParameters :: [TariffParameterDTO] -- ^ Параметры расчета тарифа.
  } deriving (Show, Eq, Generic)

instance FromJSON TariffDTO where
  parseJSON = genericParseJSON optionsTariffDTO
instance ToJSON TariffDTO where
  toJSON = genericToJSON optionsTariffDTO

optionsTariffDTO :: Options
optionsTariffDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("tariffDTOType", "type")
      , ("tariffDTOPercent", "percent")
      , ("tariffDTOAmount", "amount")
      , ("tariffDTOParameters", "parameters")
      ]


-- | Детали расчета конкретной услуги Маркета.
data TariffParameterDTO = TariffParameterDTO
  { tariffParameterDTOName :: Text -- ^ Название параметра.
  , tariffParameterDTOValue :: Text -- ^ Значение параметра.
  } deriving (Show, Eq, Generic)

instance FromJSON TariffParameterDTO where
  parseJSON = genericParseJSON optionsTariffParameterDTO
instance ToJSON TariffParameterDTO where
  toJSON = genericToJSON optionsTariffParameterDTO

optionsTariffParameterDTO :: Options
optionsTariffParameterDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("tariffParameterDTOName", "name")
      , ("tariffParameterDTOValue", "value")
      ]


-- | Услуга Маркета или дополнительный тариф к услуге размещения:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;STORAGE&#x60; — хранение товара на складе Маркета в течение суток.  * &#x60;SURPLUS&#x60; — хранение излишков на складе Маркета.  * &#x60;WITHDRAW&#x60; — вывоз товара со склада Маркета.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;CROSSREGIONAL_DELIVERY_RETURN&#x60; — доставка невыкупов и возвратов.  * &#x60;DISPOSAL&#x60; — утилизация.  * &#x60;SORTING_CENTER_STORAGE&#x60; — хранение невыкупов и возвратов.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;FF_XDOC_SUPPLY_BOX&#x60; — поставка товара через транзитный склад (за короб).  * &#x60;FF_XDOC_SUPPLY_PALLET&#x60; — поставка товара через транзитный склад (за палету).  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  * &#x60;RETURN_PROCESSING&#x60; — обработка невыкупов и возвратов.  * &#x60;EXPRESS_CANCELLED_BY_PARTNER&#x60; — отмена заказа с экспресс-доставкой.  * &#x60;DELIVERY_TO_CUSTOMER_RETURN&#x60; — возврат доставляемого товара на склад.  * &#x60;CROSSBORDER_DELIVERY&#x60; — доставка из-за рубежа.  * &#x60;INTAKE_SORTING_BULKY_CARGO&#x60; — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_SMALL_GOODS&#x60; — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_DAILY&#x60; — организация забора заказов со склада продавца.  * &#x60;FF_STORAGE_BILLING&#x60; — хранения товаров на складе.  * &#x60;CANCELLED_ORDER_FEE_QI&#x60; — отмена заказа по вине продавца.  * &#x60;LATE_ORDER_EXECUTION_FEE_QI&#x60; — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
data TariffType = TariffType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TariffType where
  parseJSON = genericParseJSON optionsTariffType
instance ToJSON TariffType where
  toJSON = genericToJSON optionsTariffType

optionsTariffType :: Options
optionsTariffType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
data TimePeriodDTO = TimePeriodDTO
  { timePeriodDTOTimePeriod :: Int -- ^ Продолжительность в указанных единицах.
  , timePeriodDTOTimeUnit :: TimeUnitType -- ^ 
  , timePeriodDTOComment :: Maybe Text -- ^ Комментарий.
  } deriving (Show, Eq, Generic)

instance FromJSON TimePeriodDTO where
  parseJSON = genericParseJSON optionsTimePeriodDTO
instance ToJSON TimePeriodDTO where
  toJSON = genericToJSON optionsTimePeriodDTO

optionsTimePeriodDTO :: Options
optionsTimePeriodDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("timePeriodDTOTimePeriod", "timePeriod")
      , ("timePeriodDTOTimeUnit", "timeUnit")
      , ("timePeriodDTOComment", "comment")
      ]


-- | Единица измерения времени:  * &#x60;HOUR&#x60; — час. * &#x60;DAY&#x60; — сутки. * &#x60;WEEK&#x60; — неделя. * &#x60;MONTH&#x60; — месяц. * &#x60;YEAR&#x60; — год. 
data TimeUnitType = TimeUnitType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TimeUnitType where
  parseJSON = genericParseJSON optionsTimeUnitType
instance ToJSON TimeUnitType where
  toJSON = genericToJSON optionsTimeUnitType

optionsTimeUnitType :: Options
optionsTimeUnitType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о трек-номерах.
data TrackDTO = TrackDTO
  { trackDTOTrackCode :: Maybe Text -- ^ Трек-код почтового отправления.
  } deriving (Show, Eq, Generic)

instance FromJSON TrackDTO where
  parseJSON = genericParseJSON optionsTrackDTO
instance ToJSON TrackDTO where
  toJSON = genericToJSON optionsTrackDTO

optionsTrackDTO :: Options
optionsTrackDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("trackDTOTrackCode", "trackCode")
      ]


-- | Запрос переноса заказов из отгрузки.
data TransferOrdersFromShipmentRequest = TransferOrdersFromShipmentRequest
  { transferOrdersFromShipmentRequestOrderIds :: [Int64] -- ^ Список заказов, которые вы не успеваете подготовить.
  } deriving (Show, Eq, Generic)

instance FromJSON TransferOrdersFromShipmentRequest where
  parseJSON = genericParseJSON optionsTransferOrdersFromShipmentRequest
instance ToJSON TransferOrdersFromShipmentRequest where
  toJSON = genericToJSON optionsTransferOrdersFromShipmentRequest

optionsTransferOrdersFromShipmentRequest :: Options
optionsTransferOrdersFromShipmentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("transferOrdersFromShipmentRequestOrderIds", "orderIds")
      ]


-- | Информация об оборачиваемости товара.
data TurnoverDTO = TurnoverDTO
  { turnoverDTOTurnover :: TurnoverType -- ^ 
  , turnoverDTOTurnoverDays :: Maybe Double -- ^ Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
  } deriving (Show, Eq, Generic)

instance FromJSON TurnoverDTO where
  parseJSON = genericParseJSON optionsTurnoverDTO
instance ToJSON TurnoverDTO where
  toJSON = genericToJSON optionsTurnoverDTO

optionsTurnoverDTO :: Options
optionsTurnoverDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("turnoverDTOTurnover", "turnover")
      , ("turnoverDTOTurnoverDays", "turnoverDays")
      ]


-- | Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |&#x60;LOW&#x60;|&#x60;turnoverDays&#x60; ≥ 120|| |&#x60;ALMOST_LOW&#x60;|100 ≤ &#x60;turnoverDays&#x60; &lt; 120|| |&#x60;HIGH&#x60;|45 ≤ &#x60;turnoverDays&#x60; &lt; 100|| |&#x60;VERY_HIGH&#x60;|0 ≤ &#x60;turnoverDays&#x60; &lt; 45|| |&#x60;NO_SALES&#x60;|—|Продаж нет.| |&#x60;FREE_STORE&#x60;|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
data TurnoverType = TurnoverType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON TurnoverType where
  parseJSON = genericParseJSON optionsTurnoverType
instance ToJSON TurnoverType where
  toJSON = genericToJSON optionsTurnoverType

optionsTurnoverType :: Options
optionsTurnoverType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Единица измерения.
data UnitDTO = UnitDTO
  { unitDTOId :: Int64 -- ^ Идентификатор единицы измерения.
  , unitDTOName :: Text -- ^ Сокращенное название единицы измерения.
  , unitDTOFullName :: Text -- ^ Полное название единицы измерения.
  } deriving (Show, Eq, Generic)

instance FromJSON UnitDTO where
  parseJSON = genericParseJSON optionsUnitDTO
instance ToJSON UnitDTO where
  toJSON = genericToJSON optionsUnitDTO

optionsUnitDTO :: Options
optionsUnitDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("unitDTOId", "id")
      , ("unitDTOName", "name")
      , ("unitDTOFullName", "fullName")
      ]


-- | Товар с новой ценой.
data UpdateBusinessOfferPriceDTO = UpdateBusinessOfferPriceDTO
  { updateBusinessOfferPriceDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateBusinessOfferPriceDTOPrice :: UpdatePriceWithDiscountDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateBusinessOfferPriceDTO where
  parseJSON = genericParseJSON optionsUpdateBusinessOfferPriceDTO
instance ToJSON UpdateBusinessOfferPriceDTO where
  toJSON = genericToJSON optionsUpdateBusinessOfferPriceDTO

optionsUpdateBusinessOfferPriceDTO :: Options
optionsUpdateBusinessOfferPriceDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateBusinessOfferPriceDTOOfferId", "offerId")
      , ("updateBusinessOfferPriceDTOPrice", "price")
      ]


-- | Запрос на установку базовых цен на товары.
data UpdateBusinessPricesRequest = UpdateBusinessPricesRequest
  { updateBusinessPricesRequestOffers :: [UpdateBusinessOfferPriceDTO] -- ^ Список товаров с ценами.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateBusinessPricesRequest where
  parseJSON = genericParseJSON optionsUpdateBusinessPricesRequest
instance ToJSON UpdateBusinessPricesRequest where
  toJSON = genericToJSON optionsUpdateBusinessPricesRequest

optionsUpdateBusinessPricesRequest :: Options
optionsUpdateBusinessPricesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateBusinessPricesRequestOffers", "offers")
      ]


-- | Параметры размещения товара в магазине.
data UpdateCampaignOfferDTO = UpdateCampaignOfferDTO
  { updateCampaignOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateCampaignOfferDTOQuantum :: Maybe QuantumDTO -- ^ 
  , updateCampaignOfferDTOAvailable :: Maybe Bool -- ^ Есть ли товар в продаже. 
  , updateCampaignOfferDTOVat :: Maybe Int -- ^ Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateCampaignOfferDTO where
  parseJSON = genericParseJSON optionsUpdateCampaignOfferDTO
instance ToJSON UpdateCampaignOfferDTO where
  toJSON = genericToJSON optionsUpdateCampaignOfferDTO

optionsUpdateCampaignOfferDTO :: Options
optionsUpdateCampaignOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateCampaignOfferDTOOfferId", "offerId")
      , ("updateCampaignOfferDTOQuantum", "quantum")
      , ("updateCampaignOfferDTOAvailable", "available")
      , ("updateCampaignOfferDTOVat", "vat")
      ]


-- | Запрос на обновление предложений товаров магазина.
data UpdateCampaignOffersRequest = UpdateCampaignOffersRequest
  { updateCampaignOffersRequestOffers :: [UpdateCampaignOfferDTO] -- ^ Параметры размещения товаров в заданном магазине.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateCampaignOffersRequest where
  parseJSON = genericParseJSON optionsUpdateCampaignOffersRequest
instance ToJSON UpdateCampaignOffersRequest where
  toJSON = genericToJSON optionsUpdateCampaignOffersRequest

optionsUpdateCampaignOffersRequest :: Options
optionsUpdateCampaignOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateCampaignOffersRequestOffers", "offers")
      ]


-- | Комментарий к отзыву или другому комментарию.
data UpdateGoodsFeedbackCommentDTO = UpdateGoodsFeedbackCommentDTO
  { updateGoodsFeedbackCommentDTOId :: Maybe Int64 -- ^ Идентификатор комментария к отзыву. 
  , updateGoodsFeedbackCommentDTOParentId :: Maybe Int64 -- ^ Идентификатор комментария к отзыву. 
  , updateGoodsFeedbackCommentDTOText :: Text -- ^ Текст комментария.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateGoodsFeedbackCommentDTO where
  parseJSON = genericParseJSON optionsUpdateGoodsFeedbackCommentDTO
instance ToJSON UpdateGoodsFeedbackCommentDTO where
  toJSON = genericToJSON optionsUpdateGoodsFeedbackCommentDTO

optionsUpdateGoodsFeedbackCommentDTO :: Options
optionsUpdateGoodsFeedbackCommentDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateGoodsFeedbackCommentDTOId", "id")
      , ("updateGoodsFeedbackCommentDTOParentId", "parentId")
      , ("updateGoodsFeedbackCommentDTOText", "text")
      ]


-- | Комментарий к отзыву.
data UpdateGoodsFeedbackCommentRequest = UpdateGoodsFeedbackCommentRequest
  { updateGoodsFeedbackCommentRequestFeedbackId :: Int64 -- ^ Идентификатор отзыва. 
  , updateGoodsFeedbackCommentRequestComment :: UpdateGoodsFeedbackCommentDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateGoodsFeedbackCommentRequest where
  parseJSON = genericParseJSON optionsUpdateGoodsFeedbackCommentRequest
instance ToJSON UpdateGoodsFeedbackCommentRequest where
  toJSON = genericToJSON optionsUpdateGoodsFeedbackCommentRequest

optionsUpdateGoodsFeedbackCommentRequest :: Options
optionsUpdateGoodsFeedbackCommentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateGoodsFeedbackCommentRequestFeedbackId", "feedbackId")
      , ("updateGoodsFeedbackCommentRequestComment", "comment")
      ]


-- | 
data UpdateGoodsFeedbackCommentResponse = UpdateGoodsFeedbackCommentResponse
  { updateGoodsFeedbackCommentResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , updateGoodsFeedbackCommentResponseResult :: Maybe GoodsFeedbackCommentDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateGoodsFeedbackCommentResponse where
  parseJSON = genericParseJSON optionsUpdateGoodsFeedbackCommentResponse
instance ToJSON UpdateGoodsFeedbackCommentResponse where
  toJSON = genericToJSON optionsUpdateGoodsFeedbackCommentResponse

optionsUpdateGoodsFeedbackCommentResponse :: Options
optionsUpdateGoodsFeedbackCommentResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateGoodsFeedbackCommentResponseStatus", "status")
      , ("updateGoodsFeedbackCommentResponseResult", "result")
      ]


-- | Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
data UpdateMappingDTO = UpdateMappingDTO
  { updateMappingDTOMarketSku :: Maybe Int64 -- ^ SKU на Маркете.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateMappingDTO where
  parseJSON = genericParseJSON optionsUpdateMappingDTO
instance ToJSON UpdateMappingDTO where
  toJSON = genericToJSON optionsUpdateMappingDTO

optionsUpdateMappingDTO :: Options
optionsUpdateMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateMappingDTOMarketSku", "marketSku")
      ]


-- | Информация о товарах в каталоге.
data UpdateMappingsOfferDTO = UpdateMappingsOfferDTO
  { updateMappingsOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , updateMappingsOfferDTOShopSku :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateMappingsOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , updateMappingsOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , updateMappingsOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , updateMappingsOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , updateMappingsOfferDTOId :: Maybe Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateMappingsOfferDTOFeedId :: Maybe Int64 -- ^ Идентификатор фида.
  , updateMappingsOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , updateMappingsOfferDTOUrls :: Maybe [Text] -- ^ URL фотографии товара или страницы с описанием на вашем сайте.  Переданные данные не будут отображаться на витрине, но они помогут специалистам Маркета найти карточку для вашего товара.  Должен содержать один вложенный параметр url. 
  , updateMappingsOfferDTOPictures :: Maybe [Text] -- ^ Ссылки (URL) изображений товара в хорошем качестве.  Можно указать до 30 ссылок. При этом изображение по первой ссылке будет основным. Оно используется в качестве изображения товара в поиске Маркета и на карточке товара. Другие изображения товара доступны в режиме просмотра увеличенных изображений.  Обязательный параметр.  Должен содержать хотя бы один вложенный параметр `picture`. 
  , updateMappingsOfferDTOManufacturer :: Maybe Text -- ^ Изготовитель товара: компания, которая произвела товар, ее адрес и регистрационный номер (если есть).  Необязательный параметр. 
  , updateMappingsOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Список стран, в которых произведен товар.  Обязательный параметр.  Должен содержать хотя бы одну, но не больше 5 стран. 
  , updateMappingsOfferDTOMinShipment :: Maybe Int -- ^ Минимальное количество единиц товара, которое вы поставляете на склад.  Например, если вы поставляете детское питание партиями минимум по 10 коробок, а в каждой коробке по 6 баночек, укажите значение 60. 
  , updateMappingsOfferDTOTransportUnitSize :: Maybe Int -- ^ Количество единиц товара в одной упаковке, которую вы поставляете на склад.  Например, если вы поставляете детское питание коробками по 6 баночек, укажите значение 6. 
  , updateMappingsOfferDTOQuantumOfSupply :: Maybe Int -- ^ Добавочная партия: по сколько единиц товара можно добавлять к минимальному количеству minShipment.  Например, если вы поставляете детское питание партиями минимум по 10 коробок и хотите добавлять к минимальной партии по 2 коробки, а в каждой коробке по 6 баночек, укажите значение 12. 
  , updateMappingsOfferDTODeliveryDurationDays :: Maybe Int -- ^ Срок, за который продавец поставляет товары на склад, в днях.
  , updateMappingsOfferDTOBoxCount :: Maybe Int -- ^ Сколько мест (если больше одного) занимает товар.  Параметр указывается, только если товар занимает больше одного места (например, кондиционер занимает два места: внешний и внутренний блоки в двух коробках). Если товар занимает одно место, не указывайте этот параметр. 
  , updateMappingsOfferDTOCustomsCommodityCodes :: Maybe [Text] -- ^ Список кодов товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД).  Обязательный параметр, если товар подлежит особому учету (например, в системе «Меркурий» как продукция животного происхождения или в системе «Честный ЗНАК»).  Может содержать только один вложенный код ТН ВЭД. 
  , updateMappingsOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , updateMappingsOfferDTOSupplyScheduleDays :: Maybe [DayOfWeekType] -- ^ Дни недели, в которые продавец поставляет товары на склад.
  , updateMappingsOfferDTOShelfLifeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `shelfLife`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок годности: через сколько дней товар станет непригоден для использования. 
  , updateMappingsOfferDTOLifeTimeDays :: Maybe Int -- ^ {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `lifeTime`. Совместное использование обоих параметров приведет к ошибке.  {% endnote %}  Срок службы: сколько дней товар будет исправно выполнять свою функцию, а изготовитель — нести ответственность за его существенные недостатки. 
  , updateMappingsOfferDTOGuaranteePeriodDays :: Maybe Int -- ^ Гарантийный срок товара: сколько дней возможно обслуживание и ремонт товара или возврат денег, а изготовитель или продавец будет нести ответственность за недостатки товара. 
  , updateMappingsOfferDTOProcessingState :: Maybe OfferProcessingStateDTO -- ^ 
  , updateMappingsOfferDTOAvailability :: Maybe OfferAvailabilityStatusType -- ^ 
  , updateMappingsOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , updateMappingsOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , updateMappingsOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , updateMappingsOfferDTOCertificate :: Maybe Text -- ^ Номер документа на товар.  Перед указанием номера документ нужно загрузить в кабинете продавца на Маркете. [Инструкция](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html) 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateMappingsOfferDTO where
  parseJSON = genericParseJSON optionsUpdateMappingsOfferDTO
instance ToJSON UpdateMappingsOfferDTO where
  toJSON = genericToJSON optionsUpdateMappingsOfferDTO

optionsUpdateMappingsOfferDTO :: Options
optionsUpdateMappingsOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateMappingsOfferDTOName", "name")
      , ("updateMappingsOfferDTOShopSku", "shopSku")
      , ("updateMappingsOfferDTOCategory", "category")
      , ("updateMappingsOfferDTOVendor", "vendor")
      , ("updateMappingsOfferDTOVendorCode", "vendorCode")
      , ("updateMappingsOfferDTODescription", "description")
      , ("updateMappingsOfferDTOId", "id")
      , ("updateMappingsOfferDTOFeedId", "feedId")
      , ("updateMappingsOfferDTOBarcodes", "barcodes")
      , ("updateMappingsOfferDTOUrls", "urls")
      , ("updateMappingsOfferDTOPictures", "pictures")
      , ("updateMappingsOfferDTOManufacturer", "manufacturer")
      , ("updateMappingsOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("updateMappingsOfferDTOMinShipment", "minShipment")
      , ("updateMappingsOfferDTOTransportUnitSize", "transportUnitSize")
      , ("updateMappingsOfferDTOQuantumOfSupply", "quantumOfSupply")
      , ("updateMappingsOfferDTODeliveryDurationDays", "deliveryDurationDays")
      , ("updateMappingsOfferDTOBoxCount", "boxCount")
      , ("updateMappingsOfferDTOCustomsCommodityCodes", "customsCommodityCodes")
      , ("updateMappingsOfferDTOWeightDimensions", "weightDimensions")
      , ("updateMappingsOfferDTOSupplyScheduleDays", "supplyScheduleDays")
      , ("updateMappingsOfferDTOShelfLifeDays", "shelfLifeDays")
      , ("updateMappingsOfferDTOLifeTimeDays", "lifeTimeDays")
      , ("updateMappingsOfferDTOGuaranteePeriodDays", "guaranteePeriodDays")
      , ("updateMappingsOfferDTOProcessingState", "processingState")
      , ("updateMappingsOfferDTOAvailability", "availability")
      , ("updateMappingsOfferDTOShelfLife", "shelfLife")
      , ("updateMappingsOfferDTOLifeTime", "lifeTime")
      , ("updateMappingsOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("updateMappingsOfferDTOCertificate", "certificate")
      ]


-- | Запрос на установку новых значений для параметров.
data UpdateOfferContentRequest = UpdateOfferContentRequest
  { updateOfferContentRequestOffersContent :: [OfferContentDTO] -- ^ Список товаров с указанными характеристиками.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferContentRequest where
  parseJSON = genericParseJSON optionsUpdateOfferContentRequest
instance ToJSON UpdateOfferContentRequest where
  toJSON = genericToJSON optionsUpdateOfferContentRequest

optionsUpdateOfferContentRequest :: Options
optionsUpdateOfferContentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferContentRequestOffersContent", "offersContent")
      ]


-- | Описывает проблемы, которые появились при сохранении товара.
data UpdateOfferContentResponse = UpdateOfferContentResponse
  { updateOfferContentResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , updateOfferContentResponseResults :: Maybe [UpdateOfferContentResultDTO] -- ^ Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferContentResponse where
  parseJSON = genericParseJSON optionsUpdateOfferContentResponse
instance ToJSON UpdateOfferContentResponse where
  toJSON = genericToJSON optionsUpdateOfferContentResponse

optionsUpdateOfferContentResponse :: Options
optionsUpdateOfferContentResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferContentResponseStatus", "status")
      , ("updateOfferContentResponseResults", "results")
      ]


-- | Ошибки и предупреждения, которые появились из-за переданных характеристик.
data UpdateOfferContentResultDTO = UpdateOfferContentResultDTO
  { updateOfferContentResultDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateOfferContentResultDTOErrors :: Maybe [OfferContentErrorDTO] -- ^ Ошибки — информация в каталоге не обновится.
  , updateOfferContentResultDTOWarnings :: Maybe [OfferContentErrorDTO] -- ^ Предупреждения — информация в каталоге обновится.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferContentResultDTO where
  parseJSON = genericParseJSON optionsUpdateOfferContentResultDTO
instance ToJSON UpdateOfferContentResultDTO where
  toJSON = genericToJSON optionsUpdateOfferContentResultDTO

optionsUpdateOfferContentResultDTO :: Options
optionsUpdateOfferContentResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferContentResultDTOOfferId", "offerId")
      , ("updateOfferContentResultDTOErrors", "errors")
      , ("updateOfferContentResultDTOWarnings", "warnings")
      ]


-- | Параметры товара.
data UpdateOfferDTO = UpdateOfferDTO
  { updateOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateOfferDTOName :: Maybe Text -- ^ Составляйте название по схеме: тип + бренд или производитель + модель + особенности, если есть (например, цвет, размер или вес) и количество в упаковке.  Не включайте в название условия продажи (например, «скидка», «бесплатная доставка» и т. д.), эмоциональные характеристики («хит», «супер» и т. д.). Не пишите слова большими буквами — кроме устоявшихся названий брендов и моделей.  Оптимальная длина — 50–60 символов, максимальная — 256.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/title.html) 
  , updateOfferDTOMarketCategoryId :: Maybe Int64 -- ^ Идентификатор категории на Маркете, к которой вы относите свой товар.  Если не указать `marketCategoryId`, то маркетная категория будет определена автоматически.  При изменении информации о товаре передавайте тот же идентификатор категории. Если вы укажете другой, категория товара не поменяется. Изменить ее можно только в кабинете продавца на Маркете.  Список категорий Маркета можно получить с помощью запроса  [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
  , updateOfferDTOCategory :: Maybe Text -- ^ Категория товара в вашем магазине. Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`.  Указывайте конкретные категории — например, набор ножей лучше отнести к категории **Столовые приборы**, а не просто **Посуда**.  Выбирайте категории, которые описывают товар, а не абстрактный признак — например, **Духи**, а не **Подарки**.  Значение будет использовано для определения категории товара на Маркете в случае, если вы не передали категорию в параметре `marketCategoryId`. 
  , updateOfferDTOPictures :: Maybe [Text] -- ^ Ссылки на изображения товара. Изображение по первой ссылке считается основным, остальные дополнительными.  **Требования к ссылкам**  * Ссылок может быть до 30. * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на изображения и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/images/sku12345.jpg`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/images/sku12345.jpg`  ❌ `https://www.dropbox.com/s/818f/tovar.jpg`  Ссылки на изображение должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить изображение, выложите новое изображение по новой ссылке, а ссылку на старое удалите. Если просто заменить изображение по старой ссылке, оно не обновится.  [Требования к изображениям](https://yandex.ru/support/marketplace/assortment/fields/images.html) 
  , updateOfferDTOVideos :: Maybe [Text] -- ^ Ссылка (URL) на видео товара.  Максимальное количество ссылок — 6.  **Требования к ссылке**  * Указывайте ссылку целиком, включая протокол http или https. * Максимальная длина — 512 символов. * Русские буквы в URL можно. * Можно использовать прямые ссылки на видео и на Яндекс Диск. Ссылки на Яндекс Диске нужно копировать с помощью функции **Поделиться**. Относительные ссылки и ссылки на другие облачные хранилища — не работают.  ✅ `https://example-shop.ru/video/sku12345.avi`  ✅ `https://yadi.sk/i/NaBoRsimVOLov`  ❌ `/video/sku12345.avi`  ❌ `https://www.dropbox.com/s/818f/super-tovar.avi`  Ссылки на видео должны быть постоянными. Нельзя использовать динамические ссылки, меняющиеся от выгрузки к выгрузке.  Если нужно заменить видео, выложите новое видео по новой ссылке, а ссылку на старое удалите. Если просто заменить видео по старой ссылке, оно не обновится.  [Требования к видео](https://yandex.ru/support/marketplace/assortment/fields/video.html) 
  , updateOfferDTOManuals :: Maybe [OfferManualDTO] -- ^ Список инструкций по использованию товара.  Максимальное количество инструкций — 6.  Если вы передадите пустое поле `manuals`, загруженные ранее инструкции удалятся. 
  , updateOfferDTOVendor :: Maybe Text -- ^ Название бренда или производителя. Должно быть записано так, как его пишет сам бренд.
  , updateOfferDTOBarcodes :: Maybe [Text] -- ^ Указывайте в виде последовательности цифр. Подойдут коды EAN-13, EAN-8, UPC-A, UPC-E или Code 128.  Для книг указывайте ISBN.  Для товаров [определенных категорий и торговых марок](https://yastatic.net/s3/doc-binary/src/support/market/ru/yandex-market-list-for-gtin.xlsx) штрихкод должен быть действительным кодом GTIN. Обратите внимание: внутренние штрихкоды, начинающиеся на 2 или 02, и коды формата Code 128 не являются GTIN.  [Что такое GTIN](*gtin)  
  , updateOfferDTODescription :: Maybe Text -- ^ Подробное описание товара: например, его преимущества и особенности.  Не давайте в описании инструкций по установке и сборке. Не используйте слова «скидка», «распродажа», «дешевый», «подарок» (кроме подарочных категорий), «бесплатно», «акция», «специальная цена», «новинка», «new», «аналог», «заказ», «хит». Не указывайте никакой контактной информации и не давайте ссылок.  Можно использовать теги:  * \\<h>, \\<h1>, \\<h2> и так далее — для заголовков; * \\<br> и \\<p> — для переноса строки; * \\<ol> — для нумерованного списка; * \\<ul> — для маркированного списка; * \\<li> — для создания элементов списка (должен находиться внутри \\<ol> или \\<ul>); * \\<div> — поддерживается, но не влияет на отображение текста.  Оптимальная длина — 400–600 символов, максимальная — 6000.  [Рекомендации и правила](https://yandex.ru/support/marketplace/assortment/fields/description.html) 
  , updateOfferDTOManufacturerCountries :: Maybe [Text] -- ^ Страна, где был произведен товар.  Записывайте названия стран так, как они записаны в [списке](https://yastatic.net/s3/doc-binary/src/support/market/ru/countries.xlsx). 
  , updateOfferDTOWeightDimensions :: Maybe OfferWeightDimensionsDTO -- ^ 
  , updateOfferDTOVendorCode :: Maybe Text -- ^ Артикул товара от производителя.
  , updateOfferDTOTags :: Maybe [Text] -- ^ Метки товара, используемые магазином. Покупателям теги не видны. По тегам можно группировать и фильтровать разные товары в каталоге — например, товары одной серии, коллекции или линейки.  Максимальная длина тега 20 символов. У одного товара может быть максимум 10 тегов. Всего можно создать не больше 50 разных тегов. 
  , updateOfferDTOShelfLife :: Maybe TimePeriodDTO -- ^ 
  , updateOfferDTOLifeTime :: Maybe TimePeriodDTO -- ^ 
  , updateOfferDTOGuaranteePeriod :: Maybe TimePeriodDTO -- ^ 
  , updateOfferDTOCustomsCommodityCode :: Maybe Text -- ^ Код товара в единой Товарной номенклатуре внешнеэкономической деятельности (ТН ВЭД) — 10 или 14 цифр без пробелов.  Обязательно укажите, если он есть. 
  , updateOfferDTOCertificates :: Maybe [Text] -- ^ Номера документов на товар: сертификата, декларации соответствия и т. п.  Передавать можно только номера документов, сканы которого загружены в кабинете продавца по [инструкции](https://yandex.ru/support/marketplace/assortment/restrictions/certificates.html). 
  , updateOfferDTOBoxCount :: Maybe Int -- ^ Количество грузовых мест.  Параметр используется, если товар представляет собой несколько коробок, упаковок и так далее. Например, кондиционер занимает два места — внешний и внутренний блоки в двух коробках.  Для товаров, занимающих одно место, не передавайте этот параметр. 
  , updateOfferDTOCondition :: Maybe OfferConditionDTO -- ^ 
  , updateOfferDTOType :: Maybe OfferType -- ^ 
  , updateOfferDTODownloadable :: Maybe Bool -- ^ Признак цифрового товара. Укажите `true`, если товар доставляется по электронной почте.  [Как работать с цифровыми товарами](../../step-by-step/digital.md) 
  , updateOfferDTOAdult :: Maybe Bool -- ^ Параметр включает для товара пометку 18+. Устанавливайте ее только для товаров, которые относятся к удовлетворению сексуальных потребностей. 
  , updateOfferDTOAge :: Maybe AgeDTO -- ^ 
  , updateOfferDTOParams :: Maybe [OfferParamDTO] -- ^ {% note warning \"\" %}  Этот параметр устарел. При передаче характеристик используйте `parameterValues`.  {% endnote %}  Характеристики, которые есть только у товаров конкретной категории — например, диаметр колес велосипеда или материал подошвы обуви. 
  , updateOfferDTOParameterValues :: Maybe [ParameterValueDTO] -- ^ Список характеристик с их значениями.  С `parameterValues` обязательно передавайте `marketCategoryId` — идентификатор категории на Маркете, к которой относятся указанные характеристики товара.  При **изменении** характеристик передавайте только те, значение которых нужно обновить.  Чтобы **удалить** значение заданной характеристики, передайте ее `parameterId` с пустым `value`.  Максимальное количество характеристик — 300. 
  , updateOfferDTOBasicPrice :: Maybe UpdatePriceWithDiscountDTO -- ^ 
  , updateOfferDTOPurchasePrice :: Maybe BasePriceDTO -- ^ 
  , updateOfferDTOAdditionalExpenses :: Maybe BasePriceDTO -- ^ 
  , updateOfferDTOCofinancePrice :: Maybe BasePriceDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferDTO where
  parseJSON = genericParseJSON optionsUpdateOfferDTO
instance ToJSON UpdateOfferDTO where
  toJSON = genericToJSON optionsUpdateOfferDTO

optionsUpdateOfferDTO :: Options
optionsUpdateOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferDTOOfferId", "offerId")
      , ("updateOfferDTOName", "name")
      , ("updateOfferDTOMarketCategoryId", "marketCategoryId")
      , ("updateOfferDTOCategory", "category")
      , ("updateOfferDTOPictures", "pictures")
      , ("updateOfferDTOVideos", "videos")
      , ("updateOfferDTOManuals", "manuals")
      , ("updateOfferDTOVendor", "vendor")
      , ("updateOfferDTOBarcodes", "barcodes")
      , ("updateOfferDTODescription", "description")
      , ("updateOfferDTOManufacturerCountries", "manufacturerCountries")
      , ("updateOfferDTOWeightDimensions", "weightDimensions")
      , ("updateOfferDTOVendorCode", "vendorCode")
      , ("updateOfferDTOTags", "tags")
      , ("updateOfferDTOShelfLife", "shelfLife")
      , ("updateOfferDTOLifeTime", "lifeTime")
      , ("updateOfferDTOGuaranteePeriod", "guaranteePeriod")
      , ("updateOfferDTOCustomsCommodityCode", "customsCommodityCode")
      , ("updateOfferDTOCertificates", "certificates")
      , ("updateOfferDTOBoxCount", "boxCount")
      , ("updateOfferDTOCondition", "condition")
      , ("updateOfferDTOType", "type")
      , ("updateOfferDTODownloadable", "downloadable")
      , ("updateOfferDTOAdult", "adult")
      , ("updateOfferDTOAge", "age")
      , ("updateOfferDTOParams", "params")
      , ("updateOfferDTOParameterValues", "parameterValues")
      , ("updateOfferDTOBasicPrice", "basicPrice")
      , ("updateOfferDTOPurchasePrice", "purchasePrice")
      , ("updateOfferDTOAdditionalExpenses", "additionalExpenses")
      , ("updateOfferDTOCofinancePrice", "cofinancePrice")
      ]


-- | Информация о товаре.
data UpdateOfferMappingDTO = UpdateOfferMappingDTO
  { updateOfferMappingDTOOffer :: UpdateOfferDTO -- ^ 
  , updateOfferMappingDTOMapping :: Maybe UpdateMappingDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingDTO where
  parseJSON = genericParseJSON optionsUpdateOfferMappingDTO
instance ToJSON UpdateOfferMappingDTO where
  toJSON = genericToJSON optionsUpdateOfferMappingDTO

optionsUpdateOfferMappingDTO :: Options
optionsUpdateOfferMappingDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingDTOOffer", "offer")
      , ("updateOfferMappingDTOMapping", "mapping")
      ]


-- | Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
data UpdateOfferMappingEntryDTO = UpdateOfferMappingEntryDTO
  { updateOfferMappingEntryDTOMapping :: Maybe OfferMappingDTO -- ^ 
  , updateOfferMappingEntryDTOAwaitingModerationMapping :: Maybe OfferMappingDTO -- ^ 
  , updateOfferMappingEntryDTORejectedMapping :: Maybe OfferMappingDTO -- ^ 
  , updateOfferMappingEntryDTOOffer :: Maybe UpdateMappingsOfferDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingEntryDTO where
  parseJSON = genericParseJSON optionsUpdateOfferMappingEntryDTO
instance ToJSON UpdateOfferMappingEntryDTO where
  toJSON = genericToJSON optionsUpdateOfferMappingEntryDTO

optionsUpdateOfferMappingEntryDTO :: Options
optionsUpdateOfferMappingEntryDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingEntryDTOMapping", "mapping")
      , ("updateOfferMappingEntryDTOAwaitingModerationMapping", "awaitingModerationMapping")
      , ("updateOfferMappingEntryDTORejectedMapping", "rejectedMapping")
      , ("updateOfferMappingEntryDTOOffer", "offer")
      ]


-- | Запрос на обновление товаров.
data UpdateOfferMappingEntryRequest = UpdateOfferMappingEntryRequest
  { updateOfferMappingEntryRequestOfferMappingEntries :: [UpdateOfferMappingEntryDTO] -- ^ Информация о товарах в каталоге.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingEntryRequest where
  parseJSON = genericParseJSON optionsUpdateOfferMappingEntryRequest
instance ToJSON UpdateOfferMappingEntryRequest where
  toJSON = genericToJSON optionsUpdateOfferMappingEntryRequest

optionsUpdateOfferMappingEntryRequest :: Options
optionsUpdateOfferMappingEntryRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingEntryRequestOfferMappingEntries", "offerMappingEntries")
      ]


-- | Ошибки и предупреждения, которые появились из-за переданных характеристик.
data UpdateOfferMappingResultDTO = UpdateOfferMappingResultDTO
  { updateOfferMappingResultDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateOfferMappingResultDTOErrors :: Maybe [OfferMappingErrorDTO] -- ^ Ошибки — информация в каталоге не обновится.
  , updateOfferMappingResultDTOWarnings :: Maybe [OfferMappingErrorDTO] -- ^ Предупреждения — информация в каталоге обновится.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingResultDTO where
  parseJSON = genericParseJSON optionsUpdateOfferMappingResultDTO
instance ToJSON UpdateOfferMappingResultDTO where
  toJSON = genericToJSON optionsUpdateOfferMappingResultDTO

optionsUpdateOfferMappingResultDTO :: Options
optionsUpdateOfferMappingResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingResultDTOOfferId", "offerId")
      , ("updateOfferMappingResultDTOErrors", "errors")
      , ("updateOfferMappingResultDTOWarnings", "warnings")
      ]


-- | 
data UpdateOfferMappingsRequest = UpdateOfferMappingsRequest
  { updateOfferMappingsRequestOfferMappings :: [UpdateOfferMappingDTO] -- ^ Перечень товаров, которые нужно добавить или обновить.
  , updateOfferMappingsRequestOnlyPartnerMediaContent :: Maybe Bool -- ^ Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingsRequest where
  parseJSON = genericParseJSON optionsUpdateOfferMappingsRequest
instance ToJSON UpdateOfferMappingsRequest where
  toJSON = genericToJSON optionsUpdateOfferMappingsRequest

optionsUpdateOfferMappingsRequest :: Options
optionsUpdateOfferMappingsRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingsRequestOfferMappings", "offerMappings")
      , ("updateOfferMappingsRequestOnlyPartnerMediaContent", "onlyPartnerMediaContent")
      ]


-- | Описывает проблемы, возникшие при сохранении товара.
data UpdateOfferMappingsResponse = UpdateOfferMappingsResponse
  { updateOfferMappingsResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , updateOfferMappingsResponseResults :: Maybe [UpdateOfferMappingResultDTO] -- ^ Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOfferMappingsResponse where
  parseJSON = genericParseJSON optionsUpdateOfferMappingsResponse
instance ToJSON UpdateOfferMappingsResponse where
  toJSON = genericToJSON optionsUpdateOfferMappingsResponse

optionsUpdateOfferMappingsResponse :: Options
optionsUpdateOfferMappingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOfferMappingsResponseStatus", "status")
      , ("updateOfferMappingsResponseResults", "results")
      ]


-- | Запрос на обновление состава заказа.
data UpdateOrderItemRequest = UpdateOrderItemRequest
  { updateOrderItemRequestItems :: [OrderItemModificationDTO] -- ^ Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
  , updateOrderItemRequestReason :: Maybe OrderItemsModificationRequestReasonType -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderItemRequest where
  parseJSON = genericParseJSON optionsUpdateOrderItemRequest
instance ToJSON UpdateOrderItemRequest where
  toJSON = genericToJSON optionsUpdateOrderItemRequest

optionsUpdateOrderItemRequest :: Options
optionsUpdateOrderItemRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderItemRequestItems", "items")
      , ("updateOrderItemRequestReason", "reason")
      ]


-- | Список заказов.
data UpdateOrderStatusDTO = UpdateOrderStatusDTO
  { updateOrderStatusDTOId :: Maybe Int64 -- ^ Идентификатор заказа.
  , updateOrderStatusDTOStatus :: Maybe OrderStatusType -- ^ 
  , updateOrderStatusDTOSubstatus :: Maybe OrderSubstatusType -- ^ 
  , updateOrderStatusDTOUpdateStatus :: Maybe OrderUpdateStatusType -- ^ 
  , updateOrderStatusDTOErrorDetails :: Maybe Text -- ^ Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusDTO where
  parseJSON = genericParseJSON optionsUpdateOrderStatusDTO
instance ToJSON UpdateOrderStatusDTO where
  toJSON = genericToJSON optionsUpdateOrderStatusDTO

optionsUpdateOrderStatusDTO :: Options
optionsUpdateOrderStatusDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusDTOId", "id")
      , ("updateOrderStatusDTOStatus", "status")
      , ("updateOrderStatusDTOSubstatus", "substatus")
      , ("updateOrderStatusDTOUpdateStatus", "updateStatus")
      , ("updateOrderStatusDTOErrorDetails", "errorDetails")
      ]


-- | 
data UpdateOrderStatusRequest = UpdateOrderStatusRequest
  { updateOrderStatusRequestOrder :: OrderStatusChangeDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusRequest where
  parseJSON = genericParseJSON optionsUpdateOrderStatusRequest
instance ToJSON UpdateOrderStatusRequest where
  toJSON = genericToJSON optionsUpdateOrderStatusRequest

optionsUpdateOrderStatusRequest :: Options
optionsUpdateOrderStatusRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusRequestOrder", "order")
      ]


-- | Информация об изменении статуса заказа.
data UpdateOrderStatusResponse = UpdateOrderStatusResponse
  { updateOrderStatusResponseOrder :: Maybe OrderDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusResponse where
  parseJSON = genericParseJSON optionsUpdateOrderStatusResponse
instance ToJSON UpdateOrderStatusResponse where
  toJSON = genericToJSON optionsUpdateOrderStatusResponse

optionsUpdateOrderStatusResponse :: Options
optionsUpdateOrderStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusResponseOrder", "order")
      ]


-- | Список заказов, статус которых обновился.
data UpdateOrderStatusesDTO = UpdateOrderStatusesDTO
  { updateOrderStatusesDTOOrders :: [UpdateOrderStatusDTO] -- ^ Список с обновленными заказами.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusesDTO where
  parseJSON = genericParseJSON optionsUpdateOrderStatusesDTO
instance ToJSON UpdateOrderStatusesDTO where
  toJSON = genericToJSON optionsUpdateOrderStatusesDTO

optionsUpdateOrderStatusesDTO :: Options
optionsUpdateOrderStatusesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusesDTOOrders", "orders")
      ]


-- | Список заказов.
data UpdateOrderStatusesRequest = UpdateOrderStatusesRequest
  { updateOrderStatusesRequestOrders :: [OrderStateDTO] -- ^ Список заказов.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusesRequest where
  parseJSON = genericParseJSON optionsUpdateOrderStatusesRequest
instance ToJSON UpdateOrderStatusesRequest where
  toJSON = genericToJSON optionsUpdateOrderStatusesRequest

optionsUpdateOrderStatusesRequest :: Options
optionsUpdateOrderStatusesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusesRequestOrders", "orders")
      ]


-- | 
data UpdateOrderStatusesResponse = UpdateOrderStatusesResponse
  { updateOrderStatusesResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , updateOrderStatusesResponseResult :: Maybe UpdateOrderStatusesDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStatusesResponse where
  parseJSON = genericParseJSON optionsUpdateOrderStatusesResponse
instance ToJSON UpdateOrderStatusesResponse where
  toJSON = genericToJSON optionsUpdateOrderStatusesResponse

optionsUpdateOrderStatusesResponse :: Options
optionsUpdateOrderStatusesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStatusesResponseStatus", "status")
      , ("updateOrderStatusesResponseResult", "result")
      ]


-- | Запрос на обновление срока хранения заказа в ПВЗ.
data UpdateOrderStorageLimitRequest = UpdateOrderStorageLimitRequest
  { updateOrderStorageLimitRequestNewDate :: Day -- ^ Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOrderStorageLimitRequest where
  parseJSON = genericParseJSON optionsUpdateOrderStorageLimitRequest
instance ToJSON UpdateOrderStorageLimitRequest where
  toJSON = genericToJSON optionsUpdateOrderStorageLimitRequest

optionsUpdateOrderStorageLimitRequest :: Options
optionsUpdateOrderStorageLimitRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOrderStorageLimitRequestNewDate", "newDate")
      ]


-- | Запрос на создание или изменение лицензий для точек продаж.
data UpdateOutletLicenseRequest = UpdateOutletLicenseRequest
  { updateOutletLicenseRequestLicenses :: [OutletLicenseDTO] -- ^ Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateOutletLicenseRequest where
  parseJSON = genericParseJSON optionsUpdateOutletLicenseRequest
instance ToJSON UpdateOutletLicenseRequest where
  toJSON = genericToJSON optionsUpdateOutletLicenseRequest

optionsUpdateOutletLicenseRequest :: Options
optionsUpdateOutletLicenseRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateOutletLicenseRequestLicenses", "licenses")
      ]


-- | Цена с указанием скидки.
data UpdatePriceWithDiscountDTO = UpdatePriceWithDiscountDTO
  { updatePriceWithDiscountDTOValue :: Double -- ^ Значение.
  , updatePriceWithDiscountDTOCurrencyId :: CurrencyType -- ^ 
  , updatePriceWithDiscountDTODiscountBase :: Maybe Double -- ^ Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePriceWithDiscountDTO where
  parseJSON = genericParseJSON optionsUpdatePriceWithDiscountDTO
instance ToJSON UpdatePriceWithDiscountDTO where
  toJSON = genericToJSON optionsUpdatePriceWithDiscountDTO

optionsUpdatePriceWithDiscountDTO :: Options
optionsUpdatePriceWithDiscountDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePriceWithDiscountDTOValue", "value")
      , ("updatePriceWithDiscountDTOCurrencyId", "currencyId")
      , ("updatePriceWithDiscountDTODiscountBase", "discountBase")
      ]


-- | Запрос на установку цен на товары.
data UpdatePricesRequest = UpdatePricesRequest
  { updatePricesRequestOffers :: [OfferPriceDTO] -- ^ Список товаров.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePricesRequest where
  parseJSON = genericParseJSON optionsUpdatePricesRequest
instance ToJSON UpdatePricesRequest where
  toJSON = genericToJSON optionsUpdatePricesRequest

optionsUpdatePricesRequest :: Options
optionsUpdatePricesRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePricesRequestOffers", "offers")
      ]


-- | Описание товаров, которые участвуют в акции.
data UpdatePromoOfferDTO = UpdatePromoOfferDTO
  { updatePromoOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updatePromoOfferDTOParams :: Maybe UpdatePromoOfferParamsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOfferDTO where
  parseJSON = genericParseJSON optionsUpdatePromoOfferDTO
instance ToJSON UpdatePromoOfferDTO where
  toJSON = genericToJSON optionsUpdatePromoOfferDTO

optionsUpdatePromoOfferDTO :: Options
optionsUpdatePromoOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOfferDTOOfferId", "offerId")
      , ("updatePromoOfferDTOParams", "params")
      ]


-- | Параметры товара в акции с типом &#x60;DIRECT_DISCOUNT&#x60; или &#x60;BLUE_FLASH&#x60;.  Обязательный параметр для акций с этими типами. 
data UpdatePromoOfferDiscountParamsDTO = UpdatePromoOfferDiscountParamsDTO
  { updatePromoOfferDiscountParamsDTOPrice :: Maybe Int64 -- ^ Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
  , updatePromoOfferDiscountParamsDTOPromoPrice :: Maybe Int64 -- ^ Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOfferDiscountParamsDTO where
  parseJSON = genericParseJSON optionsUpdatePromoOfferDiscountParamsDTO
instance ToJSON UpdatePromoOfferDiscountParamsDTO where
  toJSON = genericToJSON optionsUpdatePromoOfferDiscountParamsDTO

optionsUpdatePromoOfferDiscountParamsDTO :: Options
optionsUpdatePromoOfferDiscountParamsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOfferDiscountParamsDTOPrice", "price")
      , ("updatePromoOfferDiscountParamsDTOPromoPrice", "promoPrice")
      ]


-- | Параметры товара, который участвует в акции.
data UpdatePromoOfferParamsDTO = UpdatePromoOfferParamsDTO
  { updatePromoOfferParamsDTODiscountParams :: Maybe UpdatePromoOfferDiscountParamsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOfferParamsDTO where
  parseJSON = genericParseJSON optionsUpdatePromoOfferParamsDTO
instance ToJSON UpdatePromoOfferParamsDTO where
  toJSON = genericToJSON optionsUpdatePromoOfferParamsDTO

optionsUpdatePromoOfferParamsDTO :: Options
optionsUpdatePromoOfferParamsDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOfferParamsDTODiscountParams", "discountParams")
      ]


-- | Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
data UpdatePromoOffersRequest = UpdatePromoOffersRequest
  { updatePromoOffersRequestPromoId :: Text -- ^ Идентификатор акции.
  , updatePromoOffersRequestOffers :: [UpdatePromoOfferDTO] -- ^ Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOffersRequest where
  parseJSON = genericParseJSON optionsUpdatePromoOffersRequest
instance ToJSON UpdatePromoOffersRequest where
  toJSON = genericToJSON optionsUpdatePromoOffersRequest

optionsUpdatePromoOffersRequest :: Options
optionsUpdatePromoOffersRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOffersRequestPromoId", "promoId")
      , ("updatePromoOffersRequestOffers", "offers")
      ]


-- | Результат добавления товаров в акцию.
data UpdatePromoOffersResponse = UpdatePromoOffersResponse
  { updatePromoOffersResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , updatePromoOffersResponseResult :: Maybe UpdatePromoOffersResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOffersResponse where
  parseJSON = genericParseJSON optionsUpdatePromoOffersResponse
instance ToJSON UpdatePromoOffersResponse where
  toJSON = genericToJSON optionsUpdatePromoOffersResponse

optionsUpdatePromoOffersResponse :: Options
optionsUpdatePromoOffersResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOffersResponseStatus", "status")
      , ("updatePromoOffersResponseResult", "result")
      ]


-- | Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
data UpdatePromoOffersResultDTO = UpdatePromoOffersResultDTO
  { updatePromoOffersResultDTORejectedOffers :: Maybe [RejectedPromoOfferUpdateDTO] -- ^ Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
  , updatePromoOffersResultDTOWarningOffers :: Maybe [WarningPromoOfferUpdateDTO] -- ^ Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdatePromoOffersResultDTO where
  parseJSON = genericParseJSON optionsUpdatePromoOffersResultDTO
instance ToJSON UpdatePromoOffersResultDTO where
  toJSON = genericToJSON optionsUpdatePromoOffersResultDTO

optionsUpdatePromoOffersResultDTO :: Options
optionsUpdatePromoOffersResultDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updatePromoOffersResultDTORejectedOffers", "rejectedOffers")
      , ("updatePromoOffersResultDTOWarningOffers", "warningOffers")
      ]


-- | Информация об остатках одного товара на одном из складов.
data UpdateStockDTO = UpdateStockDTO
  { updateStockDTOSku :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , updateStockDTOItems :: [UpdateStockItemDTO] -- ^ Информация об остатках товара. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateStockDTO where
  parseJSON = genericParseJSON optionsUpdateStockDTO
instance ToJSON UpdateStockDTO where
  toJSON = genericToJSON optionsUpdateStockDTO

optionsUpdateStockDTO :: Options
optionsUpdateStockDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateStockDTOSku", "sku")
      , ("updateStockDTOItems", "items")
      ]


-- | Информация об остатках товара. 
data UpdateStockItemDTO = UpdateStockItemDTO
  { updateStockItemDTOCount :: Int64 -- ^ Количество доступного товара. 
  , updateStockItemDTOUpdatedAt :: Maybe UTCTime -- ^ Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateStockItemDTO where
  parseJSON = genericParseJSON optionsUpdateStockItemDTO
instance ToJSON UpdateStockItemDTO where
  toJSON = genericToJSON optionsUpdateStockItemDTO

optionsUpdateStockItemDTO :: Options
optionsUpdateStockItemDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateStockItemDTOCount", "count")
      , ("updateStockItemDTOUpdatedAt", "updatedAt")
      ]


-- | Запрос на изменение информации по остаткам товаров.
data UpdateStocksRequest = UpdateStocksRequest
  { updateStocksRequestSkus :: [UpdateStockDTO] -- ^ Данные об остатках товаров. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateStocksRequest where
  parseJSON = genericParseJSON optionsUpdateStocksRequest
instance ToJSON UpdateStocksRequest where
  toJSON = genericToJSON optionsUpdateStocksRequest

optionsUpdateStocksRequest :: Options
optionsUpdateStocksRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateStocksRequestSkus", "skus")
      ]


-- | Время последнего обновления.
data UpdateTimeDTO = UpdateTimeDTO
  { updateTimeDTOUpdatedAt :: UTCTime -- ^ Время последнего обновления.
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateTimeDTO where
  parseJSON = genericParseJSON optionsUpdateTimeDTO
instance ToJSON UpdateTimeDTO where
  toJSON = genericToJSON optionsUpdateTimeDTO

optionsUpdateTimeDTO :: Options
optionsUpdateTimeDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateTimeDTOUpdatedAt", "updatedAt")
      ]


-- | Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
data ValueRestrictionDTO = ValueRestrictionDTO
  { valueRestrictionDTOLimitingParameterId :: Int64 -- ^ Идентификатор ограничивающей характеристики.
  , valueRestrictionDTOLimitedValues :: [OptionValuesLimitedDTO] -- ^ Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
  } deriving (Show, Eq, Generic)

instance FromJSON ValueRestrictionDTO where
  parseJSON = genericParseJSON optionsValueRestrictionDTO
instance ToJSON ValueRestrictionDTO where
  toJSON = genericToJSON optionsValueRestrictionDTO

optionsValueRestrictionDTO :: Options
optionsValueRestrictionDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("valueRestrictionDTOLimitingParameterId", "limitingParameterId")
      , ("valueRestrictionDTOLimitedValues", "limitedValues")
      ]


-- | 
data VerifyOrderEacRequest = VerifyOrderEacRequest
  { verifyOrderEacRequestCode :: Maybe Text -- ^ Код для подтверждения ЭАПП.
  } deriving (Show, Eq, Generic)

instance FromJSON VerifyOrderEacRequest where
  parseJSON = genericParseJSON optionsVerifyOrderEacRequest
instance ToJSON VerifyOrderEacRequest where
  toJSON = genericToJSON optionsVerifyOrderEacRequest

optionsVerifyOrderEacRequest :: Options
optionsVerifyOrderEacRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("verifyOrderEacRequestCode", "code")
      ]


-- | 
data VerifyOrderEacResponse = VerifyOrderEacResponse
  { verifyOrderEacResponseStatus :: Maybe ApiResponseStatusType -- ^ 
  , verifyOrderEacResponseResult :: Maybe EacVerificationResultDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON VerifyOrderEacResponse where
  parseJSON = genericParseJSON optionsVerifyOrderEacResponse
instance ToJSON VerifyOrderEacResponse where
  toJSON = genericToJSON optionsVerifyOrderEacResponse

optionsVerifyOrderEacResponse :: Options
optionsVerifyOrderEacResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("verifyOrderEacResponseStatus", "status")
      , ("verifyOrderEacResponseResult", "result")
      ]


-- | Адрес склада.
data WarehouseAddressDTO = WarehouseAddressDTO
  { warehouseAddressDTOCity :: Text -- ^ Город.
  , warehouseAddressDTOStreet :: Maybe Text -- ^ Улица.
  , warehouseAddressDTONumber :: Maybe Text -- ^ Номер дома.
  , warehouseAddressDTOBuilding :: Maybe Text -- ^ Номер строения.
  , warehouseAddressDTOBlock :: Maybe Text -- ^ Номер корпуса.
  , warehouseAddressDTOGps :: GpsDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseAddressDTO where
  parseJSON = genericParseJSON optionsWarehouseAddressDTO
instance ToJSON WarehouseAddressDTO where
  toJSON = genericToJSON optionsWarehouseAddressDTO

optionsWarehouseAddressDTO :: Options
optionsWarehouseAddressDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseAddressDTOCity", "city")
      , ("warehouseAddressDTOStreet", "street")
      , ("warehouseAddressDTONumber", "number")
      , ("warehouseAddressDTOBuilding", "building")
      , ("warehouseAddressDTOBlock", "block")
      , ("warehouseAddressDTOGps", "gps")
      ]


-- | Информация о складе.
data WarehouseDTO = WarehouseDTO
  { warehouseDTOId :: Int64 -- ^ Идентификатор склада.
  , warehouseDTOName :: Text -- ^ Название склада.
  , warehouseDTOCampaignId :: Int64 -- ^ Идентификатор кампании в API и идентификатор магазина.
  , warehouseDTOExpress :: Bool -- ^ Возможна ли доставка по модели Экспресс.
  , warehouseDTOAddress :: Maybe WarehouseAddressDTO -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseDTO where
  parseJSON = genericParseJSON optionsWarehouseDTO
instance ToJSON WarehouseDTO where
  toJSON = genericToJSON optionsWarehouseDTO

optionsWarehouseDTO :: Options
optionsWarehouseDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseDTOId", "id")
      , ("warehouseDTOName", "name")
      , ("warehouseDTOCampaignId", "campaignId")
      , ("warehouseDTOExpress", "express")
      , ("warehouseDTOAddress", "address")
      ]


-- | Информация о группе складов.
data WarehouseGroupDTO = WarehouseGroupDTO
  { warehouseGroupDTOName :: Text -- ^ Название группы складов.
  , warehouseGroupDTOMainWarehouse :: WarehouseDTO -- ^ 
  , warehouseGroupDTOWarehouses :: [WarehouseDTO] -- ^ Список складов, входящих в группу.
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseGroupDTO where
  parseJSON = genericParseJSON optionsWarehouseGroupDTO
instance ToJSON WarehouseGroupDTO where
  toJSON = genericToJSON optionsWarehouseGroupDTO

optionsWarehouseGroupDTO :: Options
optionsWarehouseGroupDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseGroupDTOName", "name")
      , ("warehouseGroupDTOMainWarehouse", "mainWarehouse")
      , ("warehouseGroupDTOWarehouses", "warehouses")
      ]


-- | Информация об остатках товара.
data WarehouseOfferDTO = WarehouseOfferDTO
  { warehouseOfferDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , warehouseOfferDTOTurnoverSummary :: Maybe TurnoverDTO -- ^ 
  , warehouseOfferDTOStocks :: [WarehouseStockDTO] -- ^ Информация об остатках.
  , warehouseOfferDTOUpdatedAt :: Maybe UTCTime -- ^ Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseOfferDTO where
  parseJSON = genericParseJSON optionsWarehouseOfferDTO
instance ToJSON WarehouseOfferDTO where
  toJSON = genericToJSON optionsWarehouseOfferDTO

optionsWarehouseOfferDTO :: Options
optionsWarehouseOfferDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseOfferDTOOfferId", "offerId")
      , ("warehouseOfferDTOTurnoverSummary", "turnoverSummary")
      , ("warehouseOfferDTOStocks", "stocks")
      , ("warehouseOfferDTOUpdatedAt", "updatedAt")
      ]


-- | Информация об остатках товаров на складе.
data WarehouseOffersDTO = WarehouseOffersDTO
  { warehouseOffersDTOWarehouseId :: Int64 -- ^ Идентификатор склада.
  , warehouseOffersDTOOffers :: [WarehouseOfferDTO] -- ^ Информация об остатках.
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseOffersDTO where
  parseJSON = genericParseJSON optionsWarehouseOffersDTO
instance ToJSON WarehouseOffersDTO where
  toJSON = genericToJSON optionsWarehouseOffersDTO

optionsWarehouseOffersDTO :: Options
optionsWarehouseOffersDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseOffersDTOWarehouseId", "warehouseId")
      , ("warehouseOffersDTOOffers", "offers")
      ]


-- | Информация об остатках товара.
data WarehouseStockDTO = WarehouseStockDTO
  { warehouseStockDTOType :: WarehouseStockType -- ^ 
  , warehouseStockDTOCount :: Int64 -- ^ Значение остатков.
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseStockDTO where
  parseJSON = genericParseJSON optionsWarehouseStockDTO
instance ToJSON WarehouseStockDTO where
  toJSON = genericToJSON optionsWarehouseStockDTO

optionsWarehouseStockDTO :: Options
optionsWarehouseStockDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehouseStockDTOType", "type")
      , ("warehouseStockDTOCount", "count")
      ]


-- | Тип остатков товаров на складе:  * &#x60;AVAILABLE&#x60; (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * &#x60;DEFECT&#x60; (соответствует типу «Брак») — товар с браком.  * &#x60;EXPIRED&#x60; (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * &#x60;FIT&#x60; (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * &#x60;FREEZE&#x60; — товар, который зарезервирован для заказов.  * &#x60;QUARANTINE&#x60; (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * &#x60;UTILIZATION&#x60; — товар, который будет утилизирован. 
data WarehouseStockType = WarehouseStockType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON WarehouseStockType where
  parseJSON = genericParseJSON optionsWarehouseStockType
instance ToJSON WarehouseStockType where
  toJSON = genericToJSON optionsWarehouseStockType

optionsWarehouseStockType :: Options
optionsWarehouseStockType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Информация о складах и группах складов.
data WarehousesDTO = WarehousesDTO
  { warehousesDTOWarehouses :: [WarehouseDTO] -- ^ Список складов, не входящих в группы.
  , warehousesDTOWarehouseGroups :: [WarehouseGroupDTO] -- ^ Список групп складов.
  } deriving (Show, Eq, Generic)

instance FromJSON WarehousesDTO where
  parseJSON = genericParseJSON optionsWarehousesDTO
instance ToJSON WarehousesDTO where
  toJSON = genericToJSON optionsWarehousesDTO

optionsWarehousesDTO :: Options
optionsWarehousesDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warehousesDTOWarehouses", "warehouses")
      , ("warehousesDTOWarehouseGroups", "warehouseGroups")
      ]


-- | Описание предупреждения, которое появилось при добавлении товара.
data WarningPromoOfferUpdateDTO = WarningPromoOfferUpdateDTO
  { warningPromoOfferUpdateDTOOfferId :: Text -- ^ Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  , warningPromoOfferUpdateDTOWarnings :: [PromoOfferUpdateWarningDTO] -- ^ Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
  } deriving (Show, Eq, Generic)

instance FromJSON WarningPromoOfferUpdateDTO where
  parseJSON = genericParseJSON optionsWarningPromoOfferUpdateDTO
instance ToJSON WarningPromoOfferUpdateDTO where
  toJSON = genericToJSON optionsWarningPromoOfferUpdateDTO

optionsWarningPromoOfferUpdateDTO :: Options
optionsWarningPromoOfferUpdateDTO =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("warningPromoOfferUpdateDTOOfferId", "offerId")
      , ("warningPromoOfferUpdateDTOWarnings", "warnings")
      ]

