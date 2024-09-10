-module(ympa_erlang_proper_client_update_stocks_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_stocks_request/0]).

-export([ympa_erlang_proper_client_update_stocks_request/1]).

-export_type([ympa_erlang_proper_client_update_stocks_request/0]).

-type ympa_erlang_proper_client_update_stocks_request() ::
  [ {'skus', list(ympa_erlang_proper_client_update_stock_dto:ympa_erlang_proper_client_update_stock_dto()) }
  ].


ympa_erlang_proper_client_update_stocks_request() ->
    ympa_erlang_proper_client_update_stocks_request([]).

ympa_erlang_proper_client_update_stocks_request(Fields) ->
  Default = [ {'skus', list(ympa_erlang_proper_client_update_stock_dto:ympa_erlang_proper_client_update_stock_dto(), 1, 2000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

