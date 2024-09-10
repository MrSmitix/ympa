-module(ympa_erlang_client_shipment_boxes_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_shipment_boxes_dto/0]).

-type ympa_erlang_client_shipment_boxes_dto() ::
    #{ 'boxes' := list()
     }.

encode(#{ 'boxes' := Boxes
        }) ->
    #{ 'boxes' => Boxes
     }.
