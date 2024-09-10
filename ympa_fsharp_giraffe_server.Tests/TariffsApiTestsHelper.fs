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
open ympa_fsharp_giraffe_server.TariffsApiHandler
open ympa_fsharp_giraffe_server.TariffsApiHandlerParams

module TariffsApiHandlerTestsHelper =


  let mutable CalculateTariffsExamples = Map.empty
  let mutable CalculateTariffsBody = ""

  CalculateTariffsBody <- WebUtility.HtmlDecode "{
  &quot;offers&quot; : [ {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  }, {
    &quot;quantity&quot; : 1,
    &quot;price&quot; : 0.6027456183070403,
    &quot;length&quot; : 0.14658129805029452,
    &quot;width&quot; : 0.5962133916683182,
    &quot;weight&quot; : 0.23021358869347652,
    &quot;categoryId&quot; : 0,
    &quot;height&quot; : 0.5637376656633328
  } ],
  &quot;parameters&quot; : {
    &quot;campaignId&quot; : 0,
    &quot;sellingProgram&quot; : &quot;FBY&quot;,
    &quot;frequency&quot; : &quot;DAILY&quot;
  }
}"
  CalculateTariffsExamples <- CalculateTariffsExamples.Add("application/json", CalculateTariffsBody)

  let getCalculateTariffsExample mediaType =
    CalculateTariffsExamples.[mediaType]
      |> getConverter mediaType
