-module(ympa_erlang_proper_client_warehouse_stock_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_warehouse_stock_type/0]).

-export_type([ympa_erlang_proper_client_warehouse_stock_type/0]).

-type ympa_erlang_proper_client_warehouse_stock_type() ::
  binary().

ympa_erlang_proper_client_warehouse_stock_type() ->
  elements([<<"FIT">>, <<"FREEZE">>, <<"AVAILABLE">>, <<"QUARANTINE">>, <<"UTILIZATION">>, <<"DEFECT">>, <<"EXPIRED">>]).

