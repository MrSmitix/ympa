-module(ympa_erlang_client_generate_united_netting_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_united_netting_report_request/0]).

-type ympa_erlang_client_generate_united_netting_report_request() ::
    #{ 'businessId' := integer(),
       'dateTimeFrom' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateTimeTo' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateFrom' => calendar:date(),
       'dateTo' => calendar:date(),
       'bankOrderId' => integer(),
       'bankOrderDateTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'placementPrograms' => list(),
       'inns' => list(),
       'campaignIds' => list()
     }.

encode(#{ 'businessId' := BusinessId,
          'dateTimeFrom' := DateTimeFrom,
          'dateTimeTo' := DateTimeTo,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'bankOrderId' := BankOrderId,
          'bankOrderDateTime' := BankOrderDateTime,
          'placementPrograms' := PlacementPrograms,
          'inns' := Inns,
          'campaignIds' := CampaignIds
        }) ->
    #{ 'businessId' => BusinessId,
       'dateTimeFrom' => DateTimeFrom,
       'dateTimeTo' => DateTimeTo,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'bankOrderId' => BankOrderId,
       'bankOrderDateTime' => BankOrderDateTime,
       'placementPrograms' => PlacementPrograms,
       'inns' => Inns,
       'campaignIds' => CampaignIds
     }.
