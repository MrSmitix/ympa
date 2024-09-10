-module(ympa_erlang_proper_client_goods_feedback_comment_list_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_comment_list_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_comment_list_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_comment_list_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_comment_list_dto() ::
  [ {'comments', list(ympa_erlang_proper_client_goods_feedback_comment_dto:ympa_erlang_proper_client_goods_feedback_comment_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_goods_feedback_comment_list_dto() ->
    ympa_erlang_proper_client_goods_feedback_comment_list_dto([]).

ympa_erlang_proper_client_goods_feedback_comment_list_dto(Fields) ->
  Default = [ {'comments', list(ympa_erlang_proper_client_goods_feedback_comment_dto:ympa_erlang_proper_client_goods_feedback_comment_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

