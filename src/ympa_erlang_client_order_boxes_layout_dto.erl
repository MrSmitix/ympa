-module(ympa_erlang_client_order_boxes_layout_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_boxes_layout_dto/0]).

-type ympa_erlang_client_order_boxes_layout_dto() ::
    #{ 'boxes' := list()
     }.

encode(#{ 'boxes' := Boxes
        }) ->
    #{ 'boxes' => Boxes
     }.
