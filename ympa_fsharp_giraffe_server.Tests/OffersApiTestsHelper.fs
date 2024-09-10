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
open ympa_fsharp_giraffe_server.OffersApiHandler
open ympa_fsharp_giraffe_server.OffersApiHandlerParams

module OffersApiHandlerTestsHelper =


  let mutable DeleteCampaignOffersExamples = Map.empty
  let mutable DeleteCampaignOffersBody = ""

  DeleteCampaignOffersBody <- WebUtility.HtmlDecode "{
  &quot;offerIds&quot; : [ null, null, null, null, null ]
}"
  DeleteCampaignOffersExamples <- DeleteCampaignOffersExamples.Add("application/json", DeleteCampaignOffersBody)

  let getDeleteCampaignOffersExample mediaType =
    DeleteCampaignOffersExamples.[mediaType]
      |> getConverter mediaType
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
