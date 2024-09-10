-module(ympa_erlang_proper_client_order_delivery_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_type/0]).

-export_type([ympa_erlang_proper_client_order_delivery_type/0]).

-type ympa_erlang_proper_client_order_delivery_type() ::
  binary().

ympa_erlang_proper_client_order_delivery_type() ->
  elements([<<"DELIVERY">>, <<"PICKUP">>, <<"POST">>, <<"DIGITAL">>, <<"UNKNOWN">>]).

