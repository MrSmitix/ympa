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
open ympa_fsharp_giraffe_server.OutletsApiHandler
open ympa_fsharp_giraffe_server.OutletsApiHandlerParams

module OutletsApiHandlerTestsHelper =


  let mutable CreateOutletExamples = Map.empty
  let mutable CreateOutletBody = ""

  CreateOutletBody <- WebUtility.HtmlDecode "{
  &quot;storagePeriod&quot; : 0,
  &quot;address&quot; : {
    &quot;number&quot; : &quot;number&quot;,
    &quot;km&quot; : 6,
    &quot;regionId&quot; : 0,
    &quot;city&quot; : &quot;city&quot;,
    &quot;street&quot; : &quot;street&quot;,
    &quot;additional&quot; : &quot;additional&quot;,
    &quot;estate&quot; : &quot;estate&quot;,
    &quot;block&quot; : &quot;block&quot;,
    &quot;building&quot; : &quot;building&quot;
  },
  &quot;visibility&quot; : &quot;HIDDEN&quot;,
  &quot;isMain&quot; : true,
  &quot;shopOutletCode&quot; : &quot;shopOutletCode&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;phones&quot; : [ &quot;phones&quot;, &quot;phones&quot; ],
  &quot;type&quot; : &quot;DEPOT&quot;,
  &quot;coords&quot; : &quot;coords&quot;,
  &quot;workingSchedule&quot; : {
    &quot;scheduleItems&quot; : [ {
      &quot;startDay&quot; : &quot;MONDAY&quot;,
      &quot;startTime&quot; : &quot;startTime&quot;,
      &quot;endTime&quot; : &quot;endTime&quot;
    }, {
      &quot;startDay&quot; : &quot;MONDAY&quot;,
      &quot;startTime&quot; : &quot;startTime&quot;,
      &quot;endTime&quot; : &quot;endTime&quot;
    } ],
    &quot;workInHoliday&quot; : true
  },
  &quot;deliveryRules&quot; : [ {
    &quot;priceFreePickup&quot; : 7.061401241503109,
    &quot;deliveryServiceId&quot; : 5,
    &quot;maxDeliveryDays&quot; : 5,
    &quot;minDeliveryDays&quot; : 1,
    &quot;orderBefore&quot; : 5,
    &quot;unspecifiedDeliveryInterval&quot; : true
  }, {
    &quot;priceFreePickup&quot; : 7.061401241503109,
    &quot;deliveryServiceId&quot; : 5,
    &quot;maxDeliveryDays&quot; : 5,
    &quot;minDeliveryDays&quot; : 1,
    &quot;orderBefore&quot; : 5,
    &quot;unspecifiedDeliveryInterval&quot; : true
  } ]
}"
  CreateOutletExamples <- CreateOutletExamples.Add("application/json", CreateOutletBody)

  let getCreateOutletExample mediaType =
    CreateOutletExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()


  let mutable UpdateOutletExamples = Map.empty
  let mutable UpdateOutletBody = ""

  UpdateOutletBody <- WebUtility.HtmlDecode "{
  &quot;storagePeriod&quot; : 0,
  &quot;address&quot; : {
    &quot;number&quot; : &quot;number&quot;,
    &quot;km&quot; : 6,
    &quot;regionId&quot; : 0,
    &quot;city&quot; : &quot;city&quot;,
    &quot;street&quot; : &quot;street&quot;,
    &quot;additional&quot; : &quot;additional&quot;,
    &quot;estate&quot; : &quot;estate&quot;,
    &quot;block&quot; : &quot;block&quot;,
    &quot;building&quot; : &quot;building&quot;
  },
  &quot;visibility&quot; : &quot;HIDDEN&quot;,
  &quot;isMain&quot; : true,
  &quot;shopOutletCode&quot; : &quot;shopOutletCode&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;phones&quot; : [ &quot;phones&quot;, &quot;phones&quot; ],
  &quot;type&quot; : &quot;DEPOT&quot;,
  &quot;coords&quot; : &quot;coords&quot;,
  &quot;workingSchedule&quot; : {
    &quot;scheduleItems&quot; : [ {
      &quot;startDay&quot; : &quot;MONDAY&quot;,
      &quot;startTime&quot; : &quot;startTime&quot;,
      &quot;endTime&quot; : &quot;endTime&quot;
    }, {
      &quot;startDay&quot; : &quot;MONDAY&quot;,
      &quot;startTime&quot; : &quot;startTime&quot;,
      &quot;endTime&quot; : &quot;endTime&quot;
    } ],
    &quot;workInHoliday&quot; : true
  },
  &quot;deliveryRules&quot; : [ {
    &quot;priceFreePickup&quot; : 7.061401241503109,
    &quot;deliveryServiceId&quot; : 5,
    &quot;maxDeliveryDays&quot; : 5,
    &quot;minDeliveryDays&quot; : 1,
    &quot;orderBefore&quot; : 5,
    &quot;unspecifiedDeliveryInterval&quot; : true
  }, {
    &quot;priceFreePickup&quot; : 7.061401241503109,
    &quot;deliveryServiceId&quot; : 5,
    &quot;maxDeliveryDays&quot; : 5,
    &quot;minDeliveryDays&quot; : 1,
    &quot;orderBefore&quot; : 5,
    &quot;unspecifiedDeliveryInterval&quot; : true
  } ]
}"
  UpdateOutletExamples <- UpdateOutletExamples.Add("application/json", UpdateOutletBody)

  let getUpdateOutletExample mediaType =
    UpdateOutletExamples.[mediaType]
      |> getConverter mediaType
