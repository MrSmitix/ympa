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
open ympa_fsharp_giraffe_server.ModelsApiHandler
open ympa_fsharp_giraffe_server.ModelsApiHandlerParams

module ModelsApiHandlerTestsHelper =

  ()

  ()


  let mutable GetModelsExamples = Map.empty
  let mutable GetModelsBody = ""

  GetModelsBody <- WebUtility.HtmlDecode "{
  &quot;models&quot; : [ 0, 0 ]
}"
  GetModelsExamples <- GetModelsExamples.Add("application/json", GetModelsBody)

  let getGetModelsExample mediaType =
    GetModelsExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetModelsOffersExamples = Map.empty
  let mutable GetModelsOffersBody = ""

  GetModelsOffersBody <- WebUtility.HtmlDecode "{
  &quot;models&quot; : [ 0, 0 ]
}"
  GetModelsOffersExamples <- GetModelsOffersExamples.Add("application/json", GetModelsOffersBody)

  let getGetModelsOffersExample mediaType =
    GetModelsOffersExamples.[mediaType]
      |> getConverter mediaType
  ()

