-module(ympa_erlang_proper_client_add_offers_to_archive_error_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_add_offers_to_archive_error_dto/0]).

-export([ympa_erlang_proper_client_add_offers_to_archive_error_dto/1]).

-export_type([ympa_erlang_proper_client_add_offers_to_archive_error_dto/0]).

-type ympa_erlang_proper_client_add_offers_to_archive_error_dto() ::
  [ {'offerId', binary() }
  | {'error', ympa_erlang_proper_client_add_offers_to_archive_error_type:ympa_erlang_proper_client_add_offers_to_archive_error_type() }
  ].


ympa_erlang_proper_client_add_offers_to_archive_error_dto() ->
    ympa_erlang_proper_client_add_offers_to_archive_error_dto([]).

ympa_erlang_proper_client_add_offers_to_archive_error_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'error', ympa_erlang_proper_client_add_offers_to_archive_error_type:ympa_erlang_proper_client_add_offers_to_archive_error_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

