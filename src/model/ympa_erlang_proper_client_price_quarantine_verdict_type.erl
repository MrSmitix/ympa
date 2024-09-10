-module(ympa_erlang_proper_client_price_quarantine_verdict_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_quarantine_verdict_type/0]).

-export_type([ympa_erlang_proper_client_price_quarantine_verdict_type/0]).

-type ympa_erlang_proper_client_price_quarantine_verdict_type() ::
  binary().

ympa_erlang_proper_client_price_quarantine_verdict_type() ->
  elements([<<"PRICE_CHANGE">>, <<"LOW_PRICE">>, <<"LOW_PRICE_PROMO">>]).

