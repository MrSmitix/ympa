-module(ympa_erlang_proper_client_goods_feedback_comment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_comment_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_comment_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_comment_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_comment_dto() ::
  [ {'id', integer() }
  | {'text', binary() }
  | {'canModify', boolean() }
  | {'parentId', integer() }
  | {'author', ympa_erlang_proper_client_goods_feedback_comment_author_dto:ympa_erlang_proper_client_goods_feedback_comment_author_dto() }
  | {'status', ympa_erlang_proper_client_goods_feedback_comment_status_type:ympa_erlang_proper_client_goods_feedback_comment_status_type() }
  ].


ympa_erlang_proper_client_goods_feedback_comment_dto() ->
    ympa_erlang_proper_client_goods_feedback_comment_dto([]).

ympa_erlang_proper_client_goods_feedback_comment_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'text', binary(1, 4096) }
            , {'canModify', boolean() }
            , {'parentId', integer() }
            , {'author', ympa_erlang_proper_client_goods_feedback_comment_author_dto:ympa_erlang_proper_client_goods_feedback_comment_author_dto() }
            , {'status', ympa_erlang_proper_client_goods_feedback_comment_status_type:ympa_erlang_proper_client_goods_feedback_comment_status_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

