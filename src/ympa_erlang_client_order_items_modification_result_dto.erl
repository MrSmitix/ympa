-module(ympa_erlang_client_order_items_modification_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_items_modification_result_dto/0]).

-type ympa_erlang_client_order_items_modification_result_dto() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
