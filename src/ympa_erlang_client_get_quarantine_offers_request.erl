-module(ympa_erlang_client_get_quarantine_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_quarantine_offers_request/0]).

-type ympa_erlang_client_get_quarantine_offers_request() ::
    #{ 'offerIds' => list(),
       'cardStatuses' => list(),
       'categoryIds' => list(),
       'vendorNames' => list(),
       'tags' => list()
     }.

encode(#{ 'offerIds' := OfferIds,
          'cardStatuses' := CardStatuses,
          'categoryIds' := CategoryIds,
          'vendorNames' := VendorNames,
          'tags' := Tags
        }) ->
    #{ 'offerIds' => OfferIds,
       'cardStatuses' => CardStatuses,
       'categoryIds' => CategoryIds,
       'vendorNames' => VendorNames,
       'tags' => Tags
     }.
