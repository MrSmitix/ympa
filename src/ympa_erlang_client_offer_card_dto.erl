-module(ympa_erlang_client_offer_card_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_card_dto/0]).

-type ympa_erlang_client_offer_card_dto() ::
    #{ 'offerId' := binary(),
       'mapping' => ympa_erlang_client_get_mapping_dto:ympa_erlang_client_get_mapping_dto(),
       'parameterValues' => list(),
       'cardStatus' => ympa_erlang_client_offer_card_status_type:ympa_erlang_client_offer_card_status_type(),
       'contentRating' => integer(),
       'recommendations' => list(),
       'errors' => list(),
       'warnings' => list()
     }.

encode(#{ 'offerId' := OfferId,
          'mapping' := Mapping,
          'parameterValues' := ParameterValues,
          'cardStatus' := CardStatus,
          'contentRating' := ContentRating,
          'recommendations' := Recommendations,
          'errors' := Errors,
          'warnings' := Warnings
        }) ->
    #{ 'offerId' => OfferId,
       'mapping' => Mapping,
       'parameterValues' => ParameterValues,
       'cardStatus' => CardStatus,
       'contentRating' => ContentRating,
       'recommendations' => Recommendations,
       'errors' => Errors,
       'warnings' => Warnings
     }.
