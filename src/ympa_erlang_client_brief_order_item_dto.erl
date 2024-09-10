-module(ympa_erlang_client_brief_order_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_brief_order_item_dto/0]).

-type ympa_erlang_client_brief_order_item_dto() ::
    #{ 'id' => integer(),
       'vat' => ympa_erlang_client_order_vat_type:ympa_erlang_client_order_vat_type(),
       'count' => integer(),
       'price' => integer(),
       'offerName' => binary(),
       'offerId' => binary(),
       'instances' => list()
     }.

encode(#{ 'id' := Id,
          'vat' := Vat,
          'count' := Count,
          'price' := Price,
          'offerName' := OfferName,
          'offerId' := OfferId,
          'instances' := Instances
        }) ->
    #{ 'id' => Id,
       'vat' => Vat,
       'count' => Count,
       'price' => Price,
       'offerName' => OfferName,
       'offerId' => OfferId,
       'instances' => Instances
     }.
