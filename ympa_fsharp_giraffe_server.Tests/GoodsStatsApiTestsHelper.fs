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
open ympa_fsharp_giraffe_server.GoodsStatsApiHandler
open ympa_fsharp_giraffe_server.GoodsStatsApiHandlerParams

module GoodsStatsApiHandlerTestsHelper =


  let mutable GetGoodsStatsExamples = Map.empty
  let mutable GetGoodsStatsBody = ""

  GetGoodsStatsBody <- WebUtility.HtmlDecode "{
  &quot;shopSkus&quot; : [ null, null, null, null, null ]
}"
  GetGoodsStatsExamples <- GetGoodsStatsExamples.Add("application/json", GetGoodsStatsBody)

  let getGetGoodsStatsExample mediaType =
    GetGoodsStatsExamples.[mediaType]
      |> getConverter mediaType
