-module(ympa_erlang_client_get_campaign_offers_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_offers_result_dto/0]).

-type ympa_erlang_client_get_campaign_offers_result_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'offers' := list()
     }.

encode(#{ 'paging' := Paging,
          'offers' := Offers
        }) ->
    #{ 'paging' => Paging,
       'offers' => Offers
     }.
