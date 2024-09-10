-module(ympa_erlang_proper_client_order_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_status_type/0]).

-export_type([ympa_erlang_proper_client_order_status_type/0]).

-type ympa_erlang_proper_client_order_status_type() ::
  binary().

ympa_erlang_proper_client_order_status_type() ->
  elements([<<"PLACING">>, <<"RESERVED">>, <<"UNPAID">>, <<"PROCESSING">>, <<"DELIVERY">>, <<"PICKUP">>, <<"DELIVERED">>, <<"CANCELLED">>, <<"PENDING">>, <<"PARTIALLY_RETURNED">>, <<"RETURNED">>, <<"UNKNOWN">>]).

