-module(ympa_erlang_proper_client_value_restriction_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_value_restriction_dto/0]).

-export([ympa_erlang_proper_client_value_restriction_dto/1]).

-export_type([ympa_erlang_proper_client_value_restriction_dto/0]).

-type ympa_erlang_proper_client_value_restriction_dto() ::
  [ {'limitingParameterId', integer() }
  | {'limitedValues', list(ympa_erlang_proper_client_option_values_limited_dto:ympa_erlang_proper_client_option_values_limited_dto()) }
  ].


ympa_erlang_proper_client_value_restriction_dto() ->
    ympa_erlang_proper_client_value_restriction_dto([]).

ympa_erlang_proper_client_value_restriction_dto(Fields) ->
  Default = [ {'limitingParameterId', integer() }
            , {'limitedValues', list(ympa_erlang_proper_client_option_values_limited_dto:ympa_erlang_proper_client_option_values_limited_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

