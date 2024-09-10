namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetChatHistoryRequest =

  //#region GetChatHistoryRequest


  type GetChatHistoryRequest = {
    MessageIdFrom : int64;
  }
  //#endregion
