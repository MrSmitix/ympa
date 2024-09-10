-module(ympa_erlang_client_update_offer_mapping_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_mapping_result_dto/0]).

-type ympa_erlang_client_update_offer_mapping_result_dto() ::
    #{ 'offerId' := binary(),
       'errors' => list(),
       'warnings' => list()
     }.

encode(#{ 'offerId' := OfferId,
          'errors' := Errors,
          'warnings' := Warnings
        }) ->
    #{ 'offerId' => OfferId,
       'errors' => Errors,
       'warnings' => Warnings
     }.
