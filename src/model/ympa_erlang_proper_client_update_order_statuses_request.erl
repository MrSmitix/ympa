-module(ympa_erlang_proper_client_update_order_statuses_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_statuses_request/0]).

-export([ympa_erlang_proper_client_update_order_statuses_request/1]).

-export_type([ympa_erlang_proper_client_update_order_statuses_request/0]).

-type ympa_erlang_proper_client_update_order_statuses_request() ::
  [ {'orders', list(ympa_erlang_proper_client_order_state_dto:ympa_erlang_proper_client_order_state_dto()) }
  ].


ympa_erlang_proper_client_update_order_statuses_request() ->
    ympa_erlang_proper_client_update_order_statuses_request([]).

ympa_erlang_proper_client_update_order_statuses_request(Fields) ->
  Default = [ {'orders', list(ympa_erlang_proper_client_order_state_dto:ympa_erlang_proper_client_order_state_dto(), 1, 30) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

