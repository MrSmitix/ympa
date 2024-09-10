-module(ympa_erlang_client_offer_mapping_entries_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_mapping_entries_dto/0]).

-type ympa_erlang_client_offer_mapping_entries_dto() ::
    #{ 'paging' => ympa_erlang_client_scrolling_pager_dto:ympa_erlang_client_scrolling_pager_dto(),
       'offerMappingEntries' := list()
     }.

encode(#{ 'paging' := Paging,
          'offerMappingEntries' := OfferMappingEntries
        }) ->
    #{ 'paging' => Paging,
       'offerMappingEntries' => OfferMappingEntries
     }.
