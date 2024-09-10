namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ReturnInstanceStatusType
open ympa_fsharp_giraffe_server.Model.ReturnInstanceStockType

module ReturnInstanceDTO =

  //#region ReturnInstanceDTO


  type ReturnInstanceDTO = {
    StockType : ReturnInstanceStockType;
    Status : ReturnInstanceStatusType;
    Cis : string;
    Imei : string;
  }
  //#endregion
