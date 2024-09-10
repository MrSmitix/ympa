namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.GetOfferMappingDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module GetOfferMappingsResultDTO =

  //#region GetOfferMappingsResultDTO

  [<CLIMutable>]
  type GetOfferMappingsResultDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "offerMappings")>]
    OfferMappings : GetOfferMappingDTO[];
  }

  //#endregion
