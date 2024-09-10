-module(ympa_erlang_client_get_bids_info_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_bids_info_request/0]).

-type ympa_erlang_client_get_bids_info_request() ::
    #{ 'skus' => list()
     }.

encode(#{ 'skus' := Skus
        }) ->
    #{ 'skus' => Skus
     }.
