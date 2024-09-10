namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdateStockItemDTO =

  //#region UpdateStockItemDTO

  [<CLIMutable>]
  type UpdateStockItemDTO = {
    [<JsonProperty(PropertyName = "count")>]
    Count : int64;
    [<JsonProperty(PropertyName = "updatedAt")>]
    UpdatedAt : Nullable<DateTime>;
  }

  //#endregion
