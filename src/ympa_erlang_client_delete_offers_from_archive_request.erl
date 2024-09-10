-module(ympa_erlang_client_delete_offers_from_archive_request).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_offers_from_archive_request/0]).

-type ympa_erlang_client_delete_offers_from_archive_request() ::
    #{ 'offerIds' := list()
     }.

encode(#{ 'offerIds' := OfferIds
        }) ->
    #{ 'offerIds' => OfferIds
     }.
