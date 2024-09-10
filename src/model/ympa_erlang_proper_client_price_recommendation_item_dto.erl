-module(ympa_erlang_proper_client_price_recommendation_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_recommendation_item_dto/0]).

-export([ympa_erlang_proper_client_price_recommendation_item_dto/1]).

-export_type([ympa_erlang_proper_client_price_recommendation_item_dto/0]).

-type ympa_erlang_proper_client_price_recommendation_item_dto() ::
  [ {'campaignId', integer() }
  | {'price', integer() }
  ].


ympa_erlang_proper_client_price_recommendation_item_dto() ->
    ympa_erlang_proper_client_price_recommendation_item_dto([]).

ympa_erlang_proper_client_price_recommendation_item_dto(Fields) ->
  Default = [ {'campaignId', integer() }
            , {'price', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

