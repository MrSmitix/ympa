-module(ympa_erlang_proper_client_price_competitiveness_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_competitiveness_type/0]).

-export_type([ympa_erlang_proper_client_price_competitiveness_type/0]).

-type ympa_erlang_proper_client_price_competitiveness_type() ::
  binary().

ympa_erlang_proper_client_price_competitiveness_type() ->
  elements([<<"OPTIMAL">>, <<"AVERAGE">>, <<"LOW">>]).

