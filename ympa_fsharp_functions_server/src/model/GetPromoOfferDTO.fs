namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PromoOfferAutoParticipatingDetailsDTO
open ympa_fsharp_functions_server.Model.PromoOfferParamsDTO
open ympa_fsharp_functions_server.Model.PromoOfferParticipationStatusType

module GetPromoOfferDTO =

  //#region GetPromoOfferDTO

  [<CLIMutable>]
  type GetPromoOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : PromoOfferParticipationStatusType;
    [<JsonProperty(PropertyName = "params")>]
    Params : PromoOfferParamsDTO;
    [<JsonProperty(PropertyName = "autoParticipatingDetails")>]
    AutoParticipatingDetails : PromoOfferAutoParticipatingDetailsDTO;
  }

  //#endregion
