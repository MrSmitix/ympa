-module(ympa_erlang_client_update_order_status_response).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_status_response/0]).

-type ympa_erlang_client_update_order_status_response() ::
    #{ 'order' => ympa_erlang_client_order_dto:ympa_erlang_client_order_dto()
     }.

encode(#{ 'order' := Order
        }) ->
    #{ 'order' => Order
     }.
