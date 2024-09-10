-module(ympa_erlang_proper_client_orders_stats_order_payment_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_order_payment_type/0]).

-export_type([ympa_erlang_proper_client_orders_stats_order_payment_type/0]).

-type ympa_erlang_proper_client_orders_stats_order_payment_type() ::
  binary().

ympa_erlang_proper_client_orders_stats_order_payment_type() ->
  elements([<<"CREDIT">>, <<"POSTPAID">>, <<"PREPAID">>, <<"TINKOFF_CREDIT">>]).

