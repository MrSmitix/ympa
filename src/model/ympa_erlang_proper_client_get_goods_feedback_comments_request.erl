-module(ympa_erlang_proper_client_get_goods_feedback_comments_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_goods_feedback_comments_request/0]).

-export([ympa_erlang_proper_client_get_goods_feedback_comments_request/1]).

-export_type([ympa_erlang_proper_client_get_goods_feedback_comments_request/0]).

-type ympa_erlang_proper_client_get_goods_feedback_comments_request() ::
  [ {'feedbackId', integer() }
  ].


ympa_erlang_proper_client_get_goods_feedback_comments_request() ->
    ympa_erlang_proper_client_get_goods_feedback_comments_request([]).

ympa_erlang_proper_client_get_goods_feedback_comments_request(Fields) ->
  Default = [ {'feedbackId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

