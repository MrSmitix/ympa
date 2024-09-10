namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.PriceDTO

module OfferPriceDTO =

  //#region OfferPriceDTO

  [<CLIMutable>]
  type OfferPriceDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "price")>]
    Price : PriceDTO;
  }

  //#endregion
