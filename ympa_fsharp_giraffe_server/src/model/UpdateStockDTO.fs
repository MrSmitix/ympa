namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdateStockItemDTO

module UpdateStockDTO =

  //#region UpdateStockDTO


  type UpdateStockDTO = {
    Sku : string;
    Items : UpdateStockItemDTO[];
  }
  //#endregion
