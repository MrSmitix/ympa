-module(ympa_erlang_client_get_offer_mappings_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_mappings_result_dto/0]).

-type ympa_erlang_client_get_offer_mappings_result_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'offerMappings' := list()
     }.

encode(#{ 'paging' := Paging,
          'offerMappings' := OfferMappings
        }) ->
    #{ 'paging' => Paging,
       'offerMappings' => OfferMappings
     }.
