-module(ympa_erlang_proper_client_return_instance_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_instance_status_type/0]).

-export_type([ympa_erlang_proper_client_return_instance_status_type/0]).

-type ympa_erlang_proper_client_return_instance_status_type() ::
  binary().

ympa_erlang_proper_client_return_instance_status_type() ->
  elements([<<"CREATED">>, <<"RECEIVED">>, <<"IN_TRANSIT">>, <<"READY_FOR_PICKUP">>, <<"PICKED">>, <<"RECEIVED_ON_FULFILLMENT">>, <<"CANCELLED">>, <<"LOST">>, <<"UTILIZED">>, <<"PREPARED_FOR_UTILIZATION">>, <<"EXPROPRIATED">>, <<"NOT_IN_DEMAND">>]).

