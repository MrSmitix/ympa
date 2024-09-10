namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ChatMessageDTO
open ympa_fsharp_giraffe_server.Model.ForwardScrollingPagerDTO

module ChatMessagesResultDTO =

  //#region ChatMessagesResultDTO


  type ChatMessagesResultDTO = {
    OrderId : int64;
    Messages : ChatMessageDTO[];
    Paging : ForwardScrollingPagerDTO;
  }
  //#endregion
