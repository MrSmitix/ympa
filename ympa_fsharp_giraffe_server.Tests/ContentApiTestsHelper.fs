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
open ympa_fsharp_giraffe_server.ContentApiHandler
open ympa_fsharp_giraffe_server.ContentApiHandlerParams

module ContentApiHandlerTestsHelper =

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
