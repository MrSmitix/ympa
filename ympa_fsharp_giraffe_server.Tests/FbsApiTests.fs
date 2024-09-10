namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open FbsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.FbsApiHandler
open ympa_fsharp_giraffe_server.FbsApiHandlerParams
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
open ympa_fsharp_giraffe_server.Model.ConfirmShipmentRequest
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
open ympa_fsharp_giraffe_server.Model.GenerateShipmentListDocumentReportRequest
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
open ympa_fsharp_giraffe_server.Model.GetShipmentOrdersInfoResponse
open ympa_fsharp_giraffe_server.Model.GetShipmentResponse
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
open ympa_fsharp_giraffe_server.Model.SearchShipmentsRequest
open ympa_fsharp_giraffe_server.Model.SearchShipmentsResponse
open ympa_fsharp_giraffe_server.Model.SendMessageToChatRequest
open ympa_fsharp_giraffe_server.Model.Set
open ympa_fsharp_giraffe_server.Model.SetFeedParamsRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutRequest
open ympa_fsharp_giraffe_server.Model.SetOrderBoxLayoutResponse
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesRequest
open ympa_fsharp_giraffe_server.Model.SetOrderShipmentBoxesResponse
open ympa_fsharp_giraffe_server.Model.SetShipmentPalletsCountRequest
open ympa_fsharp_giraffe_server.Model.ShipmentPalletLabelPageFormatType
open ympa_fsharp_giraffe_server.Model.SkipGoodsFeedbackReactionRequest
open ympa_fsharp_giraffe_server.Model.SuggestPricesRequest
open ympa_fsharp_giraffe_server.Model.SuggestPricesResponse
open ympa_fsharp_giraffe_server.Model.TransferOrdersFromShipmentRequest
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

module FbsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 200 where Настройки скрытия получены и скоро вступят в силу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddHiddenOffers - Скрытие товаров и настройки скрытия returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddHiddenOffersExample "application/json")
      // or pass a body of type AddHiddenOffersRequest
      let body = obj() :?> AddHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 200 where Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``AddOffersToArchive - Добавление товаров в архив returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/archive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getAddOffersToArchiveExample "application/json")
      // or pass a body of type AddOffersToArchiveRequest
      let body = obj() :?> AddOffersToArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 200 where Стоимость услуг.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CalculateTariffs - Калькулятор стоимости услуг returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/tariffs/calculate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCalculateTariffsExample "application/json")
      // or pass a body of type CalculateTariffsRequest
      let body = obj() :?> CalculateTariffsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 200 where Ответ 200 обозначает, что цены подтверждены.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmBusinessPrices - Удаление товара из карантина по цене в кабинете returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine/confirm".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmBusinessPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 200 where Ответ 200 обозначает, что цены подтверждены.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmCampaignPrices - Удаление товара из карантина по цене в магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine/confirm".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmCampaignPricesExample "application/json")
      // or pass a body of type ConfirmPricesRequest
      let body = obj() :?> ConfirmPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ConfirmShipment - Подтверждение отгрузки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getConfirmShipmentExample "application/json")
      // or pass a body of type ConfirmShipmentRequest
      let body = obj() :?> ConfirmShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 200 where Все получилось: чат создан. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 200 where Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteGoodsFeedbackComment - Удаление комментария к отзыву returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteGoodsFeedbackCommentExample "application/json")
      // or pass a body of type DeleteGoodsFeedbackCommentRequest
      let body = obj() :?> DeleteGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 200 where Показ товаров возобновлен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteHiddenOffers - Возобновление показа товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteHiddenOffersExample "application/json")
      // or pass a body of type DeleteHiddenOffersRequest
      let body = obj() :?> DeleteHiddenOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 200 where Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffers - Удаление товаров из каталога returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersExample "application/json")
      // or pass a body of type DeleteOffersRequest
      let body = obj() :?> DeleteOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 200 where Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteOffersFromArchive - Удаление товаров из архива returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/unarchive".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteOffersFromArchiveExample "application/json")
      // or pass a body of type DeleteOffersFromArchiveRequest
      let body = obj() :?> DeleteOffersFromArchiveRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 200 where Результат удаления товаров из акции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeletePromoOffers - Удаление товаров из акции returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/delete".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeletePromoOffersExample "application/json")
      // or pass a body of type DeletePromoOffersRequest
      let body = obj() :?> DeletePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 200 where Акт приема-передачи для отгрузки в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentAct - Получение акта приема-передачи returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 200 where Акт расхождений в формате XLSX.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentDiscrepancyAct - Получение акта расхождений returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 200 where Акт в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentInboundAct - Получение фактического акта приема-передачи returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 200 where PDF‑файл с ярлыками на все упаковки в отгрузке.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentPalletLabels - Ярлыки для доверительной приемки (FBS) returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 200 where Акт приема-передачи в формате PDF.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentReceptionTransferAct - Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/shipments/reception-transfer-act".Replace("campaignId", "ADDME") + "?warehouseId=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 200 where Транспортная накладная в формате XLSX.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``DownloadShipmentTransportationWaybill - Получение транспортной накладной returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateBoostConsolidatedReport - Отчет по бусту продаж returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/boost-consolidated/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateBoostConsolidatedReportExample "application/json")
      // or pass a body of type GenerateBoostConsolidatedRequest
      let body = obj() :?> GenerateBoostConsolidatedRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateCompetitorsPositionReport - Отчет «Конкурентная позиция» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/competitors-position/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateCompetitorsPositionReportExample "application/json")
      // or pass a body of type GenerateCompetitorsPositionReportRequest
      let body = obj() :?> GenerateCompetitorsPositionReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsFeedbackReport - Отчет по отзывам о товарах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-feedback/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsFeedbackReportExample "application/json")
      // or pass a body of type GenerateGoodsFeedbackRequest
      let body = obj() :?> GenerateGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateGoodsRealizationReport - Отчет по реализации returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/goods-realization/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateGoodsRealizationReportExample "application/json")
      // or pass a body of type GenerateGoodsRealizationReportRequest
      let body = obj() :?> GenerateGoodsRealizationReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateMassOrderLabelsReport - Готовые ярлыки‑наклейки на все коробки в нескольких заказах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/labels/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateMassOrderLabelsReportExample "application/json")
      // or pass a body of type GenerateMassOrderLabelsRequest
      let body = obj() :?> GenerateMassOrderLabelsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 200 where PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME").Replace("boxId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 200 where PDF‑файл с ярлыками на все коробки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels".Replace("campaignId", "ADDME").Replace("orderId", "ADDME") + "?format=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GeneratePricesReport - Отчет «Цены на рынке» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/prices/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGeneratePricesReportExample "application/json")
      // or pass a body of type GeneratePricesReportRequest
      let body = obj() :?> GeneratePricesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShelfsStatisticsReport - Отчет по полкам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shelf-statistics/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShelfsStatisticsReportExample "application/json")
      // or pass a body of type GenerateShelfsStatisticsRequest
      let body = obj() :?> GenerateShelfsStatisticsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShipmentListDocumentReport - Получение листа сборки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/documents/shipment-list/generate"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShipmentListDocumentReportExample "application/json")
      // or pass a body of type GenerateShipmentListDocumentReportRequest
      let body = obj() :?> GenerateShipmentListDocumentReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateShowsSalesReport - Отчет «Аналитика продаж» returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/shows-sales/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateShowsSalesReportExample "application/json")
      // or pass a body of type GenerateShowsSalesReportRequest
      let body = obj() :?> GenerateShowsSalesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateStocksOnWarehousesReport - Отчет по остаткам на складах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/stocks-on-warehouses/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateStocksOnWarehousesReportExample "application/json")
      // or pass a body of type GenerateStocksOnWarehousesReportRequest
      let body = obj() :?> GenerateStocksOnWarehousesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedMarketplaceServicesReport - Отчет по стоимости услуг returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-marketplace-services/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedMarketplaceServicesReportExample "application/json")
      // or pass a body of type GenerateUnitedMarketplaceServicesReportRequest
      let body = obj() :?> GenerateUnitedMarketplaceServicesReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedNettingReport - Отчет по платежам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-netting/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedNettingReportExample "application/json")
      // or pass a body of type GenerateUnitedNettingReportRequest
      let body = obj() :?> GenerateUnitedNettingReportRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 200 where В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GenerateUnitedOrdersReport - Отчет по заказам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/united-orders/generate" + "?format=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGenerateUnitedOrdersReportExample "application/json")
      // or pass a body of type GenerateUnitedOrdersRequest
      let body = obj() :?> GenerateUnitedOrdersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 200 where Предложения магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 200 where Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsInfoForBusiness - Информация об установленных ставках returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/info".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsInfoForBusinessExample "application/json")
      // or pass a body of type GetBidsInfoRequest
      let body = obj() :?> GetBidsInfoRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 200 where Рекомендованные ставки для заданных товаров.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBidsRecommendations - Рекомендованные ставки для заданных товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids/recommendations".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBidsRecommendationsExample "application/json")
      // or pass a body of type GetBidsRecommendationsRequest
      let body = obj() :?> GetBidsRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 200 where Список товаров в карантине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessQuarantineOffers - Список товаров, находящихся в карантине по цене в кабинете returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/price-quarantine".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetBusinessQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 200 where Настройки кабинета.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetBusinessSettings - Настройки кабинета returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/settings".Replace("businessId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 200 where Информация о магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaign - Информация о магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 200 where Список логинов, связанных с магазином.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignLogins - Логины, связанные с магазином returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/logins".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 200 where Список товаров, размещенных в заданном магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 200 where Список товаров в карантине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignQuarantineOffers - Список товаров, находящихся в карантине по цене в магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/price-quarantine".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignQuarantineOffersExample "application/json")
      // or pass a body of type GetQuarantineOffersRequest
      let body = obj() :?> GetQuarantineOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 200 where Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignRegion - Регион магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/region".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 200 where Настройки магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignSettings - Настройки магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/settings".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 200 where Магазины пользователя.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaigns - Список магазинов пользователя returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns" + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 200 where Информация о магазинах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignsByLogin - Магазины, доступные логину returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/by_login/{login}".Replace("login", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 200 where Лимит на установку кванта и минимального количества товаров.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/max-sale-quantum"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesMaxSaleQuantumExample "application/json")
      // or pass a body of type GetCategoriesMaxSaleQuantumRequest
      let body = obj() :?> GetCategoriesMaxSaleQuantumRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 200 where Категории Маркета.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoriesTree - Дерево категорий returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/categories/tree"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCategoriesTreeExample "application/json")
      // or pass a body of type GetCategoriesRequest
      let body = obj() :?> GetCategoriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 200 where Список характеристик товаров из заданной категории.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 200 where История сообщений успешно получена. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 200 where Список чатов. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 200 where Информация о службах доставки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetDeliveryServices - Справочник служб доставки returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/delivery/services"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 200 where Информация о прайс-листе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeed - Информация о прайс-листе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 200 where Отчет по индексации прайс-листа.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedIndexLogs - Отчет по индексации прайс-листа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/index-logs".Replace("campaignId", "ADDME").Replace("feedId", "ADDME") + "?limit=ADDME&publishedTimeFrom=ADDME&publishedTimeTo=ADDME&status=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 200 where Список отзывов для магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeedbackAndCommentUpdates - Новые и обновленные отзывы о магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feedback/updates".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&fromDate=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 200 where Список прайс-листов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetFeeds - Список прайс-листов магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds".Replace("campaignId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 200 where Дерево комментариев к отзыву.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbackComments - Получение комментариев к отзыву returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbackCommentsExample "application/json")
      // or pass a body of type GetGoodsFeedbackCommentsRequest
      let body = obj() :?> GetGoodsFeedbackCommentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 200 where Список отзывов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsFeedbacks - Получение отзывов о товарах продавца returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsFeedbacksExample "application/json")
      // or pass a body of type GetGoodsFeedbackRequest
      let body = obj() :?> GetGoodsFeedbackRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 200 where Отчет по товарам.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetGoodsStats - Отчет по товарам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/skus".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetGoodsStatsExample "application/json")
      // or pass a body of type GetGoodsStatsRequest
      let body = obj() :?> GetGoodsStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 200 where Информация о скрытых вами товарах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetHiddenOffers - Информация о скрытых вами товарах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/hidden-offers".Replace("campaignId", "ADDME") + "?offerId=ADDME&pageToken=ADDME&limit=ADDME&offset=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 200 where Информация о карточках указанных товаров.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 200 where Информация о товарах в каталоге.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappingEntries - Список товаров в каталоге returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries".Replace("campaignId", "ADDME") + "?offerId=ADDME&shopSku=ADDME&mappingKind=ADDME&status=ADDME&availability=ADDME&categoryId=ADDME&vendor=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 200 where Информация о товарах в каталоге.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferMappings - Информация о товарах в каталоге returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferMappingsExample "application/json")
      // or pass a body of type GetOfferMappingsRequest
      let body = obj() :?> GetOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 200 where Список товаров с рекомендациями.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 200 where Предложения магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 200 where Информация о заказе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrder - Информация об одном заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 200 where Информация о покупателе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessBuyerInfo - Информация о покупателе — юридическом лице returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/business-buyer".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 200 where Информация о документах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderBusinessDocumentsInfo - Информация о документах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/documents".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 200 where Информация для печати ярлыков.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 200 where Информация о заказах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrders - Информация о нескольких заказах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders".Replace("campaignId", "ADDME") + "?orderIds=ADDME&status=ADDME&substatus=ADDME&fromDate=ADDME&toDate=ADDME&supplierShipmentDateFrom=ADDME&supplierShipmentDateTo=ADDME&updatedAtFrom=ADDME&updatedAtTo=ADDME&dispatchType=ADDME&fake=ADDME&hasCis=ADDME&onlyWaitingForCancellationApprove=ADDME&onlyEstimatedDelivery=ADDME&buyerType=ADDME&page=ADDME&pageSize=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 200 where Информация по заказам.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOrdersStats - Детальная информация по заказам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/stats/orders".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOrdersStatsExample "application/json")
      // or pass a body of type GetOrdersStatsRequest
      let body = obj() :?> GetOrdersStatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 200 where Список всех товаров с установленными ценами.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPrices - Список цен returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&archived=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 200 where Список товаров с установленными для заданного магазина ценами.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPricesByOfferIds - Просмотр цен на указанные товары в магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPricesByOfferIdsExample "application/json")
      // or pass a body of type GetPricesByOfferIdsRequest
      let body = obj() :?> GetPricesByOfferIdsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 200 where Список товаров, которые участвуют или могут участвовать в акции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromoOffers - Получение списка товаров, которые участвуют или могут участвовать в акции returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromoOffersExample "application/json")
      // or pass a body of type GetPromoOffersRequest
      let body = obj() :?> GetPromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 200 where Список акций Маркета.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetPromos - Получение списка акций returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetPromosExample "application/json")
      // or pass a body of type GetPromosRequest
      let body = obj() :?> GetPromosRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 200 where Информация о заказах, которые повлияли на индекс качества.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatingDetails - Заказы, которые повлияли на индекс качества returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/ratings/quality/details".Replace("campaignId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 200 where Значение индекса качества магазинов и его составляющие.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetQualityRatings - Индекс качества магазинов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/ratings/quality".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetQualityRatingsExample "application/json")
      // or pass a body of type GetQualityRatingRequest
      let body = obj() :?> GetQualityRatingRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 200 where Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReportInfo - Получение заданного отчета returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/reports/info/{reportId}".Replace("reportId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 200 where Детали возврата.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturn - Информация о невыкупе или возврате returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 200 where Заявление на возврат.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnApplication - Получение заявления на возврат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 200 where Фотография возврата.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturnPhoto - Получение фотографии возврата returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("returnId", "ADDME").Replace("itemId", "ADDME").Replace("imageHash", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 200 where Постраничные возвраты партнера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetReturns - Список невыкупов и возвратов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/returns".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME&orderIds=ADDME&statuses=ADDME&_type=ADDME&fromDate=ADDME&toDate=ADDME&fromDate2=ADDME&toDate2=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 200 where Найденная отгрузка.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipment - Получение информации об одной отгрузке returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME") + "?cancelledOrders=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 200 where Информация по годным/негодным для печати ярлыков заказам в отгрузке.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetShipmentOrdersInfo - Получение информации о возможности печати ярлыков (FBS) returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 200 where Остатки товаров на складах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetStocks - Информация об остатках и оборачиваемости returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetStocksExample "application/json")
      // or pass a body of type GetWarehouseStocksRequest
      let body = obj() :?> GetWarehouseStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 200 where Информация о товарах в каталоге.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappingEntries - Рекомендованные карточки для товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingEntriesExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingEntriesRequest
      let body = obj() :?> GetSuggestedOfferMappingEntriesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 200 where Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedOfferMappings - Просмотр карточек на Маркете, которые подходят вашим товарам returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/suggestions".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedOfferMappingsExample "application/json")
      // or pass a body of type GetSuggestedOfferMappingsRequest
      let body = obj() :?> GetSuggestedOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 200 where Список цен для продвижения на Маркете.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetSuggestedPrices - Цены для продвижения товаров returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/suggestions".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetSuggestedPricesExample "application/json")
      // or pass a body of type SuggestPricesRequest
      let body = obj() :?> SuggestPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 200 where Список складов и групп складов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetWarehouses - Список складов и групп складов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/warehouses".Replace("businessId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 200 where Ответ 200 обозначает, что коды успешно записались. Ответ содержит краткие сведения о промаркированных товарах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``ProvideOrderItemIdentifiers - Передача кодов маркировки единиц товара returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/identifiers".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getProvideOrderItemIdentifiersExample "application/json")
      // or pass a body of type ProvideOrderItemIdentifiersRequest
      let body = obj() :?> ProvideOrderItemIdentifiersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 200 where Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForBusiness - Включение буста продаж и установка ставок returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/bids".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForBusinessExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``PutBidsForCampaign - Включение буста продаж и установка ставок для магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/bids".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getPutBidsForCampaignExample "application/json")
      // or pass a body of type PutSkuBidsRequest
      let body = obj() :?> PutSkuBidsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``RefreshFeed - Сообщить, что прайс-лист обновился returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/refresh".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 200 where Регионы, являющиеся дочерними к указанному в запросе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionChildren - Информация о дочерних регионах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}/children".Replace("regionId", "ADDME") + "?page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 200 where Найденный регион.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsById - Информация о регионе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions/{regionId}".Replace("regionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsByName - Поиск регионов по их имени returns 200 where Список найденных регионов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions" + "?name=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsByName - Поиск регионов по их имени returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions" + "?name=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsByName - Поиск регионов по их имени returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions" + "?name=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsByName - Поиск регионов по их имени returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions" + "?name=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchRegionsByName - Поиск регионов по их имени returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/regions" + "?name=ADDME&pageToken=ADDME&limit=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 200 where Найденные отгрузки.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SearchShipments - Получение информации о нескольких отгрузках returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSearchShipmentsExample "application/json")
      // or pass a body of type SearchShipmentsRequest
      let body = obj() :?> SearchShipmentsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 200 where Пустой ответ. Означает, что файл отправлен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 200 where Пустой ответ. Означает, что сообщение отправлено.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 200 where Статус выполнения операции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetFeedParams - Изменение параметров прайс-листа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/feeds/{feedId}/params".Replace("campaignId", "ADDME").Replace("feedId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetFeedParamsExample "application/json")
      // or pass a body of type SetFeedParamsRequest
      let body = obj() :?> SetFeedParamsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 200 where В ответ придет переданная раскладка с идентификаторами коробок — они понадобятся для запроса ярлыков. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderBoxLayout - Подготовка заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderBoxLayoutExample "application/json")
      // or pass a body of type SetOrderBoxLayoutRequest
      let body = obj() :?> SetOrderBoxLayoutRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 200 where Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество грузомест записано.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetOrderShipmentBoxes - Передача количества грузовых мест в заказе returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes".Replace("campaignId", "ADDME").Replace("orderId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetOrderShipmentBoxesExample "application/json")
      // or pass a body of type SetOrderShipmentBoxesRequest
      let body = obj() :?> SetOrderShipmentBoxesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 200 where Имеет значение только тип ответа. Если ответ &#x60;ОК&#x60;, количество упаковок записано.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SetShipmentPalletsCount - Передача количества упаковок в отгрузке returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSetShipmentPalletsCountExample "application/json")
      // or pass a body of type SetShipmentPalletsCountRequest
      let body = obj() :?> SetShipmentPalletsCountRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SkipGoodsFeedbacksReaction - Отказ от ответа на отзывы returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/skip-reaction".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSkipGoodsFeedbacksReactionExample "application/json")
      // or pass a body of type SkipGoodsFeedbackReactionRequest
      let body = obj() :?> SkipGoodsFeedbackReactionRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 200 where Запрос на перенос заказов проверен и принят, и они будут перенесены спустя несколько минут.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``TransferOrdersFromShipment - Перенос заказов в следующую отгрузку returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer".Replace("campaignId", "ADDME").Replace("shipmentId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getTransferOrdersFromShipmentExample "application/json")
      // or pass a body of type TransferOrdersFromShipmentRequest
      let body = obj() :?> TransferOrdersFromShipmentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 200 where Маркет принял информацию о новых ценах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateBusinessPrices - Установка цен на товары во всех магазинах returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-prices/updates".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateBusinessPricesExample "application/json")
      // or pass a body of type UpdateBusinessPricesRequest
      let body = obj() :?> UpdateBusinessPricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 200 where Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 200 where Информация о добавленном или измененном комментарии.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateGoodsFeedbackComment - Добавление нового или изменение созданного комментария returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/goods-feedback/comments/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateGoodsFeedbackCommentExample "application/json")
      // or pass a body of type UpdateGoodsFeedbackCommentRequest
      let body = obj() :?> UpdateGoodsFeedbackCommentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 200 where Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 200 where Статус выполнения операции.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappingEntries - Добавление и редактирование товаров в каталоге returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-mapping-entries/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingEntriesExample "application/json")
      // or pass a body of type UpdateOfferMappingEntryRequest
      let body = obj() :?> UpdateOfferMappingEntryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 200 where Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferMappings - Добавление товаров в каталог и изменение информации о них returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-mappings/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferMappingsExample "application/json")
      // or pass a body of type UpdateOfferMappingsRequest
      let body = obj() :?> UpdateOfferMappingsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 200 where Маркет успешно обработал ваш запрос. Выходные данные не ожидаются.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderItems - Удаление товара из заказа или уменьшение числа единиц returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/items".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderItemsExample "application/json")
      // or pass a body of type UpdateOrderItemRequest
      let body = obj() :?> UpdateOrderItemRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 200 where В случае успешного изменения статуса заказа возвращается обновленная информация о заказе.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatus - Изменение статуса одного заказа returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/{orderId}/status".Replace("campaignId", "ADDME").Replace("orderId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusExample "application/json")
      // or pass a body of type UpdateOrderStatusRequest
      let body = obj() :?> UpdateOrderStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 200 where Возвращается информация об обновленных статусах заказов.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOrderStatuses - Изменение статусов нескольких заказов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/orders/status-update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOrderStatusesExample "application/json")
      // or pass a body of type UpdateOrderStatusesRequest
      let body = obj() :?> UpdateOrderStatusesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 200 where Маркет принял информацию о новых ценах.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePrices - Установка цен на товары в конкретном магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offer-prices/updates".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePricesExample "application/json")
      // or pass a body of type UpdatePricesRequest
      let body = obj() :?> UpdatePricesRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 200 where Результат добавления товаров в акцию или обновления их цен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdatePromoOffers - Добавление товаров в акцию или изменение их цен returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/promos/offers/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdatePromoOffersExample "application/json")
      // or pass a body of type UpdatePromoOffersRequest
      let body = obj() :?> UpdatePromoOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 200 where Пустой ответ.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateStocks - Передача информации об остатках returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/stocks".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateStocksExample "application/json")
      // or pass a body of type UpdateStocksRequest
      let body = obj() :?> UpdateStocksRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPut client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

