-module(ympa_erlang_proper_client_turnover_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_turnover_dto/0]).

-export([ympa_erlang_proper_client_turnover_dto/1]).

-export_type([ympa_erlang_proper_client_turnover_dto/0]).

-type ympa_erlang_proper_client_turnover_dto() ::
  [ {'turnover', ympa_erlang_proper_client_turnover_type:ympa_erlang_proper_client_turnover_type() }
  | {'turnoverDays', float() }
  ].


ympa_erlang_proper_client_turnover_dto() ->
    ympa_erlang_proper_client_turnover_dto([]).

ympa_erlang_proper_client_turnover_dto(Fields) ->
  Default = [ {'turnover', ympa_erlang_proper_client_turnover_type:ympa_erlang_proper_client_turnover_type() }
            , {'turnoverDays', float() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

