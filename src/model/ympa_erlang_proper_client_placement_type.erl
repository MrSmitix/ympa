-module(ympa_erlang_proper_client_placement_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_placement_type/0]).

-export_type([ympa_erlang_proper_client_placement_type/0]).

-type ympa_erlang_proper_client_placement_type() ::
  binary().

ympa_erlang_proper_client_placement_type() ->
  elements([<<"FBS">>, <<"FBY">>, <<"DBS">>]).

