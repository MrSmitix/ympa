namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletePromoOffersRequest =

  //#region DeletePromoOffersRequest

  [<CLIMutable>]
  type DeletePromoOffersRequest = {
    [<JsonProperty(PropertyName = "promoId")>]
    PromoId : string;
    [<JsonProperty(PropertyName = "deleteAllOffers")>]
    DeleteAllOffers : bool;
    [<JsonProperty(PropertyName = "offerIds")>]
    OfferIds : string[];
  }

  //#endregion
