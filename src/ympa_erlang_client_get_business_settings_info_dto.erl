-module(ympa_erlang_client_get_business_settings_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_business_settings_info_dto/0]).

-type ympa_erlang_client_get_business_settings_info_dto() ::
    #{ 'info' => ympa_erlang_client_business_dto:ympa_erlang_client_business_dto(),
       'settings' => ympa_erlang_client_business_settings_dto:ympa_erlang_client_business_settings_dto()
     }.

encode(#{ 'info' := Info,
          'settings' := Settings
        }) ->
    #{ 'info' => Info,
       'settings' => Settings
     }.
