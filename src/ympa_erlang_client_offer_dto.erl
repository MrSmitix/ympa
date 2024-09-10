-module(ympa_erlang_client_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_dto/0]).

-type ympa_erlang_client_offer_dto() ::
    #{ 'price' => integer(),
       'feedId' => integer(),
       'id' => binary(),
       'shopCategoryId' => binary(),
       'marketCategoryId' => integer(),
       'preDiscountPrice' => integer(),
       'discount' => integer(),
       'cutPrice' => boolean(),
       'url' => binary(),
       'modelId' := integer(),
       'name' => binary(),
       'currency' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'bid' => integer(),
       'cbid' => integer(),
       'fee' => integer(),
       'blocked' => boolean()
     }.

encode(#{ 'price' := Price,
          'feedId' := FeedId,
          'id' := Id,
          'shopCategoryId' := ShopCategoryId,
          'marketCategoryId' := MarketCategoryId,
          'preDiscountPrice' := PreDiscountPrice,
          'discount' := Discount,
          'cutPrice' := CutPrice,
          'url' := Url,
          'modelId' := ModelId,
          'name' := Name,
          'currency' := Currency,
          'bid' := Bid,
          'cbid' := Cbid,
          'fee' := Fee,
          'blocked' := Blocked
        }) ->
    #{ 'price' => Price,
       'feedId' => FeedId,
       'id' => Id,
       'shopCategoryId' => ShopCategoryId,
       'marketCategoryId' => MarketCategoryId,
       'preDiscountPrice' => PreDiscountPrice,
       'discount' => Discount,
       'cutPrice' => CutPrice,
       'url' => Url,
       'modelId' => ModelId,
       'name' => Name,
       'currency' => Currency,
       'bid' => Bid,
       'cbid' => Cbid,
       'fee' => Fee,
       'blocked' => Blocked
     }.
