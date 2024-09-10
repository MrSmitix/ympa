-module(ympa_erlang_client_add_offers_to_archive_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_add_offers_to_archive_dto/0]).

-type ympa_erlang_client_add_offers_to_archive_dto() ::
    #{ 'notArchivedOffers' => list()
     }.

encode(#{ 'notArchivedOffers' := NotArchivedOffers
        }) ->
    #{ 'notArchivedOffers' => NotArchivedOffers
     }.
