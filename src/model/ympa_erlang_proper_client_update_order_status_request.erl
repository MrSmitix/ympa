-module(ympa_erlang_proper_client_update_order_status_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_status_request/0]).

-export([ympa_erlang_proper_client_update_order_status_request/1]).

-export_type([ympa_erlang_proper_client_update_order_status_request/0]).

-type ympa_erlang_proper_client_update_order_status_request() ::
  [ {'order', ympa_erlang_proper_client_order_status_change_dto:ympa_erlang_proper_client_order_status_change_dto() }
  ].


ympa_erlang_proper_client_update_order_status_request() ->
    ympa_erlang_proper_client_update_order_status_request([]).

ympa_erlang_proper_client_update_order_status_request(Fields) ->
  Default = [ {'order', ympa_erlang_proper_client_order_status_change_dto:ympa_erlang_proper_client_order_status_change_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

