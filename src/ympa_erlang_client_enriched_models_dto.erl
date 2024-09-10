-module(ympa_erlang_client_enriched_models_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_enriched_models_dto/0]).

-type ympa_erlang_client_enriched_models_dto() ::
    #{ 'models' := list()
     }.

encode(#{ 'models' := Models
        }) ->
    #{ 'models' => Models
     }.
