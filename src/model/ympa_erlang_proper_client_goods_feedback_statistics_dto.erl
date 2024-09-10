-module(ympa_erlang_proper_client_goods_feedback_statistics_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_statistics_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_statistics_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_statistics_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_statistics_dto() ::
  [ {'rating', integer() }
  | {'commentsCount', integer() }
  | {'recommended', boolean() }
  | {'paidAmount', integer() }
  ].


ympa_erlang_proper_client_goods_feedback_statistics_dto() ->
    ympa_erlang_proper_client_goods_feedback_statistics_dto([]).

ympa_erlang_proper_client_goods_feedback_statistics_dto(Fields) ->
  Default = [ {'rating', integer(1, 5) }
            , {'commentsCount', integer() }
            , {'recommended', boolean() }
            , {'paidAmount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

