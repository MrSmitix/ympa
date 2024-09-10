-module(ympa_erlang_client_suggested_offer_mapping_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_suggested_offer_mapping_dto/0]).

-type ympa_erlang_client_suggested_offer_mapping_dto() ::
    #{ 'offer' => ympa_erlang_client_suggested_offer_dto:ympa_erlang_client_suggested_offer_dto(),
       'mapping' => ympa_erlang_client_get_mapping_dto:ympa_erlang_client_get_mapping_dto()
     }.

encode(#{ 'offer' := Offer,
          'mapping' := Mapping
        }) ->
    #{ 'offer' => Offer,
       'mapping' => Mapping
     }.
