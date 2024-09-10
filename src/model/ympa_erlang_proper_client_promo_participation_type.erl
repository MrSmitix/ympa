-module(ympa_erlang_proper_client_promo_participation_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_participation_type/0]).

-export_type([ympa_erlang_proper_client_promo_participation_type/0]).

-type ympa_erlang_proper_client_promo_participation_type() ::
  binary().

ympa_erlang_proper_client_promo_participation_type() ->
  elements([<<"PARTICIPATING_NOW">>, <<"PARTICIPATED">>]).

