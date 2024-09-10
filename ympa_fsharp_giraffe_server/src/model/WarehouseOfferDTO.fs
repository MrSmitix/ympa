namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.TurnoverDTO
open ympa_fsharp_giraffe_server.Model.WarehouseStockDTO

module WarehouseOfferDTO =

  //#region WarehouseOfferDTO


  type WarehouseOfferDTO = {
    OfferId : string;
    TurnoverSummary : TurnoverDTO;
    Stocks : WarehouseStockDTO[];
    UpdatedAt : Nullable<DateTime>;
  }
  //#endregion
