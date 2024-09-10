namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdatePromoOfferParamsDTO

module UpdatePromoOfferDTO =

  //#region UpdatePromoOfferDTO


  type UpdatePromoOfferDTO = {
    OfferId : string;
    Params : UpdatePromoOfferParamsDTO;
  }
  //#endregion
