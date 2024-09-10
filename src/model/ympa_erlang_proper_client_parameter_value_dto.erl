-module(ympa_erlang_proper_client_parameter_value_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_parameter_value_dto/0]).

-export([ympa_erlang_proper_client_parameter_value_dto/1]).

-export_type([ympa_erlang_proper_client_parameter_value_dto/0]).

-type ympa_erlang_proper_client_parameter_value_dto() ::
  [ {'parameterId', integer() }
  | {'unitId', integer() }
  | {'valueId', integer() }
  | {'value', binary() }
  ].


ympa_erlang_proper_client_parameter_value_dto() ->
    ympa_erlang_proper_client_parameter_value_dto([]).

ympa_erlang_proper_client_parameter_value_dto(Fields) ->
  Default = [ {'parameterId', integer() }
            , {'unitId', integer() }
            , {'valueId', integer() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

