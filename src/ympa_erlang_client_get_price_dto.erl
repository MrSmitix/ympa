-module(ympa_erlang_client_get_price_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_price_dto/0]).

-type ympa_erlang_client_get_price_dto() ::
    #{ 'value' := integer(),
       'currencyId' := ympa_erlang_client_currency_type:ympa_erlang_client_currency_type(),
       'updatedAt' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'value' := Value,
          'currencyId' := CurrencyId,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'value' => Value,
       'currencyId' => CurrencyId,
       'updatedAt' => UpdatedAt
     }.
