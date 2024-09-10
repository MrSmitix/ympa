namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PromoPeriodDTO =

  //#region PromoPeriodDTO

  [<CLIMutable>]
  type PromoPeriodDTO = {
    [<JsonProperty(PropertyName = "dateTimeFrom")>]
    DateTimeFrom : DateTime;
    [<JsonProperty(PropertyName = "dateTimeTo")>]
    DateTimeTo : DateTime;
  }

  //#endregion
