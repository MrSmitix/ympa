-module(ympa_erlang_client_update_order_status_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_status_request/0]).

-type ympa_erlang_client_update_order_status_request() ::
    #{ 'order' := ympa_erlang_client_order_status_change_dto:ympa_erlang_client_order_status_change_dto()
     }.

encode(#{ 'order' := Order
        }) ->
    #{ 'order' => Order
     }.
