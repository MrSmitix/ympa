-module(ympa_erlang_client_offer_recommendation_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_recommendation_dto/0]).

-type ympa_erlang_client_offer_recommendation_dto() ::
    #{ 'offer' => ympa_erlang_client_offer_for_recommendation_dto:ympa_erlang_client_offer_for_recommendation_dto(),
       'recommendation' => ympa_erlang_client_offer_recommendation_info_dto:ympa_erlang_client_offer_recommendation_info_dto()
     }.

encode(#{ 'offer' := Offer,
          'recommendation' := Recommendation
        }) ->
    #{ 'offer' => Offer,
       'recommendation' => Recommendation
     }.
