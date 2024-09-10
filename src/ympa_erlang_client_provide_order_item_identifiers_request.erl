-module(ympa_erlang_client_provide_order_item_identifiers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_provide_order_item_identifiers_request/0]).

-type ympa_erlang_client_provide_order_item_identifiers_request() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
