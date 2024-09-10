-module(ympa_erlang_proper_client_orders_stats_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_item_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_item_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_item_dto/0]).

-type ympa_erlang_proper_client_orders_stats_item_dto() ::
  [ {'offerName', binary() }
  | {'marketSku', integer() }
  | {'shopSku', binary() }
  | {'count', integer() }
  | {'prices', list(ympa_erlang_proper_client_orders_stats_price_dto:ympa_erlang_proper_client_orders_stats_price_dto()) }
  | {'warehouse', ympa_erlang_proper_client_orders_stats_warehouse_dto:ympa_erlang_proper_client_orders_stats_warehouse_dto() }
  | {'details', list(ympa_erlang_proper_client_orders_stats_details_dto:ympa_erlang_proper_client_orders_stats_details_dto()) }
  | {'cisList', list(binary()) }
  | {'initialCount', integer() }
  | {'bidFee', integer() }
  | {'cofinanceThreshold', integer() }
  | {'cofinanceValue', integer() }
  ].


ympa_erlang_proper_client_orders_stats_item_dto() ->
    ympa_erlang_proper_client_orders_stats_item_dto([]).

ympa_erlang_proper_client_orders_stats_item_dto(Fields) ->
  Default = [ {'offerName', binary() }
            , {'marketSku', integer() }
            , {'shopSku', binary(1, 255) }
            , {'count', integer() }
            , {'prices', list(ympa_erlang_proper_client_orders_stats_price_dto:ympa_erlang_proper_client_orders_stats_price_dto()) }
            , {'warehouse', ympa_erlang_proper_client_orders_stats_warehouse_dto:ympa_erlang_proper_client_orders_stats_warehouse_dto() }
            , {'details', list(ympa_erlang_proper_client_orders_stats_details_dto:ympa_erlang_proper_client_orders_stats_details_dto()) }
            , {'cisList', list(binary()) }
            , {'initialCount', integer() }
            , {'bidFee', integer(0, 10000) }
            , {'cofinanceThreshold', integer() }
            , {'cofinanceValue', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

