namespace ympa_fsharp_giraffe_server

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ExpressApiHandlerParams
open ExpressApiServiceInterface
open ExpressApiServiceImplementation
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
open ympa_fsharp_giraffe_server.Model.GenerateGoodsRealizationReportRequest
open ympa_fsharp_giraffe_server.Model.GenerateMassOrderLabelsRequest
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
open ympa_fsharp_giraffe_server.Model.GetDeliveryServicesResponse
open ympa_fsharp_giraffe_server.Model.GetFeedIndexLogsResponse
open ympa_fsharp_giraffe_server.Model.GetFeedResponse
open ympa_fsharp_giraffe_server.Model.GetFeedbackListResponse
open ympa_fsharp_giraffe_server.Model.GetFeedsResponse
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
open ympa_fsharp_giraffe_server.Model.GetOrderLabelsDataResponse
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
open ympa_fsharp_giraffe_server.Model.GetQualityRatingDetailsResponse
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
open ympa_fsharp_giraffe_server.Model.GetWarehousesResponse
open ympa_fsharp_giraffe_server.Model.OfferAvailabilityStatusType
open ympa_fsharp_giraffe_server.Model.OfferMappingKindType
open ympa_fsharp_giraffe_server.Model.OfferProcessingStatusType
open ympa_fsharp_giraffe_server.Model.OrderBuyerType
open ympa_fsharp_giraffe_server.Model.OrderDeliveryDispatchType
open ympa_fsharp_giraffe_server.Model.OrderStatusType
open ympa_fsharp_giraffe_server.Model.OrderSubstatusType
open ympa_fsharp_giraffe_server.Model.PageFormatType
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersRequest
open ympa_fsharp_giraffe_server.Model.ProvideOrderItemIdentifiersResponse
open ympa_fsharp_giraffe_server.Model.PutSkuBidsRequest
open ympa_fsharp_giraffe_server.Model.RefundStatusType
open ympa_fsharp_giraffe_server.Model.ReportFormatType
open ympa_fsharp_giraffe_server.Model.ReturnType
open ympa_fsharp_giraffe_server.Model.SendMessageToChatRequest
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.SetFeedParamsRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutResponse
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesRequest
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesResponse
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
open ympa_fsharp_giraffe_server.Model.UpdateOrderItemRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusResponse
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesRequest
open ympa_fsharp_giraffe_server.Model.UpdateOrderStatusesResponse
open ympa_fsharp_giraffe_server.Model.UpdatePricesRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersRequest
open ympa_fsharp_giraffe_server.Model.UpdatePromoOffersResponse
open ympa_fsharp_giraffe_server.Model.UpdateStocksRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacRequest
open ympa_fsharp_giraffe_server.Model.VerifyOrderEacResponse

module ExpressApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AddHiddenOffers
    /// <summary>
    /// Скрытие товаров и настройки скрытия
    /// </summary>

    let AddHiddenOffers (pathParams:AddHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AddHiddenOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AddHiddenOffersArgs
          let result = ExpressApiService.AddHiddenOffers ctx serviceArgs
          return! (match result with
                      | AddHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AddHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AddHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AddHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AddHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | AddHiddenOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | AddHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AddOffersToArchive
    /// <summary>
    /// Добавление товаров в архив
    /// </summary>

    let AddOffersToArchive (pathParams:AddOffersToArchivePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AddOffersToArchiveBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AddOffersToArchiveArgs
          let result = ExpressApiService.AddOffersToArchive ctx serviceArgs
          return! (match result with
                      | AddOffersToArchiveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AddOffersToArchiveStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AddOffersToArchiveStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AddOffersToArchiveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AddOffersToArchiveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AddOffersToArchiveStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | AddOffersToArchiveStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | AddOffersToArchiveStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CalculateTariffs
    /// <summary>
    /// Калькулятор стоимости услуг
    /// </summary>

    let CalculateTariffs  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CalculateTariffsBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : CalculateTariffsArgs
          let result = ExpressApiService.CalculateTariffs ctx serviceArgs
          return! (match result with
                      | CalculateTariffsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CalculateTariffsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CalculateTariffsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CalculateTariffsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CalculateTariffsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CalculateTariffsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | CalculateTariffsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConfirmBusinessPrices
    /// <summary>
    /// Удаление товара из карантина по цене в кабинете
    /// </summary>

    let ConfirmBusinessPrices (pathParams:ConfirmBusinessPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConfirmBusinessPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConfirmBusinessPricesArgs
          let result = ExpressApiService.ConfirmBusinessPrices ctx serviceArgs
          return! (match result with
                      | ConfirmBusinessPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | ConfirmBusinessPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ConfirmCampaignPrices
    /// <summary>
    /// Удаление товара из карантина по цене в магазине
    /// </summary>

    let ConfirmCampaignPrices (pathParams:ConfirmCampaignPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ConfirmCampaignPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ConfirmCampaignPricesArgs
          let result = ExpressApiService.ConfirmCampaignPrices ctx serviceArgs
          return! (match result with
                      | ConfirmCampaignPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | ConfirmCampaignPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CreateChat
    /// <summary>
    /// Создание нового чата с покупателем
    /// </summary>

    let CreateChat (pathParams:CreateChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CreateChatBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CreateChatArgs
          let result = ExpressApiService.CreateChat ctx serviceArgs
          return! (match result with
                      | CreateChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CreateChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CreateChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CreateChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CreateChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CreateChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | CreateChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteCampaignOffers
    /// <summary>
    /// Удаление товаров из ассортимента магазина
    /// </summary>

    let DeleteCampaignOffers (pathParams:DeleteCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteCampaignOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteCampaignOffersArgs
          let result = ExpressApiService.DeleteCampaignOffers ctx serviceArgs
          return! (match result with
                      | DeleteCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteGoodsFeedbackComment
    /// <summary>
    /// Удаление комментария к отзыву
    /// </summary>

    let DeleteGoodsFeedbackComment (pathParams:DeleteGoodsFeedbackCommentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteGoodsFeedbackCommentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteGoodsFeedbackCommentArgs
          let result = ExpressApiService.DeleteGoodsFeedbackComment ctx serviceArgs
          return! (match result with
                      | DeleteGoodsFeedbackCommentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteGoodsFeedbackCommentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteHiddenOffers
    /// <summary>
    /// Возобновление показа товаров
    /// </summary>

    let DeleteHiddenOffers (pathParams:DeleteHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteHiddenOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteHiddenOffersArgs
          let result = ExpressApiService.DeleteHiddenOffers ctx serviceArgs
          return! (match result with
                      | DeleteHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteOffers
    /// <summary>
    /// Удаление товаров из каталога
    /// </summary>

    let DeleteOffers (pathParams:DeleteOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteOffersArgs
          let result = ExpressApiService.DeleteOffers ctx serviceArgs
          return! (match result with
                      | DeleteOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeleteOffersFromArchive
    /// <summary>
    /// Удаление товаров из архива
    /// </summary>

    let DeleteOffersFromArchive (pathParams:DeleteOffersFromArchivePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeleteOffersFromArchiveBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeleteOffersFromArchiveArgs
          let result = ExpressApiService.DeleteOffersFromArchive ctx serviceArgs
          return! (match result with
                      | DeleteOffersFromArchiveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | DeleteOffersFromArchiveStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeletePromoOffers
    /// <summary>
    /// Удаление товаров из акции
    /// </summary>

    let DeletePromoOffers (pathParams:DeletePromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<DeletePromoOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : DeletePromoOffersArgs
          let result = ExpressApiService.DeletePromoOffers ctx serviceArgs
          return! (match result with
                      | DeletePromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeletePromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeletePromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeletePromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeletePromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeletePromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | DeletePromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateBoostConsolidatedReport
    /// <summary>
    /// Отчет по бусту продаж
    /// </summary>

    let GenerateBoostConsolidatedReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateBoostConsolidatedReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateBoostConsolidatedReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateBoostConsolidatedReportArgs
          let result = ExpressApiService.GenerateBoostConsolidatedReport ctx serviceArgs
          return! (match result with
                      | GenerateBoostConsolidatedReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateBoostConsolidatedReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateCompetitorsPositionReport
    /// <summary>
    /// Отчет «Конкурентная позиция»
    /// </summary>

    let GenerateCompetitorsPositionReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateCompetitorsPositionReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateCompetitorsPositionReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateCompetitorsPositionReportArgs
          let result = ExpressApiService.GenerateCompetitorsPositionReport ctx serviceArgs
          return! (match result with
                      | GenerateCompetitorsPositionReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateCompetitorsPositionReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsFeedbackReport
    /// <summary>
    /// Отчет по отзывам о товарах
    /// </summary>

    let GenerateGoodsFeedbackReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsFeedbackReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsFeedbackReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsFeedbackReportArgs
          let result = ExpressApiService.GenerateGoodsFeedbackReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsFeedbackReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsFeedbackReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateGoodsRealizationReport
    /// <summary>
    /// Отчет по реализации
    /// </summary>

    let GenerateGoodsRealizationReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateGoodsRealizationReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateGoodsRealizationReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateGoodsRealizationReportArgs
          let result = ExpressApiService.GenerateGoodsRealizationReport ctx serviceArgs
          return! (match result with
                      | GenerateGoodsRealizationReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateGoodsRealizationReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateMassOrderLabelsReport
    /// <summary>
    /// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
    /// </summary>

    let GenerateMassOrderLabelsReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateMassOrderLabelsReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateMassOrderLabelsReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateMassOrderLabelsReportArgs
          let result = ExpressApiService.GenerateMassOrderLabelsReport ctx serviceArgs
          return! (match result with
                      | GenerateMassOrderLabelsReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateMassOrderLabelsReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateOrderLabel
    /// <summary>
    /// Готовый ярлык‑наклейка для коробки в заказе
    /// </summary>

    let GenerateOrderLabel (pathParams:GenerateOrderLabelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateOrderLabelQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GenerateOrderLabelArgs
          let result = ExpressApiService.GenerateOrderLabel ctx serviceArgs
          return! (match result with
                      | GenerateOrderLabelStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GenerateOrderLabelStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateOrderLabelStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateOrderLabelStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateOrderLabelStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GenerateOrderLabelStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateOrderLabelStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateOrderLabels
    /// <summary>
    /// Готовые ярлыки‑наклейки на все коробки в одном заказе
    /// </summary>

    let GenerateOrderLabels (pathParams:GenerateOrderLabelsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateOrderLabelsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GenerateOrderLabelsArgs
          let result = ExpressApiService.GenerateOrderLabels ctx serviceArgs
          return! (match result with
                      | GenerateOrderLabelsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GenerateOrderLabelsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateOrderLabelsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GeneratePricesReport
    /// <summary>
    /// Отчет «Цены на рынке»
    /// </summary>

    let GeneratePricesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GeneratePricesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GeneratePricesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GeneratePricesReportArgs
          let result = ExpressApiService.GeneratePricesReport ctx serviceArgs
          return! (match result with
                      | GeneratePricesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GeneratePricesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GeneratePricesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GeneratePricesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GeneratePricesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GeneratePricesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateShelfsStatisticsReport
    /// <summary>
    /// Отчет по полкам
    /// </summary>

    let GenerateShelfsStatisticsReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateShelfsStatisticsReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateShelfsStatisticsReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateShelfsStatisticsReportArgs
          let result = ExpressApiService.GenerateShelfsStatisticsReport ctx serviceArgs
          return! (match result with
                      | GenerateShelfsStatisticsReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateShelfsStatisticsReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateShowsSalesReport
    /// <summary>
    /// Отчет «Аналитика продаж»
    /// </summary>

    let GenerateShowsSalesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateShowsSalesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateShowsSalesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateShowsSalesReportArgs
          let result = ExpressApiService.GenerateShowsSalesReport ctx serviceArgs
          return! (match result with
                      | GenerateShowsSalesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateShowsSalesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateStocksOnWarehousesReport
    /// <summary>
    /// Отчет по остаткам на складах
    /// </summary>

    let GenerateStocksOnWarehousesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateStocksOnWarehousesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateStocksOnWarehousesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateStocksOnWarehousesReportArgs
          let result = ExpressApiService.GenerateStocksOnWarehousesReport ctx serviceArgs
          return! (match result with
                      | GenerateStocksOnWarehousesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateStocksOnWarehousesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedMarketplaceServicesReport
    /// <summary>
    /// Отчет по стоимости услуг
    /// </summary>

    let GenerateUnitedMarketplaceServicesReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedMarketplaceServicesReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedMarketplaceServicesReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedMarketplaceServicesReportArgs
          let result = ExpressApiService.GenerateUnitedMarketplaceServicesReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedMarketplaceServicesReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedMarketplaceServicesReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedNettingReport
    /// <summary>
    /// Отчет по платежам
    /// </summary>

    let GenerateUnitedNettingReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedNettingReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedNettingReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedNettingReportArgs
          let result = ExpressApiService.GenerateUnitedNettingReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedNettingReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedNettingReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GenerateUnitedOrdersReport
    /// <summary>
    /// Отчет по заказам
    /// </summary>

    let GenerateUnitedOrdersReport  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GenerateUnitedOrdersReportQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GenerateUnitedOrdersReportBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : GenerateUnitedOrdersReportArgs
          let result = ExpressApiService.GenerateUnitedOrdersReport ctx serviceArgs
          return! (match result with
                      | GenerateUnitedOrdersReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GenerateUnitedOrdersReportStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetAllOffers
    /// <summary>
    /// Все предложения магазина
    /// </summary>

    let GetAllOffers (pathParams:GetAllOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetAllOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetAllOffersArgs
          let result = ExpressApiService.GetAllOffers ctx serviceArgs
          return! (match result with
                      | GetAllOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetAllOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetAllOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetAllOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetAllOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetAllOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetAllOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBidsInfoForBusiness
    /// <summary>
    /// Информация об установленных ставках
    /// </summary>

    let GetBidsInfoForBusiness (pathParams:GetBidsInfoForBusinessPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBidsInfoForBusinessQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetBidsInfoForBusinessBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetBidsInfoForBusinessArgs
          let result = ExpressApiService.GetBidsInfoForBusiness ctx serviceArgs
          return! (match result with
                      | GetBidsInfoForBusinessStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBidsInfoForBusinessStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBidsRecommendations
    /// <summary>
    /// Рекомендованные ставки для заданных товаров
    /// </summary>

    let GetBidsRecommendations (pathParams:GetBidsRecommendationsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetBidsRecommendationsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetBidsRecommendationsArgs
          let result = ExpressApiService.GetBidsRecommendations ctx serviceArgs
          return! (match result with
                      | GetBidsRecommendationsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBidsRecommendationsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessQuarantineOffers
    /// <summary>
    /// Список товаров, находящихся в карантине по цене в кабинете
    /// </summary>

    let GetBusinessQuarantineOffers (pathParams:GetBusinessQuarantineOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetBusinessQuarantineOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetBusinessQuarantineOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetBusinessQuarantineOffersArgs
          let result = ExpressApiService.GetBusinessQuarantineOffers ctx serviceArgs
          return! (match result with
                      | GetBusinessQuarantineOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBusinessQuarantineOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetBusinessSettings
    /// <summary>
    /// Настройки кабинета
    /// </summary>

    let GetBusinessSettings (pathParams:GetBusinessSettingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetBusinessSettingsArgs
          let result = ExpressApiService.GetBusinessSettings ctx serviceArgs
          return! (match result with
                      | GetBusinessSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetBusinessSettingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetBusinessSettingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetBusinessSettingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetBusinessSettingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetBusinessSettingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetBusinessSettingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaign
    /// <summary>
    /// Информация о магазине
    /// </summary>

    let GetCampaign (pathParams:GetCampaignPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignArgs
          let result = ExpressApiService.GetCampaign ctx serviceArgs
          return! (match result with
                      | GetCampaignStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignLogins
    /// <summary>
    /// Логины, связанные с магазином
    /// </summary>

    let GetCampaignLogins (pathParams:GetCampaignLoginsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignLoginsArgs
          let result = ExpressApiService.GetCampaignLogins ctx serviceArgs
          return! (match result with
                      | GetCampaignLoginsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignLoginsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignLoginsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignLoginsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignLoginsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignLoginsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignLoginsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignOffers
    /// <summary>
    /// Информация о товарах, которые размещены в заданном магазине
    /// </summary>

    let GetCampaignOffers (pathParams:GetCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetCampaignOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetCampaignOffersArgs
          let result = ExpressApiService.GetCampaignOffers ctx serviceArgs
          return! (match result with
                      | GetCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignQuarantineOffers
    /// <summary>
    /// Список товаров, находящихся в карантине по цене в магазине
    /// </summary>

    let GetCampaignQuarantineOffers (pathParams:GetCampaignQuarantineOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignQuarantineOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetCampaignQuarantineOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetCampaignQuarantineOffersArgs
          let result = ExpressApiService.GetCampaignQuarantineOffers ctx serviceArgs
          return! (match result with
                      | GetCampaignQuarantineOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignQuarantineOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignRegion
    /// <summary>
    /// Регион магазина
    /// </summary>

    let GetCampaignRegion (pathParams:GetCampaignRegionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignRegionArgs
          let result = ExpressApiService.GetCampaignRegion ctx serviceArgs
          return! (match result with
                      | GetCampaignRegionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignRegionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignRegionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignRegionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignRegionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignRegionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignRegionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignSettings
    /// <summary>
    /// Настройки магазина
    /// </summary>

    let GetCampaignSettings (pathParams:GetCampaignSettingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCampaignSettingsArgs
          let result = ExpressApiService.GetCampaignSettings ctx serviceArgs
          return! (match result with
                      | GetCampaignSettingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignSettingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignSettingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignSettingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignSettingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignSettingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignSettingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaigns
    /// <summary>
    /// Список магазинов пользователя
    /// </summary>

    let GetCampaigns  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : GetCampaignsArgs
          let result = ExpressApiService.GetCampaigns ctx serviceArgs
          return! (match result with
                      | GetCampaignsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCampaignsByLogin
    /// <summary>
    /// Магазины, доступные логину
    /// </summary>

    let GetCampaignsByLogin (pathParams:GetCampaignsByLoginPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetCampaignsByLoginQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetCampaignsByLoginArgs
          let result = ExpressApiService.GetCampaignsByLogin ctx serviceArgs
          return! (match result with
                      | GetCampaignsByLoginStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCampaignsByLoginStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCategoriesMaxSaleQuantum
    /// <summary>
    /// Лимит на установку кванта продажи и минимального количества товаров в заказе
    /// </summary>

    let GetCategoriesMaxSaleQuantum  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetCategoriesMaxSaleQuantumBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : GetCategoriesMaxSaleQuantumArgs
          let result = ExpressApiService.GetCategoriesMaxSaleQuantum ctx serviceArgs
          return! (match result with
                      | GetCategoriesMaxSaleQuantumStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoriesMaxSaleQuantumStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCategoriesTree
    /// <summary>
    /// Дерево категорий
    /// </summary>

    let GetCategoriesTree  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetCategoriesTreeBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : GetCategoriesTreeArgs
          let result = ExpressApiService.GetCategoriesTree ctx serviceArgs
          return! (match result with
                      | GetCategoriesTreeStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoriesTreeStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoriesTreeStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoriesTreeStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoriesTreeStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoriesTreeStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoriesTreeStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetCategoryContentParameters
    /// <summary>
    /// Списки характеристик товаров по категориям
    /// </summary>

    let GetCategoryContentParameters (pathParams:GetCategoryContentParametersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetCategoryContentParametersArgs
          let result = ExpressApiService.GetCategoryContentParameters ctx serviceArgs
          return! (match result with
                      | GetCategoryContentParametersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetCategoryContentParametersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetChatHistory
    /// <summary>
    /// Получение истории сообщений в чате
    /// </summary>

    let GetChatHistory (pathParams:GetChatHistoryPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetChatHistoryQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetChatHistoryBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetChatHistoryArgs
          let result = ExpressApiService.GetChatHistory ctx serviceArgs
          return! (match result with
                      | GetChatHistoryStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetChatHistoryStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetChatHistoryStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetChatHistoryStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetChatHistoryStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetChatHistoryStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetChatHistoryStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetChats
    /// <summary>
    /// Получение доступных чатов
    /// </summary>

    let GetChats (pathParams:GetChatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetChatsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetChatsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetChatsArgs
          let result = ExpressApiService.GetChats ctx serviceArgs
          return! (match result with
                      | GetChatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetChatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetChatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetChatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetChatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetChatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetChatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetDeliveryServices
    /// <summary>
    /// Справочник служб доставки
    /// </summary>

    let GetDeliveryServices  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ExpressApiService.GetDeliveryServices ctx 
          return! (match result with
                      | GetDeliveryServicesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetDeliveryServicesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetDeliveryServicesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetDeliveryServicesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetDeliveryServicesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetDeliveryServicesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetDeliveryServicesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeed
    /// <summary>
    /// Информация о прайс-листе
    /// </summary>

    let GetFeed (pathParams:GetFeedPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetFeedArgs
          let result = ExpressApiService.GetFeed ctx serviceArgs
          return! (match result with
                      | GetFeedStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeedIndexLogs
    /// <summary>
    /// Отчет по индексации прайс-листа
    /// </summary>

    let GetFeedIndexLogs (pathParams:GetFeedIndexLogsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetFeedIndexLogsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetFeedIndexLogsArgs
          let result = ExpressApiService.GetFeedIndexLogs ctx serviceArgs
          return! (match result with
                      | GetFeedIndexLogsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedIndexLogsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeedbackAndCommentUpdates
    /// <summary>
    /// Новые и обновленные отзывы о магазине
    /// </summary>

    let GetFeedbackAndCommentUpdates (pathParams:GetFeedbackAndCommentUpdatesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetFeedbackAndCommentUpdatesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetFeedbackAndCommentUpdatesArgs
          let result = ExpressApiService.GetFeedbackAndCommentUpdates ctx serviceArgs
          return! (match result with
                      | GetFeedbackAndCommentUpdatesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedbackAndCommentUpdatesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetFeeds
    /// <summary>
    /// Список прайс-листов магазина
    /// </summary>

    let GetFeeds (pathParams:GetFeedsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetFeedsArgs
          let result = ExpressApiService.GetFeeds ctx serviceArgs
          return! (match result with
                      | GetFeedsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetFeedsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetFeedsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetFeedsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetFeedsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetFeedsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetFeedsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetGoodsFeedbackComments
    /// <summary>
    /// Получение комментариев к отзыву
    /// </summary>

    let GetGoodsFeedbackComments (pathParams:GetGoodsFeedbackCommentsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetGoodsFeedbackCommentsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsFeedbackCommentsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetGoodsFeedbackCommentsArgs
          let result = ExpressApiService.GetGoodsFeedbackComments ctx serviceArgs
          return! (match result with
                      | GetGoodsFeedbackCommentsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsFeedbackCommentsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetGoodsFeedbacks
    /// <summary>
    /// Получение отзывов о товарах продавца
    /// </summary>

    let GetGoodsFeedbacks (pathParams:GetGoodsFeedbacksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetGoodsFeedbacksQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsFeedbacksBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetGoodsFeedbacksArgs
          let result = ExpressApiService.GetGoodsFeedbacks ctx serviceArgs
          return! (match result with
                      | GetGoodsFeedbacksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsFeedbacksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetGoodsStats
    /// <summary>
    /// Отчет по товарам
    /// </summary>

    let GetGoodsStats (pathParams:GetGoodsStatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetGoodsStatsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetGoodsStatsArgs
          let result = ExpressApiService.GetGoodsStats ctx serviceArgs
          return! (match result with
                      | GetGoodsStatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetGoodsStatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetGoodsStatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetGoodsStatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetGoodsStatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetGoodsStatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetGoodsStatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetHiddenOffers
    /// <summary>
    /// Информация о скрытых вами товарах
    /// </summary>

    let GetHiddenOffers (pathParams:GetHiddenOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetHiddenOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetHiddenOffersArgs
          let result = ExpressApiService.GetHiddenOffers ctx serviceArgs
          return! (match result with
                      | GetHiddenOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetHiddenOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetHiddenOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetHiddenOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetHiddenOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetHiddenOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferCardsContentStatus
    /// <summary>
    /// Получение информации о заполненности карточек магазина
    /// </summary>

    let GetOfferCardsContentStatus (pathParams:GetOfferCardsContentStatusPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferCardsContentStatusQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferCardsContentStatusBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferCardsContentStatusArgs
          let result = ExpressApiService.GetOfferCardsContentStatus ctx serviceArgs
          return! (match result with
                      | GetOfferCardsContentStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferCardsContentStatusStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferMappingEntries
    /// <summary>
    /// Список товаров в каталоге
    /// </summary>

    let GetOfferMappingEntries (pathParams:GetOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferMappingEntriesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOfferMappingEntriesArgs
          let result = ExpressApiService.GetOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | GetOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferMappings
    /// <summary>
    /// Информация о товарах в каталоге
    /// </summary>

    let GetOfferMappings (pathParams:GetOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferMappingsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferMappingsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferMappingsArgs
          let result = ExpressApiService.GetOfferMappings ctx serviceArgs
          return! (match result with
                      | GetOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOfferRecommendations
    /// <summary>
    /// Рекомендации Маркета, касающиеся цен
    /// </summary>

    let GetOfferRecommendations (pathParams:GetOfferRecommendationsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOfferRecommendationsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOfferRecommendationsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOfferRecommendationsArgs
          let result = ExpressApiService.GetOfferRecommendations ctx serviceArgs
          return! (match result with
                      | GetOfferRecommendationsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOfferRecommendationsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOffers
    /// <summary>
    /// Предложения магазина
    /// </summary>

    let GetOffers (pathParams:GetOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOffersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOffersArgs
          let result = ExpressApiService.GetOffers ctx serviceArgs
          return! (match result with
                      | GetOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrder
    /// <summary>
    /// Информация об одном заказе
    /// </summary>

    let GetOrder (pathParams:GetOrderPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderArgs
          let result = ExpressApiService.GetOrder ctx serviceArgs
          return! (match result with
                      | GetOrderStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrderBusinessBuyerInfo
    /// <summary>
    /// Информация о покупателе — юридическом лице
    /// </summary>

    let GetOrderBusinessBuyerInfo (pathParams:GetOrderBusinessBuyerInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderBusinessBuyerInfoArgs
          let result = ExpressApiService.GetOrderBusinessBuyerInfo ctx serviceArgs
          return! (match result with
                      | GetOrderBusinessBuyerInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderBusinessBuyerInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrderBusinessDocumentsInfo
    /// <summary>
    /// Информация о документах
    /// </summary>

    let GetOrderBusinessDocumentsInfo (pathParams:GetOrderBusinessDocumentsInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderBusinessDocumentsInfoArgs
          let result = ExpressApiService.GetOrderBusinessDocumentsInfo ctx serviceArgs
          return! (match result with
                      | GetOrderBusinessDocumentsInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderBusinessDocumentsInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrderLabelsData
    /// <summary>
    /// Данные для самостоятельного изготовления ярлыков
    /// </summary>

    let GetOrderLabelsData (pathParams:GetOrderLabelsDataPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetOrderLabelsDataArgs
          let result = ExpressApiService.GetOrderLabelsData ctx serviceArgs
          return! (match result with
                      | GetOrderLabelsDataStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrderLabelsDataStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrders
    /// <summary>
    /// Информация о нескольких заказах
    /// </summary>

    let GetOrders (pathParams:GetOrdersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOrdersQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetOrdersArgs
          let result = ExpressApiService.GetOrders ctx serviceArgs
          return! (match result with
                      | GetOrdersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrdersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrdersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrdersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrdersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrdersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrdersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetOrdersStats
    /// <summary>
    /// Детальная информация по заказам
    /// </summary>

    let GetOrdersStats (pathParams:GetOrdersStatsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetOrdersStatsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetOrdersStatsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetOrdersStatsArgs
          let result = ExpressApiService.GetOrdersStats ctx serviceArgs
          return! (match result with
                      | GetOrdersStatsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetOrdersStatsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetOrdersStatsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetOrdersStatsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetOrdersStatsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetOrdersStatsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetOrdersStatsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPrices
    /// <summary>
    /// Список цен
    /// </summary>

    let GetPrices (pathParams:GetPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPricesQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetPricesArgs
          let result = ExpressApiService.GetPrices ctx serviceArgs
          return! (match result with
                      | GetPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPricesByOfferIds
    /// <summary>
    /// Просмотр цен на указанные товары в магазине
    /// </summary>

    let GetPricesByOfferIds (pathParams:GetPricesByOfferIdsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPricesByOfferIdsQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetPricesByOfferIdsBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetPricesByOfferIdsArgs
          let result = ExpressApiService.GetPricesByOfferIds ctx serviceArgs
          return! (match result with
                      | GetPricesByOfferIdsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPricesByOfferIdsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPromoOffers
    /// <summary>
    /// Получение списка товаров, которые участвуют или могут участвовать в акции
    /// </summary>

    let GetPromoOffers (pathParams:GetPromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetPromoOffersQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetPromoOffersBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetPromoOffersArgs
          let result = ExpressApiService.GetPromoOffers ctx serviceArgs
          return! (match result with
                      | GetPromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetPromos
    /// <summary>
    /// Получение списка акций
    /// </summary>

    let GetPromos (pathParams:GetPromosPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetPromosBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetPromosArgs
          let result = ExpressApiService.GetPromos ctx serviceArgs
          return! (match result with
                      | GetPromosStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetPromosStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetPromosStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetPromosStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetPromosStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetPromosStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetPromosStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetQualityRatingDetails
    /// <summary>
    /// Заказы, которые повлияли на индекс качества
    /// </summary>

    let GetQualityRatingDetails (pathParams:GetQualityRatingDetailsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetQualityRatingDetailsArgs
          let result = ExpressApiService.GetQualityRatingDetails ctx serviceArgs
          return! (match result with
                      | GetQualityRatingDetailsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetQualityRatingDetailsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetQualityRatings
    /// <summary>
    /// Индекс качества магазинов
    /// </summary>

    let GetQualityRatings (pathParams:GetQualityRatingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetQualityRatingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetQualityRatingsArgs
          let result = ExpressApiService.GetQualityRatings ctx serviceArgs
          return! (match result with
                      | GetQualityRatingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetQualityRatingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetQualityRatingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetQualityRatingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetQualityRatingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetQualityRatingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetQualityRatingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReportInfo
    /// <summary>
    /// Получение заданного отчета
    /// </summary>

    let GetReportInfo (pathParams:GetReportInfoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReportInfoArgs
          let result = ExpressApiService.GetReportInfo ctx serviceArgs
          return! (match result with
                      | GetReportInfoStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReportInfoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReportInfoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReportInfoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReportInfoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReportInfoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReportInfoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturn
    /// <summary>
    /// Информация о невыкупе или возврате
    /// </summary>

    let GetReturn (pathParams:GetReturnPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnArgs
          let result = ExpressApiService.GetReturn ctx serviceArgs
          return! (match result with
                      | GetReturnStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReturnStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturnApplication
    /// <summary>
    /// Получение заявления на возврат
    /// </summary>

    let GetReturnApplication (pathParams:GetReturnApplicationPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnApplicationArgs
          let result = ExpressApiService.GetReturnApplication ctx serviceArgs
          return! (match result with
                      | GetReturnApplicationStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetReturnApplicationStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnApplicationStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnApplicationStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnApplicationStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnApplicationStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnApplicationStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturnPhoto
    /// <summary>
    /// Получение фотографии возврата
    /// </summary>

    let GetReturnPhoto (pathParams:GetReturnPhotoPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetReturnPhotoArgs
          let result = ExpressApiService.GetReturnPhoto ctx serviceArgs
          return! (match result with
                      | GetReturnPhotoStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | GetReturnPhotoStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnPhotoStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnPhotoStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnPhotoStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnPhotoStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnPhotoStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetReturns
    /// <summary>
    /// Список невыкупов и возвратов
    /// </summary>

    let GetReturns (pathParams:GetReturnsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetReturnsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : GetReturnsArgs
          let result = ExpressApiService.GetReturns ctx serviceArgs
          return! (match result with
                      | GetReturnsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetReturnsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetReturnsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetReturnsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetReturnsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetReturnsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetReturnsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetStocks
    /// <summary>
    /// Информация об остатках и оборачиваемости
    /// </summary>

    let GetStocks (pathParams:GetStocksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<GetStocksQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<GetStocksBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : GetStocksArgs
          let result = ExpressApiService.GetStocks ctx serviceArgs
          return! (match result with
                      | GetStocksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetStocksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetStocksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetStocksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetStocksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetStocksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedOfferMappingEntries
    /// <summary>
    /// Рекомендованные карточки для товаров
    /// </summary>

    let GetSuggestedOfferMappingEntries (pathParams:GetSuggestedOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedOfferMappingEntriesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedOfferMappingEntriesArgs
          let result = ExpressApiService.GetSuggestedOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | GetSuggestedOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedOfferMappings
    /// <summary>
    /// Просмотр карточек на Маркете, которые подходят вашим товарам
    /// </summary>

    let GetSuggestedOfferMappings (pathParams:GetSuggestedOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedOfferMappingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedOfferMappingsArgs
          let result = ExpressApiService.GetSuggestedOfferMappings ctx serviceArgs
          return! (match result with
                      | GetSuggestedOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetSuggestedPrices
    /// <summary>
    /// Цены для продвижения товаров
    /// </summary>

    let GetSuggestedPrices (pathParams:GetSuggestedPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<GetSuggestedPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : GetSuggestedPricesArgs
          let result = ExpressApiService.GetSuggestedPrices ctx serviceArgs
          return! (match result with
                      | GetSuggestedPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetSuggestedPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetSuggestedPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetSuggestedPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetSuggestedPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetSuggestedPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetSuggestedPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetWarehouses
    /// <summary>
    /// Список складов и групп складов
    /// </summary>

    let GetWarehouses (pathParams:GetWarehousesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetWarehousesArgs
          let result = ExpressApiService.GetWarehouses ctx serviceArgs
          return! (match result with
                      | GetWarehousesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | GetWarehousesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | GetWarehousesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | GetWarehousesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | GetWarehousesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | GetWarehousesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | GetWarehousesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProvideOrderItemIdentifiers
    /// <summary>
    /// Передача кодов маркировки единиц товара
    /// </summary>

    let ProvideOrderItemIdentifiers (pathParams:ProvideOrderItemIdentifiersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<ProvideOrderItemIdentifiersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : ProvideOrderItemIdentifiersArgs
          let result = ExpressApiService.ProvideOrderItemIdentifiers ctx serviceArgs
          return! (match result with
                      | ProvideOrderItemIdentifiersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | ProvideOrderItemIdentifiersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PutBidsForBusiness
    /// <summary>
    /// Включение буста продаж и установка ставок
    /// </summary>

    let PutBidsForBusiness (pathParams:PutBidsForBusinessPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PutBidsForBusinessBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PutBidsForBusinessArgs
          let result = ExpressApiService.PutBidsForBusiness ctx serviceArgs
          return! (match result with
                      | PutBidsForBusinessStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PutBidsForBusinessStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PutBidsForBusinessStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | PutBidsForBusinessStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PutBidsForBusinessStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PutBidsForBusinessStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | PutBidsForBusinessStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PutBidsForCampaign
    /// <summary>
    /// Включение буста продаж и установка ставок для магазина
    /// </summary>

    let PutBidsForCampaign (pathParams:PutBidsForCampaignPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<PutBidsForCampaignBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : PutBidsForCampaignArgs
          let result = ExpressApiService.PutBidsForCampaign ctx serviceArgs
          return! (match result with
                      | PutBidsForCampaignStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PutBidsForCampaignStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PutBidsForCampaignStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | PutBidsForCampaignStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PutBidsForCampaignStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PutBidsForCampaignStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | PutBidsForCampaignStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region RefreshFeed
    /// <summary>
    /// Сообщить, что прайс-лист обновился
    /// </summary>

    let RefreshFeed (pathParams:RefreshFeedPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : RefreshFeedArgs
          let result = ExpressApiService.RefreshFeed ctx serviceArgs
          return! (match result with
                      | RefreshFeedStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | RefreshFeedStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | RefreshFeedStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | RefreshFeedStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | RefreshFeedStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | RefreshFeedStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | RefreshFeedStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchRegionChildren
    /// <summary>
    /// Информация о дочерних регионах
    /// </summary>

    let SearchRegionChildren (pathParams:SearchRegionChildrenPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchRegionChildrenQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SearchRegionChildrenArgs
          let result = ExpressApiService.SearchRegionChildren ctx serviceArgs
          return! (match result with
                      | SearchRegionChildrenStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionChildrenStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SearchRegionChildrenStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionChildrenStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionChildrenStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchRegionChildrenStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionChildrenStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchRegionsById
    /// <summary>
    /// Информация о регионе
    /// </summary>

    let SearchRegionsById (pathParams:SearchRegionsByIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SearchRegionsByIdArgs
          let result = ExpressApiService.SearchRegionsById ctx serviceArgs
          return! (match result with
                      | SearchRegionsByIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionsByIdStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionsByIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionsByIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchRegionsByIdStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionsByIdStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchRegionsByName
    /// <summary>
    /// Поиск регионов по их имени
    /// </summary>

    let SearchRegionsByName  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchRegionsByNameQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchRegionsByNameArgs
          let result = ExpressApiService.SearchRegionsByName ctx serviceArgs
          return! (match result with
                      | SearchRegionsByNameStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchRegionsByNameStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SearchRegionsByNameStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SearchRegionsByNameStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SearchRegionsByNameStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SendFileToChat
    /// <summary>
    /// Отправка файла в чат
    /// </summary>

    let SendFileToChat (pathParams:SendFileToChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SendFileToChatQueryParams>()
          let! formParams = ctx.TryBindFormAsync<SendFileToChatFormParams>()
          let serviceArgs = {  queryParams=queryParams; formParams=formParams; pathParams=pathParams;  } : SendFileToChatArgs
          let result = ExpressApiService.SendFileToChat ctx serviceArgs
          return! (match result with
                      | SendFileToChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SendFileToChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SendFileToChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SendFileToChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SendFileToChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SendFileToChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SendFileToChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SendMessageToChat
    /// <summary>
    /// Отправка сообщения в чат
    /// </summary>

    let SendMessageToChat (pathParams:SendMessageToChatPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SendMessageToChatQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<SendMessageToChatBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : SendMessageToChatArgs
          let result = ExpressApiService.SendMessageToChat ctx serviceArgs
          return! (match result with
                      | SendMessageToChatStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SendMessageToChatStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SendMessageToChatStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SendMessageToChatStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SendMessageToChatStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SendMessageToChatStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SendMessageToChatStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetFeedParams
    /// <summary>
    /// Изменение параметров прайс-листа
    /// </summary>

    let SetFeedParams (pathParams:SetFeedParamsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetFeedParamsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetFeedParamsArgs
          let result = ExpressApiService.SetFeedParams ctx serviceArgs
          return! (match result with
                      | SetFeedParamsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetFeedParamsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetFeedParamsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetFeedParamsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetFeedParamsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetFeedParamsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetFeedParamsStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | SetFeedParamsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderBoxLayout
    /// <summary>
    /// Подготовка заказа
    /// </summary>

    let SetOrderBoxLayout (pathParams:SetOrderBoxLayoutPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderBoxLayoutBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderBoxLayoutArgs
          let result = ExpressApiService.SetOrderBoxLayout ctx serviceArgs
          return! (match result with
                      | SetOrderBoxLayoutStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderBoxLayoutStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SetOrderShipmentBoxes
    /// <summary>
    /// Передача количества грузовых мест в заказе
    /// </summary>

    let SetOrderShipmentBoxes (pathParams:SetOrderShipmentBoxesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SetOrderShipmentBoxesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SetOrderShipmentBoxesArgs
          let result = ExpressApiService.SetOrderShipmentBoxes ctx serviceArgs
          return! (match result with
                      | SetOrderShipmentBoxesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SetOrderShipmentBoxesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SkipGoodsFeedbacksReaction
    /// <summary>
    /// Отказ от ответа на отзывы
    /// </summary>

    let SkipGoodsFeedbacksReaction (pathParams:SkipGoodsFeedbacksReactionPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SkipGoodsFeedbacksReactionBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SkipGoodsFeedbacksReactionArgs
          let result = ExpressApiService.SkipGoodsFeedbacksReaction ctx serviceArgs
          return! (match result with
                      | SkipGoodsFeedbacksReactionStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | SkipGoodsFeedbacksReactionStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateBusinessPrices
    /// <summary>
    /// Установка цен на товары во всех магазинах
    /// </summary>

    let UpdateBusinessPrices (pathParams:UpdateBusinessPricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateBusinessPricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateBusinessPricesArgs
          let result = ExpressApiService.UpdateBusinessPrices ctx serviceArgs
          return! (match result with
                      | UpdateBusinessPricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateBusinessPricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateCampaignOffers
    /// <summary>
    /// Изменение условий продажи товаров в магазине
    /// </summary>

    let UpdateCampaignOffers (pathParams:UpdateCampaignOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateCampaignOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateCampaignOffersArgs
          let result = ExpressApiService.UpdateCampaignOffers ctx serviceArgs
          return! (match result with
                      | UpdateCampaignOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateCampaignOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateGoodsFeedbackComment
    /// <summary>
    /// Добавление нового или изменение созданного комментария
    /// </summary>

    let UpdateGoodsFeedbackComment (pathParams:UpdateGoodsFeedbackCommentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateGoodsFeedbackCommentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateGoodsFeedbackCommentArgs
          let result = ExpressApiService.UpdateGoodsFeedbackComment ctx serviceArgs
          return! (match result with
                      | UpdateGoodsFeedbackCommentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateGoodsFeedbackCommentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferContent
    /// <summary>
    /// Редактирование категорийных характеристик товара
    /// </summary>

    let UpdateOfferContent (pathParams:UpdateOfferContentPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferContentBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferContentArgs
          let result = ExpressApiService.UpdateOfferContent ctx serviceArgs
          return! (match result with
                      | UpdateOfferContentStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferContentStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferContentStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferContentStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferContentStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferContentStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferContentStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferContentStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferMappingEntries
    /// <summary>
    /// Добавление и редактирование товаров в каталоге
    /// </summary>

    let UpdateOfferMappingEntries (pathParams:UpdateOfferMappingEntriesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferMappingEntriesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferMappingEntriesArgs
          let result = ExpressApiService.UpdateOfferMappingEntries ctx serviceArgs
          return! (match result with
                      | UpdateOfferMappingEntriesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferMappingEntriesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOfferMappings
    /// <summary>
    /// Добавление товаров в каталог и изменение информации о них
    /// </summary>

    let UpdateOfferMappings (pathParams:UpdateOfferMappingsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOfferMappingsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOfferMappingsArgs
          let result = ExpressApiService.UpdateOfferMappings ctx serviceArgs
          return! (match result with
                      | UpdateOfferMappingsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdateOfferMappingsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderItems
    /// <summary>
    /// Удаление товара из заказа или уменьшение числа единиц
    /// </summary>

    let UpdateOrderItems (pathParams:UpdateOrderItemsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderItemsBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderItemsArgs
          let result = ExpressApiService.UpdateOrderItems ctx serviceArgs
          return! (match result with
                      | UpdateOrderItemsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | UpdateOrderItemsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderItemsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderItemsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderItemsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderItemsStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderItemsStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderStatus
    /// <summary>
    /// Изменение статуса одного заказа
    /// </summary>

    let UpdateOrderStatus (pathParams:UpdateOrderStatusPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderStatusBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderStatusArgs
          let result = ExpressApiService.UpdateOrderStatus ctx serviceArgs
          return! (match result with
                      | UpdateOrderStatusStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOrderStatusStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderStatusStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderStatusStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderStatusStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderStatusStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderStatusStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateOrderStatuses
    /// <summary>
    /// Изменение статусов нескольких заказов
    /// </summary>

    let UpdateOrderStatuses (pathParams:UpdateOrderStatusesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateOrderStatusesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateOrderStatusesArgs
          let result = ExpressApiService.UpdateOrderStatuses ctx serviceArgs
          return! (match result with
                      | UpdateOrderStatusesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateOrderStatusesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdatePrices
    /// <summary>
    /// Установка цен на товары в конкретном магазине
    /// </summary>

    let UpdatePrices (pathParams:UpdatePricesPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdatePricesBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdatePricesArgs
          let result = ExpressApiService.UpdatePrices ctx serviceArgs
          return! (match result with
                      | UpdatePricesStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdatePricesStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdatePricesStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdatePricesStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdatePricesStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdatePricesStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdatePricesStatusCode423 resolved ->
                            setStatusCode 423 >=> json resolved.content
                      | UpdatePricesStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdatePromoOffers
    /// <summary>
    /// Добавление товаров в акцию или изменение их цен
    /// </summary>

    let UpdatePromoOffers (pathParams:UpdatePromoOffersPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdatePromoOffersBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdatePromoOffersArgs
          let result = ExpressApiService.UpdatePromoOffers ctx serviceArgs
          return! (match result with
                      | UpdatePromoOffersStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdatePromoOffersStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdatePromoOffersStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdatePromoOffersStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdatePromoOffersStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdatePromoOffersStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdatePromoOffersStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UpdateStocks
    /// <summary>
    /// Передача информации об остатках
    /// </summary>

    let UpdateStocks (pathParams:UpdateStocksPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<UpdateStocksBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : UpdateStocksArgs
          let result = ExpressApiService.UpdateStocks ctx serviceArgs
          return! (match result with
                      | UpdateStocksStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UpdateStocksStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | UpdateStocksStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | UpdateStocksStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UpdateStocksStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | UpdateStocksStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | UpdateStocksStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region VerifyOrderEac
    /// <summary>
    /// Передача кода подтверждения
    /// </summary>

    let VerifyOrderEac (pathParams:VerifyOrderEacPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<VerifyOrderEacBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : VerifyOrderEacArgs
          let result = ExpressApiService.VerifyOrderEac ctx serviceArgs
          return! (match result with
                      | VerifyOrderEacStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | VerifyOrderEacStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | VerifyOrderEacStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | VerifyOrderEacStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | VerifyOrderEacStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | VerifyOrderEacStatusCode420 resolved ->
                            setStatusCode 420 >=> json resolved.content
                      | VerifyOrderEacStatusCode500 resolved ->
                            setStatusCode 500 >=> json resolved.content
          ) next ctx
        }
    //#endregion

