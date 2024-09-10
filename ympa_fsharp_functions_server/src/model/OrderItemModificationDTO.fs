namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BriefOrderItemInstanceDTO

module OrderItemModificationDTO =

  //#region OrderItemModificationDTO

  [<CLIMutable>]
  type OrderItemModificationDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "count")>]
    Count : int;
    [<JsonProperty(PropertyName = "instances")>]
    Instances : BriefOrderItemInstanceDTO[];
  }

  //#endregion
