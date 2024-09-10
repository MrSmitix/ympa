namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO
open ympa_fsharp_giraffe_server.Model.GetChatInfoDTO

module GetChatsInfoDTO =

  //#region GetChatsInfoDTO


  type GetChatsInfoDTO = {
    Chats : GetChatInfoDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
