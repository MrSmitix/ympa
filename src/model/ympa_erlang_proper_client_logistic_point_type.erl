-module(ympa_erlang_proper_client_logistic_point_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_logistic_point_type/0]).

-export_type([ympa_erlang_proper_client_logistic_point_type/0]).

-type ympa_erlang_proper_client_logistic_point_type() ::
  binary().

ympa_erlang_proper_client_logistic_point_type() ->
  elements([<<"WAREHOUSE">>, <<"PICKUP_POINT">>, <<"PICKUP_TERMINAL">>, <<"PICKUP_POST_OFFICE">>, <<"PICKUP_MIXED">>, <<"PICKUP_RETAIL">>, <<"UNKNOWN">>]).

