-module(ympa_erlang_client_regional_model_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_regional_model_info_dto/0]).

-type ympa_erlang_client_regional_model_info_dto() ::
    #{ 'currency' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'regionId' => integer()
     }.

encode(#{ 'currency' := Currency,
          'regionId' := RegionId
        }) ->
    #{ 'currency' => Currency,
       'regionId' => RegionId
     }.
