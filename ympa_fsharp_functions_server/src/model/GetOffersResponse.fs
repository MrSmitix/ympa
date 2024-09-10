namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.FlippingPagerDTO
open ympa_fsharp_functions_server.Model.OfferDTO

module GetOffersResponse =

  //#region GetOffersResponse

  [<CLIMutable>]
  type GetOffersResponse = {
    [<JsonProperty(PropertyName = "offers")>]
    Offers : OfferDTO[];
    [<JsonProperty(PropertyName = "pager")>]
    Pager : FlippingPagerDTO;
  }

  //#endregion
