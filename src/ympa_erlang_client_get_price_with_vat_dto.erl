-module(ympa_erlang_client_get_price_with_vat_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_price_with_vat_dto/0]).

-type ympa_erlang_client_get_price_with_vat_dto() ::
    #{ 'value' => integer(),
       'discountBase' => integer(),
       'currencyId' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'vat' => integer(),
       'updatedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'value' := Value,
          'discountBase' := DiscountBase,
          'currencyId' := CurrencyId,
          'vat' := Vat,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'value' => Value,
       'discountBase' => DiscountBase,
       'currencyId' => CurrencyId,
       'vat' => Vat,
       'updatedAt' => UpdatedAt
     }.
