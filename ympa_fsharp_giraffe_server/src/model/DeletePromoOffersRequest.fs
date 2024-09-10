namespace ympa_fsharp_giraffe_server.Model

open System
open System.Collections.Generic

module DeletePromoOffersRequest =

  //#region DeletePromoOffersRequest


  type DeletePromoOffersRequest = {
    PromoId : string;
    DeleteAllOffers : bool;
    OfferIds : string[];
  }
  //#endregion
