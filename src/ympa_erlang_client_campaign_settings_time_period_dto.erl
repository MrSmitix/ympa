-module(ympa_erlang_client_campaign_settings_time_period_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_settings_time_period_dto/0]).

-type ympa_erlang_client_campaign_settings_time_period_dto() ::
    #{ 'fromDate' => binary(),
       'toDate' => binary()
     }.

encode(#{ 'fromDate' := FromDate,
          'toDate' := ToDate
        }) ->
    #{ 'fromDate' => FromDate,
       'toDate' => ToDate
     }.
