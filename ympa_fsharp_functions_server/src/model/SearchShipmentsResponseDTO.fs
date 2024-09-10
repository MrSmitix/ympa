namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.ShipmentInfoDTO

module SearchShipmentsResponseDTO =

  //#region SearchShipmentsResponseDTO

  [<CLIMutable>]
  type SearchShipmentsResponseDTO = {
    [<JsonProperty(PropertyName = "shipments")>]
    Shipments : ShipmentInfoDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
