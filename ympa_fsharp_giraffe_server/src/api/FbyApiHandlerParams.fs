namespace ympa_fsharp_giraffe_server

open ympa_fsharp_giraffe_server.Model.AddHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveRequest
open ympa_fsharp_giraffe_server.Model.AddOffersToArchiveResponse
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CalculateTariffsRequest
open ympa_fsharp_giraffe_server.Model.CalculateTariffsResponse
open ympa_fsharp_giraffe_server.Model.ConfirmPricesRequest
open ympa_fsharp_giraffe_server.Model.CreateChatRequest
open ympa_fsharp_giraffe_server.Model.CreateChatResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.DeleteGoodsFeedbackCommentRequest
open ympa_fsharp_giraffe_server.Model.DeleteHiddenOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersFromArchiveResponse
open ympa_fsharp_giraffe_server.Model.DeleteOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteOffersResponse
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.DeletePromoOffersResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.FeedIndexLogsStatusType
open ympa_fsharp_giraffe_server.Model.GenerateBoostConsolidatedRequest
open ympa_fsharp_giraffe_server.Model.GenerateCompetitorsPositionReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsFeedbackRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsMovementReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsRealizationReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateGoodsTurnoverRequest
open ympa_fsharp_giraffe_server.Model.GeneratePricesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateReportResponse
open ympa_fsharp_giraffe_server.Model.GenerateShelfsStatisticsRequest
open ympa_fsharp_giraffe_server.Model.GenerateShowsSalesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateStocksOnWarehousesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedMarketplaceServicesReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedNettingReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateUnitedOrdersRequest
open ympa_fsharp_giraffe_server.Model.GetAllOffersResponse
open ympa_fsharp_giraffe_server.Model.GetBidsInfoRequest
open ympa_fsharp_giraffe_server.Model.GetBidsInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetBidsRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessBuyerInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessDocumentsInfoResponse
open ympa_fsharp_giraffe_server.Model.GetBusinessSettingsResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignLoginsResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignRegionResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignSettingsResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignsResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesMaxSaleQuantumResponse
open ympa_fsharp_giraffe_server.Model.GetCategoriesRequest
open ympa_fsharp_giraffe_server.Model.GetCategoriesResponse
open ympa_fsharp_giraffe_server.Model.GetCategoryContentParametersResponse
open ympa_fsharp_giraffe_server.Model.GetChatHistoryRequest
open ympa_fsharp_giraffe_server.Model.GetChatHistoryResponse
open ympa_fsharp_giraffe_server.Model.GetChatsRequest
open ympa_fsharp_giraffe_server.Model.GetChatsResponse
open ympa_fsharp_giraffe_server.Model.GetFeedIndexLogsResponse
open ympa_fsharp_giraffe_server.Model.GetFeedResponse
open ympa_fsharp_giraffe_server.Model.GetFeedbackListResponse
open ympa_fsharp_giraffe_server.Model.GetFeedsResponse
open ympa_fsharp_giraffe_server.Model.GetFulfillmentWarehousesResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackCommentsRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackCommentsResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsFeedbackResponse
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsRequest
open ympa_fsharp_giraffe_server.Model.GetGoodsStatsResponse
open ympa_fsharp_giraffe_server.Model.GetHiddenOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusRequest
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.GetOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOrderResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersResponse
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsRequest
open ympa_fsharp_giraffe_server.Model.GetOrdersStatsResponse
open ympa_fsharp_giraffe_server.Model.GetPricesByOfferIdsRequest
open ympa_fsharp_giraffe_server.Model.GetPricesByOfferIdsResponse
open ympa_fsharp_giraffe_server.Model.GetPricesResponse
open ympa_fsharp_giraffe_server.Model.GetPromoOffersRequest
open ympa_fsharp_giraffe_server.Model.GetPromoOffersResponse
open ympa_fsharp_giraffe_server.Model.GetPromosRequest
open ympa_fsharp_giraffe_server.Model.GetPromosResponse
open ympa_fsharp_giraffe_server.Model.GetQualityRatingRequest
open ympa_fsharp_giraffe_server.Model.GetQualityRatingResponse
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersRequest
open ympa_fsharp_giraffe_server.Model.GetQuarantineOffersResponse
open ympa_fsharp_giraffe_server.Model.GetRegionWithChildrenResponse
open ympa_fsharp_giraffe_server.Model.GetRegionsResponse
open ympa_fsharp_giraffe_server.Model.GetReportInfoResponse
open ympa_fsharp_giraffe_server.Model.GetReturnResponse
open ympa_fsharp_giraffe_server.Model.GetReturnsResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingEntriesResponse
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.GetSuggestedOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksRequest
open ympa_fsharp_giraffe_server.Model.GetWarehouseStocksResponse
open ympa_fsharp_giraffe_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingKindType
open ympa_fsharp_giraffe_server.Model.OfferProcessingStatusType
open ympa_fsharp_giraffe_server.Model.OrderBuyerType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.PutSkuBidsRequest
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReportFormatType
open ympa_fsharp_giraffe_server.Model.ReturnType
open ympa_fsharp_giraffe_server.Model.SendMessageToChatRequest
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.SetFeedParamsRequest
open ympa_fsharp_giraffe_server.Model.SkipGoodsFeedbackReactionRequest
open ympa_fsharp_giraffe_server.Model.SuggestPricesRequest
open ympa_fsharp_giraffe_server.Model.SuggestPricesResponse
open ympa_fsharp_giraffe_server.Model.UpdateBusinessPricesRequest
open ympa_fsharp_giraffe_server.Model.UpdateCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.UpdateGoodsFeedbackCommentRequest
open ympa_fsharp_giraffe_server.Model.UpdateGoodsFeedbackCommentResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingEntryRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferMappingsResponse
open ympa_fsharp_giraffe_server.Model.UpdatePricesRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersResponse
open System.Collections.Generic
open System

module FbyApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AddHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AddHiddenOffersBodyParams = AddHiddenOffersRequest
    //#endregion


    type AddHiddenOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type AddHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type AddHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type AddHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type AddHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type AddHiddenOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type AddHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type AddHiddenOffersResult = AddHiddenOffersStatusCode200 of AddHiddenOffersStatusCode200Response|AddHiddenOffersStatusCode400 of AddHiddenOffersStatusCode400Response|AddHiddenOffersStatusCode401 of AddHiddenOffersStatusCode401Response|AddHiddenOffersStatusCode403 of AddHiddenOffersStatusCode403Response|AddHiddenOffersStatusCode420 of AddHiddenOffersStatusCode420Response|AddHiddenOffersStatusCode423 of AddHiddenOffersStatusCode423Response|AddHiddenOffersStatusCode500 of AddHiddenOffersStatusCode500Response

    type AddHiddenOffersArgs = {
      pathParams:AddHiddenOffersPathParams;
      bodyParams:AddHiddenOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AddOffersToArchivePathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AddOffersToArchiveBodyParams = AddOffersToArchiveRequest
    //#endregion


    type AddOffersToArchiveStatusCode200Response = {
      content:AddOffersToArchiveResponse;
      
    }

    type AddOffersToArchiveStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type AddOffersToArchiveStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type AddOffersToArchiveResult = AddOffersToArchiveStatusCode200 of AddOffersToArchiveStatusCode200Response|AddOffersToArchiveStatusCode400 of AddOffersToArchiveStatusCode400Response|AddOffersToArchiveStatusCode401 of AddOffersToArchiveStatusCode401Response|AddOffersToArchiveStatusCode403 of AddOffersToArchiveStatusCode403Response|AddOffersToArchiveStatusCode404 of AddOffersToArchiveStatusCode404Response|AddOffersToArchiveStatusCode420 of AddOffersToArchiveStatusCode420Response|AddOffersToArchiveStatusCode423 of AddOffersToArchiveStatusCode423Response|AddOffersToArchiveStatusCode500 of AddOffersToArchiveStatusCode500Response

    type AddOffersToArchiveArgs = {
      pathParams:AddOffersToArchivePathParams;
      bodyParams:AddOffersToArchiveBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type CalculateTariffsBodyParams = CalculateTariffsRequest
    //#endregion


    type CalculateTariffsStatusCode200Response = {
      content:CalculateTariffsResponse;
      
    }

    type CalculateTariffsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type CalculateTariffsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type CalculateTariffsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type CalculateTariffsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type CalculateTariffsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type CalculateTariffsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type CalculateTariffsResult = CalculateTariffsStatusCode200 of CalculateTariffsStatusCode200Response|CalculateTariffsStatusCode400 of CalculateTariffsStatusCode400Response|CalculateTariffsStatusCode401 of CalculateTariffsStatusCode401Response|CalculateTariffsStatusCode403 of CalculateTariffsStatusCode403Response|CalculateTariffsStatusCode404 of CalculateTariffsStatusCode404Response|CalculateTariffsStatusCode420 of CalculateTariffsStatusCode420Response|CalculateTariffsStatusCode500 of CalculateTariffsStatusCode500Response

    type CalculateTariffsArgs = {
      bodyParams:CalculateTariffsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConfirmBusinessPricesPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConfirmBusinessPricesBodyParams = ConfirmPricesRequest
    //#endregion


    type ConfirmBusinessPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ConfirmBusinessPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type ConfirmBusinessPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ConfirmBusinessPricesResult = ConfirmBusinessPricesStatusCode200 of ConfirmBusinessPricesStatusCode200Response|ConfirmBusinessPricesStatusCode400 of ConfirmBusinessPricesStatusCode400Response|ConfirmBusinessPricesStatusCode401 of ConfirmBusinessPricesStatusCode401Response|ConfirmBusinessPricesStatusCode403 of ConfirmBusinessPricesStatusCode403Response|ConfirmBusinessPricesStatusCode404 of ConfirmBusinessPricesStatusCode404Response|ConfirmBusinessPricesStatusCode420 of ConfirmBusinessPricesStatusCode420Response|ConfirmBusinessPricesStatusCode423 of ConfirmBusinessPricesStatusCode423Response|ConfirmBusinessPricesStatusCode500 of ConfirmBusinessPricesStatusCode500Response

    type ConfirmBusinessPricesArgs = {
      pathParams:ConfirmBusinessPricesPathParams;
      bodyParams:ConfirmBusinessPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ConfirmCampaignPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ConfirmCampaignPricesBodyParams = ConfirmPricesRequest
    //#endregion


    type ConfirmCampaignPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type ConfirmCampaignPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type ConfirmCampaignPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type ConfirmCampaignPricesResult = ConfirmCampaignPricesStatusCode200 of ConfirmCampaignPricesStatusCode200Response|ConfirmCampaignPricesStatusCode400 of ConfirmCampaignPricesStatusCode400Response|ConfirmCampaignPricesStatusCode401 of ConfirmCampaignPricesStatusCode401Response|ConfirmCampaignPricesStatusCode403 of ConfirmCampaignPricesStatusCode403Response|ConfirmCampaignPricesStatusCode404 of ConfirmCampaignPricesStatusCode404Response|ConfirmCampaignPricesStatusCode420 of ConfirmCampaignPricesStatusCode420Response|ConfirmCampaignPricesStatusCode423 of ConfirmCampaignPricesStatusCode423Response|ConfirmCampaignPricesStatusCode500 of ConfirmCampaignPricesStatusCode500Response

    type ConfirmCampaignPricesArgs = {
      pathParams:ConfirmCampaignPricesPathParams;
      bodyParams:ConfirmCampaignPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CreateChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CreateChatBodyParams = CreateChatRequest
    //#endregion


    type CreateChatStatusCode200Response = {
      content:CreateChatResponse;
      
    }

    type CreateChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type CreateChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type CreateChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type CreateChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type CreateChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type CreateChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type CreateChatResult = CreateChatStatusCode200 of CreateChatStatusCode200Response|CreateChatStatusCode400 of CreateChatStatusCode400Response|CreateChatStatusCode401 of CreateChatStatusCode401Response|CreateChatStatusCode403 of CreateChatStatusCode403Response|CreateChatStatusCode404 of CreateChatStatusCode404Response|CreateChatStatusCode420 of CreateChatStatusCode420Response|CreateChatStatusCode500 of CreateChatStatusCode500Response

    type CreateChatArgs = {
      pathParams:CreateChatPathParams;
      bodyParams:CreateChatBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteCampaignOffersBodyParams = DeleteCampaignOffersRequest
    //#endregion


    type DeleteCampaignOffersStatusCode200Response = {
      content:DeleteCampaignOffersResponse;
      
    }

    type DeleteCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteCampaignOffersResult = DeleteCampaignOffersStatusCode200 of DeleteCampaignOffersStatusCode200Response|DeleteCampaignOffersStatusCode400 of DeleteCampaignOffersStatusCode400Response|DeleteCampaignOffersStatusCode401 of DeleteCampaignOffersStatusCode401Response|DeleteCampaignOffersStatusCode403 of DeleteCampaignOffersStatusCode403Response|DeleteCampaignOffersStatusCode404 of DeleteCampaignOffersStatusCode404Response|DeleteCampaignOffersStatusCode420 of DeleteCampaignOffersStatusCode420Response|DeleteCampaignOffersStatusCode423 of DeleteCampaignOffersStatusCode423Response|DeleteCampaignOffersStatusCode500 of DeleteCampaignOffersStatusCode500Response

    type DeleteCampaignOffersArgs = {
      pathParams:DeleteCampaignOffersPathParams;
      bodyParams:DeleteCampaignOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteGoodsFeedbackCommentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteGoodsFeedbackCommentBodyParams = DeleteGoodsFeedbackCommentRequest
    //#endregion


    type DeleteGoodsFeedbackCommentStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteGoodsFeedbackCommentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteGoodsFeedbackCommentResult = DeleteGoodsFeedbackCommentStatusCode200 of DeleteGoodsFeedbackCommentStatusCode200Response|DeleteGoodsFeedbackCommentStatusCode400 of DeleteGoodsFeedbackCommentStatusCode400Response|DeleteGoodsFeedbackCommentStatusCode401 of DeleteGoodsFeedbackCommentStatusCode401Response|DeleteGoodsFeedbackCommentStatusCode403 of DeleteGoodsFeedbackCommentStatusCode403Response|DeleteGoodsFeedbackCommentStatusCode404 of DeleteGoodsFeedbackCommentStatusCode404Response|DeleteGoodsFeedbackCommentStatusCode420 of DeleteGoodsFeedbackCommentStatusCode420Response|DeleteGoodsFeedbackCommentStatusCode500 of DeleteGoodsFeedbackCommentStatusCode500Response

    type DeleteGoodsFeedbackCommentArgs = {
      pathParams:DeleteGoodsFeedbackCommentPathParams;
      bodyParams:DeleteGoodsFeedbackCommentBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteHiddenOffersBodyParams = DeleteHiddenOffersRequest
    //#endregion


    type DeleteHiddenOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type DeleteHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteHiddenOffersResult = DeleteHiddenOffersStatusCode200 of DeleteHiddenOffersStatusCode200Response|DeleteHiddenOffersStatusCode400 of DeleteHiddenOffersStatusCode400Response|DeleteHiddenOffersStatusCode401 of DeleteHiddenOffersStatusCode401Response|DeleteHiddenOffersStatusCode403 of DeleteHiddenOffersStatusCode403Response|DeleteHiddenOffersStatusCode404 of DeleteHiddenOffersStatusCode404Response|DeleteHiddenOffersStatusCode420 of DeleteHiddenOffersStatusCode420Response|DeleteHiddenOffersStatusCode423 of DeleteHiddenOffersStatusCode423Response|DeleteHiddenOffersStatusCode500 of DeleteHiddenOffersStatusCode500Response

    type DeleteHiddenOffersArgs = {
      pathParams:DeleteHiddenOffersPathParams;
      bodyParams:DeleteHiddenOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteOffersBodyParams = DeleteOffersRequest
    //#endregion


    type DeleteOffersStatusCode200Response = {
      content:DeleteOffersResponse;
      
    }

    type DeleteOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOffersResult = DeleteOffersStatusCode200 of DeleteOffersStatusCode200Response|DeleteOffersStatusCode400 of DeleteOffersStatusCode400Response|DeleteOffersStatusCode401 of DeleteOffersStatusCode401Response|DeleteOffersStatusCode403 of DeleteOffersStatusCode403Response|DeleteOffersStatusCode404 of DeleteOffersStatusCode404Response|DeleteOffersStatusCode420 of DeleteOffersStatusCode420Response|DeleteOffersStatusCode423 of DeleteOffersStatusCode423Response|DeleteOffersStatusCode500 of DeleteOffersStatusCode500Response

    type DeleteOffersArgs = {
      pathParams:DeleteOffersPathParams;
      bodyParams:DeleteOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeleteOffersFromArchivePathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeleteOffersFromArchiveBodyParams = DeleteOffersFromArchiveRequest
    //#endregion


    type DeleteOffersFromArchiveStatusCode200Response = {
      content:DeleteOffersFromArchiveResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type DeleteOffersFromArchiveStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeleteOffersFromArchiveResult = DeleteOffersFromArchiveStatusCode200 of DeleteOffersFromArchiveStatusCode200Response|DeleteOffersFromArchiveStatusCode400 of DeleteOffersFromArchiveStatusCode400Response|DeleteOffersFromArchiveStatusCode401 of DeleteOffersFromArchiveStatusCode401Response|DeleteOffersFromArchiveStatusCode403 of DeleteOffersFromArchiveStatusCode403Response|DeleteOffersFromArchiveStatusCode404 of DeleteOffersFromArchiveStatusCode404Response|DeleteOffersFromArchiveStatusCode420 of DeleteOffersFromArchiveStatusCode420Response|DeleteOffersFromArchiveStatusCode423 of DeleteOffersFromArchiveStatusCode423Response|DeleteOffersFromArchiveStatusCode500 of DeleteOffersFromArchiveStatusCode500Response

    type DeleteOffersFromArchiveArgs = {
      pathParams:DeleteOffersFromArchivePathParams;
      bodyParams:DeleteOffersFromArchiveBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type DeletePromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type DeletePromoOffersBodyParams = DeletePromoOffersRequest
    //#endregion


    type DeletePromoOffersStatusCode200Response = {
      content:DeletePromoOffersResponse;
      
    }

    type DeletePromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type DeletePromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type DeletePromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type DeletePromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type DeletePromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type DeletePromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type DeletePromoOffersResult = DeletePromoOffersStatusCode200 of DeletePromoOffersStatusCode200Response|DeletePromoOffersStatusCode400 of DeletePromoOffersStatusCode400Response|DeletePromoOffersStatusCode401 of DeletePromoOffersStatusCode401Response|DeletePromoOffersStatusCode403 of DeletePromoOffersStatusCode403Response|DeletePromoOffersStatusCode404 of DeletePromoOffersStatusCode404Response|DeletePromoOffersStatusCode420 of DeletePromoOffersStatusCode420Response|DeletePromoOffersStatusCode500 of DeletePromoOffersStatusCode500Response

    type DeletePromoOffersArgs = {
      pathParams:DeletePromoOffersPathParams;
      bodyParams:DeletePromoOffersBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateBoostConsolidatedReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateBoostConsolidatedReportBodyParams = GenerateBoostConsolidatedRequest
    //#endregion


    type GenerateBoostConsolidatedReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateBoostConsolidatedReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateBoostConsolidatedReportResult = GenerateBoostConsolidatedReportStatusCode200 of GenerateBoostConsolidatedReportStatusCode200Response|GenerateBoostConsolidatedReportStatusCode400 of GenerateBoostConsolidatedReportStatusCode400Response|GenerateBoostConsolidatedReportStatusCode401 of GenerateBoostConsolidatedReportStatusCode401Response|GenerateBoostConsolidatedReportStatusCode403 of GenerateBoostConsolidatedReportStatusCode403Response|GenerateBoostConsolidatedReportStatusCode420 of GenerateBoostConsolidatedReportStatusCode420Response|GenerateBoostConsolidatedReportStatusCode500 of GenerateBoostConsolidatedReportStatusCode500Response

    type GenerateBoostConsolidatedReportArgs = {
      queryParams:Result<GenerateBoostConsolidatedReportQueryParams,string>;
      bodyParams:GenerateBoostConsolidatedReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateCompetitorsPositionReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateCompetitorsPositionReportBodyParams = GenerateCompetitorsPositionReportRequest
    //#endregion


    type GenerateCompetitorsPositionReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateCompetitorsPositionReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateCompetitorsPositionReportResult = GenerateCompetitorsPositionReportStatusCode200 of GenerateCompetitorsPositionReportStatusCode200Response|GenerateCompetitorsPositionReportStatusCode400 of GenerateCompetitorsPositionReportStatusCode400Response|GenerateCompetitorsPositionReportStatusCode401 of GenerateCompetitorsPositionReportStatusCode401Response|GenerateCompetitorsPositionReportStatusCode403 of GenerateCompetitorsPositionReportStatusCode403Response|GenerateCompetitorsPositionReportStatusCode420 of GenerateCompetitorsPositionReportStatusCode420Response|GenerateCompetitorsPositionReportStatusCode500 of GenerateCompetitorsPositionReportStatusCode500Response

    type GenerateCompetitorsPositionReportArgs = {
      queryParams:Result<GenerateCompetitorsPositionReportQueryParams,string>;
      bodyParams:GenerateCompetitorsPositionReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsFeedbackReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsFeedbackReportBodyParams = GenerateGoodsFeedbackRequest
    //#endregion


    type GenerateGoodsFeedbackReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsFeedbackReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsFeedbackReportResult = GenerateGoodsFeedbackReportStatusCode200 of GenerateGoodsFeedbackReportStatusCode200Response|GenerateGoodsFeedbackReportStatusCode400 of GenerateGoodsFeedbackReportStatusCode400Response|GenerateGoodsFeedbackReportStatusCode401 of GenerateGoodsFeedbackReportStatusCode401Response|GenerateGoodsFeedbackReportStatusCode403 of GenerateGoodsFeedbackReportStatusCode403Response|GenerateGoodsFeedbackReportStatusCode420 of GenerateGoodsFeedbackReportStatusCode420Response|GenerateGoodsFeedbackReportStatusCode500 of GenerateGoodsFeedbackReportStatusCode500Response

    type GenerateGoodsFeedbackReportArgs = {
      queryParams:Result<GenerateGoodsFeedbackReportQueryParams,string>;
      bodyParams:GenerateGoodsFeedbackReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsMovementReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsMovementReportBodyParams = GenerateGoodsMovementReportRequest
    //#endregion


    type GenerateGoodsMovementReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsMovementReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsMovementReportResult = GenerateGoodsMovementReportStatusCode200 of GenerateGoodsMovementReportStatusCode200Response|GenerateGoodsMovementReportStatusCode400 of GenerateGoodsMovementReportStatusCode400Response|GenerateGoodsMovementReportStatusCode401 of GenerateGoodsMovementReportStatusCode401Response|GenerateGoodsMovementReportStatusCode403 of GenerateGoodsMovementReportStatusCode403Response|GenerateGoodsMovementReportStatusCode420 of GenerateGoodsMovementReportStatusCode420Response|GenerateGoodsMovementReportStatusCode500 of GenerateGoodsMovementReportStatusCode500Response

    type GenerateGoodsMovementReportArgs = {
      queryParams:Result<GenerateGoodsMovementReportQueryParams,string>;
      bodyParams:GenerateGoodsMovementReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsRealizationReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsRealizationReportBodyParams = GenerateGoodsRealizationReportRequest
    //#endregion


    type GenerateGoodsRealizationReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsRealizationReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsRealizationReportResult = GenerateGoodsRealizationReportStatusCode200 of GenerateGoodsRealizationReportStatusCode200Response|GenerateGoodsRealizationReportStatusCode400 of GenerateGoodsRealizationReportStatusCode400Response|GenerateGoodsRealizationReportStatusCode401 of GenerateGoodsRealizationReportStatusCode401Response|GenerateGoodsRealizationReportStatusCode403 of GenerateGoodsRealizationReportStatusCode403Response|GenerateGoodsRealizationReportStatusCode420 of GenerateGoodsRealizationReportStatusCode420Response|GenerateGoodsRealizationReportStatusCode500 of GenerateGoodsRealizationReportStatusCode500Response

    type GenerateGoodsRealizationReportArgs = {
      queryParams:Result<GenerateGoodsRealizationReportQueryParams,string>;
      bodyParams:GenerateGoodsRealizationReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateGoodsTurnoverReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateGoodsTurnoverReportBodyParams = GenerateGoodsTurnoverRequest
    //#endregion


    type GenerateGoodsTurnoverReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateGoodsTurnoverReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateGoodsTurnoverReportResult = GenerateGoodsTurnoverReportStatusCode200 of GenerateGoodsTurnoverReportStatusCode200Response|GenerateGoodsTurnoverReportStatusCode400 of GenerateGoodsTurnoverReportStatusCode400Response|GenerateGoodsTurnoverReportStatusCode401 of GenerateGoodsTurnoverReportStatusCode401Response|GenerateGoodsTurnoverReportStatusCode403 of GenerateGoodsTurnoverReportStatusCode403Response|GenerateGoodsTurnoverReportStatusCode420 of GenerateGoodsTurnoverReportStatusCode420Response|GenerateGoodsTurnoverReportStatusCode500 of GenerateGoodsTurnoverReportStatusCode500Response

    type GenerateGoodsTurnoverReportArgs = {
      queryParams:Result<GenerateGoodsTurnoverReportQueryParams,string>;
      bodyParams:GenerateGoodsTurnoverReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GeneratePricesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GeneratePricesReportBodyParams = GeneratePricesReportRequest
    //#endregion


    type GeneratePricesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GeneratePricesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GeneratePricesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GeneratePricesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GeneratePricesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GeneratePricesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GeneratePricesReportResult = GeneratePricesReportStatusCode200 of GeneratePricesReportStatusCode200Response|GeneratePricesReportStatusCode400 of GeneratePricesReportStatusCode400Response|GeneratePricesReportStatusCode401 of GeneratePricesReportStatusCode401Response|GeneratePricesReportStatusCode403 of GeneratePricesReportStatusCode403Response|GeneratePricesReportStatusCode420 of GeneratePricesReportStatusCode420Response|GeneratePricesReportStatusCode500 of GeneratePricesReportStatusCode500Response

    type GeneratePricesReportArgs = {
      queryParams:Result<GeneratePricesReportQueryParams,string>;
      bodyParams:GeneratePricesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateShelfsStatisticsReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateShelfsStatisticsReportBodyParams = GenerateShelfsStatisticsRequest
    //#endregion


    type GenerateShelfsStatisticsReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateShelfsStatisticsReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateShelfsStatisticsReportResult = GenerateShelfsStatisticsReportStatusCode200 of GenerateShelfsStatisticsReportStatusCode200Response|GenerateShelfsStatisticsReportStatusCode400 of GenerateShelfsStatisticsReportStatusCode400Response|GenerateShelfsStatisticsReportStatusCode401 of GenerateShelfsStatisticsReportStatusCode401Response|GenerateShelfsStatisticsReportStatusCode403 of GenerateShelfsStatisticsReportStatusCode403Response|GenerateShelfsStatisticsReportStatusCode420 of GenerateShelfsStatisticsReportStatusCode420Response|GenerateShelfsStatisticsReportStatusCode500 of GenerateShelfsStatisticsReportStatusCode500Response

    type GenerateShelfsStatisticsReportArgs = {
      queryParams:Result<GenerateShelfsStatisticsReportQueryParams,string>;
      bodyParams:GenerateShelfsStatisticsReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateShowsSalesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateShowsSalesReportBodyParams = GenerateShowsSalesReportRequest
    //#endregion


    type GenerateShowsSalesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateShowsSalesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateShowsSalesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateShowsSalesReportResult = GenerateShowsSalesReportStatusCode200 of GenerateShowsSalesReportStatusCode200Response|GenerateShowsSalesReportStatusCode400 of GenerateShowsSalesReportStatusCode400Response|GenerateShowsSalesReportStatusCode401 of GenerateShowsSalesReportStatusCode401Response|GenerateShowsSalesReportStatusCode403 of GenerateShowsSalesReportStatusCode403Response|GenerateShowsSalesReportStatusCode420 of GenerateShowsSalesReportStatusCode420Response|GenerateShowsSalesReportStatusCode500 of GenerateShowsSalesReportStatusCode500Response

    type GenerateShowsSalesReportArgs = {
      queryParams:Result<GenerateShowsSalesReportQueryParams,string>;
      bodyParams:GenerateShowsSalesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateStocksOnWarehousesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateStocksOnWarehousesReportBodyParams = GenerateStocksOnWarehousesReportRequest
    //#endregion


    type GenerateStocksOnWarehousesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateStocksOnWarehousesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateStocksOnWarehousesReportResult = GenerateStocksOnWarehousesReportStatusCode200 of GenerateStocksOnWarehousesReportStatusCode200Response|GenerateStocksOnWarehousesReportStatusCode400 of GenerateStocksOnWarehousesReportStatusCode400Response|GenerateStocksOnWarehousesReportStatusCode401 of GenerateStocksOnWarehousesReportStatusCode401Response|GenerateStocksOnWarehousesReportStatusCode403 of GenerateStocksOnWarehousesReportStatusCode403Response|GenerateStocksOnWarehousesReportStatusCode420 of GenerateStocksOnWarehousesReportStatusCode420Response|GenerateStocksOnWarehousesReportStatusCode500 of GenerateStocksOnWarehousesReportStatusCode500Response

    type GenerateStocksOnWarehousesReportArgs = {
      queryParams:Result<GenerateStocksOnWarehousesReportQueryParams,string>;
      bodyParams:GenerateStocksOnWarehousesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedMarketplaceServicesReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedMarketplaceServicesReportBodyParams = GenerateUnitedMarketplaceServicesReportRequest
    //#endregion


    type GenerateUnitedMarketplaceServicesReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedMarketplaceServicesReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedMarketplaceServicesReportResult = GenerateUnitedMarketplaceServicesReportStatusCode200 of GenerateUnitedMarketplaceServicesReportStatusCode200Response|GenerateUnitedMarketplaceServicesReportStatusCode400 of GenerateUnitedMarketplaceServicesReportStatusCode400Response|GenerateUnitedMarketplaceServicesReportStatusCode401 of GenerateUnitedMarketplaceServicesReportStatusCode401Response|GenerateUnitedMarketplaceServicesReportStatusCode403 of GenerateUnitedMarketplaceServicesReportStatusCode403Response|GenerateUnitedMarketplaceServicesReportStatusCode420 of GenerateUnitedMarketplaceServicesReportStatusCode420Response|GenerateUnitedMarketplaceServicesReportStatusCode500 of GenerateUnitedMarketplaceServicesReportStatusCode500Response

    type GenerateUnitedMarketplaceServicesReportArgs = {
      queryParams:Result<GenerateUnitedMarketplaceServicesReportQueryParams,string>;
      bodyParams:GenerateUnitedMarketplaceServicesReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedNettingReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedNettingReportBodyParams = GenerateUnitedNettingReportRequest
    //#endregion


    type GenerateUnitedNettingReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedNettingReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedNettingReportResult = GenerateUnitedNettingReportStatusCode200 of GenerateUnitedNettingReportStatusCode200Response|GenerateUnitedNettingReportStatusCode400 of GenerateUnitedNettingReportStatusCode400Response|GenerateUnitedNettingReportStatusCode401 of GenerateUnitedNettingReportStatusCode401Response|GenerateUnitedNettingReportStatusCode403 of GenerateUnitedNettingReportStatusCode403Response|GenerateUnitedNettingReportStatusCode420 of GenerateUnitedNettingReportStatusCode420Response|GenerateUnitedNettingReportStatusCode500 of GenerateUnitedNettingReportStatusCode500Response

    type GenerateUnitedNettingReportArgs = {
      queryParams:Result<GenerateUnitedNettingReportQueryParams,string>;
      bodyParams:GenerateUnitedNettingReportBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type GenerateUnitedOrdersReportQueryParams = {
      format : ReportFormatType option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GenerateUnitedOrdersReportBodyParams = GenerateUnitedOrdersRequest
    //#endregion


    type GenerateUnitedOrdersReportStatusCode200Response = {
      content:GenerateReportResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GenerateUnitedOrdersReportStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GenerateUnitedOrdersReportResult = GenerateUnitedOrdersReportStatusCode200 of GenerateUnitedOrdersReportStatusCode200Response|GenerateUnitedOrdersReportStatusCode400 of GenerateUnitedOrdersReportStatusCode400Response|GenerateUnitedOrdersReportStatusCode401 of GenerateUnitedOrdersReportStatusCode401Response|GenerateUnitedOrdersReportStatusCode403 of GenerateUnitedOrdersReportStatusCode403Response|GenerateUnitedOrdersReportStatusCode420 of GenerateUnitedOrdersReportStatusCode420Response|GenerateUnitedOrdersReportStatusCode500 of GenerateUnitedOrdersReportStatusCode500Response

    type GenerateUnitedOrdersReportArgs = {
      queryParams:Result<GenerateUnitedOrdersReportQueryParams,string>;
      bodyParams:GenerateUnitedOrdersReportBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAllOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetAllOffersQueryParams = {
      feedId : int64 option;


      chunk : int option;

    }
    //#endregion


    type GetAllOffersStatusCode200Response = {
      content:GetAllOffersResponse;
      
    }

    type GetAllOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetAllOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetAllOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetAllOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetAllOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetAllOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetAllOffersResult = GetAllOffersStatusCode200 of GetAllOffersStatusCode200Response|GetAllOffersStatusCode400 of GetAllOffersStatusCode400Response|GetAllOffersStatusCode401 of GetAllOffersStatusCode401Response|GetAllOffersStatusCode403 of GetAllOffersStatusCode403Response|GetAllOffersStatusCode404 of GetAllOffersStatusCode404Response|GetAllOffersStatusCode420 of GetAllOffersStatusCode420Response|GetAllOffersStatusCode500 of GetAllOffersStatusCode500Response

    type GetAllOffersArgs = {
      pathParams:GetAllOffersPathParams;
      queryParams:Result<GetAllOffersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBidsInfoForBusinessBodyParams = GetBidsInfoRequest
    //#endregion


    type GetBidsInfoForBusinessStatusCode200Response = {
      content:GetBidsInfoResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBidsInfoForBusinessStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBidsInfoForBusinessResult = GetBidsInfoForBusinessStatusCode200 of GetBidsInfoForBusinessStatusCode200Response|GetBidsInfoForBusinessStatusCode400 of GetBidsInfoForBusinessStatusCode400Response|GetBidsInfoForBusinessStatusCode401 of GetBidsInfoForBusinessStatusCode401Response|GetBidsInfoForBusinessStatusCode403 of GetBidsInfoForBusinessStatusCode403Response|GetBidsInfoForBusinessStatusCode404 of GetBidsInfoForBusinessStatusCode404Response|GetBidsInfoForBusinessStatusCode420 of GetBidsInfoForBusinessStatusCode420Response|GetBidsInfoForBusinessStatusCode500 of GetBidsInfoForBusinessStatusCode500Response

    type GetBidsInfoForBusinessArgs = {
      pathParams:GetBidsInfoForBusinessPathParams;
      queryParams:Result<GetBidsInfoForBusinessQueryParams,string>;
      bodyParams:GetBidsInfoForBusinessBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBidsRecommendationsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBidsRecommendationsBodyParams = GetBidsRecommendationsRequest
    //#endregion


    type GetBidsRecommendationsStatusCode200Response = {
      content:GetBidsRecommendationsResponse;
      
    }

    type GetBidsRecommendationsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBidsRecommendationsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBidsRecommendationsResult = GetBidsRecommendationsStatusCode200 of GetBidsRecommendationsStatusCode200Response|GetBidsRecommendationsStatusCode400 of GetBidsRecommendationsStatusCode400Response|GetBidsRecommendationsStatusCode401 of GetBidsRecommendationsStatusCode401Response|GetBidsRecommendationsStatusCode403 of GetBidsRecommendationsStatusCode403Response|GetBidsRecommendationsStatusCode404 of GetBidsRecommendationsStatusCode404Response|GetBidsRecommendationsStatusCode420 of GetBidsRecommendationsStatusCode420Response|GetBidsRecommendationsStatusCode500 of GetBidsRecommendationsStatusCode500Response

    type GetBidsRecommendationsArgs = {
      pathParams:GetBidsRecommendationsPathParams;
      bodyParams:GetBidsRecommendationsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetBusinessQuarantineOffersBodyParams = GetQuarantineOffersRequest
    //#endregion


    type GetBusinessQuarantineOffersStatusCode200Response = {
      content:GetQuarantineOffersResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBusinessQuarantineOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBusinessQuarantineOffersResult = GetBusinessQuarantineOffersStatusCode200 of GetBusinessQuarantineOffersStatusCode200Response|GetBusinessQuarantineOffersStatusCode400 of GetBusinessQuarantineOffersStatusCode400Response|GetBusinessQuarantineOffersStatusCode401 of GetBusinessQuarantineOffersStatusCode401Response|GetBusinessQuarantineOffersStatusCode403 of GetBusinessQuarantineOffersStatusCode403Response|GetBusinessQuarantineOffersStatusCode404 of GetBusinessQuarantineOffersStatusCode404Response|GetBusinessQuarantineOffersStatusCode420 of GetBusinessQuarantineOffersStatusCode420Response|GetBusinessQuarantineOffersStatusCode500 of GetBusinessQuarantineOffersStatusCode500Response

    type GetBusinessQuarantineOffersArgs = {
      pathParams:GetBusinessQuarantineOffersPathParams;
      queryParams:Result<GetBusinessQuarantineOffersQueryParams,string>;
      bodyParams:GetBusinessQuarantineOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetBusinessSettingsPathParams = {
      businessId : int64 ;
    }
    //#endregion


    type GetBusinessSettingsStatusCode200Response = {
      content:GetBusinessSettingsResponse;
      
    }

    type GetBusinessSettingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetBusinessSettingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetBusinessSettingsResult = GetBusinessSettingsStatusCode200 of GetBusinessSettingsStatusCode200Response|GetBusinessSettingsStatusCode400 of GetBusinessSettingsStatusCode400Response|GetBusinessSettingsStatusCode401 of GetBusinessSettingsStatusCode401Response|GetBusinessSettingsStatusCode403 of GetBusinessSettingsStatusCode403Response|GetBusinessSettingsStatusCode404 of GetBusinessSettingsStatusCode404Response|GetBusinessSettingsStatusCode420 of GetBusinessSettingsStatusCode420Response|GetBusinessSettingsStatusCode500 of GetBusinessSettingsStatusCode500Response

    type GetBusinessSettingsArgs = {
      pathParams:GetBusinessSettingsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignStatusCode200Response = {
      content:GetCampaignResponse;
      
    }

    type GetCampaignStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignResult = GetCampaignStatusCode200 of GetCampaignStatusCode200Response|GetCampaignStatusCode400 of GetCampaignStatusCode400Response|GetCampaignStatusCode401 of GetCampaignStatusCode401Response|GetCampaignStatusCode403 of GetCampaignStatusCode403Response|GetCampaignStatusCode404 of GetCampaignStatusCode404Response|GetCampaignStatusCode420 of GetCampaignStatusCode420Response|GetCampaignStatusCode500 of GetCampaignStatusCode500Response

    type GetCampaignArgs = {
      pathParams:GetCampaignPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignLoginsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignLoginsStatusCode200Response = {
      content:GetCampaignLoginsResponse;
      
    }

    type GetCampaignLoginsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignLoginsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignLoginsResult = GetCampaignLoginsStatusCode200 of GetCampaignLoginsStatusCode200Response|GetCampaignLoginsStatusCode400 of GetCampaignLoginsStatusCode400Response|GetCampaignLoginsStatusCode401 of GetCampaignLoginsStatusCode401Response|GetCampaignLoginsStatusCode403 of GetCampaignLoginsStatusCode403Response|GetCampaignLoginsStatusCode404 of GetCampaignLoginsStatusCode404Response|GetCampaignLoginsStatusCode420 of GetCampaignLoginsStatusCode420Response|GetCampaignLoginsStatusCode500 of GetCampaignLoginsStatusCode500Response

    type GetCampaignLoginsArgs = {
      pathParams:GetCampaignLoginsPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetCampaignOffersBodyParams = GetCampaignOffersRequest
    //#endregion


    type GetCampaignOffersStatusCode200Response = {
      content:GetCampaignOffersResponse;
      
    }

    type GetCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignOffersResult = GetCampaignOffersStatusCode200 of GetCampaignOffersStatusCode200Response|GetCampaignOffersStatusCode400 of GetCampaignOffersStatusCode400Response|GetCampaignOffersStatusCode401 of GetCampaignOffersStatusCode401Response|GetCampaignOffersStatusCode403 of GetCampaignOffersStatusCode403Response|GetCampaignOffersStatusCode404 of GetCampaignOffersStatusCode404Response|GetCampaignOffersStatusCode420 of GetCampaignOffersStatusCode420Response|GetCampaignOffersStatusCode500 of GetCampaignOffersStatusCode500Response

    type GetCampaignOffersArgs = {
      pathParams:GetCampaignOffersPathParams;
      queryParams:Result<GetCampaignOffersQueryParams,string>;
      bodyParams:GetCampaignOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetCampaignQuarantineOffersBodyParams = GetQuarantineOffersRequest
    //#endregion


    type GetCampaignQuarantineOffersStatusCode200Response = {
      content:GetQuarantineOffersResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignQuarantineOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignQuarantineOffersResult = GetCampaignQuarantineOffersStatusCode200 of GetCampaignQuarantineOffersStatusCode200Response|GetCampaignQuarantineOffersStatusCode400 of GetCampaignQuarantineOffersStatusCode400Response|GetCampaignQuarantineOffersStatusCode401 of GetCampaignQuarantineOffersStatusCode401Response|GetCampaignQuarantineOffersStatusCode403 of GetCampaignQuarantineOffersStatusCode403Response|GetCampaignQuarantineOffersStatusCode404 of GetCampaignQuarantineOffersStatusCode404Response|GetCampaignQuarantineOffersStatusCode420 of GetCampaignQuarantineOffersStatusCode420Response|GetCampaignQuarantineOffersStatusCode500 of GetCampaignQuarantineOffersStatusCode500Response

    type GetCampaignQuarantineOffersArgs = {
      pathParams:GetCampaignQuarantineOffersPathParams;
      queryParams:Result<GetCampaignQuarantineOffersQueryParams,string>;
      bodyParams:GetCampaignQuarantineOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignRegionPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignRegionStatusCode200Response = {
      content:GetCampaignRegionResponse;
      
    }

    type GetCampaignRegionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignRegionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignRegionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignRegionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignRegionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignRegionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignRegionResult = GetCampaignRegionStatusCode200 of GetCampaignRegionStatusCode200Response|GetCampaignRegionStatusCode400 of GetCampaignRegionStatusCode400Response|GetCampaignRegionStatusCode401 of GetCampaignRegionStatusCode401Response|GetCampaignRegionStatusCode403 of GetCampaignRegionStatusCode403Response|GetCampaignRegionStatusCode404 of GetCampaignRegionStatusCode404Response|GetCampaignRegionStatusCode420 of GetCampaignRegionStatusCode420Response|GetCampaignRegionStatusCode500 of GetCampaignRegionStatusCode500Response

    type GetCampaignRegionArgs = {
      pathParams:GetCampaignRegionPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignSettingsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetCampaignSettingsStatusCode200Response = {
      content:GetCampaignSettingsResponse;
      
    }

    type GetCampaignSettingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignSettingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignSettingsResult = GetCampaignSettingsStatusCode200 of GetCampaignSettingsStatusCode200Response|GetCampaignSettingsStatusCode400 of GetCampaignSettingsStatusCode400Response|GetCampaignSettingsStatusCode401 of GetCampaignSettingsStatusCode401Response|GetCampaignSettingsStatusCode403 of GetCampaignSettingsStatusCode403Response|GetCampaignSettingsStatusCode404 of GetCampaignSettingsStatusCode404Response|GetCampaignSettingsStatusCode420 of GetCampaignSettingsStatusCode420Response|GetCampaignSettingsStatusCode500 of GetCampaignSettingsStatusCode500Response

    type GetCampaignSettingsArgs = {
      pathParams:GetCampaignSettingsPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignsQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetCampaignsStatusCode200Response = {
      content:GetCampaignsResponse;
      
    }

    type GetCampaignsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignsResult = GetCampaignsStatusCode200 of GetCampaignsStatusCode200Response|GetCampaignsStatusCode400 of GetCampaignsStatusCode400Response|GetCampaignsStatusCode401 of GetCampaignsStatusCode401Response|GetCampaignsStatusCode403 of GetCampaignsStatusCode403Response|GetCampaignsStatusCode404 of GetCampaignsStatusCode404Response|GetCampaignsStatusCode420 of GetCampaignsStatusCode420Response|GetCampaignsStatusCode500 of GetCampaignsStatusCode500Response

    type GetCampaignsArgs = {
      queryParams:Result<GetCampaignsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignsByLoginPathParams = {
      login : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetCampaignsByLoginQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetCampaignsByLoginStatusCode200Response = {
      content:GetCampaignsResponse;
      
    }

    type GetCampaignsByLoginStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCampaignsByLoginStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCampaignsByLoginResult = GetCampaignsByLoginStatusCode200 of GetCampaignsByLoginStatusCode200Response|GetCampaignsByLoginStatusCode400 of GetCampaignsByLoginStatusCode400Response|GetCampaignsByLoginStatusCode401 of GetCampaignsByLoginStatusCode401Response|GetCampaignsByLoginStatusCode403 of GetCampaignsByLoginStatusCode403Response|GetCampaignsByLoginStatusCode404 of GetCampaignsByLoginStatusCode404Response|GetCampaignsByLoginStatusCode420 of GetCampaignsByLoginStatusCode420Response|GetCampaignsByLoginStatusCode500 of GetCampaignsByLoginStatusCode500Response

    type GetCampaignsByLoginArgs = {
      pathParams:GetCampaignsByLoginPathParams;
      queryParams:Result<GetCampaignsByLoginQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type GetCategoriesMaxSaleQuantumBodyParams = GetCategoriesMaxSaleQuantumRequest
    //#endregion


    type GetCategoriesMaxSaleQuantumStatusCode200Response = {
      content:GetCategoriesMaxSaleQuantumResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoriesMaxSaleQuantumStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoriesMaxSaleQuantumResult = GetCategoriesMaxSaleQuantumStatusCode200 of GetCategoriesMaxSaleQuantumStatusCode200Response|GetCategoriesMaxSaleQuantumStatusCode400 of GetCategoriesMaxSaleQuantumStatusCode400Response|GetCategoriesMaxSaleQuantumStatusCode401 of GetCategoriesMaxSaleQuantumStatusCode401Response|GetCategoriesMaxSaleQuantumStatusCode403 of GetCategoriesMaxSaleQuantumStatusCode403Response|GetCategoriesMaxSaleQuantumStatusCode404 of GetCategoriesMaxSaleQuantumStatusCode404Response|GetCategoriesMaxSaleQuantumStatusCode420 of GetCategoriesMaxSaleQuantumStatusCode420Response|GetCategoriesMaxSaleQuantumStatusCode500 of GetCategoriesMaxSaleQuantumStatusCode500Response

    type GetCategoriesMaxSaleQuantumArgs = {
      bodyParams:GetCategoriesMaxSaleQuantumBodyParams
    }

    //#region Body parameters
    [<CLIMutable>]
    type GetCategoriesTreeBodyParams = GetCategoriesRequest
    //#endregion


    type GetCategoriesTreeStatusCode200Response = {
      content:GetCategoriesResponse;
      
    }

    type GetCategoriesTreeStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoriesTreeStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoriesTreeResult = GetCategoriesTreeStatusCode200 of GetCategoriesTreeStatusCode200Response|GetCategoriesTreeStatusCode400 of GetCategoriesTreeStatusCode400Response|GetCategoriesTreeStatusCode401 of GetCategoriesTreeStatusCode401Response|GetCategoriesTreeStatusCode403 of GetCategoriesTreeStatusCode403Response|GetCategoriesTreeStatusCode404 of GetCategoriesTreeStatusCode404Response|GetCategoriesTreeStatusCode420 of GetCategoriesTreeStatusCode420Response|GetCategoriesTreeStatusCode500 of GetCategoriesTreeStatusCode500Response

    type GetCategoriesTreeArgs = {
      bodyParams:GetCategoriesTreeBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCategoryContentParametersPathParams = {
      categoryId : int64 ;
    }
    //#endregion


    type GetCategoryContentParametersStatusCode200Response = {
      content:GetCategoryContentParametersResponse;
      
    }

    type GetCategoryContentParametersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetCategoryContentParametersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetCategoryContentParametersResult = GetCategoryContentParametersStatusCode200 of GetCategoryContentParametersStatusCode200Response|GetCategoryContentParametersStatusCode400 of GetCategoryContentParametersStatusCode400Response|GetCategoryContentParametersStatusCode401 of GetCategoryContentParametersStatusCode401Response|GetCategoryContentParametersStatusCode403 of GetCategoryContentParametersStatusCode403Response|GetCategoryContentParametersStatusCode404 of GetCategoryContentParametersStatusCode404Response|GetCategoryContentParametersStatusCode420 of GetCategoryContentParametersStatusCode420Response|GetCategoryContentParametersStatusCode500 of GetCategoryContentParametersStatusCode500Response

    type GetCategoryContentParametersArgs = {
      pathParams:GetCategoryContentParametersPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetChatHistoryPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetChatHistoryQueryParams = {
      chatId : int64 ;


      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetChatHistoryBodyParams = GetChatHistoryRequest
    //#endregion


    type GetChatHistoryStatusCode200Response = {
      content:GetChatHistoryResponse;
      
    }

    type GetChatHistoryStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetChatHistoryStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetChatHistoryStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetChatHistoryStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetChatHistoryStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetChatHistoryStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetChatHistoryResult = GetChatHistoryStatusCode200 of GetChatHistoryStatusCode200Response|GetChatHistoryStatusCode400 of GetChatHistoryStatusCode400Response|GetChatHistoryStatusCode401 of GetChatHistoryStatusCode401Response|GetChatHistoryStatusCode403 of GetChatHistoryStatusCode403Response|GetChatHistoryStatusCode404 of GetChatHistoryStatusCode404Response|GetChatHistoryStatusCode420 of GetChatHistoryStatusCode420Response|GetChatHistoryStatusCode500 of GetChatHistoryStatusCode500Response

    type GetChatHistoryArgs = {
      pathParams:GetChatHistoryPathParams;
      queryParams:Result<GetChatHistoryQueryParams,string>;
      bodyParams:GetChatHistoryBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetChatsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetChatsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetChatsBodyParams = GetChatsRequest
    //#endregion


    type GetChatsStatusCode200Response = {
      content:GetChatsResponse;
      
    }

    type GetChatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetChatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetChatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetChatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetChatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetChatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetChatsResult = GetChatsStatusCode200 of GetChatsStatusCode200Response|GetChatsStatusCode400 of GetChatsStatusCode400Response|GetChatsStatusCode401 of GetChatsStatusCode401Response|GetChatsStatusCode403 of GetChatsStatusCode403Response|GetChatsStatusCode404 of GetChatsStatusCode404Response|GetChatsStatusCode420 of GetChatsStatusCode420Response|GetChatsStatusCode500 of GetChatsStatusCode500Response

    type GetChatsArgs = {
      pathParams:GetChatsPathParams;
      queryParams:Result<GetChatsQueryParams,string>;
      bodyParams:GetChatsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion


    type GetFeedStatusCode200Response = {
      content:GetFeedResponse;
      
    }

    type GetFeedStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedResult = GetFeedStatusCode200 of GetFeedStatusCode200Response|GetFeedStatusCode400 of GetFeedStatusCode400Response|GetFeedStatusCode401 of GetFeedStatusCode401Response|GetFeedStatusCode403 of GetFeedStatusCode403Response|GetFeedStatusCode404 of GetFeedStatusCode404Response|GetFeedStatusCode420 of GetFeedStatusCode420Response|GetFeedStatusCode500 of GetFeedStatusCode500Response

    type GetFeedArgs = {
      pathParams:GetFeedPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedIndexLogsPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetFeedIndexLogsQueryParams = {
      limit : int option;


      publishedTimeFrom : DateTime option;


      publishedTimeTo : DateTime option;


      status : FeedIndexLogsStatusType option;

    }
    //#endregion


    type GetFeedIndexLogsStatusCode200Response = {
      content:GetFeedIndexLogsResponse;
      
    }

    type GetFeedIndexLogsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedIndexLogsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedIndexLogsResult = GetFeedIndexLogsStatusCode200 of GetFeedIndexLogsStatusCode200Response|GetFeedIndexLogsStatusCode400 of GetFeedIndexLogsStatusCode400Response|GetFeedIndexLogsStatusCode401 of GetFeedIndexLogsStatusCode401Response|GetFeedIndexLogsStatusCode403 of GetFeedIndexLogsStatusCode403Response|GetFeedIndexLogsStatusCode404 of GetFeedIndexLogsStatusCode404Response|GetFeedIndexLogsStatusCode420 of GetFeedIndexLogsStatusCode420Response|GetFeedIndexLogsStatusCode500 of GetFeedIndexLogsStatusCode500Response

    type GetFeedIndexLogsArgs = {
      pathParams:GetFeedIndexLogsPathParams;
      queryParams:Result<GetFeedIndexLogsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedbackAndCommentUpdatesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetFeedbackAndCommentUpdatesQueryParams = {
      pageToken : string option;


      limit : int option;


      fromDate : DateTime option;

    }
    //#endregion


    type GetFeedbackAndCommentUpdatesStatusCode200Response = {
      content:GetFeedbackListResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedbackAndCommentUpdatesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedbackAndCommentUpdatesResult = GetFeedbackAndCommentUpdatesStatusCode200 of GetFeedbackAndCommentUpdatesStatusCode200Response|GetFeedbackAndCommentUpdatesStatusCode400 of GetFeedbackAndCommentUpdatesStatusCode400Response|GetFeedbackAndCommentUpdatesStatusCode401 of GetFeedbackAndCommentUpdatesStatusCode401Response|GetFeedbackAndCommentUpdatesStatusCode403 of GetFeedbackAndCommentUpdatesStatusCode403Response|GetFeedbackAndCommentUpdatesStatusCode404 of GetFeedbackAndCommentUpdatesStatusCode404Response|GetFeedbackAndCommentUpdatesStatusCode420 of GetFeedbackAndCommentUpdatesStatusCode420Response|GetFeedbackAndCommentUpdatesStatusCode500 of GetFeedbackAndCommentUpdatesStatusCode500Response

    type GetFeedbackAndCommentUpdatesArgs = {
      pathParams:GetFeedbackAndCommentUpdatesPathParams;
      queryParams:Result<GetFeedbackAndCommentUpdatesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetFeedsPathParams = {
      campaignId : int64 ;
    }
    //#endregion


    type GetFeedsStatusCode200Response = {
      content:GetFeedsResponse;
      
    }

    type GetFeedsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFeedsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFeedsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFeedsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFeedsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFeedsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFeedsResult = GetFeedsStatusCode200 of GetFeedsStatusCode200Response|GetFeedsStatusCode400 of GetFeedsStatusCode400Response|GetFeedsStatusCode401 of GetFeedsStatusCode401Response|GetFeedsStatusCode403 of GetFeedsStatusCode403Response|GetFeedsStatusCode404 of GetFeedsStatusCode404Response|GetFeedsStatusCode420 of GetFeedsStatusCode420Response|GetFeedsStatusCode500 of GetFeedsStatusCode500Response

    type GetFeedsArgs = {
      pathParams:GetFeedsPathParams;
    }


    type GetFulfillmentWarehousesStatusCode200Response = {
      content:GetFulfillmentWarehousesResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetFulfillmentWarehousesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetFulfillmentWarehousesResult = GetFulfillmentWarehousesStatusCode200 of GetFulfillmentWarehousesStatusCode200Response|GetFulfillmentWarehousesStatusCode400 of GetFulfillmentWarehousesStatusCode400Response|GetFulfillmentWarehousesStatusCode401 of GetFulfillmentWarehousesStatusCode401Response|GetFulfillmentWarehousesStatusCode403 of GetFulfillmentWarehousesStatusCode403Response|GetFulfillmentWarehousesStatusCode404 of GetFulfillmentWarehousesStatusCode404Response|GetFulfillmentWarehousesStatusCode420 of GetFulfillmentWarehousesStatusCode420Response|GetFulfillmentWarehousesStatusCode500 of GetFulfillmentWarehousesStatusCode500Response

    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsFeedbackCommentsBodyParams = GetGoodsFeedbackCommentsRequest
    //#endregion


    type GetGoodsFeedbackCommentsStatusCode200Response = {
      content:GetGoodsFeedbackCommentsResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsFeedbackCommentsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsFeedbackCommentsResult = GetGoodsFeedbackCommentsStatusCode200 of GetGoodsFeedbackCommentsStatusCode200Response|GetGoodsFeedbackCommentsStatusCode400 of GetGoodsFeedbackCommentsStatusCode400Response|GetGoodsFeedbackCommentsStatusCode401 of GetGoodsFeedbackCommentsStatusCode401Response|GetGoodsFeedbackCommentsStatusCode403 of GetGoodsFeedbackCommentsStatusCode403Response|GetGoodsFeedbackCommentsStatusCode404 of GetGoodsFeedbackCommentsStatusCode404Response|GetGoodsFeedbackCommentsStatusCode420 of GetGoodsFeedbackCommentsStatusCode420Response|GetGoodsFeedbackCommentsStatusCode500 of GetGoodsFeedbackCommentsStatusCode500Response

    type GetGoodsFeedbackCommentsArgs = {
      pathParams:GetGoodsFeedbackCommentsPathParams;
      queryParams:Result<GetGoodsFeedbackCommentsQueryParams,string>;
      bodyParams:GetGoodsFeedbackCommentsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsFeedbacksBodyParams = GetGoodsFeedbackRequest
    //#endregion


    type GetGoodsFeedbacksStatusCode200Response = {
      content:GetGoodsFeedbackResponse;
      
    }

    type GetGoodsFeedbacksStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsFeedbacksStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsFeedbacksResult = GetGoodsFeedbacksStatusCode200 of GetGoodsFeedbacksStatusCode200Response|GetGoodsFeedbacksStatusCode400 of GetGoodsFeedbacksStatusCode400Response|GetGoodsFeedbacksStatusCode401 of GetGoodsFeedbacksStatusCode401Response|GetGoodsFeedbacksStatusCode403 of GetGoodsFeedbacksStatusCode403Response|GetGoodsFeedbacksStatusCode404 of GetGoodsFeedbacksStatusCode404Response|GetGoodsFeedbacksStatusCode420 of GetGoodsFeedbacksStatusCode420Response|GetGoodsFeedbacksStatusCode500 of GetGoodsFeedbacksStatusCode500Response

    type GetGoodsFeedbacksArgs = {
      pathParams:GetGoodsFeedbacksPathParams;
      queryParams:Result<GetGoodsFeedbacksQueryParams,string>;
      bodyParams:GetGoodsFeedbacksBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetGoodsStatsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetGoodsStatsBodyParams = GetGoodsStatsRequest
    //#endregion


    type GetGoodsStatsStatusCode200Response = {
      content:GetGoodsStatsResponse;
      
    }

    type GetGoodsStatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetGoodsStatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetGoodsStatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetGoodsStatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetGoodsStatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetGoodsStatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetGoodsStatsResult = GetGoodsStatsStatusCode200 of GetGoodsStatsStatusCode200Response|GetGoodsStatsStatusCode400 of GetGoodsStatsStatusCode400Response|GetGoodsStatsStatusCode401 of GetGoodsStatsStatusCode401Response|GetGoodsStatsStatusCode403 of GetGoodsStatsStatusCode403Response|GetGoodsStatsStatusCode404 of GetGoodsStatsStatusCode404Response|GetGoodsStatsStatusCode420 of GetGoodsStatsStatusCode420Response|GetGoodsStatsStatusCode500 of GetGoodsStatsStatusCode500Response

    type GetGoodsStatsArgs = {
      pathParams:GetGoodsStatsPathParams;
      bodyParams:GetGoodsStatsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetHiddenOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetHiddenOffersQueryParams = {
      offerId : string[] option;


      pageToken : string option;


      limit : int option;


      offset : int option;


      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetHiddenOffersStatusCode200Response = {
      content:GetHiddenOffersResponse;
      
    }

    type GetHiddenOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetHiddenOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetHiddenOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetHiddenOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetHiddenOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetHiddenOffersResult = GetHiddenOffersStatusCode200 of GetHiddenOffersStatusCode200Response|GetHiddenOffersStatusCode400 of GetHiddenOffersStatusCode400Response|GetHiddenOffersStatusCode401 of GetHiddenOffersStatusCode401Response|GetHiddenOffersStatusCode403 of GetHiddenOffersStatusCode403Response|GetHiddenOffersStatusCode420 of GetHiddenOffersStatusCode420Response|GetHiddenOffersStatusCode500 of GetHiddenOffersStatusCode500Response

    type GetHiddenOffersArgs = {
      pathParams:GetHiddenOffersPathParams;
      queryParams:Result<GetHiddenOffersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferCardsContentStatusBodyParams = GetOfferCardsContentStatusRequest
    //#endregion


    type GetOfferCardsContentStatusStatusCode200Response = {
      content:GetOfferCardsContentStatusResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferCardsContentStatusStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferCardsContentStatusResult = GetOfferCardsContentStatusStatusCode200 of GetOfferCardsContentStatusStatusCode200Response|GetOfferCardsContentStatusStatusCode400 of GetOfferCardsContentStatusStatusCode400Response|GetOfferCardsContentStatusStatusCode401 of GetOfferCardsContentStatusStatusCode401Response|GetOfferCardsContentStatusStatusCode403 of GetOfferCardsContentStatusStatusCode403Response|GetOfferCardsContentStatusStatusCode404 of GetOfferCardsContentStatusStatusCode404Response|GetOfferCardsContentStatusStatusCode420 of GetOfferCardsContentStatusStatusCode420Response|GetOfferCardsContentStatusStatusCode500 of GetOfferCardsContentStatusStatusCode500Response

    type GetOfferCardsContentStatusArgs = {
      pathParams:GetOfferCardsContentStatusPathParams;
      queryParams:Result<GetOfferCardsContentStatusQueryParams,string>;
      bodyParams:GetOfferCardsContentStatusBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferMappingEntriesQueryParams = {
      offerId : string[] option;


      shopSku : string[] option;


      mappingKind : OfferMappingKindType option;


      status : OfferProcessingStatusType[] option;


      availability : OfferAvailabilityStatusType[] option;


      categoryId : int[] option;


      vendor : string[] option;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type GetOfferMappingEntriesStatusCode200Response = {
      content:GetOfferMappingEntriesResponse;
      
    }

    type GetOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferMappingEntriesResult = GetOfferMappingEntriesStatusCode200 of GetOfferMappingEntriesStatusCode200Response|GetOfferMappingEntriesStatusCode400 of GetOfferMappingEntriesStatusCode400Response|GetOfferMappingEntriesStatusCode401 of GetOfferMappingEntriesStatusCode401Response|GetOfferMappingEntriesStatusCode403 of GetOfferMappingEntriesStatusCode403Response|GetOfferMappingEntriesStatusCode404 of GetOfferMappingEntriesStatusCode404Response|GetOfferMappingEntriesStatusCode420 of GetOfferMappingEntriesStatusCode420Response|GetOfferMappingEntriesStatusCode500 of GetOfferMappingEntriesStatusCode500Response

    type GetOfferMappingEntriesArgs = {
      pathParams:GetOfferMappingEntriesPathParams;
      queryParams:Result<GetOfferMappingEntriesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferMappingsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferMappingsBodyParams = GetOfferMappingsRequest
    //#endregion


    type GetOfferMappingsStatusCode200Response = {
      content:GetOfferMappingsResponse;
      
    }

    type GetOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferMappingsResult = GetOfferMappingsStatusCode200 of GetOfferMappingsStatusCode200Response|GetOfferMappingsStatusCode400 of GetOfferMappingsStatusCode400Response|GetOfferMappingsStatusCode401 of GetOfferMappingsStatusCode401Response|GetOfferMappingsStatusCode403 of GetOfferMappingsStatusCode403Response|GetOfferMappingsStatusCode404 of GetOfferMappingsStatusCode404Response|GetOfferMappingsStatusCode420 of GetOfferMappingsStatusCode420Response|GetOfferMappingsStatusCode500 of GetOfferMappingsStatusCode500Response

    type GetOfferMappingsArgs = {
      pathParams:GetOfferMappingsPathParams;
      queryParams:Result<GetOfferMappingsQueryParams,string>;
      bodyParams:GetOfferMappingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOfferRecommendationsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOfferRecommendationsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOfferRecommendationsBodyParams = GetOfferRecommendationsRequest
    //#endregion


    type GetOfferRecommendationsStatusCode200Response = {
      content:GetOfferRecommendationsResponse;
      
    }

    type GetOfferRecommendationsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOfferRecommendationsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOfferRecommendationsResult = GetOfferRecommendationsStatusCode200 of GetOfferRecommendationsStatusCode200Response|GetOfferRecommendationsStatusCode400 of GetOfferRecommendationsStatusCode400Response|GetOfferRecommendationsStatusCode401 of GetOfferRecommendationsStatusCode401Response|GetOfferRecommendationsStatusCode403 of GetOfferRecommendationsStatusCode403Response|GetOfferRecommendationsStatusCode404 of GetOfferRecommendationsStatusCode404Response|GetOfferRecommendationsStatusCode420 of GetOfferRecommendationsStatusCode420Response|GetOfferRecommendationsStatusCode500 of GetOfferRecommendationsStatusCode500Response

    type GetOfferRecommendationsArgs = {
      pathParams:GetOfferRecommendationsPathParams;
      queryParams:Result<GetOfferRecommendationsQueryParams,string>;
      bodyParams:GetOfferRecommendationsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOffersQueryParams = {
      query : string option;


      feedId : int64 option;


      shopCategoryId : string option;


      currency : CurrencyType option;


      matched : bool option;


      page : int option;


      pageSize : int option;

    }
    //#endregion


    type GetOffersStatusCode200Response = {
      content:GetOffersResponse;
      
    }

    type GetOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOffersResult = GetOffersStatusCode200 of GetOffersStatusCode200Response|GetOffersStatusCode400 of GetOffersStatusCode400Response|GetOffersStatusCode401 of GetOffersStatusCode401Response|GetOffersStatusCode403 of GetOffersStatusCode403Response|GetOffersStatusCode404 of GetOffersStatusCode404Response|GetOffersStatusCode420 of GetOffersStatusCode420Response|GetOffersStatusCode500 of GetOffersStatusCode500Response

    type GetOffersArgs = {
      pathParams:GetOffersPathParams;
      queryParams:Result<GetOffersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderStatusCode200Response = {
      content:GetOrderResponse;
      
    }

    type GetOrderStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderResult = GetOrderStatusCode200 of GetOrderStatusCode200Response|GetOrderStatusCode400 of GetOrderStatusCode400Response|GetOrderStatusCode401 of GetOrderStatusCode401Response|GetOrderStatusCode403 of GetOrderStatusCode403Response|GetOrderStatusCode404 of GetOrderStatusCode404Response|GetOrderStatusCode420 of GetOrderStatusCode420Response|GetOrderStatusCode500 of GetOrderStatusCode500Response

    type GetOrderArgs = {
      pathParams:GetOrderPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderBusinessBuyerInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderBusinessBuyerInfoStatusCode200Response = {
      content:GetBusinessBuyerInfoResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderBusinessBuyerInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderBusinessBuyerInfoResult = GetOrderBusinessBuyerInfoStatusCode200 of GetOrderBusinessBuyerInfoStatusCode200Response|GetOrderBusinessBuyerInfoStatusCode400 of GetOrderBusinessBuyerInfoStatusCode400Response|GetOrderBusinessBuyerInfoStatusCode401 of GetOrderBusinessBuyerInfoStatusCode401Response|GetOrderBusinessBuyerInfoStatusCode403 of GetOrderBusinessBuyerInfoStatusCode403Response|GetOrderBusinessBuyerInfoStatusCode404 of GetOrderBusinessBuyerInfoStatusCode404Response|GetOrderBusinessBuyerInfoStatusCode420 of GetOrderBusinessBuyerInfoStatusCode420Response|GetOrderBusinessBuyerInfoStatusCode500 of GetOrderBusinessBuyerInfoStatusCode500Response

    type GetOrderBusinessBuyerInfoArgs = {
      pathParams:GetOrderBusinessBuyerInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrderBusinessDocumentsInfoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    }
    //#endregion


    type GetOrderBusinessDocumentsInfoStatusCode200Response = {
      content:GetBusinessDocumentsInfoResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrderBusinessDocumentsInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrderBusinessDocumentsInfoResult = GetOrderBusinessDocumentsInfoStatusCode200 of GetOrderBusinessDocumentsInfoStatusCode200Response|GetOrderBusinessDocumentsInfoStatusCode400 of GetOrderBusinessDocumentsInfoStatusCode400Response|GetOrderBusinessDocumentsInfoStatusCode401 of GetOrderBusinessDocumentsInfoStatusCode401Response|GetOrderBusinessDocumentsInfoStatusCode403 of GetOrderBusinessDocumentsInfoStatusCode403Response|GetOrderBusinessDocumentsInfoStatusCode404 of GetOrderBusinessDocumentsInfoStatusCode404Response|GetOrderBusinessDocumentsInfoStatusCode420 of GetOrderBusinessDocumentsInfoStatusCode420Response|GetOrderBusinessDocumentsInfoStatusCode500 of GetOrderBusinessDocumentsInfoStatusCode500Response

    type GetOrderBusinessDocumentsInfoArgs = {
      pathParams:GetOrderBusinessDocumentsInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrdersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOrdersQueryParams = {
      orderIds : int64[] option;


      status : OrderStatusType[] option;


      substatus : OrderSubstatusType[] option;


      fromDate : DateTime option;


      toDate : DateTime option;


      supplierShipmentDateFrom : DateTime option;


      supplierShipmentDateTo : DateTime option;


      updatedAtFrom : DateTime option;


      updatedAtTo : DateTime option;


      dispatchType : OrderDeliveryDispatchType option;


      fake : bool option;


      hasCis : bool option;


      onlyWaitingForCancellationApprove : bool option;


      onlyEstimatedDelivery : bool option;


      buyerType : OrderBuyerType option;


      page : int option;


      pageSize : int option;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type GetOrdersStatusCode200Response = {
      content:GetOrdersResponse;
      
    }

    type GetOrdersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrdersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrdersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrdersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrdersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrdersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrdersResult = GetOrdersStatusCode200 of GetOrdersStatusCode200Response|GetOrdersStatusCode400 of GetOrdersStatusCode400Response|GetOrdersStatusCode401 of GetOrdersStatusCode401Response|GetOrdersStatusCode403 of GetOrdersStatusCode403Response|GetOrdersStatusCode404 of GetOrdersStatusCode404Response|GetOrdersStatusCode420 of GetOrdersStatusCode420Response|GetOrdersStatusCode500 of GetOrdersStatusCode500Response

    type GetOrdersArgs = {
      pathParams:GetOrdersPathParams;
      queryParams:Result<GetOrdersQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetOrdersStatsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetOrdersStatsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetOrdersStatsBodyParams = GetOrdersStatsRequest
    //#endregion


    type GetOrdersStatsStatusCode200Response = {
      content:GetOrdersStatsResponse;
      
    }

    type GetOrdersStatsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetOrdersStatsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetOrdersStatsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetOrdersStatsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetOrdersStatsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetOrdersStatsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetOrdersStatsResult = GetOrdersStatsStatusCode200 of GetOrdersStatsStatusCode200Response|GetOrdersStatsStatusCode400 of GetOrdersStatsStatusCode400Response|GetOrdersStatsStatusCode401 of GetOrdersStatsStatusCode401Response|GetOrdersStatsStatusCode403 of GetOrdersStatsStatusCode403Response|GetOrdersStatsStatusCode404 of GetOrdersStatsStatusCode404Response|GetOrdersStatsStatusCode420 of GetOrdersStatsStatusCode420Response|GetOrdersStatsStatusCode500 of GetOrdersStatsStatusCode500Response

    type GetOrdersStatsArgs = {
      pathParams:GetOrdersStatsPathParams;
      queryParams:Result<GetOrdersStatsQueryParams,string>;
      bodyParams:GetOrdersStatsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPricesQueryParams = {
      pageToken : string option;


      limit : int option;


      archived : bool option;

    }
    //#endregion


    type GetPricesStatusCode200Response = {
      content:GetPricesResponse;
      
    }

    type GetPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPricesResult = GetPricesStatusCode200 of GetPricesStatusCode200Response|GetPricesStatusCode400 of GetPricesStatusCode400Response|GetPricesStatusCode401 of GetPricesStatusCode401Response|GetPricesStatusCode403 of GetPricesStatusCode403Response|GetPricesStatusCode404 of GetPricesStatusCode404Response|GetPricesStatusCode420 of GetPricesStatusCode420Response|GetPricesStatusCode500 of GetPricesStatusCode500Response

    type GetPricesArgs = {
      pathParams:GetPricesPathParams;
      queryParams:Result<GetPricesQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPricesByOfferIdsBodyParams = GetPricesByOfferIdsRequest
    //#endregion


    type GetPricesByOfferIdsStatusCode200Response = {
      content:GetPricesByOfferIdsResponse;
      
    }

    type GetPricesByOfferIdsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPricesByOfferIdsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPricesByOfferIdsResult = GetPricesByOfferIdsStatusCode200 of GetPricesByOfferIdsStatusCode200Response|GetPricesByOfferIdsStatusCode400 of GetPricesByOfferIdsStatusCode400Response|GetPricesByOfferIdsStatusCode401 of GetPricesByOfferIdsStatusCode401Response|GetPricesByOfferIdsStatusCode403 of GetPricesByOfferIdsStatusCode403Response|GetPricesByOfferIdsStatusCode404 of GetPricesByOfferIdsStatusCode404Response|GetPricesByOfferIdsStatusCode420 of GetPricesByOfferIdsStatusCode420Response|GetPricesByOfferIdsStatusCode500 of GetPricesByOfferIdsStatusCode500Response

    type GetPricesByOfferIdsArgs = {
      pathParams:GetPricesByOfferIdsPathParams;
      queryParams:Result<GetPricesByOfferIdsQueryParams,string>;
      bodyParams:GetPricesByOfferIdsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetPromoOffersQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPromoOffersBodyParams = GetPromoOffersRequest
    //#endregion


    type GetPromoOffersStatusCode200Response = {
      content:GetPromoOffersResponse;
      
    }

    type GetPromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPromoOffersResult = GetPromoOffersStatusCode200 of GetPromoOffersStatusCode200Response|GetPromoOffersStatusCode400 of GetPromoOffersStatusCode400Response|GetPromoOffersStatusCode401 of GetPromoOffersStatusCode401Response|GetPromoOffersStatusCode403 of GetPromoOffersStatusCode403Response|GetPromoOffersStatusCode404 of GetPromoOffersStatusCode404Response|GetPromoOffersStatusCode420 of GetPromoOffersStatusCode420Response|GetPromoOffersStatusCode500 of GetPromoOffersStatusCode500Response

    type GetPromoOffersArgs = {
      pathParams:GetPromoOffersPathParams;
      queryParams:Result<GetPromoOffersQueryParams,string>;
      bodyParams:GetPromoOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetPromosPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetPromosBodyParams = GetPromosRequest
    //#endregion


    type GetPromosStatusCode200Response = {
      content:GetPromosResponse;
      
    }

    type GetPromosStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetPromosStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetPromosStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetPromosStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetPromosStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetPromosStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetPromosResult = GetPromosStatusCode200 of GetPromosStatusCode200Response|GetPromosStatusCode400 of GetPromosStatusCode400Response|GetPromosStatusCode401 of GetPromosStatusCode401Response|GetPromosStatusCode403 of GetPromosStatusCode403Response|GetPromosStatusCode404 of GetPromosStatusCode404Response|GetPromosStatusCode420 of GetPromosStatusCode420Response|GetPromosStatusCode500 of GetPromosStatusCode500Response

    type GetPromosArgs = {
      pathParams:GetPromosPathParams;
      bodyParams:GetPromosBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetQualityRatingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetQualityRatingsBodyParams = GetQualityRatingRequest
    //#endregion


    type GetQualityRatingsStatusCode200Response = {
      content:GetQualityRatingResponse;
      
    }

    type GetQualityRatingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetQualityRatingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetQualityRatingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetQualityRatingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetQualityRatingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetQualityRatingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetQualityRatingsResult = GetQualityRatingsStatusCode200 of GetQualityRatingsStatusCode200Response|GetQualityRatingsStatusCode400 of GetQualityRatingsStatusCode400Response|GetQualityRatingsStatusCode401 of GetQualityRatingsStatusCode401Response|GetQualityRatingsStatusCode403 of GetQualityRatingsStatusCode403Response|GetQualityRatingsStatusCode404 of GetQualityRatingsStatusCode404Response|GetQualityRatingsStatusCode420 of GetQualityRatingsStatusCode420Response|GetQualityRatingsStatusCode500 of GetQualityRatingsStatusCode500Response

    type GetQualityRatingsArgs = {
      pathParams:GetQualityRatingsPathParams;
      bodyParams:GetQualityRatingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReportInfoPathParams = {
      reportId : string ;
    }
    //#endregion


    type GetReportInfoStatusCode200Response = {
      content:GetReportInfoResponse;
      
    }

    type GetReportInfoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReportInfoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReportInfoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReportInfoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReportInfoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReportInfoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReportInfoResult = GetReportInfoStatusCode200 of GetReportInfoStatusCode200Response|GetReportInfoStatusCode400 of GetReportInfoStatusCode400Response|GetReportInfoStatusCode401 of GetReportInfoStatusCode401Response|GetReportInfoStatusCode403 of GetReportInfoStatusCode403Response|GetReportInfoStatusCode404 of GetReportInfoStatusCode404Response|GetReportInfoStatusCode420 of GetReportInfoStatusCode420Response|GetReportInfoStatusCode500 of GetReportInfoStatusCode500Response

    type GetReportInfoArgs = {
      pathParams:GetReportInfoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    }
    //#endregion


    type GetReturnStatusCode200Response = {
      content:GetReturnResponse;
      
    }

    type GetReturnStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnResult = GetReturnStatusCode200 of GetReturnStatusCode200Response|GetReturnStatusCode400 of GetReturnStatusCode400Response|GetReturnStatusCode401 of GetReturnStatusCode401Response|GetReturnStatusCode403 of GetReturnStatusCode403Response|GetReturnStatusCode404 of GetReturnStatusCode404Response|GetReturnStatusCode420 of GetReturnStatusCode420Response|GetReturnStatusCode500 of GetReturnStatusCode500Response

    type GetReturnArgs = {
      pathParams:GetReturnPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnPhotoPathParams = {
      campaignId : int64 ;
    //#endregion
      orderId : int64 ;
    //#endregion
      returnId : int64 ;
    //#endregion
      itemId : int64 ;
    //#endregion
      imageHash : string ;
    }
    //#endregion


    type GetReturnPhotoStatusCode200Response = {
      content:System.IO.Stream;
      
    }

    type GetReturnPhotoStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnPhotoStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnPhotoStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnPhotoStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnPhotoStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnPhotoStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnPhotoResult = GetReturnPhotoStatusCode200 of GetReturnPhotoStatusCode200Response|GetReturnPhotoStatusCode400 of GetReturnPhotoStatusCode400Response|GetReturnPhotoStatusCode401 of GetReturnPhotoStatusCode401Response|GetReturnPhotoStatusCode403 of GetReturnPhotoStatusCode403Response|GetReturnPhotoStatusCode404 of GetReturnPhotoStatusCode404Response|GetReturnPhotoStatusCode420 of GetReturnPhotoStatusCode420Response|GetReturnPhotoStatusCode500 of GetReturnPhotoStatusCode500Response

    type GetReturnPhotoArgs = {
      pathParams:GetReturnPhotoPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetReturnsPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetReturnsQueryParams = {
      pageToken : string option;


      limit : int option;


      orderIds : int64[] option;


      statuses : RefundStatusType[] option;


      _type : ReturnType option;


      fromDate : DateTime option;


      toDate : DateTime option;


      fromDate2 : DateTime option;


      toDate2 : DateTime option;

    }
    //#endregion


    type GetReturnsStatusCode200Response = {
      content:GetReturnsResponse;
      
    }

    type GetReturnsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetReturnsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetReturnsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetReturnsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetReturnsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetReturnsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetReturnsResult = GetReturnsStatusCode200 of GetReturnsStatusCode200Response|GetReturnsStatusCode400 of GetReturnsStatusCode400Response|GetReturnsStatusCode401 of GetReturnsStatusCode401Response|GetReturnsStatusCode403 of GetReturnsStatusCode403Response|GetReturnsStatusCode404 of GetReturnsStatusCode404Response|GetReturnsStatusCode420 of GetReturnsStatusCode420Response|GetReturnsStatusCode500 of GetReturnsStatusCode500Response

    type GetReturnsArgs = {
      pathParams:GetReturnsPathParams;
      queryParams:Result<GetReturnsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetStocksPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetStocksQueryParams = {
      pageToken : string option;


      limit : int option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetStocksBodyParams = GetWarehouseStocksRequest
    //#endregion


    type GetStocksStatusCode200Response = {
      content:GetWarehouseStocksResponse;
      
    }

    type GetStocksStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetStocksStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetStocksStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetStocksStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetStocksStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetStocksResult = GetStocksStatusCode200 of GetStocksStatusCode200Response|GetStocksStatusCode400 of GetStocksStatusCode400Response|GetStocksStatusCode401 of GetStocksStatusCode401Response|GetStocksStatusCode403 of GetStocksStatusCode403Response|GetStocksStatusCode420 of GetStocksStatusCode420Response|GetStocksStatusCode500 of GetStocksStatusCode500Response

    type GetStocksArgs = {
      pathParams:GetStocksPathParams;
      queryParams:Result<GetStocksQueryParams,string>;
      bodyParams:GetStocksBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingEntriesBodyParams = GetSuggestedOfferMappingEntriesRequest
    //#endregion


    type GetSuggestedOfferMappingEntriesStatusCode200Response = {
      content:GetSuggestedOfferMappingEntriesResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedOfferMappingEntriesResult = GetSuggestedOfferMappingEntriesStatusCode200 of GetSuggestedOfferMappingEntriesStatusCode200Response|GetSuggestedOfferMappingEntriesStatusCode400 of GetSuggestedOfferMappingEntriesStatusCode400Response|GetSuggestedOfferMappingEntriesStatusCode401 of GetSuggestedOfferMappingEntriesStatusCode401Response|GetSuggestedOfferMappingEntriesStatusCode403 of GetSuggestedOfferMappingEntriesStatusCode403Response|GetSuggestedOfferMappingEntriesStatusCode404 of GetSuggestedOfferMappingEntriesStatusCode404Response|GetSuggestedOfferMappingEntriesStatusCode420 of GetSuggestedOfferMappingEntriesStatusCode420Response|GetSuggestedOfferMappingEntriesStatusCode500 of GetSuggestedOfferMappingEntriesStatusCode500Response

    type GetSuggestedOfferMappingEntriesArgs = {
      pathParams:GetSuggestedOfferMappingEntriesPathParams;
      bodyParams:GetSuggestedOfferMappingEntriesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedOfferMappingsBodyParams = GetSuggestedOfferMappingsRequest
    //#endregion


    type GetSuggestedOfferMappingsStatusCode200Response = {
      content:GetSuggestedOfferMappingsResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedOfferMappingsResult = GetSuggestedOfferMappingsStatusCode200 of GetSuggestedOfferMappingsStatusCode200Response|GetSuggestedOfferMappingsStatusCode400 of GetSuggestedOfferMappingsStatusCode400Response|GetSuggestedOfferMappingsStatusCode401 of GetSuggestedOfferMappingsStatusCode401Response|GetSuggestedOfferMappingsStatusCode403 of GetSuggestedOfferMappingsStatusCode403Response|GetSuggestedOfferMappingsStatusCode404 of GetSuggestedOfferMappingsStatusCode404Response|GetSuggestedOfferMappingsStatusCode420 of GetSuggestedOfferMappingsStatusCode420Response|GetSuggestedOfferMappingsStatusCode500 of GetSuggestedOfferMappingsStatusCode500Response

    type GetSuggestedOfferMappingsArgs = {
      pathParams:GetSuggestedOfferMappingsPathParams;
      bodyParams:GetSuggestedOfferMappingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetSuggestedPricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetSuggestedPricesBodyParams = SuggestPricesRequest
    //#endregion


    type GetSuggestedPricesStatusCode200Response = {
      content:SuggestPricesResponse;
      
    }

    type GetSuggestedPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type GetSuggestedPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type GetSuggestedPricesResult = GetSuggestedPricesStatusCode200 of GetSuggestedPricesStatusCode200Response|GetSuggestedPricesStatusCode400 of GetSuggestedPricesStatusCode400Response|GetSuggestedPricesStatusCode401 of GetSuggestedPricesStatusCode401Response|GetSuggestedPricesStatusCode403 of GetSuggestedPricesStatusCode403Response|GetSuggestedPricesStatusCode404 of GetSuggestedPricesStatusCode404Response|GetSuggestedPricesStatusCode420 of GetSuggestedPricesStatusCode420Response|GetSuggestedPricesStatusCode500 of GetSuggestedPricesStatusCode500Response

    type GetSuggestedPricesArgs = {
      pathParams:GetSuggestedPricesPathParams;
      bodyParams:GetSuggestedPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PutBidsForBusinessPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PutBidsForBusinessBodyParams = PutSkuBidsRequest
    //#endregion


    type PutBidsForBusinessStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type PutBidsForBusinessStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type PutBidsForBusinessStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type PutBidsForBusinessResult = PutBidsForBusinessStatusCode200 of PutBidsForBusinessStatusCode200Response|PutBidsForBusinessStatusCode400 of PutBidsForBusinessStatusCode400Response|PutBidsForBusinessStatusCode401 of PutBidsForBusinessStatusCode401Response|PutBidsForBusinessStatusCode403 of PutBidsForBusinessStatusCode403Response|PutBidsForBusinessStatusCode404 of PutBidsForBusinessStatusCode404Response|PutBidsForBusinessStatusCode420 of PutBidsForBusinessStatusCode420Response|PutBidsForBusinessStatusCode500 of PutBidsForBusinessStatusCode500Response

    type PutBidsForBusinessArgs = {
      pathParams:PutBidsForBusinessPathParams;
      bodyParams:PutBidsForBusinessBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PutBidsForCampaignPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PutBidsForCampaignBodyParams = PutSkuBidsRequest
    //#endregion


    type PutBidsForCampaignStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type PutBidsForCampaignStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type PutBidsForCampaignStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type PutBidsForCampaignResult = PutBidsForCampaignStatusCode200 of PutBidsForCampaignStatusCode200Response|PutBidsForCampaignStatusCode400 of PutBidsForCampaignStatusCode400Response|PutBidsForCampaignStatusCode401 of PutBidsForCampaignStatusCode401Response|PutBidsForCampaignStatusCode403 of PutBidsForCampaignStatusCode403Response|PutBidsForCampaignStatusCode404 of PutBidsForCampaignStatusCode404Response|PutBidsForCampaignStatusCode420 of PutBidsForCampaignStatusCode420Response|PutBidsForCampaignStatusCode500 of PutBidsForCampaignStatusCode500Response

    type PutBidsForCampaignArgs = {
      pathParams:PutBidsForCampaignPathParams;
      bodyParams:PutBidsForCampaignBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type RefreshFeedPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion


    type RefreshFeedStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type RefreshFeedStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type RefreshFeedStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type RefreshFeedStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type RefreshFeedStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type RefreshFeedStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type RefreshFeedStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type RefreshFeedResult = RefreshFeedStatusCode200 of RefreshFeedStatusCode200Response|RefreshFeedStatusCode400 of RefreshFeedStatusCode400Response|RefreshFeedStatusCode401 of RefreshFeedStatusCode401Response|RefreshFeedStatusCode403 of RefreshFeedStatusCode403Response|RefreshFeedStatusCode404 of RefreshFeedStatusCode404Response|RefreshFeedStatusCode420 of RefreshFeedStatusCode420Response|RefreshFeedStatusCode500 of RefreshFeedStatusCode500Response

    type RefreshFeedArgs = {
      pathParams:RefreshFeedPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SearchRegionChildrenPathParams = {
      regionId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SearchRegionChildrenQueryParams = {
      page : int option;


      pageSize : int option;

    }
    //#endregion


    type SearchRegionChildrenStatusCode200Response = {
      content:GetRegionWithChildrenResponse;
      
    }

    type SearchRegionChildrenStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionChildrenStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionChildrenResult = SearchRegionChildrenStatusCode200 of SearchRegionChildrenStatusCode200Response|SearchRegionChildrenStatusCode400 of SearchRegionChildrenStatusCode400Response|SearchRegionChildrenStatusCode401 of SearchRegionChildrenStatusCode401Response|SearchRegionChildrenStatusCode403 of SearchRegionChildrenStatusCode403Response|SearchRegionChildrenStatusCode404 of SearchRegionChildrenStatusCode404Response|SearchRegionChildrenStatusCode420 of SearchRegionChildrenStatusCode420Response|SearchRegionChildrenStatusCode500 of SearchRegionChildrenStatusCode500Response

    type SearchRegionChildrenArgs = {
      pathParams:SearchRegionChildrenPathParams;
      queryParams:Result<SearchRegionChildrenQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SearchRegionsByIdPathParams = {
      regionId : int64 ;
    }
    //#endregion


    type SearchRegionsByIdStatusCode200Response = {
      content:GetRegionsResponse;
      
    }

    type SearchRegionsByIdStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionsByIdStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionsByIdResult = SearchRegionsByIdStatusCode200 of SearchRegionsByIdStatusCode200Response|SearchRegionsByIdStatusCode401 of SearchRegionsByIdStatusCode401Response|SearchRegionsByIdStatusCode403 of SearchRegionsByIdStatusCode403Response|SearchRegionsByIdStatusCode404 of SearchRegionsByIdStatusCode404Response|SearchRegionsByIdStatusCode420 of SearchRegionsByIdStatusCode420Response|SearchRegionsByIdStatusCode500 of SearchRegionsByIdStatusCode500Response

    type SearchRegionsByIdArgs = {
      pathParams:SearchRegionsByIdPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type SearchRegionsByNameQueryParams = {
      name : string ;


      pageToken : string option;


      limit : int option;

    }
    //#endregion


    type SearchRegionsByNameStatusCode200Response = {
      content:GetRegionsResponse;
      
    }

    type SearchRegionsByNameStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SearchRegionsByNameStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SearchRegionsByNameResult = SearchRegionsByNameStatusCode200 of SearchRegionsByNameStatusCode200Response|SearchRegionsByNameStatusCode401 of SearchRegionsByNameStatusCode401Response|SearchRegionsByNameStatusCode403 of SearchRegionsByNameStatusCode403Response|SearchRegionsByNameStatusCode420 of SearchRegionsByNameStatusCode420Response|SearchRegionsByNameStatusCode500 of SearchRegionsByNameStatusCode500Response

    type SearchRegionsByNameArgs = {
      queryParams:Result<SearchRegionsByNameQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type SendFileToChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SendFileToChatQueryParams = {
      chatId : int64 ;

    }
    //#endregion

    //#region Form parameters
    [<CLIMutable>]
    type SendFileToChatFormParams = {
      file : System.IO.Stream ;
    }
    //#endregion


    type SendFileToChatStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SendFileToChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SendFileToChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SendFileToChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SendFileToChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SendFileToChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SendFileToChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SendFileToChatResult = SendFileToChatStatusCode200 of SendFileToChatStatusCode200Response|SendFileToChatStatusCode400 of SendFileToChatStatusCode400Response|SendFileToChatStatusCode401 of SendFileToChatStatusCode401Response|SendFileToChatStatusCode403 of SendFileToChatStatusCode403Response|SendFileToChatStatusCode404 of SendFileToChatStatusCode404Response|SendFileToChatStatusCode420 of SendFileToChatStatusCode420Response|SendFileToChatStatusCode500 of SendFileToChatStatusCode500Response

    type SendFileToChatArgs = {
      pathParams:SendFileToChatPathParams;
      queryParams:Result<SendFileToChatQueryParams,string>;
      formParams:Result<SendFileToChatFormParams,string>
    }
    //#region Path parameters
    [<CLIMutable>]
    type SendMessageToChatPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type SendMessageToChatQueryParams = {
      chatId : int64 ;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SendMessageToChatBodyParams = SendMessageToChatRequest
    //#endregion


    type SendMessageToChatStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SendMessageToChatStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SendMessageToChatStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SendMessageToChatStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SendMessageToChatStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SendMessageToChatStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SendMessageToChatStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SendMessageToChatResult = SendMessageToChatStatusCode200 of SendMessageToChatStatusCode200Response|SendMessageToChatStatusCode400 of SendMessageToChatStatusCode400Response|SendMessageToChatStatusCode401 of SendMessageToChatStatusCode401Response|SendMessageToChatStatusCode403 of SendMessageToChatStatusCode403Response|SendMessageToChatStatusCode404 of SendMessageToChatStatusCode404Response|SendMessageToChatStatusCode420 of SendMessageToChatStatusCode420Response|SendMessageToChatStatusCode500 of SendMessageToChatStatusCode500Response

    type SendMessageToChatArgs = {
      pathParams:SendMessageToChatPathParams;
      queryParams:Result<SendMessageToChatQueryParams,string>;
      bodyParams:SendMessageToChatBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SetFeedParamsPathParams = {
      campaignId : int64 ;
    //#endregion
      feedId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SetFeedParamsBodyParams = SetFeedParamsRequest
    //#endregion


    type SetFeedParamsStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SetFeedParamsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SetFeedParamsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SetFeedParamsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SetFeedParamsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SetFeedParamsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SetFeedParamsStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type SetFeedParamsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SetFeedParamsResult = SetFeedParamsStatusCode200 of SetFeedParamsStatusCode200Response|SetFeedParamsStatusCode400 of SetFeedParamsStatusCode400Response|SetFeedParamsStatusCode401 of SetFeedParamsStatusCode401Response|SetFeedParamsStatusCode403 of SetFeedParamsStatusCode403Response|SetFeedParamsStatusCode404 of SetFeedParamsStatusCode404Response|SetFeedParamsStatusCode420 of SetFeedParamsStatusCode420Response|SetFeedParamsStatusCode423 of SetFeedParamsStatusCode423Response|SetFeedParamsStatusCode500 of SetFeedParamsStatusCode500Response

    type SetFeedParamsArgs = {
      pathParams:SetFeedParamsPathParams;
      bodyParams:SetFeedParamsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type SkipGoodsFeedbacksReactionPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type SkipGoodsFeedbacksReactionBodyParams = SkipGoodsFeedbackReactionRequest
    //#endregion


    type SkipGoodsFeedbacksReactionStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type SkipGoodsFeedbacksReactionStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type SkipGoodsFeedbacksReactionResult = SkipGoodsFeedbacksReactionStatusCode200 of SkipGoodsFeedbacksReactionStatusCode200Response|SkipGoodsFeedbacksReactionStatusCode400 of SkipGoodsFeedbacksReactionStatusCode400Response|SkipGoodsFeedbacksReactionStatusCode401 of SkipGoodsFeedbacksReactionStatusCode401Response|SkipGoodsFeedbacksReactionStatusCode403 of SkipGoodsFeedbacksReactionStatusCode403Response|SkipGoodsFeedbacksReactionStatusCode404 of SkipGoodsFeedbacksReactionStatusCode404Response|SkipGoodsFeedbacksReactionStatusCode420 of SkipGoodsFeedbacksReactionStatusCode420Response|SkipGoodsFeedbacksReactionStatusCode500 of SkipGoodsFeedbacksReactionStatusCode500Response

    type SkipGoodsFeedbacksReactionArgs = {
      pathParams:SkipGoodsFeedbacksReactionPathParams;
      bodyParams:SkipGoodsFeedbacksReactionBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateBusinessPricesPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateBusinessPricesBodyParams = UpdateBusinessPricesRequest
    //#endregion


    type UpdateBusinessPricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateBusinessPricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateBusinessPricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateBusinessPricesResult = UpdateBusinessPricesStatusCode200 of UpdateBusinessPricesStatusCode200Response|UpdateBusinessPricesStatusCode400 of UpdateBusinessPricesStatusCode400Response|UpdateBusinessPricesStatusCode401 of UpdateBusinessPricesStatusCode401Response|UpdateBusinessPricesStatusCode403 of UpdateBusinessPricesStatusCode403Response|UpdateBusinessPricesStatusCode404 of UpdateBusinessPricesStatusCode404Response|UpdateBusinessPricesStatusCode420 of UpdateBusinessPricesStatusCode420Response|UpdateBusinessPricesStatusCode423 of UpdateBusinessPricesStatusCode423Response|UpdateBusinessPricesStatusCode500 of UpdateBusinessPricesStatusCode500Response

    type UpdateBusinessPricesArgs = {
      pathParams:UpdateBusinessPricesPathParams;
      bodyParams:UpdateBusinessPricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateCampaignOffersPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateCampaignOffersBodyParams = UpdateCampaignOffersRequest
    //#endregion


    type UpdateCampaignOffersStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateCampaignOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateCampaignOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateCampaignOffersResult = UpdateCampaignOffersStatusCode200 of UpdateCampaignOffersStatusCode200Response|UpdateCampaignOffersStatusCode400 of UpdateCampaignOffersStatusCode400Response|UpdateCampaignOffersStatusCode401 of UpdateCampaignOffersStatusCode401Response|UpdateCampaignOffersStatusCode403 of UpdateCampaignOffersStatusCode403Response|UpdateCampaignOffersStatusCode404 of UpdateCampaignOffersStatusCode404Response|UpdateCampaignOffersStatusCode420 of UpdateCampaignOffersStatusCode420Response|UpdateCampaignOffersStatusCode423 of UpdateCampaignOffersStatusCode423Response|UpdateCampaignOffersStatusCode500 of UpdateCampaignOffersStatusCode500Response

    type UpdateCampaignOffersArgs = {
      pathParams:UpdateCampaignOffersPathParams;
      bodyParams:UpdateCampaignOffersBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateGoodsFeedbackCommentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateGoodsFeedbackCommentBodyParams = UpdateGoodsFeedbackCommentRequest
    //#endregion


    type UpdateGoodsFeedbackCommentStatusCode200Response = {
      content:UpdateGoodsFeedbackCommentResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateGoodsFeedbackCommentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateGoodsFeedbackCommentResult = UpdateGoodsFeedbackCommentStatusCode200 of UpdateGoodsFeedbackCommentStatusCode200Response|UpdateGoodsFeedbackCommentStatusCode400 of UpdateGoodsFeedbackCommentStatusCode400Response|UpdateGoodsFeedbackCommentStatusCode401 of UpdateGoodsFeedbackCommentStatusCode401Response|UpdateGoodsFeedbackCommentStatusCode403 of UpdateGoodsFeedbackCommentStatusCode403Response|UpdateGoodsFeedbackCommentStatusCode404 of UpdateGoodsFeedbackCommentStatusCode404Response|UpdateGoodsFeedbackCommentStatusCode420 of UpdateGoodsFeedbackCommentStatusCode420Response|UpdateGoodsFeedbackCommentStatusCode500 of UpdateGoodsFeedbackCommentStatusCode500Response

    type UpdateGoodsFeedbackCommentArgs = {
      pathParams:UpdateGoodsFeedbackCommentPathParams;
      bodyParams:UpdateGoodsFeedbackCommentBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferContentPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferContentBodyParams = UpdateOfferContentRequest
    //#endregion


    type UpdateOfferContentStatusCode200Response = {
      content:UpdateOfferContentResponse;
      
    }

    type UpdateOfferContentStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferContentStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferContentStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferContentStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferContentStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferContentStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferContentStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferContentResult = UpdateOfferContentStatusCode200 of UpdateOfferContentStatusCode200Response|UpdateOfferContentStatusCode400 of UpdateOfferContentStatusCode400Response|UpdateOfferContentStatusCode401 of UpdateOfferContentStatusCode401Response|UpdateOfferContentStatusCode403 of UpdateOfferContentStatusCode403Response|UpdateOfferContentStatusCode404 of UpdateOfferContentStatusCode404Response|UpdateOfferContentStatusCode420 of UpdateOfferContentStatusCode420Response|UpdateOfferContentStatusCode423 of UpdateOfferContentStatusCode423Response|UpdateOfferContentStatusCode500 of UpdateOfferContentStatusCode500Response

    type UpdateOfferContentArgs = {
      pathParams:UpdateOfferContentPathParams;
      bodyParams:UpdateOfferContentBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferMappingEntriesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferMappingEntriesBodyParams = UpdateOfferMappingEntryRequest
    //#endregion


    type UpdateOfferMappingEntriesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferMappingEntriesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferMappingEntriesResult = UpdateOfferMappingEntriesStatusCode200 of UpdateOfferMappingEntriesStatusCode200Response|UpdateOfferMappingEntriesStatusCode400 of UpdateOfferMappingEntriesStatusCode400Response|UpdateOfferMappingEntriesStatusCode401 of UpdateOfferMappingEntriesStatusCode401Response|UpdateOfferMappingEntriesStatusCode403 of UpdateOfferMappingEntriesStatusCode403Response|UpdateOfferMappingEntriesStatusCode404 of UpdateOfferMappingEntriesStatusCode404Response|UpdateOfferMappingEntriesStatusCode420 of UpdateOfferMappingEntriesStatusCode420Response|UpdateOfferMappingEntriesStatusCode423 of UpdateOfferMappingEntriesStatusCode423Response|UpdateOfferMappingEntriesStatusCode500 of UpdateOfferMappingEntriesStatusCode500Response

    type UpdateOfferMappingEntriesArgs = {
      pathParams:UpdateOfferMappingEntriesPathParams;
      bodyParams:UpdateOfferMappingEntriesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdateOfferMappingsPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdateOfferMappingsBodyParams = UpdateOfferMappingsRequest
    //#endregion


    type UpdateOfferMappingsStatusCode200Response = {
      content:UpdateOfferMappingsResponse;
      
    }

    type UpdateOfferMappingsStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdateOfferMappingsStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdateOfferMappingsResult = UpdateOfferMappingsStatusCode200 of UpdateOfferMappingsStatusCode200Response|UpdateOfferMappingsStatusCode400 of UpdateOfferMappingsStatusCode400Response|UpdateOfferMappingsStatusCode401 of UpdateOfferMappingsStatusCode401Response|UpdateOfferMappingsStatusCode403 of UpdateOfferMappingsStatusCode403Response|UpdateOfferMappingsStatusCode404 of UpdateOfferMappingsStatusCode404Response|UpdateOfferMappingsStatusCode420 of UpdateOfferMappingsStatusCode420Response|UpdateOfferMappingsStatusCode423 of UpdateOfferMappingsStatusCode423Response|UpdateOfferMappingsStatusCode500 of UpdateOfferMappingsStatusCode500Response

    type UpdateOfferMappingsArgs = {
      pathParams:UpdateOfferMappingsPathParams;
      bodyParams:UpdateOfferMappingsBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdatePricesPathParams = {
      campaignId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdatePricesBodyParams = UpdatePricesRequest
    //#endregion


    type UpdatePricesStatusCode200Response = {
      content:EmptyApiResponse;
      
    }

    type UpdatePricesStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdatePricesStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdatePricesStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdatePricesStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdatePricesStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdatePricesStatusCode423Response = {
      content:ApiLockedErrorResponse;
      
    }

    type UpdatePricesStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdatePricesResult = UpdatePricesStatusCode200 of UpdatePricesStatusCode200Response|UpdatePricesStatusCode400 of UpdatePricesStatusCode400Response|UpdatePricesStatusCode401 of UpdatePricesStatusCode401Response|UpdatePricesStatusCode403 of UpdatePricesStatusCode403Response|UpdatePricesStatusCode404 of UpdatePricesStatusCode404Response|UpdatePricesStatusCode420 of UpdatePricesStatusCode420Response|UpdatePricesStatusCode423 of UpdatePricesStatusCode423Response|UpdatePricesStatusCode500 of UpdatePricesStatusCode500Response

    type UpdatePricesArgs = {
      pathParams:UpdatePricesPathParams;
      bodyParams:UpdatePricesBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type UpdatePromoOffersPathParams = {
      businessId : int64 ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type UpdatePromoOffersBodyParams = UpdatePromoOffersRequest
    //#endregion


    type UpdatePromoOffersStatusCode200Response = {
      content:UpdatePromoOffersResponse;
      
    }

    type UpdatePromoOffersStatusCode400Response = {
      content:ApiClientDataErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode401Response = {
      content:ApiUnauthorizedErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode403Response = {
      content:ApiForbiddenErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode404Response = {
      content:ApiNotFoundErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode420Response = {
      content:ApiLimitErrorResponse;
      
    }

    type UpdatePromoOffersStatusCode500Response = {
      content:ApiServerErrorResponse;
      
    }
    type UpdatePromoOffersResult = UpdatePromoOffersStatusCode200 of UpdatePromoOffersStatusCode200Response|UpdatePromoOffersStatusCode400 of UpdatePromoOffersStatusCode400Response|UpdatePromoOffersStatusCode401 of UpdatePromoOffersStatusCode401Response|UpdatePromoOffersStatusCode403 of UpdatePromoOffersStatusCode403Response|UpdatePromoOffersStatusCode404 of UpdatePromoOffersStatusCode404Response|UpdatePromoOffersStatusCode420 of UpdatePromoOffersStatusCode420Response|UpdatePromoOffersStatusCode500 of UpdatePromoOffersStatusCode500Response

    type UpdatePromoOffersArgs = {
      pathParams:UpdatePromoOffersPathParams;
      bodyParams:UpdatePromoOffersBodyParams
    }
