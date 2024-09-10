-module(ympa_erlang_client_order_item_promo_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_promo_dto/0]).

-type ympa_erlang_client_order_item_promo_dto() ::
    #{ 'type' := ympa_erlang_client_order_promo_type:ympa_erlang_client_order_promo_type(),
       'discount' => integer(),
       'subsidy' => integer(),
       'shopPromoId' => binary(),
       'marketPromoId' => binary()
     }.

encode(#{ 'type' := Type,
          'discount' := Discount,
          'subsidy' := Subsidy,
          'shopPromoId' := ShopPromoId,
          'marketPromoId' := MarketPromoId
        }) ->
    #{ 'type' => Type,
       'discount' => Discount,
       'subsidy' => Subsidy,
       'shopPromoId' => ShopPromoId,
       'marketPromoId' => MarketPromoId
     }.
