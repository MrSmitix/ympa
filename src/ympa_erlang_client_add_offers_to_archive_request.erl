-module(ympa_erlang_client_add_offers_to_archive_request).

-export([encode/1]).

-export_type([ympa_erlang_client_add_offers_to_archive_request/0]).

-type ympa_erlang_client_add_offers_to_archive_request() ::
    #{ 'offerIds' := list()
     }.

encode(#{ 'offerIds' := OfferIds
        }) ->
    #{ 'offerIds' => OfferIds
     }.
