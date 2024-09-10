-module(ympa_erlang_proper_client_order_delivery_dispatch_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_dispatch_type/0]).

-export_type([ympa_erlang_proper_client_order_delivery_dispatch_type/0]).

-type ympa_erlang_proper_client_order_delivery_dispatch_type() ::
  binary().

ympa_erlang_proper_client_order_delivery_dispatch_type() ->
  elements([<<"UNKNOWN">>, <<"BUYER">>, <<"MARKET_PARTNER_OUTLET">>, <<"MARKET_BRANDED_OUTLET">>, <<"SHOP_OUTLET">>, <<"DROPOFF">>]).

