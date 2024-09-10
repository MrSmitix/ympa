namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AddOffersToArchiveErrorType

module AddOffersToArchiveErrorDTO =

  //#region AddOffersToArchiveErrorDTO

  [<CLIMutable>]
  type AddOffersToArchiveErrorDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "error")>]
    Error : AddOffersToArchiveErrorType;
  }

  //#endregion
