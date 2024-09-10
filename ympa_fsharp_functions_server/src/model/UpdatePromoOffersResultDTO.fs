namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RejectedPromoOfferUpdateDTO
open ympa_fsharp_functions_server.Model.WarningPromoOfferUpdateDTO

module UpdatePromoOffersResultDTO =

  //#region UpdatePromoOffersResultDTO

  [<CLIMutable>]
  type UpdatePromoOffersResultDTO = {
    [<JsonProperty(PropertyName = "rejectedOffers")>]
    RejectedOffers : RejectedPromoOfferUpdateDTO[];
    [<JsonProperty(PropertyName = "warningOffers")>]
    WarningOffers : WarningPromoOfferUpdateDTO[];
  }

  //#endregion
