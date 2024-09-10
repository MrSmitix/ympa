-module(ympa_erlang_client_skip_goods_feedback_reaction_request).

-export([encode/1]).

-export_type([ympa_erlang_client_skip_goods_feedback_reaction_request/0]).

-type ympa_erlang_client_skip_goods_feedback_reaction_request() ::
    #{ 'feedbackIds' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'feedbackIds' := FeedbackIds
        }) ->
    #{ 'feedbackIds' => FeedbackIds
     }.
