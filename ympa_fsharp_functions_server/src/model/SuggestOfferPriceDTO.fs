namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SuggestOfferPriceDTO =

  //#region SuggestOfferPriceDTO

  [<CLIMutable>]
  type SuggestOfferPriceDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "marketSku")>]
    MarketSku : int64;
  }

  //#endregion
