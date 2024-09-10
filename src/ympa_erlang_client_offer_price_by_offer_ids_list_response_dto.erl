-module(ympa_erlang_client_offer_price_by_offer_ids_list_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_price_by_offer_ids_list_response_dto/0]).

-type ympa_erlang_client_offer_price_by_offer_ids_list_response_dto() ::
    #{ 'offers' := list(),
       'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto()
     }.

encode(#{ 'offers' := Offers,
          'paging' := Paging
        }) ->
    #{ 'offers' => Offers,
       'paging' => Paging
     }.
