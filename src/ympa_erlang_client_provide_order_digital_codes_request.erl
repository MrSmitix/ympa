-module(ympa_erlang_client_provide_order_digital_codes_request).

-export([encode/1]).

-export_type([ympa_erlang_client_provide_order_digital_codes_request/0]).

-type ympa_erlang_client_provide_order_digital_codes_request() ::
    #{ 'items' := list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
