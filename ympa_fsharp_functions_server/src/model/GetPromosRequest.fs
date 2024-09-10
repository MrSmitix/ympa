namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open ympa_fsharp_functions_server.Model.MechanicsType
open ympa_fsharp_functions_server.Model.PromoParticipationType

module GetPromosRequest =

  //#region GetPromosRequest

  [<CLIMutable>]
  type GetPromosRequest = {
    [<JsonProperty(PropertyName = "participation")>]
    Participation : PromoParticipationType;
    [<JsonProperty(PropertyName = "mechanics")>]
    Mechanics : MechanicsType;
  }

  //#endregion
