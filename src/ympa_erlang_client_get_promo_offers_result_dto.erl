-module(ympa_erlang_client_get_promo_offers_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_offers_result_dto/0]).

-type ympa_erlang_client_get_promo_offers_result_dto() ::
    #{ 'offers' := list(),
       'paging' => ympa_erlang_client_forward_scrolling_pager_dto:ympa_erlang_client_forward_scrolling_pager_dto()
     }.

encode(#{ 'offers' := Offers,
          'paging' := Paging
        }) ->
    #{ 'offers' => Offers,
       'paging' => Paging
     }.
