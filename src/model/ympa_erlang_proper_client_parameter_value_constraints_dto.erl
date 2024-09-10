-module(ympa_erlang_proper_client_parameter_value_constraints_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_parameter_value_constraints_dto/0]).

-export([ympa_erlang_proper_client_parameter_value_constraints_dto/1]).

-export_type([ympa_erlang_proper_client_parameter_value_constraints_dto/0]).

-type ympa_erlang_proper_client_parameter_value_constraints_dto() ::
  [ {'minValue', float() }
  | {'maxValue', float() }
  | {'maxLength', integer() }
  ].


ympa_erlang_proper_client_parameter_value_constraints_dto() ->
    ympa_erlang_proper_client_parameter_value_constraints_dto([]).

ympa_erlang_proper_client_parameter_value_constraints_dto(Fields) ->
  Default = [ {'minValue', float() }
            , {'maxValue', float() }
            , {'maxLength', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

