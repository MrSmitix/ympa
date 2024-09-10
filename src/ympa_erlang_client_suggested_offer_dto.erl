-module(ympa_erlang_client_suggested_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_suggested_offer_dto/0]).

-type ympa_erlang_client_suggested_offer_dto() ::
    #{ 'offerId' => binary(),
       'name' => binary(),
       'category' => binary(),
       'vendor' => binary(),
       'barcodes' => list(),
       'description' => binary(),
       'vendorCode' => binary(),
       'basicPrice' => ympa_erlang_client_base_price_dto:ympa_erlang_client_base_price_dto()
     }.

encode(#{ 'offerId' := OfferId,
          'name' := Name,
          'category' := Category,
          'vendor' := Vendor,
          'barcodes' := Barcodes,
          'description' := Description,
          'vendorCode' := VendorCode,
          'basicPrice' := BasicPrice
        }) ->
    #{ 'offerId' => OfferId,
       'name' => Name,
       'category' => Category,
       'vendor' => Vendor,
       'barcodes' => Barcodes,
       'description' => Description,
       'vendorCode' => VendorCode,
       'basicPrice' => BasicPrice
     }.
