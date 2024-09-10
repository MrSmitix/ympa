-module(ympa_erlang_client_get_campaign_logins_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_logins_response/0]).

-type ympa_erlang_client_get_campaign_logins_response() ::
    #{ 'logins' := list()
     }.

encode(#{ 'logins' := Logins
        }) ->
    #{ 'logins' => Logins
     }.
