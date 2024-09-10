-module(ympa_erlang_proper_client_orders_stats_payment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_payment_dto/0]).

-export([ympa_erlang_proper_client_orders_stats_payment_dto/1]).

-export_type([ympa_erlang_proper_client_orders_stats_payment_dto/0]).

-type ympa_erlang_proper_client_orders_stats_payment_dto() ::
  [ {'id', binary() }
  | {'date', date() }
  | {'type', ympa_erlang_proper_client_orders_stats_payment_type:ympa_erlang_proper_client_orders_stats_payment_type() }
  | {'source', ympa_erlang_proper_client_orders_stats_payment_source_type:ympa_erlang_proper_client_orders_stats_payment_source_type() }
  | {'total', integer() }
  | {'paymentOrder', ympa_erlang_proper_client_orders_stats_payment_order_dto:ympa_erlang_proper_client_orders_stats_payment_order_dto() }
  ].


ympa_erlang_proper_client_orders_stats_payment_dto() ->
    ympa_erlang_proper_client_orders_stats_payment_dto([]).

ympa_erlang_proper_client_orders_stats_payment_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'date', date() }
            , {'type', ympa_erlang_proper_client_orders_stats_payment_type:ympa_erlang_proper_client_orders_stats_payment_type() }
            , {'source', ympa_erlang_proper_client_orders_stats_payment_source_type:ympa_erlang_proper_client_orders_stats_payment_source_type() }
            , {'total', integer() }
            , {'paymentOrder', ympa_erlang_proper_client_orders_stats_payment_order_dto:ympa_erlang_proper_client_orders_stats_payment_order_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

