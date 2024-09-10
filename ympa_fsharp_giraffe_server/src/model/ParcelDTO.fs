namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.ParcelBoxDTO

module ParcelDTO =

  //#region ParcelDTO


  type ParcelDTO = {
    Boxes : ParcelBoxDTO[];
  }
  //#endregion
