namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.GetPromoDTO

module GetPromosResultDTO =

  //#region GetPromosResultDTO


  type GetPromosResultDTO = {
    Promos : GetPromoDTO[];
  }
  //#endregion
