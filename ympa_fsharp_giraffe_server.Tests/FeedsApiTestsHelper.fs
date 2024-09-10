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
open ympa_fsharp_giraffe_server.FeedsApiHandler
open ympa_fsharp_giraffe_server.FeedsApiHandlerParams

module FeedsApiHandlerTestsHelper =

  ()

  ()

  ()

  ()


  let mutable SetFeedParamsExamples = Map.empty
  let mutable SetFeedParamsBody = ""

  SetFeedParamsBody <- WebUtility.HtmlDecode "{
  &quot;parameters&quot; : [ {
    &quot;deleted&quot; : true,
    &quot;values&quot; : [ 0, 0 ],
    &quot;name&quot; : &quot;name&quot;
  }, {
    &quot;deleted&quot; : true,
    &quot;values&quot; : [ 0, 0 ],
    &quot;name&quot; : &quot;name&quot;
  } ]
}"
  SetFeedParamsExamples <- SetFeedParamsExamples.Add("application/json", SetFeedParamsBody)

  let getSetFeedParamsExample mediaType =
    SetFeedParamsExamples.[mediaType]
      |> getConverter mediaType
