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
open ympa_fsharp_giraffe_server.PricesApiHandler
open ympa_fsharp_giraffe_server.PricesApiHandlerParams

module PricesApiHandlerTestsHelper =

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
