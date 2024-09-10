namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderCourierDTO =

  //#region OrderCourierDTO

  [<CLIMutable>]
  type OrderCourierDTO = {
    [<JsonProperty(PropertyName = "fullName")>]
    FullName : string;
    [<JsonProperty(PropertyName = "phone")>]
    Phone : string;
    [<JsonProperty(PropertyName = "phoneExtension")>]
    PhoneExtension : string;
    [<JsonProperty(PropertyName = "vehicleNumber")>]
    VehicleNumber : string;
    [<JsonProperty(PropertyName = "vehicleDescription")>]
    VehicleDescription : string;
  }

  //#endregion
