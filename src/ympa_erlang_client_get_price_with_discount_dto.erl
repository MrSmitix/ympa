-module(ympa_erlang_client_get_price_with_discount_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_price_with_discount_dto/0]).

-type ympa_erlang_client_get_price_with_discount_dto() ::
    #{ 'value' := integer(),
       'currencyId' := ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'discountBase' => integer(),
       'updatedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'value' := Value,
          'currencyId' := CurrencyId,
          'discountBase' := DiscountBase,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'value' => Value,
       'currencyId' => CurrencyId,
       'discountBase' => DiscountBase,
       'updatedAt' => UpdatedAt
     }.
