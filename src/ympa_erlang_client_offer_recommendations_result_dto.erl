-module(ympa_erlang_client_offer_recommendations_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_recommendations_result_dto/0]).

-type ympa_erlang_client_offer_recommendations_result_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'offerRecommendations' := list()
     }.

encode(#{ 'paging' := Paging,
          'offerRecommendations' := OfferRecommendations
        }) ->
    #{ 'paging' => Paging,
       'offerRecommendations' => OfferRecommendations
     }.
