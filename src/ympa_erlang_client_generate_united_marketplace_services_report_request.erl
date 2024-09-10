-module(ympa_erlang_client_generate_united_marketplace_services_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_united_marketplace_services_report_request/0]).

-type ympa_erlang_client_generate_united_marketplace_services_report_request() ::
    #{ 'businessId' := integer(),
       'dateTimeFrom' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateTimeTo' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateFrom' => calendar:date(),
       'dateTo' => calendar:date(),
       'yearFrom' => integer(),
       'monthFrom' => integer(),
       'yearTo' => integer(),
       'monthTo' => integer(),
       'placementPrograms' => list(),
       'inns' => list(),
       'campaignIds' => list()
     }.

encode(#{ 'businessId' := BusinessId,
          'dateTimeFrom' := DateTimeFrom,
          'dateTimeTo' := DateTimeTo,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'yearFrom' := YearFrom,
          'monthFrom' := MonthFrom,
          'yearTo' := YearTo,
          'monthTo' := MonthTo,
          'placementPrograms' := PlacementPrograms,
          'inns' := Inns,
          'campaignIds' := CampaignIds
        }) ->
    #{ 'businessId' => BusinessId,
       'dateTimeFrom' => DateTimeFrom,
       'dateTimeTo' => DateTimeTo,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'yearFrom' => YearFrom,
       'monthFrom' => MonthFrom,
       'yearTo' => YearTo,
       'monthTo' => MonthTo,
       'placementPrograms' => PlacementPrograms,
       'inns' => Inns,
       'campaignIds' => CampaignIds
     }.
