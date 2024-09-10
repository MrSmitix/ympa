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
open ympa_fsharp_giraffe_server.PromosApiHandler
open ympa_fsharp_giraffe_server.PromosApiHandlerParams

module PromosApiHandlerTestsHelper =


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
