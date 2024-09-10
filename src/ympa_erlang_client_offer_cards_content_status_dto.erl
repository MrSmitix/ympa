-module(ympa_erlang_client_offer_cards_content_status_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_cards_content_status_dto/0]).

-type ympa_erlang_client_offer_cards_content_status_dto() ::
    #{ 'offerCards' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'offerCards' := OfferCards,
          'paging' := Paging
        }) ->
    #{ 'offerCards' => OfferCards,
       'paging' => Paging
     }.
