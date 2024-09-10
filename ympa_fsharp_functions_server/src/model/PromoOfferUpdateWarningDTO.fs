namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PromoOfferUpdateWarningCodeType

module PromoOfferUpdateWarningDTO =

  //#region PromoOfferUpdateWarningDTO

  [<CLIMutable>]
  type PromoOfferUpdateWarningDTO = {
    [<JsonProperty(PropertyName = "code")>]
    Code : PromoOfferUpdateWarningCodeType;
    [<JsonProperty(PropertyName = "campaignIds")>]
    CampaignIds : int64[];
  }

  //#endregion
