-module(ympa_erlang_client_set_order_shipment_boxes_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_order_shipment_boxes_request/0]).

-type ympa_erlang_client_set_order_shipment_boxes_request() ::
    #{ 'boxes' := list()
     }.

encode(#{ 'boxes' := Boxes
        }) ->
    #{ 'boxes' => Boxes
     }.
