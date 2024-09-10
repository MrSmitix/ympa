namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.ParameterValueDTO

module OfferContentDTO =

  //#region OfferContentDTO

  [<CLIMutable>]
  type OfferContentDTO = {
    [<JsonProperty(PropertyName = "offerId")>]
    OfferId : string;
    [<JsonProperty(PropertyName = "categoryId")>]
    CategoryId : int;
    [<JsonProperty(PropertyName = "parameterValues")>]
    ParameterValues : ParameterValueDTO[];
  }

  //#endregion
