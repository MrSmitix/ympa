-module(ympa_erlang_proper_client_order_delivery_eac_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_eac_type/0]).

-export_type([ympa_erlang_proper_client_order_delivery_eac_type/0]).

-type ympa_erlang_proper_client_order_delivery_eac_type() ::
  binary().

ympa_erlang_proper_client_order_delivery_eac_type() ->
  elements([<<"MERCHANT_TO_COURIER">>, <<"COURIER_TO_MERCHANT">>, <<"CHECKING_BY_MERCHANT">>]).

