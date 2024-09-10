-module(ympa_erlang_proper_client_outlet_visibility_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_outlet_visibility_type/0]).

-export_type([ympa_erlang_proper_client_outlet_visibility_type/0]).

-type ympa_erlang_proper_client_outlet_visibility_type() ::
  binary().

ympa_erlang_proper_client_outlet_visibility_type() ->
  elements([<<"HIDDEN">>, <<"VISIBLE">>, <<"UNKNOWN">>]).

