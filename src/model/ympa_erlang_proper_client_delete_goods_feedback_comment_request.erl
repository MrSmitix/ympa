-module(ympa_erlang_proper_client_delete_goods_feedback_comment_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_delete_goods_feedback_comment_request/0]).

-export([ympa_erlang_proper_client_delete_goods_feedback_comment_request/1]).

-export_type([ympa_erlang_proper_client_delete_goods_feedback_comment_request/0]).

-type ympa_erlang_proper_client_delete_goods_feedback_comment_request() ::
  [ {'id', integer() }
  ].


ympa_erlang_proper_client_delete_goods_feedback_comment_request() ->
    ympa_erlang_proper_client_delete_goods_feedback_comment_request([]).

ympa_erlang_proper_client_delete_goods_feedback_comment_request(Fields) ->
  Default = [ {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

