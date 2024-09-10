-module(ympa_erlang_proper_client_mechanics_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_mechanics_type/0]).

-export_type([ympa_erlang_proper_client_mechanics_type/0]).

-type ympa_erlang_proper_client_mechanics_type() ::
  binary().

ympa_erlang_proper_client_mechanics_type() ->
  elements([<<"DIRECT_DISCOUNT">>, <<"BLUE_FLASH">>, <<"MARKET_PROMOCODE">>]).

