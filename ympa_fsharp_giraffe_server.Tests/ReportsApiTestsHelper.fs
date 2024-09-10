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
open ympa_fsharp_giraffe_server.ReportsApiHandler
open ympa_fsharp_giraffe_server.ReportsApiHandlerParams

module ReportsApiHandlerTestsHelper =


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

  let mutable GenerateMassOrderLabelsReportExamples = Map.empty
  let mutable GenerateMassOrderLabelsReportBody = ""

  GenerateMassOrderLabelsReportBody <- WebUtility.HtmlDecode "{
  &quot;businessId&quot; : 0,
  &quot;orderIds&quot; : [ 6, 6, 6, 6, 6 ]
}"
  GenerateMassOrderLabelsReportExamples <- GenerateMassOrderLabelsReportExamples.Add("application/json", GenerateMassOrderLabelsReportBody)

  let getGenerateMassOrderLabelsReportExample mediaType =
    GenerateMassOrderLabelsReportExamples.[mediaType]
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

  let mutable GenerateShipmentListDocumentReportExamples = Map.empty
  let mutable GenerateShipmentListDocumentReportBody = ""

  GenerateShipmentListDocumentReportBody <- WebUtility.HtmlDecode "{
  &quot;campaignId&quot; : 0,
  &quot;shipmentId&quot; : 6,
  &quot;orderIds&quot; : [ 1, 1 ]
}"
  GenerateShipmentListDocumentReportExamples <- GenerateShipmentListDocumentReportExamples.Add("application/json", GenerateShipmentListDocumentReportBody)

  let getGenerateShipmentListDocumentReportExample mediaType =
    GenerateShipmentListDocumentReportExamples.[mediaType]
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

