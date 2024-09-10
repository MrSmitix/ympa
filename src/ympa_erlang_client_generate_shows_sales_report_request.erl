-module(ympa_erlang_client_generate_shows_sales_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_shows_sales_report_request/0]).

-type ympa_erlang_client_generate_shows_sales_report_request() ::
    #{ 'businessId' => integer(),
       'campaignId' => integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date(),
       'grouping' := ympa_erlang_client_shows_sales_grouping_type:ympa_erlang_client_shows_sales_grouping_type()
     }.

encode(#{ 'businessId' := BusinessId,
          'campaignId' := CampaignId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'grouping' := Grouping
        }) ->
    #{ 'businessId' => BusinessId,
       'campaignId' => CampaignId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'grouping' => Grouping
     }.
