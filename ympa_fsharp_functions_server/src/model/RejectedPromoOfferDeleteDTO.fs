namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RejectedPromoOfferDeleteReasonType

module RejectedPromoOfferDeleteDTO =

  //#region RejectedPromoOfferDeleteDTO

  [<CLIMutable>]
  type RejectedPromoOfferDeleteDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : RejectedPromoOfferDeleteReasonType;
  }

  //#endregion
