-module(ympa_erlang_proper_client_turnover_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_turnover_type/0]).

-export_type([ympa_erlang_proper_client_turnover_type/0]).

-type ympa_erlang_proper_client_turnover_type() ::
  binary().

ympa_erlang_proper_client_turnover_type() ->
  elements([<<"LOW">>, <<"ALMOST_LOW">>, <<"HIGH">>, <<"VERY_HIGH">>, <<"NO_SALES">>, <<"FREE_STORE">>]).

