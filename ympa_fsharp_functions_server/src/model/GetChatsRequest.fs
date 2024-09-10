namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ChatStatusType
open ympa_fsharp_functions_server.Model.ChatType

module GetChatsRequest =

  //#region GetChatsRequest

  [<CLIMutable>]
  type GetChatsRequest = {
    [<JsonProperty(PropertyName = "orderIds")>]
    OrderIds : int64[];
    [<JsonProperty(PropertyName = "types")>]
    Types : ChatType[];
    [<JsonProperty(PropertyName = "statuses")>]
    Statuses : ChatStatusType[];
  }

  //#endregion
