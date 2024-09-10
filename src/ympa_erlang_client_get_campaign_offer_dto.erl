-module(ympa_erlang_client_get_campaign_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_offer_dto/0]).

-type ympa_erlang_client_get_campaign_offer_dto() ::
    #{ 'offerId' := binary(),
       'quantum' => ympa_erlang_client_quantum_dto:ympa_erlang_client_quantum_dto(),
       'available' => boolean(),
       'basicPrice' => ympa_erlang_client_get_price_with_discount_dto:ympa_erlang_client_get_price_with_discount_dto(),
       'campaignPrice' => ympa_erlang_client_get_price_with_vat_dto:ympa_erlang_client_get_price_with_vat_dto(),
       'status' => ympa_erlang_client_offer_campaign_status_type:ympa_erlang_client_offer_campaign_status_type(),
       'errors' => list(),
       'warnings' => list()
     }.

encode(#{ 'offerId' := OfferId,
          'quantum' := Quantum,
          'available' := Available,
          'basicPrice' := BasicPrice,
          'campaignPrice' := CampaignPrice,
          'status' := Status,
          'errors' := Errors,
          'warnings' := Warnings
        }) ->
    #{ 'offerId' => OfferId,
       'quantum' => Quantum,
       'available' => Available,
       'basicPrice' => BasicPrice,
       'campaignPrice' => CampaignPrice,
       'status' => Status,
       'errors' => Errors,
       'warnings' => Warnings
     }.
