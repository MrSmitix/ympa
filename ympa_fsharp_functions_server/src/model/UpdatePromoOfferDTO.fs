namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.UpdatePromoOfferParamsDTO

module UpdatePromoOfferDTO =

  //#region UpdatePromoOfferDTO

  [<CLIMutable>]
  type UpdatePromoOfferDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "params")>]
    Params : UpdatePromoOfferParamsDTO;
  }

  //#endregion
