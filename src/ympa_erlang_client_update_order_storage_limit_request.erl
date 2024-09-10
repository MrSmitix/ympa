-module(ympa_erlang_client_update_order_storage_limit_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_order_storage_limit_request/0]).

-type ympa_erlang_client_update_order_storage_limit_request() ::
    #{ 'newDate' := calendar:date()
     }.

encode(#{ 'newDate' := NewDate
        }) ->
    #{ 'newDate' => NewDate
     }.
