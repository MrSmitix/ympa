-module(ympa_erlang_proper_client_order_delivery_date_reason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_delivery_date_reason_type/0]).

-export_type([ympa_erlang_proper_client_order_delivery_date_reason_type/0]).

-type ympa_erlang_proper_client_order_delivery_date_reason_type() ::
  binary().

ympa_erlang_proper_client_order_delivery_date_reason_type() ->
  elements([<<"USER_MOVED_DELIVERY_DATES">>, <<"PARTNER_MOVED_DELIVERY_DATES">>]).

