namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetPromoConstraintsDTO =

  //#region GetPromoConstraintsDTO

  [<CLIMutable>]
  type GetPromoConstraintsDTO = {
    [<JsonProperty(PropertyName = "warehouseIds")>]
    WarehouseIds : int64[];
  }

  //#endregion
