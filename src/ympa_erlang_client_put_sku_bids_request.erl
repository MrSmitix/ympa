-module(ympa_erlang_client_put_sku_bids_request).

-export([encode/1]).

-export_type([ympa_erlang_client_put_sku_bids_request/0]).

-type ympa_erlang_client_put_sku_bids_request() ::
    #{ 'bids' := list()
     }.

encode(#{ 'bids' := Bids
        }) ->
    #{ 'bids' => Bids
     }.
