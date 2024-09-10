-module(ympa_erlang_client_search_models_response).

-export([encode/1]).

-export_type([ympa_erlang_client_search_models_response/0]).

-type ympa_erlang_client_search_models_response() ::
    #{ 'models' := list(),
       'currency' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'regionId' => integer(),
       'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto()
     }.

encode(#{ 'models' := Models,
          'currency' := Currency,
          'regionId' := RegionId,
          'pager' := Pager
        }) ->
    #{ 'models' => Models,
       'currency' => Currency,
       'regionId' => RegionId,
       'pager' => Pager
     }.
