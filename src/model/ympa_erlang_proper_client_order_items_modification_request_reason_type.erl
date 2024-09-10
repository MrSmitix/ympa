-module(ympa_erlang_proper_client_order_items_modification_request_reason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_items_modification_request_reason_type/0]).

-export_type([ympa_erlang_proper_client_order_items_modification_request_reason_type/0]).

-type ympa_erlang_proper_client_order_items_modification_request_reason_type() ::
  binary().

ympa_erlang_proper_client_order_items_modification_request_reason_type() ->
  elements([<<"PARTNER_REQUESTED_REMOVE">>, <<"USER_REQUESTED_REMOVE">>]).

