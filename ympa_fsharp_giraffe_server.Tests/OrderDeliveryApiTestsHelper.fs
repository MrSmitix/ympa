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
open ympa_fsharp_giraffe_server.OrderDeliveryApiHandler
open ympa_fsharp_giraffe_server.OrderDeliveryApiHandlerParams

module OrderDeliveryApiHandlerTestsHelper =

  ()


  let mutable SetOrderDeliveryDateExamples = Map.empty
  let mutable SetOrderDeliveryDateBody = ""

  SetOrderDeliveryDateBody <- WebUtility.HtmlDecode "{
  &quot;reason&quot; : &quot;USER_MOVED_DELIVERY_DATES&quot;,
  &quot;dates&quot; : {
    &quot;toDate&quot; : &quot;2000-01-23&quot;
  }
}"
  SetOrderDeliveryDateExamples <- SetOrderDeliveryDateExamples.Add("application/json", SetOrderDeliveryDateBody)

  let getSetOrderDeliveryDateExample mediaType =
    SetOrderDeliveryDateExamples.[mediaType]
      |> getConverter mediaType

  let mutable SetOrderDeliveryTrackCodeExamples = Map.empty
  let mutable SetOrderDeliveryTrackCodeBody = ""

  SetOrderDeliveryTrackCodeBody <- WebUtility.HtmlDecode "{
  &quot;trackCode&quot; : &quot;trackCode&quot;,
  &quot;deliveryServiceId&quot; : 0
}"
  SetOrderDeliveryTrackCodeExamples <- SetOrderDeliveryTrackCodeExamples.Add("application/json", SetOrderDeliveryTrackCodeBody)

  let getSetOrderDeliveryTrackCodeExample mediaType =
    SetOrderDeliveryTrackCodeExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOrderStorageLimitExamples = Map.empty
  let mutable UpdateOrderStorageLimitBody = ""

  UpdateOrderStorageLimitBody <- WebUtility.HtmlDecode "{
  &quot;newDate&quot; : &quot;2000-01-23&quot;
}"
  UpdateOrderStorageLimitExamples <- UpdateOrderStorageLimitExamples.Add("application/json", UpdateOrderStorageLimitBody)

  let getUpdateOrderStorageLimitExample mediaType =
    UpdateOrderStorageLimitExamples.[mediaType]
      |> getConverter mediaType

  let mutable VerifyOrderEacExamples = Map.empty
  let mutable VerifyOrderEacBody = ""

  VerifyOrderEacBody <- WebUtility.HtmlDecode "{
  &quot;code&quot; : &quot;code&quot;
}"
  VerifyOrderEacExamples <- VerifyOrderEacExamples.Add("application/json", VerifyOrderEacBody)

  let getVerifyOrderEacExample mediaType =
    VerifyOrderEacExamples.[mediaType]
      |> getConverter mediaType
