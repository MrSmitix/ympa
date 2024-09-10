-module(ympa_erlang_proper_client_tariff_parameter_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_tariff_parameter_dto/0]).

-export([ympa_erlang_proper_client_tariff_parameter_dto/1]).

-export_type([ympa_erlang_proper_client_tariff_parameter_dto/0]).

-type ympa_erlang_proper_client_tariff_parameter_dto() ::
  [ {'name', binary() }
  | {'value', binary() }
  ].


ympa_erlang_proper_client_tariff_parameter_dto() ->
    ympa_erlang_proper_client_tariff_parameter_dto([]).

ympa_erlang_proper_client_tariff_parameter_dto(Fields) ->
  Default = [ {'name', binary() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

