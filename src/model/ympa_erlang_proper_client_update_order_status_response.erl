-module(ympa_erlang_proper_client_update_order_status_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_order_status_response/0]).

-export([ympa_erlang_proper_client_update_order_status_response/1]).

-export_type([ympa_erlang_proper_client_update_order_status_response/0]).

-type ympa_erlang_proper_client_update_order_status_response() ::
  [ {'order', ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto() }
  ].


ympa_erlang_proper_client_update_order_status_response() ->
    ympa_erlang_proper_client_update_order_status_response([]).

ympa_erlang_proper_client_update_order_status_response(Fields) ->
  Default = [ {'order', ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

