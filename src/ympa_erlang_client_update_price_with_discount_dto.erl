-module(ympa_erlang_client_update_price_with_discount_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_price_with_discount_dto/0]).

-type ympa_erlang_client_update_price_with_discount_dto() ::
    #{ 'value' := integer(),
       'currencyId' := ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'discountBase' => integer()
     }.

encode(#{ 'value' := Value,
          'currencyId' := CurrencyId,
          'discountBase' := DiscountBase
        }) ->
    #{ 'value' => Value,
       'currencyId' => CurrencyId,
       'discountBase' => DiscountBase
     }.
