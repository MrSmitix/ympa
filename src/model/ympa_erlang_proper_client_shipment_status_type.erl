-module(ympa_erlang_proper_client_shipment_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shipment_status_type/0]).

-export_type([ympa_erlang_proper_client_shipment_status_type/0]).

-type ympa_erlang_proper_client_shipment_status_type() ::
  binary().

ympa_erlang_proper_client_shipment_status_type() ->
  elements([<<"OUTBOUND_CREATED">>, <<"OUTBOUND_READY_FOR_CONFIRMATION">>, <<"OUTBOUND_CONFIRMED">>, <<"OUTBOUND_SIGNED">>, <<"FINISHED">>, <<"ACCEPTED">>, <<"ACCEPTED_WITH_DISCREPANCIES">>, <<"ERROR">>]).

