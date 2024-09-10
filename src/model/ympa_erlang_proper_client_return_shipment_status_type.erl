-module(ympa_erlang_proper_client_return_shipment_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_shipment_status_type/0]).

-export_type([ympa_erlang_proper_client_return_shipment_status_type/0]).

-type ympa_erlang_proper_client_return_shipment_status_type() ::
  binary().

ympa_erlang_proper_client_return_shipment_status_type() ->
  elements([<<"CREATED">>, <<"RECEIVED">>, <<"IN_TRANSIT">>, <<"READY_FOR_PICKUP">>, <<"PICKED">>, <<"LOST">>, <<"EXPIRED">>, <<"CANCELLED">>, <<"FULFILMENT_RECEIVED">>, <<"PREPARED_FOR_UTILIZATION">>, <<"NOT_IN_DEMAND">>, <<"UTILIZED">>, <<"READY_FOR_EXPROPRIATION">>, <<"RECEIVED_FOR_EXPROPRIATION">>]).

