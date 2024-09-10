-module(ympa_erlang_proper_client_sku_bid_recommendation_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_sku_bid_recommendation_item_dto/0]).

-export([ympa_erlang_proper_client_sku_bid_recommendation_item_dto/1]).

-export_type([ympa_erlang_proper_client_sku_bid_recommendation_item_dto/0]).

-type ympa_erlang_proper_client_sku_bid_recommendation_item_dto() ::
  [ {'sku', binary() }
  | {'bid', integer() }
  | {'bidRecommendations', list(ympa_erlang_proper_client_bid_recommendation_item_dto:ympa_erlang_proper_client_bid_recommendation_item_dto()) }
  | {'priceRecommendations', list(ympa_erlang_proper_client_price_recommendation_item_dto:ympa_erlang_proper_client_price_recommendation_item_dto()) }
  ].


ympa_erlang_proper_client_sku_bid_recommendation_item_dto() ->
    ympa_erlang_proper_client_sku_bid_recommendation_item_dto([]).

ympa_erlang_proper_client_sku_bid_recommendation_item_dto(Fields) ->
  Default = [ {'sku', binary(1, 255) }
            , {'bid', integer(0, 9999) }
            , {'bidRecommendations', list(ympa_erlang_proper_client_bid_recommendation_item_dto:ympa_erlang_proper_client_bid_recommendation_item_dto()) }
            , {'priceRecommendations', list(ympa_erlang_proper_client_price_recommendation_item_dto:ympa_erlang_proper_client_price_recommendation_item_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

