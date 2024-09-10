-module(ympa_erlang_proper_client_get_warehouse_stocks_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_warehouse_stocks_request/0]).

-export([ympa_erlang_proper_client_get_warehouse_stocks_request/1]).

-export_type([ympa_erlang_proper_client_get_warehouse_stocks_request/0]).

-type ympa_erlang_proper_client_get_warehouse_stocks_request() ::
  [ {'withTurnover', boolean() }
  | {'archived', boolean() }
  | {'offerIds', list(binary()) }
  ].


ympa_erlang_proper_client_get_warehouse_stocks_request() ->
    ympa_erlang_proper_client_get_warehouse_stocks_request([]).

ympa_erlang_proper_client_get_warehouse_stocks_request(Fields) ->
  Default = [ {'withTurnover', boolean() }
            , {'archived', boolean() }
            , {'offerIds', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

