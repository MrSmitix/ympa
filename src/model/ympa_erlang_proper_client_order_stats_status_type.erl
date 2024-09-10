-module(ympa_erlang_proper_client_order_stats_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_stats_status_type/0]).

-export_type([ympa_erlang_proper_client_order_stats_status_type/0]).

-type ympa_erlang_proper_client_order_stats_status_type() ::
  binary().

ympa_erlang_proper_client_order_stats_status_type() ->
  elements([<<"CANCELLED_BEFORE_PROCESSING">>, <<"CANCELLED_IN_DELIVERY">>, <<"CANCELLED_IN_PROCESSING">>, <<"DELIVERY">>, <<"DELIVERED">>, <<"PARTIALLY_DELIVERED">>, <<"PARTIALLY_RETURNED">>, <<"PENDING">>, <<"PICKUP">>, <<"PROCESSING">>, <<"RESERVED">>, <<"RETURNED">>, <<"UNKNOWN">>, <<"UNPAID">>, <<"LOST">>]).

