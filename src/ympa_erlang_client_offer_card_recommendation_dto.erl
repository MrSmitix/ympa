-module(ympa_erlang_client_offer_card_recommendation_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_card_recommendation_dto/0]).

-type ympa_erlang_client_offer_card_recommendation_dto() ::
    #{ 'type' := ympa_erlang_client_offer_card_recommendation_type:ympa_erlang_client_offer_card_recommendation_type(),
       'percent' => integer()
     }.

encode(#{ 'type' := Type,
          'percent' := Percent
        }) ->
    #{ 'type' => Type,
       'percent' => Percent
     }.
