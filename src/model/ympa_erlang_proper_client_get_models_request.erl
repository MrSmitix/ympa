-module(ympa_erlang_proper_client_get_models_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_models_request/0]).

-export([ympa_erlang_proper_client_get_models_request/1]).

-export_type([ympa_erlang_proper_client_get_models_request/0]).

-type ympa_erlang_proper_client_get_models_request() ::
  [ {'models', list(integer(0)) }
  ].


ympa_erlang_proper_client_get_models_request() ->
    ympa_erlang_proper_client_get_models_request([]).

ympa_erlang_proper_client_get_models_request(Fields) ->
  Default = [ {'models', list(integer(0), 1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

