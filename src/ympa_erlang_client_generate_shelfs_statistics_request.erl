-module(ympa_erlang_client_generate_shelfs_statistics_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_shelfs_statistics_request/0]).

-type ympa_erlang_client_generate_shelfs_statistics_request() ::
    #{ 'businessId' := integer(),
       'dateFrom' := calendar:date(),
       'dateTo' := calendar:date(),
       'attributionType' := ympa_erlang_client_shelfs_statistics_attribution_type:ympa_erlang_client_shelfs_statistics_attribution_type()
     }.

encode(#{ 'businessId' := BusinessId,
          'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'attributionType' := AttributionType
        }) ->
    #{ 'businessId' => BusinessId,
       'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'attributionType' => AttributionType
     }.
