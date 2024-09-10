-module(ympa_erlang_proper_client_feedback_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_feedback_dto/0]).

-export([ympa_erlang_proper_client_feedback_dto/1]).

-export_type([ympa_erlang_proper_client_feedback_dto/0]).

-type ympa_erlang_proper_client_feedback_dto() ::
  [ {'id', integer() }
  | {'createdAt', datetime() }
  | {'text', binary() }
  | {'state', ympa_erlang_proper_client_feedback_state_type:ympa_erlang_proper_client_feedback_state_type() }
  | {'author', ympa_erlang_proper_client_feedback_author_dto:ympa_erlang_proper_client_feedback_author_dto() }
  | {'pro', binary() }
  | {'contra', binary() }
  | {'comments', list(ympa_erlang_proper_client_feedback_comment_dto:ympa_erlang_proper_client_feedback_comment_dto()) }
  | {'shop', ympa_erlang_proper_client_feedback_shop_dto:ympa_erlang_proper_client_feedback_shop_dto() }
  | {'resolved', boolean() }
  | {'verified', boolean() }
  | {'recommend', boolean() }
  | {'grades', ympa_erlang_proper_client_feedback_grades_dto:ympa_erlang_proper_client_feedback_grades_dto() }
  | {'order', ympa_erlang_proper_client_feedback_order_dto:ympa_erlang_proper_client_feedback_order_dto() }
  ].


ympa_erlang_proper_client_feedback_dto() ->
    ympa_erlang_proper_client_feedback_dto([]).

ympa_erlang_proper_client_feedback_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'createdAt', datetime() }
            , {'text', binary() }
            , {'state', ympa_erlang_proper_client_feedback_state_type:ympa_erlang_proper_client_feedback_state_type() }
            , {'author', ympa_erlang_proper_client_feedback_author_dto:ympa_erlang_proper_client_feedback_author_dto() }
            , {'pro', binary() }
            , {'contra', binary() }
            , {'comments', list(ympa_erlang_proper_client_feedback_comment_dto:ympa_erlang_proper_client_feedback_comment_dto()) }
            , {'shop', ympa_erlang_proper_client_feedback_shop_dto:ympa_erlang_proper_client_feedback_shop_dto() }
            , {'resolved', boolean() }
            , {'verified', boolean() }
            , {'recommend', boolean() }
            , {'grades', ympa_erlang_proper_client_feedback_grades_dto:ympa_erlang_proper_client_feedback_grades_dto() }
            , {'order', ympa_erlang_proper_client_feedback_order_dto:ympa_erlang_proper_client_feedback_order_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

