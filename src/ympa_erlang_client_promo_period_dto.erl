-module(ympa_erlang_client_promo_period_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_promo_period_dto/0]).

-type ympa_erlang_client_promo_period_dto() ::
    #{ 'dateTimeFrom' := ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateTimeTo' := ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'dateTimeFrom' := DateTimeFrom,
          'dateTimeTo' := DateTimeTo
        }) ->
    #{ 'dateTimeFrom' => DateTimeFrom,
       'dateTimeTo' => DateTimeTo
     }.
