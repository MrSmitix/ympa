-module(ympa_erlang_proper_client_goods_stats_warehouse_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_stats_warehouse_dto/0]).

-export([ympa_erlang_proper_client_goods_stats_warehouse_dto/1]).

-export_type([ympa_erlang_proper_client_goods_stats_warehouse_dto/0]).

-type ympa_erlang_proper_client_goods_stats_warehouse_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'stocks', list(ympa_erlang_proper_client_warehouse_stock_dto:ympa_erlang_proper_client_warehouse_stock_dto()) }
  ].


ympa_erlang_proper_client_goods_stats_warehouse_dto() ->
    ympa_erlang_proper_client_goods_stats_warehouse_dto([]).

ympa_erlang_proper_client_goods_stats_warehouse_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'stocks', list(ympa_erlang_proper_client_warehouse_stock_dto:ympa_erlang_proper_client_warehouse_stock_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

