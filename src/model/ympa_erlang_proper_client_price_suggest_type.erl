-module(ympa_erlang_proper_client_price_suggest_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_suggest_type/0]).

-export_type([ympa_erlang_proper_client_price_suggest_type/0]).

-type ympa_erlang_proper_client_price_suggest_type() ::
  binary().

ympa_erlang_proper_client_price_suggest_type() ->
  elements([<<"BUYBOX">>, <<"DEFAULT_OFFER">>, <<"MIN_PRICE_MARKET">>]).

