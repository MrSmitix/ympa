-module(ympa_erlang_client_generate_stocks_on_warehouses_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_stocks_on_warehouses_report_request/0]).

-type ympa_erlang_client_generate_stocks_on_warehouses_report_request() ::
    #{ 'campaignId' := integer(),
       'warehouseIds' => list(),
       'reportDate' => calendar:date(),
       'categoryIds' => list(),
       'hasStocks' => boolean()
     }.

encode(#{ 'campaignId' := CampaignId,
          'warehouseIds' := WarehouseIds,
          'reportDate' := ReportDate,
          'categoryIds' := CategoryIds,
          'hasStocks' := HasStocks
        }) ->
    #{ 'campaignId' => CampaignId,
       'warehouseIds' => WarehouseIds,
       'reportDate' => ReportDate,
       'categoryIds' => CategoryIds,
       'hasStocks' => HasStocks
     }.
