namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.WarehouseOfferDTO

module WarehouseOffersDTO =

  //#region WarehouseOffersDTO


  type WarehouseOffersDTO = {
    WarehouseId : int64;
    Offers : WarehouseOfferDTO[];
  }
  //#endregion
