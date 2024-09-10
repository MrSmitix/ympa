namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module PalletsCountDTO =

  //#region PalletsCountDTO


  type PalletsCountDTO = {
    Planned : int;
    Fact : int;
  }
  //#endregion
