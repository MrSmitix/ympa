-module(ympa_erlang_proper_client_parameter_value_option_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_parameter_value_option_dto/0]).

-export([ympa_erlang_proper_client_parameter_value_option_dto/1]).

-export_type([ympa_erlang_proper_client_parameter_value_option_dto/0]).

-type ympa_erlang_proper_client_parameter_value_option_dto() ::
  [ {'id', integer() }
  | {'value', binary() }
  | {'description', binary() }
  ].


ympa_erlang_proper_client_parameter_value_option_dto() ->
    ympa_erlang_proper_client_parameter_value_option_dto([]).

ympa_erlang_proper_client_parameter_value_option_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'value', binary() }
            , {'description', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

