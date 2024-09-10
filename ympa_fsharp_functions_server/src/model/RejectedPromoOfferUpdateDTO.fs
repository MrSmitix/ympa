namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.RejectedPromoOfferUpdateReasonType

module RejectedPromoOfferUpdateDTO =

  //#region RejectedPromoOfferUpdateDTO

  [<CLIMutable>]
  type RejectedPromoOfferUpdateDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "reason")>]
    Reason : RejectedPromoOfferUpdateReasonType;
  }

  //#endregion
