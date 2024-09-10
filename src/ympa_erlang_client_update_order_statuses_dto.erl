-module(ympa_erlang_client_update_order_statuses_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_statuses_dto/0]).

-type ympa_erlang_client_update_order_statuses_dto() ::
    #{ 'orders' := list()
     }.

encode(#{ 'orders' := Orders
        }) ->
    #{ 'orders' => Orders
     }.
