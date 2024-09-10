-module(ympa_erlang_client_return_decision_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_return_decision_dto/0]).

-type ympa_erlang_client_return_decision_dto() ::
    #{ 'returnItemId' => integer(),
       'count' => integer(),
       'comment' => binary(),
       'reasonType' => ympa_erlang_client_return_decision_reason_type:ympa_erlang_client_return_decision_reason_type(),
       'subreasonType' => ympa_erlang_client_return_decision_subreason_type:ympa_erlang_client_return_decision_subreason_type(),
       'decisionType' => ympa_erlang_client_return_decision_type:ympa_erlang_client_return_decision_type(),
       'refundAmount' => integer(),
       'partnerCompensation' => integer(),
       'images' => list()
     }.

encode(#{ 'returnItemId' := ReturnItemId,
          'count' := Count,
          'comment' := Comment,
          'reasonType' := ReasonType,
          'subreasonType' := SubreasonType,
          'decisionType' := DecisionType,
          'refundAmount' := RefundAmount,
          'partnerCompensation' := PartnerCompensation,
          'images' := Images
        }) ->
    #{ 'returnItemId' => ReturnItemId,
       'count' => Count,
       'comment' => Comment,
       'reasonType' => ReasonType,
       'subreasonType' => SubreasonType,
       'decisionType' => DecisionType,
       'refundAmount' => RefundAmount,
       'partnerCompensation' => PartnerCompensation,
       'images' => Images
     }.
