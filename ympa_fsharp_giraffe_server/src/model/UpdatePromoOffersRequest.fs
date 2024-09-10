namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic
open ympa_fsharp_giraffe_server.Model.UpdatePromoOfferDTO

module UpdatePromoOffersRequest =

  //#region UpdatePromoOffersRequest


  type UpdatePromoOffersRequest = {
    PromoId : string;
    Offers : UpdatePromoOfferDTO[];
  }
  //#endregion
