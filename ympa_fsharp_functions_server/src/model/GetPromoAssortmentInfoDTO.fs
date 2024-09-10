namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module GetPromoAssortmentInfoDTO =

  //#region GetPromoAssortmentInfoDTO

  [<CLIMutable>]
  type GetPromoAssortmentInfoDTO = {
    [<JsonProperty(PropertyName = "activeOffers")>]
    ActiveOffers : int;
    [<JsonProperty(PropertyName = "potentialOffers")>]
    PotentialOffers : int;
    [<JsonProperty(PropertyName = "processing")>]
    Processing : bool;
  }

  //#endregion
