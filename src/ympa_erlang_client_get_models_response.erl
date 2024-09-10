-module(ympa_erlang_client_get_models_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_models_response/0]).

-type ympa_erlang_client_get_models_response() ::
    #{ 'models' := list(),
       'currency' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'regionId' => integer()
     }.

encode(#{ 'models' := Models,
          'currency' := Currency,
          'regionId' := RegionId
        }) ->
    #{ 'models' => Models,
       'currency' => Currency,
       'regionId' => RegionId
     }.
