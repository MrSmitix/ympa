-module(ympa_erlang_proper_client_license_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_license_type/0]).

-export_type([ympa_erlang_proper_client_license_type/0]).

-type ympa_erlang_proper_client_license_type() ::
  binary().

ympa_erlang_proper_client_license_type() ->
  elements([<<"ALCOHOL">>, <<"UNKNOWN">>]).

