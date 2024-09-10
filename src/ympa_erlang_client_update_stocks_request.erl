-module(ympa_erlang_client_update_stocks_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_stocks_request/0]).

-type ympa_erlang_client_update_stocks_request() ::
    #{ 'skus' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'skus' := Skus
        }) ->
    #{ 'skus' => Skus
     }.
