namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoOfferPromocodeParamsDTO =

  //#region PromoOfferPromocodeParamsDTO

  [<CLIMutable>]
  type PromoOfferPromocodeParamsDTO = {
    [<JsonProperty(PropertyName = "maxPrice")>]
    MaxPrice : int64;
  }

  //#endregion
