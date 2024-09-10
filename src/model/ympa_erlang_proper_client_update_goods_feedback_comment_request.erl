-module(ympa_erlang_proper_client_update_goods_feedback_comment_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_goods_feedback_comment_request/0]).

-export([ympa_erlang_proper_client_update_goods_feedback_comment_request/1]).

-export_type([ympa_erlang_proper_client_update_goods_feedback_comment_request/0]).

-type ympa_erlang_proper_client_update_goods_feedback_comment_request() ::
  [ {'feedbackId', integer() }
  | {'comment', ympa_erlang_proper_client_update_goods_feedback_comment_dto:ympa_erlang_proper_client_update_goods_feedback_comment_dto() }
  ].


ympa_erlang_proper_client_update_goods_feedback_comment_request() ->
    ympa_erlang_proper_client_update_goods_feedback_comment_request([]).

ympa_erlang_proper_client_update_goods_feedback_comment_request(Fields) ->
  Default = [ {'feedbackId', integer() }
            , {'comment', ympa_erlang_proper_client_update_goods_feedback_comment_dto:ympa_erlang_proper_client_update_goods_feedback_comment_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

