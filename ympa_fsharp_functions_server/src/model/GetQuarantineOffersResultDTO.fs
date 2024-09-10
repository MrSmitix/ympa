namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.QuarantineOfferDTO
open ympa_fsharp_functions_server.Model.ScrollingPagerDTO

module GetQuarantineOffersResultDTO =

  //#region GetQuarantineOffersResultDTO

  [<CLIMutable>]
  type GetQuarantineOffersResultDTO = {
    [<JsonProperty(PropertyName = "paging")>]
    Paging : ScrollingPagerDTO;
    [<JsonProperty(PropertyName = "offers")>]
    Offers : QuarantineOfferDTO[];
  }

  //#endregion
