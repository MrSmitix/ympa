-module(ympa_erlang_proper_client_day_of_week_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_day_of_week_type/0]).

-export_type([ympa_erlang_proper_client_day_of_week_type/0]).

-type ympa_erlang_proper_client_day_of_week_type() ::
  binary().

ympa_erlang_proper_client_day_of_week_type() ->
  elements([<<"MONDAY">>, <<"TUESDAY">>, <<"WEDNESDAY">>, <<"THURSDAY">>, <<"FRIDAY">>, <<"SATURDAY">>, <<"SUNDAY">>]).

