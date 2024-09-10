namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RejectedPromoOfferDeleteDTO

module DeletePromoOffersResultDTO =

  //#region DeletePromoOffersResultDTO

  [<CLIMutable>]
  type DeletePromoOffersResultDTO = {
    [<JsonProperty(PropertyName = "rejectedOffers")>]
    RejectedOffers : RejectedPromoOfferDeleteDTO[];
  }

  //#endregion
