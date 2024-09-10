-module(ympa_erlang_proper_client_time_period_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_time_period_dto/0]).

-export([ympa_erlang_proper_client_time_period_dto/1]).

-export_type([ympa_erlang_proper_client_time_period_dto/0]).

-type ympa_erlang_proper_client_time_period_dto() ::
  [ {'timePeriod', integer() }
  | {'timeUnit', ympa_erlang_proper_client_time_unit_type:ympa_erlang_proper_client_time_unit_type() }
  | {'comment', binary() }
  ].


ympa_erlang_proper_client_time_period_dto() ->
    ympa_erlang_proper_client_time_period_dto([]).

ympa_erlang_proper_client_time_period_dto(Fields) ->
  Default = [ {'timePeriod', integer() }
            , {'timeUnit', ympa_erlang_proper_client_time_unit_type:ympa_erlang_proper_client_time_unit_type() }
            , {'comment', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

