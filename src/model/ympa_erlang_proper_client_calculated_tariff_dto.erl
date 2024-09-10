-module(ympa_erlang_proper_client_calculated_tariff_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_calculated_tariff_dto/0]).

-export([ympa_erlang_proper_client_calculated_tariff_dto/1]).

-export_type([ympa_erlang_proper_client_calculated_tariff_dto/0]).

-type ympa_erlang_proper_client_calculated_tariff_dto() ::
  [ {'type', ympa_erlang_proper_client_calculated_tariff_type:ympa_erlang_proper_client_calculated_tariff_type() }
  | {'amount', integer() }
  | {'parameters', list(ympa_erlang_proper_client_tariff_parameter_dto:ympa_erlang_proper_client_tariff_parameter_dto()) }
  ].


ympa_erlang_proper_client_calculated_tariff_dto() ->
    ympa_erlang_proper_client_calculated_tariff_dto([]).

ympa_erlang_proper_client_calculated_tariff_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_calculated_tariff_type:ympa_erlang_proper_client_calculated_tariff_type() }
            , {'amount', integer() }
            , {'parameters', list(ympa_erlang_proper_client_tariff_parameter_dto:ympa_erlang_proper_client_tariff_parameter_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

