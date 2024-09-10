-module(ympa_erlang_proper_client_return_decision_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_decision_type/0]).

-export_type([ympa_erlang_proper_client_return_decision_type/0]).

-type ympa_erlang_proper_client_return_decision_type() ::
  binary().

ympa_erlang_proper_client_return_decision_type() ->
  elements([<<"REFUND_MONEY">>, <<"REFUND_MONEY_INCLUDING_SHIPMENT">>, <<"REPAIR">>, <<"REPLACE">>, <<"SEND_TO_EXAMINATION">>, <<"DECLINE_REFUND">>, <<"OTHER_DECISION">>, <<"UNKNOWN">>]).

