-module(ympa_erlang_proper_client_return_decision_reason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_decision_reason_type/0]).

-export_type([ympa_erlang_proper_client_return_decision_reason_type/0]).

-type ympa_erlang_proper_client_return_decision_reason_type() ::
  binary().

ympa_erlang_proper_client_return_decision_reason_type() ->
  elements([<<"BAD_QUALITY">>, <<"DOES_NOT_FIT">>, <<"WRONG_ITEM">>, <<"DAMAGE_DELIVERY">>, <<"LOYALTY_FAIL">>, <<"CONTENT_FAIL">>, <<"UNKNOWN">>]).

