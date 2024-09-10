-module(ympa_erlang_client_base_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_base_price_dto/0]).

-type ympa_erlang_client_base_price_dto() ::
    #{ 'value' := integer(),
       'currencyId' := ympa_erlang_client_currency_type:ympa_erlang_client_currency_type()
     }.

encode(#{ 'value' := Value,
          'currencyId' := CurrencyId
        }) ->
    #{ 'value' => Value,
       'currencyId' => CurrencyId
     }.
