-module(ympa_erlang_client_set_order_delivery_date_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_order_delivery_date_request/0]).

-type ympa_erlang_client_set_order_delivery_date_request() ::
    #{ 'dates' := ympa_erlang_client_order_delivery_date_dto:ympa_erlang_client_order_delivery_date_dto(),
       'reason' := ympa_erlang_client_order_delivery_date_reason_type:ympa_erlang_client_order_delivery_date_reason_type()
     }.

encode(#{ 'dates' := Dates,
          'reason' := Reason
        }) ->
    #{ 'dates' => Dates,
       'reason' => Reason
     }.
