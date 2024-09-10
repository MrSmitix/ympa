-module(ympa_erlang_client_campaign_settings_delivery_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_settings_delivery_dto/0]).

-type ympa_erlang_client_campaign_settings_delivery_dto() ::
    #{ 'schedule' => ympa_erlang_client_campaign_settings_schedule_dto:ympa_erlang_client_campaign_settings_schedule_dto()
     }.

encode(#{ 'schedule' := Schedule
        }) ->
    #{ 'schedule' => Schedule
     }.
