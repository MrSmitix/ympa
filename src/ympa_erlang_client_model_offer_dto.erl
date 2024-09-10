-module(ympa_erlang_client_model_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_model_offer_dto/0]).

-type ympa_erlang_client_model_offer_dto() ::
    #{ 'discount' => integer(),
       'name' => binary(),
       'pos' => integer(),
       'preDiscountPrice' => integer(),
       'price' => integer(),
       'regionId' => integer(),
       'shippingCost' => integer(),
       'shopName' => binary(),
       'shopRating' => integer(),
       'inStock' => integer()
     }.

encode(#{ 'discount' := Discount,
          'name' := Name,
          'pos' := Pos,
          'preDiscountPrice' := PreDiscountPrice,
          'price' := Price,
          'regionId' := RegionId,
          'shippingCost' := ShippingCost,
          'shopName' := ShopName,
          'shopRating' := ShopRating,
          'inStock' := InStock
        }) ->
    #{ 'discount' => Discount,
       'name' => Name,
       'pos' => Pos,
       'preDiscountPrice' => PreDiscountPrice,
       'price' => Price,
       'regionId' => RegionId,
       'shippingCost' => ShippingCost,
       'shopName' => ShopName,
       'shopRating' => ShopRating,
       'inStock' => InStock
     }.
