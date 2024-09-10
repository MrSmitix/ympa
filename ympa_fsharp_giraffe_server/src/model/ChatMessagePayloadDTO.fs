namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ChatMessagePayloadDTO =

  //#region ChatMessagePayloadDTO


  type ChatMessagePayloadDTO = {
    Name : string;
    Url : string;
    Size : int;
  }
  //#endregion
