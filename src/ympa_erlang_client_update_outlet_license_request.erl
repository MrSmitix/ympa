-module(ympa_erlang_client_update_outlet_license_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_outlet_license_request/0]).

-type ympa_erlang_client_update_outlet_license_request() ::
    #{ 'licenses' := list()
     }.

encode(#{ 'licenses' := Licenses
        }) ->
    #{ 'licenses' => Licenses
     }.
