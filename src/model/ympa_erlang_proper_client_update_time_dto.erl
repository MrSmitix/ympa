-module(ympa_erlang_proper_client_update_time_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_time_dto/0]).

-export([ympa_erlang_proper_client_update_time_dto/1]).

-export_type([ympa_erlang_proper_client_update_time_dto/0]).

-type ympa_erlang_proper_client_update_time_dto() ::
  [ {'updatedAt', datetime() }
  ].


ympa_erlang_proper_client_update_time_dto() ->
    ympa_erlang_proper_client_update_time_dto([]).

ympa_erlang_proper_client_update_time_dto(Fields) ->
  Default = [ {'updatedAt', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

