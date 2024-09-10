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
open ympa_fsharp_giraffe_server.RatingsApiHandler
open ympa_fsharp_giraffe_server.RatingsApiHandlerParams

module RatingsApiHandlerTestsHelper =

  ()


  let mutable GetQualityRatingsExamples = Map.empty
  let mutable GetQualityRatingsBody = ""

  GetQualityRatingsBody <- WebUtility.HtmlDecode "{
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;campaignIds&quot; : [ 0, 0, 0, 0, 0 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  GetQualityRatingsExamples <- GetQualityRatingsExamples.Add("application/json", GetQualityRatingsBody)

  let getGetQualityRatingsExample mediaType =
    GetQualityRatingsExamples.[mediaType]
      |> getConverter mediaType
