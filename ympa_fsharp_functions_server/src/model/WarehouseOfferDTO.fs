namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.TurnoverDTO
open ympa_fsharp_functions_server.Model.WarehouseStockDTO

module WarehouseOfferDTO =

  //#region WarehouseOfferDTO

  [<CLIMutable>]
  type WarehouseOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "turnoverSummary")>]
    TurnoverSummary : TurnoverDTO;
    [<JsonProperty(PropertyName = "stocks")>]
    Stocks : WarehouseStockDTO[];
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : Nullable<DateTime>;
  }

  //#endregion
