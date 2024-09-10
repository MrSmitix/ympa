-module(ympa_erlang_client_bid_recommendation_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_bid_recommendation_item_dto/0]).

-type ympa_erlang_client_bid_recommendation_item_dto() ::
    #{ 'bid' := integer(),
       'showPercent' := integer()
     }.

encode(#{ 'bid' := Bid,
          'showPercent' := ShowPercent
        }) ->
    #{ 'bid' => Bid,
       'showPercent' => ShowPercent
     }.
