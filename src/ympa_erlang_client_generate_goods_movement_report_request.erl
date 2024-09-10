-module(ympa_erlang_client_generate_goods_movement_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_goods_movement_report_request/0]).

-type ympa_erlang_client_generate_goods_movement_report_request() ::
    #{ 'campaignId' := integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date(),
       'shopSku' => binary()
     }.

encode(#{ 'campaignId' := CampaignId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'shopSku' := ShopSku
        }) ->
    #{ 'campaignId' => CampaignId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'shopSku' => ShopSku
     }.
