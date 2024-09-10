-module(ympa_erlang_proper_client_age_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_age_dto/0]).

-export([ympa_erlang_proper_client_age_dto/1]).

-export_type([ympa_erlang_proper_client_age_dto/0]).

-type ympa_erlang_proper_client_age_dto() ::
  [ {'value', integer() }
  | {'ageUnit', ympa_erlang_proper_client_age_unit_type:ympa_erlang_proper_client_age_unit_type() }
  ].


ympa_erlang_proper_client_age_dto() ->
    ympa_erlang_proper_client_age_dto([]).

ympa_erlang_proper_client_age_dto(Fields) ->
  Default = [ {'value', integer() }
            , {'ageUnit', ympa_erlang_proper_client_age_unit_type:ympa_erlang_proper_client_age_unit_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

