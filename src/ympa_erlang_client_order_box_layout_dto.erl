-module(ympa_erlang_client_order_box_layout_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_box_layout_dto/0]).

-type ympa_erlang_client_order_box_layout_dto() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
