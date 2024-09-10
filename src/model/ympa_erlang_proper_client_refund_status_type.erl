-module(ympa_erlang_proper_client_refund_status_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_refund_status_type/0]).

-export_type([ympa_erlang_proper_client_refund_status_type/0]).

-type ympa_erlang_proper_client_refund_status_type() ::
  binary().

ympa_erlang_proper_client_refund_status_type() ->
  elements([<<"STARTED_BY_USER">>, <<"REFUND_IN_PROGRESS">>, <<"REFUNDED">>, <<"FAILED">>, <<"WAITING_FOR_DECISION">>, <<"DECISION_MADE">>, <<"REFUNDED_WITH_BONUSES">>, <<"REFUNDED_BY_SHOP">>, <<"CANCELLED">>, <<"COMPLETE_WITHOUT_REFUND">>, <<"UNKNOWN">>]).

