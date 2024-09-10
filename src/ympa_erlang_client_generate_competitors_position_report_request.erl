-module(ympa_erlang_client_generate_competitors_position_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_competitors_position_report_request/0]).

-type ympa_erlang_client_generate_competitors_position_report_request() ::
    #{ 'businessId' := integer(),
       'categoryId' := integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date()
     }.

encode(#{ 'businessId' := BusinessId,
          'categoryId' := CategoryId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo
        }) ->
    #{ 'businessId' => BusinessId,
       'categoryId' => CategoryId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo
     }.
