-module(ympa_erlang_proper_client_get_order_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_order_response/0]).

-export([ympa_erlang_proper_client_get_order_response/1]).

-export_type([ympa_erlang_proper_client_get_order_response/0]).

-type ympa_erlang_proper_client_get_order_response() ::
  [ {'order', ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto() }
  ].


ympa_erlang_proper_client_get_order_response() ->
    ympa_erlang_proper_client_get_order_response([]).

ympa_erlang_proper_client_get_order_response(Fields) ->
  Default = [ {'order', ympa_erlang_proper_client_order_dto:ympa_erlang_proper_client_order_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

