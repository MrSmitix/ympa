-module(ympa_erlang_client_update_order_statuses_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_statuses_request/0]).

-type ympa_erlang_client_update_order_statuses_request() ::
    #{ 'orders' := list()
     }.

encode(#{ 'orders' := Orders
        }) ->
    #{ 'orders' => Orders
     }.
