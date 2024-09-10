-module(ympa_erlang_client_goods_feedback_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_feedback_dto/0]).

-type ympa_erlang_client_goods_feedback_dto() ::
    #{ 'feedbackId' := integer(),
       'createdAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'needReaction' := boolean(),
       'identifiers' := ympa_erlang_client_goods_feedback_identifiers_dto:ympa_erlang_client_goods_feedback_identifiers_dto(),
       'author' => binary(),
       'description' => ympa_erlang_client_goods_feedback_description_dto:ympa_erlang_client_goods_feedback_description_dto(),
       'media' => ympa_erlang_client_goods_feedback_media_dto:ympa_erlang_client_goods_feedback_media_dto(),
       'statistics' := ympa_erlang_client_goods_feedback_statistics_dto:ympa_erlang_client_goods_feedback_statistics_dto()
     }.

encode(#{ 'feedbackId' := FeedbackId,
          'createdAt' := CreatedAt,
          'needReaction' := NeedReaction,
          'identifiers' := Identifiers,
          'author' := Author,
          'description' := Description,
          'media' := Media,
          'statistics' := Statistics
        }) ->
    #{ 'feedbackId' => FeedbackId,
       'createdAt' => CreatedAt,
       'needReaction' => NeedReaction,
       'identifiers' => Identifiers,
       'author' => Author,
       'description' => Description,
       'media' => Media,
       'statistics' => Statistics
     }.
