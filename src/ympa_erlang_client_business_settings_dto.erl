-module(ympa_erlang_client_business_settings_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_business_settings_dto/0]).

-type ympa_erlang_client_business_settings_dto() ::
    #{ 'onlyDefaultPrice' => boolean(),
       'currency' => ympa_erlang_client_currency_type:ympa_erlang_client_currency_type()
     }.

encode(#{ 'onlyDefaultPrice' := OnlyDefaultPrice,
          'currency' := Currency
        }) ->
    #{ 'onlyDefaultPrice' => OnlyDefaultPrice,
       'currency' => Currency
     }.
