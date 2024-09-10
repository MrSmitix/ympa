-module(ympa_erlang_proper_client_update_goods_feedback_comment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_goods_feedback_comment_dto/0]).

-export([ympa_erlang_proper_client_update_goods_feedback_comment_dto/1]).

-export_type([ympa_erlang_proper_client_update_goods_feedback_comment_dto/0]).

-type ympa_erlang_proper_client_update_goods_feedback_comment_dto() ::
  [ {'id', integer() }
  | {'parentId', integer() }
  | {'text', binary() }
  ].


ympa_erlang_proper_client_update_goods_feedback_comment_dto() ->
    ympa_erlang_proper_client_update_goods_feedback_comment_dto([]).

ympa_erlang_proper_client_update_goods_feedback_comment_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'parentId', integer() }
            , {'text', binary(1, 4096) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

