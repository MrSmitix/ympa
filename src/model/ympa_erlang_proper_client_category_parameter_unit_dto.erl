-module(ympa_erlang_proper_client_category_parameter_unit_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_category_parameter_unit_dto/0]).

-export([ympa_erlang_proper_client_category_parameter_unit_dto/1]).

-export_type([ympa_erlang_proper_client_category_parameter_unit_dto/0]).

-type ympa_erlang_proper_client_category_parameter_unit_dto() ::
  [ {'defaultUnitId', integer() }
  | {'units', list(ympa_erlang_proper_client_unit_dto:ympa_erlang_proper_client_unit_dto()) }
  ].


ympa_erlang_proper_client_category_parameter_unit_dto() ->
    ympa_erlang_proper_client_category_parameter_unit_dto([]).

ympa_erlang_proper_client_category_parameter_unit_dto(Fields) ->
  Default = [ {'defaultUnitId', integer() }
            , {'units', list(ympa_erlang_proper_client_unit_dto:ympa_erlang_proper_client_unit_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

