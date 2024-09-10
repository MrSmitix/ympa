namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PromoOfferUpdateWarningDTO

module WarningPromoOfferUpdateDTO =

  //#region WarningPromoOfferUpdateDTO

  [<CLIMutable>]
  type WarningPromoOfferUpdateDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : PromoOfferUpdateWarningDTO[];
  }

  //#endregion
