-module(ympa_erlang_client_update_goods_feedback_comment_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_goods_feedback_comment_request/0]).

-type ympa_erlang_client_update_goods_feedback_comment_request() ::
    #{ 'feedbackId' := integer(),
       'comment' := ympa_erlang_client_update_goods_feedback_comment_dto:ympa_erlang_client_update_goods_feedback_comment_dto()
     }.

encode(#{ 'feedbackId' := FeedbackId,
          'comment' := Comment
        }) ->
    #{ 'feedbackId' => FeedbackId,
       'comment' => Comment
     }.
