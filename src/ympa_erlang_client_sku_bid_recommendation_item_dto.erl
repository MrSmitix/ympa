-module(ympa_erlang_client_sku_bid_recommendation_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_sku_bid_recommendation_item_dto/0]).

-type ympa_erlang_client_sku_bid_recommendation_item_dto() ::
    #{ 'sku' := binary(),
       'bid' := integer(),
       'bidRecommendations' => list(),
       'priceRecommendations' => list()
     }.

encode(#{ 'sku' := Sku,
          'bid' := Bid,
          'bidRecommendations' := BidRecommendations,
          'priceRecommendations' := PriceRecommendations
        }) ->
    #{ 'sku' => Sku,
       'bid' => Bid,
       'bidRecommendations' => BidRecommendations,
       'priceRecommendations' => PriceRecommendations
     }.
