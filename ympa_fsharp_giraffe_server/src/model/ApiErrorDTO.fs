namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module ApiErrorDTO =

  //#region ApiErrorDTO


  type ApiErrorDTO = {
    Code : string;
    Message : string;
  }
  //#endregion
