-module(ympa_erlang_client_order_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_dto/0]).

-type ympa_erlang_client_order_item_dto() ::
    #{ 'id' => integer(),
       'offerId' => binary(),
       'offerName' => binary(),
       'price' => integer(),
       'buyerPrice' => integer(),
       'buyerPriceBeforeDiscount' => integer(),
       'priceBeforeDiscount' => integer(),
       'count' => integer(),
       'vat' => ympa_erlang_client_order_vat_type:ympa_erlang_client_order_vat_type(),
       'shopSku' => binary(),
       'subsidy' => integer(),
       'partnerWarehouseId' => binary(),
       'promos' => list(),
       'instances' => list(),
       'details' => list(),
       'subsidies' => list(),
       'requiredInstanceTypes' => list()
     }.

encode(#{ 'id' := Id,
          'offerId' := OfferId,
          'offerName' := OfferName,
          'price' := Price,
          'buyerPrice' := BuyerPrice,
          'buyerPriceBeforeDiscount' := BuyerPriceBeforeDiscount,
          'priceBeforeDiscount' := PriceBeforeDiscount,
          'count' := Count,
          'vat' := Vat,
          'shopSku' := ShopSku,
          'subsidy' := Subsidy,
          'partnerWarehouseId' := PartnerWarehouseId,
          'promos' := Promos,
          'instances' := Instances,
          'details' := Details,
          'subsidies' := Subsidies,
          'requiredInstanceTypes' := RequiredInstanceTypes
        }) ->
    #{ 'id' => Id,
       'offerId' => OfferId,
       'offerName' => OfferName,
       'price' => Price,
       'buyerPrice' => BuyerPrice,
       'buyerPriceBeforeDiscount' => BuyerPriceBeforeDiscount,
       'priceBeforeDiscount' => PriceBeforeDiscount,
       'count' => Count,
       'vat' => Vat,
       'shopSku' => ShopSku,
       'subsidy' => Subsidy,
       'partnerWarehouseId' => PartnerWarehouseId,
       'promos' => Promos,
       'instances' => Instances,
       'details' => Details,
       'subsidies' => Subsidies,
       'requiredInstanceTypes' => RequiredInstanceTypes
     }.
