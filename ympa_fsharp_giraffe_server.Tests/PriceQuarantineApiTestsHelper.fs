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
open ympa_fsharp_giraffe_server.PriceQuarantineApiHandler
open ympa_fsharp_giraffe_server.PriceQuarantineApiHandlerParams

module PriceQuarantineApiHandlerTestsHelper =


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
