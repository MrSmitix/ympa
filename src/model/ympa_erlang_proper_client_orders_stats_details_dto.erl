-module(ympa_erlang_proper_client_orders_stats_details_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_details_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_details_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_details_dto/0]).

-type ympa_erlang_proper_client_orders_stats_details_dto() ::
  [ {'itemStatus', ympa_erlang_proper_client_orders_stats_item_status_type:ympa_erlang_proper_client_orders_stats_item_status_type() }
  | {'itemCount', integer() }
  | {'updateDate', date() }
  | {'stockType', ympa_erlang_proper_client_orders_stats_stock_type:ympa_erlang_proper_client_orders_stats_stock_type() }
  ].


ympa_erlang_proper_client_orders_stats_details_dto() ->
    ympa_erlang_proper_client_orders_stats_details_dto([]).

ympa_erlang_proper_client_orders_stats_details_dto(Fields) ->
  Default = [ {'itemStatus', ympa_erlang_proper_client_orders_stats_item_status_type:ympa_erlang_proper_client_orders_stats_item_status_type() }
            , {'itemCount', integer() }
            , {'updateDate', date() }
            , {'stockType', ympa_erlang_proper_client_orders_stats_stock_type:ympa_erlang_proper_client_orders_stats_stock_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

