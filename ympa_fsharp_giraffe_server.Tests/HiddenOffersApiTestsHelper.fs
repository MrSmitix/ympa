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
open ympa_fsharp_giraffe_server.HiddenOffersApiHandler
open ympa_fsharp_giraffe_server.HiddenOffersApiHandlerParams

module HiddenOffersApiHandlerTestsHelper =


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
  ()

