-module(ympa_erlang_client_get_promo_mechanics_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_mechanics_info_dto/0]).

-type ympa_erlang_client_get_promo_mechanics_info_dto() ::
    #{ 'type' := ympa_erlang_client_mechanics_type:ympa_erlang_client_mechanics_type(),
       'promocodeInfo' => ympa_erlang_client_get_promo_promocode_info_dto:ympa_erlang_client_get_promo_promocode_info_dto()
     }.

encode(#{ 'type' := Type,
          'promocodeInfo' := PromocodeInfo
        }) ->
    #{ 'type' => Type,
       'promocodeInfo' => PromocodeInfo
     }.
