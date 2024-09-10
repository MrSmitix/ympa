-module(ympa_erlang_client_get_goods_feedback_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_goods_feedback_request/0]).

-type ympa_erlang_client_get_goods_feedback_request() ::
    #{ 'dateTimeFrom' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateTimeTo' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'reactionStatus' => ympa_erlang_client_feedback_reaction_status_type:ympa_erlang_client_feedback_reaction_status_type(),
       'ratingValues' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'modelIds' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'paid' => boolean()
     }.

encode(#{ 'dateTimeFrom' := DateTimeFrom,
          'dateTimeTo' := DateTimeTo,
          'reactionStatus' := ReactionStatus,
          'ratingValues' := RatingValues,
          'modelIds' := ModelIds,
          'paid' := Paid
        }) ->
    #{ 'dateTimeFrom' => DateTimeFrom,
       'dateTimeTo' => DateTimeTo,
       'reactionStatus' => ReactionStatus,
       'ratingValues' => RatingValues,
       'modelIds' => ModelIds,
       'paid' => Paid
     }.
