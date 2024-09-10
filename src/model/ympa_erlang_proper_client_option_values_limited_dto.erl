-module(ympa_erlang_proper_client_option_values_limited_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_option_values_limited_dto/0]).

-export([ympa_erlang_proper_client_option_values_limited_dto/1]).

-export_type([ympa_erlang_proper_client_option_values_limited_dto/0]).

-type ympa_erlang_proper_client_option_values_limited_dto() ::
  [ {'limitingOptionValueId', integer() }
  | {'optionValueIds', list(integer()) }
  ].


ympa_erlang_proper_client_option_values_limited_dto() ->
    ympa_erlang_proper_client_option_values_limited_dto([]).

ympa_erlang_proper_client_option_values_limited_dto(Fields) ->
  Default = [ {'limitingOptionValueId', integer() }
            , {'optionValueIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

