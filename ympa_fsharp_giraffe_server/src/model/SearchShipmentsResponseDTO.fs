namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.ShipmentInfoDTO

module SearchShipmentsResponseDTO =

  //#region SearchShipmentsResponseDTO


  type SearchShipmentsResponseDTO = {
    Shipments : ShipmentInfoDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
