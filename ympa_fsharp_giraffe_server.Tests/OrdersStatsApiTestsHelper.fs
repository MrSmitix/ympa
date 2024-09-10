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
open ympa_fsharp_giraffe_server.OrdersStatsApiHandler
open ympa_fsharp_giraffe_server.OrdersStatsApiHandlerParams

module OrdersStatsApiHandlerTestsHelper =


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
