-module(ympa_erlang_proper_client_set_return_decision_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_set_return_decision_request/0]).

-export([ympa_erlang_proper_client_set_return_decision_request/1]).

-export_type([ympa_erlang_proper_client_set_return_decision_request/0]).

-type ympa_erlang_proper_client_set_return_decision_request() ::
  [ {'returnItemId', integer() }
  | {'decisionType', ympa_erlang_proper_client_return_request_decision_type:ympa_erlang_proper_client_return_request_decision_type() }
  | {'comment', binary() }
  ].


ympa_erlang_proper_client_set_return_decision_request() ->
    ympa_erlang_proper_client_set_return_decision_request([]).

ympa_erlang_proper_client_set_return_decision_request(Fields) ->
  Default = [ {'returnItemId', integer() }
            , {'decisionType', ympa_erlang_proper_client_return_request_decision_type:ympa_erlang_proper_client_return_request_decision_type() }
            , {'comment', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

