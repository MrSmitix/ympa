-module(ympa_erlang_client_get_models_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_models_request/0]).

-type ympa_erlang_client_get_models_request() ::
    #{ 'models' := list()
     }.

encode(#{ 'models' := Models
        }) ->
    #{ 'models' => Models
     }.
