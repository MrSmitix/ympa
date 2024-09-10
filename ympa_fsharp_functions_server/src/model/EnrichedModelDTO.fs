namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ModelOfferDTO
open ympa_fsharp_functions_server.Model.ModelPriceDTO

module EnrichedModelDTO =

  //#region EnrichedModelDTO

  [<CLIMutable>]
  type EnrichedModelDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "prices")>]
    Prices : ModelPriceDTO;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : ModelOfferDTO[];
    [<JsonProperty(PropertyName = "offlineOffers")>]
    OfflineOffers : int;
    [<JsonProperty(PropertyName = "onlineOffers")>]
    OnlineOffers : int;
  }

  //#endregion
