-module(ympa_erlang_proper_client_get_goods_feedback_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_goods_feedback_request/0]).

-export([ympa_erlang_proper_client_get_goods_feedback_request/1]).

-export_type([ympa_erlang_proper_client_get_goods_feedback_request/0]).

-type ympa_erlang_proper_client_get_goods_feedback_request() ::
  [ {'dateTimeFrom', datetime() }
  | {'dateTimeTo', datetime() }
  | {'reactionStatus', ympa_erlang_proper_client_feedback_reaction_status_type:ympa_erlang_proper_client_feedback_reaction_status_type() }
  | {'ratingValues', list(integer()) }
  | {'modelIds', list(integer()) }
  | {'paid', boolean() }
  ].


ympa_erlang_proper_client_get_goods_feedback_request() ->
    ympa_erlang_proper_client_get_goods_feedback_request([]).

ympa_erlang_proper_client_get_goods_feedback_request(Fields) ->
  Default = [ {'dateTimeFrom', datetime() }
            , {'dateTimeTo', datetime() }
            , {'reactionStatus', ympa_erlang_proper_client_feedback_reaction_status_type:ympa_erlang_proper_client_feedback_reaction_status_type() }
            , {'ratingValues', list(integer()) }
            , {'modelIds', list(integer()) }
            , {'paid', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

