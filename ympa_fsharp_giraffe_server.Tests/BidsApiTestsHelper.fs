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
open ympa_fsharp_giraffe_server.BidsApiHandler
open ympa_fsharp_giraffe_server.BidsApiHandlerParams

module BidsApiHandlerTestsHelper =


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
