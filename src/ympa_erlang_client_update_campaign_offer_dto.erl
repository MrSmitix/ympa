-module(ympa_erlang_client_update_campaign_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_campaign_offer_dto/0]).

-type ympa_erlang_client_update_campaign_offer_dto() ::
    #{ 'offerId' := binary(),
       'quantum' => ympa_erlang_client_quantum_dto:ympa_erlang_client_quantum_dto(),
       'available' => boolean(),
       'vat' => integer()
     }.

encode(#{ 'offerId' := OfferId,
          'quantum' := Quantum,
          'available' := Available,
          'vat' := Vat
        }) ->
    #{ 'offerId' => OfferId,
       'quantum' => Quantum,
       'available' => Available,
       'vat' => Vat
     }.
