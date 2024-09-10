-module(ympa_erlang_proper_client_shipment_action_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shipment_action_type/0]).

-export_type([ympa_erlang_proper_client_shipment_action_type/0]).

-type ympa_erlang_proper_client_shipment_action_type() ::
  binary().

ympa_erlang_proper_client_shipment_action_type() ->
  elements([<<"CONFIRM">>, <<"DOWNLOAD_ACT">>, <<"DOWNLOAD_INBOUND_ACT">>, <<"DOWNLOAD_DISCREPANCY_ACT">>, <<"CHANGE_PALLETS_COUNT">>]).

