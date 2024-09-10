-module(ympa_erlang_client_update_offer_mapping_entry_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_mapping_entry_dto/0]).

-type ympa_erlang_client_update_offer_mapping_entry_dto() ::
    #{ 'mapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto(),
       'awaitingModerationMapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto(),
       'rejectedMapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto(),
       'offer' => ympa_erlang_client_update_mappings_offer_dto:ympa_erlang_client_update_mappings_offer_dto()
     }.

encode(#{ 'mapping' := Mapping,
          'awaitingModerationMapping' := AwaitingModerationMapping,
          'rejectedMapping' := RejectedMapping,
          'offer' := Offer
        }) ->
    #{ 'mapping' => Mapping,
       'awaitingModerationMapping' => AwaitingModerationMapping,
       'rejectedMapping' => RejectedMapping,
       'offer' => Offer
     }.
