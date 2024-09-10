namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BriefOrderItemInstanceDTO

module OrderItemInstanceModificationDTO =

  //#region OrderItemInstanceModificationDTO

  [<CLIMutable>]
  type OrderItemInstanceModificationDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "instances")>]
    Instances : BriefOrderItemInstanceDTO[];
  }

  //#endregion
