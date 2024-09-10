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
open ympa_fsharp_giraffe_server.OutletLicensesApiHandler
open ympa_fsharp_giraffe_server.OutletLicensesApiHandlerParams

module OutletLicensesApiHandlerTestsHelper =

  ()

  ()


  let mutable UpdateOutletLicensesExamples = Map.empty
  let mutable UpdateOutletLicensesBody = ""

  UpdateOutletLicensesBody <- WebUtility.HtmlDecode "{
  &quot;licenses&quot; : [ {
    &quot;licenseType&quot; : &quot;ALCOHOL&quot;,
    &quot;number&quot; : &quot;number&quot;,
    &quot;dateOfExpiry&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
    &quot;outletId&quot; : 6,
    &quot;id&quot; : 0,
    &quot;dateOfIssue&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
  }, {
    &quot;licenseType&quot; : &quot;ALCOHOL&quot;,
    &quot;number&quot; : &quot;number&quot;,
    &quot;dateOfExpiry&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;,
    &quot;outletId&quot; : 6,
    &quot;id&quot; : 0,
    &quot;dateOfIssue&quot; : &quot;2000-01-23T04:56:07.000+00:00&quot;
  } ]
}"
  UpdateOutletLicensesExamples <- UpdateOutletLicensesExamples.Add("application/json", UpdateOutletLicensesBody)

  let getUpdateOutletLicensesExample mediaType =
    UpdateOutletLicensesExamples.[mediaType]
      |> getConverter mediaType
