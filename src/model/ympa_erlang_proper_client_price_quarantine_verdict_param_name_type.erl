-module(ympa_erlang_proper_client_price_quarantine_verdict_param_name_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_quarantine_verdict_param_name_type/0]).

-export_type([ympa_erlang_proper_client_price_quarantine_verdict_param_name_type/0]).

-type ympa_erlang_proper_client_price_quarantine_verdict_param_name_type() ::
  binary().

ympa_erlang_proper_client_price_quarantine_verdict_param_name_type() ->
  elements([<<"CURRENT_PRICE">>, <<"LAST_VALID_PRICE">>, <<"MIN_PRICE">>, <<"CURRENCY">>]).

