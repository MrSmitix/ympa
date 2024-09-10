-module(ympa_erlang_proper_client_warehouse_stock_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_stock_dto/0]).

-export([ympa_erlang_proper_client_warehouse_stock_dto/1]).

-export_type([ympa_erlang_proper_client_warehouse_stock_dto/0]).

-type ympa_erlang_proper_client_warehouse_stock_dto() ::
  [ {'type', ympa_erlang_proper_client_warehouse_stock_type:ympa_erlang_proper_client_warehouse_stock_type() }
  | {'count', integer() }
  ].


ympa_erlang_proper_client_warehouse_stock_dto() ->
    ympa_erlang_proper_client_warehouse_stock_dto([]).

ympa_erlang_proper_client_warehouse_stock_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_warehouse_stock_type:ympa_erlang_proper_client_warehouse_stock_type() }
            , {'count', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

