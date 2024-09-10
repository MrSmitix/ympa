-module(ympa_erlang_client_confirm_prices_request).

-export([encode/1]).

-export_type([ympa_erlang_client_confirm_prices_request/0]).

-type ympa_erlang_client_confirm_prices_request() ::
    #{ 'offerIds' := list()
     }.

encode(#{ 'offerIds' := OfferIds
        }) ->
    #{ 'offerIds' => OfferIds
     }.
