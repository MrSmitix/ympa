-module(ympa_erlang_client_get_offer_cards_content_status_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_cards_content_status_request/0]).

-type ympa_erlang_client_get_offer_cards_content_status_request() ::
    #{ 'offerIds' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'cardStatuses' => ympa_erlang_client_set:ympa_erlang_client_set(),
       'categoryIds' => ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'offerIds' := OfferIds,
          'cardStatuses' := CardStatuses,
          'categoryIds' := CategoryIds
        }) ->
    #{ 'offerIds' => OfferIds,
       'cardStatuses' => CardStatuses,
       'categoryIds' => CategoryIds
     }.
