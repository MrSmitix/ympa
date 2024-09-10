namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module UpdateStockItemDTO =

  //#region UpdateStockItemDTO


  type UpdateStockItemDTO = {
    Count : int64;
    UpdatedAt : Nullable<DateTime>;
  }
  //#endregion
