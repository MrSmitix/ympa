-module(ympa_erlang_proper_client_return_decision_subreason_type).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_decision_subreason_type/0]).

-export_type([ympa_erlang_proper_client_return_decision_subreason_type/0]).

-type ympa_erlang_proper_client_return_decision_subreason_type() ::
  binary().

ympa_erlang_proper_client_return_decision_subreason_type() ->
  elements([<<"USER_DID_NOT_LIKE">>, <<"USER_CHANGED_MIND">>, <<"DELIVERED_TOO_LONG">>, <<"BAD_PACKAGE">>, <<"DAMAGED">>, <<"NOT_WORKING">>, <<"INCOMPLETENESS">>, <<"WRONG_ITEM">>, <<"WRONG_COLOR">>, <<"DID_NOT_MATCH_DESCRIPTION">>, <<"UNKNOWN">>]).

