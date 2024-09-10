-module(ympa_erlang_proper_client_orders_stats_price_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_orders_stats_price_type/0]).

-export_type([ympa_erlang_proper_client_orders_stats_price_type/0]).

-type ympa_erlang_proper_client_orders_stats_price_type() ::
  binary().

ympa_erlang_proper_client_orders_stats_price_type() ->
  elements([<<"BUYER">>, <<"CASHBACK">>, <<"MARKETPLACE">>]).

