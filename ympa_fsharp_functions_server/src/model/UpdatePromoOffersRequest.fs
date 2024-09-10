namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdatePromoOfferDTO

module UpdatePromoOffersRequest =

  //#region UpdatePromoOffersRequest

  [<CLIMutable>]
  type UpdatePromoOffersRequest = {
    [<JsonProperty(PropertyName = "promoId")>]
    PromoId : string;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : UpdatePromoOfferDTO[];
  }

  //#endregion
