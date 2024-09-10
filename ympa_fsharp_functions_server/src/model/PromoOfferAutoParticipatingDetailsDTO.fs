namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoOfferAutoParticipatingDetailsDTO =

  //#region PromoOfferAutoParticipatingDetailsDTO

  [<CLIMutable>]
  type PromoOfferAutoParticipatingDetailsDTO = {
    [<JsonProperty(PropertyName = "campaignIds")>]
    CampaignIds : int64[];
  }

  //#endregion
