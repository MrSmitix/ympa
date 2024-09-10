-module(ympa_erlang_client_verify_order_eac_request).

-export([encode/1]).

-export_type([ympa_erlang_client_verify_order_eac_request/0]).

-type ympa_erlang_client_verify_order_eac_request() ::
    #{ 'code' => binary()
     }.

encode(#{ 'code' := Code
        }) ->
    #{ 'code' => Code
     }.
