namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open ympa_fsharp_giraffe_server.OrdersApiHandler
open ympa_fsharp_giraffe_server.OrdersApiHandlerParams

module OrdersApiHandlerTestsHelper =


  let mutable AcceptOrderCancellationExamples = Map.empty
  let mutable AcceptOrderCancellationBody = ""

  AcceptOrderCancellationBody <- WebUtility.HtmlDecode "{
  &quot;reason&quot; : &quot;ORDER_DELIVERED&quot;,
  &quot;accepted&quot; : true
}"
  AcceptOrderCancellationExamples <- AcceptOrderCancellationExamples.Add("application/json", AcceptOrderCancellationBody)

  let getAcceptOrderCancellationExample mediaType =
    AcceptOrderCancellationExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()


  let mutable ProvideOrderDigitalCodesExamples = Map.empty
  let mutable ProvideOrderDigitalCodesBody = ""

  ProvideOrderDigitalCodesBody <- WebUtility.HtmlDecode "{
  &quot;items&quot; : [ {
    &quot;activate_till&quot; : &quot;2000-01-23&quot;,
    &quot;code&quot; : &quot;code&quot;,
    &quot;slip&quot; : &quot;slip&quot;,
    &quot;id&quot; : 0
  }, {
    &quot;activate_till&quot; : &quot;2000-01-23&quot;,
    &quot;code&quot; : &quot;code&quot;,
    &quot;slip&quot; : &quot;slip&quot;,
    &quot;id&quot; : 0
  } ]
}"
  ProvideOrderDigitalCodesExamples <- ProvideOrderDigitalCodesExamples.Add("application/json", ProvideOrderDigitalCodesBody)

  let getProvideOrderDigitalCodesExample mediaType =
    ProvideOrderDigitalCodesExamples.[mediaType]
      |> getConverter mediaType

  let mutable ProvideOrderItemIdentifiersExamples = Map.empty
  let mutable ProvideOrderItemIdentifiersBody = ""

  ProvideOrderItemIdentifiersBody <- WebUtility.HtmlDecode "{
  &quot;items&quot; : [ {
    &quot;instances&quot; : [ {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    }, {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    } ],
    &quot;id&quot; : 0
  }, {
    &quot;instances&quot; : [ {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    }, {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    } ],
    &quot;id&quot; : 0
  } ]
}"
  ProvideOrderItemIdentifiersExamples <- ProvideOrderItemIdentifiersExamples.Add("application/json", ProvideOrderItemIdentifiersBody)

  let getProvideOrderItemIdentifiersExample mediaType =
    ProvideOrderItemIdentifiersExamples.[mediaType]
      |> getConverter mediaType

  let mutable SetOrderBoxLayoutExamples = Map.empty
  let mutable SetOrderBoxLayoutBody = ""

  SetOrderBoxLayoutBody <- WebUtility.HtmlDecode "{
  &quot;boxes&quot; : [ {
    &quot;items&quot; : [ {
      &quot;partialCount&quot; : {
        &quot;current&quot; : 1,
        &quot;total&quot; : 2
      },
      &quot;instances&quot; : [ {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      }, {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      } ],
      &quot;id&quot; : 0,
      &quot;fullCount&quot; : 1
    }, {
      &quot;partialCount&quot; : {
        &quot;current&quot; : 1,
        &quot;total&quot; : 2
      },
      &quot;instances&quot; : [ {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      }, {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      } ],
      &quot;id&quot; : 0,
      &quot;fullCount&quot; : 1
    } ]
  }, {
    &quot;items&quot; : [ {
      &quot;partialCount&quot; : {
        &quot;current&quot; : 1,
        &quot;total&quot; : 2
      },
      &quot;instances&quot; : [ {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      }, {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      } ],
      &quot;id&quot; : 0,
      &quot;fullCount&quot; : 1
    }, {
      &quot;partialCount&quot; : {
        &quot;current&quot; : 1,
        &quot;total&quot; : 2
      },
      &quot;instances&quot; : [ {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      }, {
        &quot;rnpt&quot; : &quot;rnpt&quot;,
        &quot;gtd&quot; : &quot;gtd&quot;,
        &quot;uin&quot; : &quot;uin&quot;,
        &quot;cis&quot; : &quot;cis&quot;
      } ],
      &quot;id&quot; : 0,
      &quot;fullCount&quot; : 1
    } ]
  } ],
  &quot;allowRemove&quot; : false
}"
  SetOrderBoxLayoutExamples <- SetOrderBoxLayoutExamples.Add("application/json", SetOrderBoxLayoutBody)

  let getSetOrderBoxLayoutExample mediaType =
    SetOrderBoxLayoutExamples.[mediaType]
      |> getConverter mediaType

  let mutable SetOrderShipmentBoxesExamples = Map.empty
  let mutable SetOrderShipmentBoxesBody = ""

  SetOrderShipmentBoxesBody <- WebUtility.HtmlDecode "{
  &quot;boxes&quot; : [ {
    &quot;fulfilmentId&quot; : &quot;fulfilmentId&quot;,
    &quot;id&quot; : 0
  }, {
    &quot;fulfilmentId&quot; : &quot;fulfilmentId&quot;,
    &quot;id&quot; : 0
  } ]
}"
  SetOrderShipmentBoxesExamples <- SetOrderShipmentBoxesExamples.Add("application/json", SetOrderShipmentBoxesBody)

  let getSetOrderShipmentBoxesExample mediaType =
    SetOrderShipmentBoxesExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOrderItemsExamples = Map.empty
  let mutable UpdateOrderItemsBody = ""

  UpdateOrderItemsBody <- WebUtility.HtmlDecode "{
  &quot;reason&quot; : &quot;PARTNER_REQUESTED_REMOVE&quot;,
  &quot;items&quot; : [ {
    &quot;instances&quot; : [ {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    }, {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    } ],
    &quot;count&quot; : 0,
    &quot;id&quot; : 0
  }, {
    &quot;instances&quot; : [ {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    }, {
      &quot;rnpt&quot; : &quot;rnpt&quot;,
      &quot;gtd&quot; : &quot;gtd&quot;,
      &quot;uin&quot; : &quot;uin&quot;,
      &quot;cis&quot; : &quot;cis&quot;
    } ],
    &quot;count&quot; : 0,
    &quot;id&quot; : 0
  } ]
}"
  UpdateOrderItemsExamples <- UpdateOrderItemsExamples.Add("application/json", UpdateOrderItemsBody)

  let getUpdateOrderItemsExample mediaType =
    UpdateOrderItemsExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOrderStatusExamples = Map.empty
  let mutable UpdateOrderStatusBody = ""

  UpdateOrderStatusBody <- WebUtility.HtmlDecode "{
  &quot;order&quot; : {
    &quot;delivery&quot; : {
      &quot;dates&quot; : {
        &quot;realDeliveryDate&quot; : &quot;2000-01-23&quot;
      }
    },
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;status&quot; : &quot;PLACING&quot;
  }
}"
  UpdateOrderStatusExamples <- UpdateOrderStatusExamples.Add("application/json", UpdateOrderStatusBody)

  let getUpdateOrderStatusExample mediaType =
    UpdateOrderStatusExamples.[mediaType]
      |> getConverter mediaType

  let mutable UpdateOrderStatusesExamples = Map.empty
  let mutable UpdateOrderStatusesBody = ""

  UpdateOrderStatusesBody <- WebUtility.HtmlDecode "{
  &quot;orders&quot; : [ {
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;id&quot; : 0,
    &quot;status&quot; : &quot;PLACING&quot;
  }, {
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;id&quot; : 0,
    &quot;status&quot; : &quot;PLACING&quot;
  }, {
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;id&quot; : 0,
    &quot;status&quot; : &quot;PLACING&quot;
  }, {
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;id&quot; : 0,
    &quot;status&quot; : &quot;PLACING&quot;
  }, {
    &quot;substatus&quot; : &quot;RESERVATION_EXPIRED&quot;,
    &quot;id&quot; : 0,
    &quot;status&quot; : &quot;PLACING&quot;
  } ]
}"
  UpdateOrderStatusesExamples <- UpdateOrderStatusesExamples.Add("application/json", UpdateOrderStatusesBody)

  let getUpdateOrderStatusesExample mediaType =
    UpdateOrderStatusesExamples.[mediaType]
      |> getConverter mediaType
