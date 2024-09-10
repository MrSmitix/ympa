-module(ympa_erlang_proper_client_time_unit_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_time_unit_type/0]).

-export_type([ympa_erlang_proper_client_time_unit_type/0]).

-type ympa_erlang_proper_client_time_unit_type() ::
  binary().

ympa_erlang_proper_client_time_unit_type() ->
  elements([<<"HOUR">>, <<"DAY">>, <<"WEEK">>, <<"MONTH">>, <<"YEAR">>]).

