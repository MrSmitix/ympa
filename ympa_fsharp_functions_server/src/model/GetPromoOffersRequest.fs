namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PromoOfferParticipationStatusFilterType

module GetPromoOffersRequest =

  //#region GetPromoOffersRequest

  [<CLIMutable>]
  type GetPromoOffersRequest = {
    [<JsonProperty(PropertyName = "promoId")>]
    PromoId : string;
    [<JsonProperty(PropertyName = "statusType")>]
    StatusType : PromoOfferParticipationStatusFilterType;
  }

  //#endregion
