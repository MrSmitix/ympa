namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.BriefOrderItemInstanceDTO
open ympa_fsharp_functions_server.Model.OrderBoxLayoutPartialCountDTO

module OrderBoxLayoutItemDTO =

  //#region OrderBoxLayoutItemDTO

  [<CLIMutable>]
  type OrderBoxLayoutItemDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "fullCount")>]
    FullCount : int;
    [<JsonProperty(PropertyName = "partialCount")>]
    PartialCount : OrderBoxLayoutPartialCountDTO;
    [<JsonProperty(PropertyName = "instances")>]
    Instances : BriefOrderItemInstanceDTO[];
  }

  //#endregion
