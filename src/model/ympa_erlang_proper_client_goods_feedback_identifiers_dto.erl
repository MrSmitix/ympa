-module(ympa_erlang_proper_client_goods_feedback_identifiers_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_feedback_identifiers_dto/0]).

-export([ympa_erlang_proper_client_goods_feedback_identifiers_dto/1]).

-export_type([ympa_erlang_proper_client_goods_feedback_identifiers_dto/0]).

-type ympa_erlang_proper_client_goods_feedback_identifiers_dto() ::
  [ {'orderId', integer() }
  | {'modelId', integer() }
  ].


ympa_erlang_proper_client_goods_feedback_identifiers_dto() ->
    ympa_erlang_proper_client_goods_feedback_identifiers_dto([]).

ympa_erlang_proper_client_goods_feedback_identifiers_dto(Fields) ->
  Default = [ {'orderId', integer() }
            , {'modelId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

