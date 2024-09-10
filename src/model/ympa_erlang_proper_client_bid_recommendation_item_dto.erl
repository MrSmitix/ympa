-module(ympa_erlang_proper_client_bid_recommendation_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_bid_recommendation_item_dto/0]).

-export([ympa_erlang_proper_client_bid_recommendation_item_dto/1]).

-export_type([ympa_erlang_proper_client_bid_recommendation_item_dto/0]).

-type ympa_erlang_proper_client_bid_recommendation_item_dto() ::
  [ {'bid', integer() }
  | {'showPercent', integer() }
  ].


ympa_erlang_proper_client_bid_recommendation_item_dto() ->
    ympa_erlang_proper_client_bid_recommendation_item_dto([]).

ympa_erlang_proper_client_bid_recommendation_item_dto(Fields) ->
  Default = [ {'bid', integer(0, 9999) }
            , {'showPercent', integer(0, 100) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

