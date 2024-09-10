-module(ympa_erlang_client_delete_offers_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_offers_dto/0]).

-type ympa_erlang_client_delete_offers_dto() ::
    #{ 'notDeletedOfferIds' => list()
     }.

encode(#{ 'notDeletedOfferIds' := NotDeletedOfferIds
        }) ->
    #{ 'notDeletedOfferIds' => NotDeletedOfferIds
     }.
