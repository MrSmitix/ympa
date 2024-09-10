namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.OrderBoxLayoutItemDTO

module OrderBoxLayoutDTO =

  //#region OrderBoxLayoutDTO


  type OrderBoxLayoutDTO = {
    Items : OrderBoxLayoutItemDTO[];
  }
  //#endregion
