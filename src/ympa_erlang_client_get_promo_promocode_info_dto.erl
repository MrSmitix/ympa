-module(ympa_erlang_client_get_promo_promocode_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_promocode_info_dto/0]).

-type ympa_erlang_client_get_promo_promocode_info_dto() ::
    #{ 'promocode' := binary(),
       'discount' := integer()
     }.

encode(#{ 'promocode' := Promocode,
          'discount' := Discount
        }) ->
    #{ 'promocode' => Promocode,
       'discount' => Discount
     }.
