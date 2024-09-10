namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_functions_server.Model.GetChatInfoDTO

module GetChatsInfoDTO =

  //#region GetChatsInfoDTO

  [<CLIMutable>]
  type GetChatsInfoDTO = {
    [<JsonProperty(PropertyName = "chats")>]
    Chats : GetChatInfoDTO[];
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ForwardScrollingPagerDTO;
  }

  //#endregion
