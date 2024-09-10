namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderDigitalItemDTO =

  //#region OrderDigitalItemDTO

  [<CLIMutable>]
  type OrderDigitalItemDTO = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int64;
    [<JsonProperty(PropertyName = "code")>]
    Code : string;
    [<JsonProperty(PropertyName = "slip")>]
    Slip : string;
    [<JsonProperty(PropertyName = "activate_till")>]
    ActivateTill : DateTime;
  }

  //#endregion
