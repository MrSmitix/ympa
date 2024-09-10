-module(ympa_erlang_proper_client_delete_offers_from_archive_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_delete_offers_from_archive_dto/0]).

-export([ympa_erlang_proper_client_delete_offers_from_archive_dto/1]).

-export_type([ympa_erlang_proper_client_delete_offers_from_archive_dto/0]).

-type ympa_erlang_proper_client_delete_offers_from_archive_dto() ::
  [ {'notUnarchivedOfferIds', list(binary()) }
  ].


ympa_erlang_proper_client_delete_offers_from_archive_dto() ->
    ympa_erlang_proper_client_delete_offers_from_archive_dto([]).

ympa_erlang_proper_client_delete_offers_from_archive_dto(Fields) ->
  Default = [ {'notUnarchivedOfferIds', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

