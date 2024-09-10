-module(ympa_erlang_client_outlet_licenses_response_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_licenses_response_dto/0]).

-type ympa_erlang_client_outlet_licenses_response_dto() ::
    #{ 'licenses' := list()
     }.

encode(#{ 'licenses' := Licenses
        }) ->
    #{ 'licenses' => Licenses
     }.
