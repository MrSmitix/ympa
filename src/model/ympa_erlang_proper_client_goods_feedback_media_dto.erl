-module(ympa_erlang_proper_client_goods_feedback_media_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_media_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_media_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_media_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_media_dto() ::
  [ {'photos', list(binary()) }
  | {'videos', list(binary()) }
  ].


ympa_erlang_proper_client_goods_feedback_media_dto() ->
    ympa_erlang_proper_client_goods_feedback_media_dto([]).

ympa_erlang_proper_client_goods_feedback_media_dto(Fields) ->
  Default = [ {'photos', list(binary()) }
            , {'videos', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

