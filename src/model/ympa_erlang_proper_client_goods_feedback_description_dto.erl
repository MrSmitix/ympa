-module(ympa_erlang_proper_client_goods_feedback_description_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_description_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_description_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_description_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_description_dto() ::
  [ {'advantages', binary() }
  | {'disadvantages', binary() }
  | {'comment', binary() }
  ].


ympa_erlang_proper_client_goods_feedback_description_dto() ->
    ympa_erlang_proper_client_goods_feedback_description_dto([]).

ympa_erlang_proper_client_goods_feedback_description_dto(Fields) ->
  Default = [ {'advantages', binary() }
            , {'disadvantages', binary() }
            , {'comment', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

