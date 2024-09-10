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
open ympa_fsharp_giraffe_server.ShipmentsApiHandler
open ympa_fsharp_giraffe_server.ShipmentsApiHandlerParams

module ShipmentsApiHandlerTestsHelper =


  let mutable ConfirmShipmentExamples = Map.empty
  let mutable ConfirmShipmentBody = ""

  ConfirmShipmentBody <- WebUtility.HtmlDecode "{
  &quot;externalShipmentId&quot; : &quot;externalShipmentId&quot;
}"
  ConfirmShipmentExamples <- ConfirmShipmentExamples.Add("application/json", ConfirmShipmentBody)

  let getConfirmShipmentExample mediaType =
    ConfirmShipmentExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable SearchShipmentsExamples = Map.empty
  let mutable SearchShipmentsBody = ""

  SearchShipmentsBody <- WebUtility.HtmlDecode "{
  &quot;cancelledOrders&quot; : true,
  &quot;dateTo&quot; : &quot;2000-01-23&quot;,
  &quot;statuses&quot; : [ &quot;OUTBOUND_CREATED&quot;, &quot;OUTBOUND_CREATED&quot; ],
  &quot;orderIds&quot; : [ 0, 0 ],
  &quot;dateFrom&quot; : &quot;2000-01-23&quot;
}"
  SearchShipmentsExamples <- SearchShipmentsExamples.Add("application/json", SearchShipmentsBody)

  let getSearchShipmentsExample mediaType =
    SearchShipmentsExamples.[mediaType]
      |> getConverter mediaType

  let mutable SetShipmentPalletsCountExamples = Map.empty
  let mutable SetShipmentPalletsCountBody = ""

  SetShipmentPalletsCountBody <- WebUtility.HtmlDecode "{
  &quot;placesCount&quot; : 0
}"
  SetShipmentPalletsCountExamples <- SetShipmentPalletsCountExamples.Add("application/json", SetShipmentPalletsCountBody)

  let getSetShipmentPalletsCountExample mediaType =
    SetShipmentPalletsCountExamples.[mediaType]
      |> getConverter mediaType

  let mutable TransferOrdersFromShipmentExamples = Map.empty
  let mutable TransferOrdersFromShipmentBody = ""

  TransferOrdersFromShipmentBody <- WebUtility.HtmlDecode "{
  &quot;orderIds&quot; : [ 0, 0, 0, 0, 0 ]
}"
  TransferOrdersFromShipmentExamples <- TransferOrdersFromShipmentExamples.Add("application/json", TransferOrdersFromShipmentBody)

  let getTransferOrdersFromShipmentExample mediaType =
    TransferOrdersFromShipmentExamples.[mediaType]
      |> getConverter mediaType
