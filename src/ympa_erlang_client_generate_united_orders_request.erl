-module(ympa_erlang_client_generate_united_orders_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_united_orders_request/0]).

-type ympa_erlang_client_generate_united_orders_request() ::
    #{ 'businessId' := integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date(),
       'campaignIds' => list(),
       'promoId' => binary()
     }.

encode(#{ 'businessId' := BusinessId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'campaignIds' := CampaignIds,
          'promoId' := PromoId
        }) ->
    #{ 'businessId' => BusinessId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'campaignIds' => CampaignIds,
       'promoId' => PromoId
     }.
