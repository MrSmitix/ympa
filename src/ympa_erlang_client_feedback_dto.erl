-module(ympa_erlang_client_feedback_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_dto/0]).

-type ympa_erlang_client_feedback_dto() ::
    #{ 'id' => integer(),
       'createdAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'text' => binary(),
       'state' => ympa_erlang_client_feedback_state_type:ympa_erlang_client_feedback_state_type(),
       'author' => ympa_erlang_client_feedback_author_dto:ympa_erlang_client_feedback_author_dto(),
       'pro' => binary(),
       'contra' => binary(),
       'comments' := list(),
       'shop' => ympa_erlang_client_feedback_shop_dto:ympa_erlang_client_feedback_shop_dto(),
       'resolved' => boolean(),
       'verified' => boolean(),
       'recommend' => boolean(),
       'grades' => ympa_erlang_client_feedback_grades_dto:ympa_erlang_client_feedback_grades_dto(),
       'order' => ympa_erlang_client_feedback_order_dto:ympa_erlang_client_feedback_order_dto()
     }.

encode(#{ 'id' := Id,
          'createdAt' := CreatedAt,
          'text' := Text,
          'state' := State,
          'author' := Author,
          'pro' := Pro,
          'contra' := Contra,
          'comments' := Comments,
          'shop' := Shop,
          'resolved' := Resolved,
          'verified' := Verified,
          'recommend' := Recommend,
          'grades' := Grades,
          'order' := Order
        }) ->
    #{ 'id' => Id,
       'createdAt' => CreatedAt,
       'text' => Text,
       'state' => State,
       'author' => Author,
       'pro' => Pro,
       'contra' => Contra,
       'comments' => Comments,
       'shop' => Shop,
       'resolved' => Resolved,
       'verified' => Verified,
       'recommend' => Recommend,
       'grades' => Grades,
       'order' => Order
     }.
