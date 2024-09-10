-module(ympa_erlang_client_get_campaign_settings_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_settings_response/0]).

-type ympa_erlang_client_get_campaign_settings_response() ::
    #{ 'settings' => ympa_erlang_client_campaign_settings_dto:ympa_erlang_client_campaign_settings_dto()
     }.

encode(#{ 'settings' := Settings
        }) ->
    #{ 'settings' => Settings
     }.
