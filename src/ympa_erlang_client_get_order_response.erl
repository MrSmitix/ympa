-module(ympa_erlang_client_get_order_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_order_response/0]).

-type ympa_erlang_client_get_order_response() ::
    #{ 'order' => ympa_erlang_client_order_dto:ympa_erlang_client_order_dto()
     }.

encode(#{ 'order' := Order
        }) ->
    #{ 'order' => Order
     }.
