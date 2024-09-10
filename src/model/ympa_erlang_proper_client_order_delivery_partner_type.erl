-module(ympa_erlang_proper_client_order_delivery_partner_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_partner_type/0]).

-export_type([ympa_erlang_proper_client_order_delivery_partner_type/0]).

-type ympa_erlang_proper_client_order_delivery_partner_type() ::
  binary().

ympa_erlang_proper_client_order_delivery_partner_type() ->
  elements([<<"SHOP">>, <<"YANDEX_MARKET">>, <<"UNKNOWN">>]).

