-module(ympa_erlang_proper_client_orders_stats_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_dto/0]).

-type ympa_erlang_proper_client_orders_stats_dto() ::
  [ {'orders', list(ympa_erlang_proper_client_orders_stats_order_dto:ympa_erlang_proper_client_orders_stats_order_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_orders_stats_dto() ->
    ympa_erlang_proper_client_orders_stats_dto([]).

ympa_erlang_proper_client_orders_stats_dto(Fields) ->
  Default = [ {'orders', list(ympa_erlang_proper_client_orders_stats_order_dto:ympa_erlang_proper_client_orders_stats_order_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

