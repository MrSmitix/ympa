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
open TestHelper
open ympa_fsharp_giraffe_server.FbyApiHandler
open ympa_fsharp_giraffe_server.FbyApiHandlerParams

module FbyApiHandlerTestsHelper =


  let mutable AddHiddenOffersExamples = Map.empty
  let mutable AddHiddenOffersBody = ""

  AddHiddenOffersBody <- WebUtility.HtmlDecode "{
  &quot;hiddenOffers&quot; : [ {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  } ]
}"
  AddHiddenOffersExamples <- AddHiddenOffersExamples.Add("application/json", AddHiddenOffersBody)

  let getAddHiddenOffersExample mediaType =
    AddHiddenOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable AddOffersToArchiveExamples = Map.empty
  let mutable AddOffersToArchiveBody = ""

  AddOffersToArchiveBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  AddOffersToArchiveExamples <- AddOffersToArchiveExamples.Add("application/json", AddOffersToArchiveBody)

  let getAddOffersToArchiveExample mediaType =
    AddOffersToArchiveExamples.[mediaType]
      |> getConverter mediaType

  let mutable CalculateTariffsExamples = Map.empty
  let mutable CalculateTariffsBody = ""

  CalculateTariffsBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  } ],
  &quot;parameters&quot; : {
    &quot;campaignId&quot; : 0,
    &quot;sellingProgram&quot; : &quot;FBY&quot;,
    &quot;frequency&quot; : &quot;DAILY&quot;
  }
}"
  CalculateTariffsExamples <- CalculateTariffsExamples.Add("application/json", CalculateTariffsBody)

  let getCalculateTariffsExample mediaType =
    CalculateTariffsExamples.[mediaType]
      |> getConverter mediaType

  let mutable ConfirmBusinessPricesExamples = Map.empty
  let mutable ConfirmBusinessPricesBody = ""

  ConfirmBusinessPricesBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  ConfirmBusinessPricesExamples <- ConfirmBusinessPricesExamples.Add("application/json", ConfirmBusinessPricesBody)

  let getConfirmBusinessPricesExample mediaType =
    ConfirmBusinessPricesExamples.[mediaType]
      |> getConverter mediaType

  let mutable ConfirmCampaignPricesExamples = Map.empty
  let mutable ConfirmCampaignPricesBody = ""

  ConfirmCampaignPricesBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  ConfirmCampaignPricesExamples <- ConfirmCampaignPricesExamples.Add("application/json", ConfirmCampaignPricesBody)

  let getConfirmCampaignPricesExample mediaType =
    ConfirmCampaignPricesExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateChatExamples = Map.empty
  let mutable CreateChatBody = ""

  CreateChatBody <- WebUtility.HtmlDecode "{
  &quot;orderId&quot; : 0
}"
  CreateChatExamples <- CreateChatExamples.Add("application/json", CreateChatBody)

  let getCreateChatExample mediaType =
    CreateChatExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteCampaignOffersExamples = Map.empty
  let mutable DeleteCampaignOffersBody = ""

  DeleteCampaignOffersBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteCampaignOffersExamples <- DeleteCampaignOffersExamples.Add("application/json", DeleteCampaignOffersBody)

  let getDeleteCampaignOffersExample mediaType =
    DeleteCampaignOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteGoodsFeedbackCommentExamples = Map.empty
  let mutable DeleteGoodsFeedbackCommentBody = ""

  DeleteGoodsFeedbackCommentBody <- WebUtility.HtmlDecode "{
  &quot;id&quot; : 0
}"
  DeleteGoodsFeedbackCommentExamples <- DeleteGoodsFeedbackCommentExamples.Add("application/json", DeleteGoodsFeedbackCommentBody)

  let getDeleteGoodsFeedbackCommentExample mediaType =
    DeleteGoodsFeedbackCommentExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteHiddenOffersExamples = Map.empty
  let mutable DeleteHiddenOffersBody = ""

  DeleteHiddenOffersBody <- WebUtility.HtmlDecode "{
  &quot;hiddenOffers&quot; : [ {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;
  } ]
}"
  DeleteHiddenOffersExamples <- DeleteHiddenOffersExamples.Add("application/json", DeleteHiddenOffersBody)

  let getDeleteHiddenOffersExample mediaType =
    DeleteHiddenOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteOffersExamples = Map.empty
  let mutable DeleteOffersBody = ""

  DeleteOffersBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteOffersExamples <- DeleteOffersExamples.Add("application/json", DeleteOffersBody)

  let getDeleteOffersExample mediaType =
    DeleteOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeleteOffersFromArchiveExamples = Map.empty
  let mutable DeleteOffersFromArchiveBody = ""

  DeleteOffersFromArchiveBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteOffersFromArchiveExamples <- DeleteOffersFromArchiveExamples.Add("application/json", DeleteOffersFromArchiveBody)

  let getDeleteOffersFromArchiveExample mediaType =
    DeleteOffersFromArchiveExamples.[mediaType]
      |> getConverter mediaType

  let mutable DeletePromoOffersExamples = Map.empty
  let mutable DeletePromoOffersBody = ""

  DeletePromoOffersBody <- WebUtility.HtmlDecode "{
  &quot;deleteAllOffers&quot; : true,
  &quot;promoId&quot; : &quot;promoId&quot;,
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeletePromoOffersExamples <- DeletePromoOffersExamples.Add("application/json", DeletePromoOffersBody)

  let getDeletePromoOffersExample mediaType =
    DeletePromoOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateBoostConsolidatedReportExamples = Map.empty
  let mutable GenerateBoostConsolidatedReportBody = ""

  GenerateBoostConsolidatedReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GenerateBoostConsolidatedReportExamples <- GenerateBoostConsolidatedReportExamples.Add("application/json", GenerateBoostConsolidatedReportBody)

  let getGenerateBoostConsolidatedReportExample mediaType =
    GenerateBoostConsolidatedReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateCompetitorsPositionReportExamples = Map.empty
  let mutable GenerateCompetitorsPositionReportBody = ""

  GenerateCompetitorsPositionReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;categoryId&quot; : 6
}"
  GenerateCompetitorsPositionReportExamples <- GenerateCompetitorsPositionReportExamples.Add("application/json", GenerateCompetitorsPositionReportBody)

  let getGenerateCompetitorsPositionReportExample mediaType =
    GenerateCompetitorsPositionReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateGoodsFeedbackReportExamples = Map.empty
  let mutable GenerateGoodsFeedbackReportBody = ""

  GenerateGoodsFeedbackReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0
}"
  GenerateGoodsFeedbackReportExamples <- GenerateGoodsFeedbackReportExamples.Add("application/json", GenerateGoodsFeedbackReportBody)

  let getGenerateGoodsFeedbackReportExample mediaType =
    GenerateGoodsFeedbackReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateGoodsMovementReportExamples = Map.empty
  let mutable GenerateGoodsMovementReportBody = ""

  GenerateGoodsMovementReportBody <- WebUtility.HtmlDecode "{
  &quot;shopSku&quot; : &quot;shopSku&quot;,
  &quot;campaignId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GenerateGoodsMovementReportExamples <- GenerateGoodsMovementReportExamples.Add("application/json", GenerateGoodsMovementReportBody)

  let getGenerateGoodsMovementReportExample mediaType =
    GenerateGoodsMovementReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateGoodsRealizationReportExamples = Map.empty
  let mutable GenerateGoodsRealizationReportBody = ""

  GenerateGoodsRealizationReportBody <- WebUtility.HtmlDecode "{
  &quot;month&quot; : 2,
  &quot;year&quot; : 6,
  &quot;campaignId&quot; : 0
}"
  GenerateGoodsRealizationReportExamples <- GenerateGoodsRealizationReportExamples.Add("application/json", GenerateGoodsRealizationReportBody)

  let getGenerateGoodsRealizationReportExample mediaType =
    GenerateGoodsRealizationReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateGoodsTurnoverReportExamples = Map.empty
  let mutable GenerateGoodsTurnoverReportBody = ""

  GenerateGoodsTurnoverReportBody <- WebUtility.HtmlDecode "{
  &quot;date&quot; : &quot;2000-01-23&quot;,
  &quot;campaignId&quot; : 0
}"
  GenerateGoodsTurnoverReportExamples <- GenerateGoodsTurnoverReportExamples.Add("application/json", GenerateGoodsTurnoverReportBody)

  let getGenerateGoodsTurnoverReportExample mediaType =
    GenerateGoodsTurnoverReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GeneratePricesReportExamples = Map.empty
  let mutable GeneratePricesReportBody = ""

  GeneratePricesReportBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ 1, 1 ],
  &quot;creationDateTo&quot; : &quot;2000-01-23&quot;,
  &quot;campaignId&quot; : 6,
  &quot;businessId&quot; : 0,
  &quot;creationDateFrom&quot; : &quot;2000-01-23&quot;
}"
  GeneratePricesReportExamples <- GeneratePricesReportExamples.Add("application/json", GeneratePricesReportBody)

  let getGeneratePricesReportExample mediaType =
    GeneratePricesReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateShelfsStatisticsReportExamples = Map.empty
  let mutable GenerateShelfsStatisticsReportBody = ""

  GenerateShelfsStatisticsReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;attributionType&quot; : &quot;CLICKS&quot;
}"
  GenerateShelfsStatisticsReportExamples <- GenerateShelfsStatisticsReportExamples.Add("application/json", GenerateShelfsStatisticsReportBody)

  let getGenerateShelfsStatisticsReportExample mediaType =
    GenerateShelfsStatisticsReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateShowsSalesReportExamples = Map.empty
  let mutable GenerateShowsSalesReportBody = ""

  GenerateShowsSalesReportBody <- WebUtility.HtmlDecode "{
  &quot;campaignId&quot; : 6,
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;grouping&quot; : &quot;CATEGORIES&quot;
}"
  GenerateShowsSalesReportExamples <- GenerateShowsSalesReportExamples.Add("application/json", GenerateShowsSalesReportBody)

  let getGenerateShowsSalesReportExample mediaType =
    GenerateShowsSalesReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateStocksOnWarehousesReportExamples = Map.empty
  let mutable GenerateStocksOnWarehousesReportBody = ""

  GenerateStocksOnWarehousesReportBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ 1, 1 ],
  &quot;hasStocks&quot; : true,
  &quot;reportDate&quot; : &quot;2000-01-23&quot;,
  &quot;campaignId&quot; : 0,
  &quot;warehouseIds&quot; : [ 6, 6 ]
}"
  GenerateStocksOnWarehousesReportExamples <- GenerateStocksOnWarehousesReportExamples.Add("application/json", GenerateStocksOnWarehousesReportBody)

  let getGenerateStocksOnWarehousesReportExample mediaType =
    GenerateStocksOnWarehousesReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateUnitedMarketplaceServicesReportExamples = Map.empty
  let mutable GenerateUnitedMarketplaceServicesReportBody = ""

  GenerateUnitedMarketplaceServicesReportBody <- WebUtility.HtmlDecode "{
  &quot;dateTimeFrom&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;yearFrom&quot; : 6,
  &quot;placementPrograms&quot; : [ &quot;FBS&quot;, &quot;FBS&quot; ],
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;monthFrom&quot; : 2,
  &quot;dateTimeTo&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;inns&quot; : [ &quot;inns&quot;, &quot;inns&quot; ],
  &quot;campaignIds&quot; : [ 2, 2 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;monthTo&quot; : 7,
  &quot;yearTo&quot; : 5
}"
  GenerateUnitedMarketplaceServicesReportExamples <- GenerateUnitedMarketplaceServicesReportExamples.Add("application/json", GenerateUnitedMarketplaceServicesReportBody)

  let getGenerateUnitedMarketplaceServicesReportExample mediaType =
    GenerateUnitedMarketplaceServicesReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateUnitedNettingReportExamples = Map.empty
  let mutable GenerateUnitedNettingReportBody = ""

  GenerateUnitedNettingReportBody <- WebUtility.HtmlDecode "{
  &quot;dateTimeFrom&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;bankOrderId&quot; : 6,
  &quot;placementPrograms&quot; : [ &quot;FBS&quot;, &quot;FBS&quot; ],
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;dateTimeTo&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;inns&quot; : [ &quot;inns&quot;, &quot;inns&quot; ],
  &quot;campaignIds&quot; : [ 1, 1 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;bankOrderDateTime&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
}"
  GenerateUnitedNettingReportExamples <- GenerateUnitedNettingReportExamples.Add("application/json", GenerateUnitedNettingReportBody)

  let getGenerateUnitedNettingReportExample mediaType =
    GenerateUnitedNettingReportExamples.[mediaType]
      |> getConverter mediaType

  let mutable GenerateUnitedOrdersReportExamples = Map.empty
  let mutable GenerateUnitedOrdersReportBody = ""

  GenerateUnitedOrdersReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;campaignIds&quot; : [ 6, 6 ],
  &quot;promoId&quot; : &quot;promoId&quot;,
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GenerateUnitedOrdersReportExamples <- GenerateUnitedOrdersReportExamples.Add("application/json", GenerateUnitedOrdersReportBody)

  let getGenerateUnitedOrdersReportExample mediaType =
    GenerateUnitedOrdersReportExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable GetBidsInfoForBusinessExamples = Map.empty
  let mutable GetBidsInfoForBusinessBody = ""

  GetBidsInfoForBusinessBody <- WebUtility.HtmlDecode "{
  &quot;skus&quot; : [ null, null, null, null, null ]
}"
  GetBidsInfoForBusinessExamples <- GetBidsInfoForBusinessExamples.Add("application/json", GetBidsInfoForBusinessBody)

  let getGetBidsInfoForBusinessExample mediaType =
    GetBidsInfoForBusinessExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetBidsRecommendationsExamples = Map.empty
  let mutable GetBidsRecommendationsBody = ""

  GetBidsRecommendationsBody <- WebUtility.HtmlDecode "{
  &quot;skus&quot; : [ null, null, null, null, null ]
}"
  GetBidsRecommendationsExamples <- GetBidsRecommendationsExamples.Add("application/json", GetBidsRecommendationsBody)

  let getGetBidsRecommendationsExample mediaType =
    GetBidsRecommendationsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetBusinessQuarantineOffersExamples = Map.empty
  let mutable GetBusinessQuarantineOffersBody = ""

  GetBusinessQuarantineOffersBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ 0, 0 ],
  &quot;vendorNames&quot; : [ &quot;vendorNames&quot;, &quot;vendorNames&quot; ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;cardStatuses&quot; : [ &quot;HAS_CARD_CAN_NOT_UPDATE&quot;, &quot;HAS_CARD_CAN_NOT_UPDATE&quot; ],
  &quot;tags&quot; : [ &quot;tags&quot;, &quot;tags&quot; ]
}"
  GetBusinessQuarantineOffersExamples <- GetBusinessQuarantineOffersExamples.Add("application/json", GetBusinessQuarantineOffersBody)

  let getGetBusinessQuarantineOffersExample mediaType =
    GetBusinessQuarantineOffersExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable GetCampaignOffersExamples = Map.empty
  let mutable GetCampaignOffersBody = ""

  GetCampaignOffersBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ 0, 0 ],
  &quot;vendorNames&quot; : [ &quot;vendorNames&quot;, &quot;vendorNames&quot; ],
  &quot;statuses&quot; : [ &quot;PUBLISHED&quot;, &quot;PUBLISHED&quot; ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;tags&quot; : [ &quot;tags&quot;, &quot;tags&quot; ]
}"
  GetCampaignOffersExamples <- GetCampaignOffersExamples.Add("application/json", GetCampaignOffersBody)

  let getGetCampaignOffersExample mediaType =
    GetCampaignOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetCampaignQuarantineOffersExamples = Map.empty
  let mutable GetCampaignQuarantineOffersBody = ""

  GetCampaignQuarantineOffersBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ 0, 0 ],
  &quot;vendorNames&quot; : [ &quot;vendorNames&quot;, &quot;vendorNames&quot; ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;cardStatuses&quot; : [ &quot;HAS_CARD_CAN_NOT_UPDATE&quot;, &quot;HAS_CARD_CAN_NOT_UPDATE&quot; ],
  &quot;tags&quot; : [ &quot;tags&quot;, &quot;tags&quot; ]
}"
  GetCampaignQuarantineOffersExamples <- GetCampaignQuarantineOffersExamples.Add("application/json", GetCampaignQuarantineOffersBody)

  let getGetCampaignQuarantineOffersExample mediaType =
    GetCampaignQuarantineOffersExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable GetCategoriesMaxSaleQuantumExamples = Map.empty
  let mutable GetCategoriesMaxSaleQuantumBody = ""

  GetCategoriesMaxSaleQuantumBody <- WebUtility.HtmlDecode "{
  &quot;marketCategoryIds&quot; : [ 0, 0, 0, 0, 0 ]
}"
  GetCategoriesMaxSaleQuantumExamples <- GetCategoriesMaxSaleQuantumExamples.Add("application/json", GetCategoriesMaxSaleQuantumBody)

  let getGetCategoriesMaxSaleQuantumExample mediaType =
    GetCategoriesMaxSaleQuantumExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetCategoriesTreeExamples = Map.empty
  let mutable GetCategoriesTreeBody = ""

  GetCategoriesTreeBody <- WebUtility.HtmlDecode "{
  &quot;language&quot; : &quot;RU&quot;
}"
  GetCategoriesTreeExamples <- GetCategoriesTreeExamples.Add("application/json", GetCategoriesTreeBody)

  let getGetCategoriesTreeExample mediaType =
    GetCategoriesTreeExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable GetChatHistoryExamples = Map.empty
  let mutable GetChatHistoryBody = ""

  GetChatHistoryBody <- WebUtility.HtmlDecode "{
  &quot;messageIdFrom&quot; : 0
}"
  GetChatHistoryExamples <- GetChatHistoryExamples.Add("application/json", GetChatHistoryBody)

  let getGetChatHistoryExample mediaType =
    GetChatHistoryExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetChatsExamples = Map.empty
  let mutable GetChatsBody = ""

  GetChatsBody <- WebUtility.HtmlDecode "{
  &quot;types&quot; : [ &quot;CHAT&quot;, &quot;CHAT&quot; ],
  &quot;statuses&quot; : [ &quot;NEW&quot;, &quot;NEW&quot; ],
  &quot;orderIds&quot; : [ 0, 0 ]
}"
  GetChatsExamples <- GetChatsExamples.Add("application/json", GetChatsBody)

  let getGetChatsExample mediaType =
    GetChatsExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()


  let mutable GetGoodsFeedbackCommentsExamples = Map.empty
  let mutable GetGoodsFeedbackCommentsBody = ""

  GetGoodsFeedbackCommentsBody <- WebUtility.HtmlDecode "{
  &quot;feedbackId&quot; : 0
}"
  GetGoodsFeedbackCommentsExamples <- GetGoodsFeedbackCommentsExamples.Add("application/json", GetGoodsFeedbackCommentsBody)

  let getGetGoodsFeedbackCommentsExample mediaType =
    GetGoodsFeedbackCommentsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetGoodsFeedbacksExamples = Map.empty
  let mutable GetGoodsFeedbacksBody = ""

  GetGoodsFeedbacksBody <- WebUtility.HtmlDecode "{
  &quot;dateTimeFrom&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
  &quot;ratingValues&quot; : [ 0, 0, 0, 0, 0 ],
  &quot;modelIds&quot; : [ 6, 6, 6, 6, 6 ],
  &quot;paid&quot; : true,
  &quot;reactionStatus&quot; : &quot;ALL&quot;,
  &quot;dateTimeTo&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
}"
  GetGoodsFeedbacksExamples <- GetGoodsFeedbacksExamples.Add("application/json", GetGoodsFeedbacksBody)

  let getGetGoodsFeedbacksExample mediaType =
    GetGoodsFeedbacksExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetGoodsStatsExamples = Map.empty
  let mutable GetGoodsStatsBody = ""

  GetGoodsStatsBody <- WebUtility.HtmlDecode "{
  &quot;shopSkus&quot; : [ null, null, null, null, null ]
}"
  GetGoodsStatsExamples <- GetGoodsStatsExamples.Add("application/json", GetGoodsStatsBody)

  let getGetGoodsStatsExample mediaType =
    GetGoodsStatsExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable GetOfferCardsContentStatusExamples = Map.empty
  let mutable GetOfferCardsContentStatusBody = ""

  GetOfferCardsContentStatusBody <- WebUtility.HtmlDecode "{
  &quot;categoryIds&quot; : [ null, null, null, null, null ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;cardStatuses&quot; : [ &quot;HAS_CARD_CAN_NOT_UPDATE&quot;, &quot;HAS_CARD_CAN_NOT_UPDATE&quot; ]
}"
  GetOfferCardsContentStatusExamples <- GetOfferCardsContentStatusExamples.Add("application/json", GetOfferCardsContentStatusBody)

  let getGetOfferCardsContentStatusExample mediaType =
    GetOfferCardsContentStatusExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable GetOfferMappingsExamples = Map.empty
  let mutable GetOfferMappingsBody = ""

  GetOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;archived&quot; : true,
  &quot;categoryIds&quot; : [ 0, 0 ],
  &quot;vendorNames&quot; : [ &quot;vendorNames&quot;, &quot;vendorNames&quot; ],
  &quot;offerIds&quot; : [ null, null, null, null, null ],
  &quot;cardStatuses&quot; : [ &quot;HAS_CARD_CAN_NOT_UPDATE&quot;, &quot;HAS_CARD_CAN_NOT_UPDATE&quot; ],
  &quot;tags&quot; : [ &quot;tags&quot;, &quot;tags&quot; ]
}"
  GetOfferMappingsExamples <- GetOfferMappingsExamples.Add("application/json", GetOfferMappingsBody)

  let getGetOfferMappingsExample mediaType =
    GetOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetOfferRecommendationsExamples = Map.empty
  let mutable GetOfferRecommendationsBody = ""

  GetOfferRecommendationsBody <- WebUtility.HtmlDecode "{
  &quot;cofinancePriceFilter&quot; : &quot;SPECIFIED&quot;,
  &quot;competitivenessFilter&quot; : &quot;OPTIMAL&quot;,
  &quot;offerIds&quot; : [ null, null ]
}"
  GetOfferRecommendationsExamples <- GetOfferRecommendationsExamples.Add("application/json", GetOfferRecommendationsBody)

  let getGetOfferRecommendationsExample mediaType =
    GetOfferRecommendationsExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()


  let mutable GetOrdersStatsExamples = Map.empty
  let mutable GetOrdersStatsBody = ""

  GetOrdersStatsBody <- WebUtility.HtmlDecode "{
  &quot;updateTo&quot; : &quot;2000-01-23&quot;,
  &quot;updateFrom&quot; : &quot;2000-01-23&quot;,
  &quot;hasCis&quot; : true,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;statuses&quot; : [ &quot;CANCELLED_BEFORE_PROCESSING&quot;, &quot;CANCELLED_BEFORE_PROCESSING&quot; ],
  &quot;orders&quot; : [ 0, 0 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GetOrdersStatsExamples <- GetOrdersStatsExamples.Add("application/json", GetOrdersStatsBody)

  let getGetOrdersStatsExample mediaType =
    GetOrdersStatsExamples.[mediaType]
      |> getConverter mediaType
  ()


  let mutable GetPricesByOfferIdsExamples = Map.empty
  let mutable GetPricesByOfferIdsBody = ""

  GetPricesByOfferIdsBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  GetPricesByOfferIdsExamples <- GetPricesByOfferIdsExamples.Add("application/json", GetPricesByOfferIdsBody)

  let getGetPricesByOfferIdsExample mediaType =
    GetPricesByOfferIdsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetPromoOffersExamples = Map.empty
  let mutable GetPromoOffersBody = ""

  GetPromoOffersBody <- WebUtility.HtmlDecode "{
  &quot;statusType&quot; : &quot;MANUALLY_ADDED&quot;,
  &quot;promoId&quot; : &quot;promoId&quot;
}"
  GetPromoOffersExamples <- GetPromoOffersExamples.Add("application/json", GetPromoOffersBody)

  let getGetPromoOffersExample mediaType =
    GetPromoOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetPromosExamples = Map.empty
  let mutable GetPromosBody = ""

  GetPromosBody <- WebUtility.HtmlDecode "{
  &quot;participation&quot; : &quot;PARTICIPATING_NOW&quot;,
  &quot;mechanics&quot; : &quot;DIRECT_DISCOUNT&quot;
}"
  GetPromosExamples <- GetPromosExamples.Add("application/json", GetPromosBody)

  let getGetPromosExample mediaType =
    GetPromosExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetQualityRatingsExamples = Map.empty
  let mutable GetQualityRatingsBody = ""

  GetQualityRatingsBody <- WebUtility.HtmlDecode "{
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;campaignIds&quot; : [ 0, 0, 0, 0, 0 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GetQualityRatingsExamples <- GetQualityRatingsExamples.Add("application/json", GetQualityRatingsBody)

  let getGetQualityRatingsExample mediaType =
    GetQualityRatingsExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable GetStocksExamples = Map.empty
  let mutable GetStocksBody = ""

  GetStocksBody <- WebUtility.HtmlDecode "{
  &quot;archived&quot; : true,
  &quot;withTurnover&quot; : false,
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  GetStocksExamples <- GetStocksExamples.Add("application/json", GetStocksBody)

  let getGetStocksExample mediaType =
    GetStocksExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetSuggestedOfferMappingEntriesExamples = Map.empty
  let mutable GetSuggestedOfferMappingEntriesBody = ""

  GetSuggestedOfferMappingEntriesBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  }, {
    &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
    &quot;certificate&quot; : &quot;certificate&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;availability&quot; : &quot;ACTIVE&quot;,
    &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
    &quot;manufacturer&quot; : &quot;manufacturer&quot;,
    &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
    &quot;deliveryDurationDays&quot; : 5,
    &quot;feedId&quot; : 0,
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;price&quot; : 2.027123023002322,
    &quot;transportUnitSize&quot; : 1,
    &quot;id&quot; : &quot;id&quot;,
    &quot;lifeTime&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;shelfLife&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
    &quot;lifeTimeDays&quot; : 9,
    &quot;quantumOfSupply&quot; : 5,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
    &quot;processingState&quot; : {
      &quot;notes&quot; : [ {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      }, {
        &quot;payload&quot; : &quot;payload&quot;,
        &quot;type&quot; : &quot;ASSORTMENT&quot;
      } ],
      &quot;status&quot; : &quot;UNKNOWN&quot;
    },
    &quot;shopSku&quot; : &quot;shopSku&quot;,
    &quot;boxCount&quot; : 2,
    &quot;minShipment&quot; : 6,
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;shelfLifeDays&quot; : 7,
    &quot;guaranteePeriod&quot; : {
      &quot;timePeriod&quot; : 6,
      &quot;comment&quot; : &quot;comment&quot;,
      &quot;timeUnit&quot; : &quot;HOUR&quot;
    },
    &quot;weightDimensions&quot; : {
      &quot;length&quot; : 65.55,
      &quot;width&quot; : 50.7,
      &quot;weight&quot; : 1.001,
      &quot;height&quot; : 20
    },
    &quot;category&quot; : &quot;category&quot;,
    &quot;guaranteePeriodDays&quot; : 3
  } ]
}"
  GetSuggestedOfferMappingEntriesExamples <- GetSuggestedOfferMappingEntriesExamples.Add("application/json", GetSuggestedOfferMappingEntriesBody)

  let getGetSuggestedOfferMappingEntriesExample mediaType =
    GetSuggestedOfferMappingEntriesExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetSuggestedOfferMappingsExamples = Map.empty
  let mutable GetSuggestedOfferMappingsBody = ""

  GetSuggestedOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  }, {
    &quot;vendor&quot; : &quot;LEVENHUK&quot;,
    &quot;basicPrice&quot; : {
      &quot;value&quot; : 0.9301444243932576
    },
    &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;description&quot; : &quot;description&quot;,
    &quot;category&quot; : &quot;category&quot;,
    &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
    &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;
  } ]
}"
  GetSuggestedOfferMappingsExamples <- GetSuggestedOfferMappingsExamples.Add("application/json", GetSuggestedOfferMappingsBody)

  let getGetSuggestedOfferMappingsExample mediaType =
    GetSuggestedOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetSuggestedPricesExamples = Map.empty
  let mutable GetSuggestedPricesBody = ""

  GetSuggestedPricesBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;marketSku&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;marketSku&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;marketSku&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;marketSku&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;marketSku&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;
  } ]
}"
  GetSuggestedPricesExamples <- GetSuggestedPricesExamples.Add("application/json", GetSuggestedPricesBody)

  let getGetSuggestedPricesExample mediaType =
    GetSuggestedPricesExamples.[mediaType]
      |> getConverter mediaType

  let mutable PutBidsForBusinessExamples = Map.empty
  let mutable PutBidsForBusinessBody = ""

  PutBidsForBusinessBody <- WebUtility.HtmlDecode "{
  &quot;bids&quot; : [ {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  } ]
}"
  PutBidsForBusinessExamples <- PutBidsForBusinessExamples.Add("application/json", PutBidsForBusinessBody)

  let getPutBidsForBusinessExample mediaType =
    PutBidsForBusinessExamples.[mediaType]
      |> getConverter mediaType

  let mutable PutBidsForCampaignExamples = Map.empty
  let mutable PutBidsForCampaignBody = ""

  PutBidsForCampaignBody <- WebUtility.HtmlDecode "{
  &quot;bids&quot; : [ {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;bid&quot; : 570
  } ]
}"
  PutBidsForCampaignExamples <- PutBidsForCampaignExamples.Add("application/json", PutBidsForCampaignBody)

  let getPutBidsForCampaignExample mediaType =
    PutBidsForCampaignExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()


  let mutable SendFileToChatExamples = Map.empty
  let mutable SendFileToChatBody = ""

  let getSendFileToChatExample mediaType =
    SendFileToChatExamples.[mediaType]
      |> getConverter mediaType

  let mutable SendMessageToChatExamples = Map.empty
  let mutable SendMessageToChatBody = ""

  SendMessageToChatBody <- WebUtility.HtmlDecode "{
  &quot;message&quot; : &quot;message&quot;
}"
  SendMessageToChatExamples <- SendMessageToChatExamples.Add("application/json", SendMessageToChatBody)

  let getSendMessageToChatExample mediaType =
    SendMessageToChatExamples.[mediaType]
      |> getConverter mediaType

  let mutable SetFeedParamsExamples = Map.empty
  let mutable SetFeedParamsBody = ""

  SetFeedParamsBody <- WebUtility.HtmlDecode "{
  &quot;parameters&quot; : [ {
    &quot;deleted&quot; : true,
    &quot;values&quot; : [ 0, 0 ],
    &quot;name&quot; : &quot;name&quot;
  }, {
    &quot;deleted&quot; : true,
    &quot;values&quot; : [ 0, 0 ],
    &quot;name&quot; : &quot;name&quot;
  } ]
}"
  SetFeedParamsExamples <- SetFeedParamsExamples.Add("application/json", SetFeedParamsBody)

  let getSetFeedParamsExample mediaType =
    SetFeedParamsExamples.[mediaType]
      |> getConverter mediaType

  let mutable SkipGoodsFeedbacksReactionExamples = Map.empty
  let mutable SkipGoodsFeedbacksReactionBody = ""

  SkipGoodsFeedbacksReactionBody <- WebUtility.HtmlDecode "{
  &quot;feedbackIds&quot; : [ null, null, null, null, null ]
}"
  SkipGoodsFeedbacksReactionExamples <- SkipGoodsFeedbacksReactionExamples.Add("application/json", SkipGoodsFeedbacksReactionBody)

  let getSkipGoodsFeedbacksReactionExample mediaType =
    SkipGoodsFeedbacksReactionExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateBusinessPricesExamples = Map.empty
  let mutable UpdateBusinessPricesBody = ""

  UpdateBusinessPricesBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;price&quot; : {
      &quot;discountBase&quot; : 0.7061401241503109,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.23021358869347652
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;discountBase&quot; : 0.7061401241503109,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.23021358869347652
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;discountBase&quot; : 0.7061401241503109,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.23021358869347652
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;discountBase&quot; : 0.7061401241503109,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.23021358869347652
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;discountBase&quot; : 0.7061401241503109,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.23021358869347652
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  } ]
}"
  UpdateBusinessPricesExamples <- UpdateBusinessPricesExamples.Add("application/json", UpdateBusinessPricesBody)

  let getUpdateBusinessPricesExample mediaType =
    UpdateBusinessPricesExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateCampaignOffersExamples = Map.empty
  let mutable UpdateCampaignOffersBody = ""

  UpdateCampaignOffersBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;available&quot; : true,
    &quot;vat&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;quantum&quot; : {
      &quot;minQuantity&quot; : 1,
      &quot;stepQuantity&quot; : 60
    }
  }, {
    &quot;available&quot; : true,
    &quot;vat&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;quantum&quot; : {
      &quot;minQuantity&quot; : 1,
      &quot;stepQuantity&quot; : 60
    }
  }, {
    &quot;available&quot; : true,
    &quot;vat&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;quantum&quot; : {
      &quot;minQuantity&quot; : 1,
      &quot;stepQuantity&quot; : 60
    }
  }, {
    &quot;available&quot; : true,
    &quot;vat&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;quantum&quot; : {
      &quot;minQuantity&quot; : 1,
      &quot;stepQuantity&quot; : 60
    }
  }, {
    &quot;available&quot; : true,
    &quot;vat&quot; : 0,
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;quantum&quot; : {
      &quot;minQuantity&quot; : 1,
      &quot;stepQuantity&quot; : 60
    }
  } ]
}"
  UpdateCampaignOffersExamples <- UpdateCampaignOffersExamples.Add("application/json", UpdateCampaignOffersBody)

  let getUpdateCampaignOffersExample mediaType =
    UpdateCampaignOffersExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateGoodsFeedbackCommentExamples = Map.empty
  let mutable UpdateGoodsFeedbackCommentBody = ""

  UpdateGoodsFeedbackCommentBody <- WebUtility.HtmlDecode "{
  &quot;feedbackId&quot; : 0,
  &quot;comment&quot; : {
    &quot;id&quot; : 6,
    &quot;text&quot; : &quot;text&quot;,
    &quot;parentId&quot; : 1
  }
}"
  UpdateGoodsFeedbackCommentExamples <- UpdateGoodsFeedbackCommentExamples.Add("application/json", UpdateGoodsFeedbackCommentBody)

  let getUpdateGoodsFeedbackCommentExample mediaType =
    UpdateGoodsFeedbackCommentExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOfferContentExamples = Map.empty
  let mutable UpdateOfferContentBody = ""

  UpdateOfferContentBody <- WebUtility.HtmlDecode "{
  &quot;offersContent&quot; : [ {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;categoryId&quot; : 0,
    &quot;parameterValues&quot; : [ {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    } ]
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;categoryId&quot; : 0,
    &quot;parameterValues&quot; : [ {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    } ]
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;categoryId&quot; : 0,
    &quot;parameterValues&quot; : [ {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    } ]
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;categoryId&quot; : 0,
    &quot;parameterValues&quot; : [ {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    } ]
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;categoryId&quot; : 0,
    &quot;parameterValues&quot; : [ {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    }, {
      &quot;valueId&quot; : 5,
      &quot;parameterId&quot; : 1,
      &quot;unitId&quot; : 5,
      &quot;value&quot; : &quot;value&quot;
    } ]
  } ]
}"
  UpdateOfferContentExamples <- UpdateOfferContentExamples.Add("application/json", UpdateOfferContentBody)

  let getUpdateOfferContentExample mediaType =
    UpdateOfferContentExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOfferMappingEntriesExamples = Map.empty
  let mutable UpdateOfferMappingEntriesBody = ""

  UpdateOfferMappingEntriesBody <- WebUtility.HtmlDecode "{
  &quot;offerMappingEntries&quot; : [ {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  }, {
    &quot;offer&quot; : {
      &quot;manufacturerCountries&quot; : [ &quot;manufacturerCountries&quot;, &quot;manufacturerCountries&quot; ],
      &quot;certificate&quot; : &quot;certificate&quot;,
      &quot;description&quot; : &quot;description&quot;,
      &quot;availability&quot; : &quot;ACTIVE&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;manufacturer&quot; : &quot;manufacturer&quot;,
      &quot;urls&quot; : [ &quot;urls&quot;, &quot;urls&quot; ],
      &quot;deliveryDurationDays&quot; : 5,
      &quot;feedId&quot; : 0,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;transportUnitSize&quot; : 1,
      &quot;id&quot; : &quot;id&quot;,
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;supplyScheduleDays&quot; : [ &quot;MONDAY&quot;, &quot;MONDAY&quot; ],
      &quot;lifeTimeDays&quot; : 9,
      &quot;quantumOfSupply&quot; : 5,
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;customsCommodityCodes&quot; : [ &quot;customsCommodityCodes&quot;, &quot;customsCommodityCodes&quot; ],
      &quot;processingState&quot; : {
        &quot;notes&quot; : [ {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        }, {
          &quot;payload&quot; : &quot;payload&quot;,
          &quot;type&quot; : &quot;ASSORTMENT&quot;
        } ],
        &quot;status&quot; : &quot;UNKNOWN&quot;
      },
      &quot;shopSku&quot; : &quot;shopSku&quot;,
      &quot;boxCount&quot; : 2,
      &quot;minShipment&quot; : 6,
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;shelfLifeDays&quot; : 7,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;guaranteePeriodDays&quot; : 3
    },
    &quot;mapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;awaitingModerationMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    },
    &quot;rejectedMapping&quot; : {
      &quot;modelId&quot; : 7,
      &quot;marketSku&quot; : 4,
      &quot;categoryId&quot; : 1
    }
  } ]
}"
  UpdateOfferMappingEntriesExamples <- UpdateOfferMappingEntriesExamples.Add("application/json", UpdateOfferMappingEntriesBody)

  let getUpdateOfferMappingEntriesExample mediaType =
    UpdateOfferMappingEntriesExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOfferMappingsExamples = Map.empty
  let mutable UpdateOfferMappingsBody = ""

  UpdateOfferMappingsBody <- WebUtility.HtmlDecode "{
  &quot;offerMappings&quot; : [ {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  }, {
    &quot;offer&quot; : {
      &quot;downloadable&quot; : true,
      &quot;marketCategoryId&quot; : 0,
      &quot;manufacturerCountries&quot; : [ &quot;Россия&quot;, &quot;Россия&quot; ],
      &quot;description&quot; : &quot;description&quot;,
      &quot;videos&quot; : [ &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot;, &quot;videos&quot; ],
      &quot;purchasePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;type&quot; : &quot;DEFAULT&quot;,
      &quot;pictures&quot; : [ &quot;pictures&quot;, &quot;pictures&quot; ],
      &quot;vendorCode&quot; : &quot;VNDR-0005A&quot;,
      &quot;vendor&quot; : &quot;LEVENHUK&quot;,
      &quot;basicPrice&quot; : {
        &quot;discountBase&quot; : 0.7061401241503109,
        &quot;currencyId&quot; : &quot;RUR&quot;,
        &quot;value&quot; : 0.23021358869347652
      },
      &quot;lifeTime&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;shelfLife&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;cofinancePrice&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;parameterValues&quot; : [ {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      }, {
        &quot;valueId&quot; : 5,
        &quot;parameterId&quot; : 1,
        &quot;unitId&quot; : 5,
        &quot;value&quot; : &quot;value&quot;
      } ],
      &quot;barcodes&quot; : [ &quot;46012300000000&quot;, &quot;46012300000000&quot; ],
      &quot;params&quot; : [ {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      }, {
        &quot;name&quot; : &quot;Wi-Fi&quot;,
        &quot;value&quot; : &quot;есть&quot;
      } ],
      &quot;tags&quot; : [ &quot;до 500 рублей&quot;, &quot;до 500 рублей&quot; ],
      &quot;condition&quot; : {
        &quot;reason&quot; : &quot;reason&quot;,
        &quot;type&quot; : &quot;PREOWNED&quot;,
        &quot;quality&quot; : &quot;PERFECT&quot;
      },
      &quot;certificates&quot; : [ &quot;certificates&quot;, &quot;certificates&quot; ],
      &quot;boxCount&quot; : 6,
      &quot;additionalExpenses&quot; : {
        &quot;value&quot; : 0.9301444243932576
      },
      &quot;name&quot; : &quot;Ударная дрель Makita HP1630, 710 Вт&quot;,
      &quot;offerId&quot; : &quot;offerId&quot;,
      &quot;guaranteePeriod&quot; : {
        &quot;timePeriod&quot; : 6,
        &quot;comment&quot; : &quot;comment&quot;,
        &quot;timeUnit&quot; : &quot;HOUR&quot;
      },
      &quot;weightDimensions&quot; : {
        &quot;length&quot; : 65.55,
        &quot;width&quot; : 50.7,
        &quot;weight&quot; : 1.001,
        &quot;height&quot; : 20
      },
      &quot;category&quot; : &quot;category&quot;,
      &quot;customsCommodityCode&quot; : &quot;8517610008&quot;,
      &quot;adult&quot; : true,
      &quot;age&quot; : {
        &quot;ageUnit&quot; : &quot;YEAR&quot;,
        &quot;value&quot; : 0.5962133916683182
      },
      &quot;manuals&quot; : [ {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      }, {
        &quot;title&quot; : &quot;title&quot;,
        &quot;url&quot; : &quot;url&quot;
      } ]
    },
    &quot;mapping&quot; : {
      &quot;marketSku&quot; : 3
    }
  } ],
  &quot;onlyPartnerMediaContent&quot; : true
}"
  UpdateOfferMappingsExamples <- UpdateOfferMappingsExamples.Add("application/json", UpdateOfferMappingsBody)

  let getUpdateOfferMappingsExample mediaType =
    UpdateOfferMappingsExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdatePricesExamples = Map.empty
  let mutable UpdatePricesBody = ""

  UpdatePricesBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;price&quot; : {
      &quot;vat&quot; : 1,
      &quot;discountBase&quot; : 6.027456183070403,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.8008281904610115
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;vat&quot; : 1,
      &quot;discountBase&quot; : 6.027456183070403,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.8008281904610115
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;vat&quot; : 1,
      &quot;discountBase&quot; : 6.027456183070403,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.8008281904610115
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;vat&quot; : 1,
      &quot;discountBase&quot; : 6.027456183070403,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.8008281904610115
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  }, {
    &quot;price&quot; : {
      &quot;vat&quot; : 1,
      &quot;discountBase&quot; : 6.027456183070403,
      &quot;currencyId&quot; : &quot;RUR&quot;,
      &quot;value&quot; : 0.8008281904610115
    },
    &quot;offerId&quot; : &quot;offerId&quot;
  } ]
}"
  UpdatePricesExamples <- UpdatePricesExamples.Add("application/json", UpdatePricesBody)

  let getUpdatePricesExample mediaType =
    UpdatePricesExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdatePromoOffersExamples = Map.empty
  let mutable UpdatePromoOffersBody = ""

  UpdatePromoOffersBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;params&quot; : {
      &quot;discountParams&quot; : {
        &quot;promoPrice&quot; : 1,
        &quot;price&quot; : 1
      }
    }
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;params&quot; : {
      &quot;discountParams&quot; : {
        &quot;promoPrice&quot; : 1,
        &quot;price&quot; : 1
      }
    }
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;params&quot; : {
      &quot;discountParams&quot; : {
        &quot;promoPrice&quot; : 1,
        &quot;price&quot; : 1
      }
    }
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;params&quot; : {
      &quot;discountParams&quot; : {
        &quot;promoPrice&quot; : 1,
        &quot;price&quot; : 1
      }
    }
  }, {
    &quot;offerId&quot; : &quot;offerId&quot;,
    &quot;params&quot; : {
      &quot;discountParams&quot; : {
        &quot;promoPrice&quot; : 1,
        &quot;price&quot; : 1
      }
    }
  } ],
  &quot;promoId&quot; : &quot;promoId&quot;
}"
  UpdatePromoOffersExamples <- UpdatePromoOffersExamples.Add("application/json", UpdatePromoOffersBody)

  let getUpdatePromoOffersExample mediaType =
    UpdatePromoOffersExamples.[mediaType]
      |> getConverter mediaType
