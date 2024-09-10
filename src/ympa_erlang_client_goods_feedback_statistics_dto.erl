-module(ympa_erlang_client_goods_feedback_statistics_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_statistics_dto/0]).

-type ympa_erlang_client_goods_feedback_statistics_dto() ::
    #{ 'rating' := integer(),
       'commentsCount' := integer(),
       'recommended' => boolean(),
       'paidAmount' => integer()
     }.

encode(#{ 'rating' := Rating,
          'commentsCount' := CommentsCount,
          'recommended' := Recommended,
          'paidAmount' := PaidAmount
        }) ->
    #{ 'rating' => Rating,
       'commentsCount' => CommentsCount,
       'recommended' => Recommended,
       'paidAmount' => PaidAmount
     }.
