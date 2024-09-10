namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.OrderItemStatusType

module OrderItemDetailDTO =

  //#region OrderItemDetailDTO

  [<CLIMutable>]
  type OrderItemDetailDTO = {
    [<JsonProperty(PropertyName = "itemCount")>]
    ItemCount : int64;
    [<JsonProperty(PropertyName = "itemStatus")>]
    ItemStatus : OrderItemStatusType;
    [<JsonProperty(PropertyName = "updateDate")>]
    UpdateDate : string;
  }

  //#endregion
