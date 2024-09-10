-module(ympa_erlang_proper_client_goods_feedback_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_dto() ::
  [ {'feedbackId', integer() }
  | {'createdAt', datetime() }
  | {'needReaction', boolean() }
  | {'identifiers', ympa_erlang_proper_client_goods_feedback_identifiers_dto:ympa_erlang_proper_client_goods_feedback_identifiers_dto() }
  | {'author', binary() }
  | {'description', ympa_erlang_proper_client_goods_feedback_description_dto:ympa_erlang_proper_client_goods_feedback_description_dto() }
  | {'media', ympa_erlang_proper_client_goods_feedback_media_dto:ympa_erlang_proper_client_goods_feedback_media_dto() }
  | {'statistics', ympa_erlang_proper_client_goods_feedback_statistics_dto:ympa_erlang_proper_client_goods_feedback_statistics_dto() }
  ].


ympa_erlang_proper_client_goods_feedback_dto() ->
    ympa_erlang_proper_client_goods_feedback_dto([]).

ympa_erlang_proper_client_goods_feedback_dto(Fields) ->
  Default = [ {'feedbackId', integer() }
            , {'createdAt', datetime() }
            , {'needReaction', boolean() }
            , {'identifiers', ympa_erlang_proper_client_goods_feedback_identifiers_dto:ympa_erlang_proper_client_goods_feedback_identifiers_dto() }
            , {'author', binary() }
            , {'description', ympa_erlang_proper_client_goods_feedback_description_dto:ympa_erlang_proper_client_goods_feedback_description_dto() }
            , {'media', ympa_erlang_proper_client_goods_feedback_media_dto:ympa_erlang_proper_client_goods_feedback_media_dto() }
            , {'statistics', ympa_erlang_proper_client_goods_feedback_statistics_dto:ympa_erlang_proper_client_goods_feedback_statistics_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

