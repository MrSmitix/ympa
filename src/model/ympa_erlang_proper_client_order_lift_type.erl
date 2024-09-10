-module(ympa_erlang_proper_client_order_lift_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_lift_type/0]).

-export_type([ympa_erlang_proper_client_order_lift_type/0]).

-type ympa_erlang_proper_client_order_lift_type() ::
  binary().

ympa_erlang_proper_client_order_lift_type() ->
  elements([<<"NOT_NEEDED">>, <<"MANUAL">>, <<"ELEVATOR">>, <<"CARGO_ELEVATOR">>, <<"FREE">>, <<"UNKNOWN">>]).

