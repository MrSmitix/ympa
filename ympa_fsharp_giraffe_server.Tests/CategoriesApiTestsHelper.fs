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
open ympa_fsharp_giraffe_server.CategoriesApiHandler
open ympa_fsharp_giraffe_server.CategoriesApiHandlerParams

module CategoriesApiHandlerTestsHelper =


  let mutable GetCategoriesMaxSaleQuantumExamples = Map.empty
  let mutable GetCategoriesMaxSaleQuantumBody = ""

  GetCategoriesMaxSaleQuantumBody <- WebUtility.HtmlDecode "{
  &quot;marketCategoryIds&quot; : [ 0, 0, 0, 0, 0 ]
}"
  GetCategoriesMaxSaleQuantumExamples <- GetCategoriesMaxSaleQuantumExamples.Add("application/json", GetCategoriesMaxSaleQuantumBody)

  let getGetCategoriesMaxSaleQuantumExample mediaType =
    GetCategoriesMaxSaleQuantumExamples.[mediaType]
      |> getConverter mediaType

  let mutable GetCategoriesTreeExamples = Map.empty
  let mutable GetCategoriesTreeBody = ""

  GetCategoriesTreeBody <- WebUtility.HtmlDecode "{
  &quot;language&quot; : &quot;RU&quot;
}"
  GetCategoriesTreeExamples <- GetCategoriesTreeExamples.Add("application/json", GetCategoriesTreeBody)

  let getGetCategoriesTreeExample mediaType =
    GetCategoriesTreeExamples.[mediaType]
      |> getConverter mediaType
