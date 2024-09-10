-module(ympa_erlang_proper_client_accept_order_cancellation_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_accept_order_cancellation_request/0]).

-export([ympa_erlang_proper_client_accept_order_cancellation_request/1]).

-export_type([ympa_erlang_proper_client_accept_order_cancellation_request/0]).

-type ympa_erlang_proper_client_accept_order_cancellation_request() ::
  [ {'accepted', boolean() }
  | {'reason', ympa_erlang_proper_client_order_cancellation_reason_type:ympa_erlang_proper_client_order_cancellation_reason_type() }
  ].


ympa_erlang_proper_client_accept_order_cancellation_request() ->
    ympa_erlang_proper_client_accept_order_cancellation_request([]).

ympa_erlang_proper_client_accept_order_cancellation_request(Fields) ->
  Default = [ {'accepted', boolean() }
            , {'reason', ympa_erlang_proper_client_order_cancellation_reason_type:ympa_erlang_proper_client_order_cancellation_reason_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

