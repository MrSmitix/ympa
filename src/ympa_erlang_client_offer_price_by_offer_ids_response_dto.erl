-module(ympa_erlang_client_offer_price_by_offer_ids_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_price_by_offer_ids_response_dto/0]).

-type ympa_erlang_client_offer_price_by_offer_ids_response_dto() ::
    #{ 'offerId' => binary(),
       'price' => ympa_erlang_client_price_dto:ympa_erlang_client_price_dto(),
       'updatedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'offerId' := OfferId,
          'price' := Price,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'offerId' => OfferId,
       'price' => Price,
       'updatedAt' => UpdatedAt
     }.
