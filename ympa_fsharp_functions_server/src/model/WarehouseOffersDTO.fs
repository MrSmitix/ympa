namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.WarehouseOfferDTO

module WarehouseOffersDTO =

  //#region WarehouseOffersDTO

  [<CLIMutable>]
  type WarehouseOffersDTO = {
    [<JsonProperty(PropertyName = "warehouseId")>]
    WarehouseId : int64;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : WarehouseOfferDTO[];
  }

  //#endregion
