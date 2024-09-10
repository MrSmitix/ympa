namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FeedPublicationFullDTO
open ympa_fsharp_functions_server.Model.FeedPublicationPriceAndStockUpdateDTO
open ympa_fsharp_functions_server.Model.FeedStatusType

module FeedPublicationDTO =

  //#region FeedPublicationDTO

  [<CLIMutable>]
  type FeedPublicationDTO = {
    [<JsonProperty(PropertyName = "status")>]
    Status : FeedStatusType;
    [<JsonProperty(PropertyName = "full")>]
    Full : FeedPublicationFullDTO;
    [<JsonProperty(PropertyName = "priceAndStockUpdate")>]
    PriceAndStockUpdate : FeedPublicationPriceAndStockUpdateDTO;
  }

  //#endregion
