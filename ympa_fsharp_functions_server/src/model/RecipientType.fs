namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RecipientType =

  //#region RecipientType

  let SHOPEnum = "SHOP"
  let DELIVERYSERVICEEnum = "DELIVERY_SERVICE"
  let POSTEnum = "POST"
  type RecipientType = string

  //#endregion
