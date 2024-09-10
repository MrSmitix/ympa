-module(ympa_erlang_proper_client_goods_feedback_list_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_list_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_list_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_list_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_list_dto() ::
  [ {'feedbacks', list(ympa_erlang_proper_client_goods_feedback_dto:ympa_erlang_proper_client_goods_feedback_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_goods_feedback_list_dto() ->
    ympa_erlang_proper_client_goods_feedback_list_dto([]).

ympa_erlang_proper_client_goods_feedback_list_dto(Fields) ->
  Default = [ {'feedbacks', list(ympa_erlang_proper_client_goods_feedback_dto:ympa_erlang_proper_client_goods_feedback_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

