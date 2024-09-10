-module(ympa_erlang_client_get_prices_by_offer_ids_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_prices_by_offer_ids_request/0]).

-type ympa_erlang_client_get_prices_by_offer_ids_request() ::
    #{ 'offerIds' => list()
     }.

encode(#{ 'offerIds' := OfferIds
        }) ->
    #{ 'offerIds' => OfferIds
     }.
