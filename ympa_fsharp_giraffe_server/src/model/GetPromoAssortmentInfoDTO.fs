namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module GetPromoAssortmentInfoDTO =

  //#region GetPromoAssortmentInfoDTO


  type GetPromoAssortmentInfoDTO = {
    ActiveOffers : int;
    PotentialOffers : int;
    Processing : bool;
  }
  //#endregion
