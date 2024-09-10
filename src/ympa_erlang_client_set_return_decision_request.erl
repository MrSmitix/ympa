-module(ympa_erlang_client_set_return_decision_request).

-export([encode/1]).

-export_type([ympa_erlang_client_set_return_decision_request/0]).

-type ympa_erlang_client_set_return_decision_request() ::
    #{ 'returnItemId' := integer(),
       'decisionType' := ympa_erlang_client_return_request_decision_type:ympa_erlang_client_return_request_decision_type(),
       'comment' => binary()
     }.

encode(#{ 'returnItemId' := ReturnItemId,
          'decisionType' := DecisionType,
          'comment' := Comment
        }) ->
    #{ 'returnItemId' => ReturnItemId,
       'decisionType' => DecisionType,
       'comment' => Comment
     }.
