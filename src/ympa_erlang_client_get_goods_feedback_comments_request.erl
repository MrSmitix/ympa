-module(ympa_erlang_client_get_goods_feedback_comments_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_goods_feedback_comments_request/0]).

-type ympa_erlang_client_get_goods_feedback_comments_request() ::
    #{ 'feedbackId' := integer()
     }.

encode(#{ 'feedbackId' := FeedbackId
        }) ->
    #{ 'feedbackId' => FeedbackId
     }.
