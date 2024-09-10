namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ChatMessageDTO
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO

module ChatMessagesResultDTO =

  //#region ChatMessagesResultDTO

  [<CLIMutable>]
  type ChatMessagesResultDTO = {
    [<JsonProperty(PropertyName = "orderId")>]
    OrderId : int64;
    [<JsonProperty(PropertyName = "messages")>]
    Messages : ChatMessageDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
