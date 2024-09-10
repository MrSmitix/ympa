-module(ympa_erlang_proper_client_set_feed_params_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_feed_params_request/0]).

-export([ympa_erlang_proper_client_set_feed_params_request/1]).

-export_type([ympa_erlang_proper_client_set_feed_params_request/0]).

-type ympa_erlang_proper_client_set_feed_params_request() ::
  [ {'parameters', list(ympa_erlang_proper_client_feed_parameter_dto:ympa_erlang_proper_client_feed_parameter_dto()) }
  ].


ympa_erlang_proper_client_set_feed_params_request() ->
    ympa_erlang_proper_client_set_feed_params_request([]).

ympa_erlang_proper_client_set_feed_params_request(Fields) ->
  Default = [ {'parameters', list(ympa_erlang_proper_client_feed_parameter_dto:ympa_erlang_proper_client_feed_parameter_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

