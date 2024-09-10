namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdateOrderStatusDTO

module UpdateOrderStatusesDTO =

  //#region UpdateOrderStatusesDTO

  [<CLIMutable>]
  type UpdateOrderStatusesDTO = {
    [<JsonProperty(PropertyName = "orders")>]
    Orders : UpdateOrderStatusDTO[];
  }

  //#endregion
