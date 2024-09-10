-module(ympa_erlang_proper_client_skip_goods_feedback_reaction_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_skip_goods_feedback_reaction_request/0]).

-export([ympa_erlang_proper_client_skip_goods_feedback_reaction_request/1]).

-export_type([ympa_erlang_proper_client_skip_goods_feedback_reaction_request/0]).

-type ympa_erlang_proper_client_skip_goods_feedback_reaction_request() ::
  [ {'feedbackIds', list(integer()) }
  ].


ympa_erlang_proper_client_skip_goods_feedback_reaction_request() ->
    ympa_erlang_proper_client_skip_goods_feedback_reaction_request([]).

ympa_erlang_proper_client_skip_goods_feedback_reaction_request(Fields) ->
  Default = [ {'feedbackIds', list(integer(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

