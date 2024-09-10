-module(ympa_erlang_proper_client_offer_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_type/0]).

-export_type([ympa_erlang_proper_client_offer_type/0]).

-type ympa_erlang_proper_client_offer_type() ::
  binary().

ympa_erlang_proper_client_offer_type() ->
  elements([<<"DEFAULT">>, <<"MEDICINE">>, <<"BOOK">>, <<"AUDIOBOOK">>, <<"ARTIST_TITLE">>, <<"ON_DEMAND">>]).

