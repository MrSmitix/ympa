-module(ympa_erlang_proper_client_orders_stats_payment_order_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_payment_order_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_payment_order_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_payment_order_dto/0]).

-type ympa_erlang_proper_client_orders_stats_payment_order_dto() ::
  [ {'id', binary() }
  | {'date', date() }
  ].


ympa_erlang_proper_client_orders_stats_payment_order_dto() ->
    ympa_erlang_proper_client_orders_stats_payment_order_dto([]).

ympa_erlang_proper_client_orders_stats_payment_order_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'date', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

