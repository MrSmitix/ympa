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
open ympa_fsharp_giraffe_server.ReturnsApiHandler
open ympa_fsharp_giraffe_server.ReturnsApiHandlerParams

module ReturnsApiHandlerTestsHelper =

  ()

  ()

  ()

  ()


  let mutable SetReturnDecisionExamples = Map.empty
  let mutable SetReturnDecisionBody = ""

  SetReturnDecisionBody <- WebUtility.HtmlDecode "{
  &quot;returnItemId&quot; : 1,
  &quot;decisionType&quot; : &quot;REFUND_MONEY_INCLUDING_SHIPMENT&quot;,
  &quot;comment&quot; : &quot;Вернуть 149 рублей за пересылку&quot;
}"
  SetReturnDecisionExamples <- SetReturnDecisionExamples.Add("application/json", SetReturnDecisionBody)

  let getSetReturnDecisionExample mediaType =
    SetReturnDecisionExamples.[mediaType]
      |> getConverter mediaType
  ()

