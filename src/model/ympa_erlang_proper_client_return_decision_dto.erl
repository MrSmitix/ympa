-module(ympa_erlang_proper_client_return_decision_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_decision_dto/0]).

-export([ympa_erlang_proper_client_return_decision_dto/1]).

-export_type([ympa_erlang_proper_client_return_decision_dto/0]).

-type ympa_erlang_proper_client_return_decision_dto() ::
  [ {'returnItemId', integer() }
  | {'count', integer() }
  | {'comment', binary() }
  | {'reasonType', ympa_erlang_proper_client_return_decision_reason_type:ympa_erlang_proper_client_return_decision_reason_type() }
  | {'subreasonType', ympa_erlang_proper_client_return_decision_subreason_type:ympa_erlang_proper_client_return_decision_subreason_type() }
  | {'decisionType', ympa_erlang_proper_client_return_decision_type:ympa_erlang_proper_client_return_decision_type() }
  | {'refundAmount', integer() }
  | {'partnerCompensation', integer() }
  | {'images', list(binary()) }
  ].


ympa_erlang_proper_client_return_decision_dto() ->
    ympa_erlang_proper_client_return_decision_dto([]).

ympa_erlang_proper_client_return_decision_dto(Fields) ->
  Default = [ {'returnItemId', integer() }
            , {'count', integer() }
            , {'comment', binary() }
            , {'reasonType', ympa_erlang_proper_client_return_decision_reason_type:ympa_erlang_proper_client_return_decision_reason_type() }
            , {'subreasonType', ympa_erlang_proper_client_return_decision_subreason_type:ympa_erlang_proper_client_return_decision_subreason_type() }
            , {'decisionType', ympa_erlang_proper_client_return_decision_type:ympa_erlang_proper_client_return_decision_type() }
            , {'refundAmount', integer() }
            , {'partnerCompensation', integer() }
            , {'images', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

