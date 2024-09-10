namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.AddOffersToArchiveErrorDTO

module AddOffersToArchiveDTO =

  //#region AddOffersToArchiveDTO

  [<CLIMutable>]
  type AddOffersToArchiveDTO = {
    [<JsonProperty(PropertyName = "notArchivedOffers")>]
    NotArchivedOffers : AddOffersToArchiveErrorDTO[];
  }

  //#endregion
