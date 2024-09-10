namespace ympa_fsharp_functions_server.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PriceSuggestType =

  //#region PriceSuggestType

  let BUYBOXEnum = "BUYBOX"
  let DEFAULTOFFEREnum = "DEFAULT_OFFER"
  let MINPRICEMARKETEnum = "MIN_PRICE_MARKET"
  type PriceSuggestType = string

  //#endregion
