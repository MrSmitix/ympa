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
open ympa_fsharp_giraffe_server.StocksApiHandler
open ympa_fsharp_giraffe_server.StocksApiHandlerParams

module StocksApiHandlerTestsHelper =


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

  let mutable UpdateStocksExamples = Map.empty
  let mutable UpdateStocksBody = ""

  UpdateStocksBody <- WebUtility.HtmlDecode "{
  &quot;skus&quot; : [ {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;items&quot; : [ {
      &quot;count&quot; : 160165638,
      &quot;updatedAt&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
    } ]
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;items&quot; : [ {
      &quot;count&quot; : 160165638,
      &quot;updatedAt&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
    } ]
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;items&quot; : [ {
      &quot;count&quot; : 160165638,
      &quot;updatedAt&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
    } ]
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;items&quot; : [ {
      &quot;count&quot; : 160165638,
      &quot;updatedAt&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
    } ]
  }, {
    &quot;sku&quot; : &quot;sku&quot;,
    &quot;items&quot; : [ {
      &quot;count&quot; : 160165638,
      &quot;updatedAt&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
    } ]
  } ]
}"
  UpdateStocksExamples <- UpdateStocksExamples.Add("application/json", UpdateStocksBody)

  let getUpdateStocksExample mediaType =
    UpdateStocksExamples.[mediaType]
      |> getConverter mediaType
