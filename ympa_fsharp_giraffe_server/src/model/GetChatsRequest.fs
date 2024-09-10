namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ChatStatusType
open ympa_fsharp_giraffe_server.Model.ChatType

module GetChatsRequest =

  //#region GetChatsRequest


  type GetChatsRequest = {
    OrderIds : int64[];
    Types : ChatType[];
    Statuses : ChatStatusType[];
  }
  //#endregion
