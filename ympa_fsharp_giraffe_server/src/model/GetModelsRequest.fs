namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetModelsRequest =

  //#region GetModelsRequest


  type GetModelsRequest = {
    Models : int64[];
  }
  //#endregion
