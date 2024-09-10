-module(ympa_erlang_client_base_campaign_offer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_base_campaign_offer_dto/0]).

-type ympa_erlang_client_base_campaign_offer_dto() ::
    #{ 'offerId' := binary(),
       'quantum' => ympa_erlang_client_quantum_dto:ympa_erlang_client_quantum_dto(),
       'available' => boolean()
     }.

encode(#{ 'offerId' := OfferId,
          'quantum' := Quantum,
          'available' := Available
        }) ->
    #{ 'offerId' => OfferId,
       'quantum' => Quantum,
       'available' => Available
     }.
