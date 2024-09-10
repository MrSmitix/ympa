namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ReturnInstanceStatusType
open ympa_fsharp_functions_server.Model.ReturnInstanceStockType

module ReturnInstanceDTO =

  //#region ReturnInstanceDTO

  [<CLIMutable>]
  type ReturnInstanceDTO = {
    [<JsonProperty(PropertyName = "stockType")>]
    StockType : ReturnInstanceStockType;
    [<JsonProperty(PropertyName = "status")>]
    Status : ReturnInstanceStatusType;
    [<JsonProperty(PropertyName = "cis")>]
    Cis : string;
    [<JsonProperty(PropertyName = "imei")>]
    Imei : string;
  }

  //#endregion
