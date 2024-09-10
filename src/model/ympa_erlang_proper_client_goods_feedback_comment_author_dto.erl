-module(ympa_erlang_proper_client_goods_feedback_comment_author_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_comment_author_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_comment_author_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_comment_author_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_comment_author_dto() ::
  [ {'type', ympa_erlang_proper_client_goods_feedback_comment_author_type:ympa_erlang_proper_client_goods_feedback_comment_author_type() }
  | {'name', binary() }
  ].


ympa_erlang_proper_client_goods_feedback_comment_author_dto() ->
    ympa_erlang_proper_client_goods_feedback_comment_author_dto([]).

ympa_erlang_proper_client_goods_feedback_comment_author_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_goods_feedback_comment_author_type:ympa_erlang_proper_client_goods_feedback_comment_author_type() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

