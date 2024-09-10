-module(ympa_erlang_client_offer_mapping_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_mapping_info_dto/0]).

-type ympa_erlang_client_offer_mapping_info_dto() ::
    #{ 'mapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto(),
       'awaitingModerationMapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto(),
       'rejectedMapping' => ympa_erlang_client_offer_mapping_dto:ympa_erlang_client_offer_mapping_dto()
     }.

encode(#{ 'mapping' := Mapping,
          'awaitingModerationMapping' := AwaitingModerationMapping,
          'rejectedMapping' := RejectedMapping
        }) ->
    #{ 'mapping' => Mapping,
       'awaitingModerationMapping' => AwaitingModerationMapping,
       'rejectedMapping' => RejectedMapping
     }.
