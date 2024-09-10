-module(ympa_erlang_client_delete_offers_from_archive_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_offers_from_archive_dto/0]).

-type ympa_erlang_client_delete_offers_from_archive_dto() ::
    #{ 'notUnarchivedOfferIds' => list()
     }.

encode(#{ 'notUnarchivedOfferIds' := NotUnarchivedOfferIds
        }) ->
    #{ 'notUnarchivedOfferIds' => NotUnarchivedOfferIds
     }.
