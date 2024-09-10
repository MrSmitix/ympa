-module(ympa_erlang_client_sku_bid_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_sku_bid_item_dto/0]).

-type ympa_erlang_client_sku_bid_item_dto() ::
    #{ 'sku' := binary(),
       'bid' := integer()
     }.

encode(#{ 'sku' := Sku,
          'bid' := Bid
        }) ->
    #{ 'sku' => Sku,
       'bid' => Bid
     }.
