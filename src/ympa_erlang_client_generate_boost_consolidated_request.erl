-module(ympa_erlang_client_generate_boost_consolidated_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_boost_consolidated_request/0]).

-type ympa_erlang_client_generate_boost_consolidated_request() ::
    #{ 'businessId' := integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date()
     }.

encode(#{ 'businessId' := BusinessId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo
        }) ->
    #{ 'businessId' => BusinessId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo
     }.
