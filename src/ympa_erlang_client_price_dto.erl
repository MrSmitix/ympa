-module(ympa_erlang_client_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_dto/0]).

-type ympa_erlang_client_price_dto() ::
    #{ 'value' => integer(),
       'discountBase' => integer(),
       'currencyId' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'vat' => integer()
     }.

encode(#{ 'value' := Value,
          'discountBase' := DiscountBase,
          'currencyId' := CurrencyId,
          'vat' := Vat
        }) ->
    #{ 'value' => Value,
       'discountBase' => DiscountBase,
       'currencyId' => CurrencyId,
       'vat' => Vat
     }.
