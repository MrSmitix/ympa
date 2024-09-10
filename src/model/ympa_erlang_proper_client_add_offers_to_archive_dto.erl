-module(ympa_erlang_proper_client_add_offers_to_archive_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_add_offers_to_archive_dto/0]).

-export([ympa_erlang_proper_client_add_offers_to_archive_dto/1]).

-export_type([ympa_erlang_proper_client_add_offers_to_archive_dto/0]).

-type ympa_erlang_proper_client_add_offers_to_archive_dto() ::
  [ {'notArchivedOffers', list(ympa_erlang_proper_client_add_offers_to_archive_error_dto:ympa_erlang_proper_client_add_offers_to_archive_error_dto()) }
  ].


ympa_erlang_proper_client_add_offers_to_archive_dto() ->
    ympa_erlang_proper_client_add_offers_to_archive_dto([]).

ympa_erlang_proper_client_add_offers_to_archive_dto(Fields) ->
  Default = [ {'notArchivedOffers', list(ympa_erlang_proper_client_add_offers_to_archive_error_dto:ympa_erlang_proper_client_add_offers_to_archive_error_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

