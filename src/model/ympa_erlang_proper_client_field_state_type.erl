-module(ympa_erlang_proper_client_field_state_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_field_state_type/0]).

-export_type([ympa_erlang_proper_client_field_state_type/0]).

-type ympa_erlang_proper_client_field_state_type() ::
  binary().

ympa_erlang_proper_client_field_state_type() ->
  elements([<<"SPECIFIED">>, <<"EMPTY">>]).

